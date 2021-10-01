package com.easyswitch.test.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Toast;

import com.easyswitch.test.R;
import com.easyswitch.test.WebApiManager;
import com.easyswitch.test.adapters.RepositoryAdapter;
import com.easyswitch.test.models.Item;
import com.easyswitch.test.models.Search;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.searchView)
    SearchView searchView;
    @BindView(R.id.rvRepos)
    RecyclerView rvRepos;

    RepositoryAdapter adapter;

    List<Item> reposList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loadRepos();
    }

    private void loadRepos() {

        searchView.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                WebApiManager.get(MainActivity.this).getWebApi().loadRepos(
                        newText,
                        "stars,forks",
                        "desc",
                        "30",
                        "1"
                ).enqueue(new Callback<Search>() {
                    @Override
                    public void onResponse(Call<Search> call, Response<Search> response) {
                        if (response.isSuccessful()) {
                            reposList.clear();
                            assert response.body() != null;
                            reposList.addAll(response.body().getItems());
                            adapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onFailure(Call<Search> call, Throwable t) {

                    }
                });

                adapter = new RepositoryAdapter(MainActivity.this, reposList);
                rvRepos.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                rvRepos.setAdapter(adapter);

                adapter.setOnItemClickListener(new RepositoryAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View v, int position, Item item) {
                        Intent i = new Intent(MainActivity.this, ReposDetailActivity.class);
                        i.putExtra("item", item);
                        i.putExtra("owner", item.getOwner());
                        startActivity(i);
                    }
                });

                adapter.setOnAvatarClickListener(new RepositoryAdapter.OnAvatarClickListener() {
                    @Override
                    public void onAvatarClick(View v, int position, Item item) {
                        String details = "https://github.com/" + item.getOwner().getLogin();
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(details));
                        startActivity(i);
                    }
                });
                return false;
            }
        });
    }
}
package com.easyswitch.test.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.easyswitch.test.R;
import com.easyswitch.test.WebApiManager;
import com.easyswitch.test.models.Item;
import com.easyswitch.test.models.Owner;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReposDetailActivity extends AppCompatActivity {

    @SuppressLint("SimpleDateFormat")
    private DateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    @SuppressLint("SimpleDateFormat")
    private SimpleDateFormat newFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    @BindView(R.id.ivAvatar)
    ImageView ivAvatar;
    @BindView(R.id.tvAuthor)
    TextView tvAuthor;
    @BindView(R.id.tvLanguage)
    TextView tvLanguage;
    @BindView(R.id.tvCreation)
    TextView tvCreation;
    @BindView(R.id.tvModified)
    TextView tvModified;
    @BindView(R.id.tvGoToRepos)
    TextView tvGoToRepos;
    @BindView(R.id.tvGoToDetails)
    TextView tvGoToDetails;
    @BindView(R.id.tvUser)
    TextView tvUser;

    Item item;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos_detail);
        ButterKnife.bind(this);

        item = getIntent().getParcelableExtra("item");
        Picasso.with(this).load(item.getOwner().getAvatarUrl()).into(ivAvatar);
        tvAuthor.setText("Author: " + item.getOwner().getLogin());
        tvLanguage.setText("Language: " + item.getLanguage());
        tvCreation.setText("Created date: " + getDayStringFromDate(item.getCreatedAt()));
        tvModified.setText("Updated date: " + getDayStringFromDate(item.getUpdatedAt()));
        tvGoToRepos.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvGoToDetails.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        getUser();
    }

    public void getUser() {
        WebApiManager.get(this).getWebApi().getUSer(
                item.getOwner().getLogin()
        ).enqueue(new Callback<Owner>() {
            @Override
            public void onResponse(@NonNull Call<Owner> call, @NonNull Response<Owner> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    tvUser.setText(response.body().getName());
                }
            }

            @Override
            public void onFailure(Call<Owner> call, Throwable t) {

            }
        });
    }

    private String getDayStringFromDate(String date) {
        try {
            Date d = oldFormat.parse(date);

            return newFormat.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    @OnClick(R.id.tvGoToRepos)
    public void goToRepos() {
        String repos = "https://github.com/" + item.getOwner().getLogin() + "/" + item.getName();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(repos));
        startActivity(i);
    }

    @OnClick(R.id.tvGoToDetails)
    public void goToDetails() {
        String details = "https://github.com/" + item.getOwner().getLogin();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(details));
        startActivity(i);
    }
}
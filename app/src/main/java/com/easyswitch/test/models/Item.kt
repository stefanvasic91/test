package com.easyswitch.test.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.easyswitch.test.models.License

class Item protected constructor(`in`: Parcel) : Parcelable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String?

    @SerializedName("name")
    @Expose
    var name: String?

    @SerializedName("full_name")
    @Expose
    var fullName: String?

    @SerializedName("private")
    @Expose
    var private: Boolean?

    @SerializedName("owner")
    @Expose
    var owner: Owner?

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String?

    @SerializedName("description")
    @Expose
    var description: Any? = null

    @SerializedName("fork")
    @Expose
    var fork: Boolean?

    @SerializedName("url")
    @Expose
    var url: String?

    @SerializedName("forks_url")
    @Expose
    var forksUrl: String?

    @SerializedName("keys_url")
    @Expose
    var keysUrl: String?

    @SerializedName("collaborators_url")
    @Expose
    var collaboratorsUrl: String?

    @SerializedName("teams_url")
    @Expose
    var teamsUrl: String?

    @SerializedName("hooks_url")
    @Expose
    var hooksUrl: String?

    @SerializedName("issue_events_url")
    @Expose
    var issueEventsUrl: String?

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String?

    @SerializedName("assignees_url")
    @Expose
    var assigneesUrl: String?

    @SerializedName("branches_url")
    @Expose
    var branchesUrl: String?

    @SerializedName("tags_url")
    @Expose
    var tagsUrl: String?

    @SerializedName("blobs_url")
    @Expose
    var blobsUrl: String?

    @SerializedName("git_tags_url")
    @Expose
    var gitTagsUrl: String?

    @SerializedName("git_refs_url")
    @Expose
    var gitRefsUrl: String?

    @SerializedName("trees_url")
    @Expose
    var treesUrl: String?

    @SerializedName("statuses_url")
    @Expose
    var statusesUrl: String?

    @SerializedName("languages_url")
    @Expose
    var languagesUrl: String?

    @SerializedName("stargazers_url")
    @Expose
    var stargazersUrl: String?

    @SerializedName("contributors_url")
    @Expose
    var contributorsUrl: String?

    @SerializedName("subscribers_url")
    @Expose
    var subscribersUrl: String?

    @SerializedName("subscription_url")
    @Expose
    var subscriptionUrl: String?

    @SerializedName("commits_url")
    @Expose
    var commitsUrl: String?

    @SerializedName("git_commits_url")
    @Expose
    var gitCommitsUrl: String?

    @SerializedName("comments_url")
    @Expose
    var commentsUrl: String?

    @SerializedName("issue_comment_url")
    @Expose
    var issueCommentUrl: String?

    @SerializedName("contents_url")
    @Expose
    var contentsUrl: String?

    @SerializedName("compare_url")
    @Expose
    var compareUrl: String?

    @SerializedName("merges_url")
    @Expose
    var mergesUrl: String?

    @SerializedName("archive_url")
    @Expose
    var archiveUrl: String?

    @SerializedName("downloads_url")
    @Expose
    var downloadsUrl: String?

    @SerializedName("issues_url")
    @Expose
    var issuesUrl: String?

    @SerializedName("pulls_url")
    @Expose
    var pullsUrl: String?

    @SerializedName("milestones_url")
    @Expose
    var milestonesUrl: String?

    @SerializedName("notifications_url")
    @Expose
    var notificationsUrl: String?

    @SerializedName("labels_url")
    @Expose
    var labelsUrl: String?

    @SerializedName("releases_url")
    @Expose
    var releasesUrl: String?

    @SerializedName("deployments_url")
    @Expose
    var deploymentsUrl: String?

    @SerializedName("created_at")
    @Expose
    var createdAt: String?

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String?

    @SerializedName("pushed_at")
    @Expose
    var pushedAt: String?

    @SerializedName("git_url")
    @Expose
    var gitUrl: String?

    @SerializedName("ssh_url")
    @Expose
    var sshUrl: String?

    @SerializedName("clone_url")
    @Expose
    var cloneUrl: String?

    @SerializedName("svn_url")
    @Expose
    var svnUrl: String?

    @SerializedName("homepage")
    @Expose
    var homepage: Any? = null

    @SerializedName("size")
    @Expose
    var size: Int? = null

    @SerializedName("stargazers_count")
    @Expose
    var stargazersCount: Int? = null

    @SerializedName("watchers_count")
    @Expose
    var watchersCount: Int? = null

    @SerializedName("language")
    @Expose
    var language: String?

    @SerializedName("has_issues")
    @Expose
    var hasIssues: Boolean?

    @SerializedName("has_projects")
    @Expose
    var hasProjects: Boolean?

    @SerializedName("has_downloads")
    @Expose
    var hasDownloads: Boolean?

    @SerializedName("has_wiki")
    @Expose
    var hasWiki: Boolean?

    @SerializedName("has_pages")
    @Expose
    var hasPages: Boolean?

    @SerializedName("forks_count")
    @Expose
    var forksCount: Int? = null

    @SerializedName("mirror_url")
    @Expose
    var mirrorUrl: Any? = null

    @SerializedName("archived")
    @Expose
    var archived: Boolean?

    @SerializedName("disabled")
    @Expose
    var disabled: Boolean?

    @SerializedName("open_issues_count")
    @Expose
    var openIssuesCount: Int? = null

    @SerializedName("license")
    @Expose
    var license: License? = null

    @SerializedName("allow_forking")
    @Expose
    var allowForking: Boolean?

    @SerializedName("forks")
    @Expose
    var forks: Int? = null

    @SerializedName("open_issues")
    @Expose
    var openIssues: Int? = null

    @SerializedName("watchers")
    @Expose
    var watchers: Int? = null

    @SerializedName("default_branch")
    @Expose
    var defaultBranch: String?

    @SerializedName("score")
    @Expose
    var score: Double? = null
    override fun writeToParcel(dest: Parcel, flags: Int) {
        if (id == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(id!!)
        }
        dest.writeString(nodeId)
        dest.writeString(name)
        dest.writeString(fullName)
        dest.writeByte((if (private == null) 0 else if (private!!) 1 else 2).toByte())
        dest.writeParcelable(owner, flags)
        dest.writeString(htmlUrl)
        dest.writeByte((if (fork == null) 0 else if (fork as Boolean) 1 else 2).toByte())
        dest.writeString(url)
        dest.writeString(forksUrl)
        dest.writeString(keysUrl)
        dest.writeString(collaboratorsUrl)
        dest.writeString(teamsUrl)
        dest.writeString(hooksUrl)
        dest.writeString(issueEventsUrl)
        dest.writeString(eventsUrl)
        dest.writeString(assigneesUrl)
        dest.writeString(branchesUrl)
        dest.writeString(tagsUrl)
        dest.writeString(blobsUrl)
        dest.writeString(gitTagsUrl)
        dest.writeString(gitRefsUrl)
        dest.writeString(treesUrl)
        dest.writeString(statusesUrl)
        dest.writeString(languagesUrl)
        dest.writeString(stargazersUrl)
        dest.writeString(contributorsUrl)
        dest.writeString(subscribersUrl)
        dest.writeString(subscriptionUrl)
        dest.writeString(commitsUrl)
        dest.writeString(gitCommitsUrl)
        dest.writeString(commentsUrl)
        dest.writeString(issueCommentUrl)
        dest.writeString(contentsUrl)
        dest.writeString(compareUrl)
        dest.writeString(mergesUrl)
        dest.writeString(archiveUrl)
        dest.writeString(downloadsUrl)
        dest.writeString(issuesUrl)
        dest.writeString(pullsUrl)
        dest.writeString(milestonesUrl)
        dest.writeString(notificationsUrl)
        dest.writeString(labelsUrl)
        dest.writeString(releasesUrl)
        dest.writeString(deploymentsUrl)
        dest.writeString(createdAt)
        dest.writeString(updatedAt)
        dest.writeString(pushedAt)
        dest.writeString(gitUrl)
        dest.writeString(sshUrl)
        dest.writeString(cloneUrl)
        dest.writeString(svnUrl)
        if (size == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(size!!)
        }
        if (stargazersCount == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(stargazersCount!!)
        }
        if (watchersCount == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(watchersCount!!)
        }
        dest.writeString(language)
        dest.writeByte((if (hasIssues == null) 0 else if (hasIssues as Boolean) 1 else 2).toByte())
        dest.writeByte((if (hasProjects == null) 0 else if (hasProjects as Boolean) 1 else 2).toByte())
        dest.writeByte((if (hasDownloads == null) 0 else if (hasDownloads as Boolean) 1 else 2).toByte())
        dest.writeByte((if (hasWiki == null) 0 else if (hasWiki as Boolean) 1 else 2).toByte())
        dest.writeByte((if (hasPages == null) 0 else if (hasPages as Boolean) 1 else 2).toByte())
        if (forksCount == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(forksCount!!)
        }
        dest.writeByte((if (archived == null) 0 else if (archived as Boolean) 1 else 2).toByte())
        dest.writeByte((if (disabled == null) 0 else if (disabled as Boolean) 1 else 2).toByte())
        if (openIssuesCount == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(openIssuesCount!!)
        }
        dest.writeByte((if (allowForking == null) 0 else if (allowForking as Boolean) 1 else 2).toByte())
        if (forks == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(forks!!)
        }
        if (openIssues == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(openIssues!!)
        }
        if (watchers == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(watchers!!)
        }
        dest.writeString(defaultBranch)
        if (score == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeDouble(score!!)
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Item?> = object : Parcelable.Creator<Item?> {
            override fun createFromParcel(`in`: Parcel): Item? {
                return Item(`in`)
            }

            override fun newArray(size: Int): Array<Item?> {
                return arrayOfNulls(size)
            }
        }
    }

    init {
        id = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        nodeId = `in`.readString()
        name = `in`.readString()
        fullName = `in`.readString()
        val tmp_private = `in`.readByte()
        private = if (tmp_private.toInt() == 0) null else tmp_private.toInt() == 1
        owner = `in`.readParcelable(Owner::class.java.classLoader)
        htmlUrl = `in`.readString()
        val tmpFork = `in`.readByte()
        fork = if (tmpFork.toInt() == 0) null else tmpFork.toInt() == 1
        url = `in`.readString()
        forksUrl = `in`.readString()
        keysUrl = `in`.readString()
        collaboratorsUrl = `in`.readString()
        teamsUrl = `in`.readString()
        hooksUrl = `in`.readString()
        issueEventsUrl = `in`.readString()
        eventsUrl = `in`.readString()
        assigneesUrl = `in`.readString()
        branchesUrl = `in`.readString()
        tagsUrl = `in`.readString()
        blobsUrl = `in`.readString()
        gitTagsUrl = `in`.readString()
        gitRefsUrl = `in`.readString()
        treesUrl = `in`.readString()
        statusesUrl = `in`.readString()
        languagesUrl = `in`.readString()
        stargazersUrl = `in`.readString()
        contributorsUrl = `in`.readString()
        subscribersUrl = `in`.readString()
        subscriptionUrl = `in`.readString()
        commitsUrl = `in`.readString()
        gitCommitsUrl = `in`.readString()
        commentsUrl = `in`.readString()
        issueCommentUrl = `in`.readString()
        contentsUrl = `in`.readString()
        compareUrl = `in`.readString()
        mergesUrl = `in`.readString()
        archiveUrl = `in`.readString()
        downloadsUrl = `in`.readString()
        issuesUrl = `in`.readString()
        pullsUrl = `in`.readString()
        milestonesUrl = `in`.readString()
        notificationsUrl = `in`.readString()
        labelsUrl = `in`.readString()
        releasesUrl = `in`.readString()
        deploymentsUrl = `in`.readString()
        createdAt = `in`.readString()
        updatedAt = `in`.readString()
        pushedAt = `in`.readString()
        gitUrl = `in`.readString()
        sshUrl = `in`.readString()
        cloneUrl = `in`.readString()
        svnUrl = `in`.readString()
        size = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        stargazersCount = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        watchersCount = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        language = `in`.readString()
        val tmpHasIssues = `in`.readByte()
        hasIssues = if (tmpHasIssues.toInt() == 0) null else tmpHasIssues.toInt() == 1
        val tmpHasProjects = `in`.readByte()
        hasProjects = if (tmpHasProjects.toInt() == 0) null else tmpHasProjects.toInt() == 1
        val tmpHasDownloads = `in`.readByte()
        hasDownloads = if (tmpHasDownloads.toInt() == 0) null else tmpHasDownloads.toInt() == 1
        val tmpHasWiki = `in`.readByte()
        hasWiki = if (tmpHasWiki.toInt() == 0) null else tmpHasWiki.toInt() == 1
        val tmpHasPages = `in`.readByte()
        hasPages = if (tmpHasPages.toInt() == 0) null else tmpHasPages.toInt() == 1
        forksCount = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        val tmpArchived = `in`.readByte()
        archived = if (tmpArchived.toInt() == 0) null else tmpArchived.toInt() == 1
        val tmpDisabled = `in`.readByte()
        disabled = if (tmpDisabled.toInt() == 0) null else tmpDisabled.toInt() == 1
        openIssuesCount = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        val tmpAllowForking = `in`.readByte()
        allowForking = if (tmpAllowForking.toInt() == 0) null else tmpAllowForking.toInt() == 1
        forks = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        openIssues = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        watchers = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        defaultBranch = `in`.readString()
        score = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readDouble()
        }
    }
}
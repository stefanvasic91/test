package com.easyswitch.test.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Owner protected constructor(`in`: Parcel) : Parcelable {
    @SerializedName("login")
    @Expose
    var login: String?

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String?

    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String?

    @SerializedName("gravatar_id")
    @Expose
    var gravatarId: String?

    @SerializedName("url")
    @Expose
    var url: String?

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String?

    @SerializedName("followers_url")
    @Expose
    var followersUrl: String?

    @SerializedName("following_url")
    @Expose
    var followingUrl: String?

    @SerializedName("gists_url")
    @Expose
    var gistsUrl: String?

    @SerializedName("starred_url")
    @Expose
    var starredUrl: String?

    @SerializedName("subscriptions_url")
    @Expose
    var subscriptionsUrl: String?

    @SerializedName("organizations_url")
    @Expose
    var organizationsUrl: String?

    @SerializedName("repos_url")
    @Expose
    var reposUrl: String?

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String?

    @SerializedName("received_events_url")
    @Expose
    var receivedEventsUrl: String?

    @SerializedName("type")
    @Expose
    var type: String?

    @SerializedName("site_admin")
    @Expose
    var siteAdmin: Boolean?

    @SerializedName("name")
    @Expose
    var name: String?

    @SerializedName("company")
    @Expose
    var company: Any? = null

    @SerializedName("blog")
    @Expose
    var blog: String?

    @SerializedName("location")
    @Expose
    var location: Any? = null

    @SerializedName("email")
    @Expose
    var email: Any? = null

    @SerializedName("hireable")
    @Expose
    var hireable: Any? = null

    @SerializedName("bio")
    @Expose
    var bio: Any? = null

    @SerializedName("twitter_username")
    @Expose
    var twitterUsername: Any? = null

    @SerializedName("public_repos")
    @Expose
    var publicRepos: Int? = null

    @SerializedName("public_gists")
    @Expose
    var publicGists: Int? = null

    @SerializedName("followers")
    @Expose
    var followers: Int? = null

    @SerializedName("following")
    @Expose
    var following: Int? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String?

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String?
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(login)
        if (id == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(id!!)
        }
        dest.writeString(nodeId)
        dest.writeString(avatarUrl)
        dest.writeString(gravatarId)
        dest.writeString(url)
        dest.writeString(htmlUrl)
        dest.writeString(followersUrl)
        dest.writeString(followingUrl)
        dest.writeString(gistsUrl)
        dest.writeString(starredUrl)
        dest.writeString(subscriptionsUrl)
        dest.writeString(organizationsUrl)
        dest.writeString(reposUrl)
        dest.writeString(eventsUrl)
        dest.writeString(receivedEventsUrl)
        dest.writeString(type)
        dest.writeByte((if (siteAdmin == null) 0 else if (siteAdmin as Boolean) 1 else 2).toByte())
        dest.writeString(name)
        dest.writeString(blog)
        if (publicRepos == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(publicRepos!!)
        }
        if (publicGists == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(publicGists!!)
        }
        if (followers == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(followers!!)
        }
        if (following == null) {
            dest.writeByte(0.toByte())
        } else {
            dest.writeByte(1.toByte())
            dest.writeInt(following!!)
        }
        dest.writeString(createdAt)
        dest.writeString(updatedAt)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Owner?> = object : Parcelable.Creator<Owner?> {
            override fun createFromParcel(`in`: Parcel): Owner? {
                return Owner(`in`)
            }

            override fun newArray(size: Int): Array<Owner?> {
                return arrayOfNulls(size)
            }
        }
    }

    init {
        login = `in`.readString()
        id = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        nodeId = `in`.readString()
        avatarUrl = `in`.readString()
        gravatarId = `in`.readString()
        url = `in`.readString()
        htmlUrl = `in`.readString()
        followersUrl = `in`.readString()
        followingUrl = `in`.readString()
        gistsUrl = `in`.readString()
        starredUrl = `in`.readString()
        subscriptionsUrl = `in`.readString()
        organizationsUrl = `in`.readString()
        reposUrl = `in`.readString()
        eventsUrl = `in`.readString()
        receivedEventsUrl = `in`.readString()
        type = `in`.readString()
        val tmpSiteAdmin = `in`.readByte()
        siteAdmin = if (tmpSiteAdmin.toInt() == 0) null else tmpSiteAdmin.toInt() == 1
        name = `in`.readString()
        blog = `in`.readString()
        publicRepos = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        publicGists = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        followers = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        following = if (`in`.readByte().toInt() == 0) {
            null
        } else {
            `in`.readInt()
        }
        createdAt = `in`.readString()
        updatedAt = `in`.readString()
    }
}
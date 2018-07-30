package com.starj.mqttchat.datas

import com.stfalcon.chatkit.commons.models.IUser

data class Author(
        private var id: String = "WQ6F",
        private var name: String = "JT",
        private var avatar: String = ""
) : IUser {
    override fun getId() = id

    override fun getName() = name

    override fun getAvatar() = avatar
}
package com.starj.mqttchat.ui.main

import com.starj.mqttchat.common.BaseMvpPresenter
import com.starj.mqttchat.common.BaseMvpView
import com.starj.mqttchat.datas.ChatRoom


class MainPresenter<MvpView : BaseMvpView> : BaseMvpPresenter<MvpView> {

    companion object {
        val defaultChatRooms = listOf(
                ChatRoom(name = "PacketChat"),
                ChatRoom(name = "Rocklin Stake"),
                ChatRoom(name = "SHEMS"),
                ChatRoom(name = "SacramentoERC"),
                ChatRoom(name = "Ninjas")
        )
    }

    private lateinit var view: MainMvpView

    override fun attachView(view: MvpView) {
        this.view = view as MainMvpView
    }

    override fun destroy() {}

    fun loadChatRooms(): Unit = view.onLoadChatRooms(defaultChatRooms)

}
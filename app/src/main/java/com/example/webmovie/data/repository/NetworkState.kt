package com.example.webmovie.data.repository
enum class Status {
    RUNNING,
    SUCCES,
    FAILED
}
class NetworkState (val status: Status, val msg: String) {
    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val ERROR: NetworkState
    }
}
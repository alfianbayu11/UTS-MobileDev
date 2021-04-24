package id.bayu.mainan.activity.login

import id.bayu.mainan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}
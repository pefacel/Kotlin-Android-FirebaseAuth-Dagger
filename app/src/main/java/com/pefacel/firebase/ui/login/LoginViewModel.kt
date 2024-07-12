package com.pefacel.firebase.ui.login

import androidx.lifecycle.ViewModel
import com.pefacel.firebase.data.AuthService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authService: AuthService
) : ViewModel() {

    fun loginWithEmailAndPassword(email: String, password: String) {
        var result = authService.loginWithEmailAndPassword(email, password)

    }

}
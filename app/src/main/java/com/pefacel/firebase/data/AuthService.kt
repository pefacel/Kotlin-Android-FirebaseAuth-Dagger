package com.pefacel.firebase.data

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthService @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {

    fun loginWithEmailAndPassword(email: String, password: String) {
         firebaseAuth.signInWithEmailAndPassword(email, password)
    }

}
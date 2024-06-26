package com.example.ismailozkan.selly.ui.data

import androidx.compose.ui.input.pointer.PointerEventPass

data class User(
    var userId: String = "", // Provide default values for all properties
    var userName: String = "",
    var userSurname: String = "",
    var userDescription: String = "",
    var userPhoneNumber: String = "",
    var userEmailAddress: String = "",
    var userPassword: String = "",
    var stuffList: List<String> = emptyList(),
    var soldStuffList: List<String> = emptyList(),
    var purchasedStuffList: List<String> = emptyList()
)

/*
data class User(
    var userId: String,
    var userName: String,
    var userDescription: String,
    var userPhoneNumber: String,
    var userEmailAddress: String,
    var stuffList: List<String>,
    var soldStuffList: List<String>,
    var purchasedStuffList: List<String>,
)
*/
package com.example.intercambioderegalos.Navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object LoginScreen: AppScreens("login_screen")
    object RegisterScreen: AppScreens("register_screen")
    object HomeScreen: AppScreens("home_screen")
}
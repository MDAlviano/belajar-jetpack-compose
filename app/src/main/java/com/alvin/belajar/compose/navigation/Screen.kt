package com.alvin.belajar.compose.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/?id={id}&name={name}"){
        // single argument
//        fun passId(id: Int): String {
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
        // multi arguments
//        fun passNameAndId(id: Int, name: String): String {
//            return "detail_screen/$id/$name"
//        }
        // single optional argument
//        fun passId(id: Int): String {
//            return "detail_screen/?id=$id"
//        }
        // multiple optional arguments
        fun passNameAndId(
            id: Int = 0,
            name: String = "Alviano"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}
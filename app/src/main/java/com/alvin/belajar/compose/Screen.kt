package com.alvin.belajar.compose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

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
}
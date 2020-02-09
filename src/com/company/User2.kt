package com.company

class User2 : Observer {
    override fun update(name: String) {
        println("User2  ---------------->$name")
    }
}
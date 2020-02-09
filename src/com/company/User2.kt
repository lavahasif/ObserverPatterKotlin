package com.company

class User2 : Observer {
    override fun update(name: String) {
        println("User2  ---------------->$name")
    }
    override fun toString(): String {
        return "user2"
    }

}
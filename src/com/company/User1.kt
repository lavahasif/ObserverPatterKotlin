package com.company

class User1 : Observer {
    override fun update(name: String) {

        println("user1    ---------------->$name")
    }

    override fun toString(): String {
        return "user1"
    }

}
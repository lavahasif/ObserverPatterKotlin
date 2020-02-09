package com.company

interface Subject {
    fun Subscribe(observer: Observer)
    fun unSubscribe(observer: Observer)
    fun notifyObserver()

}
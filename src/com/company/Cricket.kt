package com.company

class Cricket : Subject {

    private var observerlist: ArrayList<Observer> = arrayListOf()

    override fun Subscribe(observer: Observer) {
        observerlist.add(observer)

    }

    override fun unSubscribe(observer: Observer) {
        observerlist.remove(observer)

    }

    override fun notifyObserver() {
        observerlist.forEach(notify)
    }

    val notify = { ob: Observer ->
        ob.update("hello" + ob.toString())
    }
}
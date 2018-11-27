package cn.dhx.abstractProduct.product

import cn.dhx.abstractProduct.Car

class Hai : Car {
    override fun run() {
        println("大车开车了")
    }

    override fun stop() {
        println("大车停了")
    }

    override fun expedite() {
        println("大车加速")
    }
}
package cn.dhx.abstractProduct.product

import cn.dhx.abstractProduct.Car

class LittleCar : Car {
    override fun run() {
        println("小车开车了")
    }

    override fun stop() {
        println("小车停了")
    }

    override fun expedite() {
        println("小车加速")
    }
}
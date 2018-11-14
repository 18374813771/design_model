package cn.dhx.factoryMethod.product.impl

import cn.dhx.factoryMethod.product.Shape

class Square : Shape {
    override fun draw() {
        println("画一个正方形")
    }
}
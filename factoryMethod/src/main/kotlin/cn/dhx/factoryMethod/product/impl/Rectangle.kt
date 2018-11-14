package cn.dhx.factoryMethod.product.impl

import cn.dhx.factoryMethod.product.Shape

class Rectangle : Shape {
    override fun draw() {
        println("画一个长方形")
    }
}
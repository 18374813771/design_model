package cn.dhx.factoryMethod.product.impl

import cn.dhx.factoryMethod.product.Shape

class Circle  : Shape{
    override fun draw(){
        println("画一个圆")
    }
}
package cn.dhx.factoryMethod.factory

import cn.dhx.factoryMethod.product.Shape

interface Factory {
    fun getShape() : Shape
}
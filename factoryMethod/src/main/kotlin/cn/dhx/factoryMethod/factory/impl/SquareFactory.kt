package cn.dhx.factoryMethod.factory.impl

import cn.dhx.factoryMethod.factory.Factory
import cn.dhx.factoryMethod.product.Shape
import cn.dhx.factoryMethod.product.impl.Square

class SquareFactory : Factory {
    override fun getShape(): Shape {
        return Square()
    }
}
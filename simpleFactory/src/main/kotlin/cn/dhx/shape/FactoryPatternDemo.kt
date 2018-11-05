package cn.dhx.shape

import cn.dhx.shape.enum.ShapeType
import cn.dhx.shape.factory.ShapeFactory

class FactoryPatternDemo {


}
fun main(args : Array<String>){

    //获得圆形实例
    val circle = ShapeFactory.getShape(ShapeType.CIRCLE.toString());
    //画圆
    circle?.draw();

    val square = ShapeFactory.getShape(ShapeType.SQUARE.toString())
    square?.draw();

    val rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE.toString());
    rectangle?.draw();


}
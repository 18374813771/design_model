package cn.dhx.shape.factory

import cn.dhx.shape.Shape
import cn.dhx.shape.enum.ShapeType
import cn.dhx.shape.impl.Circle
import cn.dhx.shape.impl.Rectangle
import cn.dhx.shape.impl.Square

/**
 * 形状工厂类
 * 使用object来声明一个静态类
 * */
object ShapeFactory {
   fun getShape(shapeType : String?) : Shape?{
       if (shapeType == null){
           return null;
       }
       if (shapeType.equals(ShapeType.CIRCLE.toString())){
           return Circle();
       }else if (shapeType.equals(ShapeType.SQUARE.toString())){
           return Square();
       }else if (shapeType.equals(ShapeType.RECTANGLE.toString())){
           return Rectangle();
       }
       return null;
   }
}
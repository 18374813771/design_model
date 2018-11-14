package cn.dhx.factoryMethod

import cn.dhx.factoryMethod.factory.Factory
import cn.dhx.factoryMethod.factory.impl.CircleFactory
import cn.dhx.factoryMethod.factory.impl.RectangleFactory
import cn.dhx.factoryMethod.factory.impl.SquareFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


//open关键字使kotlin变成非final的
@SpringBootApplication
@RestController
open class FactoryMethodApplication{

    @GetMapping("/factoryMethod/demo")
    open fun demo(){
        val circle = CircleFactory();
        val rectangle = RectangleFactory();
        val square = SquareFactory();

        circle.getShape().draw()
        rectangle.getShape().draw()
        square.getShape().draw()
    }

}

fun main(args: Array<String>){
    runApplication<FactoryMethodApplication>(*args)
}


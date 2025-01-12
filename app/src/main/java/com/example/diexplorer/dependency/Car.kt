package com.example.diexplorer.dependency

class Car {
    private val engine = Engine()

    fun drive(): String {
        return engine.start() + " Carro esta andando."
    }
}

fun main() {
    val car = Car()
    println(car.drive())
}

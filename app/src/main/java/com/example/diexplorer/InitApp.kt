package com.example.diexplorer

import com.example.diexplorer.di.car.CardDI
import com.example.diexplorer.di.car.ICarDI
import com.example.diexplorer.di.engine.EngineDI
import com.example.diexplorer.di.engine.IEngineDI
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.getKoin

fun main() {
    val appModule = module {
        factory<IEngineDI> { EngineDI() }
        factory<ICarDI> {
            CardDI(
                get()
            )
        }
    }
    startKoin {
        modules(appModule)
    }


    val car: ICarDI = getKoin().get()
    println(car.drive())
}
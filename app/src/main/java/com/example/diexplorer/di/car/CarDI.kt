package com.example.diexplorer.di.car

import com.example.diexplorer.di.engine.EngineDI
import com.example.diexplorer.di.engine.IEngineDI
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.getKoin

@Module
@ComponentScan
class AppModule

@Factory
class CardDI(
    private val engine: IEngineDI
): ICarDI {
    override fun drive(): String {
        return engine.start() + " Carro esta andando. Com injeção de dependências"
    }
}

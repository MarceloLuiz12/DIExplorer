package com.example.diexplorer.di.engine

import org.koin.core.annotation.Single

@Single
class EngineDI: IEngineDI {
    override fun start() = "Motor ligado!"
}

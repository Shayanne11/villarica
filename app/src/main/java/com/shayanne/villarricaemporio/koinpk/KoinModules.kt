package com.shayanne.villarricaemporio.koinpk

import com.shayanne.villarricaemporio.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    //só instacia a classe escolhida uma vez no app inteiro
    single {  }

    //instancia a classe escolhida toda hora
    factory {  }

    //este utilizamos para a nossa viewmodel
   // viewModel {  }

}

val homeModule = module {

    viewModel { HomeViewModel() }
}
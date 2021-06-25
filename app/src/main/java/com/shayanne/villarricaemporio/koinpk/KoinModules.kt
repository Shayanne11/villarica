package com.shayanne.villarricaemporio.koinpk

import com.shayanne.core.model.RepositoryWrapper
import com.shayanne.villarricaemporio.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val homeModule = module {
    factory { RepositoryWrapper(get()) }
    viewModel { HomeViewModel(get()) }
}
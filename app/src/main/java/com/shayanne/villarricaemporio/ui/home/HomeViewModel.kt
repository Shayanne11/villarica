package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shayanne.core.model.Repository

class HomeViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    // ter dois livedatas como privado e outro publico é uma boa prática para separar bem a parte de lógica das partes de UI
    private val _viewState: MutableLiveData<Repository> = MutableLiveData() // LiveData privado para usar só nesta classe
    val viewState: LiveData< Repository> = _viewState // LiveData público que será chamado em outros locais

}
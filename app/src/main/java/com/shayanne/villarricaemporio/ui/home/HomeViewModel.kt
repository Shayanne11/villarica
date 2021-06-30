package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shayanne.core.model.Repository
import com.shayanne.core.network.EmporiumService
import com.shayanne.villarricaemporio.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeViewModel (private val emporiumService: EmporiumService, private val logger: Logger): ViewModel() {

    // TODO: Implement the ViewModel (tem 2 partes: a parte do koin e a parte do metodo loadPage (fun loadPage))

    // ter dois livedatas como privado e outro publico é uma boa prática para separar bem a parte de lógica das partes de UI
    private val _viewState: MutableLiveData<Repository> = MutableLiveData() // LiveData privado para usar só nesta classe
    //viewState ele é o observable
    val viewState: LiveData< Repository> = _viewState // LiveData público que será chamado em outros locais

    fun loadPage(pageNumber:Int){
        emporiumService.getRepos(pageNumber).enqueue(object: Callback<Repository>{
            override fun onResponse(call: Call<Repository>, response: Response<Repository>) {
                if (response.isSuccessful){
                    logger.logMessage("HomeActivity-loadMore","isSuccessful,pageNumber:$pageNumber")
                    response.body().let { _viewState.postValue() }
                }
            }

            override fun onFailure(call: Call<Repository>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }




}




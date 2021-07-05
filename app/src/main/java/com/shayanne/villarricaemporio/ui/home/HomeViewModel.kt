package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shayanne.core.model.Repository
import com.shayanne.core.model.RepositoryWrapper
import com.shayanne.core.model.ResponseViewState
import com.shayanne.core.network.EmporiumService
import com.shayanne.villarricaemporio.Logger
import com.shayanne.villarricaemporio.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeViewModel (private val emporiumService: EmporiumService /*private val logger: Logger*/): ViewModel() {

    // TODO: Implement the ViewModel (tem 2 partes: a parte do koin e a parte do metodo loadPage (fun loadPage))

    // ter dois livedatas como privado e outro publico é uma boa prática para separar bem a parte de lógica das partes de UI
    private val _viewState: MutableLiveData<ResponseViewState> = MutableLiveData() // LiveData privado para usar só nesta classe
    //viewState ele é o observable
    val viewState: LiveData< ResponseViewState> = _viewState // LiveData público que será chamado em outros locais

    fun loadPage(pageNumber:Int){
        emporiumService.getRepos(pageNumber).enqueue(object: Callback<RepositoryWrapper>{
            override fun onResponse(call: Call<RepositoryWrapper>, response: Response<RepositoryWrapper>) {
                if (response.isSuccessful){
                   // logger.logMessage("HomeActivity-loadMore","isSuccessful,pageNumber:$pageNumber")
                    response.body()?.let { _viewState.postValue(ResponseViewState.Success(it.repositories)) }
                }else{
                   // logger.logMessage("HomeActivity-loadMore","is NOT Successful -${response.code()} + ${response.errorBody()?.string()}")
                    _viewState.postValue(ResponseViewState.Error(R.string.error_unknown))
                }
            }

            override fun onFailure(call: Call<RepositoryWrapper>, t: Throwable) {
                _viewState.postValue(ResponseViewState.Error(R.string.error_network_request_failed))
            }
        })

    }




}




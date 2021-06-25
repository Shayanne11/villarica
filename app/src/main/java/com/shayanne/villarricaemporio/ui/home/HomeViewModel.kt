package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shayanne.core.model.Repository
import com.shayanne.core.model.RepositoryWrapper
import com.shayanne.core.network.EmporiumService
import retrofit2.Call





class HomeViewModel (private val emporiumService: EmporiumService/*private val backendService: BackendService*/): ViewModel() {

    // TODO: Implement the ViewModel (tem 2 partes: a parte do koin e a parte do metodo loadPage (fun loadPage))

    // ter dois livedatas como privado e outro publico é uma boa prática para separar bem a parte de lógica das partes de UI
    private val _viewState: MutableLiveData<Repository> = MutableLiveData() // LiveData privado para usar só nesta classe
    //viewState ele é o observable
    val viewState: LiveData< Repository> = _viewState // LiveData público que será chamado em outros locais

    fun loadPage(pageNumber:Int){
        emporiumService.getRepos(pageNumber).enqueue()

    }

    /* fun getRepositories() {
   val repository =  backendService.getRepositories()

    _viewState.value = repository
}*/



}

private fun <T> Call<T>.enqueue() {
    TODO("Not yet implemented")
}



//poderia ser o interface retrofit
//não tem codigo,
interface  BackendService{
   fun getRepositories():Repository

}
package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shayanne.villarricaemporio.R
import com.shayanne.villarricaemporio.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    //_binding é uma variável privada, que será usada somente neste fragment e é nula, por isso tem ?=null
    private var _binding: HomeFragmentBinding? = null


    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    //onCreateView desenha a tela?
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    //onActivityCreated para a lógica vinda da viewmodel? para que o app use depois de desenhar o app?
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
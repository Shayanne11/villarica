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
    // o _binding existe pois precisamos de um binding nulo para passar em apenas alguns metodos da lifecycle
    private var _binding: HomeFragmentBinding? = null //este é para métodos da lifecycle que deve ser nulo

    //as "!!" reforça que o binding NÃO deve ser nulo, e assim dará erro se o binding for nulo em algum momento
    private val binding get()= _binding!! // este é para métodos da lifecycle que NÁO podem ser nulo


    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    //onCreateView inicia o lifecycle e desenha a view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // infla o layout no binding
        _binding = HomeFragmentBinding.inflate(inflater,container,false)

        // aqui chamaremos o binding para associar dados `a view elements
        // binding.idDoViewElement

        //root retorna o layout
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    //onActivityCreated para a lógica vinda da viewmodel? para que o app use depois de desenhar o app?
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
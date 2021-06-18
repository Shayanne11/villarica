package com.shayanne.villarricaemporio.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.shayanne.villarricaemporio.databinding.HomeFragmentBinding
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class HomeFragment : Fragment() {


    //_binding é uma variável privada, que será usada somente neste fragment e é nula, por isso tem ?=null
    // o _binding existe pois precisamos de um binding nulo para passar em apenas alguns metodos da lifecycle
    private var _binding: HomeFragmentBinding? = null //este é para métodos da lifecycle que deve ser nulo

    //as "!!" reforça que o binding NÃO deve ser nulo, e assim dará erro se o binding for nulo em algum momento
    private val binding get()= _binding!! // este é para métodos da lifecycle que NÁO podem ser nulo


    companion object {
        fun newInstance() = HomeFragment()
    }

    //instancia a viewmodel deste fragment com injeção de dependencia com koin
    private val viewModel: HomeViewModel by inject()


    //onCreateView é um método de lifecycle do fragment e inicia o lifecycle do fragment e desenha a view
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

    // onViewCreated é um método de lifecycle do fragment e o usaremos para passar o observe do fragment para ver o LiveData
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //observer do State/Estado
        //o que ele faz?
        val viewStateObserver = Observer<HomeViewModel>{ viewState ->

            // Update de UI

        }

        //observer dos Values?
        //viewLifecycleOwner observa o ciclo de vida do fragment?
        //o que ele faz? e pq quebrou?
      // viewModel.viewState.observe(viewLifecycleOwner,viewStateObserver)
    }



    // onDestroyView é um método de lifecycle do fragment, ele destroi a view para que libere a memoria e melhore a performance
    override fun onDestroyView() {
        super.onDestroyView()
        // o binding deve ser nulo quando formos destruir a view
        _binding = null
    }

    //onActivityCreated para a lógica vinda da viewmodel? para que o app use depois de desenhar o app?, ele é um método do fragment
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
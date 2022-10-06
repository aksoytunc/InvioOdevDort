package com.tuncaksoy.invioodevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tuncaksoy.invioodevdort.databinding.FragmentHomaPageBinding

class HomaPageFragment : Fragment() {
    private lateinit var viewBinding: FragmentHomaPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentHomaPageBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.buttonGoA.setOnClickListener {
            val action = HomaPageFragmentDirections.actionHomaPageFragmentToAPageFragment2()
            Navigation.findNavController(it).navigate(action)
        }

       viewBinding.buttonGoX.setOnClickListener{
           val action = HomaPageFragmentDirections.actionHomaPageFragmentToXPageFragment()
           Navigation.findNavController(it).navigate(action)
        }
    }
}

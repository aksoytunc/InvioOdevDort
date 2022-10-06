package com.tuncaksoy.invioodevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tuncaksoy.invioodevdort.databinding.FragmentAPageBinding

class APageFragment : Fragment() {
private lateinit var viewBinding: FragmentAPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentAPageBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.buttonGoB.setOnClickListener {
            val action = APageFragmentDirections.actionAPageFragmentToBPageFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}
package com.tuncaksoy.invioodevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tuncaksoy.invioodevdort.databinding.FragmentXPageBinding
import com.tuncaksoy.invioodevdort.databinding.FragmentYPageBinding

class XPageFragment : Fragment() {
    private lateinit var viewBinding: FragmentXPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentXPageBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.buttonGoY.setOnClickListener {
            val action = XPageFragmentDirections.actionXPageFragmentToYPageFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }
}
package com.tuncaksoy.invioodevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuncaksoy.invioodevdort.databinding.FragmentYPageBinding

class YPageFragment : Fragment() {
    private lateinit var viewBinding: FragmentYPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentYPageBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}
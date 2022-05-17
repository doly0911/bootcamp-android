package com.bootcamp.userinterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class TitleFragment : Fragment() {
    lateinit var btnEmpezar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_title, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnEmpezar = view.findViewById(R.id.btnEmpezar)

        btnEmpezar.setOnClickListener {
           // Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_questionFragment)
            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_questionFragment)
        }

    }
}
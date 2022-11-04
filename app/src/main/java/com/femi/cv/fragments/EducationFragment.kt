package com.femi.cv.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.femi.cv.databinding.FragmentEducationBinding

class EducationFragment : Fragment() {
    private lateinit var binding: FragmentEducationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentEducationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val https = "https://www."
        binding.tvLASU.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}lasu.edu.ng/")))
        }

    }

    companion object {
        fun newInstance(): Fragment {
            return EducationFragment()
        }
    }
}
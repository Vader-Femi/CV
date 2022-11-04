package com.femi.cv.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.femi.cv.databinding.FragmentExperiencesBinding

class ExperiencesFragment : Fragment() {

    private lateinit var binding: FragmentExperiencesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentExperiencesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvAboutArkounting.setTextIsSelectable(true)
        binding.tvAchievements1.setTextIsSelectable(true)
        binding.tvAchievements2.setTextIsSelectable(true)
        binding.tvAchievements3.setTextIsSelectable(true)

        val https = "https://www."
        binding.tvArkounting.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}arkounting.com.ng")))
        }

        binding.tvAboutArkounting.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}arkounting.com.ng")))
        }

    }

    companion object {
        fun newInstance(): Fragment {
            return ExperiencesFragment()
        }
    }
}
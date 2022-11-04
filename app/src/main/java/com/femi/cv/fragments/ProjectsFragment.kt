package com.femi.cv.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.femi.cv.R
import com.femi.cv.databinding.FragmentProjectsBinding

class ProjectsFragment : Fragment() {
    private lateinit var binding: FragmentProjectsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProjectsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val https = "https://www."
        binding.card2FA.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}github.com/Vader-Femi/2FA")))
        }

        binding.tvAbout2FA.setTextIsSelectable(true)
        binding.tvAboutBillReminder.setTextIsSelectable(true)
        binding.tvAboutTypicode.setTextIsSelectable(true)
        binding.tvAboutNotesApp.setTextIsSelectable(true)
        binding.tvAboutGoogleMaps.setTextIsSelectable(true)

        binding.cardBillReminder.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}github.com/Vader-Femi/BillReminder")))
        }

        binding.cardTypicode.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}github.com/Vader-Femi/TypicodeApiDemo")))
        }

        binding.cardNotesApp.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}github.com/Vader-Femi/NotesApp")))
        }

        binding.cardGoogleMaps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("${https}github.com/Vader-Femi/GoogleMapsDemo")))
        }

    }

    companion object {
        fun newInstance(): Fragment {
            return ProjectsFragment()
        }
    }
}
package com.femi.cv.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.femi.cv.R
import com.femi.cv.copyToClipboard
import com.femi.cv.databinding.FragmentHomeBinding
import java.net.URI

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvAboutMe.setTextIsSelectable(true)

        val emailUri = Uri.parse("mailto:${binding.tvEmail.text}")
            .buildUpon()
            .build()
        val emailIntent = Intent(Intent.ACTION_SENDTO, emailUri)
        binding.tvEmail.setOnClickListener {
            startActivity(
                Intent.createChooser(emailIntent, "Email Me"))
        }

        binding.tvPhone.setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:${binding.tvPhone.text}")))
        }

        binding.tvLocation.setOnClickListener {
            context.copyToClipboard(getString(R.string.location),
                binding.tvLocation.text.toString(),
                getString(R.string.location_copied_to_clipboard))
        }

        val https = "https://www."
        binding.tvLinkedin.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("$https${binding.tvLinkedin.text}")))
        }
        binding.tvGithub.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("$https${binding.tvGithub.text}")))
        }

    }

    companion object {
        fun newInstance(): Fragment {
            return HomeFragment()
        }
    }
}
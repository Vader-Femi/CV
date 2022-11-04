package com.femi.cv

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.femi.cv.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabsAdapter =
            TabsAdapter(supportFragmentManager, 4, lifecycle)
        binding.viewPager2.adapter = tabsAdapter

        val myPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                binding.bottomBar.menu.getItem(position).isChecked = true
            }
        }
        binding.viewPager2.registerOnPageChangeCallback(myPageChangeCallback)

        binding.bottomBar.setOnItemSelectedListener  {
            when (it.itemId) {
                R.id.home -> {
                    binding.viewPager2.currentItem = 0
                }
                R.id.education -> {
                    binding.viewPager2.currentItem = 1
                }
                R.id.experience -> {
                    binding.viewPager2.currentItem = 2
                }
                R.id.projects -> {
                    binding.viewPager2.currentItem = 3
                }
            }
            true
        }
    }


}
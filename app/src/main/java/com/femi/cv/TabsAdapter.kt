package com.femi.cv

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.femi.cv.fragments.EducationFragment
import com.femi.cv.fragments.ExperiencesFragment
import com.femi.cv.fragments.HomeFragment
import com.femi.cv.fragments.ProjectsFragment

class TabsAdapter(
    fm: FragmentManager,
    private var mNumOfTabs: Int,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int = mNumOfTabs

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment.newInstance()
            1 -> EducationFragment.newInstance()
            2 -> ExperiencesFragment.newInstance()
            else -> ProjectsFragment.newInstance()
        }
    }
}
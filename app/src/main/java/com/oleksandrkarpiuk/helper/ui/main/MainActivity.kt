package com.oleksandrkarpiuk.helper.ui.main

import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.oleksandrkarpiuk.helper.HelperApplication
import com.oleksandrkarpiuk.helper.R
import com.oleksandrkarpiuk.helper.ui.base.activities.BaseActivity
import com.oleksandrkarpiuk.helper.ui.main.tasks.TasksFragment
import com.oleksandrkarpiuk.helper.ui.main.weather.WeatherFragment
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity:
    BaseActivity(R.layout.activity_main),
    MainContract.View,
    BottomNavigationView.OnNavigationItemSelectedListener {


    @Inject
    lateinit var presenter: MainPresenter




    override fun injectDependencies() {
        (applicationContext as HelperApplication).getAppComponent()
            .createMainComponent()
            .create(this)
            .inject(this)
    }


    override fun init() {
        loadFragment(TasksFragment())
        bottomNavigationMenu.setOnNavigationItemSelectedListener(this)
    }


    private fun loadFragment(fragment: Fragment?) : Boolean {
        return if(fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
            true
        } else { false }
    }


    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        return loadFragment(when(menuItem.itemId) {
            R.id.navigationTasks -> {
                TasksFragment()
            }

            else -> {
                WeatherFragment()
            }
        })
    }


}
package com.devkanhaiya.demotaskyaarme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)
        setTitle("")
        val homefragment = HomeFragment()
        val mediafragment = MediaFragment()
        val postfragment = PostFragment()
        val heartfragment = HeartFragment()
        val profilefragment = ProfileFragment()
        createCurrentfragment(homefragment)

        nv_bottom.setOnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.frag_home -> createCurrentfragment(homefragment)
                R.id.frag_media -> createCurrentfragment(mediafragment)
                R.id.frag_post -> createCurrentfragment(postfragment)
                R.id.frag_love -> createCurrentfragment(heartfragment)
                R.id.frag_profile -> createCurrentfragment(profilefragment)
            }
            true
        }



        camera_view.setOnClickListener {
    Toast.makeText(this,"Open Camera Function",Toast.LENGTH_SHORT).show()
        }




        search_view.setOnClickListener {
            Toast.makeText(this,"Start Search Function",Toast.LENGTH_SHORT).show()
        }

        navigation_view.setOnClickListener {
            Toast.makeText(this,"Navigation  Function Start",Toast.LENGTH_SHORT).show()

        }

    }


    private fun createCurrentfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment).commit()
        }
    }




}
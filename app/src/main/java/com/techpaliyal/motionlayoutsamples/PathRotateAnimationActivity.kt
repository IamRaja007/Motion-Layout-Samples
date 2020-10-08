package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityPathAnimationBinding
import com.techpaliyal.motionlayoutsamples.databinding.ActivityPathRotateAnimationBinding

class PathRotateAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPathRotateAnimationBinding

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, PathRotateAnimationActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPathRotateAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAnimateToEnd.setOnClickListener {
            binding.motionLayout.transitionToEnd()
        }

        binding.btnAnimateToStart.setOnClickListener {
            binding.motionLayout.transitionToStart()
        }

    }
}
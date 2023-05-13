package com.example.modul4prak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ProfileFragment : Fragment(), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnprof : Button = view.findViewById(R.id.profile)
        btnprof.setOnClickListener (this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onClick(p0: View) {
        if (p0.id==R.id.profile) {
            val ProfileFragment = ProfileFragment2()
            val fragmentManager = requireFragmentManager()
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, ProfileFragment, "ProfileFragment2")
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}
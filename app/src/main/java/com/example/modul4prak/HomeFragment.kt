package com.example.modul4prak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment(),View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnhome :Button = view.findViewById(R.id.konten)
        btnhome.setOnClickListener (this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onClick(p0: View) {
        if (p0.id==R.id.konten) {
            val HomeFragment = HomeFragment2 ()
            val fragmentManager = requireFragmentManager()
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, HomeFragment, "HomeFragment2")
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }


}
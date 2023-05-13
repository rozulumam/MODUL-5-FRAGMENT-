package com.example.modul4prak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul3.MainAdapter
import com.example.modul3.Nama


class ChatFragment : Fragment() {
    private val datalist = ArrayList <Nama> ()

    private fun setupListLayout() {
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvClubBola)
        recyclerView?.layoutManager = LinearLayoutManager(requireContext())

        val adapter = MainAdapter(getClub(), requireContext())
        recyclerView?.adapter = adapter

        recyclerView?.setHasFixedSize(true)
    }

    private fun getClub(): ArrayList<Nama> {
        val nama = resources.getStringArray(R.array.daftarNama)
        val image = resources.obtainTypedArray(R.array.daftarFoto)
        val data = ArrayList<Nama>()

        for (i in nama.indices) {
            val data1 =Nama(nama[i], image.getResourceId(i, -1))
            data.add(data1)
        }

        image.recycle()

        return data
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListLayout()
        datalist.addAll(getClub())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }
}
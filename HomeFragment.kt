package com.example.writeme.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.writeme.MainViewModel
import com.example.writeme.adapter.ContactAdapter
import com.example.writeme.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Todo code

        val contactAdapter = ContactAdapter()
        binding.contactRecycler.adapter = contactAdapter

        viewModel.contacts.observe(viewLifecycleOwner){
            contactAdapter.submitList(it)
        }


    }
}
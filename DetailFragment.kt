package com.example.writeme.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.writeme.MainViewModel
import com.example.writeme.adapter.ChatAdapter
import com.example.writeme.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Todo code

        val contactId = requireArguments().getInt("chatId")

        viewModel.loadChat(contactId)

        val chatAdapter = ChatAdapter()
        binding.detailRecyclerView.adapter = chatAdapter

        viewModel.contacts.observe(viewLifecycleOwner){list ->


            val chats = list.find { it.id == contactId }

            Log.d("id2",contactId.toString())
            if(chats != null){
                binding.detailMaterialtoolbar.setTitle(chats.name)

            }
        }
        viewModel.chatMessage.observe(viewLifecycleOwner){
        chatAdapter.submitList(it)
        }
        binding.detailSendButton.setOnClickListener{
            val newMessage = binding.detailInputLayoutText.text.toString()

            viewModel.addChat(newMessage)
            binding.detailInputLayoutText.setText("")
            }


    }
}
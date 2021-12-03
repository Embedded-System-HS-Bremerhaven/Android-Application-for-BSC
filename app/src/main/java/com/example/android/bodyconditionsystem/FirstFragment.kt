package com.example.android.bodyconditionsystem

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.bsv_1).setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java).apply {
                putExtra("Value", ""+1)
            }
            startActivity(intent)

//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        view.findViewById<TextView>(R.id.bsv_2).setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java).apply {
                putExtra("Value", ""+2)
            }
            startActivity(intent)
        }
        view.findViewById<TextView>(R.id.bsv_3).setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java).apply {
                putExtra("Value", ""+3)
            }
            startActivity(intent)
        }
        view.findViewById<TextView>(R.id.bsv_4).setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java).apply {
                putExtra("Value", ""+4)
            }
            startActivity(intent)
        }
        view.findViewById<TextView>(R.id.bsv_5).setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java).apply {
                putExtra("Value", ""+5)
            }
            startActivity(intent)
        }
    }
}
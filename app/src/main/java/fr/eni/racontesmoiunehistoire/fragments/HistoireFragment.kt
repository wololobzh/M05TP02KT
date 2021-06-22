package fr.eni.racontesmoiunehistoire.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fr.eni.racontesmoiunehistoire.R
import fr.eni.racontesmoiunehistoire.databinding.FragmentHistoireBinding
import fr.eni.racontesmoiunehistoire.fragments.HistoireFragmentArgs.fromBundle

class HistoireFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentHistoireBinding>(inflater, R.layout.fragment_histoire, container, false)

        val args = arguments?.let { HistoireFragmentArgs.fromBundle(it) }
        val histoire = args?.monHistoire

        binding.tvHistoire.text = "Il était une fois un être nommé ${histoire?.prenom} qui vivait dans un(e) ${histoire?.lieu}..."

        return binding.root
    }
}
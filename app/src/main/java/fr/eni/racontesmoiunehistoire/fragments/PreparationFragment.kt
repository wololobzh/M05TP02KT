package fr.eni.racontesmoiunehistoire.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import fr.eni.racontesmoiunehistoire.R
import fr.eni.racontesmoiunehistoire.databinding.FragmentHistoireBinding
import fr.eni.racontesmoiunehistoire.databinding.FragmentPreparationBinding
import fr.eni.racontesmoiunehistoire.model.Histoire

class PreparationFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentPreparationBinding>(inflater, R.layout.fragment_preparation, container, false)


        binding.btnValider.setOnClickListener {
            val histoire = Histoire(binding.etPrenom.text.toString(),binding.etLieu.text.toString())
            val action = PreparationFragmentDirections.actionPreparationFragmentToHistoireFragment(histoire)
            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }
}
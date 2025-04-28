package eu.ase.pdm.traseelemele.ui.detalii_traseu

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.ase.pdm.traseelemele.R

class DetaliiTraseuFragment : Fragment() {

    companion object {
        fun newInstance() = DetaliiTraseuFragment()
    }

    private val viewModel: DetaliiTraseuViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_detalii_traseu, container, false)
    }
}
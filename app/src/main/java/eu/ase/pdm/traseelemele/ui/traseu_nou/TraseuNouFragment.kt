package eu.ase.pdm.traseelemele.ui.traseu_nou

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import eu.ase.pdm.traseelemele.databinding.FragmentTraseuNouBinding

class TraseuNouFragment : Fragment() {

    private var _binding: FragmentTraseuNouBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val traseuNouViewModel =
            ViewModelProvider(this).get(TraseuNouViewModel::class.java)

        _binding = FragmentTraseuNouBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        traseuNouViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
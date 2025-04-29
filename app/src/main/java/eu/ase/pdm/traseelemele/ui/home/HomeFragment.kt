package eu.ase.pdm.traseelemele.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import eu.ase.pdm.traseelemele.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val layoutManager = LinearLayoutManager(requireContext())
        val adaptor = TraseeAdapter(mutableListOf())

        binding.rvTrasee.adapter = adaptor
        binding.rvTrasee.layoutManager = layoutManager
        //binding.rvTrasee.addItemDecoration() //directia delimitatorului e invers decat a viewul (dar avem card view si se ocupa el)


        //val textView: TextView = binding.textHome
        homeViewModel.trasee.observe(viewLifecycleOwner) {
            //textView.text = it
            //o metoda de tipul
            adaptor.initTrasee(it)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
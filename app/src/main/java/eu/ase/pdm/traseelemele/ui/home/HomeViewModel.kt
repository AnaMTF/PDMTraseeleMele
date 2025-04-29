package eu.ase.pdm.traseelemele.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import eu.ase.pdm.traseelemele.data.Traseu

class HomeViewModel : ViewModel() {

    private val _trasee = MutableLiveData<List<Traseu>>().apply(
    {
        value = listOf(
            Traseu(1, "Traseu 1", System.currentTimeMillis(), System.currentTimeMillis() + 200000),
            Traseu(
                2,
                "Traseu 2",
                System.currentTimeMillis() + 3000000,
                System.currentTimeMillis() + 500000
            ),
            Traseu(
                3,
                "Traseu 3",
                System.currentTimeMillis() - 200000,
                System.currentTimeMillis() + 700000
            )
        )
    })
    val trasee: LiveData<List<Traseu>> = _trasee
}
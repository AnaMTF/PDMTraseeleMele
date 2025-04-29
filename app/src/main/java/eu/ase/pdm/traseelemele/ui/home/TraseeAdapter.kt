package eu.ase.pdm.traseelemele.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import eu.ase.pdm.traseelemele.R
import eu.ase.pdm.traseelemele.data.Traseu
import eu.ase.pdm.traseelemele.ui.home.TraseeAdapter.VH
import java.text.SimpleDateFormat
import java.util.Locale

class TraseeAdapter(private val listaTrasee:MutableList<Traseu>) : RecyclerView.Adapter<VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        //deserializaeaza macheta si creaza un view pe care il transmite in viewholder

        val item:View = LayoutInflater.from(parent.context).inflate(R.layout.elem_traseu, parent, false) //false inseamna ca nu adauga elementul deserializat la parinte
        return VH(item)
    }

    override fun getItemCount(): Int {
        return listaTrasee.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        //se apeleaza de fiecare data cand trebuie actualizat continutul unui obiect din lista (de ex la scroll)
        val traseu = listaTrasee[position]
        holder.initControale(traseu)
    }

    fun initTrasee(trasee: List<Traseu>){
        listaTrasee.clear()
        listaTrasee.addAll(trasee)
        notifyDataSetChanged()
    }

    inner class VH(item: View) : RecyclerView.ViewHolder(item){
        val tvDenumire : TextView = item.findViewById(R.id.tv_denumire)
        val tvDataStart : TextView = item.findViewById(R.id.tv_data_start)

        fun initControale(traseu: Traseu){
            tvDenumire.text = traseu.denumire
            tvDataStart.text = SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(traseu.dataStart)
        }
    }
}
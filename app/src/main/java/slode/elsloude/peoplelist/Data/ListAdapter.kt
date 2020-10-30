package slode.elsloude.peoplelist.Data

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import slode.elsloude.peoplelist.R

class ListAdapter(var people: List<Data>, val callback: Callback) : RecyclerView.Adapter<ListAdapter.MainListHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainListHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false))

    override fun getItemCount() = people.size

    override fun onBindViewHolder(holder: MainListHolder, position: Int) {
        holder.bind(people[position])
    }

    inner class MainListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @SuppressLint("WrongViewCast")
        val name = itemView.findViewById<TextView>(R.id.textViewUserName)

        fun bind(item: Data) {
            name.text = item.name
            itemView.setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) callback.onItemClicked(people[adapterPosition])
            }
        }
    }

    interface Callback {
        fun onItemClicked(item: Data)
    }
}

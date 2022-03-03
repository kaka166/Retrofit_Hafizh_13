package com.example.xirpl5_hafizh_covif.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.xirpl5_hafizh_covif.R
import com.example.xirpl5_hafizh_covif.model.ProvinceResponse
import kotlinx.android.synthetic.main.item_province.view.*

class ProvinceAdapter(private var list: ArrayList<ProvinceResponse>):
    RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>() {
    inner class ProvinceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(province: ProvinceResponse) {
            with(itemView) {
                tvName.text = province.attributes.province
                tvPositive.text = province.attributes.positive.toString()
                tvRecover.text = province.attributes.recover.toString()
                tvDeath.text = province.attributes.death.toString()
            }
        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_province, parent, false)
            return ProvinceViewHolder(view)
        }

        override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) {
            holder.bind(list[position])
        }

        override fun getItemCount(): Int = list.size
    }

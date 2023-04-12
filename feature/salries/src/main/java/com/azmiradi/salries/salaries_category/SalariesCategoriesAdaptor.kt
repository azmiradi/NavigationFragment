package com.azmiradi.salries.salaries_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.azmiradi.salries.R
import com.azmiradi.salries.databinding.CategoryItemBinding

class SalariesCategoriesAdaptor(
     private val onCategoryClicked: (Int) -> Unit
) :
    RecyclerView.Adapter<SalariesCategoriesAdaptor.CategoryViewHolder>() {
    private val categories = Categories.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<CategoryItemBinding>(
            inflater,
            R.layout.category_item,
            parent,
            false
        )
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class CategoryViewHolder(private val binding: CategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(category: Categories) {
            binding.categoryBu.text = binding.root.context.getText(category.title)
            binding.categoryBu.setOnClickListener {
                onCategoryClicked(category.fragmentId)
            }
            binding.executePendingBindings()
        }
    }
}




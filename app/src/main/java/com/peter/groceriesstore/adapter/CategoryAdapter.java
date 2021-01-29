package com.peter.groceriesstore.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.peter.groceriesstore.R;
import com.peter.groceriesstore.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>
{
    Context context;
    List<DiscountedProducts> categoryList;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_row_items, parent, false);
        CategoryViewHolder viewHolder = new CategoryViewHolder(view);
        return viewHolder;
    }

    public List<DiscountedProducts> getCategoryList()
    {
        categoryList = new ArrayList<>();
        categoryList.add(new DiscountedProducts(1, R.drawable.ic_devices_black_24dp));
        categoryList.add(new DiscountedProducts(2, R.drawable.ic_devices_other_black_24dp));
        categoryList.add(new DiscountedProducts(3, R.drawable.ic_devices_black_24dp));
        categoryList.add(new DiscountedProducts(4, R.drawable.ic_devices_other_black_24dp));
        categoryList.add(new DiscountedProducts(5, R.drawable.ic_devices_black_24dp));
        categoryList.add(new DiscountedProducts(6, R.drawable.ic_devices_other_black_24dp));
        return categoryList;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position)
    {
        holder.categoryImage.setImageResource(categoryList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount()
    {
        return getCategoryList().size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        ImageView categoryImage;
        public CategoryViewHolder(@NonNull View itemView)
        {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.category_image);
        }
    }
}

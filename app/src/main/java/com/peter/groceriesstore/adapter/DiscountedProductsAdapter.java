package com.peter.groceriesstore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.peter.groceriesstore.MainActivity;
import com.peter.groceriesstore.R;
import com.peter.groceriesstore.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class DiscountedProductsAdapter extends RecyclerView.Adapter<DiscountedProductsAdapter.DiscountedProductsViewHolder>
{
    Context context;
    List<DiscountedProducts> discountedProductsList;

    @NonNull
    @Override
    public DiscountedProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discounted_row_items, parent, false);
        DiscountedProductsViewHolder viewHolder = new DiscountedProductsViewHolder(view);
        return viewHolder;
    }

    public List<DiscountedProducts> getDiscountedProductsList()
    {
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.strawberry));
        discountedProductsList.add(new DiscountedProducts(2,R.drawable.strawberry));
        discountedProductsList.add(new DiscountedProducts(3,R.drawable.strawberry));
        return discountedProductsList;
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductsViewHolder holder, int position)
    {
        holder.discountedImage.setImageResource(discountedProductsList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount()
    {
        return getDiscountedProductsList().size();
    }

    public static class DiscountedProductsViewHolder extends RecyclerView.ViewHolder
    {
        ImageView discountedImage;

        public DiscountedProductsViewHolder(@NonNull View itemView)
        {
            super(itemView);
            discountedImage = itemView.findViewById(R.id.diccounted_image);
        }
    }
}

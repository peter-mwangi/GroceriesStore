package com.peter.groceriesstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.peter.groceriesstore.adapter.CategoryAdapter;
import com.peter.groceriesstore.adapter.DiscountedProductsAdapter;
import com.peter.groceriesstore.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView discountedImagesRecycler, categoriesRecyclerView;
    DiscountedProductsAdapter discountedProductsAdapter;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountedImagesRecycler = findViewById(R.id.search_results_view);
        categoriesRecyclerView = findViewById(R.id.categories_recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountedImagesRecycler.setLayoutManager(linearLayoutManager);

        discountedProductsAdapter = new DiscountedProductsAdapter();
        discountedImagesRecycler.setAdapter(discountedProductsAdapter);

        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        categoryAdapter = new CategoryAdapter();
        categoriesRecyclerView.setAdapter(categoryAdapter);

    }
}

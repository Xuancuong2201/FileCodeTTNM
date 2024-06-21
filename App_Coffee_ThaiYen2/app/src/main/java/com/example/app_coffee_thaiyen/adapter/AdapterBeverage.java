package com.example.app_coffee_thaiyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.app_coffee_thaiyen.R;
import com.example.app_coffee_thaiyen.model.Beverage;

import java.util.List;

public class AdapterBeverage extends RecyclerView.Adapter<AdapterBeverage.ViewHolder> {
    List<Beverage> list;
    Context context;

    public AdapterBeverage(List<Beverage> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterBeverage.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View viewBeverage = inflater.inflate(R.layout.item_beverage, parent, false);
        ViewHolder viewHolder = new ViewHolder(viewBeverage);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBeverage.ViewHolder holder, int position) {
        Beverage beverage = list.get(position);
        Glide.with(context).load(beverage.getImage()).into(holder.Img_Name);
        holder.Tv_Name.setText(beverage.getName());
        holder.Tv_Description.setText(beverage.getDescription());
        holder.Tv_price.setText(String.valueOf(beverage.getPrice()));
        holder.Tv_Quality.setText(String.valueOf(beverage.getQuality()));
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView Img_Name;
        TextView Tv_Name, Tv_Description, Tv_price, Tv_Quality;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Img_Name = itemView.findViewById(R.id.Img_Beverage);
            Tv_Name = itemView.findViewById(R.id.Tv_Name);
            Tv_Description = itemView.findViewById(R.id.Tv_Description);
            Tv_price = itemView.findViewById(R.id.Tv_Price);
            Tv_Quality = itemView.findViewById(R.id.Tv_Quality);
        }
    }
}

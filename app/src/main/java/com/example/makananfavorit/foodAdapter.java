package com.example.makananfavorit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<food> foods;

    public foodAdapter(Context mContext, ArrayList<food> foods) {
        this.mContext = mContext;
        this.foods = foods;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View view=inflater.inflate(R.layout.list_food_item,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        food curentfood =foods.get(position);
        holder.tvname.setText(curentfood.getName());
        holder.tvprice.setText(curentfood.getPrice()+"");
        holder.ratingBar.setRating(curentfood.getRate());
        if (curentfood.isFave()) {
            holder.imageview.setImageResource(R.drawable.ic_favorite_orange_24dp);
        }else {
            holder.imageview.setImageResource(R.drawable.ic_close_black_24dp);
        }
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageview;
        TextView tvprice,tvname;
        RatingBar ratingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageView);
            tvprice =itemView.findViewById(R.id.textView2);
            tvname =itemView.findViewById(R.id.textView);
            ratingBar =itemView.findViewById(R.id.ratingbar);
        }
    }
}

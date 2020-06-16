package com.example.chelentano;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DishListAdaptor extends RecyclerView.Adapter<DishListAdaptor.ViewHolder> {

    private LayoutInflater inflater;

    private List<DishItem> pizzas;


    public DishListAdaptor(Context context, List<DishItem> pizzas) {

        this.pizzas = pizzas;

        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DishListAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_dish_block, parent, false);
        return new ViewHolder(view);}
    @Override
    public void onBindViewHolder(DishListAdaptor.ViewHolder holder, int position) {
        DishItem pizza = pizzas.get(position);

       Picasso.get().load(R.drawable.bavarskaya).fit().centerCrop().into(holder.imageView);
//        holder.imageView.setImageResource(pizza.getResImage());

        holder.nameView.setText(pizza.getFood_name());

        holder.priceView.setText(pizza.getFood_price());

        holder.weightView.setText(pizza.getWeight());
    }
    @Override
    public int getItemCount() {
        return pizzas.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, priceView, weightView;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.imageViewDish);
            nameView = (TextView) view.findViewById(R.id.dishname);
            priceView = (TextView) view.findViewById(R.id.textViewPrice);
            weightView=(TextView)view.findViewById(R.id.textViewGram);
        }
    }

}

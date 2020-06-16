package com.example.chelentano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ScrollActivity extends AppCompatActivity {

    List<DishItem> pizzas=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        setInitialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pizzaList);


        DishListAdaptor dishAdapter = new DishListAdaptor(this, pizzas);

        recyclerView.setAdapter(dishAdapter);
    }
    private void setInitialData(){

        pizzas.add(new DishItem("Берлин", "700р.","830 грамм", R.drawable.berlin));
        pizzas.add(new  DishItem("Кантри","500р.","840 грамм",R.drawable.cantry));
        pizzas.add(new  DishItem("Баварская","600р.","940 грамм",R.drawable.bavarskaya));
        pizzas.add(new  DishItem("Украинская","550р.","810 грамм",R.drawable.ukraine));
        pizzas.add(new DishItem("Спарта","500р.","860 грамм",R.drawable.sparta));
        pizzas.add(new  DishItem("Лучано","650р.","650 грамм",R.drawable.luchano));
        pizzas.add(new  DishItem("Мексиканка","600р.","860 грамм",R.drawable.mecsicanka));

    }
}

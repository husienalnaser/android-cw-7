package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemons> pokeball=new ArrayList<>();
        pokemons p1=new pokemons("bulbasaur",R.drawable.bulbasaur,49,49,318,"grass");
        pokemons p2=new pokemons("ivysaur",R.drawable.ivysaur,62,63,405,"grass");
        pokemons p3=new pokemons("pidgeot",R.drawable.pidgeot,80,75,479,"flying");
        pokemons p4=new pokemons("blastoise",R.drawable.blastoise,83,100,530,"water");
        pokemons p5=new pokemons("rattata",R.drawable.rattata,56,35,253,"normal");

        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
    }
}
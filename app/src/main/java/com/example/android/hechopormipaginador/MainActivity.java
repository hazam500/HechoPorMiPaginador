package com.example.android.hechopormipaginador;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);

        List<Personaje> listPersonaje= new ArrayList<>();

        listPersonaje.add(new Personaje("Chavo","http://438424cd093f86f0c7e0-2cd4f1b3b970cf6c05d6a60490c230b4.r88.cf2.rackcdn.com/chavo210114_g.jpg"));
        listPersonaje.add(new Personaje("Kiko","http://www.theclinic.cl/wp-content/uploads/2012/08/QUICO.jpg"));
        listPersonaje.add(new Personaje("Ron Damón", "https://dejulhiansorelyotrasvoces.files.wordpress.com/2012/10/241084dz.jpg"));
        listPersonaje.add(new Personaje("Chilindrina", "https://s-media-cache-ak0.pinimg.com/736x/63/e2/77/63e277f95310052549949a1956898ebd.jpg"));


        PersonajesAdapter personajesAdapter = new PersonajesAdapter (this,listPersonaje);
        viewPager.setAdapter(personajesAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}

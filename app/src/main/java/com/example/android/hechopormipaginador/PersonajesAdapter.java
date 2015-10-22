package com.example.android.hechopormipaginador;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by TOSHIBA on 21/10/2015.
 */
public class PersonajesAdapter extends FragmentPagerAdapter
{
    private List<Personaje> listPersonaje;

    public PersonajesAdapter(AppCompatActivity activity, List<Personaje> listPersonaje) {

        super(activity.getSupportFragmentManager());
        this.listPersonaje = listPersonaje;

    }


    @Override
    public Fragment getItem(int position) {

        PersonajeFragment personajeFragment = new PersonajeFragment();
        Bundle bundle = new Bundle();
        Personaje personaje = listPersonaje.get(position);
        bundle.putString("nombre",personaje.getNombre());
        bundle.putString("url",personaje.getUrl());
        personajeFragment.setArguments(bundle);
        return personajeFragment;
    }

    @Override
    public int getCount() {
        return listPersonaje.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return listPersonaje.get(position).getNombre() ;
    }


}

package com.example.android.hechopormipaginador;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by TOSHIBA on 22/10/2015.
 */
public class PersonajeFragment extends android.support.v4.app.Fragment {

    private ImageView personajeImagen;
    private TextView personajeNombre;

    public PersonajeFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_personaje,container,false);
        personajeImagen = (ImageView)view.findViewById(R.id.personaje_imagen);
        personajeNombre = (TextView)view.findViewById(R.id.personaje_nombre);

        String nombre = getArguments().getString("nombre");
        String url = getArguments().getString("url");

        personajeNombre.setText(nombre);
        Picasso.with(getActivity()).load(url).fit().into(personajeImagen);

        return view;

    }


}

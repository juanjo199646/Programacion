package com.i053113.programacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.i053113.programacion.Jason.JasonUser;
import com.i053113.programacion.Models.Persons;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // hacer referencia al texview o declarar variable en la raiz de main activity y es un atributo de la calse main activity

    TextView txtListUsers;
    // hacer referencia del edittex
    EditText ed_firtsname;
    EditText ed_lastname;
    // crear lista
    // crear una variable de tipo lista
    List <Persons> listpersons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // hacer referencia al texview
        // primero el nombre de la variable - la clase textview - el programador
        txtListUsers = (TextView) findViewById(R.id.tv_1);
        // hacer referencia al edittext
        ed_firtsname = (EditText) findViewById(R.id.et_firstname);
        ed_lastname = (EditText) findViewById(R.id.et_lastname);

        // retorna el valor del string
        String[] arrayUsers = JasonUser.listUsersDos();


        //para recorrer
        // primero  la lista de los datos  y despues de cada item
     /*   for(String user : arrayUsers){
            // para que lo agrge al final a usuario y las \n = hacen el salto de cada usuario
            txtListUsers.append( user + "\n\n\n");

        } */


    }



    // CREAR UN METODO PARA EL BOTON

    public void createpersons (View view){

        //crear un obgeto de la clase -> primero la clase -> dnombre de usuario -> = -> new -> nombre de la clase
        Persons user = new Persons();
        // para que se establsca en la applicasion
        user.setFirst_name(ed_firtsname.getText().toString());
        user.setLast_name(ed_lastname.getText().toString());
        // para guardar en una lista
        listpersons.add(user);


    }
    // crear uun metodo solo para listar
    public void  listUsers (View view){

        for(Persons e: listpersons){
            txtListUsers.append("nombre" + e.getFirst_name()+ "apellido" + e.getLast_name()+"\n\n\n");
        }
        //juan





    }
}
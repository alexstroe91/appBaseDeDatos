package stroesteanu.dumalex.appbasededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Nombre de la base de datos
    public static final String NOMBREBD = "bdarticulos.sdb";
    //Versión de la base de datos
    public static final int VERSION = 1;
    //Nombre de la tabla (puede haber tantas como necesitemos)
    public static final String NOMBRE_TABLA = "articulos";
    //Atributos o campos de la tabla
    public static final String REF = "ref";
    public static final String NOMBRE = "nombre";
}
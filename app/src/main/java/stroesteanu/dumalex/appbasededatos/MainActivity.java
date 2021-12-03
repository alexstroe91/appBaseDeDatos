package stroesteanu.dumalex.appbasededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crea una instancia de la clase CrearBD que crea la base de datos bdarticulos.sdb y la tabla usuarios.
        crearBD crearBD = new crearBD(this);
//Método de la clase heredada SQLiteOpenHelper para crear la base de datos y dejarla preparada para insertar filas en la tabla tabla.

        SQLiteDatabase bd = crearBD.getWritableDatabase();

//inserta 4  filas en la tabla tabla.
        //bd.execSQL("INSERT INTO articulos VALUES(1,'papel');");
        //bd.execSQL("INSERT INTO articulos VALUES(2,'lápiz');");
        //bd.execSQL("INSERT INTO articulos VALUES(3,'carpeta');");
        //bd.execSQL("INSERT INTO articulos VALUES(4,'bolígrafo');");
        //bd.close();


    }
}
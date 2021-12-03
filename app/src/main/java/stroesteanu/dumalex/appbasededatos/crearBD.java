package stroesteanu.dumalex.appbasededatos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class crearBD extends SQLiteOpenHelper {

    public crearBD (Context context) {
        super(context, NOMBREBD, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //cualquiera de las dos sentencias siguientes son válidas para crear la tabla
        //tablaprueba.

        db.execSQL("create table " + NOMBRE_TABLA + "(" + REF + " integer primary key autoincrement not null, " + NOMBRE + "text);");

        //db.execSQL("create table if not exists articulos (ref integer primary key autoincrement not null, nombre text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

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

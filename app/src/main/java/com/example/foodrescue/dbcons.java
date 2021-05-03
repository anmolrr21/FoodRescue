package com.example.foodrescue;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbcons extends SQLiteOpenHelper {
    public dbcons(@Nullable Context context) {
        super(context, constants.DB_NAME,null,constants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(constants.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists TABLE_NAME" );
        onCreate(db);

    }
    public long insertInfo(String idd, String title, String description, String date, String image,String pick, String quantity, String location){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(constants.C_TITLE,title);
        contentValues.put(constants.C_DESC,title);
        contentValues.put(constants.C_IMAGE,title);
        contentValues.put(constants.C_ID,title);
        contentValues.put(constants.C_LOCATION,title);
        contentValues.put(constants.C_PICK,title);
        contentValues.put(constants.C_QUANTITY,title);
        contentValues.put(constants.C_DATE,title);
        long id = db.insert(constants.TABLE_NAME, null, contentValues);
        db.close();
        return id;
    }
}

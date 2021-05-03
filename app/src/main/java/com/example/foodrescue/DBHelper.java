package com.example.foodrescue;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static android.os.Build.ID;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Login.db";
    public DBHelper(@Nullable Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table users(FirstName TEXT,LastName TEXT,Password TEXT,Email TEXT,Phone TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop Table if exists users");
    }
    public  Boolean insertdata(String fname, String email, String phone, String address, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("Full name", fname);
        contentValues.put("Email", email);
        contentValues.put("Phone", phone);
        contentValues.put("address", address);
        contentValues.put("Password", password);
        long result = db.insert("users", null, contentValues);
        if(result==-1) return false;
        else
            return true;


    }
    public Boolean checkusername(String FirstName) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from users where FirstName = ?", new String[]{FirstName});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String FirstName, String Password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from users where FirstName = ? and Password = ?", new String[] {FirstName,Password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}



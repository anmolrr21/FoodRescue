package com.example.foodrescue;

public class constants {
    public static final String DB_NAME="ITEMS_DB";
    public static final int DB_VERSION=1;
    public static final String TABLE_NAME="ITEMS_TABLE";
    public static final String C_ID="ID";
    public static final String C_TITLE="TITLE";
    public static final String C_DESC="DESCRIPTION";
    public static final String C_DATE="DATE";
    public static final String C_IMAGE="IMAGE";
    public static final String C_PICK="PICKUP";
    public static final String C_QUANTITY="QUANTITY";
    public static final String C_LOCATION="LOCATION";
    public static final String CREATE_TABLE="CREATE TABLE" + TABLE_NAME + " ("
            + C_ID + "INTEGER PRIMARY KEY AUTOINCREAMENT ,"
            + C_TITLE + "TEXT,"
            +C_DESC + "TEXT,"
            +C_DATE + "INT,"
            +C_IMAGE+ "TEXT,"
            + C_PICK+ "TEXT,"
            +C_QUANTITY+ "TEXT,"
            +C_LOCATION+ "TEXT,"
            + ");";
}

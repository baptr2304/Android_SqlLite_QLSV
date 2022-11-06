package com.example.sqllite_qlsv.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
            super(context, "QLSinhVien.sqllite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlSVCreate = "CREATE TABLE IF NOT EXISTS " +
                "SinhVien(MaSV INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "HoTen VARCHAR(200), "+
                "GioiTinh INTEGER, " +
                "DienThoai VARCHAR(13), " +
                "Email VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String sqlInsert1 = "INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Truong Bao Phuc','0','0396220266','@gmail.com')" ;
        String sqlInsert2 = "INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Truong Bao Phuc','1','0396220266','@gmail.com')" ;
        sqLiteDatabase.execSQL(sqlInsert1);
        sqLiteDatabase.execSQL(sqlInsert2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

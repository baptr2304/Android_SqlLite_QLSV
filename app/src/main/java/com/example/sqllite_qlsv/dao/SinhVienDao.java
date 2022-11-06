package com.example.sqllite_qlsv.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sqllite_qlsv.database.DbHelper;
import com.example.sqllite_qlsv.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDao {
    private DbHelper csdl;
    public SinhVienDao(Context context){
        DbHelper csdl = new DbHelper(context);
    }
    // lay tat ca sv

    public List<SinhVien> TatCaSinhVien(){
        String sql = "SELECT * FROM SinhVien";
        List<SinhVien> sinhVienList = new ArrayList<SinhVien>();
        SQLiteDatabase database = csdl.getReadableDatabase();
        Cursor cursor = database.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int masv = cursor.getInt(0);
            String hoten = cursor.getString(1);
            int gioitinh = cursor.getInt(2);
            String dienthoai = cursor.getString(3);
            String email = cursor.getString(4);
            SinhVien sv = new SinhVien(masv,hoten,gioitinh,dienthoai,email);
            sinhVienList.add(sv);
            cursor.moveToNext();
        }
        return sinhVienList;
    }
    // lay 1 sv

    // them

    // cap nhat

    // xoa
}

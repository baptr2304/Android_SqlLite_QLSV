package com.example.sqllite_qlsv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.sqllite_qlsv.adapter.SinhVienAdapter;
import com.example.sqllite_qlsv.dao.SinhVienDao;
import com.example.sqllite_qlsv.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien;
    private List<SinhVien> sinhVienList;
    private SinhVienAdapter adapter;
    private SinhVienDao svDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSinhVien = (ListView) findViewById(R.id.lv_sinhvien);
        //co du lieu
        sinhVienList = new ArrayList<SinhVien>();
//        svDAO = new SinhVienDao(MainActivity.this);
//        sinhVienList = svDAO.TatCaSinhVien();

        SinhVien sv1 = new SinhVien(1,"Truong Bao Phuc",0,"0396220266","@gmail.com");
        sinhVienList.add(sv1);
        SinhVien sv2 = new SinhVien(2,"Truong Bao Phuc",1,"0396220266","@gmail.com");
        sinhVienList.add(sv2);
        SinhVien sv3 = new SinhVien(3,"Truong Bao Phuc",0,"0396220266","@gmail.com");
        sinhVienList.add(sv3);

        adapter = new SinhVienAdapter(getApplicationContext(),sinhVienList);
        lvSinhVien.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_them){
            Intent  intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_thoat){
            finish();
        }
        return true;
    }
}
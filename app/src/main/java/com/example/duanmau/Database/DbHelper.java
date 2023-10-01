package com.example.duanmau.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context,"QuanLySP",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qlSanPham = "CREATE TABLE SAN_PHAM(masp INTEGER PRIMARY KEY,tensp TEXT, giasp TEXT,soluong INTEGER ,imagesp TEXT)";
        db.execSQL(qlSanPham);

        String dSanPham = "INSERT INTO SAN_PHAM VALUES ('1','Giay Nam','300','30',''),('2','Dep','80','50',''),('3','Dep','80','50','')";
        db.execSQL(dSanPham);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion != newVersion){
            db.execSQL("DROP TABLE IF EXISTS SAN_PHAM");
            onCreate(db);
        }
    }
}

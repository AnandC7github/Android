package com.example.mvc_dbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private  static final String DATABASE_NAME = "DMS";

    public CDB(Context context){

        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL("create table TbDept(dno integer primary key autoincrement, dname text, dloc text)");
    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL("DROP TABLE IF EXISTS TbDept");
        onCreate(db);
    }

    public void addDept(CDept d){ //it was passed as 2 arguments before but now we created an object CDept d to pass the arguments

        try{

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("dname",d.dname);  //Change #2
            cv.put("dloc",d.dloc);     // Change #3
            db.insert("TbDept",null,cv);
            db.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public String[] getOneDepartment(int dno){

        String a[] = new String[2];
        try{
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("TbDept",new String[]{"dno","dname","dloc"}, "dno" + "=?", new String[] { String.valueOf(dno)},null,null,null,null);
            if(cursor != null && cursor.getCount() != 0) {
                cursor.moveToFirst();
                a[0] = cursor.getString(1);
                a[1] = cursor.getString(2);
            }
            else {
                a[0] = "";
                a[1] = "";
            }
        } catch (Exception e){
            System.out.println(e);
            Log.d("SELECT:",e.toString());
        }
        return a;
    }

    public int deleteDept(int dno){

        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("TbDept","dno = ?", new String[] {String.valueOf(dno)});
    }

    public void update(int dno, String dn, String dl){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("dname",dn);
        values.put("dloc",dl);
        db.update("TbDept",values,"dno = ?",new String[] {String.valueOf(dno)});
        db.close();
    }
    public List<CDept> getAllValues(){
        List<CDept> recList = new ArrayList<CDept>();
        //Select all query
        String selectQuery = "select * from TbDept";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        //looping throungh all rows and adding to the list
        if(cursor.moveToFirst()){
            do{
                CDept rec = new CDept();
                rec.id = Integer.parseInt(cursor.getString(0));
                rec.dname = cursor.getString(1);
                rec.dloc = cursor.getString(2);
                recList.add(rec);

            }while(cursor.moveToNext());
        }
        return recList;
    }
}

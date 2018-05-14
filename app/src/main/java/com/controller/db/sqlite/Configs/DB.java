package com.controller.db.sqlite.Configs;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.controller.db.sqlite.Objcts.Transaction;

public class DB {

    private SQLiteDatabase db;

    public DB(Context context){
        DBCore dbCore = new DBCore(context);
        db = dbCore.getWritableDatabase();
    }

    public void  Inserir(Transaction transaction){
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", transaction.getValue());
        contentValues.put("description", transaction.getDescription());
        contentValues.put("date", transaction.getDate());
        contentValues.put("type", transaction.getTransactionType().toString());
        db.insert("tb_transaction",null,contentValues);
    }

}

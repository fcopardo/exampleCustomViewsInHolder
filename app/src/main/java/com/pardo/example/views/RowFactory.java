package com.pardo.example.views;

import android.content.Context;
import android.util.Log;

/**
 * Created by fco on 29-03-17.
 */

public class RowFactory {

    public static AbstractRowElement getRow(Context context, String name){
        switch (name){
            case "Section 1": return new FullRowElement(context);
            case "Section 2": return new TextRowElement(context);
            case "Section 3": return new ImageRowElement(context);
            default:
                Log.e("inflate", name);
                return new FullRowElement(context);
        }
    }
}

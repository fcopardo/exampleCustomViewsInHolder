package com.pardo.example.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.pardo.example.models.SingleItemModel;

/**
 * Created by fco on 29-03-17.
 */

public abstract class AbstractRowElement extends CardView{

    protected int layout = 0;
    protected SingleItemModel singleItemModel;

    public AbstractRowElement(Context context) {
        super(context);
        inflateBaseLayout();
    }

    public AbstractRowElement(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateBaseLayout();
    }

    public AbstractRowElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateBaseLayout();
    }

    protected void inflateBaseLayout() {
        this.setContainer();
        if(this.layout != 0) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(layout, this, true);
            this.inflateComponents();
        }
    }

    protected abstract void setContainer();
    protected abstract void inflateComponents();

    public void setItem(SingleItemModel itemModel){
        this.singleItemModel = itemModel;
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), singleItemModel.getName()+"\n"+singleItemModel.getDescription(), Toast.LENGTH_SHORT).show();
            }
        });
        setData(singleItemModel);
    }
    public abstract void setData(SingleItemModel itemModel);

}

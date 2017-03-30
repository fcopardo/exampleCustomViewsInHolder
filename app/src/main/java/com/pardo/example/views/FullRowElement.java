package com.pardo.example.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.pardo.example.R;
import com.pardo.example.models.SingleItemModel;

/**
 * Created by fco on 29-03-17.
 */

public class FullRowElement extends AbstractRowElement{

    protected TextView tvTitle;
    protected ImageView itemImage;

    public FullRowElement(Context context) {
        super(context);
    }

    public FullRowElement(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullRowElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void setContainer() {
        layout = R.layout.list_single_card;
    }

    @Override
    protected void inflateComponents() {
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        itemImage = (ImageView) findViewById(R.id.itemImage);
    }

    @Override
    public void setData(SingleItemModel itemModel) {
        tvTitle.setText(itemModel.getName());
    }
}

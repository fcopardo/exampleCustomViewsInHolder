package com.pardo.example.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pardo.example.R;
import com.pardo.example.models.SingleItemModel;

/**
 * Created by fco on 29-03-17.
 */

public class TextRowElement extends AbstractRowElement{

    protected TextView tvTitle;

    public TextRowElement(Context context) {
        super(context);
    }

    public TextRowElement(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextRowElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void setContainer() {
        layout = R.layout.list_text_card;
    }

    @Override
    protected void inflateComponents() {
        tvTitle = (TextView) findViewById(R.id.tvTitle);
    }

    @Override
    public void setData(SingleItemModel itemModel) {
        tvTitle.setText(itemModel.getName());
    }
}

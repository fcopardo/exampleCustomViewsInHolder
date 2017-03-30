package com.pardo.example.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.pardo.example.R;
import com.pardo.example.models.SingleItemModel;

/**
 * Created by fco on 29-03-17.
 */

public class ImageRowElement extends AbstractRowElement{

    protected ImageView itemImage;

    public ImageRowElement(Context context) {
        super(context);
    }

    public ImageRowElement(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageRowElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void setContainer() {
        layout = R.layout.list_image_card;
    }

    @Override
    protected void inflateComponents() {
        itemImage = (ImageView) findViewById(R.id.itemImage);
    }

    @Override
    public void setData(SingleItemModel itemModel) {

    }
}

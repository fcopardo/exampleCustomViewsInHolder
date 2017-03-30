package com.pardo.example.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pardo.example.models.SingleItemModel;
import com.pardo.example.views.AbstractRowElement;
import com.pardo.example.views.RowFactory;

import java.util.ArrayList;

/**
 * This adapter uses a custom view factory instead of multiple viewholders.
 */
public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context context;
    private String section;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList, String sectionName) {
        this.itemsList = itemsList;
        this.context = context;
        this.section = sectionName;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SingleItemRowHolder(RowFactory.getRow(context, section));
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {
        holder.setData(itemsList.get(i));
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected AbstractRowElement rowElement;

        public SingleItemRowHolder(AbstractRowElement view) {
            super(view);
            this.rowElement = view;
        }

        public void setData(SingleItemModel singleItemModel){
            rowElement.setItem(singleItemModel);
        }

    }



}
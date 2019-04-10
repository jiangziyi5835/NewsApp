package com.example.newsapp.Adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.newsapp.R;
import com.example.newsapp.model.News;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {


    private ArrayList<News> listnews = new ArrayList<>();
    private LayoutInflater inflater;

    public NewsAdapter(ArrayList<News> listnews, Context context) {
        this.listnews = listnews;
        this.inflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return listnews.size();
    }

    @Override
    public Object getItem(int position) {
        return listnews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_news, parent, false);
            holder.content = convertView.findViewById(R.id.tv_content);
            holder.date = convertView.findViewById(R.id.tv_date);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.content.setText(listnews.get(0).getList().get(position).getLives().get(0).getContent());

        return convertView;
    }

    class ViewHolder {
        TextView content, date;

    }
}

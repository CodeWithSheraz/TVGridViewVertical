package com.example.tvgridview;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    int[] images;
    String[] name;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(int[] images, String[] name, Context context) {
        this.images = images;
        this.name = name;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.grid_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.imageView.setAdjustViewBounds(true);


        holder.textView.setText(name[position]);
        holder.textView.setTextColor(Color.WHITE);

        holder.textView.setFocusable(true);
        holder.textView.setFocusableInTouchMode(true);

    }


    @Override
    public int getItemCount() {
        return images.length;
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);
        this.imageView = (ImageView) itemView.findViewById(R.id.myImageId);
        this.textView = (TextView) itemView.findViewById(R.id.myTitleId);
    }


}


//public class CustomAdapter extends BaseAdapter {
//    int[] images;
//    String[] name;
//    Context context;
//    LayoutInflater inflater;
//
//    public CustomAdapter(int[] images, String[] name, Context context) {
//        this.images = images;
//        this.name = name;
//        this.context = context;
//        inflater = LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return images.length;
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        view = inflater.inflate(R.layout.grid_view, null);
//        ImageView icon = view.findViewById(R.id.myImageId);
//        TextView title = view.findViewById(R.id.myTitleId);
//
//        icon.setImageResource(images[i]);
//        title.setText(name[i]);
//
//        return view;
//    }
//}

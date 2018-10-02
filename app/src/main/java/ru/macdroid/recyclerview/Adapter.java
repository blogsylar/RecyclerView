package ru.macdroid.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder>{

    ArrayList<Model> arrayList;
    LayoutInflater layoutInflater;
    Model model;

    public Adapter(Context context, ArrayList<Model> arrayList) {
        this.arrayList = arrayList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Viewholder viewholder, int position) {
        model = arrayList.get(position);

        viewholder.one.setText(model.getOne());
        viewholder.two.setText(model.getTwo());

        viewholder.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Click on: " + viewholder.one.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

        TextView one, two;
        LinearLayout root;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            one = itemView.findViewById(R.id.one);
            two = itemView.findViewById(R.id.two);
            root = itemView.findViewById(R.id.root);
        }
    }
}

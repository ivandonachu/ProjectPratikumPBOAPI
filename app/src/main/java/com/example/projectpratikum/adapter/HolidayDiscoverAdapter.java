package com.example.projectpratikum.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectpratikum.R;
import com.example.projectpratikum.model.holiday.HolidaysDiscoveryResultItem;

import java.util.ArrayList;

public class HolidayDiscoverAdapter extends RecyclerView.Adapter<HolidayDiscoverAdapter.ViewHolder> {


    private ArrayList<HolidaysDiscoveryResultItem> holidaysDiscoveryItems = new ArrayList<>();
    private Context context;

    public HolidayDiscoverAdapter(Context context){
        this.context = context;
    }

    public void setData(ArrayList<HolidaysDiscoveryResultItem> items){
        holidaysDiscoveryItems.clear();
        holidaysDiscoveryItems.addAll(items);
        notifyDataSetChanged();


    }


    @NonNull
    @Override
    public HolidayDiscoverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayDiscoverAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(holidaysDiscoveryItems.get(position).getName());
        holder.tvDate.setText(holidaysDiscoveryItems.get(position).getDate());
        holder.tvStart.setText(holidaysDiscoveryItems.get(position).getStart());
        holder.tvEnd.setText(holidaysDiscoveryItems.get(position).getEnd());
        holder.tvType.setText(holidaysDiscoveryItems.get(position).getType());
        holder.tvCountry.setText(holidaysDiscoveryItems.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return holidaysDiscoveryItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvDate,tvStart,tvEnd,tvType,tvCountry;
        CardView cvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            tvName = itemView.findViewById(R.id.itemlist_tv_namahari);
            tvDate = itemView.findViewById(R.id.itemlist_tv_date);
            tvStart = itemView.findViewById(R.id.itemlist_tv_start);
            tvEnd = itemView.findViewById(R.id.itemlist_tv_end);
            tvType = itemView.findViewById(R.id.itemlist_tv_type);
            tvCountry = itemView.findViewById(R.id.itemlist_tv_negara);

        }
    }
}

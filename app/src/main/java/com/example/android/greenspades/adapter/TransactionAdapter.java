package com.example.android.greenspades.adapter;

/**
 * Created by archi on 21-11-2017.
 */
import android.app.Dialog;
import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import com.example.android.greenspades.R;
import com.example.android.greenspades.model.Transaction;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    private List<Transaction> transactions;
    private Context context;

    public static class TransactionViewHolder extends RecyclerView.ViewHolder {
        TextView amount;
        TextView name;
        TextView number;
        TextView date;


        public TransactionViewHolder(View v) {
            super(v);
            amount = (TextView) v.findViewById(R.id.amount);
            name = (TextView) v.findViewById(R.id.name);
            number = (TextView) v.findViewById(R.id.mobile_number);
            date = (TextView) v.findViewById(R.id.date);
        }
    }

    public TransactionAdapter(List<Transaction> transactions, Context context) {
        this.transactions = transactions;
        this.context = context;
    }

    @Override
    public TransactionAdapter.TransactionViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
        return new TransactionViewHolder(view);
    }


    @Override
    public void onBindViewHolder(TransactionViewHolder holder, final int position) {
        holder.amount.setText(transactions.get(position).getAmountPaid().toString());
        holder.name.setText(transactions.get(position).getCustomer().getName());
        holder.number.setText(transactions.get(position).getCustomer().getMobileNumber());
        holder.date.setText(transactions.get(position).getDateTransaction());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialogue);
                Button cancel=(Button)dialog.findViewById(R.id.cancel);
                Button ok=(Button)dialog.findViewById(R.id.ok);
                dialog.getWindow().getAttributes().windowAnimations = R.style.CustomAnimations_slide;
                dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }
}
package com.example.android.greenspades.activity;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.android.greenspades.R;
import com.example.android.greenspades.adapter.TransactionAdapter;
import com.example.android.greenspades.model.Example;
import com.example.android.greenspades.model.Kpi;
import com.example.android.greenspades.model.Transaction;
import com.example.android.greenspades.rest.ApiClient;
import com.example.android.greenspades.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView today_count;
    private TextView total_count;
    private TextView today_sum;
    private TextView total_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        today_count=(TextView)findViewById(R.id.today_count);
        total_count=(TextView)findViewById(R.id.total_count);
        today_sum=(TextView)findViewById(R.id.today_sum);
        total_sum=(TextView)findViewById(R.id.total_sum);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Example> call = apiService.getExample("android");
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example>call, Response<Example> response) {
                List<Kpi> kpis = response.body().getKpis();
                List<Transaction> transactions = response.body().getTransactions();
                for(int i=0;i<transactions.size();i++){
                    if(transactions.get(i).getDateTransaction().equals("")||transactions.get(i).getCustomer()==null||transactions.get(i).getAmountPaid()==0||transactions.get(i).getCustomer().getName().equals("")||transactions.get(i).getCustomer().getMobileNumber().equals("")){
                        transactions.remove(i);
                        i--;
                    }
                }
                Log.d("ARCHIT", "Number of kpis: " + transactions.get(0).getDateTransaction());
                today_count.setText(kpis.get(0).getValue().toString());
                today_sum.setText(kpis.get(1).getValue().toString());
                total_count.setText(kpis.get(2).getValue().toString());
                total_sum.setText(kpis.get(3).getValue().toString());
                recyclerView.setAdapter(new TransactionAdapter(transactions, MainActivity.this));

            }

            @Override
            public void onFailure(Call<Example>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });

    }
}

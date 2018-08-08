package com.example.david.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.david.retrofit.models.MyPojo;
import com.example.david.retrofit.models.Service.ConfiguradorRetrofit;
import com.example.david.retrofit.models.Service.FilmesService;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView text;
    private static final String TAG = "David";
    private int valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        FilmesService service = ConfiguradorRetrofit.getRetrofitInstance().create(FilmesService.class);
        Call<MyPojo> requestCatalogo = service.listCatalogo();

        requestCatalogo.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                if (response.isSuccessful()) {
                    MyPojo myPojo = response.body();
                    text.setText(myPojo.toString());
                }
            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {
                Log.e(TAG, "Deu muito ruim" + t.getMessage());
            }
        });

    }
}


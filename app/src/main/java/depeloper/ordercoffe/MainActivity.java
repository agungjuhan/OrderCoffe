package depeloper.ordercoffe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // method ini dipakai ketika button order ditekan
    public void order(View view){
        String harga = "Total : Rp."+(quantity*10000);
        tampilkanPesan(harga);
    }
    // method ini di pakai ketika buttton tambah ditekan
    public void tambah (View view){
        quantity++;
        tampilkan(quantity);
    }
    // method ini dipakai ketika button kurang ditekan
    public void kurang (View view){
        quantity--;
        tampilkan(quantity);
    }
    // menampilkan harga
    private void tampilkanHarga(int number){
        TextView TvPrice = (TextView)findViewById(R.id.tv_price);
        TvPrice.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    // menampilkan pesan
    private void tampilkanPesan(String message){
        TextView TvPrice = (TextView)findViewById(R.id.tv_price);
        TvPrice.setText(message);
    }
    // menampilkan jumllah order
    private void tampilkan (int number){
        TextView TvQuantity = (TextView)findViewById(R.id.tv_quantity);
        TvQuantity.setText(" "+number);
    }
}

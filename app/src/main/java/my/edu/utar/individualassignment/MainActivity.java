package my.edu.utar.individualassignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCompareNumbers = findViewById(R.id.btnCompareNumbers);
        Button btnOrderNumbers = findViewById(R.id.btnOrderNumbers);
        Button btnComposeNumbers = findViewById(R.id.btnComposeNumbers);

        btnCompareNumbers.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CompareNumbersActivity.class)));
        btnOrderNumbers.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, OrderNumbersActivity.class)));
        btnComposeNumbers.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ComposeNumbersActivity.class)));
    }
}
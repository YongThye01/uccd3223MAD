package my.edu.utar.individualassignment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OrderNumbersActivity extends AppCompatActivity {
    private TextView textNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_numbers);

        textNumbers = findViewById(R.id.textNumbers);

        List<Integer> numbers = generateRandomNumbers();
        displayNumbers(numbers);

        Button btnSortAscending = findViewById(R.id.btnSortAscending);
        Button btnSortDescending = findViewById(R.id.btnSortDescending);

        btnSortAscending.setOnClickListener(v -> {
            Collections.sort(numbers);
            displayNumbers(numbers);
        });

        btnSortDescending.setOnClickListener(v -> {
            numbers.sort(Collections.reverseOrder());
            displayNumbers(numbers);
        });
    }

    private List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        return numbers;
    }


    private void displayNumbers(List<Integer> numbers) {
        StringBuilder builder = new StringBuilder();
        for (Integer number : numbers) {
            builder.append(number).append(", ");
        }
        // Remove the last comma and space
        String numbersString = builder.toString().replaceAll(", $", "");
        textNumbers.setText("Numbers: " + numbersString);
    }
}

package my.edu.utar.individualassignment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class CompareNumbersActivity extends AppCompatActivity {
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_numbers);

        TextView textNumber1 = findViewById(R.id.textNumber1);
        TextView textNumber2 = findViewById(R.id.textNumber2);
        textResult = findViewById(R.id.textResult);

        int number1 = generateRandomNumber();
        int number2 = generateRandomNumber();

        textNumber1.setText("Number 1: " + number1);
        textNumber2.setText("Number 2: " + number2);

        Button btnCompare = findViewById(R.id.btnCompare);
        btnCompare.setOnClickListener(v -> compareNumbers(number1, number2));
    }

    private int generateRandomNumber() {
        // Generate a random number between 1 and 100
        return new Random().nextInt(100) +1;
    }

    private void compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            textResult.setText("Number 1 is greater than Number 2");
        } else if (number1 < number2) {
            textResult.setText("Number 1 is less than Number 2");
        } else {
            textResult.setText("Number 1 is equal to Number 2");
        }
    }
}

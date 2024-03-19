package my.edu.utar.individualassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ComposeNumbersActivity extends AppCompatActivity {
    private EditText editPart1, editPart2;
    private TextView textResult, textNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_numbers);

        editPart1 = findViewById(R.id.editPart1);
        editPart2 = findViewById(R.id.editPart2);
        textResult = findViewById(R.id.textResult);
        textNumber = findViewById(R.id.textNumber);

        // Generate a random number between 1 and 100 for children to compose
        int number = generateRandomNumber();
        textNumber.setText("Enter a Number: " + number);
    }

    // Method to generate a random number between 1 and 100
    private int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    // Method to compose numbers based on user input
    public void composeNumbers(View view) {
        try {
            // Get user input from EditText fields
            int part1 = Integer.parseInt(editPart1.getText().toString());
            int part2 = Integer.parseInt(editPart2.getText().toString());

            // Check if the sum of the two numbers equals the presented number
            int presentedNumber = Integer.parseInt(textNumber.getText().toString().split(": ")[1]);
            if (part1 + part2 == presentedNumber) {
                textResult.setText("Correct! " + part1 + " + " + part2 + " = " + presentedNumber);
            } else {
                textResult.setText("Incorrect! " + part1 + " + " + part2 + " does not equal " + presentedNumber);
            }
        } catch (NumberFormatException e) {
            // Handle invalid input
            textResult.setText("Please enter valid numbers.");
        }
    }

}

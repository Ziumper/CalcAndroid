package com.tkomoszeski.calcandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberInput;
    private EditText secondNumberInput;
    private EditText result;

    private float countNumberFirst;
    private float countNumberSecond;
    private float countNumberResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberInput = (EditText) findViewById(R.id.firstNumberView);
        secondNumberInput = (EditText) findViewById(R.id.secondNumberView);

        result = (EditText) findViewById(R.id.resultNumberView);
    }

    public void addNumbers(View view) {

        parstEditTextToCountNumbers();

        countNumberResult = countNumberFirst + countNumberSecond;

        result.setText(Float.toString(countNumberResult));
    }

    public void subtractNumbers(View view) {
        parstEditTextToCountNumbers();

        countNumberResult = countNumberFirst - countNumberSecond;

        result.setText(Float.toString(countNumberResult));
    }

    public void multiplyNumbers(View view) {
        parstEditTextToCountNumbers();

        countNumberResult = countNumberFirst * countNumberSecond;

        result.setText(Float.toString(countNumberResult));
    }

    public void divideNumbers(View view) {
        parstEditTextToCountNumbers();

        countNumberResult = countNumberFirst / countNumberSecond;

        result.setText(Float.toString(countNumberResult));
    }

    public void exitApplication(View view) {
        clearAll(view);
        finish();
        System.exit(0);
    }

    public void clearAll(View view) {
        result.setText("");
        firstNumberInput.setText("");
        secondNumberInput.setText("");
    }

    private float parseToFloat(String parsingText)
    {
        return Float.parseFloat(parsingText);
    }

    private void parstEditTextToCountNumbers()
    {
        countNumberFirst = parseToFloat(firstNumberInput.getText().toString());
        countNumberSecond = parseToFloat(secondNumberInput.getText().toString());
    }


}

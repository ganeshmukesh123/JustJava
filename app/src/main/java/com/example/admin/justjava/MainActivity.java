package com.example.admin.justjava;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    
    public int quantity;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantity=5;

       /* Button button=(Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display(quantity);
                displayPrice(quantity*2);
            }
        });*/
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


        
        //  displayPrice(quantity*2);
        String priceMessage="Total: $"+quantity*2;
        priceMessage=priceMessage+"\nThank you!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en", "us")).format(number));
    }

    /**
     * increment quantity
     */
    public void increment(View view){
        quantity++;
        display(quantity);
    }

    /**
     * decrement quantity
     */
    public void decrement(View view){
        if(quantity==0){
            display(quantity);
        }
        else {
            quantity--;
            display(quantity);
        }
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}

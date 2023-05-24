package com.example.wallet;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private AlertDialog dialog;
    private LinearLayout bankLayout;

    private ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the activity
            }
        });


        Button transferButton = findViewById(R.id.transferButton);
        transferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogBox();
            }
        });

        LinearLayout llAddMoney = findViewById(R.id.llAddMoney);
        llAddMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddMoneyDialog();
            }
        });
        bankLayout = findViewById(R.id.bankLayout);
        bankLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBankDialog();
            }
        });
    }

    private void showDialogBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_layout, null);
        builder.setView(dialogView);

        // Set dialog box details (TextViews, EditTexts, etc.) programmatically

        // Add button to the dialog box
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle submit button click
            }
        });

        dialog = builder.create();
        dialog.show();

        ImageView closeButton = dialog.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    private void showAddMoneyDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.add_money_dialog_layout, null);
        builder.setView(dialogView);

        TextView titleTextView = dialogView.findViewById(R.id.titleTextView);
        titleTextView.setText("Add Money to Wallet");

        ImageView closeButton = dialogView.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        TextView enterAmountTextView = dialogView.findViewById(R.id.enterAmountTextView);
        enterAmountTextView.setText("Enter Amount");


        Button addButton = dialogView.findViewById(R.id.addButton);
        addButton.setBackgroundResource(R.drawable.add_button_bg);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on add button click
            }
        });

        dialog = builder.create();
        dialog.show();
    }
    public void openDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.aadhar_dialog_layout, null);
        builder.setView(dialogView);

        // Set dialog box details (TextViews, EditTexts, etc.) programmatically

        // Add buttons to the dialog box
        builder.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle submit button click
            }
        });
        builder.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle cancel button click
            }
        });

        // Create and show the dialog box
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showBankDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.send_money_to_bank_dialog_layout, null);
        builder.setView(dialogView);

        // Create and show the dialog box
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
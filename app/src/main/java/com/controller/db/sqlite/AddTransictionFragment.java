package com.controller.db.sqlite;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.controller.db.sqlite.Objcts.Transaction;

public class AddTransictionFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_transiction, container, false);
    }

        public void onViewCreated(final View view, Bundle savedInstanceState) {
        final EditText valueEditText = (EditText) view.findViewById(R.id.valueEditText);
        final ToggleButton toggleButton = (ToggleButton) view.findViewById(R.id.buySellToggleButton);
        final RadioButton radioButton1 = (RadioButton) view.findViewById(R.id.radioButton1);
        final RadioButton radioButton2 = (RadioButton) view.findViewById(R.id.radioButton2);
        final RadioButton radioButton3 = (RadioButton) view.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) view.findViewById(R.id.radioButton4);
        final EditText dateEditText = (EditText) view.findViewById(R.id.dateEditText);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    radioButton1.setText("Dinheiro");
                    radioButton2.setText("Credito");
                    radioButton3.setText("Debito");
                    radioButton4.setText("Ifood");
                }else{
                    radioButton1.setText("Carne");
                    radioButton2.setText("Pão");
                    radioButton3.setText("Salada");
                    radioButton4.setText("Outros");
                }
            }
        });

        final Button button = (Button) view.findViewById(R.id.continueButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transaction transaction = new Transaction();
                //transaction.setValue(Float.valueOf(valueEditText.getText().toString()));
                //transaction.setDate(dateEditText.getText().toString());
            }
        });
    }
}
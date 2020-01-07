package com.example.holyclout;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.widget.CompoundButton.*;

public class HolyFragment extends Fragment {
    private Holydeed holyDeed;
    private EditText titleField;
    private Button dateButton;
    private CheckBox blessedCheckBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        holyDeed = new Holydeed();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_holy, container, false);
        //the activity will add the view, it doesn't need to be done here
        titleField = view.findViewById(R.id.holy_title);
        titleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                holyDeed.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //wire up date button
        dateButton = view.findViewById(R.id.holy_act_date);
        dateButton.setText(holyDeed.getDate().toString());
        dateButton.setEnabled(false);

        //wire up blessed checkbox
        blessedCheckBox = view.findViewById(R.id.holy_act_blessed);
        blessedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                holyDeed.setBlessed(b);
            }
        });


        return view;
    }
}

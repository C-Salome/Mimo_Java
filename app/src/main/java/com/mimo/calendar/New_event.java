package com.mimo.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class New_event extends AppCompatActivity {

    private EditText mNomEvent;
    private EditText mDateDeb;
    private EditText mDateFin;
    private EditText mHeureDeb;
    private EditText mHeureFin;
    private RadioButton mAvant ;
    private RadioButton mApres ;
    private EditText mDuree ;
    private Button mValider ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_event);

        mNomEvent = findViewById(R.id.nom_event);
        mDateDeb = findViewById(R.id.date_deb);
        mDateFin = findViewById(R.id.date_fin);
        mHeureDeb = findViewById(R.id.heure_deb);
        mHeureFin = findViewById(R.id.heure_fin);
        mAvant = findViewById(R.id.radioButton_avant);
        mApres = findViewById(R.id.radioButton_apres);
        mDuree = findViewById(R.id.duree);
        mValider = findViewById(R.id.button_valider);

        mDateDeb.setEnabled(false);
        mDateFin.setEnabled(false);
        mHeureDeb.setEnabled(false);
        mHeureFin.setEnabled(false);
        mAvant.setEnabled(false);
        mApres.setEnabled(false);
        mDuree.setEnabled(false);
        mValider.setEnabled(false);

        mNomEvent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mNomEvent.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mDateDeb.setEnabled(!s.toString().isEmpty());
                mNomEvent.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mDateDeb.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mDateDeb.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mDateFin.setEnabled(!s.toString().isEmpty());
                mDateDeb.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mDateFin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mDateFin.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mHeureDeb.setEnabled(!s.toString().isEmpty());
                mDateFin.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mHeureDeb.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mHeureDeb.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mHeureFin.setEnabled(!s.toString().isEmpty());
                mHeureDeb.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mHeureFin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mHeureFin.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mAvant.setEnabled(!s.toString().isEmpty());
                mApres.setEnabled(!s.toString().isEmpty());
                mDuree.setEnabled(!s.toString().isEmpty());
                mHeureFin.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mDuree.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mDuree.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mValider.setEnabled(!s.toString().isEmpty());
                mDuree.setBackgroundColor(getResources().getColor(R.color.green)); ;
            }
        });

        mValider.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mValider.setTextColor(getResources().getColor(R.color.black)); ;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mValider.setBackgroundColor(getResources().getColor(R.color.green));

            }
        });
    }
}
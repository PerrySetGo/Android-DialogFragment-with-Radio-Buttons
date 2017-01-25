package com.example.epicodus_staff.dialogpractice;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by epicodus_staff on 1/24/17.
 */

public class MoodDialogFragment extends DialogFragment{

    RadioButton selectedRadioButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);



        return rootView;
    }

}

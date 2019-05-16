package de.marei.fragmentsandnestedfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class OneFragmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Always call super()
        setContentView(R.layout.activity_one_fragment); // Set view of the activity
    }
}

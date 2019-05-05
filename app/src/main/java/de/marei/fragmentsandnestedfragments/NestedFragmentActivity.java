package de.marei.fragmentsandnestedfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import de.marei.fragmentsandnestedfragments.fragments.OuterFragment;

public class NestedFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Always call super()
        setContentView(R.layout.activity_nested_fragment); // Set view of the activity
        OuterFragment outerFragment = new OuterFragment(); // Instantiate fragment
        FragmentManager fragmentManager = getSupportFragmentManager(); // Fragment manager of the activity
        fragmentManager
                .beginTransaction()
                .add(R.id.main, outerFragment)
                .commit(); // Add fragment to activity
    }
}

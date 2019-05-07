package de.marei.fragmentsandnestedfragments.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.marei.fragmentsandnestedfragments.ButtonCallback;
import de.marei.fragmentsandnestedfragments.R;

public class OuterFragment extends Fragment implements ButtonCallback {

    private TextView textCounter;
    private int counter = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, 
                             @Nullable Bundle savedInstanceState) {
        
        return inflater.inflate(R.layout.fragment_outer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InnerFragment innerFragment = new InnerFragment();
        innerFragment.setCallback(this);
        requireFragmentManager()
                .beginTransaction()
                .add(R.id.container, innerFragment)
                .commit();
        textCounter = view.findViewById(R.id.text_counter);
        textCounter.setText(String.valueOf(counter));
    }

    @Override
    public void hitCounter() {
        textCounter.setText(String.valueOf(++counter));
    }
}

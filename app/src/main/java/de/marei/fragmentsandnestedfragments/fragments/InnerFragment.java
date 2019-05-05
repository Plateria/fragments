package de.marei.fragmentsandnestedfragments.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import de.marei.fragmentsandnestedfragments.ButtonCallback;
import de.marei.fragmentsandnestedfragments.R;


public class InnerFragment extends Fragment {

    ButtonCallback callback;

    public void setCallback(ButtonCallback callback) {
        this.callback = callback;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inner, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonCounter = view.findViewById(R.id.button_counter);
        buttonCounter.setOnClickListener((v) -> callback.hitCounter());
    }
}

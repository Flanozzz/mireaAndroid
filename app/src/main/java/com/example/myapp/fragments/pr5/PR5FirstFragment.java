package com.example.myapp.fragments.pr5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.R;
import com.example.myapp.Utils;
import com.example.myapp.databinding.FragmentPR5FirstBinding;

public class PR5FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentPR5FirstBinding binding = FragmentPR5FirstBinding.inflate(getLayoutInflater());

        Bundle bundle = new Bundle();
        bundle.putString(Utils.BUNDLE_STRING_KEY, "Данные от первого фрагмента");

        binding.navigateToSecondButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_PR5FirstFragment_to_PR5SecondFragment
            );
        });

        binding.navigateToThirdButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_PR5FirstFragment_to_PR5ThirdFragment,
                    bundle
            );
        });

        return binding.getRoot();
    }
}

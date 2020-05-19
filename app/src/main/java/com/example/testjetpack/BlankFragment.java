package com.example.testjetpack;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testjetpack.databinding.BlankFragmentBinding;

public class BlankFragment extends Fragment {

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        BlankFragmentBinding blankFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.blank_fragment, container, false);
        BlankViewModel blankViewModel = ViewModelProviders.of(getActivity()).get(BlankViewModel.class);
        blankFragmentBinding.setData(blankViewModel);
        blankFragmentBinding.setLifecycleOwner(this);
        return blankFragmentBinding.getRoot();
    }
}

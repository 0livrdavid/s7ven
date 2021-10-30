package br.com.application.s7ven.fragments.configuracao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import br.com.application.s7ven.R;

import java.util.ArrayList;

import br.com.application.s7ven.R;
import br.com.application.s7ven.databinding.FragmentConfiguracaoBinding;

public class ConfiguracaoFragment extends Fragment {

    private ConfiguracaoViewModel configuracaoViewModel;
    private FragmentConfiguracaoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        configuracaoViewModel =
                new ViewModelProvider(this).get(ConfiguracaoViewModel.class);

        binding = FragmentConfiguracaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        configuracaoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    Spinner periodos = (Spinner) findViewById(R.id.spPeriodo);
    ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.periodos, android.R.layout.simple_dropdown_item_1line);

}
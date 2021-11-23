package br.com.application.s7ven.fragments.configuracao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        Spinner periodos = (Spinner) root.findViewById(R.id.spPeriodo);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.periodos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        periodos.setAdapter(adapter);
        periodos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}
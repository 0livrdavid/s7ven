package br.com.application.s7ven.fragments.disciplinas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import br.com.application.s7ven.databinding.FragmentDisciplinasBinding;

public class DisciplinasFragment extends Fragment {

    private DisciplinasViewModel disciplinasViewModel;
    private FragmentDisciplinasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        disciplinasViewModel =
                new ViewModelProvider(this).get(DisciplinasViewModel.class);

        binding = FragmentDisciplinasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        disciplinasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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
}
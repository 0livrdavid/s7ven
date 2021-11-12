package br.com.application.s7ven.fragments.disciplinas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import br.com.application.s7ven.R;

import br.com.application.s7ven.databinding.FragmentDisciplinasBinding;
import br.com.application.s7ven.model.Disciplinas;

public class DisciplinasFragment extends Fragment {

    private WebView webview;
    private DisciplinasViewModel disciplinasViewModel;
    private FragmentDisciplinasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        disciplinasViewModel =
                new ViewModelProvider(this).get(DisciplinasViewModel.class);

        binding = FragmentDisciplinasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        webview = (WebView) root.findViewById(R.id.webview);

        return root;

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
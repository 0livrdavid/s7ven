package br.com.application.s7ven.fragments.configuracao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfiguracaoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConfiguracaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
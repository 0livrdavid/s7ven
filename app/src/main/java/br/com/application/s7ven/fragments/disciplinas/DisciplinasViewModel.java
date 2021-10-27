package br.com.application.s7ven.fragments.disciplinas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DisciplinasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DisciplinasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is disciplinas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
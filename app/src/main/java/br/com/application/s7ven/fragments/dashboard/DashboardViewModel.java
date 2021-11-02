package br.com.application.s7ven.fragments.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText2;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("67");
        mText2 = new MutableLiveData<>();
        mText2.setValue("35");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getText2() { return mText2; }
}
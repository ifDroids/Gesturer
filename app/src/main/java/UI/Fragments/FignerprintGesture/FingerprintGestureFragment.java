package UI.Fragments.FignerprintGesture;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.base.gesturer.R;

public class FingerprintGestureFragment extends Fragment {

    private FingerprintGestureViewModel mViewModel;

    public static FingerprintGestureFragment newInstance() {
        return new FingerprintGestureFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fingerprint_gesture_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FingerprintGestureViewModel.class);
        // TODO: Use the ViewModel
    }

}

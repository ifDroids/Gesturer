package UI.Fragments.SwipeGesture;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.base.gesturer.R;

public class SwipeGestureFragment extends Fragment {

    private SwipeGestureViewModel mViewModel;

    public static SwipeGestureFragment newInstance() {
        return new SwipeGestureFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.swipe_gesture_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SwipeGestureViewModel.class);
        // TODO: Use the ViewModel
    }

}

package UI.Fragments.SwipeGesture;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.base.gesturer.R;

import Utils.SimpleGestureDetector;

public class SwipeGestureFragment extends Fragment {
    private View mThisView;
    private GestureDetector mGestureDetector;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mThisView = inflater.inflate(R.layout.swipe_gesture_fragment, container, false);

        SimpleGestureDetector simpleGestureDetector = new SimpleGestureDetector();
        mGestureDetector = new GestureDetector(getActivity(), simpleGestureDetector);

//        Create the touch listener
        mThisView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mGestureDetector.onTouchEvent(event);
                return true;
            }
        });
        mThisView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("aasdasdsa", "Asdasdsadas");
            }
        });
        return mThisView;
    }


}

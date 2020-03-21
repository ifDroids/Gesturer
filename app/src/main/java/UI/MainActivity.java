package UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.base.gesturer.R;

import UI.Fragments.FignerprintGesture.FingerprintGestureFragment;
import UI.Fragments.SwipeGesture.SwipeGestureFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_fingerprint_textview)
    TextView main_fingerprint_textview;
    @BindView(R.id.main_swipe_gesture_textview)
    TextView main_swipe_gesture_textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        main_fingerprint_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FingerprintGestureFragment fingerprintFragment = new FingerprintGestureFragment();
                addFragment(R.id.main_activity_container, fingerprintFragment);

            }
        });
        main_swipe_gesture_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment swipeGestureFragment = new SwipeGestureFragment();
                addFragment(R.id.main_activity_container, swipeGestureFragment);
            }
        });
    }

    void addFragment(int id, Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(id, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}

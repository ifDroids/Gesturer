package Utils;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class SimpleGestureDetector implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private static final String TAG = "SimpleGestureDetector";

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.e(TAG, " onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.e(TAG, " onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.e(TAG, " onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.e(TAG, " onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.e(TAG, " onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.e(TAG, " onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.e(TAG, " onScroll");

        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.e(TAG, " onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
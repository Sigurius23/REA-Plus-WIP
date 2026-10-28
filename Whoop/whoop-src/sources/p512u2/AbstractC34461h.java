package p512u2;

import android.view.MotionEvent;

/* JADX INFO: renamed from: u2.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34461h {
    /* JADX INFO: renamed from: a */
    public static long m108933a(MotionEvent motionEvent, int i13) {
        float rawX = motionEvent.getRawX(i13);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i13))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}

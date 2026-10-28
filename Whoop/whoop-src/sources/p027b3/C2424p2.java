package p027b3;

import android.view.MotionEvent;

/* JADX INFO: renamed from: b3.p2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2424p2 {

    /* JADX INFO: renamed from: a */
    public static final C2424p2 f9511a = new C2424p2();

    /* JADX INFO: renamed from: a */
    public final boolean m7426a(MotionEvent motionEvent, int i13) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i13)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i13)) & Integer.MAX_VALUE) < 2139095040;
    }
}

package x82;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: x82.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC38077d {

    /* JADX INFO: renamed from: a */
    private static final HandlerThread f163078a = new HandlerThread("WHOOP General Background");

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static Handler m121983a() {
        return new Handler(f163078a.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public static void m121984b() {
        f163078a.start();
    }
}

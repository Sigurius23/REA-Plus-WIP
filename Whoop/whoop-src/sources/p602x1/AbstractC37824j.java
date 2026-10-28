package p602x1;

import android.os.Looper;

/* JADX INFO: renamed from: x1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37824j {

    /* JADX INFO: renamed from: a */
    public static final long f161982a;

    static {
        long id4;
        try {
            id4 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id4 = -1;
        }
        f161982a = id4;
    }
}

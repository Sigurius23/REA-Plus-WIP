package p027b3;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: renamed from: b3.g2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2379g2 {
    /* JADX INFO: renamed from: a */
    public static boolean m7352a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}

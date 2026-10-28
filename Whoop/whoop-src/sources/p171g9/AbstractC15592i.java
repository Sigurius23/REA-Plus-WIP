package p171g9;

import android.os.Build;
import p010a9.InterfaceC0577b;

/* JADX INFO: renamed from: g9.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15592i implements InterfaceC0577b {

    /* JADX INFO: renamed from: a */
    public static final boolean f58542a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z4;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        f58542a = z4;
    }
}

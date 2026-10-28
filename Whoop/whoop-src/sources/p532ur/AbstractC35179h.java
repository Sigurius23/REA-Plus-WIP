package p532ur;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: ur.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35179h {

    /* JADX INFO: renamed from: a */
    public static final HashMap f149293a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f149293a = new HashMap();
        AbstractC25012a.m73372e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}

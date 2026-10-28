package b23;

import android.util.Log;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2335a extends AbstractC2340f {
    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[PHI: r2
      0x0020: PHI (r2v3 int) = (r2v2 int), (r2v4 int), (r2v4 int) binds: [B:5:0x0013, B:11:0x001c, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b23.InterfaceC2344j
    public final void log(EnumC2341g enumC2341g, String tag, String message, Throwable th3) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        int iOrdinal = enumC2341g.ordinal();
        int i13 = 2;
        if (iOrdinal != 0) {
            int i14 = 3;
            if (iOrdinal == 1) {
                i13 = i14;
            } else if (iOrdinal != 2) {
                i13 = 5;
                if (iOrdinal != 3) {
                    i14 = 6;
                    if (iOrdinal == 4 || iOrdinal != 5) {
                        i13 = i14;
                    } else {
                        i13 = 7;
                    }
                }
            } else {
                i13 = 4;
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        String strM95640p = AbstractC31061c.m95640p("(", threadCurrentThread.getName() + ":" + threadCurrentThread.getId(), ") ", message);
        if (th3 != null) {
            th3.printStackTrace();
            String strM53370k = AbstractC18489d0.m53370k(strM95640p, "\n", AbstractC29125c.m88514W(th3));
            if (strM53370k != null) {
                strM95640p = strM53370k;
            }
        }
        Log.println(i13, tag, strM95640p);
    }
}

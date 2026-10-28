package p684zk;

import java.util.Arrays;
import java.util.HashMap;
import m83.AbstractC25260n;
import p002a0.C0032j0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: zk.w */
/* JADX INFO: loaded from: classes.dex */
public final class C40798w {

    /* JADX INFO: renamed from: a */
    public final Object f175951a;

    public C40798w() {
        this.f175951a = new HashMap();
        new HashMap();
    }

    public C40798w(long[] jArr) {
        C0032j0 c0032j0;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c0032j0 = new C0032j0(jArrCopyOf.length);
            int i13 = c0032j0.f95b;
            if (i13 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i13;
                    long[] jArr2 = c0032j0.f94a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        AbstractC22676k.m65749i(jArrCopyOf2, "copyOf(...)");
                        c0032j0.f94a = jArrCopyOf2;
                    }
                    long[] jArr3 = c0032j0.f94a;
                    int i14 = c0032j0.f95b;
                    if (i13 != i14) {
                        AbstractC25260n.m74066g0(jArr3, jArr3, jArrCopyOf.length + i13, i13, i14);
                    }
                    AbstractC25260n.m74066g0(jArrCopyOf, jArr3, i13, 0, jArrCopyOf.length);
                    c0032j0.f95b += jArrCopyOf.length;
                }
            } else {
                AbstractC34924m.m110135Q("");
                throw null;
            }
        } else {
            c0032j0 = new C0032j0(16);
        }
        this.f175951a = c0032j0;
    }
}

package p390p1;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;
import p005a3.C0194e0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28659r {

    /* JADX INFO: renamed from: a */
    public static final C28609e1 f115939a = new C28609e1("provider");

    /* JADX INFO: renamed from: b */
    public static final C28609e1 f115940b = new C28609e1("provider");

    /* JADX INFO: renamed from: c */
    public static final C28609e1 f115941c = new C28609e1("compositionLocalMap");

    /* JADX INFO: renamed from: d */
    public static final C28609e1 f115942d = new C28609e1("providers");

    /* JADX INFO: renamed from: e */
    public static final C28609e1 f115943e = new C28609e1("reference");

    /* JADX INFO: renamed from: f */
    public static final C0194e0 f115944f = new C0194e0(3);

    /* JADX INFO: renamed from: a */
    public static final void m87190a(int i13, int i14, List list) {
        int iM87194e = m87194e(i13, list);
        if (iM87194e < 0) {
            iM87194e = -(iM87194e + 1);
        }
        while (iM87194e < list.size() && ((C28648o0) list.get(iM87194e)).f115868b < i14) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m87191b(C28610e2 c28610e2, ArrayList arrayList, int i13) {
        boolean zM87000l = c28610e2.m87000l(i13);
        int[] iArr = c28610e2.f115739b;
        if (zM87000l) {
            arrayList.add(c28610e2.m87002n(i13));
            return;
        }
        int i14 = iArr[(i13 * 5) + 3] + i13;
        for (int i15 = i13 + 1; i15 < i14; i15 += iArr[(i15 * 5) + 3]) {
            m87191b(c28610e2, arrayList, i15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87192c(String str) {
        throw new ComposeRuntimeError(AbstractC11895b.m31996o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: d */
    public static final Void m87193d(String str) {
        throw new ComposeRuntimeError(AbstractC11895b.m31996o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: e */
    public static final int m87194e(int i13, List list) {
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            int iM65751k = AbstractC22676k.m65751k(((C28648o0) list.get(i15)).f115868b, i13);
            if (iM65751k < 0) {
                i14 = i15 + 1;
            } else {
                if (iM65751k <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m87195f(Object obj, Object obj2, Object obj3) {
        C28656q0 c28656q0 = obj instanceof C28656q0 ? (C28656q0) obj : null;
        if (c28656q0 == null) {
            return null;
        }
        if (AbstractC22676k.m65745e(c28656q0.m87186a(), obj2) && AbstractC22676k.m65745e(c28656q0.m87187b(), obj3)) {
            return obj;
        }
        Object objM87195f = m87195f(c28656q0.m87186a(), obj2, obj3);
        return objM87195f == null ? m87195f(c28656q0.m87187b(), obj2, obj3) : objM87195f;
    }

    /* JADX INFO: renamed from: g */
    public static final void m87196g(C28626i2 c28626i2, int i13, Object obj) {
        int iM87063h = c28626i2.m87063h(i13);
        Object[] objArr = c28626i2.f115783c;
        Object obj2 = objArr[iM87063h];
        objArr[iM87063h] = C28635l.f115821a;
        if (obj == obj2) {
            return;
        }
        m87192c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}

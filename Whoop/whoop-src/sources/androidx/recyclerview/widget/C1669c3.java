package androidx.recyclerview.widget;

import p002a0.AbstractC0064z;
import p002a0.C0021f1;
import p002a0.C0062y;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1669c3 {

    /* JADX INFO: renamed from: a */
    public final C0021f1 f6599a = new C0021f1(0);

    /* JADX INFO: renamed from: b */
    public final C0062y f6600b = new C0062y((Object) null);

    /* JADX INFO: renamed from: a */
    public final void m5208a(AbstractC1717o2 abstractC1717o2, C1716o1 c1716o1) {
        C0021f1 c0021f1 = this.f6599a;
        C1659a3 c1659a3M5165a = (C1659a3) c0021f1.get(abstractC1717o2);
        if (c1659a3M5165a == null) {
            c1659a3M5165a = C1659a3.m5165a();
            c0021f1.put(abstractC1717o2, c1659a3M5165a);
        }
        c1659a3M5165a.f6571c = c1716o1;
        c1659a3M5165a.f6569a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public final C1716o1 m5209b(AbstractC1717o2 abstractC1717o2, int i13) {
        C1659a3 c1659a3;
        C1716o1 c1716o1;
        C0021f1 c0021f1 = this.f6599a;
        int iM36d = c0021f1.m36d(abstractC1717o2);
        if (iM36d >= 0 && (c1659a3 = (C1659a3) c0021f1.m42k(iM36d)) != null) {
            int i14 = c1659a3.f6569a;
            if ((i14 & i13) != 0) {
                int i15 = i14 & (~i13);
                c1659a3.f6569a = i15;
                if (i13 == 4) {
                    c1716o1 = c1659a3.f6570b;
                } else {
                    if (i13 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c1716o1 = c1659a3.f6571c;
                }
                if ((i15 & 12) == 0) {
                    c0021f1.mo40i(iM36d);
                    c1659a3.f6569a = 0;
                    c1659a3.f6570b = null;
                    c1659a3.f6571c = null;
                    C1659a3.f6568d.mo43683a(c1659a3);
                }
                return c1716o1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5210c(AbstractC1717o2 abstractC1717o2) {
        C1659a3 c1659a3 = (C1659a3) this.f6599a.get(abstractC1717o2);
        if (c1659a3 == null) {
            return;
        }
        c1659a3.f6569a &= -2;
    }

    /* JADX INFO: renamed from: d */
    public final void m5211d(AbstractC1717o2 abstractC1717o2) {
        C0062y c0062y = this.f6600b;
        for (int iM157i = c0062y.m157i() - 1; iM157i >= 0; iM157i--) {
            if (abstractC1717o2 == c0062y.m158j(iM157i)) {
                Object[] objArr = c0062y.f197y;
                Object obj = objArr[iM157i];
                Object obj2 = AbstractC0064z.f201a;
                if (obj == obj2) {
                    break;
                }
                objArr[iM157i] = obj2;
                c0062y.f195w = true;
                break;
            }
        }
        C1659a3 c1659a3 = (C1659a3) this.f6599a.remove(abstractC1717o2);
        if (c1659a3 != null) {
            c1659a3.f6569a = 0;
            c1659a3.f6570b = null;
            c1659a3.f6571c = null;
            C1659a3.f6568d.mo43683a(c1659a3);
        }
    }
}

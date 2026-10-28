package p291l0;

import dc1.C11906c;
import java.util.List;
import l83.C23454a0;
import m83.C25272z;
import p026b2.InterfaceC2302h;
import p031b9.AbstractC2875y;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: l0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C22998t implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2302h f90724a;

    /* JADX INFO: renamed from: b */
    public final boolean f90725b;

    public C22998t(InterfaceC2302h interfaceC2302h, boolean z4) {
        this.f90724a = interfaceC2302h;
        this.f90725b = z4;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(final InterfaceC39133t0 interfaceC39133t0, final List list, long j7) {
        int iM124767k;
        int iM124766j;
        AbstractC39104j1 abstractC39104j1Mo448T;
        boolean zIsEmpty = list.isEmpty();
        C25272z c25272z = C25272z.f99163w;
        if (zIsEmpty) {
            return interfaceC39133t0.mo86822W(C39169a.m124767k(j7), C39169a.m124766j(j7), c25272z, new C11906c(27));
        }
        long j13 = this.f90725b ? j7 : j7 & (-8589934589L);
        if (list.size() == 1) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(0);
            Object objMo454p = interfaceC39124q0.mo454p();
            C22983o c22983o = objMo454p instanceof C22983o ? (C22983o) objMo454p : null;
            if (c22983o != null ? c22983o.f90673P : false) {
                iM124767k = C39169a.m124767k(j7);
                iM124766j = C39169a.m124766j(j7);
                int iM124767k2 = C39169a.m124767k(j7);
                int iM124766j2 = C39169a.m124766j(j7);
                if (!((iM124766j2 >= 0) & (iM124767k2 >= 0))) {
                    AbstractC39177i.m124789a("width and height must be >= 0");
                }
                abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124776h(iM124767k2, iM124767k2, iM124766j2, iM124766j2));
            } else {
                abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j13);
                iM124767k = Math.max(C39169a.m124767k(j7), abstractC39104j1Mo448T.f168211w);
                iM124766j = Math.max(C39169a.m124766j(j7), abstractC39104j1Mo448T.f168212x);
            }
            int i13 = iM124766j;
            int i14 = iM124767k;
            return interfaceC39133t0.mo86822W(i14, i13, c25272z, new C22992r(abstractC39104j1Mo448T, interfaceC39124q0, interfaceC39133t0, i14, i13, this));
        }
        final AbstractC39104j1[] abstractC39104j1Arr = new AbstractC39104j1[list.size()];
        final C22665e0 c22665e0 = new C22665e0();
        c22665e0.f89334w = C39169a.m124767k(j7);
        final C22665e0 c22665e1 = new C22665e0();
        c22665e1.f89334w = C39169a.m124766j(j7);
        List list2 = list;
        int size = list2.size();
        boolean z4 = false;
        for (int i15 = 0; i15 < size; i15++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list.get(i15);
            Object objMo454p2 = interfaceC39124q1.mo454p();
            C22983o c22983o2 = objMo454p2 instanceof C22983o ? (C22983o) objMo454p2 : null;
            if (c22983o2 != null ? c22983o2.f90673P : false) {
                z4 = true;
            } else {
                AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1.mo448T(j13);
                abstractC39104j1Arr[i15] = abstractC39104j1Mo448T2;
                c22665e0.f89334w = Math.max(c22665e0.f89334w, abstractC39104j1Mo448T2.f168211w);
                c22665e1.f89334w = Math.max(c22665e1.f89334w, abstractC39104j1Mo448T2.f168212x);
            }
        }
        if (z4) {
            int i16 = c22665e0.f89334w;
            int i17 = i16 != Integer.MAX_VALUE ? i16 : 0;
            int i18 = c22665e1.f89334w;
            long jM124769a = AbstractC39170b.m124769a(i17, i16, i18 != Integer.MAX_VALUE ? i18 : 0, i18);
            int size2 = list2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) list.get(i19);
                Object objMo454p3 = interfaceC39124q2.mo454p();
                C22983o c22983o3 = objMo454p3 instanceof C22983o ? (C22983o) objMo454p3 : null;
                if (c22983o3 != null ? c22983o3.f90673P : false) {
                    abstractC39104j1Arr[i19] = interfaceC39124q2.mo448T(jM124769a);
                }
            }
        }
        return interfaceC39133t0.mo86822W(c22665e0.f89334w, c22665e1.f89334w, c25272z, new Function1() { // from class: l0.s
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                AbstractC39104j1[] abstractC39104j1Arr2 = abstractC39104j1Arr;
                int length = abstractC39104j1Arr2.length;
                int i24 = 0;
                int i25 = 0;
                while (i25 < length) {
                    int i26 = i24;
                    AbstractC39104j1 abstractC39104j1 = abstractC39104j1Arr2[i25];
                    AbstractC22676k.m65748h(abstractC39104j1, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC22989q.m66761b(abstractC39101i1, abstractC39104j1, (InterfaceC39124q0) list.get(i26), interfaceC39133t0.getLayoutDirection(), c22665e0.f89334w, c22665e1.f89334w, this.f90724a);
                    i25++;
                    i24 = i26 + 1;
                }
                return C23454a0.f92919a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22998t)) {
            return false;
        }
        C22998t c22998t = (C22998t) obj;
        return AbstractC22676k.m65745e(this.f90724a, c22998t.f90724a) && this.f90725b == c22998t.f90725b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90725b) + (this.f90724a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb4.append(this.f90724a);
        sb4.append(", propagateMinConstraints=");
        return AbstractC2875y.m8305r(sb4, this.f90725b, ')');
    }
}

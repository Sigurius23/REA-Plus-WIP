package p324m9;

import android.util.SparseArray;
import p499t9.C33650s;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33648q;
import p516u8.C34610p;
import p619xl.C38445a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C25275c implements InterfaceC33648q {

    /* JADX INFO: renamed from: J */
    public static final C33650s f99175J = new C33650s();

    /* JADX INFO: renamed from: E */
    public boolean f99176E;

    /* JADX INFO: renamed from: F */
    public C38445a f99177F;

    /* JADX INFO: renamed from: G */
    public long f99178G;

    /* JADX INFO: renamed from: H */
    public InterfaceC33627e0 f99179H;

    /* JADX INFO: renamed from: I */
    public C34610p[] f99180I;

    /* JADX INFO: renamed from: w */
    public final InterfaceC33644n f99181w;

    /* JADX INFO: renamed from: x */
    public final int f99182x;

    /* JADX INFO: renamed from: y */
    public final C34610p f99183y;

    /* JADX INFO: renamed from: z */
    public final SparseArray f99184z = new SparseArray();

    public C25275c(InterfaceC33644n interfaceC33644n, int i13, C34610p c34610p) {
        this.f99181w = interfaceC33644n;
        this.f99182x = i13;
        this.f99183y = c34610p;
    }

    /* JADX INFO: renamed from: a */
    public final void m74170a(C38445a c38445a, long j7, long j13) {
        this.f99177F = c38445a;
        this.f99178G = j13;
        boolean z4 = this.f99176E;
        InterfaceC33644n interfaceC33644n = this.f99181w;
        if (!z4) {
            interfaceC33644n.mo1541g(this);
            if (j7 != -9223372036854775807L) {
                interfaceC33644n.mo1540b(0L, j7);
            }
            this.f99176E = true;
            return;
        }
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        interfaceC33644n.mo1540b(0L, j7);
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f99184z;
            if (i13 >= sparseArray.size()) {
                return;
            }
            C25274b c25274b = (C25274b) sparseArray.valueAt(i13);
            if (c38445a == null) {
                c25274b.f99173e = c25274b.f99171c;
            } else {
                c25274b.f99174f = j13;
                InterfaceC33639k0 interfaceC33639k0M123169F = c38445a.m123169F(c25274b.f99169a);
                c25274b.f99173e = interfaceC33639k0M123169F;
                C34610p c34610p = c25274b.f99172d;
                if (c34610p != null) {
                    interfaceC33639k0M123169F.mo36173a(c34610p);
                }
            }
            i13++;
        }
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public final void mo3098l() {
        SparseArray sparseArray = this.f99184z;
        C34610p[] c34610pArr = new C34610p[sparseArray.size()];
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            C34610p c34610p = ((C25274b) sparseArray.valueAt(i13)).f99172d;
            AbstractC35849g.m113808j(c34610p);
            c34610pArr[i13] = c34610p;
        }
        this.f99180I = c34610pArr;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: o */
    public final InterfaceC33639k0 mo3101o(int i13, int i14) {
        SparseArray sparseArray = this.f99184z;
        C25274b c25274b = (C25274b) sparseArray.get(i13);
        if (c25274b == null) {
            AbstractC35849g.m113807i(this.f99180I == null);
            c25274b = new C25274b(i13, i14, i14 == this.f99182x ? this.f99183y : null);
            C38445a c38445a = this.f99177F;
            long j7 = this.f99178G;
            if (c38445a == null) {
                c25274b.f99173e = c25274b.f99171c;
            } else {
                c25274b.f99174f = j7;
                InterfaceC33639k0 interfaceC33639k0M123169F = c38445a.m123169F(i14);
                c25274b.f99173e = interfaceC33639k0M123169F;
                C34610p c34610p = c25274b.f99172d;
                if (c34610p != null) {
                    interfaceC33639k0M123169F.mo36173a(c34610p);
                }
            }
            sparseArray.put(i13, c25274b);
        }
        return c25274b;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: v */
    public final void mo3109v(InterfaceC33627e0 interfaceC33627e0) {
        this.f99179H = interfaceC33627e0;
    }
}

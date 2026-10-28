package p185h6;

import android.util.SparseArray;

/* JADX INFO: renamed from: h6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C16966u {

    /* JADX INFO: renamed from: a */
    public final SparseArray f65117a;

    /* JADX INFO: renamed from: b */
    public C16969x f65118b;

    public C16966u(int i13) {
        this.f65117a = new SparseArray(i13);
    }

    /* JADX INFO: renamed from: a */
    public final void m47723a(C16969x c16969x, int i13, int i14) {
        int iM47731a = c16969x.m47731a(i13);
        SparseArray sparseArray = this.f65117a;
        C16966u c16966u = sparseArray == null ? null : (C16966u) sparseArray.get(iM47731a);
        if (c16966u == null) {
            c16966u = new C16966u(1);
            sparseArray.put(c16969x.m47731a(i13), c16966u);
        }
        if (i14 > i13) {
            c16966u.m47723a(c16969x, i13 + 1, i14);
        } else {
            c16966u.f65118b = c16969x;
        }
    }
}

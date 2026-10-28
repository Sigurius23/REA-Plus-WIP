package p410q1;

import androidx.room.AbstractC1772c1;
import java.util.ArrayList;
import p005a3.C0264x;
import p390p1.AbstractC28659r;
import p390p1.C28655q;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C29754b {

    /* JADX INFO: renamed from: a */
    public final C28655q f121746a;

    /* JADX INFO: renamed from: b */
    public C29752a f121747b;

    /* JADX INFO: renamed from: c */
    public boolean f121748c;

    /* JADX INFO: renamed from: f */
    public int f121751f;

    /* JADX INFO: renamed from: g */
    public int f121752g;

    /* JADX INFO: renamed from: l */
    public int f121757l;

    /* JADX INFO: renamed from: d */
    public final C0264x f121749d = new C0264x();

    /* JADX INFO: renamed from: e */
    public boolean f121750e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f121753h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f121754i = -1;

    /* JADX INFO: renamed from: j */
    public int f121755j = -1;

    /* JADX INFO: renamed from: k */
    public int f121756k = -1;

    public C29754b(C28655q c28655q, C29752a c29752a) {
        this.f121746a = c28655q;
        this.f121747b = c29752a;
    }

    /* JADX INFO: renamed from: a */
    public final void m91225a() {
        m91227c();
        ArrayList arrayList = this.f121753h;
        if (arrayList.isEmpty()) {
            this.f121752g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m91226b() {
        int i13 = this.f121752g;
        if (i13 > 0) {
            C29775l0 c29775l0 = this.f121747b.f121744a;
            c29775l0.m91239g0(C29767h0.f121771d);
            c29775l0.f121782c[c29775l0.f121783d - c29775l0.f121780a[c29775l0.f121781b - 1].f121776b] = i13;
            this.f121752g = 0;
        }
        ArrayList arrayList = this.f121753h;
        if (arrayList.isEmpty()) {
            return;
        }
        C29752a c29752a = this.f121747b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i14] = arrayList.get(i14);
        }
        c29752a.getClass();
        if (size != 0) {
            C29775l0 c29775l1 = c29752a.f121744a;
            c29775l1.m91239g0(C29772k.f121778d);
            AbstractC1772c1.m5378O(c29775l1, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m91227c() {
        int i13 = this.f121757l;
        if (i13 > 0) {
            int i14 = this.f121754i;
            if (i14 >= 0) {
                m91226b();
                C29775l0 c29775l0 = this.f121747b.f121744a;
                c29775l0.m91239g0(C29789z.f121803d);
                int i15 = c29775l0.f121783d - c29775l0.f121780a[c29775l0.f121781b - 1].f121776b;
                int[] iArr = c29775l0.f121782c;
                iArr[i15] = i14;
                iArr[i15 + 1] = i13;
                this.f121754i = -1;
            } else {
                int i16 = this.f121756k;
                int i17 = this.f121755j;
                m91226b();
                C29775l0 c29775l1 = this.f121747b.f121744a;
                c29775l1.m91239g0(C29785v.f121799d);
                int i18 = c29775l1.f121783d - c29775l1.f121780a[c29775l1.f121781b - 1].f121776b;
                int[] iArr2 = c29775l1.f121782c;
                iArr2[i18 + 1] = i16;
                iArr2[i18] = i17;
                iArr2[i18 + 2] = i13;
                this.f121755j = -1;
                this.f121756k = -1;
            }
            this.f121757l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m91228d(boolean z4) {
        C28655q c28655q = this.f121746a;
        int i13 = z4 ? c28655q.f115891G.f115746i : c28655q.f115891G.f115744g;
        int i14 = i13 - this.f121751f;
        if (i14 < 0) {
            AbstractC28659r.m87192c("Tried to seek backward");
        }
        if (i14 > 0) {
            C29775l0 c29775l0 = this.f121747b.f121744a;
            c29775l0.m91239g0(C29758d.f121762d);
            c29775l0.f121782c[c29775l0.f121783d - c29775l0.f121780a[c29775l0.f121781b - 1].f121776b] = i14;
            this.f121751f = i13;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m91229e(int i13, int i14) {
        if (i14 > 0) {
            if (!(i13 >= 0)) {
                AbstractC28659r.m87192c("Invalid remove index " + i13);
            }
            if (this.f121754i == i13) {
                this.f121757l += i14;
                return;
            }
            m91227c();
            this.f121754i = i13;
            this.f121757l = i14;
        }
    }
}

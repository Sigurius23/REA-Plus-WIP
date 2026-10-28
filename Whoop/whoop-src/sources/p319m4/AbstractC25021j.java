package p319m4;

import java.util.ArrayList;
import java.util.Arrays;
import p333n4.C26259o;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: m4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25021j extends C25016e {

    /* JADX INFO: renamed from: r0 */
    public C25016e[] f98021r0 = new C25016e[4];

    /* JADX INFO: renamed from: s0 */
    public int f98022s0 = 0;

    /* JADX INFO: renamed from: V */
    public final void m73472V(C25016e c25016e) {
        if (c25016e == this || c25016e == null) {
            return;
        }
        int i13 = this.f98022s0 + 1;
        C25016e[] c25016eArr = this.f98021r0;
        if (i13 > c25016eArr.length) {
            this.f98021r0 = (C25016e[]) Arrays.copyOf(c25016eArr, c25016eArr.length * 2);
        }
        C25016e[] c25016eArr2 = this.f98021r0;
        int i14 = this.f98022s0;
        c25016eArr2[i14] = c25016e;
        this.f98022s0 = i14 + 1;
    }

    /* JADX INFO: renamed from: W */
    public final void m73473W(int i13, ArrayList arrayList, C26259o c26259o) {
        for (int i14 = 0; i14 < this.f98022s0; i14++) {
            c26259o.m77935a(this.f98021r0[i14]);
        }
        for (int i15 = 0; i15 < this.f98022s0; i15++) {
            AbstractC35785b.m113421p(this.f98021r0[i15], i13, arrayList, c26259o);
        }
    }

    /* JADX INFO: renamed from: X */
    public void mo73474X() {
    }
}

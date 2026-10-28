package io;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p087db.C11858k0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18741c implements InterfaceC20035o {

    /* JADX INFO: renamed from: a */
    public final C32766w0 f73629a;

    /* JADX INFO: renamed from: b */
    public final int f73630b;

    /* JADX INFO: renamed from: c */
    public final int[] f73631c;

    /* JADX INFO: renamed from: d */
    public final C31521c0[] f73632d;

    /* JADX INFO: renamed from: e */
    public final long[] f73633e;

    /* JADX INFO: renamed from: f */
    public int f73634f;

    public AbstractC18741c(C32766w0 c32766w0, int[] iArr) {
        int i13 = 0;
        AbstractC24543a.m71573i(iArr.length > 0);
        c32766w0.getClass();
        this.f73629a = c32766w0;
        int length = iArr.length;
        this.f73630b = length;
        this.f73632d = new C31521c0[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            this.f73632d[i14] = c32766w0.f136262y[iArr[i14]];
        }
        Arrays.sort(this.f73632d, new C11858k0(7));
        this.f73631c = new int[this.f73630b];
        while (true) {
            int i15 = this.f73630b;
            if (i13 >= i15) {
                this.f73633e = new long[i15];
                return;
            } else {
                this.f73631c[i13] = c32766w0.m102757a(this.f73632d[i13]);
                i13++;
            }
        }
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: a */
    public void mo54490a() {
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: b */
    public void mo54491b() {
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: d */
    public final C31521c0 mo54499d(int i13) {
        return this.f73632d[i13];
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: e */
    public final int mo54500e(int i13) {
        return this.f73631c[i13];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC18741c abstractC18741c = (AbstractC18741c) obj;
            if (this.f73629a == abstractC18741c.f73629a && Arrays.equals(this.f73631c, abstractC18741c.f73631c)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: f */
    public void mo54493f(float f13) {
    }

    public final int hashCode() {
        if (this.f73634f == 0) {
            this.f73634f = Arrays.hashCode(this.f73631c) + (System.identityHashCode(this.f73629a) * 31);
        }
        return this.f73634f;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: i */
    public final int mo54501i(int i13) {
        for (int i14 = 0; i14 < this.f73630b; i14++) {
            if (this.f73631c[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: j */
    public final C32766w0 mo54502j() {
        return this.f73629a;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: l */
    public int mo54495l(long j7, List list) {
        return list.size();
    }

    @Override // io.InterfaceC20035o
    public final int length() {
        return this.f73631c.length;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: m */
    public final int mo54503m() {
        return this.f73631c[mo54492c()];
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: n */
    public final C31521c0 mo54504n() {
        return this.f73632d[mo54492c()];
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: r */
    public final boolean mo54505r(int i13, long j7) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo54506s = mo54506s(i13, jElapsedRealtime);
        int i14 = 0;
        while (i14 < this.f73630b && !zMo54506s) {
            zMo54506s = (i14 == i13 || mo54506s(i14, jElapsedRealtime)) ? false : true;
            i14++;
        }
        if (!zMo54506s) {
            return false;
        }
        long[] jArr = this.f73633e;
        long j13 = jArr[i13];
        int i15 = AbstractC24567y.f95875a;
        long j14 = jElapsedRealtime + j7;
        if (((j7 ^ j14) & (jElapsedRealtime ^ j14)) < 0) {
            j14 = Long.MAX_VALUE;
        }
        jArr[i13] = Math.max(j13, j14);
        return true;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: s */
    public final boolean mo54506s(int i13, long j7) {
        return this.f73633e[i13] > j7;
    }
}

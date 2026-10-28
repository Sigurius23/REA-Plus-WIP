package p361o9;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p318m3.C24977g;
import p516u8.C34610p;
import p516u8.C34611p0;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: o9.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27663c implements InterfaceC27679s {

    /* JADX INFO: renamed from: a */
    public final C34611p0 f111331a;

    /* JADX INFO: renamed from: b */
    public final int f111332b;

    /* JADX INFO: renamed from: c */
    public final int[] f111333c;

    /* JADX INFO: renamed from: d */
    public final C34610p[] f111334d;

    /* JADX INFO: renamed from: e */
    public final long[] f111335e;

    /* JADX INFO: renamed from: f */
    public int f111336f;

    public AbstractC27663c(C34611p0 c34611p0, int[] iArr) {
        AbstractC35849g.m113807i(iArr.length > 0);
        c34611p0.getClass();
        C34610p[] c34610pArr = c34611p0.f145799d;
        this.f111331a = c34611p0;
        int length = iArr.length;
        this.f111332b = length;
        this.f111334d = new C34610p[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f111334d[i13] = c34610pArr[iArr[i13]];
        }
        Arrays.sort(this.f111334d, new C24977g(4));
        this.f111333c = new int[this.f111332b];
        int i14 = 0;
        while (true) {
            int i15 = this.f111332b;
            if (i14 >= i15) {
                this.f111335e = new long[i15];
                return;
            }
            int[] iArr2 = this.f111333c;
            C34610p c34610p = this.f111334d[i14];
            int i16 = 0;
            while (true) {
                if (i16 >= c34610pArr.length) {
                    i16 = -1;
                    break;
                } else if (c34610p == c34610pArr[i16]) {
                    break;
                } else {
                    i16++;
                }
            }
            iArr2[i14] = i16;
            i14++;
        }
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: a */
    public void mo68069a() {
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: b */
    public void mo68070b() {
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: d */
    public final C34610p mo68072d(int i13) {
        return this.f111334d[i13];
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: e */
    public final int mo68073e(int i13) {
        return this.f111333c[i13];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC27663c abstractC27663c = (AbstractC27663c) obj;
            if (this.f111331a.equals(abstractC27663c.f111331a) && Arrays.equals(this.f111333c, abstractC27663c.f111333c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: f */
    public void mo68074f(float f13) {
    }

    public final int hashCode() {
        if (this.f111336f == 0) {
            this.f111336f = Arrays.hashCode(this.f111333c) + (System.identityHashCode(this.f111331a) * 31);
        }
        return this.f111336f;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: i */
    public final int mo68077i(int i13) {
        for (int i14 = 0; i14 < this.f111332b; i14++) {
            if (this.f111333c[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: j */
    public final C34611p0 mo68078j() {
        return this.f111331a;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: k */
    public final void mo68079k(boolean z4) {
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: l */
    public int mo68080l(long j7, List list) {
        return list.size();
    }

    @Override // p361o9.InterfaceC27679s
    public final int length() {
        return this.f111333c.length;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: m */
    public final int mo68081m() {
        return this.f111333c[mo68071c()];
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: n */
    public final C34610p mo68082n() {
        return this.f111334d[mo68071c()];
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: q */
    public final boolean mo68085q(int i13, long j7) {
        return this.f111335e[i13] > j7;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: s */
    public final int mo68087s(C34610p c34610p) {
        for (int i13 = 0; i13 < this.f111332b; i13++) {
            if (this.f111334d[i13] == c34610p) {
                return i13;
            }
        }
        return -1;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: t */
    public final boolean mo68088t(int i13, long j7) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo68085q = mo68085q(i13, jElapsedRealtime);
        int i14 = 0;
        while (i14 < this.f111332b && !zMo68085q) {
            zMo68085q = (i14 == i13 || mo68085q(i14, jElapsedRealtime)) ? false : true;
            i14++;
        }
        if (!zMo68085q) {
            return false;
        }
        long[] jArr = this.f111335e;
        long j13 = jArr[i13];
        int i15 = AbstractC38065t.f163031a;
        long j14 = jElapsedRealtime + j7;
        if (((j7 ^ j14) & (jElapsedRealtime ^ j14)) < 0) {
            j14 = Long.MAX_VALUE;
        }
        jArr[i13] = Math.max(j13, j14);
        return true;
    }
}

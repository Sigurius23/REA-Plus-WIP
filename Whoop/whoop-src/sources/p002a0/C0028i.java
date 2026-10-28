package p002a0;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import m83.AbstractC25260n;
import p441qx.C30712g0;

/* JADX INFO: renamed from: a0.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0028i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69a;

    /* JADX INFO: renamed from: b */
    public int f70b;

    /* JADX INFO: renamed from: c */
    public int f71c;

    /* JADX INFO: renamed from: d */
    public int f72d;

    /* JADX INFO: renamed from: e */
    public Object f73e;

    public /* synthetic */ C0028i(int i13) {
        this.f69a = i13;
    }

    /* JADX INFO: renamed from: a */
    public void m67a(C30712g0 c30712g0) {
        c30712g0.f126468y = null;
        c30712g0.f126466w = null;
        c30712g0.f126467x = null;
        c30712g0.f126465I = 1;
        int i13 = this.f70b;
        if (i13 > 0) {
            int i14 = this.f72d;
            if ((i14 & 1) == 0) {
                this.f72d = i14 + 1;
                this.f70b = i13 - 1;
                this.f71c++;
            }
        }
        c30712g0.f126466w = (C30712g0) this.f73e;
        this.f73e = c30712g0;
        int i15 = this.f72d;
        int i16 = i15 + 1;
        this.f72d = i16;
        int i17 = this.f70b;
        if (i17 > 0 && (i16 & 1) == 0) {
            this.f72d = i15 + 2;
            this.f70b = i17 - 1;
            this.f71c++;
        }
        int i18 = 4;
        while (true) {
            int i19 = i18 - 1;
            if ((this.f72d & i19) != i19) {
                return;
            }
            int i24 = this.f71c;
            if (i24 == 0) {
                C30712g0 c30712g1 = (C30712g0) this.f73e;
                C30712g0 c30712g2 = c30712g1.f126466w;
                C30712g0 c30712g3 = c30712g2.f126466w;
                c30712g2.f126466w = c30712g3.f126466w;
                this.f73e = c30712g2;
                c30712g2.f126467x = c30712g3;
                c30712g2.f126468y = c30712g1;
                c30712g2.f126465I = c30712g1.f126465I + 1;
                c30712g3.f126466w = c30712g2;
                c30712g1.f126466w = c30712g2;
            } else if (i24 == 1) {
                C30712g0 c30712g4 = (C30712g0) this.f73e;
                C30712g0 c30712g5 = c30712g4.f126466w;
                this.f73e = c30712g5;
                c30712g5.f126468y = c30712g4;
                c30712g5.f126465I = c30712g4.f126465I + 1;
                c30712g4.f126466w = c30712g5;
                this.f71c = 0;
            } else if (i24 == 2) {
                this.f71c = 0;
            }
            i18 *= 2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m68b(int i13) {
        int[] iArr = (int[]) this.f73e;
        int i14 = this.f71c;
        iArr[i14] = i13;
        int i15 = this.f72d & (i14 + 1);
        this.f71c = i15;
        int i16 = this.f70b;
        if (i15 == i16) {
            int length = iArr.length;
            int i17 = length - i16;
            int i18 = length << 1;
            if (i18 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i18];
            AbstractC25260n.m74064e0(0, i16, iArr, iArr2, length);
            AbstractC25260n.m74064e0(i17, 0, (int[]) this.f73e, iArr2, this.f70b);
            this.f73e = iArr2;
            this.f70b = 0;
            this.f71c = length;
            this.f72d = i18 - 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m69c() {
        return this.f72d - this.f71c;
    }

    /* JADX INFO: renamed from: d */
    public long m70d() {
        int i13 = this.f71c;
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f73e;
        int i14 = this.f70b;
        long j7 = jArr[i14];
        this.f70b = this.f72d & (i14 + 1);
        this.f71c = i13 - 1;
        return j7;
    }

    public String toString() {
        switch (this.f69a) {
            case 2:
                return "";
            default:
                return super.toString();
        }
    }

    public C0028i(int i13, int i14, float[] fArr, int i15) {
        this.f69a = 1;
        this.f70b = i13;
        this.f71c = i14;
        this.f73e = new ArrayList();
        for (float f13 : fArr) {
            ((ArrayList) this.f73e).add(Float.valueOf(f13));
        }
        this.f72d = i15;
    }

    public C0028i() {
        this.f69a = 0;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f72d = iHighestOneBit - 1;
        this.f73e = new int[iHighestOneBit];
    }
}

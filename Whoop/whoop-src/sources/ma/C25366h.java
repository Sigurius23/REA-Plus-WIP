package ma;

import p499t9.C33625d0;
import p499t9.C33629f0;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ma.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C25366h implements InterfaceC25364f {

    /* JADX INFO: renamed from: a */
    public final long f99420a;

    /* JADX INFO: renamed from: b */
    public final int f99421b;

    /* JADX INFO: renamed from: c */
    public final long f99422c;

    /* JADX INFO: renamed from: d */
    public final int f99423d;

    /* JADX INFO: renamed from: e */
    public final long f99424e;

    /* JADX INFO: renamed from: f */
    public final long f99425f;

    /* JADX INFO: renamed from: g */
    public final long[] f99426g;

    public C25366h(long j7, int i13, long j13, int i14, long j14, long[] jArr) {
        this.f99420a = j7;
        this.f99421b = i13;
        this.f99422c = j13;
        this.f99423d = i14;
        this.f99424e = j14;
        this.f99426g = jArr;
        this.f99425f = j14 != -1 ? j7 + j14 : -1L;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: a */
    public final long mo74415a(long j7) {
        long j13 = j7 - this.f99420a;
        if (!mo8509e() || j13 <= this.f99421b) {
            return 0L;
        }
        long[] jArr = this.f99426g;
        AbstractC35849g.m113808j(jArr);
        double d3 = (j13 * 256.0d) / this.f99424e;
        int iM121911d = AbstractC38065t.m121911d(jArr, (long) d3, true);
        long j14 = this.f99422c;
        long j15 = (((long) iM121911d) * j14) / 100;
        long j16 = jArr[iM121911d];
        int i13 = iM121911d + 1;
        long j17 = (j14 * ((long) i13)) / 100;
        long j18 = iM121911d == 99 ? 256L : jArr[i13];
        return Math.round((j16 == j18 ? 0.0d : (d3 - j16) / (j18 - j16)) * (j17 - j15)) + j15;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        double d3;
        double d14;
        boolean zMo8509e = mo8509e();
        int i13 = this.f99421b;
        long j13 = this.f99420a;
        if (!zMo8509e) {
            C33629f0 c33629f0 = new C33629f0(0L, j13 + ((long) i13));
            return new C33625d0(c33629f0, c33629f0);
        }
        long jM121915h = AbstractC38065t.m121915h(j7, 0L, this.f99422c);
        double d15 = (jM121915h * 100.0d) / this.f99422c;
        double d16 = 0.0d;
        if (d15 <= 0.0d) {
            d3 = 256.0d;
        } else if (d15 >= 100.0d) {
            d3 = 256.0d;
            d16 = 256.0d;
        } else {
            int i14 = (int) d15;
            long[] jArr = this.f99426g;
            AbstractC35849g.m113808j(jArr);
            double d17 = jArr[i14];
            if (i14 == 99) {
                d3 = 256.0d;
                d14 = 256.0d;
            } else {
                d3 = 256.0d;
                d14 = jArr[i14 + 1];
            }
            d16 = ((d14 - d17) * (d15 - ((double) i14))) + d17;
        }
        long j14 = this.f99424e;
        C33629f0 c33629f1 = new C33629f0(jM121915h, j13 + AbstractC38065t.m121915h(Math.round((d16 / d3) * j14), i13, j14 - 1));
        return new C33625d0(c33629f1, c33629f1);
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: d */
    public final long mo74416d() {
        return this.f99425f;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return this.f99426g != null;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f99422c;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: k */
    public final int mo74417k() {
        return this.f99423d;
    }
}

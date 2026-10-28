package p241j3;

import p002a0.AbstractC0052t;
import p002a0.C0023g0;

/* JADX INFO: renamed from: j3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21268e {

    /* JADX INFO: renamed from: a */
    public final C0023g0 f81208a;

    /* JADX INFO: renamed from: b */
    public C21267d f81209b;

    /* JADX INFO: renamed from: c */
    public long f81210c;

    /* JADX INFO: renamed from: d */
    public long f81211d;

    /* JADX INFO: renamed from: e */
    public long f81212e;

    /* JADX INFO: renamed from: f */
    public long f81213f;

    /* JADX INFO: renamed from: g */
    public float[] f81214g;

    public C21268e() {
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        this.f81208a = new C0023g0();
        this.f81210c = -1L;
        this.f81211d = 0L;
        this.f81212e = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m59679a(C21267d c21267d, long j7, long j13, float[] fArr, long j14) {
        long j15 = c21267d.f81206g;
        if (j14 - j15 > 0 || j15 == Long.MIN_VALUE) {
            c21267d.f81206g = j14;
            c21267d.m59677a(c21267d.f81204e, c21267d.f81205f, j7, j13, fArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m59680b(C21267d c21267d, long j7, long j13, long j14) {
        long j15 = c21267d.f81206g;
        boolean z4 = j14 - j15 >= 0 || j15 == Long.MIN_VALUE;
        c21267d.f81204e = j7;
        c21267d.f81205f = j13;
        if (z4) {
            c21267d.f81206g = j14;
            c21267d.m59677a(j7, j13, this.f81211d, this.f81212e, this.f81214g);
        }
    }
}

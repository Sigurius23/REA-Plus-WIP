package cn;

import p588wm.C37373o;
import p588wm.C37375q;
import p588wm.InterfaceC37374p;

/* JADX INFO: renamed from: cn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C4839a implements InterfaceC4844f, InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final long f20098a;

    /* JADX INFO: renamed from: b */
    public final long f20099b;

    /* JADX INFO: renamed from: c */
    public final int f20100c;

    /* JADX INFO: renamed from: d */
    public final long f20101d;

    /* JADX INFO: renamed from: e */
    public final int f20102e;

    /* JADX INFO: renamed from: f */
    public final long f20103f;

    /* JADX INFO: renamed from: g */
    public final boolean f20104g;

    public C4839a(long j7, long j13, int i13, int i14, boolean z4) {
        this.f20098a = j7;
        this.f20099b = j13;
        this.f20100c = i14 == -1 ? 1 : i14;
        this.f20102e = i13;
        this.f20104g = z4;
        if (j7 == -1) {
            this.f20101d = -1L;
            this.f20103f = -9223372036854775807L;
        } else {
            long j14 = j7 - j13;
            this.f20101d = j14;
            this.f20103f = (Math.max(0L, j14) * 8000000) / ((long) i13);
        }
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: a */
    public final long mo15415a(long j7) {
        return (Math.max(0L, j7 - this.f20099b) * 8000000) / ((long) this.f20102e);
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        long j13 = this.f20101d;
        long j14 = this.f20099b;
        if (j13 == -1 && !this.f20104g) {
            C37375q c37375q = new C37375q(0L, j14);
            return new C37373o(c37375q, c37375q);
        }
        int i13 = this.f20102e;
        long j15 = this.f20100c;
        long jMin = (((((long) i13) * j7) / 8000000) / j15) * j15;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - j15);
        }
        long jMax = Math.max(jMin, 0L) + j14;
        long jMax2 = (Math.max(0L, jMax - j14) * 8000000) / ((long) i13);
        C37375q c37375q2 = new C37375q(jMax2, jMax);
        if (j13 != -1 && jMax2 < j7) {
            long j16 = jMax + j15;
            if (j16 < this.f20098a) {
                return new C37373o(c37375q2, new C37375q((Math.max(0L, j16 - j14) * 8000000) / ((long) i13), j16));
            }
        }
        return new C37373o(c37375q2, c37375q2);
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: d */
    public final long mo15416d() {
        return -1L;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return this.f20101d != -1 || this.f20104g;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f20103f;
    }
}

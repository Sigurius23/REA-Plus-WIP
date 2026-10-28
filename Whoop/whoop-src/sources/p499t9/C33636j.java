package p499t9;

/* JADX INFO: renamed from: t9.j */
/* JADX INFO: loaded from: classes5.dex */
public class C33636j implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final long f140391a;

    /* JADX INFO: renamed from: b */
    public final long f140392b;

    /* JADX INFO: renamed from: c */
    public final int f140393c;

    /* JADX INFO: renamed from: d */
    public final long f140394d;

    /* JADX INFO: renamed from: e */
    public final int f140395e;

    /* JADX INFO: renamed from: f */
    public final long f140396f;

    /* JADX INFO: renamed from: g */
    public final boolean f140397g;

    public C33636j(long j7, long j13, int i13, int i14, boolean z4) {
        this.f140391a = j7;
        this.f140392b = j13;
        this.f140393c = i14 == -1 ? 1 : i14;
        this.f140395e = i13;
        this.f140397g = z4;
        if (j7 == -1) {
            this.f140394d = -1L;
            this.f140396f = -9223372036854775807L;
        } else {
            long j14 = j7 - j13;
            this.f140394d = j14;
            this.f140396f = (Math.max(0L, j14) * 8000000) / ((long) i13);
        }
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        long j13 = this.f140394d;
        long j14 = this.f140392b;
        if (j13 == -1 && !this.f140397g) {
            C33629f0 c33629f0 = new C33629f0(0L, j14);
            return new C33625d0(c33629f0, c33629f0);
        }
        int i13 = this.f140395e;
        long j15 = this.f140393c;
        long jMin = (((((long) i13) * j7) / 8000000) / j15) * j15;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - j15);
        }
        long jMax = Math.max(jMin, 0L) + j14;
        long jMax2 = (Math.max(0L, jMax - j14) * 8000000) / ((long) i13);
        C33629f0 c33629f1 = new C33629f0(jMax2, jMax);
        if (j13 != -1 && jMax2 < j7) {
            long j16 = jMax + j15;
            if (j16 < this.f140391a) {
                return new C33625d0(c33629f1, new C33629f0((Math.max(0L, j16 - j14) * 8000000) / ((long) i13), j16));
            }
        }
        return new C33625d0(c33629f1, c33629f1);
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return this.f140394d != -1 || this.f140397g;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f140396f;
    }
}

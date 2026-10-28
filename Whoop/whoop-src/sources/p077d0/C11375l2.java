package p077d0;

/* JADX INFO: renamed from: d0.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11375l2 implements InterfaceC11355g2 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC11363i2 f36464w;

    /* JADX INFO: renamed from: x */
    public final EnumC11408v0 f36465x;

    /* JADX INFO: renamed from: y */
    public final long f36466y;

    /* JADX INFO: renamed from: z */
    public final long f36467z;

    public C11375l2(InterfaceC11363i2 interfaceC11363i2, EnumC11408v0 enumC11408v0, long j7) {
        this.f36464w = interfaceC11363i2;
        this.f36465x = enumC11408v0;
        this.f36466y = ((long) (interfaceC11363i2.mo14112l() + interfaceC11363i2.mo14111i())) * 1000000;
        this.f36467z = j7 * 1000000;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: a */
    public final boolean mo2317a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m30604b(long j7) {
        long j13 = this.f36467z;
        if (j7 + j13 <= 0) {
            return 0L;
        }
        long j14 = j7 + j13;
        long j15 = this.f36466y;
        long j16 = j14 / j15;
        return (this.f36465x == EnumC11408v0.f36577w || j16 % ((long) 2) == 0) ? j14 - (j16 * j15) : ((j16 + 1) * j15) - j14;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: c */
    public final long mo2197c(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC11395r m30605d(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        long j13 = this.f36467z;
        long j14 = j7 + j13;
        long j15 = this.f36466y;
        return j14 > j15 ? this.f36464w.mo2205m(j15 - j13, abstractC11395r, abstractC11395r3, abstractC11395r2) : abstractC11395r2;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public final AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return this.f36464w.mo2202h(m30604b(j7), abstractC11395r, abstractC11395r2, m30605d(j7, abstractC11395r, abstractC11395r3, abstractC11395r2));
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public final AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return this.f36464w.mo2205m(m30604b(j7), abstractC11395r, abstractC11395r2, m30605d(j7, abstractC11395r, abstractC11395r3, abstractC11395r2));
    }
}

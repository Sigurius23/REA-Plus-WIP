package p043c4;

import p026b2.InterfaceC2302h;
import p636y3.C39178j;
import p636y3.C39179k;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: c4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C3947a implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC2302h f16088w;

    /* JADX INFO: renamed from: x */
    public final long f16089x;

    public C3947a(InterfaceC2302h interfaceC2302h, long j7) {
        this.f16088w = interfaceC2302h;
        this.f16089x = j7;
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public final long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        long jMo7156a = this.f16088w.mo7156a(0L, (((long) c39179k.m124798c()) << 32) | (((long) c39179k.m124796a()) & 4294967295L), enumC39181m);
        long jMo7156a2 = this.f16088w.mo7156a(0L, j13, enumC39181m);
        long j14 = (((long) (-((int) (jMo7156a2 >> 32)))) << 32) | (((long) (-((int) (jMo7156a2 & 4294967295L)))) & 4294967295L);
        long j15 = this.f16089x;
        return C39178j.m124794d(C39178j.m124794d(C39178j.m124794d(c39179k.m124797b(), jMo7156a), j14), (((long) ((int) (j15 & 4294967295L))) & 4294967295L) | (((long) (((int) (j15 >> 32)) * (enumC39181m == EnumC39181m.f168423w ? 1 : -1))) << 32));
    }
}

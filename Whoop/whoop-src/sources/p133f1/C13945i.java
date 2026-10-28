package p133f1;

import p026b2.InterfaceC2302h;
import p043c4.InterfaceC3964i0;
import p557vo.AbstractC36220b;
import p636y3.C39178j;
import p636y3.C39179k;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: f1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C13945i implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC2302h f49712w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13957m f49713x;

    /* JADX INFO: renamed from: y */
    public long f49714y = 0;

    public C13945i(InterfaceC2302h interfaceC2302h, InterfaceC13957m interfaceC13957m) {
        this.f49712w = interfaceC2302h;
        this.f49713x = interfaceC13957m;
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public final long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        long jMo39711a = this.f49713x.mo39711a();
        if ((9223372034707292159L & jMo39711a) == 9205357640488583168L) {
            jMo39711a = this.f49714y;
        }
        this.f49714y = jMo39711a;
        return C39178j.m124794d(C39178j.m124794d(c39179k.m124797b(), AbstractC36220b.m115291C(jMo39711a)), this.f49712w.mo7156a(j13, 0L, enumC39181m));
    }
}

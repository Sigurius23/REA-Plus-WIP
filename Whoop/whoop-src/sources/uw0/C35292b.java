package uw0;

import p270k2.InterfaceC22129c;
import p329n0.C26068u;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: uw0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35292b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f150289E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f150290F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f150291G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150292w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f150293x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f150294y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f150295z;

    public /* synthetic */ C35292b(C26068u c26068u, boolean z4, InterfaceC28670t2 interfaceC28670t2, float f13, float f14, long j7, int i13) {
        this.f150292w = i13;
        this.f150293x = c26068u;
        this.f150294y = z4;
        this.f150295z = interfaceC28670t2;
        this.f150289E = f13;
        this.f150290F = f14;
        this.f150291G = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f150292w) {
            case 0:
                return AbstractC35296f.m111977B(this.f150293x, this.f150294y, this.f150295z, this.f150289E, this.f150290F, this.f150291G, (InterfaceC22129c) obj);
            default:
                return AbstractC41069c.m133332B(this.f150293x, this.f150294y, this.f150295z, this.f150289E, this.f150290F, this.f150291G, (InterfaceC22129c) obj);
        }
    }
}

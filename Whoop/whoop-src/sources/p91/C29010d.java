package p91;

import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p91.d */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C29010d implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C39169a f117387E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C29007a f117388F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117389w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f117390x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f117391y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC39104j1 f117392z;

    public /* synthetic */ C29010d(float f13, float f14, AbstractC39104j1 abstractC39104j1, C39169a c39169a, C29007a c29007a, int i13) {
        this.f117389w = i13;
        this.f117390x = f13;
        this.f117391y = f14;
        this.f117392z = abstractC39104j1;
        this.f117387E = c39169a;
        this.f117388F = c29007a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f117389w) {
            case 0:
                return AbstractC29011e.m88152m(this.f117390x, this.f117391y, this.f117392z, this.f117387E, this.f117388F, (AbstractC39101i1) obj);
            default:
                return AbstractC29011e.m88147h(this.f117390x, this.f117391y, this.f117392z, this.f117387E, this.f117388F, (AbstractC39101i1) obj);
        }
    }
}

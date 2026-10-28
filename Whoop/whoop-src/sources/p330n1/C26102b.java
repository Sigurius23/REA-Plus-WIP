package p330n1;

import l83.C23454a0;
import p208i2.AbstractC17911t;
import p208i2.C17920x0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import uz0.AbstractC35413g;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26102b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f103401E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f103402F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103403w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f103404x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f103405y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f103406z;

    public /* synthetic */ C26102b(float f13, float[] fArr, float f14, boolean z4, AbstractC17911t abstractC17911t) {
        this.f103404x = f13;
        this.f103401E = fArr;
        this.f103405y = f14;
        this.f103406z = z4;
        this.f103402F = abstractC17911t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103403w) {
            case 0:
                C26115o c26115o = (C26115o) this.f103401E;
                InterfaceC17869a1 interfaceC17869a1 = (InterfaceC17869a1) this.f103402F;
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                boolean z4 = ((Number) c26115o.f103466a.m30549e()).floatValue() > 0.0f || this.f103406z;
                float fFloatValue = ((Number) c26115o.f103466a.m30549e()).floatValue() * interfaceC17886g0.mo724F(this.f103404x);
                C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                c17920x0.m51550E(fFloatValue - Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L)));
                c17920x0.m51562s(z4 ? c17920x0.f69654S.getDensity() * this.f103405y : 0.0f);
                c17920x0.m51563t(interfaceC17869a1);
                c17920x0.m51554e(true);
                return C23454a0.f92919a;
            default:
                return AbstractC35413g.m112347k(this.f103404x, (float[]) this.f103401E, this.f103405y, this.f103406z, (AbstractC17911t) this.f103402F, (InterfaceC22129c) obj);
        }
    }

    public /* synthetic */ C26102b(C26115o c26115o, boolean z4, float f13, float f14, InterfaceC17869a1 interfaceC17869a1) {
        this.f103401E = c26115o;
        this.f103406z = z4;
        this.f103404x = f13;
        this.f103405y = f14;
        this.f103402F = interfaceC17869a1;
    }
}

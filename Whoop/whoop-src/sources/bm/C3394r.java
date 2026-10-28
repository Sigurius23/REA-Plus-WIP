package bm;

import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import p329n0.C26062o;
import p329n0.InterfaceC26054g;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: bm.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3394r extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13245w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3396t f13246x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3394r(C3396t c3396t, int i13) {
        super(0);
        this.f13245w = i13;
        this.f13246x = c3396t;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM36283m;
        switch (this.f13245w) {
            case 0:
                C3396t c3396t = this.f13246x;
                InterfaceC26054g interfaceC26054gM9768g = c3396t.m9768g();
                if (interfaceC26054gM9768g != null) {
                    C26062o c26062o = (C26062o) interfaceC26054gM9768g;
                    fM36283m = AbstractC12889b.m36283m((-c26062o.m77551n()) / (c3396t.m9770i() + c26062o.m77552o()), -0.5f, 0.5f);
                } else {
                    fM36283m = 0.0f;
                }
                return Float.valueOf(fM36283m);
            default:
                return Integer.valueOf(this.f13246x.f13252a.m77565h().f103180n);
        }
    }
}

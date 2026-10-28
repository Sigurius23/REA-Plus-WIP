package c51;

import p208i2.AbstractC17911t;
import p208i2.InterfaceC17910s0;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22661c0;
import p715kotlin.jvm.internal.C22667f0;

/* JADX INFO: renamed from: c51.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4227d implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f17135E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17136w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f17137x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f17138y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f17139z;

    public /* synthetic */ C4227d(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, C4242s c4242s, float f13) {
        this.f17138y = interfaceC17910s0;
        this.f17139z = abstractC17911t;
        this.f17135E = c4242s;
        this.f17137x = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17136w) {
            case 0:
                return AbstractC4226c.b.m13118h((C22667f0) this.f17138y, (C22661c0) this.f17139z, this.f17137x, (Function1) this.f17135E, ((Long) obj).longValue());
            default:
                return AbstractC4234k.m13142O((InterfaceC17910s0) this.f17138y, (AbstractC17911t) this.f17139z, (C4242s) this.f17135E, this.f17137x, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C4227d(C22667f0 c22667f0, C22661c0 c22661c0, float f13, Function1 function1) {
        this.f17138y = c22667f0;
        this.f17139z = c22661c0;
        this.f17137x = f13;
        this.f17135E = function1;
    }
}

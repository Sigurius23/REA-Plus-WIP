package zq0;

import p181h2.C16617b;
import p208i2.InterfaceC17886g0;
import p390p1.InterfaceC28593a1;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;
import vy0.AbstractC36597y;

/* JADX INFO: renamed from: zq0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C40967h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176821w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f176822x;

    public /* synthetic */ C40967h(Object obj, int i13) {
        this.f176821w = i13;
        this.f176822x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f176821w) {
            case 0:
                return AbstractC40965f.d.m132992e((C22663d0) this.f176822x, (C16617b) obj);
            case 1:
                return AbstractC40965f.m132931C((C40975p) this.f176822x, (InterfaceC17886g0) obj);
            case 2:
                return AbstractC40965f.m132933E((InterfaceC28593a1) this.f176822x, (C39180l) obj);
            case 3:
                return AbstractC40972m.m133021h((C40974o) this.f176822x, (C39180l) obj);
            default:
                return AbstractC40983x.m133089s((Function1) this.f176822x, (AbstractC36597y) obj);
        }
    }
}

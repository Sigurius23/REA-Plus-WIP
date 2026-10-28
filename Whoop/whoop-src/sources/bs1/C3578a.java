package bs1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28690z0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bs1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3578a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14454w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14455x;

    public /* synthetic */ C3578a(Object obj, int i13) {
        this.f14454w = i13;
        this.f14455x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14454w) {
            case 0:
                return Integer.valueOf(AbstractC3587f.m10938i((InterfaceC39171c) this.f14455x, ((Integer) obj).intValue()));
            case 1:
                return AbstractC3583c0.m10820b2((InterfaceC28690z0) this.f14455x, ((Float) obj).floatValue());
            default:
                return AbstractC3583c0.m10788R1((InterfaceC4339a) this.f14455x, ((Boolean) obj).booleanValue());
        }
    }
}

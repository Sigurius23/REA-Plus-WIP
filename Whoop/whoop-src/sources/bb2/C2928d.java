package bb2;

import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28670t2;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import rm1.AbstractC31594h;
import rs2.AbstractC31795a;
import uz1.AbstractC35436n;

/* JADX INFO: renamed from: bb2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C2928d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f11799x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28670t2 f11800y;

    public /* synthetic */ C2928d(float f13, InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f11798w = i13;
        this.f11799x = f13;
        this.f11800y = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11798w) {
            case 0:
                return AbstractC2930f.m8543f(this.f11799x, this.f11800y, (InterfaceC22131e) obj);
            case 1:
                return AbstractC31594h.m97408K(this.f11799x, this.f11800y, (InterfaceC39171c) obj);
            case 2:
                return AbstractC31795a.m98728B(this.f11799x, this.f11800y, (InterfaceC22131e) obj);
            default:
                return AbstractC35436n.m112488q(this.f11799x, this.f11800y, (InterfaceC22131e) obj);
        }
    }
}

package cp0;

import d41.AbstractC11679e;
import l83.C23454a0;
import mh.C25540h;
import o11.AbstractC27406l;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p270k2.InterfaceC22131e;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cp0.v0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11005v0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f34419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f34420y;

    public /* synthetic */ C11005v0(float f13, float f14, int i13) {
        this.f34418w = i13;
        this.f34419x = f13;
        this.f34420y = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34418w) {
            case 0:
                return AbstractC11009x0.m29528u0(this.f34419x, this.f34420y, (InterfaceC39171c) obj);
            case 1:
                return AbstractC11679e.m31099E(this.f34419x, this.f34420y, (C25540h) obj);
            case 2:
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.f9457a = "absoluteOffset";
                C2365d3 c2365d3 = c2404l2.f9459c;
                c2365d3.m7292c(new C39174f(this.f34419x), "x");
                c2365d3.m7292c(new C39174f(this.f34420y), "y");
                return C23454a0.f92919a;
            default:
                return AbstractC27406l.m82643D(this.f34419x, this.f34420y, (InterfaceC22131e) obj);
        }
    }
}

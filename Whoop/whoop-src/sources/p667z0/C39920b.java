package p667z0;

import c93.InterfaceC4339a;
import p025b1.InterfaceC2215f;
import p181h2.C16618c;
import p601x0.C37792c;
import p635y2.InterfaceC39147y;
import p664yy.C39850b0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import yo1.C39689b;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C39920b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172339w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39924f f172340x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2215f f172341y;

    public /* synthetic */ C39920b(C39924f c39924f, InterfaceC2215f interfaceC2215f, int i13) {
        this.f172339w = i13;
        this.f172340x = c39924f;
        this.f172341y = interfaceC2215f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f172339w) {
            case 0:
                C39924f c39924f = this.f172340x;
                C39919a c39919a = c39924f.f172355f;
                C39850b0 c39850b0 = new C39850b0(this.f172341y, 1);
                C22669g0 c22669g0 = new C22669g0();
                c39924f.f172354e.m128204d(new C39689b(7, c22669g0, c39850b0), c39919a, "dataBuilder");
                Object obj = c22669g0.f89336w;
                if (obj != null) {
                    return (C37792c) obj;
                }
                AbstractC22676k.m65757q("result");
                throw null;
            case 1:
                C39924f c39924f2 = this.f172340x;
                C39919a c39919a2 = c39924f2.f172356g;
                C39920b c39920b = new C39920b(c39924f2, this.f172341y, 2);
                C22669g0 c22669g1 = new C22669g0();
                c39924f2.f172354e.m128204d(new C39689b(7, c22669g1, c39920b), c39919a2, "positioner");
                Object obj2 = c22669g1.f89336w;
                if (obj2 != null) {
                    return (C16618c) obj2;
                }
                AbstractC22676k.m65757q("result");
                throw null;
            default:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f172340x.f172352c.invoke();
                return this.f172341y.mo279v0(interfaceC39147y).m47206l(interfaceC39147y.mo3523Z(0L));
        }
    }
}

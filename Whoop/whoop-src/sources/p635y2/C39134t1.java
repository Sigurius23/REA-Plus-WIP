package p635y2;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p005a3.C0230n0;
import p390p1.AbstractC28667t;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: y2.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39134t1 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168273w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39137u1 f168274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39134t1(C39137u1 c39137u1, int i13) {
        super(2);
        this.f168273w = i13;
        this.f168274x = c39137u1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f168273w) {
            case 0:
                this.f168274x.m124665a().f168241x = (AbstractC28667t) obj2;
                break;
            case 1:
                C39115n0 c39115n0M124665a = this.f168274x.m124665a();
                ((C0230n0) obj).m584D0(new C39106k0(c39115n0M124665a, (InterfaceC4351m) obj2, c39115n0M124665a.f168239P));
                break;
            default:
                C0230n0 c0230n0 = (C0230n0) obj;
                C39137u1 c39137u1 = this.f168274x;
                InterfaceC39146x1 interfaceC39146x1 = c39137u1.f168282a;
                C39115n0 c39115n0 = c0230n0.f784f0;
                if (c39115n0 == null) {
                    c39115n0 = new C39115n0(c0230n0, interfaceC39146x1);
                    c0230n0.f784f0 = c39115n0;
                }
                c39137u1.f168283b = c39115n0;
                c39137u1.m124665a().m124643d();
                C39115n0 c39115n0M124665a2 = c39137u1.m124665a();
                if (c39115n0M124665a2.f168242y != interfaceC39146x1) {
                    c39115n0M124665a2.f168242y = interfaceC39146x1;
                    c39115n0M124665a2.m124644g(false);
                    C0230n0.m575v0(c39115n0M124665a2.f168240w, false, 7);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}

package d30;

import c93.InterfaceC4339a;
import ec3.InterfaceC13062m;
import k20.AbstractC22156u;
import l83.C23454a0;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29838w;
import q83.InterfaceC30057d;
import y00.C38915o4;

/* JADX INFO: renamed from: d30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C11550n implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37257w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11564u f37258x;

    public /* synthetic */ C11550n(C11564u c11564u, int i13) {
        this.f37257w = i13;
        this.f37258x = c11564u;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37257w) {
            case 0:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                C11564u c11564u = this.f37258x;
                if (abstractC29840y != null || ((Boolean) ((InterfaceC4339a) c11564u.f37302h.f104635y).invoke()).booleanValue()) {
                    if (((Boolean) c11564u.f37306l.invoke(((abstractC29840y instanceof AbstractC29835t) || (abstractC29840y instanceof C29822i) || (abstractC29840y instanceof C29818g)) ? AbstractC22156u.m63411a(abstractC29840y) : null)).booleanValue()) {
                        c11564u.f37308n.m36570j(abstractC29840y);
                    }
                }
                break;
            case 1:
                if (((C38915o4) obj) == null) {
                    C11564u c11564u2 = this.f37258x;
                    if (c11564u2.f37309o.getValue() instanceof C29838w) {
                        c11564u2.f37308n.m36570j(null);
                    }
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    C11564u c11564u3 = this.f37258x;
                    c11564u3.f37301g.invoke(c11564u3.f37309o.getValue(), Boolean.FALSE);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}

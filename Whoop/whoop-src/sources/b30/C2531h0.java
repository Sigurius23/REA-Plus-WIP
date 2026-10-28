package b30;

import a30.C0314n1;
import c93.InterfaceC4351m;
import e30.AbstractC12605c;
import java.util.List;
import k20.C22136a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: b30.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2531h0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9834w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12605c f9835x;

    public /* synthetic */ C2531h0(AbstractC12605c abstractC12605c, int i13) {
        this.f9834w = i13;
        this.f9835x = abstractC12605c;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9834w) {
            case 0:
                List visiblePaymentMethods = (List) obj;
                List hiddenPaymentMethods = (List) obj2;
                AbstractC22676k.m65750j(visiblePaymentMethods, "visiblePaymentMethods");
                AbstractC22676k.m65750j(hiddenPaymentMethods, "hiddenPaymentMethods");
                AbstractC12605c abstractC12605c = this.f9835x;
                C22136a c22136a = abstractC12605c.f43026x;
                C0314n1 c0314n1 = (C0314n1) abstractC12605c.mo35334r().getValue();
                if (c0314n1 == null || !abstractC12605c.f43003G) {
                    c0314n1 = null;
                }
                c22136a.m63392l(visiblePaymentMethods, hiddenPaymentMethods, c0314n1, false);
                break;
            case 1:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC12605c abstractC12605c2 = this.f9835x;
                if (zBooleanValue) {
                    abstractC12605c2.mo35336u(abstractC29840y);
                } else {
                    abstractC12605c2.m35340z(abstractC29840y);
                }
                return C23454a0.f92919a;
            case 2:
                AbstractC29840y abstractC29840y2 = (AbstractC29840y) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC12605c abstractC12605c3 = this.f9835x;
                if (zBooleanValue2) {
                    abstractC12605c3.mo35336u(abstractC29840y2);
                } else {
                    abstractC12605c3.m35340z(abstractC29840y2);
                }
                return C23454a0.f92919a;
            default:
                List visiblePaymentMethods2 = (List) obj;
                List hiddenPaymentMethods2 = (List) obj2;
                AbstractC22676k.m65750j(visiblePaymentMethods2, "visiblePaymentMethods");
                AbstractC22676k.m65750j(hiddenPaymentMethods2, "hiddenPaymentMethods");
                AbstractC12605c abstractC12605c4 = this.f9835x;
                abstractC12605c4.f43026x.m63392l(visiblePaymentMethods2, hiddenPaymentMethods2, (C0314n1) abstractC12605c4.mo35334r().getValue(), true);
                break;
        }
        return C23454a0.f92919a;
    }
}

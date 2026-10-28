package d30;

import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import v00.C35459c0;
import y00.C38915o4;

/* JADX INFO: renamed from: d30.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11538i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37204w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11564u f37205x;

    public /* synthetic */ C11538i(C11564u c11564u, int i13) {
        this.f37204w = i13;
        this.f37205x = c11564u;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37204w) {
            case 0:
                List paymentMethods = (List) obj;
                C38915o4 c38915o4 = (C38915o4) obj2;
                AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
                C35459c0 c35459c0 = this.f37205x.f37295a;
                if (c38915o4 == null) {
                    c38915o4 = (C38915o4) AbstractC25265s.m74100H0(paymentMethods);
                }
                if (c38915o4 != null) {
                    return AbstractC32411b.m101092e0(c38915o4, c35459c0, null);
                }
                return null;
            case 1:
                List visiblePaymentMethods = (List) obj;
                List hiddenPaymentMethods = (List) obj2;
                AbstractC22676k.m65750j(visiblePaymentMethods, "visiblePaymentMethods");
                AbstractC22676k.m65750j(hiddenPaymentMethods, "hiddenPaymentMethods");
                this.f37205x.f37307m.invoke(visiblePaymentMethods, hiddenPaymentMethods);
                break;
            default:
                String itemCode = (String) obj;
                InterfaceC39147y coordinates = (InterfaceC39147y) obj2;
                AbstractC22676k.m65750j(itemCode, "itemCode");
                AbstractC22676k.m65750j(coordinates, "coordinates");
                this.f37205x.m30997b(new C11573y0(itemCode, coordinates));
                break;
        }
        return C23454a0.f92919a;
    }
}

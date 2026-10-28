package b30;

import ec3.C13045h2;
import ec3.InterfaceC13062m;
import h20.AbstractC16736t0;
import java.util.List;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: b30.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2579n0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10028w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2603q0 f10029x;

    public /* synthetic */ C2579n0(C2603q0 c2603q0, int i13) {
        this.f10028w = i13;
        this.f10029x = c2603q0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        switch (this.f10028w) {
            case 0:
                List list = (List) obj;
                C13045h2 c13045h2 = this.f10029x.f10143p;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C2600p5.m7512a((C2600p5) value, list, null, false, false, false, false, 62)));
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13045h2 c13045h3 = this.f10029x.f10143p;
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C2600p5.m7512a((C2600p5) value2, null, null, zBooleanValue, false, false, false, 59)));
                break;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C13045h2 c13045h4 = this.f10029x.f10143p;
                do {
                    value3 = c13045h4.getValue();
                } while (!c13045h4.m36569i(value3, C2600p5.m7512a((C2600p5) value3, null, null, false, false, zBooleanValue2, false, 47)));
                break;
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C13045h2 c13045h5 = this.f10029x.f10143p;
                do {
                    value4 = c13045h5.getValue();
                } while (!c13045h5.m36569i(value4, C2600p5.m7512a((C2600p5) value4, null, null, false, false, false, zBooleanValue3, 31)));
                break;
            case 4:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                C13045h2 c13045h6 = this.f10029x.f10143p;
                do {
                    value5 = c13045h6.getValue();
                } while (!c13045h6.m36569i(value5, C2600p5.m7512a((C2600p5) value5, null, null, false, zBooleanValue4, false, false, 55)));
                break;
            case 5:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                C13045h2 c13045h7 = this.f10029x.f10142o;
                if (!AbstractC22676k.m65745e(abstractC29840y, c13045h7.getValue())) {
                    c13045h7.m36570j(abstractC29840y);
                }
                break;
            case 6:
                AbstractC16736t0 abstractC16736t0 = (AbstractC16736t0) obj;
                C13045h2 c13045h8 = this.f10029x.f10143p;
                do {
                    value6 = c13045h8.getValue();
                } while (!c13045h8.m36569i(value6, C2600p5.m7512a((C2600p5) value6, null, abstractC16736t0, false, false, false, false, 61)));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    C2603q0 c2603q0 = this.f10029x;
                    c2603q0.f10139l.invoke(c2603q0.f10142o.getValue(), Boolean.FALSE);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}

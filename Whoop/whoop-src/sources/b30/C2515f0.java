package b30;

import a13.C0150h;
import bc3.AbstractC3006f0;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import q20.AbstractC29840y;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s20.C32077a;
import t20.C33333n;

/* JADX INFO: renamed from: b30.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2515f0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2547j0 f9785x;

    public /* synthetic */ C2515f0(C2547j0 c2547j0, int i13) {
        this.f9784w = i13;
        this.f9785x = c2547j0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        switch (this.f9784w) {
            case 0:
                this.f9785x.f9886f.invoke();
                return C23454a0.f92919a;
            case 1:
                String str = (String) obj;
                C2547j0 c2547j0 = this.f9785x;
                C32077a c32077a = (C32077a) c2547j0.f9884d.invoke(str);
                List list = (List) c2547j0.f9885e.invoke(str);
                C33333n c33333n = (C33333n) c2547j0.f9890j.invoke(str);
                C13045h2 c13045h2 = c2547j0.f9897q;
                c13045h2.m36571k(null, C2482b.m7453a((C2482b) c13045h2.getValue(), str, c32077a, list, null, false, c33333n, 242));
                return C23454a0.f92919a;
            case 2:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                C13045h2 c13045h3 = this.f9785x.f9897q;
                c13045h3.m36571k(null, C2482b.m7453a((C2482b) c13045h3.getValue(), null, null, null, abstractC29840y, false, null, 495));
                return C23454a0.f92919a;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13045h2 c13045h4 = this.f9785x.f9897q;
                c13045h4.m36571k(null, C2482b.m7453a((C2482b) c13045h4.getValue(), null, null, null, null, zBooleanValue, null, 479));
                return C23454a0.f92919a;
            default:
                C2547j0 c2547j1 = this.f9785x;
                Object objM8705K = AbstractC3006f0.m8705K(c2547j1.f9892l, new C0150h(c2547j1, null, 3), interfaceC30057d);
                return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
        }
    }
}

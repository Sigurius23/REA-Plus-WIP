package h20;

import ec3.C13045h2;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import q20.AbstractC29840y;
import q20.C29838w;
import q83.InterfaceC30057d;
import r20.C30879q;
import r20.InterfaceC30881s;

/* JADX INFO: renamed from: h20.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16734s4 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16776z4 f64288x;

    public /* synthetic */ C16734s4(C16776z4 c16776z4, int i13) {
        this.f64287w = i13;
        this.f64288x = c16776z4;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64287w) {
            case 0:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                if (abstractC29840y instanceof C29838w) {
                    C16651f c16651f = this.f64288x.f64490i;
                    c16651f.f64020a.m5004e(((C29838w) abstractC29840y).f121955x, "saved_selection");
                }
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    C16776z4 c16776z4 = this.f64288x;
                    if (((Boolean) c16776z4.f64498q.getValue()).booleanValue()) {
                        C13045h2 c13045h2 = c16776z4.f64497p;
                        Boolean bool = Boolean.FALSE;
                        c13045h2.getClass();
                        c13045h2.m36571k(null, bool);
                    }
                }
                break;
            case 2:
                if (((List) obj).isEmpty()) {
                    C16776z4 c16776z5 = this.f64288x;
                    if (((Boolean) c16776z5.f64498q.getValue()).booleanValue()) {
                        C13045h2 c13045h3 = c16776z5.f64497p;
                        Boolean bool2 = Boolean.FALSE;
                        c13045h3.getClass();
                        c13045h3.m36571k(null, bool2);
                    }
                }
                break;
            default:
                if (((InterfaceC30881s) obj) instanceof C30879q) {
                    C13045h2 c13045h4 = this.f64288x.f64497p;
                    Boolean bool3 = Boolean.FALSE;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, bool3);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}

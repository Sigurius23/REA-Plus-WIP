package h20;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import l83.C23454a0;
import p522uf.AbstractC34870c0;
import p715kotlin.NoWhenBranchMatchedException;
import q20.C29824j;
import q20.C29828m;
import t83.C33617b;
import v00.EnumC35491s0;

/* JADX INFO: renamed from: h20.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16742u0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64302w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16754w0 f64303x;

    public /* synthetic */ C16742u0(C16754w0 c16754w0, int i13) {
        this.f64302w = i13;
        this.f64303x = c16754w0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f64302w) {
            case 0:
                C16754w0 c16754w0 = this.f64303x;
                C16703n3 c16703n3 = c16754w0.f43025w.f64417T.f64262x;
                C33617b c33617b = EnumC35491s0.f151074G;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c33617b) {
                    EnumC35491s0 enumC35491s0 = (EnumC35491s0) obj;
                    EnumC16697m3 enumC16697m3 = (EnumC16697m3) c16703n3.f64229w.get(AbstractC34870c0.m109980O(enumC35491s0));
                    int i13 = enumC16697m3 == null ? -1 : AbstractC16748v0.f64316a[enumC16697m3.ordinal()];
                    if (i13 == -1 || i13 == 1) {
                        if (!c16754w0.f64344c0.f64027E || c16703n3.f64230x.get(AbstractC34870c0.m109980O(enumC35491s0)) == EnumC16715p3.f64252x) {
                            arrayList.add(obj);
                        }
                    } else if (i13 == 2) {
                        arrayList.add(obj);
                    } else if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return arrayList;
            case 1:
                C29824j c29824j = C29824j.f121906x;
                C16754w0 c16754w1 = this.f64303x;
                c16754w1.m35340z(c29824j);
                c16754w1.m47264A();
                break;
            default:
                C29828m c29828m = new C29828m(null, null, null, 7);
                C16754w0 c16754w2 = this.f64303x;
                c16754w2.m35340z(c29828m);
                c16754w2.m47264A();
                break;
        }
        return C23454a0.f92919a;
    }
}

package p389p0;

import bc3.AbstractC3006f0;
import p000.AbstractC11266d;
import p163g1.C15051j5;
import p268k0.AbstractC22086a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p0.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28551t0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115519w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28555v0 f115520x;

    public /* synthetic */ C28551t0(C28555v0 c28555v0, int i13) {
        this.f115519w = i13;
        this.f115520x = c28555v0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f115519w) {
            case 0:
                InterfaceC28509b0 interfaceC28509b0 = (InterfaceC28509b0) this.f115520x.f115525O.invoke();
                int itemCount = interfaceC28509b0.getItemCount();
                int i13 = 0;
                while (i13 < itemCount) {
                    if (interfaceC28509b0.mo77532c(i13).equals(obj)) {
                        return Integer.valueOf(i13);
                    }
                    i13++;
                }
                i13 = -1;
                return Integer.valueOf(i13);
            default:
                int iIntValue = ((Integer) obj).intValue();
                C28555v0 c28555v0 = this.f115520x;
                InterfaceC28509b0 interfaceC28509b1 = (InterfaceC28509b0) c28555v0.f115525O.invoke();
                if (iIntValue < 0 || iIntValue >= interfaceC28509b1.getItemCount()) {
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM30466t.append(interfaceC28509b1.getItemCount());
                    sbM30466t.append(')');
                    AbstractC22086a.m63158a(sbM30466t.toString());
                }
                AbstractC3006f0.m8732z(c28555v0.m7158L0(), null, null, new C15051j5(c28555v0, iIntValue, null, 1), 3);
                return Boolean.TRUE;
        }
    }
}

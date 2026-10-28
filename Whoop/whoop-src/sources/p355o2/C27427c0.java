package p355o2;

import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: o2.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C27427c0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110511w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27429d0 f110512x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27427c0(C27429d0 c27429d0, int i13) {
        super(1);
        this.f110511w = i13;
        this.f110512x = c27429d0;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110511w) {
            case 0:
                C27429d0 c27429d0 = this.f110512x;
                c27429d0.f110526d = true;
                c27429d0.f110528f.invoke();
                return C23454a0.f92919a;
            default:
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                C27429d0 c27429d1 = this.f110512x;
                C27424b c27424b = c27429d1.f110524b;
                float f13 = c27429d1.f110533k;
                float f14 = c27429d1.f110534l;
                C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2359w(f13, 0L, f14);
                    c27424b.mo82851a(interfaceC22131e);
                    return C23454a0.f92919a;
                } finally {
                    AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                }
        }
    }
}

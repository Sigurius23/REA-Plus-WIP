package c20;

import l83.C23454a0;
import p537ux.C35323b0;
import p537ux.C35325c0;
import p537ux.C35329e0;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import y00.C38840g6;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: c20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C3875c extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public final Function1 f15860a;

    public C3875c(Function1 paymentRelayStarterFactory) {
        AbstractC22676k.m65750j(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f15860a = paymentRelayStarterFactory;
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) {
        Object c35325c0;
        InterfaceC38802c8 stripeIntent = (InterfaceC38802c8) obj;
        String str = c39857f.f172129x;
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        if (stripeIntent instanceof C38887l3) {
            c35325c0 = new C35323b0((C38887l3) stripeIntent, str);
        } else {
            if (!(stripeIntent instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            c35325c0 = new C35325c0(str, (C38840g6) stripeIntent);
        }
        ((C35329e0) this.f15860a.invoke(c32132a)).mo6700b(c35325c0);
        return C23454a0.f92919a;
    }
}

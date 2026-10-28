package c20;

import com.stripe.android.core.exception.StripeException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p479s4.AbstractC32123d;
import p479s4.AbstractC32126g;
import p537ux.C35321a0;
import p537ux.C35329e0;
import p537ux.C35357s0;
import p664yy.C39857f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import y00.AbstractC38792b8;
import y00.AbstractC38812d8;
import y00.C38782a8;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: c20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3880h extends AbstractC3877e {

    /* JADX INFO: renamed from: b */
    public static final Map f15873b = AbstractC25247g0.m73989X(new C23465k(C38782a8.class, "com.stripe:stripe-wechatpay:22.6.1"));

    /* JADX INFO: renamed from: a */
    public final Function1 f15874a;

    public C3880h(Function1 paymentRelayStarterFactory) {
        AbstractC22676k.m65750j(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f15874a = paymentRelayStarterFactory;
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) {
        StripeException stripeExceptionM100024d;
        InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
        AbstractC38792b8 abstractC38792b8Mo124335m = interfaceC38802c8.mo124335m();
        if (abstractC38792b8Mo124335m != null) {
            Class<?> cls = abstractC38792b8Mo124335m.getClass();
            int i13 = StripeException.f22154E;
            stripeExceptionM100024d = AbstractC32123d.m100024d(new IllegalArgumentException(cls.getSimpleName() + " type is not supported, add " + f15873b.get(cls) + " in build.gradle to support it"));
        } else {
            int i14 = StripeException.f22154E;
            stripeExceptionM100024d = AbstractC32123d.m100024d(new IllegalArgumentException("stripeIntent.nextActionData is null"));
        }
        C35329e0 c35329e0 = (C35329e0) this.f15874a.invoke(c32132a);
        Set set = AbstractC38812d8.f167042a;
        List list = C35357s0.f150612l;
        c35329e0.mo6700b(new C35321a0(stripeExceptionM100024d, AbstractC32126g.m100044i(interfaceC38802c8)));
        return C23454a0.f92919a;
    }
}

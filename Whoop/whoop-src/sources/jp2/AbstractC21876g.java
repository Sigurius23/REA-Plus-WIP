package jp2;

import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: jp2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "shippingAddressItemViewFactory", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21876g {

    /* JADX INFO: renamed from: a */
    private static final C25307p f84474a = Function1.m74306g(new C21875f(0));

    /* JADX INFO: renamed from: b */
    public static final C25307p m62036b() {
        return f84474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m62037c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C21884o.class), new C21877h());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C21874e.class), new C21871b());
        return C23454a0.f92919a;
    }
}

package h02;

import h00.C16513l0;
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

/* JADX INFO: renamed from: h02.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "pdpItemViewFactory", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16568e {

    /* JADX INFO: renamed from: a */
    private static final C25307p f63785a = Function1.m74306g(new C16513l0(1));

    /* JADX INFO: renamed from: b */
    public static final C25307p m46942b() {
        return f63785a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m46943c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C16565c0.class), new C16601y());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16577i0.class), new C16571f0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16588o.class), new C16584m());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16600x.class), new C16598v());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16595s.class), new C16592q());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16564c.class), new C16560a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16591p0.class), new C16585m0());
        return C23454a0.f92919a;
    }
}

package eo2;

import ej1.C13251n;
import fo2.C14663a;
import fo2.C14666d;
import fo2.C14668f;
import fo2.C14670h;
import io2.C20764i;
import io2.C20768k;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import ny0.C27246d;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p736sz0.C33167b1;
import p736sz0.C33233y0;

/* JADX INFO: renamed from: eo2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "c", "()Lm91/p;", "cartItemViewFactory", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13384d {

    /* JADX INFO: renamed from: a */
    private static final C25307p f46853a = Function1.m74306g(new C13251n(27));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m37781b(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C14666d.class), new C14663a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C14670h.class), new C14668f());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C20768k.class), new C20764i());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C27256h.class), new C27246d());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33167b1.class), new C33233y0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public static final C25307p m37782c() {
        return f46853a;
    }
}

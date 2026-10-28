package hp2;

import hb1.C17085h;
import io2.C20751b0;
import io2.C20752c;
import io2.C20762h;
import io2.C20764i;
import io2.C20768k;
import io2.C20774n;
import io2.C20784u;
import io2.C20787x;
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

/* JADX INFO: renamed from: hp2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "receiptItemViewFactory", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17557d {

    /* JADX INFO: renamed from: a */
    private static final C25307p f67973a = Function1.m74306g(new C17085h(17));

    /* JADX INFO: renamed from: b */
    public static final C25307p m49961b() {
        return f67973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m49962c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C20784u.class), new C20774n());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C20768k.class), new C20764i());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C20751b0.class), new C20787x());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C20762h.class), new C20752c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C17556c.class), new C17554a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C17560g.class), new C17558e());
        return C23454a0.f92919a;
    }
}

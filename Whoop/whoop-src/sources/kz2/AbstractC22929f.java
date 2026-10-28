package kz2;

import d11.C11474i;
import h51.C16934f;
import j93.InterfaceC21461d;
import java.util.Map;
import kx1.C22881b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: kz2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "whoopLabsItemViewFactory", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22929f {

    /* JADX INFO: renamed from: a */
    private static final C25307p f90503a = Function1.m74306g(new C22881b(5));

    /* JADX INFO: renamed from: b */
    public static final C25307p m66697b() {
        return f90503a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m66698c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C16934f.class), new C22930g());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C11474i.class), new C22928e());
        return C23454a0.f92919a;
    }
}

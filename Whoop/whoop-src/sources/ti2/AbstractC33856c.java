package ti2;

import i51.C18108e;
import i51.C18112i;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25290b0;
import p720m91.C25292c0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p736sz0.C33188i1;
import p736sz0.C33194k1;
import q71.C30010a;
import q71.C30014e;
import t71.C33572i;
import u21.C34481a;
import xi2.C38323a;
import xi2.C38325c;

/* JADX INFO: renamed from: ti2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "streaksItemViewFactory", "streaks_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33856c {

    /* JADX INFO: renamed from: a */
    private static final C25307p f141790a = Function1.m74306g(new C33572i(11));

    /* JADX INFO: renamed from: b */
    public static final C25307p m107058b() {
        return f141790a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m107059c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C18112i.class), new C18108e());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33194k1.class), new C33188i1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33854a.class), new C38323a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C30014e.class), new C30010a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C25292c0.class), new C25290b0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C34481a.class), new C38325c());
        return C23454a0.f92919a;
    }
}

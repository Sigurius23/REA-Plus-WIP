package ok2;

import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import o72.C27644e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import qk2.C30447c;
import qk2.C30450f;
import qk2.C30452h;
import tk2.C33885c;
import tk2.C33889g;
import tk2.C33897o;
import zk2.C40847h;
import zk2.C40855p;
import zk2.C40863x;

/* JADX INFO: renamed from: ok2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "trackActivityHrZonesDesignItemViewFactory", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28001g {

    /* JADX INFO: renamed from: a */
    private static final C25307p f112918a = Function1.m74306g(new C27644e(15));

    /* JADX INFO: renamed from: b */
    public static final C25307p m84460b() {
        return f112918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m84461c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C28003i.class), new C30452h());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C28002h.class), new C30450f());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C28000f.class), new C30447c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33889g.class), new C40855p());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33897o.class), new C40863x());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C33885c.class), new C40847h());
        return C23454a0.f92919a;
    }
}

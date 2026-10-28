package h01;

import f01.C13842a;
import f01.C13851d;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC42790r;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: h01.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "notificationCardItemViewFactory", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16555v {

    /* JADX INFO: renamed from: a */
    private static final C25307p f63735a = AbstractC42790r.m74325a(new C16554u(0));

    /* JADX INFO: renamed from: b */
    public static final C25307p m46844b() {
        return f63735a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m46845c(C25308q itemViewFactory) {
        AbstractC22676k.m65750j(itemViewFactory, "$this$itemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = itemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C16534a0.class), new C16558y());
        itemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16550q.class), new C16541h());
        itemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C16553t.class), new C16540g());
        itemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C13851d.class), new C13842a());
        return C23454a0.f92919a;
    }
}

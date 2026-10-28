package lk1;

import ik1.C18608e;
import j41.C21314b;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import mk1.C25629a;
import mk1.C25633e;
import nk1.C26796b;
import nk1.C26798d;
import ok1.C27994a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: lk1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "b", "()Lm91/p;", "healthspanItemViewFactory", "healthspan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24493c {

    /* JADX INFO: renamed from: a */
    private static final C25307p f95549a = Function1.m74306g(new C24174a(3));

    /* JADX INFO: renamed from: b */
    public static final C25307p m71286b() {
        return f95549a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m71287c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C27994a.class), new C21314b());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C18608e.class), new C24491a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C25633e.class), new C25629a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C26798d.class), new C26796b());
        return C23454a0.f92919a;
    }
}

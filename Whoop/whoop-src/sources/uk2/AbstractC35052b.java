package uk2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.trackactivity.domain.models.TrackSessionMiniArchModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import u71.C34569c;
import yk2.C39604d;
import yk2.C39605e;

/* JADX INFO: renamed from: uk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "trackSessionMiniArchDesignItemReducer", "Lm91/p;", "b", "Lm91/p;", "f", "()Lm91/p;", "trackSessionMiniArchDesignItemViewFactory", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35052b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f148540a = AbstractC21537c.m60554d(new C34569c(27));

    /* JADX INFO: renamed from: b */
    private static final C25307p f148541b = Function1.m74306g(new C34569c(28));

    /* JADX INFO: renamed from: uk2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f148542w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f148542w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f148542w.invoke((TrackSessionMiniArchModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m110795e() {
        return f148540a;
    }

    /* JADX INFO: renamed from: f */
    public static final C25307p m110796f() {
        return f148541b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m110797g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C34569c(29));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m110798h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrackSessionMiniArchModel.class), new a(new C35051a(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C39605e m110799i(TrackSessionMiniArchModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39605e(model.getId(), model.getSelectedActivityInternalName(), model.getGpsTrackingEnabled(), model.getRestoreSessionDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m110800j(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39605e.class), new C39604d());
        return C23454a0.f92919a;
    }
}

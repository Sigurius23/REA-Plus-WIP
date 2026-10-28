package pw2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.whoopaction.domain.handlers.DownloadActionHandler;
import com.whoop.whoopaction.domain.models.AuthAction;
import com.whoop.whoopaction.domain.models.DownloadAction;
import com.whoop.whoopaction.domain.models.OSAction;
import com.whoop.whoopaction.domain.models.PollingAction;
import com.whoop.whoopaction.domain.models.RefreshScopeAction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import com.whoop.whoopaction.domain.models.StatePushAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import com.whoop.whoopaction.domain.models.UpdateAction;
import fi0.InterfaceC14515a;
import fy1.InterfaceC14871g;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nd1.InterfaceC26584j;
import or2.C28144a0;
import p02.C28589a;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import qf3.C30330b;
import qw2.C30695c;
import qw2.InterfaceC30696d;
import rf3.C31362a;
import rr2.InterfaceC31766c;
import rw2.C31872b;
import rw2.C31873c;
import rw2.C31874d;
import rw2.C31875e;
import rw2.C31876f;
import rw2.C31877g;
import rw2.C31878h;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tw2.C34227d;
import tw2.InterfaceC34226c;
import u02.C34387c;
import uf3.C34911a;
import vf3.C35953c;
import w02.C36684a;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;
import xm0.C38458b;

/* JADX INFO: renamed from: pw2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lpw2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "a", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29590a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m90723d(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "GLOBAL_ACTION_HANDLER_MAP");
        C28589a c28589a = new C28589a(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c28589a, 2)), false);
        C28589a c28589a2 = new C28589a(22);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC34226c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c28589a2, 2)), false);
        C28589a c28589a3 = new C28589a(23);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C30695c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c28589a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final Map m90724e(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C31877g c31877g = new C31877g((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 2, 0 == true ? 1 : 0);
        DefaultConstructorMarker defaultConstructorMarker = null;
        InterfaceC34116n interfaceC34116n = null;
        C23465k c23465k = new C23465k(c22673i0.getOrCreateKotlinClass(UpdateAction.class), new C31878h((C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (C36684a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36684a.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (InterfaceC34226c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34226c.class), null), null, interfaceC34116n, 48, defaultConstructorMarker));
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DownloadAction.class);
        C34387c c34387c = (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null);
        C28144a0 c28144a0 = (C28144a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return AbstractC25247g0.m73990Y(c23465k, new C23465k(orCreateKotlinClass, new DownloadActionHandler(c34387c, c28144a0, clockSystemDefaultZone, interfaceC34116n, 8, defaultConstructorMarker)), new C23465k(c22673i0.getOrCreateKotlinClass(PollingAction.class), new C31874d((C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), null, null, 6, null)), new C23465k(c22673i0.getOrCreateKotlinClass(StateUpdateAction.class), c31877g), new C23465k(c22673i0.getOrCreateKotlinClass(StateClearAction.class), c31877g), new C23465k(c22673i0.getOrCreateKotlinClass(StatePushAction.class), c31877g), new C23465k(c22673i0.getOrCreateKotlinClass(StatePopAction.class), c31877g), new C23465k(c22673i0.getOrCreateKotlinClass(OSAction.class), new C31873c(AbstractC29125c.m88532i(factory), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), null, 4, null)), new C23465k(c22673i0.getOrCreateKotlinClass(ReloadAction.class), new C31876f()), new C23465k(c22673i0.getOrCreateKotlinClass(RefreshScopeAction.class), new C31875e((C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null))), new C23465k(c22673i0.getOrCreateKotlinClass(AuthAction.class), new C31872b((InterfaceC30696d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30696d.class), null), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC34226c m90725f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34227d(AbstractC29125c.m88532i(factory), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C30695c m90726g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("GLOBAL_ACTION_HANDLER_MAP");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30695c((Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953c), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC14871g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, null, null, 112, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m90723d(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}

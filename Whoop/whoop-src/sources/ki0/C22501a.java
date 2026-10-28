package ki0;

import bc3.InterfaceC2994c0;
import com.whoop.appconfiguration.AppConfigurationApi;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.repositories.ActiveSessionChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import ge3.AbstractC15751g;
import iy1.InterfaceC21030c;
import j02.InterfaceC21164r;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import ji0.C21717e;
import ji0.C21719g;
import ji0.InterfaceC21713a;
import ji0.InterfaceC21718f;
import kf1.C22440a;
import kg2.C22458d;
import l83.C23454a0;
import m83.AbstractC25265s;
import nd1.InterfaceC26584j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31365d;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: ki0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lki0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22501a implements InterfaceC26584j {
    /* JADX INFO: renamed from: e */
    private static final C23454a0 m64998e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C22440a c22440a = new C22440a(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C21717e.class);
        C35953c c35953c = C37247a.f159360e;
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass, null, c22440a, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        InterfaceC21461d[] interfaceC21461dArr = {c22673i0.getOrCreateKotlinClass(AppConfigurationRepository.class), c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class)};
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74130h1((Collection) c30330b.f124475f, interfaceC21461dArr);
        for (InterfaceC21461d interfaceC21461d : interfaceC21461dArr) {
            module.m106774b(AbstractC21598x.m60669Y(interfaceC21461d, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        }
        C22440a c22440a2 = new C22440a(15);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC21164r.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c22440a2, 1)), false);
        C22440a c22440a3 = new C22440a(16);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AppConfigurationApi.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c22440a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21717e m64999f(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21717e((InterfaceC21713a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21713a.class), null), AbstractC22502b.f88201a, (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (AppConfigurationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppConfigurationApi.class), null), (ActiveSessionChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActiveSessionChecker.class), null), null, null, null, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC21164r m65000g(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21719g((InterfaceC21718f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final AppConfigurationApi m65001h(C38266c c38266c, C34911a c34911a) {
        return (AppConfigurationApi) ((C29224y0) c38266c.m122602a(new C22458d(5), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(AppConfigurationApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C34911a m65002i() {
        return AbstractC15751g.m44431K(AbstractC22502b.f88201a);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m64998e(c33768a);
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

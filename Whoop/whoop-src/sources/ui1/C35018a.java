package ui1;

import al0.C0967b;
import al0.C0971f;
import android.content.Context;
import androidx.fragment.app.AbstractActivityC1340r0;
import ao1.C1871f;
import bc3.InterfaceC2994c0;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.HealthMonitorRepository;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.health.monitor.medical.domain.model.HeartHealthProfileIneligibleModel;
import com.whoop.health.monitor.medical.domain.model.HeartScreenerIntroModel;
import com.whoop.health.monitor.medical.domain.model.HorizontalDividerModel;
import com.whoop.health.monitor.medical.domain.model.LabradorEnabledCardModel;
import com.whoop.health.monitor.medical.domain.model.LabradorResultModel;
import com.whoop.health.monitor.medical.domain.model.NewFeatureTagModel;
import com.whoop.health.monitor.medical.domain.model.OnboardingCardModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdDetectionModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdMenuItemModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdTileModel;
import com.whoop.service.network.HealthMonitorUsersApiMigrations;
import com.whoop.service.network.UsersApi;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import gp0.C16064a;
import gt0.InterfaceC16183e;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import o02.InterfaceC27353d;
import od1.C27858u;
import or2.C28144a0;
import or2.C28180m;
import org.koin.core.error.DefinitionParameterException;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p92.C29020i;
import pg3.C29224y0;
import qf3.C30330b;
import qk1.InterfaceC30444b;
import rf3.C31362a;
import rm0.C31585c;
import rr2.InterfaceC31766c;
import tf3.C33768a;
import ti1.C33849a;
import tr2.InterfaceC34116n;
import u82.C34648i;
import u91.C34656a;
import uc2.C34761a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vi1.C36061d;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import xi1.C38322b;
import yi1.C39568b;
import yi1.C39571e;
import z82.InterfaceC40188b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ui1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lui1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35018a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f148186c = 8;

    /* JADX INFO: renamed from: d */
    private static final C33768a f148187d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C31585c(), new C35799a());

    static {
        C33768a c33768a = new C33768a();
        m110668o(c33768a);
        f148187d = c33768a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final C39571e m110651A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39571e(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C38322b m110652B(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractActivityC1340r0.class, new StringBuilder("No value found for type '"), '\''));
        }
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) objM110111b, 18), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        InterfaceC27353d interfaceC27353d = (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b2 != null) {
            return new C38322b(interfaceC21159o0, interfaceC27353d, interfaceC14515a, (AbstractC12939a0) objM110111b2);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m110653C(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: renamed from: o */
    private static final C23454a0 m110668o(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C34761a c34761a = new C34761a(11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C16064a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c34761a, 2)), false);
        C34761a c34761a2 = new C34761a(12);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(HealthMonitorUsersApiMigrations.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c34761a2, 2)), false);
        C34761a c34761a3 = new C34761a(13);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(HealthMonitorRepository.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass3, null, c34761a3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false, "samd-model-mapping");
        C34761a c34761a4 = new C34761a(14);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Map.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM53379t, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, c35953cM53379t, c34761a4, 2)), false);
        C34761a c34761a5 = new C34761a(15);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C33849a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c34761a5, 2)), false);
        C34761a c34761a6 = new C34761a(16);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C36061d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c34761a6, 2)), false);
        C34761a c34761a7 = new C34761a(17);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C39568b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c34761a7, 2)), false);
        C34761a c34761a8 = new C34761a(18);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C39571e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c34761a8, 2)), false);
        C34761a c34761a9 = new C34761a(19);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C38322b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass9, null, c34761a9, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C16064a m110669p(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        Object next;
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Context.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Context.class, new StringBuilder("No value found for type '"), '\''));
        }
        Context context = (Context) objM110111b;
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC2994c0)) {
                next = null;
            }
        } while (next == null);
        InterfaceC2994c0 c28180m = (InterfaceC2994c0) next;
        if (c28180m == null) {
            c28180m = new C28180m(null, 1, null);
        }
        InterfaceC2994c0 interfaceC2994c0 = c28180m;
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        return new C16064a((HealthMonitorRepository) viewModel.m122602a(null, c22673i1.getOrCreateKotlinClass(HealthMonitorRepository.class), null), (StringsRepository) viewModel.m122602a(new C0971f(context, 16), c22673i1.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), (C27858u) viewModel.m122602a(null, c22673i1.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C29020i) viewModel.m122602a(new C34656a(23), c22673i1.getOrCreateKotlinClass(C29020i.class), null), (C28144a0) viewModel.m122602a(null, c22673i1.getOrCreateKotlinClass(C28144a0.class), null), (InterfaceC40188b) viewModel.m122602a(null, c22673i1.getOrCreateKotlinClass(InterfaceC40188b.class), null), (InterfaceC16183e) viewModel.m122602a(null, c22673i1.getOrCreateKotlinClass(InterfaceC16183e.class), null), null, interfaceC2994c0, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m110670q(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C34911a m110671r() {
        return AbstractC15751g.m44431K(56);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final HealthMonitorUsersApiMigrations m110672s(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C34656a(24), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(HealthMonitorUsersApiMigrations.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (HealthMonitorUsersApiMigrations) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34911a m110673t() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_HEALTH_MONITOR_USERS_API));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final HealthMonitorRepository m110674u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new HealthMonitorRepository((UsersApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersApi.class), null), (HealthMonitorUsersApiMigrations) single.m122602a(null, c22673i0.getOrCreateKotlinClass(HealthMonitorUsersApiMigrations.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), InterfaceC34116n.INSTANCE.m107848a("HealthMonitorRepository"), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (FileDownloaderApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Map m110675v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("ANF_STATE_CARD", c22673i0.getOrCreateKotlinClass(ShepherdDetectionModel.class)), new C23465k("ECG_ENABLED_CARD", c22673i0.getOrCreateKotlinClass(LabradorEnabledCardModel.class)), new C23465k("ECG_RESULT", c22673i0.getOrCreateKotlinClass(LabradorResultModel.class)), new C23465k("ONBOARDING_CARD", c22673i0.getOrCreateKotlinClass(OnboardingCardModel.class)), new C23465k("PROFILE_INELIGIBLE_CARD", c22673i0.getOrCreateKotlinClass(HeartHealthProfileIneligibleModel.class)), new C23465k("HORIZONTAL_DIVIDER", c22673i0.getOrCreateKotlinClass(HorizontalDividerModel.class)), new C23465k("ANF_TILE", c22673i0.getOrCreateKotlinClass(ShepherdTileModel.class)), new C23465k("MENU_ITEM", c22673i0.getOrCreateKotlinClass(ShepherdMenuItemModel.class)), new C23465k("HEART_SCREENER_INTRO", c22673i0.getOrCreateKotlinClass(HeartScreenerIntroModel.class)), new C23465k("NEW_FEATURE_TAG", c22673i0.getOrCreateKotlinClass(NewFeatureTagModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C33849a m110676w(C38266c viewModel, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC2994c0)) {
                next = null;
            }
        } while (next == null);
        InterfaceC2994c0 c28180m = (InterfaceC2994c0) next;
        if (c28180m == null) {
            c28180m = new C28180m(null, 1, null);
        }
        return new C33849a(c28180m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C36061d m110677x(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "samd-model-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC26834e interfaceC26834e = (InterfaceC26834e) c38266c.m122602a(new C0967b(new C34648i(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null)), 4), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null);
        OnboardingStatusDao onboardingStatusDao = (OnboardingStatusDao) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class), null);
        InterfaceC41070a interfaceC41070a = (InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null);
        InterfaceC30444b interfaceC30444b = (InterfaceC30444b) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C36061d(interfaceC26834e, onboardingStatusDao, interfaceC41070a, null, interfaceC30444b, null, clockSystemUTC, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C34911a m110678y(C34648i c34648i) {
        return AbstractC15751g.m44431K(c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C39568b m110679z(C38266c viewModel, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC2994c0)) {
                next = null;
            }
        } while (next == null);
        InterfaceC2994c0 c28180m = (InterfaceC2994c0) next;
        if (c28180m == null) {
            c28180m = new C28180m(null, 1, null);
        }
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39568b((C36061d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36061d.class), null), (C39571e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39571e.class), null), c28180m);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        return f148187d;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}

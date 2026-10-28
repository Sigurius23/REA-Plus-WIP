package sr2;

import android.net.ConnectivityManager;
import bc3.InterfaceC2994c0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.coaching.sleepcoach.data.network.api.SleepCoachOnboardingApi;
import com.whoop.community.data.network.ChatApi;
import com.whoop.community.data.network.CommunityServiceApi;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.onboarding.OnboardingStatusApi;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.RemoteDataSourceImpl;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.DefaultLanguageDecider;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.service.network.ActivityServiceApi;
import com.whoop.service.network.CommunityApi;
import com.whoop.service.network.ConfigurationApi;
import com.whoop.service.network.CycleMetadataApi;
import com.whoop.service.network.FeatureFlagsApi;
import com.whoop.service.network.LanguageApi;
import com.whoop.service.network.LegacyTeamServiceApi;
import com.whoop.service.network.MembershipApi;
import com.whoop.service.network.MembershipV0Api;
import com.whoop.service.network.MembershipV2Api;
import com.whoop.service.network.NotificationApi;
import com.whoop.service.network.ProfileApiService;
import com.whoop.service.network.RmaServiceApi;
import com.whoop.service.network.UsersApi;
import com.whoop.service.network.UsersPreferenceApi;
import cq0.C11054b;
import e50.C12722a;
import ge3.AbstractC15751g;
import i92.C18262g;
import i92.InterfaceC18260e;
import ih0.AbstractC18489d0;
import in2.C18730b;
import in2.InterfaceC18732d;
import in2.InterfaceC18736h;
import io.sentry.okhttp.C20452d;
import j92.C21434b;
import j92.C21439g;
import j92.C21441i;
import j92.C21443k;
import j92.C21446n;
import j92.C21449q;
import j92.C21454v;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import me3.C25480c;
import mh.AbstractC25543k;
import mh.C25540h;
import mh.C25542j;
import nd1.InterfaceC26584j;
import or2.C28167h1;
import or2.C28169i0;
import or2.InterfaceC28172j0;
import p098dt.AbstractC12350b;
import p195hh.C17280k;
import p195hh.InterfaceC17277h;
import p195hh.InterfaceC17278i;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22677k0;
import p734sl0.C32581a1;
import pf.AbstractC29125c;
import pg3.C29222x0;
import pg3.C29224y0;
import q83.InterfaceC30057d;
import qf3.C30330b;
import qg3.C30354f;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import s52.C32223d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import u82.AbstractC34650k;
import u82.C34644e;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.InterfaceC34803c;
import ud3.InterfaceC34816g0;
import uf3.C34911a;
import vf3.C35953c;
import w82.AbstractC36948a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: sr2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/n;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32932n implements InterfaceC26584j {

    /* JADX INFO: renamed from: sr2.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC17278i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PreferenceHelper f137218a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ DefaultLanguageDecider f137219b;

        public a(PreferenceHelper preferenceHelper, DefaultLanguageDecider defaultLanguageDecider) {
            this.f137218a = preferenceHelper;
            this.f137219b = defaultLanguageDecider;
        }

        @Override // p195hh.InterfaceC17278i
        /* JADX INFO: renamed from: a */
        public final Object mo48922a(InterfaceC17277h interfaceC17277h, InterfaceC30057d<? super AbstractC25543k> interfaceC30057d) {
            C17280k c17280k = (C17280k) interfaceC17277h;
            C25540h c25540hM75122a = C25542j.m75122a(c17280k.f66433d);
            String acceptLanguageHeaderValue = LanguageRepository.INSTANCE.getAcceptLanguageHeaderValue(this.f137218a, this.f137219b);
            C22677k0 c22677k0 = c25540hM75122a.f100087k;
            if (c22677k0 == null) {
                c22677k0 = new C22677k0(2, false);
                c25540hM75122a.f100087k = c22677k0;
            }
            c22677k0.m65761b("Accept-Language", acceptLanguageHeaderValue);
            return c17280k.m48925b(c25540hM75122a.m75117a(), interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: L */
    private static final C23454a0 m103824L(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C32926h c32926h = new C32926h(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C12722a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c32926h, 1)), false);
        C32926h c32926h2 = new C32926h(28);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(MembershipApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c32926h2, 1)), false);
        C32931m c32931m = new C32931m(6);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(UsersApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c32931m, 1)), false);
        C32931m c32931m2 = new C32931m(8);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(CommunityApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c32931m2, 1)), false);
        C32931m c32931m3 = new C32931m(9);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(LegacyTeamServiceApi.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass5, null, c32931m3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false, "retrofitWithRxJava");
        C32931m c32931m4 = new C32931m(10);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C29224y0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, c35953cM53379t, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, c35953cM53379t, c32931m4, 1)), false);
        C32931m c32931m5 = new C32931m(11);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(ProfileApiService.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c32931m5, 1)), false);
        C32931m c32931m6 = new C32931m(12);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(MembershipV2Api.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c32931m6, 1)), false);
        C32931m c32931m7 = new C32931m(13);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c32931m7, 1)), false);
        C32931m c32931m8 = new C32931m(14);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(RemoteDataSource.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c32931m8, 1)), false);
        C32931m c32931m9 = new C32931m(7);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C11054b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, c32931m9, 1)), false);
        C32931m c32931m10 = new C32931m(15);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, null, c32931m10, 1)), false);
        C32931m c32931m11 = new C32931m(16);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(RmaServiceApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass13, null, c32931m11, 1)), false);
        C32931m c32931m12 = new C32931m(17);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(CycleMetadataApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass14, null, c32931m12, 1)), false);
        C32931m c32931m13 = new C32931m(18);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(FeatureFlagsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass15, null, c32931m13, 1)), false);
        C32931m c32931m14 = new C32931m(19);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(ConfigurationApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass16, null, c32931m14, 1)), false);
        C32931m c32931m15 = new C32931m(20);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(ActivityServiceApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c32931m15, 2)), false);
        C32931m c32931m16 = new C32931m(21);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(UsersPreferenceApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c32931m16, 2)), false);
        C32931m c32931m17 = new C32931m(22);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(InterfaceC18736h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass19, null, c32931m17, 1)), false);
        C32926h c32926h3 = new C32926h(27);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C28167h1.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c32926h3, 2)), false);
        C32926h c32926h4 = new C32926h(29);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(ChatApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c32926h4, 2)), false);
        C32931m c32931m18 = new C32931m(0);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(LanguageApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c32931m18, 2)), false);
        C32931m c32931m19 = new C32931m(1);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(SleepCoachOnboardingApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c32931m19, 2)), false);
        C32931m c32931m20 = new C32931m(2);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(NotificationApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c32931m20, 2)), false);
        C32931m c32931m21 = new C32931m(3);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(OnboardingStatusApi.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass25, null, c32931m21, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), false, "coilInterceptor");
        C32931m c32931m22 = new C32931m(4);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(InterfaceC17278i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass26, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass26, c35953cM73385r, c32931m22, 2)), false);
        C32931m c32931m23 = new C32931m(5);
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(MembershipV0Api.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass27, null, c32931m23, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass27, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C12722a m103825M(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC32943y abstractC32943y = (AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null);
        C34644e c34644e = (C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        GsonBuilder gsonBuilderNewBuilder = C28169i0.m85274d().newBuilder();
        AbstractC22676k.m65749i(gsonBuilderNewBuilder, "newBuilder(...)");
        Gson gsonCreate = AbstractC36948a.m118635a(gsonBuilderNewBuilder).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return new C12722a(abstractC32943y, c34644e.m109481a(gsonCreate, AbstractC34650k.m109496c(), AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_MEMBERSHIP_V2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final MembershipApi m103826N(C38266c single, C34911a it) {
        MembershipApi membershipApiM35564e;
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (((FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null)).isFeatureEnabled(FeatureFlagRepositoryKt.KT_SERIALIZATION_MEMBERSHIP_API)) {
            C29222x0 c29222x0 = new C29222x0();
            c29222x0.m88731e((C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")));
            c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl() + "/membership/");
            c29222x0.m88728b(AbstractC34645f.m109482a(AbstractC34650k.m109496c()));
            c29222x0.m88727a(new C30354f());
            membershipApiM35564e = (MembershipApi) c29222x0.m88730d().m88733b(MembershipApi.class);
        } else {
            membershipApiM35564e = ((C12722a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12722a.class), null)).m35564e();
        }
        AbstractC22676k.m65747g(membershipApiM35564e);
        return membershipApiM35564e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C11054b m103827O(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11054b((RemoteDataSource) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(RemoteDataSource.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final InterfaceC18260e m103828P(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Object systemService = AbstractC29125c.m88532i(single).getSystemService((Class<Object>) ConnectivityManager.class);
        if (systemService != null) {
            return new C18262g((ConnectivityManager) systemService, (InterfaceC2994c0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final RmaServiceApi m103829Q(C38266c c38266c, C34911a c34911a) {
        return (RmaServiceApi) ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(RmaServiceApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final CycleMetadataApi m103830R(C38266c c38266c, C34911a c34911a) {
        return (CycleMetadataApi) ((C29224y0) c38266c.m122602a(new C32581a1(27), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(CycleMetadataApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m103831S() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_CYCLE_METADATA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final FeatureFlagsApi m103832T(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C34824k0 c34824k0 = new C34824k0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21449q.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C20452d.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21441i.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21434b.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25480c.class), new C35953c("httpLoggingInterceptor")));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21446n.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21454v.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21439g.class), null));
        InterfaceC34803c authenticator = (InterfaceC34803c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21443k.class), null);
        AbstractC22676k.m65750j(authenticator, "authenticator");
        c34824k0.f146619h = authenticator;
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.f118281a = new C34826l0(c34824k0);
        c29222x0.m88728b(AbstractC34650k.m109497d());
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (FeatureFlagsApi) c29222x0.m88730d().m88733b(FeatureFlagsApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final ConfigurationApi m103833U(C38266c c38266c, C34911a c34911a) {
        return (ConfigurationApi) ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(ConfigurationApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final ActivityServiceApi m103834V(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(ActivityServiceApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (ActivityServiceApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final UsersPreferenceApi m103835W(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32223d(14), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableRetrofitWithRxJava"))).m88733b(UsersPreferenceApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (UsersPreferenceApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C34911a m103836X() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_USERS_PREFERENCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final InterfaceC18736h m103837Y(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return C18730b.f73598a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C28167h1 m103838Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28167h1("5.473.0", 618174);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final UsersApi m103840a0(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(UsersApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (UsersApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final ChatApi m103842b0(C38266c c38266c, C34911a c34911a) {
        return (ChatApi) ((C29224y0) c38266c.m122602a(new C32223d(12), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(ChatApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C34911a m103844c0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-community"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final LanguageApi m103846d0(C38266c c38266c, C34911a c34911a) {
        return (LanguageApi) ((C29224y0) c38266c.m122602a(new C32223d(8), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(LanguageApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C34911a m103848e0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(CoreFeatureFlagsKt.KT_SERIALIZATION_LANGUAGE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final SleepCoachOnboardingApi m103850f0(C38266c c38266c, C34911a c34911a) {
        return (SleepCoachOnboardingApi) ((C29224y0) c38266c.m122602a(new C32581a1(29), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(SleepCoachOnboardingApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C34911a m103852g0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-sleep-coach-onboarding"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final NotificationApi m103854h0(C38266c c38266c, C34911a c34911a) {
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"));
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88727a(new C30354f());
        return (NotificationApi) c29222x0.m88730d().m88733b(NotificationApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final OnboardingStatusApi m103856i0(C38266c c38266c, C34911a c34911a) {
        return (OnboardingStatusApi) ((C29224y0) c38266c.m122602a(new C32223d(10), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(OnboardingStatusApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C34911a m103858j0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_ONBOARDING_STATUS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final InterfaceC17278i m103860k0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new a((PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (DefaultLanguageDecider) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(DefaultLanguageDecider.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final MembershipV0Api m103862l0(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32581a1(28), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(MembershipV0Api.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (MembershipV0Api) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C34911a m103864m0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(OnboardingFeatureFlag.KT_SERIALIZATION_MEMBERSHIP_V0.getFlagName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final CommunityApi m103866n0(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32223d(11), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableRetrofitWithRxJava"))).m88733b(CommunityApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (CommunityApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C34911a m103868o0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-community"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final LegacyTeamServiceApi m103870p0(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32223d(13), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableRetrofitWithRxJava"))).m88733b(LegacyTeamServiceApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (LegacyTeamServiceApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C34911a m103872q0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_LEGACY_TEAM_SERVICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C29224y0 m103874r0(C38266c c38266c, C34911a c34911a) {
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "legacyDefaultRetrofit"));
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88727a(new C30354f());
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final ProfileApiService m103876s0(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32223d(9), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(ProfileApiService.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (ProfileApiService) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C34911a m103878t0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-profile-api-service"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final MembershipV2Api m103880u0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((C12722a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12722a.class), null)).m35565f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final FileDownloaderApi m103882v0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((C12722a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12722a.class), null)).m35563a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final RemoteDataSource m103884w0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new RemoteDataSourceImpl((CommunityApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CommunityApi.class), null), (CommunityServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CommunityServiceApi.class), null), (ConsolePacketsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ConsolePacketsApi.class), null), (LegacyTeamServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LegacyTeamServiceApi.class), null), (ProfileApiService) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ProfileApiService.class), null), (MembershipApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipApi.class), null), (MembershipV2Api) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipV2Api.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), InterfaceC34116n.INSTANCE.m107848a("RemoteDataSourceImpl"), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC28172j0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28172j0.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103824L(c33768a);
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

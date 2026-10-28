package sr2;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.InterfaceC1585g0;
import b83.C2807c;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bh.C3238a;
import bh.InterfaceC3242e;
import c93.InterfaceC4339a;
import ca2.InterfaceC4371k;
import ci2.InterfaceC4733b;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.coaching.sleepcoach.data.network.api.SleepCoachOnboardingApi;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.room.PersistentWhoopDatabase;
import com.whoop.data.local.room.WhoopDatabase;
import com.whoop.data.onboarding.OnboardingStatusApi;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.onboarding.OnboardingStatusInteractor;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.data.repositories.AchievementsRepository;
import com.whoop.data.repositories.CachedDataLanguageRefresher;
import com.whoop.data.repositories.ConfigurationRepositoryImpl;
import com.whoop.data.repositories.DefaultLanguageDecider;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryImpl;
import com.whoop.data.repositories.FeatureFlagRepositoryImplKt;
import com.whoop.data.repositories.JournalRepository;
import com.whoop.data.repositories.LanguageChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.data.repositories.OnboardingRepository;
import com.whoop.data.repositories.SettingsLandingRepository;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.data.repositories.SportsRepository;
import com.whoop.data.repositories.StartActivityRepository;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.data.repositories.StringsRepositoryImpl;
import com.whoop.data.repositories.UserRepository;
import com.whoop.data.repositories.UserStrapsRepository;
import com.whoop.hrZones.network.HrZonesApi;
import com.whoop.membership.reactivationmodal.domain.ReactivationModalApi;
import com.whoop.onboarding.story.domain.network.FeatureEducationApi;
import com.whoop.payments.domain.PaymentsApi;
import com.whoop.realtime.presentation.C9889m;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.service.network.ActivityServiceApi;
import com.whoop.service.network.ConfigurationApi;
import com.whoop.service.network.CycleMetadataApi;
import com.whoop.service.network.FeatureFlagsApi;
import com.whoop.service.network.GpsServiceApi;
import com.whoop.service.network.JournalApi;
import com.whoop.service.network.LanguageApi;
import com.whoop.service.network.MembershipV0Api;
import com.whoop.service.network.MembershipV2Api;
import com.whoop.service.network.NotificationApi;
import com.whoop.service.network.RmaServiceApi;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.store.SessionStore;
import com.whoop.service.timezone.C10023a;
import com.whoop.sleep.coach.data.network.api.SleepCoachApi;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import eq1.C13562a;
import g82.InterfaceC15574a;
import ga0.C15619c;
import ge3.AbstractC15751g;
import ha0.InterfaceC17048a;
import ha0.InterfaceC17052e;
import hi0.AbstractC17303a;
import i92.C18256a;
import ia0.C18292a;
import ih0.AbstractC18489d0;
import in2.C18730b;
import in2.C18734f;
import in2.InterfaceC18732d;
import in2.InterfaceC18736h;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kp0.C22738e;
import l83.C23454a0;
import l83.EnumC23463i;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mi1.InterfaceC25576e;
import n92.InterfaceC26483e;
import nd1.InterfaceC26584j;
import od1.C27840c;
import od1.C27843f;
import od1.C27847j;
import od1.C27853p;
import od1.C27856s;
import od1.C27858u;
import od1.InterfaceC27837a0;
import om0.C28026c;
import op0.C28086d;
import or2.C28162g;
import or2.C28200s1;
import or2.C28205u0;
import or2.InterfaceC28197r1;
import org.koin.core.error.DefinitionParameterException;
import p007a6.InterfaceC0422g;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p92.C29014c;
import p92.C29017f;
import pf.AbstractC29125c;
import pg3.C29224y0;
import q83.AbstractC30060g;
import qf2.C30324c;
import qf2.C30327f;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import rv1.C31842a;
import s52.C32223d;
import se2.C32426d;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tm0.InterfaceC33949a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import u92.C34661e;
import u92.C34662f;
import u92.C34663g;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vr2.C36312e;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;
import y92.C39352a;
import y92.C39353b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sr2.w */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/w;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32941w implements InterfaceC26584j {

    /* JADX INFO: renamed from: sr2.w$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f137230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f137231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f137230w = c38266c;
            this.f137231x = interfaceC35951a;
            this.f137232y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.CachedDataLanguageRefresher, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final CachedDataLanguageRefresher invoke() {
            return this.f137230w.m122602a(this.f137232y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(CachedDataLanguageRefresher.class), this.f137231x);
        }
    }

    /* JADX INFO: renamed from: sr2.w$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f137233w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f137234x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137235y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f137233w = c38266c;
            this.f137234x = interfaceC35951a;
            this.f137235y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            return this.f137233w.m122602a(this.f137235y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), this.f137234x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final DefaultLanguageDecider m103921A0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC28197r1 interfaceC28197r1 = (InterfaceC28197r1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null);
        PreferenceHelper preferenceHelper = (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null);
        String[] ON_FOR_ALL_LANGUAGES = AbstractC17303a.f66507a;
        AbstractC22676k.m65749i(ON_FOR_ALL_LANGUAGES, "ON_FOR_ALL_LANGUAGES");
        return new DefaultLanguageDecider(interfaceC28197r1, preferenceHelper, AbstractC25260n.m74059b1(ON_FOR_ALL_LANGUAGES));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final CachedDataLanguageRefresher m103923B0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        PersistentWhoopDatabase persistentWhoopDatabase = (PersistentWhoopDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null);
        C27856s c27856s = (C27856s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27856s.class), null);
        InterfaceC33949a interfaceC33949a = (InterfaceC33949a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33949a.class), null);
        C37378a c37378a = (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null);
        InterfaceC17048a interfaceC17048aActivitiesDao = persistentWhoopDatabase.activitiesDao();
        InterfaceC17052e interfaceC17052eRecentActivitiesDao = persistentWhoopDatabase.recentActivitiesDao();
        InterfaceC3242e interfaceC3242eM9378a = C3238a.m9378a(AbstractC29125c.m88531h(factory));
        ComponentCallbacks2C4960b componentCallbacks2C4960bM15527c = ComponentCallbacks2C4960b.m15527c(AbstractC29125c.m88531h(factory));
        AbstractC22676k.m65749i(componentCallbacks2C4960bM15527c, "get(...)");
        return new CachedDataLanguageRefresher(c27856s, interfaceC33949a, c37378a, interfaceC17048aActivitiesDao, interfaceC17052eRecentActivitiesDao, interfaceC3242eM9378a, componentCallbacks2C4960bM15527c, (AppConfigurationRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AppConfigurationRepository.class), null), null, null, 768, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C28086d m103925C0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28086d((InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (SleepCoachOnboardingApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachOnboardingApi.class), null), (FeatureEducationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureEducationApi.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final UserRepository m103927D0(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        UsersPreferenceApi usersPreferenceApi = (UsersPreferenceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersPreferenceApi.class), null);
        ActivityServiceApi activityServiceApi = (ActivityServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivityServiceApi.class), null);
        PreferenceHelper preferenceHelper = (PreferenceHelper) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null);
        C27858u c27858u = (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"));
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new UserRepository(applicationM88531h, usersPreferenceApi, activityServiceApi, preferenceHelper, c27858u, interfaceC2994c0, ExecutorC22364d.f87316w, (C10023a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C10023a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C18292a m103929E0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18292a(((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).activitiesDao(), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).recentActivitiesDao(), (ActivitiesApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ActivitiesRepository"), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C32426d m103931F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32426d((SleepCoachApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachApi.class), null), ((PersistentWhoopDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).smartAlarmUserInfoDao(), InterfaceC34116n.INSTANCE.m107848a("TurnoffAlarmWarningInteractor"), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (SmartAlarmApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC25576e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25576e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C13562a m103933G0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13562a((InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("HrZonesRepository"), (HrZonesApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(HrZonesApi.class), null), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).hrZonesDao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final boolean m103935H0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final boolean m103937I0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final FeatureFlagRepositoryImpl m103939J0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new FeatureFlagRepositoryImpl((InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC18736h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18736h.class), null), (FeatureFlagsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagsApi.class), null), ((Boolean) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), new C35953c("featureFlagFetchEnabled"))).booleanValue(), (C34660d) single.m122602a(new C32223d(15), c22673i0.getOrCreateKotlinClass(C34662f.class), null), 0L, (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), AbstractC30060g.m92087G(EnumC23463i.f92933w, new b(single, null, null)), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C34911a m103941K0() {
        return AbstractC15751g.m44431K(FeatureFlagRepositoryImplKt.FEATURE_FLAG_PREFS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C15619c m103943L0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15619c((ActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C18256a m103945M0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18256a((ActivitiesApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (GpsServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(GpsServiceApi.class), null), InterfaceC34116n.INSTANCE.m107848a("CycleWs"), (C15619c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15619c.class), null));
    }

    /* JADX INFO: renamed from: T */
    private static final C23454a0 m103952T(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C32936r c32936r = new C32936r(3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(JournalApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c32936r, 2)), false);
        C32936r c32936r2 = new C32936r(5);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AchievementsRepository.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c32936r2, 1)), false);
        C32936r c32936r3 = new C32936r(17);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C6240b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c32936r3, 1)), false);
        C32936r c32936r4 = new C32936r(29);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C9889m.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c32936r4, 2)), false);
        C32939u c32939u = new C32939u(3);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(UserRepository.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass5, null, c32939u, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false, "featureFlagFetchEnabled");
        C32939u c32939u2 = new C32939u(4);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(Boolean.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass6, c35953cM53379t, c32939u2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, c35953cM53379t, c35953c), false, "configurationValuesFetchEnabled");
        C32939u c32939u3 = new C32939u(5);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(Boolean.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, c35953cM53379t2, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, c35953cM53379t2, c32939u3, 1)), false);
        C32939u c32939u4 = new C32939u(7);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(FeatureFlagRepositoryImpl.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass8, null, c32939u4, 1);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c);
        C31365d c31365d = new C31365d(c30330b);
        module.m106774b(strM60669Y, c31365d, false);
        hashSet.add(c31365d);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31365d.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31365d, true);
        C32939u c32939u5 = new C32939u(8);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C15619c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c32939u5, 2)), false);
        C32939u c32939u6 = new C32939u(9);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C18256a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c32939u6, 1)), false);
        C32936r c32936r5 = new C32936r(14);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C27843f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, c32936r5, 1)), false);
        C32936r c32936r6 = new C32936r(25);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C29017f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c32936r6, 2)), false);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(SessionStore.class), null, new C32939u(6), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31365d(c30330b3), false);
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27853p.class), null, new C32939u(10), 1);
        String strM60669Y2 = AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c);
        C31365d c31365d2 = new C31365d(c30330b4);
        module.m106774b(strM60669Y2, c31365d2, false);
        hashSet.add(c31365d2);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(OnboardingStatusInteractor.class), null, new C32939u(11), 1);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(c30330b5, module, AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(OnboardingStatusChecker.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b6 = c31365dM73383p.f129023a;
        c30330b6.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b6.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b6.f124472c, c30330b6.f124470a), c31365dM73383p, true);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(SettingsLandingRepository.class), null, new C32939u(12), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31365d(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27840c.class), null, new C32939u(13), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(JournalRepository.class), null, new C32939u(14), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31365d(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36312e.class), null, new C32939u(15), 1);
        String strM60669Y3 = AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c);
        C31365d c31365d3 = new C31365d(c30330b10);
        module.m106774b(strM60669Y3, c31365d3, false);
        hashSet.add(c31365d3);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34662f.class), null, new C32936r(4), 2);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(c30330b11, module, AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), false, "incorrectStringsRepo");
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(StringsRepository.class), c35953cM73385r, new C32936r(6), 1);
        C35953c c35953cM53379t3 = AbstractC18489d0.m53379t(c30330b12, module, AbstractC21598x.m60669Y(c30330b12.f124471b, c35953cM73385r, c35953c), false, "stringRepo");
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(StringsRepository.class), c35953cM53379t3, new C32936r(7), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, c35953cM53379t3, c35953c), new C31362a(c30330b13), false);
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29014c.class), null, new C32936r(8), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31365d(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(StartActivityRepository.class), null, new C32936r(9), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31365d(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(OnboardingRepository.class), null, new C32936r(10), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31365d(c30330b16), false);
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27856s.class), null, new C32936r(11), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31365d(c30330b17), false);
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31842a.class), null, new C32936r(12), 1);
        String strM60669Y4 = AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c);
        C31365d c31365d4 = new C31365d(c30330b18);
        module.m106774b(strM60669Y4, c31365d4, false);
        hashSet.add(c31365d4);
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22738e.class), null, new C32936r(13), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(SmartAlarmTriggerRepository.class), null, new C32936r(15), 1);
        String strM60669Y5 = AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c);
        C31365d c31365d5 = new C31365d(c30330b20);
        module.m106774b(strM60669Y5, c31365d5, false);
        hashSet.add(c31365d5);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC4371k.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b21 = c31365d5.f129023a;
        c30330b21.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b21.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b21.f124472c, c30330b21.f124470a), c31365d5, true);
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30327f.class), null, new C32936r(16), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31365d(c30330b22), false);
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(UserStrapsRepository.class), null, new C32936r(18), 1);
        String strM60669Y6 = AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c);
        C31365d c31365d6 = new C31365d(c30330b23);
        module.m106774b(strM60669Y6, c31365d6, false);
        hashSet.add(c31365d6);
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null, new C32936r(19), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31365d(c30330b24), false);
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28205u0.class), null, new C32936r(20), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(SportsRepository.class), null, new C32936r(21), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31365d(c30330b26), false);
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null, new C32936r(22), 1);
        String strM60669Y7 = AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c);
        C31365d c31365d7 = new C31365d(c30330b27);
        module.m106774b(strM60669Y7, c31365d7, false);
        hashSet.add(c31365d7);
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null, new C32936r(23), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null, new C32936r(24), 1);
        String strM60669Y8 = AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c);
        C31365d c31365d8 = new C31365d(c30330b29);
        module.m106774b(strM60669Y8, c31365d8, false);
        hashSet.add(c31365d8);
        InterfaceC21461d clazz4 = c22673i0.getOrCreateKotlinClass(LanguageChecker.class);
        AbstractC22676k.m65750j(clazz4, "clazz");
        C30330b c30330b30 = c31365d8.f129023a;
        c30330b30.f124475f = AbstractC25265s.m74128f1(clazz4, (Collection) c30330b30.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz4, c30330b30.f124472c, c30330b30.f124470a), c31365d8, true);
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(DefaultLanguageDecider.class), null, new C32936r(26), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(CachedDataLanguageRefresher.class), null, new C32936r(27), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28086d.class), null, new C32936r(28), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31365d(c30330b33), false);
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18292a.class), null, new C32939u(0), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), new C31365d(c30330b34), false);
        C30330b c30330b35 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32426d.class), null, new C32939u(1), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.f124471b, null, c35953c), new C31362a(c30330b35), false);
        C30330b c30330b36 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13562a.class), null, new C32939u(2), 1);
        AbstractC11895b.m31980C(c30330b36, module, AbstractC21598x.m60669Y(c30330b36.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final JournalApi m103953U(C38266c c38266c, C34911a c34911a) {
        return (JournalApi) ((C29224y0) c38266c.m122602a(new C32940v(0), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(JournalApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C34911a m103954V() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-journal-repository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final AchievementsRepository m103955W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new AchievementsRepository((InterfaceC34116n) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (RemoteDataSource) single.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C27843f m103956X(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C27843f((C18256a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18256a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C29017f m103957Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29017f(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public static final SessionStore m103958Z(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new SessionStore(null, new C34660d(AbstractC29125c.m88531h(single), "sessions"), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C27853p m103960a0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27853p((SessionStore) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SessionStore.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (InterfaceC26483e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26483e.class), null), (C27847j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null), (C39353b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39353b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final OnboardingStatusInteractor m103962b0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new OnboardingStatusInteractor((InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).onboardingStatusDao(), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (OnboardingStatusApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusApi.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC18736h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18736h.class), null), (C28026c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28026c.class), null), (C39352a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final SettingsLandingRepository m103964c0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new SettingsLandingRepository((MembershipV2Api) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MembershipV2Api.class), null), InterfaceC34116n.INSTANCE.m107848a("SettingsLandingRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C27840c m103966d0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27840c((CycleMetadataApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CycleMetadataApi.class), null), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final JournalRepository m103968e0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new JournalRepository((InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), ((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).journalDao(), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (JournalApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalApi.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C36312e m103970f0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C36312e(AbstractC29125c.m88531h(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C34662f m103972g0(C38266c factory, C34911a params) throws DefinitionParameterException, C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Context contextM88532i = AbstractC29125c.m88532i(factory);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C34662f(contextM88532i, (String) objM110111b, (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C6240b m103974h0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C6240b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final StringsRepository m103976i0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new StringsRepositoryImpl(AbstractC29125c.m88531h(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final StringsRepository m103978j0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return new StringsRepositoryImpl((Context) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Context.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C29014c m103980k0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29014c(((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).gpsDao(), (AppExecutors) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppExecutors.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final StartActivityRepository m103982l0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new StartActivityRepository((C34660d) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final OnboardingRepository m103984m0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("OnboardingRepository");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new OnboardingRepository(interfaceC34116nM107848a, (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (MembershipV0Api) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipV0Api.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C27856s m103986n0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C34661e c34661e = new C34661e(new C34663g(AbstractC29125c.m88531h(single), "sports.db", 1));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27856s(c34661e, (SportsRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SportsRepository.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C31842a m103988o0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C27858u c27858u = (C27858u) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953cM73387t);
        RemoteDataSource remoteDataSource = (RemoteDataSource) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null);
        PreferenceHelper preferenceHelper = (PreferenceHelper) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null);
        return new C31842a(c27858u, remoteDataSource, (MembershipV2Api) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipV2Api.class), null), (RmaServiceApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(RmaServiceApi.class), null), (ReactivationModalApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(ReactivationModalApi.class), null), (PaymentsApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(PaymentsApi.class), null), preferenceHelper, (InterfaceC2994c0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C22738e m103990p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return C22738e.INSTANCE.m65824a(AbstractC29125c.m88532i(factory), (InterfaceC18732d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18732d.class), null), InterfaceC34116n.INSTANCE.m107848a("HighFrequencySyncModeStateHolder"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final SmartAlarmTriggerRepository m103992q0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        SmartAlarmTriggerRepository smartAlarmTriggerRepository = new SmartAlarmTriggerRepository((FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC15574a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC15574a.class), null), InterfaceC34116n.INSTANCE.m107848a("SmartAlarmTriggerRepository"), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (SmartAlarmApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class), null), C18730b.f73598a, C18734f.f73607a, (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).smartAlarmUserInfoDao(), (C30324c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30324c.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C22738e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C22738e.class), null), (AbstractC18377p0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C37378a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (SleepCoachApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SleepCoachApi.class), null), (InterfaceC25576e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25576e.class), null));
        smartAlarmTriggerRepository.start();
        return smartAlarmTriggerRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C30327f m103994r0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30327f((InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).smartAlarmUserInfoDao(), (SmartAlarmApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class), null), (C30324c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30324c.class), null), (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC25576e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25576e.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C9889m m103996s0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C9889m(AbstractC29125c.m88531h(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final UserStrapsRepository m103998t0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new UserStrapsRepository((C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (RemoteDataSource) single.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null), (MembershipV2Api) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MembershipV2Api.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (PreferenceHelper) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final NotificationRepository m104000u0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new NotificationRepository((NotificationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationApi.class), null), InterfaceC34116n.INSTANCE.m107848a("NotificationFactory"), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C28205u0 m104002v0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context contextForLanguage = AbstractC32122c.getContextForLanguage((Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class)));
        AbstractC22676k.m65749i(contextForLanguage, "getContextForLanguage(...)");
        return new C28205u0(contextForLanguage, (LanguageRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final SportsRepository m104004w0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new SportsRepository((ActivityServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivityServiceApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SportsRepository"), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final AbstractC21909c m104006x0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ConfigurationRepositoryImpl((ConfigurationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ConfigurationApi.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), ((PersistentWhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).configurationsDao(), false, ((Boolean) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), new C35953c("configurationValuesFetchEnabled"))).booleanValue(), InterfaceC34116n.INSTANCE.m107848a("ConfigurationRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final InterfaceC28197r1 m104008y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28200s1(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final LanguageRepository m104010z0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        LanguageApi languageApi = (LanguageApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageApi.class), null);
        PreferenceHelper preferenceHelper = (PreferenceHelper) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null);
        C27858u c27858u = (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"));
        String[] TRANSLATION_ARRAY = AbstractC17303a.f66508b;
        AbstractC22676k.m65749i(TRANSLATION_ARRAY, "TRANSLATION_ARRAY");
        Set setM74059b1 = AbstractC25260n.m74059b1(TRANSLATION_ARRAY);
        String[] ON_FOR_ALL_LANGUAGES = AbstractC17303a.f66507a;
        AbstractC22676k.m65749i(ON_FOR_ALL_LANGUAGES, "ON_FOR_ALL_LANGUAGES");
        return new LanguageRepository(languageApi, preferenceHelper, c27858u, setM74059b1, AbstractC25260n.m74059b1(ON_FOR_ALL_LANGUAGES), (InterfaceC28197r1) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null), (C28162g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), null, (InterfaceC1585g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC1585g0.class), new C35953c("appLifecycleOwnerr")), (DefaultLanguageDecider) single.m122602a(null, c22673i0.getOrCreateKotlinClass(DefaultLanguageDecider.class), null), AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(single, null, null)), (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, 4224, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103952T(c33768a);
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

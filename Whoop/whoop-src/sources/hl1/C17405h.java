package hl1;

import ad3.AbstractC0757c;
import al0.C0972g;
import am1.C1004a;
import android.companion.CompanionDeviceManager;
import android.os.Build;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1872g;
import bc3.InterfaceC2994c0;
import bm1.C3421d;
import bm1.C3422e;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import cm1.C4811b;
import com.google.gson.Gson;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageChecker;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.autopop.AutoPopApi;
import com.whoop.home.domain.models.CalibrationTimelineCardModel;
import com.whoop.home.domain.models.ChallengeHomeTileModel;
import com.whoop.home.domain.models.CoachActivityTileModel;
import com.whoop.home.domain.models.CustomAnimationContainerModel;
import com.whoop.home.domain.models.DayOneTransitionWrapperModel;
import com.whoop.home.domain.models.DayOneTransitionWrapperModelV2;
import com.whoop.home.domain.models.DayZeroCardsModel;
import com.whoop.home.domain.models.JournalHomeTileWrapperModel;
import com.whoop.home.domain.models.MciHomeTileModel;
import com.whoop.home.domain.models.NotificationsWrapperModel;
import com.whoop.home.domain.models.NotificationsWrapperModelV2;
import com.whoop.home.domain.models.NotificationsWrapperModelV3;
import com.whoop.home.domain.models.ProgressPlotTileModel;
import com.whoop.home.domain.models.ScoreGaugeStickyModel;
import com.whoop.home.domain.models.WeeklyPlanHomeTileWrapperModel;
import com.whoop.home.domain.models.WelcomeCardModel;
import com.whoop.home.domain.models.WhatToExpectCardModel;
import com.whoop.home.domain.models.dailyoutlook.CoachEntryPointModel;
import com.whoop.home.domain.streaks.api.StreaksHomeApi;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.stealthmode.api.StealthModeApi;
import ct2.C11111c;
import dm1.C12178b;
import dp0.InterfaceC12251g;
import dt0.InterfaceC12362e;
import em1.C13326a0;
import em1.C13347u;
import fi0.InterfaceC14515a;
import fn2.InterfaceC14643c;
import fs1.C14747d;
import ge3.AbstractC15751g;
import gk2.InterfaceC15928c;
import gl1.C15966a;
import gl1.C15967b;
import gl1.C15970e;
import gm1.C15991a;
import gm1.C15995e;
import gm1.C15996f;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16183e;
import hf1.InterfaceC17235b;
import hj0.C17345d;
import hm1.C17424a;
import hm1.C17425b;
import ih0.AbstractC18489d0;
import il1.C18628e;
import il1.C18632i;
import il1.C18635l;
import il1.C18639p;
import il1.C18641r;
import il1.C18646w;
import iy1.InterfaceC21030c;
import j02.InterfaceC21159o0;
import j02.InterfaceC21164r;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import jl1.C21771b;
import js0.AbstractC21909c;
import kl1.C22563c;
import l83.C23454a0;
import l83.C23465k;
import ll1.C24502b;
import ll1.C24503c;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import ml1.C25673b;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nl1.C26813a;
import nm0.InterfaceC26834e;
import o02.InterfaceC27353d;
import ol1.C28016b;
import om1.C28038l;
import or2.C28150c;
import or2.C28162g;
import org.koin.core.error.DefinitionParameterException;
import oz1.C28498a;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32120a;
import p532ur.InterfaceC35173b;
import p710im1.C18662c0;
import p710im1.C18684n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pf.AbstractC29125c;
import pg3.C29222x0;
import pl1.C29350b;
import pm1.C29358c;
import pm1.C29359d;
import pn1.C29380c;
import q92.C30076h;
import qf3.C30330b;
import ql1.C30472c;
import qw2.C30695c;
import rf3.C31362a;
import rf3.C31365d;
import rg1.C31388d;
import rl1.C31511a;
import sl1.C32705d;
import sr2.AbstractC32943y;
import sx1.C33067c;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tl1.C33919c;
import tr2.InterfaceC34116n;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import u92.C34659c;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import ul1.C35064a;
import ul1.C35067d;
import us0.C35210f;
import v82.C35799a;
import vf3.C35953c;
import vh2.InterfaceC36049d;
import vl1.C36104b;
import vv1.C36530a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wl1.C37357c;
import wm0.C37378a;
import xf3.C38266c;
import xl1.C38452b;
import xm1.C38459a;
import y90.C39351a;
import y92.C39352a;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;
import zs0.InterfaceC41076a;

/* JADX INFO: renamed from: hl1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lhl1/h;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17405h implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a(), new C39351a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C34911a m49243A0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C25673b m49245B0(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25673b((InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C17345d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null), (InterfaceC41076a) factory.m122602a(new C17404g(params, 1), c22673i0.getOrCreateKotlinClass(InterfaceC41076a.class), null), (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), Build.VERSION.SDK_INT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C34911a m49247C0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C28016b m49249D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28016b((C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (ActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C35210f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35210f.class), null), (InterfaceC12362e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12362e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C15967b m49251E0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15967b((InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C30076h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C15966a m49253F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15966a((C15967b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C38459a m49255G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38459a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C29358c m49257H0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29358c((C28038l) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28038l.class), null), (C29359d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29359d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C31511a m49259I0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31511a(((C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt(), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C1004a m49261J0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C1004a((C34660d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C18632i m49263K0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18632i((HomeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeApi.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C18628e m49265L0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        HomeApi homeApi = (HomeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeApi.class), null);
        C37378a c37378a = (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C18628e(homeApi, c37378a, interfaceC0422g, (C30472c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30472c.class), null), clockSystemUTC, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C36104b m49267M0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36104b((StealthModeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StealthModeApi.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C33919c m49269N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33919c((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (HomeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeApi.class), null), InterfaceC34116n.INSTANCE.m107848a("DayOneTransitionInteractor"), (C15967b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C4811b m49271O0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4811b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final AutoPopApi m49273P0(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-home"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (AutoPopApi) c29222x0.m88730d().m88733b(AutoPopApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C21771b m49275Q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        AutoPopApi autoPopApi = (AutoPopApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AutoPopApi.class), null);
        InterfaceC34116n interfaceC34116n = (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C21771b(interfaceC0422g, autoPopApi, interfaceC34116n, clockSystemUTC, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C29350b m49277R0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29350b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C15995e m49279S0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15995e((C33067c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C33067c.class), null), (C36530a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36530a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C18635l m49281T0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18635l(clockSystemDefaultZone, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC21164r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21164r.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C15991a m49283U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C15991a(clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C18684n m49285V0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18684n((C38459a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38459a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C15967b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C29359d m49287W0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29359d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C28038l m49289X0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28038l((HomeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HomeApi.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), InterfaceC34116n.INSTANCE.m107848a("DayZeroNotificationCardsInteractor"), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C31388d m49291Y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31388d((InterfaceC16183e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C26813a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26813a.class), null), InterfaceC34116n.INSTANCE.m107848a("FwApiInteractor"), (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C18662c0 m49293Z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("PillarItemActionRouter");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18662c0(interfaceC34116nM107848a, (C18684n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18684n.class), null), (InterfaceC16183e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C18646w m49296a1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18646w((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C17424a m49299b1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17424a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C17401d m49302c1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17401d((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("home-model-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Map m49305d1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("CALIBRATION_TIMELINE", c22673i0.getOrCreateKotlinClass(CalibrationTimelineCardModel.class)), new C23465k("CHALLENGE_HOME_TILE", c22673i0.getOrCreateKotlinClass(ChallengeHomeTileModel.class)), new C23465k("CUSTOM_ANIMATION_CONTAINER", c22673i0.getOrCreateKotlinClass(CustomAnimationContainerModel.class)), new C23465k("DAY_ONE_TRANSITION_ANIMATION", c22673i0.getOrCreateKotlinClass(DayOneTransitionWrapperModel.class)), new C23465k("DAY_ONE_TRANSITION_ANIMATION_V2", c22673i0.getOrCreateKotlinClass(DayOneTransitionWrapperModelV2.class)), new C23465k("DAY_ZERO_CARDS", c22673i0.getOrCreateKotlinClass(DayZeroCardsModel.class)), new C23465k("JOURNAL_HOME_TILE", c22673i0.getOrCreateKotlinClass(JournalHomeTileWrapperModel.class)), new C23465k("MENSTRUAL_INSIGHTS_TILE", c22673i0.getOrCreateKotlinClass(MciHomeTileModel.class)), new C23465k("NOTIFICATIONS_WRAPPER", c22673i0.getOrCreateKotlinClass(NotificationsWrapperModel.class)), new C23465k("NOTIFICATIONS_WRAPPER_V2", c22673i0.getOrCreateKotlinClass(NotificationsWrapperModelV2.class)), new C23465k("NOTIFICATIONS_WRAPPER_V3", c22673i0.getOrCreateKotlinClass(NotificationsWrapperModelV3.class)), new C23465k("PROGRESS_PLOT_TILE", c22673i0.getOrCreateKotlinClass(ProgressPlotTileModel.class)), new C23465k("WELCOME_HOME_CARD", c22673i0.getOrCreateKotlinClass(WelcomeCardModel.class)), new C23465k("WHAT_TO_EXPECT", c22673i0.getOrCreateKotlinClass(WhatToExpectCardModel.class)), new C23465k("COACH_ENTRY_POINT", c22673i0.getOrCreateKotlinClass(CoachEntryPointModel.class)), new C23465k("COACH_ACTIVITY_TILE", c22673i0.getOrCreateKotlinClass(CoachActivityTileModel.class)), new C23465k("SCORE_GAUGE_STICKY", c22673i0.getOrCreateKotlinClass(ScoreGaugeStickyModel.class)), new C23465k("WEEKLYPLAN_WRAPPER", c22673i0.getOrCreateKotlinClass(WeeklyPlanHomeTileWrapperModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C17399b m49308e1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17399b();
    }

    /* JADX INFO: renamed from: f0 */
    private static final C23454a0 m49310f0(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        final int i13 = 0;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        };
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(HomeApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, interfaceC4351m, 2)), false);
        final int i14 = 2;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C13326a0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, interfaceC4351m2, 2)), false);
        final int i15 = 14;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C13347u.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, interfaceC4351m3, 2)), false);
        final int i16 = 26;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C29358c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, interfaceC4351m4, 2)), false);
        final int i17 = 8;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15995e.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m5, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false, "home-model-mapping");
        final int i18 = 11;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass6, c35953cM73385r, interfaceC4351m6, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, c35953cM73385r, c35953c), false, "gson-home");
        final int i19 = 12;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass7, c35953cM73385r2, interfaceC4351m7, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, c35953cM73385r2, c35953c), false, "home-bff-cache-deserializer");
        final int i24 = 13;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, c35953cM53379t, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, c35953cM53379t, interfaceC4351m8, 2)), false);
        final int i25 = 15;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C18641r.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, interfaceC4351m9, 2)), false);
        final int i26 = 16;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C22563c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, interfaceC4351m10, 2)), false);
        final int i27 = 11;
        C30330b c30330b = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24503c.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b.f124471b, null, c35953c), new C31362a(c30330b), false);
        final int i28 = 22;
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(StreaksHomeApi.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b2.f124471b, null, c35953c), new C31362a(c30330b2), false);
        final int i29 = 3;
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C3422e.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31362a(c30330b3), false);
        final int i34 = 14;
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C3421d.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        final int i35 = 17;
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37357c.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        final int i36 = 18;
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C15970e.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        final int i37 = 19;
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24502b.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        final int i38 = 20;
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38452b.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        final int i39 = 21;
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18639p.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        final int i44 = 1;
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC35173b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        final int i45 = 3;
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17425b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        final int i46 = 4;
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C15996f.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        final int i47 = 5;
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35067d.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        final int i48 = 6;
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12178b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        final int i49 = 7;
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35064a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        final int i54 = 8;
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C25673b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        final int i55 = 9;
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28016b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        final int i56 = 10;
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C15967b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31365d(c30330b18), false);
        final int i57 = 12;
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C15966a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        final int i58 = 13;
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38459a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        final int i59 = 15;
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31511a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i59) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        final int i64 = 16;
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C1004a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i64) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        final int i65 = 17;
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18632i.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i65) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        final int i66 = 18;
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18628e.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i66) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31362a(c30330b24), false);
        final int i67 = 19;
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36104b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i67) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        final int i68 = 20;
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C33919c.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i68) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31362a(c30330b26), false);
        final int i69 = 21;
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C4811b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i69) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c), new C31362a(c30330b27), false);
        final int i74 = 23;
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AutoPopApi.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i74) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        final int i75 = 24;
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21771b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i75) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c), new C31362a(c30330b29), false);
        final int i76 = 25;
        C30330b c30330b30 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29350b.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i76) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.f124471b, null, c35953c), new C31362a(c30330b30), false);
        final int i77 = 27;
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18635l.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        final int i78 = 28;
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C15991a.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        final int i79 = 29;
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18684n.class), null, new InterfaceC4351m() { // from class: hl1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i79) {
                    case 0:
                        return C17405h.m49313g0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49340r0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49316h0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49346u0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49348v0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49350w0(c38266c, c34911a);
                    case 6:
                        return C17405h.m49352x0(c38266c, c34911a);
                    case 7:
                        return C17405h.m49356z0(c38266c, c34911a);
                    case 8:
                        return C17405h.m49245B0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49249D0(c38266c, c34911a);
                    case 10:
                        return C17405h.m49251E0(c38266c, c34911a);
                    case 11:
                        return C17405h.m49319i0(c38266c, c34911a);
                    case 12:
                        return C17405h.m49253F0(c38266c, c34911a);
                    case 13:
                        return C17405h.m49255G0(c38266c, c34911a);
                    case 14:
                        return C17405h.m49342s0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49259I0(c38266c, c34911a);
                    case 16:
                        return C17405h.m49261J0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49263K0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49265L0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49267M0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49269N0(c38266c, c34911a);
                    case 21:
                        return C17405h.m49271O0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C17405h.m49322j0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C17405h.m49273P0(c38266c, c34911a);
                    case 24:
                        return C17405h.m49275Q0(c38266c, c34911a);
                    case 25:
                        return C17405h.m49277R0(c38266c, c34911a);
                    case 26:
                        return C17405h.m49257H0(c38266c, c34911a);
                    case 27:
                        return C17405h.m49281T0(c38266c, c34911a);
                    case 28:
                        return C17405h.m49283U0(c38266c, c34911a);
                    default:
                        return C17405h.m49285V0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31362a(c30330b33), false);
        final int i83 = 0;
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29359d.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i83) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), new C31362a(c30330b34), false);
        final int i84 = 1;
        C30330b c30330b35 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28038l.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.f124471b, null, c35953c), new C31362a(c30330b35), false);
        final int i85 = 2;
        C30330b c30330b36 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31388d.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i85) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.f124471b, null, c35953c), new C31362a(c30330b36), false);
        final int i86 = 4;
        C30330b c30330b37 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18662c0.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i86) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.f124471b, null, c35953c), new C31362a(c30330b37), false);
        final int i87 = 5;
        C30330b c30330b38 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C18646w.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i87) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b38.f124471b, null, c35953c), new C31362a(c30330b38), false);
        final int i88 = 6;
        C30330b c30330b39 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17424a.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i88) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b39.f124471b, null, c35953c), new C31362a(c30330b39), false);
        final int i89 = 7;
        C30330b c30330b40 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17401d.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i89) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(c30330b40, module, AbstractC21598x.m60669Y(c30330b40.f124471b, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b41 = c31365dM73383p.f129023a;
        c30330b41.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b41.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b41.f124472c, c30330b41.f124470a), c31365dM73383p, true);
        final int i94 = 9;
        C30330b c30330b42 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17399b.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i94) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(c30330b42, module, AbstractC21598x.m60669Y(c30330b42.f124471b, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b43 = c31365dM73383p2.f129023a;
        c30330b43.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b43.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b43.f124472c, c30330b43.f124470a), c31365dM73383p2, true);
        final int i95 = 10;
        C30330b c30330b44 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17400c.class), null, new InterfaceC4351m() { // from class: hl1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i95) {
                    case 0:
                        return C17405h.m49287W0(c38266c, c34911a);
                    case 1:
                        return C17405h.m49289X0(c38266c, c34911a);
                    case 2:
                        return C17405h.m49291Y0(c38266c, c34911a);
                    case 3:
                        return C17405h.m49325k0(c38266c, c34911a);
                    case 4:
                        return C17405h.m49293Z0(c38266c, c34911a);
                    case 5:
                        return C17405h.m49296a1(c38266c, c34911a);
                    case 6:
                        return C17405h.m49299b1(c38266c, c34911a);
                    case 7:
                        return C17405h.m49302c1(c38266c, c34911a);
                    case 8:
                        return C17405h.m49279S0(c38266c, c34911a);
                    case 9:
                        return C17405h.m49308e1(c38266c, c34911a);
                    case 10:
                        return C17405h.m49311f1(c38266c, c34911a);
                    case 11:
                        return C17405h.m49305d1(c38266c, c34911a);
                    case 12:
                        return C17405h.m49314g1(c38266c, c34911a);
                    case 13:
                        return C17405h.m49317h1(c38266c, c34911a);
                    case 14:
                        return C17405h.m49328l0(c38266c, c34911a);
                    case 15:
                        return C17405h.m49320i1(c38266c, c34911a);
                    case 16:
                        return C17405h.m49326k1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C17405h.m49330m0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C17405h.m49332n0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C17405h.m49334o0(c38266c, c34911a);
                    case 20:
                        return C17405h.m49336p0(c38266c, c34911a);
                    default:
                        return C17405h.m49338q0(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(c30330b44, module, AbstractC21598x.m60669Y(c30330b44.f124471b, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b45 = c31365dM73383p3.f129023a;
        c30330b45.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b45.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b45.f124472c, c30330b45.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C17400c m49311f1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17400c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final HomeApi m49313g0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "home-model-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        C34643d c34643dM109481a = ((C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("gson-home")), AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null), AbstractC12350b.m34570S("kt-serialization-home"));
        C29222x0 c29222x0 = new C29222x0();
        return (HomeApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), HomeApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Gson m49314g1(C38266c c38266c, C34911a c34911a) {
        return AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("home-model-mapping")), null, 2, null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C13326a0 m49316h0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C13326a0((InterfaceC14643c) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14643c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final InterfaceC34640a m49317h1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "home-model-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null), (Gson) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("gson-home")), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-home"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C24503c m49319i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("RequiredPermissionsInteractor");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24503c(interfaceC34116nM107848a, (C28150c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), ((C31511a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31511a.class), null)).m97091a(), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), ((C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C18641r m49320i1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("HomeFeedDomainInteractor");
        C1872g c1872g = new C1872g(factory, 4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18641r(interfaceC34116nM107848a, (InterfaceC26834e) factory.m122602a(c1872g, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C38452b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38452b.class), null), (C18635l) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18635l.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C29380c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29380c.class), null), (C11111c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11111c.class), null), (C14747d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14747d.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C15967b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null), (InterfaceC12251g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final StreaksHomeApi m49322j0(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-home"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (StreaksHomeApi) c29222x0.m88730d().m88733b(StreaksHomeApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C34911a m49323j1(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("home-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C3422e m49325k0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3422e((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C22563c m49326k1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22563c((HomeApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HomeApi.class), null), InterfaceC34116n.INSTANCE.m107848a("CalendarDomainInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C3421d m49328l0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3421d((StreaksHomeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StreaksHomeApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (C15970e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15970e.class), null), null, (C3422e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3422e.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C37357c m49330m0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C3422e c3422e = (C3422e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C3422e.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("InAppReviewInteractor");
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C37357c(c3422e, interfaceC0422g, interfaceC34116nM107848a, featureFlagChecker, interfaceC14515a, clockSystemUTC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C15970e m49332n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15970e((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C24502b m49334o0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("RequiredPermissionTracker");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24502b(interfaceC34116nM107848a, (C24503c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24503c.class), null), (C17345d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), ((C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C38452b m49336p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38452b((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (OnboardingStatusChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusChecker.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C18639p m49338q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18639p((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final InterfaceC35173b m49340r0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC32120a.m99976b(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C13347u m49342s0(C38266c viewModel, C34911a params) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C15996f c15996f = (C15996f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15996f.class), null);
        C18641r c18641r = (C18641r) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18641r.class), null);
        C22563c c22563c = (C22563c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22563c.class), null);
        C18639p c18639p = (C18639p) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18639p.class), null);
        C32705d c32705d = (C32705d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32705d.class), null);
        C35064a c35064a = (C35064a) viewModel.m122602a(new C17404g(params, 0), c22673i0.getOrCreateKotlinClass(C35064a.class), null);
        C28016b c28016b = (C28016b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28016b.class), null);
        C1004a c1004a = (C1004a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C1004a.class), null);
        C18632i c18632i = (C18632i) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18632i.class), null);
        C18628e c18628e = (C18628e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18628e.class), null);
        C36104b c36104b = (C36104b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36104b.class), null);
        C15967b c15967b = (C15967b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null);
        NotificationRepository notificationRepository = (NotificationRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null);
        C3421d c3421d = (C3421d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3421d.class), null);
        C21771b c21771b = (C21771b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21771b.class), null);
        C29350b c29350b = (C29350b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29350b.class), null);
        InterfaceC36049d interfaceC36049d = (InterfaceC36049d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC36049d.class), null);
        C15995e c15995e = (C15995e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15995e.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        C33919c c33919c = (C33919c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33919c.class), null);
        C4811b c4811b = (C4811b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4811b.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        C31388d c31388d = (C31388d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31388d.class), null);
        InterfaceC16183e interfaceC16183e = (InterfaceC16183e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null);
        return new C13347u(c15996f, c18641r, c22563c, c18639p, c32705d, c35064a, c28016b, c1004a, c18632i, c18628e, c36104b, c33919c, c4811b, c3421d, c21771b, (C37357c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37357c.class), null), c29350b, interfaceC36049d, c31388d, (C18646w) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18646w.class), null), (C24503c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24503c.class), null), (C34659c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34659c.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), interfaceC16183e, c15967b, notificationRepository, featureFlagChecker, interfaceC0422g, (InterfaceC21164r) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21164r.class), null), null, c15995e, (C17345d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null), 536870912, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C34911a m49344t0(C34911a c34911a) {
        Object obj;
        Iterator it = c34911a.f147011a.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof CompanionDeviceManager) {
                obj = next;
            }
        } while (obj == null);
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{obj}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C17425b m49346u0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17425b((C17424a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17424a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C15996f m49348v0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15996f((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, (C15991a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15991a.class), null), null, (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (C34659c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34659c.class), null), (C17425b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17425b.class), null), 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C35067d m49350w0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35067d((LanguageChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C12178b m49352x0(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 16);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12178b((InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (C15967b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15967b.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (C38459a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38459a.class), null), (InterfaceC12251g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null), (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null), (C28498a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28498a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C34911a m49354y0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C35064a m49356z0(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        InterfaceC15928c interfaceC15928c = (InterfaceC15928c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC15928c.class), null);
        C28162g c28162g = (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null);
        C25673b c25673b = (C25673b) factory.m122602a(new C0972g(params, 15), c22673i0.getOrCreateKotlinClass(C25673b.class), null);
        InterfaceC41070a interfaceC41070a = (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null);
        return new C35064a(interfaceC4733b, interfaceC15928c, c28162g, c25673b, (C33067c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C33067c.class), null), (C36530a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36530a.class), null), interfaceC41070a, (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (C26813a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26813a.class), null), (C35067d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35067d.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m49310f0(c33768a);
        return c33768a;
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

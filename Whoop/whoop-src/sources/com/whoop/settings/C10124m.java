package com.whoop.settings;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.C1630u0;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.SettingsLandingRepository;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.ReferralContentV2;
import com.whoop.domain.model.User;
import com.whoop.entitlements.Entitlement;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.payments.domain.models.PaymentMethodExpirationStatus;
import com.whoop.payments.domain.models.PaymentsResponse;
import com.whoop.sms.common.data.TextingSettingsAvailabilityResponse;
import com.whoop.whattoexpect.domain.models.CtaLocation;
import com.whoop.whattoexpect.domain.models.WhatToExpectEntryPointResponse;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import gc2.EnumC15710a;
import gz0.AbstractC16315n0;
import hf1.InterfaceC17235b;
import hj0.AbstractC17356o;
import iw2.C21008c;
import iw2.InterfaceC21009d;
import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import n83.C26463f;
import or2.C28180m;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p705ea2.C12901d0;
import p705ea2.C12913j0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pz1.C29647e;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sb0.C32345f;
import sr2.AbstractC32943y;
import t83.InterfaceC33616a;
import wb2.C37050a;
import we1.InterfaceC37217a;
import xf2.C38263a;
import y71.C39274g;
import y71.C39282o;
import yk0.C39598a;
import z82.InterfaceC40188b;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: com.whoop.settings.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u0002\u008a\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020)¢\u0006\u0004\b-\u0010+J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020.¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020.H\u0086@¢\u0006\u0004\b6\u0010(J\u0010\u00107\u001a\u00020.H\u0086@¢\u0006\u0004\b7\u0010(J\u0010\u00108\u001a\u00020.H\u0086@¢\u0006\u0004\b8\u0010(J\u0010\u00109\u001a\u00020&H\u0086@¢\u0006\u0004\b9\u0010(J\u0010\u0010:\u001a\u00020.H\u0086@¢\u0006\u0004\b:\u0010(J\r\u0010;\u001a\u00020.¢\u0006\u0004\b;\u00100J)\u0010A\u001a\u00020&2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020&2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020&2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bC\u0010DJ&\u0010J\u001a\u0004\u0018\u00010I2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0082@¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010bR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010cR\u001a\u0010g\u001a\u00020)8\u0016X\u0096D¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010+R\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020i0h8\u0006¢\u0006\f\n\u0004\b*\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G0h8\u0006¢\u0006\f\n\u0004\b/\u0010j\u001a\u0004\b^\u0010lR\u001f\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0h8\u0006¢\u0006\f\n\u0004\bn\u0010j\u001a\u0004\b`\u0010lR\u001f\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010o0h8\u0006¢\u0006\f\n\u0004\bp\u0010j\u001a\u0004\b\\\u0010lR&\u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020&010r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010sR)\u0010y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020&010u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bn\u0010xR\u001c\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010i0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010sR\u001f\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010i0u8\u0006¢\u0006\f\n\u0004\bk\u0010w\u001a\u0004\bv\u0010xR\u0018\u0010\u007f\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010~R\u001f\u0010\u0082\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010I0\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0081\u0001R \u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0h8\u0006¢\u0006\f\n\u0004\bC\u0010j\u001a\u0004\bX\u0010lR\u001e\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b7\u0010e\u001a\u0004\bZ\u0010+R\u0019\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010h8F¢\u0006\u0006\u001a\u0004\bp\u0010l¨\u0006\u008b\u0001"}, m65681d2 = {"Lcom/whoop/settings/m;", "Lhj0/o;", "Lrv1/a;", "membershipRepository", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lz82/b;", "analyticsManager", "Lcom/whoop/data/repositories/SettingsLandingRepository;", "settingsLandingRepository", "Lsb0/f;", "advancedLabsRepository", "Lpz1/e;", "nativeStoreMenuItemRepository", "Lxf2/a;", "textingSettingsAvailabilityRepository", "Lhf1/b;", "experimentsChecker", "Lyk0/a;", "coachRepository", "Lsr2/y;", "urlProvider", "Liw2/c;", "whatToExpectInteractor", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "Lea2/d0;", "tileVisibilityChecker", "Ljava/time/Clock;", "clock", "Lbc3/c0;", "coroutineScope", "<init>", "(Lrv1/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lz82/b;Lcom/whoop/data/repositories/SettingsLandingRepository;Lsb0/f;Lpz1/e;Lxf2/a;Lhf1/b;Lyk0/a;Lsr2/y;Liw2/c;Lz92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Lea2/d0;Ljava/time/Clock;Lbc3/c0;)V", "", "d0", "(Lq83/d;)Ljava/lang/Object;", "", "U", "()Ljava/lang/String;", "R", "S", "Ll83/a0;", "V", "()V", "", "", "H", "()Ljava/util/Map;", "i0", "f0", "g0", "h0", "c0", "Y", "L", "Lgc2/a;", "tile", "concealed", "Liw2/d$b;", "wteResult", "K", "(Lgc2/a;ZLiw2/d$b;)Z", "e0", "(Lgc2/a;)Z", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "membershipStatus", "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "membershipInfo", "Lcom/whoop/settings/a;", "I", "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lq83/d;)Ljava/lang/Object;", "E", "Lrv1/a;", "F", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "G", "Lz82/b;", "Lcom/whoop/data/repositories/SettingsLandingRepository;", "Lsb0/f;", "J", "Lpz1/e;", "Lxf2/a;", "Lhf1/b;", "M", "Lyk0/a;", "N", "Liw2/c;", "O", "Lz92/a;", "P", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Q", "Lwe1/a;", "Lea2/d0;", "Ljava/time/Clock;", "T", "Ljava/lang/String;", "o", "logTag", "Landroidx/lifecycle/p0;", "Lea2/j0;", "Landroidx/lifecycle/p0;", "b0", "()Landroidx/lifecycle/p0;", "wteViewState", "W", "Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "X", "membershipAffiliate", "Lec3/p1;", "Lec3/p1;", "_tileVisibility", "Lec3/f2;", "Z", "Lec3/f2;", "()Lec3/f2;", "tileVisibility", "a0", "_wteContentState", "wteContentState", "Lbc3/k1;", "Lbc3/k1;", "cardAlertJob", "Landroidx/lifecycle/u0;", "Landroidx/lifecycle/u0;", "_cardAlertStatus", "cardAlertStatus", "Landroidx/lifecycle/t0;", "Lwb2/a;", "Landroidx/lifecycle/t0;", "_viewStateMediatorLiveData", "concealedUrl", "viewStateLiveData", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10124m extends AbstractC17356o {

    /* JADX INFO: renamed from: i0 */
    public static final int f30481i0 = 8;

    /* JADX INFO: renamed from: j0 */
    private static final Set<EnumC15710a> f30482j0 = AbstractC25260n.m74059b1(new EnumC15710a[]{EnumC15710a.INTEGRATIONS, EnumC15710a.DATA_EXPORT, EnumC15710a.NOTIFICATION_SETTINGS});

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final SettingsLandingRepository settingsLandingRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C32345f advancedLabsRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C29647e nativeStoreMenuItemRepository;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C38263a textingSettingsAvailabilityRepository;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C39598a coachRepository;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C21008c whatToExpectInteractor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final C12901d0 tileVisibilityChecker;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final AbstractC1615p0 wteViewState;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final AbstractC1615p0 membershipInfo;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final AbstractC1615p0 membershipStatus;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final AbstractC1615p0 membershipAffiliate;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC13075p1 _tileVisibility;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC13037f2 tileVisibility;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC13075p1 _wteContentState;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC13037f2 wteContentState;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private InterfaceC3027k1 cardAlertJob;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final C1630u0 _cardAlertStatus;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final AbstractC1615p0 cardAlertStatus;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final C1627t0 _viewStateMediatorLiveData;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final String concealedUrl;

    /* JADX INFO: renamed from: com.whoop.settings.m$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel$1", m100430f = "SettingsLandingViewModel.kt", m100431l = {105, 106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        boolean f30512w;

        /* JADX INFO: renamed from: x */
        int f30513x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10124m.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        /* JADX WARN: Code duplicated, block: B:22:0x005b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0078  */
        /* JADX WARN: Code duplicated, block: B:29:0x0086 A[LOOP:0: B:27:0x0080->B:29:0x0086, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            InterfaceC21009d interfaceC21009d;
            InterfaceC21009d.b bVar;
            C10124m c10124m;
            LinkedHashMap linkedHashMap;
            int iM73988W;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30513x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10124m c10124m2 = C10124m.this;
                this.f30513x = 1;
                obj = c10124m2.m25552d0(this);
                if (obj != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f30512w;
                AbstractC34132o.m107864I(obj);
            }
            interfaceC21009d = (InterfaceC21009d) obj;
            if (interfaceC21009d instanceof InterfaceC21009d.b) {
                bVar = (InterfaceC21009d.b) interfaceC21009d;
            } else {
                if (AbstractC22676k.m65745e(interfaceC21009d, InterfaceC21009d.a.f79509a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = null;
            }
            InterfaceC13075p1 interfaceC13075p1 = C10124m.this._tileVisibility;
            InterfaceC33616a entries = EnumC15710a.getEntries();
            c10124m = C10124m.this;
            iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(entries, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj2 : entries) {
                linkedHashMap.put(obj2, Boolean.valueOf(c10124m.m25530K((EnumC15710a) obj2, z4, bVar)));
            }
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashMap);
            ((C13045h2) C10124m.this._wteContentState).m36570j(bVar != null ? new C12913j0(bVar.getCardData().getTitle(), bVar.getCardData().getBody(), AbstractC16315n0.m46376a(bVar.getCardData().getIcon()), bVar.getCardData().getCtaLocation()) : null);
            return C23454a0.f92919a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C21008c c21008c = C10124m.this.whatToExpectInteractor;
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            this.f30512w = zBooleanValue;
            this.f30513x = 2;
            Object objM58568c = c21008c.m58568c(executorC22364d, this);
            if (objM58568c != enumC31071a) {
                z4 = zBooleanValue;
                obj = objM58568c;
                interfaceC21009d = (InterfaceC21009d) obj;
                if (interfaceC21009d instanceof InterfaceC21009d.b) {
                    bVar = (InterfaceC21009d.b) interfaceC21009d;
                } else {
                    if (AbstractC22676k.m65745e(interfaceC21009d, InterfaceC21009d.a.f79509a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = null;
                }
                InterfaceC13075p1 interfaceC13075p2 = C10124m.this._tileVisibility;
                InterfaceC33616a entries2 = EnumC15710a.getEntries();
                c10124m = C10124m.this;
                iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(entries2, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                linkedHashMap = new LinkedHashMap(iM73988W);
                while (r3.hasNext()) {
                    linkedHashMap.put(obj2, Boolean.valueOf(c10124m.m25530K((EnumC15710a) obj2, z4, bVar)));
                }
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.getClass();
                c13045h3.m36571k(null, linkedHashMap);
                ((C13045h2) C10124m.this._wteContentState).m36570j(bVar != null ? new C12913j0(bVar.getCardData().getTitle(), bVar.getCardData().getBody(), AbstractC16315n0.m46376a(bVar.getCardData().getIcon()), bVar.getCardData().getCtaLocation()) : null);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30515a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f30516b;

        static {
            int[] iArr = new int[EnumC15710a.values().length];
            try {
                iArr[EnumC15710a.WHAT_TO_EXPECT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15710a.WHAT_TO_EXPECT_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15710a.WHOOP_LABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC15710a.DATA_EXPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC15710a.STEALTH_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f30515a = iArr;
            int[] iArr2 = new int[PaymentMethodExpirationStatus.values().length];
            try {
                iArr2[PaymentMethodExpirationStatus.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentMethodExpirationStatus.EXPIRING_SOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentMethodExpirationStatus.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f30516b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {286}, m100432m = "computeCardAlertStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30517E;

        /* JADX INFO: renamed from: w */
        Object f30518w;

        /* JADX INFO: renamed from: x */
        Object f30519x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30520y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30520y = obj;
            this.f30517E |= Integer.MIN_VALUE;
            return C10124m.this.m25529I(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel$fetchCardAlertStatus$1", m100430f = "SettingsLandingViewModel.kt", m100431l = {275}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ MembershipInfo f30522E;

        /* JADX INFO: renamed from: w */
        Object f30523w;

        /* JADX INFO: renamed from: x */
        int f30524x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ MembershipStatus f30526z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MembershipStatus membershipStatus, MembershipInfo membershipInfo, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30526z = membershipStatus;
            this.f30522E = membershipInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10124m.this.new e(this.f30526z, this.f30522E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1630u0 c1630u0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30524x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C1630u0 c1630u1 = C10124m.this._cardAlertStatus;
                C10124m c10124m = C10124m.this;
                MembershipStatus membershipStatus = this.f30526z;
                MembershipInfo membershipInfo = this.f30522E;
                this.f30523w = c1630u1;
                this.f30524x = 1;
                Object objM25529I = c10124m.m25529I(membershipStatus, membershipInfo, this);
                if (objM25529I == enumC31071a) {
                    return enumC31071a;
                }
                c1630u0 = c1630u1;
                obj = objM25529I;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1630u0 = (C1630u0) this.f30523w;
                AbstractC34132o.m107864I(obj);
            }
            c1630u0.setValue(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel$getReferralContent$1", m100430f = "SettingsLandingViewModel.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30527w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10124m.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30527w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SettingsLandingRepository settingsLandingRepository = C10124m.this.settingsLandingRepository;
                this.f30527w = 1;
                fVar = this;
                obj = SettingsLandingRepository.getReferralContentV2$default(settingsLandingRepository, null, null, fVar, 3, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                fVar = this;
            }
            ReferralContentV2 referralContentV2 = (ReferralContentV2) obj;
            if (referralContentV2 != null) {
                C10124m.this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_REFER_FRIEND_TITLE, referralContentV2.getTitle());
                C10124m.this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_REFER_FRIEND_DESCRIPTION, referralContentV2.getBody());
                C10124m.this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_REFER_FRIEND_MESSAGE, referralContentV2.getShareMessage());
            } else {
                C10124m.this.m49136n().mo85222m("Failed to get the referral content.", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {249}, m100432m = "getWhatToExpectEntryPoint", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30529w;

        /* JADX INFO: renamed from: y */
        int f30531y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30529w = obj;
            this.f30531y |= Integer.MIN_VALUE;
            return C10124m.this.m25548Y(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel$isCoachFeatureEnabled$2", m100430f = "SettingsLandingViewModel.kt", m100431l = {243}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30532w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10124m.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30532w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C39598a c39598a = C10124m.this.coachRepository;
            this.f30532w = 1;
            Object objM126480b = c39598a.m126480b(this);
            return objM126480b == enumC31071a ? enumC31071a : objM126480b;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {159}, m100432m = "isConcealed", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30534w;

        /* JADX INFO: renamed from: y */
        int f30536y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30534w = obj;
            this.f30536y |= Integer.MIN_VALUE;
            return C10124m.this.m25552d0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {205, 210}, m100432m = "loadALMoreTab", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f30537w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f30538x;

        /* JADX INFO: renamed from: z */
        int f30540z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30538x = obj;
            this.f30540z |= Integer.MIN_VALUE;
            return C10124m.this.m25553f0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {220}, m100432m = "loadShopMenuItem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30541w;

        /* JADX INFO: renamed from: y */
        int f30543y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30541w = obj;
            this.f30543y |= Integer.MIN_VALUE;
            return C10124m.this.m25554g0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.m$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingViewModel", m100430f = "SettingsLandingViewModel.kt", m100431l = {227}, m100432m = "loadSmsSettingsMenuItem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30544w;

        /* JADX INFO: renamed from: y */
        int f30546y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30544w = obj;
            this.f30546y |= Integer.MIN_VALUE;
            return C10124m.this.m25555h0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10124m(C31842a membershipRepository, PreferenceHelper preferenceHelper, InterfaceC40188b analyticsManager, SettingsLandingRepository settingsLandingRepository, C32345f advancedLabsRepository, C29647e nativeStoreMenuItemRepository, C38263a textingSettingsAvailabilityRepository, InterfaceC17235b experimentsChecker, C39598a coachRepository, AbstractC32943y urlProvider, C21008c whatToExpectInteractor, InterfaceC40205a userInfoAccessor, FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker, C12901d0 tileVisibilityChecker, Clock clock, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(settingsLandingRepository, "settingsLandingRepository");
        AbstractC22676k.m65750j(advancedLabsRepository, "advancedLabsRepository");
        AbstractC22676k.m65750j(nativeStoreMenuItemRepository, "nativeStoreMenuItemRepository");
        AbstractC22676k.m65750j(textingSettingsAvailabilityRepository, "textingSettingsAvailabilityRepository");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(coachRepository, "coachRepository");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(whatToExpectInteractor, "whatToExpectInteractor");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(tileVisibilityChecker, "tileVisibilityChecker");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.membershipRepository = membershipRepository;
        this.preferenceHelper = preferenceHelper;
        this.analyticsManager = analyticsManager;
        this.settingsLandingRepository = settingsLandingRepository;
        this.advancedLabsRepository = advancedLabsRepository;
        this.nativeStoreMenuItemRepository = nativeStoreMenuItemRepository;
        this.textingSettingsAvailabilityRepository = textingSettingsAvailabilityRepository;
        this.experimentsChecker = experimentsChecker;
        this.coachRepository = coachRepository;
        this.whatToExpectInteractor = whatToExpectInteractor;
        this.userInfoAccessor = userInfoAccessor;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
        this.tileVisibilityChecker = tileVisibilityChecker;
        this.clock = clock;
        this.logTag = "SettingsLandingViewModel";
        this.wteViewState = new C1630u0();
        this.membershipInfo = membershipRepository.m98945F();
        this.membershipStatus = membershipRepository.m98946G();
        this.membershipAffiliate = membershipRepository.m98944E();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25272z.f99163w);
        this._tileVisibility = c13045h2M36593c;
        this.tileVisibility = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this._wteContentState = c13045h2M36593c2;
        this.wteContentState = AbstractC13091v.m36598h(c13045h2M36593c2);
        if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE)) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
        }
        C1630u0 c1630u0 = new C1630u0();
        this._cardAlertStatus = c1630u0;
        this.cardAlertStatus = c1630u0;
        this._viewStateMediatorLiveData = new C1627t0();
        this.concealedUrl = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/CONCEALED_MODE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m25529I(MembershipStatus membershipStatus, MembershipInfo membershipInfo, InterfaceC30057d<? super AbstractC10089a> interfaceC30057d) {
        d dVar;
        LocalDateTime nextBillDateTime;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f30517E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f30517E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM98951y = dVar.f30520y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f30517E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM98951y);
            if (membershipStatus == null || !membershipStatus.isPayingMember()) {
                return null;
            }
            if (membershipStatus == MembershipStatus.PAST_DUE) {
                return AbstractC10089a.d.f30333a;
            }
            C31842a c31842a = this.membershipRepository;
            dVar.f30518w = null;
            dVar.f30519x = membershipInfo;
            dVar.f30517E = 1;
            objM98951y = c31842a.m98951y(dVar);
            if (objM98951y == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            membershipInfo = (MembershipInfo) dVar.f30519x;
            AbstractC34132o.m107864I(objM98951y);
        }
        List list = (List) objM98951y;
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return AbstractC10089a.c.f30332a;
        }
        PaymentsResponse paymentsResponse = (PaymentsResponse) AbstractC25265s.m74112P0(list);
        PaymentMethodExpirationStatus expirationStatus = paymentsResponse.getExpirationStatus();
        if (expirationStatus != null && this.featureFlagChecker.isFeatureEnabled("card-expiration-status-from-msv2-android")) {
            int i15 = c.f30516b[expirationStatus.ordinal()];
            if (i15 == 1) {
                return new AbstractC10089a.a(paymentsResponse.getBrand(), paymentsResponse.getLast4());
            }
            if (i15 == 2) {
                return new AbstractC10089a.b(paymentsResponse.getBrand(), paymentsResponse.getLast4());
            }
            if (i15 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDate = new LocalDate(this.clock.millis());
        int year = localDate.getYear();
        int monthOfYear = localDate.getMonthOfYear();
        if (paymentsResponse.getExpYear() < year || (paymentsResponse.getExpYear() == year && paymentsResponse.getExpMonth() < monthOfYear)) {
            return new AbstractC10089a.a(paymentsResponse.getBrand(), paymentsResponse.getLast4());
        }
        LocalDate localDate2 = (membershipInfo == null || (nextBillDateTime = membershipInfo.getNextBillDateTime()) == null) ? null : nextBillDateTime.toLocalDate();
        if (localDate2 == null || localDate2.isAfter(localDate.plusDays(30)) || localDate2.isBefore(new LocalDate(paymentsResponse.getExpYear(), paymentsResponse.getExpMonth(), 1).plusMonths(1))) {
            return null;
        }
        return new AbstractC10089a.b(paymentsResponse.getBrand(), paymentsResponse.getLast4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final boolean m25530K(EnumC15710a tile, boolean concealed, InterfaceC21009d.b wteResult) {
        WhatToExpectEntryPointResponse cardData;
        WhatToExpectEntryPointResponse cardData2;
        if (!m25531e0(tile)) {
            return false;
        }
        if (concealed && f30482j0.contains(tile)) {
            return false;
        }
        int i13 = c.f30515a[tile.ordinal()];
        CtaLocation ctaLocation = null;
        if (i13 == 1) {
            if (this.tileVisibilityChecker.m36305a(tile)) {
                if (wteResult != null && (cardData = wteResult.getCardData()) != null) {
                    ctaLocation = cardData.getCtaLocation();
                }
                if (ctaLocation == CtaLocation.TOP) {
                    return true;
                }
            }
            return false;
        }
        if (i13 != 2) {
            return this.tileVisibilityChecker.m36305a(tile);
        }
        if (this.tileVisibilityChecker.m36305a(tile)) {
            if (wteResult != null && (cardData2 = wteResult.getCardData()) != null) {
                ctaLocation = cardData2.getCtaLocation();
            }
            if (ctaLocation == CtaLocation.SUPPORT) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    private final boolean m25531e0(EnumC15710a tile) {
        int i13 = c.f30515a[tile.ordinal()];
        if (i13 == 3) {
            return this.featureFlagChecker.isFeatureEnabled("whoop-labs-remote-study-android");
        }
        if (i13 == 4) {
            return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.MEMBER_DATA_EXPORT);
        }
        if (i13 != 5) {
            return true;
        }
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.STEALTH_MODE);
    }

    /* JADX INFO: renamed from: H */
    public final Map<String, Object> m25535H() {
        C26463f c26463f = new C26463f();
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE) && !this.entitlementChecker.mo119272b(Entitlement.DEVICE)) {
            c26463f.put("user_category", "al_only");
        }
        return c26463f.m78380b();
    }

    /* JADX INFO: renamed from: L */
    public final void m25536L() {
        MembershipStatus membershipStatus = (MembershipStatus) this.membershipStatus.getValue();
        MembershipInfo membershipInfo = (MembershipInfo) this.membershipInfo.getValue();
        InterfaceC3027k1 interfaceC3027k1 = this.cardAlertJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.cardAlertJob = AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(membershipStatus, membershipInfo, null), 3);
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final AbstractC1615p0 getCardAlertStatus() {
        return this.cardAlertStatus;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getConcealedUrl() {
        return this.concealedUrl;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AbstractC1615p0 getMembershipAffiliate() {
        return this.membershipAffiliate;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final AbstractC1615p0 getMembershipInfo() {
        return this.membershipInfo;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final AbstractC1615p0 getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: R */
    public final String m25542R() {
        return PreferenceHelper.getStringValueFromMainPrefs$default(this.preferenceHelper, SharedPreferenceConstants.KEY_REFER_FRIEND_DESCRIPTION, null, 2, null);
    }

    /* JADX INFO: renamed from: S */
    public final String m25543S() {
        return PreferenceHelper.getStringValueFromMainPrefs$default(this.preferenceHelper, SharedPreferenceConstants.KEY_REFER_FRIEND_MESSAGE, null, 2, null);
    }

    /* JADX INFO: renamed from: U */
    public final String m25544U() {
        return PreferenceHelper.getStringValueFromMainPrefs$default(this.preferenceHelper, SharedPreferenceConstants.KEY_REFER_FRIEND_TITLE, null, 2, null);
    }

    /* JADX INFO: renamed from: V */
    public final void m25545V() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(null), 3);
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final InterfaceC13037f2 getTileVisibility() {
        return this.tileVisibility;
    }

    /* JADX INFO: renamed from: X */
    public final AbstractC1615p0 m25547X() {
        return this._viewStateMediatorLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    public final Object m25548Y(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f30531y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f30531y = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM58568c = gVar.f30529w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f30531y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM58568c);
            C21008c c21008c = this.whatToExpectInteractor;
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            gVar.f30531y = 1;
            objM58568c = c21008c.m58568c(executorC22364d, gVar);
            if (objM58568c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM58568c);
        }
        InterfaceC21009d interfaceC21009d = (InterfaceC21009d) objM58568c;
        boolean z4 = interfaceC21009d instanceof InterfaceC21009d.b;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            InterfaceC21009d.b bVar = (InterfaceC21009d.b) interfaceC21009d;
            m49140v(this.wteViewState, new C12913j0(bVar.getCardData().getTitle(), bVar.getCardData().getBody(), AbstractC16315n0.m46376a(bVar.getCardData().getIcon()), bVar.getCardData().getCtaLocation()));
            return c23454a0;
        }
        if (AbstractC22676k.m65745e(interfaceC21009d, InterfaceC21009d.a.f79509a)) {
            return c23454a0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final InterfaceC13037f2 getWteContentState() {
        return this.wteContentState;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final AbstractC1615p0 getWteViewState() {
        return this.wteViewState;
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m25551c0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new h(null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d0 */
    public final Object m25552d0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f30536y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f30536y = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objMo129089c = iVar.f30534w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f30536y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            iVar.f30536y = 1;
            objMo129089c = interfaceC40205a.mo129089c(iVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        return Boolean.valueOf(user != null ? AbstractC22676k.m65745e(user.getConcealed(), Boolean.TRUE) : false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r1 == r2) goto L26;
     */
    /* JADX INFO: renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m25553f0(q83.InterfaceC30057d<? super l83.C23454a0> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof com.whoop.settings.C10124m.j
            if (r2 == 0) goto L18
            r2 = r1
            com.whoop.settings.m$j r2 = (com.whoop.settings.C10124m.j) r2
            int r3 = r2.f30540z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f30540z = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            com.whoop.settings.m$j r2 = new com.whoop.settings.m$j
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r9.f30538x
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r9.f30540z
            r12 = 2
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 == r4) goto L3c
            if (r3 != r12) goto L34
            java.lang.Object r2 = r9.f30537w
            java.lang.String r2 = (java.lang.String) r2
            p505ts.AbstractC34132o.m107864I(r1)
            goto L87
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            p505ts.AbstractC34132o.m107864I(r1)
            goto L6f
        L40:
            p505ts.AbstractC34132o.m107864I(r1)
            com.whoop.data.repositories.FeatureFlagChecker r1 = r0.featureFlagChecker
            java.lang.String r3 = "advanced-labs-more-tab-experiment"
            boolean r1 = r1.isFeatureEnabled(r3)
            if (r1 == 0) goto Lb0
            hf1.b r3 = r0.experimentsChecker
            lf1.a r13 = new lf1.a
            r18 = 15
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r9.f30540z = r4
            r5 = 0
            r7 = 1
            r8 = 0
            r10 = 10
            r11 = 0
            r4 = r13
            java.lang.Object r1 = hf1.InterfaceC17235b.m48741d(r3, r4, r5, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L6f
            goto L86
        L6f:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "treatment"
            boolean r1 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r3)
            if (r1 == 0) goto Lb0
            sb0.f r1 = r0.advancedLabsRepository
            r3 = 0
            r9.f30537w = r3
            r9.f30540z = r12
            java.lang.Object r1 = r1.m100664d(r9)
            if (r1 != r2) goto L87
        L86:
            return r2
        L87:
            r3 = r1
            y71.o r3 = (y71.C39282o) r3
            androidx.lifecycle.p0 r1 = r0.m25547X()
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            wb2.a r2 = (wb2.C37050a) r2
            if (r2 == 0) goto La1
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            wb2.a r1 = wb2.C37050a.m118935b(r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto Lab
        La1:
            wb2.a r2 = new wb2.a
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = r2
        Lab:
            androidx.lifecycle.t0 r2 = r0._viewStateMediatorLiveData
            r0.m49140v(r2, r1)
        Lb0:
            l83.a0 r1 = l83.C23454a0.f92919a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.C10124m.m25553f0(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g0 */
    public final Object m25554g0(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        k kVar;
        C37050a c37050a;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f30543y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f30543y = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object objM91066d = kVar.f30541w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar.f30543y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM91066d);
            C29647e c29647e = this.nativeStoreMenuItemRepository;
            kVar.f30543y = 1;
            objM91066d = c29647e.m91066d(kVar);
            if (objM91066d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM91066d);
        }
        C39282o c39282o = (C39282o) objM91066d;
        C37050a c37050a2 = (C37050a) m25547X().getValue();
        if (c37050a2 == null || (c37050a = C37050a.m118935b(c37050a2, null, c39282o, null, 5, null)) == null) {
            c37050a = new C37050a(null, c39282o, null, 5, null);
        }
        m49140v(this._viewStateMediatorLiveData, c37050a);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h0 */
    public final Object m25555h0(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        l lVar;
        C37050a c37050a;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f30546y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f30546y = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object objM122601b = lVar.f30544w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f30546y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM122601b);
            C38263a c38263a = this.textingSettingsAvailabilityRepository;
            lVar.f30546y = 1;
            objM122601b = c38263a.m122601b(lVar);
            if (objM122601b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM122601b);
        }
        TextingSettingsAvailabilityResponse textingSettingsAvailabilityResponse = (TextingSettingsAvailabilityResponse) objM122601b;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (textingSettingsAvailabilityResponse == null) {
            return c23454a0;
        }
        ApiRequest destination = textingSettingsAvailabilityResponse.getDestination();
        if (textingSettingsAvailabilityResponse.getShowTextingSettings() && destination != null) {
            C39282o.Companion companion = C39282o.INSTANCE;
            String title = textingSettingsAvailabilityResponse.getTitle();
            if (title == null) {
                title = "";
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(title);
            String icon = textingSettingsAvailabilityResponse.getIcon();
            C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, null, null, icon != null ? new C39274g(AbstractC16315n0.m46381f(icon, null, 1, null), null, 2, null) : null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, destination, false, null, 7208926, null);
            C37050a c37050a2 = (C37050a) m25547X().getValue();
            if (c37050a2 == null || (c37050a = C37050a.m118935b(c37050a2, null, null, c39282oM125229d, 3, null)) == null) {
                c37050a = new C37050a(null, null, c39282oM125229d, 3, null);
            }
            m49140v(this._viewStateMediatorLiveData, c37050a);
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m25556i0() {
        this.analyticsManager.mo41428k("", "Click Settings Button", "", "Help Center", AbstractC31061c.m95645u("Screen", "Settings"));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C10124m(C31842a c31842a, PreferenceHelper preferenceHelper, InterfaceC40188b interfaceC40188b, SettingsLandingRepository settingsLandingRepository, C32345f c32345f, C29647e c29647e, C38263a c38263a, InterfaceC17235b interfaceC17235b, C39598a c39598a, AbstractC32943y abstractC32943y, C21008c c21008c, InterfaceC40205a interfaceC40205a, FeatureFlagChecker featureFlagChecker, InterfaceC37217a interfaceC37217a, C12901d0 c12901d0, Clock clock, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 32768) != 0) {
            Clock clockSystemUTC = Clock.systemUTC();
            AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
            clock2 = clockSystemUTC;
        } else {
            clock2 = clock;
        }
        this(c31842a, preferenceHelper, interfaceC40188b, settingsLandingRepository, c32345f, c29647e, c38263a, interfaceC17235b, c39598a, abstractC32943y, c21008c, interfaceC40205a, featureFlagChecker, interfaceC37217a, c12901d0, clock2, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

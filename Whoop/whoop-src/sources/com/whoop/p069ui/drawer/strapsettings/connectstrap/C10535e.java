package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.onboarding.OnboardingTeamInfo;
import com.whoop.data.remote.domain.request.RecordUserStrapRequestBody;
import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingRepository;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.pairing.membershipAdjustment.api.MembershipAdjustmentApi;
import com.whoop.pairing.membershipAdjustment.domain.models.AdjustMembershipBody;
import com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import o52.C27566m0;
import or2.C28150c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qm2.AbstractC30495l;
import qm2.C30484a;
import qm2.C30501r;
import qm2.C30503t;
import qm2.C30504u;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import w02.AbstractC36685b;
import xg3.C38280g;
import zg3.C40634a;

/* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160+¢\u0006\u0004\b-\u0010.J'\u00102\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0018¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001806¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020&H\u0086@¢\u0006\u0004\b:\u0010(J\r\u0010;\u001a\u00020\u0018¢\u0006\u0004\b;\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b@\u0010KR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010M¨\u0006N"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;", "Landroidx/lifecycle/w1;", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/OnboardingRepository;", "onboardingRepository", "Lor2/c;", "appDiagnostics", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Ltd1/b;", "whoopStrapProxy", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;", "membershipAdjustmentApi", "<init>", "(Ltr2/n;Lcom/whoop/data/repositories/OnboardingRepository;Lor2/c;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/data/local/prefs/PreferenceHelper;Ltd1/b;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;)V", "Lqm2/l;", "viewEvent", "Ll83/a0;", "H", "(Lqm2/l;)V", "Lqm2/t;", NotificationCompat.CATEGORY_EVENT, "G", "(Lqm2/t;)V", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "onboardingInfo", "", "strapSerial", "", "F", "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lq83/d;)Ljava/lang/Object;", "", "isOnboarding", "Lxg3/g;", "viewEvents", "A", "(ZLxg3/g;)V", "strapSignature", "Lst0/v;", "strapGen", "y", "(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V", "D", "()V", "Lkotlin/Function0;", "onSuccess", "E", "(Lc93/a;)V", "I", "K", "Ltr2/n;", "x", "Lcom/whoop/data/repositories/OnboardingRepository;", "Lor2/c;", "z", "Lcom/whoop/data/remote/RemoteDataSource;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Ltd1/b;", "Lci2/b;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;", "Landroidx/lifecycle/u0;", "Lqm2/q;", "J", "Landroidx/lifecycle/u0;", "()Landroidx/lifecycle/u0;", "viewStateLiveData", "Z", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10535e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final MembershipAdjustmentApi membershipAdjustmentApi;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C1630u0 viewStateLiveData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isOnboarding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final OnboardingRepository onboardingRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel", m100430f = "ConnectStrapViewModel.kt", m100431l = {193}, m100432m = "doesUserNeedMembershipAdjustment", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f31927F;

        /* JADX INFO: renamed from: w */
        Object f31928w;

        /* JADX INFO: renamed from: x */
        Object f31929x;

        /* JADX INFO: renamed from: y */
        Object f31930y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f31931z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31931z = obj;
            this.f31927F |= Integer.MIN_VALUE;
            return C10535e.this.m27164w(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$doesUserNeedMembershipAdjustment$response$1", m100430f = "ConnectStrapViewModel.kt", m100431l = {194}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f31932w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f31934y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f31935z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f31934y = str;
            this.f31935z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10535e.this.new b(this.f31934y, this.f31935z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31932w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipAdjustmentApi membershipAdjustmentApi = C10535e.this.membershipAdjustmentApi;
            String str = this.f31934y;
            String str2 = this.f31935z;
            this.f31932w = 1;
            Object membershipAdjustment = membershipAdjustmentApi.getMembershipAdjustment(str, str2, this);
            return membershipAdjustment == enumC31071a ? enumC31071a : membershipAdjustment;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MembershipAdjustmentResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$fetchOnboardingInfoBasedOnStrapDetails$1", m100430f = "ConnectStrapViewModel.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC32978v f31936E;

        /* JADX INFO: renamed from: w */
        int f31937w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f31939y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f31940z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, EnumC32978v enumC32978v, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31939y = str;
            this.f31940z = str2;
            this.f31936E = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10535e.this.new c(this.f31939y, this.f31940z, this.f31936E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31937w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (C10535e.this.appDiagnostics.m85182e()) {
                        OnboardingRepository onboardingRepository = C10535e.this.onboardingRepository;
                        String str = this.f31939y;
                        String str2 = this.f31940z;
                        this.f31937w = 1;
                        obj = onboardingRepository.fetchOnboardingInfo(str, str2, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        C10535e.this.getViewStateLiveData().postValue(C30501r.f125332a);
                    }
                    return C23454a0.f92919a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                Resource resource = (Resource) obj;
                OnboardingInfo onboardingInfo = (OnboardingInfo) resource.getData();
                if (!resource.getSuccess() || onboardingInfo == null) {
                    C10535e.this.getViewStateLiveData().postValue(C30484a.f125270a);
                } else {
                    C10535e.this.getViewStateLiveData().postValue(new C30504u(onboardingInfo, C10535e.this.m27150F(onboardingInfo, this.f31939y), this.f31936E));
                }
            } catch (Exception e5) {
                C10535e.this.logger.mo85230v("Failed to fetch onboarding info", e5, new AbstractC30556a.a[0]);
                C10535e.this.getViewStateLiveData().postValue(C30484a.f125270a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$onStrapConnectedForExistingUser$1", m100430f = "ConnectStrapViewModel.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f31941E;

        /* JADX INFO: renamed from: w */
        Object f31943w;

        /* JADX INFO: renamed from: x */
        Object f31944x;

        /* JADX INFO: renamed from: y */
        int f31945y;

        /* JADX INFO: renamed from: z */
        int f31946z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C10535e.this.new d(interfaceC30057d);
            dVar.f31941E = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31946z;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (C10535e.this.whoopStrapProxy.mo106493f() != null) {
                        C10535e.this.logger.mo85228t("Updating User Strap History Table", new AbstractC30556a.a[0]);
                        C10535e c10535e = C10535e.this;
                        WhoopStrapInfo whoopStrapInfoMo106493f = c10535e.whoopStrapProxy.mo106493f();
                        AbstractC22676k.m65747g(whoopStrapInfoMo106493f);
                        String serialNumber = whoopStrapInfoMo106493f.getSerialNumber();
                        WhoopStrapInfo whoopStrapInfoMo106493f2 = c10535e.whoopStrapProxy.mo106493f();
                        AbstractC22676k.m65747g(whoopStrapInfoMo106493f2);
                        RecordUserStrapRequestBody recordUserStrapRequestBody = new RecordUserStrapRequestBody(serialNumber, whoopStrapInfoMo106493f2.getCpuId());
                        RemoteDataSource remoteDataSource = c10535e.remoteDataSource;
                        this.f31941E = null;
                        this.f31943w = null;
                        this.f31944x = null;
                        this.f31945y = 0;
                        this.f31946z = 1;
                        obj = remoteDataSource.recordUserStrap(recordUserStrapRequestBody, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    return C23454a0.f92919a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM107888l = (C29218v0) obj;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            C10535e c10535e2 = C10535e.this;
            if (!(objM107888l instanceof C23467m)) {
                PreferenceHelper preferenceHelper = c10535e2.preferenceHelper;
                WhoopStrapInfo whoopStrapInfoMo106493f3 = c10535e2.whoopStrapProxy.mo106493f();
                AbstractC22676k.m65747g(whoopStrapInfoMo106493f3);
                preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL, whoopStrapInfoMo106493f3.getSerialNumber());
            }
            C10535e c10535e3 = C10535e.this;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                AbstractC36685b.m117760b(thM68037a, "Caught an exception recording user strap details", c10535e3.logger, null, 8, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$onStrapConnectedForExistingUserV2$1", m100430f = "ConnectStrapViewModel.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f31947E;

        /* JADX INFO: renamed from: w */
        int f31948w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f31949x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f31950y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C10535e f31951z;

        /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.e$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$onStrapConnectedForExistingUserV2$1$response$1", m100430f = "ConnectStrapViewModel.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f31952w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10535e f31953x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f31954y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f31955z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10535e c10535e, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f31953x = c10535e;
                this.f31954y = str;
                this.f31955z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31953x, this.f31954y, this.f31955z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f31952w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    MembershipAdjustmentApi membershipAdjustmentApi = this.f31953x.membershipAdjustmentApi;
                    AdjustMembershipBody adjustMembershipBody = new AdjustMembershipBody(this.f31954y, this.f31955z);
                    this.f31952w = 1;
                    if (membershipAdjustmentApi.postMembershipAdjustment(adjustMembershipBody, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, C10535e c10535e, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31949x = str;
            this.f31950y = str2;
            this.f31951z = c10535e;
            this.f31947E = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f31949x, this.f31950y, this.f31951z, this.f31947E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            e eVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31948w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str2 = this.f31949x;
                if (str2 == null || str2.length() == 0 || (str = this.f31950y) == null || str.length() == 0) {
                    this.f31951z.logger.mo85222m("No strap is paired", new AbstractC30556a.a[0]);
                } else {
                    InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n = this.f31951z.logger;
                    a aVar = new a(this.f31951z, this.f31949x, this.f31950y, null);
                    this.f31948w = 1;
                    eVar = this;
                    obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar, eVar, 6, null);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            eVar = this;
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                eVar.f31951z.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL, eVar.f31949x);
                eVar.f31947E.invoke();
            } else {
                if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.f31951z.m27169K();
            }
            return C23454a0.f92919a;
        }
    }

    public C10535e(InterfaceC34116n logger, OnboardingRepository onboardingRepository, C28150c appDiagnostics, RemoteDataSource remoteDataSource, PreferenceHelper preferenceHelper, InterfaceC33704b whoopStrapProxy, InterfaceC4733b whoopStrapProvider, FeatureFlagChecker featureFlagChecker, MembershipAdjustmentApi membershipAdjustmentApi) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(onboardingRepository, "onboardingRepository");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(membershipAdjustmentApi, "membershipAdjustmentApi");
        this.logger = logger;
        this.onboardingRepository = onboardingRepository;
        this.appDiagnostics = appDiagnostics;
        this.remoteDataSource = remoteDataSource;
        this.preferenceHelper = preferenceHelper;
        this.whoopStrapProxy = whoopStrapProxy;
        this.whoopStrapProvider = whoopStrapProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.membershipAdjustmentApi = membershipAdjustmentApi;
        this.viewStateLiveData = new C1630u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m27148B(C10535e c10535e, AbstractC30495l abstractC30495l) {
        AbstractC22676k.m65747g(abstractC30495l);
        c10535e.m27152H(abstractC30495l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m27149C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final Map<String, String> m27150F(OnboardingInfo onboardingInfo, String strapSerial) {
        String str;
        String str2;
        String name;
        C23465k c23465k = new C23465k("Account Type", onboardingInfo.getStrapMembershipStatus().getValue());
        if (onboardingInfo.isUsedStrap()) {
            str = "No";
            str2 = str;
        } else {
            str2 = "No";
            str = "Yes";
        }
        C23465k c23465k2 = new C23465k("New Strap?", str);
        C23465k c23465k3 = new C23465k("Invite Code Required?", onboardingInfo.getRequireTeamCode() ? "Yes" : str2);
        OnboardingTeamInfo teamInfo = onboardingInfo.getTeamInfo();
        if (teamInfo == null || (name = teamInfo.getName()) == null) {
            name = "";
        }
        return AbstractC25247g0.m74000i0(AbstractC25260n.m74077r0(new C23465k[]{c23465k, c23465k2, c23465k3, new C23465k("Team Name", name), new C23465k("Strap Generation", this.onboardingRepository.getStrapGeneration()), new C23465k("strap_serial", strapSerial), onboardingInfo.isUsedStrap() ? new C23465k("free_months_applied", String.valueOf(onboardingInfo.getNumScooterTrialMonths())) : null}));
    }

    /* JADX INFO: renamed from: G */
    private final void m27151G(C30503t event) {
        String serialNumber;
        String strapSignature;
        if (!this.isOnboarding) {
            this.viewStateLiveData.postValue(new C30504u(null, null, event.getStrapGen(), 3, null));
            return;
        }
        WhoopStrapInfo strapInfo = event.getStrapInfo();
        String str = "";
        if (strapInfo == null || (serialNumber = strapInfo.getSerialNumber()) == null) {
            serialNumber = "";
        }
        WhoopStrapInfo strapInfo2 = event.getStrapInfo();
        if (strapInfo2 != null && (strapSignature = strapInfo2.getStrapSignature()) != null) {
            str = strapSignature;
        }
        m27170y(serialNumber, str, event.getStrapGen());
    }

    /* JADX INFO: renamed from: H */
    private final void m27152H(AbstractC30495l viewEvent) {
        if (!(viewEvent instanceof C30503t)) {
            throw new NoWhenBranchMatchedException();
        }
        m27151G((C30503t) viewEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: w */
    public final Object m27164w(InterfaceC30057d<? super AbstractC10536f> interfaceC30057d) {
        a aVar;
        WhoopStrapInfo whoopStrapInfo;
        WhoopStrapInfo whoopStrapInfo2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f31927F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f31927F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f31931z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f31927F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
            String serialNumber = (interfaceC21750d == null || (whoopStrapInfo2 = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfo2.getSerialNumber();
            String strapSignature = (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfo.getStrapSignature();
            if (serialNumber == null || serialNumber.length() == 0 || strapSignature == null || strapSignature.length() == 0) {
                return AbstractC10536f.a.f31956a;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(serialNumber, strapSignature, null);
            aVar2.f31928w = null;
            aVar2.f31929x = null;
            aVar2.f31930y = null;
            aVar2.f31927F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((InterfaceC34385a.c) interfaceC34385a).m108735a() != null ? AbstractC10536f.c.f31958a : AbstractC10536f.b.f31957a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return ((interfaceC34385a instanceof InterfaceC34385a.b.a) && ((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode() == 404) ? AbstractC10536f.b.f31957a : AbstractC10536f.a.f31956a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: A */
    public final void m27165A(boolean isOnboarding, C38280g<AbstractC30495l> viewEvents) {
        AbstractC22676k.m65750j(viewEvents, "viewEvents");
        this.isOnboarding = isOnboarding;
        viewEvents.m122652B(C40634a.m131874a()).m122661K(new C27566m0(new C29124b(this, 15), 14));
    }

    /* JADX INFO: renamed from: D */
    public final void m27166D() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: E */
    public final void m27167E(InterfaceC4339a onSuccess) {
        WhoopStrapInfo whoopStrapInfo;
        WhoopStrapInfo whoopStrapInfo2;
        AbstractC22676k.m65750j(onSuccess, "onSuccess");
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e((interfaceC21750d == null || (whoopStrapInfo2 = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfo2.getSerialNumber(), (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfo.getStrapSignature(), this, onSuccess, null), 3);
    }

    /* JADX INFO: renamed from: I */
    public final Object m27168I(InterfaceC30057d<? super AbstractC10536f> interfaceC30057d) {
        return this.featureFlagChecker.isFeatureEnabled("membership-adjustment-android") ? m27164w(interfaceC30057d) : AbstractC10536f.b.f31957a;
    }

    /* JADX INFO: renamed from: K */
    public final void m27169K() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        if (interfaceC21750d != null) {
            interfaceC21750d.mo24690G0();
        }
        this.whoopStrapProxy.mo106499l();
    }

    /* JADX INFO: renamed from: y */
    public final void m27170y(String strapSerial, String strapSignature, EnumC32978v strapGen) {
        AbstractC22676k.m65750j(strapSerial, "strapSerial");
        AbstractC22676k.m65750j(strapSignature, "strapSignature");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(strapSerial, strapSignature, strapGen, null), 3);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C1630u0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }
}

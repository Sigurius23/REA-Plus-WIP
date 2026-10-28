package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.C6529c;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import com.whoop.service.network.FeatureFlagsApi;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import in2.InterfaceC18732d;
import in2.InterfaceC18736h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import od1.C27858u;
import od1.InterfaceC27837a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import w02.AbstractC36685b;
import xg3.AbstractC38284k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u001d\u0010!J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b#\u0010$J\u0018\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b#\u0010%J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b&\u0010$J\u0018\u0010&\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\nH\u0096@¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0007¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b00H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b04¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\nH\u0096@¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020+H\u0017¢\u0006\u0004\b8\u0010/J\u0017\u0010;\u001a\u00020+2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\nH\u0082@¢\u0006\u0004\b?\u0010(J\u000f\u0010@\u001a\u00020+H\u0002¢\u0006\u0004\b@\u0010/J\u000f\u0010A\u001a\u00020+H\u0002¢\u0006\u0004\bA\u0010/J\u0010\u0010B\u001a\u00020+H\u0082@¢\u0006\u0004\bB\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010KR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b000S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b000V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006d"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Lin2/d;", "dispatcherFactory", "Lin2/h;", "Lxg3/k;", "Lcom/whoop/ui/util/SchedulerFactory;", "schedulerFactory", "Lcom/whoop/service/network/FeatureFlagsApi;", "api", "", "fetchEnabled", "Lu92/d;", "featurePrefs", "", "fetchInterval", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "applicationCoroutineScope", "Lod1/u;", "userContext", "Ll83/h;", "Liy1/c;", "metricWriter", "<init>", "(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;)V", "", "featureName", "isFeatureEnabled", "(Ljava/lang/String;)Z", "Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "featureFlag", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z", "featureFlagName", "isOnboardingFeatureFlagTurnedOn", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;", "isOnboardingFeatureFlagTurnedOnV2", "loadFeatureFlags", "(Lq83/d;)Ljava/lang/Object;", "", "updatedFeatureFlagsSaved", "Ll83/a0;", "saveFeatureFlagsList", "(Ljava/util/List;)V", "resetFeatureFlagsForUiTests", "()V", "", "flags", "addValueToStreams", "(Ljava/util/Set;)V", "", "fetchFeatureFlagForDebugSettings", "()Ljava/util/Set;", "resetFeatureFlagsToNormalFromDebugSettings", "cancelFeatureFlagPeriodicFetch", "Lod1/a0;", "userSessionManager", "subscribeToUserChangeEvents", "(Lod1/a0;)V", "removeOnboardingFeatureFlag", "(Ljava/lang/String;)V", "fetchFeatureFlags", "initializeLoadingFeatureFlags", "startFeatureFlagPeriodicFetch", "periodicFetchOnboardingFlags", "Lin2/d;", "Lin2/h;", "Lcom/whoop/service/network/FeatureFlagsApi;", "Z", "Lu92/d;", "J", "Lrr2/c;", "Lbc3/c0;", "Lod1/u;", "Ll83/h;", "Lmc3/a;", "mutex", "Lmc3/a;", "Lbc3/k1;", "fetchJob", "Lbc3/k1;", "Lec3/o1;", "_flagsMutableFlow", "Lec3/o1;", "Lec3/t1;", "featureFlagsFlow", "Lec3/t1;", "getFeatureFlagsFlow", "()Lec3/t1;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "featureFlags", "Ljava/util/concurrent/CopyOnWriteArraySet;", "onboardingFeatureFlags", "Ltr2/n;", "logger", "Ltr2/n;", "getLogger", "()Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FeatureFlagRepositoryImpl implements FeatureFlagRepository {
    private final InterfaceC13072o1 _flagsMutableFlow;
    private final FeatureFlagsApi api;
    private final InterfaceC2994c0 applicationCoroutineScope;
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final CopyOnWriteArraySet<String> featureFlags;
    private final InterfaceC13087t1 featureFlagsFlow;
    private final C34660d featurePrefs;
    private boolean fetchEnabled;
    private final long fetchInterval;
    private InterfaceC3027k1 fetchJob;
    private final InterfaceC34116n logger;
    private final InterfaceC23462h metricWriter;
    private final InterfaceC25435a mutex;
    private final CopyOnWriteArraySet<String> onboardingFeatureFlags;
    private final InterfaceC18736h<AbstractC38284k> schedulerFactory;
    private final C27858u userContext;

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$fetchFeatureFlags$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {218}, m100432m = "fetchFeatureFlags", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65581 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65581(InterfaceC30057d<? super C65581> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureFlagRepositoryImpl.this.fetchFeatureFlags(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$fetchFeatureFlags$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl$fetchFeatureFlags$2", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {218}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65592 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65592(InterfaceC30057d<? super C65592> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return FeatureFlagRepositoryImpl.this.new C65592(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<String>> interfaceC30057d) {
            return ((C65592) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FeatureFlagsApi featureFlagsApi = FeatureFlagRepositoryImpl.this.api;
            this.label = 1;
            Object featureFlags = featureFlagsApi.getFeatureFlags(this);
            return featureFlags == enumC31071a ? enumC31071a : featureFlags;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {86}, m100432m = "isOnboardingFeatureFlagTurnedOn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65601 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65601(InterfaceC30057d<? super C65601> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureFlagRepositoryImpl.this.isOnboardingFeatureFlagTurnedOn((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {113, 320}, m100432m = "isOnboardingFeatureFlagTurnedOnV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65621 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C65621(InterfaceC30057d<? super C65621> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureFlagRepositoryImpl.this.isOnboardingFeatureFlagTurnedOnV2((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$2", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65632 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $featureFlagName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65632(String str, InterfaceC30057d<? super C65632> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$featureFlagName = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return FeatureFlagRepositoryImpl.this.new C65632(this.$featureFlagName, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FeatureFlagsApi featureFlagsApi = FeatureFlagRepositoryImpl.this.api;
            String str = this.$featureFlagName;
            this.label = 1;
            Object objIsOnboardingFeatureFlagTurnedOn = featureFlagsApi.isOnboardingFeatureFlagTurnedOn(str, this);
            return objIsOnboardingFeatureFlagTurnedOn == enumC31071a ? enumC31071a : objIsOnboardingFeatureFlagTurnedOn;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C65632) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$loadFeatureFlags$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {152, 153}, m100432m = "loadFeatureFlags", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65641 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65641(InterfaceC30057d<? super C65641> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureFlagRepositoryImpl.this.loadFeatureFlags(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {280, 282, 285, 287}, m100432m = "periodicFetchOnboardingFlags", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65651 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C65651(InterfaceC30057d<? super C65651> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureFlagRepositoryImpl.this.periodicFetchOnboardingFlags(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {261, 264, 269, 270}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65661 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65661(InterfaceC30057d<? super C65661> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return FeatureFlagRepositoryImpl.this.new C65661(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65661) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0036  */
        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        /* JADX WARN: Code duplicated, block: B:23:0x0065  */
        /* JADX WARN: Code duplicated, block: B:27:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:17:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.label
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L28
                if (r1 == r6) goto L24
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                goto L24
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L7d
            L20:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L4d
            L24:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L36
            L28:
                p505ts.AbstractC34132o.m107864I(r9)
                r8.label = r6
                r6 = 100
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r6, r8)
                if (r9 != r0) goto L36
                goto L8b
            L36:
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                od1.u r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.access$getUserContext$p(r9)
                boolean r9 = r9.m84058i()
                if (r9 == 0) goto L65
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                r8.label = r5
                java.lang.Object r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.access$fetchFeatureFlags(r9, r8)
                if (r9 != r0) goto L4d
                goto L8b
            L4d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r1 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                tr2.n r1 = r1.getLogger()
                java.lang.String r6 = "end fetching feature flags success = "
                java.lang.String r9 = p000.AbstractC11266d.m30462p(r6, r9)
                qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r2]
                r1.mo85228t(r9, r6)
                goto L72
            L65:
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                tr2.n r9 = r9.getLogger()
                java.lang.String r1 = "skipped fetching flags: no user"
                qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r2]
                r9.mo85228t(r1, r6)
            L72:
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                r8.label = r4
                java.lang.Object r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.access$periodicFetchOnboardingFlags(r9, r8)
                if (r9 != r0) goto L7d
                goto L8b
            L7d:
                com.whoop.data.repositories.FeatureFlagRepositoryImpl r9 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.this
                long r6 = com.whoop.data.repositories.FeatureFlagRepositoryImpl.access$getFetchInterval$p(r9)
                r8.label = r3
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r6, r8)
                if (r9 != r0) goto L36
            L8b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.FeatureFlagRepositoryImpl.C65661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureFlagRepositoryImpl(InterfaceC18732d dispatcherFactory, InterfaceC18736h<? extends AbstractC38284k> schedulerFactory, FeatureFlagsApi api, boolean z4, C34660d featurePrefs, long j7, InterfaceC31766c crashReporter, InterfaceC2994c0 applicationCoroutineScope, C27858u userContext, InterfaceC23462h metricWriter) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(schedulerFactory, "schedulerFactory");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(featurePrefs, "featurePrefs");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(applicationCoroutineScope, "applicationCoroutineScope");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.dispatcherFactory = dispatcherFactory;
        this.schedulerFactory = schedulerFactory;
        this.api = api;
        this.fetchEnabled = z4;
        this.featurePrefs = featurePrefs;
        this.fetchInterval = j7;
        this.crashReporter = crashReporter;
        this.applicationCoroutineScope = applicationCoroutineScope;
        this.userContext = userContext;
        this.metricWriter = metricWriter;
        this.mutex = AbstractC25438d.m74669a();
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        this._flagsMutableFlow = c13096w1M36592b;
        this.featureFlagsFlow = AbstractC13091v.m36597g(c13096w1M36592b);
        this.featureFlags = new CopyOnWriteArraySet<>();
        this.onboardingFeatureFlags = new CopyOnWriteArraySet<>();
        this.logger = InterfaceC34116n.INSTANCE.m107848a("FeatureFlagRepository");
        this.fetchEnabled = this.fetchEnabled && !featurePrefs.m109528e(FeatureFlagRepositoryImplKt.OVERRIDE_FEATURE_FLAGS, false);
        initializeLoadingFeatureFlags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchFeatureFlags(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        C65581 c65581;
        if (interfaceC30057d instanceof C65581) {
            c65581 = (C65581) interfaceC30057d;
            int i13 = c65581.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65581.label = i13 - Integer.MIN_VALUE;
            } else {
                c65581 = new C65581(interfaceC30057d);
            }
        } else {
            c65581 = new C65581(interfaceC30057d);
        }
        Object objM8705K = c65581.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65581.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                if (!this.fetchEnabled) {
                    return Boolean.TRUE;
                }
                this.logger.mo85228t("getting feature flags from api", new AbstractC30556a.a[0]);
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                C65592 c65592 = new C65592(null);
                c65581.label = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, c65592, c65581);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            List<String> list = (List) objM8705K;
            this.logger.mo85228t(AbstractC2875y.m8296i(list.size(), "Got ", " feature flags from api"), new AbstractC30556a.a[0]);
            synchronized (this.featureFlags) {
                this.featureFlags.clear();
                this.featureFlags.addAll(list);
            }
            addValueToStreams(this.featureFlags);
            this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_FEATURES, list);
            return Boolean.TRUE;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Failed to fetch feature flags:", this.logger, null, 8, null);
            return Boolean.FALSE;
        }
    }

    private final void initializeLoadingFeatureFlags() {
        List<String> listM109535l = this.featurePrefs.m109535l(FeatureFlagRepositoryImplKt.TAG_FEATURES);
        this.featureFlags.clear();
        this.featureFlags.addAll(listM109535l);
        addValueToStreams(this.featureFlags);
        List<String> listM109535l2 = this.featurePrefs.m109535l(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES);
        this.onboardingFeatureFlags.clear();
        this.onboardingFeatureFlags.addAll(AbstractC25265s.m74101H1(listM109535l2));
        startFeatureFlagPeriodicFetch();
        this.logger.mo85228t("init completed", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r1.mo58700a(r11, r2) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        if (r1.mo58700a(r11, r2) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object periodicFetchOnboardingFlags(q83.InterfaceC30057d<? super l83.C23454a0> r20) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.FeatureFlagRepositoryImpl.periodicFetchOnboardingFlags(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence periodicFetchOnboardingFlags$lambda$4(String str) {
        return AbstractC11895b.m31996o("\"", str, "\"");
    }

    private final void removeOnboardingFeatureFlag(String featureFlagName) {
        this.onboardingFeatureFlags.remove(featureFlagName);
        this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES, AbstractC25265s.m74093D1(this.onboardingFeatureFlags));
    }

    private final void startFeatureFlagPeriodicFetch() {
        cancelFeatureFlagPeriodicFetch();
        this.logger.mo85228t("starting new periodic FF fetch", new AbstractC30556a.a[0]);
        this.fetchJob = AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new C65661(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 subscribeToUserChangeEvents$lambda$0(FeatureFlagRepositoryImpl featureFlagRepositoryImpl, Logout logout) {
        featureFlagRepositoryImpl.logger.mo85216g("User logged out. Resetting feature flags", new AbstractC30556a.a[0]);
        C34660d c34660d = featureFlagRepositoryImpl.featurePrefs;
        C25271y c25271y = C25271y.f99162w;
        c34660d.m109544w(FeatureFlagRepositoryImplKt.TAG_FEATURES, c25271y);
        featureFlagRepositoryImpl.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES, c25271y);
        featureFlagRepositoryImpl.addValueToStreams(C25235a0.f99113w);
        featureFlagRepositoryImpl.cancelFeatureFlagPeriodicFetch();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 subscribeToUserChangeEvents$lambda$2(FeatureFlagRepositoryImpl featureFlagRepositoryImpl, Login login) {
        featureFlagRepositoryImpl.startFeatureFlagPeriodicFetch();
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public void addValueToStreams(Set<String> flags) {
        AbstractC22676k.m65750j(flags, "flags");
        this._flagsMutableFlow.mo36564a(flags);
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public void cancelFeatureFlagPeriodicFetch() {
        InterfaceC3027k1 interfaceC3027k1 = this.fetchJob;
        if (interfaceC3027k1 != null) {
            this.logger.mo85228t("cancelling existing periodic FF fetch", new AbstractC30556a.a[0]);
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public final Set<String> fetchFeatureFlagForDebugSettings() {
        this.fetchEnabled = false;
        return this.featureFlags;
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public InterfaceC13087t1 getFeatureFlagsFlow() {
        return this.featureFlagsFlow;
    }

    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(String featureName) {
        AbstractC22676k.m65750j(featureName, "featureName");
        return this.featureFlags.contains(featureName) || this.onboardingFeatureFlags.contains(featureName);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object isOnboardingFeatureFlagTurnedOn(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C65601 c65601;
        if (interfaceC30057d instanceof C65601) {
            c65601 = (C65601) interfaceC30057d;
            int i13 = c65601.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65601.label = i13 - Integer.MIN_VALUE;
            } else {
                c65601 = new C65601(interfaceC30057d);
            }
        } else {
            c65601 = new C65601(interfaceC30057d);
        }
        Object objM8705K = c65601.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65601.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                C6561x12360e4e c6561x12360e4e = new C6561x12360e4e(this, str, null);
                c65601.L$0 = str;
                c65601.label = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, c6561x12360e4e, c65601);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c65601.L$0;
                AbstractC34132o.m107864I(objM8705K);
            }
            Boolean bool = (Boolean) objM8705K;
            if (bool.booleanValue()) {
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(this.featurePrefs.m109535l(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES));
                arrayListM74097F1.add(str);
                this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES, arrayListM74097F1);
                synchronized (this.onboardingFeatureFlags) {
                    this.onboardingFeatureFlags.clear();
                    this.onboardingFeatureFlags.addAll(arrayListM74097F1);
                }
            } else {
                removeOnboardingFeatureFlag(str);
            }
            return bool;
        } catch (Throwable th3) {
            removeOnboardingFeatureFlag(str);
            AbstractC36685b.m117759a(th3, "Failed to fetch onboarding feature flags", this.logger, this.crashReporter);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:26:0x008d, B:28:0x00a8, B:32:0x00b2, B:31:0x00af), top: B:51:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:26:0x008d, B:28:0x00a8, B:32:0x00b2, B:31:0x00af), top: B:51:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object isOnboardingFeatureFlagTurnedOnV2(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C65621 c65621;
        boolean zContains;
        String str2;
        InterfaceC25435a interfaceC25435a;
        InterfaceC34385a interfaceC34385a;
        ArrayList arrayListM74097F1;
        if (interfaceC30057d instanceof C65621) {
            c65621 = (C65621) interfaceC30057d;
            int i13 = c65621.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65621.label = i13 - Integer.MIN_VALUE;
            } else {
                c65621 = new C65621(interfaceC30057d);
            }
        } else {
            c65621 = new C65621(interfaceC30057d);
        }
        C65621 c65622 = c65621;
        Object objM108729b = c65622.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65622.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            C65632 c65632 = new C65632(str, null);
            c65622.L$0 = str;
            c65622.label = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c65632, c65622, 6, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            str = (String) c65622.L$0;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) c65622.L$2;
            interfaceC34385a = (InterfaceC34385a) c65622.L$1;
            str2 = (String) c65622.L$0;
            AbstractC34132o.m107864I(objM108729b);
        }
        try {
            arrayListM74097F1 = AbstractC25265s.m74097F1(this.featurePrefs.m109536o(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES));
            if (((Boolean) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).booleanValue()) {
                arrayListM74097F1.add(str2);
            } else {
                arrayListM74097F1.remove(str2);
            }
            this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES, arrayListM74097F1);
            this.onboardingFeatureFlags.clear();
            this.onboardingFeatureFlags.addAll(arrayListM74097F1);
            zContains = ((Boolean) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).booleanValue();
            return Boolean.valueOf(zContains);
        } finally {
            interfaceC25435a.mo68214i(null);
        }
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        boolean zContains2 = false;
        if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
            InterfaceC25435a interfaceC25435a2 = this.mutex;
            c65622.L$0 = str;
            c65622.L$1 = interfaceC34385a2;
            c65622.L$2 = interfaceC25435a2;
            c65622.L$3 = null;
            c65622.I$0 = 0;
            c65622.I$1 = 0;
            c65622.label = 2;
            if (interfaceC25435a2.mo68211b(c65622) != enumC31071a) {
                str2 = str;
                interfaceC25435a = interfaceC25435a2;
                interfaceC34385a = interfaceC34385a2;
                arrayListM74097F1 = AbstractC25265s.m74097F1(this.featurePrefs.m109536o(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES));
                if (((Boolean) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).booleanValue()) {
                    arrayListM74097F1.add(str2);
                } else {
                    arrayListM74097F1.remove(str2);
                }
                this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_ONBOARDING_FEATURES, arrayListM74097F1);
                this.onboardingFeatureFlags.clear();
                this.onboardingFeatureFlags.addAll(arrayListM74097F1);
                zContains = ((Boolean) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).booleanValue();
            }
            return enumC31071a;
        }
        if (interfaceC34385a2 instanceof InterfaceC34385a.b.a) {
            if (((InterfaceC34385a.b.a) interfaceC34385a2).getErrorCode() == 404) {
                removeOnboardingFeatureFlag(str);
            } else {
                zContains2 = this.onboardingFeatureFlags.contains(str);
            }
            return Boolean.valueOf(zContains2);
        }
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.b.C42432b)) {
            throw new NoWhenBranchMatchedException();
        }
        zContains = this.onboardingFeatureFlags.contains(str);
        return Boolean.valueOf(zContains);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object loadFeatureFlags(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        C65641 c65641;
        if (interfaceC30057d instanceof C65641) {
            c65641 = (C65641) interfaceC30057d;
            int i13 = c65641.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65641.label = i13 - Integer.MIN_VALUE;
            } else {
                c65641 = new C65641(interfaceC30057d);
            }
        } else {
            c65641 = new C65641(interfaceC30057d);
        }
        Object obj = c65641.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c65641.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c65641.label = 1;
            if (periodicFetchOnboardingFlags(c65641) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        c65641.label = 2;
        Object objFetchFeatureFlags = fetchFeatureFlags(c65641);
        return objFetchFeatureFlags == obj2 ? obj2 : objFetchFeatureFlags;
    }

    public final void resetFeatureFlagsForUiTests() {
        this.logger.mo85228t("test clearing feature flags", new AbstractC30556a.a[0]);
        this.featureFlags.clear();
        addValueToStreams(this.featureFlags);
        this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_FEATURES, C25271y.f99162w);
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object resetFeatureFlagsToNormalFromDebugSettings(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        this.fetchEnabled = true;
        return loadFeatureFlags(interfaceC30057d);
    }

    public final void saveFeatureFlagsList(List<String> updatedFeatureFlagsSaved) {
        AbstractC22676k.m65750j(updatedFeatureFlagsSaved, "updatedFeatureFlagsSaved");
        this.logger.mo85228t(AbstractC11266d.m30461o("test saving feature flags: ", AbstractC25265s.m74110N0(updatedFeatureFlagsSaved, null, null, null, null, 63)), new AbstractC30556a.a[0]);
        this.featureFlags.clear();
        this.featureFlags.addAll(updatedFeatureFlagsSaved);
        addValueToStreams(this.featureFlags);
        this.featurePrefs.m109544w(FeatureFlagRepositoryImplKt.TAG_FEATURES, updatedFeatureFlagsSaved);
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public void subscribeToUserChangeEvents(InterfaceC27837a0 userSessionManager) {
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        final int i13 = 0;
        userSessionManager.mo83920j().m122652B(this.schedulerFactory.mo54469a()).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FeatureFlagRepositoryImpl f25442x;

            {
                this.f25442x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return FeatureFlagRepositoryImpl.subscribeToUserChangeEvents$lambda$0(this.f25442x, (Logout) obj);
                    default:
                        return FeatureFlagRepositoryImpl.subscribeToUserChangeEvents$lambda$2(this.f25442x, (Login) obj);
                }
            }
        }, 2));
        final int i14 = 1;
        userSessionManager.mo83915e().m122652B(this.schedulerFactory.mo54469a()).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ FeatureFlagRepositoryImpl f25442x;

            {
                this.f25442x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return FeatureFlagRepositoryImpl.subscribeToUserChangeEvents$lambda$0(this.f25442x, (Logout) obj);
                    default:
                        return FeatureFlagRepositoryImpl.subscribeToUserChangeEvents$lambda$2(this.f25442x, (Login) obj);
                }
            }
        }, 3));
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(OnboardingFeatureFlag featureFlag) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        return isFeatureEnabled(featureFlag.getFlagName());
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object isOnboardingFeatureFlagTurnedOn(OnboardingFeatureFlag onboardingFeatureFlag, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return isOnboardingFeatureFlagTurnedOn(onboardingFeatureFlag.getFlagName(), interfaceC30057d);
    }

    public /* synthetic */ FeatureFlagRepositoryImpl(InterfaceC18732d interfaceC18732d, InterfaceC18736h interfaceC18736h, FeatureFlagsApi featureFlagsApi, boolean z4, C34660d c34660d, long j7, InterfaceC31766c interfaceC31766c, InterfaceC2994c0 interfaceC2994c0, C27858u c27858u, InterfaceC23462h interfaceC23462h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18732d, interfaceC18736h, featureFlagsApi, z4, c34660d, (i13 & 32) != 0 ? 600000L : j7, interfaceC31766c, interfaceC2994c0, c27858u, interfaceC23462h);
    }

    @Override // com.whoop.data.repositories.FeatureFlagRepository
    public Object isOnboardingFeatureFlagTurnedOnV2(OnboardingFeatureFlag onboardingFeatureFlag, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return isOnboardingFeatureFlagTurnedOnV2(onboardingFeatureFlag.getFlagName(), interfaceC30057d);
    }
}

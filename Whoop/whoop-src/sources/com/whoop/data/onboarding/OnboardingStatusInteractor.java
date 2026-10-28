package com.whoop.data.onboarding;

import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bh3.InterfaceC3255b;
import c93.InterfaceC4351m;
import com.whoop.cache.api.prefetch.PrefetchEntry;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingStatusFetchCadenceMillis;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import in2.InterfaceC18732d;
import in2.InterfaceC18736h;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import od1.C27858u;
import od1.InterfaceC27837a0;
import om0.AbstractC28024a;
import om0.C28026c;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import xg3.AbstractC38284k;
import y92.C39352a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J/\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0)H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020!H\u0007¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020!H\u0002¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020!H\u0002¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020!H\u0082@¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020!H\u0002¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020!H\u0002¢\u0006\u0004\b5\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001e\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatusInteractor;", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lbc3/c0;", "applicationCoroutineScope", "Lod1/u;", "userContext", "Lcom/whoop/data/onboarding/OnboardingStatusApi;", "api", "Ljs0/c;", "configurationRepository", "Lod1/a0;", "userSessionManager", "Lin2/h;", "Lxg3/k;", "Lcom/whoop/ui/util/SchedulerFactory;", "schedulerFactory", "Lom0/c;", "prefetcher", "Ly92/a;", "authManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lin2/d;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lbc3/c0;Lod1/u;Lcom/whoop/data/onboarding/OnboardingStatusApi;Ljs0/c;Lod1/a0;Lin2/h;Lom0/c;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "", "shouldGoToFeatureEducation", "(Lcom/whoop/data/onboarding/FeatureEducationType;)Z", "Ll83/a0;", "retriggerOnboardingFetch", "()V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "", "", "mapToTrim", "filterOnboardingStatusMap", "(Ljava/util/Map;)Ljava/util/Map;", "cancelOnboardingStatusPeriodicFetch", "observeUserLoginEvents", "loadOnboardingStatusFromTable", "fetchOnboardingStatus", "(Lq83/d;)Ljava/lang/Object;", "storeEntriesInLocalDatabase", "startOnboardingStatusPeriodicFetch", "prefetchOverlays", "Lin2/d;", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "Lbc3/c0;", "Lod1/u;", "Lcom/whoop/data/onboarding/OnboardingStatusApi;", "Ljs0/c;", "Lod1/a0;", "Lin2/h;", "Lom0/c;", "Ly92/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "logger", "Ltr2/n;", "getLogger", "()Ltr2/n;", "", "onboardingStatus", "Ljava/util/Map;", "Lbc3/k1;", "fetchJob", "Lbc3/k1;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingStatusInteractor implements OnboardingStatusChecker {
    private final OnboardingStatusApi api;
    private final InterfaceC2994c0 applicationCoroutineScope;
    private final C39352a authManager;
    private final AbstractC21909c configurationRepository;
    private final InterfaceC18732d dispatcherFactory;
    private final FeatureFlagChecker featureFlagChecker;
    private InterfaceC3027k1 fetchJob;
    private final InterfaceC34116n logger;
    private final Map<FeatureEducationType, Boolean> onboardingStatus;
    private final OnboardingStatusDao onboardingStatusDao;
    private final C28026c prefetcher;
    private final InterfaceC18736h<AbstractC38284k> schedulerFactory;
    private final C27858u userContext;
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor", m100430f = "OnboardingStatusInteractor.kt", m100431l = {126, 148}, m100432m = "fetchOnboardingStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65201 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65201(InterfaceC30057d<? super C65201> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingStatusInteractor.this.fetchOnboardingStatus(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$2", m100430f = "OnboardingStatusInteractor.kt", m100431l = {128, 132}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/Map;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65212 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int label;

        public C65212(InterfaceC30057d<? super C65212> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OnboardingStatusInteractor.this.new C65212(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Map<String, Boolean>> interfaceC30057d) {
            return ((C65212) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0062 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r5 == r0) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                return r5
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L3c
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.data.onboarding.OnboardingStatusInteractor r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                com.whoop.data.repositories.FeatureFlagChecker r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getFeatureFlagChecker$p(r5)
                java.lang.String r1 = "new-auth-user-storage-android"
                boolean r5 = r5.isFeatureEnabled(r1)
                if (r5 == 0) goto L47
                com.whoop.data.onboarding.OnboardingStatusInteractor r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                y92.a r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getAuthManager$p(r5)
                r4.label = r3
                java.lang.Object r5 = r5.m125479b(r4)
                if (r5 != r0) goto L3c
                goto L61
            L3c:
                com.whoop.domain.model.User r5 = (com.whoop.domain.model.User) r5
                if (r5 == 0) goto L45
                int r5 = r5.getId()
                goto L51
            L45:
                r5 = 0
                goto L51
            L47:
                com.whoop.data.onboarding.OnboardingStatusInteractor r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                od1.u r5 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getUserContext$p(r5)
                int r5 = r5.m84056g()
            L51:
                com.whoop.data.onboarding.OnboardingStatusInteractor r1 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                com.whoop.data.onboarding.OnboardingStatusApi r1 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getApi$p(r1)
                r4.I$0 = r5
                r4.label = r2
                java.lang.Object r5 = r1.getOnboardingStatus(r5, r4)
                if (r5 != r0) goto L62
            L61:
                return r0
            L62:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.onboarding.OnboardingStatusInteractor.C65212.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$loadOnboardingStatusFromTable$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor$loadOnboardingStatusFromTable$1", m100430f = "OnboardingStatusInteractor.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65221 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1", m100430f = "OnboardingStatusInteractor.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            int label;
            final /* synthetic */ OnboardingStatusInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OnboardingStatusInteractor onboardingStatusInteractor, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = onboardingStatusInteractor;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        OnboardingStatusDao onboardingStatusDao = this.this$0.onboardingStatusDao;
                        this.label = 1;
                        obj = onboardingStatusDao.getOnboardingStatus(this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    OnboardingStatusInteractor onboardingStatusInteractor = this.this$0;
                    for (OnboardingStatus onboardingStatus : (List) obj) {
                        onboardingStatusInteractor.onboardingStatus.put(onboardingStatus.getType(), Boolean.valueOf(onboardingStatus.isCompleted()));
                    }
                } catch (Exception e5) {
                    this.this$0.getLogger().mo85213c("Failed to retrieve cached onboarding status from DB", e5, new AbstractC30556a.a[0]);
                }
                return C23454a0.f92919a;
            }
        }

        public C65221(InterfaceC30057d<? super C65221> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OnboardingStatusInteractor.this.new C65221(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65221) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j interfaceC30063jMo54465b = OnboardingStatusInteractor.this.dispatcherFactory.mo54465b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OnboardingStatusInteractor.this, null);
                this.label = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, anonymousClass1, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$prefetchOverlays$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor$prefetchOverlays$1", m100430f = "OnboardingStatusInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65231 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65231(InterfaceC30057d<? super C65231> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OnboardingStatusInteractor.this.new C65231(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65231) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C28026c.m84524g(OnboardingStatusInteractor.this.prefetcher, AbstractC28024a.m84517a(new PrefetchEntry("onboarding-service/v1/overlay/all", (String) null, AbstractC37056f.m118958J("onboarding-overlay"), (Long) null, 10, (DefaultConstructorMarker) null)), false, 2, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1", m100430f = "OnboardingStatusInteractor.kt", m100431l = {174, 180, 182}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65241 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ long $periodicFetchCadence;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65241(long j7, InterfaceC30057d<? super C65241> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$periodicFetchCadence = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C65241 c65241 = OnboardingStatusInteractor.this.new C65241(this.$periodicFetchCadence, interfaceC30057d);
            c65241.L$0 = obj;
            return c65241;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65241) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:15:0x003c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:24:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x007d A[PHI: r2
          0x007d: PHI (r2v5 ??) = (r2v2 ??), (r2v2 ??), (r2v6 ??) binds: [B:23:0x005f, B:25:0x007a, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008b -> B:13:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.L$0
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.label
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L2b
                if (r2 == r6) goto L27
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                goto L2b
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                int r2 = r9.I$0
                java.lang.Object r7 = r9.L$1
                bc3.i0 r7 = (bc3.InterfaceC3018i0) r7
                p505ts.AbstractC34132o.m107864I(r10)
                goto L7d
            L27:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L4d
            L2b:
                p505ts.AbstractC34132o.m107864I(r10)
            L2e:
                com.whoop.data.onboarding.OnboardingStatusInteractor r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                com.whoop.data.repositories.FeatureFlagChecker r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getFeatureFlagChecker$p(r10)
                java.lang.String r2 = "new-auth-user-storage-android"
                boolean r10 = r10.isFeatureEnabled(r2)
                if (r10 == 0) goto L54
                com.whoop.data.onboarding.OnboardingStatusInteractor r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                y92.a r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getAuthManager$p(r10)
                r9.L$0 = r0
                r9.label = r6
                java.lang.Object r10 = r10.m125478a(r9)
                if (r10 != r1) goto L4d
                goto L8d
            L4d:
                if (r10 == 0) goto L51
                r2 = r6
                goto L5f
            L51:
                r10 = 0
            L52:
                r2 = r10
                goto L5f
            L54:
                com.whoop.data.onboarding.OnboardingStatusInteractor r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                od1.u r10 = com.whoop.data.onboarding.OnboardingStatusInteractor.access$getUserContext$p(r10)
                boolean r10 = r10.m84058i()
                goto L52
            L5f:
                if (r2 == 0) goto L7d
                com.whoop.data.onboarding.OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1$fetched$1 r10 = new com.whoop.data.onboarding.OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1$fetched$1
                com.whoop.data.onboarding.OnboardingStatusInteractor r7 = com.whoop.data.onboarding.OnboardingStatusInteractor.this
                r10.<init>(r7, r5)
                bc3.j0 r10 = bc3.AbstractC3006f0.m8711e(r0, r5, r10, r3)
                r9.L$0 = r0
                r9.L$1 = r5
                r9.I$0 = r2
                r9.label = r4
                java.lang.Object r10 = r10.m8817m(r9)
                r83.a r7 = r83.EnumC31071a.f128113w
                if (r10 != r1) goto L7d
                goto L8d
            L7d:
                long r7 = r9.$periodicFetchCadence
                r9.L$0 = r0
                r9.L$1 = r5
                r9.I$0 = r2
                r9.label = r3
                java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r7, r9)
                if (r10 != r1) goto L2e
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.onboarding.OnboardingStatusInteractor.C65241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.onboarding.OnboardingStatusInteractor$storeEntriesInLocalDatabase$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.onboarding.OnboardingStatusInteractor", m100430f = "OnboardingStatusInteractor.kt", m100431l = {157, 159}, m100432m = "storeEntriesInLocalDatabase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65261 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C65261(InterfaceC30057d<? super C65261> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingStatusInteractor.this.storeEntriesInLocalDatabase(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingStatusInteractor(InterfaceC18732d dispatcherFactory, OnboardingStatusDao onboardingStatusDao, InterfaceC2994c0 applicationCoroutineScope, C27858u userContext, OnboardingStatusApi api, AbstractC21909c configurationRepository, InterfaceC27837a0 userSessionManager, InterfaceC18736h<? extends AbstractC38284k> schedulerFactory, C28026c prefetcher, C39352a authManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(applicationCoroutineScope, "applicationCoroutineScope");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(schedulerFactory, "schedulerFactory");
        AbstractC22676k.m65750j(prefetcher, "prefetcher");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.dispatcherFactory = dispatcherFactory;
        this.onboardingStatusDao = onboardingStatusDao;
        this.applicationCoroutineScope = applicationCoroutineScope;
        this.userContext = userContext;
        this.api = api;
        this.configurationRepository = configurationRepository;
        this.userSessionManager = userSessionManager;
        this.schedulerFactory = schedulerFactory;
        this.prefetcher = prefetcher;
        this.authManager = authManager;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("OnboardingStatusInteractor");
        this.onboardingStatus = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (storeEntriesInLocalDatabase(r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchOnboardingStatus(q83.InterfaceC30057d<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.whoop.data.onboarding.OnboardingStatusInteractor.C65201
            if (r0 == 0) goto L13
            r0 = r8
            com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$1 r0 = (com.whoop.data.onboarding.OnboardingStatusInteractor.C65201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$1 r0 = new com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r1 = r0.L$1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L87
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L40
            goto L59
        L40:
            r8 = move-exception
            goto L8d
        L42:
            p505ts.AbstractC34132o.m107864I(r8)
            in2.d r8 = r7.dispatcherFactory     // Catch: java.lang.Exception -> L40
            q83.j r8 = r8.mo54465b()     // Catch: java.lang.Exception -> L40
            com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$2 r2 = new com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$2     // Catch: java.lang.Exception -> L40
            r2.<init>(r6)     // Catch: java.lang.Exception -> L40
            r0.label = r5     // Catch: java.lang.Exception -> L40
            java.lang.Object r8 = bc3.AbstractC3006f0.m8705K(r8, r2, r0)     // Catch: java.lang.Exception -> L40
            if (r8 != r1) goto L59
            goto L86
        L59:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L40
            java.util.Map r8 = r7.filterOnboardingStatusMap(r8)
            java.util.Map<com.whoop.data.onboarding.FeatureEducationType, java.lang.Boolean> r2 = r7.onboardingStatus
            monitor-enter(r2)
            java.util.Map<com.whoop.data.onboarding.FeatureEducationType, java.lang.Boolean> r5 = r7.onboardingStatus     // Catch: java.lang.Throwable -> L8a
            r5.clear()     // Catch: java.lang.Throwable -> L8a
            java.util.Map<com.whoop.data.onboarding.FeatureEducationType, java.lang.Boolean> r5 = r7.onboardingStatus     // Catch: java.lang.Throwable -> L8a
            r5.putAll(r8)     // Catch: java.lang.Throwable -> L8a
            tr2.n r8 = r7.logger     // Catch: java.lang.Throwable -> L8a
            java.util.Map<com.whoop.data.onboarding.FeatureEducationType, java.lang.Boolean> r5 = r7.onboardingStatus     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L8a
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]     // Catch: java.lang.Throwable -> L8a
            r8.mo85228t(r5, r3)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r7.storeEntriesInLocalDatabase(r0)
            if (r8 != r1) goto L87
        L86:
            return r1
        L87:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L8a:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L8d:
            tr2.n r0 = r7.logger
            java.lang.String r1 = "Failed to fetch onboarding status from API"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r3]
            r0.mo85213c(r1, r8, r2)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.onboarding.OnboardingStatusInteractor.fetchOnboardingStatus(q83.d):java.lang.Object");
    }

    private final void loadOnboardingStatusFromTable() {
        AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new C65221(null), 3);
    }

    private final void observeUserLoginEvents() {
        final int i13 = 0;
        final int i14 = 0;
        this.userSessionManager.mo83920j().m122652B(this.schedulerFactory.mo54469a()).m122662L(new C6529c(new Function1(this) { // from class: com.whoop.data.onboarding.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ OnboardingStatusInteractor f25422x;

            {
                this.f25422x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return OnboardingStatusInteractor.observeUserLoginEvents$lambda$0(this.f25422x, (Logout) obj);
                    default:
                        return OnboardingStatusInteractor.observeUserLoginEvents$lambda$3(this.f25422x, (Login) obj);
                }
            }
        }, i14), new InterfaceC3255b(this) { // from class: com.whoop.data.onboarding.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ OnboardingStatusInteractor f25426x;

            {
                this.f25426x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i14) {
                    case 0:
                        OnboardingStatusInteractor.observeUserLoginEvents$lambda$2(this.f25426x, (Throwable) obj);
                        break;
                    default:
                        OnboardingStatusInteractor.observeUserLoginEvents$lambda$5(this.f25426x, (Throwable) obj);
                        break;
                }
            }
        });
        final int i15 = 1;
        final int i16 = 1;
        this.userSessionManager.mo83915e().m122652B(this.schedulerFactory.mo54469a()).m122662L(new C6529c(new Function1(this) { // from class: com.whoop.data.onboarding.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ OnboardingStatusInteractor f25422x;

            {
                this.f25422x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return OnboardingStatusInteractor.observeUserLoginEvents$lambda$0(this.f25422x, (Logout) obj);
                    default:
                        return OnboardingStatusInteractor.observeUserLoginEvents$lambda$3(this.f25422x, (Login) obj);
                }
            }
        }, i16), new InterfaceC3255b(this) { // from class: com.whoop.data.onboarding.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ OnboardingStatusInteractor f25426x;

            {
                this.f25426x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i16) {
                    case 0:
                        OnboardingStatusInteractor.observeUserLoginEvents$lambda$2(this.f25426x, (Throwable) obj);
                        break;
                    default:
                        OnboardingStatusInteractor.observeUserLoginEvents$lambda$5(this.f25426x, (Throwable) obj);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeUserLoginEvents$lambda$0(OnboardingStatusInteractor onboardingStatusInteractor, Logout logout) {
        onboardingStatusInteractor.cancelOnboardingStatusPeriodicFetch();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeUserLoginEvents$lambda$2(OnboardingStatusInteractor onboardingStatusInteractor, Throwable th3) {
        onboardingStatusInteractor.logger.mo85222m(AbstractC11895b.m31996o("Error observing logout stream: ", th3.getMessage(), " "), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeUserLoginEvents$lambda$3(OnboardingStatusInteractor onboardingStatusInteractor, Login login) {
        onboardingStatusInteractor.startOnboardingStatusPeriodicFetch();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeUserLoginEvents$lambda$5(OnboardingStatusInteractor onboardingStatusInteractor, Throwable th3) {
        onboardingStatusInteractor.logger.mo85222m(AbstractC11895b.m31996o("Error observing login stream: ", th3.getMessage(), " "), new AbstractC30556a.a[0]);
    }

    private final void prefetchOverlays() {
        AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new C65231(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    private final void startOnboardingStatusPeriodicFetch() {
        Object objM125868N0;
        cancelOnboardingStatusPeriodicFetch();
        AbstractC21909c abstractC21909c = this.configurationRepository;
        OnboardingStatusFetchCadenceMillis onboardingStatusFetchCadenceMillis = OnboardingStatusFetchCadenceMillis.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = onboardingStatusFetchCadenceMillis.getName();
        Object defaultValue = onboardingStatusFetchCadenceMillis.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        this.fetchJob = AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new C65241(((Long) defaultValue).longValue(), null), 3);
        prefetchOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0039, B:26:0x0065, B:28:0x006b, B:19:0x0047, B:25:0x0059, B:22:0x004e), top: B:34:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:26:0x0065->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object storeEntriesInLocalDatabase(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65261 c65261;
        Iterator<Map.Entry<FeatureEducationType, Boolean>> it;
        int i13;
        OnboardingStatusDao onboardingStatusDao;
        OnboardingStatus onboardingStatus;
        if (interfaceC30057d instanceof C65261) {
            c65261 = (C65261) interfaceC30057d;
            int i14 = c65261.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c65261.label = i14 - Integer.MIN_VALUE;
            } else {
                c65261 = new C65261(interfaceC30057d);
            }
        } else {
            c65261 = new C65261(interfaceC30057d);
        }
        Object obj = c65261.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c65261.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                OnboardingStatusDao onboardingStatusDao2 = this.onboardingStatusDao;
                c65261.label = 1;
                if (onboardingStatusDao2.deleteAll(c65261) == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i15 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = c65261.I$0;
                it = (Iterator) c65261.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Map.Entry<FeatureEducationType, Boolean> next = it.next();
                onboardingStatusDao = this.onboardingStatusDao;
                onboardingStatus = new OnboardingStatus(next.getKey(), next.getValue().booleanValue());
                c65261.L$0 = null;
                c65261.L$1 = it;
                c65261.L$2 = null;
                c65261.L$3 = null;
                c65261.I$0 = i13;
                c65261.I$1 = 0;
                c65261.label = 2;
                if (onboardingStatusDao.updateTable(onboardingStatus, c65261) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
            it = this.onboardingStatus.entrySet().iterator();
            i13 = 0;
            while (it.hasNext()) {
                Map.Entry<FeatureEducationType, Boolean> next2 = it.next();
                onboardingStatusDao = this.onboardingStatusDao;
                onboardingStatus = new OnboardingStatus(next2.getKey(), next2.getValue().booleanValue());
                c65261.L$0 = null;
                c65261.L$1 = it;
                c65261.L$2 = null;
                c65261.L$3 = null;
                c65261.I$0 = i13;
                c65261.I$1 = 0;
                c65261.label = 2;
                if (onboardingStatusDao.updateTable(onboardingStatus, c65261) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to insert onboarding status entry into DB", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public final void cancelOnboardingStatusPeriodicFetch() {
        InterfaceC3027k1 interfaceC3027k1 = this.fetchJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public final Map<FeatureEducationType, Boolean> filterOnboardingStatusMap(Map<String, Boolean> mapToTrim) {
        Boolean bool;
        AbstractC22676k.m65750j(mapToTrim, "mapToTrim");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FeatureEducationType featureEducationType : FeatureEducationType.values()) {
            if (mapToTrim.keySet().contains(featureEducationType.name()) && (bool = mapToTrim.get(featureEducationType.name())) != null) {
                linkedHashMap.put(featureEducationType, bool);
            }
        }
        return linkedHashMap;
    }

    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        loadOnboardingStatusFromTable();
        startOnboardingStatusPeriodicFetch();
        observeUserLoginEvents();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        prefetchOverlays();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusChecker
    public void retriggerOnboardingFetch() {
        startOnboardingStatusPeriodicFetch();
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusChecker
    public boolean shouldGoToFeatureEducation(FeatureEducationType type) {
        AbstractC22676k.m65750j(type, "type");
        Boolean bool = this.onboardingStatus.get(type);
        return !(bool != null ? bool.booleanValue() : true);
    }
}

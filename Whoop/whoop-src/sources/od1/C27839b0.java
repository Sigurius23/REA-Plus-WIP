package od1;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.request.UserState;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.service.network.ActivitiesApi;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29017f;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import ud3.C34850x0;

/* JADX INFO: renamed from: od1.b0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lod1/b0;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lp92/f;", "realTimeRecordingStore", "Lkotlin/Function1;", "Lq83/d;", "", "", "hasActiveTrackSession", "Lu92/d;", "mainPrefStore", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/ActivitiesApi;Lp92/f;Lkotlin/jvm/functions/Function1;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ltr2/n;)V", "Ll83/a0;", "d", "()V", "Lpg3/v0;", "Lcom/whoop/service/network/model/UserState;", "userStateResponse", "e", "(Lpg3/v0;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/service/network/ActivitiesApi;", "x", "Lp92/f;", "y", "Lkotlin/jvm/functions/Function1;", "z", "Lu92/d;", "E", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "Lbc3/c0;", "G", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27839b0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29017f realTimeRecordingStore;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Function1 hasActiveTrackSession;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C34660d mainPrefStore;

    /* JADX INFO: renamed from: od1.b0$a */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserStateLifecycleObserver$checkAndCorrectUserState$1", m100430f = "UserStateLifecycleObserver.kt", m100431l = {60, 69, 71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f112125w;

        /* JADX INFO: renamed from: x */
        int f112126x;

        /* JADX INFO: renamed from: od1.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes8.dex */
        @InterfaceC32271e(m100429c = "com.whoop.domain.UserStateLifecycleObserver$checkAndCorrectUserState$1$1", m100430f = "UserStateLifecycleObserver.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42117a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f112128w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27839b0 f112129x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42117a(C27839b0 c27839b0, InterfaceC30057d<? super C42117a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f112129x = c27839b0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42117a(this.f112129x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f112128w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivitiesApi activitiesApi = this.f112129x.activitiesApi;
                UserStateRequestBody userStateRequestBody = new UserStateRequestBody(UserState.Idle);
                this.f112128w = 1;
                Object userState = activitiesApi.setUserState(userStateRequestBody, this);
                return userState == enumC31071a ? enumC31071a : userState;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C42117a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: od1.b0$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.domain.UserStateLifecycleObserver$checkAndCorrectUserState$1$getUserStateResult$1", m100430f = "UserStateLifecycleObserver.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/service/network/model/UserState;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f112130w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27839b0 f112131x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C27839b0 c27839b0, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f112131x = c27839b0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f112131x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f112130w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivitiesApi activitiesApi = this.f112131x.activitiesApi;
                this.f112130w = 1;
                Object userStateSuspend = activitiesApi.getUserStateSuspend(this);
                return userStateSuspend == enumC31071a ? enumC31071a : userStateSuspend;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<com.whoop.service.network.model.UserState>> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27839b0.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
        
            if (u02.InterfaceC34385a.Companion.m108729b(r0, r1, null, "Failed to set user state to IDLE", r4, r13, 2, null) == r8) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r83.a r8 = r83.EnumC31071a.f128113w
                int r0 = r13.f112126x
                r9 = 0
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L30
                if (r0 == r1) goto L2b
                if (r0 == r11) goto L22
                if (r0 != r10) goto L1a
                java.lang.Object r0 = r13.f112125w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto Lb3
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                java.lang.Object r0 = r13.f112125w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L6d
            L2b:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L52
            L30:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                od1.b0 r2 = od1.C27839b0.this
                tr2.n r2 = od1.C27839b0.m83926b(r2)
                od1.b0$a$b r4 = new od1.b0$a$b
                od1.b0 r3 = od1.C27839b0.this
                r4.<init>(r3, r12)
                r13.f112126x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to get user state"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L52
                goto La1
            L52:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto La2
                od1.b0 r1 = od1.C27839b0.this
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                pg3.v0 r0 = (pg3.C29218v0) r0
                r13.f112125w = r12
                r13.f112126x = r11
                java.lang.Object r0 = od1.C27839b0.m83927c(r1, r0, r13)
                if (r0 != r8) goto L6d
                goto La1
            L6d:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto Lb3
                od1.b0 r0 = od1.C27839b0.this
                tr2.n r0 = od1.C27839b0.m83926b(r0)
                java.lang.String r1 = "Auto-correcting stuck user state to IDLE"
                qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r9]
                r0.mo85216g(r1, r2)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                od1.b0 r1 = od1.C27839b0.this
                tr2.n r1 = od1.C27839b0.m83926b(r1)
                od1.b0$a$a r4 = new od1.b0$a$a
                od1.b0 r2 = od1.C27839b0.this
                r4.<init>(r2, r12)
                r13.f112125w = r12
                r13.f112126x = r10
                r2 = 0
                java.lang.String r3 = "Failed to set user state to IDLE"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto Lb3
            La1:
                return r8
            La2:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lb6
                od1.b0 r0 = od1.C27839b0.this
                tr2.n r0 = od1.C27839b0.m83926b(r0)
                java.lang.String r1 = "Skipping user state correction due to error"
                qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r9]
                r0.mo85228t(r1, r2)
            Lb3:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lb6:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: od1.C27839b0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: od1.b0$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserStateLifecycleObserver", m100430f = "UserStateLifecycleObserver.kt", m100431l = {106}, m100432m = "shouldCorrectToIdle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112132w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112133x;

        /* JADX INFO: renamed from: z */
        int f112135z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112133x = obj;
            this.f112135z |= Integer.MIN_VALUE;
            return C27839b0.this.m83929e(null, this);
        }
    }

    public C27839b0(ActivitiesApi activitiesApi, C29017f realTimeRecordingStore, Function1 hasActiveTrackSession, C34660d mainPrefStore, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 scope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(realTimeRecordingStore, "realTimeRecordingStore");
        AbstractC22676k.m65750j(hasActiveTrackSession, "hasActiveTrackSession");
        AbstractC22676k.m65750j(mainPrefStore, "mainPrefStore");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        this.activitiesApi = activitiesApi;
        this.realTimeRecordingStore = realTimeRecordingStore;
        this.hasActiveTrackSession = hasActiveTrackSession;
        this.mainPrefStore = mainPrefStore;
        this.featureFlagChecker = featureFlagChecker;
        this.scope = scope;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final void m83928d() {
        this.logger.mo85228t("Checking user state for auto-correction", new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[PHI: r8
      0x005f: PHI (r8v12 pg3.v0<com.whoop.service.network.model.UserState>) = (r8v0 pg3.v0<com.whoop.service.network.model.UserState>), (r8v13 pg3.v0<com.whoop.service.network.model.UserState>) binds: [B:17:0x0047, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[PHI: r8
      0x0061: PHI (r8v1 pg3.v0<com.whoop.service.network.model.UserState>) = (r8v0 pg3.v0<com.whoop.service.network.model.UserState>), (r8v13 pg3.v0<com.whoop.service.network.model.UserState>) binds: [B:15:0x003d, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m83929e(C29218v0<com.whoop.service.network.model.UserState> c29218v0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        boolean z4;
        Object obj;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f112135z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f112135z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objInvoke = bVar.f112133x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f112135z;
        boolean z13 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            if (this.realTimeRecordingStore.m88178b() != null) {
                z4 = true;
            } else if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP)) {
                Function1 function1 = this.hasActiveTrackSession;
                bVar.f112132w = c29218v0;
                bVar.f112135z = 1;
                objInvoke = function1.invoke(bVar);
                if (objInvoke == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                z4 = false;
            }
            InterfaceC34116n interfaceC34116n = this.logger;
            C34850x0 c34850x0 = c29218v0.f118269a;
            obj = c29218v0.f118270b;
            interfaceC34116n.mo85228t("shouldCorrectToIdle check: isRecording=" + z4 + ", response=" + c34850x0.f146792z, new AbstractC30556a.a[0]);
            if (!z4 && c29218v0.f118269a.f146788Q && obj != null) {
                AbstractC22676k.m65747g(obj);
                if (((com.whoop.service.network.model.UserState) obj).isUserSet()) {
                    AbstractC22676k.m65747g(obj);
                    if (!((com.whoop.service.network.model.UserState) obj).isInIdleState() && this.mainPrefStore.m109533j(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE) == null) {
                        z13 = true;
                    }
                }
            }
            return Boolean.valueOf(z13);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c29218v0 = (C29218v0) bVar.f112132w;
        AbstractC34132o.m107864I(objInvoke);
        if (((Boolean) objInvoke).booleanValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC34116n interfaceC34116n2 = this.logger;
        C34850x0 c34850x1 = c29218v0.f118269a;
        obj = c29218v0.f118270b;
        interfaceC34116n2.mo85228t("shouldCorrectToIdle check: isRecording=" + z4 + ", response=" + c34850x1.f146792z, new AbstractC30556a.a[0]);
        if (!z4) {
            AbstractC22676k.m65747g(obj);
            if (((com.whoop.service.network.model.UserState) obj).isUserSet()) {
                AbstractC22676k.m65747g(obj);
                if (!((com.whoop.service.network.model.UserState) obj).isInIdleState()) {
                    z13 = true;
                }
            }
        }
        return Boolean.valueOf(z13);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m83928d();
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
        m83928d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}

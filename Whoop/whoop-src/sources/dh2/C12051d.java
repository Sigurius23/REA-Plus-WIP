package dh2;

import ah2.C0892a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.stealthmode.api.HiddenMetricsResponse;
import com.whoop.stealthmode.api.StealthModeApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eh2.EnumC13196a;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: dh2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0010¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Ldh2/d;", "", "Lcom/whoop/stealthmode/api/StealthModeApi;", "api", "Lah2/a;", "stealthModeAnalytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementsChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/stealthmode/api/StealthModeApi;Lah2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ltr2/n;)V", "", "isStealthModeEnabled", "Lec3/l;", "Ldh2/c;", "o", "(Z)Lec3/l;", "m", "()Lec3/l;", "Ldh2/c$d;", "p", "Ldh2/c$a;", "q", "Leh2/a;", "metricType", "isHiddenMetricEnabled", "r", "(Leh2/a;Z)Lec3/l;", "", "Ldh2/a;", "Ll83/a0;", "l", "(Ljava/util/List;Leh2/a;Lq83/d;)Ljava/lang/Object;", "Ldh2/b;", "upstream", "n", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/stealthmode/api/StealthModeApi;", "b", "Lah2/a;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lwe1/a;", "e", "Ltr2/n;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12051d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StealthModeApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C0892a stealthModeAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementsChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dh2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor", m100430f = "StealthModeInteractor.kt", m100431l = {112}, m100432m = "addMetric", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f39911E;

        /* JADX INFO: renamed from: w */
        Object f39912w;

        /* JADX INFO: renamed from: x */
        Object f39913x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39914y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39914y = obj;
            this.f39911E |= Integer.MIN_VALUE;
            return C12051d.this.m33215l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dh2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$addMetric$statusResponse$1", m100430f = "StealthModeInteractor.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/stealthmode/api/HiddenMetricsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39916w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC13196a f39918y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC13196a enumC13196a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f39918y = enumC13196a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12051d.this.new b(this.f39918y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39916w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StealthModeApi stealthModeApi = C12051d.this.api;
            String strName = this.f39918y.name();
            this.f39916w = 1;
            Object hiddenMetric = stealthModeApi.getHiddenMetric(strName, this);
            return hiddenMetric == enumC31071a ? enumC31071a : hiddenMetric;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HiddenMetricsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dh2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$getStealthMetricsStatus$1", m100430f = "StealthModeInteractor.kt", m100431l = {48, 49, 58, 61, 65, 67, 70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f39920w;

        /* JADX INFO: renamed from: x */
        Object f39921x;

        /* JADX INFO: renamed from: y */
        int f39922y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f39923z;

        /* JADX INFO: renamed from: dh2.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$getStealthMetricsStatus$1$response$1", m100430f = "StealthModeInteractor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f39924w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12051d f39925x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12051d c12051d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f39925x = c12051d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f39925x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f39924w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                StealthModeApi stealthModeApi = this.f39925x.api;
                this.f39924w = 1;
                Object stealthModeStatus = stealthModeApi.getStealthModeStatus(this);
                return stealthModeStatus == enumC31071a ? enumC31071a : stealthModeStatus;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C12051d.this.new c(interfaceC30057d);
            cVar.f39923z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007c A[PHI: r9 r13
          0x007c: PHI (r9v2 dh2.d$c) = (r9v1 dh2.d$c), (r9v3 dh2.d$c) binds: [B:16:0x0078, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r13v7 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:16:0x0078, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0083  */
        /* JADX WARN: Code duplicated, block: B:22:0x0096  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ab A[PHI: r2 r4 r9
          0x00ab: PHI (r2v4 java.util.List) = (r2v3 java.util.List), (r2v3 java.util.List), (r2v6 java.util.List) binds: [B:21:0x0094, B:23:0x00a7, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00ab: PHI (r4v3 u02.a) = (r4v2 u02.a), (r4v2 u02.a), (r4v5 u02.a) binds: [B:21:0x0094, B:23:0x00a7, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00ab: PHI (r9v4 dh2.d$c) = (r9v2 dh2.d$c), (r9v2 dh2.d$c), (r9v5 dh2.d$c) binds: [B:21:0x0094, B:23:0x00a7, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:38:0x0118  */
        /* JADX WARN: Code duplicated, block: B:40:0x011c  */
        /* JADX WARN: Code duplicated, block: B:45:0x012f  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L42;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dh2.C12051d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dh2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StealthModeInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39926w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39927x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39928y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12051d f39929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C12051d c12051d) {
            super(3, interfaceC30057d);
            this.f39929z = c12051d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC12049b abstractC12049b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f39929z);
            dVar.f39927x = interfaceC13062m;
            dVar.f39928y = abstractC12049b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM33220r;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39926w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39927x;
                AbstractC12049b abstractC12049b = (AbstractC12049b) this.f39928y;
                if (abstractC12049b instanceof AbstractC12049b.d) {
                    interfaceC13058lM33220r = this.f39929z.m33217o(((AbstractC12049b.d) abstractC12049b).getIsStealthModeEnabled());
                } else if (abstractC12049b instanceof AbstractC12049b.c) {
                    interfaceC13058lM33220r = this.f39929z.m33219q(((AbstractC12049b.c) abstractC12049b).getIsStealthModeEnabled());
                } else if (abstractC12049b instanceof AbstractC12049b.a) {
                    interfaceC13058lM33220r = this.f39929z.m33216m();
                } else if (AbstractC22676k.m65745e(abstractC12049b, AbstractC12049b.b.f39891a)) {
                    interfaceC13058lM33220r = this.f39929z.m33218p();
                } else {
                    if (!(abstractC12049b instanceof AbstractC12049b.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC12049b.e eVar = (AbstractC12049b.e) abstractC12049b;
                    interfaceC13058lM33220r = this.f39929z.m33220r(eVar.getMetricType(), eVar.getIsHiddenMetricEnabled());
                }
                this.f39927x = null;
                this.f39928y = null;
                this.f39926w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM33220r, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC12049b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dh2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$toggleStealthMode$1", m100430f = "StealthModeInteractor.kt", m100431l = {39, 40, 44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39930w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39931x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f39933z;

        /* JADX INFO: renamed from: dh2.d$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$toggleStealthMode$1$1", m100430f = "StealthModeInteractor.kt", m100431l = {41, 43}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f39934E;

            /* JADX INFO: renamed from: w */
            boolean f39935w;

            /* JADX INFO: renamed from: x */
            int f39936x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12051d f39937y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f39938z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12051d c12051d, boolean z4, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f39937y = c12051d;
                this.f39938z = z4;
                this.f39934E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f39937y, this.f39938z, this.f39934E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.emit(r3, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f39936x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L56
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L35
                L1c:
                    p505ts.AbstractC34132o.m107864I(r6)
                    dh2.d r6 = r5.f39937y
                    com.whoop.stealthmode.api.StealthModeApi r6 = dh2.C12051d.m33205b(r6)
                    com.whoop.stealthmode.api.StealthModeEnabled r1 = new com.whoop.stealthmode.api.StealthModeEnabled
                    boolean r4 = r5.f39938z
                    r1.<init>(r4)
                    r5.f39936x = r3
                    java.lang.Object r6 = r6.toggleStealthMode(r1, r5)
                    if (r6 != r0) goto L35
                    goto L55
                L35:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    dh2.d r1 = r5.f39937y
                    ah2.a r1 = dh2.C12051d.m33210g(r1)
                    r1.m2188b(r6)
                    ec3.m r1 = r5.f39934E
                    dh2.c$f r3 = new dh2.c$f
                    r3.<init>(r6)
                    r5.f39935w = r6
                    r5.f39936x = r2
                    java.lang.Object r6 = r1.emit(r3, r5)
                    if (r6 != r0) goto L56
                L55:
                    return r0
                L56:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: dh2.C12051d.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: dh2.d$e$b */
        @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$toggleStealthMode$1$2", m100430f = "StealthModeInteractor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f39939w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f39940x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39940x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f39940x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f39939w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f39940x;
                    AbstractC12050c.h hVar = AbstractC12050c.h.f39905a;
                    this.f39939w = 1;
                    if (interfaceC13062m.emit(hVar, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39933z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C12051d.this.new e(this.f39933z, interfaceC30057d);
            eVar.f39931x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r0, r1, r12) == r9) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f39931x
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f39930w
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2a
                if (r0 == r2) goto L26
                if (r0 == r1) goto L21
                if (r0 != r10) goto L19
                p505ts.AbstractC34132o.m107864I(r13)
                goto L6f
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L5d
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3a
            L2a:
                p505ts.AbstractC34132o.m107864I(r13)
                dh2.c$d r0 = dh2.AbstractC12050c.d.f39900a
                r12.f39931x = r8
                r12.f39930w = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3a
                goto L6e
            L3a:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                dh2.d r2 = dh2.C12051d.this
                tr2.n r2 = dh2.C12051d.m33208e(r2)
                dh2.d$e$a r4 = new dh2.d$e$a
                dh2.d r3 = dh2.C12051d.this
                boolean r6 = r12.f39933z
                r4.<init>(r3, r6, r8, r11)
                r12.f39931x = r8
                r12.f39930w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "toggleStealthMode"
                r6 = 2
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L5d
                goto L6e
            L5d:
                u02.a r0 = (u02.InterfaceC34385a) r0
                dh2.d$e$b r1 = new dh2.d$e$b
                r1.<init>(r8, r11)
                r12.f39931x = r11
                r12.f39930w = r10
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r12)
                if (r0 != r9) goto L6f
            L6e:
                return r9
            L6f:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dh2.C12051d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dh2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$toggleStealthModeLoading$1", m100430f = "StealthModeInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh2/c$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39941w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39942x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f39942x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39942x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39941w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12050c.d dVar = AbstractC12050c.d.f39900a;
                this.f39942x = null;
                this.f39941w = 1;
                if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dh2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$toggleStealthModeSuccess$1", m100430f = "StealthModeInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh2/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39943w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39944x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f39945y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39945y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f39945y, interfaceC30057d);
            gVar.f39944x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39944x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39943w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12050c.a aVar = new AbstractC12050c.a(this.f39945y);
                this.f39944x = null;
                this.f39943w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dh2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$updateHiddenMetric$1", m100430f = "StealthModeInteractor.kt", m100431l = {91, 92, 102, 106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f39946E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC13196a f39947F;

        /* JADX INFO: renamed from: w */
        Object f39948w;

        /* JADX INFO: renamed from: x */
        int f39949x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f39950y;

        /* JADX INFO: renamed from: dh2.d$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.stealthmode.interactor.StealthModeInteractor$updateHiddenMetric$1$response$1", m100430f = "StealthModeInteractor.kt", m100431l = {94, 96}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f39952w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f39953x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12051d f39954y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ EnumC13196a f39955z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z4, C12051d c12051d, EnumC13196a enumC13196a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f39953x = z4;
                this.f39954y = c12051d;
                this.f39955z = enumC13196a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f39953x, this.f39954y, this.f39955z, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            
                if (r5 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
            
                if (r5 == r0) goto L19;
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
                    int r1 = r4.f39952w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L50
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L38
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    boolean r5 = r4.f39953x
                    if (r5 == 0) goto L3b
                    dh2.d r5 = r4.f39954y
                    com.whoop.stealthmode.api.StealthModeApi r5 = dh2.C12051d.m33205b(r5)
                    eh2.a r1 = r4.f39955z
                    java.lang.String r1 = r1.name()
                    r4.f39952w = r3
                    java.lang.Object r5 = r5.updateHiddenMetric(r1, r4)
                    if (r5 != r0) goto L38
                    goto L4f
                L38:
                    pg3.v0 r5 = (pg3.C29218v0) r5
                    return r5
                L3b:
                    dh2.d r5 = r4.f39954y
                    com.whoop.stealthmode.api.StealthModeApi r5 = dh2.C12051d.m33205b(r5)
                    eh2.a r1 = r4.f39955z
                    java.lang.String r1 = r1.name()
                    r4.f39952w = r2
                    java.lang.Object r5 = r5.deleteHiddenMetric(r1, r4)
                    if (r5 != r0) goto L50
                L4f:
                    return r0
                L50:
                    pg3.v0 r5 = (pg3.C29218v0) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dh2.C12051d.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4, EnumC13196a enumC13196a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39946E = z4;
            this.f39947F = enumC13196a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C12051d.this.new h(this.f39946E, this.f39947F, interfaceC30057d);
            hVar.f39950y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f39950y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f39949x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f39948w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto La3
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L74
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L50
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                dh2.d r0 = dh2.C12051d.this
                ah2.a r0 = dh2.C12051d.m33210g(r0)
                boolean r3 = r13.f39946E
                eh2.a r4 = r13.f39947F
                r0.m2187a(r3, r4)
                dh2.c$e r0 = dh2.AbstractC12050c.e.f39901a
                r13.f39950y = r8
                r13.f39949x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L50
                goto La2
            L50:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                dh2.d r2 = dh2.C12051d.this
                tr2.n r2 = dh2.C12051d.m33208e(r2)
                dh2.d$h$a r4 = new dh2.d$h$a
                boolean r3 = r13.f39946E
                dh2.d r6 = dh2.C12051d.this
                eh2.a r7 = r13.f39947F
                r4.<init>(r3, r6, r7, r12)
                r13.f39950y = r8
                r13.f39949x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L74
                goto La2
            L74:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L90
                dh2.c$g r0 = new dh2.c$g
                eh2.a r1 = r13.f39947F
                boolean r2 = r13.f39946E
                r0.<init>(r1, r2)
                r13.f39950y = r12
                r13.f39948w = r12
                r13.f39949x = r11
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto La3
                goto La2
            L90:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto La6
                dh2.c$c r0 = dh2.AbstractC12050c.c.f39899a
                r13.f39950y = r12
                r13.f39948w = r12
                r13.f39949x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto La3
            La2:
                return r9
            La3:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            La6:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dh2.C12051d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12051d(StealthModeApi api, C0892a stealthModeAnalytics, FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementsChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(stealthModeAnalytics, "stealthModeAnalytics");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementsChecker, "entitlementsChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.stealthModeAnalytics = stealthModeAnalytics;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementsChecker = entitlementsChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m33215l(List<C12048a> list, EnumC13196a enumC13196a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f39911E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f39911E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f39914y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f39911E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(enumC13196a, null);
            aVar2.f39912w = list;
            aVar2.f39913x = enumC13196a;
            aVar2.f39911E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC13196a = (EnumC13196a) aVar2.f39913x;
            list = (List) aVar2.f39912w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            list.add(new C12048a(enumC13196a, ((HiddenMetricsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).isHidden()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m33216m() {
        return new C13084s1(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m33217o(boolean isStealthModeEnabled) {
        return new C13084s1(new e(isStealthModeEnabled, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m33218p() {
        return new C13084s1(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m33219q(boolean isStealthModeEnabled) {
        return new C13084s1(new g(isStealthModeEnabled, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m33220r(EnumC13196a metricType, boolean isHiddenMetricEnabled) {
        return new C13084s1(new h(isHiddenMetricEnabled, metricType, null));
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m33221n(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new d(null, this));
    }
}

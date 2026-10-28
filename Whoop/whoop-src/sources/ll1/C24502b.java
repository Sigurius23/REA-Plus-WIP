package ll1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj0.C17345d;
import l83.C23454a0;
import od1.AbstractC27845h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ll1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lll1/b;", "", "Ltr2/n;", "logger", "Lll1/c;", "requiredPermissionsInteractor", "Lhj0/d;", "applicationLifecycle", "Lbc3/c0;", "applicationScope", "", "sdkVersion", "<init>", "(Ltr2/n;Lll1/c;Lhj0/d;Lbc3/c0;I)V", "a", "Ltr2/n;", "", "b", "Z", "isAndroid12orHigher", "Lec3/l;", "c", "Lec3/l;", "()Lec3/l;", "shouldRequestPermissionFlow", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24502b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isAndroid12orHigher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l shouldRequestPermissionFlow;

    /* JADX INFO: renamed from: ll1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionTracker$shouldRequestPermissionFlow$2", m100430f = "RequiredPermissionTracker.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lll1/a$a;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f95563w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95564x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m71339f(InterfaceC13062m interfaceC13062m, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f95564x = interfaceC13062m;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m71339f((InterfaceC13062m) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95564x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95563w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC24501a.a aVar = AbstractC24501a.a.f95559a;
                this.f95564x = null;
                this.f95563w = 1;
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

    /* JADX INFO: renamed from: ll1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionTracker$shouldRequestPermissionFlow$3", m100430f = "RequiredPermissionTracker.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95565w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95566x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f95566x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95566x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95565w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.FALSE;
                this.f95566x = null;
                this.f95565w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ll1.b$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f95567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24502b f95568x;

        /* JADX INFO: renamed from: ll1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f95569w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24502b f95570x;

            /* JADX INFO: renamed from: ll1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionTracker$special$$inlined$filter$1$2", m100430f = "RequiredPermissionTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41954a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f95572F;

                /* JADX INFO: renamed from: G */
                Object f95573G;

                /* JADX INFO: renamed from: H */
                int f95574H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f95575w;

                /* JADX INFO: renamed from: x */
                int f95576x;

                /* JADX INFO: renamed from: y */
                Object f95577y;

                /* JADX INFO: renamed from: z */
                Object f95578z;

                public C41954a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f95575w = obj;
                    this.f95576x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24502b c24502b) {
                this.f95569w = interfaceC13062m;
                this.f95570x = c24502b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41954a c41954a;
                if (interfaceC30057d instanceof C41954a) {
                    c41954a = (C41954a) interfaceC30057d;
                    int i13 = c41954a.f95576x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41954a.f95576x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41954a = new C41954a(interfaceC30057d);
                    }
                } else {
                    c41954a = new C41954a(interfaceC30057d);
                }
                Object obj2 = c41954a.f95575w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41954a.f95576x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f95569w;
                    if (((Boolean) obj).booleanValue() && this.f95570x.isAndroid12orHigher) {
                        c41954a.f95577y = null;
                        c41954a.f95578z = null;
                        c41954a.f95572F = null;
                        c41954a.f95573G = null;
                        c41954a.f95574H = 0;
                        c41954a.f95576x = 1;
                        if (interfaceC13062m.emit(obj, c41954a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C24502b c24502b) {
            this.f95567w = interfaceC13058l;
            this.f95568x = c24502b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f95567w.collect(new a(interfaceC13062m, this.f95568x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C24502b(InterfaceC34116n logger, C24503c requiredPermissionsInteractor, C17345d applicationLifecycle, InterfaceC2994c0 applicationScope, int i13) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(requiredPermissionsInteractor, "requiredPermissionsInteractor");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.logger = logger;
        this.isAndroid12orHigher = i13 >= 31;
        this.shouldRequestPermissionFlow = new C13015a0(new b(null), AbstractC13091v.m36586L(AbstractC27845h.m83945a(AbstractC13091v.m36590P(new c(applicationLifecycle.getAppForegroundFlow(), this), new a(null)), requiredPermissionsInteractor), applicationScope, C13105z1.m36630a(2, 5000L), 1));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13058l getShouldRequestPermissionFlow() {
        return this.shouldRequestPermissionFlow;
    }
}

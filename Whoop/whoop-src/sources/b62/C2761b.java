package b62;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c62.AbstractC4275c;
import c62.C4276d;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ld1.AbstractC23864c;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y52.AbstractC39238c;
import y52.C39236a;
import y52.C39240e;

/* JADX INFO: renamed from: b62.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020!0/8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020'088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m65681d2 = {"Lb62/b;", "Lld1/c;", "Lc62/c;", "Lb62/a$e;", "Ly52/a;", "apiInteractor", "Lc62/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ly52/a;Lc62/d;Lbc3/c0;)V", "Ly52/c$a;", "y", "(Lb62/a$e;)Ly52/c$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lb62/a$e;)V", "", "path", "u", "(Ljava/lang/String;)V", "v", "()V", "x", "Lc62/d;", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/p1;", "", "E", "Lec3/p1;", "retryInProgress", "F", "retryNavigationDispatched", "Lcom/whoop/navigation/e;", "G", "_navigationEvents", "Lec3/l;", "Ly52/e;", "H", "Lec3/l;", "domainState", "Lec3/f2;", "I", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "J", "t", "isRetryInProgress", "Lec3/t1;", "K", "Lec3/t1;", "r", "()Lec3/t1;", "navigationEvents", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2761b extends AbstractC23864c<AbstractC4275c, InterfaceC2760a.e> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13075p1 retryInProgress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 retryNavigationDispatched;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 _navigationEvents;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 isRetryInProgress;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13087t1 navigationEvents;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C4276d reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: b62.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.presentation.RecoveryImpactsViewModel$1", m100430f = "RecoveryImpactsViewModel.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f10855w;

        /* JADX INFO: renamed from: b62.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41298a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C2761b f10857w;

            public C41298a(C2761b c2761b) {
                this.f10857w = c2761b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC4275c abstractC4275c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C9598e c9598eM7830a = AbstractC2762c.m7830a(((Boolean) ((C13045h2) this.f10857w.retryInProgress).getValue()).booleanValue(), abstractC4275c);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (c9598eM7830a == null) {
                    if (AbstractC2762c.m7831b(((Boolean) ((C13045h2) this.f10857w.retryInProgress).getValue()).booleanValue(), abstractC4275c)) {
                        this.f10857w.m7827v();
                    }
                    return c23454a0;
                }
                C2761b c2761b = this.f10857w;
                if (!((Boolean) ((C13045h2) c2761b.retryNavigationDispatched).getValue()).booleanValue()) {
                    InterfaceC13075p1 interfaceC13075p1 = c2761b.retryNavigationDispatched;
                    Boolean bool = Boolean.TRUE;
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, bool);
                    Object objEmit = c2761b._navigationEvents.emit(c9598eM7830a, interfaceC30057d);
                    if (objEmit == EnumC31071a.f128113w) {
                        return objEmit;
                    }
                }
                return c23454a0;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2761b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10855w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 viewState = C2761b.this.getViewState();
                C41298a c41298a = new C41298a(C2761b.this);
                this.f10855w = 1;
                if (viewState.collect(c41298a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: b62.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.presentation.RecoveryImpactsViewModel$requestRetry$1", m100430f = "RecoveryImpactsViewModel.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f10858w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C9598e f10860y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9598e c9598e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f10860y = c9598e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2761b.this.new b(this.f10860y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10858w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C2761b.this._navigationEvents;
                C9598e c9598e = this.f10860y;
                this.f10858w = 1;
                if (interfaceC13072o1.emit(c9598e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: b62.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.presentation.RecoveryImpactsViewModel$sendViewEvent$1", m100430f = "RecoveryImpactsViewModel.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f10861w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2760a.e f10863y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2760a.e eVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f10863y = eVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2761b.this.new c(this.f10863y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10861w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C2761b.this.eventFlow;
                InterfaceC2760a.e eVar = this.f10863y;
                this.f10861w = 1;
                if (interfaceC13072o1.emit(eVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: b62.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f10864w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2761b f10865x;

        /* JADX INFO: renamed from: b62.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f10866w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2761b f10867x;

            /* JADX INFO: renamed from: b62.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.presentation.RecoveryImpactsViewModel$special$$inlined$map$1$2", m100430f = "RecoveryImpactsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41299a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f10868E;

                /* JADX INFO: renamed from: F */
                Object f10869F;

                /* JADX INFO: renamed from: G */
                Object f10870G;

                /* JADX INFO: renamed from: H */
                int f10871H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f10872w;

                /* JADX INFO: renamed from: x */
                int f10873x;

                /* JADX INFO: renamed from: y */
                Object f10874y;

                public C41299a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f10872w = obj;
                    this.f10873x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2761b c2761b) {
                this.f10866w = interfaceC13062m;
                this.f10867x = c2761b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41299a c41299a;
                if (interfaceC30057d instanceof C41299a) {
                    c41299a = (C41299a) interfaceC30057d;
                    int i13 = c41299a.f10873x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41299a.f10873x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41299a = new C41299a(interfaceC30057d);
                    }
                } else {
                    c41299a = new C41299a(interfaceC30057d);
                }
                Object obj2 = c41299a.f10872w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41299a.f10873x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f10866w;
                    AbstractC39238c.a aVarM7823y = this.f10867x.m7823y((InterfaceC2760a.e) obj);
                    c41299a.f10874y = null;
                    c41299a.f10868E = null;
                    c41299a.f10869F = null;
                    c41299a.f10870G = null;
                    c41299a.f10871H = 0;
                    c41299a.f10873x = 1;
                    if (interfaceC13062m.emit(aVarM7823y, c41299a) == enumC31071a) {
                        return enumC31071a;
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

        public d(InterfaceC13058l interfaceC13058l, C2761b c2761b) {
            this.f10864w = interfaceC13058l;
            this.f10865x = c2761b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f10864w.collect(new a(interfaceC13062m, this.f10865x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b62.b$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f10876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2761b f10877x;

        /* JADX INFO: renamed from: b62.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f10878w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2761b f10879x;

            /* JADX INFO: renamed from: b62.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.presentation.RecoveryImpactsViewModel$special$$inlined$map$2$2", m100430f = "RecoveryImpactsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41300a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f10880E;

                /* JADX INFO: renamed from: F */
                Object f10881F;

                /* JADX INFO: renamed from: G */
                Object f10882G;

                /* JADX INFO: renamed from: H */
                int f10883H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f10884w;

                /* JADX INFO: renamed from: x */
                int f10885x;

                /* JADX INFO: renamed from: y */
                Object f10886y;

                public C41300a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f10884w = obj;
                    this.f10885x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2761b c2761b) {
                this.f10878w = interfaceC13062m;
                this.f10879x = c2761b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41300a c41300a;
                if (interfaceC30057d instanceof C41300a) {
                    c41300a = (C41300a) interfaceC30057d;
                    int i13 = c41300a.f10885x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41300a.f10885x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41300a = new C41300a(interfaceC30057d);
                    }
                } else {
                    c41300a = new C41300a(interfaceC30057d);
                }
                Object obj2 = c41300a.f10884w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41300a.f10885x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f10878w;
                    AbstractC4275c abstractC4275cM13320a = this.f10879x.reducer.m13320a((C39240e) obj);
                    c41300a.f10886y = null;
                    c41300a.f10880E = null;
                    c41300a.f10881F = null;
                    c41300a.f10882G = null;
                    c41300a.f10883H = 0;
                    c41300a.f10885x = 1;
                    if (interfaceC13062m.emit(abstractC4275cM13320a, c41300a) == enumC31071a) {
                        return enumC31071a;
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

        public e(InterfaceC13058l interfaceC13058l, C2761b c2761b) {
            this.f10876w = interfaceC13058l;
            this.f10877x = c2761b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f10876w.collect(new a(interfaceC13062m, this.f10877x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2761b(C39236a apiInteractor, C4276d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(apiInteractor, "apiInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(bool);
        this.retryInProgress = c13045h2M36593c;
        this.retryNavigationDispatched = AbstractC13091v.m36593c(bool);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this._navigationEvents = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new d(c13096w1M36592b, this), apiInteractor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new e(interfaceC13058lM83945a, this), coroutineScope, C13105z1.f45288a, AbstractC4275c.b.f17358a);
        this.isRetryInProgress = AbstractC13091v.m36598h(c13045h2M36593c);
        this.navigationEvents = AbstractC13091v.m36597g(c13096w1M36592b2);
        AbstractC3006f0.m8732z(coroutineScope, null, null, new a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final AbstractC39238c.a m7823y(InterfaceC2760a.e eVar) {
        if (!(eVar instanceof InterfaceC2760a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC2760a.d dVar = (InterfaceC2760a.d) eVar;
        return new AbstractC39238c.a(dVar.getPath(), dVar.getShowLoading());
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final InterfaceC13087t1 getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC13037f2 getIsRetryInProgress() {
        return this.isRetryInProgress;
    }

    /* JADX INFO: renamed from: u */
    public final void m7826u(String path) {
        AbstractC22676k.m65750j(path, "path");
        InterfaceC13075p1 interfaceC13075p1 = this.retryInProgress;
        Boolean bool = Boolean.TRUE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        InterfaceC13075p1 interfaceC13075p2 = this.retryNavigationDispatched;
        Boolean bool2 = Boolean.FALSE;
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
        c13045h3.getClass();
        c13045h3.m36571k(null, bool2);
        C9598e c9598eM7830a = AbstractC2762c.m7830a(true, (AbstractC4275c) getViewState().getValue());
        if (c9598eM7830a == null) {
            mo1216g(new InterfaceC2760a.d(path, false));
            return;
        }
        C13045h2 c13045h4 = (C13045h2) this.retryNavigationDispatched;
        c13045h4.getClass();
        c13045h4.m36571k(null, bool);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(c9598eM7830a, null), 3);
    }

    /* JADX INFO: renamed from: v */
    public final void m7827v() {
        InterfaceC13075p1 interfaceC13075p1 = this.retryInProgress;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        C13045h2 c13045h3 = (C13045h2) this.retryNavigationDispatched;
        c13045h3.getClass();
        c13045h3.m36571k(null, bool);
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC2760a.e event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C2761b(C39236a c39236a, C4276d c4276d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39236a, c4276d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

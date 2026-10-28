package sy1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c93.InterfaceC4351m;
import dj0.C12086v;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import ry1.C31910a;
import ry1.C31911b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ty1.C34266k;
import ty1.InterfaceC34256a;
import ty1.InterfaceC34265j;
import zy1.C41222d;

/* JADX INFO: renamed from: sy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lsy1/a;", "Landroidx/lifecycle/w1;", "Lry1/b;", "interactor", "Lsy1/b;", "reducer", "Ldj0/v;", "mfaChallengeRepository", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "stateInScope", "<init>", "(Lry1/b;Lsy1/b;Ldj0/v;Ltr2/n;Lbc3/c0;Lbc3/c0;)V", "Lec3/l;", "Lty1/j;", "Lry1/a;", "interact", "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lty1/j;)V", "onCleared", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lry1/b;", "x", "Lsy1/b;", "y", "Ldj0/v;", "z", "Ltr2/n;", "E", "Lbc3/c0;", "Lec3/o1;", "F", "Lec3/o1;", "viewEvents", "Lec3/f2;", "Lty1/k;", "G", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33096a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEvents;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C31911b interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C33097b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C12086v mfaChallengeRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: sy1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.presentation.MfaChallengeViewModel$onViewEvent$1", m100430f = "MfaChallengeViewModel.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138048w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34265j f138050y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC34265j interfaceC34265j, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138050y = interfaceC34265j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33096a.this.new a(this.f138050y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138048w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33096a.this.viewEvents;
                InterfaceC34265j interfaceC34265j = this.f138050y;
                this.f138048w = 1;
                if (interfaceC13072o1.emit(interfaceC34265j, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sy1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f138051w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33096a f138052x;

        /* JADX INFO: renamed from: sy1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f138053w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33096a f138054x;

            /* JADX INFO: renamed from: sy1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.presentation.MfaChallengeViewModel$special$$inlined$map$1$2", m100430f = "MfaChallengeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42353a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f138055E;

                /* JADX INFO: renamed from: F */
                Object f138056F;

                /* JADX INFO: renamed from: G */
                Object f138057G;

                /* JADX INFO: renamed from: H */
                int f138058H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f138059w;

                /* JADX INFO: renamed from: x */
                int f138060x;

                /* JADX INFO: renamed from: y */
                Object f138061y;

                public C42353a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f138059w = obj;
                    this.f138060x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33096a c33096a) {
                this.f138053w = interfaceC13062m;
                this.f138054x = c33096a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42353a c42353a;
                if (interfaceC30057d instanceof C42353a) {
                    c42353a = (C42353a) interfaceC30057d;
                    int i13 = c42353a.f138060x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42353a.f138060x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42353a = new C42353a(interfaceC30057d);
                    }
                } else {
                    c42353a = new C42353a(interfaceC30057d);
                }
                Object obj2 = c42353a.f138059w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42353a.f138060x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f138053w;
                    C34266k c34266kM104860a = this.f138054x.reducer.m104860a((C31910a) obj);
                    c42353a.f138061y = null;
                    c42353a.f138055E = null;
                    c42353a.f138056F = null;
                    c42353a.f138057G = null;
                    c42353a.f138058H = 0;
                    c42353a.f138060x = 1;
                    if (interfaceC13062m.emit(c34266kM104860a, c42353a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C33096a c33096a) {
            this.f138051w = interfaceC13058l;
            this.f138052x = c33096a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f138051w.collect(new a(interfaceC13062m, this.f138052x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33096a(C31911b interactor, C33097b reducer, C12086v mfaChallengeRepository, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC2994c0 stateInScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(mfaChallengeRepository, "mfaChallengeRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(stateInScope, "stateInScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.mfaChallengeRepository = mfaChallengeRepository;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.viewEvents = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new b(interact(c13096w1M36592b), this), stateInScope, C13105z1.f45289b, new C34266k(null, null, null, null, false, false, new InterfaceC34256a.b(null, false, 1, null), null, null, false, C3927k.m11937b(C41222d.f177881a.m133910a(), null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 130559, null), 959, null));
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.m99265A(interfaceC13058l);
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m104859l(InterfaceC34265j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        this.logger.mo85216g("onCleared, resetting challenge repo", new AbstractC30556a.a[0]);
        this.mfaChallengeRepository.m33347b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C33096a(C31911b c31911b, C33097b c33097b, C12086v c12086v, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, InterfaceC2994c0 interfaceC2994c1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaChallengeViewModel") : interfaceC34116n;
        InterfaceC2994c0 c28180m = (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0;
        this(c31911b, c33097b, c12086v, interfaceC34116nM107848a, c28180m, (i13 & 32) != 0 ? c28180m : interfaceC2994c1);
    }
}

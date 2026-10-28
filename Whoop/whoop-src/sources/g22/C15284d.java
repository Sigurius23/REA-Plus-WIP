package g22;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d22.AbstractC11510a;
import d22.C11512c;
import d22.InterfaceC11511b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import h22.C16782a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: g22.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lg22/d;", "Landroidx/lifecycle/w1;", "Ld22/c;", "interactor", "Lh22/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ld22/c;Lh22/a;Lbc3/c0;)V", "Lg22/c;", "Ld22/a;", "p", "(Lg22/c;)Ld22/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lg22/c;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ld22/c;", "x", "Lh22/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lg22/b;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15284d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11512c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C16782a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: g22.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.presentation.MembershipAdjustmentViewModel$sendViewEvent$1", m100430f = "MembershipAdjustmentViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f57395w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15283c f57397y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15283c interfaceC15283c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f57397y = interfaceC15283c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15284d.this.new a(this.f57397y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f57395w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15284d.this.eventFlow;
                InterfaceC15283c interfaceC15283c = this.f57397y;
                this.f57395w = 1;
                if (interfaceC13072o1.emit(interfaceC15283c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: g22.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f57398w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15284d f57399x;

        /* JADX INFO: renamed from: g22.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f57400w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15284d f57401x;

            /* JADX INFO: renamed from: g22.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.presentation.MembershipAdjustmentViewModel$special$$inlined$map$1$2", m100430f = "MembershipAdjustmentViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41620a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f57402E;

                /* JADX INFO: renamed from: F */
                Object f57403F;

                /* JADX INFO: renamed from: G */
                Object f57404G;

                /* JADX INFO: renamed from: H */
                int f57405H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f57406w;

                /* JADX INFO: renamed from: x */
                int f57407x;

                /* JADX INFO: renamed from: y */
                Object f57408y;

                public C41620a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f57406w = obj;
                    this.f57407x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15284d c15284d) {
                this.f57400w = interfaceC13062m;
                this.f57401x = c15284d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41620a c41620a;
                if (interfaceC30057d instanceof C41620a) {
                    c41620a = (C41620a) interfaceC30057d;
                    int i13 = c41620a.f57407x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41620a.f57407x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41620a = new C41620a(interfaceC30057d);
                    }
                } else {
                    c41620a = new C41620a(interfaceC30057d);
                }
                Object obj2 = c41620a.f57406w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41620a.f57407x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f57400w;
                    AbstractC11510a abstractC11510aM43397p = this.f57401x.m43397p((InterfaceC15283c) obj);
                    c41620a.f57408y = null;
                    c41620a.f57402E = null;
                    c41620a.f57403F = null;
                    c41620a.f57404G = null;
                    c41620a.f57405H = 0;
                    c41620a.f57407x = 1;
                    if (interfaceC13062m.emit(abstractC11510aM43397p, c41620a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C15284d c15284d) {
            this.f57398w = interfaceC13058l;
            this.f57399x = c15284d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f57398w.collect(new a(interfaceC13062m, this.f57399x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g22.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f57410w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15284d f57411x;

        /* JADX INFO: renamed from: g22.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f57412w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15284d f57413x;

            /* JADX INFO: renamed from: g22.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.presentation.MembershipAdjustmentViewModel$special$$inlined$map$2$2", m100430f = "MembershipAdjustmentViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41621a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f57414E;

                /* JADX INFO: renamed from: F */
                Object f57415F;

                /* JADX INFO: renamed from: G */
                Object f57416G;

                /* JADX INFO: renamed from: H */
                int f57417H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f57418w;

                /* JADX INFO: renamed from: x */
                int f57419x;

                /* JADX INFO: renamed from: y */
                Object f57420y;

                public C41621a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f57418w = obj;
                    this.f57419x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15284d c15284d) {
                this.f57412w = interfaceC13062m;
                this.f57413x = c15284d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41621a c41621a;
                if (interfaceC30057d instanceof C41621a) {
                    c41621a = (C41621a) interfaceC30057d;
                    int i13 = c41621a.f57419x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41621a.f57419x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41621a = new C41621a(interfaceC30057d);
                    }
                } else {
                    c41621a = new C41621a(interfaceC30057d);
                }
                Object obj2 = c41621a.f57418w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41621a.f57419x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f57412w;
                    InterfaceC15282b interfaceC15282bM47333a = this.f57413x.viewStateReducer.m47333a((InterfaceC11511b) obj);
                    c41621a.f57420y = null;
                    c41621a.f57414E = null;
                    c41621a.f57415F = null;
                    c41621a.f57416G = null;
                    c41621a.f57417H = 0;
                    c41621a.f57419x = 1;
                    if (interfaceC13062m.emit(interfaceC15282bM47333a, c41621a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C15284d c15284d) {
            this.f57410w = interfaceC13058l;
            this.f57411x = c15284d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f57410w.collect(new a(interfaceC13062m, this.f57411x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15284d(C11512c interactor, C16782a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC11510a m43397p(InterfaceC15283c interfaceC15283c) {
        if (interfaceC15283c instanceof InterfaceC15283c.b) {
            InterfaceC15283c.b bVar = (InterfaceC15283c.b) interfaceC15283c;
            return new AbstractC11510a.b(bVar.getStrapSerial(), bVar.getStrapSignature());
        }
        if (!(interfaceC15283c instanceof InterfaceC15283c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15283c.a aVar = (InterfaceC15283c.a) interfaceC15283c;
        return new AbstractC11510a.a(aVar.getPath(), aVar.m43390b(), aVar.getStrapSerial());
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m43399o(InterfaceC15283c event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C15284d(C11512c c11512c, C16782a c16782a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11512c, c16782a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

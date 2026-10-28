package iz2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import cz2.InterfaceC11265a;
import dz2.C12472c;
import dz2.InterfaceC12470a;
import dz2.InterfaceC12471b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ez2.C13761a;
import hz2.InterfaceC17819d;
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

/* JADX INFO: renamed from: iz2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Liz2/a;", "Landroidx/lifecycle/w1;", "Ldz2/c;", "interactor", "Lez2/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldz2/c;Lez2/a;Lbc3/c0;)V", "Lcz2/a;", "viewEvent", "Ldz2/a$a;", "n", "(Lcz2/a;)Ldz2/a$a;", "Lbc3/k1;", "l", "(Lcz2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "dwlLandingViewEventFlow", "Lec3/f2;", "Lhz2/d;", "y", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21060a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 dwlLandingViewEventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: iz2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.viewmodel.DwlLandingViewModel$sendViewEvent$1", m100430f = "DwlLandingViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79883w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC11265a f79885y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC11265a interfaceC11265a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79885y = interfaceC11265a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21060a.this.new a(this.f79885y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79883w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21060a.this.dwlLandingViewEventFlow;
                InterfaceC11265a interfaceC11265a = this.f79885y;
                this.f79883w = 1;
                if (interfaceC13072o1.emit(interfaceC11265a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: iz2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79886w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21060a f79887x;

        /* JADX INFO: renamed from: iz2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79888w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21060a f79889x;

            /* JADX INFO: renamed from: iz2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.viewmodel.DwlLandingViewModel$special$$inlined$map$1$2", m100430f = "DwlLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41814a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79890E;

                /* JADX INFO: renamed from: F */
                Object f79891F;

                /* JADX INFO: renamed from: G */
                Object f79892G;

                /* JADX INFO: renamed from: H */
                int f79893H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79894w;

                /* JADX INFO: renamed from: x */
                int f79895x;

                /* JADX INFO: renamed from: y */
                Object f79896y;

                public C41814a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79894w = obj;
                    this.f79895x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21060a c21060a) {
                this.f79888w = interfaceC13062m;
                this.f79889x = c21060a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41814a c41814a;
                if (interfaceC30057d instanceof C41814a) {
                    c41814a = (C41814a) interfaceC30057d;
                    int i13 = c41814a.f79895x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41814a.f79895x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41814a = new C41814a(interfaceC30057d);
                    }
                } else {
                    c41814a = new C41814a(interfaceC30057d);
                }
                Object obj2 = c41814a.f79894w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41814a.f79895x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79888w;
                    InterfaceC12470a.a aVarM58910n = this.f79889x.m58910n((InterfaceC11265a) obj);
                    c41814a.f79896y = null;
                    c41814a.f79890E = null;
                    c41814a.f79891F = null;
                    c41814a.f79892G = null;
                    c41814a.f79893H = 0;
                    c41814a.f79895x = 1;
                    if (interfaceC13062m.emit(aVarM58910n, c41814a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C21060a c21060a) {
            this.f79886w = interfaceC13058l;
            this.f79887x = c21060a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79886w.collect(new a(interfaceC13062m, this.f79887x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iz2.a$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79898w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13761a f79899x;

        /* JADX INFO: renamed from: iz2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79900w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13761a f79901x;

            /* JADX INFO: renamed from: iz2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.viewmodel.DwlLandingViewModel$special$$inlined$map$2$2", m100430f = "DwlLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41815a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79902E;

                /* JADX INFO: renamed from: F */
                Object f79903F;

                /* JADX INFO: renamed from: G */
                Object f79904G;

                /* JADX INFO: renamed from: H */
                int f79905H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79906w;

                /* JADX INFO: renamed from: x */
                int f79907x;

                /* JADX INFO: renamed from: y */
                Object f79908y;

                public C41815a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79906w = obj;
                    this.f79907x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13761a c13761a) {
                this.f79900w = interfaceC13062m;
                this.f79901x = c13761a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41815a c41815a;
                if (interfaceC30057d instanceof C41815a) {
                    c41815a = (C41815a) interfaceC30057d;
                    int i13 = c41815a.f79907x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41815a.f79907x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41815a = new C41815a(interfaceC30057d);
                    }
                } else {
                    c41815a = new C41815a(interfaceC30057d);
                }
                Object obj2 = c41815a.f79906w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41815a.f79907x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79900w;
                    InterfaceC17819d interfaceC17819dM39129c = this.f79901x.m39129c((InterfaceC12471b) obj);
                    c41815a.f79908y = null;
                    c41815a.f79902E = null;
                    c41815a.f79903F = null;
                    c41815a.f79904G = null;
                    c41815a.f79905H = 0;
                    c41815a.f79907x = 1;
                    if (interfaceC13062m.emit(interfaceC17819dM39129c, c41815a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C13761a c13761a) {
            this.f79898w = interfaceC13058l;
            this.f79899x = c13761a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79898w.collect(new a(interfaceC13062m, this.f79899x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21060a(C12472c interactor, C13761a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dwlLandingViewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), viewStateReducer), coroutineScope, C13105z1.f45288a, InterfaceC17819d.c.f69303a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC12470a.a m58910n(InterfaceC11265a viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC11265a.a.f36180a)) {
            return InterfaceC12470a.a.f42551a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC3027k1 m58911l(InterfaceC11265a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C21060a(C12472c c12472c, C13761a c13761a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12472c, c13761a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

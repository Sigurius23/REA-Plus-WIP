package us2;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ss2.AbstractC32951b;
import ss2.AbstractC32952c;
import ss2.C32954e;

/* JADX INFO: renamed from: us2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lus2/e;", "Landroidx/lifecycle/w1;", "Lss2/e;", "interactor", "Lus2/g;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lss2/e;Lus2/g;Lbc3/c0;)V", "Lus2/d;", "viewEvent", "Lbc3/k1;", "l", "(Lus2/d;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lus2/g;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lss2/c;", "z", "Lec3/l;", "domainState", "Lec3/f2;", "Lus2/f;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35224e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C35226g reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: us2.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.presentation.ChallengeLandingViewModel$sendViewEvent$1", m100430f = "ChallengeLandingViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f149787w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35223d f149789y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35223d abstractC35223d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149789y = abstractC35223d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35224e.this.new a(this.f149789y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149787w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35224e.this.eventFlow;
                AbstractC35223d abstractC35223d = this.f149789y;
                this.f149787w = 1;
                if (interfaceC13072o1.emit(abstractC35223d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: us2.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149790w;

        /* JADX INFO: renamed from: us2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149791w;

            /* JADX INFO: renamed from: us2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.presentation.ChallengeLandingViewModel$special$$inlined$map$1$2", m100430f = "ChallengeLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42508a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149792E;

                /* JADX INFO: renamed from: F */
                Object f149793F;

                /* JADX INFO: renamed from: G */
                Object f149794G;

                /* JADX INFO: renamed from: H */
                int f149795H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149796w;

                /* JADX INFO: renamed from: x */
                int f149797x;

                /* JADX INFO: renamed from: y */
                Object f149798y;

                public C42508a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149796w = obj;
                    this.f149797x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149791w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42508a c42508a;
                if (interfaceC30057d instanceof C42508a) {
                    c42508a = (C42508a) interfaceC30057d;
                    int i13 = c42508a.f149797x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42508a.f149797x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42508a = new C42508a(interfaceC30057d);
                    }
                } else {
                    c42508a = new C42508a(interfaceC30057d);
                }
                Object obj2 = c42508a.f149796w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42508a.f149797x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149791w;
                    AbstractC32951b abstractC32951bM111595a = ((AbstractC35223d) obj).m111595a();
                    c42508a.f149798y = null;
                    c42508a.f149792E = null;
                    c42508a.f149793F = null;
                    c42508a.f149794G = null;
                    c42508a.f149795H = 0;
                    c42508a.f149797x = 1;
                    if (interfaceC13062m.emit(abstractC32951bM111595a, c42508a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f149790w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149790w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: us2.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149800w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35224e f149801x;

        /* JADX INFO: renamed from: us2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149802w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35224e f149803x;

            /* JADX INFO: renamed from: us2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.presentation.ChallengeLandingViewModel$special$$inlined$map$2$2", m100430f = "ChallengeLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42509a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149804E;

                /* JADX INFO: renamed from: F */
                Object f149805F;

                /* JADX INFO: renamed from: G */
                Object f149806G;

                /* JADX INFO: renamed from: H */
                int f149807H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149808w;

                /* JADX INFO: renamed from: x */
                int f149809x;

                /* JADX INFO: renamed from: y */
                Object f149810y;

                public C42509a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149808w = obj;
                    this.f149809x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35224e c35224e) {
                this.f149802w = interfaceC13062m;
                this.f149803x = c35224e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42509a c42509a;
                if (interfaceC30057d instanceof C42509a) {
                    c42509a = (C42509a) interfaceC30057d;
                    int i13 = c42509a.f149809x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42509a.f149809x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42509a = new C42509a(interfaceC30057d);
                    }
                } else {
                    c42509a = new C42509a(interfaceC30057d);
                }
                Object obj2 = c42509a.f149808w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42509a.f149809x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149802w;
                    AbstractC35225f abstractC35225fM111609c = this.f149803x.reducer.m111609c((AbstractC32952c) obj);
                    c42509a.f149810y = null;
                    c42509a.f149804E = null;
                    c42509a.f149805F = null;
                    c42509a.f149806G = null;
                    c42509a.f149807H = 0;
                    c42509a.f149809x = 1;
                    if (interfaceC13062m.emit(abstractC35225fM111609c, c42509a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C35224e c35224e) {
            this.f149800w = interfaceC13058l;
            this.f149801x = c35224e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149800w.collect(new a(interfaceC13062m, this.f149801x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35224e(C32954e interactor, C35226g reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM83945a, this), AbstractC1640x1.m5043b(this), C13105z1.f45288a, AbstractC35225f.b.f149813a);
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC3027k1 m111599l(AbstractC35223d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C35224e(C32954e c32954e, C35226g c35226g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c32954e, c35226g, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

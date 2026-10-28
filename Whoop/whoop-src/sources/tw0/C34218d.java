package tw0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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
import sw0.AbstractC33047d;
import sw0.C33048e;
import sw0.C33049f;
import uw0.C35306p;

/* JADX INFO: renamed from: tw0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Ltw0/d;", "Landroidx/lifecycle/w1;", "Lsw0/f;", "interactor", "Ltw0/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lsw0/f;Ltw0/e;Lbc3/c0;)V", "Lec3/l;", "Lsw0/d;", "Lsw0/e;", "interact", "(Lec3/l;)Lec3/l;", "Ltw0/c;", "o", "(Ltw0/c;)Lsw0/d;", "viewEvent", "Lbc3/k1;", "n", "(Ltw0/c;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lsw0/f;", "x", "Ltw0/e;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Luw0/p;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34218d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C33049f interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C34219e reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: tw0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.presentation.CustomBottomSheetViewModel$sendViewEvent$1", m100430f = "CustomBottomSheetViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143540w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34217c f143542y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34217c abstractC34217c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143542y = abstractC34217c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34218d.this.new a(this.f143542y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143540w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34218d.this.eventFlow;
                AbstractC34217c abstractC34217c = this.f143542y;
                this.f143540w = 1;
                if (interfaceC13072o1.emit(abstractC34217c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tw0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f143543w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34218d f143544x;

        /* JADX INFO: renamed from: tw0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f143545w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34218d f143546x;

            /* JADX INFO: renamed from: tw0.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.presentation.CustomBottomSheetViewModel$special$$inlined$map$1$2", m100430f = "CustomBottomSheetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42421a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f143547E;

                /* JADX INFO: renamed from: F */
                Object f143548F;

                /* JADX INFO: renamed from: G */
                Object f143549G;

                /* JADX INFO: renamed from: H */
                int f143550H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f143551w;

                /* JADX INFO: renamed from: x */
                int f143552x;

                /* JADX INFO: renamed from: y */
                Object f143553y;

                public C42421a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f143551w = obj;
                    this.f143552x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34218d c34218d) {
                this.f143545w = interfaceC13062m;
                this.f143546x = c34218d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42421a c42421a;
                if (interfaceC30057d instanceof C42421a) {
                    c42421a = (C42421a) interfaceC30057d;
                    int i13 = c42421a.f143552x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42421a.f143552x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42421a = new C42421a(interfaceC30057d);
                    }
                } else {
                    c42421a = new C42421a(interfaceC30057d);
                }
                Object obj2 = c42421a.f143551w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42421a.f143552x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f143545w;
                    AbstractC33047d abstractC33047dM108161o = this.f143546x.m108161o((AbstractC34217c) obj);
                    c42421a.f143553y = null;
                    c42421a.f143547E = null;
                    c42421a.f143548F = null;
                    c42421a.f143549G = null;
                    c42421a.f143550H = 0;
                    c42421a.f143552x = 1;
                    if (interfaceC13062m.emit(abstractC33047dM108161o, c42421a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C34218d c34218d) {
            this.f143543w = interfaceC13058l;
            this.f143544x = c34218d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f143543w.collect(new a(interfaceC13062m, this.f143544x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tw0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f143555w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34218d f143556x;

        /* JADX INFO: renamed from: tw0.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f143557w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34218d f143558x;

            /* JADX INFO: renamed from: tw0.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.presentation.CustomBottomSheetViewModel$special$$inlined$map$2$2", m100430f = "CustomBottomSheetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42422a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f143559E;

                /* JADX INFO: renamed from: F */
                Object f143560F;

                /* JADX INFO: renamed from: G */
                Object f143561G;

                /* JADX INFO: renamed from: H */
                int f143562H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f143563w;

                /* JADX INFO: renamed from: x */
                int f143564x;

                /* JADX INFO: renamed from: y */
                Object f143565y;

                public C42422a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f143563w = obj;
                    this.f143564x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34218d c34218d) {
                this.f143557w = interfaceC13062m;
                this.f143558x = c34218d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42422a c42422a;
                if (interfaceC30057d instanceof C42422a) {
                    c42422a = (C42422a) interfaceC30057d;
                    int i13 = c42422a.f143564x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42422a.f143564x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42422a = new C42422a(interfaceC30057d);
                    }
                } else {
                    c42422a = new C42422a(interfaceC30057d);
                }
                Object obj2 = c42422a.f143563w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42422a.f143564x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f143557w;
                    C35306p c35306pM108167a = this.f143558x.reducer.m108167a((C33048e) obj);
                    c42422a.f143565y = null;
                    c42422a.f143559E = null;
                    c42422a.f143560F = null;
                    c42422a.f143561G = null;
                    c42422a.f143562H = 0;
                    c42422a.f143564x = 1;
                    if (interfaceC13062m.emit(c35306pM108167a, c42422a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34218d c34218d) {
            this.f143555w = interfaceC13058l;
            this.f143556x = c34218d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f143555w.collect(new a(interfaceC13062m, this.f143556x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34218d(C33049f interactor, C34219e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC33047d m108161o(AbstractC34217c abstractC34217c) {
        if (abstractC34217c instanceof AbstractC34217c.f) {
            return new AbstractC33047d.f(((AbstractC34217c.f) abstractC34217c).m108155a());
        }
        if (abstractC34217c instanceof AbstractC34217c.c) {
            return new AbstractC33047d.c(((AbstractC34217c.c) abstractC34217c).getCategoryIndex());
        }
        if (abstractC34217c instanceof AbstractC34217c.b) {
            return AbstractC33047d.b.f137737a;
        }
        if (abstractC34217c instanceof AbstractC34217c.a) {
            return new AbstractC33047d.a(((AbstractC34217c.a) abstractC34217c).getId());
        }
        if (abstractC34217c instanceof AbstractC34217c.g) {
            return new AbstractC33047d.g(((AbstractC34217c.g) abstractC34217c).getIsFromModal());
        }
        if (abstractC34217c instanceof AbstractC34217c.d) {
            return new AbstractC33047d.d(((AbstractC34217c.d) abstractC34217c).getFeatureEducationId());
        }
        if (abstractC34217c instanceof AbstractC34217c.h) {
            return new AbstractC33047d.h(((AbstractC34217c.h) abstractC34217c).getQuery());
        }
        if (abstractC34217c instanceof AbstractC34217c.e) {
            return new AbstractC33047d.e(((AbstractC34217c.e) abstractC34217c).getQuery());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3027k1 m108162n(AbstractC34217c viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C34218d(C33049f c33049f, C34219e c34219e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33049f, c34219e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package zf0;

import ag0.C0857a;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
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
import wf0.AbstractC37239b;
import wf0.C37240c;
import wf0.C37241d;

/* JADX INFO: renamed from: zf0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lzf0/b;", "Landroidx/lifecycle/w1;", "Lwf0/d;", "interactor", "Lag0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwf0/d;Lag0/a;Lbc3/c0;)V", "Lec3/l;", "Lwf0/b;", "Lwf0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lzf0/a$j;", "o", "(Lzf0/a$j;)Lwf0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lzf0/a$j;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lwf0/d;", "x", "Lag0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lzf0/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40610b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C37241d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C0857a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: zf0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.presentation.PurchaseAddOnsViewModel$sendViewEvent$1", m100430f = "PurchaseAddOnsViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174988w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC40609a.j f174990y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40609a.j jVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174990y = jVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40610b.this.new a(this.f174990y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174988w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40610b.this.eventFlow;
                InterfaceC40609a.j jVar = this.f174990y;
                this.f174988w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zf0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174991w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40610b f174992x;

        /* JADX INFO: renamed from: zf0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174993w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40610b f174994x;

            /* JADX INFO: renamed from: zf0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.presentation.PurchaseAddOnsViewModel$special$$inlined$map$1$2", m100430f = "PurchaseAddOnsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42748a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174995E;

                /* JADX INFO: renamed from: F */
                Object f174996F;

                /* JADX INFO: renamed from: G */
                Object f174997G;

                /* JADX INFO: renamed from: H */
                int f174998H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174999w;

                /* JADX INFO: renamed from: x */
                int f175000x;

                /* JADX INFO: renamed from: y */
                Object f175001y;

                public C42748a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174999w = obj;
                    this.f175000x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40610b c40610b) {
                this.f174993w = interfaceC13062m;
                this.f174994x = c40610b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42748a c42748a;
                if (interfaceC30057d instanceof C42748a) {
                    c42748a = (C42748a) interfaceC30057d;
                    int i13 = c42748a.f175000x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42748a.f175000x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42748a = new C42748a(interfaceC30057d);
                    }
                } else {
                    c42748a = new C42748a(interfaceC30057d);
                }
                Object obj2 = c42748a.f174999w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42748a.f175000x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174993w;
                    AbstractC37239b abstractC37239bM131695o = this.f174994x.m131695o((InterfaceC40609a.j) obj);
                    c42748a.f175001y = null;
                    c42748a.f174995E = null;
                    c42748a.f174996F = null;
                    c42748a.f174997G = null;
                    c42748a.f174998H = 0;
                    c42748a.f175000x = 1;
                    if (interfaceC13062m.emit(abstractC37239bM131695o, c42748a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C40610b c40610b) {
            this.f174991w = interfaceC13058l;
            this.f174992x = c40610b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174991w.collect(new a(interfaceC13062m, this.f174992x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zf0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175003w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40610b f175004x;

        /* JADX INFO: renamed from: zf0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175005w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40610b f175006x;

            /* JADX INFO: renamed from: zf0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.presentation.PurchaseAddOnsViewModel$special$$inlined$map$2$2", m100430f = "PurchaseAddOnsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42749a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175007E;

                /* JADX INFO: renamed from: F */
                Object f175008F;

                /* JADX INFO: renamed from: G */
                Object f175009G;

                /* JADX INFO: renamed from: H */
                int f175010H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175011w;

                /* JADX INFO: renamed from: x */
                int f175012x;

                /* JADX INFO: renamed from: y */
                Object f175013y;

                public C42749a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175011w = obj;
                    this.f175012x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40610b c40610b) {
                this.f175005w = interfaceC13062m;
                this.f175006x = c40610b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42749a c42749a;
                if (interfaceC30057d instanceof C42749a) {
                    c42749a = (C42749a) interfaceC30057d;
                    int i13 = c42749a.f175012x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42749a.f175012x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42749a = new C42749a(interfaceC30057d);
                    }
                } else {
                    c42749a = new C42749a(interfaceC30057d);
                }
                Object obj2 = c42749a.f175011w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42749a.f175012x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f175005w;
                    C40611c c40611cM2070c = this.f175006x.reducer.m2070c((C37240c) obj);
                    c42749a.f175013y = null;
                    c42749a.f175007E = null;
                    c42749a.f175008F = null;
                    c42749a.f175009G = null;
                    c42749a.f175010H = 0;
                    c42749a.f175012x = 1;
                    if (interfaceC13062m.emit(c40611cM2070c, c42749a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C40610b c40610b) {
            this.f175003w = interfaceC13058l;
            this.f175004x = c40610b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175003w.collect(new a(interfaceC13062m, this.f175004x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40610b(C37241d interactor, C0857a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC37239b m131695o(InterfaceC40609a.j jVar) {
        if (jVar instanceof InterfaceC40609a.h) {
            InterfaceC40609a.h hVar = (InterfaceC40609a.h) jVar;
            return new AbstractC37239b.b(hVar.getSource(), hVar.getTestCount());
        }
        if (jVar instanceof InterfaceC40609a.i) {
            return new AbstractC37239b.c(((InterfaceC40609a.i) jVar).getSelectedSegmentId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m131696n(InterfaceC40609a.j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C40610b(C37241d c37241d, C0857a c0857a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37241d, c0857a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

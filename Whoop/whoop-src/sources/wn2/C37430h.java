package wn2;

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
import sn2.C32777c;
import sn2.C32782h;
import sn2.InterfaceC32775a;
import sn2.InterfaceC32776b;

/* JADX INFO: renamed from: wn2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lwn2/h;", "Landroidx/lifecycle/w1;", "Lsn2/c;", "interactor", "Lwn2/j;", "reducer", "Lsn2/h;", "selection", "", "storeDomain", "Lor2/m;", "coroutineScope", "<init>", "(Lsn2/c;Lwn2/j;Lsn2/h;Ljava/lang/String;Lor2/m;)V", "Lwn2/e$i;", "Lsn2/a;", "o", "(Lwn2/e$i;)Lsn2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lwn2/e$i;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lwn2/j;", "x", "Lsn2/h;", "y", "Ljava/lang/String;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "buyNowViewEventFlow", "Lec3/l;", "Lwn2/i;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37430h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 buyNowViewEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C37432j reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C32782h selection;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String storeDomain;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: wn2.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.presentation.BuyNowViewModel$sendViewEvent$1", m100430f = "BuyNowViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160199w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC37427e.i f160201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC37427e.i iVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160201y = iVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37430h.this.new a(this.f160201y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160199w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37430h.this.buyNowViewEventFlow;
                InterfaceC37427e.i iVar = this.f160201y;
                this.f160199w = 1;
                if (interfaceC13072o1.emit(iVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wn2.h$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f160202w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37430h f160203x;

        /* JADX INFO: renamed from: wn2.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f160204w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37430h f160205x;

            /* JADX INFO: renamed from: wn2.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.presentation.BuyNowViewModel$special$$inlined$map$1$2", m100430f = "BuyNowViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42599a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f160206E;

                /* JADX INFO: renamed from: F */
                Object f160207F;

                /* JADX INFO: renamed from: G */
                Object f160208G;

                /* JADX INFO: renamed from: H */
                int f160209H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f160210w;

                /* JADX INFO: renamed from: x */
                int f160211x;

                /* JADX INFO: renamed from: y */
                Object f160212y;

                public C42599a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f160210w = obj;
                    this.f160211x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37430h c37430h) {
                this.f160204w = interfaceC13062m;
                this.f160205x = c37430h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42599a c42599a;
                if (interfaceC30057d instanceof C42599a) {
                    c42599a = (C42599a) interfaceC30057d;
                    int i13 = c42599a.f160211x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42599a.f160211x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42599a = new C42599a(interfaceC30057d);
                    }
                } else {
                    c42599a = new C42599a(interfaceC30057d);
                }
                Object obj2 = c42599a.f160210w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42599a.f160211x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f160204w;
                    InterfaceC32775a interfaceC32775aM119826o = this.f160205x.m119826o((InterfaceC37427e.i) obj);
                    c42599a.f160212y = null;
                    c42599a.f160206E = null;
                    c42599a.f160207F = null;
                    c42599a.f160208G = null;
                    c42599a.f160209H = 0;
                    c42599a.f160211x = 1;
                    if (interfaceC13062m.emit(interfaceC32775aM119826o, c42599a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37430h c37430h) {
            this.f160202w = interfaceC13058l;
            this.f160203x = c37430h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f160202w.collect(new a(interfaceC13062m, this.f160203x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wn2.h$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f160214w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37430h f160215x;

        /* JADX INFO: renamed from: wn2.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f160216w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37430h f160217x;

            /* JADX INFO: renamed from: wn2.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.presentation.BuyNowViewModel$special$$inlined$map$2$2", m100430f = "BuyNowViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42600a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f160218E;

                /* JADX INFO: renamed from: F */
                Object f160219F;

                /* JADX INFO: renamed from: G */
                Object f160220G;

                /* JADX INFO: renamed from: H */
                int f160221H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f160222w;

                /* JADX INFO: renamed from: x */
                int f160223x;

                /* JADX INFO: renamed from: y */
                Object f160224y;

                public C42600a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f160222w = obj;
                    this.f160223x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37430h c37430h) {
                this.f160216w = interfaceC13062m;
                this.f160217x = c37430h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42600a c42600a;
                if (interfaceC30057d instanceof C42600a) {
                    c42600a = (C42600a) interfaceC30057d;
                    int i13 = c42600a.f160223x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42600a.f160223x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42600a = new C42600a(interfaceC30057d);
                    }
                } else {
                    c42600a = new C42600a(interfaceC30057d);
                }
                Object obj2 = c42600a.f160222w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42600a.f160223x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f160216w;
                    InterfaceC37431i interfaceC37431iM119841b = this.f160217x.reducer.m119841b((InterfaceC32776b) obj);
                    c42600a.f160224y = null;
                    c42600a.f160218E = null;
                    c42600a.f160219F = null;
                    c42600a.f160220G = null;
                    c42600a.f160221H = 0;
                    c42600a.f160223x = 1;
                    if (interfaceC13062m.emit(interfaceC37431iM119841b, c42600a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37430h c37430h) {
            this.f160214w = interfaceC13058l;
            this.f160215x = c37430h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f160214w.collect(new a(interfaceC13062m, this.f160215x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37430h(C32777c interactor, C37432j reducer, C32782h selection, String storeDomain, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.selection = selection;
        this.storeDomain = storeDomain;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.buyNowViewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC32775a m119826o(InterfaceC37427e.i iVar) {
        if (AbstractC22676k.m65745e(iVar, InterfaceC37427e.g.f160185a)) {
            return new InterfaceC32775a.c(this.selection, this.storeDomain);
        }
        if (iVar instanceof InterfaceC37427e.f) {
            return new InterfaceC32775a.b(((InterfaceC37427e.f) iVar).getOrder());
        }
        if (AbstractC22676k.m65745e(iVar, InterfaceC37427e.b.f160178a)) {
            return InterfaceC32775a.a.f136360a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m119827n(InterfaceC37427e.i event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C37430h(C32777c c32777c, C37432j c37432j, C32782h c32782h, String str, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c32777c, c37432j, c32782h, str, (i13 & 16) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

package ep2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bp2.AbstractC3538b;
import bp2.C3539c;
import bp2.C3540d;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fp2.C14680a;
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

/* JADX INFO: renamed from: ep2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lep2/b;", "Landroidx/lifecycle/w1;", "Lbp2/d;", "interactor", "Lfp2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lbp2/d;Lfp2/a;Lbc3/c0;)V", "Lec3/l;", "Lbp2/b;", "Lbp2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lep2/a$q;", "o", "(Lep2/a$q;)Lbp2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lep2/a$q;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbp2/d;", "x", "Lfp2/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lep2/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13430b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C3540d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14680a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ep2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.presentation.ReceiptViewModel$sendViewEvent$1", m100430f = "ReceiptViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f47051w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13429a.q f47053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13429a.q qVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f47053y = qVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13430b.this.new a(this.f47053y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f47051w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C13430b.this.eventFlow;
                InterfaceC13429a.q qVar = this.f47053y;
                this.f47051w = 1;
                if (interfaceC13072o1.emit(qVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ep2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f47054w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13430b f47055x;

        /* JADX INFO: renamed from: ep2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f47056w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13430b f47057x;

            /* JADX INFO: renamed from: ep2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.presentation.ReceiptViewModel$special$$inlined$map$1$2", m100430f = "ReceiptViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41560a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f47058E;

                /* JADX INFO: renamed from: F */
                Object f47059F;

                /* JADX INFO: renamed from: G */
                Object f47060G;

                /* JADX INFO: renamed from: H */
                int f47061H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f47062w;

                /* JADX INFO: renamed from: x */
                int f47063x;

                /* JADX INFO: renamed from: y */
                Object f47064y;

                public C41560a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f47062w = obj;
                    this.f47063x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13430b c13430b) {
                this.f47056w = interfaceC13062m;
                this.f47057x = c13430b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41560a c41560a;
                if (interfaceC30057d instanceof C41560a) {
                    c41560a = (C41560a) interfaceC30057d;
                    int i13 = c41560a.f47063x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41560a.f47063x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41560a = new C41560a(interfaceC30057d);
                    }
                } else {
                    c41560a = new C41560a(interfaceC30057d);
                }
                Object obj2 = c41560a.f47062w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41560a.f47063x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f47056w;
                    AbstractC3538b abstractC3538bM38152o = this.f47057x.m38152o((InterfaceC13429a.q) obj);
                    c41560a.f47064y = null;
                    c41560a.f47058E = null;
                    c41560a.f47059F = null;
                    c41560a.f47060G = null;
                    c41560a.f47061H = 0;
                    c41560a.f47063x = 1;
                    if (interfaceC13062m.emit(abstractC3538bM38152o, c41560a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C13430b c13430b) {
            this.f47054w = interfaceC13058l;
            this.f47055x = c13430b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f47054w.collect(new a(interfaceC13062m, this.f47055x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ep2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f47066w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13430b f47067x;

        /* JADX INFO: renamed from: ep2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f47068w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13430b f47069x;

            /* JADX INFO: renamed from: ep2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.presentation.ReceiptViewModel$special$$inlined$map$2$2", m100430f = "ReceiptViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41561a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f47070E;

                /* JADX INFO: renamed from: F */
                Object f47071F;

                /* JADX INFO: renamed from: G */
                Object f47072G;

                /* JADX INFO: renamed from: H */
                int f47073H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f47074w;

                /* JADX INFO: renamed from: x */
                int f47075x;

                /* JADX INFO: renamed from: y */
                Object f47076y;

                public C41561a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f47074w = obj;
                    this.f47075x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13430b c13430b) {
                this.f47068w = interfaceC13062m;
                this.f47069x = c13430b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41561a c41561a;
                if (interfaceC30057d instanceof C41561a) {
                    c41561a = (C41561a) interfaceC30057d;
                    int i13 = c41561a.f47075x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41561a.f47075x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41561a = new C41561a(interfaceC30057d);
                    }
                } else {
                    c41561a = new C41561a(interfaceC30057d);
                }
                Object obj2 = c41561a.f47074w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41561a.f47075x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f47068w;
                    C13431c c13431cM41995b = this.f47069x.reducer.m41995b((C3539c) obj);
                    c41561a.f47076y = null;
                    c41561a.f47070E = null;
                    c41561a.f47071F = null;
                    c41561a.f47072G = null;
                    c41561a.f47073H = 0;
                    c41561a.f47075x = 1;
                    if (interfaceC13062m.emit(c13431cM41995b, c41561a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C13430b c13430b) {
            this.f47066w = interfaceC13058l;
            this.f47067x = c13430b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f47066w.collect(new a(interfaceC13062m, this.f47067x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13430b(C3540d interactor, C14680a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC3538b m38152o(InterfaceC13429a.q qVar) {
        if (qVar instanceof InterfaceC13429a.g) {
            InterfaceC13429a.g gVar = (InterfaceC13429a.g) qVar;
            return new AbstractC3538b.b(gVar.getCartId(), gVar.getSource());
        }
        if (qVar instanceof InterfaceC13429a.p) {
            return AbstractC3538b.d.f14187a;
        }
        if (qVar instanceof InterfaceC13429a.n) {
            return new AbstractC3538b.c(((InterfaceC13429a.n) qVar).getModal());
        }
        if (qVar instanceof InterfaceC13429a.e) {
            return AbstractC3538b.a.f14182a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m38153n(InterfaceC13429a.q event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C13430b(C3540d c3540d, C14680a c14680a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3540d, c14680a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

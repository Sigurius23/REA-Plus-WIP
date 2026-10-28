package pc2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.settings.regulatorylabels.AbstractC10150a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
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

/* JADX INFO: renamed from: pc2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lpc2/e;", "Landroidx/lifecycle/w1;", "Lpc2/c;", "interactor", "Lpc2/g;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lpc2/c;Lpc2/g;Lbc3/c0;)V", "Lcom/whoop/settings/regulatorylabels/a;", "Lpc2/a$a;", "p", "(Lcom/whoop/settings/regulatorylabels/a;)Lpc2/a$a;", "action", "Ll83/a0;", "o", "(Lcom/whoop/settings/regulatorylabels/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lpc2/c;", "x", "Lpc2/g;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lpc2/f;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29075e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C29073c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29077g viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: pc2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.regulatorylabels.RegulatoryLabelsViewModel$sendEvent$1", m100430f = "RegulatoryLabelsViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117639w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC10150a f117641y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10150a abstractC10150a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117641y = abstractC10150a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29075e.this.new a(this.f117641y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117639w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29075e.this.eventFlow;
                AbstractC10150a abstractC10150a = this.f117641y;
                this.f117639w = 1;
                if (interfaceC13072o1.emit(abstractC10150a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pc2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117642w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29075e f117643x;

        /* JADX INFO: renamed from: pc2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117644w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29075e f117645x;

            /* JADX INFO: renamed from: pc2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.regulatorylabels.RegulatoryLabelsViewModel$special$$inlined$map$1$2", m100430f = "RegulatoryLabelsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42155a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117646E;

                /* JADX INFO: renamed from: F */
                Object f117647F;

                /* JADX INFO: renamed from: G */
                Object f117648G;

                /* JADX INFO: renamed from: H */
                int f117649H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117650w;

                /* JADX INFO: renamed from: x */
                int f117651x;

                /* JADX INFO: renamed from: y */
                Object f117652y;

                public C42155a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117650w = obj;
                    this.f117651x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29075e c29075e) {
                this.f117644w = interfaceC13062m;
                this.f117645x = c29075e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42155a c42155a;
                if (interfaceC30057d instanceof C42155a) {
                    c42155a = (C42155a) interfaceC30057d;
                    int i13 = c42155a.f117651x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42155a.f117651x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42155a = new C42155a(interfaceC30057d);
                    }
                } else {
                    c42155a = new C42155a(interfaceC30057d);
                }
                Object obj2 = c42155a.f117650w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42155a.f117651x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117644w;
                    AbstractC29071a.a aVarM88396p = this.f117645x.m88396p((AbstractC10150a) obj);
                    c42155a.f117652y = null;
                    c42155a.f117646E = null;
                    c42155a.f117647F = null;
                    c42155a.f117648G = null;
                    c42155a.f117649H = 0;
                    c42155a.f117651x = 1;
                    if (interfaceC13062m.emit(aVarM88396p, c42155a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29075e c29075e) {
            this.f117642w = interfaceC13058l;
            this.f117643x = c29075e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117642w.collect(new a(interfaceC13062m, this.f117643x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pc2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117654w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29075e f117655x;

        /* JADX INFO: renamed from: pc2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117656w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29075e f117657x;

            /* JADX INFO: renamed from: pc2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.regulatorylabels.RegulatoryLabelsViewModel$special$$inlined$map$2$2", m100430f = "RegulatoryLabelsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42156a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117658E;

                /* JADX INFO: renamed from: F */
                Object f117659F;

                /* JADX INFO: renamed from: G */
                Object f117660G;

                /* JADX INFO: renamed from: H */
                int f117661H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117662w;

                /* JADX INFO: renamed from: x */
                int f117663x;

                /* JADX INFO: renamed from: y */
                Object f117664y;

                public C42156a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117662w = obj;
                    this.f117663x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29075e c29075e) {
                this.f117656w = interfaceC13062m;
                this.f117657x = c29075e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42156a c42156a;
                if (interfaceC30057d instanceof C42156a) {
                    c42156a = (C42156a) interfaceC30057d;
                    int i13 = c42156a.f117663x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42156a.f117663x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42156a = new C42156a(interfaceC30057d);
                    }
                } else {
                    c42156a = new C42156a(interfaceC30057d);
                }
                Object obj2 = c42156a.f117662w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42156a.f117663x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117656w;
                    C29076f c29076fM88401a = this.f117657x.viewStateReducer.m88401a((AbstractC29072b) obj);
                    c42156a.f117664y = null;
                    c42156a.f117658E = null;
                    c42156a.f117659F = null;
                    c42156a.f117660G = null;
                    c42156a.f117661H = 0;
                    c42156a.f117663x = 1;
                    if (interfaceC13062m.emit(c29076fM88401a, c42156a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29075e c29075e) {
            this.f117654w = interfaceC13058l;
            this.f117655x = c29075e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117654w.collect(new a(interfaceC13062m, this.f117655x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29075e(C29073c interactor, C29077g viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), scope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC29071a.a m88396p(AbstractC10150a abstractC10150a) {
        if (abstractC10150a instanceof AbstractC10150a.a) {
            return AbstractC29071a.a.f117613a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m88398o(AbstractC10150a action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(action, null), 3);
    }

    public /* synthetic */ C29075e(C29073c c29073c, C29077g c29077g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29073c, c29077g, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

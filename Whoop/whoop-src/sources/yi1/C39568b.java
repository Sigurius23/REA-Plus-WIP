package yi1;

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
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vi1.C36061d;
import vi1.InterfaceC36059b;
import vi1.InterfaceC36060c;

/* JADX INFO: renamed from: yi1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lyi1/b;", "Landroidx/lifecycle/w1;", "Lvi1/d;", "interactor", "Lyi1/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lvi1/d;Lyi1/e;Lbc3/c0;)V", "Lyi1/c;", "viewEvent", "Lvi1/b$a;", "o", "(Lyi1/c;)Lvi1/b$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lyi1/c;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "_viewEvents", "Lec3/t1;", "Lyi1/d;", "y", "Lec3/t1;", "l", "()Lec3/t1;", "viewState", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39568b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 _viewEvents;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: yi1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.presentation.HeartHealthTabViewModel$sendViewEvent$1", m100430f = "HeartHealthTabViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170234w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39569c f170236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC39569c interfaceC39569c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170236y = interfaceC39569c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39568b.this.new a(this.f170236y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170234w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C39568b.this._viewEvents;
                InterfaceC39569c interfaceC39569c = this.f170236y;
                this.f170234w = 1;
                if (interfaceC13072o1.emit(interfaceC39569c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yi1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39568b f170238x;

        /* JADX INFO: renamed from: yi1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170239w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39568b f170240x;

            /* JADX INFO: renamed from: yi1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.presentation.HeartHealthTabViewModel$special$$inlined$map$1$2", m100430f = "HeartHealthTabViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42698a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f170241E;

                /* JADX INFO: renamed from: F */
                Object f170242F;

                /* JADX INFO: renamed from: G */
                Object f170243G;

                /* JADX INFO: renamed from: H */
                int f170244H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170245w;

                /* JADX INFO: renamed from: x */
                int f170246x;

                /* JADX INFO: renamed from: y */
                Object f170247y;

                public C42698a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170245w = obj;
                    this.f170246x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39568b c39568b) {
                this.f170239w = interfaceC13062m;
                this.f170240x = c39568b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42698a c42698a;
                if (interfaceC30057d instanceof C42698a) {
                    c42698a = (C42698a) interfaceC30057d;
                    int i13 = c42698a.f170246x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42698a.f170246x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42698a = new C42698a(interfaceC30057d);
                    }
                } else {
                    c42698a = new C42698a(interfaceC30057d);
                }
                Object obj2 = c42698a.f170245w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42698a.f170246x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170239w;
                    InterfaceC36059b.a aVarM126370o = this.f170240x.m126370o((InterfaceC39569c) obj);
                    c42698a.f170247y = null;
                    c42698a.f170241E = null;
                    c42698a.f170242F = null;
                    c42698a.f170243G = null;
                    c42698a.f170244H = 0;
                    c42698a.f170246x = 1;
                    if (interfaceC13062m.emit(aVarM126370o, c42698a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C39568b c39568b) {
            this.f170237w = interfaceC13058l;
            this.f170238x = c39568b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170237w.collect(new a(interfaceC13062m, this.f170238x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yi1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170249w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39571e f170250x;

        /* JADX INFO: renamed from: yi1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170251w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39571e f170252x;

            /* JADX INFO: renamed from: yi1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.presentation.HeartHealthTabViewModel$special$$inlined$map$2$2", m100430f = "HeartHealthTabViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42699a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f170253E;

                /* JADX INFO: renamed from: F */
                Object f170254F;

                /* JADX INFO: renamed from: G */
                Object f170255G;

                /* JADX INFO: renamed from: H */
                int f170256H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170257w;

                /* JADX INFO: renamed from: x */
                int f170258x;

                /* JADX INFO: renamed from: y */
                Object f170259y;

                public C42699a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170257w = obj;
                    this.f170258x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39571e c39571e) {
                this.f170251w = interfaceC13062m;
                this.f170252x = c39571e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42699a c42699a;
                if (interfaceC30057d instanceof C42699a) {
                    c42699a = (C42699a) interfaceC30057d;
                    int i13 = c42699a.f170258x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42699a.f170258x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42699a = new C42699a(interfaceC30057d);
                    }
                } else {
                    c42699a = new C42699a(interfaceC30057d);
                }
                Object obj2 = c42699a.f170257w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42699a.f170258x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170251w;
                    InterfaceC39570d interfaceC39570dM126379b = this.f170252x.m126379b((InterfaceC36060c) obj);
                    c42699a.f170259y = null;
                    c42699a.f170253E = null;
                    c42699a.f170254F = null;
                    c42699a.f170255G = null;
                    c42699a.f170256H = 0;
                    c42699a.f170258x = 1;
                    if (interfaceC13062m.emit(interfaceC39570dM126379b, c42699a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C39571e c39571e) {
            this.f170249w = interfaceC13058l;
            this.f170250x = c39571e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170249w.collect(new a(interfaceC13062m, this.f170250x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39568b(C36061d interactor, C39571e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._viewEvents = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), reducer), coroutineScope, C13105z1.m36630a(2, 5000L), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC36059b.a m126370o(InterfaceC39569c viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC39569c.a.f170261a)) {
            return InterfaceC36059b.a.f153924a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m126372n(InterfaceC39569c event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }
}

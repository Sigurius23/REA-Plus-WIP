package rd0;

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
import pd0.AbstractC29101a;
import pd0.AbstractC29102b;
import pd0.C29103c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td0.C33702a;

/* JADX INFO: renamed from: rd0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lrd0/b;", "Landroidx/lifecycle/w1;", "Lpd0/c;", "interactor", "Ltd0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lpd0/c;Ltd0/a;Lbc3/c0;)V", "Lec3/l;", "Lpd0/a;", "Lpd0/b;", "l", "(Lec3/l;Lpd0/c;)Lec3/l;", "Lrd0/a;", "o", "(Lrd0/a;)Lpd0/a;", "viewEvent", "Ll83/a0;", "n", "(Lrd0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lrd0/c;", "z", "getViewState", "()Lec3/l;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31240b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: rd0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.rafReceiver.presentation.RafReceiverViewModel$sendViewEvent$1", m100430f = "RafReceiverViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128629w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31239a f128631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC31239a interfaceC31239a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128631y = interfaceC31239a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31240b.this.new a(this.f128631y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128629w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31240b.this.eventFlow;
                InterfaceC31239a interfaceC31239a = this.f128631y;
                this.f128629w = 1;
                if (interfaceC13072o1.emit(interfaceC31239a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rd0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f128632w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31240b f128633x;

        /* JADX INFO: renamed from: rd0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f128634w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31240b f128635x;

            /* JADX INFO: renamed from: rd0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.rafReceiver.presentation.RafReceiverViewModel$special$$inlined$map$1$2", m100430f = "RafReceiverViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42255a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f128636E;

                /* JADX INFO: renamed from: F */
                Object f128637F;

                /* JADX INFO: renamed from: G */
                Object f128638G;

                /* JADX INFO: renamed from: H */
                int f128639H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f128640w;

                /* JADX INFO: renamed from: x */
                int f128641x;

                /* JADX INFO: renamed from: y */
                Object f128642y;

                public C42255a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f128640w = obj;
                    this.f128641x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31240b c31240b) {
                this.f128634w = interfaceC13062m;
                this.f128635x = c31240b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42255a c42255a;
                if (interfaceC30057d instanceof C42255a) {
                    c42255a = (C42255a) interfaceC30057d;
                    int i13 = c42255a.f128641x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42255a.f128641x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42255a = new C42255a(interfaceC30057d);
                    }
                } else {
                    c42255a = new C42255a(interfaceC30057d);
                }
                Object obj2 = c42255a.f128640w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42255a.f128641x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f128634w;
                    AbstractC29101a abstractC29101aM96198o = this.f128635x.m96198o((InterfaceC31239a) obj);
                    c42255a.f128642y = null;
                    c42255a.f128636E = null;
                    c42255a.f128637F = null;
                    c42255a.f128638G = null;
                    c42255a.f128639H = 0;
                    c42255a.f128641x = 1;
                    if (interfaceC13062m.emit(abstractC29101aM96198o, c42255a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C31240b c31240b) {
            this.f128632w = interfaceC13058l;
            this.f128633x = c31240b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f128632w.collect(new a(interfaceC13062m, this.f128633x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rd0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f128644w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33702a f128645x;

        /* JADX INFO: renamed from: rd0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f128646w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33702a f128647x;

            /* JADX INFO: renamed from: rd0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.rafReceiver.presentation.RafReceiverViewModel$special$$inlined$map$2$2", m100430f = "RafReceiverViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42256a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f128648E;

                /* JADX INFO: renamed from: F */
                Object f128649F;

                /* JADX INFO: renamed from: G */
                Object f128650G;

                /* JADX INFO: renamed from: H */
                int f128651H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f128652w;

                /* JADX INFO: renamed from: x */
                int f128653x;

                /* JADX INFO: renamed from: y */
                Object f128654y;

                public C42256a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f128652w = obj;
                    this.f128653x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33702a c33702a) {
                this.f128646w = interfaceC13062m;
                this.f128647x = c33702a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42256a c42256a;
                if (interfaceC30057d instanceof C42256a) {
                    c42256a = (C42256a) interfaceC30057d;
                    int i13 = c42256a.f128653x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42256a.f128653x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42256a = new C42256a(interfaceC30057d);
                    }
                } else {
                    c42256a = new C42256a(interfaceC30057d);
                }
                Object obj2 = c42256a.f128652w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42256a.f128653x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f128646w;
                    C31241c c31241cM106479a = this.f128647x.m106479a((AbstractC29102b) obj);
                    c42256a.f128654y = null;
                    c42256a.f128648E = null;
                    c42256a.f128649F = null;
                    c42256a.f128650G = null;
                    c42256a.f128651H = 0;
                    c42256a.f128653x = 1;
                    if (interfaceC13062m.emit(c31241cM106479a, c42256a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C33702a c33702a) {
            this.f128644w = interfaceC13058l;
            this.f128645x = c33702a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f128644w.collect(new a(interfaceC13062m, this.f128645x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31240b(C29103c interactor, C33702a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM96197l = m96197l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM96197l;
        this.viewState = new c(AbstractC13091v.m36586L(interfaceC13058lM96197l, coroutineScope, C13105z1.f45288a, 1), reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m96197l(InterfaceC13058l interfaceC13058l, C29103c c29103c) {
        return c29103c.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC29101a m96198o(InterfaceC31239a interfaceC31239a) {
        if (interfaceC31239a instanceof InterfaceC31239a.b) {
            return new AbstractC29101a.b(((InterfaceC31239a.b) interfaceC31239a).getCode());
        }
        if (!(interfaceC31239a instanceof InterfaceC31239a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC31239a.a aVar = (InterfaceC31239a.a) interfaceC31239a;
        return new AbstractC29101a.a(aVar.getCode(), aVar.getActionName());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m96199n(InterfaceC31239a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C31240b(C29103c c29103c, C33702a c33702a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29103c, c33702a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package ff0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import df0.AbstractC11997a;
import df0.AbstractC11998b;
import df0.C11999c;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ef0.AbstractC13142a;
import ef0.C13143b;
import gf0.C15781a;
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

/* JADX INFO: renamed from: ff0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00108\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010,¨\u00062"}, m65681d2 = {"Lff0/b;", "Landroidx/lifecycle/w1;", "Ldf0/c;", "interactor", "Lgf0/a;", "reducer", "Lef0/b;", "navigationReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldf0/c;Lgf0/a;Lef0/b;Lbc3/c0;)V", "Lff0/a;", "Ldf0/a;", "q", "(Lff0/a;)Ldf0/a;", "Lec3/l;", "Ldf0/b;", "Lff0/c;", "o", "(Lec3/l;Lgf0/a;)Lec3/l;", "interact", "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lff0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ldf0/c;", "x", "Lgf0/a;", "y", "Lef0/b;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "Lec3/l;", "domainState", "G", "getViewState", "()Lec3/l;", "viewState", "Lef0/a;", "H", "n", "navigationEvent", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14425b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvent;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11999c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C15781a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C13143b navigationReducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: ff0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.presentation.AdvancedLabsTypeformWebviewViewModel$sendViewEvent$1", m100430f = "AdvancedLabsTypeformWebviewViewModel.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52619w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14424a f52621y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC14424a abstractC14424a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52621y = abstractC14424a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14425b.this.new a(this.f52621y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52619w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14425b.this.eventFlow;
                AbstractC14424a abstractC14424a = this.f52621y;
                this.f52619w = 1;
                if (interfaceC13072o1.emit(abstractC14424a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ff0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f52622w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14425b f52623x;

        /* JADX INFO: renamed from: ff0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f52624w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14425b f52625x;

            /* JADX INFO: renamed from: ff0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.presentation.AdvancedLabsTypeformWebviewViewModel$special$$inlined$map$1$2", m100430f = "AdvancedLabsTypeformWebviewViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41584a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f52626E;

                /* JADX INFO: renamed from: F */
                Object f52627F;

                /* JADX INFO: renamed from: G */
                Object f52628G;

                /* JADX INFO: renamed from: H */
                int f52629H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f52630w;

                /* JADX INFO: renamed from: x */
                int f52631x;

                /* JADX INFO: renamed from: y */
                Object f52632y;

                public C41584a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f52630w = obj;
                    this.f52631x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14425b c14425b) {
                this.f52624w = interfaceC13062m;
                this.f52625x = c14425b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41584a c41584a;
                if (interfaceC30057d instanceof C41584a) {
                    c41584a = (C41584a) interfaceC30057d;
                    int i13 = c41584a.f52631x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41584a.f52631x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41584a = new C41584a(interfaceC30057d);
                    }
                } else {
                    c41584a = new C41584a(interfaceC30057d);
                }
                Object obj2 = c41584a.f52630w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41584a.f52631x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f52624w;
                    AbstractC11997a abstractC11997aM41136q = this.f52625x.m41136q((AbstractC14424a) obj);
                    c41584a.f52632y = null;
                    c41584a.f52626E = null;
                    c41584a.f52627F = null;
                    c41584a.f52628G = null;
                    c41584a.f52629H = 0;
                    c41584a.f52631x = 1;
                    if (interfaceC13062m.emit(abstractC11997aM41136q, c41584a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C14425b c14425b) {
            this.f52622w = interfaceC13058l;
            this.f52623x = c14425b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f52622w.collect(new a(interfaceC13062m, this.f52623x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ff0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f52634w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14425b f52635x;

        /* JADX INFO: renamed from: ff0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f52636w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14425b f52637x;

            /* JADX INFO: renamed from: ff0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.presentation.AdvancedLabsTypeformWebviewViewModel$special$$inlined$mapNotNull$1$2", m100430f = "AdvancedLabsTypeformWebviewViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41585a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f52638E;

                /* JADX INFO: renamed from: F */
                Object f52639F;

                /* JADX INFO: renamed from: G */
                Object f52640G;

                /* JADX INFO: renamed from: H */
                Object f52641H;

                /* JADX INFO: renamed from: I */
                int f52642I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f52643w;

                /* JADX INFO: renamed from: x */
                int f52644x;

                /* JADX INFO: renamed from: y */
                Object f52645y;

                public C41585a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f52643w = obj;
                    this.f52644x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14425b c14425b) {
                this.f52636w = interfaceC13062m;
                this.f52637x = c14425b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41585a c41585a;
                if (interfaceC30057d instanceof C41585a) {
                    c41585a = (C41585a) interfaceC30057d;
                    int i13 = c41585a.f52644x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41585a.f52644x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41585a = new C41585a(interfaceC30057d);
                    }
                } else {
                    c41585a = new C41585a(interfaceC30057d);
                }
                Object obj2 = c41585a.f52643w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41585a.f52644x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f52636w;
                    AbstractC13142a abstractC13142aM36773a = this.f52637x.navigationReducer.m36773a((AbstractC11998b) obj);
                    if (abstractC13142aM36773a != null) {
                        c41585a.f52645y = null;
                        c41585a.f52638E = null;
                        c41585a.f52639F = null;
                        c41585a.f52640G = null;
                        c41585a.f52641H = null;
                        c41585a.f52642I = 0;
                        c41585a.f52644x = 1;
                        if (interfaceC13062m.emit(abstractC13142aM36773a, c41585a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public c(InterfaceC13058l interfaceC13058l, C14425b c14425b) {
            this.f52634w = interfaceC13058l;
            this.f52635x = c14425b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f52634w.collect(new a(interfaceC13062m, this.f52635x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14425b(C11999c interactor, C15781a reducer, C13143b navigationReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.navigationReducer = navigationReducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m41135o(c13078q1M36586L, reducer);
        this.navigationEvent = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m41135o(InterfaceC13058l interfaceC13058l, C15781a c15781a) {
        return c15781a.m44484a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC11997a m41136q(AbstractC14424a abstractC14424a) {
        if (abstractC14424a instanceof AbstractC14424a.b) {
            AbstractC14424a.b bVar = (AbstractC14424a.b) abstractC14424a;
            return new AbstractC11997a.c(bVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), bVar.getTestTokenId(), bVar.getTestType());
        }
        if (abstractC14424a instanceof AbstractC14424a.d) {
            return new AbstractC11997a.f(((AbstractC14424a.d) abstractC14424a).getUri());
        }
        if (abstractC14424a instanceof AbstractC14424a.c) {
            return AbstractC11997a.e.f39491a;
        }
        if (abstractC14424a instanceof AbstractC14424a.a) {
            return new AbstractC11997a.a(((AbstractC14424a.a) abstractC14424a).getTestType());
        }
        if (abstractC14424a instanceof AbstractC14424a.e) {
            return AbstractC11997a.g.f39493a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: p */
    public final void m41138p(AbstractC14424a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C14425b(C11999c c11999c, C15781a c15781a, C13143b c13143b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11999c, c15781a, c13143b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

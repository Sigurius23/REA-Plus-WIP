package qa0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import na0.AbstractC26506b;
import na0.AbstractC26507c;
import na0.C26505a;
import na0.C26508d;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import ra0.C31178a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vw2.AbstractC36547b;
import vw2.InterfaceC36546a;

/* JADX INFO: renamed from: qa0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e*\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00104R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060\u000e8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00104¨\u0006:"}, m65681d2 = {"Lqa0/b;", "Landroidx/lifecycle/w1;", "Lna0/d;", "interactor", "Lra0/a;", "reducer", "Lqw2/c;", "actionInteractor", "Lna0/a;", "actionMapper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lna0/d;Lra0/a;Lqw2/c;Lna0/a;Lbc3/c0;)V", "Lec3/l;", "Lna0/b;", "Lna0/c;", "o", "(Lec3/l;Lna0/d;)Lec3/l;", "Lqw2/a;", "Lqw2/b;", "p", "(Lec3/l;Lqw2/c;)Lec3/l;", "Lqa0/a$g;", "viewEvent", "Ll83/a0;", "r", "(Lqa0/a$g;)V", "Lvw2/a;", "actionViewEvent", "q", "(Lvw2/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lna0/a;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "actionFlow", "Lec3/t1;", "E", "Lec3/t1;", "actionStateFlow", "F", "Lec3/l;", "domainState", "Lqa0/c;", "G", "getViewState", "()Lec3/l;", "viewState", "Lqa0/a$e;", "H", "n", "navigationEvents", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30110b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 actionStateFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C26505a actionMapper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: qa0.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$sendAction$1", m100430f = "ActionPlanViewModel.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C30110b f122870E;

        /* JADX INFO: renamed from: w */
        Object f122871w;

        /* JADX INFO: renamed from: x */
        int f122872x;

        /* JADX INFO: renamed from: y */
        int f122873y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36546a f122874z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36546a interfaceC36546a, C30110b c30110b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122874z = interfaceC36546a;
            this.f122870E = c30110b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f122874z, this.f122870E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122873y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30693a interfaceC30693aM117178a = AbstractC36547b.m117178a(this.f122874z);
                if (interfaceC30693aM117178a != null) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f122870E.actionFlow;
                    this.f122871w = null;
                    this.f122872x = 0;
                    this.f122873y = 1;
                    if (interfaceC13072o1.emit(interfaceC30693aM117178a, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: qa0.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$sendViewEvent$1", m100430f = "ActionPlanViewModel.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30109a.g f122877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30109a.g gVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122877y = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30110b.this.new b(this.f122877y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122875w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30110b.this.eventFlow;
                InterfaceC30109a.g gVar = this.f122877y;
                this.f122875w = 1;
                if (interfaceC13072o1.emit(gVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qa0.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122878w;

        /* JADX INFO: renamed from: qa0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122879w;

            /* JADX INFO: renamed from: qa0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "ActionPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42210a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f122881F;

                /* JADX INFO: renamed from: G */
                Object f122882G;

                /* JADX INFO: renamed from: H */
                int f122883H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122884w;

                /* JADX INFO: renamed from: x */
                int f122885x;

                /* JADX INFO: renamed from: y */
                Object f122886y;

                /* JADX INFO: renamed from: z */
                Object f122887z;

                public C42210a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122884w = obj;
                    this.f122885x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f122879w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42210a c42210a;
                if (interfaceC30057d instanceof C42210a) {
                    c42210a = (C42210a) interfaceC30057d;
                    int i13 = c42210a.f122885x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42210a.f122885x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42210a = new C42210a(interfaceC30057d);
                    }
                } else {
                    c42210a = new C42210a(interfaceC30057d);
                }
                Object obj2 = c42210a.f122884w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42210a.f122885x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122879w;
                    if (obj instanceof AbstractC30694b.d) {
                        c42210a.f122886y = null;
                        c42210a.f122887z = null;
                        c42210a.f122881F = null;
                        c42210a.f122882G = null;
                        c42210a.f122883H = 0;
                        c42210a.f122885x = 1;
                        if (interfaceC13062m.emit(obj, c42210a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f122878w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122878w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qa0.b$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122888w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30110b f122889x;

        /* JADX INFO: renamed from: qa0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122890w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30110b f122891x;

            /* JADX INFO: renamed from: qa0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$special$$inlined$map$1$2", m100430f = "ActionPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42211a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122892E;

                /* JADX INFO: renamed from: F */
                Object f122893F;

                /* JADX INFO: renamed from: G */
                Object f122894G;

                /* JADX INFO: renamed from: H */
                int f122895H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122896w;

                /* JADX INFO: renamed from: x */
                int f122897x;

                /* JADX INFO: renamed from: y */
                Object f122898y;

                public C42211a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122896w = obj;
                    this.f122897x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30110b c30110b) {
                this.f122890w = interfaceC13062m;
                this.f122891x = c30110b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42211a c42211a;
                if (interfaceC30057d instanceof C42211a) {
                    c42211a = (C42211a) interfaceC30057d;
                    int i13 = c42211a.f122897x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42211a.f122897x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42211a = new C42211a(interfaceC30057d);
                    }
                } else {
                    c42211a = new C42211a(interfaceC30057d);
                }
                Object obj2 = c42211a.f122896w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42211a.f122897x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122890w;
                    AbstractC26506b abstractC26506bM78568b = this.f122891x.actionMapper.m78568b((InterfaceC30109a.g) obj);
                    c42211a.f122898y = null;
                    c42211a.f122892E = null;
                    c42211a.f122893F = null;
                    c42211a.f122894G = null;
                    c42211a.f122895H = 0;
                    c42211a.f122897x = 1;
                    if (interfaceC13062m.emit(abstractC26506bM78568b, c42211a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C30110b c30110b) {
            this.f122888w = interfaceC13058l;
            this.f122889x = c30110b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122888w.collect(new a(interfaceC13062m, this.f122889x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qa0.b$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122900w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31178a f122901x;

        /* JADX INFO: renamed from: qa0.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122902w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31178a f122903x;

            /* JADX INFO: renamed from: qa0.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$special$$inlined$map$2$2", m100430f = "ActionPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42212a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122904E;

                /* JADX INFO: renamed from: F */
                Object f122905F;

                /* JADX INFO: renamed from: G */
                Object f122906G;

                /* JADX INFO: renamed from: H */
                int f122907H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122908w;

                /* JADX INFO: renamed from: x */
                int f122909x;

                /* JADX INFO: renamed from: y */
                Object f122910y;

                public C42212a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122908w = obj;
                    this.f122909x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31178a c31178a) {
                this.f122902w = interfaceC13062m;
                this.f122903x = c31178a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42212a c42212a;
                if (interfaceC30057d instanceof C42212a) {
                    c42212a = (C42212a) interfaceC30057d;
                    int i13 = c42212a.f122909x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42212a.f122909x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42212a = new C42212a(interfaceC30057d);
                    }
                } else {
                    c42212a = new C42212a(interfaceC30057d);
                }
                Object obj2 = c42212a.f122908w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42212a.f122909x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122902w;
                    AbstractC30111c abstractC30111cM95908a = this.f122903x.m95908a((AbstractC26507c) obj);
                    c42212a.f122910y = null;
                    c42212a.f122904E = null;
                    c42212a.f122905F = null;
                    c42212a.f122906G = null;
                    c42212a.f122907H = 0;
                    c42212a.f122909x = 1;
                    if (interfaceC13062m.emit(abstractC30111cM95908a, c42212a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C31178a c31178a) {
            this.f122900w = interfaceC13058l;
            this.f122901x = c31178a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122900w.collect(new a(interfaceC13062m, this.f122901x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qa0.b$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122912w;

        /* JADX INFO: renamed from: qa0.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122913w;

            /* JADX INFO: renamed from: qa0.b$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$special$$inlined$map$3$2", m100430f = "ActionPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42213a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122914E;

                /* JADX INFO: renamed from: F */
                Object f122915F;

                /* JADX INFO: renamed from: G */
                Object f122916G;

                /* JADX INFO: renamed from: H */
                int f122917H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122918w;

                /* JADX INFO: renamed from: x */
                int f122919x;

                /* JADX INFO: renamed from: y */
                Object f122920y;

                public C42213a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122918w = obj;
                    this.f122919x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f122913w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42213a c42213a;
                if (interfaceC30057d instanceof C42213a) {
                    c42213a = (C42213a) interfaceC30057d;
                    int i13 = c42213a.f122919x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42213a.f122919x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42213a = new C42213a(interfaceC30057d);
                    }
                } else {
                    c42213a = new C42213a(interfaceC30057d);
                }
                Object obj2 = c42213a.f122918w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42213a.f122919x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122913w;
                    InterfaceC30109a.c cVar = new InterfaceC30109a.c(((AbstractC30694b.d) obj).getDestination());
                    c42213a.f122920y = null;
                    c42213a.f122914E = null;
                    c42213a.f122915F = null;
                    c42213a.f122916G = null;
                    c42213a.f122917H = 0;
                    c42213a.f122919x = 1;
                    if (interfaceC13062m.emit(cVar, c42213a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f122912w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122912w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qa0.b$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122922w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30110b f122923x;

        /* JADX INFO: renamed from: qa0.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122924w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30110b f122925x;

            /* JADX INFO: renamed from: qa0.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.presentation.ActionPlanViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ActionPlanViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42214a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122926E;

                /* JADX INFO: renamed from: F */
                Object f122927F;

                /* JADX INFO: renamed from: G */
                Object f122928G;

                /* JADX INFO: renamed from: H */
                Object f122929H;

                /* JADX INFO: renamed from: I */
                int f122930I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122931w;

                /* JADX INFO: renamed from: x */
                int f122932x;

                /* JADX INFO: renamed from: y */
                Object f122933y;

                public C42214a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122931w = obj;
                    this.f122932x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30110b c30110b) {
                this.f122924w = interfaceC13062m;
                this.f122925x = c30110b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42214a c42214a;
                if (interfaceC30057d instanceof C42214a) {
                    c42214a = (C42214a) interfaceC30057d;
                    int i13 = c42214a.f122932x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42214a.f122932x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42214a = new C42214a(interfaceC30057d);
                    }
                } else {
                    c42214a = new C42214a(interfaceC30057d);
                }
                Object obj2 = c42214a.f122931w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42214a.f122932x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122924w;
                    AbstractC26506b abstractC26506bM78567a = this.f122925x.actionMapper.m78567a((AbstractC30694b) obj);
                    if (abstractC26506bM78567a != null) {
                        c42214a.f122933y = null;
                        c42214a.f122926E = null;
                        c42214a.f122927F = null;
                        c42214a.f122928G = null;
                        c42214a.f122929H = null;
                        c42214a.f122930I = 0;
                        c42214a.f122932x = 1;
                        if (interfaceC13062m.emit(abstractC26506bM78567a, c42214a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C30110b c30110b) {
            this.f122922w = interfaceC13058l;
            this.f122923x = c30110b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122922w.collect(new a(interfaceC13062m, this.f122923x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30110b(C26508d interactor, C31178a reducer, C30695c actionInteractor, C26505a actionMapper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(actionMapper, "actionMapper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.actionMapper = actionMapper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM92236p = m92236p(c13096w1M36592b2, actionInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM92236p, coroutineScope, c13021b2, 0);
        this.actionStateFlow = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(m92235o(AbstractC13091v.m36584J(new d(c13096w1M36592b, this), new g(c13078q1M36586L, this)), interactor), coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L2;
        this.viewState = new e(c13078q1M36586L2, reducer);
        this.navigationEvents = new f(new c(c13078q1M36586L));
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m92235o(InterfaceC13058l interfaceC13058l, C26508d c26508d) {
        return c26508d.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m92236p(InterfaceC13058l interfaceC13058l, C30695c c30695c) {
        return c30695c.interact(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: q */
    public final void m92238q(InterfaceC36546a actionViewEvent) {
        AbstractC22676k.m65750j(actionViewEvent, "actionViewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(actionViewEvent, this, null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m92239r(InterfaceC30109a.g viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C30110b(C26508d c26508d, C31178a c31178a, C30695c c30695c, C26505a c26505a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26508d, c31178a, c30695c, c26505a, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

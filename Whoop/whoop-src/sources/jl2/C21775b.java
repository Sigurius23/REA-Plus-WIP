package jl2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import hl2.AbstractC17408c;
import hl2.C17409d;
import hl2.C17411f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ml2.InterfaceC25676a;
import nl2.C26816c;
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

/* JADX INFO: renamed from: jl2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Ljl2/b;", "Landroidx/lifecycle/w1;", "Lhl2/f;", "interactor", "Ljl2/c;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lhl2/f;Ljl2/c;Lbc3/c0;)V", "Lec3/l;", "Lhl2/c;", "Lhl2/d;", "n", "(Lec3/l;Lhl2/f;)Lec3/l;", "Lml2/a$b;", "viewEvent", "o", "(Lml2/a$b;)Lhl2/c;", "Lbc3/k1;", "p", "(Lml2/a$b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljl2/c;", "x", "Lbc3/c0;", "Lec3/o1;", "Lml2/a;", "y", "Lec3/o1;", "eventFlow", "Lec3/t1;", "z", "Lec3/t1;", "domainState", "Lnl2/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21775b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C21776c reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: jl2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.presentation.HrSettingsViewModel$sendViewEvent$1", m100430f = "HrSettingsViewModel.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83853w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25676a.b f83855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC25676a.b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83855y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21775b.this.new a(this.f83855y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83853w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21775b.this.eventFlow;
                InterfaceC25676a.b bVar = this.f83855y;
                this.f83853w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jl2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83856w;

        /* JADX INFO: renamed from: jl2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83857w;

            /* JADX INFO: renamed from: jl2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.presentation.HrSettingsViewModel$special$$inlined$filter$1$2", m100430f = "HrSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41851a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f83859F;

                /* JADX INFO: renamed from: G */
                Object f83860G;

                /* JADX INFO: renamed from: H */
                int f83861H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83862w;

                /* JADX INFO: renamed from: x */
                int f83863x;

                /* JADX INFO: renamed from: y */
                Object f83864y;

                /* JADX INFO: renamed from: z */
                Object f83865z;

                public C41851a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83862w = obj;
                    this.f83863x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f83857w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41851a c41851a;
                if (interfaceC30057d instanceof C41851a) {
                    c41851a = (C41851a) interfaceC30057d;
                    int i13 = c41851a.f83863x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41851a.f83863x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41851a = new C41851a(interfaceC30057d);
                    }
                } else {
                    c41851a = new C41851a(interfaceC30057d);
                }
                Object obj2 = c41851a.f83862w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41851a.f83863x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83857w;
                    if (((InterfaceC25676a) obj) instanceof InterfaceC25676a.b) {
                        c41851a.f83864y = null;
                        c41851a.f83865z = null;
                        c41851a.f83859F = null;
                        c41851a.f83860G = null;
                        c41851a.f83861H = 0;
                        c41851a.f83863x = 1;
                        if (interfaceC13062m.emit(obj, c41851a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f83856w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83856w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jl2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83866w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21775b f83867x;

        /* JADX INFO: renamed from: jl2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83868w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21775b f83869x;

            /* JADX INFO: renamed from: jl2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.presentation.HrSettingsViewModel$special$$inlined$map$1$2", m100430f = "HrSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41852a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83870E;

                /* JADX INFO: renamed from: F */
                Object f83871F;

                /* JADX INFO: renamed from: G */
                Object f83872G;

                /* JADX INFO: renamed from: H */
                int f83873H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83874w;

                /* JADX INFO: renamed from: x */
                int f83875x;

                /* JADX INFO: renamed from: y */
                Object f83876y;

                public C41852a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83874w = obj;
                    this.f83875x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21775b c21775b) {
                this.f83868w = interfaceC13062m;
                this.f83869x = c21775b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41852a c41852a;
                if (interfaceC30057d instanceof C41852a) {
                    c41852a = (C41852a) interfaceC30057d;
                    int i13 = c41852a.f83875x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41852a.f83875x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41852a = new C41852a(interfaceC30057d);
                    }
                } else {
                    c41852a = new C41852a(interfaceC30057d);
                }
                Object obj2 = c41852a.f83874w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41852a.f83875x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83868w;
                    InterfaceC25676a interfaceC25676a = (InterfaceC25676a) obj;
                    C21775b c21775b = this.f83869x;
                    AbstractC22676k.m65748h(interfaceC25676a, "null cannot be cast to non-null type com.whoop.training.hrsettings.view.viewevent.HrSettingsEvent.ViewEvent");
                    AbstractC17408c abstractC17408cM61581o = c21775b.m61581o((InterfaceC25676a.b) interfaceC25676a);
                    c41852a.f83876y = null;
                    c41852a.f83870E = null;
                    c41852a.f83871F = null;
                    c41852a.f83872G = null;
                    c41852a.f83873H = 0;
                    c41852a.f83875x = 1;
                    if (interfaceC13062m.emit(abstractC17408cM61581o, c41852a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C21775b c21775b) {
            this.f83866w = interfaceC13058l;
            this.f83867x = c21775b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83866w.collect(new a(interfaceC13062m, this.f83867x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jl2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83878w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21775b f83879x;

        /* JADX INFO: renamed from: jl2.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83880w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21775b f83881x;

            /* JADX INFO: renamed from: jl2.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.presentation.HrSettingsViewModel$special$$inlined$map$2$2", m100430f = "HrSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41853a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83882E;

                /* JADX INFO: renamed from: F */
                Object f83883F;

                /* JADX INFO: renamed from: G */
                Object f83884G;

                /* JADX INFO: renamed from: H */
                int f83885H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83886w;

                /* JADX INFO: renamed from: x */
                int f83887x;

                /* JADX INFO: renamed from: y */
                Object f83888y;

                public C41853a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83886w = obj;
                    this.f83887x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21775b c21775b) {
                this.f83880w = interfaceC13062m;
                this.f83881x = c21775b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41853a c41853a;
                if (interfaceC30057d instanceof C41853a) {
                    c41853a = (C41853a) interfaceC30057d;
                    int i13 = c41853a.f83887x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41853a.f83887x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41853a = new C41853a(interfaceC30057d);
                    }
                } else {
                    c41853a = new C41853a(interfaceC30057d);
                }
                Object obj2 = c41853a.f83886w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41853a.f83887x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83880w;
                    C26816c c26816cM61596m = this.f83881x.reducer.m61596m((C17409d) obj);
                    c41853a.f83888y = null;
                    c41853a.f83882E = null;
                    c41853a.f83883F = null;
                    c41853a.f83884G = null;
                    c41853a.f83885H = 0;
                    c41853a.f83887x = 1;
                    if (interfaceC13062m.emit(c26816cM61596m, c41853a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C21775b c21775b) {
            this.f83878w = interfaceC13058l;
            this.f83879x = c21775b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83878w.collect(new a(interfaceC13062m, this.f83879x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21775b(C17411f interactor, C21776c reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m61580n(new c(new b(c13096w1M36592b), this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new d(c13078q1M36586L, this);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m61580n(InterfaceC13058l interfaceC13058l, C17411f c17411f) {
        return c17411f.m49412r(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC17408c m61581o(InterfaceC25676a.b viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.f.f100988a)) {
            return AbstractC17408c.f.f67409a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.p.f101003a)) {
            return AbstractC17408c.p.f67424a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.n.f101001a)) {
            return AbstractC17408c.n.f67422a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.o.f101002a)) {
            return AbstractC17408c.o.f67423a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.k.f100996a)) {
            return AbstractC17408c.k.f67417a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.C42011b.f100982a)) {
            return AbstractC17408c.c.f67404a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.j.f100995a)) {
            return AbstractC17408c.j.f67416a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.c.f100983a)) {
            return AbstractC17408c.a.f67402a;
        }
        if (viewEvent instanceof InterfaceC25676a.b.i) {
            return new AbstractC17408c.i(((InterfaceC25676a.b.i) viewEvent).getValue());
        }
        if (viewEvent instanceof InterfaceC25676a.b.l) {
            InterfaceC25676a.b.l lVar = (InterfaceC25676a.b.l) viewEvent;
            return new AbstractC17408c.l(lVar.getValue(), lVar.getMinValue(), lVar.getMaxValue());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.a.f100981a)) {
            return AbstractC17408c.b.f67403a;
        }
        if (viewEvent instanceof InterfaceC25676a.b.e) {
            InterfaceC25676a.b.e eVar = (InterfaceC25676a.b.e) viewEvent;
            return new AbstractC17408c.e(eVar.getId(), eVar.getValue(), eVar.getType());
        }
        if (viewEvent instanceof InterfaceC25676a.b.q) {
            return new AbstractC17408c.q(((InterfaceC25676a.b.q) viewEvent).getValue());
        }
        if (viewEvent instanceof InterfaceC25676a.b.g) {
            InterfaceC25676a.b.g gVar = (InterfaceC25676a.b.g) viewEvent;
            return new AbstractC17408c.g(gVar.getValue(), gVar.getZoneValueType(), gVar.getZoneId().getId(), gVar.getIsOutOfRange());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.h.f100993a)) {
            return AbstractC17408c.h.f67414a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC25676a.b.m.f101000a)) {
            return AbstractC17408c.m.f67421a;
        }
        if (viewEvent instanceof InterfaceC25676a.b.d) {
            return new AbstractC17408c.d(((InterfaceC25676a.b.d) viewEvent).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m61582p(InterfaceC25676a.b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C21775b(C17411f c17411f, C21776c c21776c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17411f, c21776c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package lo0;

import androidx.core.app.NotificationCompat;
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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.AbstractC20718e;
import io0.C20719f;
import io0.C20720g;
import l83.C23454a0;
import mo0.C25740c;
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

/* JADX INFO: renamed from: lo0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Llo0/m;", "Landroidx/lifecycle/w1;", "Lio0/g;", "interactor", "Lmo0/c;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio0/g;Lmo0/c;Lbc3/c0;)V", "Lec3/l;", "Lio0/e;", "Lio0/f;", "interact", "(Lec3/l;)Lec3/l;", "Llo0/k;", "o", "(Llo0/k;)Lio0/e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Llo0/k;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lio0/g;", "x", "Lmo0/c;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Llo0/n;", "F", "getViewState", "()Lec3/l;", "viewState", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24592m extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C20720g interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25740c reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: lo0.m$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianSchedulingConfirmationViewModel$sendViewEvent$1", m100430f = "ClinicianSchedulingConfirmationViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96091w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC24588k f96093y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24588k interfaceC24588k, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96093y = interfaceC24588k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24592m.this.new a(this.f96093y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C24592m.this.eventFlow;
                InterfaceC24588k interfaceC24588k = this.f96093y;
                this.f96091w = 1;
                if (interfaceC13072o1.emit(interfaceC24588k, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: lo0.m$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24592m f96095x;

        /* JADX INFO: renamed from: lo0.m$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96096w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24592m f96097x;

            /* JADX INFO: renamed from: lo0.m$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianSchedulingConfirmationViewModel$special$$inlined$map$1$2", m100430f = "ClinicianSchedulingConfirmationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41961a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96098E;

                /* JADX INFO: renamed from: F */
                Object f96099F;

                /* JADX INFO: renamed from: G */
                Object f96100G;

                /* JADX INFO: renamed from: H */
                int f96101H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96102w;

                /* JADX INFO: renamed from: x */
                int f96103x;

                /* JADX INFO: renamed from: y */
                Object f96104y;

                public C41961a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96102w = obj;
                    this.f96103x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24592m c24592m) {
                this.f96096w = interfaceC13062m;
                this.f96097x = c24592m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41961a c41961a;
                if (interfaceC30057d instanceof C41961a) {
                    c41961a = (C41961a) interfaceC30057d;
                    int i13 = c41961a.f96103x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41961a.f96103x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41961a = new C41961a(interfaceC30057d);
                    }
                } else {
                    c41961a = new C41961a(interfaceC30057d);
                }
                Object obj2 = c41961a.f96102w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41961a.f96103x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96096w;
                    AbstractC20718e abstractC20718eM71814o = this.f96097x.m71814o((InterfaceC24588k) obj);
                    c41961a.f96104y = null;
                    c41961a.f96098E = null;
                    c41961a.f96099F = null;
                    c41961a.f96100G = null;
                    c41961a.f96101H = 0;
                    c41961a.f96103x = 1;
                    if (interfaceC13062m.emit(abstractC20718eM71814o, c41961a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24592m c24592m) {
            this.f96094w = interfaceC13058l;
            this.f96095x = c24592m;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96094w.collect(new a(interfaceC13062m, this.f96095x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lo0.m$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96106w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24592m f96107x;

        /* JADX INFO: renamed from: lo0.m$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96108w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24592m f96109x;

            /* JADX INFO: renamed from: lo0.m$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianSchedulingConfirmationViewModel$special$$inlined$map$2$2", m100430f = "ClinicianSchedulingConfirmationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41962a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96110E;

                /* JADX INFO: renamed from: F */
                Object f96111F;

                /* JADX INFO: renamed from: G */
                Object f96112G;

                /* JADX INFO: renamed from: H */
                int f96113H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96114w;

                /* JADX INFO: renamed from: x */
                int f96115x;

                /* JADX INFO: renamed from: y */
                Object f96116y;

                public C41962a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96114w = obj;
                    this.f96115x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24592m c24592m) {
                this.f96108w = interfaceC13062m;
                this.f96109x = c24592m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41962a c41962a;
                if (interfaceC30057d instanceof C41962a) {
                    c41962a = (C41962a) interfaceC30057d;
                    int i13 = c41962a.f96115x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41962a.f96115x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41962a = new C41962a(interfaceC30057d);
                    }
                } else {
                    c41962a = new C41962a(interfaceC30057d);
                }
                Object obj2 = c41962a.f96114w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41962a.f96115x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96108w;
                    AbstractC24594n abstractC24594nM75924a = this.f96109x.reducer.m75924a((C20719f) obj);
                    c41962a.f96116y = null;
                    c41962a.f96110E = null;
                    c41962a.f96111F = null;
                    c41962a.f96112G = null;
                    c41962a.f96113H = 0;
                    c41962a.f96115x = 1;
                    if (interfaceC13062m.emit(abstractC24594nM75924a, c41962a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C24592m c24592m) {
            this.f96106w = interfaceC13058l;
            this.f96107x = c24592m;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96106w.collect(new a(interfaceC13062m, this.f96107x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24592m(C20720g interactor, C25740c reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC20718e m71814o(InterfaceC24588k interfaceC24588k) {
        if (interfaceC24588k instanceof C24584i) {
            return new AbstractC20718e.a(((C24584i) interfaceC24588k).getAppointmentId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m71815n(InterfaceC24588k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C24592m(C20720g c20720g, C25740c c25740c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20720g, c25740c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

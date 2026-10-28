package xc2;

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
import vc2.AbstractC35878a;
import vc2.AbstractC35880c;
import vc2.C35879b;

/* JADX INFO: renamed from: xc2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lxc2/c;", "Landroidx/lifecycle/w1;", "Lvc2/b;", "switchBillingPlanModalInteractor", "Lxc2/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lvc2/b;Lxc2/e;Lbc3/c0;)V", "Lxc2/b;", "Lvc2/a;", "p", "(Lxc2/b;)Lvc2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lxc2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lvc2/b;", "x", "Lxc2/e;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lxc2/d;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38192c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C35879b switchBillingPlanModalInteractor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C38194e reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: xc2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.presentation.SwitchBillingPlanModalViewModel$sendEvent$1", m100430f = "SwitchBillingPlanModalViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f163525w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC38191b f163527y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC38191b interfaceC38191b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f163527y = interfaceC38191b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38192c.this.new a(this.f163527y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163525w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C38192c.this.eventFlow;
                InterfaceC38191b interfaceC38191b = this.f163527y;
                this.f163525w = 1;
                if (interfaceC13072o1.emit(interfaceC38191b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: xc2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f163528w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38192c f163529x;

        /* JADX INFO: renamed from: xc2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f163530w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38192c f163531x;

            /* JADX INFO: renamed from: xc2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.presentation.SwitchBillingPlanModalViewModel$special$$inlined$map$1$2", m100430f = "SwitchBillingPlanModalViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42635a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f163532E;

                /* JADX INFO: renamed from: F */
                Object f163533F;

                /* JADX INFO: renamed from: G */
                Object f163534G;

                /* JADX INFO: renamed from: H */
                int f163535H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f163536w;

                /* JADX INFO: renamed from: x */
                int f163537x;

                /* JADX INFO: renamed from: y */
                Object f163538y;

                public C42635a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f163536w = obj;
                    this.f163537x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38192c c38192c) {
                this.f163530w = interfaceC13062m;
                this.f163531x = c38192c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42635a c42635a;
                if (interfaceC30057d instanceof C42635a) {
                    c42635a = (C42635a) interfaceC30057d;
                    int i13 = c42635a.f163537x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42635a.f163537x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42635a = new C42635a(interfaceC30057d);
                    }
                } else {
                    c42635a = new C42635a(interfaceC30057d);
                }
                Object obj2 = c42635a.f163536w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42635a.f163537x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f163530w;
                    AbstractC35878a abstractC35878aM122320p = this.f163531x.m122320p((InterfaceC38191b) obj);
                    c42635a.f163538y = null;
                    c42635a.f163532E = null;
                    c42635a.f163533F = null;
                    c42635a.f163534G = null;
                    c42635a.f163535H = 0;
                    c42635a.f163537x = 1;
                    if (interfaceC13062m.emit(abstractC35878aM122320p, c42635a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C38192c c38192c) {
            this.f163528w = interfaceC13058l;
            this.f163529x = c38192c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f163528w.collect(new a(interfaceC13062m, this.f163529x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xc2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f163540w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38192c f163541x;

        /* JADX INFO: renamed from: xc2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f163542w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38192c f163543x;

            /* JADX INFO: renamed from: xc2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.presentation.SwitchBillingPlanModalViewModel$special$$inlined$map$2$2", m100430f = "SwitchBillingPlanModalViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42636a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f163544E;

                /* JADX INFO: renamed from: F */
                Object f163545F;

                /* JADX INFO: renamed from: G */
                Object f163546G;

                /* JADX INFO: renamed from: H */
                int f163547H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f163548w;

                /* JADX INFO: renamed from: x */
                int f163549x;

                /* JADX INFO: renamed from: y */
                Object f163550y;

                public C42636a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f163548w = obj;
                    this.f163549x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38192c c38192c) {
                this.f163542w = interfaceC13062m;
                this.f163543x = c38192c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42636a c42636a;
                if (interfaceC30057d instanceof C42636a) {
                    c42636a = (C42636a) interfaceC30057d;
                    int i13 = c42636a.f163549x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42636a.f163549x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42636a = new C42636a(interfaceC30057d);
                    }
                } else {
                    c42636a = new C42636a(interfaceC30057d);
                }
                Object obj2 = c42636a.f163548w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42636a.f163549x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f163542w;
                    InterfaceC38193d interfaceC38193dM122332a = this.f163543x.reducer.m122332a((AbstractC35880c) obj);
                    c42636a.f163550y = null;
                    c42636a.f163544E = null;
                    c42636a.f163545F = null;
                    c42636a.f163546G = null;
                    c42636a.f163547H = 0;
                    c42636a.f163549x = 1;
                    if (interfaceC13062m.emit(interfaceC38193dM122332a, c42636a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C38192c c38192c) {
            this.f163540w = interfaceC13058l;
            this.f163541x = c38192c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f163540w.collect(new a(interfaceC13062m, this.f163541x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38192c(C35879b switchBillingPlanModalInteractor, C38194e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(switchBillingPlanModalInteractor, "switchBillingPlanModalInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.switchBillingPlanModalInteractor = switchBillingPlanModalInteractor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), switchBillingPlanModalInteractor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC35878a m122320p(InterfaceC38191b interfaceC38191b) {
        if (interfaceC38191b instanceof InterfaceC38191b.a) {
            return new AbstractC35878a.a(((InterfaceC38191b.a) interfaceC38191b).getPlan());
        }
        if (interfaceC38191b instanceof InterfaceC38191b.b) {
            return new AbstractC35878a.b(((InterfaceC38191b.b) interfaceC38191b).getPlan());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m122322o(InterfaceC38191b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C38192c(C35879b c35879b, C38194e c38194e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c35879b, c38194e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package v12;

import androidx.core.app.NotificationCompat;
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
import l83.C23454a0;
import ld1.AbstractC23864c;
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
import t12.AbstractC33309a;
import t12.C33310b;
import t12.C33311c;

/* JADX INFO: renamed from: v12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lv12/b;", "Lld1/c;", "Lv12/c;", "Lv12/a;", "Lt12/c;", "interactor", "Lv12/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lt12/c;Lv12/d;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lv12/a;)V", "x", "Lt12/c;", "y", "Lv12/d;", "z", "Lbc3/c0;", "Lec3/o1;", "Lt12/a;", "E", "Lec3/o1;", "actionFlow", "Lec3/t1;", "Lt12/b;", "F", "Lec3/t1;", "headerState", "Lec3/l;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35555b extends AbstractC23864c<C35556c, InterfaceC35554a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 headerState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C33311c interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C35557d reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: v12.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.presentation.DayZeroHeaderWidgetsViewModel$sendViewEvent$1", m100430f = "DayZeroHeaderWidgetsViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f151260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35554a f151261x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35555b f151262y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC35554a interfaceC35554a, C35555b c35555b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151261x = interfaceC35554a;
            this.f151262y = c35555b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f151261x, this.f151262y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151260w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(this.f151261x instanceof InterfaceC35554a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13072o1 interfaceC13072o1 = this.f151262y.actionFlow;
                AbstractC33309a.a aVar = new AbstractC33309a.a(((InterfaceC35554a.a) this.f151261x).getPath());
                this.f151260w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: v12.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f151263w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35555b f151264x;

        /* JADX INFO: renamed from: v12.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f151265w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35555b f151266x;

            /* JADX INFO: renamed from: v12.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.presentation.DayZeroHeaderWidgetsViewModel$special$$inlined$map$1$2", m100430f = "DayZeroHeaderWidgetsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42522a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f151267E;

                /* JADX INFO: renamed from: F */
                Object f151268F;

                /* JADX INFO: renamed from: G */
                Object f151269G;

                /* JADX INFO: renamed from: H */
                int f151270H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f151271w;

                /* JADX INFO: renamed from: x */
                int f151272x;

                /* JADX INFO: renamed from: y */
                Object f151273y;

                public C42522a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f151271w = obj;
                    this.f151272x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35555b c35555b) {
                this.f151265w = interfaceC13062m;
                this.f151266x = c35555b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42522a c42522a;
                if (interfaceC30057d instanceof C42522a) {
                    c42522a = (C42522a) interfaceC30057d;
                    int i13 = c42522a.f151272x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42522a.f151272x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42522a = new C42522a(interfaceC30057d);
                    }
                } else {
                    c42522a = new C42522a(interfaceC30057d);
                }
                Object obj2 = c42522a.f151271w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42522a.f151272x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f151265w;
                    C35556c c35556cM112768a = this.f151266x.reducer.m112768a((C33310b) obj);
                    c42522a.f151273y = null;
                    c42522a.f151267E = null;
                    c42522a.f151268F = null;
                    c42522a.f151269G = null;
                    c42522a.f151270H = 0;
                    c42522a.f151272x = 1;
                    if (interfaceC13062m.emit(c35556cM112768a, c42522a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35555b c35555b) {
            this.f151263w = interfaceC13058l;
            this.f151264x = c35555b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f151263w.collect(new a(interfaceC13062m, this.f151264x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35555b(C33311c interactor, C35557d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(c13096w1M36592b);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.headerState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new b(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC35554a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C35555b(C33311c c33311c, C35557d c35557d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33311c, c35557d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

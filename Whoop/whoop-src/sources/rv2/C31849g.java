package rv2;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qv2.AbstractC30662c;
import qv2.C30663d;
import qv2.C30664e;
import qv2.InterfaceC30661b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rv2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lrv2/g;", "Landroidx/lifecycle/w1;", "Lrv2/e;", "reducer", "Lqv2/e;", "interactor", "Lbc3/c0;", "scope", "<init>", "(Lrv2/e;Lqv2/e;Lbc3/c0;)V", "Lrv2/d$c0;", "viewEvent", "Lqv2/c;", "n", "(Lrv2/d$c0;)Lqv2/c;", "Lbc3/k1;", "o", "(Lrv2/d$c0;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lrv2/e;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lqv2/d;", "y", "Lec3/t1;", "domainState", "Lec3/l;", "Lrv2/h;", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31849g extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C31847e reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: rv2.g$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function3 {
        public a(Object obj) {
            super(3, 0, C30664e.class, obj, "interact", "interact(Lcom/whoop/weightlifting/feature/library/domain/WorkoutLibraryDomainState;Lcom/whoop/weightlifting/feature/library/domain/WorkoutLibraryDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C30663d c30663d, AbstractC30662c abstractC30662c, InterfaceC30057d<? super C30663d> interfaceC30057d) {
            return ((C30664e) this.receiver).m94263q(c30663d, abstractC30662c, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: rv2.g$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.presentation.WorkoutLibraryViewModel$sendViewEvent$1", m100430f = "WorkoutLibraryViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132040w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31846d.c0 f132042y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC31846d.c0 c0Var, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132042y = c0Var;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31849g.this.new b(this.f132042y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132040w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31849g.this.eventFlow;
                InterfaceC31846d.c0 c0Var = this.f132042y;
                this.f132040w = 1;
                if (interfaceC13072o1.emit(c0Var, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rv2.g$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132043w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31849g f132044x;

        /* JADX INFO: renamed from: rv2.g$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132045w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31849g f132046x;

            /* JADX INFO: renamed from: rv2.g$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.presentation.WorkoutLibraryViewModel$special$$inlined$map$1$2", m100430f = "WorkoutLibraryViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42295a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132047E;

                /* JADX INFO: renamed from: F */
                Object f132048F;

                /* JADX INFO: renamed from: G */
                Object f132049G;

                /* JADX INFO: renamed from: H */
                int f132050H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132051w;

                /* JADX INFO: renamed from: x */
                int f132052x;

                /* JADX INFO: renamed from: y */
                Object f132053y;

                public C42295a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132051w = obj;
                    this.f132052x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31849g c31849g) {
                this.f132045w = interfaceC13062m;
                this.f132046x = c31849g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42295a c42295a;
                if (interfaceC30057d instanceof C42295a) {
                    c42295a = (C42295a) interfaceC30057d;
                    int i13 = c42295a.f132052x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42295a.f132052x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42295a = new C42295a(interfaceC30057d);
                    }
                } else {
                    c42295a = new C42295a(interfaceC30057d);
                }
                Object obj2 = c42295a.f132051w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42295a.f132052x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132045w;
                    AbstractC30662c abstractC30662cM98996n = this.f132046x.m98996n((InterfaceC31846d.c0) obj);
                    c42295a.f132053y = null;
                    c42295a.f132047E = null;
                    c42295a.f132048F = null;
                    c42295a.f132049G = null;
                    c42295a.f132050H = 0;
                    c42295a.f132052x = 1;
                    if (interfaceC13062m.emit(abstractC30662cM98996n, c42295a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C31849g c31849g) {
            this.f132043w = interfaceC13058l;
            this.f132044x = c31849g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132043w.collect(new a(interfaceC13062m, this.f132044x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv2.g$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132055w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31849g f132056x;

        /* JADX INFO: renamed from: rv2.g$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132057w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31849g f132058x;

            /* JADX INFO: renamed from: rv2.g$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.presentation.WorkoutLibraryViewModel$special$$inlined$map$2$2", m100430f = "WorkoutLibraryViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42296a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132059E;

                /* JADX INFO: renamed from: F */
                Object f132060F;

                /* JADX INFO: renamed from: G */
                Object f132061G;

                /* JADX INFO: renamed from: H */
                int f132062H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132063w;

                /* JADX INFO: renamed from: x */
                int f132064x;

                /* JADX INFO: renamed from: y */
                Object f132065y;

                public C42296a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132063w = obj;
                    this.f132064x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31849g c31849g) {
                this.f132057w = interfaceC13062m;
                this.f132058x = c31849g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42296a c42296a;
                if (interfaceC30057d instanceof C42296a) {
                    c42296a = (C42296a) interfaceC30057d;
                    int i13 = c42296a.f132064x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42296a.f132064x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42296a = new C42296a(interfaceC30057d);
                    }
                } else {
                    c42296a = new C42296a(interfaceC30057d);
                }
                Object obj2 = c42296a.f132063w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42296a.f132064x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132057w;
                    InterfaceC31850h interfaceC31850hM98985f = this.f132058x.reducer.m98985f((C30663d) obj);
                    c42296a.f132065y = null;
                    c42296a.f132059E = null;
                    c42296a.f132060F = null;
                    c42296a.f132061G = null;
                    c42296a.f132062H = 0;
                    c42296a.f132064x = 1;
                    if (interfaceC13062m.emit(interfaceC31850hM98985f, c42296a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C31849g c31849g) {
            this.f132055w = interfaceC13058l;
            this.f132056x = c31849g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132055w.collect(new a(interfaceC13062m, this.f132056x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31849g(C31847e reducer, C30664e interactor, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(scope, "scope");
        this.reducer = reducer;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(new C13060l1(new C30663d(InterfaceC30661b.e.f126112a, null, null, null, null, null, false, null, false, 510, null), new c(c13096w1M36592b, this), new a(interactor)), scope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new d(c13078q1M36586L, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final AbstractC30662c m98996n(InterfaceC31846d.c0 viewEvent) {
        if (viewEvent instanceof InterfaceC31846d.u) {
            return AbstractC30662c.i.f126124a;
        }
        if (viewEvent instanceof InterfaceC31846d.q) {
            return AbstractC30662c.g.f126122a;
        }
        if (viewEvent instanceof InterfaceC31846d.p) {
            return new AbstractC30662c.f(((InterfaceC31846d.p) viewEvent).getWorkoutTemplateKey());
        }
        if (viewEvent instanceof InterfaceC31846d.b) {
            return AbstractC30662c.a.f126116a;
        }
        if (viewEvent instanceof InterfaceC31846d.b0) {
            return AbstractC30662c.o.f126130a;
        }
        if (viewEvent instanceof InterfaceC31846d.y) {
            return AbstractC30662c.l.f126127a;
        }
        if (viewEvent instanceof InterfaceC31846d.f) {
            return AbstractC30662c.d.f126119a;
        }
        if (viewEvent instanceof InterfaceC31846d.z) {
            return AbstractC30662c.m.f126128a;
        }
        if (viewEvent instanceof InterfaceC31846d.a0) {
            return AbstractC30662c.n.f126129a;
        }
        if (viewEvent instanceof InterfaceC31846d.e) {
            return AbstractC30662c.c.f126118a;
        }
        if (viewEvent instanceof InterfaceC31846d.g) {
            return AbstractC30662c.e.f126120a;
        }
        if (viewEvent instanceof InterfaceC31846d.x) {
            return new AbstractC30662c.k(((InterfaceC31846d.x) viewEvent).getTab());
        }
        if (viewEvent instanceof InterfaceC31846d.v) {
            return AbstractC30662c.j.f126125a;
        }
        if (viewEvent instanceof InterfaceC31846d.t) {
            return AbstractC30662c.h.f126123a;
        }
        if (viewEvent instanceof InterfaceC31846d.d) {
            return AbstractC30662c.b.f126117a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m98997o(InterfaceC31846d.c0 viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C31849g(C31847e c31847e, C30664e c30664e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31847e, c30664e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package xu2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fu2.InterfaceC14787b;
import hu2.AbstractC17668o;
import hu2.InterfaceC17655b;
import hu2.InterfaceC17666m;
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
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wu2.C37646b;
import wu2.C37647c;

/* JADX INFO: renamed from: xu2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lxu2/c;", "Landroidx/lifecycle/w1;", "Lwu2/c;", "interactor", "Lxu2/e;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwu2/c;Lxu2/e;Lbc3/c0;)V", "Lhu2/b$p;", "Lfu2/b;", "o", "(Lhu2/b$p;)Lfu2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lhu2/b$p;)V", "Lec3/o1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lxu2/d;", "x", "Lec3/t1;", "l", "()Lec3/t1;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38657c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: xu2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.presentation.EditWorkoutViewModel$sendEvent$1", m100430f = "EditWorkoutViewModel.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f166350w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC17655b.p f166352y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC17655b.p pVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f166352y = pVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38657c.this.new a(this.f166352y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166350w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C38657c.this.eventFlow;
                InterfaceC17655b.p pVar = this.f166352y;
                this.f166350w = 1;
                if (interfaceC13072o1.emit(pVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: xu2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166353w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38657c f166354x;

        /* JADX INFO: renamed from: xu2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166355w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38657c f166356x;

            /* JADX INFO: renamed from: xu2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.presentation.EditWorkoutViewModel$special$$inlined$map$1$2", m100430f = "EditWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42669a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166357E;

                /* JADX INFO: renamed from: F */
                Object f166358F;

                /* JADX INFO: renamed from: G */
                Object f166359G;

                /* JADX INFO: renamed from: H */
                int f166360H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166361w;

                /* JADX INFO: renamed from: x */
                int f166362x;

                /* JADX INFO: renamed from: y */
                Object f166363y;

                public C42669a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166361w = obj;
                    this.f166362x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38657c c38657c) {
                this.f166355w = interfaceC13062m;
                this.f166356x = c38657c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42669a c42669a;
                if (interfaceC30057d instanceof C42669a) {
                    c42669a = (C42669a) interfaceC30057d;
                    int i13 = c42669a.f166362x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42669a.f166362x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42669a = new C42669a(interfaceC30057d);
                    }
                } else {
                    c42669a = new C42669a(interfaceC30057d);
                }
                Object obj2 = c42669a.f166361w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42669a.f166362x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166355w;
                    InterfaceC14787b interfaceC14787bM123949o = this.f166356x.m123949o((InterfaceC17655b.p) obj);
                    c42669a.f166363y = null;
                    c42669a.f166357E = null;
                    c42669a.f166358F = null;
                    c42669a.f166359G = null;
                    c42669a.f166360H = 0;
                    c42669a.f166362x = 1;
                    if (interfaceC13062m.emit(interfaceC14787bM123949o, c42669a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C38657c c38657c) {
            this.f166353w = interfaceC13058l;
            this.f166354x = c38657c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166353w.collect(new a(interfaceC13062m, this.f166354x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xu2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166365w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38659e f166366x;

        /* JADX INFO: renamed from: xu2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166367w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38659e f166368x;

            /* JADX INFO: renamed from: xu2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.presentation.EditWorkoutViewModel$special$$inlined$map$2$2", m100430f = "EditWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42670a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166369E;

                /* JADX INFO: renamed from: F */
                Object f166370F;

                /* JADX INFO: renamed from: G */
                Object f166371G;

                /* JADX INFO: renamed from: H */
                int f166372H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166373w;

                /* JADX INFO: renamed from: x */
                int f166374x;

                /* JADX INFO: renamed from: y */
                Object f166375y;

                public C42670a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166373w = obj;
                    this.f166374x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38659e c38659e) {
                this.f166367w = interfaceC13062m;
                this.f166368x = c38659e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42670a c42670a;
                if (interfaceC30057d instanceof C42670a) {
                    c42670a = (C42670a) interfaceC30057d;
                    int i13 = c42670a.f166374x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42670a.f166374x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42670a = new C42670a(interfaceC30057d);
                    }
                } else {
                    c42670a = new C42670a(interfaceC30057d);
                }
                Object obj2 = c42670a.f166373w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42670a.f166374x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166367w;
                    InterfaceC38658d interfaceC38658dM123996d = this.f166368x.m123996d((C37646b) obj);
                    c42670a.f166375y = null;
                    c42670a.f166369E = null;
                    c42670a.f166370F = null;
                    c42670a.f166371G = null;
                    c42670a.f166372H = 0;
                    c42670a.f166374x = 1;
                    if (interfaceC13062m.emit(interfaceC38658dM123996d, c42670a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C38659e c38659e) {
            this.f166365w = interfaceC13058l;
            this.f166366x = c38659e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166365w.collect(new a(interfaceC13062m, this.f166366x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xu2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d extends C22672i implements Function3 {
        public d(Object obj) {
            super(3, 0, C37647c.class, obj, "interact", "interact(Lcom/whoop/weightlifting/feature/builder/edit/domain/EditWorkoutDomainState;Lcom/whoop/weightlifting/common/domain/EditWorkoutDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C37646b c37646b, InterfaceC14787b interfaceC14787b, InterfaceC30057d<? super C37646b> interfaceC30057d) {
            return ((C37647c) this.receiver).m121027t(c37646b, interfaceC14787b, interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38657c(C37647c interactor, C38659e viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(new C13060l1(C37646b.INSTANCE.m120996a(), new b(c13096w1M36592b, this), new d(interactor)), viewStateReducer), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC14787b m123949o(InterfaceC17655b.p pVar) {
        if (pVar instanceof InterfaceC17655b.k) {
            InterfaceC17655b.k kVar = (InterfaceC17655b.k) pVar;
            return new InterfaceC14787b.i(kVar.getTemplateId(), kVar.getActivityId(), kVar.getSharedTemplateId(), kVar.getIsFromWhoopCoach(), kVar.getIsCopyFlow(), kVar.getCopySuffix(), kVar.getEntryPoint());
        }
        if (pVar instanceof InterfaceC17655b.i) {
            return InterfaceC14787b.h.f54855a;
        }
        if (pVar instanceof InterfaceC17655b.a) {
            InterfaceC17655b.a aVar = (InterfaceC17655b.a) pVar;
            return new InterfaceC14787b.e(aVar.getGroupIndex(), aVar.getExerciseIndex());
        }
        if (pVar instanceof InterfaceC17655b.j) {
            return InterfaceC14787b.f.f54853a;
        }
        if (pVar instanceof InterfaceC17655b.e) {
            return InterfaceC14787b.m.f54868a;
        }
        if (pVar instanceof InterfaceC17655b.m) {
            return InterfaceC14787b.s.f54883a;
        }
        if (pVar instanceof InterfaceC17655b.l) {
            return InterfaceC14787b.g.f54854a;
        }
        if (pVar instanceof InterfaceC17655b.n) {
            return new InterfaceC14787b.l(((InterfaceC17655b.n) pVar).getIsCopyFlow());
        }
        if (pVar instanceof InterfaceC17655b.b) {
            return InterfaceC14787b.b.f54847a;
        }
        if (pVar instanceof InterfaceC17666m) {
            return AbstractC17668o.m50410a((InterfaceC17666m) pVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m123951n(InterfaceC17655b.p event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(event, null), 3);
    }

    public /* synthetic */ C38657c(C37647c c37647c, C38659e c38659e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37647c, c38659e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

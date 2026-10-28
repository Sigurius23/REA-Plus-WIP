package bn0;

import an0.C1056a;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cn0.C4849c;
import com.whoop.calendararchmini.domain.AbstractC6112a;
import com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: bn0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lbn0/d;", "Lbn0/c;", "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;", "interactor", "Lcn0/c;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;)V", "Lbn0/b;", "Lcom/whoop/calendararchmini/domain/a;", "q", "(Lbn0/b;)Lcom/whoop/calendararchmini/domain/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lbn0/b;)V", "y", "Lcn0/c;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "archMiniCalendarViewEventFlow", "Lec3/l;", "Lan0/a;", "F", "Lec3/l;", "domainState", "Lbn0/a;", "G", "accumulator", "Lec3/t1;", "Lbn0/e;", "H", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3496d extends AbstractC3495c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 archMiniCalendarViewEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l accumulator;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C4849c reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: bn0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.presentation.ArchMiniCalendarViewModelImpl$accumulator$1", m100430f = "ArchMiniCalendarViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbn0/a;", "accumulated", "Lbn0/b;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lbn0/a;Lbn0/b;)Lbn0/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f13863w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13864x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f13865y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3493a c3493a, AbstractC3494b abstractC3494b, InterfaceC30057d<? super C3493a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f13864x = c3493a;
            aVar.f13865y = abstractC3494b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C3493a c3493a = (C3493a) this.f13864x;
            AbstractC3494b abstractC3494b = (AbstractC3494b) this.f13865y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13863w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC3494b instanceof AbstractC3494b.b) {
                return new C3493a(null, 1, null);
            }
            return abstractC3494b instanceof AbstractC3494b.a ? c3493a.m10298a(((AbstractC3494b.a) abstractC3494b).getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) : c3493a;
        }
    }

    /* JADX INFO: renamed from: bn0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.presentation.ArchMiniCalendarViewModelImpl$sendViewEvent$1", m100430f = "ArchMiniCalendarViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13866w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC3494b f13868y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC3494b abstractC3494b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13868y = abstractC3494b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3496d.this.new b(this.f13868y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13866w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C3496d.this.archMiniCalendarViewEventFlow;
                AbstractC3494b abstractC3494b = this.f13868y;
                this.f13866w = 1;
                if (interfaceC13072o1.emit(abstractC3494b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bn0.d$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13869w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3496d f13870x;

        /* JADX INFO: renamed from: bn0.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13871w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3496d f13872x;

            /* JADX INFO: renamed from: bn0.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.presentation.ArchMiniCalendarViewModelImpl$special$$inlined$mapNotNull$1$2", m100430f = "ArchMiniCalendarViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41315a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13873E;

                /* JADX INFO: renamed from: F */
                Object f13874F;

                /* JADX INFO: renamed from: G */
                Object f13875G;

                /* JADX INFO: renamed from: H */
                Object f13876H;

                /* JADX INFO: renamed from: I */
                int f13877I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13878w;

                /* JADX INFO: renamed from: x */
                int f13879x;

                /* JADX INFO: renamed from: y */
                Object f13880y;

                public C41315a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13878w = obj;
                    this.f13879x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3496d c3496d) {
                this.f13871w = interfaceC13062m;
                this.f13872x = c3496d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41315a c41315a;
                if (interfaceC30057d instanceof C41315a) {
                    c41315a = (C41315a) interfaceC30057d;
                    int i13 = c41315a.f13879x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41315a.f13879x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41315a = new C41315a(interfaceC30057d);
                    }
                } else {
                    c41315a = new C41315a(interfaceC30057d);
                }
                Object obj2 = c41315a.f13878w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41315a.f13879x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13871w;
                    AbstractC6112a abstractC6112aM10308q = this.f13872x.m10308q((AbstractC3494b) obj);
                    if (abstractC6112aM10308q != null) {
                        c41315a.f13880y = null;
                        c41315a.f13873E = null;
                        c41315a.f13874F = null;
                        c41315a.f13875G = null;
                        c41315a.f13876H = null;
                        c41315a.f13877I = 0;
                        c41315a.f13879x = 1;
                        if (interfaceC13062m.emit(abstractC6112aM10308q, c41315a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C3496d c3496d) {
            this.f13869w = interfaceC13058l;
            this.f13870x = c3496d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13869w.collect(new a(interfaceC13062m, this.f13870x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bn0.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.presentation.ArchMiniCalendarViewModelImpl$viewState$1", m100430f = "ArchMiniCalendarViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lan0/a;", "domain", "Lbn0/a;", "accumulated", "Lbn0/e;", "<anonymous>", "(Lan0/a;Lbn0/a;)Lbn0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f13882w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13883x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f13884y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1056a c1056a, C3493a c3493a, InterfaceC30057d<? super C3497e> interfaceC30057d) {
            d dVar = C3496d.this.new d(interfaceC30057d);
            dVar.f13883x = c1056a;
            dVar.f13884y = c3493a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1056a c1056a = (C1056a) this.f13883x;
            C3493a c3493a = (C3493a) this.f13884y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13882w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C3496d.this.reducer.m15465c(c1056a, c3493a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3496d(ArchMiniCalendarInteractor interactor, C4849c reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.archMiniCalendarViewEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(new c(c13096w1M36592b, this));
        this.domainState = interfaceC13058lInteract;
        C13060l1 c13060l1 = new C13060l1(new C3493a(null, 1, null), c13096w1M36592b, new a(null));
        this.accumulator = c13060l1;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(interfaceC13058lInteract, c13060l1, new d(null), 1), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC6112a m10308q(AbstractC3494b abstractC3494b) {
        if (abstractC3494b instanceof AbstractC3494b.b) {
            return new AbstractC6112a.a(((AbstractC3494b.b) abstractC3494b).getWrapperViewState());
        }
        if (abstractC3494b instanceof AbstractC3494b.d) {
            return new AbstractC6112a.c(((AbstractC3494b.d) abstractC3494b).getMonthIndex());
        }
        if (abstractC3494b instanceof AbstractC3494b.e) {
            return new AbstractC6112a.d(((AbstractC3494b.e) abstractC3494b).getMonthIndex());
        }
        if (abstractC3494b instanceof AbstractC3494b.c) {
            return new AbstractC6112a.b(((AbstractC3494b.c) abstractC3494b).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (abstractC3494b instanceof AbstractC3494b.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC3494b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C3496d(ArchMiniCalendarInteractor archMiniCalendarInteractor, C4849c c4849c, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(archMiniCalendarInteractor, c4849c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

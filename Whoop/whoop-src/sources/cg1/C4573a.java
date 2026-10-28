package cg1;

import ag1.AbstractC0859a;
import ag1.C0860b;
import ag1.C0861c;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dg1.C12008a;
import ec3.AbstractC13091v;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u11.AbstractC34436b;
import u11.AbstractC34437c;
import u11.C34438d;

/* JADX INFO: renamed from: cg1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcg1/a;", "Lu11/c;", "Lag1/c;", "interactor", "Ldg1/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lag1/c;Ldg1/a;Lor2/m;)V", "Lu11/b;", "Lag1/a;", "q", "(Lu11/b;)Lag1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lu11/b;)V", "x", "Ldg1/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lag1/b;", "E", "Lec3/l;", "domainState", "Lec3/t1;", "Lu11/d;", "F", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4573a extends AbstractC34437c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12008a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: cg1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.filteredlist.presentation.FilteredListViewModelImpl$sendViewEvent$1", m100430f = "FilteredListViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18397w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34436b f18399y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34436b abstractC34436b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18399y = abstractC34436b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4573a.this.new a(this.f18399y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18397w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4573a.this.eventFlow;
                AbstractC34436b abstractC34436b = this.f18399y;
                this.f18397w = 1;
                if (interfaceC13072o1.emit(abstractC34436b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cg1.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18400w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4573a f18401x;

        /* JADX INFO: renamed from: cg1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18402w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4573a f18403x;

            /* JADX INFO: renamed from: cg1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.filteredlist.presentation.FilteredListViewModelImpl$special$$inlined$map$1$2", m100430f = "FilteredListViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41348a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18404E;

                /* JADX INFO: renamed from: F */
                Object f18405F;

                /* JADX INFO: renamed from: G */
                Object f18406G;

                /* JADX INFO: renamed from: H */
                int f18407H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18408w;

                /* JADX INFO: renamed from: x */
                int f18409x;

                /* JADX INFO: renamed from: y */
                Object f18410y;

                public C41348a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18408w = obj;
                    this.f18409x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4573a c4573a) {
                this.f18402w = interfaceC13062m;
                this.f18403x = c4573a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41348a c41348a;
                if (interfaceC30057d instanceof C41348a) {
                    c41348a = (C41348a) interfaceC30057d;
                    int i13 = c41348a.f18409x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41348a.f18409x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41348a = new C41348a(interfaceC30057d);
                    }
                } else {
                    c41348a = new C41348a(interfaceC30057d);
                }
                Object obj2 = c41348a.f18408w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41348a.f18409x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18402w;
                    AbstractC0859a abstractC0859aM14254q = this.f18403x.m14254q((AbstractC34436b) obj);
                    c41348a.f18410y = null;
                    c41348a.f18404E = null;
                    c41348a.f18405F = null;
                    c41348a.f18406G = null;
                    c41348a.f18407H = 0;
                    c41348a.f18409x = 1;
                    if (interfaceC13062m.emit(abstractC0859aM14254q, c41348a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4573a c4573a) {
            this.f18400w = interfaceC13058l;
            this.f18401x = c4573a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18400w.collect(new a(interfaceC13062m, this.f18401x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cg1.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18412w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4573a f18413x;

        /* JADX INFO: renamed from: cg1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18414w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4573a f18415x;

            /* JADX INFO: renamed from: cg1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.filteredlist.presentation.FilteredListViewModelImpl$special$$inlined$map$2$2", m100430f = "FilteredListViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41349a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18416E;

                /* JADX INFO: renamed from: F */
                Object f18417F;

                /* JADX INFO: renamed from: G */
                Object f18418G;

                /* JADX INFO: renamed from: H */
                int f18419H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18420w;

                /* JADX INFO: renamed from: x */
                int f18421x;

                /* JADX INFO: renamed from: y */
                Object f18422y;

                public C41349a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18420w = obj;
                    this.f18421x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4573a c4573a) {
                this.f18414w = interfaceC13062m;
                this.f18415x = c4573a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41349a c41349a;
                if (interfaceC30057d instanceof C41349a) {
                    c41349a = (C41349a) interfaceC30057d;
                    int i13 = c41349a.f18421x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41349a.f18421x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41349a = new C41349a(interfaceC30057d);
                    }
                } else {
                    c41349a = new C41349a(interfaceC30057d);
                }
                Object obj2 = c41349a.f18420w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41349a.f18421x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18414w;
                    C34438d c34438dM33120c = this.f18415x.reducer.m33120c((C0860b) obj);
                    c41349a.f18422y = null;
                    c41349a.f18416E = null;
                    c41349a.f18417F = null;
                    c41349a.f18418G = null;
                    c41349a.f18419H = 0;
                    c41349a.f18421x = 1;
                    if (interfaceC13062m.emit(c34438dM33120c, c41349a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C4573a c4573a) {
            this.f18412w = interfaceC13058l;
            this.f18413x = c4573a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18412w.collect(new a(interfaceC13062m, this.f18413x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4573a(C0861c interactor, C12008a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM2107r = interactor.m2107r(new b(c13096w1M36592b, this));
        this.domainState = interfaceC13058lM2107r;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM2107r, this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC0859a m14254q(AbstractC34436b abstractC34436b) {
        if (abstractC34436b instanceof AbstractC34436b.c) {
            return new AbstractC0859a.b(((AbstractC34436b.c) abstractC34436b).getPath());
        }
        if (abstractC34436b instanceof AbstractC34436b.b) {
            return new AbstractC0859a.f(((AbstractC34436b.b) abstractC34436b).getAction());
        }
        if (abstractC34436b instanceof AbstractC34436b.e) {
            return new AbstractC0859a.d(((AbstractC34436b.e) abstractC34436b).getAction());
        }
        if (abstractC34436b instanceof AbstractC34436b.f) {
            return AbstractC0859a.e.f3071a;
        }
        if (abstractC34436b instanceof AbstractC34436b.a) {
            return AbstractC0859a.a.f3067a;
        }
        if (abstractC34436b instanceof AbstractC34436b.d) {
            return AbstractC0859a.c.f3069a;
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
    public void mo1216g(AbstractC34436b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C4573a(C0861c c0861c, C12008a c12008a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0861c, c12008a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

package ps2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ns2.AbstractC27105a;
import ns2.AbstractC27106b;
import ns2.C27107c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qs2.C30577b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ps2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lps2/b;", "Lld1/c;", "Lps2/c;", "Lps2/a;", "Lns2/c;", "interactor", "Lqs2/b;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lns2/c;Lqs2/b;Lor2/m;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lps2/a;)V", "x", "Lqs2/b;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lns2/b;", "E", "Lec3/l;", "domainState", "Lec3/f2;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29506b extends AbstractC23864c<AbstractC29507c, AbstractC29505a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C30577b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ps2.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.presentation.AiPlansViewModel$sendViewEvent$1", m100430f = "AiPlansViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120006w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29505a f120008y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC29505a abstractC29505a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120008y = abstractC29505a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29506b.this.new a(this.f120008y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120006w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29506b.this.eventFlow;
                AbstractC29505a abstractC29505a = this.f120008y;
                this.f120006w = 1;
                if (interfaceC13072o1.emit(abstractC29505a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ps2.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120009w;

        /* JADX INFO: renamed from: ps2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120010w;

            /* JADX INFO: renamed from: ps2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.presentation.AiPlansViewModel$special$$inlined$map$1$2", m100430f = "AiPlansViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42188a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120011E;

                /* JADX INFO: renamed from: F */
                Object f120012F;

                /* JADX INFO: renamed from: G */
                Object f120013G;

                /* JADX INFO: renamed from: H */
                int f120014H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120015w;

                /* JADX INFO: renamed from: x */
                int f120016x;

                /* JADX INFO: renamed from: y */
                Object f120017y;

                public C42188a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120015w = obj;
                    this.f120016x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f120010w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42188a c42188a;
                if (interfaceC30057d instanceof C42188a) {
                    c42188a = (C42188a) interfaceC30057d;
                    int i13 = c42188a.f120016x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42188a.f120016x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42188a = new C42188a(interfaceC30057d);
                    }
                } else {
                    c42188a = new C42188a(interfaceC30057d);
                }
                Object obj2 = c42188a.f120015w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42188a.f120016x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f120010w;
                    AbstractC27105a.a aVarM90151a = ((AbstractC29505a) obj).m90151a();
                    c42188a.f120017y = null;
                    c42188a.f120011E = null;
                    c42188a.f120012F = null;
                    c42188a.f120013G = null;
                    c42188a.f120014H = 0;
                    c42188a.f120016x = 1;
                    if (interfaceC13062m.emit(aVarM90151a, c42188a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f120009w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120009w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ps2.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120019w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29506b f120020x;

        /* JADX INFO: renamed from: ps2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120021w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29506b f120022x;

            /* JADX INFO: renamed from: ps2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.presentation.AiPlansViewModel$special$$inlined$map$2$2", m100430f = "AiPlansViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42189a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120023E;

                /* JADX INFO: renamed from: F */
                Object f120024F;

                /* JADX INFO: renamed from: G */
                Object f120025G;

                /* JADX INFO: renamed from: H */
                int f120026H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120027w;

                /* JADX INFO: renamed from: x */
                int f120028x;

                /* JADX INFO: renamed from: y */
                Object f120029y;

                public C42189a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120027w = obj;
                    this.f120028x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29506b c29506b) {
                this.f120021w = interfaceC13062m;
                this.f120022x = c29506b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42189a c42189a;
                if (interfaceC30057d instanceof C42189a) {
                    c42189a = (C42189a) interfaceC30057d;
                    int i13 = c42189a.f120028x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42189a.f120028x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42189a = new C42189a(interfaceC30057d);
                    }
                } else {
                    c42189a = new C42189a(interfaceC30057d);
                }
                Object obj2 = c42189a.f120027w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42189a.f120028x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f120021w;
                    AbstractC29507c abstractC29507cM93809a = this.f120022x.reducer.m93809a((AbstractC27106b) obj);
                    c42189a.f120029y = null;
                    c42189a.f120023E = null;
                    c42189a.f120024F = null;
                    c42189a.f120025G = null;
                    c42189a.f120026H = 0;
                    c42189a.f120028x = 1;
                    if (interfaceC13062m.emit(abstractC29507cM93809a, c42189a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29506b c29506b) {
            this.f120019w = interfaceC13058l;
            this.f120020x = c29506b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120019w.collect(new a(interfaceC13062m, this.f120020x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29506b(C27107c interactor, C30577b reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM83945a, this), coroutineScope, C13105z1.f45288a, AbstractC29507c.b.f120032a);
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC29505a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C29506b(C27107c c27107c, C30577b c30577b, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27107c, c30577b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

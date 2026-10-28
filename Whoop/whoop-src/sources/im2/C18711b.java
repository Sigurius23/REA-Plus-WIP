package im2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fm2.AbstractC14610b;
import fm2.C14611c;
import fm2.C14612d;
import jm2.C21794a;
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

/* JADX INFO: renamed from: im2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lim2/b;", "Lld1/c;", "Lim2/c;", "Lim2/a$f;", "Lfm2/d;", "interactor", "Ljm2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfm2/d;Ljm2/a;Lbc3/c0;)V", "Lec3/l;", "Lfm2/b;", "Lfm2/c;", "interact", "(Lec3/l;)Lec3/l;", "p", "(Lim2/a$f;)Lfm2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lim2/a$f;)V", "x", "Lfm2/d;", "y", "Ljm2/a;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18711b extends AbstractC23864c<C18712c, InterfaceC18710a.f> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14612d interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C21794a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: im2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel$sendViewEvent$1", m100430f = "TrendsMiniArchViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73489w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC18710a.f f73491y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC18710a.f fVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73491y = fVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C18711b.this.new a(this.f73491y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73489w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C18711b.this.eventFlow;
                InterfaceC18710a.f fVar = this.f73491y;
                this.f73489w = 1;
                if (interfaceC13072o1.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: im2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73492w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18711b f73493x;

        /* JADX INFO: renamed from: im2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73494w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18711b f73495x;

            /* JADX INFO: renamed from: im2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel$special$$inlined$map$1$2", m100430f = "TrendsMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41762a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73496E;

                /* JADX INFO: renamed from: F */
                Object f73497F;

                /* JADX INFO: renamed from: G */
                Object f73498G;

                /* JADX INFO: renamed from: H */
                int f73499H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73500w;

                /* JADX INFO: renamed from: x */
                int f73501x;

                /* JADX INFO: renamed from: y */
                Object f73502y;

                public C41762a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73500w = obj;
                    this.f73501x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18711b c18711b) {
                this.f73494w = interfaceC13062m;
                this.f73495x = c18711b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41762a c41762a;
                if (interfaceC30057d instanceof C41762a) {
                    c41762a = (C41762a) interfaceC30057d;
                    int i13 = c41762a.f73501x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41762a.f73501x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41762a = new C41762a(interfaceC30057d);
                    }
                } else {
                    c41762a = new C41762a(interfaceC30057d);
                }
                Object obj2 = c41762a.f73500w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41762a.f73501x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73494w;
                    AbstractC14610b abstractC14610bM54402p = this.f73495x.m54402p((InterfaceC18710a.f) obj);
                    c41762a.f73502y = null;
                    c41762a.f73496E = null;
                    c41762a.f73497F = null;
                    c41762a.f73498G = null;
                    c41762a.f73499H = 0;
                    c41762a.f73501x = 1;
                    if (interfaceC13062m.emit(abstractC14610bM54402p, c41762a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C18711b c18711b) {
            this.f73492w = interfaceC13058l;
            this.f73493x = c18711b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73492w.collect(new a(interfaceC13062m, this.f73493x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: im2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73504w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18711b f73505x;

        /* JADX INFO: renamed from: im2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73506w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18711b f73507x;

            /* JADX INFO: renamed from: im2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel$special$$inlined$map$2$2", m100430f = "TrendsMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41763a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73508E;

                /* JADX INFO: renamed from: F */
                Object f73509F;

                /* JADX INFO: renamed from: G */
                Object f73510G;

                /* JADX INFO: renamed from: H */
                int f73511H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73512w;

                /* JADX INFO: renamed from: x */
                int f73513x;

                /* JADX INFO: renamed from: y */
                Object f73514y;

                public C41763a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73512w = obj;
                    this.f73513x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18711b c18711b) {
                this.f73506w = interfaceC13062m;
                this.f73507x = c18711b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41763a c41763a;
                if (interfaceC30057d instanceof C41763a) {
                    c41763a = (C41763a) interfaceC30057d;
                    int i13 = c41763a.f73513x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41763a.f73513x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41763a = new C41763a(interfaceC30057d);
                    }
                } else {
                    c41763a = new C41763a(interfaceC30057d);
                }
                Object obj2 = c41763a.f73512w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41763a.f73513x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73506w;
                    C18712c c18712cM61673b = this.f73507x.reducer.m61673b((C14611c) obj);
                    c41763a.f73514y = null;
                    c41763a.f73508E = null;
                    c41763a.f73509F = null;
                    c41763a.f73510G = null;
                    c41763a.f73511H = 0;
                    c41763a.f73513x = 1;
                    if (interfaceC13062m.emit(c18712cM61673b, c41763a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C18711b c18711b) {
            this.f73504w = interfaceC13058l;
            this.f73505x = c18711b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73504w.collect(new a(interfaceC13062m, this.f73505x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18711b(C14612d interactor, C21794a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC14610b m54402p(InterfaceC18710a.f fVar) {
        if (fVar instanceof InterfaceC18710a.e) {
            return new AbstractC14610b.a(((InterfaceC18710a.e) fVar).getPath(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC18710a.f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C18711b(C14612d c14612d, C21794a c21794a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14612d, c21794a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

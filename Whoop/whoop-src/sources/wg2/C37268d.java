package wg2;

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
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vg2.AbstractC36030b;
import vg2.C36029a;
import vg2.C36031c;
import xg2.C38273a;

/* JADX INFO: renamed from: wg2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lwg2/d;", "Lwg2/c;", "Lvg2/c;", "interactor", "Lxg2/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lvg2/c;Lxg2/a;Lor2/m;)V", "Lwg2/b;", "Lvg2/a;", "p", "(Lwg2/b;)Lvg2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lwg2/b;)V", "y", "Lxg2/a;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/f2;", "Lwg2/e;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37268d extends AbstractC37267c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C38273a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: wg2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.presentation.TargetsCardViewModelImpl$sendViewEvent$1", m100430f = "TargetsCardViewModelImpl.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159421w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37266b f159423y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C37266b c37266b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159423y = c37266b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37268d.this.new a(this.f159423y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159421w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37268d.this.eventFlow;
                C37266b c37266b = this.f159423y;
                this.f159421w = 1;
                if (interfaceC13072o1.emit(c37266b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wg2.d$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159424w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37268d f159425x;

        /* JADX INFO: renamed from: wg2.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159426w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37268d f159427x;

            /* JADX INFO: renamed from: wg2.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.presentation.TargetsCardViewModelImpl$special$$inlined$map$1$2", m100430f = "TargetsCardViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42592a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159428E;

                /* JADX INFO: renamed from: F */
                Object f159429F;

                /* JADX INFO: renamed from: G */
                Object f159430G;

                /* JADX INFO: renamed from: H */
                int f159431H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159432w;

                /* JADX INFO: renamed from: x */
                int f159433x;

                /* JADX INFO: renamed from: y */
                Object f159434y;

                public C42592a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159432w = obj;
                    this.f159433x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37268d c37268d) {
                this.f159426w = interfaceC13062m;
                this.f159427x = c37268d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42592a c42592a;
                if (interfaceC30057d instanceof C42592a) {
                    c42592a = (C42592a) interfaceC30057d;
                    int i13 = c42592a.f159433x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42592a.f159433x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42592a = new C42592a(interfaceC30057d);
                    }
                } else {
                    c42592a = new C42592a(interfaceC30057d);
                }
                Object obj2 = c42592a.f159432w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42592a.f159433x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159426w;
                    C36029a c36029aM119433p = this.f159427x.m119433p((C37266b) obj);
                    c42592a.f159434y = null;
                    c42592a.f159428E = null;
                    c42592a.f159429F = null;
                    c42592a.f159430G = null;
                    c42592a.f159431H = 0;
                    c42592a.f159433x = 1;
                    if (interfaceC13062m.emit(c36029aM119433p, c42592a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37268d c37268d) {
            this.f159424w = interfaceC13058l;
            this.f159425x = c37268d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159424w.collect(new a(interfaceC13062m, this.f159425x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wg2.d$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159436w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37268d f159437x;

        /* JADX INFO: renamed from: wg2.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159438w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37268d f159439x;

            /* JADX INFO: renamed from: wg2.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.presentation.TargetsCardViewModelImpl$special$$inlined$map$2$2", m100430f = "TargetsCardViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42593a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159440E;

                /* JADX INFO: renamed from: F */
                Object f159441F;

                /* JADX INFO: renamed from: G */
                Object f159442G;

                /* JADX INFO: renamed from: H */
                int f159443H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159444w;

                /* JADX INFO: renamed from: x */
                int f159445x;

                /* JADX INFO: renamed from: y */
                Object f159446y;

                public C42593a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159444w = obj;
                    this.f159445x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37268d c37268d) {
                this.f159438w = interfaceC13062m;
                this.f159439x = c37268d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42593a c42593a;
                if (interfaceC30057d instanceof C42593a) {
                    c42593a = (C42593a) interfaceC30057d;
                    int i13 = c42593a.f159445x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42593a.f159445x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42593a = new C42593a(interfaceC30057d);
                    }
                } else {
                    c42593a = new C42593a(interfaceC30057d);
                }
                Object obj2 = c42593a.f159444w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42593a.f159445x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159438w;
                    AbstractC37269e abstractC37269eM122632a = this.f159439x.reducer.m122632a((AbstractC36030b) obj);
                    c42593a.f159446y = null;
                    c42593a.f159440E = null;
                    c42593a.f159441F = null;
                    c42593a.f159442G = null;
                    c42593a.f159443H = 0;
                    c42593a.f159445x = 1;
                    if (interfaceC13062m.emit(abstractC37269eM122632a, c42593a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37268d c37268d) {
            this.f159436w = interfaceC13058l;
            this.f159437x = c37268d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159436w.collect(new a(interfaceC13062m, this.f159437x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37268d(C36031c interactor, C38273a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new c(interactor.interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, AbstractC37269e.c.f159450a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C36029a m119433p(C37266b c37266b) {
        return new C36029a(c37266b.getItemState().getPath());
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(C37266b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C37268d(C36031c c36031c, C38273a c38273a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36031c, c38273a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

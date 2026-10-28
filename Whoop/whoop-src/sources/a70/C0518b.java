package a70;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import l83.C23454a0;
import ld1.AbstractC23864c;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p699b70.C2779e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y60.AbstractC39257a;
import y60.C39258b;
import y60.C39259c;

/* JADX INFO: renamed from: a70.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"La70/b;", "Lld1/c;", "Lb70/e;", "La70/a;", "Lbc3/c0;", "coroutineScope", "Ly60/c;", "dayZeroSplashInteractor", "La70/c;", "dayZeroSplashViewStateReducer", "Lfi0/a;", "analytics", "<init>", "(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;)V", "Ly60/a;", "r", "(La70/a;)Ly60/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "q", "(La70/a;)V", "x", "Lbc3/c0;", "y", "Ly60/c;", "z", "La70/c;", "E", "Lfi0/a;", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "Lec3/t1;", "G", "Lec3/t1;", "p", "()Lec3/t1;", "viewState", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0518b extends AbstractC23864c<C2779e, AbstractC0517a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C39259c dayZeroSplashInteractor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C0519c dayZeroSplashViewStateReducer;

    /* JADX INFO: renamed from: a70.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.presentation.DayZeroSplashViewModel$sendViewEvent$1", m100430f = "DayZeroSplashViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1733w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC0517a f1735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0517a abstractC0517a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1735y = abstractC0517a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C0518b.this.new a(this.f1735y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1733w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C0518b.this.eventFlow;
                AbstractC0517a abstractC0517a = this.f1735y;
                this.f1733w = 1;
                if (interfaceC13072o1.emit(abstractC0517a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a70.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f1736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0518b f1737x;

        /* JADX INFO: renamed from: a70.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f1738w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0518b f1739x;

            /* JADX INFO: renamed from: a70.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.presentation.DayZeroSplashViewModel$special$$inlined$mapNotNull$1$2", m100430f = "DayZeroSplashViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41263a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f1740E;

                /* JADX INFO: renamed from: F */
                Object f1741F;

                /* JADX INFO: renamed from: G */
                Object f1742G;

                /* JADX INFO: renamed from: H */
                Object f1743H;

                /* JADX INFO: renamed from: I */
                int f1744I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f1745w;

                /* JADX INFO: renamed from: x */
                int f1746x;

                /* JADX INFO: renamed from: y */
                Object f1747y;

                public C41263a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f1745w = obj;
                    this.f1746x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0518b c0518b) {
                this.f1738w = interfaceC13062m;
                this.f1739x = c0518b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41263a c41263a;
                if (interfaceC30057d instanceof C41263a) {
                    c41263a = (C41263a) interfaceC30057d;
                    int i13 = c41263a.f1746x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41263a.f1746x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41263a = new C41263a(interfaceC30057d);
                    }
                } else {
                    c41263a = new C41263a(interfaceC30057d);
                }
                Object obj2 = c41263a.f1745w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41263a.f1746x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f1738w;
                    AbstractC39257a abstractC39257aM1215r = this.f1739x.m1215r((AbstractC0517a) obj);
                    if (abstractC39257aM1215r != null) {
                        c41263a.f1747y = null;
                        c41263a.f1740E = null;
                        c41263a.f1741F = null;
                        c41263a.f1742G = null;
                        c41263a.f1743H = null;
                        c41263a.f1744I = 0;
                        c41263a.f1746x = 1;
                        if (interfaceC13062m.emit(abstractC39257aM1215r, c41263a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C0518b c0518b) {
            this.f1736w = interfaceC13058l;
            this.f1737x = c0518b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f1736w.collect(new a(interfaceC13062m, this.f1737x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a70.b$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f1749w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0518b f1750x;

        /* JADX INFO: renamed from: a70.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f1751w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0518b f1752x;

            /* JADX INFO: renamed from: a70.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.presentation.DayZeroSplashViewModel$special$$inlined$mapNotNull$2$2", m100430f = "DayZeroSplashViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41264a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f1753E;

                /* JADX INFO: renamed from: F */
                Object f1754F;

                /* JADX INFO: renamed from: G */
                Object f1755G;

                /* JADX INFO: renamed from: H */
                Object f1756H;

                /* JADX INFO: renamed from: I */
                int f1757I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f1758w;

                /* JADX INFO: renamed from: x */
                int f1759x;

                /* JADX INFO: renamed from: y */
                Object f1760y;

                public C41264a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f1758w = obj;
                    this.f1759x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0518b c0518b) {
                this.f1751w = interfaceC13062m;
                this.f1752x = c0518b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41264a c41264a;
                if (interfaceC30057d instanceof C41264a) {
                    c41264a = (C41264a) interfaceC30057d;
                    int i13 = c41264a.f1759x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41264a.f1759x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41264a = new C41264a(interfaceC30057d);
                    }
                } else {
                    c41264a = new C41264a(interfaceC30057d);
                }
                Object obj2 = c41264a.f1758w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41264a.f1759x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f1751w;
                    C2779e c2779eM1220a = this.f1752x.dayZeroSplashViewStateReducer.m1220a((C39258b) obj);
                    if (c2779eM1220a != null) {
                        c41264a.f1760y = null;
                        c41264a.f1753E = null;
                        c41264a.f1754F = null;
                        c41264a.f1755G = null;
                        c41264a.f1756H = null;
                        c41264a.f1757I = 0;
                        c41264a.f1759x = 1;
                        if (interfaceC13062m.emit(c2779eM1220a, c41264a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C0518b c0518b) {
            this.f1749w = interfaceC13058l;
            this.f1750x = c0518b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f1749w.collect(new a(interfaceC13062m, this.f1750x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a70.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.presentation.DayZeroSplashViewModel$viewState$1", m100430f = "DayZeroSplashViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"La70/a;", "it", "Ll83/a0;", "<anonymous>", "(La70/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1762w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f1763x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C0518b.this.new d(interfaceC30057d);
            dVar.f1763x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0517a abstractC0517a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(abstractC0517a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC0517a abstractC0517a = (AbstractC0517a) this.f1763x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f1762w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC0517a instanceof AbstractC0517a.b) {
                AbstractC14516b.m41429a(C0518b.this.analytics, ((AbstractC0517a.b) abstractC0517a).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518b(InterfaceC2994c0 coroutineScope, C39259c dayZeroSplashInteractor, C0519c dayZeroSplashViewStateReducer, InterfaceC14515a analytics) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dayZeroSplashInteractor, "dayZeroSplashInteractor");
        AbstractC22676k.m65750j(dayZeroSplashViewStateReducer, "dayZeroSplashViewStateReducer");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.coroutineScope = coroutineScope;
        this.dayZeroSplashInteractor = dayZeroSplashInteractor;
        this.dayZeroSplashViewStateReducer = dayZeroSplashViewStateReducer;
        this.analytics = analytics;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(dayZeroSplashInteractor.interact(new b(new C13052j1(c13096w1M36592b, new d(null), 0), this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC39257a m1215r(AbstractC0517a abstractC0517a) {
        if (AbstractC22676k.m65745e(abstractC0517a, AbstractC0517a.a.f1725a)) {
            return AbstractC39257a.a.f168776a;
        }
        if (abstractC0517a instanceof AbstractC0517a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC0517a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C0518b(InterfaceC2994c0 interfaceC2994c0, C39259c c39259c, C0519c c0519c, InterfaceC14515a interfaceC14515a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c39259c, c0519c, interfaceC14515a);
    }
}

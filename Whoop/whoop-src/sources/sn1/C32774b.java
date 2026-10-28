package sn1;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p741vn1.AbstractC36203g;
import pn1.AbstractC29378a;
import pn1.AbstractC29379b;
import q83.InterfaceC30057d;
import qn1.C30518a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tn1.C33960b;

/* JADX INFO: renamed from: sn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lsn1/b;", "Lld1/c;", "Lvn1/g;", "Lsn1/a;", "Lqn1/a;", "combiner", "Ltn1/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lqn1/a;Ltn1/b;Lbc3/c0;)V", "Lpn1/a;", "o", "(Lsn1/a;)Lpn1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lsn1/a;)V", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lpn1/b;", "z", "Lec3/l;", "domainState", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32774b extends AbstractC23864c<AbstractC36203g, AbstractC32773a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: sn1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.presentation.HomeNotificationsCenterViewModel$domainState$2", m100430f = "HomeNotificationsCenterViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpn1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136331w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136332x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f136332x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136332x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136331w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29378a.c cVar = new AbstractC29378a.c(true, null, null, 6, null);
                this.f136332x = null;
                this.f136331w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sn1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.presentation.HomeNotificationsCenterViewModel$sendViewEvent$1", m100430f = "HomeNotificationsCenterViewModel.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136333w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32773a f136335y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC32773a abstractC32773a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136335y = abstractC32773a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32774b.this.new b(this.f136335y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136333w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C32774b.this.eventFlow;
                AbstractC32773a abstractC32773a = this.f136335y;
                this.f136333w = 1;
                if (interfaceC13072o1.emit(abstractC32773a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sn1.b$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136336w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32774b f136337x;

        /* JADX INFO: renamed from: sn1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136338w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32774b f136339x;

            /* JADX INFO: renamed from: sn1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.presentation.HomeNotificationsCenterViewModel$special$$inlined$map$1$2", m100430f = "HomeNotificationsCenterViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42330a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136340E;

                /* JADX INFO: renamed from: F */
                Object f136341F;

                /* JADX INFO: renamed from: G */
                Object f136342G;

                /* JADX INFO: renamed from: H */
                int f136343H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136344w;

                /* JADX INFO: renamed from: x */
                int f136345x;

                /* JADX INFO: renamed from: y */
                Object f136346y;

                public C42330a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136344w = obj;
                    this.f136345x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32774b c32774b) {
                this.f136338w = interfaceC13062m;
                this.f136339x = c32774b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42330a c42330a;
                if (interfaceC30057d instanceof C42330a) {
                    c42330a = (C42330a) interfaceC30057d;
                    int i13 = c42330a.f136345x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42330a.f136345x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42330a = new C42330a(interfaceC30057d);
                    }
                } else {
                    c42330a = new C42330a(interfaceC30057d);
                }
                Object obj2 = c42330a.f136344w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42330a.f136345x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136338w;
                    AbstractC29378a abstractC29378aM102786o = this.f136339x.m102786o((AbstractC32773a) obj);
                    c42330a.f136346y = null;
                    c42330a.f136340E = null;
                    c42330a.f136341F = null;
                    c42330a.f136342G = null;
                    c42330a.f136343H = 0;
                    c42330a.f136345x = 1;
                    if (interfaceC13062m.emit(abstractC29378aM102786o, c42330a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C32774b c32774b) {
            this.f136336w = interfaceC13058l;
            this.f136337x = c32774b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136336w.collect(new a(interfaceC13062m, this.f136337x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sn1.b$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136348w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33960b f136349x;

        /* JADX INFO: renamed from: sn1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136350w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33960b f136351x;

            /* JADX INFO: renamed from: sn1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.presentation.HomeNotificationsCenterViewModel$special$$inlined$map$2$2", m100430f = "HomeNotificationsCenterViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42331a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136352E;

                /* JADX INFO: renamed from: F */
                Object f136353F;

                /* JADX INFO: renamed from: G */
                Object f136354G;

                /* JADX INFO: renamed from: H */
                int f136355H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136356w;

                /* JADX INFO: renamed from: x */
                int f136357x;

                /* JADX INFO: renamed from: y */
                Object f136358y;

                public C42331a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136356w = obj;
                    this.f136357x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33960b c33960b) {
                this.f136350w = interfaceC13062m;
                this.f136351x = c33960b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42331a c42331a;
                if (interfaceC30057d instanceof C42331a) {
                    c42331a = (C42331a) interfaceC30057d;
                    int i13 = c42331a.f136357x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42331a.f136357x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42331a = new C42331a(interfaceC30057d);
                    }
                } else {
                    c42331a = new C42331a(interfaceC30057d);
                }
                Object obj2 = c42331a.f136356w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42331a.f136357x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136350w;
                    AbstractC36203g abstractC36203gM107414c = this.f136351x.m107414c((AbstractC29379b) obj);
                    c42331a.f136358y = null;
                    c42331a.f136352E = null;
                    c42331a.f136353F = null;
                    c42331a.f136354G = null;
                    c42331a.f136355H = 0;
                    c42331a.f136357x = 1;
                    if (interfaceC13062m.emit(abstractC36203gM107414c, c42331a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C33960b c33960b) {
            this.f136348w = interfaceC13058l;
            this.f136349x = c33960b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136348w.collect(new a(interfaceC13062m, this.f136349x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32774b(C30518a combiner, C33960b reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C13015a0(new a(null), new c(c13096w1M36592b, this)), combiner);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new d(interfaceC13058lM83945a, reducer), coroutineScope, C13105z1.f45288a, AbstractC36203g.b.f155006b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC29378a m102786o(AbstractC32773a abstractC32773a) {
        if (abstractC32773a instanceof AbstractC32773a.c) {
            AbstractC32773a.c cVar = (AbstractC32773a.c) abstractC32773a;
            return new AbstractC29378a.c(false, cVar.getPath(), cVar.getUserCategory(), 1, null);
        }
        if (abstractC32773a instanceof AbstractC32773a.f) {
            AbstractC32773a.f fVar = (AbstractC32773a.f) abstractC32773a;
            return new AbstractC29378a.f(fVar.getId(), fVar.getCardDismissAction(), fVar.getPath());
        }
        if (AbstractC22676k.m65745e(abstractC32773a, AbstractC32773a.g.f136325a)) {
            return AbstractC29378a.g.f119174a;
        }
        if (abstractC32773a instanceof AbstractC32773a.h) {
            return new AbstractC29378a.h(((AbstractC32773a.h) abstractC32773a).getPath());
        }
        if (abstractC32773a instanceof AbstractC32773a.d) {
            return new AbstractC29378a.d(((AbstractC32773a.d) abstractC32773a).getId());
        }
        if (abstractC32773a instanceof AbstractC32773a.b) {
            return new AbstractC29378a.b(((AbstractC32773a.b) abstractC32773a).getNotificationCardDismissAnimation());
        }
        if (abstractC32773a instanceof AbstractC32773a.a) {
            return new AbstractC29378a.a(((AbstractC32773a.a) abstractC32773a).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        if (!(abstractC32773a instanceof AbstractC32773a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC32773a.e eVar = (AbstractC32773a.e) abstractC32773a;
        return new AbstractC29378a.e(eVar.getCardVariant(), eVar.getLabel(), eVar.getTotalCards(), eVar.getNotificationType(), eVar.getTemplateName());
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC32773a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C32774b(C30518a c30518a, C33960b c33960b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30518a, c33960b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

package cj1;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dj1.C12091d;
import ec3.AbstractC13091v;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ri1.AbstractC31463l;
import ri1.C31465n;
import ri1.C31466o;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cj1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcj1/k;", "Lld1/c;", "Lcj1/l;", "Lcj1/j;", "Lri1/o;", "interactor", "Ldj1/d;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lri1/o;Ldj1/d;Lor2/m;)V", "Lri1/l;", "p", "(Lcj1/j;)Lri1/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lcj1/j;)V", "x", "Ldj1/d;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lri1/n;", "E", "Lec3/l;", "domainState", "Lec3/f2;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4755k extends AbstractC23864c<AbstractC4756l, AbstractC4754j> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12091d reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: cj1.k$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel$sendViewEvent$1", m100430f = "HealthspanHeroMetricMiniArchViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19578w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4754j f19580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4754j abstractC4754j, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19580y = abstractC4754j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4755k.this.new a(this.f19580y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f19578w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4755k.this.eventFlow;
                AbstractC4754j abstractC4754j = this.f19580y;
                this.f19578w = 1;
                if (interfaceC13072o1.emit(abstractC4754j, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cj1.k$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19581w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4755k f19582x;

        /* JADX INFO: renamed from: cj1.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19583w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4755k f19584x;

            /* JADX INFO: renamed from: cj1.k$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel$special$$inlined$map$1$2", m100430f = "HealthspanHeroMetricMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41355a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19585E;

                /* JADX INFO: renamed from: F */
                Object f19586F;

                /* JADX INFO: renamed from: G */
                Object f19587G;

                /* JADX INFO: renamed from: H */
                int f19588H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19589w;

                /* JADX INFO: renamed from: x */
                int f19590x;

                /* JADX INFO: renamed from: y */
                Object f19591y;

                public C41355a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19589w = obj;
                    this.f19590x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4755k c4755k) {
                this.f19583w = interfaceC13062m;
                this.f19584x = c4755k;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41355a c41355a;
                if (interfaceC30057d instanceof C41355a) {
                    c41355a = (C41355a) interfaceC30057d;
                    int i13 = c41355a.f19590x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41355a.f19590x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41355a = new C41355a(interfaceC30057d);
                    }
                } else {
                    c41355a = new C41355a(interfaceC30057d);
                }
                Object obj2 = c41355a.f19589w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41355a.f19590x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19583w;
                    AbstractC31463l abstractC31463lM14987p = this.f19584x.m14987p((AbstractC4754j) obj);
                    c41355a.f19591y = null;
                    c41355a.f19585E = null;
                    c41355a.f19586F = null;
                    c41355a.f19587G = null;
                    c41355a.f19588H = 0;
                    c41355a.f19590x = 1;
                    if (interfaceC13062m.emit(abstractC31463lM14987p, c41355a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4755k c4755k) {
            this.f19581w = interfaceC13058l;
            this.f19582x = c4755k;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19581w.collect(new a(interfaceC13062m, this.f19582x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cj1.k$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19593w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4755k f19594x;

        /* JADX INFO: renamed from: cj1.k$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19595w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4755k f19596x;

            /* JADX INFO: renamed from: cj1.k$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel$special$$inlined$map$2$2", m100430f = "HealthspanHeroMetricMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41356a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19597E;

                /* JADX INFO: renamed from: F */
                Object f19598F;

                /* JADX INFO: renamed from: G */
                Object f19599G;

                /* JADX INFO: renamed from: H */
                int f19600H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19601w;

                /* JADX INFO: renamed from: x */
                int f19602x;

                /* JADX INFO: renamed from: y */
                Object f19603y;

                public C41356a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19601w = obj;
                    this.f19602x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4755k c4755k) {
                this.f19595w = interfaceC13062m;
                this.f19596x = c4755k;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41356a c41356a;
                if (interfaceC30057d instanceof C41356a) {
                    c41356a = (C41356a) interfaceC30057d;
                    int i13 = c41356a.f19602x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41356a.f19602x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41356a = new C41356a(interfaceC30057d);
                    }
                } else {
                    c41356a = new C41356a(interfaceC30057d);
                }
                Object obj2 = c41356a.f19601w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41356a.f19602x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19595w;
                    AbstractC4756l abstractC4756lM33412c = this.f19596x.reducer.m33412c((C31465n) obj);
                    c41356a.f19603y = null;
                    c41356a.f19597E = null;
                    c41356a.f19598F = null;
                    c41356a.f19599G = null;
                    c41356a.f19600H = 0;
                    c41356a.f19602x = 1;
                    if (interfaceC13062m.emit(abstractC4756lM33412c, c41356a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C4755k c4755k) {
            this.f19593w = interfaceC13058l;
            this.f19594x = c4755k;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19593w.collect(new a(interfaceC13062m, this.f19594x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4755k(C31466o interactor, C12091d reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM83945a, this), coroutineScope, C13105z1.f45288a, AbstractC4756l.a.f19605a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC31463l m14987p(AbstractC4754j abstractC4754j) {
        if (abstractC4754j instanceof AbstractC4754j.b) {
            return new AbstractC31463l.b(((AbstractC4754j.b) abstractC4754j).getViewState());
        }
        if (AbstractC22676k.m65745e(abstractC4754j, AbstractC4754j.a.f19571a)) {
            return AbstractC31463l.a.f129638a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC4754j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C4755k(C31466o c31466o, C12091d c12091d, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31466o, c12091d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}

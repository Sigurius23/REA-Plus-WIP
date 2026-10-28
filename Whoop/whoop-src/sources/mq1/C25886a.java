package mq1;

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
import iq1.AbstractC20849b;
import iq1.C20848a;
import iq1.C20851d;
import iq1.C20853f;
import iq1.InterfaceC20850c;
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

/* JADX INFO: renamed from: mq1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lmq1/a;", "Lld1/c;", "Liq1/a;", "Liq1/c$f;", "Liq1/d;", "interactor", "Lmq1/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Liq1/d;Lmq1/b;Lbc3/c0;)V", "Liq1/b;", "p", "(Liq1/c$f;)Liq1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Liq1/c$f;)V", "x", "Liq1/d;", "y", "Lmq1/b;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/l;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25886a extends AbstractC23864c<C20848a, InterfaceC20850c.f> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C20851d interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C25887b reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: mq1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.presentation.journaltrends.BehaviorDetailsImpactJournalTrendsViewModel$sendViewEvent$1", m100430f = "BehaviorDetailsImpactJournalTrendsViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102127w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC20850c.f f102129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC20850c.f fVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102129y = fVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25886a.this.new a(this.f102129y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102127w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25886a.this.eventFlow;
                InterfaceC20850c.f fVar = this.f102129y;
                this.f102127w = 1;
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

    /* JADX INFO: renamed from: mq1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25886a f102131x;

        /* JADX INFO: renamed from: mq1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102132w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25886a f102133x;

            /* JADX INFO: renamed from: mq1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.presentation.journaltrends.BehaviorDetailsImpactJournalTrendsViewModel$special$$inlined$map$1$2", m100430f = "BehaviorDetailsImpactJournalTrendsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42019a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102134E;

                /* JADX INFO: renamed from: F */
                Object f102135F;

                /* JADX INFO: renamed from: G */
                Object f102136G;

                /* JADX INFO: renamed from: H */
                int f102137H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102138w;

                /* JADX INFO: renamed from: x */
                int f102139x;

                /* JADX INFO: renamed from: y */
                Object f102140y;

                public C42019a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102138w = obj;
                    this.f102139x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25886a c25886a) {
                this.f102132w = interfaceC13062m;
                this.f102133x = c25886a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42019a c42019a;
                if (interfaceC30057d instanceof C42019a) {
                    c42019a = (C42019a) interfaceC30057d;
                    int i13 = c42019a.f102139x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42019a.f102139x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42019a = new C42019a(interfaceC30057d);
                    }
                } else {
                    c42019a = new C42019a(interfaceC30057d);
                }
                Object obj2 = c42019a.f102138w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42019a.f102139x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102132w;
                    AbstractC20849b abstractC20849bM76535p = this.f102133x.m76535p((InterfaceC20850c.f) obj);
                    c42019a.f102140y = null;
                    c42019a.f102134E = null;
                    c42019a.f102135F = null;
                    c42019a.f102136G = null;
                    c42019a.f102137H = 0;
                    c42019a.f102139x = 1;
                    if (interfaceC13062m.emit(abstractC20849bM76535p, c42019a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25886a c25886a) {
            this.f102130w = interfaceC13058l;
            this.f102131x = c25886a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102130w.collect(new a(interfaceC13062m, this.f102131x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102142w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25886a f102143x;

        /* JADX INFO: renamed from: mq1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102144w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25886a f102145x;

            /* JADX INFO: renamed from: mq1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.presentation.journaltrends.BehaviorDetailsImpactJournalTrendsViewModel$special$$inlined$map$2$2", m100430f = "BehaviorDetailsImpactJournalTrendsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42020a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102146E;

                /* JADX INFO: renamed from: F */
                Object f102147F;

                /* JADX INFO: renamed from: G */
                Object f102148G;

                /* JADX INFO: renamed from: H */
                int f102149H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102150w;

                /* JADX INFO: renamed from: x */
                int f102151x;

                /* JADX INFO: renamed from: y */
                Object f102152y;

                public C42020a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102150w = obj;
                    this.f102151x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25886a c25886a) {
                this.f102144w = interfaceC13062m;
                this.f102145x = c25886a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42020a c42020a;
                if (interfaceC30057d instanceof C42020a) {
                    c42020a = (C42020a) interfaceC30057d;
                    int i13 = c42020a.f102151x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42020a.f102151x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42020a = new C42020a(interfaceC30057d);
                    }
                } else {
                    c42020a = new C42020a(interfaceC30057d);
                }
                Object obj2 = c42020a.f102150w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42020a.f102151x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102144w;
                    C20848a c20848aM76542c = this.f102145x.reducer.m76542c((C20853f) obj);
                    c42020a.f102152y = null;
                    c42020a.f102146E = null;
                    c42020a.f102147F = null;
                    c42020a.f102148G = null;
                    c42020a.f102149H = 0;
                    c42020a.f102151x = 1;
                    if (interfaceC13062m.emit(c20848aM76542c, c42020a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25886a c25886a) {
            this.f102142w = interfaceC13058l;
            this.f102143x = c25886a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102142w.collect(new a(interfaceC13062m, this.f102143x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25886a(C20851d interactor, C25887b reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interactor.interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC20849b m76535p(InterfaceC20850c.f fVar) {
        if (fVar instanceof InterfaceC20850c.a) {
            return new AbstractC20849b.a(((InterfaceC20850c.a) fVar).getPath());
        }
        if (fVar instanceof InterfaceC20850c.e) {
            return AbstractC20849b.d.f78385a;
        }
        if (fVar instanceof InterfaceC20850c.d) {
            return new AbstractC20849b.c(((InterfaceC20850c.d) fVar).getNextDateTime());
        }
        if (fVar instanceof InterfaceC20850c.c) {
            return new AbstractC20849b.b(((InterfaceC20850c.c) fVar).getPreviousDateTime());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC20850c.f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C25886a(C20851d c20851d, C25887b c25887b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20851d, c25887b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

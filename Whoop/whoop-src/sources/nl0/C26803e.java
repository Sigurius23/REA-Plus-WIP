package nl0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bl0.C3369a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import el0.C13313a;
import l83.C23454a0;
import ld1.AbstractC23864c;
import od1.AbstractC27845h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl0.C29346d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xk0.C38423a;

/* JADX INFO: renamed from: nl0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lnl0/e;", "Lld1/c;", "Lnl0/f;", "Lnl0/d;", "Lbc3/c0;", "coroutineScope", "Lxk0/a;", "analyticsHelper", "Lel0/a;", "combiner", "Lpl0/d;", "reducer", "<init>", "(Lbc3/c0;Lxk0/a;Lel0/a;Lpl0/d;)V", "viewEvent", "Ll83/a0;", "n", "(Lnl0/d;)V", "o", "x", "Lbc3/c0;", "y", "Lxk0/a;", "Lec3/o1;", "z", "Lec3/o1;", "viewEventFlow", "Lec3/l;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26803e extends AbstractC23864c<C26804f, AbstractC26802d> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEventFlow;

    /* JADX INFO: renamed from: nl0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.presentation.AiConversationViewModel$sendViewEvent$1", m100430f = "AiConversationViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106810w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26802d f106812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC26802d abstractC26802d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f106812y = abstractC26802d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26803e.this.new a(this.f106812y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26803e.this.m79941n(this.f106812y);
                InterfaceC13072o1 interfaceC13072o1 = C26803e.this.viewEventFlow;
                AbstractC26802d abstractC26802d = this.f106812y;
                this.f106810w = 1;
                if (interfaceC13072o1.emit(abstractC26802d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nl0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106813w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29346d f106814x;

        /* JADX INFO: renamed from: nl0.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106815w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29346d f106816x;

            /* JADX INFO: renamed from: nl0.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.presentation.AiConversationViewModel$special$$inlined$map$1$2", m100430f = "AiConversationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42063a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106817E;

                /* JADX INFO: renamed from: F */
                Object f106818F;

                /* JADX INFO: renamed from: G */
                Object f106819G;

                /* JADX INFO: renamed from: H */
                int f106820H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106821w;

                /* JADX INFO: renamed from: x */
                int f106822x;

                /* JADX INFO: renamed from: y */
                Object f106823y;

                public C42063a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106821w = obj;
                    this.f106822x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29346d c29346d) {
                this.f106815w = interfaceC13062m;
                this.f106816x = c29346d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42063a c42063a;
                if (interfaceC30057d instanceof C42063a) {
                    c42063a = (C42063a) interfaceC30057d;
                    int i13 = c42063a.f106822x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42063a.f106822x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42063a = new C42063a(interfaceC30057d);
                    }
                } else {
                    c42063a = new C42063a(interfaceC30057d);
                }
                Object obj2 = c42063a.f106821w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42063a.f106822x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106815w;
                    C26804f c26804fM89434e = this.f106816x.m89434e((C3369a) obj);
                    c42063a.f106823y = null;
                    c42063a.f106817E = null;
                    c42063a.f106818F = null;
                    c42063a.f106819G = null;
                    c42063a.f106820H = 0;
                    c42063a.f106822x = 1;
                    if (interfaceC13062m.emit(c26804fM89434e, c42063a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29346d c29346d) {
            this.f106813w = interfaceC13058l;
            this.f106814x = c29346d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106813w.collect(new a(interfaceC13062m, this.f106814x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26803e(InterfaceC2994c0 coroutineScope, C38423a analyticsHelper, C13313a combiner, C29346d reducer) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.coroutineScope = coroutineScope;
        this.analyticsHelper = analyticsHelper;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.viewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(AbstractC27845h.m83945a(c13096w1M36592b, combiner), reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m79941n(AbstractC26802d viewEvent) {
        C38423a c38423a = this.analyticsHelper;
        if (viewEvent instanceof AbstractC26802d.m) {
            AbstractC26802d.m mVar = (AbstractC26802d.m) viewEvent;
            c38423a.m123048B(mVar.getConversationId(), mVar.getIndex(), mVar.getMessageCount());
            return;
        }
        if (viewEvent instanceof AbstractC26802d.f) {
            c38423a.m123065c(((AbstractC26802d.f) viewEvent).getConversationId());
            return;
        }
        if (viewEvent instanceof AbstractC26802d.d) {
            c38423a.m123067e(((AbstractC26802d.d) viewEvent).getConversationId());
            return;
        }
        if (viewEvent instanceof AbstractC26802d.s) {
            c38423a.m123079q(((AbstractC26802d.s) viewEvent).getConversationId());
            return;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC26802d.i.f106778a)) {
            c38423a.m123087z();
            return;
        }
        if (viewEvent instanceof AbstractC26802d.n) {
            AbstractC26802d.n nVar = (AbstractC26802d.n) viewEvent;
            c38423a.m123047A(nVar.getConversationId(), nVar.getMessageId());
        } else if (viewEvent instanceof AbstractC26802d.p) {
            AbstractC26802d.p pVar = (AbstractC26802d.p) viewEvent;
            c38423a.m123050D(pVar.getConversationId(), pVar.getVariant(), pVar.getSuggestionCount());
        } else if (viewEvent instanceof AbstractC26802d.o) {
            AbstractC26802d.o oVar = (AbstractC26802d.o) viewEvent;
            c38423a.m123049C(oVar.getConversationId(), oVar.getVariant());
        }
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC26802d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }
}

package lw2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iw2.C21010e;
import iw2.InterfaceC21006a;
import iw2.InterfaceC21007b;
import l83.C23454a0;
import mw2.C25987a;
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

/* JADX INFO: renamed from: lw2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Llw2/b;", "Landroidx/lifecycle/w1;", "Liw2/e;", "interactor", "Lmw2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Liw2/e;Lmw2/a;Lbc3/c0;)V", "Lec3/l;", "Liw2/a;", "Liw2/b;", "l", "(Lec3/l;Liw2/e;)Lec3/l;", "Llw2/a;", "o", "(Llw2/a;)Liw2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Llw2/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Llw2/c;", "z", "getViewState", "()Lec3/l;", "viewState", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24777b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: lw2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.presentation.WhatToExpectViewModel$sendViewEvent$1", m100430f = "WhatToExpectViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96912w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC24776a f96914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24776a interfaceC24776a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96914y = interfaceC24776a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24777b.this.new a(this.f96914y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96912w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C24777b.this.eventFlow;
                InterfaceC24776a interfaceC24776a = this.f96914y;
                this.f96912w = 1;
                if (interfaceC13072o1.emit(interfaceC24776a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: lw2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96915w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24777b f96916x;

        /* JADX INFO: renamed from: lw2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96917w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24777b f96918x;

            /* JADX INFO: renamed from: lw2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.presentation.WhatToExpectViewModel$special$$inlined$map$1$2", m100430f = "WhatToExpectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41972a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96919E;

                /* JADX INFO: renamed from: F */
                Object f96920F;

                /* JADX INFO: renamed from: G */
                Object f96921G;

                /* JADX INFO: renamed from: H */
                int f96922H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96923w;

                /* JADX INFO: renamed from: x */
                int f96924x;

                /* JADX INFO: renamed from: y */
                Object f96925y;

                public C41972a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96923w = obj;
                    this.f96924x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24777b c24777b) {
                this.f96917w = interfaceC13062m;
                this.f96918x = c24777b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41972a c41972a;
                if (interfaceC30057d instanceof C41972a) {
                    c41972a = (C41972a) interfaceC30057d;
                    int i13 = c41972a.f96924x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41972a.f96924x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41972a = new C41972a(interfaceC30057d);
                    }
                } else {
                    c41972a = new C41972a(interfaceC30057d);
                }
                Object obj2 = c41972a.f96923w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41972a.f96924x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96917w;
                    InterfaceC21006a interfaceC21006aM72621o = this.f96918x.m72621o((InterfaceC24776a) obj);
                    c41972a.f96925y = null;
                    c41972a.f96919E = null;
                    c41972a.f96920F = null;
                    c41972a.f96921G = null;
                    c41972a.f96922H = 0;
                    c41972a.f96924x = 1;
                    if (interfaceC13062m.emit(interfaceC21006aM72621o, c41972a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24777b c24777b) {
            this.f96915w = interfaceC13058l;
            this.f96916x = c24777b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96915w.collect(new a(interfaceC13062m, this.f96916x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lw2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96927w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25987a f96928x;

        /* JADX INFO: renamed from: lw2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96929w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25987a f96930x;

            /* JADX INFO: renamed from: lw2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.presentation.WhatToExpectViewModel$special$$inlined$map$2$2", m100430f = "WhatToExpectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41973a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96931E;

                /* JADX INFO: renamed from: F */
                Object f96932F;

                /* JADX INFO: renamed from: G */
                Object f96933G;

                /* JADX INFO: renamed from: H */
                int f96934H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96935w;

                /* JADX INFO: renamed from: x */
                int f96936x;

                /* JADX INFO: renamed from: y */
                Object f96937y;

                public C41973a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96935w = obj;
                    this.f96936x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25987a c25987a) {
                this.f96929w = interfaceC13062m;
                this.f96930x = c25987a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41973a c41973a;
                if (interfaceC30057d instanceof C41973a) {
                    c41973a = (C41973a) interfaceC30057d;
                    int i13 = c41973a.f96936x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41973a.f96936x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41973a = new C41973a(interfaceC30057d);
                    }
                } else {
                    c41973a = new C41973a(interfaceC30057d);
                }
                Object obj2 = c41973a.f96935w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41973a.f96936x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96929w;
                    C24778c c24778cM77089b = this.f96930x.m77089b((InterfaceC21007b) obj);
                    c41973a.f96937y = null;
                    c41973a.f96931E = null;
                    c41973a.f96932F = null;
                    c41973a.f96933G = null;
                    c41973a.f96934H = 0;
                    c41973a.f96936x = 1;
                    if (interfaceC13062m.emit(c24778cM77089b, c41973a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25987a c25987a) {
            this.f96927w = interfaceC13058l;
            this.f96928x = c25987a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96927w.collect(new a(interfaceC13062m, this.f96928x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24777b(C21010e interactor, C25987a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM72620l = m72620l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM72620l;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM72620l, reducer), coroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m72620l(InterfaceC13058l interfaceC13058l, C21010e c21010e) {
        return c21010e.m58576e(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC21006a m72621o(InterfaceC24776a interfaceC24776a) {
        if (interfaceC24776a instanceof InterfaceC24776a.a) {
            return new InterfaceC21006a.a(((InterfaceC24776a.a) interfaceC24776a).getIsInitialLoad());
        }
        if (interfaceC24776a instanceof InterfaceC24776a.b) {
            return new InterfaceC21006a.b(((InterfaceC24776a.b) interfaceC24776a).getMilestone());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m72622n(InterfaceC24776a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C24777b(C21010e c21010e, C25987a c25987a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21010e, c25987a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

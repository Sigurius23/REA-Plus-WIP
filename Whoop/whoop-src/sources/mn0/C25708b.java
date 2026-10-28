package mn0;

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
import jn0.C21800c;
import jn0.InterfaceC21798a;
import jn0.InterfaceC21799b;
import l83.C23454a0;
import on0.C28045a;
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

/* JADX INFO: renamed from: mn0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lmn0/b;", "Landroidx/lifecycle/w1;", "Ljn0/c;", "interactor", "Lon0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljn0/c;Lon0/a;Lbc3/c0;)V", "Lec3/l;", "Ljn0/a;", "Ljn0/b;", "l", "(Lec3/l;Ljn0/c;)Lec3/l;", "Lmn0/a;", "o", "(Lmn0/a;)Ljn0/a;", "viewEvent", "Ll83/a0;", "n", "(Lmn0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lmn0/c;", "z", "getViewState", "()Lec3/l;", "viewState", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25708b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: mn0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.presentation.ChallengeDetailsViewModel$sendViewEvent$1", m100430f = "ChallengeDetailsViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101229w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25707a f101231y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC25707a interfaceC25707a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101231y = interfaceC25707a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25708b.this.new a(this.f101231y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101229w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25708b.this.eventFlow;
                InterfaceC25707a interfaceC25707a = this.f101231y;
                this.f101229w = 1;
                if (interfaceC13072o1.emit(interfaceC25707a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mn0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f101232w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25708b f101233x;

        /* JADX INFO: renamed from: mn0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f101234w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25708b f101235x;

            /* JADX INFO: renamed from: mn0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.challengedetails.presentation.ChallengeDetailsViewModel$special$$inlined$map$1$2", m100430f = "ChallengeDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42012a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f101236E;

                /* JADX INFO: renamed from: F */
                Object f101237F;

                /* JADX INFO: renamed from: G */
                Object f101238G;

                /* JADX INFO: renamed from: H */
                int f101239H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f101240w;

                /* JADX INFO: renamed from: x */
                int f101241x;

                /* JADX INFO: renamed from: y */
                Object f101242y;

                public C42012a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f101240w = obj;
                    this.f101241x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25708b c25708b) {
                this.f101234w = interfaceC13062m;
                this.f101235x = c25708b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42012a c42012a;
                if (interfaceC30057d instanceof C42012a) {
                    c42012a = (C42012a) interfaceC30057d;
                    int i13 = c42012a.f101241x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42012a.f101241x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42012a = new C42012a(interfaceC30057d);
                    }
                } else {
                    c42012a = new C42012a(interfaceC30057d);
                }
                Object obj2 = c42012a.f101240w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42012a.f101241x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f101234w;
                    InterfaceC21798a interfaceC21798aM75705o = this.f101235x.m75705o((InterfaceC25707a) obj);
                    c42012a.f101242y = null;
                    c42012a.f101236E = null;
                    c42012a.f101237F = null;
                    c42012a.f101238G = null;
                    c42012a.f101239H = 0;
                    c42012a.f101241x = 1;
                    if (interfaceC13062m.emit(interfaceC21798aM75705o, c42012a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25708b c25708b) {
            this.f101232w = interfaceC13058l;
            this.f101233x = c25708b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f101232w.collect(new a(interfaceC13062m, this.f101233x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f101244w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28045a f101245x;

        /* JADX INFO: renamed from: mn0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f101246w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28045a f101247x;

            /* JADX INFO: renamed from: mn0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.challengedetails.presentation.ChallengeDetailsViewModel$special$$inlined$map$2$2", m100430f = "ChallengeDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42013a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f101248E;

                /* JADX INFO: renamed from: F */
                Object f101249F;

                /* JADX INFO: renamed from: G */
                Object f101250G;

                /* JADX INFO: renamed from: H */
                int f101251H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f101252w;

                /* JADX INFO: renamed from: x */
                int f101253x;

                /* JADX INFO: renamed from: y */
                Object f101254y;

                public C42013a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f101252w = obj;
                    this.f101253x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28045a c28045a) {
                this.f101246w = interfaceC13062m;
                this.f101247x = c28045a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42013a c42013a;
                if (interfaceC30057d instanceof C42013a) {
                    c42013a = (C42013a) interfaceC30057d;
                    int i13 = c42013a.f101253x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42013a.f101253x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42013a = new C42013a(interfaceC30057d);
                    }
                } else {
                    c42013a = new C42013a(interfaceC30057d);
                }
                Object obj2 = c42013a.f101252w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42013a.f101253x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f101246w;
                    C25709c c25709cM84575a = this.f101247x.m84575a((InterfaceC21799b) obj);
                    c42013a.f101254y = null;
                    c42013a.f101248E = null;
                    c42013a.f101249F = null;
                    c42013a.f101250G = null;
                    c42013a.f101251H = 0;
                    c42013a.f101253x = 1;
                    if (interfaceC13062m.emit(c25709cM84575a, c42013a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C28045a c28045a) {
            this.f101244w = interfaceC13058l;
            this.f101245x = c28045a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f101244w.collect(new a(interfaceC13062m, this.f101245x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25708b(C21800c interactor, C28045a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM75704l = m75704l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM75704l;
        this.viewState = new c(AbstractC13091v.m36586L(interfaceC13058lM75704l, coroutineScope, C13105z1.f45288a, 0), reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m75704l(InterfaceC13058l interfaceC13058l, C21800c c21800c) {
        return c21800c.m61696j(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC21798a m75705o(InterfaceC25707a interfaceC25707a) {
        if (interfaceC25707a instanceof InterfaceC25707a.c) {
            return new InterfaceC21798a.c(((InterfaceC25707a.c) interfaceC25707a).getName());
        }
        if (interfaceC25707a instanceof InterfaceC25707a.b) {
            return new InterfaceC21798a.b(((InterfaceC25707a.b) interfaceC25707a).getName());
        }
        if (interfaceC25707a instanceof InterfaceC25707a.a) {
            return InterfaceC21798a.a.f83953a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m75706n(InterfaceC25707a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C25708b(C21800c c21800c, C28045a c28045a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21800c, c28045a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

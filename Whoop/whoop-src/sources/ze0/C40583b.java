package ze0;

import af0.C0805a;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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
import we0.AbstractC37211a;
import we0.C37216f;
import we0.InterfaceC37212b;

/* JADX INFO: renamed from: ze0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lze0/b;", "Landroidx/lifecycle/w1;", "Lwe0/f;", "interactor", "Laf0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwe0/f;Laf0/a;Lbc3/c0;)V", "Lec3/l;", "Lwe0/a;", "Lwe0/b;", "l", "(Lec3/l;Lwe0/f;)Lec3/l;", "Lze0/a$m;", "viewEvent", "n", "(Lze0/a$m;)Lwe0/a;", "Ll83/a0;", "o", "(Lze0/a$m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lze0/c;", "z", "getViewState", "()Lec3/l;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40583b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ze0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.presentation.TestUploadViewModel$sendViewEvent$1", m100430f = "TestUploadViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174800w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC40582a.m f174802y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40582a.m mVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174802y = mVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40583b.this.new a(this.f174802y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174800w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40583b.this.eventFlow;
                InterfaceC40582a.m mVar = this.f174802y;
                this.f174800w = 1;
                if (interfaceC13072o1.emit(mVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ze0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40583b f174804x;

        /* JADX INFO: renamed from: ze0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174805w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40583b f174806x;

            /* JADX INFO: renamed from: ze0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.presentation.TestUploadViewModel$special$$inlined$map$1$2", m100430f = "TestUploadViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42745a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174807E;

                /* JADX INFO: renamed from: F */
                Object f174808F;

                /* JADX INFO: renamed from: G */
                Object f174809G;

                /* JADX INFO: renamed from: H */
                int f174810H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174811w;

                /* JADX INFO: renamed from: x */
                int f174812x;

                /* JADX INFO: renamed from: y */
                Object f174813y;

                public C42745a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174811w = obj;
                    this.f174812x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40583b c40583b) {
                this.f174805w = interfaceC13062m;
                this.f174806x = c40583b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42745a c42745a;
                if (interfaceC30057d instanceof C42745a) {
                    c42745a = (C42745a) interfaceC30057d;
                    int i13 = c42745a.f174812x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42745a.f174812x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42745a = new C42745a(interfaceC30057d);
                    }
                } else {
                    c42745a = new C42745a(interfaceC30057d);
                }
                Object obj2 = c42745a.f174811w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42745a.f174812x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174805w;
                    AbstractC37211a abstractC37211aM131589n = this.f174806x.m131589n((InterfaceC40582a.m) obj);
                    c42745a.f174813y = null;
                    c42745a.f174807E = null;
                    c42745a.f174808F = null;
                    c42745a.f174809G = null;
                    c42745a.f174810H = 0;
                    c42745a.f174812x = 1;
                    if (interfaceC13062m.emit(abstractC37211aM131589n, c42745a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C40583b c40583b) {
            this.f174803w = interfaceC13058l;
            this.f174804x = c40583b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174803w.collect(new a(interfaceC13062m, this.f174804x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ze0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0805a f174816x;

        /* JADX INFO: renamed from: ze0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174817w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0805a f174818x;

            /* JADX INFO: renamed from: ze0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.presentation.TestUploadViewModel$special$$inlined$map$2$2", m100430f = "TestUploadViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42746a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174819E;

                /* JADX INFO: renamed from: F */
                Object f174820F;

                /* JADX INFO: renamed from: G */
                Object f174821G;

                /* JADX INFO: renamed from: H */
                int f174822H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174823w;

                /* JADX INFO: renamed from: x */
                int f174824x;

                /* JADX INFO: renamed from: y */
                Object f174825y;

                public C42746a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174823w = obj;
                    this.f174824x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0805a c0805a) {
                this.f174817w = interfaceC13062m;
                this.f174818x = c0805a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42746a c42746a;
                if (interfaceC30057d instanceof C42746a) {
                    c42746a = (C42746a) interfaceC30057d;
                    int i13 = c42746a.f174824x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42746a.f174824x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42746a = new C42746a(interfaceC30057d);
                    }
                } else {
                    c42746a = new C42746a(interfaceC30057d);
                }
                Object obj2 = c42746a.f174823w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42746a.f174824x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174817w;
                    AbstractC40584c abstractC40584cM1957a = this.f174818x.m1957a((InterfaceC37212b) obj);
                    c42746a.f174825y = null;
                    c42746a.f174819E = null;
                    c42746a.f174820F = null;
                    c42746a.f174821G = null;
                    c42746a.f174822H = 0;
                    c42746a.f174824x = 1;
                    if (interfaceC13062m.emit(abstractC40584cM1957a, c42746a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C0805a c0805a) {
            this.f174815w = interfaceC13058l;
            this.f174816x = c0805a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174815w.collect(new a(interfaceC13062m, this.f174816x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40583b(C37216f interactor, C0805a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m131588l(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new c(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m131588l(InterfaceC13058l interfaceC13058l, C37216f c37216f) {
        return c37216f.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final AbstractC37211a m131589n(InterfaceC40582a.m viewEvent) {
        if (viewEvent instanceof InterfaceC40582a.g) {
            return AbstractC37211a.c.f159063a;
        }
        if (viewEvent instanceof InterfaceC40582a.d) {
            return new AbstractC37211a.e(((InterfaceC40582a.d) viewEvent).getResult());
        }
        if (viewEvent instanceof InterfaceC40582a.f) {
            return new AbstractC37211a.f(((InterfaceC40582a.f) viewEvent).m131583a());
        }
        if (viewEvent instanceof InterfaceC40582a.i) {
            return AbstractC37211a.h.f159069a;
        }
        if (viewEvent instanceof InterfaceC40582a.l) {
            InterfaceC40582a.l lVar = (InterfaceC40582a.l) viewEvent;
            return new AbstractC37211a.g(lVar.getTestName(), lVar.getDateTime());
        }
        if (viewEvent instanceof InterfaceC40582a.b) {
            return AbstractC37211a.a.f159061a;
        }
        if (viewEvent instanceof InterfaceC40582a.c) {
            return AbstractC37211a.b.f159062a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m131590o(InterfaceC40582a.m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C40583b(C37216f c37216f, C0805a c0805a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37216f, c0805a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

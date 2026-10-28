package zt1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
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
import tr2.InterfaceC34116n;
import xt1.C38646c;
import xt1.InterfaceC38644a;
import xt1.InterfaceC38645b;

/* JADX INFO: renamed from: zt1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lzt1/e;", "Landroidx/lifecycle/w1;", "Lxt1/c;", "interactor", "Lzt1/f;", "reducer", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "<init>", "(Lxt1/c;Lzt1/f;Ltr2/n;Lbc3/c0;)V", "Lzt1/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lzt1/d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lzt1/f;", "x", "Ltr2/n;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "viewEvents", "Lec3/l;", "Lzt1/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41130e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C41131f reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEvents;

    /* JADX INFO: renamed from: zt1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.presentation.LabradorResultsViewModel$sendViewEvent$1", m100430f = "LabradorResultsViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177314w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC41129d f177316y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC41129d interfaceC41129d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177316y = interfaceC41129d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C41130e.this.new a(this.f177316y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177314w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C41130e.this.viewEvents;
                InterfaceC41129d interfaceC41129d = this.f177316y;
                this.f177314w = 1;
                if (interfaceC13072o1.emit(interfaceC41129d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zt1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177317w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41130e f177318x;

        /* JADX INFO: renamed from: zt1.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177319w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41130e f177320x;

            /* JADX INFO: renamed from: zt1.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.presentation.LabradorResultsViewModel$special$$inlined$map$1$2", m100430f = "LabradorResultsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42772a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177321E;

                /* JADX INFO: renamed from: F */
                Object f177322F;

                /* JADX INFO: renamed from: G */
                Object f177323G;

                /* JADX INFO: renamed from: H */
                int f177324H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177325w;

                /* JADX INFO: renamed from: x */
                int f177326x;

                /* JADX INFO: renamed from: y */
                Object f177327y;

                public C42772a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177325w = obj;
                    this.f177326x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C41130e c41130e) {
                this.f177319w = interfaceC13062m;
                this.f177320x = c41130e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42772a c42772a;
                if (interfaceC30057d instanceof C42772a) {
                    c42772a = (C42772a) interfaceC30057d;
                    int i13 = c42772a.f177326x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42772a.f177326x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42772a = new C42772a(interfaceC30057d);
                    }
                } else {
                    c42772a = new C42772a(interfaceC30057d);
                }
                Object obj2 = c42772a.f177325w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42772a.f177326x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f177319w;
                    InterfaceC41128c interfaceC41128cM133540a = this.f177320x.reducer.m133540a((InterfaceC38645b) obj);
                    c42772a.f177327y = null;
                    c42772a.f177321E = null;
                    c42772a.f177322F = null;
                    c42772a.f177323G = null;
                    c42772a.f177324H = 0;
                    c42772a.f177326x = 1;
                    if (interfaceC13062m.emit(interfaceC41128cM133540a, c42772a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C41130e c41130e) {
            this.f177317w = interfaceC13058l;
            this.f177318x = c41130e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177317w.collect(new a(interfaceC13062m, this.f177318x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zt1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177329w;

        /* JADX INFO: renamed from: zt1.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177330w;

            /* JADX INFO: renamed from: zt1.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.presentation.LabradorResultsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "LabradorResultsViewModel.kt", m100431l = {60}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42773a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177331E;

                /* JADX INFO: renamed from: F */
                Object f177332F;

                /* JADX INFO: renamed from: G */
                Object f177333G;

                /* JADX INFO: renamed from: H */
                Object f177334H;

                /* JADX INFO: renamed from: I */
                int f177335I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177336w;

                /* JADX INFO: renamed from: x */
                int f177337x;

                /* JADX INFO: renamed from: y */
                Object f177338y;

                public C42773a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177336w = obj;
                    this.f177337x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f177330w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42773a c42773a;
                Object bVar;
                if (interfaceC30057d instanceof C42773a) {
                    c42773a = (C42773a) interfaceC30057d;
                    int i13 = c42773a.f177337x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42773a.f177337x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42773a = new C42773a(interfaceC30057d);
                    }
                } else {
                    c42773a = new C42773a(interfaceC30057d);
                }
                Object obj2 = c42773a.f177336w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42773a.f177337x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f177330w;
                    InterfaceC41129d interfaceC41129d = (InterfaceC41129d) obj;
                    if (AbstractC22676k.m65745e(interfaceC41129d, InterfaceC41129d.b.f177305a) || AbstractC22676k.m65745e(interfaceC41129d, InterfaceC41129d.e.f177308a) || AbstractC22676k.m65745e(interfaceC41129d, InterfaceC41129d.c.f177306a)) {
                        bVar = InterfaceC38644a.a.f166205a;
                    } else if (interfaceC41129d instanceof InterfaceC41129d.d) {
                        bVar = new InterfaceC38644a.b(((InterfaceC41129d.d) interfaceC41129d).getNextToken());
                    } else {
                        if (!(interfaceC41129d instanceof InterfaceC41129d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String nextToken = ((InterfaceC41129d.a) interfaceC41129d).getNextToken();
                        bVar = nextToken != null ? new InterfaceC38644a.b(nextToken) : null;
                    }
                    if (bVar != null) {
                        c42773a.f177338y = null;
                        c42773a.f177331E = null;
                        c42773a.f177332F = null;
                        c42773a.f177333G = null;
                        c42773a.f177334H = null;
                        c42773a.f177335I = 0;
                        c42773a.f177337x = 1;
                        if (interfaceC13062m.emit(bVar, c42773a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f177329w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177329w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zt1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.presentation.LabradorResultsViewModel$viewState$1", m100430f = "LabradorResultsViewModel.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzt1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177340w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177341x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f177341x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177341x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177340w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC41129d.c cVar = InterfaceC41129d.c.f177306a;
                this.f177341x = null;
                this.f177340w = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41130e(C38646c interactor, C41131f reducer, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.viewEvents = c13096w1M36592b;
        this.viewState = new b(AbstractC27845h.m83945a(new c(new C13015a0(new d(null), c13096w1M36592b)), interactor), this);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m133537l(InterfaceC41129d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C41130e(C38646c c38646c, C41131f c41131f, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38646c, c41131f, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EcgResultsViewModel") : interfaceC34116n, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

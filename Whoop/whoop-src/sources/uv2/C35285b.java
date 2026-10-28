package uv2;

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
import tv2.C34210c;
import tv2.C34211d;
import tv2.InterfaceC34209b;

/* JADX INFO: renamed from: uv2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Luv2/b;", "Landroidx/lifecycle/w1;", "Ltv2/d;", "interactor", "Luv2/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltv2/d;Luv2/d;Lbc3/c0;)V", "Lec3/l;", "Ltv2/b;", "Ltv2/c;", "interact", "(Lec3/l;)Lec3/l;", "Luv2/a$i;", "o", "(Luv2/a$i;)Ltv2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Luv2/a$i;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltv2/d;", "x", "Luv2/d;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "", "E", "Z", "hasFetchedData", "Luv2/c;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35285b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean hasFetchedData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34211d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C35287d reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: uv2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.presentation.LinkWorkoutViewModel$sendViewEvent$1", m100430f = "LinkWorkoutViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150226w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC35284a.i f150228y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC35284a.i iVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150228y = iVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35285b.this.new a(this.f150228y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150226w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35285b.this.eventFlow;
                InterfaceC35284a.i iVar = this.f150228y;
                this.f150226w = 1;
                if (interfaceC13072o1.emit(iVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uv2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150229w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35285b f150230x;

        /* JADX INFO: renamed from: uv2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150231w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35285b f150232x;

            /* JADX INFO: renamed from: uv2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.presentation.LinkWorkoutViewModel$special$$inlined$map$1$2", m100430f = "LinkWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42515a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150233E;

                /* JADX INFO: renamed from: F */
                Object f150234F;

                /* JADX INFO: renamed from: G */
                Object f150235G;

                /* JADX INFO: renamed from: H */
                int f150236H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150237w;

                /* JADX INFO: renamed from: x */
                int f150238x;

                /* JADX INFO: renamed from: y */
                Object f150239y;

                public C42515a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150237w = obj;
                    this.f150238x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35285b c35285b) {
                this.f150231w = interfaceC13062m;
                this.f150232x = c35285b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42515a c42515a;
                if (interfaceC30057d instanceof C42515a) {
                    c42515a = (C42515a) interfaceC30057d;
                    int i13 = c42515a.f150238x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42515a.f150238x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42515a = new C42515a(interfaceC30057d);
                    }
                } else {
                    c42515a = new C42515a(interfaceC30057d);
                }
                Object obj2 = c42515a.f150237w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42515a.f150238x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150231w;
                    InterfaceC34209b interfaceC34209bM111942o = this.f150232x.m111942o((InterfaceC35284a.i) obj);
                    c42515a.f150239y = null;
                    c42515a.f150233E = null;
                    c42515a.f150234F = null;
                    c42515a.f150235G = null;
                    c42515a.f150236H = 0;
                    c42515a.f150238x = 1;
                    if (interfaceC13062m.emit(interfaceC34209bM111942o, c42515a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35285b c35285b) {
            this.f150229w = interfaceC13058l;
            this.f150230x = c35285b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150229w.collect(new a(interfaceC13062m, this.f150230x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uv2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150241w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35285b f150242x;

        /* JADX INFO: renamed from: uv2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150243w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35285b f150244x;

            /* JADX INFO: renamed from: uv2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.presentation.LinkWorkoutViewModel$special$$inlined$map$2$2", m100430f = "LinkWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42516a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150245E;

                /* JADX INFO: renamed from: F */
                Object f150246F;

                /* JADX INFO: renamed from: G */
                Object f150247G;

                /* JADX INFO: renamed from: H */
                int f150248H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150249w;

                /* JADX INFO: renamed from: x */
                int f150250x;

                /* JADX INFO: renamed from: y */
                Object f150251y;

                public C42516a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150249w = obj;
                    this.f150250x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35285b c35285b) {
                this.f150243w = interfaceC13062m;
                this.f150244x = c35285b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42516a c42516a;
                if (interfaceC30057d instanceof C42516a) {
                    c42516a = (C42516a) interfaceC30057d;
                    int i13 = c42516a.f150250x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42516a.f150250x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42516a = new C42516a(interfaceC30057d);
                    }
                } else {
                    c42516a = new C42516a(interfaceC30057d);
                }
                Object obj2 = c42516a.f150249w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42516a.f150250x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150243w;
                    C35286c c35286cM111971b = this.f150244x.reducer.m111971b((C34210c) obj);
                    c42516a.f150251y = null;
                    c42516a.f150245E = null;
                    c42516a.f150246F = null;
                    c42516a.f150247G = null;
                    c42516a.f150248H = 0;
                    c42516a.f150250x = 1;
                    if (interfaceC13062m.emit(c35286cM111971b, c42516a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C35285b c35285b) {
            this.f150241w = interfaceC13058l;
            this.f150242x = c35285b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150241w.collect(new a(interfaceC13062m, this.f150242x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35285b(C34211d interactor, C35287d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC34209b m111942o(InterfaceC35284a.i iVar) {
        if (iVar instanceof InterfaceC35284a.b) {
            return new InterfaceC34209b.a(((InterfaceC35284a.b) iVar).getActivityId());
        }
        if (iVar instanceof InterfaceC35284a.h) {
            return new InterfaceC34209b.c(((InterfaceC35284a.h) iVar).getLinkActivityId());
        }
        if (AbstractC22676k.m65745e(iVar, InterfaceC35284a.d.f150214a)) {
            return InterfaceC34209b.b.f143500a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m111943n(InterfaceC35284a.i event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC35284a.b) {
            if (this.hasFetchedData) {
                return;
            } else {
                this.hasFetchedData = true;
            }
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C35285b(C34211d c34211d, C35287d c35287d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34211d, c35287d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

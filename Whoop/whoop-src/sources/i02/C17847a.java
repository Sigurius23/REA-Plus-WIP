package i02;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import ao2.C1876a;
import ao2.C1877b;
import b02.C2201e;
import b02.C2202f;
import b02.InterfaceC2199c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
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
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xz1.AbstractC38758c;
import xz1.C38760e;
import xz1.C38761f;

/* JADX INFO: renamed from: i02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Li02/a;", "Landroidx/lifecycle/w1;", "Lxz1/f;", "interactor", "Lb02/f;", "reducer", "Lao2/a;", "cartIndicatorRepository", "Lbc3/c0;", "coroutineScope", "<init>", "(Lxz1/f;Lb02/f;Lao2/a;Lbc3/c0;)V", "Lb02/c$m;", "Lxz1/c;", "o", "(Lb02/c$m;)Lxz1/c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lb02/c$m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lb02/f;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "pdpViewEventFlow", "Lec3/l;", "Lb02/e;", "z", "Lec3/l;", "reducedViewStateFlow", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17847a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C2202f reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 pdpViewEventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l reducedViewStateFlow;

    /* JADX INFO: renamed from: i02.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.viewmodel.PdpViewModel$sendViewEvent$1", m100430f = "PdpViewModel.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f69396w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2199c.m f69398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2199c.m mVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f69398y = mVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17847a.this.new a(this.f69398y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f69396w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17847a.this.pdpViewEventFlow;
                InterfaceC2199c.m mVar = this.f69398y;
                this.f69396w = 1;
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

    /* JADX INFO: renamed from: i02.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f69399w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17847a f69400x;

        /* JADX INFO: renamed from: i02.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f69401w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17847a f69402x;

            /* JADX INFO: renamed from: i02.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.viewmodel.PdpViewModel$special$$inlined$map$1$2", m100430f = "PdpViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41723a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f69403E;

                /* JADX INFO: renamed from: F */
                Object f69404F;

                /* JADX INFO: renamed from: G */
                Object f69405G;

                /* JADX INFO: renamed from: H */
                int f69406H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f69407w;

                /* JADX INFO: renamed from: x */
                int f69408x;

                /* JADX INFO: renamed from: y */
                Object f69409y;

                public C41723a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f69407w = obj;
                    this.f69408x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17847a c17847a) {
                this.f69401w = interfaceC13062m;
                this.f69402x = c17847a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41723a c41723a;
                if (interfaceC30057d instanceof C41723a) {
                    c41723a = (C41723a) interfaceC30057d;
                    int i13 = c41723a.f69408x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41723a.f69408x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41723a = new C41723a(interfaceC30057d);
                    }
                } else {
                    c41723a = new C41723a(interfaceC30057d);
                }
                Object obj2 = c41723a.f69407w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41723a.f69408x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f69401w;
                    AbstractC38758c abstractC38758cM51324o = this.f69402x.m51324o((InterfaceC2199c.m) obj);
                    c41723a.f69409y = null;
                    c41723a.f69403E = null;
                    c41723a.f69404F = null;
                    c41723a.f69405G = null;
                    c41723a.f69406H = 0;
                    c41723a.f69408x = 1;
                    if (interfaceC13062m.emit(abstractC38758cM51324o, c41723a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C17847a c17847a) {
            this.f69399w = interfaceC13058l;
            this.f69400x = c17847a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f69399w.collect(new a(interfaceC13062m, this.f69400x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i02.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f69411w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17847a f69412x;

        /* JADX INFO: renamed from: i02.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f69413w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17847a f69414x;

            /* JADX INFO: renamed from: i02.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.viewmodel.PdpViewModel$special$$inlined$map$2$2", m100430f = "PdpViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41724a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f69415E;

                /* JADX INFO: renamed from: F */
                Object f69416F;

                /* JADX INFO: renamed from: G */
                Object f69417G;

                /* JADX INFO: renamed from: H */
                int f69418H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f69419w;

                /* JADX INFO: renamed from: x */
                int f69420x;

                /* JADX INFO: renamed from: y */
                Object f69421y;

                public C41724a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f69419w = obj;
                    this.f69420x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17847a c17847a) {
                this.f69413w = interfaceC13062m;
                this.f69414x = c17847a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41724a c41724a;
                if (interfaceC30057d instanceof C41724a) {
                    c41724a = (C41724a) interfaceC30057d;
                    int i13 = c41724a.f69420x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41724a.f69420x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41724a = new C41724a(interfaceC30057d);
                    }
                } else {
                    c41724a = new C41724a(interfaceC30057d);
                }
                Object obj2 = c41724a.f69419w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41724a.f69420x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f69413w;
                    C2201e c2201eM7028r = this.f69414x.reducer.m7028r((C38760e) obj);
                    c41724a.f69421y = null;
                    c41724a.f69415E = null;
                    c41724a.f69416F = null;
                    c41724a.f69417G = null;
                    c41724a.f69418H = 0;
                    c41724a.f69420x = 1;
                    if (interfaceC13062m.emit(c2201eM7028r, c41724a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C17847a c17847a) {
            this.f69411w = interfaceC13058l;
            this.f69412x = c17847a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f69411w.collect(new a(interfaceC13062m, this.f69412x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i02.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.viewmodel.PdpViewModel$viewState$1", m100430f = "PdpViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lb02/e;", "viewState", "Lao2/b;", "cartIndicator", "<anonymous>", "(Lb02/e;Lao2/b;)Lb02/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f69423w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f69424x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f69425y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C2201e c2201e, C1877b c1877b, InterfaceC30057d<? super C2201e> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f69424x = c2201e;
            dVar.f69425y = c1877b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C2201e c2201e = (C2201e) this.f69424x;
            C1877b c1877b = (C1877b) this.f69425y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f69423w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C2201e.m7000b(c2201e, false, false, null, c1877b, 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17847a(C38761f interactor, C2202f reducer, C1876a cartIndicatorRepository, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.pdpViewEventFlow = c13096w1M36592b;
        c cVar = new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this);
        this.reducedViewStateFlow = cVar;
        this.viewState = AbstractC13091v.m36587M(new C13060l1(cVar, cartIndicatorRepository.getState(), new d(null), 1), coroutineScope, C13105z1.f45288a, new C2201e(true, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC38758c m51324o(InterfaceC2199c.m mVar) {
        if (mVar instanceof InterfaceC2199c.g) {
            InterfaceC2199c.g gVar = (InterfaceC2199c.g) mVar;
            return new AbstractC38758c.a(gVar.getSlug(), gVar.getSku(), gVar.getSource());
        }
        if (mVar instanceof InterfaceC2199c.k) {
            InterfaceC2199c.k kVar = (InterfaceC2199c.k) mVar;
            return new AbstractC38758c.b(kVar.getLevel(), kVar.getOptionKey(), kVar.getVariantIndex(), kVar.getPackItemId(), kVar.getPackItemProductKey());
        }
        if (mVar instanceof InterfaceC2199c.l) {
            return new AbstractC38758c.c(((InterfaceC2199c.l) mVar).getTagId());
        }
        if (!(mVar instanceof InterfaceC2199c.j)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC2199c.j jVar = (InterfaceC2199c.j) mVar;
        return new AbstractC38758c.a(jVar.getSlug(), jVar.getSku(), jVar.getSource());
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m51325n(InterfaceC2199c.m event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C17847a(C38761f c38761f, C2202f c2202f, C1876a c1876a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38761f, c2202f, c1876a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

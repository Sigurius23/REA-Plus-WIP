package mw0;

import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import jw0.AbstractC21987e;
import jw0.AbstractC21988f;
import jw0.C21989g;
import l83.C23454a0;
import li0.AbstractC24099a;
import nw0.AbstractC27201h;
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

/* JADX INFO: renamed from: mw0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lmw0/h;", "Lhj0/o;", "Ljw0/g;", "interactor", "Lmw0/j;", "viewStateReducer", "Li92/e;", "networkMonitor", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljw0/g;Lmw0/j;Li92/e;Lbc3/c0;)V", "Lec3/l;", "Ljw0/e;", "Ljw0/f;", "A", "(Lec3/l;Ljw0/g;)Lec3/l;", "Lmw0/g;", "viewEvent", "C", "(Lmw0/g;)Ljw0/e;", "Lbc3/k1;", "B", "(Lmw0/g;)Lbc3/k1;", "E", "Lmw0/j;", "", "F", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lec3/o1;", "G", "Lec3/o1;", "eventFlow", "Lmw0/i;", "H", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25980h extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C25982j viewStateReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: mw0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsViewModel$sendViewEvent$1", m100430f = "SleepDetailsViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102615w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25979g f102617y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC25979g abstractC25979g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102617y = abstractC25979g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25980h.this.new a(this.f102617y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102615w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25980h.this.eventFlow;
                AbstractC25979g abstractC25979g = this.f102617y;
                this.f102615w = 1;
                if (interfaceC13072o1.emit(abstractC25979g, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mw0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102618w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25980h f102619x;

        /* JADX INFO: renamed from: mw0.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102620w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25980h f102621x;

            /* JADX INFO: renamed from: mw0.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsViewModel$special$$inlined$map$1$2", m100430f = "SleepDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42028a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102622E;

                /* JADX INFO: renamed from: F */
                Object f102623F;

                /* JADX INFO: renamed from: G */
                Object f102624G;

                /* JADX INFO: renamed from: H */
                int f102625H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102626w;

                /* JADX INFO: renamed from: x */
                int f102627x;

                /* JADX INFO: renamed from: y */
                Object f102628y;

                public C42028a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102626w = obj;
                    this.f102627x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25980h c25980h) {
                this.f102620w = interfaceC13062m;
                this.f102621x = c25980h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42028a c42028a;
                if (interfaceC30057d instanceof C42028a) {
                    c42028a = (C42028a) interfaceC30057d;
                    int i13 = c42028a.f102627x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42028a.f102627x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42028a = new C42028a(interfaceC30057d);
                    }
                } else {
                    c42028a = new C42028a(interfaceC30057d);
                }
                Object obj2 = c42028a.f102626w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42028a.f102627x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102620w;
                    AbstractC21987e abstractC21987eM77033C = this.f102621x.m77033C((AbstractC25979g) obj);
                    c42028a.f102628y = null;
                    c42028a.f102622E = null;
                    c42028a.f102623F = null;
                    c42028a.f102624G = null;
                    c42028a.f102625H = 0;
                    c42028a.f102627x = 1;
                    if (interfaceC13062m.emit(abstractC21987eM77033C, c42028a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25980h c25980h) {
            this.f102618w = interfaceC13058l;
            this.f102619x = c25980h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102618w.collect(new a(interfaceC13062m, this.f102619x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mw0.h$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25980h f102631x;

        /* JADX INFO: renamed from: mw0.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102632w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25980h f102633x;

            /* JADX INFO: renamed from: mw0.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsViewModel$special$$inlined$map$2$2", m100430f = "SleepDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42029a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102634E;

                /* JADX INFO: renamed from: F */
                Object f102635F;

                /* JADX INFO: renamed from: G */
                Object f102636G;

                /* JADX INFO: renamed from: H */
                int f102637H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102638w;

                /* JADX INFO: renamed from: x */
                int f102639x;

                /* JADX INFO: renamed from: y */
                Object f102640y;

                public C42029a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102638w = obj;
                    this.f102639x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25980h c25980h) {
                this.f102632w = interfaceC13062m;
                this.f102633x = c25980h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42029a c42029a;
                if (interfaceC30057d instanceof C42029a) {
                    c42029a = (C42029a) interfaceC30057d;
                    int i13 = c42029a.f102639x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42029a.f102639x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42029a = new C42029a(interfaceC30057d);
                    }
                } else {
                    c42029a = new C42029a(interfaceC30057d);
                }
                Object obj2 = c42029a.f102638w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42029a.f102639x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102632w;
                    AbstractC25981i abstractC25981iM77072c = this.f102633x.viewStateReducer.m77072c((AbstractC21988f) obj);
                    c42029a.f102640y = null;
                    c42029a.f102634E = null;
                    c42029a.f102635F = null;
                    c42029a.f102636G = null;
                    c42029a.f102637H = 0;
                    c42029a.f102639x = 1;
                    if (interfaceC13062m.emit(abstractC25981iM77072c, c42029a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25980h c25980h) {
            this.f102630w = interfaceC13058l;
            this.f102631x = c25980h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102630w.collect(new a(interfaceC13062m, this.f102631x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mw0.h$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsViewModel$viewState$3", m100430f = "SleepDetailsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmw0/i;", "state", "Li92/h;", "network", "<anonymous>", "(Lmw0/i;Li92/h;)Lmw0/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102642w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102643x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102644y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC25981i abstractC25981i, AbstractC18263h abstractC18263h, InterfaceC30057d<? super AbstractC25981i> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f102643x = abstractC25981i;
            dVar.f102644y = abstractC18263h;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC25981i abstractC25981i = (AbstractC25981i) this.f102643x;
            AbstractC18263h abstractC18263h = (AbstractC18263h) this.f102644y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102642w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return !abstractC18263h.m52614a() ? AbstractC25981i.e.f102678a : abstractC25981i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25980h(C21989g interactor, C25982j viewStateReducer, InterfaceC18260e networkMonitor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.viewStateReducer = viewStateReducer;
        this.logTag = "SleepDetailsViewModel";
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = new C13060l1(AbstractC13091v.m36586L(new c(m77032A(new b(AbstractC24099a.m71009a(c13096w1M36592b, AbstractC25979g.a.f102597a), this), interactor), this), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1), networkMonitor.getNetworkFlow(), new d(null), 1);
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC13058l m77032A(InterfaceC13058l interfaceC13058l, C21989g c21989g) {
        return c21989g.m62835g(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final AbstractC21987e m77033C(AbstractC25979g viewEvent) {
        if (viewEvent instanceof AbstractC25979g.c) {
            AbstractC25979g.c cVar = (AbstractC25979g.c) viewEvent;
            return new AbstractC21987e.g(cVar.getSourceId(), cVar.getSleepIdV2());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC25979g.a.f102597a)) {
            return AbstractC21987e.d.f85163a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC25979g.b.f102598a)) {
            return new AbstractC21987e.c(AbstractC27201h.a.f108904a);
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC25979g.e.f102605a)) {
            return AbstractC21987e.b.f85161a;
        }
        if (viewEvent instanceof AbstractC25979g.i) {
            return new AbstractC21987e.e(((AbstractC25979g.i) viewEvent).getHeartRateZoneType());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC25979g.g.f102608a)) {
            return new AbstractC21987e.c(AbstractC27201h.c.f108912a);
        }
        if (viewEvent instanceof AbstractC25979g.f) {
            return new AbstractC21987e.c(new AbstractC27201h.b(null, 0, null, null, null, ((AbstractC25979g.f) viewEvent).getToSleepDetailsKeyMetricTileType(), 31, null));
        }
        if (viewEvent instanceof AbstractC25979g.h) {
            return new AbstractC21987e.f(((AbstractC25979g.h) viewEvent).getSleepMetricType());
        }
        if (!(viewEvent instanceof AbstractC25979g.d)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC25979g.d dVar = (AbstractC25979g.d) viewEvent;
        return new AbstractC21987e.a(dVar.getValueDisplay(), dVar.getUnitDisplay(), dVar.getTimeDisplay());
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC3027k1 m77037B(AbstractC25979g viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, null), 3);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C25980h(C21989g c21989g, C25982j c25982j, InterfaceC18260e interfaceC18260e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21989g, c25982j, interfaceC18260e, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

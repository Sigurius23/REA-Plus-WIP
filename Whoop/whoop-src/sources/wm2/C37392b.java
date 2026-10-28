package wm2;

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
import ec3.InterfaceC13087t1;
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
import tm2.C33954a;
import um2.AbstractC35088a;
import um2.C35089b;
import xm2.AbstractC38460a;
import xm2.AbstractC38461b;

/* JADX INFO: renamed from: wm2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lwm2/b;", "Landroidx/lifecycle/w1;", "Ltm2/a;", "mainInteractor", "Lwm2/a;", "navigationReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltm2/a;Lwm2/a;Lbc3/c0;)V", "Lec3/l;", "Lum2/a;", "interactor", "Lum2/b;", "n", "(Lec3/l;Ltm2/a;)Lec3/l;", "Lxm2/b;", "viewEvent", "Lum2/a$a;", "p", "(Lxm2/b;)Lum2/a$a;", "Ll83/a0;", "o", "(Lxm2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "y", "Lec3/t1;", "domainState", "Lxm2/a;", "z", "Lec3/l;", "l", "()Lec3/l;", "navigationEvents", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37392b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: wm2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.main.MainV2ViewModel$sendViewEvent$1", m100430f = "MainV2ViewModel.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159941w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38461b f159943y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC38461b abstractC38461b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159943y = abstractC38461b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37392b.this.new a(this.f159943y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159941w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37392b.this.eventFlow;
                AbstractC38461b abstractC38461b = this.f159943y;
                this.f159941w = 1;
                if (interfaceC13072o1.emit(abstractC38461b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wm2.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159944w;

        /* JADX INFO: renamed from: wm2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159945w;

            /* JADX INFO: renamed from: wm2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.main.MainV2ViewModel$special$$inlined$filter$1$2", m100430f = "MainV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42596a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f159947F;

                /* JADX INFO: renamed from: G */
                Object f159948G;

                /* JADX INFO: renamed from: H */
                int f159949H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159950w;

                /* JADX INFO: renamed from: x */
                int f159951x;

                /* JADX INFO: renamed from: y */
                Object f159952y;

                /* JADX INFO: renamed from: z */
                Object f159953z;

                public C42596a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159950w = obj;
                    this.f159951x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f159945w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42596a c42596a;
                if (interfaceC30057d instanceof C42596a) {
                    c42596a = (C42596a) interfaceC30057d;
                    int i13 = c42596a.f159951x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42596a.f159951x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42596a = new C42596a(interfaceC30057d);
                    }
                } else {
                    c42596a = new C42596a(interfaceC30057d);
                }
                Object obj2 = c42596a.f159950w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42596a.f159951x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159945w;
                    if (((C35089b) obj).getStravaAuthResult() != null) {
                        c42596a.f159952y = null;
                        c42596a.f159953z = null;
                        c42596a.f159947F = null;
                        c42596a.f159948G = null;
                        c42596a.f159949H = 0;
                        c42596a.f159951x = 1;
                        if (interfaceC13062m.emit(obj, c42596a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f159944w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159944w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wm2.b$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159954w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37392b f159955x;

        /* JADX INFO: renamed from: wm2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159956w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37392b f159957x;

            /* JADX INFO: renamed from: wm2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.main.MainV2ViewModel$special$$inlined$map$1$2", m100430f = "MainV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42597a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159958E;

                /* JADX INFO: renamed from: F */
                Object f159959F;

                /* JADX INFO: renamed from: G */
                Object f159960G;

                /* JADX INFO: renamed from: H */
                int f159961H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159962w;

                /* JADX INFO: renamed from: x */
                int f159963x;

                /* JADX INFO: renamed from: y */
                Object f159964y;

                public C42597a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159962w = obj;
                    this.f159963x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37392b c37392b) {
                this.f159956w = interfaceC13062m;
                this.f159957x = c37392b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42597a c42597a;
                if (interfaceC30057d instanceof C42597a) {
                    c42597a = (C42597a) interfaceC30057d;
                    int i13 = c42597a.f159963x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42597a.f159963x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42597a = new C42597a(interfaceC30057d);
                    }
                } else {
                    c42597a = new C42597a(interfaceC30057d);
                }
                Object obj2 = c42597a.f159962w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42597a.f159963x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159956w;
                    AbstractC35088a.a aVarM119744p = this.f159957x.m119744p((AbstractC38461b) obj);
                    c42597a.f159964y = null;
                    c42597a.f159958E = null;
                    c42597a.f159959F = null;
                    c42597a.f159960G = null;
                    c42597a.f159961H = 0;
                    c42597a.f159963x = 1;
                    if (interfaceC13062m.emit(aVarM119744p, c42597a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37392b c37392b) {
            this.f159954w = interfaceC13058l;
            this.f159955x = c37392b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159954w.collect(new a(interfaceC13062m, this.f159955x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wm2.b$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159966w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37391a f159967x;

        /* JADX INFO: renamed from: wm2.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159968w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37391a f159969x;

            /* JADX INFO: renamed from: wm2.b$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes10.dex */
            @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.main.MainV2ViewModel$special$$inlined$map$2$2", m100430f = "MainV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42598a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159970E;

                /* JADX INFO: renamed from: F */
                Object f159971F;

                /* JADX INFO: renamed from: G */
                Object f159972G;

                /* JADX INFO: renamed from: H */
                int f159973H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159974w;

                /* JADX INFO: renamed from: x */
                int f159975x;

                /* JADX INFO: renamed from: y */
                Object f159976y;

                public C42598a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159974w = obj;
                    this.f159975x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37391a c37391a) {
                this.f159968w = interfaceC13062m;
                this.f159969x = c37391a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42598a c42598a;
                if (interfaceC30057d instanceof C42598a) {
                    c42598a = (C42598a) interfaceC30057d;
                    int i13 = c42598a.f159975x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42598a.f159975x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42598a = new C42598a(interfaceC30057d);
                    }
                } else {
                    c42598a = new C42598a(interfaceC30057d);
                }
                Object obj2 = c42598a.f159974w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42598a.f159975x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159968w;
                    AbstractC38460a abstractC38460aM119740a = this.f159969x.m119740a((C35089b) obj);
                    c42598a.f159976y = null;
                    c42598a.f159970E = null;
                    c42598a.f159971F = null;
                    c42598a.f159972G = null;
                    c42598a.f159973H = 0;
                    c42598a.f159975x = 1;
                    if (interfaceC13062m.emit(abstractC38460aM119740a, c42598a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C37391a c37391a) {
            this.f159966w = interfaceC13058l;
            this.f159967x = c37391a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159966w.collect(new a(interfaceC13062m, this.f159967x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37392b(C33954a mainInteractor, C37391a navigationReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(mainInteractor, "mainInteractor");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m119743n(new c(c13096w1M36592b, this), mainInteractor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.navigationEvents = new d(new b(c13078q1M36586L), navigationReducer);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m119743n(InterfaceC13058l interfaceC13058l, C33954a c33954a) {
        return c33954a.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC35088a.a m119744p(AbstractC38461b viewEvent) {
        if (viewEvent instanceof AbstractC38461b.a) {
            return new AbstractC35088a.a(((AbstractC38461b.a) viewEvent).getIntentUri());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m119746o(AbstractC38461b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C37392b(C33954a c33954a, C37391a c37391a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33954a, c37391a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

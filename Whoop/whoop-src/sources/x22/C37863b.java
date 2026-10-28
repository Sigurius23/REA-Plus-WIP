package x22;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
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
import u22.AbstractC34488c;
import u22.C34489d;
import u22.C34490e;
import y22.C39166a;

/* JADX INFO: renamed from: x22.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lx22/b;", "Landroidx/lifecycle/w1;", "Lu22/e;", "interactor", "Ly22/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lu22/e;Ly22/a;Lbc3/c0;)V", "Lec3/l;", "Lu22/c;", "Lu22/d;", "interact", "(Lec3/l;)Lec3/l;", "Lx22/a$v;", "p", "(Lx22/a$v;)Lu22/c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lx22/a$v;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lu22/e;", "x", "Ly22/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lx22/c;", "F", "getViewState", "()Lec3/l;", "viewState", "Lx22/a$n;", "G", "n", "navigationEvents", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37863b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34490e interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C39166a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: x22.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.presentation.PaymentMethodManagementViewModel$sendViewEvent$1", m100430f = "PaymentMethodManagementViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f162115w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC37862a.v f162117y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC37862a.v vVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f162117y = vVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37863b.this.new a(this.f162117y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162115w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37863b.this.eventFlow;
                InterfaceC37862a.v vVar = this.f162117y;
                this.f162115w = 1;
                if (interfaceC13072o1.emit(vVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: x22.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f162118w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37863b f162119x;

        /* JADX INFO: renamed from: x22.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f162120w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37863b f162121x;

            /* JADX INFO: renamed from: x22.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.presentation.PaymentMethodManagementViewModel$special$$inlined$map$1$2", m100430f = "PaymentMethodManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42617a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f162122E;

                /* JADX INFO: renamed from: F */
                Object f162123F;

                /* JADX INFO: renamed from: G */
                Object f162124G;

                /* JADX INFO: renamed from: H */
                int f162125H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f162126w;

                /* JADX INFO: renamed from: x */
                int f162127x;

                /* JADX INFO: renamed from: y */
                Object f162128y;

                public C42617a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f162126w = obj;
                    this.f162127x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37863b c37863b) {
                this.f162120w = interfaceC13062m;
                this.f162121x = c37863b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42617a c42617a;
                if (interfaceC30057d instanceof C42617a) {
                    c42617a = (C42617a) interfaceC30057d;
                    int i13 = c42617a.f162127x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42617a.f162127x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42617a = new C42617a(interfaceC30057d);
                    }
                } else {
                    c42617a = new C42617a(interfaceC30057d);
                }
                Object obj2 = c42617a.f162126w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42617a.f162127x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f162120w;
                    AbstractC34488c abstractC34488cM121421p = this.f162121x.m121421p((InterfaceC37862a.v) obj);
                    c42617a.f162128y = null;
                    c42617a.f162122E = null;
                    c42617a.f162123F = null;
                    c42617a.f162124G = null;
                    c42617a.f162125H = 0;
                    c42617a.f162127x = 1;
                    if (interfaceC13062m.emit(abstractC34488cM121421p, c42617a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37863b c37863b) {
            this.f162118w = interfaceC13058l;
            this.f162119x = c37863b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f162118w.collect(new a(interfaceC13062m, this.f162119x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: x22.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f162130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37863b f162131x;

        /* JADX INFO: renamed from: x22.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f162132w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37863b f162133x;

            /* JADX INFO: renamed from: x22.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.presentation.PaymentMethodManagementViewModel$special$$inlined$map$2$2", m100430f = "PaymentMethodManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42618a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f162134E;

                /* JADX INFO: renamed from: F */
                Object f162135F;

                /* JADX INFO: renamed from: G */
                Object f162136G;

                /* JADX INFO: renamed from: H */
                int f162137H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f162138w;

                /* JADX INFO: renamed from: x */
                int f162139x;

                /* JADX INFO: renamed from: y */
                Object f162140y;

                public C42618a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f162138w = obj;
                    this.f162139x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37863b c37863b) {
                this.f162132w = interfaceC13062m;
                this.f162133x = c37863b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42618a c42618a;
                if (interfaceC30057d instanceof C42618a) {
                    c42618a = (C42618a) interfaceC30057d;
                    int i13 = c42618a.f162139x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42618a.f162139x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42618a = new C42618a(interfaceC30057d);
                    }
                } else {
                    c42618a = new C42618a(interfaceC30057d);
                }
                Object obj2 = c42618a.f162138w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42618a.f162139x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f162132w;
                    C37864c c37864cM124748a = this.f162133x.reducer.m124748a((C34489d) obj);
                    c42618a.f162140y = null;
                    c42618a.f162134E = null;
                    c42618a.f162135F = null;
                    c42618a.f162136G = null;
                    c42618a.f162137H = 0;
                    c42618a.f162139x = 1;
                    if (interfaceC13062m.emit(c37864cM124748a, c42618a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37863b c37863b) {
            this.f162130w = interfaceC13058l;
            this.f162131x = c37863b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f162130w.collect(new a(interfaceC13062m, this.f162131x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: x22.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f162142w;

        /* JADX INFO: renamed from: x22.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f162143w;

            /* JADX INFO: renamed from: x22.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.presentation.PaymentMethodManagementViewModel$special$$inlined$mapNotNull$1$2", m100430f = "PaymentMethodManagementViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42619a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f162144E;

                /* JADX INFO: renamed from: F */
                Object f162145F;

                /* JADX INFO: renamed from: G */
                Object f162146G;

                /* JADX INFO: renamed from: H */
                Object f162147H;

                /* JADX INFO: renamed from: I */
                int f162148I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f162149w;

                /* JADX INFO: renamed from: x */
                int f162150x;

                /* JADX INFO: renamed from: y */
                Object f162151y;

                public C42619a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f162149w = obj;
                    this.f162150x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f162143w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42619a c42619a;
                if (interfaceC30057d instanceof C42619a) {
                    c42619a = (C42619a) interfaceC30057d;
                    int i13 = c42619a.f162150x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42619a.f162150x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42619a = new C42619a(interfaceC30057d);
                    }
                } else {
                    c42619a = new C42619a(interfaceC30057d);
                }
                Object obj2 = c42619a.f162149w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42619a.f162150x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f162143w;
                    InterfaceC37862a interfaceC37862a = ((C34489d) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC37862a.n nVar = interfaceC37862a instanceof InterfaceC37862a.n ? (InterfaceC37862a.n) interfaceC37862a : null;
                    if (nVar != null) {
                        c42619a.f162151y = null;
                        c42619a.f162144E = null;
                        c42619a.f162145F = null;
                        c42619a.f162146G = null;
                        c42619a.f162147H = null;
                        c42619a.f162148I = 0;
                        c42619a.f162150x = 1;
                        if (interfaceC13062m.emit(nVar, c42619a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f162142w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f162142w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37863b(C34490e interactor, C39166a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC34488c m121421p(InterfaceC37862a.v vVar) {
        if (vVar instanceof InterfaceC37862a.t) {
            return AbstractC34488c.g.f144880a;
        }
        if (vVar instanceof InterfaceC37862a.o) {
            return AbstractC34488c.d.f144875a;
        }
        if (vVar instanceof InterfaceC37862a.g) {
            return AbstractC34488c.c.f144874a;
        }
        if (vVar instanceof InterfaceC37862a.e) {
            return AbstractC34488c.b.f144873a;
        }
        if (vVar instanceof InterfaceC37862a.s) {
            return new AbstractC34488c.f(((InterfaceC37862a.s) vVar).getAction());
        }
        if (vVar instanceof InterfaceC37862a.r) {
            InterfaceC37862a.r rVar = (InterfaceC37862a.r) vVar;
            return new AbstractC34488c.e(rVar.getPaymentMethodId(), rVar.getPostalCode(), rVar.getScreenName());
        }
        if (vVar instanceof InterfaceC37862a.u) {
            return AbstractC34488c.h.f144881a;
        }
        if (vVar instanceof InterfaceC37862a.d) {
            return new AbstractC34488c.a(((InterfaceC37862a.d) vVar).getPaymentMethodId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m121423o(InterfaceC37862a.v event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C37863b(C34490e c34490e, C39166a c39166a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34490e, c39166a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

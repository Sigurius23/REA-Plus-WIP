package qc0;

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
import nc0.AbstractC26564b;
import nc0.C26565c;
import nc0.C26566d;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rc0.C31232a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: qc0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lqc0/b;", "Landroidx/lifecycle/w1;", "Lnc0/d;", "interactor", "Lrc0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lnc0/d;Lrc0/a;Lbc3/c0;)V", "Lec3/l;", "Lnc0/b;", "Lnc0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lqc0/a$k;", "p", "(Lqc0/a$k;)Lnc0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lqc0/a$k;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lnc0/d;", "x", "Lrc0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lqc0/c;", "F", "getViewState", "()Lec3/l;", "viewState", "Lqc0/a$f;", "G", "n", "navigationEvents", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30215b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C26566d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31232a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: qc0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.presentation.MarketingConsentViewModel$sendViewEvent$1", m100430f = "MarketingConsentViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123691w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30214a.k f123693y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30214a.k kVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f123693y = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30215b.this.new a(this.f123693y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123691w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30215b.this.eventFlow;
                InterfaceC30214a.k kVar = this.f123693y;
                this.f123691w = 1;
                if (interfaceC13072o1.emit(kVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qc0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f123694w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30215b f123695x;

        /* JADX INFO: renamed from: qc0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f123696w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30215b f123697x;

            /* JADX INFO: renamed from: qc0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.presentation.MarketingConsentViewModel$special$$inlined$map$1$2", m100430f = "MarketingConsentViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42215a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f123698E;

                /* JADX INFO: renamed from: F */
                Object f123699F;

                /* JADX INFO: renamed from: G */
                Object f123700G;

                /* JADX INFO: renamed from: H */
                int f123701H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f123702w;

                /* JADX INFO: renamed from: x */
                int f123703x;

                /* JADX INFO: renamed from: y */
                Object f123704y;

                public C42215a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f123702w = obj;
                    this.f123703x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30215b c30215b) {
                this.f123696w = interfaceC13062m;
                this.f123697x = c30215b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42215a c42215a;
                if (interfaceC30057d instanceof C42215a) {
                    c42215a = (C42215a) interfaceC30057d;
                    int i13 = c42215a.f123703x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42215a.f123703x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42215a = new C42215a(interfaceC30057d);
                    }
                } else {
                    c42215a = new C42215a(interfaceC30057d);
                }
                Object obj2 = c42215a.f123702w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42215a.f123703x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f123696w;
                    AbstractC26564b abstractC26564bM92451p = this.f123697x.m92451p((InterfaceC30214a.k) obj);
                    c42215a.f123704y = null;
                    c42215a.f123698E = null;
                    c42215a.f123699F = null;
                    c42215a.f123700G = null;
                    c42215a.f123701H = 0;
                    c42215a.f123703x = 1;
                    if (interfaceC13062m.emit(abstractC26564bM92451p, c42215a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C30215b c30215b) {
            this.f123694w = interfaceC13058l;
            this.f123695x = c30215b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f123694w.collect(new a(interfaceC13062m, this.f123695x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qc0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f123706w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30215b f123707x;

        /* JADX INFO: renamed from: qc0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f123708w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30215b f123709x;

            /* JADX INFO: renamed from: qc0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.presentation.MarketingConsentViewModel$special$$inlined$map$2$2", m100430f = "MarketingConsentViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42216a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f123710E;

                /* JADX INFO: renamed from: F */
                Object f123711F;

                /* JADX INFO: renamed from: G */
                Object f123712G;

                /* JADX INFO: renamed from: H */
                int f123713H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f123714w;

                /* JADX INFO: renamed from: x */
                int f123715x;

                /* JADX INFO: renamed from: y */
                Object f123716y;

                public C42216a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f123714w = obj;
                    this.f123715x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30215b c30215b) {
                this.f123708w = interfaceC13062m;
                this.f123709x = c30215b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42216a c42216a;
                if (interfaceC30057d instanceof C42216a) {
                    c42216a = (C42216a) interfaceC30057d;
                    int i13 = c42216a.f123715x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42216a.f123715x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42216a = new C42216a(interfaceC30057d);
                    }
                } else {
                    c42216a = new C42216a(interfaceC30057d);
                }
                Object obj2 = c42216a.f123714w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42216a.f123715x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f123708w;
                    C30216c c30216cM96172a = this.f123709x.reducer.m96172a((C26565c) obj);
                    c42216a.f123716y = null;
                    c42216a.f123710E = null;
                    c42216a.f123711F = null;
                    c42216a.f123712G = null;
                    c42216a.f123713H = 0;
                    c42216a.f123715x = 1;
                    if (interfaceC13062m.emit(c30216cM96172a, c42216a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C30215b c30215b) {
            this.f123706w = interfaceC13058l;
            this.f123707x = c30215b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f123706w.collect(new a(interfaceC13062m, this.f123707x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qc0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f123718w;

        /* JADX INFO: renamed from: qc0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f123719w;

            /* JADX INFO: renamed from: qc0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.presentation.MarketingConsentViewModel$special$$inlined$mapNotNull$1$2", m100430f = "MarketingConsentViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42217a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f123720E;

                /* JADX INFO: renamed from: F */
                Object f123721F;

                /* JADX INFO: renamed from: G */
                Object f123722G;

                /* JADX INFO: renamed from: H */
                Object f123723H;

                /* JADX INFO: renamed from: I */
                int f123724I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f123725w;

                /* JADX INFO: renamed from: x */
                int f123726x;

                /* JADX INFO: renamed from: y */
                Object f123727y;

                public C42217a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f123725w = obj;
                    this.f123726x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f123719w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42217a c42217a;
                if (interfaceC30057d instanceof C42217a) {
                    c42217a = (C42217a) interfaceC30057d;
                    int i13 = c42217a.f123726x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42217a.f123726x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42217a = new C42217a(interfaceC30057d);
                    }
                } else {
                    c42217a = new C42217a(interfaceC30057d);
                }
                Object obj2 = c42217a.f123725w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42217a.f123726x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f123719w;
                    InterfaceC30214a interfaceC30214a = ((C26565c) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC30214a.f fVar = interfaceC30214a instanceof InterfaceC30214a.f ? (InterfaceC30214a.f) interfaceC30214a : null;
                    if (fVar != null) {
                        c42217a.f123727y = null;
                        c42217a.f123720E = null;
                        c42217a.f123721F = null;
                        c42217a.f123722G = null;
                        c42217a.f123723H = null;
                        c42217a.f123724I = 0;
                        c42217a.f123726x = 1;
                        if (interfaceC13062m.emit(fVar, c42217a) == enumC31071a) {
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
            this.f123718w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f123718w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30215b(C26566d interactor, C31232a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC26564b m92451p(InterfaceC30214a.k kVar) {
        if (kVar instanceof InterfaceC30214a.i) {
            return AbstractC26564b.e.f105586a;
        }
        if (kVar instanceof InterfaceC30214a.g) {
            return new AbstractC26564b.c(((InterfaceC30214a.g) kVar).getAction());
        }
        if (kVar instanceof InterfaceC30214a.h) {
            return new AbstractC26564b.d(((InterfaceC30214a.h) kVar).getModal());
        }
        if (kVar instanceof InterfaceC30214a.c) {
            return AbstractC26564b.b.f105582a;
        }
        if (kVar instanceof InterfaceC30214a.j) {
            return new AbstractC26564b.f(((InterfaceC30214a.j) kVar).getIsEnabled());
        }
        if (kVar instanceof InterfaceC30214a.b) {
            return new AbstractC26564b.a(((InterfaceC30214a.b) kVar).getClickAction());
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
    public final void m92453o(InterfaceC30214a.k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C30215b(C26566d c26566d, C31232a c31232a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26566d, c31232a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

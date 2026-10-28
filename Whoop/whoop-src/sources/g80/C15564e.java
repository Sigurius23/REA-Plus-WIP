package g80;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e70.C12798a;
import e70.C12799b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import f70.C14180g;
import f70.C14182h;
import f70.InterfaceC14173d;
import h80.C17003c;
import i80.C18212c;
import i80.C18213d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j80.InterfaceC21413a;
import j80.InterfaceC21414b;
import j80.InterfaceC21415c;
import j80.InterfaceC21416d;
import l83.C23454a0;
import m70.C25190d;
import m70.InterfaceC25187a;
import o70.AbstractC27630d;
import o70.C27627a;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: g80.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/0*8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002070*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010-R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010(R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010-R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010-R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020C0*8\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u00102R\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020G0*8\u0006¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bI\u00102¨\u0006K"}, m65681d2 = {"Lg80/e;", "Landroidx/lifecycle/w1;", "Lf70/h;", "activationInteractor", "Lm70/d;", "paymentsInteractor", "Lo70/a;", "privacyConsentInteractor", "Le70/b;", "combiner", "Lg80/a;", "eventConverter", "Lh80/c;", "analyticsHelper", "Li80/d;", "reducer", "Li80/c;", "navigationReducer", "Lf70/g;", "activationFeatureFlagFetcher", "Lbc3/c0;", "coroutineScope", "<init>", "(Lf70/h;Lm70/d;Lo70/a;Le70/b;Lg80/a;Lh80/c;Li80/d;Li80/c;Lf70/g;Lbc3/c0;)V", "Lj80/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Lj80/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Li80/d;", "x", "Li80/c;", "y", "Lf70/g;", "z", "Lbc3/c0;", "Lec3/o1;", "Lj80/a;", "E", "Lec3/o1;", "activationEventFlow", "Lec3/l;", "Lf70/e;", "F", "Lec3/l;", "activationDomainResult", "Lh80/c$a;", "G", "p", "()Lec3/l;", "analyticsScreenNameFlow", "Lj80/c;", "H", "paymentsEventFlow", "Lm70/b;", "I", "paymentsDomainResult", "Lj80/d;", "J", "privacyEventFlow", "Lo70/c;", "K", "privacyDomainResult", "Le70/a;", "L", "combinedDomainResult", "Lg80/f;", "M", "getViewState", "viewState", "Ll80/o;", "N", "q", "navigationState", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15564e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 activationEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l activationDomainResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l analyticsScreenNameFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13072o1 paymentsEventFlow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l paymentsDomainResult;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13072o1 privacyEventFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13058l privacyDomainResult;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13058l combinedDomainResult;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l navigationState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C18213d reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C18212c navigationReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C14180g activationFeatureFlagFetcher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: g80.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$activationDomainResult$2", m100430f = "ActivationViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lf70/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f58410w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15564e.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f58410w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C15564e.this.activationFeatureFlagFetcher.m40450c();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g80.e$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$sendViewEvent$1", m100430f = "ActivationViewModel.kt", m100431l = {79, 80, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f58412w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21414b f58413x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15564e f58414y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC21414b interfaceC21414b, C15564e c15564e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58413x = interfaceC21414b;
            this.f58414y = c15564e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f58413x, this.f58414y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f58412w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L18
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L60
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                j80.b r6 = r5.f58413x
                boolean r1 = r6 instanceof j80.InterfaceC21413a
                if (r1 == 0) goto L36
                g80.e r6 = r5.f58414y
                ec3.o1 r6 = g80.C15564e.m43823g(r6)
                j80.b r1 = r5.f58413x
                r5.f58412w = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L60
                goto L5f
            L36:
                boolean r1 = r6 instanceof j80.InterfaceC21415c
                if (r1 == 0) goto L4b
                g80.e r6 = r5.f58414y
                ec3.o1 r6 = g80.C15564e.m43825l(r6)
                j80.b r1 = r5.f58413x
                r5.f58412w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L60
                goto L5f
            L4b:
                boolean r6 = r6 instanceof j80.InterfaceC21416d
                if (r6 == 0) goto L63
                g80.e r6 = r5.f58414y
                ec3.o1 r6 = g80.C15564e.m43826n(r6)
                j80.b r1 = r5.f58413x
                r5.f58412w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            L63:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g80.C15564e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: g80.e$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f58415w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15560a f58416x;

        /* JADX INFO: renamed from: g80.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f58417w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15560a f58418x;

            /* JADX INFO: renamed from: g80.e$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$special$$inlined$map$1$2", m100430f = "ActivationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41626a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f58419E;

                /* JADX INFO: renamed from: F */
                Object f58420F;

                /* JADX INFO: renamed from: G */
                Object f58421G;

                /* JADX INFO: renamed from: H */
                int f58422H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f58423w;

                /* JADX INFO: renamed from: x */
                int f58424x;

                /* JADX INFO: renamed from: y */
                Object f58425y;

                public C41626a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f58423w = obj;
                    this.f58424x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15560a c15560a) {
                this.f58417w = interfaceC13062m;
                this.f58418x = c15560a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41626a c41626a;
                if (interfaceC30057d instanceof C41626a) {
                    c41626a = (C41626a) interfaceC30057d;
                    int i13 = c41626a.f58424x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41626a.f58424x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41626a = new C41626a(interfaceC30057d);
                    }
                } else {
                    c41626a = new C41626a(interfaceC30057d);
                }
                Object obj2 = c41626a.f58423w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41626a.f58424x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f58417w;
                    InterfaceC14173d interfaceC14173dM43811a = this.f58418x.m43811a((InterfaceC21413a) obj);
                    c41626a.f58425y = null;
                    c41626a.f58419E = null;
                    c41626a.f58420F = null;
                    c41626a.f58421G = null;
                    c41626a.f58422H = 0;
                    c41626a.f58424x = 1;
                    if (interfaceC13062m.emit(interfaceC14173dM43811a, c41626a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C15560a c15560a) {
            this.f58415w = interfaceC13058l;
            this.f58416x = c15560a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f58415w.collect(new a(interfaceC13062m, this.f58416x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g80.e$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f58427w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15560a f58428x;

        /* JADX INFO: renamed from: g80.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f58429w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15560a f58430x;

            /* JADX INFO: renamed from: g80.e$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$special$$inlined$map$2$2", m100430f = "ActivationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41627a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f58431E;

                /* JADX INFO: renamed from: F */
                Object f58432F;

                /* JADX INFO: renamed from: G */
                Object f58433G;

                /* JADX INFO: renamed from: H */
                int f58434H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f58435w;

                /* JADX INFO: renamed from: x */
                int f58436x;

                /* JADX INFO: renamed from: y */
                Object f58437y;

                public C41627a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f58435w = obj;
                    this.f58436x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15560a c15560a) {
                this.f58429w = interfaceC13062m;
                this.f58430x = c15560a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41627a c41627a;
                if (interfaceC30057d instanceof C41627a) {
                    c41627a = (C41627a) interfaceC30057d;
                    int i13 = c41627a.f58436x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41627a.f58436x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41627a = new C41627a(interfaceC30057d);
                    }
                } else {
                    c41627a = new C41627a(interfaceC30057d);
                }
                Object obj2 = c41627a.f58435w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41627a.f58436x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f58429w;
                    InterfaceC25187a interfaceC25187aM43812b = this.f58430x.m43812b((InterfaceC21415c) obj);
                    c41627a.f58437y = null;
                    c41627a.f58431E = null;
                    c41627a.f58432F = null;
                    c41627a.f58433G = null;
                    c41627a.f58434H = 0;
                    c41627a.f58436x = 1;
                    if (interfaceC13062m.emit(interfaceC25187aM43812b, c41627a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C15560a c15560a) {
            this.f58427w = interfaceC13058l;
            this.f58428x = c15560a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f58427w.collect(new a(interfaceC13062m, this.f58428x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g80.e$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f58439w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15560a f58440x;

        /* JADX INFO: renamed from: g80.e$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f58441w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15560a f58442x;

            /* JADX INFO: renamed from: g80.e$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$special$$inlined$map$3$2", m100430f = "ActivationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41628a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f58443E;

                /* JADX INFO: renamed from: F */
                Object f58444F;

                /* JADX INFO: renamed from: G */
                Object f58445G;

                /* JADX INFO: renamed from: H */
                int f58446H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f58447w;

                /* JADX INFO: renamed from: x */
                int f58448x;

                /* JADX INFO: renamed from: y */
                Object f58449y;

                public C41628a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f58447w = obj;
                    this.f58448x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15560a c15560a) {
                this.f58441w = interfaceC13062m;
                this.f58442x = c15560a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41628a c41628a;
                if (interfaceC30057d instanceof C41628a) {
                    c41628a = (C41628a) interfaceC30057d;
                    int i13 = c41628a.f58448x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41628a.f58448x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41628a = new C41628a(interfaceC30057d);
                    }
                } else {
                    c41628a = new C41628a(interfaceC30057d);
                }
                Object obj2 = c41628a.f58447w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41628a.f58448x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f58441w;
                    AbstractC27630d abstractC27630dM43813c = this.f58442x.m43813c((InterfaceC21416d) obj);
                    c41628a.f58449y = null;
                    c41628a.f58443E = null;
                    c41628a.f58444F = null;
                    c41628a.f58445G = null;
                    c41628a.f58446H = 0;
                    c41628a.f58448x = 1;
                    if (interfaceC13062m.emit(abstractC27630dM43813c, c41628a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C15560a c15560a) {
            this.f58439w = interfaceC13058l;
            this.f58440x = c15560a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f58439w.collect(new a(interfaceC13062m, this.f58440x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g80.e$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f58451w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15564e f58452x;

        /* JADX INFO: renamed from: g80.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f58453w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15564e f58454x;

            /* JADX INFO: renamed from: g80.e$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.ActivationViewModel$special$$inlined$map$4$2", m100430f = "ActivationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41629a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f58455E;

                /* JADX INFO: renamed from: F */
                Object f58456F;

                /* JADX INFO: renamed from: G */
                Object f58457G;

                /* JADX INFO: renamed from: H */
                int f58458H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f58459w;

                /* JADX INFO: renamed from: x */
                int f58460x;

                /* JADX INFO: renamed from: y */
                Object f58461y;

                public C41629a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f58459w = obj;
                    this.f58460x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15564e c15564e) {
                this.f58453w = interfaceC13062m;
                this.f58454x = c15564e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41629a c41629a;
                if (interfaceC30057d instanceof C41629a) {
                    c41629a = (C41629a) interfaceC30057d;
                    int i13 = c41629a.f58460x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41629a.f58460x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41629a = new C41629a(interfaceC30057d);
                    }
                } else {
                    c41629a = new C41629a(interfaceC30057d);
                }
                Object obj2 = c41629a.f58459w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41629a.f58460x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f58453w;
                    C15565f c15565fM52389c = this.f58454x.reducer.m52389c((C12798a) obj);
                    c41629a.f58461y = null;
                    c41629a.f58455E = null;
                    c41629a.f58456F = null;
                    c41629a.f58457G = null;
                    c41629a.f58458H = 0;
                    c41629a.f58460x = 1;
                    if (interfaceC13062m.emit(c15565fM52389c, c41629a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C15564e c15564e) {
            this.f58451w = interfaceC13058l;
            this.f58452x = c15564e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f58451w.collect(new a(interfaceC13062m, this.f58452x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15564e(C14182h activationInteractor, C25190d paymentsInteractor, C27627a privacyConsentInteractor, C12799b combiner, C15560a eventConverter, C17003c analyticsHelper, C18213d reducer, C18212c navigationReducer, C14180g activationFeatureFlagFetcher, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(activationInteractor, "activationInteractor");
        AbstractC22676k.m65750j(paymentsInteractor, "paymentsInteractor");
        AbstractC22676k.m65750j(privacyConsentInteractor, "privacyConsentInteractor");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(eventConverter, "eventConverter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(activationFeatureFlagFetcher, "activationFeatureFlagFetcher");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.navigationReducer = navigationReducer;
        this.activationFeatureFlagFetcher = activationFeatureFlagFetcher;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.activationEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new c(c13096w1M36592b, eventConverter), activationInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13015a0 c13015a0 = new C13015a0(new a(null), AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1));
        this.activationDomainResult = c13015a0;
        this.analyticsScreenNameFlow = analyticsHelper.m47940o(c13015a0);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.paymentsEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM83945a2 = AbstractC27845h.m83945a(new d(c13096w1M36592b2, eventConverter), paymentsInteractor);
        this.paymentsDomainResult = interfaceC13058lM83945a2;
        C13096w1 c13096w1M36592b3 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.privacyEventFlow = c13096w1M36592b3;
        InterfaceC13058l interfaceC13058lM83945a3 = AbstractC27845h.m83945a(new e(c13096w1M36592b3, eventConverter), privacyConsentInteractor);
        this.privacyDomainResult = interfaceC13058lM83945a3;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(combiner.m35838a(c13015a0, interfaceC13058lM83945a2, interfaceC13058lM83945a3), coroutineScope, c13021b2, 1);
        this.combinedDomainResult = c13078q1M36586L;
        this.viewState = new f(c13078q1M36586L, this);
        this.navigationState = navigationReducer.m52378d(c13078q1M36586L);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13058l getAnalyticsScreenNameFlow() {
        return this.analyticsScreenNameFlow;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC13058l getNavigationState() {
        return this.navigationState;
    }

    /* JADX INFO: renamed from: r */
    public final void m43830r(InterfaceC21414b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, this, null), 3);
    }

    public /* synthetic */ C15564e(C14182h c14182h, C25190d c25190d, C27627a c27627a, C12799b c12799b, C15560a c15560a, C17003c c17003c, C18213d c18213d, C18212c c18212c, C14180g c14180g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14182h, c25190d, c27627a, c12799b, c15560a, c17003c, c18213d, c18212c, c14180g, (i13 & 512) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

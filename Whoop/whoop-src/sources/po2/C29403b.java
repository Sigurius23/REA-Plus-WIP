package po2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.whoop.universalcheckout.features.checkout.exceptions.ProcessCheckoutException;
import com.whoop.universalcheckout.features.checkout.exceptions.ZeroDollarPaymentException;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import h20.AbstractC16632b4;
import h20.C16626a4;
import h20.C16633c;
import h20.C16769y3;
import h20.C16775z3;
import h20.InterfaceC16645e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jo2.C21842e;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ko2.AbstractC22652b;
import ko2.C22654d;
import l83.C23454a0;
import lo2.C24620b;
import lo2.C24621c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q20.C29814e;
import q83.InterfaceC30057d;
import qo2.C30528a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y00.C38915o4;

/* JADX INFO: renamed from: po2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=088\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010@¨\u0006B"}, m65681d2 = {"Lpo2/b;", "Landroidx/lifecycle/w1;", "Lko2/d;", "interactor", "Ljo2/e;", "stripeFlowControllerManager", "Lqo2/a;", "reducer", "Llo2/c;", "combiner", "Lbc3/c0;", "coroutineScope", "<init>", "(Lko2/d;Ljo2/e;Lqo2/a;Llo2/c;Lbc3/c0;)V", "Lpo2/a$n0;", "Lko2/b;", "t", "(Lpo2/a$n0;)Lko2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Lpo2/a$n0;)V", "Lq20/e;", "paymentOption", "p", "(Lq20/e;)V", "Lh20/b4;", "paymentSheetResult", "q", "(Lh20/b4;)V", "Ly00/o4;", "paymentMethod", "", "shouldSavePaymentMethod", "Lh20/e;", "o", "(Ly00/o4;ZLq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lko2/d;", "x", "Ljo2/e;", "y", "Lqo2/a;", "z", "Llo2/c;", "E", "Lbc3/c0;", "Lec3/o1;", "F", "Lec3/o1;", "universalCheckoutScreenEventFlow", "Lec3/t1;", "Lko2/c;", "G", "Lec3/t1;", "universalCheckoutScreenDomainResult", "Lec3/l;", "Llo2/b;", "H", "Lec3/l;", "combinedDomainResult", "Lpo2/c;", "I", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29403b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 universalCheckoutScreenEventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 universalCheckoutScreenDomainResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l combinedDomainResult;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C22654d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C21842e stripeFlowControllerManager;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30528a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C24621c combiner;

    /* JADX INFO: renamed from: po2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.presentation.UniversalCheckoutViewModel$createAndConfirmIntent$2", m100430f = "UniversalCheckoutViewModel.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lh20/e;", "<anonymous>", "(Lbc3/c0;)Lh20/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C29403b f119370E;

        /* JADX INFO: renamed from: w */
        Object f119371w;

        /* JADX INFO: renamed from: x */
        int f119372x;

        /* JADX INFO: renamed from: y */
        int f119373y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38915o4 f119374z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38915o4 c38915o4, C29403b c29403b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119374z = c38915o4;
            this.f119370E = c29403b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f119374z, this.f119370E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC16645e> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119373y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f119374z.f167527w;
                if (str != null) {
                    C21842e c21842e = this.f119370E.stripeFlowControllerManager;
                    this.f119371w = null;
                    this.f119372x = 0;
                    this.f119373y = 1;
                    obj = c21842e.m61816e(str, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return new C16633c(new RuntimeException(), null);
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC16645e interfaceC16645e = (InterfaceC16645e) obj;
            if (interfaceC16645e != null) {
                return interfaceC16645e;
            }
            return new C16633c(new RuntimeException(), null);
        }
    }

    /* JADX INFO: renamed from: po2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.presentation.UniversalCheckoutViewModel$sendViewEvent$1", m100430f = "UniversalCheckoutViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119375w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29402a.n0 f119377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC29402a.n0 n0Var, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119377y = n0Var;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29403b.this.new b(this.f119377y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119375w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29403b.this.universalCheckoutScreenEventFlow;
                InterfaceC29402a.n0 n0Var = this.f119377y;
                this.f119375w = 1;
                if (interfaceC13072o1.emit(n0Var, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: po2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119378w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29403b f119379x;

        /* JADX INFO: renamed from: po2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119380w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29403b f119381x;

            /* JADX INFO: renamed from: po2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.presentation.UniversalCheckoutViewModel$special$$inlined$map$1$2", m100430f = "UniversalCheckoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42179a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119382E;

                /* JADX INFO: renamed from: F */
                Object f119383F;

                /* JADX INFO: renamed from: G */
                Object f119384G;

                /* JADX INFO: renamed from: H */
                int f119385H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119386w;

                /* JADX INFO: renamed from: x */
                int f119387x;

                /* JADX INFO: renamed from: y */
                Object f119388y;

                public C42179a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119386w = obj;
                    this.f119387x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29403b c29403b) {
                this.f119380w = interfaceC13062m;
                this.f119381x = c29403b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42179a c42179a;
                if (interfaceC30057d instanceof C42179a) {
                    c42179a = (C42179a) interfaceC30057d;
                    int i13 = c42179a.f119387x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42179a.f119387x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42179a = new C42179a(interfaceC30057d);
                    }
                } else {
                    c42179a = new C42179a(interfaceC30057d);
                }
                Object obj2 = c42179a.f119386w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42179a.f119387x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119380w;
                    AbstractC22652b abstractC22652bM89651t = this.f119381x.m89651t((InterfaceC29402a.n0) obj);
                    c42179a.f119388y = null;
                    c42179a.f119382E = null;
                    c42179a.f119383F = null;
                    c42179a.f119384G = null;
                    c42179a.f119385H = 0;
                    c42179a.f119387x = 1;
                    if (interfaceC13062m.emit(abstractC22652bM89651t, c42179a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29403b c29403b) {
            this.f119378w = interfaceC13058l;
            this.f119379x = c29403b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119378w.collect(new a(interfaceC13062m, this.f119379x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: po2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119390w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29403b f119391x;

        /* JADX INFO: renamed from: po2.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119392w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29403b f119393x;

            /* JADX INFO: renamed from: po2.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.presentation.UniversalCheckoutViewModel$special$$inlined$map$2$2", m100430f = "UniversalCheckoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42180a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119394E;

                /* JADX INFO: renamed from: F */
                Object f119395F;

                /* JADX INFO: renamed from: G */
                Object f119396G;

                /* JADX INFO: renamed from: H */
                int f119397H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119398w;

                /* JADX INFO: renamed from: x */
                int f119399x;

                /* JADX INFO: renamed from: y */
                Object f119400y;

                public C42180a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119398w = obj;
                    this.f119399x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29403b c29403b) {
                this.f119392w = interfaceC13062m;
                this.f119393x = c29403b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42180a c42180a;
                if (interfaceC30057d instanceof C42180a) {
                    c42180a = (C42180a) interfaceC30057d;
                    int i13 = c42180a.f119399x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42180a.f119399x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42180a = new C42180a(interfaceC30057d);
                    }
                } else {
                    c42180a = new C42180a(interfaceC30057d);
                }
                Object obj2 = c42180a.f119398w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42180a.f119399x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119392w;
                    C29404c c29404cM93580c = this.f119393x.reducer.m93580c((C24620b) obj);
                    c42180a.f119400y = null;
                    c42180a.f119394E = null;
                    c42180a.f119395F = null;
                    c42180a.f119396G = null;
                    c42180a.f119397H = 0;
                    c42180a.f119399x = 1;
                    if (interfaceC13062m.emit(c29404cM93580c, c42180a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C29403b c29403b) {
            this.f119390w = interfaceC13058l;
            this.f119391x = c29403b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119390w.collect(new a(interfaceC13062m, this.f119391x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29403b(C22654d interactor, C21842e stripeFlowControllerManager, C30528a reducer, C24621c combiner, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(stripeFlowControllerManager, "stripeFlowControllerManager");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.stripeFlowControllerManager = stripeFlowControllerManager;
        this.reducer = reducer;
        this.combiner = combiner;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.universalCheckoutScreenEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new c(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1);
        this.universalCheckoutScreenDomainResult = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(combiner.m71951b(c13078q1M36586L, stripeFlowControllerManager.getStateFlow()), coroutineScope, c13021b2, 1);
        this.combinedDomainResult = c13078q1M36586L2;
        this.viewState = AbstractC13091v.m36586L(new d(c13078q1M36586L2, this), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC22652b m89651t(InterfaceC29402a.n0 n0Var) {
        if (n0Var instanceof InterfaceC29402a.l) {
            InterfaceC29402a.l lVar = (InterfaceC29402a.l) n0Var;
            return new AbstractC22652b.g(lVar.getDynamicPath(), lVar.getDynamicPayload(), lVar.getSource(), lVar.getCartId(), lVar.getMethod(), lVar.getAutoTrigger());
        }
        if (n0Var instanceof InterfaceC29402a.g) {
            InterfaceC29402a.g gVar = (InterfaceC29402a.g) n0Var;
            return gVar.getSkipStripeCheckout() ? new AbstractC22652b.k(gVar.getPath()) : new AbstractC22652b.j(gVar.getPath(), gVar.getCartId());
        }
        if (AbstractC22676k.m65745e(n0Var, InterfaceC29402a.j0.f119322a)) {
            return AbstractC22652b.s.f89145a;
        }
        if (AbstractC22676k.m65745e(n0Var, InterfaceC29402a.u.f119349a)) {
            return AbstractC22652b.i.f89133a;
        }
        if (n0Var instanceof InterfaceC29402a.f) {
            return new AbstractC22652b.c(((InterfaceC29402a.f) n0Var).getPaymentOption());
        }
        if (AbstractC22676k.m65745e(n0Var, InterfaceC29402a.k0.f119326a)) {
            return AbstractC22652b.t.f89146a;
        }
        if (AbstractC22676k.m65745e(n0Var, InterfaceC29402a.h.f119317a)) {
            return AbstractC22652b.d.f89121a;
        }
        if (n0Var instanceof InterfaceC29402a.c) {
            InterfaceC29402a.c cVar = (InterfaceC29402a.c) n0Var;
            return new AbstractC22652b.a(cVar.getCartId(), cVar.getPromoCode());
        }
        if (n0Var instanceof InterfaceC29402a.c0) {
            InterfaceC29402a.c0 c0Var = (InterfaceC29402a.c0) n0Var;
            return new AbstractC22652b.m(c0Var.getCartId(), c0Var.getCodeId());
        }
        if (n0Var instanceof InterfaceC29402a.i0) {
            return new AbstractC22652b.r(((InterfaceC29402a.i0) n0Var).getIsToggled());
        }
        if (n0Var instanceof InterfaceC29402a.g0) {
            return AbstractC22652b.p.f89142a;
        }
        if (n0Var instanceof InterfaceC29402a.h0) {
            return new AbstractC22652b.q(((InterfaceC29402a.h0) n0Var).getCartId());
        }
        if (n0Var instanceof InterfaceC29402a.k) {
            InterfaceC29402a.k kVar = (InterfaceC29402a.k) n0Var;
            return new AbstractC22652b.f(kVar.getTitle(), kVar.getErrorMessage(), kVar.getErrorType());
        }
        if (n0Var instanceof InterfaceC29402a.e) {
            return AbstractC22652b.b.f89119a;
        }
        if (n0Var instanceof InterfaceC29402a.i) {
            return AbstractC22652b.e.f89122a;
        }
        if (n0Var instanceof InterfaceC29402a.n) {
            return new AbstractC22652b.h(((InterfaceC29402a.n) n0Var).getAutoTrigger());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final Object m89652o(C38915o4 c38915o4, boolean z4, InterfaceC30057d<? super InterfaceC16645e> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(c38915o4, this, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    public final void m89653p(C29814e paymentOption) {
        m89655r(new InterfaceC29402a.f(paymentOption));
        this.stripeFlowControllerManager.m61815B(paymentOption);
    }

    /* JADX INFO: renamed from: q */
    public final void m89654q(AbstractC16632b4 paymentSheetResult) {
        String message;
        AbstractC22676k.m65750j(paymentSheetResult, "paymentSheetResult");
        if (paymentSheetResult instanceof C16775z3) {
            m89655r(InterfaceC29402a.g0.f119316a);
            return;
        }
        if (!(paymentSheetResult instanceof C16626a4)) {
            if (!(paymentSheetResult instanceof C16769y3)) {
                throw new NoWhenBranchMatchedException();
            }
            m89655r(InterfaceC29402a.e.f119305a);
            return;
        }
        C16626a4 c16626a4 = (C16626a4) paymentSheetResult;
        if (c16626a4.m47223b().getCause() instanceof ZeroDollarPaymentException) {
            m89655r(InterfaceC29402a.g0.f119316a);
            return;
        }
        Throwable thM47223b = c16626a4.m47223b();
        String message2 = null;
        String errorTitle = thM47223b instanceof ProcessCheckoutException ? ((ProcessCheckoutException) thM47223b).getErrorTitle() : null;
        Throwable thM47223b2 = c16626a4.m47223b();
        if (thM47223b2 instanceof ProcessCheckoutException) {
            message2 = ((ProcessCheckoutException) thM47223b2).getErrorMessage();
        } else if (thM47223b2 instanceof StripeException) {
            message2 = thM47223b2.getMessage();
        }
        Throwable thM47223b3 = c16626a4.m47223b();
        if (thM47223b3 instanceof ProcessCheckoutException) {
            message = ((ProcessCheckoutException) thM47223b3).getErrorType();
        } else if (!(thM47223b3 instanceof StripeException) || (message = thM47223b3.getMessage()) == null) {
            message = "UNEXPECTED_ERROR";
        }
        m89655r(new InterfaceC29402a.k(errorTitle, message2, message));
    }

    /* JADX INFO: renamed from: r */
    public final void m89655r(InterfaceC29402a.n0 event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C29403b(C22654d c22654d, C21842e c21842e, C30528a c30528a, C24621c c24621c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22654d, c21842e, c30528a, c24621c, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

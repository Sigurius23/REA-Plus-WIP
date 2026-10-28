package lo2;

import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ho2.C17538a;
import java.util.Map;
import jo2.C21839b;
import ko2.C22653c;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import mn2.EnumC25719b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import po2.InterfaceC29402a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u82.AbstractC34647h;

/* JADX INFO: renamed from: lo2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Llo2/c;", "", "Lho2/a;", "analyticsHelper", "<init>", "(Lho2/a;)V", "Lec3/l;", "Lko2/c;", "universalCheckoutFlow", "Ljo2/b;", "stripeFlowControllerStateFlow", "Llo2/b;", "b", "(Lec3/l;Lec3/l;)Lec3/l;", "a", "Lho2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24621c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17538a analyticsHelper;

    /* JADX INFO: renamed from: lo2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96332w;

        /* JADX INFO: renamed from: lo2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41967a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96333w;

            /* JADX INFO: renamed from: lo2.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.combiner.UniversalCheckoutResultCombiner$combine$$inlined$map$1$2", m100430f = "UniversalCheckoutResultCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41968a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96334E;

                /* JADX INFO: renamed from: F */
                Object f96335F;

                /* JADX INFO: renamed from: G */
                Object f96336G;

                /* JADX INFO: renamed from: H */
                int f96337H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96338w;

                /* JADX INFO: renamed from: x */
                int f96339x;

                /* JADX INFO: renamed from: y */
                Object f96340y;

                public C41968a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96338w = obj;
                    this.f96339x |= Integer.MIN_VALUE;
                    return C41967a.this.emit(null, this);
                }
            }

            public C41967a(InterfaceC13062m interfaceC13062m) {
                this.f96333w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41968a c41968a;
                if (interfaceC30057d instanceof C41968a) {
                    c41968a = (C41968a) interfaceC30057d;
                    int i13 = c41968a.f96339x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41968a.f96339x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41968a = new C41968a(interfaceC30057d);
                    }
                } else {
                    c41968a = new C41968a(interfaceC30057d);
                }
                Object obj2 = c41968a.f96338w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41968a.f96339x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96333w;
                    C24620b combinedResult = ((C24619a) obj).getCombinedResult();
                    c41968a.f96340y = null;
                    c41968a.f96334E = null;
                    c41968a.f96335F = null;
                    c41968a.f96336G = null;
                    c41968a.f96337H = 0;
                    c41968a.f96339x = 1;
                    if (interfaceC13062m.emit(combinedResult, c41968a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f96332w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96332w.collect(new C41967a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lo2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.combiner.UniversalCheckoutResultCombiner$combine$1", m100430f = "UniversalCheckoutResultCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lko2/c;", "universalCheckoutResult", "Ljo2/b;", "stripeFlowControllerState", "Llo2/b;", "<anonymous>", "(Lko2/c;Ljo2/b;)Llo2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f96342w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f96343x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f96344y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22653c c22653c, C21839b c21839b, InterfaceC30057d<? super C24620b> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f96343x = c22653c;
            bVar.f96344y = c21839b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22653c c22653c = (C22653c) this.f96343x;
            C21839b c21839b = (C21839b) this.f96344y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f96342w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C24620b(c22653c, c21839b);
        }
    }

    /* JADX INFO: renamed from: lo2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.combiner.UniversalCheckoutResultCombiner$combine$2", m100430f = "UniversalCheckoutResultCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llo2/a;", "previousState", "Llo2/b;", "combinedResult", "<anonymous>", "(Llo2/a;Llo2/b;)Llo2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f96345w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f96346x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f96347y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C24619a c24619a, C24620b c24620b, InterfaceC30057d<? super C24619a> interfaceC30057d) {
            c cVar = C24621c.this.new c(interfaceC30057d);
            cVar.f96346x = c24619a;
            cVar.f96347y = c24620b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Map<String, JsonElement> analyticsPayload;
            Map<String, JsonElement> analyticsPayload2;
            C24619a c24619a = (C24619a) this.f96346x;
            C24620b c24620b = (C24620b) this.f96347y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f96345w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            UniversalCheckoutResponse response = c24620b.getUniversalCheckoutScreen().getResponse();
            boolean z4 = true;
            boolean z13 = response != null;
            boolean isConfigured = c24620b.getStripeFlowControllerState().getIsConfigured();
            boolean isError = c24620b.getStripeFlowControllerState().getIsError();
            boolean zIsInAppJoinFlow = EnumC25719b.INSTANCE.m75836a(c24620b.getUniversalCheckoutScreen().getSource()).isInAppJoinFlow();
            if (!z13 || !isConfigured) {
                z4 = false;
            }
            boolean z14 = (z4 || (z13 && zIsInAppJoinFlow && !isError)) ? z4 : false;
            boolean z15 = (c24619a.getScreenViewedEmitted() || !(z14 && !c24619a.getEffectiveScreenReadyForViewEmitted())) ? false : z4;
            Map<String, Object> mapM109487b = null;
            if (z15) {
                C24621c.this.analyticsHelper.m49843a(new InterfaceC29402a.l0(c24620b.getUniversalCheckoutScreen().getSource(), (response == null || (analyticsPayload2 = response.getAnalyticsPayload()) == null) ? null : AbstractC34647h.m109487b(analyticsPayload2)));
            }
            if (!c24619a.getStripeFlowControllerInitializationFailed() && c24620b.getStripeFlowControllerState().getIsError()) {
                C17538a c17538a = C24621c.this.analyticsHelper;
                String source = c24620b.getUniversalCheckoutScreen().getSource();
                String stripeInitializationErrorMessage = c24620b.getStripeFlowControllerState().getStripeInitializationErrorMessage();
                if (response != null && (analyticsPayload = response.getAnalyticsPayload()) != null) {
                    mapM109487b = AbstractC34647h.m109487b(analyticsPayload);
                }
                c17538a.m49843a(new InterfaceC29402a.f0(source, stripeInitializationErrorMessage, mapM109487b));
            }
            boolean z16 = (c24619a.getEffectiveScreenReadyForViewEmitted() || z14) ? z4 : false;
            if (!c24619a.getScreenViewedEmitted() && !z15) {
                z4 = false;
            }
            return c24619a.m71943a(z4, z16, z4, c24620b.getStripeFlowControllerState().getIsError(), c24620b);
        }
    }

    public C24621c(C17538a analyticsHelper) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m71951b(InterfaceC13058l universalCheckoutFlow, InterfaceC13058l stripeFlowControllerStateFlow) {
        AbstractC22676k.m65750j(universalCheckoutFlow, "universalCheckoutFlow");
        AbstractC22676k.m65750j(stripeFlowControllerStateFlow, "stripeFlowControllerStateFlow");
        return new a(AbstractC13091v.m36612v(new C13060l1(new C24619a(false, false, false, false, null, 31, null), new C13060l1(universalCheckoutFlow, stripeFlowControllerStateFlow, new b(null), 1), new c(null)), 1));
    }
}

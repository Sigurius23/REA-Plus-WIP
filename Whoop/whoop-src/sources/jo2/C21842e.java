package jo2;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.universalcheckout.features.checkout.domain.ProcessCheckoutRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.Address;
import com.whoop.universalcheckout.features.checkout.domain.models.BillingDetails;
import com.whoop.universalcheckout.features.checkout.domain.models.Customer;
import com.whoop.universalcheckout.features.checkout.domain.models.GooglePayConfiguration;
import com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetConfiguration;
import com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetIntentConfiguration;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import gy0.AbstractC16273b;
import h20.C16625a3;
import h20.C16631b3;
import h20.C16636c2;
import h20.C16637c3;
import h20.C16665h1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16691l3;
import h20.C16714p2;
import h20.C16744u2;
import h20.C16749v1;
import h20.C16755w1;
import h20.C16760x0;
import h20.C16761x1;
import h20.C16768y2;
import h20.C16774z2;
import h20.EnumC16648e2;
import h20.EnumC16660g2;
import h20.EnumC16684k2;
import h20.EnumC16738t2;
import h20.EnumC16762x2;
import h20.InterfaceC16642d2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import l83.C23454a0;
import live.hms.video.factories.MediaConstraintsFactory;
import n20.C26174i;
import or2.C28162g;
import p208i2.AbstractC17918w0;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.AbstractC42793j;
import q20.AbstractC29840y;
import q20.C29814e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s82.C32266a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32416g;
import tr2.InterfaceC34116n;
import u02.C34387c;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: jo2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 g2\u00020\u0001:\u0001_BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J0\u00105\u001a\u0002012\u0006\u00104\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010?\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bA\u0010BJ)\u0010F\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\"2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u0002012\u0006\u0010\\\u001a\u00020\u001dH\u0002¢\u0006\u0004\b]\u0010^R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010mR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010oR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010tR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010wR\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020z0y8\u0006¢\u0006\f\n\u0004\b+\u0010{\u001a\u0004\b|\u0010}R\u0013\u0010\u0081\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0084\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, m65681d2 = {"Ljo2/e;", "", "Landroid/content/Context;", "context", "Lbc3/c0;", "scope", "Lu02/c;", "apiClient", "Lor2/g;", "buildConfigProvider", "Ljo2/a;", "processCheckoutErrorParser", "Ls82/a;", "seonManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lbc3/c0;Lu02/c;Lor2/g;Ljo2/a;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lh20/d2;", "flowController", "Lbc3/k1;", "A", "(Lh20/d2;)Lbc3/k1;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "paymentSheetConfiguration", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "paymentSheetIntentConfiguration", "", "stripeToken", "", "j", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;)Ljava/lang/Long;", "", "z", "()Z", "Lq20/e;", "paymentMethod", "B", "(Lq20/e;)Lbc3/k1;", "checkoutPath", "checkoutCartId", "k", "(Ljava/lang/String;Ljava/lang/String;)Lbc3/k1;", "paymentMethodId", "Lh20/e;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "f", "()V", "configurationId", "g", "(JLcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lh20/x1;", "s", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;)Lh20/x1;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;", "customer", "Lh20/c2;", "n", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;)Lh20/c2;", "setupFutureUsage", "Lh20/t2;", "u", "(Ljava/lang/Boolean;)Lh20/t2;", "success", "", "error", "i", "(JZLjava/lang/Throwable;)Lbc3/k1;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "defaultBillingDetails", "Lh20/i1;", "o", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;)Lh20/i1;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "googlePayConfig", "Lh20/h2;", "p", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;)Lh20/h2;", "Lh20/h1;", "m", "()Lh20/h1;", "Lh20/g2;", "q", "()Lh20/g2;", "buttonType", "Lh20/e2;", "y", "(Ljava/lang/String;)Lh20/e2;", "token", "x", "(Ljava/lang/String;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lbc3/c0;", "c", "Lu02/c;", "l", "()Lu02/c;", "d", "Lor2/g;", "getBuildConfigProvider", "()Lor2/g;", "Ljo2/a;", "Ls82/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ltr2/n;", "Lec3/p1;", "Ljo2/c;", "Lec3/p1;", "_stateFlow", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "configurationIds", "Lec3/l;", "Ljo2/b;", "Lec3/l;", "v", "()Lec3/l;", "stateFlow", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ljava/lang/String;", "usedSavedPaymentMethod", "r", "()Lq20/e;", "initialPaymentMethod", "t", "selectedPaymentMethod", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21842e {

    /* JADX INFO: renamed from: m */
    public static final int f84298m = 8;

    /* JADX INFO: renamed from: n */
    private static final C16749v1 f84299n = new C16749v1(AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4279968552L)), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getWhite10()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getTransparent()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getWhite20()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getAccentAlert()));

    /* JADX INFO: renamed from: o */
    private static final C16774z2 f84300o = new C16774z2(Integer.valueOf(AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite())), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandBlack()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getTransparent()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandBlack()));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21838a processCheckoutErrorParser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13075p1 _stateFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AtomicLong configurationIds;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13058l stateFlow;

    /* JADX INFO: renamed from: jo2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager", m100430f = "StripeFlowControllerManager.kt", m100431l = {352, 355, 360, 384}, m100432m = "checkout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f84312E;

        /* JADX INFO: renamed from: F */
        Object f84313F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f84314G;

        /* JADX INFO: renamed from: I */
        int f84316I;

        /* JADX INFO: renamed from: w */
        Object f84317w;

        /* JADX INFO: renamed from: x */
        Object f84318x;

        /* JADX INFO: renamed from: y */
        Object f84319y;

        /* JADX INFO: renamed from: z */
        Object f84320z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84314G = obj;
            this.f84316I |= Integer.MIN_VALUE;
            return C21842e.this.m61816e(null, this);
        }
    }

    /* JADX INFO: renamed from: jo2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$checkout$response$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {356}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f84321w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProcessCheckoutRequest f84323y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ProcessCheckoutRequest processCheckoutRequest, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f84323y = processCheckoutRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21842e.this.new c(this.f84323y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84321w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c apiClient = C21842e.this.getApiClient();
            ProcessCheckoutRequest processCheckoutRequest = this.f84323y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ProcessCheckoutRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProcessCheckoutRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f84321w = 1;
            Object objM108748d = apiClient.m108748d(processCheckoutRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: jo2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager", m100430f = "StripeFlowControllerManager.kt", m100431l = {141}, m100432m = "configure", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f84324E;

        /* JADX INFO: renamed from: F */
        Object f84325F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f84326G;

        /* JADX INFO: renamed from: I */
        int f84328I;

        /* JADX INFO: renamed from: w */
        long f84329w;

        /* JADX INFO: renamed from: x */
        Object f84330x;

        /* JADX INFO: renamed from: y */
        Object f84331y;

        /* JADX INFO: renamed from: z */
        Object f84332z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84326G = obj;
            this.f84328I |= Integer.MIN_VALUE;
            return C21842e.this.m61802g(0L, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: jo2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$configureFlowControllerCallback$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {215, 225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f84333E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C21842e f84334F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f84335G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Throwable f84336H;

        /* JADX INFO: renamed from: w */
        Object f84337w;

        /* JADX INFO: renamed from: x */
        Object f84338x;

        /* JADX INFO: renamed from: y */
        Object f84339y;

        /* JADX INFO: renamed from: z */
        int f84340z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j7, C21842e c21842e, boolean z4, Throwable th3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84333E = j7;
            this.f84334F = c21842e;
            this.f84335G = z4;
            this.f84336H = th3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f84333E, this.f84334F, this.f84335G, this.f84336H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0103 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23454a0 c23454a0 = C23454a0.f92919a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84340z;
            if (i13 != 0) {
                if (i13 == 1) {
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
            } else {
                AbstractC34132o.m107864I(obj);
                if (this.f84333E != this.f84334F.configurationIds.get()) {
                    return c23454a0;
                }
                C21840c c21840c = (C21840c) ((C13045h2) this.f84334F._stateFlow).getValue();
                if (this.f84335G) {
                    C26174i c26174i = (C26174i) ((C21840c) ((C13045h2) this.f84334F._stateFlow).getValue()).m61789e();
                    AbstractC29840y abstractC29840y = c26174i.f103777h.f103856E;
                    C29814e c29814eM88710f = abstractC29840y != null ? c26174i.f103772c.m88710f(abstractC29840y) : null;
                    C21840c c21840cM61785b = C21840c.m61785b((C21840c) ((C13045h2) this.f84334F._stateFlow).getValue(), true, new Long(this.f84333E), false, null, null, null, c29814eM88710f, c29814eM88710f, null, 304, null);
                    c21840cM61785b.m61797m(c21840c.m61789e());
                    InterfaceC13075p1 interfaceC13075p1 = this.f84334F._stateFlow;
                    this.f84337w = null;
                    this.f84338x = null;
                    this.f84339y = null;
                    this.f84340z = 1;
                    ((C13045h2) interfaceC13075p1).emit(c21840cM61785b, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    C21840c c21840c2 = (C21840c) ((C13045h2) this.f84334F._stateFlow).getValue();
                    Throwable th3 = this.f84336H;
                    C21840c c21840cM61785b2 = C21840c.m61785b(c21840c2, false, null, true, th3 != null ? th3.getMessage() : null, null, null, null, null, null, 496, null);
                    c21840cM61785b2.m61797m(c21840c.m61789e());
                    InterfaceC13075p1 interfaceC13075p2 = this.f84334F._stateFlow;
                    this.f84337w = null;
                    this.f84338x = null;
                    this.f84340z = 2;
                    ((C13045h2) interfaceC13075p2).emit(c21840cM61785b2, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: jo2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$configureStripe$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ PaymentSheetIntentConfiguration f84341E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f84342F;

        /* JADX INFO: renamed from: w */
        int f84343w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f84345y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ PaymentSheetConfiguration f84346z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j7, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84345y = j7;
            this.f84346z = paymentSheetConfiguration;
            this.f84341E = paymentSheetIntentConfiguration;
            this.f84342F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21842e.this.new f(this.f84345y, this.f84346z, this.f84341E, this.f84342F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84343w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21842e c21842e = C21842e.this;
                long j7 = this.f84345y;
                PaymentSheetConfiguration paymentSheetConfiguration = this.f84346z;
                PaymentSheetIntentConfiguration paymentSheetIntentConfiguration = this.f84341E;
                String str = this.f84342F;
                this.f84343w = 1;
                if (c21842e.m61802g(j7, paymentSheetConfiguration, paymentSheetIntentConfiguration, str, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jo2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$confirmPayment$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {340}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f84347E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f84348F;

        /* JADX INFO: renamed from: w */
        Object f84349w;

        /* JADX INFO: renamed from: x */
        Object f84350x;

        /* JADX INFO: renamed from: y */
        int f84351y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84347E = str;
            this.f84348F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21842e.this.new g(this.f84347E, this.f84348F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84351y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21840c c21840c = (C21840c) ((C13045h2) C21842e.this._stateFlow).getValue();
                C21840c c21840cM61785b = C21840c.m61785b((C21840c) ((C13045h2) C21842e.this._stateFlow).getValue(), false, null, false, null, this.f84347E, this.f84348F, null, null, null, 463, null);
                c21840cM61785b.m61797m(c21840c.m61789e());
                InterfaceC13075p1 interfaceC13075p1 = C21842e.this._stateFlow;
                this.f84349w = null;
                this.f84350x = null;
                this.f84351y = 1;
                ((C13045h2) interfaceC13075p1).emit(c21840cM61785b, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ((C26174i) ((C21840c) ((C13045h2) C21842e.this._stateFlow).getValue()).m61789e()).m77721c();
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: jo2.e$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$registerFlowController$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84353w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC16642d2 f84355y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC16642d2 interfaceC16642d2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84355y = interfaceC16642d2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21842e.this.new h(this.f84355y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84353w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ((C21840c) ((C13045h2) C21842e.this._stateFlow).getValue()).m61797m(this.f84355y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jo2.e$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$setSelectedPaymentMethod$1", m100430f = "StripeFlowControllerManager.kt", m100431l = {322}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C29814e f84356E;

        /* JADX INFO: renamed from: w */
        Object f84357w;

        /* JADX INFO: renamed from: x */
        Object f84358x;

        /* JADX INFO: renamed from: y */
        int f84359y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C29814e c29814e, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84356E = c29814e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21842e.this.new i(this.f84356E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84359y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21840c c21840c = (C21840c) ((C13045h2) C21842e.this._stateFlow).getValue();
                C21840c c21840cM61785b = C21840c.m61785b((C21840c) ((C13045h2) C21842e.this._stateFlow).getValue(), false, null, false, null, null, null, null, this.f84356E, null, 383, null);
                c21840cM61785b.m61797m(c21840c.m61789e());
                InterfaceC13075p1 interfaceC13075p1 = C21842e.this._stateFlow;
                this.f84357w = null;
                this.f84358x = null;
                this.f84359y = 1;
                ((C13045h2) interfaceC13075p1).emit(c21840cM61785b, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: jo2.e$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f84361w;

        /* JADX INFO: renamed from: jo2.e$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f84362w;

            /* JADX INFO: renamed from: jo2.e$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$special$$inlined$map$1$2", m100430f = "StripeFlowControllerManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41857a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f84363E;

                /* JADX INFO: renamed from: F */
                Object f84364F;

                /* JADX INFO: renamed from: G */
                Object f84365G;

                /* JADX INFO: renamed from: H */
                int f84366H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f84367w;

                /* JADX INFO: renamed from: x */
                int f84368x;

                /* JADX INFO: renamed from: y */
                Object f84369y;

                public C41857a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f84367w = obj;
                    this.f84368x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f84362w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41857a c41857a;
                if (interfaceC30057d instanceof C41857a) {
                    c41857a = (C41857a) interfaceC30057d;
                    int i13 = c41857a.f84368x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41857a.f84368x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41857a = new C41857a(interfaceC30057d);
                    }
                } else {
                    c41857a = new C41857a(interfaceC30057d);
                }
                Object obj2 = c41857a.f84367w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41857a.f84368x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f84362w;
                    C21840c c21840c = (C21840c) obj;
                    C21839b c21839b = new C21839b((c21840c.getIsConfigured() || c21840c.getIsError()) ? false : true, c21840c.getIsError(), c21840c.getStripeInitializationErrorMessage(), false, c21840c.getCartId(), c21840c.getConfiguredId(), c21840c.getInitialPaymentMethod(), 8, null);
                    c41857a.f84369y = null;
                    c41857a.f84363E = null;
                    c41857a.f84364F = null;
                    c41857a.f84365G = null;
                    c41857a.f84366H = 0;
                    c41857a.f84368x = 1;
                    if (interfaceC13062m.emit(c21839b, c41857a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f84361w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f84361w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C21842e(Context context, InterfaceC2994c0 scope, C34387c apiClient, C28162g buildConfigProvider, C21838a processCheckoutErrorParser, C32266a seonManager, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(processCheckoutErrorParser, "processCheckoutErrorParser");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.scope = scope;
        this.apiClient = apiClient;
        this.buildConfigProvider = buildConfigProvider;
        this.processCheckoutErrorParser = processCheckoutErrorParser;
        this.seonManager = seonManager;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C21840c(false, null, false, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
        this._stateFlow = c13045h2M36593c;
        this.configurationIds = new AtomicLong(0L);
        this.stateFlow = AbstractC13091v.m36587M(new j(c13045h2M36593c), scope, C13105z1.f45288a, new C21839b(false, false, null, false, null, null, null, 127, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public final Object m61802g(long j7, PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        String str2;
        long j13;
        PaymentSheetConfiguration paymentSheetConfiguration2;
        PaymentSheetIntentConfiguration paymentSheetIntentConfiguration2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f84328I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f84328I = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f84326G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f84328I;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C21840c c21840c = (C21840c) ((C13045h2) this._stateFlow).getValue();
            C21840c c21840cM61785b = C21840c.m61785b((C21840c) ((C13045h2) this._stateFlow).getValue(), false, null, false, null, null, null, null, null, paymentSheetIntentConfiguration.getSetupFutureUsage(), 48, null);
            c21840cM61785b.m61797m(c21840c.m61789e());
            InterfaceC13075p1 interfaceC13075p1 = this._stateFlow;
            dVar.f84330x = paymentSheetConfiguration;
            dVar.f84331y = paymentSheetIntentConfiguration;
            str2 = str;
            dVar.f84332z = str2;
            dVar.f84324E = null;
            dVar.f84325F = null;
            j13 = j7;
            dVar.f84329w = j13;
            dVar.f84328I = 1;
            ((C13045h2) interfaceC13075p1).emit(c21840cM61785b, dVar);
            if (c23454a0 == enumC31071a) {
                return enumC31071a;
            }
            paymentSheetConfiguration2 = paymentSheetConfiguration;
            paymentSheetIntentConfiguration2 = paymentSheetIntentConfiguration;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j14 = dVar.f84329w;
            String str3 = (String) dVar.f84332z;
            paymentSheetIntentConfiguration2 = (PaymentSheetIntentConfiguration) dVar.f84331y;
            paymentSheetConfiguration2 = (PaymentSheetConfiguration) dVar.f84330x;
            AbstractC34132o.m107864I(obj);
            j13 = j14;
            str2 = str3;
        }
        m61812x(str2);
        C16761x1 c16761x1M61810s = m61810s(paymentSheetConfiguration2);
        InterfaceC16642d2 interfaceC16642d2M61789e = ((C21840c) ((C13045h2) this._stateFlow).getValue()).m61789e();
        long amount = paymentSheetIntentConfiguration2.getAmount();
        String currency = paymentSheetIntentConfiguration2.getCurrency();
        EnumC16738t2 enumC16738t2M61811u = m61811u(paymentSheetIntentConfiguration2.getSetupFutureUsage());
        EnumC16684k2 enumC16684k2 = EnumC16684k2.f64153w;
        ((C26174i) interfaceC16642d2M61789e).m77720b(new C16744u2(new C16714p2(amount, currency, enumC16738t2M61811u), paymentSheetConfiguration2.getPaymentMethodTypes(), paymentSheetIntentConfiguration2.getPaymentMethodConfigurationId(), 16), c16761x1M61810s, new C21841d(this, j13));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m61803h(C21842e c21842e, long j7, boolean z4, Throwable th3) {
        c21842e.m61804i(j7, z4, th3);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC3027k1 m61804i(long configurationId, boolean success, Throwable error) {
        return AbstractC3006f0.m8732z(this.scope, null, null, new e(configurationId, this, success, error, null), 3);
    }

    /* JADX INFO: renamed from: m */
    private final C16665h1 m61805m() {
        C16749v1 c16749v1 = f84299n;
        C16774z2 c16774z2 = f84300o;
        float f13 = 4;
        return new C16665h1(c16749v1, c16749v1, new C16637c3(3 * f13), new C16691l3(Integer.valueOf(AbstractC16273b.f62200a)), new C16768y2(c16774z2, c16774z2, new C16625a3(4, Float.valueOf(f13 * f13)), new C16631b3(Integer.valueOf(AbstractC16273b.f62200a), Float.valueOf(C39183o.m124805c(AbstractC35745c.m113246h(13))))));
    }

    /* JADX INFO: renamed from: n */
    private final C16636c2 m61806n(Customer customer) {
        return customer.getCustomerSessionClientSecret() != null ? AbstractC34235f.m108199D(customer.getId(), customer.getCustomerSessionClientSecret()) : new C16636c2(customer.getId(), customer.getEphemeralKey());
    }

    /* JADX INFO: renamed from: o */
    private final C16671i1 m61807o(BillingDetails defaultBillingDetails) {
        if (defaultBillingDetails == null) {
            return null;
        }
        Address address = defaultBillingDetails.getAddress();
        return new C16671i1(address != null ? new C16760x0(address.getCity(), address.getCountry(), address.getLine1(), address.getLine2(), address.getPostalCode(), address.getState()) : null, defaultBillingDetails.getEmail(), defaultBillingDetails.getName(), defaultBillingDetails.getPhone());
    }

    /* JADX INFO: renamed from: p */
    private final C16666h2 m61808p(GooglePayConfiguration googlePayConfig) {
        if (googlePayConfig == null) {
            return null;
        }
        return new C16666h2(m61809q(), googlePayConfig.getCountryCode(), googlePayConfig.getCurrencyCode(), googlePayConfig.getAmount(), googlePayConfig.getLabel(), m61813y(googlePayConfig.getButtonType()));
    }

    /* JADX INFO: renamed from: q */
    private final EnumC16660g2 m61809q() {
        return AbstractC22676k.m65745e(this.buildConfigProvider.getBuildFlavor(), "prodStandard") ? EnumC16660g2.f64064w : EnumC16660g2.f64065x;
    }

    /* JADX INFO: renamed from: s */
    private final C16761x1 m61810s(PaymentSheetConfiguration paymentSheetConfiguration) {
        C16755w1 c16755w1 = new C16755w1("WHOOP");
        c16755w1.m47270e(m61806n(paymentSheetConfiguration.getCustomer()));
        c16755w1.m47271f(m61807o(paymentSheetConfiguration.getDefaultBillingDetails()));
        c16755w1.m47272g(m61808p(paymentSheetConfiguration.getGooglePay()));
        c16755w1.m47268c(m61805m());
        c16755w1.m47266a();
        EnumC16762x2 enumC16762x2 = EnumC16762x2.f64427w;
        c16755w1.m47273h();
        c16755w1.m47267b();
        return c16755w1.m47269d();
    }

    /* JADX INFO: renamed from: u */
    private final EnumC16738t2 m61811u(Boolean setupFutureUsage) {
        if (AbstractC22676k.m65745e(setupFutureUsage, Boolean.TRUE)) {
            return EnumC16738t2.f64292x;
        }
        if (AbstractC22676k.m65745e(setupFutureUsage, Boolean.FALSE)) {
            return EnumC16738t2.f64291w;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    private final void m61812x(String token) {
        C33623c0.m106242r(this.context, token);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    private final EnumC16648e2 m61813y(String buttonType) {
        String upperCase;
        if (buttonType != null) {
            upperCase = buttonType.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            switch (upperCase.hashCode()) {
                case -1975435962:
                    if (upperCase.equals("CHECKOUT")) {
                        return EnumC16648e2.f64013y;
                    }
                    break;
                case -993530582:
                    if (upperCase.equals("SUBSCRIBE")) {
                        return EnumC16648e2.f64008G;
                    }
                    break;
                case 66150:
                    if (upperCase.equals("BUY")) {
                        return EnumC16648e2.f64011w;
                    }
                    break;
                case 2044649:
                    if (upperCase.equals("BOOK")) {
                        return EnumC16648e2.f64012x;
                    }
                    break;
                case 75468590:
                    if (upperCase.equals("ORDER")) {
                        return EnumC16648e2.f64006E;
                    }
                    break;
                case 76210602:
                    if (upperCase.equals("PLAIN")) {
                        return EnumC16648e2.f64009H;
                    }
                    break;
                case 2022129263:
                    if (upperCase.equals("DONATE")) {
                        return EnumC16648e2.f64014z;
                    }
                    break;
            }
        }
        return EnumC16648e2.f64007F;
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC3027k1 m61814A(InterfaceC16642d2 flowController) {
        AbstractC22676k.m65750j(flowController, "flowController");
        return AbstractC3006f0.m8732z(this.scope, null, null, new h(flowController, null), 3);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC3027k1 m61815B(C29814e paymentMethod) {
        return AbstractC3006f0.m8732z(this.scope, null, null, new i(paymentMethod, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0127 A[PHI: r1
      0x0127: PHI (r1v20 java.lang.Object) = (r1v17 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x0123, B:19:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x019e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x020e  */
    /* JADX WARN: Code duplicated, block: B:82:0x021e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        if (r1 == r2) goto L62;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61816e(java.lang.String r21, q83.InterfaceC30057d<? super h20.InterfaceC16645e> r22) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jo2.C21842e.m61816e(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public final void m61817f() {
        AbstractC32416g.m101142K(this.context);
    }

    /* JADX INFO: renamed from: j */
    public final Long m61818j(PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String stripeToken) {
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(paymentSheetIntentConfiguration, "paymentSheetIntentConfiguration");
        AbstractC22676k.m65750j(stripeToken, "stripeToken");
        if (paymentSheetIntentConfiguration.getAmount() == 0) {
            return null;
        }
        long jIncrementAndGet = this.configurationIds.incrementAndGet();
        AbstractC3006f0.m8732z(this.scope, null, null, new f(jIncrementAndGet, paymentSheetConfiguration, paymentSheetIntentConfiguration, stripeToken, null), 3);
        return Long.valueOf(jIncrementAndGet);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC3027k1 m61819k(String checkoutPath, String checkoutCartId) {
        AbstractC22676k.m65750j(checkoutPath, "checkoutPath");
        AbstractC22676k.m65750j(checkoutCartId, "checkoutCartId");
        return AbstractC3006f0.m8732z(this.scope, null, null, new g(checkoutPath, checkoutCartId, null), 3);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C34387c getApiClient() {
        return this.apiClient;
    }

    /* JADX INFO: renamed from: r */
    public final C29814e m61821r() {
        return ((C21840c) ((C13045h2) this._stateFlow).getValue()).getInitialPaymentMethod();
    }

    /* JADX INFO: renamed from: t */
    public final C29814e m61822t() {
        return ((C21840c) ((C13045h2) this._stateFlow).getValue()).getSelectedPaymentMethod();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final InterfaceC13058l getStateFlow() {
        return this.stateFlow;
    }

    /* JADX INFO: renamed from: w */
    public final String m61824w() {
        return AbstractC22676k.m65745e(((C21840c) ((C13045h2) this._stateFlow).getValue()).getInitialPaymentMethod(), ((C21840c) ((C13045h2) this._stateFlow).getValue()).getSelectedPaymentMethod()) ? MediaConstraintsFactory.kValueTrue : MediaConstraintsFactory.kValueFalse;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m61825z() {
        if (!((C21840c) ((C13045h2) this._stateFlow).getValue()).getIsConfigured()) {
            return false;
        }
        ((C26174i) ((C21840c) ((C13045h2) this._stateFlow).getValue()).m61789e()).m77723f();
        return true;
    }

    public /* synthetic */ C21842e(Context context, InterfaceC2994c0 interfaceC2994c0, C34387c c34387c, C28162g c28162g, C21838a c21838a, C32266a c32266a, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2994c0, c34387c, c28162g, c21838a, c32266a, featureFlagChecker, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StripeFlowControllerManager") : interfaceC34116n);
    }
}

package fw1;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0755b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.membership.extensions.domain.MembershipExtensionApi;
import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.ExtensionsV2LandingResponse;
import com.whoop.membership.extensions.domain.models.NativeOrderResponse;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.OrderRequestBodyReactivations;
import com.whoop.membership.extensions.domain.models.OrderRequestBodyV2;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.ProgressContentType;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellLandingResponse;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellSegment;
import com.whoop.membership.extensions.domain.models.SectionItems;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutRadioOptionModel;
import com.whoop.navigation.C9598e;
import com.whoop.payments.domain.models.Card;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ew1.C13722a;
import h32.InterfaceC16828a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35339j0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;
import y00.C38793c;
import y00.C38892m;
import y00.C38951s4;

/* JADX INFO: renamed from: fw1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u00020$2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b%\u0010&J\u001c\u0010(\u001a\u00020'2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b(\u0010&J8\u0010-\u001a\u00020,2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0)2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010+\u001a\u00020\"H\u0082@¢\u0006\u0004\b-\u0010.J \u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\"H\u0082@¢\u0006\u0004\b1\u00102J \u00104\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\"H\u0082@¢\u0006\u0004\b4\u00102J6\u00107\u001a\u0002032\u0006\u00100\u001a\u00020/2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010+\u001a\u00020\"H\u0082@¢\u0006\u0004\b7\u00108J\u001a\u00109\u001a\u0004\u0018\u00010\"2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u0004\u0018\u00010\"2\u0006\u0010;\u001a\u00020\"H\u0082@¢\u0006\u0004\b<\u0010&J\u0010\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00190R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m65681d2 = {"Lfw1/d;", "", "Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;", "membershipApi", "Ltr2/n;", "logger", "Lh32/a;", "stripeManager", "Lbc3/z;", "dispatcher", "Lrv1/a;", "membershipRepository", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lsr2/y;", "urlProvider", "Lqw2/c;", "actionInteractor", "Lew1/a;", "analytics", "<init>", "(Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;Ltr2/n;Lh32/a;Lbc3/z;Lrv1/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lsr2/y;Lqw2/c;Lew1/a;)V", "Lec3/l;", "Lfw1/b;", "upstream", "Lfw1/c;", "v", "(Lec3/l;)Lec3/l;", "Lqw2/b;", "state", "Lfw1/h;", "landingType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lqw2/b;Lfw1/h;)Lfw1/c;", "", "promoCode", "Lfw1/g;", "r", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lfw1/e;", "s", "", "payload", "path", "Lfw1/a;", "q", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "p", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lfw1/f;", "n", "Lcom/whoop/payments/domain/models/Card;", "card", "m", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "t", "(Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;", "cardToken", "u", "Ll83/a0;", "o", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;", "b", "Ltr2/n;", "c", "Lh32/a;", "d", "Lbc3/z;", "e", "Lrv1/a;", "f", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "g", "Lsr2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lqw2/c;", "i", "Lew1/a;", "Lec3/p1;", "j", "Lec3/p1;", "latestState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14837d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipExtensionApi membershipApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC16828a stripeManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C13722a analytics;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 latestState;

    /* JADX INFO: renamed from: fw1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55155a;

        static {
            int[] iArr = new int[EnumC14841h.values().length];
            try {
                iArr[EnumC14841h.REACTIVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14841h.EXTENSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55155a = iArr;
        }
    }

    /* JADX INFO: renamed from: fw1.d$a0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$2", m100430f = "ExtensionsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lfw1/c;", "previousDomainResult", "currentDomainResult", "<anonymous>", "(Lfw1/c;Lfw1/c;)Lfw1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f55156w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f55157x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f55158y;

        public a0(InterfaceC30057d<? super a0> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14836c interfaceC14836c, InterfaceC14836c interfaceC14836c2, InterfaceC30057d<? super InterfaceC14836c> interfaceC30057d) {
            a0 a0Var = new a0(interfaceC30057d);
            a0Var.f55157x = interfaceC14836c;
            a0Var.f55158y = interfaceC14836c2;
            return a0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14836c interfaceC14836c = (InterfaceC14836c) this.f55157x;
            InterfaceC14836c interfaceC14836c2 = (InterfaceC14836c) this.f55158y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f55156w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(interfaceC14836c2 instanceof C14834a) || !(interfaceC14836c instanceof C14834a)) {
                if ((interfaceC14836c2 instanceof C14839f) && (interfaceC14836c instanceof C14839f)) {
                    C14839f c14839f = (C14839f) interfaceC14836c;
                    return C14839f.m42697d((C14839f) interfaceC14836c2, false, false, null, null, c14839f.getPayloadV2(), c14839f.getPromoCode(), c14839f.getCard(), c14839f.getPath(), null, 271, null);
                }
                if (!(interfaceC14836c2 instanceof C14838e) || !(interfaceC14836c instanceof C14838e)) {
                    return interfaceC14836c2;
                }
                C14838e c14838e = (C14838e) interfaceC14836c2;
                ExtensionsV2LandingResponse extensionsV2LandingResponse = c14838e.getExtensionsV2LandingResponse();
                if (extensionsV2LandingResponse == null) {
                    extensionsV2LandingResponse = ((C14838e) interfaceC14836c).getExtensionsV2LandingResponse();
                }
                ExtensionsV2LandingResponse extensionsV2LandingResponse2 = extensionsV2LandingResponse;
                String promoCode = c14838e.getPromoCode();
                if (promoCode == null) {
                    promoCode = ((C14838e) interfaceC14836c).getPromoCode();
                }
                return C14838e.m42691d(c14838e, false, false, extensionsV2LandingResponse2, promoCode, null, null, false, 115, null);
            }
            C14834a c14834a = (C14834a) interfaceC14836c2;
            StepPrefetchContent stepPrefetchContent = c14834a.getStepPrefetchContent();
            if (stepPrefetchContent == null) {
                stepPrefetchContent = ((C14834a) interfaceC14836c).getStepPrefetchContent();
            }
            StepPrefetchContent stepPrefetchContent2 = stepPrefetchContent;
            NativeOrderResponse nativeOrderResponse = c14834a.getNativeOrderResponse();
            if (nativeOrderResponse == null) {
                nativeOrderResponse = ((C14834a) interfaceC14836c).getNativeOrderResponse();
            }
            NativeOrderResponse nativeOrderResponse2 = nativeOrderResponse;
            List<OrderOption> listM42634g = c14834a.m42634g();
            if (listM42634g.isEmpty()) {
                listM42634g = ((C14834a) interfaceC14836c).m42634g();
            }
            List<OrderOption> list = listM42634g;
            Card card = c14834a.getCard().isEmpty() ? ((C14834a) interfaceC14836c).getCard() : c14834a.getCard();
            String payload = c14834a.getPayload();
            if (payload.length() == 0) {
                payload = ((C14834a) interfaceC14836c).getPayload();
            }
            String str = payload;
            CheckoutPayload payloadV2 = c14834a.getPayloadV2();
            if (payloadV2 == null) {
                payloadV2 = ((C14834a) interfaceC14836c).getPayloadV2();
            }
            CheckoutPayload checkoutPayload = payloadV2;
            Map<String, String> mapM42637j = c14834a.m42637j();
            if (mapM42637j == null) {
                mapM42637j = ((C14834a) interfaceC14836c).m42637j();
            }
            Map<String, String> map = mapM42637j;
            String path = c14834a.getPath();
            if (path == null) {
                path = ((C14834a) interfaceC14836c).getPath();
            }
            return C14834a.m42628d(c14834a, false, false, str, stepPrefetchContent2, nativeOrderResponse2, list, card, checkoutPayload, map, path, 3, null);
        }
    }

    /* JADX INFO: renamed from: fw1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {352, 362, 378}, m100432m = "dynamicCheckout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f55159E;

        /* JADX INFO: renamed from: F */
        Object f55160F;

        /* JADX INFO: renamed from: G */
        Object f55161G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f55162H;

        /* JADX INFO: renamed from: J */
        int f55164J;

        /* JADX INFO: renamed from: w */
        Object f55165w;

        /* JADX INFO: renamed from: x */
        Object f55166x;

        /* JADX INFO: renamed from: y */
        Object f55167y;

        /* JADX INFO: renamed from: z */
        Object f55168z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55162H = obj;
            this.f55164J |= Integer.MIN_VALUE;
            return C14837d.this.m42679m(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$b0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f55169w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14837d f55170x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14835b f55171y;

        /* JADX INFO: renamed from: fw1.d$b0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f55172w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14837d f55173x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC14835b f55174y;

            /* JADX INFO: renamed from: fw1.d$b0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "ExtensionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41613a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f55175E;

                /* JADX INFO: renamed from: F */
                Object f55176F;

                /* JADX INFO: renamed from: G */
                Object f55177G;

                /* JADX INFO: renamed from: H */
                int f55178H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f55179w;

                /* JADX INFO: renamed from: x */
                int f55180x;

                /* JADX INFO: renamed from: y */
                Object f55181y;

                public C41613a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f55179w = obj;
                    this.f55180x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14837d c14837d, AbstractC14835b abstractC14835b) {
                this.f55172w = interfaceC13062m;
                this.f55173x = c14837d;
                this.f55174y = abstractC14835b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41613a c41613a;
                if (interfaceC30057d instanceof C41613a) {
                    c41613a = (C41613a) interfaceC30057d;
                    int i13 = c41613a.f55180x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41613a.f55180x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41613a = new C41613a(interfaceC30057d);
                    }
                } else {
                    c41613a = new C41613a(interfaceC30057d);
                }
                Object obj2 = c41613a.f55179w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41613a.f55180x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f55172w;
                    InterfaceC14836c interfaceC14836cM42688w = this.f55173x.m42688w((AbstractC30694b) obj, ((AbstractC14835b.f) this.f55174y).getLandingType());
                    c41613a.f55181y = null;
                    c41613a.f55175E = null;
                    c41613a.f55176F = null;
                    c41613a.f55177G = null;
                    c41613a.f55178H = 0;
                    c41613a.f55180x = 1;
                    if (interfaceC13062m.emit(interfaceC14836cM42688w, c41613a) == enumC31071a) {
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

        public b0(InterfaceC13058l interfaceC13058l, C14837d c14837d, AbstractC14835b abstractC14835b) {
            this.f55169w = interfaceC13058l;
            this.f55170x = c14837d;
            this.f55171y = abstractC14835b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f55169w.collect(new a(interfaceC13062m, this.f55170x, this.f55171y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fw1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$dynamicCheckout$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {379}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55183w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55185y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ JsonObject f55186z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JsonObject jsonObject, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55185y = str;
            this.f55186z = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new c(this.f55185y, this.f55186z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55183w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            String str = this.f55185y;
            C0755b c0755b = AbstractC0757c.f2762d;
            JsonObject jsonObject = this.f55186z;
            c0755b.getClass();
            JsonObject jsonObject2 = (JsonObject) c0755b.m1830a(JsonObject.Companion.serializer(), jsonObject);
            this.f55183w = 1;
            Object objPlaceDynamicCheckoutOrder = membershipExtensionApi.placeDynamicCheckoutOrder(str, jsonObject2, this);
            return objPlaceDynamicCheckoutOrder == enumC31071a ? enumC31071a : objPlaceDynamicCheckoutOrder;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {320}, m100432m = "dynamicFreeCheckout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f55188F;

        /* JADX INFO: renamed from: w */
        Object f55189w;

        /* JADX INFO: renamed from: x */
        Object f55190x;

        /* JADX INFO: renamed from: y */
        Object f55191y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f55192z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55192z = obj;
            this.f55188F |= Integer.MIN_VALUE;
            return C14837d.this.m42680n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$dynamicFreeCheckout$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {321}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55193w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55195y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new e(this.f55195y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55193w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            String str = this.f55195y;
            this.f55193w = 1;
            Object objPlaceDynamicFreeOrder = membershipExtensionApi.placeDynamicFreeOrder(str, this);
            return objPlaceDynamicFreeOrder == enumC31071a ? enumC31071a : objPlaceDynamicFreeOrder;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {306}, m100432m = "fetchDynamicOrderData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f55197F;

        /* JADX INFO: renamed from: w */
        Object f55198w;

        /* JADX INFO: renamed from: x */
        Object f55199x;

        /* JADX INFO: renamed from: y */
        Object f55200y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f55201z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55201z = obj;
            this.f55197F |= Integer.MIN_VALUE;
            return C14837d.this.m42682p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$fetchDynamicOrderData$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {307}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55202w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55204y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ CheckoutPayload f55205z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, CheckoutPayload checkoutPayload, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55204y = str;
            this.f55205z = checkoutPayload;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new g(this.f55204y, this.f55205z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55202w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            String str = this.f55204y;
            OrderRequestBodyV2 orderRequestBodyV2 = new OrderRequestBodyV2(this.f55205z);
            this.f55202w = 1;
            Object dynamicOrder = membershipExtensionApi.getDynamicOrder(str, orderRequestBodyV2, this);
            return dynamicOrder == enumC31071a ? enumC31071a : dynamicOrder;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super NativeOrderResponse> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {295}, m100432m = "fetchReactivationUpsellDynamicOrder", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f55206E;

        /* JADX INFO: renamed from: G */
        int f55208G;

        /* JADX INFO: renamed from: w */
        Object f55209w;

        /* JADX INFO: renamed from: x */
        Object f55210x;

        /* JADX INFO: renamed from: y */
        Object f55211y;

        /* JADX INFO: renamed from: z */
        Object f55212z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55206E = obj;
            this.f55208G |= Integer.MIN_VALUE;
            return C14837d.this.m42683q(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$fetchReactivationUpsellDynamicOrder$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {296}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55213w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55215y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f55216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Map<String, String> map, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55215y = str;
            this.f55216z = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new i(this.f55215y, this.f55216z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55213w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            String str = this.f55215y;
            OrderRequestBodyReactivations orderRequestBodyReactivations = new OrderRequestBodyReactivations(this.f55216z);
            this.f55213w = 1;
            Object dynamicOrderV2 = membershipExtensionApi.getDynamicOrderV2(str, orderRequestBodyReactivations, this);
            return dynamicOrderV2 == enumC31071a ? enumC31071a : dynamicOrderV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super NativeOrderResponse> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {271}, m100432m = "fetchReactivationUpsellLanding", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f55217w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f55218x;

        /* JADX INFO: renamed from: z */
        int f55220z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55218x = obj;
            this.f55220z |= Integer.MIN_VALUE;
            return C14837d.this.m42684r(null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$fetchReactivationUpsellLanding$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {272}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55221w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new k(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55221w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            this.f55221w = 1;
            Object reactivationUpsellSelection = membershipExtensionApi.getReactivationUpsellSelection(this);
            return reactivationUpsellSelection == enumC31071a ? enumC31071a : reactivationUpsellSelection;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReactivationUpsellLandingResponse> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor", m100430f = "ExtensionsInteractor.kt", m100431l = {281}, m100432m = "fetchV2SelectionData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f55223w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f55224x;

        /* JADX INFO: renamed from: z */
        int f55226z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55224x = obj;
            this.f55226z |= Integer.MIN_VALUE;
            return C14837d.this.m42685s(null, this);
        }
    }

    /* JADX INFO: renamed from: fw1.d$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$fetchV2SelectionData$response$1", m100430f = "ExtensionsInteractor.kt", m100431l = {282}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55227w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55229y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new m(this.f55229y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55227w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipExtensionApi membershipExtensionApi = C14837d.this.membershipApi;
            String str = this.f55229y;
            this.f55227w = 1;
            Object v2Selection = membershipExtensionApi.getV2Selection(str, this);
            return v2Selection == enumC31071a ? enumC31071a : v2Selection;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ExtensionsV2LandingResponse> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fw1.d$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$getCardToken$2", m100430f = "ExtensionsInteractor.kt", m100431l = {399}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55230w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Card f55232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Card card, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55232y = card;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new n(this.f55232y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55230w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C14837d.this.stripeManager;
                    this.f55230w = 1;
                    obj = interfaceC16828a.mo47426b(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C35339j0 c35339j0 = (C35339j0) obj;
                if (c35339j0 == null) {
                    return null;
                }
                Card card = this.f55232y;
                String cardNumber = card.getCardNumber();
                String strSubstring = card.getCardExpiration().substring(0, 2);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                int i14 = Integer.parseInt(strSubstring);
                String strSubstring2 = card.getCardExpiration().substring(2, 4);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                return C35339j0.m112191a(c35339j0, new C38892m(cardNumber, i14, Integer.parseInt(strSubstring2), card.getCardCvv(), new C38793c(null, null, null, null, card.getCardZip(), null))).f167191w;
            } catch (StripeException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: fw1.d$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$getPaymentMethodId$2", m100430f = "ExtensionsInteractor.kt", m100431l = {421}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55233w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55235y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55235y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14837d.this.new o(this.f55235y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55233w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C14837d.this.stripeManager;
                    this.f55233w = 1;
                    obj = interfaceC16828a.mo47426b(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C35339j0 c35339j0 = (C35339j0) obj;
                if (c35339j0 != null) {
                    String token = this.f55235y;
                    AbstractC22676k.m65750j(token, "token");
                    return C35339j0.m112192b(c35339j0, C33647p.m106266h(new C38951s4(null, null, null, null, token, null, null, 110), null, 14)).f167527w;
                }
            } catch (StripeException unused) {
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: fw1.d$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ExtensionsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f55236w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f55237x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f55238y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14837d f55239z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC30057d interfaceC30057d, C14837d c14837d) {
            super(3, interfaceC30057d);
            this.f55239z = c14837d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14835b abstractC14835b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            p pVar = new p(interfaceC30057d, this.f55239z);
            pVar.f55237x = interfaceC13062m;
            pVar.f55238y = abstractC14835b;
            return pVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55236w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f55237x;
                AbstractC14835b abstractC14835b = (AbstractC14835b) this.f55238y;
                if (abstractC14835b instanceof AbstractC14835b.c) {
                    c13084s1 = new C13084s1(this.f55239z.new s(abstractC14835b, null));
                } else if (abstractC14835b instanceof AbstractC14835b.d) {
                    c13084s1 = new C13084s1(new t(abstractC14835b, this.f55239z, null));
                } else if (abstractC14835b instanceof AbstractC14835b.b) {
                    c13084s1 = new C13084s1(new u(abstractC14835b, this.f55239z, null));
                } else if (abstractC14835b instanceof AbstractC14835b.a) {
                    c13084s1 = new C13084s1(new v(abstractC14835b, this.f55239z, null));
                } else if (abstractC14835b instanceof AbstractC14835b.k) {
                    c13084s1 = new C13084s1(new w(abstractC14835b, null));
                } else if (abstractC14835b instanceof AbstractC14835b.i) {
                    c13084s1 = new C13084s1(new x(abstractC14835b, null));
                } else if (abstractC14835b instanceof AbstractC14835b.f) {
                    c13084s1 = new b0(this.f55239z.actionInteractor.interact(new C0456u(new C30698f(((AbstractC14835b.f) abstractC14835b).getAction()), 1)), this.f55239z, abstractC14835b);
                } else if (abstractC14835b instanceof AbstractC14835b.g) {
                    c13084s1 = new C13084s1(new y(abstractC14835b, this.f55239z, null));
                } else if (abstractC14835b instanceof AbstractC14835b.e) {
                    c13084s1 = new C13084s1(this.f55239z.new z(abstractC14835b, null));
                } else if (abstractC14835b instanceof AbstractC14835b.j) {
                    c13084s1 = new C13084s1(this.f55239z.new q(abstractC14835b, null));
                } else {
                    if (!(abstractC14835b instanceof AbstractC14835b.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f55239z.new r(abstractC14835b, null));
                }
                this.f55237x = null;
                this.f55238y = null;
                this.f55236w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC14835b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fw1.d$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$10", m100430f = "ExtensionsInteractor.kt", m100431l = {164}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55240w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f55241x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14835b f55243z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(AbstractC14835b abstractC14835b, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55243z = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            q qVar = C14837d.this.new q(this.f55243z, interfaceC30057d);
            qVar.f55241x = obj;
            return qVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f55241x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55240w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Object value = ((C13045h2) C14837d.this.latestState).getValue();
                C14840g c14840g = value instanceof C14840g ? (C14840g) value : null;
                if (c14840g != null) {
                    ((C13045h2) C14837d.this.latestState).m36570j(C14840g.m42706d(c14840g, false, false, null, null, null, ((AbstractC14835b.j) this.f55243z).getIndex(), null, 95, null));
                }
                Object value2 = ((C13045h2) C14837d.this.latestState).getValue();
                this.f55241x = null;
                this.f55240w = 1;
                if (interfaceC13062m.emit(value2, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fw1.d$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$11", m100430f = "ExtensionsInteractor.kt", m100431l = {192}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AbstractC14835b f55245F;

        /* JADX INFO: renamed from: w */
        Object f55246w;

        /* JADX INFO: renamed from: x */
        Object f55247x;

        /* JADX INFO: renamed from: y */
        int f55248y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f55249z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(AbstractC14835b abstractC14835b, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55245F = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r rVar = C14837d.this.new r(this.f55245F, interfaceC30057d);
            rVar.f55249z = obj;
            return rVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ReactivationUpsellLandingResponse reactivationUpsellLandingResponseCopy$default;
            ReactivationUpsellLandingResponse reactivationUpsellLandingResponse;
            C14840g c14840g;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f55249z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55248y;
            int i14 = 1;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Object value = ((C13045h2) C14837d.this.latestState).getValue();
                C14840g c14840g2 = value instanceof C14840g ? (C14840g) value : null;
                if (c14840g2 == null || (reactivationUpsellLandingResponse = c14840g2.getReactivationUpsellLandingResponse()) == null) {
                    reactivationUpsellLandingResponseCopy$default = null;
                } else {
                    AbstractC14835b abstractC14835b = this.f55245F;
                    List<ReactivationUpsellSegment> segments = reactivationUpsellLandingResponse.getSegments();
                    int i15 = 10;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
                    int i16 = 0;
                    for (Object obj2 : segments) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        ReactivationUpsellSegment reactivationUpsellSegmentCopy$default = (ReactivationUpsellSegment) obj2;
                        if (i16 != c14840g2.getCurrentSelectionIndex()) {
                            c14840g = c14840g2;
                        } else {
                            List<SectionItems> sections = reactivationUpsellSegmentCopy$default.getSections();
                            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(sections, i15));
                            for (SectionItems sectionItems : sections) {
                                List<DesignSystemModel> items = sectionItems.getItems();
                                C14840g c14840g3 = c14840g2;
                                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(items, i15));
                                for (Object objCopy$default : items) {
                                    if (objCopy$default instanceof MembershipCheckoutRadioOptionModel) {
                                        MembershipCheckoutRadioOptionModel membershipCheckoutRadioOptionModel = (MembershipCheckoutRadioOptionModel) objCopy$default;
                                        objCopy$default = MembershipCheckoutRadioOptionModel.copy$default(membershipCheckoutRadioOptionModel, null, null, null, null, AbstractC22676k.m65745e(membershipCheckoutRadioOptionModel.getTrackingLabel(), ((AbstractC14835b.h) abstractC14835b).getOptionState().getTrackingLabel()), null, null, null, null, null, null, 2031, null);
                                    }
                                    arrayList3.add(objCopy$default);
                                }
                                arrayList2.add(sectionItems.copy(arrayList3));
                                c14840g2 = c14840g3;
                                i14 = 1;
                                i15 = 10;
                            }
                            c14840g = c14840g2;
                            reactivationUpsellSegmentCopy$default = ReactivationUpsellSegment.copy$default(reactivationUpsellSegmentCopy$default, null, arrayList2, i14, null);
                        }
                        arrayList.add(reactivationUpsellSegmentCopy$default);
                        i16 = i17;
                        c14840g2 = c14840g;
                        i14 = 1;
                        i15 = 10;
                    }
                    reactivationUpsellLandingResponseCopy$default = ReactivationUpsellLandingResponse.copy$default(reactivationUpsellLandingResponse, null, null, null, 0, arrayList, 15, null);
                }
                Object value2 = ((C13045h2) C14837d.this.latestState).getValue();
                C14840g c14840g4 = value2 instanceof C14840g ? (C14840g) value2 : null;
                if (c14840g4 != null) {
                    ((C13045h2) C14837d.this.latestState).m36570j(C14840g.m42706d(c14840g4, false, false, reactivationUpsellLandingResponseCopy$default, null, null, 0, null, 123, null));
                }
                Object value3 = ((C13045h2) C14837d.this.latestState).getValue();
                this.f55249z = null;
                this.f55246w = null;
                this.f55247x = null;
                this.f55248y = 1;
                if (interfaceC13062m.emit(value3, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fw1.d$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$1", m100430f = "ExtensionsInteractor.kt", m100431l = {66, 67, 69, 68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC14835b f55250E;

        /* JADX INFO: renamed from: w */
        Object f55251w;

        /* JADX INFO: renamed from: x */
        int f55252x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(AbstractC14835b abstractC14835b, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55250E = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s sVar = C14837d.this.new s(this.f55250E, interfaceC30057d);
            sVar.f55253y = obj;
            return sVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007a A[PHI: r1 r3
          0x007a: PHI (r1v2 ec3.m) = (r1v1 ec3.m), (r1v6 ec3.m) binds: [B:21:0x0077, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x007a: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v7 java.lang.Object) binds: [B:21:0x0077, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (r1.emit(r3, r19) == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = r0.f55253y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f55252x
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r3 == 0) goto L37
                if (r3 == r7) goto L33
                if (r3 == r6) goto L2f
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                p505ts.AbstractC34132o.m107864I(r20)
                goto L87
            L1d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L25:
                java.lang.Object r1 = r0.f55251w
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                p505ts.AbstractC34132o.m107864I(r20)
                r3 = r20
                goto L7a
            L2f:
                p505ts.AbstractC34132o.m107864I(r20)
                goto L63
            L33:
                p505ts.AbstractC34132o.m107864I(r20)
                goto L56
            L37:
                p505ts.AbstractC34132o.m107864I(r20)
                fw1.e r9 = new fw1.e
                r17 = 62
                r18 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r0.f55253y = r1
                r0.f55252x = r7
                java.lang.Object r3 = r1.emit(r9, r0)
                if (r3 != r2) goto L56
                goto L86
            L56:
                fw1.d r3 = fw1.C14837d.this
                r0.f55253y = r1
                r0.f55252x = r6
                java.lang.Object r3 = fw1.C14837d.m42669c(r3, r0)
                if (r3 != r2) goto L63
                goto L86
            L63:
                fw1.d r3 = fw1.C14837d.this
                fw1.b r6 = r0.f55250E
                fw1.b$c r6 = (fw1.AbstractC14835b.c) r6
                java.lang.String r6 = r6.getPromoCode()
                r0.f55253y = r8
                r0.f55251w = r1
                r0.f55252x = r5
                java.lang.Object r3 = fw1.C14837d.m42673g(r3, r6, r0)
                if (r3 != r2) goto L7a
                goto L86
            L7a:
                r0.f55253y = r8
                r0.f55251w = r8
                r0.f55252x = r4
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto L87
            L86:
                return r2
            L87:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fw1.d$t */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$2", m100430f = "ExtensionsInteractor.kt", m100431l = {76, 85, 85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14837d f55255E;

        /* JADX INFO: renamed from: w */
        Object f55256w;

        /* JADX INFO: renamed from: x */
        int f55257x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55258y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14835b f55259z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AbstractC14835b abstractC14835b, C14837d c14837d, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55259z = abstractC14835b;
            this.f55255E = c14837d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            t tVar = new t(this.f55259z, this.f55255E, interfaceC30057d);
            tVar.f55258y = obj;
            return tVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
        
            if (r1.emit(r3, r21) == r2) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = r0.f55258y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f55257x
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L31
                if (r3 == r6) goto L2d
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                p505ts.AbstractC34132o.m107864I(r22)
                goto La4
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r1 = r0.f55256w
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                p505ts.AbstractC34132o.m107864I(r22)
                r3 = r22
                goto L97
            L2d:
                p505ts.AbstractC34132o.m107864I(r22)
                goto L70
            L31:
                p505ts.AbstractC34132o.m107864I(r22)
                fw1.b r3 = r0.f55259z
                fw1.b$d r3 = (fw1.AbstractC14835b.d) r3
                java.util.List r14 = r3.m42650b()
                fw1.b r3 = r0.f55259z
                fw1.b$d r3 = (fw1.AbstractC14835b.d) r3
                com.whoop.payments.domain.models.Card r15 = r3.getCard()
                fw1.b r3 = r0.f55259z
                fw1.b$d r3 = (fw1.AbstractC14835b.d) r3
                com.whoop.membership.extensions.domain.models.StepPrefetchContent r12 = r3.getStepPrefetchContent()
                fw1.b r3 = r0.f55259z
                fw1.b$d r3 = (fw1.AbstractC14835b.d) r3
                java.util.Map r17 = r3.m42652d()
                fw1.a r8 = new fw1.a
                r19 = 662(0x296, float:9.28E-43)
                r20 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r13 = 0
                r16 = 0
                r18 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r0.f55258y = r1
                r0.f55257x = r6
                java.lang.Object r3 = r1.emit(r8, r0)
                if (r3 != r2) goto L70
                goto La3
            L70:
                fw1.d r3 = r0.f55255E
                fw1.b r6 = r0.f55259z
                fw1.b$d r6 = (fw1.AbstractC14835b.d) r6
                java.util.Map r6 = r6.m42652d()
                fw1.b r8 = r0.f55259z
                fw1.b$d r8 = (fw1.AbstractC14835b.d) r8
                java.lang.String r8 = r8.getPromoCode()
                fw1.b r9 = r0.f55259z
                fw1.b$d r9 = (fw1.AbstractC14835b.d) r9
                java.lang.String r9 = r9.getPath()
                r0.f55258y = r7
                r0.f55256w = r1
                r0.f55257x = r5
                java.lang.Object r3 = fw1.C14837d.m42671e(r3, r6, r8, r9, r0)
                if (r3 != r2) goto L97
                goto La3
            L97:
                r0.f55258y = r7
                r0.f55256w = r7
                r0.f55257x = r4
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto La4
            La3:
                return r2
            La4:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fw1.d$u */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$3", m100430f = "ExtensionsInteractor.kt", m100431l = {89, 97, 97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14837d f55260E;

        /* JADX INFO: renamed from: w */
        Object f55261w;

        /* JADX INFO: renamed from: x */
        int f55262x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55263y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14835b f55264z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(AbstractC14835b abstractC14835b, C14837d c14837d, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55264z = abstractC14835b;
            this.f55260E = c14837d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            u uVar = new u(this.f55264z, this.f55260E, interfaceC30057d);
            uVar.f55263y = obj;
            return uVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            if (r1.emit(r3, r20) == r2) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = r0.f55263y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f55262x
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L31
                if (r3 == r6) goto L2d
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                p505ts.AbstractC34132o.m107864I(r21)
                goto L93
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r1 = r0.f55261w
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                p505ts.AbstractC34132o.m107864I(r21)
                r3 = r21
                goto L86
            L2d:
                p505ts.AbstractC34132o.m107864I(r21)
                goto L67
            L31:
                p505ts.AbstractC34132o.m107864I(r21)
                fw1.f r8 = new fw1.f
                fw1.b r3 = r0.f55264z
                fw1.b$b r3 = (fw1.AbstractC14835b.b) r3
                com.whoop.membership.extensions.domain.models.CheckoutPayload r13 = r3.getPayloadV2()
                fw1.b r3 = r0.f55264z
                fw1.b$b r3 = (fw1.AbstractC14835b.b) r3
                java.lang.String r14 = r3.getPromoCode()
                fw1.b r3 = r0.f55264z
                fw1.b$b r3 = (fw1.AbstractC14835b.b) r3
                java.lang.String r16 = r3.getPath()
                r18 = 334(0x14e, float:4.68E-43)
                r19 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 0
                r15 = 0
                r17 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r0.f55263y = r1
                r0.f55262x = r6
                java.lang.Object r3 = r1.emit(r8, r0)
                if (r3 != r2) goto L67
                goto L92
            L67:
                fw1.d r3 = r0.f55260E
                fw1.b r6 = r0.f55264z
                fw1.b$b r6 = (fw1.AbstractC14835b.b) r6
                com.whoop.membership.extensions.domain.models.CheckoutPayload r6 = r6.getPayloadV2()
                fw1.b r8 = r0.f55264z
                fw1.b$b r8 = (fw1.AbstractC14835b.b) r8
                java.lang.String r8 = r8.getPath()
                r0.f55263y = r7
                r0.f55261w = r1
                r0.f55262x = r5
                java.lang.Object r3 = fw1.C14837d.m42668b(r3, r6, r8, r0)
                if (r3 != r2) goto L86
                goto L92
            L86:
                r0.f55263y = r7
                r0.f55261w = r7
                r0.f55262x = r4
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto L93
            L92:
                return r2
            L93:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fw1.d$v */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$4", m100430f = "ExtensionsInteractor.kt", m100431l = {101, 111, 111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14837d f55265E;

        /* JADX INFO: renamed from: w */
        Object f55266w;

        /* JADX INFO: renamed from: x */
        int f55267x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55268y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14835b f55269z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(AbstractC14835b abstractC14835b, C14837d c14837d, InterfaceC30057d<? super v> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55269z = abstractC14835b;
            this.f55265E = c14837d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            v vVar = new v(this.f55269z, this.f55265E, interfaceC30057d);
            vVar.f55268y = obj;
            return vVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        
            if (r1.emit(r3, r21) == r2) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = r0.f55268y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f55267x
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L31
                if (r3 == r6) goto L2d
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                p505ts.AbstractC34132o.m107864I(r22)
                goto La2
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r1 = r0.f55266w
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                p505ts.AbstractC34132o.m107864I(r22)
                r3 = r22
                goto L95
            L2d:
                p505ts.AbstractC34132o.m107864I(r22)
                goto L76
            L31:
                p505ts.AbstractC34132o.m107864I(r22)
                fw1.b r3 = r0.f55269z
                fw1.b$a r3 = (fw1.AbstractC14835b.a) r3
                java.util.List r14 = r3.m42641b()
                fw1.b r3 = r0.f55269z
                fw1.b$a r3 = (fw1.AbstractC14835b.a) r3
                com.whoop.payments.domain.models.Card r15 = r3.getCard()
                fw1.b r3 = r0.f55269z
                fw1.b$a r3 = (fw1.AbstractC14835b.a) r3
                com.whoop.membership.extensions.domain.models.StepPrefetchContent r12 = r3.getStepPrefetchContent()
                fw1.b r3 = r0.f55269z
                fw1.b$a r3 = (fw1.AbstractC14835b.a) r3
                com.whoop.membership.extensions.domain.models.CheckoutPayload r16 = r3.getPayloadV2()
                fw1.b r3 = r0.f55269z
                fw1.b$a r3 = (fw1.AbstractC14835b.a) r3
                java.lang.String r18 = r3.getPath()
                fw1.a r8 = new fw1.a
                r19 = 278(0x116, float:3.9E-43)
                r20 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r13 = 0
                r17 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r0.f55268y = r1
                r0.f55267x = r6
                java.lang.Object r3 = r1.emit(r8, r0)
                if (r3 != r2) goto L76
                goto La1
            L76:
                fw1.d r3 = r0.f55265E
                fw1.b r6 = r0.f55269z
                fw1.b$a r6 = (fw1.AbstractC14835b.a) r6
                com.whoop.membership.extensions.domain.models.CheckoutPayload r6 = r6.getPayloadV2()
                fw1.b r8 = r0.f55269z
                fw1.b$a r8 = (fw1.AbstractC14835b.a) r8
                java.lang.String r8 = r8.getPath()
                r0.f55268y = r7
                r0.f55266w = r1
                r0.f55267x = r5
                java.lang.Object r3 = fw1.C14837d.m42670d(r3, r6, r8, r0)
                if (r3 != r2) goto L95
                goto La1
            L95:
                r0.f55268y = r7
                r0.f55266w = r7
                r0.f55267x = r4
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto La2
            La1:
                return r2
            La2:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fw1.d$w */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$5", m100430f = "ExtensionsInteractor.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55270w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f55271x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14835b f55272y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(AbstractC14835b abstractC14835b, InterfaceC30057d<? super w> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55272y = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            w wVar = new w(this.f55272y, interfaceC30057d);
            wVar.f55271x = obj;
            return wVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f55271x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55270w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14834a c14834a = new C14834a(false, false, null, null, null, ((AbstractC14835b.k) this.f55272y).m42666a(), null, null, null, null, 991, null);
                this.f55271x = null;
                this.f55270w = 1;
                if (interfaceC13062m.emit(c14834a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fw1.d$x */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$6", m100430f = "ExtensionsInteractor.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55273w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f55274x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14835b f55275y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(AbstractC14835b abstractC14835b, InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55275y = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            x xVar = new x(this.f55275y, interfaceC30057d);
            xVar.f55274x = obj;
            return xVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f55274x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55273w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14834a c14834a = new C14834a(false, false, null, null, null, null, ((AbstractC14835b.i) this.f55275y).getCard(), null, null, null, 959, null);
                this.f55274x = null;
                this.f55273w = 1;
                if (interfaceC13062m.emit(c14834a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fw1.d$y */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$8", m100430f = "ExtensionsInteractor.kt", m100431l = {127, 138, 137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14837d f55276E;

        /* JADX INFO: renamed from: w */
        Object f55277w;

        /* JADX INFO: renamed from: x */
        int f55278x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55279y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC14835b f55280z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(AbstractC14835b abstractC14835b, C14837d c14837d, InterfaceC30057d<? super y> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55280z = abstractC14835b;
            this.f55276E = c14837d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            y yVar = new y(this.f55280z, this.f55276E, interfaceC30057d);
            yVar.f55279y = obj;
            return yVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((y) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
        
            if (r6.emit(r0, r22) == r7) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r5 = r22
                java.lang.Object r0 = r5.f55279y
                r6 = r0
                ec3.m r6 = (ec3.InterfaceC13062m) r6
                r83.a r7 = r83.EnumC31071a.f128113w
                int r0 = r5.f55278x
                r8 = 3
                r1 = 2
                r2 = 1
                r9 = 0
                if (r0 == 0) goto L34
                if (r0 == r2) goto L30
                if (r0 == r1) goto L24
                if (r0 != r8) goto L1c
                p505ts.AbstractC34132o.m107864I(r23)
                goto Lb5
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r5.f55277w
                r6 = r0
                ec3.m r6 = (ec3.InterfaceC13062m) r6
                p505ts.AbstractC34132o.m107864I(r23)
                r0 = r23
                goto La8
            L30:
                p505ts.AbstractC34132o.m107864I(r23)
                goto L77
            L34:
                p505ts.AbstractC34132o.m107864I(r23)
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                com.whoop.payments.domain.models.Card r17 = r0.getCard()
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                com.whoop.membership.extensions.domain.models.CheckoutPayload r15 = r0.getPayloadV2()
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                java.lang.String r16 = r0.getPromoCode()
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                java.util.List r19 = r0.m42659b()
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                java.lang.String r18 = r0.getPath()
                fw1.f r10 = new fw1.f
                r20 = 14
                r21 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r5.f55279y = r6
                r5.f55278x = r2
                java.lang.Object r0 = r6.emit(r10, r5)
                if (r0 != r7) goto L77
                goto Lb4
            L77:
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                com.whoop.payments.domain.models.Card r2 = r0.getCard()
                fw1.b r0 = r5.f55280z
                fw1.b$g r0 = (fw1.AbstractC14835b.g) r0
                com.whoop.membership.extensions.domain.models.CheckoutPayload r0 = r0.getPayloadV2()
                fw1.b r3 = r5.f55280z
                fw1.b$g r3 = (fw1.AbstractC14835b.g) r3
                java.lang.String r3 = r3.getPromoCode()
                fw1.b r4 = r5.f55280z
                fw1.b$g r4 = (fw1.AbstractC14835b.g) r4
                java.lang.String r4 = r4.getPath()
                r10 = r0
                fw1.d r0 = r5.f55276E
                r5.f55279y = r9
                r5.f55277w = r6
                r5.f55278x = r1
                r1 = r10
                java.lang.Object r0 = fw1.C14837d.m42667a(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto La8
                goto Lb4
            La8:
                r5.f55279y = r9
                r5.f55277w = r9
                r5.f55278x = r8
                java.lang.Object r0 = r6.emit(r0, r5)
                if (r0 != r7) goto Lb5
            Lb4:
                return r7
            Lb5:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fw1.d$z */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$9", m100430f = "ExtensionsInteractor.kt", m100431l = {148, 149, 151, 155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfw1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC14835b f55281E;

        /* JADX INFO: renamed from: w */
        Object f55282w;

        /* JADX INFO: renamed from: x */
        int f55283x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55284y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(AbstractC14835b abstractC14835b, InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55281E = abstractC14835b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            z zVar = C14837d.this.new z(this.f55281E, interfaceC30057d);
            zVar.f55284y = obj;
            return zVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0077 A[PHI: r3
          0x0077: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v8 java.lang.Object) binds: [B:21:0x0074, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        
            if (r1.emit(r3, r18) == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = r0.f55284y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f55283x
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L37
                if (r3 == r7) goto L33
                if (r3 == r6) goto L2f
                if (r3 == r5) goto L29
                if (r3 != r4) goto L21
                java.lang.Object r1 = r0.f55282w
                fw1.g r1 = (fw1.C14840g) r1
                p505ts.AbstractC34132o.m107864I(r19)
                goto L92
            L21:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L29:
                p505ts.AbstractC34132o.m107864I(r19)
                r3 = r19
                goto L77
            L2f:
                p505ts.AbstractC34132o.m107864I(r19)
                goto L62
            L33:
                p505ts.AbstractC34132o.m107864I(r19)
                goto L55
            L37:
                p505ts.AbstractC34132o.m107864I(r19)
                fw1.g r8 = new fw1.g
                r16 = 126(0x7e, float:1.77E-43)
                r17 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r0.f55284y = r1
                r0.f55283x = r7
                java.lang.Object r3 = r1.emit(r8, r0)
                if (r3 != r2) goto L55
                goto L91
            L55:
                fw1.d r3 = fw1.C14837d.this
                r0.f55284y = r1
                r0.f55283x = r6
                java.lang.Object r3 = fw1.C14837d.m42669c(r3, r0)
                if (r3 != r2) goto L62
                goto L91
            L62:
                fw1.d r3 = fw1.C14837d.this
                fw1.b r6 = r0.f55281E
                fw1.b$e r6 = (fw1.AbstractC14835b.e) r6
                java.lang.String r6 = r6.getPromoCode()
                r0.f55284y = r1
                r0.f55283x = r5
                java.lang.Object r3 = fw1.C14837d.m42672f(r3, r6, r0)
                if (r3 != r2) goto L77
                goto L91
            L77:
                fw1.g r3 = (fw1.C14840g) r3
                fw1.d r5 = fw1.C14837d.this
                ec3.p1 r5 = fw1.C14837d.m42675i(r5)
                ec3.h2 r5 = (ec3.C13045h2) r5
                r5.m36570j(r3)
                r5 = 0
                r0.f55284y = r5
                r0.f55282w = r5
                r0.f55283x = r4
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto L92
            L91:
                return r2
            L92:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fw1.C14837d.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14837d(MembershipExtensionApi membershipApi, InterfaceC34116n logger, InterfaceC16828a stripeManager, AbstractC3076z dispatcher, C31842a membershipRepository, PreferenceHelper preferenceHelper, AbstractC32943y urlProvider, C30695c actionInteractor, C13722a analytics) {
        AbstractC22676k.m65750j(membershipApi, "membershipApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(stripeManager, "stripeManager");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.membershipApi = membershipApi;
        this.logger = logger;
        this.stripeManager = stripeManager;
        this.dispatcher = dispatcher;
        this.membershipRepository = membershipRepository;
        this.preferenceHelper = preferenceHelper;
        this.urlProvider = urlProvider;
        this.actionInteractor = actionInteractor;
        this.analytics = analytics;
        this.latestState = AbstractC13091v.m36593c(new C14840g(true, false, null, null, null, 0, null, 126, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    /* JADX WARN: Code duplicated, block: B:73:0x021e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: m */
    public final Object m42679m(CheckoutPayload checkoutPayload, Card card, String str, String str2, InterfaceC30057d<? super C14839f> interfaceC30057d) {
        b bVar;
        String strM8299l;
        String string;
        Map mapM73993b0;
        CheckoutPayload checkoutPayload2;
        Card card2;
        String str3;
        String str4;
        String str5;
        Map map;
        String newTier;
        String str6;
        CheckoutPayload checkoutPayload3;
        String str7;
        Card card3;
        String str8;
        CheckoutPayload checkoutPayload4;
        String str9;
        String str10;
        CheckoutPayload checkoutPayload5;
        String str11;
        InterfaceC34385a interfaceC34385a;
        CheckoutPayload checkoutPayload6 = checkoutPayload;
        String str12 = str2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f55164J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f55164J = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f55162H;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f55164J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str12);
            CheckoutPayload checkoutPayload7 = checkoutPayload6 != null ? checkoutPayload6 : null;
            if (checkoutPayload7 == null || (string = checkoutPayload7.getSku()) == null) {
                string = checkoutPayload6.toString();
            }
            mapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("payload", AbstractC0770m.m1841c(string)));
            if (str != null) {
                mapM73993b0.put("promo_code", AbstractC0770m.m1841c(str));
            }
            CheckoutPayload checkoutPayload8 = checkoutPayload6 != null ? checkoutPayload6 : null;
            if (checkoutPayload8 != null && (newTier = checkoutPayload8.getNewTier()) != null) {
                mapM73993b0.put("new_tier", AbstractC0770m.m1841c(newTier));
            }
            if (card.isNotEmpty()) {
                bVar2.f55165w = checkoutPayload6;
                bVar2.f55166x = card;
                bVar2.f55167y = str;
                bVar2.f55168z = str12;
                bVar2.f55159E = strM8299l;
                bVar2.f55160F = mapM73993b0;
                bVar2.f55164J = 1;
                Object objM42686t = m42686t(card, bVar2);
                if (objM42686t != obj) {
                    checkoutPayload2 = checkoutPayload6;
                    card2 = card;
                    str3 = str;
                    str4 = str12;
                    str5 = strM8299l;
                    map = mapM73993b0;
                    objM108729b = objM42686t;
                }
            } else {
                JsonObject jsonObject = new JsonObject(mapM73993b0);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                c cVar = new c(strM8299l, jsonObject, null);
                bVar2.f55165w = checkoutPayload6;
                bVar2.f55166x = null;
                bVar2.f55167y = null;
                bVar2.f55168z = str12;
                bVar2.f55159E = null;
                bVar2.f55160F = null;
                bVar2.f55161G = null;
                bVar2.f55164J = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
                if (objM108729b != obj) {
                    checkoutPayload4 = checkoutPayload6;
                    str9 = str12;
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        InterfaceC34385a.c cVar2 = (InterfaceC34385a.c) interfaceC34385a;
                        return new C14839f(false, ((ProgressContent) cVar2.m108735a()).getType() != ProgressContentType.SUCCESS, null, (ProgressContent) cVar2.m108735a(), checkoutPayload4, null, null, str9, null, 357, null);
                    }
                    if (interfaceC34385a instanceof InterfaceC34385a.b) {
                        return new C14839f(false, true, null, null, checkoutPayload4, null, null, str9, null, 365, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return obj;
        }
        if (i14 == 1) {
            Map map2 = (Map) bVar2.f55160F;
            String str13 = (String) bVar2.f55159E;
            String str14 = (String) bVar2.f55168z;
            String str15 = (String) bVar2.f55167y;
            Card card4 = (Card) bVar2.f55166x;
            CheckoutPayload checkoutPayload9 = (CheckoutPayload) bVar2.f55165w;
            AbstractC34132o.m107864I(objM108729b);
            str4 = str14;
            str3 = str15;
            card2 = card4;
            checkoutPayload2 = checkoutPayload9;
            str5 = str13;
            map = map2;
        } else {
            if (i14 == 2) {
                str6 = (String) bVar2.f55161G;
                map = (Map) bVar2.f55160F;
                str5 = (String) bVar2.f55159E;
                String str16 = (String) bVar2.f55168z;
                str7 = (String) bVar2.f55167y;
                Card card5 = (Card) bVar2.f55166x;
                checkoutPayload3 = (CheckoutPayload) bVar2.f55165w;
                AbstractC34132o.m107864I(objM108729b);
                str8 = str16;
                card3 = card5;
                str10 = str7;
                checkoutPayload5 = checkoutPayload3;
                str11 = (String) objM108729b;
                if (str11 == null) {
                    return new C14839f(false, true, null, null, checkoutPayload5, str10, card3, str8, null, 269, null);
                }
                map.put("payment_method_id", AbstractC0770m.m1841c(str11));
                map.put("card_token", AbstractC0770m.m1841c(str6));
                mapM73993b0 = map;
                strM8299l = str5;
                checkoutPayload6 = checkoutPayload5;
                str12 = str8;
                JsonObject jsonObject2 = new JsonObject(mapM73993b0);
                InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n2 = this.logger;
                c cVar3 = new c(strM8299l, jsonObject2, null);
                bVar2.f55165w = checkoutPayload6;
                bVar2.f55166x = null;
                bVar2.f55167y = null;
                bVar2.f55168z = str12;
                bVar2.f55159E = null;
                bVar2.f55160F = null;
                bVar2.f55161G = null;
                bVar2.f55164J = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, cVar3, bVar2, 6, null);
                if (objM108729b != obj) {
                    checkoutPayload4 = checkoutPayload6;
                    str9 = str12;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str17 = (String) bVar2.f55168z;
            CheckoutPayload checkoutPayload10 = (CheckoutPayload) bVar2.f55165w;
            AbstractC34132o.m107864I(objM108729b);
            str9 = str17;
            checkoutPayload4 = checkoutPayload10;
        }
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar4 = (InterfaceC34385a.c) interfaceC34385a;
            return new C14839f(false, ((ProgressContent) cVar4.m108735a()).getType() != ProgressContentType.SUCCESS, null, (ProgressContent) cVar4.m108735a(), checkoutPayload4, null, null, str9, null, 357, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14839f(false, true, null, null, checkoutPayload4, null, null, str9, null, 365, null);
        }
        throw new NoWhenBranchMatchedException();
        str6 = (String) objM108729b;
        if (str6 == null) {
            return new C14839f(false, true, null, null, checkoutPayload2, str3, card2, str4, null, 269, null);
        }
        checkoutPayload3 = checkoutPayload2;
        str7 = str3;
        Card card6 = card2;
        String str18 = str4;
        bVar2.f55165w = checkoutPayload3;
        bVar2.f55166x = card6;
        bVar2.f55167y = str7;
        bVar2.f55168z = str18;
        bVar2.f55159E = str5;
        bVar2.f55160F = map;
        bVar2.f55161G = str6;
        bVar2.f55164J = 2;
        Object objM42687u = m42687u(str6, bVar2);
        if (objM42687u != obj) {
            card3 = card6;
            str8 = str18;
            objM108729b = objM42687u;
            str10 = str7;
            checkoutPayload5 = checkoutPayload3;
            str11 = (String) objM108729b;
            if (str11 == null) {
                return new C14839f(false, true, null, null, checkoutPayload5, str10, card3, str8, null, 269, null);
            }
            map.put("payment_method_id", AbstractC0770m.m1841c(str11));
            map.put("card_token", AbstractC0770m.m1841c(str6));
            mapM73993b0 = map;
            strM8299l = str5;
            checkoutPayload6 = checkoutPayload5;
            str12 = str8;
            JsonObject jsonObject3 = new JsonObject(mapM73993b0);
            InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n3 = this.logger;
            c cVar5 = new c(strM8299l, jsonObject3, null);
            bVar2.f55165w = checkoutPayload6;
            bVar2.f55166x = null;
            bVar2.f55167y = null;
            bVar2.f55168z = str12;
            bVar2.f55159E = null;
            bVar2.f55160F = null;
            bVar2.f55161G = null;
            bVar2.f55164J = 3;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, null, cVar5, bVar2, 6, null);
            if (objM108729b != obj) {
                checkoutPayload4 = checkoutPayload6;
                str9 = str12;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    InterfaceC34385a.c cVar6 = (InterfaceC34385a.c) interfaceC34385a;
                    return new C14839f(false, ((ProgressContent) cVar6.m108735a()).getType() != ProgressContentType.SUCCESS, null, (ProgressContent) cVar6.m108735a(), checkoutPayload4, null, null, str9, null, 357, null);
                }
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return new C14839f(false, true, null, null, checkoutPayload4, null, null, str9, null, 365, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: n */
    public final Object m42680n(CheckoutPayload checkoutPayload, String str, InterfaceC30057d<? super C14839f> interfaceC30057d) {
        d dVar;
        CheckoutPayload checkoutPayload2;
        String str2 = str;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f55188F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f55188F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f55192z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f55188F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str2);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(strM8299l, null);
            dVar2.f55189w = checkoutPayload;
            dVar2.f55190x = str2;
            dVar2.f55191y = null;
            dVar2.f55188F = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            checkoutPayload2 = checkoutPayload;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) dVar2.f55190x;
            CheckoutPayload checkoutPayload3 = (CheckoutPayload) dVar2.f55189w;
            AbstractC34132o.m107864I(obj);
            checkoutPayload2 = checkoutPayload3;
        }
        String str3 = str2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            return new C14839f(false, ((ProgressContent) cVar.m108735a()).getType() != ProgressContentType.SUCCESS, null, (ProgressContent) cVar.m108735a(), checkoutPayload2, null, null, str3, null, 357, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14839f(false, true, null, null, checkoutPayload2, null, null, str3, null, 365, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m42681o(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM98950u;
        return (this.preferenceHelper.mainPrefsContains(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS) || (objM98950u = this.membershipRepository.m98950u(interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM98950u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: p */
    public final Object m42682p(CheckoutPayload checkoutPayload, String str, InterfaceC30057d<? super C14834a> interfaceC30057d) {
        f fVar;
        CheckoutPayload checkoutPayload2;
        String str2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f55197F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f55197F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f55201z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f55197F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(strM8299l, checkoutPayload, null);
            fVar2.f55198w = checkoutPayload;
            fVar2.f55199x = str;
            fVar2.f55200y = null;
            fVar2.f55197F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, gVar, fVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            checkoutPayload2 = checkoutPayload;
            str2 = str;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) fVar2.f55199x;
            CheckoutPayload checkoutPayload3 = (CheckoutPayload) fVar2.f55198w;
            AbstractC34132o.m107864I(objM108729b);
            str2 = str3;
            checkoutPayload2 = checkoutPayload3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C14834a(false, false, null, null, (NativeOrderResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, null, checkoutPayload2, null, str2, 367, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14834a(false, true, null, null, null, null, null, checkoutPayload2, null, str2, 381, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: q */
    public final Object m42683q(Map<String, String> map, String str, String str2, InterfaceC30057d<? super C14834a> interfaceC30057d) {
        h hVar;
        Map<String, String> map2;
        String str3;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f55208G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f55208G = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108729b = hVar2.f55206E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f55208G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str2);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(strM8299l, map, null);
            hVar2.f55209w = map;
            hVar2.f55210x = null;
            hVar2.f55211y = str2;
            hVar2.f55212z = null;
            hVar2.f55208G = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, iVar, hVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            map2 = map;
            str3 = str2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) hVar2.f55211y;
            Map<String, String> map3 = (Map) hVar2.f55209w;
            AbstractC34132o.m107864I(objM108729b);
            str3 = str4;
            map2 = map3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C14834a(false, false, null, null, (NativeOrderResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, null, null, map2, str3, 239, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14834a(false, true, null, null, null, null, null, null, map2, null, 765, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m42684r(String str, InterfaceC30057d<? super C14840g> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f55220z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f55220z = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM108729b = jVar2.f55218x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar2.f55220z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            k kVar = new k(null);
            jVar2.f55217w = str;
            jVar2.f55220z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, kVar, jVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) jVar2.f55217w;
            AbstractC34132o.m107864I(objM108729b);
        }
        String str2 = str;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            return new C14840g(false, false, (ReactivationUpsellLandingResponse) cVar.m108735a(), str2, null, ((ReactivationUpsellLandingResponse) cVar.m108735a()).getInitiallySelectedSegmentIndex(), null, 83, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14840g(false, true, null, null, null, 0, null, 125, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m42685s(String str, InterfaceC30057d<? super C14838e> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f55226z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f55226z = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        l lVar2 = lVar;
        Object objM108729b = lVar2.f55224x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar2.f55226z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            m mVar = new m(str, null);
            lVar2.f55223w = str;
            lVar2.f55226z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, mVar, lVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) lVar2.f55223w;
            AbstractC34132o.m107864I(objM108729b);
        }
        String str2 = str;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.analytics.m38894u();
            return new C14838e(false, false, (ExtensionsV2LandingResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), str2, null, null, false, 115, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new C14838e(false, true, null, null, null, null, false, 125, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    private final Object m42686t(Card card, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new n(card, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: u */
    private final Object m42687u(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new o(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC14836c m42688w(AbstractC30694b state, EnumC14841h landingType) {
        boolean z4;
        boolean z13 = state instanceof AbstractC30694b.d;
        AbstractC30694b.d dVar = z13 ? (AbstractC30694b.d) state : null;
        C9598e destination = dVar != null ? dVar.getDestination() : null;
        if ((state instanceof AbstractC30694b.c) || (state instanceof AbstractC30694b.i) || z13) {
            z4 = true;
        } else {
            if (!(state instanceof AbstractC30694b.n) && !(state instanceof AbstractC30694b.f) && !(state instanceof AbstractC30694b.g) && !(state instanceof AbstractC30694b.b) && !(state instanceof AbstractC30694b.m) && !(state instanceof AbstractC30694b.l) && !(state instanceof AbstractC30694b.k) && !(state instanceof AbstractC30694b.j) && !(state instanceof AbstractC30694b.e) && !(state instanceof AbstractC30694b.h) && !(state instanceof AbstractC30694b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = false;
        }
        int i13 = a.f55155a[landingType.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return new C14838e(z4, !z4, null, null, null, destination, false, 92, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        Object value = ((C13045h2) this.latestState).getValue();
        C14840g c14840g = value instanceof C14840g ? (C14840g) value : null;
        return C14840g.m42706d(c14840g == null ? new C14840g(false, false, null, null, null, 0, null, 127, null) : c14840g, z4, state instanceof AbstractC30694b.a, null, null, null, 0, destination, 60, null);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m42689v(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C14838e(false, false, null, null, null, null, false, 127, null), AbstractC13091v.m36590P(upstream, new p(null, this)), new a0(null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14837d(MembershipExtensionApi membershipExtensionApi, InterfaceC34116n interfaceC34116n, InterfaceC16828a interfaceC16828a, AbstractC3076z abstractC3076z, C31842a c31842a, PreferenceHelper preferenceHelper, AbstractC32943y abstractC32943y, C30695c c30695c, C13722a c13722a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ExtensionsInteractor") : interfaceC34116n;
        if ((i13 & 8) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(membershipExtensionApi, interfaceC34116nM107848a, interfaceC16828a, abstractC3076z, c31842a, preferenceHelper, abstractC32943y, c30695c, c13722a);
    }
}

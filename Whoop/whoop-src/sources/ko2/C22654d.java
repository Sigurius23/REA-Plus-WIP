package ko2;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0764g;
import c93.InterfaceC4351m;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.universalcheckout.features.checkout.domain.CheckoutApi;
import com.whoop.universalcheckout.features.checkout.domain.DynamicGetUniversalCheckoutRequest;
import com.whoop.universalcheckout.features.checkout.domain.PostUniversalCheckoutRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.ApplyPromoCodeRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.ErrorResponse;
import com.whoop.universalcheckout.features.checkout.domain.models.GetUniversalCheckoutRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetConfiguration;
import com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetIntentConfiguration;
import com.whoop.universalcheckout.features.checkout.domain.models.ProcessCheckoutRequestBody;
import com.whoop.universalcheckout.features.checkout.domain.models.SwitchAnnualCheckboxRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import ho2.C17538a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21177x0;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import jo2.C21842e;
import km2.C22594e;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import mn2.EnumC25719b;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import po2.InterfaceC29402a;
import q20.C29814e;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s82.C32266a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import u82.AbstractC34647h;
import w02.C36684a;
import wc3.InterfaceC37138c;
import xm0.C38458b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ko2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BY\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J7\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010.J5\u00102\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103J$\u00105\u001a\u00020\u0003*\u00020\u00032\u0006\u0010#\u001a\u00020 2\u0006\u00104\u001a\u00020 H\u0082@¢\u0006\u0004\b5\u00106J$\u00108\u001a\u00020\u0003*\u00020\u00032\u0006\u0010#\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0082@¢\u0006\u0004\b8\u00106J\u001c\u0010:\u001a\u00020\u0003*\u00020\u00032\u0006\u00109\u001a\u00020%H\u0082@¢\u0006\u0004\b:\u0010;J\u001c\u0010=\u001a\u00020\u0003*\u00020\u00032\u0006\u0010<\u001a\u00020 H\u0082@¢\u0006\u0004\b=\u0010>J)\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020 H\u0002¢\u0006\u0004\bE\u0010FJ1\u0010H\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u0002000G2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 H\u0002¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0'2\u0006\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010#\u001a\u00020 2\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002¢\u0006\u0004\bL\u0010MJ#\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030'2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006e"}, m65681d2 = {"Lko2/d;", "Lod1/g;", "Lko2/b;", "Lko2/c;", "Lnm0/e;", "cachedApiSource", "Lxm0/b;", "cacheUpdater", "Ljo2/e;", "stripeFlowControllerManager", "Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;", "checkoutApi", "Lho2/a;", "analyticsHelper", "Lw02/a;", "errorBodyParser", "Ls82/a;", "seonManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/coordinator/BannerInvalidator;", "bannerInvalidator", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lxm0/b;Ljo2/e;Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;Lho2/a;Lw02/a;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/coordinator/BannerInvalidator;Ltr2/n;)V", "previousState", "action", "r", "(Lko2/c;Lko2/b;Lq83/d;)Ljava/lang/Object;", "l", "(Lko2/c;)Lko2/c;", "", "dynamicPath", "dynamicPayload", "cartId", "method", "", "manualRefresh", "Lec3/l;", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "x", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "payload", "n", "(Ljava/lang/String;)Ljava/lang/String;", "Lpm0/a;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "cacheResult", "q", "(Lpm0/a;Ljava/lang/String;Ljava/lang/String;Z)Lko2/c;", "promoCode", "k", "(Lko2/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "codeId", "z", "enableAnnual", "t", "(Lko2/c;ZLq83/d;)Ljava/lang/Object;", "path", "y", "(Lko2/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "paymentSheetConfiguration", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "paymentSheetIntentConfiguration", "stripeToken", "", "m", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;)Ljava/lang/Long;", "Lpm0/a$c;", "s", "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lko2/c;", "p", "(Ljava/lang/String;)Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lxm0/b;", "c", "Ljo2/e;", "d", "Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;", "e", "Lho2/a;", "f", "Lw02/a;", "g", "Ls82/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "Lcom/whoop/data/coordinator/BannerInvalidator;", "j", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22654d implements InterfaceC27844g<AbstractC22652b, C22653c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21842e stripeFlowControllerManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CheckoutApi checkoutApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17538a analyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36684a errorBodyParser;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final BannerInvalidator bannerInvalidator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ko2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {432, 455}, m100432m = "applyPromoCodeToCart", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f89174E;

        /* JADX INFO: renamed from: G */
        int f89176G;

        /* JADX INFO: renamed from: w */
        Object f89177w;

        /* JADX INFO: renamed from: x */
        Object f89178x;

        /* JADX INFO: renamed from: y */
        Object f89179y;

        /* JADX INFO: renamed from: z */
        Object f89180z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89174E = obj;
            this.f89176G |= Integer.MIN_VALUE;
            return C22654d.this.m65658k(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ko2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$applyPromoCodeToCart$response$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {433}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89181w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89183y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f89184z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f89183y = str;
            this.f89184z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22654d.this.new b(this.f89183y, this.f89184z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89181w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CheckoutApi checkoutApi = C22654d.this.checkoutApi;
            ApplyPromoCodeRequest applyPromoCodeRequest = new ApplyPromoCodeRequest(this.f89183y, this.f89184z);
            this.f89181w = 1;
            Object objApplyPromoCode = checkoutApi.applyPromoCode(applyPromoCodeRequest, this);
            return objApplyPromoCode == enumC31071a ? enumC31071a : objApplyPromoCode;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ko2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$fetchCartDetails$$inlined$cacheAPI$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89185w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89186x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89187y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89188z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89188z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f89188z);
            cVar.f89186x = interfaceC13062m;
            cVar.f89187y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89185w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89186x;
                C26832c c26832c = (C26832c) this.f89187y;
                InterfaceC26834e interfaceC26834e = this.f89188z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(UniversalCheckoutResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(UniversalCheckoutResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f89186x = null;
                this.f89187y = null;
                this.f89185w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ko2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {203, 210, 225, 233, 281, 295}, m100432m = "handleDomainAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f89189E;

        /* JADX INFO: renamed from: w */
        Object f89190w;

        /* JADX INFO: renamed from: x */
        Object f89191x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89192y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89192y = obj;
            this.f89189E |= Integer.MIN_VALUE;
            return C22654d.this.m65665r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ko2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {508, 525}, m100432m = "handleToggleAnnualCheckbox", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f89194E;

        /* JADX INFO: renamed from: G */
        int f89196G;

        /* JADX INFO: renamed from: w */
        Object f89197w;

        /* JADX INFO: renamed from: x */
        Object f89198x;

        /* JADX INFO: renamed from: y */
        Object f89199y;

        /* JADX INFO: renamed from: z */
        boolean f89200z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89194E = obj;
            this.f89196G |= Integer.MIN_VALUE;
            return C22654d.this.m65667t(null, false, this);
        }
    }

    /* JADX INFO: renamed from: ko2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$handleToggleAnnualCheckbox$response$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {509}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89201w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89203y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f89204z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z4, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f89203y = str;
            this.f89204z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22654d.this.new f(this.f89203y, this.f89204z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89201w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CheckoutApi checkoutApi = C22654d.this.checkoutApi;
            SwitchAnnualCheckboxRequest switchAnnualCheckboxRequest = new SwitchAnnualCheckboxRequest(this.f89203y, this.f89204z);
            this.f89201w = 1;
            Object obj2 = checkoutApi.toggleAnnualCheckbox(switchAnnualCheckboxRequest, this);
            return obj2 == enumC31071a ? enumC31071a : obj2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ko2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89205w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89206x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89207y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22654d f89208z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C22654d c22654d) {
            super(3, interfaceC30057d);
            this.f89208z = c22654d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC22652b abstractC22652b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f89208z);
            gVar.f89206x = interfaceC13062m;
            gVar.f89207y = abstractC22652b;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89205w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89206x;
                AbstractC22652b abstractC22652b = (AbstractC22652b) this.f89207y;
                if (abstractC22652b instanceof AbstractC22652b.g) {
                    AbstractC22652b.g gVar = (AbstractC22652b.g) abstractC22652b;
                    c13084s1 = AbstractC13091v.m36590P(C22654d.m65669v(this.f89208z, gVar.getDynamicPath(), gVar.getDynamicPayload(), gVar.getCartId(), gVar.getMethod(), false, 16, null), new p(null, abstractC22652b));
                } else if (abstractC22652b instanceof AbstractC22652b.a) {
                    c13084s1 = new C13084s1(new i(abstractC22652b, null));
                } else if (abstractC22652b instanceof AbstractC22652b.m) {
                    c13084s1 = new C13084s1(new j(abstractC22652b, null));
                } else if (abstractC22652b instanceof AbstractC22652b.r) {
                    c13084s1 = new C13084s1(new k(abstractC22652b, null));
                } else if (abstractC22652b instanceof AbstractC22652b.j) {
                    c13084s1 = new C13084s1(new l(abstractC22652b, null));
                } else {
                    c13084s1 = abstractC22652b instanceof AbstractC22652b.k ? new C13084s1(new m(abstractC22652b, null)) : new C13084s1(new n(abstractC22652b, null));
                }
                this.f89206x = null;
                this.f89207y = null;
                this.f89205w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC22652b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ko2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$1$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89209w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89210x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22653c f89211y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC22652b f89212z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C22653c c22653c, AbstractC22652b abstractC22652b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89211y = c22653c;
            this.f89212z = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f89211y, this.f89212z, interfaceC30057d);
            hVar.f89210x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89210x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89209w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC22655e.a aVar = new AbstractC22655e.a(this.f89211y, ((AbstractC22652b.g) this.f89212z).getSource(), ((AbstractC22652b.g) this.f89212z).getAutoTrigger());
                this.f89210x = null;
                this.f89209w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ko2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {87, 88}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89213w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89214x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89215y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC22652b abstractC22652b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89215y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f89215y, interfaceC30057d);
            iVar.f89214x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89214x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89213w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ko2.e$b r6 = new ko2.e$b
                ko2.b$l r2 = ko2.AbstractC22652b.l.f89137a
                r6.<init>(r2)
                r5.f89214x = r0
                r5.f89213w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                ko2.e$b r6 = new ko2.e$b
                ko2.b r2 = r5.f89215y
                r6.<init>(r2)
                r2 = 0
                r5.f89214x = r2
                r5.f89213w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ko2.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$3", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {94, 95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89216w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89217x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89218y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC22652b abstractC22652b, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89218y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f89218y, interfaceC30057d);
            jVar.f89217x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89217x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89216w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ko2.e$b r6 = new ko2.e$b
                ko2.b$l r2 = ko2.AbstractC22652b.l.f89137a
                r6.<init>(r2)
                r5.f89217x = r0
                r5.f89216w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                ko2.e$b r6 = new ko2.e$b
                ko2.b r2 = r5.f89218y
                r6.<init>(r2)
                r2 = 0
                r5.f89217x = r2
                r5.f89216w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ko2.d$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$4", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {101, 102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89219w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89220x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89221y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC22652b abstractC22652b, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89221y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(this.f89221y, interfaceC30057d);
            kVar.f89220x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89220x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89219w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ko2.e$b r6 = new ko2.e$b
                ko2.b$n r2 = ko2.AbstractC22652b.n.f89140a
                r6.<init>(r2)
                r5.f89220x = r0
                r5.f89219w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                ko2.e$b r6 = new ko2.e$b
                ko2.b r2 = r5.f89221y
                r6.<init>(r2)
                r2 = 0
                r5.f89220x = r2
                r5.f89219w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ko2.d$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$5", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {108, 109}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89222w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89223x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC22652b abstractC22652b, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89224y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = new l(this.f89224y, interfaceC30057d);
            lVar.f89223x = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89223x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89222w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ko2.e$b r6 = new ko2.e$b
                ko2.b$o r2 = ko2.AbstractC22652b.o.f89141a
                r6.<init>(r2)
                r5.f89223x = r0
                r5.f89222w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                ko2.e$b r6 = new ko2.e$b
                ko2.b r2 = r5.f89224y
                r6.<init>(r2)
                r2 = 0
                r5.f89223x = r2
                r5.f89222w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ko2.d$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$6", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {115, 116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89225w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89226x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89227y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractC22652b abstractC22652b, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89227y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m mVar = new m(this.f89227y, interfaceC30057d);
            mVar.f89226x = obj;
            return mVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89226x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89225w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ko2.e$b r6 = new ko2.e$b
                ko2.b$o r2 = ko2.AbstractC22652b.o.f89141a
                r6.<init>(r2)
                r5.f89226x = r0
                r5.f89225w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                ko2.e$b r6 = new ko2.e$b
                ko2.b r2 = r5.f89227y
                r6.<init>(r2)
                r2 = 0
                r5.f89226x = r2
                r5.f89225w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ko2.d$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$1$7", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lko2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89228w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89229x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22652b f89230y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC22652b abstractC22652b, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89230y = abstractC22652b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = new n(this.f89230y, interfaceC30057d);
            nVar.f89229x = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89229x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89228w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC22655e.b bVar = new AbstractC22655e.b(this.f89230y);
                this.f89229x = null;
                this.f89228w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ko2.d$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lko2/c;", "previousState", "Lko2/e;", "action", "<anonymous>", "(Lko2/c;Lko2/e;)Lko2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89231w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89232x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89233y;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22653c c22653c, AbstractC22655e abstractC22655e, InterfaceC30057d<? super C22653c> interfaceC30057d) {
            o oVar = C22654d.this.new o(interfaceC30057d);
            oVar.f89232x = c22653c;
            oVar.f89233y = abstractC22655e;
            return oVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM65665r;
            C22653c c22653c = (C22653c) this.f89232x;
            AbstractC22655e abstractC22655e = (AbstractC22655e) this.f89233y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89231w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC22655e instanceof AbstractC22655e.b)) {
                    if (!(abstractC22655e instanceof AbstractC22655e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC22655e.a aVar = (AbstractC22655e.a) abstractC22655e;
                    C22653c domainState = aVar.getDomainState();
                    String cartId = aVar.getDomainState().getCartId();
                    if (cartId.length() <= 0) {
                        cartId = null;
                    }
                    if (cartId == null) {
                        cartId = c22653c.getCartId();
                    }
                    String str = cartId;
                    UniversalCheckoutResponse response = aVar.getDomainState().getResponse();
                    if (response == null) {
                        response = c22653c.getResponse();
                    }
                    UniversalCheckoutResponse universalCheckoutResponse = response;
                    String dynamicPayload = aVar.getDomainState().getDynamicPayload();
                    if (dynamicPayload.length() <= 0) {
                        dynamicPayload = null;
                    }
                    if (dynamicPayload == null) {
                        dynamicPayload = c22653c.getDynamicPayload();
                    }
                    String str2 = dynamicPayload;
                    String dynamicPath = aVar.getDomainState().getDynamicPath();
                    String dynamicPath2 = dynamicPath.length() > 0 ? dynamicPath : null;
                    if (dynamicPath2 == null) {
                        dynamicPath2 = c22653c.getDynamicPath();
                    }
                    String str3 = dynamicPath2;
                    boolean orderDetailsIsExpanded = EnumC25719b.INSTANCE.m75836a(String.valueOf(aVar.getSource())).getAutoExpandsOrderDetails() ? true : c22653c.getOrderDetailsIsExpanded();
                    boolean promoCodeInputIsExpanded = c22653c.getPromoCodeInputIsExpanded();
                    String source = aVar.getSource();
                    if (source == null) {
                        source = c22653c.getSource();
                    }
                    String str4 = source;
                    EnumC21177x0 autoTrigger = aVar.getAutoTrigger();
                    if (autoTrigger == null) {
                        autoTrigger = c22653c.getAutoTrigger();
                    }
                    return C22653c.m65632b(domainState, str2, str3, str, null, universalCheckoutResponse, false, false, orderDetailsIsExpanded, null, promoCodeInputIsExpanded, false, null, false, str4, autoTrigger, c22653c.getHasAutoTriggered(), null, 73064, null);
                }
                C22654d c22654d = C22654d.this;
                AbstractC22652b domainAction = ((AbstractC22655e.b) abstractC22655e).getDomainAction();
                this.f89232x = null;
                this.f89233y = null;
                this.f89231w = 1;
                objM65665r = c22654d.m65665r(c22653c, domainAction, this);
                if (objM65665r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM65665r = obj;
            }
            return (C22653c) objM65665r;
        }
    }

    /* JADX INFO: renamed from: ko2.d$p */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89235w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89236x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89237y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC22652b f89238z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC30057d interfaceC30057d, AbstractC22652b abstractC22652b) {
            super(3, interfaceC30057d);
            this.f89238z = abstractC22652b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C22653c c22653c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            p pVar = new p(interfaceC30057d, this.f89238z);
            pVar.f89236x = interfaceC13062m;
            pVar.f89237y = c22653c;
            return pVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89235w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89236x;
                C13084s1 c13084s1 = new C13084s1(new h((C22653c) this.f89237y, this.f89238z, null));
                this.f89236x = null;
                this.f89237y = null;
                this.f89235w = 1;
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
            return invoke((InterfaceC13062m) obj, (C22653c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ko2.d$q */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f89239E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89240w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22654d f89241x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89242y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f89243z;

        /* JADX INFO: renamed from: ko2.d$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f89244E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89245w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22654d f89246x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f89247y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f89248z;

            /* JADX INFO: renamed from: ko2.d$q$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$loadUniversalCheckoutUsingCartId$$inlined$map$1$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41915a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89249E;

                /* JADX INFO: renamed from: F */
                Object f89250F;

                /* JADX INFO: renamed from: G */
                Object f89251G;

                /* JADX INFO: renamed from: H */
                int f89252H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89253w;

                /* JADX INFO: renamed from: x */
                int f89254x;

                /* JADX INFO: renamed from: y */
                Object f89255y;

                public C41915a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89253w = obj;
                    this.f89254x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22654d c22654d, String str, String str2, boolean z4) {
                this.f89245w = interfaceC13062m;
                this.f89246x = c22654d;
                this.f89247y = str;
                this.f89248z = str2;
                this.f89244E = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41915a c41915a;
                if (interfaceC30057d instanceof C41915a) {
                    c41915a = (C41915a) interfaceC30057d;
                    int i13 = c41915a.f89254x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41915a.f89254x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41915a = new C41915a(interfaceC30057d);
                    }
                } else {
                    c41915a = new C41915a(interfaceC30057d);
                }
                Object obj2 = c41915a.f89253w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41915a.f89254x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89245w;
                    C22653c c22653cM65664q = this.f89246x.m65664q((InterfaceC29354a) obj, this.f89247y, this.f89248z, this.f89244E);
                    c41915a.f89255y = null;
                    c41915a.f89249E = null;
                    c41915a.f89250F = null;
                    c41915a.f89251G = null;
                    c41915a.f89252H = 0;
                    c41915a.f89254x = 1;
                    if (interfaceC13062m.emit(c22653cM65664q, c41915a) == enumC31071a) {
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

        public q(InterfaceC13058l interfaceC13058l, C22654d c22654d, String str, String str2, boolean z4) {
            this.f89240w = interfaceC13058l;
            this.f89241x = c22654d;
            this.f89242y = str;
            this.f89243z = str2;
            this.f89239E = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89240w.collect(new a(interfaceC13062m, this.f89241x, this.f89242y, this.f89243z, this.f89239E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ko2.d$r */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$loadUniversalCheckoutUsingPayload$$inlined$cacheAPI$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89257w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89258x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89259y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89260z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89260z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            r rVar = new r(interfaceC30057d, this.f89260z);
            rVar.f89258x = interfaceC13062m;
            rVar.f89259y = c26832c;
            return rVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89257w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89258x;
                C26832c c26832c = (C26832c) this.f89259y;
                InterfaceC26834e interfaceC26834e = this.f89260z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(UniversalCheckoutResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(UniversalCheckoutResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f89258x = null;
                this.f89259y = null;
                this.f89257w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ko2.d$s */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$loadUniversalCheckoutUsingPayload$$inlined$cacheAPI$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89261w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89262x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89263y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89264z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89264z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<String> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            s sVar = new s(interfaceC30057d, this.f89264z);
            sVar.f89262x = interfaceC13062m;
            sVar.f89263y = c26832c;
            return sVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89261w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89262x;
                C26832c c26832c = (C26832c) this.f89263y;
                InterfaceC26834e interfaceC26834e = this.f89264z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(String.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(String.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(UniversalCheckoutResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(UniversalCheckoutResponse.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f89262x = null;
                this.f89263y = null;
                this.f89261w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<String>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ko2.d$t */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f89265E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89266w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22654d f89267x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89268y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f89269z;

        /* JADX INFO: renamed from: ko2.d$t$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f89270E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89271w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22654d f89272x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f89273y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f89274z;

            /* JADX INFO: renamed from: ko2.d$t$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$loadUniversalCheckoutUsingPayload$$inlined$map$1$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41916a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89275E;

                /* JADX INFO: renamed from: F */
                Object f89276F;

                /* JADX INFO: renamed from: G */
                Object f89277G;

                /* JADX INFO: renamed from: H */
                int f89278H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89279w;

                /* JADX INFO: renamed from: x */
                int f89280x;

                /* JADX INFO: renamed from: y */
                Object f89281y;

                public C41916a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89279w = obj;
                    this.f89280x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22654d c22654d, String str, String str2, boolean z4) {
                this.f89271w = interfaceC13062m;
                this.f89272x = c22654d;
                this.f89273y = str;
                this.f89274z = str2;
                this.f89270E = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41916a c41916a;
                if (interfaceC30057d instanceof C41916a) {
                    c41916a = (C41916a) interfaceC30057d;
                    int i13 = c41916a.f89280x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41916a.f89280x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41916a = new C41916a(interfaceC30057d);
                    }
                } else {
                    c41916a = new C41916a(interfaceC30057d);
                }
                Object obj2 = c41916a.f89279w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41916a.f89280x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89271w;
                    C22653c c22653cM65664q = this.f89272x.m65664q((InterfaceC29354a) obj, this.f89273y, this.f89274z, this.f89270E);
                    c41916a.f89281y = null;
                    c41916a.f89275E = null;
                    c41916a.f89276F = null;
                    c41916a.f89277G = null;
                    c41916a.f89278H = 0;
                    c41916a.f89280x = 1;
                    if (interfaceC13062m.emit(c22653cM65664q, c41916a) == enumC31071a) {
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

        public t(InterfaceC13058l interfaceC13058l, C22654d c22654d, String str, String str2, boolean z4) {
            this.f89266w = interfaceC13058l;
            this.f89267x = c22654d;
            this.f89268y = str;
            this.f89269z = str2;
            this.f89265E = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89266w.collect(new a(interfaceC13062m, this.f89267x, this.f89268y, this.f89269z, this.f89265E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ko2.d$u */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f89283E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89284w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22654d f89285x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89286y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f89287z;

        /* JADX INFO: renamed from: ko2.d$u$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f89288E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89289w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22654d f89290x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f89291y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f89292z;

            /* JADX INFO: renamed from: ko2.d$u$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$loadUniversalCheckoutUsingPayload$$inlined$map$2$2", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41917a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89293E;

                /* JADX INFO: renamed from: F */
                Object f89294F;

                /* JADX INFO: renamed from: G */
                Object f89295G;

                /* JADX INFO: renamed from: H */
                int f89296H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89297w;

                /* JADX INFO: renamed from: x */
                int f89298x;

                /* JADX INFO: renamed from: y */
                Object f89299y;

                public C41917a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89297w = obj;
                    this.f89298x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22654d c22654d, String str, String str2, boolean z4) {
                this.f89289w = interfaceC13062m;
                this.f89290x = c22654d;
                this.f89291y = str;
                this.f89292z = str2;
                this.f89288E = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41917a c41917a;
                if (interfaceC30057d instanceof C41917a) {
                    c41917a = (C41917a) interfaceC30057d;
                    int i13 = c41917a.f89298x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41917a.f89298x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41917a = new C41917a(interfaceC30057d);
                    }
                } else {
                    c41917a = new C41917a(interfaceC30057d);
                }
                Object obj2 = c41917a.f89297w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41917a.f89298x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89289w;
                    C22653c c22653cM65664q = this.f89290x.m65664q((InterfaceC29354a) obj, this.f89291y, this.f89292z, this.f89288E);
                    c41917a.f89299y = null;
                    c41917a.f89293E = null;
                    c41917a.f89294F = null;
                    c41917a.f89295G = null;
                    c41917a.f89296H = 0;
                    c41917a.f89298x = 1;
                    if (interfaceC13062m.emit(c22653cM65664q, c41917a) == enumC31071a) {
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

        public u(InterfaceC13058l interfaceC13058l, C22654d c22654d, String str, String str2, boolean z4) {
            this.f89284w = interfaceC13058l;
            this.f89285x = c22654d;
            this.f89286y = str;
            this.f89287z = str2;
            this.f89283E = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89284w.collect(new a(interfaceC13062m, this.f89285x, this.f89286y, this.f89287z, this.f89283E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ko2.d$v */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {552, 555, 567}, m100432m = "processNoStripeCheckout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f89301E;

        /* JADX INFO: renamed from: F */
        Object f89302F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f89303G;

        /* JADX INFO: renamed from: I */
        int f89305I;

        /* JADX INFO: renamed from: w */
        Object f89306w;

        /* JADX INFO: renamed from: x */
        Object f89307x;

        /* JADX INFO: renamed from: y */
        Object f89308y;

        /* JADX INFO: renamed from: z */
        Object f89309z;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89303G = obj;
            this.f89305I |= Integer.MIN_VALUE;
            return C22654d.this.m65672y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ko2.d$w */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$processNoStripeCheckout$checkoutResponse$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {556}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89310w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89312y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ProcessCheckoutRequestBody f89313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, ProcessCheckoutRequestBody processCheckoutRequestBody, InterfaceC30057d<? super w> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f89312y = str;
            this.f89313z = processCheckoutRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22654d.this.new w(this.f89312y, this.f89313z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89310w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CheckoutApi checkoutApi = C22654d.this.checkoutApi;
            String str = this.f89312y;
            ProcessCheckoutRequestBody processCheckoutRequestBody = this.f89313z;
            this.f89310w = 1;
            Object objProcessNoStripeCheckout = checkoutApi.processNoStripeCheckout(str, processCheckoutRequestBody, this);
            return objProcessNoStripeCheckout == enumC31071a ? enumC31071a : objProcessNoStripeCheckout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((w) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ko2.d$x */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {485}, m100432m = "removePromoCodeFromCart", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f89315F;

        /* JADX INFO: renamed from: w */
        Object f89316w;

        /* JADX INFO: renamed from: x */
        Object f89317x;

        /* JADX INFO: renamed from: y */
        Object f89318y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f89319z;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89319z = obj;
            this.f89315F |= Integer.MIN_VALUE;
            return C22654d.this.m65673z(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ko2.d$y */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$removePromoCodeFromCart$response$1", m100430f = "UniversalCheckoutInteractor.kt", m100431l = {486}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89320w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89322y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f89323z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, String str2, InterfaceC30057d<? super y> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f89322y = str;
            this.f89323z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22654d.this.new y(this.f89322y, this.f89323z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89320w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CheckoutApi checkoutApi = C22654d.this.checkoutApi;
            String str = this.f89322y;
            String str2 = this.f89323z;
            this.f89320w = 1;
            Object objRemovePromoCodeById = checkoutApi.removePromoCodeById(str, str2, this);
            return objRemovePromoCodeById == enumC31071a ? enumC31071a : objRemovePromoCodeById;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d) {
            return ((y) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C22654d(InterfaceC26834e cachedApiSource, C38458b cacheUpdater, C21842e stripeFlowControllerManager, CheckoutApi checkoutApi, C17538a analyticsHelper, C36684a errorBodyParser, C32266a seonManager, FeatureFlagChecker featureFlagChecker, BannerInvalidator bannerInvalidator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(stripeFlowControllerManager, "stripeFlowControllerManager");
        AbstractC22676k.m65750j(checkoutApi, "checkoutApi");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(errorBodyParser, "errorBodyParser");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(bannerInvalidator, "bannerInvalidator");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.cacheUpdater = cacheUpdater;
        this.stripeFlowControllerManager = stripeFlowControllerManager;
        this.checkoutApi = checkoutApi;
        this.analyticsHelper = analyticsHelper;
        this.errorBodyParser = errorBodyParser;
        this.seonManager = seonManager;
        this.featureFlagChecker = featureFlagChecker;
        this.bannerInvalidator = bannerInvalidator;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        if (r1 == r2) goto L31;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m65658k(ko2.C22653c r34, java.lang.String r35, java.lang.String r36, q83.InterfaceC30057d<? super ko2.C22653c> r37) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.m65658k(ko2.c, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    private final C22653c m65659l(C22653c c22653c) {
        Map<String, JsonElement> analyticsPayload;
        if (!this.stripeFlowControllerManager.m61825z()) {
            return c22653c;
        }
        C17538a c17538a = this.analyticsHelper;
        String source = c22653c.getSource();
        UniversalCheckoutResponse response = c22653c.getResponse();
        c17538a.m49843a(new InterfaceC29402a.y(source, (response == null || (analyticsPayload = response.getAnalyticsPayload()) == null) ? null : AbstractC34647h.m109487b(analyticsPayload)));
        return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, false, null, false, null, null, true, null, 98303, null);
    }

    /* JADX INFO: renamed from: m */
    private final Long m65660m(PaymentSheetConfiguration paymentSheetConfiguration, PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, String stripeToken) {
        return this.stripeFlowControllerManager.m61818j(paymentSheetConfiguration, paymentSheetIntentConfiguration, stripeToken);
    }

    /* JADX INFO: renamed from: n */
    private final String m65661n(String payload) {
        JsonElement jsonElement;
        String content;
        try {
            JsonElement jsonElementM1835f = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C22594e(2)).m1835f(payload);
            return (!(jsonElementM1835f instanceof JsonObject) || (jsonElement = (JsonElement) ((JsonObject) jsonElementM1835f).get((Object) "cart_id")) == null || (content = AbstractC0770m.m1848j(jsonElement).getContent()) == null) ? "" : content;
        } catch (Exception e5) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Failed to extract cart_id from payload: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m65662o(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m65663p(String cartId) {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetUniversalCheckoutRequest(cartId), 1), AbstractC12350b.m34570S("UniversalCheckoutRefreshScope"), null, 2, null), new c(null, this.cachedApiSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final C22653c m65664q(InterfaceC29354a<UniversalCheckoutResponse> cacheResult, String dynamicPath, String dynamicPayload, boolean manualRefresh) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = 1;
        boolean z4 = false;
        if (cacheResult instanceof InterfaceC29354a.e) {
            return new C22653c(null, null, null, new InterfaceC22651a.c(z4, i13, defaultConstructorMarker), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
        }
        if (cacheResult instanceof InterfaceC29354a.a.b) {
            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) cacheResult;
            Long lM65660m = m65660m(((UniversalCheckoutResponse) bVar.getData()).getPaymentSheetConfiguration(), ((UniversalCheckoutResponse) bVar.getData()).getPaymentSheetIntentConfiguration(), ((UniversalCheckoutResponse) bVar.getData()).getStripePublishableKey());
            return new C22653c(dynamicPayload, dynamicPath, ((UniversalCheckoutResponse) bVar.getData()).getCartId(), new InterfaceC22651a.c(z4, i13, defaultConstructorMarker), (UniversalCheckoutResponse) bVar.getData(), manualRefresh, true, false, null, false, false, null, false, null, null, false, lM65660m, 65408, null);
        }
        if (cacheResult instanceof InterfaceC29354a.a.C42173a) {
            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) cacheResult;
            return new C22653c(dynamicPayload, dynamicPath, ((UniversalCheckoutResponse) c42173a.getData()).getCartId(), null, (UniversalCheckoutResponse) c42173a.getData(), false, false, false, null, false, false, null, false, null, null, false, m65660m(((UniversalCheckoutResponse) c42173a.getData()).getPaymentSheetConfiguration(), ((UniversalCheckoutResponse) c42173a.getData()).getPaymentSheetIntentConfiguration(), ((UniversalCheckoutResponse) c42173a.getData()).getStripePublishableKey()), 65512, null);
        }
        if (cacheResult instanceof InterfaceC29354a.d) {
            InterfaceC29354a.d dVar = (InterfaceC29354a.d) cacheResult;
            return new C22653c(dynamicPayload, dynamicPath, ((UniversalCheckoutResponse) dVar.getData()).getCartId(), null, (UniversalCheckoutResponse) dVar.getData(), false, false, false, null, false, false, null, false, null, null, false, m65660m(((UniversalCheckoutResponse) dVar.getData()).getPaymentSheetConfiguration(), ((UniversalCheckoutResponse) dVar.getData()).getPaymentSheetIntentConfiguration(), ((UniversalCheckoutResponse) dVar.getData()).getStripePublishableKey()), 65512, null);
        }
        if (cacheResult instanceof InterfaceC29354a.c) {
            return m65666s((InterfaceC29354a.c) cacheResult, dynamicPath, dynamicPayload);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: r */
    public final Object m65665r(C22653c c22653c, AbstractC22652b abstractC22652b, InterfaceC30057d<? super C22653c> interfaceC30057d) {
        d dVar;
        Map<String, JsonElement> analyticsPayload;
        Map<String, JsonElement> analyticsPayload2;
        Map<String, JsonElement> analyticsPayload3;
        Map<String, JsonElement> analyticsPayload4;
        C22653c c22653c2;
        C22653c c22653c3;
        Map<String, JsonElement> analyticsPayload5;
        Map<String, JsonElement> analyticsPayload6;
        Map<String, JsonElement> analyticsPayload7;
        AbstractC22652b abstractC22652b2 = abstractC22652b;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f89189E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f89189E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f89192y;
        Object obj2 = EnumC31071a.f128113w;
        switch (dVar.f89189E) {
            case 0:
                AbstractC34132o.m107864I(obj);
                if (abstractC22652b2 instanceof AbstractC22652b.s) {
                    return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, !c22653c.getOrderDetailsIsExpanded(), null, false, false, null, false, null, null, false, null, 130943, null);
                }
                Map<String, Object> mapM109487b = null;
                if (abstractC22652b2 instanceof AbstractC22652b.i) {
                    this.stripeFlowControllerManager.m61825z();
                    C17538a c17538a = this.analyticsHelper;
                    String source = c22653c.getSource();
                    UniversalCheckoutResponse response = c22653c.getResponse();
                    if (response != null && (analyticsPayload7 = response.getAnalyticsPayload()) != null) {
                        mapM109487b = AbstractC34647h.m109487b(analyticsPayload7);
                    }
                    c17538a.m49843a(new InterfaceC29402a.y(source, mapM109487b));
                    return c22653c;
                }
                if (abstractC22652b2 instanceof AbstractC22652b.h) {
                    if (c22653c.getHasAutoTriggered()) {
                        return c22653c;
                    }
                    return ((AbstractC22652b.h) abstractC22652b2).getAutoTrigger() == EnumC21177x0.PAYMENT_METHOD ? m65659l(c22653c) : C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, false, null, false, null, null, true, null, 98303, null);
                }
                if (abstractC22652b2 instanceof AbstractC22652b.c) {
                    C17538a c17538a2 = this.analyticsHelper;
                    AbstractC22652b.c cVar = (AbstractC22652b.c) abstractC22652b2;
                    C29814e paymentOption = cVar.getPaymentOption();
                    String source2 = c22653c.getSource();
                    UniversalCheckoutResponse response2 = c22653c.getResponse();
                    if (response2 != null && (analyticsPayload6 = response2.getAnalyticsPayload()) != null) {
                        mapM109487b = AbstractC34647h.m109487b(analyticsPayload6);
                    }
                    c17538a2.m49843a(new InterfaceC29402a.m0(paymentOption, source2, mapM109487b));
                    return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, cVar.getPaymentOption(), false, false, null, false, null, null, false, null, 130815, null);
                }
                if (abstractC22652b2 instanceof AbstractC22652b.t) {
                    if (!c22653c.getPromoCodeInputIsExpanded()) {
                        C17538a c17538a3 = this.analyticsHelper;
                        String source3 = c22653c.getSource();
                        UniversalCheckoutResponse response3 = c22653c.getResponse();
                        if (response3 != null && (analyticsPayload5 = response3.getAnalyticsPayload()) != null) {
                            mapM109487b = AbstractC34647h.m109487b(analyticsPayload5);
                        }
                        c17538a3.m49843a(new InterfaceC29402a.a0(source3, mapM109487b));
                    }
                    return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, !c22653c.getPromoCodeInputIsExpanded(), false, null, false, null, null, false, null, 130559, null);
                }
                if (abstractC22652b2 instanceof AbstractC22652b.d) {
                    return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, false, "", false, null, null, false, null, 129023, null);
                }
                if (abstractC22652b2 instanceof AbstractC22652b.l) {
                    return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, true, null, false, null, null, false, null, 130047, null);
                }
                if (abstractC22652b2 instanceof AbstractC22652b.a) {
                    AbstractC22652b.a aVar = (AbstractC22652b.a) abstractC22652b2;
                    String cartId = aVar.getCartId();
                    String promoCode = aVar.getPromoCode();
                    dVar.f89190w = null;
                    dVar.f89191x = null;
                    dVar.f89189E = 1;
                    Object objM65658k = m65658k(c22653c, cartId, promoCode, dVar);
                    if (objM65658k != obj2) {
                        return objM65658k;
                    }
                } else if (abstractC22652b2 instanceof AbstractC22652b.m) {
                    AbstractC22652b.m mVar = (AbstractC22652b.m) abstractC22652b2;
                    String cartId2 = mVar.getCartId();
                    String codeId = mVar.getCodeId();
                    dVar.f89190w = null;
                    dVar.f89191x = null;
                    dVar.f89189E = 2;
                    Object objM65673z = m65673z(c22653c, cartId2, codeId, dVar);
                    if (objM65673z != obj2) {
                        return objM65673z;
                    }
                } else {
                    if (abstractC22652b2 instanceof AbstractC22652b.j) {
                        AbstractC22652b.j jVar = (AbstractC22652b.j) abstractC22652b2;
                        this.stripeFlowControllerManager.m61819k(jVar.getPath(), jVar.getCartId());
                        return c22653c;
                    }
                    if (abstractC22652b2 instanceof AbstractC22652b.p) {
                        C38458b c38458b = this.cacheUpdater;
                        dVar.f89190w = c22653c;
                        dVar.f89191x = null;
                        dVar.f89189E = 3;
                        if (c38458b.m123247a("ShopHomeRefreshScope", dVar) != obj2) {
                            c22653c3 = c22653c;
                            this.bannerInvalidator.invalidateBanners();
                            return C22653c.m65632b(c22653c3, null, null, null, new InterfaceC22651a.h(c22653c3.m65641j()), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                        }
                    } else if (abstractC22652b2 instanceof AbstractC22652b.q) {
                        C38458b c38458b2 = this.cacheUpdater;
                        dVar.f89190w = c22653c;
                        dVar.f89191x = abstractC22652b2;
                        dVar.f89189E = 4;
                        if (c38458b2.m123247a("ShopHomeRefreshScope", dVar) != obj2) {
                            c22653c2 = c22653c;
                            this.bannerInvalidator.invalidateBanners();
                            return C22653c.m65632b(c22653c2, null, null, null, new InterfaceC22651a.g(((AbstractC22652b.q) abstractC22652b2).getCartId()), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                        }
                    } else {
                        if (abstractC22652b2 instanceof AbstractC22652b.f) {
                            C17538a c17538a4 = this.analyticsHelper;
                            AbstractC22652b.f fVar = (AbstractC22652b.f) abstractC22652b2;
                            String errorType = fVar.getErrorType();
                            String source4 = c22653c.getSource();
                            UniversalCheckoutResponse response4 = c22653c.getResponse();
                            if (response4 != null && (analyticsPayload4 = response4.getAnalyticsPayload()) != null) {
                                mapM109487b = AbstractC34647h.m109487b(analyticsPayload4);
                            }
                            c17538a4.m49843a(new InterfaceC29402a.v(errorType, source4, mapM109487b));
                            return C22653c.m65632b(c22653c, null, null, null, new InterfaceC22651a.a(fVar.getTitle(), fVar.getErrorMessage()), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                        }
                        if (abstractC22652b2 instanceof AbstractC22652b.b) {
                            C17538a c17538a5 = this.analyticsHelper;
                            String source5 = c22653c.getSource();
                            UniversalCheckoutResponse response5 = c22653c.getResponse();
                            if (response5 != null && (analyticsPayload3 = response5.getAnalyticsPayload()) != null) {
                                mapM109487b = AbstractC34647h.m109487b(analyticsPayload3);
                            }
                            c17538a5.m49843a(new InterfaceC29402a.v("Cancelled checkout", source5, mapM109487b));
                            return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                        }
                        if (abstractC22652b2 instanceof AbstractC22652b.e) {
                            this.stripeFlowControllerManager.m61825z();
                            C17538a c17538a6 = this.analyticsHelper;
                            String source6 = c22653c.getSource();
                            UniversalCheckoutResponse response6 = c22653c.getResponse();
                            if (response6 != null && (analyticsPayload2 = response6.getAnalyticsPayload()) != null) {
                                mapM109487b = AbstractC34647h.m109487b(analyticsPayload2);
                            }
                            c17538a6.m49843a(new InterfaceC29402a.t(source6, mapM109487b));
                            return C22653c.m65632b(c22653c, null, null, null, null, null, false, false, false, null, false, false, null, false, null, null, false, null, 126967, null);
                        }
                        if (abstractC22652b2 instanceof AbstractC22652b.n) {
                            return C22653c.m65632b(c22653c, null, null, null, new InterfaceC22651a.c(true), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                        }
                        if (abstractC22652b2 instanceof AbstractC22652b.r) {
                            boolean isToggled = ((AbstractC22652b.r) abstractC22652b2).getIsToggled();
                            dVar.f89190w = null;
                            dVar.f89191x = null;
                            dVar.f89189E = 5;
                            Object objM65667t = m65667t(c22653c, isToggled, dVar);
                            if (objM65667t != obj2) {
                                return objM65667t;
                            }
                        } else {
                            if (abstractC22652b2 instanceof AbstractC22652b.o) {
                                C17538a c17538a7 = this.analyticsHelper;
                                String source7 = c22653c.getSource();
                                UniversalCheckoutResponse response7 = c22653c.getResponse();
                                if (response7 != null && (analyticsPayload = response7.getAnalyticsPayload()) != null) {
                                    mapM109487b = AbstractC34647h.m109487b(analyticsPayload);
                                }
                                c17538a7.m49843a(new InterfaceC29402a.w(source7, mapM109487b));
                                return C22653c.m65632b(c22653c, null, null, null, InterfaceC22651a.e.f89112a, null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
                            }
                            if (!(abstractC22652b2 instanceof AbstractC22652b.k)) {
                                return c22653c;
                            }
                            String path = ((AbstractC22652b.k) abstractC22652b2).getPath();
                            dVar.f89190w = null;
                            dVar.f89191x = null;
                            dVar.f89189E = 6;
                            Object objM65672y = m65672y(c22653c, path, dVar);
                            if (objM65672y != obj2) {
                                return objM65672y;
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                AbstractC34132o.m107864I(obj);
                return obj;
            case 2:
                AbstractC34132o.m107864I(obj);
                return obj;
            case 3:
                C22653c c22653c4 = (C22653c) dVar.f89190w;
                AbstractC34132o.m107864I(obj);
                c22653c3 = c22653c4;
                this.bannerInvalidator.invalidateBanners();
                return C22653c.m65632b(c22653c3, null, null, null, new InterfaceC22651a.h(c22653c3.m65641j()), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
            case 4:
                abstractC22652b2 = (AbstractC22652b) dVar.f89191x;
                C22653c c22653c5 = (C22653c) dVar.f89190w;
                AbstractC34132o.m107864I(obj);
                c22653c2 = c22653c5;
                this.bannerInvalidator.invalidateBanners();
                return C22653c.m65632b(c22653c2, null, null, null, new InterfaceC22651a.g(((AbstractC22652b.q) abstractC22652b2).getCartId()), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
            case 5:
                AbstractC34132o.m107864I(obj);
                return obj;
            case 6:
                AbstractC34132o.m107864I(obj);
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: s */
    private final C22653c m65666s(InterfaceC29354a.c<UniversalCheckoutResponse> cacheResult, String dynamicPath, String dynamicPayload) {
        return AbstractC29355b.m89462a(cacheResult) ? new C22653c(dynamicPayload, dynamicPath, null, InterfaceC22651a.f.f89113a, null, false, false, false, null, false, false, null, false, null, null, false, null, 131060, null) : new C22653c(dynamicPayload, dynamicPath, null, InterfaceC22651a.d.f89111a, null, false, false, false, null, false, false, null, false, null, null, false, null, 131060, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: t */
    public final Object m65667t(C22653c c22653c, boolean z4, InterfaceC30057d<? super C22653c> interfaceC30057d) {
        e eVar;
        C22653c c22653c2;
        C22653c c22653c3;
        boolean z13 = z4;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f89196G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f89196G = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM117757a = eVar2.f89194E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f89196G;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = eVar2.f89200z;
                C22653c c22653c4 = (C22653c) eVar2.f89197w;
                AbstractC34132o.m107864I(objM117757a);
                c22653c2 = c22653c4;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C22653c c22653c5 = (C22653c) eVar2.f89197w;
                AbstractC34132o.m107864I(objM117757a);
                c22653c3 = c22653c5;
            }
            ErrorResponse errorResponse = (ErrorResponse) objM117757a;
            return errorResponse != null ? C22653c.m65632b(c22653c3, null, null, null, new InterfaceC22651a.a(errorResponse.getErrorTitle(), errorResponse.getErrorDescription()), null, false, false, false, null, false, false, null, true, null, null, false, null, 126967, null) : new C22653c(null, null, null, InterfaceC22651a.f.f89113a, null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
        }
        AbstractC34132o.m107864I(objM117757a);
        UniversalCheckoutResponse response = c22653c.getResponse();
        if (response == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String cartId = response.getCartId();
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        f fVar = new f(cartId, z13, null);
        eVar2.f89197w = c22653c;
        eVar2.f89198x = null;
        eVar2.f89200z = z13;
        eVar2.f89196G = 1;
        Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
        if (objM108729b != enumC31071a) {
            c22653c2 = c22653c;
            objM117757a = objM108729b;
        }
        return enumC31071a;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM117757a;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            UniversalCheckoutResponse universalCheckoutResponse = (UniversalCheckoutResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            m65660m(universalCheckoutResponse.getPaymentSheetConfiguration(), universalCheckoutResponse.getPaymentSheetIntentConfiguration(), universalCheckoutResponse.getStripePublishableKey());
            return C22653c.m65632b(c22653c2, null, null, null, null, universalCheckoutResponse, false, false, false, null, false, false, null, false, null, null, false, null, 131047, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return new C22653c(null, null, null, InterfaceC22651a.d.f89111a, null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        C36684a c36684a = this.errorBodyParser;
        Exception exception = ((InterfaceC34385a.b.a) interfaceC34385a).getException();
        InterfaceC37138c interfaceC37138cSerializer = ErrorResponse.INSTANCE.serializer();
        eVar2.f89197w = c22653c2;
        eVar2.f89198x = null;
        eVar2.f89199y = null;
        eVar2.f89200z = z13;
        eVar2.f89196G = 2;
        objM117757a = c36684a.m117757a(exception, interfaceC37138cSerializer, eVar2);
        if (objM117757a != enumC31071a) {
            c22653c3 = c22653c2;
            ErrorResponse errorResponse2 = (ErrorResponse) objM117757a;
            if (errorResponse2 != null) {
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC13058l m65668u(String dynamicPath, String dynamicPayload, String cartId, String method, boolean manualRefresh) {
        return (cartId == null || cartId.length() == 0) ? m65671x(dynamicPath, dynamicPayload, method, manualRefresh) : m65670w(cartId, manualRefresh, dynamicPath, dynamicPayload);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ InterfaceC13058l m65669v(C22654d c22654d, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z4 = false;
        }
        return c22654d.m65668u(str, str2, str3, str4, z4);
    }

    /* JADX INFO: renamed from: w */
    private final InterfaceC13058l m65670w(String cartId, boolean manualRefresh, String dynamicPath, String dynamicPayload) {
        return new q(m65663p(cartId), this, dynamicPath, dynamicPayload, manualRefresh);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX INFO: renamed from: x */
    private final InterfaceC13058l m65671x(String dynamicPath, String dynamicPayload, String method, boolean manualRefresh) {
        String string;
        if (method != null) {
            String upperCase = method.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            string = AbstractC39414r.m125869O0(upperCase).toString();
            if (string == null || string.length() <= 0) {
                string = null;
            }
        } else {
            string = null;
        }
        if (!AbstractC22676k.m65745e(string, "GET")) {
            return new u(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new PostUniversalCheckoutRequest(dynamicPayload, dynamicPath), 1), AbstractC12350b.m34570S("UniversalCheckoutRefreshScope"), null, 2, null), new s(null, this.cachedApiSource)), this, dynamicPath, dynamicPayload, manualRefresh);
        }
        String strM65661n = m65661n(dynamicPayload);
        String strM53370k = strM65661n.length() > 0 ? AbstractC18489d0.m53370k(dynamicPath, "/", strM65661n) : dynamicPath;
        return new t(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new DynamicGetUniversalCheckoutRequest(strM53370k), 1), AbstractC12350b.m34570S("UniversalCheckoutRefreshScope"), null, 2, null), new r(null, this.cachedApiSource)), this, strM53370k, dynamicPayload, manualRefresh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0163, code lost:
    
        if (r1 == r2) goto L42;
     */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m65672y(ko2.C22653c r34, java.lang.String r35, q83.InterfaceC30057d<? super ko2.C22653c> r36) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko2.C22654d.m65672y(ko2.c, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: z */
    public final Object m65673z(C22653c c22653c, String str, String str2, InterfaceC30057d<? super C22653c> interfaceC30057d) {
        x xVar;
        C22653c c22653c2;
        if (interfaceC30057d instanceof x) {
            xVar = (x) interfaceC30057d;
            int i13 = xVar.f89315F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                xVar.f89315F = i13 - Integer.MIN_VALUE;
            } else {
                xVar = new x(interfaceC30057d);
            }
        } else {
            xVar = new x(interfaceC30057d);
        }
        x xVar2 = xVar;
        Object objM108729b = xVar2.f89319z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = xVar2.f89315F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            y yVar = new y(str, str2, null);
            c22653c2 = c22653c;
            xVar2.f89316w = c22653c2;
            xVar2.f89317x = null;
            xVar2.f89318y = null;
            xVar2.f89315F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, yVar, xVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22653c c22653c3 = (C22653c) xVar2.f89316w;
            AbstractC34132o.m107864I(objM108729b);
            c22653c2 = c22653c3;
        }
        UniversalCheckoutResponse universalCheckoutResponse = (UniversalCheckoutResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        if (universalCheckoutResponse != null) {
            m65660m(universalCheckoutResponse.getPaymentSheetConfiguration(), universalCheckoutResponse.getPaymentSheetIntentConfiguration(), universalCheckoutResponse.getStripePublishableKey());
            C17538a c17538a = this.analyticsHelper;
            String source = c22653c2.getSource();
            Map<String, JsonElement> analyticsPayload = universalCheckoutResponse.getAnalyticsPayload();
            c17538a.m49843a(new InterfaceC29402a.d0(source, analyticsPayload != null ? AbstractC34647h.m109487b(analyticsPayload) : null));
            C22653c c22653cM65632b = C22653c.m65632b(c22653c2, null, null, null, null, universalCheckoutResponse, false, false, false, null, false, false, null, false, null, null, false, null, 130031, null);
            if (c22653cM65632b != null) {
                return c22653cM65632b;
            }
        }
        return C22653c.m65632b(c22653c2, null, null, null, InterfaceC22651a.f.f89113a, null, false, false, false, null, false, false, null, false, null, null, false, null, 130039, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22653c(null, null, null, new InterfaceC22651a.c(false, 1, null), null, false, false, false, null, false, false, null, false, null, null, false, null, 131063, null), AbstractC13091v.m36590P(upstream, new g(null, this)), new o(null));
    }

    public /* synthetic */ C22654d(InterfaceC26834e interfaceC26834e, C38458b c38458b, C21842e c21842e, CheckoutApi checkoutApi, C17538a c17538a, C36684a c36684a, C32266a c32266a, FeatureFlagChecker featureFlagChecker, BannerInvalidator bannerInvalidator, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c38458b, c21842e, checkoutApi, c17538a, c36684a, c32266a, featureFlagChecker, bannerInvalidator, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UniversalCheckoutInteractor") : interfaceC34116n);
    }
}

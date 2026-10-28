package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0086\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u0010\u00101\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bF\u0010C\u001a\u0004\bE\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010!R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010J\u0012\u0004\bL\u0010C\u001a\u0004\bK\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010C\u001a\u0004\bN\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bQ\u0010C\u001a\u0004\bP\u0010\u001dR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bS\u0010C\u001a\u0004\bR\u0010\u001dR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bU\u0010C\u001a\u0004\bT\u0010\u001dR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010V\u0012\u0004\bX\u0010C\u001a\u0004\bW\u0010*R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u0012\u0004\b[\u0010C\u001a\u0004\bZ\u0010,R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010@\u0012\u0004\b]\u0010C\u001a\u0004\b\\\u0010\u001d¨\u0006`"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "", "", "title", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;", "paymentOptions", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "orderDetails", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "promoCode", "checkoutCtaTitle", "securityFooter", "disclaimerFooterMarkdown", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "checkoutStep", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "loadingProgressContent", "payload", "<init>", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;", "component3", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "component6", "component7", "component8", "component9", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "component10", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "component11", "copy", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;", "getPaymentOptions", "getPaymentOptions$annotations", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "getOrderDetails", "getOrderDetails$annotations", "Ljava/util/List;", "getOrderOptions", "getOrderOptions$annotations", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "getPromoCode", "getPromoCode$annotations", "getCheckoutCtaTitle", "getCheckoutCtaTitle$annotations", "getSecurityFooter", "getSecurityFooter$annotations", "getDisclaimerFooterMarkdown", "getDisclaimerFooterMarkdown$annotations", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "getCheckoutStep", "getCheckoutStep$annotations", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "getLoadingProgressContent", "getLoadingProgressContent$annotations", "getPayload", "getPayload$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NativeOrderResponse {

    @SerializedName("checkout_cta_title")
    private final String checkoutCtaTitle;

    @SerializedName("checkout_step")
    private final StepPrefetchContent checkoutStep;

    @SerializedName("disclaimer_footer_markdown")
    private final String disclaimerFooterMarkdown;

    @SerializedName("loading_progress_content")
    private final ProgressContent loadingProgressContent;

    @SerializedName("order_details")
    private final NativeOrderDetails orderDetails;

    @SerializedName("order_options")
    private final List<OrderOption> orderOptions;

    @SerializedName("payload")
    private final String payload;

    @SerializedName("payment_options")
    private final NativeOrderPaymentOption paymentOptions;

    @SerializedName("promo_code")
    private final NativeOrderPromoCode promoCode;

    @SerializedName("security_footer")
    private final String securityFooter;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(5)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NativeOrderResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NativeOrderResponse(int i13, String str, NativeOrderPaymentOption nativeOrderPaymentOption, NativeOrderDetails nativeOrderDetails, List list, NativeOrderPromoCode nativeOrderPromoCode, String str2, String str3, String str4, StepPrefetchContent stepPrefetchContent, ProgressContent progressContent, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, NativeOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.paymentOptions = nativeOrderPaymentOption;
        this.orderDetails = nativeOrderDetails;
        this.orderOptions = list;
        this.promoCode = nativeOrderPromoCode;
        this.checkoutCtaTitle = str2;
        this.securityFooter = str3;
        this.disclaimerFooterMarkdown = str4;
        this.checkoutStep = stepPrefetchContent;
        this.loadingProgressContent = progressContent;
        this.payload = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(OrderOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeOrderResponse copy$default(NativeOrderResponse nativeOrderResponse, String str, NativeOrderPaymentOption nativeOrderPaymentOption, NativeOrderDetails nativeOrderDetails, List list, NativeOrderPromoCode nativeOrderPromoCode, String str2, String str3, String str4, StepPrefetchContent stepPrefetchContent, ProgressContent progressContent, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nativeOrderResponse.title;
        }
        if ((i13 & 2) != 0) {
            nativeOrderPaymentOption = nativeOrderResponse.paymentOptions;
        }
        if ((i13 & 4) != 0) {
            nativeOrderDetails = nativeOrderResponse.orderDetails;
        }
        if ((i13 & 8) != 0) {
            list = nativeOrderResponse.orderOptions;
        }
        if ((i13 & 16) != 0) {
            nativeOrderPromoCode = nativeOrderResponse.promoCode;
        }
        if ((i13 & 32) != 0) {
            str2 = nativeOrderResponse.checkoutCtaTitle;
        }
        if ((i13 & 64) != 0) {
            str3 = nativeOrderResponse.securityFooter;
        }
        if ((i13 & 128) != 0) {
            str4 = nativeOrderResponse.disclaimerFooterMarkdown;
        }
        if ((i13 & 256) != 0) {
            stepPrefetchContent = nativeOrderResponse.checkoutStep;
        }
        if ((i13 & 512) != 0) {
            progressContent = nativeOrderResponse.loadingProgressContent;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str5 = nativeOrderResponse.payload;
        }
        ProgressContent progressContent2 = progressContent;
        String str6 = str5;
        String str7 = str4;
        StepPrefetchContent stepPrefetchContent2 = stepPrefetchContent;
        String str8 = str2;
        String str9 = str3;
        NativeOrderPromoCode nativeOrderPromoCode2 = nativeOrderPromoCode;
        NativeOrderDetails nativeOrderDetails2 = nativeOrderDetails;
        return nativeOrderResponse.copy(str, nativeOrderPaymentOption, nativeOrderDetails2, list, nativeOrderPromoCode2, str8, str9, str7, stepPrefetchContent2, progressContent2, str6);
    }

    @InterfaceC37143h("checkout_cta_title")
    public static /* synthetic */ void getCheckoutCtaTitle$annotations() {
    }

    @InterfaceC37143h("checkout_step")
    public static /* synthetic */ void getCheckoutStep$annotations() {
    }

    @InterfaceC37143h("disclaimer_footer_markdown")
    public static /* synthetic */ void getDisclaimerFooterMarkdown$annotations() {
    }

    @InterfaceC37143h("loading_progress_content")
    public static /* synthetic */ void getLoadingProgressContent$annotations() {
    }

    @InterfaceC37143h("order_details")
    public static /* synthetic */ void getOrderDetails$annotations() {
    }

    @InterfaceC37143h("order_options")
    public static /* synthetic */ void getOrderOptions$annotations() {
    }

    @InterfaceC37143h("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @InterfaceC37143h("payment_options")
    public static /* synthetic */ void getPaymentOptions$annotations() {
    }

    @InterfaceC37143h("promo_code")
    public static /* synthetic */ void getPromoCode$annotations() {
    }

    @InterfaceC37143h("security_footer")
    public static /* synthetic */ void getSecurityFooter$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(NativeOrderResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, NativeOrderPaymentOption$$serializer.INSTANCE, self.paymentOptions);
        output.encodeSerializableElement(serialDesc, 2, NativeOrderDetails$$serializer.INSTANCE, self.orderDetails);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.orderOptions);
        output.encodeNullableSerializableElement(serialDesc, 4, NativeOrderPromoCode$$serializer.INSTANCE, self.promoCode);
        output.encodeStringElement(serialDesc, 5, self.checkoutCtaTitle);
        output.encodeStringElement(serialDesc, 6, self.securityFooter);
        output.encodeStringElement(serialDesc, 7, self.disclaimerFooterMarkdown);
        output.encodeSerializableElement(serialDesc, 8, StepPrefetchContent$$serializer.INSTANCE, self.checkoutStep);
        output.encodeSerializableElement(serialDesc, 9, ProgressContent$$serializer.INSTANCE, self.loadingProgressContent);
        output.encodeStringElement(serialDesc, 10, self.payload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ProgressContent getLoadingProgressContent() {
        return this.loadingProgressContent;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NativeOrderPaymentOption getPaymentOptions() {
        return this.paymentOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NativeOrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final List<OrderOption> component4() {
        return this.orderOptions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NativeOrderPromoCode getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCheckoutCtaTitle() {
        return this.checkoutCtaTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecurityFooter() {
        return this.securityFooter;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisclaimerFooterMarkdown() {
        return this.disclaimerFooterMarkdown;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final StepPrefetchContent getCheckoutStep() {
        return this.checkoutStep;
    }

    public final NativeOrderResponse copy(String title, NativeOrderPaymentOption paymentOptions, NativeOrderDetails orderDetails, List<OrderOption> orderOptions, NativeOrderPromoCode promoCode, String checkoutCtaTitle, String securityFooter, String disclaimerFooterMarkdown, StepPrefetchContent checkoutStep, ProgressContent loadingProgressContent, String payload) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(paymentOptions, "paymentOptions");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(orderOptions, "orderOptions");
        AbstractC22676k.m65750j(checkoutCtaTitle, "checkoutCtaTitle");
        AbstractC22676k.m65750j(securityFooter, "securityFooter");
        AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
        AbstractC22676k.m65750j(checkoutStep, "checkoutStep");
        AbstractC22676k.m65750j(loadingProgressContent, "loadingProgressContent");
        AbstractC22676k.m65750j(payload, "payload");
        return new NativeOrderResponse(title, paymentOptions, orderDetails, orderOptions, promoCode, checkoutCtaTitle, securityFooter, disclaimerFooterMarkdown, checkoutStep, loadingProgressContent, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeOrderResponse)) {
            return false;
        }
        NativeOrderResponse nativeOrderResponse = (NativeOrderResponse) other;
        return AbstractC22676k.m65745e(this.title, nativeOrderResponse.title) && AbstractC22676k.m65745e(this.paymentOptions, nativeOrderResponse.paymentOptions) && AbstractC22676k.m65745e(this.orderDetails, nativeOrderResponse.orderDetails) && AbstractC22676k.m65745e(this.orderOptions, nativeOrderResponse.orderOptions) && AbstractC22676k.m65745e(this.promoCode, nativeOrderResponse.promoCode) && AbstractC22676k.m65745e(this.checkoutCtaTitle, nativeOrderResponse.checkoutCtaTitle) && AbstractC22676k.m65745e(this.securityFooter, nativeOrderResponse.securityFooter) && AbstractC22676k.m65745e(this.disclaimerFooterMarkdown, nativeOrderResponse.disclaimerFooterMarkdown) && AbstractC22676k.m65745e(this.checkoutStep, nativeOrderResponse.checkoutStep) && AbstractC22676k.m65745e(this.loadingProgressContent, nativeOrderResponse.loadingProgressContent) && AbstractC22676k.m65745e(this.payload, nativeOrderResponse.payload);
    }

    public final String getCheckoutCtaTitle() {
        return this.checkoutCtaTitle;
    }

    public final StepPrefetchContent getCheckoutStep() {
        return this.checkoutStep;
    }

    public final String getDisclaimerFooterMarkdown() {
        return this.disclaimerFooterMarkdown;
    }

    public final ProgressContent getLoadingProgressContent() {
        return this.loadingProgressContent;
    }

    public final NativeOrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final List<OrderOption> getOrderOptions() {
        return this.orderOptions;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final NativeOrderPaymentOption getPaymentOptions() {
        return this.paymentOptions;
    }

    public final NativeOrderPromoCode getPromoCode() {
        return this.promoCode;
    }

    public final String getSecurityFooter() {
        return this.securityFooter;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.orderDetails.hashCode() + ((this.paymentOptions.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.orderOptions);
        NativeOrderPromoCode nativeOrderPromoCode = this.promoCode;
        return this.payload.hashCode() + ((this.loadingProgressContent.hashCode() + ((this.checkoutStep.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM31983b + (nativeOrderPromoCode == null ? 0 : nativeOrderPromoCode.hashCode())) * 31, 31, this.checkoutCtaTitle), 31, this.securityFooter), 31, this.disclaimerFooterMarkdown)) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        NativeOrderPaymentOption nativeOrderPaymentOption = this.paymentOptions;
        NativeOrderDetails nativeOrderDetails = this.orderDetails;
        List<OrderOption> list = this.orderOptions;
        NativeOrderPromoCode nativeOrderPromoCode = this.promoCode;
        String str2 = this.checkoutCtaTitle;
        String str3 = this.securityFooter;
        String str4 = this.disclaimerFooterMarkdown;
        StepPrefetchContent stepPrefetchContent = this.checkoutStep;
        ProgressContent progressContent = this.loadingProgressContent;
        String str5 = this.payload;
        StringBuilder sb4 = new StringBuilder("NativeOrderResponse(title=");
        sb4.append(str);
        sb4.append(", paymentOptions=");
        sb4.append(nativeOrderPaymentOption);
        sb4.append(", orderDetails=");
        sb4.append(nativeOrderDetails);
        sb4.append(", orderOptions=");
        sb4.append(list);
        sb4.append(", promoCode=");
        sb4.append(nativeOrderPromoCode);
        sb4.append(", checkoutCtaTitle=");
        sb4.append(str2);
        sb4.append(", securityFooter=");
        AbstractC11266d.m30444B(sb4, str3, ", disclaimerFooterMarkdown=", str4, ", checkoutStep=");
        sb4.append(stepPrefetchContent);
        sb4.append(", loadingProgressContent=");
        sb4.append(progressContent);
        sb4.append(", payload=");
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }

    public NativeOrderResponse(String title, NativeOrderPaymentOption paymentOptions, NativeOrderDetails orderDetails, List<OrderOption> orderOptions, NativeOrderPromoCode nativeOrderPromoCode, String checkoutCtaTitle, String securityFooter, String disclaimerFooterMarkdown, StepPrefetchContent checkoutStep, ProgressContent loadingProgressContent, String payload) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(paymentOptions, "paymentOptions");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(orderOptions, "orderOptions");
        AbstractC22676k.m65750j(checkoutCtaTitle, "checkoutCtaTitle");
        AbstractC22676k.m65750j(securityFooter, "securityFooter");
        AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
        AbstractC22676k.m65750j(checkoutStep, "checkoutStep");
        AbstractC22676k.m65750j(loadingProgressContent, "loadingProgressContent");
        AbstractC22676k.m65750j(payload, "payload");
        this.title = title;
        this.paymentOptions = paymentOptions;
        this.orderDetails = orderDetails;
        this.orderOptions = orderOptions;
        this.promoCode = nativeOrderPromoCode;
        this.checkoutCtaTitle = checkoutCtaTitle;
        this.securityFooter = securityFooter;
        this.disclaimerFooterMarkdown = disclaimerFooterMarkdown;
        this.checkoutStep = checkoutStep;
        this.loadingProgressContent = loadingProgressContent;
        this.payload = payload;
    }
}

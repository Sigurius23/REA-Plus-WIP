package ko2;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21177x0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q20.C29814e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ko2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÄ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b5\u00104R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b0\u0010A\u001a\u0004\b*\u0010BR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER\u0013\u0010H\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\b;\u0010G¨\u0006I"}, m65681d2 = {"Lko2/c;", "", "", "dynamicPayload", "dynamicPath", "cartId", "Lko2/a;", "currentDialogType", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "orderDetailsIsExpanded", "Lq20/e;", "stripePaymentOption", "promoCodeInputIsExpanded", "promoCodeInputIsLoading", "promoCodeErrorMessage", "refreshAnnualToggle", "source", "Lj02/x0;", "autoTrigger", "hasAutoTriggered", "", "stripeConfigurationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lko2/a;Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;ZZZLq20/e;ZZLjava/lang/String;ZLjava/lang/String;Lj02/x0;ZLjava/lang/Long;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lko2/a;Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;ZZZLq20/e;ZZLjava/lang/String;ZLjava/lang/String;Lj02/x0;ZLjava/lang/Long;)Lko2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "f", "c", "d", "Lko2/a;", "e", "()Lko2/a;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "o", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "Z", "getManualRefresh", "()Z", "getDisplayRefreshingSpinner", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lq20/e;", "r", "()Lq20/e;", "j", "l", "k", "m", "n", "p", "Lj02/x0;", "()Lj02/x0;", "q", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "postCheckoutNavigation", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22653c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String dynamicPayload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dynamicPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC22651a currentDialogType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final UniversalCheckoutResponse response;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean orderDetailsIsExpanded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29814e stripePaymentOption;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean promoCodeInputIsExpanded;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean promoCodeInputIsLoading;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String promoCodeErrorMessage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean refreshAnnualToggle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC21177x0 autoTrigger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean hasAutoTriggered;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Long stripeConfigurationId;

    public C22653c(String dynamicPayload, String dynamicPath, String cartId, InterfaceC22651a interfaceC22651a, UniversalCheckoutResponse universalCheckoutResponse, boolean z4, boolean z13, boolean z14, C29814e c29814e, boolean z15, boolean z16, String promoCodeErrorMessage, boolean z17, String source, EnumC21177x0 enumC21177x0, boolean z18, Long l7) {
        AbstractC22676k.m65750j(dynamicPayload, "dynamicPayload");
        AbstractC22676k.m65750j(dynamicPath, "dynamicPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(promoCodeErrorMessage, "promoCodeErrorMessage");
        AbstractC22676k.m65750j(source, "source");
        this.dynamicPayload = dynamicPayload;
        this.dynamicPath = dynamicPath;
        this.cartId = cartId;
        this.currentDialogType = interfaceC22651a;
        this.response = universalCheckoutResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.orderDetailsIsExpanded = z14;
        this.stripePaymentOption = c29814e;
        this.promoCodeInputIsExpanded = z15;
        this.promoCodeInputIsLoading = z16;
        this.promoCodeErrorMessage = promoCodeErrorMessage;
        this.refreshAnnualToggle = z17;
        this.source = source;
        this.autoTrigger = enumC21177x0;
        this.hasAutoTriggered = z18;
        this.stripeConfigurationId = l7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22653c m65632b(C22653c c22653c, String str, String str2, String str3, InterfaceC22651a interfaceC22651a, UniversalCheckoutResponse universalCheckoutResponse, boolean z4, boolean z13, boolean z14, C29814e c29814e, boolean z15, boolean z16, String str4, boolean z17, String str5, EnumC21177x0 enumC21177x0, boolean z18, Long l7, int i13, Object obj) {
        Long l12;
        boolean z19;
        String str6 = (i13 & 1) != 0 ? c22653c.dynamicPayload : str;
        String str7 = (i13 & 2) != 0 ? c22653c.dynamicPath : str2;
        String str8 = (i13 & 4) != 0 ? c22653c.cartId : str3;
        InterfaceC22651a interfaceC22651a2 = (i13 & 8) != 0 ? c22653c.currentDialogType : interfaceC22651a;
        UniversalCheckoutResponse universalCheckoutResponse2 = (i13 & 16) != 0 ? c22653c.response : universalCheckoutResponse;
        boolean z24 = (i13 & 32) != 0 ? c22653c.manualRefresh : z4;
        boolean z25 = (i13 & 64) != 0 ? c22653c.displayRefreshingSpinner : z13;
        boolean z26 = (i13 & 128) != 0 ? c22653c.orderDetailsIsExpanded : z14;
        C29814e c29814e2 = (i13 & 256) != 0 ? c22653c.stripePaymentOption : c29814e;
        boolean z27 = (i13 & 512) != 0 ? c22653c.promoCodeInputIsExpanded : z15;
        boolean z28 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22653c.promoCodeInputIsLoading : z16;
        String str9 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22653c.promoCodeErrorMessage : str4;
        boolean z29 = (i13 & 4096) != 0 ? c22653c.refreshAnnualToggle : z17;
        String str10 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22653c.source : str5;
        String str11 = str6;
        EnumC21177x0 enumC21177x1 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22653c.autoTrigger : enumC21177x0;
        boolean z34 = (i13 & 32768) != 0 ? c22653c.hasAutoTriggered : z18;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            z19 = z34;
            l12 = c22653c.stripeConfigurationId;
        } else {
            l12 = l7;
            z19 = z34;
        }
        return c22653c.m65633a(str11, str7, str8, interfaceC22651a2, universalCheckoutResponse2, z24, z25, z26, c29814e2, z27, z28, str9, z29, str10, enumC21177x1, z19, l12);
    }

    /* JADX INFO: renamed from: a */
    public final C22653c m65633a(String dynamicPayload, String dynamicPath, String cartId, InterfaceC22651a currentDialogType, UniversalCheckoutResponse response, boolean manualRefresh, boolean displayRefreshingSpinner, boolean orderDetailsIsExpanded, C29814e stripePaymentOption, boolean promoCodeInputIsExpanded, boolean promoCodeInputIsLoading, String promoCodeErrorMessage, boolean refreshAnnualToggle, String source, EnumC21177x0 autoTrigger, boolean hasAutoTriggered, Long stripeConfigurationId) {
        AbstractC22676k.m65750j(dynamicPayload, "dynamicPayload");
        AbstractC22676k.m65750j(dynamicPath, "dynamicPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(promoCodeErrorMessage, "promoCodeErrorMessage");
        AbstractC22676k.m65750j(source, "source");
        return new C22653c(dynamicPayload, dynamicPath, cartId, currentDialogType, response, manualRefresh, displayRefreshingSpinner, orderDetailsIsExpanded, stripePaymentOption, promoCodeInputIsExpanded, promoCodeInputIsLoading, promoCodeErrorMessage, refreshAnnualToggle, source, autoTrigger, hasAutoTriggered, stripeConfigurationId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC21177x0 getAutoTrigger() {
        return this.autoTrigger;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC22651a getCurrentDialogType() {
        return this.currentDialogType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22653c)) {
            return false;
        }
        C22653c c22653c = (C22653c) other;
        return AbstractC22676k.m65745e(this.dynamicPayload, c22653c.dynamicPayload) && AbstractC22676k.m65745e(this.dynamicPath, c22653c.dynamicPath) && AbstractC22676k.m65745e(this.cartId, c22653c.cartId) && AbstractC22676k.m65745e(this.currentDialogType, c22653c.currentDialogType) && AbstractC22676k.m65745e(this.response, c22653c.response) && this.manualRefresh == c22653c.manualRefresh && this.displayRefreshingSpinner == c22653c.displayRefreshingSpinner && this.orderDetailsIsExpanded == c22653c.orderDetailsIsExpanded && AbstractC22676k.m65745e(this.stripePaymentOption, c22653c.stripePaymentOption) && this.promoCodeInputIsExpanded == c22653c.promoCodeInputIsExpanded && this.promoCodeInputIsLoading == c22653c.promoCodeInputIsLoading && AbstractC22676k.m65745e(this.promoCodeErrorMessage, c22653c.promoCodeErrorMessage) && this.refreshAnnualToggle == c22653c.refreshAnnualToggle && AbstractC22676k.m65745e(this.source, c22653c.source) && this.autoTrigger == c22653c.autoTrigger && this.hasAutoTriggered == c22653c.hasAutoTriggered && AbstractC22676k.m65745e(this.stripeConfigurationId, c22653c.stripeConfigurationId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDynamicPath() {
        return this.dynamicPath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDynamicPayload() {
        return this.dynamicPayload;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHasAutoTriggered() {
        return this.hasAutoTriggered;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.dynamicPayload.hashCode() * 31, 31, this.dynamicPath), 31, this.cartId);
        InterfaceC22651a interfaceC22651a = this.currentDialogType;
        int iHashCode = (iM30450d + (interfaceC22651a == null ? 0 : interfaceC22651a.hashCode())) * 31;
        UniversalCheckoutResponse universalCheckoutResponse = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (universalCheckoutResponse == null ? 0 : universalCheckoutResponse.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner), 31, this.orderDetailsIsExpanded);
        C29814e c29814e = this.stripePaymentOption;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (c29814e == null ? 0 : c29814e.hashCode())) * 31, 31, this.promoCodeInputIsExpanded), 31, this.promoCodeInputIsLoading), 31, this.promoCodeErrorMessage), 31, this.refreshAnnualToggle), 31, this.source);
        EnumC21177x0 enumC21177x0 = this.autoTrigger;
        int iM8289b2 = AbstractC2875y.m8289b((iM30450d2 + (enumC21177x0 == null ? 0 : enumC21177x0.hashCode())) * 31, 31, this.hasAutoTriggered);
        Long l7 = this.stripeConfigurationId;
        return iM8289b2 + (l7 != null ? l7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getOrderDetailsIsExpanded() {
        return this.orderDetailsIsExpanded;
    }

    /* JADX INFO: renamed from: j */
    public final C9598e m65641j() {
        UniversalCheckoutResponse universalCheckoutResponse = this.response;
        if (universalCheckoutResponse != null) {
            return universalCheckoutResponse.getPostCheckoutNavigation();
        }
        return null;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPromoCodeErrorMessage() {
        return this.promoCodeErrorMessage;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getPromoCodeInputIsExpanded() {
        return this.promoCodeInputIsExpanded;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPromoCodeInputIsLoading() {
        return this.promoCodeInputIsLoading;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getRefreshAnnualToggle() {
        return this.refreshAnnualToggle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final UniversalCheckoutResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getStripeConfigurationId() {
        return this.stripeConfigurationId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C29814e getStripePaymentOption() {
        return this.stripePaymentOption;
    }

    public String toString() {
        String str = this.dynamicPayload;
        String str2 = this.dynamicPath;
        String str3 = this.cartId;
        InterfaceC22651a interfaceC22651a = this.currentDialogType;
        UniversalCheckoutResponse universalCheckoutResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        boolean z14 = this.orderDetailsIsExpanded;
        C29814e c29814e = this.stripePaymentOption;
        boolean z15 = this.promoCodeInputIsExpanded;
        boolean z16 = this.promoCodeInputIsLoading;
        String str4 = this.promoCodeErrorMessage;
        boolean z17 = this.refreshAnnualToggle;
        String str5 = this.source;
        EnumC21177x0 enumC21177x0 = this.autoTrigger;
        boolean z18 = this.hasAutoTriggered;
        Long l7 = this.stripeConfigurationId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UniversalCheckoutDomainState(dynamicPayload=", str, ", dynamicPath=", str2, ", cartId=");
        sbM32001t.append(str3);
        sbM32001t.append(", currentDialogType=");
        sbM32001t.append(interfaceC22651a);
        sbM32001t.append(", response=");
        sbM32001t.append(universalCheckoutResponse);
        sbM32001t.append(", manualRefresh=");
        sbM32001t.append(z4);
        sbM32001t.append(", displayRefreshingSpinner=");
        AbstractC38963t7.m124392v(sbM32001t, z13, ", orderDetailsIsExpanded=", z14, ", stripePaymentOption=");
        sbM32001t.append(c29814e);
        sbM32001t.append(", promoCodeInputIsExpanded=");
        sbM32001t.append(z15);
        sbM32001t.append(", promoCodeInputIsLoading=");
        AbstractC38963t7.m124391u(sbM32001t, z16, ", promoCodeErrorMessage=", str4, ", refreshAnnualToggle=");
        AbstractC38963t7.m124391u(sbM32001t, z17, ", source=", str5, ", autoTrigger=");
        sbM32001t.append(enumC21177x0);
        sbM32001t.append(", hasAutoTriggered=");
        sbM32001t.append(z18);
        sbM32001t.append(", stripeConfigurationId=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C22653c(String str, String str2, String str3, InterfaceC22651a interfaceC22651a, UniversalCheckoutResponse universalCheckoutResponse, boolean z4, boolean z13, boolean z14, C29814e c29814e, boolean z15, boolean z16, String str4, boolean z17, String str5, EnumC21177x0 enumC21177x0, boolean z18, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : interfaceC22651a, (i13 & 16) != 0 ? null : universalCheckoutResponse, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? false : z14, (i13 & 256) != 0 ? null : c29814e, (i13 & 512) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str4, (i13 & 4096) != 0 ? false : z17, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? str5 : "", (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : enumC21177x0, (i13 & 32768) != 0 ? false : z18, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : l7);
    }
}

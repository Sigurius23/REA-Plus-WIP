package v90;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.PaymentErrorMessages;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p90.C29004l;
import p90.C29005m;
import q22.C29855e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: v90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"Jê\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b5\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\b<\u0010&R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b3\u0010J\u001a\u0004\bA\u0010LR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bH\u0010NR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bO\u0010&R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bP\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b/\u0010Q\u001a\u0004\b>\u0010RR\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\bS\u00108R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bT\u00108R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bU\u00108R\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\bI\u0010&R\u0019\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bV\u0010:\u001a\u0004\bV\u0010&¨\u0006W"}, m65681d2 = {"Lv90/g;", "Lm91/u;", "Lv90/j;", "paymentOptions", "Lv90/i;", "orderDetails", "", "orderDetailsReplaced", "", "sku", "promoCode", "", "Lp90/m;", "acceptedPaymentTypes", "Lp90/l;", "paymentMethodTextFields", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "errorMessages", "analyticsName", "Lcom/whoop/design/util/TextResource;", "securityText", "disclaimerText", "Lq22/e;", "formValidator", "paymentMethodId", "userCountryCode", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "isLoadingPayment", "showFullScreenError", "isTrialMember", "membershipTier", "stripeToken", "<init>", "(Lv90/j;Lv90/i;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lp90/l;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZZZLjava/lang/String;Ljava/lang/String;)V", "a", "(Lv90/j;Lv90/i;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lp90/l;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lq22/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZZZLjava/lang/String;Ljava/lang/String;)Lv90/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lv90/j;", "o", "()Lv90/j;", "b", "Lv90/i;", "k", "()Lv90/i;", "c", "Z", "l", "()Z", "d", "Ljava/lang/String;", "s", "e", "p", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "Lp90/l;", "n", "()Lp90/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "i", "j", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "Lq22/e;", "()Lq22/e;", "m", "u", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "v", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "t", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35815g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35818j paymentOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35817i orderDetails;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean orderDetailsReplaced;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String sku;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String promoCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C29005m> acceptedPaymentTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29004l paymentMethodTextFields;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final PaymentErrorMessages errorMessages;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource securityText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource disclaimerText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C29855e formValidator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String userCountryCode;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final CommitmentType commitmentType;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean isLoadingPayment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean showFullScreenError;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isTrialMember;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String membershipTier;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String stripeToken;

    public C35815g(C35818j paymentOptions, C35817i orderDetails, boolean z4, String sku, String str, List<C29005m> acceptedPaymentTypes, C29004l paymentMethodTextFields, PaymentErrorMessages errorMessages, String analyticsName, TextResource securityText, TextResource disclaimerText, C29855e c29855e, String str2, String str3, CommitmentType commitmentType, boolean z13, boolean z14, boolean z15, String membershipTier, String str4) {
        AbstractC22676k.m65750j(paymentOptions, "paymentOptions");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(paymentMethodTextFields, "paymentMethodTextFields");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(securityText, "securityText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        this.paymentOptions = paymentOptions;
        this.orderDetails = orderDetails;
        this.orderDetailsReplaced = z4;
        this.sku = sku;
        this.promoCode = str;
        this.acceptedPaymentTypes = acceptedPaymentTypes;
        this.paymentMethodTextFields = paymentMethodTextFields;
        this.errorMessages = errorMessages;
        this.analyticsName = analyticsName;
        this.securityText = securityText;
        this.disclaimerText = disclaimerText;
        this.formValidator = c29855e;
        this.paymentMethodId = str2;
        this.userCountryCode = str3;
        this.commitmentType = commitmentType;
        this.isLoadingPayment = z13;
        this.showFullScreenError = z14;
        this.isTrialMember = z15;
        this.membershipTier = membershipTier;
        this.stripeToken = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35815g m113566b(C35815g c35815g, C35818j c35818j, C35817i c35817i, boolean z4, String str, String str2, List list, C29004l c29004l, PaymentErrorMessages paymentErrorMessages, String str3, TextResource textResource, TextResource textResource2, C29855e c29855e, String str4, String str5, CommitmentType commitmentType, boolean z13, boolean z14, boolean z15, String str6, String str7, int i13, Object obj) {
        String str8;
        String str9;
        C35818j c35818j2 = (i13 & 1) != 0 ? c35815g.paymentOptions : c35818j;
        C35817i c35817i2 = (i13 & 2) != 0 ? c35815g.orderDetails : c35817i;
        boolean z16 = (i13 & 4) != 0 ? c35815g.orderDetailsReplaced : z4;
        String str10 = (i13 & 8) != 0 ? c35815g.sku : str;
        String str11 = (i13 & 16) != 0 ? c35815g.promoCode : str2;
        List list2 = (i13 & 32) != 0 ? c35815g.acceptedPaymentTypes : list;
        C29004l c29004l2 = (i13 & 64) != 0 ? c35815g.paymentMethodTextFields : c29004l;
        PaymentErrorMessages paymentErrorMessages2 = (i13 & 128) != 0 ? c35815g.errorMessages : paymentErrorMessages;
        String str12 = (i13 & 256) != 0 ? c35815g.analyticsName : str3;
        TextResource textResource3 = (i13 & 512) != 0 ? c35815g.securityText : textResource;
        TextResource textResource4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c35815g.disclaimerText : textResource2;
        C29855e c29855e2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c35815g.formValidator : c29855e;
        String str13 = (i13 & 4096) != 0 ? c35815g.paymentMethodId : str4;
        String str14 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c35815g.userCountryCode : str5;
        C35818j c35818j3 = c35818j2;
        CommitmentType commitmentType2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c35815g.commitmentType : commitmentType;
        boolean z17 = (i13 & 32768) != 0 ? c35815g.isLoadingPayment : z13;
        boolean z18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c35815g.showFullScreenError : z14;
        boolean z19 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c35815g.isTrialMember : z15;
        String str15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c35815g.membershipTier : str6;
        if ((i13 & 524288) != 0) {
            str9 = str15;
            str8 = c35815g.stripeToken;
        } else {
            str8 = str7;
            str9 = str15;
        }
        return c35815g.m113567a(c35818j3, c35817i2, z16, str10, str11, list2, c29004l2, paymentErrorMessages2, str12, textResource3, textResource4, c29855e2, str13, str14, commitmentType2, z17, z18, z19, str9, str8);
    }

    /* JADX INFO: renamed from: a */
    public final C35815g m113567a(C35818j paymentOptions, C35817i orderDetails, boolean orderDetailsReplaced, String sku, String promoCode, List<C29005m> acceptedPaymentTypes, C29004l paymentMethodTextFields, PaymentErrorMessages errorMessages, String analyticsName, TextResource securityText, TextResource disclaimerText, C29855e formValidator, String paymentMethodId, String userCountryCode, CommitmentType commitmentType, boolean isLoadingPayment, boolean showFullScreenError, boolean isTrialMember, String membershipTier, String stripeToken) {
        AbstractC22676k.m65750j(paymentOptions, "paymentOptions");
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(paymentMethodTextFields, "paymentMethodTextFields");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(securityText, "securityText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        return new C35815g(paymentOptions, orderDetails, orderDetailsReplaced, sku, promoCode, acceptedPaymentTypes, paymentMethodTextFields, errorMessages, analyticsName, securityText, disclaimerText, formValidator, paymentMethodId, userCountryCode, commitmentType, isLoadingPayment, showFullScreenError, isTrialMember, membershipTier, stripeToken);
    }

    /* JADX INFO: renamed from: c */
    public final List<C29005m> m113568c() {
        return this.acceptedPaymentTypes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35815g)) {
            return false;
        }
        C35815g c35815g = (C35815g) other;
        return AbstractC22676k.m65745e(this.paymentOptions, c35815g.paymentOptions) && AbstractC22676k.m65745e(this.orderDetails, c35815g.orderDetails) && this.orderDetailsReplaced == c35815g.orderDetailsReplaced && AbstractC22676k.m65745e(this.sku, c35815g.sku) && AbstractC22676k.m65745e(this.promoCode, c35815g.promoCode) && AbstractC22676k.m65745e(this.acceptedPaymentTypes, c35815g.acceptedPaymentTypes) && AbstractC22676k.m65745e(this.paymentMethodTextFields, c35815g.paymentMethodTextFields) && AbstractC22676k.m65745e(this.errorMessages, c35815g.errorMessages) && AbstractC22676k.m65745e(this.analyticsName, c35815g.analyticsName) && AbstractC22676k.m65745e(this.securityText, c35815g.securityText) && AbstractC22676k.m65745e(this.disclaimerText, c35815g.disclaimerText) && AbstractC22676k.m65745e(this.formValidator, c35815g.formValidator) && AbstractC22676k.m65745e(this.paymentMethodId, c35815g.paymentMethodId) && AbstractC22676k.m65745e(this.userCountryCode, c35815g.userCountryCode) && this.commitmentType == c35815g.commitmentType && this.isLoadingPayment == c35815g.isLoadingPayment && this.showFullScreenError == c35815g.showFullScreenError && this.isTrialMember == c35815g.isTrialMember && AbstractC22676k.m65745e(this.membershipTier, c35815g.membershipTier) && AbstractC22676k.m65745e(this.stripeToken, c35815g.stripeToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.orderDetails.hashCode() + (this.paymentOptions.hashCode() * 31)) * 31, 31, this.orderDetailsReplaced), 31, this.sku);
        String str = this.promoCode;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d((this.errorMessages.hashCode() + ((this.paymentMethodTextFields.hashCode() + AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.acceptedPaymentTypes)) * 31)) * 31, 31, this.analyticsName), this.securityText, 31), this.disclaimerText, 31);
        C29855e c29855e = this.formValidator;
        int iHashCode = (iM95625a + (c29855e == null ? 0 : c29855e.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userCountryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommitmentType commitmentType = this.commitmentType;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (commitmentType == null ? 0 : commitmentType.hashCode())) * 31, 31, this.isLoadingPayment), 31, this.showFullScreenError), 31, this.isTrialMember), 31, this.membershipTier);
        String str4 = this.stripeToken;
        return iM30450d2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C29855e getFormValidator() {
        return this.formValidator;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMembershipTier() {
        return this.membershipTier;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C35817i getOrderDetails() {
        return this.orderDetails;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getOrderDetailsReplaced() {
        return this.orderDetailsReplaced;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C29004l getPaymentMethodTextFields() {
        return this.paymentMethodTextFields;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C35818j getPaymentOptions() {
        return this.paymentOptions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextResource getSecurityText() {
        return this.securityText;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShowFullScreenError() {
        return this.showFullScreenError;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    public String toString() {
        C35818j c35818j = this.paymentOptions;
        C35817i c35817i = this.orderDetails;
        boolean z4 = this.orderDetailsReplaced;
        String str = this.sku;
        String str2 = this.promoCode;
        List<C29005m> list = this.acceptedPaymentTypes;
        C29004l c29004l = this.paymentMethodTextFields;
        PaymentErrorMessages paymentErrorMessages = this.errorMessages;
        String str3 = this.analyticsName;
        TextResource textResource = this.securityText;
        TextResource textResource2 = this.disclaimerText;
        C29855e c29855e = this.formValidator;
        String str4 = this.paymentMethodId;
        String str5 = this.userCountryCode;
        CommitmentType commitmentType = this.commitmentType;
        boolean z13 = this.isLoadingPayment;
        boolean z14 = this.showFullScreenError;
        boolean z15 = this.isTrialMember;
        String str6 = this.membershipTier;
        String str7 = this.stripeToken;
        StringBuilder sb4 = new StringBuilder("TrialOfferCheckoutState(paymentOptions=");
        sb4.append(c35818j);
        sb4.append(", orderDetails=");
        sb4.append(c35817i);
        sb4.append(", orderDetailsReplaced=");
        AbstractC38963t7.m124391u(sb4, z4, ", sku=", str, ", promoCode=");
        AbstractC36095b.m114694v(str2, ", acceptedPaymentTypes=", ", paymentMethodTextFields=", sb4, list);
        sb4.append(c29004l);
        sb4.append(", errorMessages=");
        sb4.append(paymentErrorMessages);
        sb4.append(", analyticsName=");
        AbstractC30007c.m91826A(sb4, str3, ", securityText=", textResource, ", disclaimerText=");
        sb4.append(textResource2);
        sb4.append(", formValidator=");
        sb4.append(c29855e);
        sb4.append(", paymentMethodId=");
        AbstractC11266d.m30444B(sb4, str4, ", userCountryCode=", str5, ", commitmentType=");
        sb4.append(commitmentType);
        sb4.append(", isLoadingPayment=");
        sb4.append(z13);
        sb4.append(", showFullScreenError=");
        AbstractC38963t7.m124392v(sb4, z14, ", isTrialMember=", z15, ", membershipTier=");
        return AbstractC11266d.m30464r(sb4, str6, ", stripeToken=", str7, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsLoadingPayment() {
        return this.isLoadingPayment;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsTrialMember() {
        return this.isTrialMember;
    }

    public /* synthetic */ C35815g(C35818j c35818j, C35817i c35817i, boolean z4, String str, String str2, List list, C29004l c29004l, PaymentErrorMessages paymentErrorMessages, String str3, TextResource textResource, TextResource textResource2, C29855e c29855e, String str4, String str5, CommitmentType commitmentType, boolean z13, boolean z14, boolean z15, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c35818j, c35817i, (i13 & 4) != 0 ? false : z4, str, (i13 & 16) != 0 ? null : str2, list, c29004l, paymentErrorMessages, str3, textResource, textResource2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c29855e, (i13 & 4096) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str5, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : commitmentType, (32768 & i13) != 0 ? false : z13, (65536 & i13) != 0 ? false : z14, (131072 & i13) != 0 ? false : z15, str6, (i13 & 524288) != 0 ? null : str7);
    }
}

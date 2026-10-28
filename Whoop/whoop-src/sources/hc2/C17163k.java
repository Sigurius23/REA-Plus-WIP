package hc2;

import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.domain.response.growth.AffiliateType;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.remote.domain.response.growth.TrialDetails;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import oa2.C27756d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y71.C39282o;

/* JADX INFO: renamed from: hc2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J¦\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b6\u0010;R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b<\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b+\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b=\u0010?R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\b@\u0010BR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010C\u001a\u0004\b2\u0010\u001d¨\u0006D"}, m65681d2 = {"Lhc2/k;", "", "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "membershipInfo", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "membershipStatus", "Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", "affiliateType", "", "canAddPaymentMethod", "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "trialDetails", "Loa2/d;", "myAccountHeaderViewState", "Lhc2/b;", "membershipPauseInfo", "showCancelMembershipButton", "Ly71/o;", "advancedLabsManagementItem", "paymentMethodMenuItem", "", "", "paymentMethodMenuItemAnalyticsProperties", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;)V", "a", "(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;)Lhc2/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "getMembershipInfo", "()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "b", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "g", "()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "c", "Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", "d", "()Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", "Z", "getCanAddPaymentMethod", "()Z", "e", "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "l", "()Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "f", "Loa2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Loa2/d;", "Lhc2/b;", "()Lhc2/b;", "k", "i", "Ly71/o;", "()Ly71/o;", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17163k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipInfo membershipInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MembershipStatus membershipStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AffiliateType affiliateType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean canAddPaymentMethod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TrialDetails trialDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27756d myAccountHeaderViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C17154b membershipPauseInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showCancelMembershipButton;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C39282o advancedLabsManagementItem;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C39282o paymentMethodMenuItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, String> paymentMethodMenuItemAnalyticsProperties;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String email;

    public C17163k(MembershipInfo membershipInfo, MembershipStatus membershipStatus, AffiliateType affiliateType, boolean z4, TrialDetails trialDetails, C27756d c27756d, C17154b c17154b, boolean z13, C39282o c39282o, C39282o c39282o2, Map<String, String> map, String email) {
        AbstractC22676k.m65750j(email, "email");
        this.membershipInfo = membershipInfo;
        this.membershipStatus = membershipStatus;
        this.affiliateType = affiliateType;
        this.canAddPaymentMethod = z4;
        this.trialDetails = trialDetails;
        this.myAccountHeaderViewState = c27756d;
        this.membershipPauseInfo = c17154b;
        this.showCancelMembershipButton = z13;
        this.advancedLabsManagementItem = c39282o;
        this.paymentMethodMenuItem = c39282o2;
        this.paymentMethodMenuItemAnalyticsProperties = map;
        this.email = email;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17163k m48457b(C17163k c17163k, MembershipInfo membershipInfo, MembershipStatus membershipStatus, AffiliateType affiliateType, boolean z4, TrialDetails trialDetails, C27756d c27756d, C17154b c17154b, boolean z13, C39282o c39282o, C39282o c39282o2, Map map, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            membershipInfo = c17163k.membershipInfo;
        }
        if ((i13 & 2) != 0) {
            membershipStatus = c17163k.membershipStatus;
        }
        if ((i13 & 4) != 0) {
            affiliateType = c17163k.affiliateType;
        }
        if ((i13 & 8) != 0) {
            z4 = c17163k.canAddPaymentMethod;
        }
        if ((i13 & 16) != 0) {
            trialDetails = c17163k.trialDetails;
        }
        if ((i13 & 32) != 0) {
            c27756d = c17163k.myAccountHeaderViewState;
        }
        if ((i13 & 64) != 0) {
            c17154b = c17163k.membershipPauseInfo;
        }
        if ((i13 & 128) != 0) {
            z13 = c17163k.showCancelMembershipButton;
        }
        if ((i13 & 256) != 0) {
            c39282o = c17163k.advancedLabsManagementItem;
        }
        if ((i13 & 512) != 0) {
            c39282o2 = c17163k.paymentMethodMenuItem;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = c17163k.paymentMethodMenuItemAnalyticsProperties;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str = c17163k.email;
        }
        Map map2 = map;
        String str2 = str;
        C39282o c39282o3 = c39282o;
        C39282o c39282o4 = c39282o2;
        C17154b c17154b2 = c17154b;
        boolean z14 = z13;
        TrialDetails trialDetails2 = trialDetails;
        C27756d c27756d2 = c27756d;
        return c17163k.m48458a(membershipInfo, membershipStatus, affiliateType, z4, trialDetails2, c27756d2, c17154b2, z14, c39282o3, c39282o4, map2, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C17163k m48458a(MembershipInfo membershipInfo, MembershipStatus membershipStatus, AffiliateType affiliateType, boolean canAddPaymentMethod, TrialDetails trialDetails, C27756d myAccountHeaderViewState, C17154b membershipPauseInfo, boolean showCancelMembershipButton, C39282o advancedLabsManagementItem, C39282o paymentMethodMenuItem, Map<String, String> paymentMethodMenuItemAnalyticsProperties, String email) {
        AbstractC22676k.m65750j(email, "email");
        return new C17163k(membershipInfo, membershipStatus, affiliateType, canAddPaymentMethod, trialDetails, myAccountHeaderViewState, membershipPauseInfo, showCancelMembershipButton, advancedLabsManagementItem, paymentMethodMenuItem, paymentMethodMenuItemAnalyticsProperties, email);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39282o getAdvancedLabsManagementItem() {
        return this.advancedLabsManagementItem;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AffiliateType getAffiliateType() {
        return this.affiliateType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17163k)) {
            return false;
        }
        C17163k c17163k = (C17163k) other;
        return AbstractC22676k.m65745e(this.membershipInfo, c17163k.membershipInfo) && this.membershipStatus == c17163k.membershipStatus && this.affiliateType == c17163k.affiliateType && this.canAddPaymentMethod == c17163k.canAddPaymentMethod && AbstractC22676k.m65745e(this.trialDetails, c17163k.trialDetails) && AbstractC22676k.m65745e(this.myAccountHeaderViewState, c17163k.myAccountHeaderViewState) && AbstractC22676k.m65745e(this.membershipPauseInfo, c17163k.membershipPauseInfo) && this.showCancelMembershipButton == c17163k.showCancelMembershipButton && AbstractC22676k.m65745e(this.advancedLabsManagementItem, c17163k.advancedLabsManagementItem) && AbstractC22676k.m65745e(this.paymentMethodMenuItem, c17163k.paymentMethodMenuItem) && AbstractC22676k.m65745e(this.paymentMethodMenuItemAnalyticsProperties, c17163k.paymentMethodMenuItemAnalyticsProperties) && AbstractC22676k.m65745e(this.email, c17163k.email);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C17154b getMembershipPauseInfo() {
        return this.membershipPauseInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C27756d getMyAccountHeaderViewState() {
        return this.myAccountHeaderViewState;
    }

    public int hashCode() {
        MembershipInfo membershipInfo = this.membershipInfo;
        int iHashCode = (membershipInfo == null ? 0 : membershipInfo.hashCode()) * 31;
        MembershipStatus membershipStatus = this.membershipStatus;
        int iHashCode2 = (iHashCode + (membershipStatus == null ? 0 : membershipStatus.hashCode())) * 31;
        AffiliateType affiliateType = this.affiliateType;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (affiliateType == null ? 0 : affiliateType.hashCode())) * 31, 31, this.canAddPaymentMethod);
        TrialDetails trialDetails = this.trialDetails;
        int iHashCode3 = (iM8289b + (trialDetails == null ? 0 : trialDetails.hashCode())) * 31;
        C27756d c27756d = this.myAccountHeaderViewState;
        int iHashCode4 = (iHashCode3 + (c27756d == null ? 0 : c27756d.hashCode())) * 31;
        C17154b c17154b = this.membershipPauseInfo;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode4 + (c17154b == null ? 0 : c17154b.hashCode())) * 31, 31, this.showCancelMembershipButton);
        C39282o c39282o = this.advancedLabsManagementItem;
        int iHashCode5 = (iM8289b2 + (c39282o == null ? 0 : c39282o.hashCode())) * 31;
        C39282o c39282o2 = this.paymentMethodMenuItem;
        int iHashCode6 = (iHashCode5 + (c39282o2 == null ? 0 : c39282o2.hashCode())) * 31;
        Map<String, String> map = this.paymentMethodMenuItemAnalyticsProperties;
        return this.email.hashCode() + ((iHashCode6 + (map != null ? map.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39282o getPaymentMethodMenuItem() {
        return this.paymentMethodMenuItem;
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, String> m48466j() {
        return this.paymentMethodMenuItemAnalyticsProperties;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowCancelMembershipButton() {
        return this.showCancelMembershipButton;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TrialDetails getTrialDetails() {
        return this.trialDetails;
    }

    public String toString() {
        return "MyAccountViewState(membershipInfo=" + this.membershipInfo + ", membershipStatus=" + this.membershipStatus + ", affiliateType=" + this.affiliateType + ", canAddPaymentMethod=" + this.canAddPaymentMethod + ", trialDetails=" + this.trialDetails + ", myAccountHeaderViewState=" + this.myAccountHeaderViewState + ", membershipPauseInfo=" + this.membershipPauseInfo + ", showCancelMembershipButton=" + this.showCancelMembershipButton + ", advancedLabsManagementItem=" + this.advancedLabsManagementItem + ", paymentMethodMenuItem=" + this.paymentMethodMenuItem + ", paymentMethodMenuItemAnalyticsProperties=" + this.paymentMethodMenuItemAnalyticsProperties + ", email=" + this.email + ")";
    }

    public /* synthetic */ C17163k(MembershipInfo membershipInfo, MembershipStatus membershipStatus, AffiliateType affiliateType, boolean z4, TrialDetails trialDetails, C27756d c27756d, C17154b c17154b, boolean z13, C39282o c39282o, C39282o c39282o2, Map map, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(membershipInfo, (i13 & 2) != 0 ? null : membershipStatus, (i13 & 4) != 0 ? null : affiliateType, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : trialDetails, (i13 & 32) != 0 ? null : c27756d, (i13 & 64) != 0 ? null : c17154b, (i13 & 128) == 0 ? z13 : false, (i13 & 256) != 0 ? null : c39282o, (i13 & 512) != 0 ? null : c39282o2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? map : null, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str);
    }
}

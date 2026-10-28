package n42;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: n42.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\u001a\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b\u001e\u0010+¨\u0006,"}, m65681d2 = {"Ln42/g;", "", "", "isCommunityFollowersEnabled", "isTeamInvitationEnabled", "isMutualCommunitySharingEnabled", "isCommunityToggleSuccess", "isCommunityToggleError", "isRecommendationEnabled", "isRecommendationToggleSuccess", "isRecommendationToggleError", "Ln42/e;", "dataSharingViewState", "Ln42/b;", "showDataSharingSheet", "<init>", "(ZZZZZLjava/lang/Boolean;ZZLn42/e;Ln42/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "j", "f", "d", "e", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ln42/e;", "()Ln42/e;", "Ln42/b;", "()Ln42/b;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26283g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isCommunityFollowersEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isTeamInvitationEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMutualCommunitySharingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isCommunityToggleSuccess;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCommunityToggleError;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Boolean isRecommendationEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isRecommendationToggleSuccess;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isRecommendationToggleError;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C26281e dataSharingViewState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C26278b showDataSharingSheet;

    public C26283g(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, Boolean bool, boolean z17, boolean z18, C26281e c26281e, C26278b c26278b) {
        this.isCommunityFollowersEnabled = z4;
        this.isTeamInvitationEnabled = z13;
        this.isMutualCommunitySharingEnabled = z14;
        this.isCommunityToggleSuccess = z15;
        this.isCommunityToggleError = z16;
        this.isRecommendationEnabled = bool;
        this.isRecommendationToggleSuccess = z17;
        this.isRecommendationToggleError = z18;
        this.dataSharingViewState = c26281e;
        this.showDataSharingSheet = c26278b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26281e getDataSharingViewState() {
        return this.dataSharingViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C26278b getShowDataSharingSheet() {
        return this.showDataSharingSheet;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsCommunityFollowersEnabled() {
        return this.isCommunityFollowersEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsCommunityToggleError() {
        return this.isCommunityToggleError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCommunityToggleSuccess() {
        return this.isCommunityToggleSuccess;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26283g)) {
            return false;
        }
        C26283g c26283g = (C26283g) other;
        return this.isCommunityFollowersEnabled == c26283g.isCommunityFollowersEnabled && this.isTeamInvitationEnabled == c26283g.isTeamInvitationEnabled && this.isMutualCommunitySharingEnabled == c26283g.isMutualCommunitySharingEnabled && this.isCommunityToggleSuccess == c26283g.isCommunityToggleSuccess && this.isCommunityToggleError == c26283g.isCommunityToggleError && AbstractC22676k.m65745e(this.isRecommendationEnabled, c26283g.isRecommendationEnabled) && this.isRecommendationToggleSuccess == c26283g.isRecommendationToggleSuccess && this.isRecommendationToggleError == c26283g.isRecommendationToggleError && AbstractC22676k.m65745e(this.dataSharingViewState, c26283g.dataSharingViewState) && AbstractC22676k.m65745e(this.showDataSharingSheet, c26283g.showDataSharingSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsMutualCommunitySharingEnabled() {
        return this.isMutualCommunitySharingEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsRecommendationEnabled() {
        return this.isRecommendationEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsRecommendationToggleError() {
        return this.isRecommendationToggleError;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isCommunityFollowersEnabled) * 31, 31, this.isTeamInvitationEnabled), 31, this.isMutualCommunitySharingEnabled), 31, this.isCommunityToggleSuccess), 31, this.isCommunityToggleError);
        Boolean bool = this.isRecommendationEnabled;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isRecommendationToggleSuccess), 31, this.isRecommendationToggleError);
        C26281e c26281e = this.dataSharingViewState;
        int iHashCode = (iM8289b2 + (c26281e == null ? 0 : c26281e.hashCode())) * 31;
        C26278b c26278b = this.showDataSharingSheet;
        return iHashCode + (c26278b != null ? c26278b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsRecommendationToggleSuccess() {
        return this.isRecommendationToggleSuccess;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTeamInvitationEnabled() {
        return this.isTeamInvitationEnabled;
    }

    public String toString() {
        boolean z4 = this.isCommunityFollowersEnabled;
        boolean z13 = this.isTeamInvitationEnabled;
        boolean z14 = this.isMutualCommunitySharingEnabled;
        boolean z15 = this.isCommunityToggleSuccess;
        boolean z16 = this.isCommunityToggleError;
        Boolean bool = this.isRecommendationEnabled;
        boolean z17 = this.isRecommendationToggleSuccess;
        boolean z18 = this.isRecommendationToggleError;
        C26281e c26281e = this.dataSharingViewState;
        C26278b c26278b = this.showDataSharingSheet;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PrivacyConsentScreenViewState(isCommunityFollowersEnabled=", ", isTeamInvitationEnabled=", ", isMutualCommunitySharingEnabled=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", isCommunityToggleSuccess=", z15, ", isCommunityToggleError=");
        sbM32002u.append(z16);
        sbM32002u.append(", isRecommendationEnabled=");
        sbM32002u.append(bool);
        sbM32002u.append(", isRecommendationToggleSuccess=");
        AbstractC38963t7.m124392v(sbM32002u, z17, ", isRecommendationToggleError=", z18, ", dataSharingViewState=");
        sbM32002u.append(c26281e);
        sbM32002u.append(", showDataSharingSheet=");
        sbM32002u.append(c26278b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}

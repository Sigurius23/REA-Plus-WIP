package k42;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: k42.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0084\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b\"\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b&\u00100¨\u00061"}, m65681d2 = {"Lk42/f;", "", "", "isGeneralError", "isCommunityToggleError", "isCommunityToggleSuccess", "isLoading", "searchable", "isMutualCommunitySharingEnabled", "isRecommendationEnabled", "isRecommendationToggleSuccess", "isRecommendationToggleError", "Lk42/d;", "dataSharingDomainState", "Lk42/b;", "showDataSharingSheet", "<init>", "(ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;)V", "a", "(ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;)Lk42/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "b", "f", "c", "g", "d", "i", "e", "j", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "m", "l", "Lk42/d;", "()Lk42/d;", "Lk42/b;", "()Lk42/b;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22196f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isGeneralError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCommunityToggleError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCommunityToggleSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean searchable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isMutualCommunitySharingEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Boolean isRecommendationEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isRecommendationToggleSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isRecommendationToggleError;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C22194d dataSharingDomainState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C22192b showDataSharingSheet;

    public C22196f(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, boolean z18, boolean z19, C22194d c22194d, C22192b c22192b) {
        this.isGeneralError = z4;
        this.isCommunityToggleError = z13;
        this.isCommunityToggleSuccess = z14;
        this.isLoading = z15;
        this.searchable = z16;
        this.isMutualCommunitySharingEnabled = z17;
        this.isRecommendationEnabled = bool;
        this.isRecommendationToggleSuccess = z18;
        this.isRecommendationToggleError = z19;
        this.dataSharingDomainState = c22194d;
        this.showDataSharingSheet = c22192b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22196f m63572b(C22196f c22196f, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, boolean z18, boolean z19, C22194d c22194d, C22192b c22192b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c22196f.isGeneralError;
        }
        if ((i13 & 2) != 0) {
            z13 = c22196f.isCommunityToggleError;
        }
        if ((i13 & 4) != 0) {
            z14 = c22196f.isCommunityToggleSuccess;
        }
        if ((i13 & 8) != 0) {
            z15 = c22196f.isLoading;
        }
        if ((i13 & 16) != 0) {
            z16 = c22196f.searchable;
        }
        if ((i13 & 32) != 0) {
            z17 = c22196f.isMutualCommunitySharingEnabled;
        }
        if ((i13 & 64) != 0) {
            bool = c22196f.isRecommendationEnabled;
        }
        if ((i13 & 128) != 0) {
            z18 = c22196f.isRecommendationToggleSuccess;
        }
        if ((i13 & 256) != 0) {
            z19 = c22196f.isRecommendationToggleError;
        }
        if ((i13 & 512) != 0) {
            c22194d = c22196f.dataSharingDomainState;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c22192b = c22196f.showDataSharingSheet;
        }
        C22194d c22194d2 = c22194d;
        C22192b c22192b2 = c22192b;
        boolean z24 = z18;
        boolean z25 = z19;
        boolean z26 = z17;
        Boolean bool2 = bool;
        boolean z27 = z16;
        boolean z28 = z14;
        return c22196f.m63573a(z4, z13, z28, z15, z27, z26, bool2, z24, z25, c22194d2, c22192b2);
    }

    /* JADX INFO: renamed from: a */
    public final C22196f m63573a(boolean isGeneralError, boolean isCommunityToggleError, boolean isCommunityToggleSuccess, boolean isLoading, boolean searchable, boolean isMutualCommunitySharingEnabled, Boolean isRecommendationEnabled, boolean isRecommendationToggleSuccess, boolean isRecommendationToggleError, C22194d dataSharingDomainState, C22192b showDataSharingSheet) {
        return new C22196f(isGeneralError, isCommunityToggleError, isCommunityToggleSuccess, isLoading, searchable, isMutualCommunitySharingEnabled, isRecommendationEnabled, isRecommendationToggleSuccess, isRecommendationToggleError, dataSharingDomainState, showDataSharingSheet);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22194d getDataSharingDomainState() {
        return this.dataSharingDomainState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSearchable() {
        return this.searchable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C22192b getShowDataSharingSheet() {
        return this.showDataSharingSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22196f)) {
            return false;
        }
        C22196f c22196f = (C22196f) other;
        return this.isGeneralError == c22196f.isGeneralError && this.isCommunityToggleError == c22196f.isCommunityToggleError && this.isCommunityToggleSuccess == c22196f.isCommunityToggleSuccess && this.isLoading == c22196f.isLoading && this.searchable == c22196f.searchable && this.isMutualCommunitySharingEnabled == c22196f.isMutualCommunitySharingEnabled && AbstractC22676k.m65745e(this.isRecommendationEnabled, c22196f.isRecommendationEnabled) && this.isRecommendationToggleSuccess == c22196f.isRecommendationToggleSuccess && this.isRecommendationToggleError == c22196f.isRecommendationToggleError && AbstractC22676k.m65745e(this.dataSharingDomainState, c22196f.dataSharingDomainState) && AbstractC22676k.m65745e(this.showDataSharingSheet, c22196f.showDataSharingSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCommunityToggleError() {
        return this.isCommunityToggleError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsCommunityToggleSuccess() {
        return this.isCommunityToggleSuccess;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsGeneralError() {
        return this.isGeneralError;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isGeneralError) * 31, 31, this.isCommunityToggleError), 31, this.isCommunityToggleSuccess), 31, this.isLoading), 31, this.searchable), 31, this.isMutualCommunitySharingEnabled);
        Boolean bool = this.isRecommendationEnabled;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isRecommendationToggleSuccess), 31, this.isRecommendationToggleError);
        C22194d c22194d = this.dataSharingDomainState;
        int iHashCode = (iM8289b2 + (c22194d == null ? 0 : c22194d.hashCode())) * 31;
        C22192b c22192b = this.showDataSharingSheet;
        return iHashCode + (c22192b != null ? c22192b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsMutualCommunitySharingEnabled() {
        return this.isMutualCommunitySharingEnabled;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getIsRecommendationEnabled() {
        return this.isRecommendationEnabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsRecommendationToggleError() {
        return this.isRecommendationToggleError;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsRecommendationToggleSuccess() {
        return this.isRecommendationToggleSuccess;
    }

    public String toString() {
        boolean z4 = this.isGeneralError;
        boolean z13 = this.isCommunityToggleError;
        boolean z14 = this.isCommunityToggleSuccess;
        boolean z15 = this.isLoading;
        boolean z16 = this.searchable;
        boolean z17 = this.isMutualCommunitySharingEnabled;
        Boolean bool = this.isRecommendationEnabled;
        boolean z18 = this.isRecommendationToggleSuccess;
        boolean z19 = this.isRecommendationToggleError;
        C22194d c22194d = this.dataSharingDomainState;
        C22192b c22192b = this.showDataSharingSheet;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PrivacyConsentDomainState(isGeneralError=", ", isCommunityToggleError=", ", isCommunityToggleSuccess=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", isLoading=", z15, ", searchable=");
        AbstractC38963t7.m124392v(sbM32002u, z16, ", isMutualCommunitySharingEnabled=", z17, ", isRecommendationEnabled=");
        sbM32002u.append(bool);
        sbM32002u.append(", isRecommendationToggleSuccess=");
        sbM32002u.append(z18);
        sbM32002u.append(", isRecommendationToggleError=");
        sbM32002u.append(z19);
        sbM32002u.append(", dataSharingDomainState=");
        sbM32002u.append(c22194d);
        sbM32002u.append(", showDataSharingSheet=");
        sbM32002u.append(c22192b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C22196f(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, boolean z18, boolean z19, C22194d c22194d, C22192b c22192b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? false : z16, (i13 & 32) != 0 ? false : z17, (i13 & 64) != 0 ? null : bool, (i13 & 128) != 0 ? false : z18, (i13 & 256) != 0 ? false : z19, (i13 & 512) != 0 ? null : c22194d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c22192b);
    }
}

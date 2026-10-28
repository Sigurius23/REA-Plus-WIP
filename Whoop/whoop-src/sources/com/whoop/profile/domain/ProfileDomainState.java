package com.whoop.profile.domain;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.profile.domain.models.ProfileResponse;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003Jo\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001J\u0014\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u000eHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u00063"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainState;", "", "currentDialogType", "Lcom/whoop/profile/domain/ProfileDialogType;", "response", "Lcom/whoop/profile/domain/models/ProfileResponse;", "manualRefresh", "", "displayRefreshingSpinner", "designModal", "Lcom/whoop/design/models/modal/AnyModal;", "pendingNavigation", "Lcom/whoop/profile/domain/ProfileNavigationEffect;", "inFlightCardButtonId", "", "reportResult", "Lcom/whoop/profile/domain/ProfileReportResult;", "showSettingsButton", "<init>", "(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;Z)V", "getCurrentDialogType", "()Lcom/whoop/profile/domain/ProfileDialogType;", "getResponse", "()Lcom/whoop/profile/domain/models/ProfileResponse;", "getManualRefresh", "()Z", "getDisplayRefreshingSpinner", "getDesignModal", "()Lcom/whoop/design/models/modal/AnyModal;", "getPendingNavigation", "()Lcom/whoop/profile/domain/ProfileNavigationEffect;", "getInFlightCardButtonId", "()Ljava/lang/String;", "getReportResult", "()Lcom/whoop/profile/domain/ProfileReportResult;", "getShowSettingsButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProfileDomainState {
    public static final int $stable = 8;
    private final ProfileDialogType currentDialogType;
    private final AnyModal designModal;
    private final boolean displayRefreshingSpinner;
    private final String inFlightCardButtonId;
    private final boolean manualRefresh;
    private final ProfileNavigationEffect pendingNavigation;
    private final ProfileReportResult reportResult;
    private final ProfileResponse response;
    private final boolean showSettingsButton;

    public ProfileDomainState() {
        this(null, null, false, false, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ ProfileDomainState copy$default(ProfileDomainState profileDomainState, ProfileDialogType profileDialogType, ProfileResponse profileResponse, boolean z4, boolean z13, AnyModal anyModal, ProfileNavigationEffect profileNavigationEffect, String str, ProfileReportResult profileReportResult, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            profileDialogType = profileDomainState.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            profileResponse = profileDomainState.response;
        }
        if ((i13 & 4) != 0) {
            z4 = profileDomainState.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = profileDomainState.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            anyModal = profileDomainState.designModal;
        }
        if ((i13 & 32) != 0) {
            profileNavigationEffect = profileDomainState.pendingNavigation;
        }
        if ((i13 & 64) != 0) {
            str = profileDomainState.inFlightCardButtonId;
        }
        if ((i13 & 128) != 0) {
            profileReportResult = profileDomainState.reportResult;
        }
        if ((i13 & 256) != 0) {
            z14 = profileDomainState.showSettingsButton;
        }
        ProfileReportResult profileReportResult2 = profileReportResult;
        boolean z15 = z14;
        ProfileNavigationEffect profileNavigationEffect2 = profileNavigationEffect;
        String str2 = str;
        AnyModal anyModal2 = anyModal;
        boolean z16 = z4;
        return profileDomainState.copy(profileDialogType, profileResponse, z16, z13, anyModal2, profileNavigationEffect2, str2, profileReportResult2, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProfileDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProfileResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnyModal getDesignModal() {
        return this.designModal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProfileNavigationEffect getPendingNavigation() {
        return this.pendingNavigation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInFlightCardButtonId() {
        return this.inFlightCardButtonId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ProfileReportResult getReportResult() {
        return this.reportResult;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowSettingsButton() {
        return this.showSettingsButton;
    }

    public final ProfileDomainState copy(ProfileDialogType currentDialogType, ProfileResponse response, boolean manualRefresh, boolean displayRefreshingSpinner, AnyModal designModal, ProfileNavigationEffect pendingNavigation, String inFlightCardButtonId, ProfileReportResult reportResult, boolean showSettingsButton) {
        return new ProfileDomainState(currentDialogType, response, manualRefresh, displayRefreshingSpinner, designModal, pendingNavigation, inFlightCardButtonId, reportResult, showSettingsButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileDomainState)) {
            return false;
        }
        ProfileDomainState profileDomainState = (ProfileDomainState) other;
        return AbstractC22676k.m65745e(this.currentDialogType, profileDomainState.currentDialogType) && AbstractC22676k.m65745e(this.response, profileDomainState.response) && this.manualRefresh == profileDomainState.manualRefresh && this.displayRefreshingSpinner == profileDomainState.displayRefreshingSpinner && AbstractC22676k.m65745e(this.designModal, profileDomainState.designModal) && AbstractC22676k.m65745e(this.pendingNavigation, profileDomainState.pendingNavigation) && AbstractC22676k.m65745e(this.inFlightCardButtonId, profileDomainState.inFlightCardButtonId) && this.reportResult == profileDomainState.reportResult && this.showSettingsButton == profileDomainState.showSettingsButton;
    }

    public final ProfileDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    public final AnyModal getDesignModal() {
        return this.designModal;
    }

    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public final String getInFlightCardButtonId() {
        return this.inFlightCardButtonId;
    }

    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public final ProfileNavigationEffect getPendingNavigation() {
        return this.pendingNavigation;
    }

    public final ProfileReportResult getReportResult() {
        return this.reportResult;
    }

    public final ProfileResponse getResponse() {
        return this.response;
    }

    public final boolean getShowSettingsButton() {
        return this.showSettingsButton;
    }

    public int hashCode() {
        ProfileDialogType profileDialogType = this.currentDialogType;
        int iHashCode = (profileDialogType == null ? 0 : profileDialogType.hashCode()) * 31;
        ProfileResponse profileResponse = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (profileResponse == null ? 0 : profileResponse.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        AnyModal anyModal = this.designModal;
        int iHashCode2 = (iM8289b + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        ProfileNavigationEffect profileNavigationEffect = this.pendingNavigation;
        int iHashCode3 = (iHashCode2 + (profileNavigationEffect == null ? 0 : profileNavigationEffect.hashCode())) * 31;
        String str = this.inFlightCardButtonId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ProfileReportResult profileReportResult = this.reportResult;
        return Boolean.hashCode(this.showSettingsButton) + ((iHashCode4 + (profileReportResult != null ? profileReportResult.hashCode() : 0)) * 31);
    }

    public String toString() {
        ProfileDialogType profileDialogType = this.currentDialogType;
        ProfileResponse profileResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        AnyModal anyModal = this.designModal;
        ProfileNavigationEffect profileNavigationEffect = this.pendingNavigation;
        String str = this.inFlightCardButtonId;
        ProfileReportResult profileReportResult = this.reportResult;
        boolean z14 = this.showSettingsButton;
        StringBuilder sb4 = new StringBuilder("ProfileDomainState(currentDialogType=");
        sb4.append(profileDialogType);
        sb4.append(", response=");
        sb4.append(profileResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", designModal=");
        sb4.append(anyModal);
        sb4.append(", pendingNavigation=");
        sb4.append(profileNavigationEffect);
        sb4.append(", inFlightCardButtonId=");
        sb4.append(str);
        sb4.append(", reportResult=");
        sb4.append(profileReportResult);
        sb4.append(", showSettingsButton=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public ProfileDomainState(ProfileDialogType profileDialogType, ProfileResponse profileResponse, boolean z4, boolean z13, AnyModal anyModal, ProfileNavigationEffect profileNavigationEffect, String str, ProfileReportResult profileReportResult, boolean z14) {
        this.currentDialogType = profileDialogType;
        this.response = profileResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.designModal = anyModal;
        this.pendingNavigation = profileNavigationEffect;
        this.inFlightCardButtonId = str;
        this.reportResult = profileReportResult;
        this.showSettingsButton = z14;
    }

    public /* synthetic */ ProfileDomainState(ProfileDialogType profileDialogType, ProfileResponse profileResponse, boolean z4, boolean z13, AnyModal anyModal, ProfileNavigationEffect profileNavigationEffect, String str, ProfileReportResult profileReportResult, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : profileDialogType, (i13 & 2) != 0 ? null : profileResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : anyModal, (i13 & 32) != 0 ? null : profileNavigationEffect, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : profileReportResult, (i13 & 256) != 0 ? false : z14);
    }
}

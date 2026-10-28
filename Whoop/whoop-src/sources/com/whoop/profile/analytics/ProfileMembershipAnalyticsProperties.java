package com.whoop.profile.analytics;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "", "followingState", "", "communityVisible", "", "ageVisible", "locationVisible", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFollowingState", "()Ljava/lang/String;", "getCommunityVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAgeVisible", "getLocationVisible", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProfileMembershipAnalyticsProperties {
    public static final int $stable = 0;
    private final Boolean ageVisible;
    private final Boolean communityVisible;
    private final String followingState;
    private final Boolean locationVisible;

    public ProfileMembershipAnalyticsProperties() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ProfileMembershipAnalyticsProperties copy$default(ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, String str, Boolean bool, Boolean bool2, Boolean bool3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = profileMembershipAnalyticsProperties.followingState;
        }
        if ((i13 & 2) != 0) {
            bool = profileMembershipAnalyticsProperties.communityVisible;
        }
        if ((i13 & 4) != 0) {
            bool2 = profileMembershipAnalyticsProperties.ageVisible;
        }
        if ((i13 & 8) != 0) {
            bool3 = profileMembershipAnalyticsProperties.locationVisible;
        }
        return profileMembershipAnalyticsProperties.copy(str, bool, bool2, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFollowingState() {
        return this.followingState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCommunityVisible() {
        return this.communityVisible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAgeVisible() {
        return this.ageVisible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getLocationVisible() {
        return this.locationVisible;
    }

    public final ProfileMembershipAnalyticsProperties copy(String followingState, Boolean communityVisible, Boolean ageVisible, Boolean locationVisible) {
        return new ProfileMembershipAnalyticsProperties(followingState, communityVisible, ageVisible, locationVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileMembershipAnalyticsProperties)) {
            return false;
        }
        ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties = (ProfileMembershipAnalyticsProperties) other;
        return AbstractC22676k.m65745e(this.followingState, profileMembershipAnalyticsProperties.followingState) && AbstractC22676k.m65745e(this.communityVisible, profileMembershipAnalyticsProperties.communityVisible) && AbstractC22676k.m65745e(this.ageVisible, profileMembershipAnalyticsProperties.ageVisible) && AbstractC22676k.m65745e(this.locationVisible, profileMembershipAnalyticsProperties.locationVisible);
    }

    public final Boolean getAgeVisible() {
        return this.ageVisible;
    }

    public final Boolean getCommunityVisible() {
        return this.communityVisible;
    }

    public final String getFollowingState() {
        return this.followingState;
    }

    public final Boolean getLocationVisible() {
        return this.locationVisible;
    }

    public int hashCode() {
        String str = this.followingState;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.communityVisible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ageVisible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.locationVisible;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "ProfileMembershipAnalyticsProperties(followingState=" + this.followingState + ", communityVisible=" + this.communityVisible + ", ageVisible=" + this.ageVisible + ", locationVisible=" + this.locationVisible + ")";
    }

    public ProfileMembershipAnalyticsProperties(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this.followingState = str;
        this.communityVisible = bool;
        this.ageVisible = bool2;
        this.locationVisible = bool3;
    }

    public /* synthetic */ ProfileMembershipAnalyticsProperties(String str, Boolean bool, Boolean bool2, Boolean bool3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : bool3);
    }
}

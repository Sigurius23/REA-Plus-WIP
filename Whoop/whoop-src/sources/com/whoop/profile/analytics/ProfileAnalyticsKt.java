package com.whoop.profile.analytics;

import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b*\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u000f\u0010\n\u001a\u0011\u0010\u0010\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0010\u0010\n\u001a\u0011\u0010\u0011\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a\u0019\u0010\u0013\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0011\u0010\u0018\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0018\u0010\n\u001a\u0011\u0010\u0019\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0019\u0010\n\u001a\u0011\u0010\u001a\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u001a\u0010\n\u001a\u001d\u0010\u001b\u001a\u00020\b*\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001e\"\u0014\u0010#\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001e\"\u0014\u0010$\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0014\u0010%\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u001e\"\u0014\u0010&\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u001e\"\u0014\u0010(\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u001e\"\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001e\"\u0014\u0010*\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u001e\"\u0014\u0010+\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u001e\"\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001e\"\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001e¨\u0006."}, m65681d2 = {"Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "", "", "", "toOtherPropertiesMap", "(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;", "toOtherPropertiesMapOrNull", "Lfi0/a;", "Ll83/a0;", "hitBottomOfProfileEvent", "(Lfi0/a;)V", "source", "membershipAnalytics", "profileOpened", "(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V", "profileSaveTapped", "usernameFieldTapped", "usernameSaveAttempted", "timeframe", "dataHighlightsToggleTapped", "(Lfi0/a;Ljava/lang/String;)V", "activitySummaryToggleTapped", "activitySummaryExpanded", "activitySummaryCollapsed", "healthspanTapped", "streaksTapped", "levelsTapped", "otherProfileOpened", "(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V", "PROFILE", "Ljava/lang/String;", "SCROLLED_TO_BOTTOM", "SELF", "OTHER_PROFILE", "OPEN", "VIEW", "SAVE", "DATA_HIGHLIGHTS_TOGGLE", "ACTIVITY_SUMMARY_TOGGLE", "ACTIVITY_SUMMARY_EXPANDED", "ACTIVITY_SUMMARY_COLLAPSED", "PROFILE_UNKNOWN_SOURCE", "PROFILE_UNKNOWN_ANALYTICS_SOURCE", "PROFILE_RESTORED_SOURCE", "TAP", "USERNAME", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileAnalyticsKt {
    public static final String ACTIVITY_SUMMARY_COLLAPSED = "activity_summary_collapsed";
    public static final String ACTIVITY_SUMMARY_EXPANDED = "activity_summary_expanded";
    public static final String ACTIVITY_SUMMARY_TOGGLE = "activity_summary_toggle";
    public static final String DATA_HIGHLIGHTS_TOGGLE = "data_highlights_toggle";
    public static final String OPEN = "open";
    public static final String OTHER_PROFILE = "other_profile";
    public static final String PROFILE = "Profile";
    public static final String PROFILE_RESTORED_SOURCE = "restored";
    public static final String PROFILE_UNKNOWN_ANALYTICS_SOURCE = "unknown";
    public static final String PROFILE_UNKNOWN_SOURCE = "unknown_source";
    public static final String SAVE = "save";
    public static final String SCROLLED_TO_BOTTOM = "scrolled_to_bottom";
    public static final String SELF = "self";
    private static final String TAP = "tap";
    private static final String USERNAME = "username";
    public static final String VIEW = "view";

    public static final void activitySummaryCollapsed(InterfaceC14515a interfaceC14515a, String timeframe) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(timeframe, "timeframe");
        interfaceC14515a.mo41422d(SELF, ACTIVITY_SUMMARY_COLLAPSED, null, PROFILE, timeframe, null);
    }

    public static final void activitySummaryExpanded(InterfaceC14515a interfaceC14515a, String timeframe) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(timeframe, "timeframe");
        interfaceC14515a.mo41422d(SELF, ACTIVITY_SUMMARY_EXPANDED, null, PROFILE, timeframe, null);
    }

    public static final void activitySummaryToggleTapped(InterfaceC14515a interfaceC14515a, String timeframe) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(timeframe, "timeframe");
        interfaceC14515a.mo41422d(SELF, ACTIVITY_SUMMARY_TOGGLE, null, PROFILE, timeframe, null);
    }

    public static final void dataHighlightsToggleTapped(InterfaceC14515a interfaceC14515a, String timeframe) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(timeframe, "timeframe");
        interfaceC14515a.mo41422d(SELF, DATA_HIGHLIGHTS_TOGGLE, null, PROFILE, timeframe, null);
    }

    public static final void healthspanTapped(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, VIEW, null, "Healthspan", null, AbstractC25247g0.m73989X(new C23465k("source", PROFILE)));
    }

    public static final void hitBottomOfProfileEvent(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, SCROLLED_TO_BOTTOM, null, PROFILE, null, null);
    }

    public static final void levelsTapped(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, OPEN, null, "Levels", null, AbstractC25247g0.m73989X(new C23465k("source", PROFILE)));
    }

    public static final void otherProfileOpened(InterfaceC14515a interfaceC14515a, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(OTHER_PROFILE, OPEN, null, PROFILE, null, toOtherPropertiesMapOrNull(profileMembershipAnalyticsProperties));
    }

    public static /* synthetic */ void otherProfileOpened$default(InterfaceC14515a interfaceC14515a, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            profileMembershipAnalyticsProperties = null;
        }
        otherProfileOpened(interfaceC14515a, profileMembershipAnalyticsProperties);
    }

    public static final void profileOpened(InterfaceC14515a interfaceC14515a, String source, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        if (!source.equals("unknown") && !source.equals(PROFILE_RESTORED_SOURCE)) {
            interfaceC14515a.mo41428k(SELF, OPEN, null, PROFILE, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("source", source), toOtherPropertiesMap(profileMembershipAnalyticsProperties)));
        } else if (source.equals("unknown")) {
            interfaceC14515a.mo41422d(SELF, OPEN, null, PROFILE, null, toOtherPropertiesMapOrNull(profileMembershipAnalyticsProperties));
        }
    }

    public static /* synthetic */ void profileOpened$default(InterfaceC14515a interfaceC14515a, String str, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "unknown";
        }
        if ((i13 & 2) != 0) {
            profileMembershipAnalyticsProperties = null;
        }
        profileOpened(interfaceC14515a, str, profileMembershipAnalyticsProperties);
    }

    public static final void profileSaveTapped(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, SAVE, null, PROFILE, null, null);
    }

    public static final void streaksTapped(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, OPEN, null, "Streaks", null, AbstractC25247g0.m73989X(new C23465k("source", PROFILE)));
    }

    public static final Map<String, Object> toOtherPropertiesMap(ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
        if (profileMembershipAnalyticsProperties == null) {
            return C25272z.f99163w;
        }
        C26463f c26463f = new C26463f();
        String followingState = profileMembershipAnalyticsProperties.getFollowingState();
        if (followingState != null) {
            c26463f.put("following_state", followingState);
        }
        Boolean communityVisible = profileMembershipAnalyticsProperties.getCommunityVisible();
        if (communityVisible != null) {
            c26463f.put("community_visible", communityVisible);
        }
        Boolean ageVisible = profileMembershipAnalyticsProperties.getAgeVisible();
        if (ageVisible != null) {
            c26463f.put("age_visible", ageVisible);
        }
        Boolean locationVisible = profileMembershipAnalyticsProperties.getLocationVisible();
        if (locationVisible != null) {
            c26463f.put("location_visible", locationVisible);
        }
        return c26463f.m78380b();
    }

    private static final Map<String, Object> toOtherPropertiesMapOrNull(ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
        Map<String, Object> otherPropertiesMap = toOtherPropertiesMap(profileMembershipAnalyticsProperties);
        if (otherPropertiesMap.isEmpty()) {
            return null;
        }
        return otherPropertiesMap;
    }

    public static final void usernameFieldTapped(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, TAP, USERNAME, PROFILE, null, null);
    }

    public static final void usernameSaveAttempted(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        interfaceC14515a.mo41422d(SELF, SAVE, USERNAME, PROFILE, null, null);
    }
}

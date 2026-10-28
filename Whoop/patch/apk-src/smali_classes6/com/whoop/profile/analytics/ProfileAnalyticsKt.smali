.class public final Lcom/whoop/profile/analytics/ProfileAnalyticsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008&\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\'\u0010\r\u001a\u00020\u0008*\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\n\u001a\u0011\u0010\u0010\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\n\u001a\u0011\u0010\u0011\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\n\u001a\u0019\u0010\u0013\u001a\u00020\u0008*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0008*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0008*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0008*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0014\u001a\u0011\u0010\u0018\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\n\u001a\u0011\u0010\u0019\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\n\u001a\u0011\u0010\u001a\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\n\u001a\u001d\u0010\u001b\u001a\u00020\u0008*\u00020\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001e\"\u0014\u0010!\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001e\"\u0014\u0010#\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001e\"\u0014\u0010$\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001e\"\u0014\u0010%\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001e\"\u0014\u0010&\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u001e\"\u0014\u0010\'\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001e\"\u0014\u0010(\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u001e\"\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001e\"\u0014\u0010*\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001e\"\u0014\u0010+\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u001e\"\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u001e\"\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u001e\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
        "",
        "",
        "",
        "toOtherPropertiesMap",
        "(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;",
        "toOtherPropertiesMapOrNull",
        "Lfi0/a;",
        "Ll83/a0;",
        "hitBottomOfProfileEvent",
        "(Lfi0/a;)V",
        "source",
        "membershipAnalytics",
        "profileOpened",
        "(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V",
        "profileSaveTapped",
        "usernameFieldTapped",
        "usernameSaveAttempted",
        "timeframe",
        "dataHighlightsToggleTapped",
        "(Lfi0/a;Ljava/lang/String;)V",
        "activitySummaryToggleTapped",
        "activitySummaryExpanded",
        "activitySummaryCollapsed",
        "healthspanTapped",
        "streaksTapped",
        "levelsTapped",
        "otherProfileOpened",
        "(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V",
        "PROFILE",
        "Ljava/lang/String;",
        "SCROLLED_TO_BOTTOM",
        "SELF",
        "OTHER_PROFILE",
        "OPEN",
        "VIEW",
        "SAVE",
        "DATA_HIGHLIGHTS_TOGGLE",
        "ACTIVITY_SUMMARY_TOGGLE",
        "ACTIVITY_SUMMARY_EXPANDED",
        "ACTIVITY_SUMMARY_COLLAPSED",
        "PROFILE_UNKNOWN_SOURCE",
        "PROFILE_UNKNOWN_ANALYTICS_SOURCE",
        "PROFILE_RESTORED_SOURCE",
        "TAP",
        "USERNAME",
        "profile_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ACTIVITY_SUMMARY_COLLAPSED:Ljava/lang/String; = "activity_summary_collapsed"

.field public static final ACTIVITY_SUMMARY_EXPANDED:Ljava/lang/String; = "activity_summary_expanded"

.field public static final ACTIVITY_SUMMARY_TOGGLE:Ljava/lang/String; = "activity_summary_toggle"

.field public static final DATA_HIGHLIGHTS_TOGGLE:Ljava/lang/String; = "data_highlights_toggle"

.field public static final OPEN:Ljava/lang/String; = "open"

.field public static final OTHER_PROFILE:Ljava/lang/String; = "other_profile"

.field public static final PROFILE:Ljava/lang/String; = "Profile"

.field public static final PROFILE_RESTORED_SOURCE:Ljava/lang/String; = "restored"

.field public static final PROFILE_UNKNOWN_ANALYTICS_SOURCE:Ljava/lang/String; = "unknown"

.field public static final PROFILE_UNKNOWN_SOURCE:Ljava/lang/String; = "unknown_source"

.field public static final SAVE:Ljava/lang/String; = "save"

.field public static final SCROLLED_TO_BOTTOM:Ljava/lang/String; = "scrolled_to_bottom"

.field public static final SELF:Ljava/lang/String; = "self"

.field private static final TAP:Ljava/lang/String; = "tap"

.field private static final USERNAME:Ljava/lang/String; = "username"

.field public static final VIEW:Ljava/lang/String; = "view"


# direct methods
.method public static final activitySummaryCollapsed(Lfi0/a;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeframe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Profile"

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "activity_summary_collapsed"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final activitySummaryExpanded(Lfi0/a;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeframe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Profile"

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "activity_summary_expanded"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final activitySummaryToggleTapped(Lfi0/a;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeframe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Profile"

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "activity_summary_toggle"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final dataHighlightsToggleTapped(Lfi0/a;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeframe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Profile"

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "data_highlights_toggle"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final healthspanTapped(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "source"

    const-string v2, "Profile"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v9

    const-string v4, "self"

    const-string v5, "view"

    const/4 v6, 0x0

    const-string v7, "Healthspan"

    const/4 v8, 0x0

    move-object v3, p0

    invoke-interface/range {v3 .. v9}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final hitBottomOfProfileEvent(Lfi0/a;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "scrolled_to_bottom"

    const/4 v4, 0x0

    const-string v5, "Profile"

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final levelsTapped(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "source"

    const-string v2, "Profile"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v9

    const-string v4, "self"

    const-string v5, "open"

    const/4 v6, 0x0

    const-string v7, "Levels"

    const/4 v8, 0x0

    move-object v3, p0

    invoke-interface/range {v3 .. v9}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final otherProfileOpened(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->toOtherPropertiesMapOrNull(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;

    move-result-object v7

    const-string v2, "other_profile"

    const-string v3, "open"

    const/4 v4, 0x0

    const-string v5, "Profile"

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic otherProfileOpened$default(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->otherProfileOpened(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-void
.end method

.method public static final profileOpened(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "unknown"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "restored"

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->toOtherPropertiesMap(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v5

    const-string v1, "self"

    const-string v2, "open"

    const/4 v3, 0x0

    const-string v4, "Profile"

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    move-object v0, p0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 v11, 0x0

    invoke-static {p2}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->toOtherPropertiesMapOrNull(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;

    move-result-object v12

    const-string v7, "self"

    const-string v8, "open"

    const/4 v9, 0x0

    const-string v10, "Profile"

    move-object v6, v0

    invoke-interface/range {v6 .. v12}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public static synthetic profileOpened$default(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p1, "unknown"

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->profileOpened(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-void
.end method

.method public static final profileSaveTapped(Lfi0/a;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "save"

    const/4 v4, 0x0

    const-string v5, "Profile"

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final streaksTapped(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "source"

    const-string v2, "Profile"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v9

    const-string v4, "self"

    const-string v5, "open"

    const/4 v6, 0x0

    const-string v7, "Streaks"

    const/4 v8, 0x0

    move-object v3, p0

    invoke-interface/range {v3 .. v9}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final toOtherPropertiesMap(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0

    :cond_0
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-virtual {p0}, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;->getFollowingState()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "following_state"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;->getCommunityVisible()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "community_visible"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;->getAgeVisible()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "age_visible"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;->getLocationVisible()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_4

    const-string v1, "location_visible"

    invoke-virtual {v0, v1, p0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p0

    return-object p0
.end method

.method private static final toOtherPropertiesMapOrNull(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->toOtherPropertiesMap(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final usernameFieldTapped(Lfi0/a;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "tap"

    const-string v4, "username"

    const-string v5, "Profile"

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final usernameSaveAttempted(Lfi0/a;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v2, "self"

    const-string v3, "save"

    const-string v4, "username"

    const-string v5, "Profile"

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

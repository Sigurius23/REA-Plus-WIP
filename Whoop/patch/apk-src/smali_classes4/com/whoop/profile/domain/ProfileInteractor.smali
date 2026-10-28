.class public final Lcom/whoop/profile/domain/ProfileInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/profile/domain/ProfileDomainAction;",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DBg\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ)\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010)\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0002\u00a2\u0006\u0004\u0008)\u0010(J\u001d\u0010-\u001a\u00020\u00032\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0*H\u0002\u00a2\u0006\u0004\u0008-\u0010.J#\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001fH\u0016\u00a2\u0006\u0004\u00080\u00101J!\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001f\u00a2\u0006\u0004\u00082\u00101J\u0015\u00105\u001a\u0008\u0012\u0004\u0012\u0002030\u001fH\u0000\u00a2\u0006\u0004\u00084\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00107R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00109R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010>R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010?R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010?R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010B\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileInteractor;",
        "Lod1/g;",
        "Lcom/whoop/profile/domain/ProfileDomainAction;",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lu02/c;",
        "apiClient",
        "Lqw2/c;",
        "actionInteractor",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "analytics",
        "Lji0/f;",
        "bffBottomNavConfigSource",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "Lad3/c;",
        "json",
        "",
        "targetUserId",
        "communityId",
        "<init>",
        "(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "",
        "cardButtonId",
        "Lec3/l;",
        "Lcom/whoop/profile/domain/ProfileInternalDomainAction;",
        "performAction",
        "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "handleInteraction",
        "(Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;",
        "reportProfile",
        "()Lec3/l;",
        "loadProfile",
        "Lpm0/a$c;",
        "Lcom/whoop/profile/domain/models/ProfileResponse;",
        "cacheResult",
        "handleError",
        "(Lpm0/a$c;)Lcom/whoop/profile/domain/ProfileDomainState;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "profileStateFlow",
        "",
        "settingsGearEnabledFlow$profile_release",
        "settingsGearEnabledFlow",
        "Lnm0/e;",
        "Lu02/c;",
        "Lqw2/c;",
        "Lwm0/a;",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "Lji0/f;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "Lad3/c;",
        "Ljava/lang/Integer;",
        "Lec3/p1;",
        "inFlightCardButtonIdHolder",
        "Lec3/p1;",
        "reportedAvatarUrlHolder",
        "InternalResult",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final actionInteractor:Lqw2/c;

.field private final analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

.field private final apiClient:Lu02/c;

.field private final bffBottomNavConfigSource:Lji0/f;

.field private final cachedApiSource:Lnm0/e;

.field private final communityId:Ljava/lang/Integer;

.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final inFlightCardButtonIdHolder:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final json:Lad3/c;

.field private final logger:Ltr2/n;

.field private final reportedAvatarUrlHolder:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final scopeCoordinator:Lwm0/a;

.field private final targetUserId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bffBottomNavConfigSource"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->cachedApiSource:Lnm0/e;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractor;->apiClient:Lu02/c;

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/domain/ProfileInteractor;->actionInteractor:Lqw2/c;

    .line 5
    iput-object p4, p0, Lcom/whoop/profile/domain/ProfileInteractor;->scopeCoordinator:Lwm0/a;

    .line 6
    iput-object p5, p0, Lcom/whoop/profile/domain/ProfileInteractor;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    .line 7
    iput-object p6, p0, Lcom/whoop/profile/domain/ProfileInteractor;->bffBottomNavConfigSource:Lji0/f;

    .line 8
    iput-object p7, p0, Lcom/whoop/profile/domain/ProfileInteractor;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 9
    iput-object p8, p0, Lcom/whoop/profile/domain/ProfileInteractor;->logger:Ltr2/n;

    .line 10
    iput-object p9, p0, Lcom/whoop/profile/domain/ProfileInteractor;->json:Lad3/c;

    .line 11
    iput-object p10, p0, Lcom/whoop/profile/domain/ProfileInteractor;->targetUserId:Ljava/lang/Integer;

    .line 12
    iput-object p11, p0, Lcom/whoop/profile/domain/ProfileInteractor;->communityId:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractor;->inFlightCardButtonIdHolder:Lec3/p1;

    .line 14
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->reportedAvatarUrlHolder:Lec3/p1;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p12, 0x200

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p10, v0

    :cond_0
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_1

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p12, p11

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/profile/domain/ProfileInteractor;-><init>(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic access$getApiClient$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->apiClient:Lu02/c;

    return-object p0
.end method

.method public static final synthetic access$getFeatureFlagChecker$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic access$getInFlightCardButtonIdHolder$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->inFlightCardButtonIdHolder:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getReportedAvatarUrlHolder$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->reportedAvatarUrlHolder:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getScopeCoordinator$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->scopeCoordinator:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic access$getTargetUserId$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->targetUserId:Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic access$handleError(Lcom/whoop/profile/domain/ProfileInteractor;Lpm0/a$c;)Lcom/whoop/profile/domain/ProfileDomainState;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/ProfileInteractor;->handleError(Lpm0/a$c;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleInteraction(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/ProfileInteractor;->handleInteraction(Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadProfile(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/profile/domain/ProfileInteractor;->loadProfile()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performAction(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractor;->performAction(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$reportProfile(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/profile/domain/ProfileInteractor;->reportProfile()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final handleError(Lpm0/a$c;)Lcom/whoop/profile/domain/ProfileDomainState;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/profile/domain/models/ProfileResponse;",
            ">;)",
            "Lcom/whoop/profile/domain/ProfileDomainState;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/whoop/profile/domain/ProfileDomainState;

    sget-object v1, Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;

    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Lcom/whoop/profile/domain/ProfileDomainState;

    sget-object v2, Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final handleInteraction(Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;->INSTANCE:Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->json:Lad3/c;

    invoke-virtual {v0, p1, v1}, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;->resolve(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/profile/domain/ProfileInteractionResolution;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    invoke-direct {v2, v0}, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-virtual {v1, v2}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/whoop/profile/domain/ProfileInteractor;->performAction$default(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;

    new-instance v3, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v3, p1, v2, v1, v2}, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v3}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;-><init>(Lcom/whoop/profile/domain/ProfileNavigationEffect;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_3
    instance-of p1, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$None;

    if-eqz p1, :cond_4

    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final loadProfile()Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/GetProfileRequest;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->targetUserId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/profile/domain/ProfileInteractor;->communityId:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/GetProfileRequest;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "cycle"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor;->cachedApiSource:Lnm0/e;

    new-instance v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$cacheAPI$1;

    invoke-direct {v2, v3, v1}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$cacheAPI$1;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$1;

    invoke-direct {v1, p0, v3}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$1;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$1;

    invoke-direct {v0, v2, p0}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/profile/domain/ProfileInteractor;)V

    new-instance v1, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2;

    invoke-direct {v1, v0}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2;-><init>(Lec3/l;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;

    invoke-direct {v0, p0, v3}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method

.method private final performAction(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->actionInteractor:Lqw2/c;

    new-instance v1, Lqw2/f;

    invoke-direct {v1, p1}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance p1, La6/u;

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/profile/domain/ProfileInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$2;

    invoke-direct {v0, p2, p0, v1}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$2;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    new-instance p1, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;

    invoke-direct {p1, p2, p0, v1}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance p2, Lec3/y;

    invoke-direct {p2, v2, p1}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p2
.end method

.method public static synthetic performAction$default(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractor;->performAction(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final reportProfile()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$interact$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/profile/domain/ProfileInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/profile/domain/ProfileInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lcom/whoop/profile/domain/ProfileDomainState;

    sget-object v3, Lcom/whoop/profile/domain/ProfileDialogType$Loading;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$Loading;

    const/16 v12, 0x1fe

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;

    invoke-direct {v0, p0, v1}, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method

.method public final profileStateFlow(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/profile/domain/ProfileInteractor;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/profile/domain/ProfileInteractor;->settingsGearEnabledFlow$profile_release()Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v0, v1, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object v2
.end method

.method public final settingsGearEnabledFlow$profile_release()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor;->bffBottomNavConfigSource:Lji0/f;

    invoke-interface {v0}, Lji0/f;->d()Lec3/f2;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/domain/ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lcom/whoop/profile/domain/ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/profile/domain/ProfileInteractor;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    return-object v0
.end method

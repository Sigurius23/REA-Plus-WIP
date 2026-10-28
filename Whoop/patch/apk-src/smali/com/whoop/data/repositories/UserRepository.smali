.class public final Lcom/whoop/data/repositories/UserRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/UserRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u0000 <2\u00020\u0001:\u0001<BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u001a\u0010!\u001a\u00020 2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0004\u0008!\u0010\"J!\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001e2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010*\u001a\n )*\u0004\u0018\u00010(0(H\u0082@\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020 H\u0082@\u00a2\u0006\u0004\u0008,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010 H\u0082@\u00a2\u0006\u0004\u0008-\u0010+J\u0010\u0010.\u001a\u00020 H\u0082@\u00a2\u0006\u0004\u0008.\u0010+J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020 H\u0082@\u00a2\u0006\u0004\u00080\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00104R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00106R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010;\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/data/repositories/UserRepository;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroid/content/Context;",
        "context",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "usersPreferenceApi",
        "Lcom/whoop/service/network/ActivityServiceApi;",
        "activityServiceApi",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "prefs",
        "Lod1/u;",
        "userContext",
        "Lbc3/c0;",
        "applicationScope",
        "Lq83/j;",
        "ioContext",
        "Lcom/whoop/service/timezone/a;",
        "timezoneUpdateUploader",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onStart",
        "",
        "forceRefresh",
        "Lcom/whoop/data/repositories/RestingHeartRate;",
        "getRestingHeartRate",
        "(ZLq83/d;)Ljava/lang/Object;",
        "using24HourTime",
        "",
        "timestamp",
        "updateUserTimezonePreferences",
        "(ZLjava/lang/Long;)V",
        "Lorg/joda/time/Instant;",
        "kotlin.jvm.PlatformType",
        "lastRhrFetchTime",
        "(Lq83/d;)Ljava/lang/Object;",
        "fetchAndUpdateRhr",
        "fetchRhr",
        "getCachedRhr",
        "rhr",
        "updateCachedRhr",
        "(Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "Lcom/whoop/service/network/ActivityServiceApi;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Lod1/u;",
        "Lbc3/c0;",
        "Lq83/j;",
        "Lcom/whoop/service/timezone/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "Companion",
        "core_release"
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
.field public static final Companion:Lcom/whoop/data/repositories/UserRepository$Companion;

.field private static final DEFAULT_RHR:F = 55.0f

.field public static final KEY_LAST_FETCH_TIME:Ljava/lang/String; = "last-fetch-time-rhr"

.field public static final KEY_USER_RHR:Ljava/lang/String; = "user-rhr-value-"

.field private static final TIMEOUT:J = 0x9c4L


# instance fields
.field private final activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

.field private final applicationScope:Lbc3/c0;

.field private final context:Landroid/content/Context;

.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final ioContext:Lq83/j;

.field private final logger:Ltr2/n;

.field private final prefs:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final timezoneUpdateUploader:Lcom/whoop/service/timezone/a;

.field private final userContext:Lod1/u;

.field private final usersPreferenceApi:Lcom/whoop/service/network/UsersPreferenceApi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/repositories/UserRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/UserRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/repositories/UserRepository;->Companion:Lcom/whoop/data/repositories/UserRepository$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usersPreferenceApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityServiceApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezoneUpdateUploader"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/repositories/UserRepository;->usersPreferenceApi:Lcom/whoop/service/network/UsersPreferenceApi;

    .line 4
    iput-object p3, p0, Lcom/whoop/data/repositories/UserRepository;->activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

    .line 5
    iput-object p4, p0, Lcom/whoop/data/repositories/UserRepository;->prefs:Lcom/whoop/data/local/prefs/PreferenceHelper;

    .line 6
    iput-object p5, p0, Lcom/whoop/data/repositories/UserRepository;->userContext:Lod1/u;

    .line 7
    iput-object p6, p0, Lcom/whoop/data/repositories/UserRepository;->applicationScope:Lbc3/c0;

    .line 8
    iput-object p7, p0, Lcom/whoop/data/repositories/UserRepository;->ioContext:Lq83/j;

    .line 9
    iput-object p8, p0, Lcom/whoop/data/repositories/UserRepository;->timezoneUpdateUploader:Lcom/whoop/service/timezone/a;

    .line 10
    iput-object p9, p0, Lcom/whoop/data/repositories/UserRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 11
    iput-object p10, p0, Lcom/whoop/data/repositories/UserRepository;->logger:Ltr2/n;

    .line 12
    invoke-virtual {p5}, Lod1/u;->n()Lxg3/g;

    move-result-object p1

    .line 13
    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object p2

    iget-object p2, p2, Lkh3/a;->b:Leh3/e;

    .line 14
    invoke-virtual {p1, p2}, Lxg3/g;->P(Lxg3/k;)Lxg3/g;

    move-result-object p1

    .line 15
    new-instance p2, La6/i;

    const/4 p3, 0x7

    invoke-direct {p2, p0, p3}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance p3, Lcom/whoop/data/onboarding/c;

    const/4 p4, 0x7

    invoke-direct {p3, p2, p4}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p3}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "UserRepository"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v11, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    goto :goto_1

    :cond_0
    move-object/from16 v11, p10

    goto :goto_0

    .line 17
    :goto_1
    invoke-direct/range {v1 .. v11}, Lcom/whoop/data/repositories/UserRepository;-><init>(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/whoop/data/repositories/UserRepository;Lod1/u$a;)Ll83/a0;
    .locals 2

    iget-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/whoop/data/repositories/UserRepository;->updateUserTimezonePreferences$default(Lcom/whoop/data/repositories/UserRepository;ZLjava/lang/Long;ILjava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(La6/i;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->_init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$fetchAndUpdateRhr(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->fetchAndUpdateRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchRhr(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->fetchRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getActivityServiceApi$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/network/ActivityServiceApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

    return-object p0
.end method

.method public static final synthetic access$getCachedRhr(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->getCachedRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFeatureFlagChecker$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/repositories/UserRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getPrefs$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/data/local/prefs/PreferenceHelper;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->prefs:Lcom/whoop/data/local/prefs/PreferenceHelper;

    return-object p0
.end method

.method public static final synthetic access$getTimezoneUpdateUploader$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/timezone/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->timezoneUpdateUploader:Lcom/whoop/service/timezone/a;

    return-object p0
.end method

.method public static final synthetic access$getUsersPreferenceApi$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/network/UsersPreferenceApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserRepository;->usersPreferenceApi:Lcom/whoop/service/network/UsersPreferenceApi;

    return-object p0
.end method

.method public static final synthetic access$lastRhrFetchTime(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->lastRhrFetchTime(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateCachedRhr(Lcom/whoop/data/repositories/UserRepository;Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/UserRepository;->updateCachedRhr(Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/repositories/UserRepository;Lod1/u$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserRepository;->_init_$lambda$0(Lcom/whoop/data/repositories/UserRepository;Lod1/u$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final fetchAndUpdateRhr(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/RestingHeartRate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/RestingHeartRate;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->fetchRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lcom/whoop/data/repositories/RestingHeartRate;

    if-nez p1, :cond_7

    iput v4, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->getCachedRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    return-object p1

    :cond_7
    iput-object p1, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/UserRepository$fetchAndUpdateRhr$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/whoop/data/repositories/UserRepository;->updateCachedRhr(Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    return-object p1
.end method

.method private final fetchRhr(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/RestingHeartRate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v4, p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Lcom/whoop/data/repositories/UserRepository$fetchRhr$2;

    invoke-direct {p1, p0, v3}, Lcom/whoop/data/repositories/UserRepository$fetchRhr$2;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    iput v4, v0, Lcom/whoop/data/repositories/UserRepository$fetchRhr$1;->label:I

    const-wide/16 v4, 0x9c4

    invoke-static {v4, v5, p1, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/data/repositories/RestingHeartRate;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v6, p0, Lcom/whoop/data/repositories/UserRepository;->logger:Ltr2/n;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v5, "Failed to fetch user rhr"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    return-object v3
.end method

.method private final getCachedRhr(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/RestingHeartRate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/UserRepository;->ioContext:Lq83/j;

    new-instance v1, Lcom/whoop/data/repositories/UserRepository$getCachedRhr$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/UserRepository$getCachedRhr$2;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic getRestingHeartRate$default(Lcom/whoop/data/repositories/UserRepository;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/UserRepository;->getRestingHeartRate(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final lastRhrFetchTime(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lorg/joda/time/Instant;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->ioContext:Lq83/j;

    new-instance v2, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$2;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    iput v3, v0, Lcom/whoop/data/repositories/UserRepository$lastRhrFetchTime$1;->label:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/joda/time/Instant;->ofEpochMilli(J)Lorg/joda/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method private final updateCachedRhr(Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/RestingHeartRate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/UserRepository;->ioContext:Lq83/j;

    new-instance v1, Lcom/whoop/data/repositories/UserRepository$updateCachedRhr$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/UserRepository$updateCachedRhr$2;-><init>(Lcom/whoop/data/repositories/UserRepository;Lcom/whoop/data/repositories/RestingHeartRate;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic updateUserTimezonePreferences$default(Lcom/whoop/data/repositories/UserRepository;ZLjava/lang/Long;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/UserRepository;->updateUserTimezonePreferences(ZLjava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final getRestingHeartRate(ZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/RestingHeartRate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    iget-object p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lorg/joda/time/Instant;

    iget-object p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lorg/joda/time/Instant;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-boolean p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->Z$0:Z

    iget-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/Instant;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_7

    iput-boolean p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->Z$0:Z

    iput v6, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->fetchAndUpdateRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    return-object p1

    :cond_7
    invoke-static {}, Lorg/joda/time/Instant;->now()Lorg/joda/time/Instant;

    move-result-object v2

    iput-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$0:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->Z$0:Z

    iput v5, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->lastRhrFetchTime(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    check-cast p2, Lorg/joda/time/Instant;

    invoke-static {p2, v2}, Lorg/joda/time/Hours;->hoursBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Hours;

    move-result-object p2

    const/16 v2, 0x18

    invoke-static {v2}, Lorg/joda/time/Hours;->hours(I)Lorg/joda/time/Hours;

    move-result-object v2

    invoke-virtual {p2, v2}, Lorg/joda/time/Hours;->isGreaterThan(Lorg/joda/time/Hours;)Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_a

    iput-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$1:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->Z$0:Z

    iput v4, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->fetchAndUpdateRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_2

    :cond_9
    return-object p1

    :cond_a
    iput-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->L$1:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->Z$0:Z

    iput v3, v0, Lcom/whoop/data/repositories/UserRepository$getRestingHeartRate$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserRepository;->getCachedRhr(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_2
    return-object v1

    :cond_b
    return-object p1
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->userContext:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/whoop/data/repositories/UserRepository;->updateUserTimezonePreferences$default(Lcom/whoop/data/repositories/UserRepository;ZLjava/lang/Long;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/UserRepository;->applicationScope:Lbc3/c0;

    new-instance v0, Lcom/whoop/data/repositories/UserRepository$onStart$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/UserRepository$onStart$1;-><init>(Lcom/whoop/data/repositories/UserRepository;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final updateUserTimezonePreferences(ZLjava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/UserRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;-><init>(ZLcom/whoop/data/repositories/UserRepository;Ljava/lang/Long;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

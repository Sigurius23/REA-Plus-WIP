.class public final Lsr2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsr2/w;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/LanguageRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->z0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/LanguageRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/DefaultLanguageDecider;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lor2/r1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lor2/r1;

    const-class v3, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    sget-object v0, Lhi0/a;->a:[Ljava/lang/String;

    const-string v2, "ON_FOR_ALL_LANGUAGES"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lcom/whoop/data/repositories/DefaultLanguageDecider;-><init>(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/util/Set;)V

    return-object p1
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lvr2/e;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->f0(Lxf3/c;Luf3/a;)Lvr2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/CachedDataLanguageRefresher;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    new-instance v4, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    const-class v5, Lod1/s;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lod1/s;

    const-class v6, Ltm0/a;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v3, v6, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ltm0/a;

    const-class v7, Lwm0/a;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v3, v7, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwm0/a;

    invoke-virtual {v2}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->activitiesDao()Lha0/a;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->recentActivitiesDao()Lha0/e;

    move-result-object v9

    invoke-static {v0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lbh/a;->a(Landroid/content/Context;)Lbh/e;

    move-result-object v10

    invoke-static {v0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v11

    const-string v2, "get(...)"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/whoop/data/remote/AppConfigurationRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/whoop/data/remote/AppConfigurationRepository;

    const/16 v15, 0x300

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;-><init>(Lod1/s;Ltm0/a;Lwm0/a;Lha0/a;Lha0/e;Lbh/e;Lcom/bumptech/glide/b;Lcom/whoop/data/remote/AppConfigurationRepository;Lq83/j;Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Lp92/f;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->Y(Lxf3/c;Luf3/a;)Lp92/f;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Lxf3/c;Luf3/a;)Lop0/d;
    .locals 9

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lop0/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lrr2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    const-class v3, Lin2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lin2/d;

    const-class v4, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    const-class v5, Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v7, Lvf3/c;

    const-string v8, "mainPrefs"

    invoke-direct {v7, v8}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v8, Lu92/d;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v7}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lu92/d;

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lop0/d;-><init>(Lrr2/c;Lin2/d;Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lu92/d;)V

    return-object v1
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusInteractor;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->b0(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserRepository;
    .locals 14

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/repositories/UserRepository;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object v2

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/UsersPreferenceApi;

    const-class v4, Lcom/whoop/service/network/ActivityServiceApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/service/network/ActivityServiceApi;

    const-class v5, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/local/prefs/PreferenceHelper;

    new-instance v6, Lvf3/c;

    const-string v7, "userContext"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lod1/u;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/u;

    const-class v7, Lbc3/c0;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbc3/c0;

    sget-object v8, Lbc3/q0;->a:Lkc3/e;

    sget-object v8, Lkc3/d;->w:Lkc3/d;

    const-class v9, Lcom/whoop/service/timezone/a;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v3, v9, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/service/timezone/a;

    const-class v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v3, v0

    invoke-direct/range {v1 .. v13}, Lcom/whoop/data/repositories/UserRepository;-><init>(Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/service/network/ActivityServiceApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Lbc3/c0;Lq83/j;Lcom/whoop/service/timezone/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/OnboardingRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->m0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/OnboardingRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lxf3/c;Luf3/a;)Lia0/a;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lia0/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v2}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->activitiesDao()Lha0/a;

    move-result-object v2

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v0}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->recentActivitiesDao()Lha0/e;

    move-result-object v0

    const-class v4, Lcom/whoop/service/network/ActivitiesApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/service/network/ActivitiesApi;

    sget-object v5, Ltr2/n;->a:Ltr2/n$a;

    const-string v6, "ActivitiesRepository"

    invoke-virtual {v5, v6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v6, Lod1/a0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v3, v6, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/a0;

    const-class v7, Lbc3/c0;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lbc3/c0;

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, Lia0/a;-><init>(Lha0/a;Lha0/e;Lcom/whoop/service/network/ActivitiesApi;Ltr2/n;Lod1/a0;Lbc3/c0;)V

    return-object v1
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Ljs0/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->x0(Lxf3/c;Luf3/a;)Ljs0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lxf3/c;Luf3/a;)Lse2/d;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "TurnoffAlarmWarningInteractor"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v0}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->smartAlarmUserInfoDao()Lrf2/a;

    move-result-object v4

    const-class v0, Lwm0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lwm0/a;

    const-class v0, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    const-class v0, Lzr2/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lzr2/a;

    const-class v0, Lmi1/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lmi1/e;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v0, Liy1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Liy1/c;

    const-class v0, Lci2/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v12, p0

    check-cast v12, Lci2/b;

    new-instance v2, Lse2/d;

    invoke-direct/range {v2 .. v12}, Lse2/d;-><init>(Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lrf2/a;Ltr2/n;Lwm0/a;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lzr2/a;Lmi1/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Lci2/b;)V

    return-object v2
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Z
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->I0(Lxf3/c;Luf3/a;)Z

    move-result p0

    return p0
.end method

.method private static final G0(Lxf3/c;Luf3/a;)Leq1/a;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lod1/a0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lod1/a0;

    const-class v0, Lbc3/c0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "HrZonesRepository"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v0}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->hrZonesDao()Ldq1/b;

    move-result-object v7

    const-class v0, Lcom/whoop/hrZones/network/HrZonesApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/whoop/hrZones/network/HrZonesApi;

    new-instance v2, Leq1/a;

    invoke-direct/range {v2 .. v7}, Leq1/a;-><init>(Lod1/a0;Lbc3/c0;Ltr2/n;Lcom/whoop/hrZones/network/HrZonesApi;Ldq1/b;)V

    return-object v2
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/AchievementsRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->W(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/AchievementsRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final H0(Lxf3/c;Luf3/a;)Z
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lop0/d;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->C0(Lxf3/c;Luf3/a;)Lop0/d;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Lxf3/c;Luf3/a;)Z
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lod1/f;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->X(Lxf3/c;Luf3/a;)Lod1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lin2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lin2/d;

    const-class v5, Lin2/h;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lin2/h;

    const-class v6, Lcom/whoop/service/network/FeatureFlagsApi;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/service/network/FeatureFlagsApi;

    new-instance v7, Lvf3/c;

    const-string v8, "featureFlagFetchEnabled"

    invoke-direct {v7, v8}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v8, Ljava/lang/Boolean;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v7}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    new-instance v8, Ls52/d;

    const/16 v9, 0xf

    invoke-direct {v8, v9}, Ls52/d;-><init>(I)V

    const-class v9, Lu92/f;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v8, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu92/d;

    const-class v9, Lrr2/c;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lrr2/c;

    const-class v9, Lbc3/c0;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lbc3/c0;

    new-instance v9, Lvf3/c;

    const-string v12, "userContext"

    invoke-direct {v9, v12}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v12, Lod1/u;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lod1/u;

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v9, Lsr2/w$b;

    invoke-direct {v9, v0, v4, v4}, Lsr2/w$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    const/16 v14, 0x20

    const/4 v15, 0x0

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move-object v7, v8

    const-wide/16 v8, 0x0

    invoke-direct/range {v2 .. v15}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;-><init>(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lod1/s;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->n0(Lxf3/c;Luf3/a;)Lod1/s;

    move-result-object p0

    return-object p0
.end method

.method private static final K0()Luf3/a;
    .locals 1

    const-string v0, "FeaturePrefs"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lia0/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->E0(Lxf3/c;Luf3/a;)Lia0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lxf3/c;Luf3/a;)Lga0/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lga0/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/service/network/ActivitiesApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/ActivitiesApi;

    const-class v3, Lbc3/c0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/c0;

    const-class v4, Lin2/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lin2/d;

    invoke-direct {p1, v1, v3, p0}, Lga0/c;-><init>(Lcom/whoop/service/network/ActivitiesApi;Lbc3/c0;Lin2/d;)V

    return-object p1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lse2/d;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->F0(Lxf3/c;Luf3/a;)Lse2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lxf3/c;Luf3/a;)Li92/a;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li92/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/service/network/ActivitiesApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/ActivitiesApi;

    const-class v3, Lcom/whoop/service/network/GpsServiceApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/service/network/GpsServiceApi;

    sget-object v4, Ltr2/n;->a:Ltr2/n$a;

    const-string v5, "CycleWs"

    invoke-virtual {v4, v5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const-class v5, Lga0/c;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lga0/c;

    invoke-direct {p1, v1, v3, v4, p0}, Li92/a;-><init>(Lcom/whoop/service/network/ActivitiesApi;Lcom/whoop/service/network/GpsServiceApi;Ltr2/n;Lga0/c;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lor2/r1;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->y0(Lxf3/c;Luf3/a;)Lor2/r1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->D0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserRepository;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->i0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SettingsLandingRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->c0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SettingsLandingRepository;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lxf3/c;Luf3/a;)Lcom/whoop/realtime/presentation/m;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->s0(Lxf3/c;Luf3/a;)Lcom/whoop/realtime/presentation/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->u0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final T(Ltf3/a;)Ll83/a0;
    .locals 15

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltf3/a;->a:Ljava/util/HashSet;

    new-instance v5, Lsr2/r;

    const/4 v1, 0x3

    invoke-direct {v5, v1}, Lsr2/r;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/service/network/JournalApi;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v9, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v13, 0x2

    move-object v2, v9

    move v6, v13

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/4 v2, 0x5

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/AchievementsRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0x11

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/coaching/sleepcoach/wizard/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x1d

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/realtime/presentation/m;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v3, 0x3

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/UserRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "featureFlagFetchEnabled"

    invoke-static {v8, p0, v2, v1, v3}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lsr2/u;

    const/4 v2, 0x4

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Ljava/lang/Boolean;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "configurationValuesFetchEnabled"

    invoke-static {v8, p0, v3, v1, v4}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lsr2/u;

    const/4 v3, 0x5

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v2, 0x7

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-string v5, "clazz"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v10, v8, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    invoke-static {v3, v10}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    iput-object v10, v8, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v10, v8, Lqf3/b;->c:Lvf3/a;

    iget-object v8, v8, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const/4 v14, 0x1

    invoke-virtual {p0, v3, v4, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v3, 0x8

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lga0/c;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v3, 0x9

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Li92/a;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0xe

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lod1/f;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x19

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lp92/f;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v3, 0x6

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/service/store/SessionStore;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v2, 0xa

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lod1/p;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Lsr2/u;

    const/16 v2, 0xb

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, p0, v2, v1}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v2

    const-class v3, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v3, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v8, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v8, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v2, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v2, 0xc

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/SettingsLandingRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v3, 0xd

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lod1/c;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v3, 0xe

    invoke-direct {v12, v3}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/JournalRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/16 v2, 0xf

    invoke-direct {v12, v2}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvr2/e;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Lsr2/r;

    const/4 v3, 0x4

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lu92/f;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "incorrectStringsRepo"

    invoke-static {v8, p0, v3, v1, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lsr2/r;

    const/4 v3, 0x6

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/StringsRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v4, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v4, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const-string v10, "stringRepo"

    invoke-static {v8, p0, v4, v1, v10}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lsr2/r;

    const/4 v4, 0x7

    invoke-direct {v12, v4}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x8

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lp92/c;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0x9

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/StartActivityRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0xa

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/OnboardingRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0xb

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lod1/s;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0xc

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lrv1/a;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Lsr2/r;

    const/16 v3, 0xd

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lkp0/e;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0xf

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v2, Lca2/k;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v2, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v8, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v8, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v3, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0x10

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lqf2/f;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0x12

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/UserStrapsRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Lsr2/r;

    const/16 v2, 0x13

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/data/repositories/NotificationRepository;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x14

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lor2/u0;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x15

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/SportsRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v2, 0x16

    invoke-direct {v12, v2}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Ljs0/c;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Lsr2/r;

    const/16 v3, 0x17

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lor2/r1;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v3, 0x18

    invoke-direct {v12, v3}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v3, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v0, Lcom/whoop/data/repositories/LanguageChecker;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v0, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v5, v3, Lqf3/b;->c:Lvf3/a;

    iget-object v3, v3, Lqf3/b;->a:Lvf3/a;

    invoke-static {v0, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v4, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v0, 0x1a

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v0, 0x1b

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/r;

    const/16 v0, 0x1c

    invoke-direct {v12, v0}, Lsr2/r;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lop0/d;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v0, 0x0

    invoke-direct {v12, v0}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lia0/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v13

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lse2/d;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lsr2/u;

    const/4 v0, 0x2

    invoke-direct {v12, v0}, Lsr2/u;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Leq1/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p0, v0, v1}, Ldc/b;->C(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/JournalApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lsr2/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsr2/v;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/JournalApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/JournalApi;

    return-object p0
.end method

.method private static final V()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-journal-repository"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final W(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/AchievementsRepository;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/AchievementsRepository;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ltr2/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltr2/n;

    const-class v3, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-direct {p1, v1, p0}, Lcom/whoop/data/repositories/AchievementsRepository;-><init>(Ltr2/n;Lcom/whoop/data/remote/RemoteDataSource;)V

    return-object p1
.end method

.method private static final X(Lxf3/c;Luf3/a;)Lod1/f;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lod1/f;

    const-class v0, Li92/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li92/a;

    invoke-direct {p1, p0}, Lod1/f;-><init>(Li92/a;)V

    return-object p1
.end method

.method private static final Y(Lxf3/c;Luf3/a;)Lp92/f;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lp92/f;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lp92/f;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static final Z(Lxf3/c;Luf3/a;)Lcom/whoop/service/store/SessionStore;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/service/store/SessionStore;

    new-instance v0, Lu92/d;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    const-string v1, "sessions"

    invoke-direct {v0, p0, v1}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0, p0, v1}, Lcom/whoop/service/store/SessionStore;-><init>(Lcom/google/gson/Gson;Lu92/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic a()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/w;->K0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final a0(Lxf3/c;Luf3/a;)Lod1/p;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lod1/p;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/store/SessionStore;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/store/SessionStore;

    new-instance v3, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/u;

    new-instance v4, Lvf3/c;

    const-string v5, "mainPrefs"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lu92/d;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu92/d;

    const-class v5, Ln92/e;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln92/e;

    const-class v6, Lod1/j;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/j;

    const-class v7, Ly92/b;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ly92/b;

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lod1/p;-><init>(Lcom/whoop/service/store/SessionStore;Lod1/u;Lu92/d;Ln92/e;Lod1/j;Ly92/b;)V

    return-object v1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lkp0/e;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->p0(Lxf3/c;Luf3/a;)Lkp0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusInteractor;
    .locals 13

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lin2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lin2/d;

    const-class v3, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v3}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->onboardingStatusDao()Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object v3

    const-class v4, Lbc3/c0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbc3/c0;

    new-instance v5, Lvf3/c;

    const-string v6, "userContext"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lod1/u;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lod1/u;

    const-class v6, Lcom/whoop/data/onboarding/OnboardingStatusApi;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/onboarding/OnboardingStatusApi;

    const-class v7, Ljs0/c;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljs0/c;

    const-class v8, Lod1/a0;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lod1/a0;

    const-class v9, Lin2/h;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v2, v9, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lin2/h;

    const-class v10, Lom0/c;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {p0, v2, v10, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lom0/c;

    const-class v11, Ly92/a;

    invoke-virtual {p1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {p0, v2, v11, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly92/a;

    const-class v12, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v12, p0

    check-cast v12, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;-><init>(Lin2/d;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lbc3/c0;Lod1/u;Lcom/whoop/data/onboarding/OnboardingStatusApi;Ljs0/c;Lod1/a0;Lin2/h;Lom0/c;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object v1
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Z
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->H0(Lxf3/c;Luf3/a;)Z

    move-result p0

    return p0
.end method

.method private static final c0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SettingsLandingRepository;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/SettingsLandingRepository;

    const-class v0, Lcom/whoop/service/network/MembershipV2Api;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/MembershipV2Api;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "SettingsLandingRepository"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/whoop/data/repositories/SettingsLandingRepository;-><init>(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/CachedDataLanguageRefresher;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->B0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lxf3/c;Luf3/a;)Lod1/c;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lod1/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/CycleMetadataApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/CycleMetadataApi;

    const-class v3, Lin2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lin2/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lod1/c;-><init>(Lcom/whoop/service/network/CycleMetadataApi;Lin2/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserStrapsRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->t0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserStrapsRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/JournalRepository;
    .locals 11

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lin2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lin2/d;

    const-class v0, Lcom/whoop/data/local/room/WhoopDatabase;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/WhoopDatabase;

    invoke-virtual {v0}, Lcom/whoop/data/local/room/WhoopDatabase;->journalDao()Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    move-result-object v4

    new-instance v0, Lvf3/c;

    const-string v2, "mainPrefs"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lu92/d;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lu92/d;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v0, Lbc3/c0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lbc3/c0;

    const-class v0, Lrr2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lrr2/c;

    const-class v0, Lcom/whoop/service/network/JournalApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/whoop/service/network/JournalApi;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v2, Lcom/whoop/data/repositories/JournalRepository;

    invoke-direct/range {v2 .. v10}, Lcom/whoop/data/repositories/JournalRepository;-><init>(Lin2/d;Lcom/whoop/data/local/room/dao/wipeable/JournalDao;Lu92/d;Lcom/whoop/service/network/JournalApi;Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object v2
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lrv1/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->o0(Lxf3/c;Luf3/a;)Lrv1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lxf3/c;Luf3/a;)Lvr2/e;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvr2/e;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-direct {p1, p0}, Lvr2/e;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lod1/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->d0(Lxf3/c;Luf3/a;)Lod1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lxf3/c;Luf3/a;)Lu92/f;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu92/f;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/String;

    new-instance v3, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod1/u;

    invoke-direct {v0, v1, p1, p0}, Lu92/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lod1/u;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v2, v3, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lga0/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->L0(Lxf3/c;Luf3/a;)Lga0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final h0(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/wizard/b;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/whoop/coaching/sleepcoach/wizard/b;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/DefaultLanguageDecider;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->A0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/DefaultLanguageDecider;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/StringsRepositoryImpl;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/whoop/data/repositories/StringsRepositoryImpl;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lu92/f;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->g0(Lxf3/c;Luf3/a;)Lu92/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "<destruct>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p0, Landroid/content/Context;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance p1, Lcom/whoop/data/repositories/StringsRepositoryImpl;

    invoke-direct {p1, p0}, Lcom/whoop/data/repositories/StringsRepositoryImpl;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lod1/p;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->a0(Lxf3/c;Luf3/a;)Lod1/p;

    move-result-object p0

    return-object p0
.end method

.method private static final k0(Lxf3/c;Luf3/a;)Lp92/c;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lp92/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/local/room/WhoopDatabase;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/local/room/WhoopDatabase;

    invoke-virtual {v1}, Lcom/whoop/data/local/room/WhoopDatabase;->gpsDao()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    move-result-object v1

    const-class v3, Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-direct {p1, v1, p0}, Lp92/c;-><init>(Lcom/whoop/data/local/room/dao/wipeable/GpsDao;Lcom/whoop/data/remote/commons/AppExecutors;)V

    return-object p1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->J0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StartActivityRepository;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/StartActivityRepository;

    new-instance v0, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lu92/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu92/d;

    invoke-direct {p1, p0}, Lcom/whoop/data/repositories/StartActivityRepository;-><init>(Lu92/d;)V

    return-object p1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lcom/whoop/service/store/SessionStore;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->Z(Lxf3/c;Luf3/a;)Lcom/whoop/service/store/SessionStore;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/OnboardingRepository;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/OnboardingRepository;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "OnboardingRepository"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lrr2/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrr2/c;

    const-class v4, Ltd1/b;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltd1/b;

    const-class v5, Lcom/whoop/service/network/MembershipV0Api;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/MembershipV0Api;

    invoke-direct {p1, v0, v2, v4, p0}, Lcom/whoop/data/repositories/OnboardingRepository;-><init>(Ltr2/n;Lrr2/c;Ltd1/b;Lcom/whoop/service/network/MembershipV0Api;)V

    return-object p1
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SportsRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->w0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SportsRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lxf3/c;Luf3/a;)Lod1/s;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lod1/s;

    new-instance v0, Lu92/e;

    new-instance v1, Lu92/g;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object v2

    const-string v3, "sports.db"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lu92/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Lu92/e;-><init>(Lu92/g;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/SportsRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/SportsRepository;

    const-class v4, Lod1/a0;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod1/a0;

    invoke-direct {p1, v0, v2, p0}, Lod1/s;-><init>(Lu92/e;Lcom/whoop/data/repositories/SportsRepository;Lod1/a0;)V

    return-object p1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Leq1/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->G0(Lxf3/c;Luf3/a;)Leq1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lxf3/c;Luf3/a;)Lrv1/a;
    .locals 13

    const-string v0, "it"

    const-string v1, "userContext"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lod1/u;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lod1/u;

    const-class p1, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/whoop/data/remote/RemoteDataSource;

    const-class p1, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class p1, Lcom/whoop/service/network/MembershipV2Api;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/whoop/service/network/MembershipV2Api;

    const-class p1, Lcom/whoop/service/network/RmaServiceApi;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/whoop/service/network/RmaServiceApi;

    const-class p1, Lcom/whoop/payments/domain/PaymentsApi;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lcom/whoop/payments/domain/PaymentsApi;

    const-class p1, Lbc3/c0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Lbc3/c0;

    const-class p1, Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v12, p0

    check-cast v12, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v3, Lrv1/a;

    invoke-direct/range {v3 .. v12}, Lrv1/a;-><init>(Lod1/u;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lcom/whoop/service/network/RmaServiceApi;Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;Lcom/whoop/payments/domain/PaymentsApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object v3
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->j0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Lxf3/c;Luf3/a;)Lkp0/e;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkp0/e;->d:Lkp0/e$a;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lin2/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lin2/d;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "HighFrequencySyncModeStateHolder"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-virtual {p1, v0, p0, v1}, Lkp0/e$a;->a(Landroid/content/Context;Lin2/d;Ltr2/n;)Lkp0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/JournalRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->e0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v5, Lg82/a;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg82/a;

    sget-object v6, Ltr2/n;->a:Ltr2/n$a;

    const-string v7, "SmartAlarmTriggerRepository"

    invoke-virtual {v6, v7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    const-class v7, Lrr2/c;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrr2/c;

    const-class v8, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-object v9, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    sget-object v8, Lin2/b;->a:Lin2/b;

    move-object v10, v9

    sget-object v9, Lin2/f;->a:Lin2/f;

    const-class v11, Lbc3/c0;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lbc3/c0;

    const-class v12, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v12}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->smartAlarmUserInfoDao()Lrf2/a;

    move-result-object v12

    const-class v13, Lqf2/c;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lqf2/c;

    const-class v14, Lod1/a0;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v0, v4, v14, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lod1/a0;

    const-class v15, Ltd1/b;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v0, v4, v15, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ltd1/b;

    move-object/from16 p1, v2

    const-class v2, Lkp0/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkp0/e;

    new-instance v4, Lvf3/c;

    move-object/from16 v17, v2

    const-string v2, "workManagerInstance"

    invoke-direct {v4, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lic/p0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v18, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lic/p0;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lin2/d;

    const-class v4, Lzr2/a;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzr2/a;

    move-object/from16 v19, v2

    const-class v2, Liy1/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liy1/c;

    move-object/from16 v20, v2

    const-class v2, Lwm0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwm0/a;

    move-object/from16 v21, v2

    const-class v2, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    move-object/from16 v22, v2

    const-class v2, Lmi1/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmi1/e;

    move-object/from16 v2, p1

    move-object/from16 v3, v18

    move-object/from16 v18, v4

    move-object v4, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v0

    invoke-direct/range {v2 .. v22}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lg82/a;Ltr2/n;Lrr2/c;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lin2/h;Lin2/g;Lbc3/c0;Lrf2/a;Lqf2/c;Lod1/a0;Ltd1/b;Lkp0/e;Lic/p0;Lin2/d;Lzr2/a;Liy1/c;Lwm0/a;Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lmi1/e;)V

    invoke-virtual {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start()V

    return-object v2
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lor2/u0;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->v0(Lxf3/c;Luf3/a;)Lor2/u0;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lxf3/c;Luf3/a;)Lqf2/f;
    .locals 12

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lqf2/f;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lrr2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    const-class v3, Lin2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lin2/d;

    const-class v4, Ltd1/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltd1/b;

    const-class v5, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v5}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->smartAlarmUserInfoDao()Lrf2/a;

    move-result-object v5

    const-class v6, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    const-class v7, Lqf2/c;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqf2/c;

    const-class v8, Liy1/c;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Liy1/c;

    const-class v9, Lmi1/e;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v2, v9, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lmi1/e;

    const-class v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {p0, v2, v10, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v11, Lci2/b;

    invoke-virtual {p1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v11, p0

    check-cast v11, Lci2/b;

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Lqf2/f;-><init>(Lrr2/c;Lin2/d;Ltd1/b;Lrf2/a;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lqf2/c;Liy1/c;Lmi1/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lci2/b;)V

    return-object v1
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Li92/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->M0(Lxf3/c;Luf3/a;)Li92/a;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lxf3/c;Luf3/a;)Lcom/whoop/realtime/presentation/m;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/realtime/presentation/m;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/whoop/realtime/presentation/m;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lp92/c;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->k0(Lxf3/c;Luf3/a;)Lp92/c;

    move-result-object p0

    return-object p0
.end method

.method private static final t0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserStrapsRepository;
    .locals 9

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/repositories/UserStrapsRepository;

    new-instance p1, Lvf3/c;

    const-string v0, "userContext"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/u;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lod1/u;

    const-class p1, Ltd1/b;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltd1/b;

    const-class v4, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/remote/RemoteDataSource;

    const-class v5, Lcom/whoop/service/network/MembershipV2Api;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/service/network/MembershipV2Api;

    const-class v6, Lbc3/c0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v3, v6, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbc3/c0;

    const-class v7, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v3, v7, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v8, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v0, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/data/repositories/UserStrapsRepository;-><init>(Lod1/u;Ltd1/b;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lbc3/c0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/FeatureFlagRepository;)V

    return-object v1
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/wizard/b;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->h0(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object p0

    return-object p0
.end method

.method private static final u0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/repositories/NotificationRepository;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/NotificationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/NotificationApi;

    sget-object v3, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "NotificationFactory"

    invoke-virtual {v3, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class v4, Lrr2/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrr2/c;

    const-class v5, Lin2/d;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lin2/d;

    new-instance v6, Lvf3/c;

    const-string v7, "userContext"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lod1/u;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lod1/u;

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/repositories/NotificationRepository;-><init>(Lcom/whoop/service/network/NotificationApi;Ltr2/n;Lrr2/c;Lin2/d;Lod1/u;)V

    return-object v1
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->q0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(Lxf3/c;Luf3/a;)Lor2/u0;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Ls4/c;->getContextForLanguage(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    const-string v1, "getContextForLanguage(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lor2/u0;

    const-class v2, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-direct {v1, p1, p0}, Lor2/u0;-><init>(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageRepository;)V

    return-object v1
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/JournalApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->U(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/JournalApi;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SportsRepository;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/SportsRepository;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/service/network/ActivityServiceApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/ActivityServiceApi;

    sget-object v3, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "SportsRepository"

    invoke-virtual {v3, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lvf3/c;

    const-string v5, "userContext"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lod1/u;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/u;

    const-class v5, Lbc3/c0;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, v4, p0}, Lcom/whoop/data/repositories/SportsRepository;-><init>(Lcom/whoop/service/network/ActivityServiceApi;Ltr2/n;Lod1/u;Lbc3/c0;)V

    return-object p1
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StartActivityRepository;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->l0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/StartActivityRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final x0(Lxf3/c;Luf3/a;)Ljs0/c;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/ConfigurationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/ConfigurationApi;

    const-class v3, Lbc3/c0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/c0;

    const-class v4, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    invoke-virtual {v4}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;->configurationsDao()Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    move-result-object v4

    new-instance v5, Lvf3/c;

    const-string v6, "configurationValuesFetchEnabled"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Ljava/lang/Boolean;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "ConfigurationRepository"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v7

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;-><init>(Lcom/whoop/service/network/ConfigurationApi;Lbc3/c0;Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;ZZLtr2/n;)V

    return-object v1
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lqf2/f;
    .locals 0

    invoke-static {p0, p1}, Lsr2/w;->r0(Lxf3/c;Luf3/a;)Lqf2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lxf3/c;Luf3/a;)Lor2/r1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lor2/s1;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lor2/s1;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic z()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/w;->V()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final z0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/LanguageRepository;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/data/repositories/LanguageRepository;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/service/network/LanguageApi;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/service/network/LanguageApi;

    const-class v5, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/local/prefs/PreferenceHelper;

    new-instance v6, Lvf3/c;

    const-string v7, "userContext"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lod1/u;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/u;

    sget-object v7, Lhi0/a;->b:[Ljava/lang/String;

    const-string v8, "TRANSLATION_ARRAY"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    sget-object v8, Lhi0/a;->a:[Ljava/lang/String;

    const-string v9, "ON_FOR_ALL_LANGUAGES"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const-class v9, Lor2/r1;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lor2/r1;

    const-class v10, Lor2/g;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lor2/g;

    new-instance v11, Lvf3/c;

    const-string v12, "appLifecycleOwnerr"

    invoke-direct {v11, v12}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v12, Landroidx/lifecycle/g0;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v11}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/lifecycle/g0;

    const-class v12, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    sget-object v13, Ll83/i;->w:Ll83/i;

    new-instance v14, Lsr2/w$a;

    invoke-direct {v14, v0, v4, v4}, Lsr2/w$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v13, v14}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    const-class v14, La6/g;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, La6/g;

    const/16 v16, 0x1080

    const/16 v17, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v2 .. v17}, Lcom/whoop/data/repositories/LanguageRepository;-><init>(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsr2/w;->T(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public bridge getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lnd1/j;->getDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

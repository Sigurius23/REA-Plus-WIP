.class public final Lcom/whoop/data/onboarding/OnboardingStatusInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/onboarding/OnboardingStatusChecker;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\u0010\u0013\u001a\u000c\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008(\u0010\'J/\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0)H\u0007\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008.\u0010#J\u000f\u0010/\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008/\u0010#J\u000f\u00100\u001a\u00020!H\u0002\u00a2\u0006\u0004\u00080\u0010#J\u0010\u00101\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020!H\u0082@\u00a2\u0006\u0004\u00083\u00102J\u000f\u00104\u001a\u00020!H\u0002\u00a2\u0006\u0004\u00084\u0010#J\u000f\u00105\u001a\u00020!H\u0002\u00a2\u0006\u0004\u00085\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00108R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010:R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010<R\u001e\u0010\u0013\u001a\u000c\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010@R\u0017\u0010B\u001a\u00020A8\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "Lin2/d;",
        "dispatcherFactory",
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "onboardingStatusDao",
        "Lbc3/c0;",
        "applicationCoroutineScope",
        "Lod1/u;",
        "userContext",
        "Lcom/whoop/data/onboarding/OnboardingStatusApi;",
        "api",
        "Ljs0/c;",
        "configurationRepository",
        "Lod1/a0;",
        "userSessionManager",
        "Lin2/h;",
        "Lxg3/k;",
        "Lcom/whoop/ui/util/SchedulerFactory;",
        "schedulerFactory",
        "Lom0/c;",
        "prefetcher",
        "Ly92/a;",
        "authManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lin2/d;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lbc3/c0;Lod1/u;Lcom/whoop/data/onboarding/OnboardingStatusApi;Ljs0/c;Lod1/a0;Lin2/h;Lom0/c;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "type",
        "",
        "shouldGoToFeatureEducation",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;)Z",
        "Ll83/a0;",
        "retriggerOnboardingFetch",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onStart",
        "",
        "",
        "mapToTrim",
        "filterOnboardingStatusMap",
        "(Ljava/util/Map;)Ljava/util/Map;",
        "cancelOnboardingStatusPeriodicFetch",
        "observeUserLoginEvents",
        "loadOnboardingStatusFromTable",
        "fetchOnboardingStatus",
        "(Lq83/d;)Ljava/lang/Object;",
        "storeEntriesInLocalDatabase",
        "startOnboardingStatusPeriodicFetch",
        "prefetchOverlays",
        "Lin2/d;",
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "Lbc3/c0;",
        "Lod1/u;",
        "Lcom/whoop/data/onboarding/OnboardingStatusApi;",
        "Ljs0/c;",
        "Lod1/a0;",
        "Lin2/h;",
        "Lom0/c;",
        "Ly92/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "",
        "onboardingStatus",
        "Ljava/util/Map;",
        "Lbc3/k1;",
        "fetchJob",
        "Lbc3/k1;",
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


# instance fields
.field private final api:Lcom/whoop/data/onboarding/OnboardingStatusApi;

.field private final applicationCoroutineScope:Lbc3/c0;

.field private final authManager:Ly92/a;

.field private final configurationRepository:Ljs0/c;

.field private final dispatcherFactory:Lin2/d;

.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private fetchJob:Lbc3/k1;

.field private final logger:Ltr2/n;

.field private final onboardingStatus:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

.field private final prefetcher:Lom0/c;

.field private final schedulerFactory:Lin2/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lin2/h<",
            "Lxg3/k;",
            ">;"
        }
    .end annotation
.end field

.field private final userContext:Lod1/u;

.field private final userSessionManager:Lod1/a0;


# direct methods
.method public constructor <init>(Lin2/d;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lbc3/c0;Lod1/u;Lcom/whoop/data/onboarding/OnboardingStatusApi;Ljs0/c;Lod1/a0;Lin2/h;Lom0/c;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin2/d;",
            "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
            "Lbc3/c0;",
            "Lod1/u;",
            "Lcom/whoop/data/onboarding/OnboardingStatusApi;",
            "Ljs0/c;",
            "Lod1/a0;",
            "Lin2/h<",
            "+",
            "Lxg3/k;",
            ">;",
            "Lom0/c;",
            "Ly92/a;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            ")V"
        }
    .end annotation

    const-string v0, "dispatcherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingStatusDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationCoroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulerFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefetcher"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->dispatcherFactory:Lin2/d;

    iput-object p2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    iput-object p3, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->applicationCoroutineScope:Lbc3/c0;

    iput-object p4, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->userContext:Lod1/u;

    iput-object p5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->api:Lcom/whoop/data/onboarding/OnboardingStatusApi;

    iput-object p6, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->configurationRepository:Ljs0/c;

    iput-object p7, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->userSessionManager:Lod1/a0;

    iput-object p8, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->schedulerFactory:Lin2/h;

    iput-object p9, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->prefetcher:Lom0/c;

    iput-object p10, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->authManager:Ly92/a;

    iput-object p11, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "OnboardingStatusInteractor"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$5(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$fetchOnboardingStatus(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->fetchOnboardingStatus(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getApi$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/onboarding/OnboardingStatusApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->api:Lcom/whoop/data/onboarding/OnboardingStatusApi;

    return-object p0
.end method

.method public static final synthetic access$getAuthManager$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Ly92/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->authManager:Ly92/a;

    return-object p0
.end method

.method public static final synthetic access$getDispatcherFactory$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lin2/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->dispatcherFactory:Lin2/d;

    return-object p0
.end method

.method public static final synthetic access$getFeatureFlagChecker$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic access$getOnboardingStatus$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getOnboardingStatusDao$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    return-object p0
.end method

.method public static final synthetic access$getPrefetcher$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lom0/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->prefetcher:Lom0/c;

    return-object p0
.end method

.method public static final synthetic access$getUserContext$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lod1/u;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->userContext:Lod1/u;

    return-object p0
.end method

.method public static final synthetic access$storeEntriesInLocalDatabase(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->storeEntriesInLocalDatabase(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$2(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Login;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$3(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Login;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/onboarding/b;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Logout;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$0(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Logout;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/data/onboarding/b;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final fetchOnboardingStatus(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;

    iget v1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v0, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->dispatcherFactory:Lin2/d;

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;

    invoke-direct {v2, p0, v6}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    iput v5, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->label:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/util/Map;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->filterOnboardingStatusMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    monitor-enter v2

    :try_start_2
    iget-object v5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->clear()V

    iget-object v5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    invoke-interface {v5, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    iget-object v5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v5, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    iput-object v6, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->storeEntriesInLocalDatabase(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :goto_4
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    const-string v1, "Failed to fetch onboarding status from API"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final loadOnboardingStatusFromTable()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->applicationCoroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final observeUserLoginEvents()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->userSessionManager:Lod1/a0;

    invoke-interface {v0}, Lod1/a0;->j()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->schedulerFactory:Lin2/h;

    invoke-interface {v1}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxg3/k;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/onboarding/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/b;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lcom/whoop/data/onboarding/d;

    invoke-direct {v1, p0, v3}, Lcom/whoop/data/onboarding/d;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V

    invoke-virtual {v0, v2, v1}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->userSessionManager:Lod1/a0;

    invoke-interface {v0}, Lod1/a0;->e()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->schedulerFactory:Lin2/h;

    invoke-interface {v1}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxg3/k;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/onboarding/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/b;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lcom/whoop/data/onboarding/d;

    invoke-direct {v1, p0, v3}, Lcom/whoop/data/onboarding/d;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;I)V

    invoke-virtual {v0, v2, v1}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    return-void
.end method

.method private static final observeUserLoginEvents$lambda$0(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Logout;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->cancelOnboardingStatusPeriodicFetch()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final observeUserLoginEvents$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final observeUserLoginEvents$lambda$2(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V
    .locals 2

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error observing logout stream: "

    const-string v1, " "

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final observeUserLoginEvents$lambda$3(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lcom/whoop/domain/model/Login;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->startOnboardingStatusPeriodicFetch()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final observeUserLoginEvents$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final observeUserLoginEvents$lambda$5(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Ljava/lang/Throwable;)V
    .locals 2

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error observing login stream: "

    const-string v1, " "

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final prefetchOverlays()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->applicationCoroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final startOnboardingStatusPeriodicFetch()V
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->cancelOnboardingStatusPeriodicFetch()V

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->configurationRepository:Ljs0/c;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingStatusFetchCadenceMillis;->INSTANCE:Lcom/whoop/data/repositories/OnboardingStatusFetchCadenceMillis;

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Long;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    move-object v0, v6

    goto/16 :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_4
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_5
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_6
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->applicationCoroutineScope:Lbc3/c0;

    new-instance v3, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;

    invoke-direct {v3, p0, v0, v1, v6}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;JLq83/d;)V

    const/4 v0, 0x3

    invoke-static {v2, v6, v6, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->fetchJob:Lbc3/k1;

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->prefetchOverlays()V

    return-void

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final storeEntriesInLocalDatabase(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;

    iget v1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget v2, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->I$0:I

    iget-object v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    iput v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/data/onboarding/OnboardingStatusDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, p1

    move v2, v5

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v6, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    new-instance v7, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v7, v8, p1}, Lcom/whoop/data/onboarding/OnboardingStatus;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->L$3:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->I$0:I

    iput v5, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->I$1:I

    iput v3, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$storeEntriesInLocalDatabase$1;->label:I

    invoke-interface {v6, v7, v0}, Lcom/whoop/data/onboarding/OnboardingStatusDao;->updateTable(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v1, :cond_5

    :goto_3
    return-object v1

    :goto_4
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    const-string v1, "Failed to insert onboarding status entry into DB"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final cancelOnboardingStatusPeriodicFetch()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->fetchJob:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final filterOnboardingStatusMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Map<",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "mapToTrim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    if-eqz v5, :cond_0

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final getLogger()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->logger:Ltr2/n;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->loadOnboardingStatusFromTable()V

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->startOnboardingStatusPeriodicFetch()V

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->observeUserLoginEvents()V

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
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->prefetchOverlays()V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public retriggerOnboardingFetch()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->startOnboardingStatusPeriodicFetch()V

    return-void
.end method

.method public shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->onboardingStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    xor-int/2addr p1, v0

    return p1
.end method

.class public final Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/repositories/FeatureFlagRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010!J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008#\u0010%J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008&\u0010$J\u0018\u0010&\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J\u001d\u0010,\u001a\u00020+2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001b0)H\u0007\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020+H\u0007\u00a2\u0006\u0004\u0008.\u0010/J\u001d\u00102\u001a\u00020+2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001b00H\u0016\u00a2\u0006\u0004\u00082\u00103J\u0013\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001b04\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u00087\u0010(J\u000f\u00108\u001a\u00020+H\u0017\u00a2\u0006\u0004\u00088\u0010/J\u0017\u0010;\u001a\u00020+2\u0006\u0010:\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010=\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008?\u0010(J\u000f\u0010@\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008@\u0010/J\u000f\u0010A\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008A\u0010/J\u0010\u0010B\u001a\u00020+H\u0082@\u00a2\u0006\u0004\u0008B\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010CR\u001e\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010DR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010ER\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010FR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010KR\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR \u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b000S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR&\u0010W\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b000V8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR\u001a\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020\u001b0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u001a\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u001b0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010]R\u0017\u0010`\u001a\u00020_8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010c\u00a8\u0006d"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "Lin2/d;",
        "dispatcherFactory",
        "Lin2/h;",
        "Lxg3/k;",
        "Lcom/whoop/ui/util/SchedulerFactory;",
        "schedulerFactory",
        "Lcom/whoop/service/network/FeatureFlagsApi;",
        "api",
        "",
        "fetchEnabled",
        "Lu92/d;",
        "featurePrefs",
        "",
        "fetchInterval",
        "Lrr2/c;",
        "crashReporter",
        "Lbc3/c0;",
        "applicationCoroutineScope",
        "Lod1/u;",
        "userContext",
        "Ll83/h;",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;)V",
        "",
        "featureName",
        "isFeatureEnabled",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        "featureFlag",
        "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z",
        "featureFlagName",
        "isOnboardingFeatureFlagTurnedOn",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;",
        "isOnboardingFeatureFlagTurnedOnV2",
        "loadFeatureFlags",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "updatedFeatureFlagsSaved",
        "Ll83/a0;",
        "saveFeatureFlagsList",
        "(Ljava/util/List;)V",
        "resetFeatureFlagsForUiTests",
        "()V",
        "",
        "flags",
        "addValueToStreams",
        "(Ljava/util/Set;)V",
        "",
        "fetchFeatureFlagForDebugSettings",
        "()Ljava/util/Set;",
        "resetFeatureFlagsToNormalFromDebugSettings",
        "cancelFeatureFlagPeriodicFetch",
        "Lod1/a0;",
        "userSessionManager",
        "subscribeToUserChangeEvents",
        "(Lod1/a0;)V",
        "removeOnboardingFeatureFlag",
        "(Ljava/lang/String;)V",
        "fetchFeatureFlags",
        "initializeLoadingFeatureFlags",
        "startFeatureFlagPeriodicFetch",
        "periodicFetchOnboardingFlags",
        "Lin2/d;",
        "Lin2/h;",
        "Lcom/whoop/service/network/FeatureFlagsApi;",
        "Z",
        "Lu92/d;",
        "J",
        "Lrr2/c;",
        "Lbc3/c0;",
        "Lod1/u;",
        "Ll83/h;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "Lbc3/k1;",
        "fetchJob",
        "Lbc3/k1;",
        "Lec3/o1;",
        "_flagsMutableFlow",
        "Lec3/o1;",
        "Lec3/t1;",
        "featureFlagsFlow",
        "Lec3/t1;",
        "getFeatureFlagsFlow",
        "()Lec3/t1;",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "featureFlags",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "onboardingFeatureFlags",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
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
.field private final _flagsMutableFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final api:Lcom/whoop/service/network/FeatureFlagsApi;

.field private final applicationCoroutineScope:Lbc3/c0;

.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final featureFlagsFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final featurePrefs:Lu92/d;

.field private fetchEnabled:Z

.field private final fetchInterval:J

.field private fetchJob:Lbc3/k1;

.field private final logger:Ltr2/n;

.field private final metricWriter:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final mutex:Lmc3/a;

.field private final onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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


# direct methods
.method public constructor <init>(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin2/d;",
            "Lin2/h<",
            "+",
            "Lxg3/k;",
            ">;",
            "Lcom/whoop/service/network/FeatureFlagsApi;",
            "Z",
            "Lu92/d;",
            "J",
            "Lrr2/c;",
            "Lbc3/c0;",
            "Lod1/u;",
            "Ll83/h;",
            ")V"
        }
    .end annotation

    const-string v0, "dispatcherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featurePrefs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationCoroutineScope"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->dispatcherFactory:Lin2/d;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->schedulerFactory:Lin2/h;

    .line 4
    iput-object p3, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->api:Lcom/whoop/service/network/FeatureFlagsApi;

    .line 5
    iput-boolean p4, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    .line 6
    iput-object p5, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    .line 7
    iput-wide p6, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchInterval:J

    .line 8
    iput-object p8, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->crashReporter:Lrr2/c;

    .line 9
    iput-object p9, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->applicationCoroutineScope:Lbc3/c0;

    .line 10
    iput-object p10, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->userContext:Lod1/u;

    .line 11
    iput-object p11, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->metricWriter:Ll83/h;

    .line 12
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->mutex:Lmc3/a;

    .line 13
    sget-object p1, Ldc3/a;->x:Ldc3/a;

    const/4 p2, 0x2

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->_flagsMutableFlow:Lec3/o1;

    .line 14
    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlagsFlow:Lec3/t1;

    .line 15
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 17
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "FeatureFlagRepository"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    .line 18
    iget-boolean p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    if-eqz p1, :cond_0

    const-string p1, "override-feature-flag"

    invoke-virtual {p5, p1, p4}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p3, p4

    :goto_0
    iput-boolean p3, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    .line 19
    invoke-direct {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->initializeLoadingFeatureFlags()V

    return-void
.end method

.method public synthetic constructor <init>(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    and-int/lit8 v0, p12, 0x20

    if-eqz v0, :cond_0

    const-wide/32 v0, 0x927c0

    move-wide v8, v0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    goto :goto_1

    :cond_0
    move-wide/from16 v8, p6

    goto :goto_0

    .line 20
    :goto_1
    invoke-direct/range {v2 .. v13}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;-><init>(Lin2/d;Lin2/h;Lcom/whoop/service/network/FeatureFlagsApi;ZLu92/d;JLrr2/c;Lbc3/c0;Lod1/u;Ll83/h;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->periodicFetchOnboardingFlags$lambda$4(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchFeatureFlags(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchFeatureFlags(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getApi$p(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;)Lcom/whoop/service/network/FeatureFlagsApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->api:Lcom/whoop/service/network/FeatureFlagsApi;

    return-object p0
.end method

.method public static final synthetic access$getFetchInterval$p(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;)J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchInterval:J

    return-wide v0
.end method

.method public static final synthetic access$getUserContext$p(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;)Lod1/u;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->userContext:Lod1/u;

    return-object p0
.end method

.method public static final synthetic access$periodicFetchOnboardingFlags(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->periodicFetchOnboardingFlags(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/repositories/a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->subscribeToUserChangeEvents$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Logout;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->subscribeToUserChangeEvents$lambda$0(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Logout;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/repositories/a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->subscribeToUserChangeEvents$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Login;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->subscribeToUserChangeEvents$lambda$2(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Login;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final fetchFeatureFlags(Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;

    iget v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;->label:I

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

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    if-nez p1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const-string v2, "getting feature flags from api"

    new-array v5, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$2;

    const/4 v5, 0x0

    invoke-direct {v2, p0, v5}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$2;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    iput v4, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$fetchFeatureFlags$1;->label:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, "Got "

    const-string v4, " feature flags from api"

    invoke-static {v1, v2, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    monitor-enter v1

    :try_start_2
    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->addValueToStreams(Ljava/util/Set;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "FeatureSwitches"

    invoke-virtual {v0, v1, p1}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1

    :goto_2
    const-string v1, "Failed to fetch feature flags:"

    iget-object v2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final initializeLoadingFeatureFlags()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "FeatureSwitches"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->addValueToStreams(Ljava/util/Set;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "OnboardingFeatureSwitches"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->startFeatureFlagPeriodicFetch()V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "init completed"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final periodicFetchOnboardingFlags(Lq83/d;)Ljava/lang/Object;
    .locals 19
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;

    iget v3, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;

    invoke-direct {v2, v0, v1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$0:I

    iget-object v6, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    iget-object v6, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget v4, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$0:I

    iget-object v5, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    iget-object v5, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    sget-object v4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FEATURE_FLAG_FETCH_V2:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v1

    sget-object v15, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->metricWriter:Ll83/h;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    new-instance v11, Ljy1/a;

    const/16 v17, 0x15

    const/16 v18, 0x0

    const/4 v12, 0x0

    const-string v13, "onboarding_feature_flag_fetch.v2"

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v8, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    invoke-interface {v1, v11, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_7

    :cond_6
    :goto_1
    invoke-static {}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->values()[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    move-result-object v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v1

    move v6, v10

    :goto_2
    if-ge v6, v5, :cond_8

    aget-object v8, v1, v6

    invoke-virtual {v8}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getOnboardingOnly()Z

    move-result v11

    if-nez v11, :cond_7

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v5, v1

    move v4, v10

    :cond_9
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v1

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$0:Ljava/lang/Object;

    iput-object v5, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$3:Ljava/lang/Object;

    iput v4, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$0:I

    iput v10, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$1:I

    iput v7, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->isOnboardingFeatureFlagTurnedOnV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto :goto_7

    :cond_a
    iget-object v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->metricWriter:Ll83/h;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    new-instance v11, Ljy1/a;

    const/16 v17, 0x15

    const/16 v18, 0x0

    const/4 v12, 0x0

    const-string v13, "onboarding_feature_flag_fetch.v1"

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v6, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    invoke-interface {v1, v11, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto :goto_7

    :cond_b
    :goto_4
    invoke-static {}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->values()[Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    move-result-object v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v1

    move v7, v10

    :goto_5
    if-ge v7, v6, :cond_d

    aget-object v8, v1, v7

    invoke-virtual {v8}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getOnboardingOnly()Z

    move-result v11

    if-nez v11, :cond_c

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v6, v1

    move v4, v10

    :cond_e
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->L$3:Ljava/lang/Object;

    iput v4, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$0:I

    iput v10, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->I$1:I

    iput v5, v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$periodicFetchOnboardingFlags$1;->label:I

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->isOnboardingFeatureFlagTurnedOn(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    :goto_7
    return-object v3

    :cond_f
    iget-object v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    iget-object v2, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v6, La11/g;

    const/16 v3, 0x1b

    invoke-direct {v6, v3}, La11/g;-><init>(I)V

    const/16 v7, 0x1f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Got Onboarding feature flags from api "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private static final periodicFetchOnboardingFlags$lambda$4(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "\""

    invoke-static {v0, p0, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final removeOnboardingFeatureFlag(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    const-string v1, "OnboardingFeatureSwitches"

    invoke-virtual {p1, v1, v0}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private final startFeatureFlagPeriodicFetch()V
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->cancelFeatureFlagPeriodicFetch()V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "starting new periodic FF fetch"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->applicationCoroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchJob:Lbc3/k1;

    return-void
.end method

.method private static final subscribeToUserChangeEvents$lambda$0(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Logout;)Ll83/a0;
    .locals 2

    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "User logged out. Resetting feature flags"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v0, "FeatureSwitches"

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {p1, v0, v1}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v0, "OnboardingFeatureSwitches"

    invoke-virtual {p1, v0, v1}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->addValueToStreams(Ljava/util/Set;)V

    invoke-virtual {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->cancelFeatureFlagPeriodicFetch()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final subscribeToUserChangeEvents$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final subscribeToUserChangeEvents$lambda$2(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/domain/model/Login;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->startFeatureFlagPeriodicFetch()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final subscribeToUserChangeEvents$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addValueToStreams(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "flags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->_flagsMutableFlow:Lec3/o1;

    invoke-interface {v0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public cancelFeatureFlagPeriodicFetch()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchJob:Lbc3/k1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "cancelling existing periodic FF fetch"

    invoke-interface {v1, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final fetchFeatureFlagForDebugSettings()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method public getFeatureFlagsFlow()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlagsFlow:Lec3/t1;

    return-object v0
.end method

.method public final getLogger()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    return-object v0
.end method

.method public isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z
    .locals 1

    const-string v0, "featureFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isFeatureEnabled(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "featureName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public isOnboardingFeatureFlagTurnedOn(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 15
    invoke-virtual {p1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->isOnboardingFeatureFlagTurnedOn(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isOnboardingFeatureFlagTurnedOn(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;

    iget v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    :try_start_1
    iget-object p2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {p2}, Lin2/d;->b()Lq83/j;

    move-result-object p2

    new-instance v2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$result$1;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$result$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$1;->label:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "OnboardingFeatureSwitches"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 4
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v2, "OnboardingFeatureSwitches"

    invoke-virtual {v1, v2, v0}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    .line 7
    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :try_start_2
    iget-object v2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 9
    iget-object v2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 10
    :try_start_3
    monitor-exit v1

    goto :goto_2

    :catchall_1
    move-exception p2

    monitor-exit v1

    throw p2

    .line 11
    :cond_4
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->removeOnboardingFeatureFlag(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    return-object p2

    .line 12
    :goto_3
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->removeOnboardingFeatureFlag(Ljava/lang/String;)V

    .line 13
    const-string p1, "Failed to fetch onboarding feature flags"

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->crashReporter:Lrr2/c;

    invoke-static {p2, p1, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public isOnboardingFeatureFlagTurnedOnV2(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 25
    invoke-virtual {p1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->isOnboardingFeatureFlagTurnedOnV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isOnboardingFeatureFlagTurnedOnV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "OnboardingFeatureSwitches"

    instance-of v1, p2, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;

    iget v2, v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->label:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;

    invoke-direct {v1, p0, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->label:I

    const/4 v10, 0x2

    const/4 v3, 0x1

    const/4 v11, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v10, :cond_1

    iget-object p1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;

    iget-object p1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    move p2, v3

    iget-object v3, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    new-instance v6, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$2;

    invoke-direct {v6, p0, p1, v11}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$2;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$0:Ljava/lang/Object;

    iput p2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    .line 3
    :cond_4
    :goto_2
    check-cast p2, Lu02/a;

    .line 4
    instance-of v2, p2, Lu02/a$c;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    .line 5
    iget-object v2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->mutex:Lmc3/a;

    .line 6
    iput-object p1, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$0:Ljava/lang/Object;

    iput-object p2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$1:Ljava/lang/Object;

    iput-object v2, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$2:Ljava/lang/Object;

    iput-object v11, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->L$3:Ljava/lang/Object;

    iput v3, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->I$0:I

    iput v3, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->I$1:I

    iput v10, v7, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOnV2$1;->label:I

    invoke-interface {v2, v7}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v1, v2

    move-object v2, p1

    move-object p1, v1

    move-object v1, p2

    .line 7
    :goto_4
    :try_start_0
    iget-object p2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    invoke-virtual {p2, v0}, Lu92/d;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 8
    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    .line 9
    move-object v3, v1

    check-cast v3, Lu02/a$c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 10
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_6

    .line 11
    :cond_6
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 12
    :goto_5
    iget-object v2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    invoke-virtual {v2, v0, p2}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    .line 13
    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 14
    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z

    .line 15
    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-interface {p1, v11}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_8

    :goto_6
    invoke-interface {p1, v11}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2

    .line 17
    :cond_7
    instance-of v0, p2, Lu02/a$b$a;

    if-eqz v0, :cond_9

    .line 18
    check-cast p2, Lu02/a$b$a;

    invoke-virtual {p2}, Lu02/a$b$a;->d()I

    move-result p2

    const/16 v0, 0x194

    if-ne p2, v0, :cond_8

    .line 19
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->removeOnboardingFeatureFlag(Ljava/lang/String;)V

    goto :goto_7

    .line 20
    :cond_8
    iget-object p2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v3

    .line 21
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 22
    :cond_9
    instance-of p2, p2, Lu02/a$b$b;

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->onboardingFeatureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p2

    .line 23
    :goto_8
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 24
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public loadFeatureFlags(Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;

    iget v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->periodicFetchOnboardingFlags(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$loadFeatureFlags$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchFeatureFlags(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final resetFeatureFlagsForUiTests()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "test clearing feature flags"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->addValueToStreams(Ljava/util/Set;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "FeatureSwitches"

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1, v2}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public resetFeatureFlagsToNormalFromDebugSettings(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->fetchEnabled:Z

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->loadFeatureFlags(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final saveFeatureFlagsList(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "updatedFeatureFlagsSaved"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->logger:Ltr2/n;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "test saving feature flags: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featureFlags:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->addValueToStreams(Ljava/util/Set;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->featurePrefs:Lu92/d;

    const-string v1, "FeatureSwitches"

    invoke-virtual {v0, v1, p1}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public subscribeToUserChangeEvents(Lod1/a0;)V
    .locals 4

    const-string v0, "userSessionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lod1/a0;->j()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->schedulerFactory:Lin2/h;

    invoke-interface {v1}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxg3/k;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-interface {p1}, Lod1/a0;->e()Lxg3/g;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->schedulerFactory:Lin2/h;

    invoke-interface {v0}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg3/k;

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/repositories/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;I)V

    new-instance v1, Lcom/whoop/data/onboarding/c;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

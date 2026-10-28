.class public final Lcom/mapbox/common/module/cronet/LazyEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/cronet/LazyEngine$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\n8F@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/mapbox/common/module/cronet/LazyEngine;",
        "",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "<init>",
        "(Ljava/util/concurrent/Executor;)V",
        "Ll83/a0;",
        "initializeProvider",
        "()V",
        "tryInstallFromGooglePlay",
        "Lorg/chromium/net/CronetEngine;",
        "configureEngine",
        "()Lorg/chromium/net/CronetEngine;",
        "Ljava/util/concurrent/Executor;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lorg/chromium/net/CronetProvider;",
        "cronetProvider",
        "Lorg/chromium/net/CronetProvider;",
        "<set-?>",
        "engine",
        "Lorg/chromium/net/CronetEngine;",
        "getEngine",
        "Companion",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/common/module/cronet/LazyEngine$Companion;


# instance fields
.field private final context:Landroid/content/Context;

.field private cronetProvider:Lorg/chromium/net/CronetProvider;

.field private volatile engine:Lorg/chromium/net/CronetEngine;

.field private final executor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/module/cronet/LazyEngine;->Companion:Lcom/mapbox/common/module/cronet/LazyEngine$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "executor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->executor:Ljava/util/concurrent/Executor;

    sget-object p1, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    invoke-virtual {p1}, Lcom/mapbox/common/MapboxSDKCommon;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->context:Landroid/content/Context;

    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->initializeProvider()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->tryInstallFromGooglePlay$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/mapbox/common/module/cronet/LazyEngine;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$setCronetProvider$p(Lcom/mapbox/common/module/cronet/LazyEngine;Lorg/chromium/net/CronetProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->tryInstallFromGooglePlay$lambda$2(Ljava/lang/Exception;)V

    return-void
.end method

.method private final configureEngine()Lorg/chromium/net/CronetEngine;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lorg/chromium/net/CronetProvider;->createBuilder()Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/chromium/net/CronetEngine$Builder;->enableBrotli(Z)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/chromium/net/CronetEngine$Builder;->enableQuic(Z)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/chromium/net/CronetEngine$Builder;->enableHttp2(Z)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    const-string v1, "api.mapbox.com"

    const/16 v2, 0x1bb

    invoke-virtual {v0, v1, v2, v2}, Lorg/chromium/net/CronetEngine$Builder;->addQuicHint(Ljava/lang/String;II)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    const-string v1, "events.mapbox.com"

    invoke-virtual {v0, v1, v2, v2}, Lorg/chromium/net/CronetEngine$Builder;->addQuicHint(Ljava/lang/String;II)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    const-string v1, "config.mapbox.com"

    invoke-virtual {v0, v1, v2, v2}, Lorg/chromium/net/CronetEngine$Builder;->addQuicHint(Ljava/lang/String;II)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lorg/chromium/net/CronetEngine$Builder;->enableHttpCache(IJ)Lorg/chromium/net/CronetEngine$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/net/CronetEngine$Builder;->build()Lorg/chromium/net/CronetEngine;

    move-result-object v0

    new-instance v1, Lcom/mapbox/common/module/cronet/CronetRequestFinishedListener;

    iget-object v2, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->executor:Ljava/util/concurrent/Executor;

    invoke-direct {v1, v2}, Lcom/mapbox/common/module/cronet/CronetRequestFinishedListener;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0, v1}, Lorg/chromium/net/CronetEngine;->addRequestFinishedListener(Lorg/chromium/net/RequestFinishedInfo$Listener;)V

    sget-object v1, Lcom/mapbox/common/module/cronet/LazyEngine;->Companion:Lcom/mapbox/common/module/cronet/LazyEngine$Companion;

    iget-object v2, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;->onCronetAvailable(Lorg/chromium/net/CronetProvider;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    invoke-static {}, Lcom/mapbox/common/module/cronet/LazyEngineKt;->getDisabledProviders()Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lorg/chromium/net/CronetProvider;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->initializeProvider()V

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->configureEngine()Lorg/chromium/net/CronetEngine;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final initializeProvider()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/mapbox/common/module/cronet/LazyEngineKt;->findCronetProvider(Landroid/content/Context;)Lorg/chromium/net/CronetProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->tryInstallFromGooglePlay()V

    :cond_0
    return-void
.end method

.method private final tryInstallFromGooglePlay()V
    .locals 4

    sget-object v0, Lcom/mapbox/common/module/cronet/LazyEngine;->Companion:Lcom/mapbox/common/module/cronet/LazyEngine$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;->canInstallFromGooglePlay()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;->installCronetFromPlayServices(Landroid/content/Context;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;

    invoke-direct {v1, p0}, Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;-><init>(Lcom/mapbox/common/module/cronet/LazyEngine;)V

    new-instance v2, Lcom/mapbox/common/location/a;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v3}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lc9/g;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lc9/g;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;->onCronetNotAvailable()V

    return-void
.end method

.method private static final tryInstallFromGooglePlay$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final tryInstallFromGooglePlay$lambda$2(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/mapbox/common/module/cronet/LazyEngine;->Companion:Lcom/mapbox/common/module/cronet/LazyEngine$Companion;

    invoke-virtual {p0}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;->onCronetNotAvailable()V

    return-void
.end method


# virtual methods
.method public final getEngine()Lorg/chromium/net/CronetEngine;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->cronetProvider:Lorg/chromium/net/CronetProvider;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->engine:Lorg/chromium/net/CronetEngine;

    if-nez v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->engine:Lorg/chromium/net/CronetEngine;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine;->configureEngine()Lorg/chromium/net/CronetEngine;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->engine:Lorg/chromium/net/CronetEngine;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0

    throw v0

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/LazyEngine;->engine:Lorg/chromium/net/CronetEngine;

    return-object v0
.end method

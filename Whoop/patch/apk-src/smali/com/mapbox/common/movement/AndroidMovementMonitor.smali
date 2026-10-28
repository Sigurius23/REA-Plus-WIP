.class public final Lcom/mapbox/common/movement/AndroidMovementMonitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/MovementMonitorInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lcom/mapbox/common/movement/AndroidMovementMonitor;",
        "Lcom/mapbox/common/MovementMonitorInterface;",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient;",
        "activityRecognition",
        "<init>",
        "(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V",
        "Lcom/mapbox/common/MovementInfo;",
        "info",
        "Ll83/a0;",
        "onPlatformMovementInfoAvailable",
        "(Lcom/mapbox/common/MovementInfo;)V",
        "movementInfo",
        "notifyObservers",
        "Lcom/mapbox/common/MovementInfoCallback;",
        "callback",
        "getMovementInfo",
        "(Lcom/mapbox/common/MovementInfoCallback;)V",
        "setMovementInfo",
        "Lcom/mapbox/common/MovementModeObserver;",
        "observer",
        "registerObserver",
        "(Lcom/mapbox/common/MovementModeObserver;)V",
        "unregisterObserver",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient;",
        "",
        "Landroid/os/Handler;",
        "observers",
        "Ljava/util/Map;",
        "sdkMovementInfo",
        "Lcom/mapbox/common/MovementInfo;",
        "systemMovementInfo",
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
.field public static final Companion:Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;

.field private static final NO_MOVEMENT_INFO_ERROR:Ljava/lang/String; = "Movement is not available"


# instance fields
.field private final activityRecognition:Lcom/mapbox/common/movement/ActivityRecognitionClient;

.field private final observers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/mapbox/common/MovementModeObserver;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private sdkMovementInfo:Lcom/mapbox/common/MovementInfo;

.field private systemMovementInfo:Lcom/mapbox/common/MovementInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->Companion:Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V
    .locals 1

    const-string v0, "activityRecognition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->activityRecognition:Lcom/mapbox/common/movement/ActivityRecognitionClient;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    new-instance v0, Lcom/mapbox/common/movement/AndroidMovementMonitor$1;

    invoke-direct {v0, p0}, Lcom/mapbox/common/movement/AndroidMovementMonitor$1;-><init>(Lcom/mapbox/common/movement/AndroidMovementMonitor;)V

    invoke-interface {p1, v0}, Lcom/mapbox/common/movement/ActivityRecognitionClient;->addObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/common/MovementModeObserver;Lcom/mapbox/common/MovementInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->notifyObservers$lambda$2$lambda$1(Lcom/mapbox/common/MovementModeObserver;Lcom/mapbox/common/MovementInfo;)V

    return-void
.end method

.method public static final synthetic access$onPlatformMovementInfoAvailable(Lcom/mapbox/common/movement/AndroidMovementMonitor;Lcom/mapbox/common/MovementInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->onPlatformMovementInfoAvailable(Lcom/mapbox/common/MovementInfo;)V

    return-void
.end method

.method public static final create()Lcom/mapbox/common/MovementMonitorInterface;
    .locals 1

    sget-object v0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->Companion:Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;->create()Lcom/mapbox/common/MovementMonitorInterface;

    move-result-object v0

    return-object v0
.end method

.method private final notifyObservers(Lcom/mapbox/common/MovementInfo;)V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/common/MovementModeObserver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, La8/c;

    const/16 v4, 0xd

    invoke-direct {v3, v4, v2, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v2, p1}, Lcom/mapbox/common/MovementModeObserver;->onMovementModeChanged(Lcom/mapbox/common/MovementInfo;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final notifyObservers$lambda$2$lambda$1(Lcom/mapbox/common/MovementModeObserver;Lcom/mapbox/common/MovementInfo;)V
    .locals 1

    const-string v0, "$observer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$movementInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/mapbox/common/MovementModeObserver;->onMovementModeChanged(Lcom/mapbox/common/MovementInfo;)V

    return-void
.end method

.method private final declared-synchronized onPlatformMovementInfoAvailable(Lcom/mapbox/common/MovementInfo;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->systemMovementInfo:Lcom/mapbox/common/MovementInfo;

    invoke-direct {p0, p1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->notifyObservers(Lcom/mapbox/common/MovementInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public declared-synchronized getMovementInfo(Lcom/mapbox/common/MovementInfoCallback;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->systemMovementInfo:Lcom/mapbox/common/MovementInfo;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->sdkMovementInfo:Lcom/mapbox/common/MovementInfo;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    const-string v1, "{\n            ExpectedFa\u2026mentInfo>(info)\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v0, "Movement is not available"

    invoke-static {v0}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    const-string v1, "{\n            ExpectedFa\u2026ENT_INFO_ERROR)\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p1, v0}, Lcom/mapbox/common/MovementInfoCallback;->run(Lcom/mapbox/bindgen/Expected;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized registerObserver(Lcom/mapbox/common/MovementModeObserver;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->activityRecognition:Lcom/mapbox/common/movement/ActivityRecognitionClient;

    invoke-interface {p1}, Lcom/mapbox/common/movement/ActivityRecognitionClient;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setMovementInfo(Lcom/mapbox/common/MovementInfo;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "movementInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->activityRecognition:Lcom/mapbox/common/movement/ActivityRecognitionClient;

    invoke-interface {v0}, Lcom/mapbox/common/movement/ActivityRecognitionClient;->isPlatformActivityRecognitionAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/mapbox/common/MovementInfo;

    invoke-virtual {p1}, Lcom/mapbox/common/MovementInfo;->getMovementMode()Ljava/util/HashMap;

    move-result-object v1

    sget-object v2, Lcom/mapbox/common/MovementModeProvider;->SDK:Lcom/mapbox/common/MovementModeProvider;

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/MovementInfo;-><init>(Ljava/util/HashMap;Lcom/mapbox/common/MovementModeProvider;)V

    iput-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->sdkMovementInfo:Lcom/mapbox/common/MovementInfo;

    invoke-direct {p0, p1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->notifyObservers(Lcom/mapbox/common/MovementInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized unregisterObserver(Lcom/mapbox/common/MovementModeObserver;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->observers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor;->activityRecognition:Lcom/mapbox/common/movement/ActivityRecognitionClient;

    invoke-interface {p1}, Lcom/mapbox/common/movement/ActivityRecognitionClient;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.class public final Lcom/mapbox/common/LifecycleMonitorAndroid;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/LifecycleMonitorInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;,
        Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;,
        Lcom/mapbox/common/LifecycleMonitorAndroid$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\u0003\n\u0002\u0008\u0006*\u000214\u0008\u0000\u0018\u0000 72\u00020\u0001:\u000278B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00112\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R6\u0010-\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R6\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010.R6\u00100\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010.R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00069"
    }
    d2 = {
        "Lcom/mapbox/common/LifecycleMonitorAndroid;",
        "Lcom/mapbox/common/LifecycleMonitorInterface;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/mapbox/common/LifecycleMonitoringState;",
        "state",
        "",
        "error",
        "Ll83/a0;",
        "notifyObservers",
        "(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V",
        "Lcom/mapbox/common/LifecycleState;",
        "(Lcom/mapbox/common/LifecycleState;)V",
        "notifyPendingCallbacks",
        "(Lcom/mapbox/common/LifecycleState;Ljava/lang/String;)V",
        "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;",
        "updateMonitorState",
        "(Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;)V",
        "updateLifecycleState",
        "start",
        "()V",
        "stop",
        "Lcom/mapbox/common/GetLifecycleStateCallback;",
        "callback",
        "getLifecycleState",
        "(Lcom/mapbox/common/GetLifecycleStateCallback;)V",
        "Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;",
        "getMonitoringState",
        "(Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;)V",
        "Lcom/mapbox/common/LifecycleObserver;",
        "observer",
        "registerObserver",
        "(Lcom/mapbox/common/LifecycleObserver;)V",
        "unregisterObserver",
        "Landroid/content/Context;",
        "Lcom/mapbox/common/LifecycleService;",
        "lifecycleService",
        "Lcom/mapbox/common/LifecycleService;",
        "monitorState",
        "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;",
        "Ljava/util/HashMap;",
        "Landroid/os/Handler;",
        "Lkotlin/collections/HashMap;",
        "observers",
        "Ljava/util/HashMap;",
        "pendingLifecycleStateCallbacks",
        "pendingMonitoringStateCallbacks",
        "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1",
        "lifecycleServiceCallback",
        "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;",
        "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1",
        "lifecycleServiceConnection",
        "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;",
        "Companion",
        "MonitorState",
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
.field public static final Companion:Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;

.field public static final TAG:Ljava/lang/String; = "LifecycleMonitor"


# instance fields
.field private final context:Landroid/content/Context;

.field private lifecycleService:Lcom/mapbox/common/LifecycleService;

.field private final lifecycleServiceCallback:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;

.field private final lifecycleServiceConnection:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

.field private monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

.field private observers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/mapbox/common/LifecycleObserver;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private pendingLifecycleStateCallbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/mapbox/common/GetLifecycleStateCallback;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private pendingMonitoringStateCallbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid;->Companion:Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->context:Landroid/content/Context;

    .line 3
    sget-object p1, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STOPPED:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingLifecycleStateCallbacks:Ljava/util/HashMap;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingMonitoringStateCallbacks:Ljava/util/HashMap;

    .line 7
    new-instance p1, Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;-><init>(Lcom/mapbox/common/LifecycleMonitorAndroid;)V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceCallback:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;

    .line 8
    new-instance p1, Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;-><init>(Lcom/mapbox/common/LifecycleMonitorAndroid;)V

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceConnection:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static final synthetic access$getLifecycleService$p(Lcom/mapbox/common/LifecycleMonitorAndroid;)Lcom/mapbox/common/LifecycleService;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleService:Lcom/mapbox/common/LifecycleService;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleServiceCallback$p(Lcom/mapbox/common/LifecycleMonitorAndroid;)Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceCallback:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;

    return-object p0
.end method

.method public static final synthetic access$setLifecycleService$p(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleService;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleService:Lcom/mapbox/common/LifecycleService;

    return-void
.end method

.method public static final synthetic access$updateLifecycleState(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->updateLifecycleState(Lcom/mapbox/common/LifecycleState;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleState;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyObservers$lambda$8$lambda$6$lambda$5(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleState;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyObservers$lambda$4$lambda$2$lambda$1(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    return-void
.end method

.method public static final create()Lcom/mapbox/common/LifecycleMonitorInterface;
    .locals 1

    sget-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid;->Companion:Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;->create()Lcom/mapbox/common/LifecycleMonitorInterface;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private final declared-synchronized notifyObservers(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    .line 2
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

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    .line 4
    new-instance v3, Landroidx/fragment/app/d;

    const/4 v4, 0x4

    invoke-direct {v3, v1, p1, p2, v4}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/LifecycleObserver;

    invoke-interface {v1, p1, p2}, Lcom/mapbox/common/LifecycleObserver;->onMonitoringStateChanged(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 6
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

.method private final declared-synchronized notifyObservers(Lcom/mapbox/common/LifecycleState;)V
    .locals 5

    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    .line 8
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

    .line 9
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    .line 10
    new-instance v3, La8/c;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v1, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/LifecycleObserver;

    invoke-interface {v1, p1}, Lcom/mapbox/common/LifecycleObserver;->onLifecycleStateChanged(Lcom/mapbox/common/LifecycleState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 12
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

.method private static final notifyObservers$lambda$4$lambda$2$lambda$1(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    .locals 1

    const-string v0, "$observer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/LifecycleObserver;

    invoke-interface {p0, p1, p2}, Lcom/mapbox/common/LifecycleObserver;->onMonitoringStateChanged(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    return-void
.end method

.method private static final notifyObservers$lambda$8$lambda$6$lambda$5(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleState;)V
    .locals 1

    const-string v0, "$observer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/LifecycleObserver;

    invoke-interface {p0, p1}, Lcom/mapbox/common/LifecycleObserver;->onLifecycleStateChanged(Lcom/mapbox/common/LifecycleState;)V

    return-void
.end method

.method private final declared-synchronized notifyPendingCallbacks(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    if-eqz p2, :cond_0

    .line 1
    :try_start_0
    invoke-static {p2}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    .line 2
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p2

    .line 3
    const-string p1, "run {\n            Expect\u2026ateValue(state)\n        }"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingMonitoringStateCallbacks:Ljava/util/HashMap;

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_2

    .line 7
    new-instance v2, Lcom/mapbox/common/b;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p2, v3}, Lcom/mapbox/common/b;-><init>(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 8
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;

    invoke-interface {v0, p2}, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    goto :goto_1

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingMonitoringStateCallbacks:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final declared-synchronized notifyPendingCallbacks(Lcom/mapbox/common/LifecycleState;Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    if-eqz p2, :cond_0

    .line 11
    :try_start_0
    invoke-static {p2}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    .line 12
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p2

    .line 13
    const-string p1, "run {\n            Expect\u2026ateValue(state)\n        }"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingLifecycleStateCallbacks:Ljava/util/HashMap;

    .line 15
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_2

    .line 17
    new-instance v2, Lcom/mapbox/common/b;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p2, v3}, Lcom/mapbox/common/b;-><init>(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 18
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/GetLifecycleStateCallback;

    invoke-interface {v0, p2}, Lcom/mapbox/common/GetLifecycleStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    goto :goto_1

    .line 19
    :cond_3
    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingLifecycleStateCallbacks:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static synthetic notifyPendingCallbacks$default(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleState;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks(Lcom/mapbox/common/LifecycleState;Ljava/lang/String;)V

    return-void
.end method

.method private static final notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;

    invoke-interface {p0, p1}, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private static final notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/GetLifecycleStateCallback;

    invoke-interface {p0, p1}, Lcom/mapbox/common/GetLifecycleStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private final declared-synchronized updateLifecycleState(Lcom/mapbox/common/LifecycleState;)V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, p1, v1, v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks$default(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleState;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyObservers(Lcom/mapbox/common/LifecycleState;)V
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

.method private final declared-synchronized updateMonitorState(Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-eqz p2, :cond_0

    sget-object v0, Lcom/mapbox/common/LifecycleState;->UNKNOWN:Lcom/mapbox/common/LifecycleState;

    invoke-direct {p0, v0, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks(Lcom/mapbox/common/LifecycleState;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    sget-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/mapbox/common/LifecycleMonitoringState;->STARTED:Lcom/mapbox/common/LifecycleMonitoringState;

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyObservers(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingLifecycleStateCallbacks:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/common/LifecycleMonitorAndroid;->stop()V

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/mapbox/common/LifecycleMonitoringState;->STOPPED:Lcom/mapbox/common/LifecycleMonitoringState;

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyPendingCallbacks(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->notifyObservers(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static synthetic updateMonitorState$default(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->updateMonitorState(Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized getLifecycleState(Lcom/mapbox/common/GetLifecycleStateCallback;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v1, Lcom/mapbox/common/LifecycleMonitorAndroid$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleService:Lcom/mapbox/common/LifecycleService;

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;

    invoke-direct {v2, p1}, Lcom/mapbox/common/LifecycleMonitorAndroid$getLifecycleState$1;-><init>(Lcom/mapbox/common/GetLifecycleStateCallback;)V

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/common/LifecycleService;->getLifecycleState(Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingLifecycleStateCallbacks:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STARTING:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-eq p1, v0, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/common/LifecycleMonitorAndroid;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getMonitoringState(Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v1, Lcom/mapbox/common/LifecycleMonitorAndroid$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/mapbox/common/LifecycleMonitoringState;->STARTED:Lcom/mapbox/common/LifecycleMonitoringState;

    invoke-static {v0}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/mapbox/common/LifecycleMonitoringState;->STOPPED:Lcom/mapbox/common/LifecycleMonitoringState;

    invoke-static {v0}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;->run(Lcom/mapbox/bindgen/Expected;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->pendingMonitoringStateCallbacks:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized registerObserver(Lcom/mapbox/common/LifecycleObserver;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

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

    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STARTED:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/mapbox/common/LifecycleMonitorAndroid;->start()V
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

.method public final declared-synchronized start()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v1, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STARTING:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-eq v0, v1, :cond_2

    sget-object v2, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STARTED:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v0, v2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->updateMonitorState$default(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->context:Landroid/content/Context;

    const-class v2, Lcom/mapbox/common/LifecycleService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceConnection:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Failed to bind lifecycle service"

    const-string v1, "LifecycleMonitor"

    invoke-static {v0, v1}, Lcom/mapbox/common/Log;->error(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STOPPED:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    const-string v1, "Cannot start service"

    invoke-direct {p0, v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->updateMonitorState(Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized stop()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->monitorState:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    sget-object v1, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STOPPING:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-eq v0, v1, :cond_2

    sget-object v2, Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;->STOPPED:Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v0, v2}, Lcom/mapbox/common/LifecycleMonitorAndroid;->updateMonitorState$default(Lcom/mapbox/common/LifecycleMonitorAndroid;Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleService:Lcom/mapbox/common/LifecycleService;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceConnection:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

    invoke-virtual {v1, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->lifecycleServiceConnection:Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;

    invoke-virtual {v0, v2}, Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;->onServiceDisconnected(Landroid/content/ComponentName;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized unregisterObserver(Lcom/mapbox/common/LifecycleObserver;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/common/LifecycleMonitorAndroid;->observers:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/common/LifecycleMonitorAndroid;->stop()V
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

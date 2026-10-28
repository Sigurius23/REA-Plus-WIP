.class public final Lcom/mapbox/common/battery/AndroidBatteryMonitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/BatteryMonitorInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lcom/mapbox/common/battery/AndroidBatteryMonitor;",
        "Lcom/mapbox/common/BatteryMonitorInterface;",
        "Landroid/content/Context;",
        "context",
        "",
        "intentBatteryActionName",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onNewIntent",
        "(Landroid/content/Intent;)V",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "state",
        "notifyObservers",
        "(Lcom/mapbox/bindgen/Expected;)V",
        "Lcom/mapbox/common/BatteryChargingStatusCallback;",
        "callback",
        "getBatteryChargingStatus",
        "(Lcom/mapbox/common/BatteryChargingStatusCallback;)V",
        "Lcom/mapbox/common/BatteryMonitorObserver;",
        "observer",
        "registerObserver",
        "(Lcom/mapbox/common/BatteryMonitorObserver;)V",
        "unregisterObserver",
        "Landroid/content/Context;",
        "chargingState",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "Landroid/os/Handler;",
        "observers",
        "Ljava/util/Map;",
        "Landroid/content/IntentFilter;",
        "intentFilter",
        "Landroid/content/IntentFilter;",
        "Landroid/content/BroadcastReceiver;",
        "broadcastReceiver",
        "Landroid/content/BroadcastReceiver;",
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
.field private static final BATTERY_STATUS_UNPLUGGED:I = 0x0

.field public static final Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

.field private static final NO_BATTERY_INFO_ERROR:Ljava/lang/String; = "Unknown battery status"


# instance fields
.field private final broadcastReceiver:Landroid/content/BroadcastReceiver;

.field private chargingState:Lcom/mapbox/bindgen/Expected;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final intentFilter:Landroid/content/IntentFilter;

.field private final observers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/mapbox/common/BatteryMonitorObserver;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentBatteryActionName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->context:Landroid/content/Context;

    .line 3
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

    .line 4
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->intentFilter:Landroid/content/IntentFilter;

    .line 5
    new-instance p1, Lcom/mapbox/common/battery/AndroidBatteryMonitor$broadcastReceiver$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$broadcastReceiver$1;-><init>(Lcom/mapbox/common/battery/AndroidBatteryMonitor;)V

    iput-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    const-string p2, "android.intent.action.BATTERY_CHANGED"

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->notifyObservers$lambda$2$lambda$1(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static final synthetic access$onNewIntent(Lcom/mapbox/common/battery/AndroidBatteryMonitor;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public static final create()Lcom/mapbox/common/BatteryMonitorInterface;
    .locals 1

    sget-object v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->create()Lcom/mapbox/common/BatteryMonitorInterface;

    move-result-object v0

    return-object v0
.end method

.method private final notifyObservers(Lcom/mapbox/bindgen/Expected;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

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

    check-cast v2, Lcom/mapbox/common/BatteryMonitorObserver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v3, La8/c;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v2, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    invoke-static {v1, v2, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->access$notify(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final notifyObservers$lambda$2$lambda$1(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    const-string v0, "$observer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    invoke-static {v0, p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->access$notify(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private final declared-synchronized onNewIntent(Landroid/content/Intent;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    invoke-static {v0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->access$getState(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    iget-object v1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->chargingState:Lcom/mapbox/bindgen/Expected;

    invoke-static {v0, p1, v1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->access$equals(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->chargingState:Lcom/mapbox/bindgen/Expected;

    invoke-direct {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->notifyObservers(Lcom/mapbox/bindgen/Expected;)V
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


# virtual methods
.method public declared-synchronized getBatteryChargingStatus(Lcom/mapbox/common/BatteryChargingStatusCallback;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->intentFilter:Landroid/content/IntentFilter;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->Companion:Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;

    invoke-static {v1, v0}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->access$getState(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/mapbox/common/BatteryChargingStatusCallback;->run(Lcom/mapbox/bindgen/Expected;)V
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

.method public declared-synchronized registerObserver(Lcom/mapbox/common/BatteryMonitorObserver;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

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

    iget-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
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

.method public declared-synchronized unregisterObserver(Lcom/mapbox/common/BatteryMonitorObserver;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->observers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
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

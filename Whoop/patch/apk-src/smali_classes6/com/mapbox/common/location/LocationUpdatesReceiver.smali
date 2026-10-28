.class public final Lcom/mapbox/common/location/LocationUpdatesReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;,
        Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000c\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/mapbox/common/location/LocationUpdatesReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "Companion",
        "CircularArray",
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
.field public static final ACTION_PROCESS_LOCATION_UPDATES:Ljava/lang/String; = "com.mapbox.common.location.action.PROCESS_LOCATION_UPDATES"

.field public static final Companion:Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

.field public static final LOCATION_PROVIDER_ID_KEY:Ljava/lang/String; = "com.mapbox.common.location.DeviceLocationProvider.ID"

.field private static final TAG:Ljava/lang/String; = "LUReceiver"

.field private static final backgroundDeviceLocationProviders:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mapbox/common/location/BaseDeviceLocationProvider;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final pendingIntents:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray<",
            "Landroid/content/Intent;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->Companion:Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->pendingIntents:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->backgroundDeviceLocationProviders:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static final synthetic access$getBackgroundDeviceLocationProviders$cp()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->backgroundDeviceLocationProviders:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static final synthetic access$getPendingIntents$cp()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->pendingIntents:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.mapbox.common.location.action.PROCESS_LOCATION_UPDATES"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {p1}, Lyb/a;->c(Landroid/content/Context;)Lyb/a;

    move-result-object p1

    const-class v0, Lcom/mapbox/common/MapboxSDKCommonInitializer;

    invoke-virtual {p1, v0}, Lyb/a;->d(Ljava/lang/Class;)Ljava/lang/Object;

    const-string p1, "com.mapbox.common.location.DeviceLocationProvider.ID"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "LUReceiver"

    if-nez v0, :cond_1

    const-string p1, "Missing location provider persistent id"

    :try_start_0
    sget-object p2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    invoke-virtual {p2, v1, p1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->backgroundDeviceLocationProviders:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_4

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->pendingIntents:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance v3, Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;-><init>(I)V

    invoke-interface {v0, v2, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, v0

    :cond_3
    :goto_0
    check-cast v3, Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;

    invoke-virtual {v3, p2}, Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;->add(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "DeviceLocationProvider with id "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not found."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :try_start_1
    sget-object p2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    invoke-virtual {p2, v1, p1}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;

    if-eqz p1, :cond_5

    invoke-virtual {p1, p2}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->extractResult(Landroid/content/Intent;)Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1, p2}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->notifyLocationUpdate(Ljava/util/List;)V

    :cond_5
    :goto_1
    return-void
.end method

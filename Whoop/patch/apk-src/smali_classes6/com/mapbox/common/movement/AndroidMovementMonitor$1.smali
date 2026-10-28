.class public final Lcom/mapbox/common/movement/AndroidMovementMonitor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/movement/AndroidMovementMonitor;-><init>(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/mapbox/common/movement/AndroidMovementMonitor$1",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;",
        "Lcom/mapbox/common/MovementInfo;",
        "info",
        "Ll83/a0;",
        "onMovementInfo",
        "(Lcom/mapbox/common/MovementInfo;)V",
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


# instance fields
.field final synthetic this$0:Lcom/mapbox/common/movement/AndroidMovementMonitor;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/movement/AndroidMovementMonitor;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor$1;->this$0:Lcom/mapbox/common/movement/AndroidMovementMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onMovementInfo(Lcom/mapbox/common/MovementInfo;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/movement/AndroidMovementMonitor$1;->this$0:Lcom/mapbox/common/movement/AndroidMovementMonitor;

    invoke-static {v0, p1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->access$onPlatformMovementInfoAvailable(Lcom/mapbox/common/movement/AndroidMovementMonitor;Lcom/mapbox/common/MovementInfo;)V
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

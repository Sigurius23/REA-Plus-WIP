.class public final Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/Cancelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/location/BaseDeviceLocationProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "LocationCancelable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0084\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;",
        "Lcom/mapbox/common/Cancelable;",
        "<init>",
        "(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V",
        "Ll83/a0;",
        "cancel",
        "()V",
        "Lkotlin/Function0;",
        "cb",
        "invokeIfNotCanceled",
        "(Lc93/a;)V",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isCanceled",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
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
.field private final isCanceled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic this$0:Lcom/mapbox/common/location/BaseDeviceLocationProvider;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->this$0:Lcom/mapbox/common/location/BaseDeviceLocationProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->isCanceled:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->isCanceled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final invokeIfNotCanceled(Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "cb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->isCanceled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v0, "LocationService"

    const-string v1, "Operation to get last location was canceled"

    invoke-virtual {p1, v0, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

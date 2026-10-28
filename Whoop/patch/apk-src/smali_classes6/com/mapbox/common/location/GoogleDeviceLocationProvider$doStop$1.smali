.class final Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->doStop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ljava/lang/Void;",
        "kotlin.jvm.PlatformType",
        "it",
        "Ll83/a0;",
        "invoke",
        "(Ljava/lang/Void;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->invoke(Ljava/lang/Void;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Void;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    iget-object v0, p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    sget-object v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPING:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->access$quitFusedLocationClientHandler(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V

    .line 4
    iget-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    sget-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->NONE:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    invoke-virtual {p1, v0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->setCurrentMode(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V

    .line 5
    iget-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    sget-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v0, p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Skipped stop state change: current state is "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    iget-object v1, v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GoogleDeviceLocationProvider"

    invoke-virtual {p1, v1, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :goto_0
    sget-object p1, Lcom/mapbox/common/location/LocationUpdatesReceiver;->Companion:Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    invoke-virtual {v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->getPersistentId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;->removeDeviceLocationProvider$common_release(I)V

    return-void
.end method

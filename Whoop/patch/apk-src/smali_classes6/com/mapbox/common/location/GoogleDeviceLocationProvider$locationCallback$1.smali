.class public final Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;
.super Ltp/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/location/GoogleDeviceLocationProvider;-><init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V
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
        "com/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1",
        "Ltp/g;",
        "Lcom/google/android/gms/location/LocationResult;",
        "result",
        "Ll83/a0;",
        "onLocationResult",
        "(Lcom/google/android/gms/location/LocationResult;)V",
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
.field final synthetic this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;->this$0:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    iget-object p1, p1, Lcom/google/android/gms/location/LocationResult;->w:Ljava/util/List;

    const-string v1, "result.locations"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/Location;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/mapbox/common/location/LocationServiceUtils;->toCommonLocation(Landroid/location/Location;)Lcom/mapbox/common/location/Location;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->notifyLocationUpdate(Ljava/util/List;)V

    return-void
.end method

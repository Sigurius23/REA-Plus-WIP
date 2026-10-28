.class public final synthetic Lcom/mapbox/common/location/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/e;


# instance fields
.field public final synthetic w:Lcom/mapbox/common/location/PermissionStatus;

.field public final synthetic x:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

.field public final synthetic y:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/location/b;->w:Lcom/mapbox/common/location/PermissionStatus;

    iput-object p2, p0, Lcom/mapbox/common/location/b;->x:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    iput-object p3, p0, Lcom/mapbox/common/location/b;->y:Lkotlin/jvm/internal/g0;

    return-void
.end method


# virtual methods
.method public final n(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/common/location/b;->x:Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    iget-object v1, p0, Lcom/mapbox/common/location/b;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lcom/mapbox/common/location/b;->w:Lcom/mapbox/common/location/PermissionStatus;

    invoke-static {v2, v0, v1, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->b(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;Ljava/lang/Exception;)V

    return-void
.end method

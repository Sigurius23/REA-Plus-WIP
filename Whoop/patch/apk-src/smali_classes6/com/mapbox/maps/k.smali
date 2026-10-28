.class public final synthetic Lcom/mapbox/maps/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/bindgen/Expected$Transformer;


# instance fields
.field public final synthetic E:Ljava/lang/Double;

.field public final synthetic F:Lcom/mapbox/maps/ScreenCoordinate;

.field public final synthetic G:Lcom/mapbox/maps/MapboxMap;

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lcom/mapbox/maps/CameraOptions;

.field public final synthetic z:Lcom/mapbox/maps/EdgeInsets;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/MapboxMap;I)V
    .locals 0

    iput p7, p0, Lcom/mapbox/maps/k;->w:I

    iput-object p1, p0, Lcom/mapbox/maps/k;->x:Ljava/util/List;

    iput-object p2, p0, Lcom/mapbox/maps/k;->y:Lcom/mapbox/maps/CameraOptions;

    iput-object p3, p0, Lcom/mapbox/maps/k;->z:Lcom/mapbox/maps/EdgeInsets;

    iput-object p4, p0, Lcom/mapbox/maps/k;->E:Ljava/lang/Double;

    iput-object p5, p0, Lcom/mapbox/maps/k;->F:Lcom/mapbox/maps/ScreenCoordinate;

    iput-object p6, p0, Lcom/mapbox/maps/k;->G:Lcom/mapbox/maps/MapboxMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcom/mapbox/maps/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v6, p0, Lcom/mapbox/maps/k;->G:Lcom/mapbox/maps/MapboxMap;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object v1, p0, Lcom/mapbox/maps/k;->x:Ljava/util/List;

    iget-object v2, p0, Lcom/mapbox/maps/k;->y:Lcom/mapbox/maps/CameraOptions;

    iget-object v3, p0, Lcom/mapbox/maps/k;->z:Lcom/mapbox/maps/EdgeInsets;

    iget-object v4, p0, Lcom/mapbox/maps/k;->E:Ljava/lang/Double;

    iget-object v5, p0, Lcom/mapbox/maps/k;->F:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/MapboxMap;->e(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v5, p0, Lcom/mapbox/maps/k;->G:Lcom/mapbox/maps/MapboxMap;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lcom/mapbox/maps/k;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/mapbox/maps/k;->y:Lcom/mapbox/maps/CameraOptions;

    iget-object v2, p0, Lcom/mapbox/maps/k;->z:Lcom/mapbox/maps/EdgeInsets;

    iget-object v3, p0, Lcom/mapbox/maps/k;->E:Ljava/lang/Double;

    iget-object v4, p0, Lcom/mapbox/maps/k;->F:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-static/range {v0 .. v6}, Lcom/mapbox/maps/MapboxMap$cameraForCoordinates$3;->a(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

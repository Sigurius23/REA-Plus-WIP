.class public final Lcom/mapbox/maps/CustomLayerRenderParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final bearing:D

.field private final elevationData:Lcom/mapbox/maps/ElevationData;

.field private final fieldOfView:D

.field private final height:D

.field private final latitude:D

.field private final longitude:D

.field private final pitch:D

.field private final projection:Lcom/mapbox/maps/CustomLayerMapProjection;

.field private final projectionMatrix:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final renderToTilesIDs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ">;"
        }
    .end annotation
.end field

.field private final width:D

.field private final zoom:D


# direct methods
.method public constructor <init>(DDDDDDDDLjava/util/List;Lcom/mapbox/maps/ElevationData;Lcom/mapbox/maps/CustomLayerMapProjection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDDDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/mapbox/maps/ElevationData;",
            "Lcom/mapbox/maps/CustomLayerMapProjection;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    .line 16
    iput-wide p3, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    .line 17
    iput-wide p5, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    .line 18
    iput-wide p7, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    .line 19
    iput-wide p9, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    .line 20
    iput-wide p11, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    .line 21
    iput-wide p13, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    move-wide p1, p15

    .line 22
    iput-wide p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    move-object/from16 p1, p17

    .line 23
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    move-object/from16 p1, p18

    .line 24
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    move-object/from16 p1, p19

    .line 26
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    return-void
.end method

.method private constructor <init>(DDDDDDDDLjava/util/List;Lcom/mapbox/maps/ElevationData;Ljava/util/List;Lcom/mapbox/maps/CustomLayerMapProjection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDDDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/mapbox/maps/ElevationData;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ">;",
            "Lcom/mapbox/maps/CustomLayerMapProjection;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    .line 3
    iput-wide p3, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    .line 4
    iput-wide p5, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    .line 5
    iput-wide p7, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    .line 6
    iput-wide p9, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    .line 7
    iput-wide p11, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    .line 8
    iput-wide p13, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    move-wide p1, p15

    .line 9
    iput-wide p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    move-object/from16 p1, p17

    .line 10
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    move-object/from16 p1, p18

    .line 11
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    move-object/from16 p1, p19

    .line 12
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    move-object/from16 p1, p20

    .line 13
    iput-object p1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_e

    const-class v2, Lcom/mapbox/maps/CustomLayerRenderParameters;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcom/mapbox/maps/CustomLayerRenderParameters;

    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    iget-wide v4, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    iget-object v3, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    iget-object v3, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    iget-object v3, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-object v2, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    iget-object p1, p1, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v1

    :cond_d
    return v0

    :cond_e
    :goto_0
    return v1
.end method

.method public getBearing()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    return-wide v0
.end method

.method public getElevationData()Lcom/mapbox/maps/ElevationData;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    return-object v0
.end method

.method public getFieldOfView()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    return-wide v0
.end method

.method public getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    return-wide v0
.end method

.method public getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    return-wide v0
.end method

.method public getPitch()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    return-wide v0
.end method

.method public getProjection()Lcom/mapbox/maps/CustomLayerMapProjection;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    return-object v0
.end method

.method public getProjectionMatrix()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    return-object v0
.end method

.method public getRenderToTilesIDs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    return-object v0
.end method

.method public getWidth()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    return-wide v0
.end method

.method public getZoom()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 14

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    iget-wide v0, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    iget-object v10, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    iget-object v11, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    iget-object v12, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    iget-object v13, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    filled-new-array/range {v2 .. v13}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[width: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->width:D

    const-string v3, ", height: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->height:D

    const-string v3, ", latitude: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->latitude:D

    const-string v3, ", longitude: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->longitude:D

    const-string v3, ", zoom: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->zoom:D

    const-string v3, ", bearing: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->bearing:D

    const-string v3, ", pitch: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->pitch:D

    const-string v3, ", fieldOfView: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->fieldOfView:D

    const-string v3, ", projectionMatrix: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projectionMatrix:Ljava/util/List;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", elevationData: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->elevationData:Lcom/mapbox/maps/ElevationData;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", renderToTilesIDs: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->renderToTilesIDs:Ljava/util/List;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", projection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/CustomLayerRenderParameters;->projection:Lcom/mapbox/maps/CustomLayerMapProjection;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

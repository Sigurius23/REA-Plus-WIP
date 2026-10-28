.class public final synthetic Lgv/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgv/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move/from16 v0, p1

    move-object/from16 v1, p0

    iget v2, v1, Lgv/j;->a:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    float-to-double v6, v0

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    sub-double/2addr v8, v2

    mul-double/2addr v8, v6

    add-double/2addr v8, v4

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_0
    move-object/from16 v2, p2

    check-cast v2, Lcom/mapbox/geojson/Point;

    move-object/from16 v3, p3

    check-cast v3, Lcom/mapbox/geojson/Point;

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v4

    float-to-double v6, v0

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v10

    sub-double/2addr v8, v10

    mul-double/2addr v8, v6

    add-double v10, v8, v4

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v4

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v12

    sub-double/2addr v8, v12

    mul-double/2addr v8, v6

    add-double v12, v8, v4

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->hasAltitude()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->hasAltitude()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->altitude()D

    move-result-wide v4

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->altitude()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->altitude()D

    move-result-wide v2

    sub-double/2addr v8, v2

    mul-double/2addr v8, v6

    add-double v14, v8, v4

    invoke-static/range {v10 .. v15}, Lcom/mapbox/geojson/Point;->fromLngLat(DDD)Lcom/mapbox/geojson/Point;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v10, v11, v12, v13}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    move-object/from16 v2, p2

    check-cast v2, Lcom/mapbox/maps/ScreenCoordinate;

    move-object/from16 v3, p3

    check-cast v3, Lcom/mapbox/maps/ScreenCoordinate;

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v4, v0, v4

    if-nez v4, :cond_1

    :goto_1
    move-object v2, v3

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    cmpg-float v4, v0, v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v4

    invoke-virtual {v2}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v6

    sub-double/2addr v4, v6

    invoke-virtual {v3}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v6

    invoke-virtual {v2}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v8

    sub-double/2addr v6, v8

    const-wide/16 v8, 0x0

    cmpg-double v3, v4, v8

    if-nez v3, :cond_3

    cmpg-double v3, v6, v8

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v3, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v2}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v8

    float-to-double v10, v0

    mul-double/2addr v4, v10

    add-double/2addr v4, v8

    invoke-virtual {v2}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v8

    mul-double/2addr v10, v6

    add-double/2addr v10, v8

    invoke-direct {v3, v4, v5, v10, v11}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    goto :goto_1

    :goto_2
    return-object v2

    :pswitch_2
    move-object/from16 v2, p2

    check-cast v2, Lcom/mapbox/maps/EdgeInsets;

    move-object/from16 v3, p3

    check-cast v3, Lcom/mapbox/maps/EdgeInsets;

    sget-object v4, Lgv/k;->c:Lcom/mapbox/maps/EdgeInsets;

    const/16 v5, 0x29

    const-string v6, "Mbgl-CameraManager"

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "End edge insets are null (fraction: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v4

    :goto_3
    const/high16 v7, 0x3f800000    # 1.0f

    cmpg-float v7, v0, v7

    if-nez v7, :cond_5

    goto/16 :goto_6

    :cond_5
    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "Start edge insets are null (fraction: "

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v4

    :goto_4
    const/4 v4, 0x0

    cmpg-float v4, v0, v4

    if-nez v4, :cond_7

    :goto_5
    move-object v3, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v4

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v6

    sub-double/2addr v4, v6

    invoke-virtual {v3}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v6

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v8

    sub-double/2addr v6, v8

    invoke-virtual {v3}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v10

    sub-double/2addr v8, v10

    invoke-virtual {v3}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v10

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v12

    sub-double/2addr v10, v12

    const-wide/16 v12, 0x0

    cmpg-double v3, v4, v12

    if-nez v3, :cond_8

    cmpg-double v3, v6, v12

    if-nez v3, :cond_8

    cmpg-double v3, v8, v12

    if-nez v3, :cond_8

    cmpg-double v3, v10, v12

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    new-instance v12, Lcom/mapbox/maps/EdgeInsets;

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v13

    float-to-double v0, v0

    mul-double/2addr v4, v0

    add-double/2addr v13, v4

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v3

    mul-double/2addr v6, v0

    add-double v15, v6, v3

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v3

    mul-double/2addr v8, v0

    add-double v17, v8, v3

    invoke-virtual {v2}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v2

    mul-double/2addr v0, v10

    add-double v19, v0, v2

    invoke-direct/range {v12 .. v20}, Lcom/mapbox/maps/EdgeInsets;-><init>(DDDD)V

    move-object v3, v12

    :goto_6
    return-object v3

    :pswitch_3
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Double;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v3, v0, v3

    if-nez v3, :cond_9

    move-object v1, v2

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    cmpg-float v3, v0, v3

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-string v4, "startValue"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    cmpg-double v4, v2, v4

    if-nez v4, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    float-to-double v0, v0

    mul-double/2addr v0, v2

    add-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_7
    return-object v1

    :pswitch_4
    move-object/from16 v1, p2

    check-cast v1, Lcom/mapbox/geojson/Point;

    move-object/from16 v2, p3

    check-cast v2, Lcom/mapbox/geojson/Point;

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v3, v0, v3

    if-nez v3, :cond_c

    move-object v1, v2

    goto :goto_8

    :cond_c
    const/4 v3, 0x0

    cmpg-float v3, v0, v3

    if-nez v3, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v3

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v5

    sub-double/2addr v3, v5

    invoke-virtual {v2}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v5

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v7

    sub-double/2addr v5, v7

    const-wide/16 v7, 0x0

    cmpg-double v2, v3, v7

    if-nez v2, :cond_e

    cmpg-double v2, v5, v7

    if-nez v2, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v7

    float-to-double v9, v0

    mul-double/2addr v3, v9

    add-double/2addr v3, v7

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v0

    mul-double/2addr v9, v5

    add-double/2addr v9, v0

    invoke-static {v3, v4, v9, v10}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object v1

    :goto_8
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

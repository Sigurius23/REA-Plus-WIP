.class public final Lrv/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/p;


# instance fields
.field public final E:Lrv/o;

.field public final F:Lq30/w0;

.field public final w:Lev/d;

.field public x:Lcom/mapbox/maps/MapboxStyleManager;

.field public y:Lcom/mapbox/geojson/Point;

.field public z:D


# direct methods
.method public constructor <init>(Lev/d;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "locationModelLayerOptions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lrv/s;->w:Lev/d;

    iget-object v3, v1, Lev/d;->z:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v3, v1, Lev/d;->G:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v3, v1, Lev/d;->N:Ljava/lang/String;

    const-string v8, "Error in parsing expression."

    const-string v9, "fromJson(it)"

    if-eqz v3, :cond_4

    invoke-static {v3}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_3

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Lcom/mapbox/bindgen/Value;

    goto :goto_2

    :cond_2
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v8}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v10}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const/4 v3, 0x0

    :goto_2
    iget-object v10, v1, Lev/d;->F:Ljava/util/List;

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v10, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-boolean v10, v1, Lev/d;->H:Z

    iget-boolean v12, v1, Lev/d;->I:Z

    iget v13, v1, Lev/d;->y:F

    float-to-double v13, v13

    iget-object v15, v1, Lev/d;->M:Ljava/lang/String;

    if-eqz v15, :cond_8

    invoke-static {v15}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v15

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_7

    invoke-virtual {v15}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_6

    check-cast v7, Lcom/mapbox/bindgen/Value;

    goto :goto_4

    :cond_6
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v8}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v7}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    const/4 v7, 0x0

    :goto_4
    iget v15, v1, Lev/d;->J:I

    iget v5, v1, Lev/d;->K:F

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    float-to-double v2, v5

    iget-object v5, v1, Lev/d;->L:Ljava/lang/String;

    if-eqz v5, :cond_b

    invoke-static {v5}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v5

    move-object/from16 v5, v20

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_a

    invoke-virtual/range {v21 .. v21}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_9

    check-cast v5, Lcom/mapbox/bindgen/Value;

    move-object/from16 v20, v5

    goto :goto_5

    :cond_9
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v8}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v5}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    const/16 v20, 0x0

    :goto_5
    iget v5, v1, Lev/d;->O:I

    move-object/from16 v21, v7

    iget-object v7, v1, Lev/d;->P:Ljava/lang/String;

    if-eqz v7, :cond_e

    invoke-static {v7}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v7

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v7

    move-object/from16 v7, v22

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_d

    invoke-virtual/range {v23 .. v23}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_c

    check-cast v7, Lcom/mapbox/bindgen/Value;

    move-object/from16 v22, v7

    goto :goto_6

    :cond_c
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v8}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v7}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    const/16 v22, 0x0

    :goto_6
    iget v7, v1, Lev/d;->Q:F

    move-wide/from16 v23, v2

    float-to-double v2, v7

    iget-object v7, v1, Lev/d;->R:Ljava/lang/String;

    if-eqz v7, :cond_11

    invoke-static {v7}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v7

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_10

    invoke-virtual {v7}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_f

    check-cast v7, Lcom/mapbox/bindgen/Value;

    goto :goto_7

    :cond_f
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v8}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {v1, v9}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    const/4 v7, 0x0

    :goto_7
    iget v1, v1, Lev/d;->U:I

    new-instance v8, Lrv/o;

    const-string v9, "modelScaleMode"

    invoke-static {v15, v9}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v9, "modelElevationReference"

    invoke-static {v1, v9}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v9, "mapbox-location-model-layer"

    invoke-direct {v8, v9}, Lrv/o;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v7

    new-instance v7, Lcom/mapbox/bindgen/Value;

    invoke-direct {v7, v9}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v9, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v0, "id"

    invoke-virtual {v9, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const-string v7, "model"

    invoke-direct {v0, v7}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v9, v8, Lrv/o;->b:Ljava/util/HashMap;

    move-object/from16 p1, v7

    const-string v7, "type"

    invoke-virtual {v9, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const-string v9, "mapbox-location-model-source"

    invoke-direct {v0, v9}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v9, v8, Lrv/o;->b:Ljava/util/HashMap;

    move-object/from16 v25, v7

    const-string v7, "source"

    invoke-virtual {v9, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const-string v7, "location-indicator"

    invoke-direct {v0, v7}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v7, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v9, "model-type"

    invoke-virtual {v7, v9, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    move-wide/from16 v26, v2

    move v3, v1

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    new-instance v7, Lcom/mapbox/bindgen/Value;

    invoke-direct {v7, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    move-wide/from16 v2, v26

    goto :goto_8

    :cond_12
    move-wide/from16 v26, v2

    move v3, v1

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-scale"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v19, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v6, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v6, v7}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_13
    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    goto :goto_a

    :cond_14
    move-object/from16 v1, v19

    :goto_a
    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-rotation"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v11, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v6, v7}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-translation"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    invoke-direct {v0, v10}, Lcom/mapbox/bindgen/Value;-><init>(Z)V

    iget-object v1, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-cast-shadows"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    invoke-direct {v0, v12}, Lcom/mapbox/bindgen/Value;-><init>(Z)V

    iget-object v1, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-receive-shadows"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v21, :cond_16

    new-instance v7, Lcom/mapbox/bindgen/Value;

    invoke-direct {v7, v13, v14}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    goto :goto_c

    :cond_16
    move-object/from16 v7, v21

    :goto_c
    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v1, "model-opacity"

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const/4 v1, 0x1

    if-eq v15, v1, :cond_18

    const/4 v1, 0x2

    if-ne v15, v1, :cond_17

    const-string v1, "viewport"

    goto :goto_d

    :cond_17
    const/4 v0, 0x0

    throw v0

    :cond_18
    const-string v1, "map"

    :goto_d
    invoke-direct {v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v1, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-scale-mode"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "model-scale-transition"

    invoke-static {}, Lrv/o;->c()Lcom/mapbox/bindgen/Value;

    move-result-object v1

    iget-object v2, v8, Lrv/o;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "model-rotation-transition"

    invoke-static {}, Lrv/o;->c()Lcom/mapbox/bindgen/Value;

    move-result-object v1

    iget-object v2, v8, Lrv/o;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v20, :cond_19

    new-instance v0, Lcom/mapbox/bindgen/Value;

    move-wide/from16 v1, v23

    invoke-direct {v0, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    goto :goto_e

    :cond_19
    move-object/from16 v0, v20

    :goto_e
    iget-object v1, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-emissive-strength"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v22, :cond_1a

    shr-int/lit8 v0, v5, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-double v0, v0

    const-wide v6, 0x406fe00000000000L    # 255.0

    div-double/2addr v0, v6

    new-instance v2, Ldv/a;

    invoke-direct {v2, v5, v0, v1}, Ldv/a;-><init>(ID)V

    new-instance v0, Lvu/a;

    const-string v1, "rgba"

    invoke-direct {v0, v1}, Lvu/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ldv/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lvu/a;->b()Lvu/d;

    move-result-object v7

    goto :goto_f

    :cond_1a
    move-object/from16 v7, v22

    :goto_f
    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v1, "model-color"

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v17, :cond_1b

    new-instance v7, Lcom/mapbox/bindgen/Value;

    move-wide/from16 v0, v26

    invoke-direct {v7, v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    goto :goto_10

    :cond_1b
    move-object/from16 v7, v17

    :goto_10
    iget-object v0, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v1, "model-color-mix-intensity"

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const/4 v1, 0x1

    if-eq v3, v1, :cond_1d

    const/4 v1, 0x2

    if-ne v3, v1, :cond_1c

    const-string v1, "ground"

    goto :goto_11

    :cond_1c
    const/4 v0, 0x0

    throw v0

    :cond_1d
    const-string v1, "sea"

    :goto_11
    invoke-direct {v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v1, v8, Lrv/o;->b:Ljava/util/HashMap;

    const-string v2, "model-elevation-reference"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iput-object v8, v0, Lrv/s;->E:Lrv/o;

    iget-object v1, v0, Lrv/s;->w:Lev/d;

    move-object/from16 v2, v18

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lev/d;->w:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_23

    iget-object v3, v1, Lev/d;->x:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1e
    iget-object v3, v1, Lev/d;->S:Ljava/util/List;

    iget-object v1, v1, Lev/d;->T:Ljava/util/List;

    new-instance v5, Lq30/w0;

    const-wide/16 v6, 0x0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-string v7, "url"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "materialOverrides"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "nodeOverrides"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-direct {v5, v9, v10}, Lq30/w0;-><init>(IB)V

    iput-object v2, v5, Lq30/w0;->x:Ljava/lang/Object;

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    iput-object v9, v5, Lq30/w0;->y:Ljava/lang/Object;

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    new-instance v10, Lcom/mapbox/bindgen/Value;

    invoke-direct {v10, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "uri"

    invoke-virtual {v9, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v4, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    new-instance v12, Lcom/mapbox/bindgen/Value;

    invoke-direct {v12, v10, v11}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1f
    new-instance v4, Lcom/mapbox/bindgen/Value;

    invoke-direct {v4, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string v2, "position"

    invoke-virtual {v9, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    filled-new-array {v6, v6, v6}, [Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    new-instance v6, Lcom/mapbox/bindgen/Value;

    invoke-direct {v6, v10, v11}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_20
    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v4}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string v4, "orientation"

    invoke-virtual {v9, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v3, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v6, Lcom/mapbox/bindgen/Value;

    invoke-direct {v6, v4}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_21
    new-instance v3, Lcom/mapbox/bindgen/Value;

    invoke-direct {v3, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    invoke-virtual {v9, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lcom/mapbox/bindgen/Value;

    invoke-direct {v4, v3}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_22
    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    invoke-virtual {v9, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v9}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    const-string v3, "defaultModel"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    new-instance v3, Lcom/mapbox/bindgen/Value;

    move-object/from16 v4, p1

    invoke-direct {v3, v4}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    move-object/from16 v4, v25

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    new-instance v3, Lcom/mapbox/bindgen/Value;

    invoke-direct {v3, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    const-string v1, "models"

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v5, v0, Lrv/s;->F:Lq30/w0;

    return-void

    :cond_23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Model Url must not be empty!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final C(Lq30/w0;)V
    .locals 1

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {p1, v0}, Lq30/w0;->b(Lrv/o;)V

    return-void
.end method

.method public final E(II)V
    .locals 0

    return-void
.end method

.method public final K(Lcom/mapbox/bindgen/Value;)V
    .locals 2

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "model-scale"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public final T(Lcom/mapbox/geojson/Point;)V
    .locals 1

    const-string v0, "latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrv/s;->y:Lcom/mapbox/geojson/Point;

    invoke-virtual {p0}, Lrv/s;->a()V

    return-void
.end method

.method public final V(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, p1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string p1, "slot"

    invoke-virtual {v0, p1, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lrv/s;->E:Lrv/o;

    iget-object v1, v1, Lrv/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_0
    iget-object v0, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrv/s;->F:Lq30/w0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "mapbox-location-model-source"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_1
    return-void
.end method

.method public final Y(Lcom/mapbox/maps/MapboxStyleManager;)V
    .locals 3

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v0, p0, Lrv/s;->F:Lq30/w0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    const-string v2, "mapbox-location-model-source"

    invoke-virtual {p1, v2, v1}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v1, "Mbgl-ModelSourceWrapper"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/mapbox/maps/MapboxLocationComponentException;

    const-string v1, "Add source failed: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z(Lcom/mapbox/maps/Style;)V
    .locals 1

    iput-object p1, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lrv/o;->c:Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v0, p0, Lrv/s;->F:Lq30/w0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public final a()V
    .locals 8

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lrv/s;->y:Lcom/mapbox/geojson/Point;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-wide v2, p0, Lrv/s;->z:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    filled-new-array {v0, v0, v2}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lrv/s;->F:Lq30/w0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    new-instance v7, Lcom/mapbox/bindgen/Value;

    invoke-direct {v7, v5, v6}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v3}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    new-instance v3, Ll83/k;

    const-string v5, "position"

    invoke-direct {v3, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    new-instance v6, Lcom/mapbox/bindgen/Value;

    invoke-direct {v6, v4, v5}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/mapbox/bindgen/Value;

    invoke-direct {v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    new-instance v1, Ll83/k;

    const-string v4, "orientation"

    invoke-direct {v1, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/mapbox/bindgen/Value;

    iget-object v4, v2, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0, v4}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    new-instance v4, Ll83/k;

    const-string v5, "uri"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v1, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    new-instance v0, Ll83/k;

    const-string v3, "defaultModel"

    invoke-direct {v0, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    iget-object v0, v2, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-string v3, "models"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v2, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_2

    const-string v2, "mapbox-location-model-source"

    invoke-virtual {v0, v2, v3, v1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Set source property \"models\" failed:\nError: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nValue set: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Mbgl-ModelSourceWrapper"

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final b0()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-string v2, "visible"

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "visibility"

    invoke-virtual {v0, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public final d0(F)V
    .locals 0

    return-void
.end method

.method public final f()Z
    .locals 3

    iget-object v0, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "mapbox-location-model-layer"

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/MapboxStyleManager;->styleLayerExists(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lrv/s;->x:Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_1

    const-string v2, "mapbox-location-model-source"

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/MapboxStyleManager;->styleSourceExists(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final f0()V
    .locals 3

    iget-object v0, p0, Lrv/s;->E:Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-string v2, "none"

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "visibility"

    invoke-virtual {v0, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public final l(IFLjava/lang/Float;)V
    .locals 0

    return-void
.end method

.method public final n(D)V
    .locals 0

    iput-wide p1, p0, Lrv/s;->z:D

    invoke-virtual {p0}, Lrv/s;->a()V

    return-void
.end method

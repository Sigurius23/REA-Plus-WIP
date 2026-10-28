.class public final Lfv/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/q3;

.field public final synthetic y:Landroid/animation/Animator;


# direct methods
.method public synthetic constructor <init>(Lb30/q3;Landroid/animation/Animator;I)V
    .locals 0

    iput p3, p0, Lfv/e;->w:I

    iput-object p1, p0, Lfv/e;->x:Lb30/q3;

    iput-object p2, p0, Lfv/e;->y:Landroid/animation/Animator;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lfv/e;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, v0, Lfv/e;->y:Landroid/animation/Animator;

    iget-object v5, v0, Lfv/e;->x:Lb30/q3;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    packed-switch v1, :pswitch_data_0

    instance-of v1, v4, Lgv/d;

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    check-cast v4, Lgv/d;

    goto :goto_0

    :cond_0
    move-object v4, v7

    :goto_0
    if-eqz v4, :cond_2d

    iget-object v1, v5, Lb30/q3;->b:Ljava/lang/Object;

    check-cast v1, Lfv/h;

    iget-boolean v5, v4, Lgv/d;->J:Z

    if-eqz v5, :cond_1

    goto/16 :goto_14

    :cond_1
    sget-object v5, Lfv/h;->W:[Lj93/z;

    iget-object v5, v1, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v8, v4, Lgv/d;->z:[Ljava/lang/Object;

    array-length v9, v8

    if-nez v9, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Skipped animation "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with no targets!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Mbgl-CameraManager"

    invoke-static {v2, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_2
    iget-object v9, v4, Lgv/d;->y:Ljava/lang/Object;

    const/4 v10, 0x4

    const/4 v11, 0x5

    const/4 v12, 0x3

    if-nez v9, :cond_e

    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    const-string v13, "mapCameraManagerDelegate"

    if-eqz v9, :cond_c

    if-eq v9, v3, :cond_a

    if-eq v9, v2, :cond_8

    if-eq v9, v12, :cond_6

    if-eq v9, v10, :cond_5

    if-ne v9, v11, :cond_4

    iget-object v9, v1, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_3

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v9

    const-string v13, "mapCameraManagerDelegate.cameraState.padding"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    new-instance v9, Lcom/mapbox/maps/ScreenCoordinate;

    const-wide/16 v13, 0x0

    invoke-direct {v9, v13, v14, v13, v14}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    goto :goto_1

    :cond_6
    iget-object v9, v1, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_7

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    goto :goto_1

    :cond_7
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_8
    iget-object v9, v1, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_9

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    goto :goto_1

    :cond_9
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_a
    iget-object v9, v1, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_b

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    goto :goto_1

    :cond_b
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_c
    iget-object v9, v1, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_d

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v9

    const-string v13, "mapCameraManagerDelegate.cameraState.center"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_d
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_e
    :goto_1
    instance-of v13, v4, Lgv/e;

    const/4 v14, 0x0

    if-eqz v13, :cond_11

    move-object v13, v4

    check-cast v13, Lgv/e;

    iget-object v15, v13, Lgv/d;->z:[Ljava/lang/Object;

    iget-boolean v13, v13, Lgv/e;->M:Z

    if-eqz v13, :cond_11

    sget-object v8, Lcom/mapbox/maps/util/MathUtils;->INSTANCE:Lcom/mapbox/maps/util/MathUtils;

    array-length v13, v15

    add-int/2addr v13, v3

    move-object/from16 v16, v7

    new-array v7, v13, [D

    move v11, v14

    :goto_2
    if-ge v11, v13, :cond_10

    if-nez v11, :cond_f

    move-object/from16 v18, v9

    check-cast v18, Ljava/lang/Double;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    goto :goto_3

    :cond_f
    move-object/from16 v18, v15

    check-cast v18, [Ljava/lang/Double;

    add-int/lit8 v19, v11, -0x1

    aget-object v18, v18, v19

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    :goto_3
    aput-wide v18, v7, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_10
    invoke-virtual {v8, v7}, Lcom/mapbox/maps/util/MathUtils;->prepareOptimalBearingPath([D)[D

    move-result-object v7

    invoke-static {v7}, Lm83/n;->c1([D)[Ljava/lang/Double;

    move-result-object v7

    goto/16 :goto_8

    :cond_11
    move-object/from16 v16, v7

    instance-of v7, v4, Lgv/f;

    if-eqz v7, :cond_15

    move-object v7, v4

    check-cast v7, Lgv/f;

    iget-boolean v11, v7, Lgv/f;->M:Z

    if-eqz v11, :cond_15

    check-cast v9, Lcom/mapbox/geojson/Point;

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    iget-object v7, v7, Lgv/d;->z:[Ljava/lang/Object;

    invoke-static {v8, v7}, Lm83/s;->h1(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/mapbox/geojson/Point;

    invoke-static {v11}, Lx30/s0;->M(Lcom/mapbox/geojson/Point;)Lcom/mapbox/geojson/Point;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_12
    invoke-static {v9}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/mapbox/geojson/Point;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_13
    invoke-static {v8}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/mapbox/geojson/Point;

    invoke-static {v9, v11}, Lx30/s0;->J(Lcom/mapbox/geojson/Point;Lcom/mapbox/geojson/Point;)Lcom/mapbox/geojson/Point;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_14
    invoke-static {v8}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    new-array v8, v14, [Lcom/mapbox/geojson/Point;

    invoke-interface {v7, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :cond_15
    array-length v7, v8

    add-int/2addr v7, v3

    new-array v11, v7, [Ljava/lang/Object;

    move v13, v14

    :goto_6
    if-ge v13, v7, :cond_17

    if-nez v13, :cond_16

    move-object v15, v9

    goto :goto_7

    :cond_16
    add-int/lit8 v15, v13, -0x1

    aget-object v15, v8, v15

    :goto_7
    aput-object v15, v11, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_17
    move-object v7, v11

    :goto_8
    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_20

    if-eq v8, v3, :cond_1e

    if-eq v8, v2, :cond_1c

    if-eq v8, v12, :cond_1a

    if-eq v8, v10, :cond_21

    const/4 v9, 0x5

    if-ne v8, v9, :cond_19

    array-length v8, v7

    move v9, v14

    :goto_9
    if-ge v9, v8, :cond_2c

    aget-object v10, v7, v9

    iget-object v11, v1, Lfv/h;->M:Lfv/f;

    sget-object v12, Lfv/h;->W:[Lj93/z;

    aget-object v12, v12, v2

    invoke-interface {v11, v1, v12}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/mapbox/maps/EdgeInsets;

    invoke-static {v11, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    goto/16 :goto_e

    :cond_18
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_19
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1a
    array-length v2, v7

    move v8, v14

    :goto_a
    if-ge v8, v2, :cond_2c

    aget-object v9, v7, v8

    iget-object v10, v1, Lfv/h;->P:Lfv/f;

    sget-object v11, Lfv/h;->W:[Lj93/z;

    const/16 v17, 0x5

    aget-object v11, v11, v17

    invoke-interface {v10, v1, v11}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    invoke-static {v10, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    goto :goto_e

    :cond_1b
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_1c
    array-length v2, v7

    move v8, v14

    :goto_b
    if-ge v8, v2, :cond_2c

    aget-object v9, v7, v8

    iget-object v11, v1, Lfv/h;->O:Lfv/f;

    sget-object v12, Lfv/h;->W:[Lj93/z;

    aget-object v12, v12, v10

    invoke-interface {v11, v1, v12}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Double;

    invoke-static {v11, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1d

    goto :goto_e

    :cond_1d
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_1e
    array-length v2, v7

    move v8, v14

    :goto_c
    if-ge v8, v2, :cond_2c

    aget-object v9, v7, v8

    iget-object v10, v1, Lfv/h;->L:Lfv/f;

    sget-object v11, Lfv/h;->W:[Lj93/z;

    aget-object v11, v11, v3

    invoke-interface {v10, v1, v11}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    invoke-static {v10, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    goto :goto_e

    :cond_1f
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    :cond_20
    array-length v2, v7

    move v8, v14

    :goto_d
    if-ge v8, v2, :cond_2c

    aget-object v9, v7, v8

    iget-object v10, v1, Lfv/h;->K:Lfv/f;

    sget-object v11, Lfv/h;->W:[Lj93/z;

    aget-object v11, v11, v14

    invoke-interface {v10, v1, v11}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/mapbox/geojson/Point;

    invoke-static {v10, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    :cond_21
    :goto_e
    array-length v2, v7

    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lgv/d;->setObjectValues([Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "type"

    if-eqz v7, :cond_24

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzv/a;

    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v9

    iget-object v10, v4, Lgv/d;->x:Ljava/lang/String;

    iget-object v7, v7, Lzv/a;->a:Lzv/b;

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "VIEWPORT_CAMERA_OWNER"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "Maps-Gestures"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    iget-object v8, v7, Lzv/b;->F:Law/a;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v7, Lzv/b;->E:Lzv/c;

    sget-object v9, Lzv/c;->a:Lzv/c;

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    iget-object v8, v7, Lzv/b;->E:Lzv/c;

    iput-object v9, v7, Lzv/b;->E:Lzv/c;

    iget-object v9, v7, Lzv/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_22

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_23

    iget-object v10, v7, Lzv/b;->w:Landroid/os/Handler;

    new-instance v11, Llr/e;

    const/16 v12, 0x1c

    invoke-direct {v11, v8, v12}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_f

    :cond_23
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_24
    iget-object v2, v1, Lfv/h;->T:Lcom/mapbox/maps/MapboxMap;

    if-eqz v2, :cond_2a

    invoke-interface {v2, v3}, Lmv/h;->setUserAnimationInProgress(Z)V

    new-instance v2, Ljava/util/HashSet;

    iget-object v7, v1, Lfv/h;->w:Ljava/util/HashSet;

    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_25
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgv/d;

    invoke-virtual {v7}, Lgv/d;->k()Lfv/j;

    move-result-object v9

    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v10

    if-ne v9, v10, :cond_25

    invoke-virtual {v7}, Landroid/animation/Animator;->isRunning()Z

    move-result v9

    if-eqz v9, :cond_25

    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_25

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_26

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lzv/a;

    invoke-virtual {v4}, Lgv/d;->k()Lfv/j;

    move-result-object v11

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_11

    :cond_26
    sget-object v9, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v10, Lfv/c;

    invoke-direct {v10, v7, v3}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v9, v10}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    goto :goto_10

    :cond_27
    sget-object v2, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    invoke-virtual {v2}, Lcom/mapbox/maps/threading/AnimationThreadController;->getUsingBackgroundThread()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-virtual {v4}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v2, v2, v7

    if-eqz v2, :cond_29

    :cond_28
    new-instance v2, Lfv/b;

    invoke-direct {v2, v14, v1, v4}, Lfv/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lgv/d;->j(Lfv/b;)V

    :cond_29
    move-object v7, v6

    goto :goto_13

    :cond_2a
    const-string v1, "mapTransformDelegate"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_2b
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_d

    :cond_2c
    :goto_12
    iput-boolean v3, v4, Lgv/d;->L:Z

    goto :goto_14

    :cond_2d
    move-object/from16 v16, v7

    :goto_13
    if-eqz v7, :cond_2e

    :goto_14
    return-object v6

    :cond_2e
    new-instance v1, Lcom/mapbox/maps/MapboxCameraAnimationException;

    const-string v2, "Could not start animation as it must be an instance of CameraAnimator and not null!"

    invoke-direct {v1, v2}, Lcom/mapbox/maps/MapboxCameraAnimationException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {v5, v4, v2}, Lb30/q3;->a(Lb30/q3;Landroid/animation/Animator;I)V

    return-object v6

    :pswitch_1
    invoke-static {v5, v4, v3}, Lb30/q3;->a(Lb30/q3;Landroid/animation/Animator;I)V

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

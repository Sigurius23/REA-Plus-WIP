.class public final synthetic Ljo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ljo/j;->w:I

    iput-object p1, p0, Ljo/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ljo/j;->w:I

    iget-object v5, v0, Ljo/j;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;

    invoke-static {v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_0
    check-cast v5, Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v5, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->E(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V

    return-void

    :pswitch_1
    check-cast v5, Lcom/whoop/community/presentation/ui/PillRadioGroup;

    invoke-static {v5, v1}, Lcom/whoop/community/presentation/ui/PillRadioGroup;->a(Lcom/whoop/community/presentation/ui/PillRadioGroup;Landroid/view/View;)V

    return-void

    :pswitch_2
    check-cast v5, Lcom/stripe/android/view/CardBrandView;

    iget-object v1, v5, Lcom/stripe/android/view/CardBrandView;->y:Landroid/widget/ListPopupWindow;

    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->show()V

    :goto_0
    return-void

    :pswitch_3
    check-cast v5, Lrq0/c1;

    invoke-static {v5, v1}, Lrq0/c1;->d(Lrq0/c1;Landroid/view/View;)V

    return-void

    :pswitch_4
    check-cast v5, Lcom/whoop/community/presentation/teams/e;

    invoke-static {v5, v1}, Lcom/whoop/community/presentation/teams/e;->S(Lcom/whoop/community/presentation/teams/e;Landroid/view/View;)V

    return-void

    :pswitch_5
    check-cast v5, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;

    invoke-static {v5, v1}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->H(Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;Landroid/view/View;)V

    return-void

    :pswitch_6
    check-cast v5, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v5, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V

    return-void

    :pswitch_7
    check-cast v5, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;

    sget v1, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->w:I

    invoke-interface {v5}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;->onUserAvatarClick()V

    return-void

    :pswitch_8
    check-cast v5, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;

    sget v1, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->w:I

    invoke-interface {v5}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;->onClick()V

    return-void

    :pswitch_9
    check-cast v5, Lcom/whoop/community/presentation/login/JoinTeamActivity;

    invoke-static {v5, v1}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->J(Lcom/whoop/community/presentation/login/JoinTeamActivity;Landroid/view/View;)V

    return-void

    :pswitch_a
    check-cast v5, Lo52/d0;

    invoke-static {v5, v1}, Lo52/d0;->P(Lo52/d0;Landroid/view/View;)V

    return-void

    :pswitch_b
    check-cast v5, Lo52/l;

    invoke-static {v5, v1}, Lo52/l;->F(Lo52/l;Landroid/view/View;)V

    return-void

    :pswitch_c
    check-cast v5, Lmp0/h0;

    invoke-static {v5, v1}, Lmp0/h0;->N(Lmp0/h0;Landroid/view/View;)V

    return-void

    :pswitch_d
    check-cast v5, Lkv/b;

    iget-object v1, v5, Lkv/b;->w:Lkv/d;

    if-eqz v1, :cond_15

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iget-object v7, v1, Lkv/d;->H:Llv/b;

    iget-boolean v7, v7, Llv/b;->K:Z

    if-eqz v7, :cond_15

    iget-object v7, v1, Lkv/d;->F:Lfv/a;

    const/4 v8, 0x0

    const-string v9, "Builder().bearing(DEFAULT_BEARING).build()"

    if-eqz v7, :cond_12

    new-instance v10, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v10}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v10, v2}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v9, 0x12c

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-instance v10, Lfv/p;

    const-string v11, "Maps-Compass"

    invoke-direct {v10, v11, v9, v8}, Lfv/p;-><init>(Ljava/lang/String;Ljava/lang/Long;Landroid/animation/TimeInterpolator;)V

    check-cast v7, Lfv/h;

    invoke-static {v2}, Lcom/mapbox/maps/util/CameraOptionsUtils;->isEmpty(Lcom/mapbox/maps/CameraOptions;)Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v2, "Mbgl-CameraManager"

    const-string v3, "No-op flyTo camera high-level animation as CameraOptions.isEmpty == true."

    invoke-static {v2, v3}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_e

    :cond_1
    iget-object v12, v7, Lfv/h;->U:Lfv/n;

    if-eqz v12, :cond_11

    sget-object v9, Lfv/n;->d:Lh8/a;

    iget-object v9, v12, Lfv/n;->a:Lcom/mapbox/maps/MapboxMap;

    iget-object v11, v12, Lfv/n;->b:Lcom/mapbox/maps/MapboxMap;

    iget-object v13, v12, Lfv/n;->c:Lcom/mapbox/maps/MapboxMap;

    invoke-interface {v13}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v14

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v15

    move-wide/from16 v16, v5

    const-string v5, "currentCameraState.padding"

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v5, v15

    :cond_2
    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v6

    :cond_3
    const/16 v26, 0x0

    const-string v3, "cameraOptions.center ?: currentCameraState.center"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lx30/s0;->M(Lcom/mapbox/geojson/Point;)Lcom/mapbox/geojson/Point;

    move-result-object v3

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions;->getZoom()Ljava/lang/Double;

    move-result-object v6

    if-nez v6, :cond_4

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    :cond_4
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v18

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions;->getBearing()Ljava/lang/Double;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    :cond_5
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v27

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v29

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions;->getPitch()Ljava/lang/Double;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v31

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v33

    move-object v2, v9

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v8

    move-object/from16 v35, v5

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v20

    sget-wide v22, Le93/a;->a:D

    div-double v36, v20, v22

    invoke-interface {v13}, Lmv/a;->getBounds()Lcom/mapbox/maps/CameraBounds;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/mapbox/maps/CameraBounds;->getMinZoom()D

    move-result-wide v20

    invoke-interface {v13}, Lmv/a;->getBounds()Lcom/mapbox/maps/CameraBounds;

    move-result-object v13

    invoke-virtual {v13}, Lcom/mapbox/maps/CameraBounds;->getMaxZoom()D

    move-result-wide v22

    invoke-static/range {v18 .. v23}, Le93/b;->l(DDD)D

    move-result-wide v38

    invoke-virtual {v14}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v13

    const-string v14, "currentCameraState.center"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13}, Lx30/s0;->M(Lcom/mapbox/geojson/Point;)Lcom/mapbox/geojson/Point;

    move-result-object v13

    invoke-static {v13, v3}, Lx30/s0;->J(Lcom/mapbox/geojson/Point;Lcom/mapbox/geojson/Point;)Lcom/mapbox/geojson/Point;

    move-result-object v13

    move-object v14, v15

    invoke-interface {v11, v13, v8, v9}, Lmv/g;->project(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;

    move-result-object v15

    invoke-interface {v11, v3, v8, v9}, Lmv/g;->project(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;

    move-result-object v11

    invoke-interface {v2}, Lmv/h;->getSize()Lcom/mapbox/maps/Size;

    move-result-object v18

    invoke-interface {v2}, Lmv/h;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/maps/MapOptions;->getPixelRatio()F

    move-result v2

    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getWidth()F

    move-result v6

    float-to-double v4, v6

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v21

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v23

    add-double v23, v23, v21

    cmpg-double v4, v4, v23

    if-nez v4, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getHeight()F

    move-result v4

    float-to-double v4, v4

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v21

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v23

    add-double v23, v23, v21

    cmpg-double v4, v4, v23

    if-nez v4, :cond_8

    :goto_1
    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getWidth()F

    move-result v4

    float-to-double v4, v4

    move-object v6, v3

    float-to-double v2, v2

    div-double/2addr v4, v2

    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getHeight()F

    move-result v0

    move-wide/from16 v21, v2

    float-to-double v2, v0

    div-double v2, v2, v21

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    :goto_2
    move-wide/from16 v43, v2

    goto :goto_3

    :cond_8
    move-object v6, v3

    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getWidth()F

    move-result v0

    float-to-double v3, v0

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v21

    sub-double v3, v3, v21

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v21

    sub-double v3, v3, v21

    move-wide/from16 v21, v3

    float-to-double v2, v2

    div-double v4, v21, v2

    invoke-virtual/range {v18 .. v18}, Lcom/mapbox/maps/Size;->getHeight()F

    move-result v0

    move-wide/from16 v21, v2

    float-to-double v2, v0

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v23

    sub-double v2, v2, v23

    invoke-virtual/range {v35 .. v35}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v23

    sub-double v2, v2, v23

    div-double v2, v2, v21

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    goto :goto_2

    :goto_3
    sub-double v2, v38, v36

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    div-double v41, v43, v2

    invoke-static {v11, v15}, Lx30/s0;->A(Lcom/mapbox/maps/MercatorCoordinate;Lcom/mapbox/maps/MercatorCoordinate;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v2

    invoke-static {v11, v15}, Lx30/s0;->A(Lcom/mapbox/maps/MercatorCoordinate;Lcom/mapbox/maps/MercatorCoordinate;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v45

    cmpg-double v0, v45, v16

    const-wide/high16 v2, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    if-nez v0, :cond_9

    move-wide/from16 v22, v2

    :goto_4
    move-wide/from16 v20, v43

    goto :goto_5

    :cond_9
    const/16 v40, 0x0

    invoke-static/range {v40 .. v46}, Lfv/n;->a(IDDD)D

    move-result-wide v4

    move-wide/from16 v22, v4

    goto :goto_4

    :goto_5
    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    const/16 v40, 0x1

    move-wide/from16 v43, v20

    invoke-static/range {v40 .. v46}, Lfv/n;->a(IDDD)D

    move-result-wide v2

    :goto_6
    invoke-static/range {v45 .. v46}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide v16, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v4, v16

    if-ltz v0, :cond_c

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_7

    :cond_b
    move/from16 v17, v26

    goto :goto_8

    :cond_c
    :goto_7
    const/16 v17, 0x1

    :goto_8
    const-wide v4, 0x3ff6b851eb851eb8L    # 1.42

    if-eqz v17, :cond_d

    div-double v2, v41, v20

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    :goto_9
    div-double/2addr v2, v4

    move-object/from16 v16, v11

    goto :goto_a

    :cond_d
    sub-double v2, v2, v22

    goto :goto_9

    :goto_a
    new-instance v11, Lfv/k;

    move-object v0, v14

    move/from16 v19, v17

    move-wide/from16 v24, v45

    move-wide/from16 v17, v8

    move-wide/from16 v47, v2

    move-object v2, v13

    move-wide/from16 v13, v47

    invoke-direct/range {v11 .. v25}, Lfv/k;-><init>(Lfv/n;DLcom/mapbox/maps/MercatorCoordinate;Lcom/mapbox/maps/MercatorCoordinate;DZDDD)V

    move/from16 v17, v19

    filled-new-array {v6}, [Lcom/mapbox/geojson/Point;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "targets"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lfv/i;

    array-length v8, v3

    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const/4 v8, 0x0

    invoke-direct {v5, v3, v2, v8}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v2, Lfv/n;->e:Ljava/util/HashMap;

    sget-object v3, Lfv/j;->w:Lfv/j;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v8, Lgv/f;

    invoke-direct {v8, v11, v5, v3}, Lgv/f;-><init>(Landroid/animation/TypeEvaluator;Lfv/i;Lkotlin/jvm/functions/Function1;)V

    new-instance v11, Lfv/l;

    move-wide/from16 v15, v36

    move-wide/from16 v18, v41

    invoke-direct/range {v11 .. v23}, Lfv/l;-><init>(Lfv/n;DDZDDD)V

    invoke-static/range {v38 .. v39}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Double;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    new-instance v9, Lfv/i;

    array-length v12, v3

    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const/4 v12, 0x0

    invoke-direct {v9, v3, v5, v12}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v3, Lfv/j;->x:Lfv/j;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v5, Lgv/i;

    invoke-direct {v5, v11, v9, v3}, Lgv/i;-><init>(Lfv/l;Lfv/i;Lkotlin/jvm/functions/Function1;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lgv/d;

    aput-object v8, v3, v26

    const/4 v6, 0x1

    aput-object v5, v3, v6

    invoke-static {v3}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    cmpg-double v5, v27, v33

    if-nez v5, :cond_e

    goto :goto_b

    :cond_e
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v33 .. v34}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    new-instance v9, Lfv/i;

    array-length v11, v5

    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const/4 v12, 0x0

    invoke-direct {v9, v5, v8, v12}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v5, Lfv/j;->y:Lfv/j;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function1;

    new-instance v8, Lgv/e;

    invoke-direct {v8, v9, v5}, Lgv/e;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_b
    cmpg-double v5, v31, v29

    if-nez v5, :cond_f

    :goto_c
    move-object/from16 v15, v35

    goto :goto_d

    :cond_f
    invoke-static/range {v31 .. v32}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    new-instance v9, Lfv/i;

    array-length v11, v5

    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const/4 v12, 0x0

    invoke-direct {v9, v5, v8, v12}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v5, Lfv/j;->z:Lfv/j;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function1;

    new-instance v8, Lgv/h;

    invoke-direct {v8, v9, v5}, Lgv/h;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :goto_d
    invoke-virtual {v15, v0}, Lcom/mapbox/maps/EdgeInsets;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    filled-new-array {v15}, [Lcom/mapbox/maps/EdgeInsets;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lfv/i;

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const/4 v12, 0x0

    invoke-direct {v4, v5, v0, v12}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v0, Lfv/j;->F:Lfv/j;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lgv/g;

    invoke-direct {v2, v4, v0}, Lgv/g;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    move/from16 v0, v26

    new-array v0, v0, [Lgv/d;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lgv/d;

    const/4 v12, 0x0

    invoke-virtual {v7, v0, v10, v12}, Lfv/h;->l([Lgv/d;Lfv/p;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;

    goto :goto_e

    :cond_11
    move-object v12, v8

    const-string v0, "cameraAnimationsFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v12

    :cond_12
    iget-object v0, v1, Lkv/d;->z:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_14

    new-instance v3, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v3}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v3, v2}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lmv/a;->setCamera(Lcom/mapbox/maps/CameraOptions;)V

    :goto_e
    iget-object v0, v1, Lkv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_f

    :cond_13
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_14
    const-string v0, "mapCameraManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v12, 0x0

    throw v12

    :cond_15
    :goto_f
    return-void

    :pswitch_e
    check-cast v5, Ljq0/b;

    invoke-static {v5, v1}, Ljq0/b;->a(Ljq0/b;Landroid/view/View;)V

    return-void

    :pswitch_f
    check-cast v5, Ldb/c0;

    invoke-virtual {v5}, Ldb/c0;->i()V

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f0a0469

    if-ne v0, v2, :cond_16

    iget-object v0, v5, Ldb/c0;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_10

    :cond_16
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0468

    if-ne v0, v1, :cond_17

    iget-object v0, v5, Ldb/c0;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_17
    :goto_10
    return-void

    :pswitch_10
    check-cast v5, Ljo/k;

    iget-object v0, v5, Ljo/k;->e:Ljo/s;

    iget-object v1, v0, Ljo/s;->r0:Lrm/b1;

    if-eqz v1, :cond_18

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->g0()Lio/f;

    move-result-object v1

    iget-object v2, v0, Ljo/s;->r0:Lrm/b1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lio/g;

    invoke-direct {v3, v1}, Lio/g;-><init>(Lio/f;)V

    new-instance v4, Lzr/i0;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lzr/a0;-><init>(I)V

    iget-object v1, v1, Lio/w;->Y:Lzr/j0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lzr/i0;->f()Lzr/j0;

    move-result-object v1

    invoke-virtual {v3, v1}, Lio/g;->c(Ljava/util/Set;)Lio/v;

    invoke-virtual {v3}, Lio/v;->a()Lio/w;

    move-result-object v1

    check-cast v2, Lrm/u;

    invoke-virtual {v2, v1}, Lrm/u;->v0(Lio/w;)V

    iget-object v0, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_18
    return-void

    :pswitch_11
    check-cast v5, Ljo/o;

    iget-object v0, v5, Ljo/o;->d:Ljo/s;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/o2;->getAdapterPosition()I

    move-result v1

    if-nez v1, :cond_19

    iget-object v1, v0, Ljo/s;->K0:Ldb/o;

    invoke-virtual {v0, v1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    goto :goto_11

    :cond_19
    const/4 v6, 0x1

    if-ne v1, v6, :cond_1a

    iget-object v1, v0, Ljo/s;->P0:Ljo/k;

    invoke-virtual {v0, v1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    goto :goto_11

    :cond_1a
    iget-object v0, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_11
    return-void

    :pswitch_12
    check-cast v5, Ljo/k;

    iget-object v0, v5, Ljo/k;->e:Ljo/s;

    iget-object v1, v0, Ljo/s;->r0:Lrm/b1;

    if-nez v1, :cond_1b

    goto/16 :goto_13

    :cond_1b
    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->g0()Lio/f;

    move-result-object v1

    iget-object v2, v1, Lio/w;->X:Lio/u;

    iget-object v2, v2, Lio/u;->w:Lzr/b1;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1c
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/t;

    iget-object v4, v4, Lio/t;->w:Lsn/w0;

    iget-object v4, v4, Lsn/w0;->y:[Lrm/c0;

    const/16 v26, 0x0

    aget-object v4, v4, v26

    iget-object v4, v4, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v4}, Llo/m;->g(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_12

    :cond_1d
    const/4 v6, 0x1

    new-instance v2, Lio/u;

    invoke-direct {v2, v3}, Lio/u;-><init>(Ljava/util/Map;)V

    new-instance v3, Ljava/util/HashSet;

    iget-object v4, v1, Lio/w;->Y:Lzr/j0;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v4, v0, Ljo/s;->r0:Lrm/b1;

    sget v5, Llo/y;->a:I

    new-instance v5, Lio/g;

    invoke-direct {v5, v1}, Lio/g;-><init>(Lio/f;)V

    iput-object v2, v5, Lio/v;->x:Lio/u;

    invoke-virtual {v5, v3}, Lio/g;->c(Ljava/util/Set;)Lio/v;

    invoke-virtual {v5}, Lio/v;->a()Lio/w;

    move-result-object v1

    check-cast v4, Lrm/u;

    invoke-virtual {v4, v1}, Lrm/u;->v0(Lio/w;)V

    iget-object v1, v0, Ljo/s;->J0:Ldb/r;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1404d0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Ldb/r;->c:[Ljava/lang/String;

    const/4 v6, 0x1

    aput-object v2, v1, v6

    iget-object v0, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_13
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

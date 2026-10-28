.class public final Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u008b\u0001\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u00062\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00080\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000eH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015\u00b2\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
        "avatarState",
        "",
        "isInCropMode",
        "Landroid/net/Uri;",
        "selectedImageUri",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;",
        "Ll83/a0;",
        "onEvent",
        "onCropModeChanged",
        "onImageSelected",
        "Landroid/graphics/Rect;",
        "onCropBoundsChanged",
        "Lkotlin/Function0;",
        "onDismiss",
        "AvatarEditBottomSheetContent",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "tempImageUri",
        "",
        "pendingAction",
        "profile_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final AvatarEditBottomSheetContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
            "Z",
            "Landroid/net/Uri;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v0, p9

    const-string v7, "avatarState"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onEvent"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onCropModeChanged"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onImageSelected"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onDismiss"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v7, 0x2556b2b8

    invoke-virtual {v12, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_1
    move v7, v0

    :goto_1
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v7, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v0

    if-nez v9, :cond_b

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v9, 0x10000

    :goto_6
    or-int/2addr v7, v9

    :cond_b
    and-int/lit8 v9, p10, 0x40

    const/high16 v14, 0x180000

    if-eqz v9, :cond_d

    or-int/2addr v7, v14

    :cond_c
    move-object/from16 v14, p6

    goto :goto_8

    :cond_d
    and-int/2addr v14, v0

    if-nez v14, :cond_c

    move-object/from16 v14, p6

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x100000

    goto :goto_7

    :cond_e
    const/high16 v15, 0x80000

    :goto_7
    or-int/2addr v7, v15

    :goto_8
    const/high16 v15, 0xc00000

    and-int/2addr v15, v0

    if-nez v15, :cond_10

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v15, 0x400000

    :goto_9
    or-int/2addr v7, v15

    :cond_10
    const v15, 0x492493

    and-int/2addr v15, v7

    const v10, 0x492492

    const/16 v16, 0x1

    if-eq v15, v10, :cond_11

    move/from16 v10, v16

    goto :goto_a

    :cond_11
    const/4 v10, 0x0

    :goto_a
    and-int/lit8 v15, v7, 0x1

    invoke-virtual {v12, v15, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2f

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_12

    new-instance v9, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v15, 0x1b

    invoke-direct {v9, v15}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object v15, v9

    goto :goto_b

    :cond_13
    move-object/from16 v15, p6

    :goto_b
    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/16 v25, 0x0

    if-ne v14, v10, :cond_14

    invoke-static/range {v25 .. v25}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_15

    new-instance v11, Ljava/io/File;

    invoke-virtual {v9}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string v2, "temp_avatar_"

    const-string v8, ".jpg"

    invoke-static {v0, v1, v2, v8}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v13, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v11, Ljava/io/File;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    const/high16 v1, 0x70000

    and-int/2addr v1, v7

    const/high16 v2, 0x20000

    if-ne v1, v2, :cond_16

    move/from16 v2, v16

    goto :goto_c

    :cond_16
    const/4 v2, 0x0

    :goto_c
    const v8, 0xe000

    and-int/2addr v8, v7

    const/16 v13, 0x4000

    if-ne v8, v13, :cond_17

    move/from16 v13, v16

    goto :goto_d

    :cond_17
    const/4 v13, 0x0

    :goto_d
    or-int/2addr v2, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v2, :cond_18

    if-ne v13, v10, :cond_19

    :cond_18
    new-instance v13, Lcom/whoop/profile/view/edit/avatar/a;

    const/4 v2, 0x0

    invoke-direct {v13, v6, v5, v14, v2}, Lcom/whoop/profile/view/edit/avatar/a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-static {v0, v13, v12, v2}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v0

    new-instance v2, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;

    invoke-direct {v2}, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;-><init>()V

    const/high16 v13, 0x20000

    if-ne v1, v13, :cond_1a

    move/from16 v1, v16

    :goto_e
    const/16 v13, 0x4000

    goto :goto_f

    :cond_1a
    const/4 v1, 0x0

    goto :goto_e

    :goto_f
    if-ne v8, v13, :cond_1b

    move/from16 v8, v16

    goto :goto_10

    :cond_1b
    const/4 v8, 0x0

    :goto_10
    or-int/2addr v1, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_1c

    if-ne v8, v10, :cond_1d

    :cond_1c
    new-instance v8, Lcom/whoop/profile/view/edit/avatar/b;

    const/4 v1, 0x0

    invoke-direct {v8, v1, v6, v5}, Lcom/whoop/profile/view/edit/avatar/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v2, v8, v12, v1}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_1e

    invoke-static/range {v25 .. v25}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v21, v1

    check-cast v21, Lp1/c1;

    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v8, v13

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v8, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_20

    if-ne v13, v10, :cond_1f

    goto :goto_11

    :cond_1f
    move-object/from16 v22, v14

    move-object/from16 v8, v21

    goto :goto_12

    :cond_20
    :goto_11
    new-instance v17, Lam2/r;

    const/16 v23, 0x5

    move-object/from16 v20, v0

    move-object/from16 v18, v9

    move-object/from16 v19, v11

    move-object/from16 v22, v14

    invoke-direct/range {v17 .. v23}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;Lp1/c1;I)V

    move-object/from16 v13, v17

    move-object/from16 v8, v21

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-static {v1, v13, v12, v14}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v1

    new-instance v13, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v13}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_21

    if-ne v5, v10, :cond_22

    :cond_21
    new-instance v5, Lcom/whoop/profile/view/edit/avatar/b;

    const/4 v14, 0x1

    invoke-direct {v5, v14, v2, v8}, Lcom/whoop/profile/view/edit/avatar/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-static {v13, v5, v12, v14}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v5

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_24

    if-ne v14, v10, :cond_23

    goto :goto_13

    :cond_23
    move-object/from16 v21, v8

    goto :goto_14

    :cond_24
    :goto_13
    new-instance v17, La81/l;

    const/16 v24, 0x3

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v23, v8

    move-object/from16 v18, v9

    move-object/from16 v19, v11

    invoke-direct/range {v17 .. v24}, La81/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v14, v17

    move-object/from16 v21, v23

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v14, Lc93/a;

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_25

    if-ne v1, v10, :cond_26

    :cond_25
    new-instance v17, Lam2/d;

    const/16 v22, 0x7

    move-object/from16 v18, v2

    move-object/from16 v20, v5

    move-object/from16 v19, v9

    invoke-direct/range {v17 .. v22}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v1, v17

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v8, v1

    check-cast v8, Lc93/a;

    if-eqz p1, :cond_27

    if-eqz v3, :cond_27

    const v0, 0x245ba8ec

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v7, 0x6

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v7, 0xf

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    const/4 v14, 0x0

    invoke-static {v3, v15, v12, v0, v14}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_1b

    :cond_27
    const v0, 0x245e796e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->getCurrentAvatarUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_28

    goto :goto_15

    :cond_28
    const/4 v2, 0x0

    goto :goto_16

    :cond_29
    :goto_15
    move/from16 v2, v16

    :goto_16
    xor-int/lit8 v0, v2, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->getCurrentAvatarUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2b

    :cond_2a
    const/4 v1, 0x0

    goto :goto_19

    :cond_2b
    const v1, 0x246399d8

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v1, v7, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_2c

    goto :goto_17

    :cond_2c
    const/16 v16, 0x0

    :goto_17
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v16, :cond_2d

    if-ne v1, v10, :cond_2e

    :cond_2d
    new-instance v1, Lcom/whoop/profile/view/i;

    const/4 v2, 0x2

    invoke-direct {v1, v4, v2}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object/from16 v25, v1

    check-cast v25, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_18
    move-object/from16 v11, v25

    goto :goto_1a

    :goto_19
    const v2, 0x2464ea3e

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_1a
    shr-int/lit8 v2, v7, 0xf

    and-int/lit16 v13, v2, 0x380

    move-object v7, v14

    const/4 v14, 0x0

    move-object/from16 v9, p7

    move v10, v0

    invoke-static/range {v7 .. v14}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoSourceActionSheet(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_1b
    move-object v7, v15

    goto :goto_1c

    :cond_2f
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v7, p6

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_30

    new-instance v0, Lb30/w1;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lb30/w1;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final AvatarEditBottomSheetContent$lambda$0$0(Landroid/graphics/Rect;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$10$0(Landroid/content/Context;Ljava/io/File;Lh/i;Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    invoke-static {p3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$8(Lp1/c1;)Ljava/lang/String;

    move-result-object p5

    const-string v1, "camera"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, ".provider"

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p0, p5, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p4, p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$3(Lp1/c1;Landroid/net/Uri;)V

    invoke-static {p4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$2(Lp1/c1;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    invoke-static {p3, v0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$9(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$11$0(Lh/i;Lp1/c1;Z)Ll83/a0;
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$8(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "gallery"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "image/*"

    invoke-virtual {p0, p2, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$9(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$12$0(Landroid/content/Context;Ljava/io/File;Lh/i;Lh/i;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 3

    const-string v0, "android.permission.CAMERA"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ".provider"

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p0, p3, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p4, p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$3(Lp1/c1;Landroid/net/Uri;)V

    invoke-static {p4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$2(Lp1/c1;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, v2}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    const-string p0, "camera"

    invoke-static {p5, p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$9(Lp1/c1;Ljava/lang/String;)V

    invoke-virtual {p3, v0, v2}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$13$0(Lh/i;Landroid/content/Context;Lh/i;Lp1/c1;)Ll83/a0;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "image/*"

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, v2, v3}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, v2, v3}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_1
    const-string p0, "gallery"

    invoke-static {p3, p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$9(Lp1/c1;Ljava/lang/String;)V

    invoke-virtual {p2, v0, v3}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$14$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$DeleteAvatar;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$DeleteAvatar;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$15(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$2(Lp1/c1;)Landroid/net/Uri;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Landroid/net/Uri;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/Uri;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$3(Lp1/c1;Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final AvatarEditBottomSheetContent$lambda$5$0(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    if-eqz p3, :cond_0

    invoke-static {p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$2(Lp1/c1;)Landroid/net/Uri;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$2(Lp1/c1;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$6$0(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$8(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final AvatarEditBottomSheetContent$lambda$9(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Landroid/graphics/Rect;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$0$0(Landroid/graphics/Rect;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$5$0(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$15(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$6$0(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lh/i;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$11$0(Lh/i;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;Ljava/io/File;Lh/i;Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$10$0(Landroid/content/Context;Ljava/io/File;Lh/i;Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$14$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lh/i;Landroid/content/Context;Lh/i;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$13$0(Lh/i;Landroid/content/Context;Lh/i;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/content/Context;Ljava/io/File;Lh/i;Lh/i;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->AvatarEditBottomSheetContent$lambda$12$0(Landroid/content/Context;Ljava/io/File;Lh/i;Lh/i;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

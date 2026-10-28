.class public final Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a/\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroid/net/Uri;",
        "imageUri",
        "Lkotlin/Function1;",
        "Landroid/graphics/Rect;",
        "Ll83/a0;",
        "onCropBoundsChanged",
        "PhotoCropDisplay",
        "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "scale",
        "Lh2/b;",
        "offset",
        "Ly3/l;",
        "imageSize",
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
.method public static final PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "imageUri"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v1, -0x1e33a621

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v5, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :goto_3
    and-int/lit8 v8, v1, 0x13

    const/16 v12, 0x12

    const/4 v9, 0x0

    if-eq v8, v12, :cond_5

    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    move v8, v9

    :goto_4
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v6, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v7, 0x1c

    invoke-direct {v4, v7}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v15, v4

    goto :goto_5

    :cond_7
    move-object v15, v7

    :goto_5
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const/high16 v10, 0x3f800000    # 1.0f

    if-ne v4, v8, :cond_8

    invoke-static {v10, v6}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v4

    :cond_8
    move-object/from16 v17, v4

    check-cast v17, Lp1/z0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_9

    new-instance v4, Lh2/b;

    move/from16 p2, v12

    const-wide/16 v12, 0x0

    invoke-direct {v4, v12, v13}, Lh2/b;-><init>(J)V

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_6

    :cond_9
    move/from16 p2, v12

    :goto_6
    move-object/from16 v18, v4

    check-cast v18, Lp1/c1;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const/4 v7, 0x0

    if-ne v4, v8, :cond_a

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lp1/c1;

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v6, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_b

    if-ne v13, v8, :cond_c

    :cond_b
    new-instance v13, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;

    invoke-direct {v13, v11, v0, v4, v7}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lp1/c1;Lq83/d;)V

    invoke-virtual {v6, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v13, Lc93/m;

    and-int/lit8 v7, v1, 0xe

    invoke-static {v6, v13, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-static/range {v18 .. v18}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v12

    new-instance v14, Lh2/b;

    invoke-direct {v14, v12, v13}, Lh2/b;-><init>(J)V

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$8(Lp1/c1;)Ly3/l;

    move-result-object v12

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v5, :cond_d

    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    move v1, v9

    :goto_7
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v1, :cond_e

    if-ne v13, v8, :cond_f

    :cond_e
    move-object v1, v14

    goto :goto_8

    :cond_f
    move-object v1, v14

    move-object/from16 v28, v15

    move-object/from16 v4, v17

    move-object v14, v13

    move-object/from16 v13, v18

    goto :goto_9

    :goto_8
    new-instance v14, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;

    const/16 v19, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v14 .. v19}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V

    move-object/from16 v28, v15

    move-object/from16 v4, v17

    move-object/from16 v13, v18

    invoke-virtual {v6, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v14, Lc93/m;

    invoke-static {v11, v1, v12, v14, v6}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v3, v3

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v14, v3, v11

    const/4 v3, 0x0

    const/4 v15, 0x1

    invoke-static {v1, v3, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v15, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    move/from16 v17, v5

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_10

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_a
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v9, v6, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v6, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v0, Lb2/e;->E:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v2, v13

    move/from16 v19, v14

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    move-object/from16 v21, v2

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-eqz v2, :cond_13

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v6, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v13, v6, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v6, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x3f

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v13, v1

    mul-float/2addr v0, v13

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_16

    new-instance v1, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;

    move-object/from16 v2, v21

    invoke-direct {v1, v4, v2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;-><init>(Lp1/z0;Lp1/c1;)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_c

    :cond_16
    move-object/from16 v2, v21

    :goto_c
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v8, v1}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v30

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v31

    invoke-static {v2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v0

    shr-long v0, v0, v17

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v33

    invoke-static {v2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v0

    const-wide v17, 0xffffffffL

    and-long v0, v0, v17

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v34

    const/16 v38, 0x0

    const v39, 0x7ffe4

    const/16 v32, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v29 .. v39}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v0, 0x180030

    or-int/2addr v7, v0

    const/16 v8, 0x3b8

    const-string v1, "Selected photo"

    move-object v0, v3

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->a:Ly2/b1;

    move-object v14, v5

    const/4 v5, 0x0

    move/from16 v17, v11

    move-object v11, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v8}, Ldc/a;->c(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/m;Ly2/k;FLp1/q;II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    mul-float v1, v13, v17

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v6, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v6, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->T()J

    move-result-wide v4

    const/4 v7, 0x3

    int-to-float v7, v7

    invoke-static {v1, v7, v13, v4, v5}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v4, v19

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x36

    invoke-static {v7, v5, v6, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-eqz v0, :cond_17

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v6, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_18

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    invoke-static {v7, v6, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v6, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/profile/R$drawable;->profile_gesture_pinch:I

    const/4 v15, 0x0

    invoke-static {v0, v6, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    invoke-virtual {v2, v6, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v7

    new-instance v1, Li2/p;

    const/4 v5, 0x5

    invoke-direct {v1, v7, v8, v5}, Li2/p;-><init>(JI)V

    int-to-float v5, v5

    mul-float/2addr v5, v13

    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v10, 0x1b0

    const/16 v11, 0x38

    move v7, v3

    const/4 v3, 0x0

    move/from16 v19, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object/from16 v24, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v13, v8

    move-object/from16 v9, v24

    move-object v8, v1

    move-object v1, v2

    move-object v2, v0

    move/from16 v0, v19

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v9

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_zoom_and_move_photo:I

    invoke-static {v6, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v4

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v26, v0, 0x12

    const v27, 0x2fffa

    move-object/from16 v24, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v0, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_e

    :cond_1a
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, v7

    :goto_e
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, La01/i;

    const/16 v5, 0x19

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final PhotoCropDisplay$lambda$0$0(Landroid/graphics/Rect;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PhotoCropDisplay$lambda$13(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PhotoCropDisplay$lambda$2(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final PhotoCropDisplay$lambda$3(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final PhotoCropDisplay$lambda$5(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/b;

    iget-wide v0, p0, Lh2/b;->a:J

    return-wide v0
.end method

.method private static final PhotoCropDisplay$lambda$6(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Lh2/b;

    invoke-direct {v0, p1, p2}, Lh2/b;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final PhotoCropDisplay$lambda$8(Lp1/c1;)Ly3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ly3/l;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    return-object p0
.end method

.method private static final PhotoCropDisplay$lambda$9(Lp1/c1;Ly3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ly3/l;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Landroid/graphics/Rect;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$0$0(Landroid/graphics/Rect;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$2(Lp1/z0;)F
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$3(Lp1/z0;F)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$3(Lp1/z0;F)V

    return-void
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$5(Lp1/c1;)J
    .locals 2

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$6(Lp1/c1;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$6(Lp1/c1;J)V

    return-void
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$8(Lp1/c1;)Ly3/l;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$8(Lp1/c1;)Ly3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$PhotoCropDisplay$lambda$9(Lp1/c1;Ly3/l;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$9(Lp1/c1;Ly3/l;)V

    return-void
.end method

.method public static synthetic b(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay$lambda$13(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

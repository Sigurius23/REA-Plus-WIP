.class public final Lcom/whoop/profile/view/ProfileHeaderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a=\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "metadata",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onOpenBottomSheet",
        "ProfileHeader",
        "(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "ProfileHeaderSelfProfilePreview",
        "(Landroidx/compose/runtime/Composer;I)V",
        "ProfileHeaderOtherProfilePreview",
        "ProfileHeaderLongTextPreview",
        "ProfileHeaderFoundingMemberPreview",
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
.method public static final ProfileHeader(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "metadata"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x42d14b94

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v8, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x93

    const/16 v13, 0x92

    const/4 v15, 0x0

    if-eq v10, v13, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    move v10, v15

    :goto_6
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v8, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_41

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_9

    new-instance v5, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v6, 0xf

    invoke-direct {v5, v6}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v6

    :goto_7
    const/16 v6, 0x8

    if-eqz v7, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_b

    new-instance v7, Lcom/whoop/design/models/modal/a;

    invoke-direct {v7, v6}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lc93/a;

    goto :goto_8

    :cond_c
    move-object v7, v9

    :goto_8
    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v11, v8, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v6

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getProfileImageUrl()Lkd1/o;

    move-result-object v6

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    if-nez v6, :cond_11

    const v6, 0x35cfe1d2

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    move/from16 v35, v0

    move-object/from16 p2, v3

    move-object/from16 v31, v5

    move-object/from16 v32, v7

    move-object v15, v9

    move-object v3, v10

    move-object v0, v12

    move-object/from16 v45, v13

    move-object v1, v14

    const/high16 v4, 0x3f800000    # 1.0f

    goto/16 :goto_b

    :cond_11
    const v11, 0x35cfe1d3

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    move-object v11, v9

    sget v9, Lkd1/o;->a:I

    move-object/from16 v22, v10

    const/4 v10, 0x3

    move-object/from16 v23, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move-object v15, v11

    move-object/from16 p2, v14

    move-object/from16 v14, v22

    move-object/from16 v31, v23

    move-object/from16 v32, v24

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0x55

    int-to-float v7, v7

    const/4 v9, 0x4

    int-to-float v10, v9

    mul-float/2addr v7, v10

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v34

    new-instance v6, Li2/r;

    const/high16 v7, 0x43c80000    # 400.0f

    const/4 v9, 0x0

    invoke-direct {v6, v7, v7, v9}, Li2/r;-><init>(FFI)V

    const/16 v41, 0x0

    const v44, 0x6dffb

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v37, 0x3f4ccccd    # 0.8f

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v43, 0x2

    move-object/from16 v42, v6

    invoke-static/range {v34 .. v44}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_12

    new-instance v7, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v9, 0x10

    invoke-direct {v7, v9}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x6030

    move-object/from16 v22, v14

    const/16 v14, 0x68

    move-object v9, v6

    const/4 v6, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move-object v10, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v23, v11

    const/4 v11, 0x0

    move-object/from16 v1, p2

    move/from16 v35, v0

    move-object/from16 p2, v3

    move-object v0, v12

    move-object/from16 v45, v16

    move-object/from16 v3, v22

    move/from16 v4, v23

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    :goto_b
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x2

    int-to-float v11, v6

    const/16 v7, 0x8

    int-to-float v12, v7

    mul-float v7, v11, v12

    const/4 v13, 0x0

    invoke-static {v5, v7, v13, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Lb2/e;->M:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v14, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v17, v14

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v15, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    goto :goto_e

    :cond_14
    :goto_d
    move-object/from16 v13, p2

    goto :goto_f

    :cond_15
    :goto_e
    invoke-static {v10, v8, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0x16

    int-to-float v5, v5

    const/4 v9, 0x4

    int-to-float v14, v9

    mul-float/2addr v5, v14

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v5

    if-eqz v5, :cond_16

    invoke-virtual {v5}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getProfileImageUrl()Lkd1/o;

    move-result-object v5

    goto :goto_10

    :cond_16
    const/4 v5, 0x0

    :goto_10
    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x6

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v46, v18

    move/from16 v18, v11

    move/from16 v11, v19

    invoke-static/range {v5 .. v10}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatar(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    move/from16 v33, v9

    mul-float v5, v14, v14

    invoke-static {v3, v5, v8, v3, v4}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    invoke-static {v9, v7, v8, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    move/from16 v19, v12

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_17

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_17
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v8, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_18

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    :cond_18
    invoke-static {v11, v8, v11, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v8, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v6, v5

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v4, v11

    const-wide/16 v36, 0x0

    cmpl-double v4, v4, v36

    const-string v38, "invalid weight; must be greater than zero"

    if-lez v4, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v39, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v11, v39

    if-lez v5, :cond_1b

    move/from16 v5, v39

    :goto_13
    const/4 v10, 0x1

    goto :goto_14

    :cond_1b
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_13

    :goto_14
    invoke-direct {v4, v5, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v5, v17

    move-object/from16 v10, v46

    const/4 v11, 0x0

    invoke-static {v10, v5, v8, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_1c

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_1d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    :cond_1d
    invoke-static {v10, v8, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v8, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v4

    const-string v5, " "

    if-nez v4, :cond_1f

    const v4, 0x124ce387

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object/from16 v40, v0

    move-object/from16 v41, v1

    move-object/from16 p3, v2

    move-object/from16 v56, v5

    move/from16 v54, v6

    move-object v4, v7

    move-object v1, v9

    move v2, v11

    move-object/from16 v52, v13

    move v0, v14

    move-object/from16 v47, v15

    move/from16 v42, v18

    move/from16 v53, v19

    goto/16 :goto_16

    :cond_1f
    const/4 v11, 0x0

    const v10, 0x124ce388

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getFirstName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getLastName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v5, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v10, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    invoke-virtual {v10, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v21

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v29, v10, 0x12

    const v30, 0x2fffa

    move v10, v6

    const/4 v6, 0x0

    move-object/from16 v17, v9

    move v12, v10

    const-wide/16 v9, 0x0

    move/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move/from16 v28, v14

    move-object/from16 v27, v15

    const-wide/16 v14, 0x0

    const/16 v40, 0x0

    const/16 v16, 0x0

    move-object/from16 v41, v17

    const/16 v17, 0x0

    move/from16 v42, v18

    move/from16 v43, v19

    const-wide/16 v18, 0x0

    const/16 v44, 0x30

    const/16 v20, 0x0

    move-object/from16 v46, v7

    move-object/from16 v64, v27

    move-object/from16 v27, v8

    move-wide/from16 v7, v21

    move-object/from16 v22, v64

    const/16 v21, 0x0

    move-object/from16 v47, v22

    const/16 v22, 0x0

    move/from16 v48, v23

    const/16 v23, 0x0

    move/from16 v49, v24

    const/16 v24, 0x0

    move-object/from16 v50, v26

    const/16 v26, 0x0

    move/from16 v51, v28

    const/16 v28, 0x0

    move-object/from16 p3, v41

    move-object/from16 v41, v1

    move-object/from16 v1, p3

    move-object/from16 v40, v0

    move-object/from16 p3, v2

    move-object/from16 v56, v5

    move/from16 v53, v43

    move/from16 v2, v48

    move/from16 v54, v49

    move-object/from16 v52, v50

    move/from16 v0, v51

    move-object v5, v4

    move-object/from16 v4, v46

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_16
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    invoke-static {v5, v0, v3, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/16 v11, 0x30

    invoke-static {v1, v4, v8, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_20

    move-object/from16 v15, p3

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v11, v41

    goto :goto_18

    :cond_20
    move-object/from16 v15, p3

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v47

    invoke-static {v8, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_21

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    :cond_21
    move-object/from16 v13, v40

    goto :goto_1a

    :cond_22
    move-object/from16 v13, v40

    :goto_19
    move-object/from16 v14, v52

    goto :goto_1b

    :goto_1a
    invoke-static {v6, v8, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v8, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v5

    sget-object v16, Ly2/j;->b:Ly2/b1;

    if-nez v5, :cond_24

    const v5, -0x16f3b5e1    # -1.0599978E25f

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getEntitlementImage()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_23

    const v5, 0x387cf9c2

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 v57, v11

    move-object/from16 v58, v12

    move-object/from16 v59, v13

    move-object/from16 v60, v14

    move-object/from16 p3, v15

    move-object/from16 v40, v16

    move/from16 v15, v53

    goto :goto_1c

    :cond_23
    const v6, 0x387cf9c3

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    const/4 v10, 0x3

    const/4 v6, 0x0

    move/from16 v9, v33

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget v6, Lcom/whoop/profile/R$string;->profile_entitlement_logo_content_description:I

    invoke-static {v8, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Lcom/whoop/profile/view/ProfileScreenKt;->entitlementImageEffect(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v43, v53

    mul-float v9, v43, v0

    mul-float v10, v42, v0

    invoke-static {v7, v9, v10}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v40, v13

    const/16 v13, 0x6000

    move-object/from16 v26, v14

    const/16 v14, 0x68

    move-object/from16 v27, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v41, v11

    const/4 v11, 0x0

    move-object/from16 v58, v12

    move-object/from16 p3, v15

    move-object/from16 v9, v16

    move-object/from16 v60, v26

    move-object/from16 v12, v27

    move-object/from16 v59, v40

    move-object/from16 v57, v41

    move/from16 v15, v43

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v40, v9

    move-object v8, v12

    const/4 v10, 0x1

    int-to-float v5, v10

    invoke-static {v5, v15, v3, v8, v2}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_1c
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_24
    move-object/from16 v57, v11

    move-object/from16 v58, v12

    move-object/from16 v59, v13

    move-object/from16 v60, v14

    move-object/from16 p3, v15

    move-object/from16 v40, v16

    move/from16 v15, v53

    const v5, 0x3886d3c8

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object v5

    if-eqz v5, :cond_26

    invoke-virtual {v5}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getUsername()Ljava/lang/String;

    move-result-object v6

    const-string v7, "@"

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getAge()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_25

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1e

    :cond_25
    const/4 v7, 0x0

    :goto_1e
    invoke-virtual {v5}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;->getLocation()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v6, v7, v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sget-object v5, Lkd1/z;->BULLET:Lkd1/z;

    invoke-virtual {v5}, Lkd1/z;->getSymbol()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v56

    invoke-static {v6, v5, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x0

    const/16 v14, 0x3e

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1f

    :cond_26
    move-object/from16 v6, v56

    const/4 v5, 0x0

    :goto_1f
    if-eqz v5, :cond_27

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_28

    :cond_27
    move-object/from16 v61, p3

    move-object/from16 v62, v6

    move/from16 v43, v15

    goto :goto_21

    :cond_28
    const v7, 0x388d99b9

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    const/4 v10, 0x1

    int-to-float v7, v10

    invoke-static {v7, v0, v3, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v8, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v9

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v7, v7, 0x12

    or-int/lit16 v7, v7, 0xc00

    const v30, 0x2dffa

    move-object/from16 v56, v6

    const/4 v6, 0x0

    move/from16 v29, v7

    move-object/from16 v27, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v43, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v61, p3

    move-object/from16 v62, v56

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_20
    const/4 v10, 0x1

    goto :goto_22

    :goto_21
    const v5, 0x38937388

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_20

    :goto_22
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    const/4 v9, 0x3

    const/4 v10, 0x6

    if-eqz v5, :cond_2d

    const v5, 0x26b31c7a

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getEditButtonTitle()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_29

    const v5, -0x504f8d39

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 v41, v1

    move v11, v2

    move-object v1, v3

    move-object/from16 v23, v4

    move v3, v9

    move/from16 p3, v10

    move-object/from16 v4, v31

    move-object/from16 v2, v45

    goto/16 :goto_26

    :cond_29
    const v11, -0x504f8d38

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lm4/a;->A(Lx81/d;)I

    move-result v17

    sget-object v11, Lg1/v0;->a:Ll0/l1;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v5, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->W0()J

    move-result-wide v12

    invoke-virtual {v5, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    move-wide/from16 v18, v6

    move-object/from16 v27, v8

    move-wide v7, v14

    const/4 v14, 0x0

    const/16 v15, 0xc

    move v6, v9

    move/from16 v20, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v5

    move/from16 v22, v6

    move-wide v5, v12

    move v13, v11

    const-wide/16 v11, 0x0

    move-object/from16 v41, v1

    move-object/from16 v46, v3

    move-object/from16 v23, v4

    move v1, v13

    move/from16 v4, v20

    move-object/from16 v2, v21

    move/from16 v3, v22

    move-object/from16 v13, v27

    invoke-static/range {v5 .. v15}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    move-object v8, v13

    int-to-float v5, v3

    mul-float v15, v5, v0

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    mul-float v5, v5, v43

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v6

    mul-float v9, v9, v43

    new-instance v6, Ll0/l1;

    invoke-direct {v6, v5, v9, v5, v9}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v2, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v1

    move-object/from16 v5, v46

    const/4 v2, 0x0

    const/4 v10, 0x1

    invoke-static {v5, v2, v10}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v9, p0

    invoke-virtual {v8, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v11, v35, 0x70

    const/16 v13, 0x20

    if-ne v11, v13, :cond_2a

    const/4 v14, 0x1

    goto :goto_23

    :cond_2a
    const/4 v14, 0x0

    :goto_23
    or-int/2addr v10, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_2c

    move-object/from16 v10, v45

    if-ne v11, v10, :cond_2b

    goto :goto_24

    :cond_2b
    move/from16 p3, v4

    move-object/from16 v4, v31

    goto :goto_25

    :cond_2c
    move-object/from16 v10, v45

    :goto_24
    new-instance v11, Lbs1/v;

    const/16 v14, 0x13

    move/from16 p3, v4

    move-object/from16 v4, v31

    invoke-direct {v11, v9, v4, v14}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_25
    move-object/from16 v18, v11

    check-cast v18, Lc93/a;

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v11, 0x12

    or-int/lit8 v20, v11, 0x6

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v11, v11, 0x6

    or-int/lit8 v21, v11, 0x36

    const/16 v22, 0x336

    move-object/from16 v11, v16

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object v14, v5

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v45, v10

    const/4 v10, 0x0

    move/from16 v55, v13

    const/4 v13, 0x0

    move-object/from16 v46, v14

    const/4 v14, 0x0

    move-object/from16 v17, v1

    move-object/from16 v19, v8

    move-object/from16 v1, v46

    move-object v8, v2

    move-object/from16 v2, v45

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v19

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_26
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_27
    const/4 v10, 0x1

    goto :goto_28

    :cond_2d
    move-object/from16 v41, v1

    move v11, v2

    move-object v1, v3

    move-object/from16 v23, v4

    move v3, v9

    move/from16 p3, v10

    move-object/from16 v4, v31

    move-object/from16 v2, v45

    const v5, -0x503c6bf2

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_27

    :goto_28
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getMembershipData()Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    move-result-object v31

    if-nez v31, :cond_2e

    const v0, -0x769aa4c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object/from16 v41, v32

    const/4 v10, 0x1

    goto/16 :goto_3f

    :cond_2e
    const v5, -0x769aa4b

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v3

    invoke-static {v5, v0, v1, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x5

    int-to-float v6, v6

    mul-float/2addr v6, v0

    const/4 v7, 0x0

    const/4 v10, 0x1

    invoke-static {v5, v7, v6, v10}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    mul-float v13, v42, v0

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->q()J

    move-result-wide v6

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v6, v7, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getBottomSheet()Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    move-result-object v6

    if-eqz v6, :cond_2f

    const/4 v6, 0x1

    goto :goto_29

    :cond_2f
    const/4 v6, 0x0

    :goto_29
    move/from16 v7, v35

    and-int/lit16 v9, v7, 0x380

    const/16 v10, 0x100

    if-ne v9, v10, :cond_30

    const/4 v9, 0x1

    goto :goto_2a

    :cond_30
    const/4 v9, 0x0

    :goto_2a
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_32

    if-ne v10, v2, :cond_31

    goto :goto_2b

    :cond_31
    move-object/from16 v11, v32

    goto :goto_2c

    :cond_32
    :goto_2b
    new-instance v10, Laz1/b;

    const/16 v9, 0x9

    move-object/from16 v11, v32

    invoke-direct {v10, v11, v9}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2c
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v10}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v9

    mul-float v6, v6, v43

    const/4 v10, 0x1

    int-to-float v9, v10

    mul-float v9, v9, v43

    invoke-static {v5, v6, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v10, v23

    move-object/from16 v12, v41

    const/16 v3, 0x30

    invoke-static {v12, v10, v8, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move v10, v6

    move/from16 v35, v7

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v51, v0

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-eqz v0, :cond_33

    move-object/from16 v0, v61

    invoke-virtual {v8, v0}, Lp1/q;->l(Lc93/a;)V

    :goto_2d
    move-object/from16 v24, v11

    move-object/from16 v11, v57

    goto :goto_2e

    :cond_33
    move-object/from16 v0, v61

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_2d

    :goto_2e
    invoke-static {v8, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v58

    invoke-static {v8, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_35

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 v16, v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_34

    :goto_2f
    move-object/from16 v7, v59

    goto :goto_31

    :cond_34
    move-object/from16 v7, v59

    :goto_30
    move-object/from16 v6, v60

    goto :goto_32

    :cond_35
    move/from16 v16, v9

    goto :goto_2f

    :goto_31
    invoke-static {v6, v8, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_30

    :goto_32
    invoke-static {v8, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v5, v54

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getIcon()Lgz0/m0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/m0;->toWhoopIcon()I

    move-result v9

    move-object/from16 v17, v5

    move/from16 v5, p3

    invoke-static {v9, v8, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move-object/from16 v27, v8

    sget-wide v8, Li2/x;->n:J

    move-object/from16 v41, v11

    const/16 v11, 0xdb0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v26, v6

    const-string v6, "member icon"

    move-object/from16 v45, v2

    move-object/from16 v42, v4

    move-object v4, v7

    move/from16 p3, v13

    move/from16 v63, v16

    move-object/from16 v7, v17

    move-object/from16 v2, v26

    move-object/from16 v13, v41

    move-object/from16 v16, v14

    move/from16 v17, v15

    move-object/from16 v14, v18

    move-object/from16 v41, v24

    move v15, v10

    move-object/from16 v10, v27

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x0

    invoke-static {v14, v5, v8, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_36

    invoke-virtual {v8, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_33

    :cond_36
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_33
    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_37

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    :cond_37
    invoke-static {v6, v8, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_38
    invoke-static {v8, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v31 .. v31}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getMemberSinceTitle()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, v62

    invoke-static {v0, v6}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v16

    move/from16 v2, v17

    invoke-virtual {v0, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v8

    move-wide v7, v3

    move v3, v2

    move-object v2, v0

    move/from16 v0, p3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual/range {v31 .. v31}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;->getMemberSinceDate()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_39

    const v2, -0x3e4622f9

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_34
    const/4 v10, 0x1

    goto :goto_35

    :cond_39
    const v4, -0x3e4622f8

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    move/from16 v9, v63

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2, v8, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v8

    move-wide v7, v2

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_34

    :goto_35
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v2

    if-eqz v2, :cond_40

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getShowSettingsButton()Z

    move-result v2

    if-eqz v2, :cond_40

    const v2, 0x5890ad2f

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getEntitlementImage()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_3a

    const v0, -0x467b074e

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move v15, v11

    move-object/from16 v4, v42

    goto/16 :goto_3c

    :cond_3a
    const v2, -0x467b074d

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v2, v11

    cmpl-double v2, v2, v36

    if-lez v2, :cond_3b

    goto :goto_36

    :cond_3b
    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_36
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v11, v39

    if-lez v3, :cond_3c

    move/from16 v9, v39

    :goto_37
    const/4 v10, 0x1

    goto :goto_38

    :cond_3c
    move v9, v11

    goto :goto_37

    :goto_38
    invoke-direct {v2, v9, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v7, 0x0

    const/4 v10, 0x3

    const/4 v6, 0x0

    move/from16 v9, v33

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget v2, Lcom/whoop/profile/R$string;->profile_entitlement_logo_content_description:I

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    and-int/lit8 v2, v35, 0x70

    const/16 v13, 0x20

    if-ne v2, v13, :cond_3d

    const/4 v14, 0x1

    goto :goto_39

    :cond_3d
    const/4 v14, 0x0

    :goto_39
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v14, :cond_3f

    move-object/from16 v10, v45

    if-ne v2, v10, :cond_3e

    goto :goto_3a

    :cond_3e
    move-object/from16 v4, v42

    goto :goto_3b

    :cond_3f
    :goto_3a
    new-instance v2, Lbf0/a;

    const/16 v3, 0x1a

    move-object/from16 v4, v42

    invoke-direct {v2, v4, v3}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_3b
    check-cast v2, Lc93/a;

    const/4 v3, 0x3

    const/4 v7, 0x0

    const/4 v15, 0x0

    invoke-static {v1, v15, v7, v2, v3}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/profile/view/ProfileScreenKt;->entitlementImageEffect(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    mul-float v12, v43, v51

    invoke-static {v1, v12, v0}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x6000

    const/16 v14, 0x68

    move-object/from16 v27, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    move-object/from16 v9, v40

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_3c
    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_3d
    const/4 v10, 0x1

    goto :goto_3e

    :cond_40
    move-object/from16 v4, v42

    const/4 v15, 0x0

    const v0, -0x466ee7e9

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto :goto_3d

    :goto_3e
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_3f
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    move-object v6, v4

    move-object/from16 v5, v41

    goto :goto_40

    :cond_41
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v5, v9

    :goto_40
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_42

    new-instance v0, Lc41/d1;

    const/16 v3, 0x10

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_42
    return-void
.end method

.method private static final ProfileHeader$lambda$0$0(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileHeader$lambda$1$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ProfileHeader$lambda$2$0$0$0(Lf2/d;)Lf2/g;
    .locals 13

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const-wide v2, 0xffffffffL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    const-wide v4, 0xeeffffffL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v8, Li2/x;

    invoke-direct {v8, v4, v5}, Li2/x;-><init>(J)V

    const-wide v4, 0xbbffffffL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v9, Li2/x;

    invoke-direct {v9, v4, v5}, Li2/x;-><init>(J)V

    const v0, 0x77ffffff

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v4

    new-instance v10, Li2/x;

    invoke-direct {v10, v4, v5}, Li2/x;-><init>(J)V

    const v0, 0x33ffffff

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v4

    new-instance v11, Li2/x;

    invoke-direct {v11, v4, v5}, Li2/x;-><init>(J)V

    const v0, 0xffffff

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v4

    new-instance v12, Li2/x;

    invoke-direct {v12, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array/range {v6 .. v12}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v4, p0, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->d()J

    move-result-wide v4

    const/16 v6, 0x20

    shr-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const v5, 0x3f266666    # 0.65f

    mul-float/2addr v5, v4

    iget-object v4, p0, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->d()J

    move-result-wide v7

    shr-long/2addr v7, v6

    long-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/4 v7, 0x2

    int-to-float v7, v7

    div-float/2addr v4, v7

    iget-object v7, p0, Lf2/d;->w:Lf2/b;

    invoke-interface {v7}, Lf2/b;->d()J

    move-result-wide v7

    and-long/2addr v7, v2

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    const/high16 v8, 0x3e800000    # 0.25f

    mul-float/2addr v7, v8

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v10, v4

    shl-long v6, v8, v6

    and-long/2addr v2, v10

    or-long v3, v6, v2

    const/16 v6, 0x8

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    new-instance v1, Lck1/c;

    const/4 v2, 0x7

    invoke-direct {v1, v0, v2}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final ProfileHeader$lambda$2$0$0$0$0(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v9, 0x6

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileHeader$lambda$2$1$0$1$0$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getEditButtonAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    invoke-direct {v0, p0}, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p0, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    sget-object v0, Lcom/whoop/profile/presentation/NavigateToEditProfileViewState;->INSTANCE:Lcom/whoop/profile/presentation/NavigateToEditProfileViewState;

    invoke-direct {p0, v0}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;-><init>(Lm91/u;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileHeader$lambda$2$1$1$0$0(Lc93/a;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La31/e;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, La31/e;-><init>(Lc93/a;I)V

    const/4 p0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, p0}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final ProfileHeader$lambda$2$1$1$0$0$0(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileHeader$lambda$2$1$1$1$1$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    sget-object v1, Lcom/whoop/profile/presentation/NavigateToAccountViewState;->INSTANCE:Lcom/whoop/profile/presentation/NavigateToAccountViewState;

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;-><init>(Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileHeader$lambda$3(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileHeaderFoundingMemberPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x8cc590e

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderFoundingMemberPreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderFoundingMemberPreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileHeaderFoundingMemberPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderFoundingMemberPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileHeaderLongTextPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x7d510bd

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderLongTextPreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderLongTextPreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileHeaderLongTextPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderLongTextPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileHeaderOtherProfilePreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x672a076d

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderOtherProfilePreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderOtherProfilePreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileHeaderOtherProfilePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderOtherProfilePreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileHeaderSelfProfilePreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x466abc21

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderSelfProfilePreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileHeaderKt$ProfileHeaderSelfProfilePreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileHeaderSelfProfilePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderSelfProfilePreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderFoundingMemberPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderOtherProfilePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$1$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Li2/u0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$0$0$0$0(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$1$0$1$0$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderLongTextPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$1$1$0$0$0(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$0$0$0(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$1$1$0$0(Lc93/a;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$3(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeaderSelfProfilePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$2$1$1$1$1$0$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader$lambda$0$0(Lcom/whoop/profile/presentation/ProfileEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

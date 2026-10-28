.class public final Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "profileData",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onOpenAvatarEditor",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "EditProfileAvatarSection",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final EditProfileAvatarSection(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x2d2b2bf9

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_3

    or-int/lit16 v0, v0, 0x180

    :cond_2
    move-object/from16 v6, p2

    goto :goto_3

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_2

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_2

    :cond_4
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0xc00

    :cond_5
    move-object/from16 v8, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_5

    move-object/from16 v8, p3

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_4

    :cond_7
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x483

    const/16 v11, 0x482

    if-eq v10, v11, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    const/4 v10, 0x0

    :goto_6
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v9, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1d

    and-int/lit8 v10, p6, 0x2

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v13, :cond_9

    new-instance v10, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v11, 0x17

    invoke-direct {v10, v11}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object/from16 v32, v10

    goto :goto_7

    :cond_a
    move-object/from16 v32, p1

    :goto_7
    if-eqz v4, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_b

    new-instance v4, Lcom/whoop/design/models/modal/a;

    const/16 v6, 0xb

    invoke-direct {v4, v6}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lc93/a;

    goto :goto_8

    :cond_c
    move-object v4, v6

    :goto_8
    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_d

    move-object v7, v6

    goto :goto_9

    :cond_d
    move-object v7, v8

    :goto_9
    const/16 v8, 0x10

    int-to-float v8, v8

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v10, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v12, v10, v11

    const/4 v14, 0x0

    invoke-static {v7, v12, v14, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, Lb2/e;->M:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v3, v14, v9, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v19, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-eqz v1, :cond_e

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v20, v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_b

    :cond_f
    move/from16 v20, v8

    :goto_b
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v2, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move v8, v10

    move v14, v11

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    move/from16 p1, v8

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 p2, v6

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_11

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v10, v9, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p0, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getAvatarUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-static {v2}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v2

    :goto_d
    move-object v6, v2

    goto :goto_e

    :cond_14
    const/4 v2, 0x0

    goto :goto_d

    :goto_e
    sget v2, Lcom/whoop/profile/R$string;->profile_avatar_content_description:I

    invoke-static {v9, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x2

    move-object v2, v7

    const/4 v7, 0x0

    move-object/from16 p3, v5

    move-object/from16 v5, p2

    move/from16 p2, v12

    move-object v12, v2

    move/from16 v2, p1

    move-object/from16 p1, v19

    move/from16 v19, v14

    move/from16 v14, v20

    invoke-static/range {v6 .. v11}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatar(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object v6, Lb2/e;->I:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v5, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x6

    int-to-float v8, v7

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v8, v10

    const/4 v11, 0x1

    int-to-float v7, v11

    mul-float/2addr v7, v10

    invoke-static {v6, v8, v7}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0xc

    int-to-float v7, v7

    mul-float/2addr v7, v10

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v7, "edit_profile_avatar_button"

    invoke-static {v6, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    move/from16 v20, v10

    invoke-virtual {v11}, Ly81/i;->n()J

    move-result-wide v10

    move-object/from16 v21, v7

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v6, v2, v10, v11, v7}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_15

    new-instance v6, Lb01/k;

    const/4 v7, 0x1

    invoke-direct {v6, v14, v7}, Lb01/k;-><init>(FI)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v6}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Ly81/f;->WHITE_10:Ly81/f;

    const/4 v7, 0x6

    invoke-virtual {v6, v9, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v2, v10, v11, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    and-int/lit16 v0, v0, 0x380

    const/16 v2, 0x100

    if-ne v0, v2, :cond_16

    const/4 v0, 0x1

    goto :goto_f

    :cond_16
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_17

    if-ne v2, v13, :cond_18

    :cond_17
    new-instance v2, La31/e;

    const/16 v0, 0xe

    invoke-direct {v2, v4, v0}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v26, v2

    check-cast v26, Lc93/a;

    const/16 v27, 0xf

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v6

    mul-float v2, v2, v19

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v2, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_19

    invoke-virtual {v9, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_12

    :cond_1a
    :goto_11
    move-object/from16 v1, p3

    goto :goto_13

    :cond_1b
    :goto_12
    invoke-static {v6, v9, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v21 .. v21}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->l()I

    move-result v0

    const/4 v7, 0x6

    invoke-static {v0, v9, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    sget v0, Lcom/whoop/profile/R$string;->profile_edit_avatar_button:I

    invoke-static {v9, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    mul-float v10, v20, v20

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    const/16 v12, 0x180

    const/4 v13, 0x0

    move-object v11, v9

    move-wide v9, v2

    move v2, v8

    move-object v8, v0

    move/from16 v0, p2

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    if-eqz p0, :cond_1c

    const v3, 0x65837c24    # 7.7615E22f

    invoke-static {v9, v3, v5, v0, v9}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getFirstName()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getLastName()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const-string v5, " "

    invoke-static {v0, v5, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v30, v2, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move/from16 v16, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v2, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move/from16 v8, v18

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide/from16 v33, v0

    move v0, v8

    move-wide/from16 v8, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1c
    move v2, v11

    move v0, v14

    const v1, 0x6588a945

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object v3, v4

    move-object/from16 v2, v32

    move-object/from16 v4, p1

    goto :goto_15

    :cond_1d
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v3, v6

    move-object v4, v8

    :goto_15
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, La81/f;

    const/16 v7, 0xe

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final EditProfileAvatarSection$lambda$0$0(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileAvatarSection$lambda$1$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final EditProfileAvatarSection$lambda$2$0$0$0(FLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly81/f;->BACKGROUND_DARK_ALT:Ly81/f;

    invoke-virtual {v0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v2

    invoke-interface {p1, p0}, Ly3/c;->q0(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v4, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v8, v0, v4

    const/4 v11, 0x0

    const/16 v12, 0xf6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileAvatarSection$lambda$2$0$1$0(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileAvatarSection$lambda$3(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection$lambda$0$0(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection$lambda$2$0$1$0(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection$lambda$2$0$0$0(FLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection$lambda$3(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection$lambda$1$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

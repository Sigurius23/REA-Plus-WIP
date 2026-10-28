.class public final Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aU\u0010\u0008\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a/\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTakePhoto",
        "onSelectFromGallery",
        "onCancel",
        "",
        "hasExistingAvatar",
        "onDeletePhoto",
        "PhotoSourceActionSheet",
        "(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "text",
        "Lgz0/m0;",
        "icon",
        "onClick",
        "PhotoActionButton",
        "(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
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
.method private static final PhotoActionButton(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v4, -0x2b539585

    invoke-virtual {v9, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_4

    if-nez v1, :cond_2

    const/4 v7, -0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_2
    invoke-virtual {v9, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    :cond_4
    and-int/lit16 v7, v3, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v4, 0x93

    const/16 v10, 0x92

    if-eq v7, v10, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v9, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    and-int/lit16 v10, v4, 0x380

    if-ne v10, v8, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_9

    if-ne v10, v11, :cond_a

    :cond_9
    new-instance v10, La31/e;

    const/16 v8, 0xf

    invoke-direct {v10, v2, v8}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v19, v10

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v15, v6

    invoke-static {v8, v10, v15}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 v18, v13

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v12

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v12, v13, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v5, v5

    const/16 v8, 0x8

    int-to-float v12, v8

    mul-float/2addr v5, v12

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v13, v4, 0xe

    if-ne v13, v6, :cond_b

    const/4 v4, 0x1

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_c

    if-ne v6, v11, :cond_d

    :cond_c
    new-instance v6, Lb30/y4;

    const/16 v4, 0x8

    invoke-direct {v6, v0, v4}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-static {v5, v4, v6}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v4, v9, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v3, 0x36

    invoke-static {v4, v5, v9, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v23, v13

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_11

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v4, v9, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v9, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v1, :cond_14

    const v0, 0x76f02398

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object v2, v10

    move/from16 v0, v18

    const/4 v3, 0x1

    goto :goto_a

    :cond_14
    const v0, 0x76f02399

    const/4 v2, 0x6

    invoke-static {v9, v0, v1, v9, v2}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v4

    int-to-float v0, v2

    mul-float/2addr v0, v15

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v0, v18

    invoke-virtual {v10, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v7

    move-object v2, v10

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const-string v5, ""

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    int-to-float v4, v3

    const/4 v5, 0x0

    invoke-static {v4, v12, v14, v9, v5}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_a
    invoke-virtual {v2, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v20

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0xc30

    const v25, 0x2d7fa

    const/4 v1, 0x0

    move v6, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object/from16 v22, v9

    move v11, v10

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x2

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x1

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v24, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v22

    const/4 v3, 0x1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_16

    new-instance v2, Lj;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    invoke-direct {v2, v5, v4, v3, v0}, Lj;-><init>(ILc93/a;Lgz0/m0;Ljava/lang/String;)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final PhotoActionButton$lambda$0$0(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PhotoActionButton$lambda$1$0(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PhotoActionButton$lambda$3(Ljava/lang/String;Lgz0/m0;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final PhotoSourceActionSheet(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move/from16 v0, p6

    const-string v3, "onTakePhoto"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onSelectFromGallery"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onCancel"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v3, -0x30ef3299

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_6

    move/from16 v7, p3

    invoke-virtual {v14, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, p7, 0x10

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move-object/from16 v9, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    and-int/lit16 v10, v3, 0x2493

    const/16 v11, 0x2492

    const/4 v12, 0x1

    const/4 v15, 0x0

    if-eq v10, v11, :cond_c

    move v10, v12

    goto :goto_8

    :cond_c
    move v10, v15

    :goto_8
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v14, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_13

    if-eqz v6, :cond_d

    move/from16 v18, v15

    goto :goto_9

    :cond_d
    move/from16 v18, v7

    :goto_9
    if-eqz v8, :cond_e

    const/4 v6, 0x0

    goto :goto_a

    :cond_e
    move-object v6, v9

    :goto_a
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v4, v4

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v4, v10

    const/4 v11, 0x0

    invoke-static {v9, v11, v4, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v11, v14, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_f

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_b
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v14, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v14, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-nez v9, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    :cond_10
    invoke-static {v11, v14, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v14, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v4, Lcom/whoop/profile/R$string;->profile_avatar_take_photo:I

    invoke-static {v14, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lgz0/m0;->CAMERA:Lgz0/m0;

    shl-int/lit8 v9, v3, 0x6

    and-int/lit16 v9, v9, 0x380

    or-int/lit8 v9, v9, 0x30

    invoke-static {v4, v7, v1, v14, v9}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v11

    mul-float/2addr v4, v10

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v14, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v7, Lcom/whoop/profile/R$string;->profile_avatar_select_library:I

    invoke-static {v14, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lgz0/m0;->LIST:Lgz0/m0;

    shl-int/lit8 v11, v3, 0x3

    and-int/lit16 v11, v11, 0x380

    or-int/lit8 v11, v11, 0x30

    invoke-static {v7, v9, v2, v14, v11}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    if-eqz v18, :cond_12

    if-eqz v6, :cond_12

    const v7, 0x2f93acec

    invoke-static {v14, v7, v8, v4, v14}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    sget v4, Lcom/whoop/profile/R$string;->profile_avatar_delete_photo:I

    invoke-static {v14, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lgz0/m0;->DELETE:Lgz0/m0;

    shr-int/lit8 v9, v3, 0x6

    and-int/lit16 v9, v9, 0x380

    or-int/lit8 v9, v9, 0x30

    invoke-static {v4, v7, v6, v14, v9}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    const v4, 0x2f97cbc5

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    :goto_c
    int-to-float v4, v5

    invoke-static {v4, v10, v8, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v4, Lcom/whoop/profile/R$string;->profile_avatar_cancel:I

    invoke-static {v14, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x6

    or-int/lit8 v15, v7, 0x6

    shr-int/lit8 v3, v3, 0x6

    and-int/lit8 v16, v3, 0xe

    const/16 v17, 0x3fa

    move-object v3, v4

    const/4 v4, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v0, 0x1

    move-object/from16 v13, p2

    invoke-static/range {v3 .. v17}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move/from16 v4, v18

    move-object/from16 v5, v19

    goto :goto_d

    :cond_13
    invoke-virtual {v14}, Lp1/q;->X()V

    move v4, v7

    move-object v5, v9

    :goto_d
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Lbf0/g;

    const/4 v8, 0x3

    move-object/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final PhotoSourceActionSheet$lambda$1(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoSourceActionSheet(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton$lambda$0$0(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoSourceActionSheet$lambda$1(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton$lambda$1$0(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lgz0/m0;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoActionButton$lambda$3(Ljava/lang/String;Lgz0/m0;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

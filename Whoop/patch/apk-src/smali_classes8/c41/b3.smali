.class public abstract Lc41/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/b3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001aa\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u00082\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lc41/d3;",
        "type",
        "Lkd1/o;",
        "image",
        "Lcom/whoop/design/util/TextResource;",
        "imageContentDescription",
        "title",
        "subTitle",
        "",
        "ctaUrl",
        "name",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "h",
        "(Lc41/d3;)I",
        "design_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc41/d3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/b3;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc41/d3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lc41/b3;->g(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/b3;->f(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/d3;",
            "Lkd1/o;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v2, p6

    move-object/from16 v0, p7

    move/from16 v9, p9

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "image"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "title"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subTitle"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p8

    check-cast v15, Lp1/q;

    const v3, -0x547f3598

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v15, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, p10, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x100

    goto :goto_3

    :cond_6
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v3, v12

    :goto_4
    and-int/lit16 v12, v9, 0xc00

    if-nez v12, :cond_8

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x800

    goto :goto_5

    :cond_7
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v3, v12

    :cond_8
    and-int/lit16 v12, v9, 0x6000

    if-nez v12, :cond_a

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x4000

    goto :goto_6

    :cond_9
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v3, v12

    :cond_a
    const/high16 v12, 0x30000

    and-int/2addr v12, v9

    const/high16 v13, 0x20000

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    move v14, v13

    goto :goto_7

    :cond_b
    const/high16 v14, 0x10000

    :goto_7
    or-int/2addr v3, v14

    goto :goto_8

    :cond_c
    move-object/from16 v12, p5

    :goto_8
    const/high16 v14, 0x180000

    and-int/2addr v14, v9

    const/high16 v10, 0x100000

    if-nez v14, :cond_e

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    move v14, v10

    goto :goto_9

    :cond_d
    const/high16 v14, 0x80000

    :goto_9
    or-int/2addr v3, v14

    :cond_e
    const/high16 v14, 0xc00000

    and-int/2addr v14, v9

    const/high16 v11, 0x800000

    if-nez v14, :cond_10

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    move v14, v11

    goto :goto_a

    :cond_f
    const/high16 v14, 0x400000

    :goto_a
    or-int/2addr v3, v14

    :cond_10
    move/from16 v36, v3

    const v3, 0x492493

    and-int v3, v36, v3

    const v14, 0x492492

    if-eq v3, v14, :cond_11

    const/4 v3, 0x1

    goto :goto_b

    :cond_11
    const/4 v3, 0x0

    :goto_b
    and-int/lit8 v14, v36, 0x1

    invoke-virtual {v15, v14, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2d

    if-eqz v4, :cond_12

    const/4 v3, 0x0

    goto :goto_c

    :cond_12
    move-object/from16 v3, p2

    :goto_c
    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/high16 v20, 0x1c00000

    and-int v4, v36, v20

    if-ne v4, v11, :cond_13

    const/4 v4, 0x1

    goto :goto_d

    :cond_13
    const/4 v4, 0x0

    :goto_d
    const/high16 v11, 0x380000

    and-int v11, v36, v11

    if-ne v11, v10, :cond_14

    const/4 v10, 0x1

    goto :goto_e

    :cond_14
    const/4 v10, 0x0

    :goto_e
    or-int/2addr v4, v10

    const/high16 v10, 0x70000

    and-int v10, v36, v10

    if-ne v10, v13, :cond_15

    const/4 v10, 0x1

    goto :goto_f

    :cond_15
    const/4 v10, 0x0

    :goto_f
    or-int/2addr v4, v10

    and-int/lit8 v10, v36, 0xe

    const/4 v11, 0x4

    if-ne v10, v11, :cond_16

    const/4 v10, 0x1

    goto :goto_10

    :cond_16
    const/4 v10, 0x0

    :goto_10
    or-int/2addr v4, v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_18

    if-ne v10, v11, :cond_17

    goto :goto_11

    :cond_17
    move-object/from16 v37, v5

    move-object v0, v10

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    const/16 v17, 0x1

    move-object v10, v3

    goto :goto_12

    :cond_18
    :goto_11
    new-instance v0, Lam2/d;

    move-object v4, v5

    const/4 v5, 0x6

    move-object v10, v3

    move-object/from16 v37, v4

    move-object v3, v12

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    const/16 v17, 0x1

    move-object v4, v1

    move-object/from16 v1, p7

    invoke-direct/range {v0 .. v5}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v23, v0

    check-cast v23, Lc93/a;

    const/16 v24, 0xf

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v3}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v1

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v1, v4, v15, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v15, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_19
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_13
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v15, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-nez v14, :cond_1a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move/from16 v20, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_14

    :cond_1a
    move/from16 v20, v2

    :goto_14
    invoke-static {v5, v15, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v15, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->w:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v5, v3

    iget-wide v2, v15, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    move-object/from16 v22, v4

    move-object/from16 v21, v5

    move-object/from16 v5, v37

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_1c

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v15, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-static {v2, v15, v2, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v15, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v2, 0x4

    int-to-float v9, v2

    mul-float/2addr v0, v9

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-static {v5, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x17

    int-to-float v2, v2

    mul-float/2addr v2, v9

    const/16 v3, 0x12

    int-to-float v3, v3

    mul-float/2addr v3, v9

    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_1f

    new-instance v0, Lc31/m;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lc31/m;-><init>(I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v36, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v4, v0, 0x180

    move-object/from16 v37, v5

    const/4 v5, 0x1

    move-object v0, v1

    const/4 v1, 0x0

    move-object v11, v0

    move-object v3, v15

    const/16 v15, 0x36

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    if-nez v10, :cond_20

    const v0, -0x3984be55

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_16

    :cond_20
    const/4 v2, 0x0

    const v0, -0x3984be54

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-static {v10, v3, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_16
    const/16 v18, 0x6000

    const/16 v19, 0x68

    move-object v4, v13

    const/4 v13, 0x0

    move-object v5, v14

    sget-object v14, Ly2/j;->a:Ly2/b1;

    move/from16 v23, v15

    const/4 v15, 0x0

    move-object/from16 v24, v12

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 v17, v3

    move-object v7, v5

    move-object/from16 p2, v10

    move-object v8, v11

    move/from16 v2, v20

    move-object/from16 v3, v22

    move-object/from16 v5, v37

    move-object v11, v0

    move-object v10, v1

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v17

    sget-object v10, Lc41/d3;->VIDEO:Lc41/d3;

    const/4 v11, 0x6

    if-ne v1, v10, :cond_24

    const v10, -0x39824bab

    invoke-static {v15, v10, v2, v9, v5}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v15, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->u()J

    move-result-wide v13

    sget-object v11, Lt0/j;->a:Lt0/i;

    invoke-static {v10, v13, v14, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->E:Lb2/m;

    sget-object v13, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v13, v10, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v14, 0x0

    invoke-static {v11, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move/from16 v20, v2

    move-object/from16 v38, v3

    iget-wide v2, v15, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_21

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_21
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v15, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_22

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    :cond_22
    invoke-static {v2, v15, v2, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v15, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v13, v5, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Lgy0/a;->p4:I

    const/4 v3, 0x0

    invoke-static {v2, v15, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v10

    sget v2, Lgy0/f;->H1:I

    invoke-static {v15, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const/4 v2, 0x6

    invoke-virtual {v12, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v1

    invoke-static/range {v10 .. v17}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_24
    move/from16 v20, v2

    move-object/from16 v38, v3

    move v2, v11

    const/4 v1, 0x1

    const/4 v3, 0x0

    const v10, -0x3976583c

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v10, v12

    const-wide/16 v13, 0x0

    cmpl-double v3, v10, v13

    if-lez v3, :cond_25

    goto :goto_19

    :cond_25
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_19
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v12, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v10, v1

    mul-float v1, v10, v20

    move-object/from16 v10, v38

    invoke-static {v1, v10}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v11

    move-object/from16 v12, v21

    const/16 v13, 0x36

    invoke-static {v11, v12, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_26

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_26
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v15, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_27

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    :cond_27
    invoke-static {v12, v15, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v15, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v3, v36, 0x9

    and-int/lit8 v3, v3, 0xe

    move-object/from16 v11, p3

    invoke-static {v11, v15, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v15, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->b()Lb91/a;

    move-result-object v30

    invoke-virtual {v12, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    new-instance v2, Lw3/k;

    const/4 v11, 0x5

    invoke-direct {v2, v11}, Lw3/k;-><init>(I)V

    const/16 v34, 0xc30

    const v35, 0x2d5fa

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    move-wide v12, v13

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v25, v23

    const-wide/16 v23, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x2

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x3

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v38, v33

    const/16 v33, 0x0

    move-object/from16 p8, v10

    move-object v10, v3

    move-object/from16 v3, p8

    move/from16 p8, v1

    move/from16 v1, v22

    move-object/from16 v22, v2

    move-object/from16 v2, v38

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v3, v15, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_29

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_29
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v15, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_2a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    :cond_2a
    invoke-static {v10, v15, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    invoke-static {v15, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lc41/b3;->h(Lc41/d3;)I

    move-result v0

    const/4 v13, 0x0

    invoke-static {v0, v15, v13}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v10

    const/16 v22, 0x0

    const/16 v23, 0xb

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v21, p8

    move-object/from16 v18, v5

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    mul-float v3, v9, v9

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v0, 0x6

    invoke-virtual {v2, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v13

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    const/4 v11, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static/range {p4 .. p4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_2c

    const v0, -0x42c12f22

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v36, 0xc

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v8, p4

    invoke-static {v8, v15, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    const/4 v0, 0x6

    invoke-virtual {v2, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->t()Lb91/a;

    move-result-object v30

    invoke-virtual {v2, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v12

    new-instance v0, Lw3/k;

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const/16 v34, 0x30

    const v35, 0x2f5fa

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_1c
    const/4 v0, 0x1

    goto :goto_1d

    :cond_2c
    move-object/from16 v8, p4

    const/4 v13, 0x0

    const v0, -0x42bc4ea8

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_1c

    :goto_1d
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    int-to-float v0, v1

    mul-float/2addr v0, v9

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v0, Lgy0/a;->Q1:I

    invoke-static {v0, v15, v13}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v10

    const/4 v0, 0x6

    invoke-virtual {v2, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    const/4 v11, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_1e
    move-object/from16 v3, p2

    goto :goto_1f

    :cond_2d
    invoke-virtual {v15}, Lp1/q;->X()V

    goto :goto_1e

    :goto_1f
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2e

    new-instance v0, Lb90/b;

    const/4 v11, 0x4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p9

    move/from16 v10, p10

    move-object v5, v8

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v11}, Lb90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc41/d3;)Ll83/a0;
    .locals 1

    new-instance v0, Lc41/z2;

    invoke-direct {v0, p1, p2, p3}, Lc41/z2;-><init>(Ljava/lang/String;Ljava/lang/String;Lc41/d3;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lmh/h;)Ll83/a0;
    .locals 3

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lph/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lph/a;-><init>(II)V

    iput-object v0, p0, Lmh/h;->j:Lph/e;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lc41/b3;->d(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc41/d3;)I
    .locals 1

    sget-object v0, Lc41/b3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget p0, Lgy0/a;->r2:I

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lgy0/a;->s2:I

    return p0

    :cond_2
    sget p0, Lgy0/a;->s:I

    return p0
.end method

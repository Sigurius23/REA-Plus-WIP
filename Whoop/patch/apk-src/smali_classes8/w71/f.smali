.class public abstract Lw71/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "",
        "isSubQuestion",
        "checked",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onCheckedChanged",
        "b",
        "(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw71/f;->c(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "ZZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p4

    move/from16 v12, p6

    const-string v1, "question"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onCheckedChanged"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v1, -0x648c3b2e

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v12, 0x30

    if-nez v4, :cond_2

    move/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_5

    move/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v1, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v1, v1, 0xc00

    :cond_8
    move/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v12, 0xc00

    if-nez v10, :cond_8

    move/from16 v10, p3

    invoke-virtual {v9, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v1, v11

    :goto_7
    and-int/lit16 v11, v12, 0x6000

    if-nez v11, :cond_c

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_8

    :cond_b
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v1, v11

    :cond_c
    move v11, v1

    and-int/lit16 v1, v11, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v1, v13, :cond_d

    move v1, v15

    goto :goto_9

    :cond_d
    move v1, v14

    :goto_9
    and-int/lit8 v13, v11, 0x1

    invoke-virtual {v9, v13, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_19

    if-eqz v3, :cond_e

    move/from16 v24, v14

    goto :goto_a

    :cond_e
    move/from16 v24, v4

    :goto_a
    if-eqz v5, :cond_f

    move/from16 v25, v14

    goto :goto_b

    :cond_f
    move/from16 v25, v6

    :goto_b
    if-eqz v8, :cond_10

    move v10, v15

    :cond_10
    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v1, 0x8

    if-eqz v24, :cond_11

    int-to-float v2, v2

    :goto_c
    int-to-float v1, v1

    mul-float/2addr v2, v1

    move/from16 v17, v2

    goto :goto_d

    :cond_11
    int-to-float v2, v14

    goto :goto_c

    :goto_d
    const/16 v20, 0x0

    const/16 v21, 0xe

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->g:Ll0/h;

    const/16 v5, 0x36

    invoke-static {v4, v2, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-nez v13, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_14

    :cond_13
    invoke-static {v4, v9, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v3

    const-wide/16 v16, 0x0

    cmpl-double v1, v13, v16

    if-lez v1, :cond_15

    goto :goto_f

    :cond_15
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v3, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v3, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    :cond_17
    invoke-static {v13, v9, v13, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v11, 0xe

    const/16 v6, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v9

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v17

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v13

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v15

    const/16 v22, 0x0

    const/16 v23, 0x18

    const-wide/16 v19, 0x0

    move-object/from16 v21, v9

    invoke-static/range {v13 .. v23}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v5

    shr-int/lit8 v1, v11, 0x3

    and-int/lit8 v1, v1, 0x70

    shr-int/lit8 v2, v11, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v11, 0x1c00

    or-int/2addr v1, v2

    const/16 v11, 0x1d1

    move v2, v0

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v13, v2

    move v3, v10

    move-object/from16 v2, p4

    move v10, v1

    move/from16 v1, v25

    invoke-static/range {v0 .. v11}, Lsy0/h;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move v4, v3

    move/from16 v2, v24

    move v3, v1

    goto :goto_11

    :cond_19
    invoke-virtual {v9}, Lp1/q;->X()V

    move v2, v4

    move v3, v6

    move v4, v10

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, Lw71/e;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v7, p7

    move v6, v12

    invoke-direct/range {v0 .. v8}, Lw71/e;-><init>(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final c(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lw71/f;->b(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

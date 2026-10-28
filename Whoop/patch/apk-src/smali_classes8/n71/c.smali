.class public abstract Ln71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ln71/d;",
        "itemState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ln71/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln71/c;->c(Landroidx/compose/ui/Modifier;Ln71/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v2, p1

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x2ecb2af

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v15, 0x0

    const/4 v7, 0x1

    if-eq v5, v6, :cond_6

    move v5, v7

    goto :goto_4

    :cond_6
    move v5, v15

    :goto_4
    and-int/2addr v4, v7

    invoke-virtual {v11, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_18

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object v0, v4

    goto :goto_5

    :cond_7
    move-object v0, v3

    :goto_5
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln71/d;->a()Ln71/e;

    move-result-object v8

    const/4 v12, 0x6

    if-nez v8, :cond_b

    const v1, 0x1bff5701

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object/from16 v17, v0

    move-object/from16 v21, v3

    move-object v15, v4

    move-object/from16 v23, v5

    move-object/from16 v22, v6

    move-object v14, v9

    move-object v1, v10

    move v0, v12

    const/4 v3, 0x2

    goto/16 :goto_b

    :cond_b
    const v8, 0x1bff5702

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/i0;->u()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2}, Ln71/d;->a()Ln71/e;

    move-result-object v13

    invoke-virtual {v13}, Ln71/e;->a()Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_7

    :cond_c
    const/4 v8, 0x0

    :goto_7
    invoke-virtual {v2}, Ln71/d;->b()Ln71/f;

    move-result-object v13

    instance-of v7, v13, Ln71/f$a;

    if-eqz v7, :cond_d

    invoke-virtual {v2}, Ln71/d;->b()Ln71/f;

    move-result-object v7

    check-cast v7, Ln71/f$a;

    invoke-virtual {v7}, Ln71/f$a;->c()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_8

    :cond_d
    instance-of v7, v13, Ln71/f$b;

    if-eqz v7, :cond_17

    sget v7, Lgy0/f;->E0:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    :goto_8
    invoke-virtual {v2}, Ln71/d;->a()Ln71/e;

    move-result-object v13

    invoke-virtual {v13}, Ln71/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_e

    invoke-virtual {v2}, Ln71/d;->b()Ln71/f;

    move-result-object v13

    invoke-interface {v13}, Ln71/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :cond_e
    invoke-virtual {v2}, Ln71/d;->b()Ln71/f;

    move-result-object v1

    instance-of v14, v1, Ln71/f$a;

    if-eqz v14, :cond_f

    const v1, 0x76e8c410

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1, v11, v12, v15}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_9
    move v1, v12

    goto :goto_a

    :cond_f
    instance-of v1, v1, Ln71/f$b;

    if-eqz v1, :cond_16

    const v1, 0x76e8ce4d

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1, v11, v12, v15}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_9

    :goto_a
    const/16 v12, 0xc00

    move-object v14, v5

    move-object v5, v7

    move-object v7, v13

    const/16 v13, 0x21

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v4

    move-object v4, v8

    const/4 v8, 0x0

    move-object/from16 v23, v14

    move-object/from16 v21, v18

    move-object/from16 v22, v19

    move-object/from16 v15, v20

    move-object v14, v9

    move-wide/from16 v24, v16

    move-object/from16 v17, v0

    move v0, v1

    move-object v1, v10

    move-wide/from16 v9, v24

    invoke-static/range {v3 .. v13}, Lsz0/m1;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x2

    int-to-float v4, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v11, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_b
    int-to-float v3, v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v6, v11, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_10

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v21

    invoke-static {v11, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    move-object/from16 v0, v22

    goto :goto_e

    :cond_12
    :goto_d
    move-object/from16 v14, v23

    goto :goto_f

    :goto_e
    invoke-static {v3, v11, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v11, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x7a6b137

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ln71/d;->b()Ln71/f;

    move-result-object v0

    invoke-interface {v0}, Ln71/f;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfz0/d;

    float-to-double v5, v4

    const-wide/16 v7, 0x0

    cmpl-double v3, v5, v7

    if-lez v3, :cond_13

    const/4 v7, 0x1

    goto :goto_11

    :cond_13
    const/4 v7, 0x0

    :goto_11
    if-nez v7, :cond_14

    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v6, 0x0

    invoke-static {v3, v1, v11, v6, v6}, Ln71/h;->e(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V

    goto :goto_10

    :cond_15
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v11, v6, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v17

    goto :goto_12

    :cond_16
    move v6, v15

    const v0, 0x76e8b98b

    invoke-static {v0, v11, v6}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_18
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v3

    :goto_12
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Llq2/c;

    const/16 v5, 0x14

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ln71/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

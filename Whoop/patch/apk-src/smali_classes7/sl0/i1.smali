.class public abstract Lsl0/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aC\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "chatMessage",
        "Lkd1/o;",
        "icon",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "onDeleteClicked",
        "f",
        "(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/i1;->j(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/i1;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsl0/i1;->k(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/i1;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc93/a;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/i1;->i(Lc93/a;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lkd1/o;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v1, "chatMessage"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v1, -0x3f82f93d

    invoke-virtual {v11, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v5, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v11, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v5

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_5

    :cond_3
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_6

    and-int/lit8 v4, v5, 0x40

    if-nez v4, :cond_4

    invoke-virtual {v11, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_4
    invoke-virtual {v11, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_4

    :cond_5
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v1, v4

    :cond_6
    :goto_5
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_8

    or-int/lit16 v1, v1, 0x180

    :cond_7
    move-object/from16 v6, p2

    goto :goto_7

    :cond_8
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_7

    move-object/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x100

    goto :goto_6

    :cond_9
    const/16 v7, 0x80

    :goto_6
    or-int/2addr v1, v7

    :goto_7
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_b

    or-int/lit16 v1, v1, 0xc00

    :cond_a
    move-object/from16 v8, p3

    goto :goto_9

    :cond_b
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_a

    move-object/from16 v8, p3

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    const/16 v9, 0x800

    goto :goto_8

    :cond_c
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v1, v9

    :goto_9
    and-int/lit16 v9, v1, 0x493

    const/16 v10, 0x492

    if-eq v9, v10, :cond_d

    const/4 v9, 0x1

    goto :goto_a

    :cond_d
    const/4 v9, 0x0

    :goto_a
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_13

    if-eqz v3, :cond_e

    const/4 v0, 0x0

    goto :goto_b

    :cond_e
    move-object v0, p1

    :goto_b
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_f

    new-instance v4, Lsl0/a1;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lc93/a;

    goto :goto_c

    :cond_10
    move-object v4, v6

    :goto_c
    if-eqz v7, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_11

    new-instance v6, Lsl0/a1;

    const/4 v3, 0x2

    invoke-direct {v6, v3}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v3, v6

    check-cast v3, Lc93/a;

    move-object v9, v3

    goto :goto_d

    :cond_12
    move-object v9, v8

    :goto_d
    const/16 v3, 0xc

    int-to-float v3, v3

    int-to-float v2, v2

    mul-float/2addr v3, v2

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->x()J

    move-result-wide v7

    const/4 v10, 0x3

    int-to-float v10, v10

    invoke-static {v10, v2, v6, v7, v8}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v2, Lsl0/j0;

    const/4 v6, 0x1

    invoke-direct {v2, v4, v0, p0, v6}, Lsl0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, -0x930735c

    invoke-static {v6, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v12, v1, 0x6006

    const/4 v13, 0x4

    const/4 v8, 0x0

    move-object v6, v3

    invoke-static/range {v6 .. v13}, Lhy0/b1;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v0

    move-object v3, v4

    move-object v4, v9

    goto :goto_e

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, v6

    move-object v4, v8

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lo72/a;

    const/16 v7, 0x1b

    move-object v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc93/a;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p0

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_9

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_2

    :cond_1
    new-instance v5, Lsl0/a;

    const/4 v1, 0x7

    invoke-direct {v5, v0, v1}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v15, v5

    check-cast v15, Lc93/a;

    const/16 v16, 0xf

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v1, v11

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    const/4 v7, 0x3

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v15, v8

    invoke-static {v0, v7, v15, v5, v6}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->K:Lb2/l;

    int-to-float v7, v4

    const/16 v8, 0x36

    invoke-static {v7, v6, v5, v10, v8}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p1, :cond_6

    const v0, 0x1b4454a1

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    move-object v5, v0

    move v0, v11

    goto :goto_2

    :cond_6
    const v0, 0x1b4454a2

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget v9, Lkd1/o;->a:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, p1

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v10, v8

    invoke-virtual {v13, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v8

    move v0, v11

    const/16 v11, 0x30

    const/4 v12, 0x4

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object v5, v2

    :goto_2
    const/4 v6, 0x6

    if-nez v5, :cond_7

    const v5, 0x1b47ae19

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget v5, Lwk0/a;->d:I

    invoke-static {v5, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget-wide v8, Li2/x;->n:J

    const/16 v11, 0xc30

    const/4 v12, 0x4

    move v7, v6

    const/4 v6, 0x0

    move/from16 v16, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const v5, -0x49716855

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_3
    float-to-double v5, v0

    const-wide/16 v7, 0x0

    cmpl-double v3, v5, v7

    if-lez v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v0, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v3, p2

    invoke-static {v3, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v10, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v13, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0xc30

    const v30, 0x2d7f8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v13

    const/4 v13, 0x0

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x2

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x1

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    move/from16 v29, v0

    move/from16 v0, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    mul-float v15, v0, v0

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->b()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget-wide v8, Li2/x;->n:J

    const/16 v11, 0xdb0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    return-object v2

    :cond_9
    invoke-virtual {v10}, Lp1/q;->X()V

    return-object v2
.end method

.method private static final j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lsl0/i1;->f(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

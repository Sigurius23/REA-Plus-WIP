.class public abstract Lg31/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "maximum",
        "numSelected",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onRatingSelected",
        "e",
        "(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lg31/c;->h(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lg31/c;->i(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(IILkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg31/c;->g(IILkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg31/c;->f(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "II",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p5

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, 0x3e32fe2

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_4

    :cond_9
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit16 v8, v4, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_a

    move v8, v11

    goto :goto_6

    :cond_a
    move v8, v10

    :goto_6
    and-int/2addr v4, v11

    invoke-virtual {v13, v4, v8}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    if-eqz v0, :cond_b

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_b
    move-object v0, v1

    :goto_7
    if-eqz v6, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_c

    new-instance v1, Lg1/u4;

    const/4 v4, 0x7

    invoke-direct {v1, v4}, Lg1/u4;-><init>(I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_d
    move-object v1, v7

    :goto_8
    new-instance v4, Lqc1/a;

    const/16 v6, 0xc

    invoke-direct {v4, v6}, Lqc1/a;-><init>(I)V

    invoke-static {v0, v10, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v4, 0x3f000000    # 0.5f

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v7, v4

    move v4, v7

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    new-instance v4, Lg31/b;

    invoke-direct {v4, v1, v2, v3}, Lg31/b;-><init>(Lkotlin/jvm/functions/Function1;II)V

    const v9, 0x160dd307

    invoke-static {v9, v13, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const v14, 0x1801b0

    const/16 v15, 0x38

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v15}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v1

    move-object v1, v0

    goto :goto_9

    :cond_e
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v4, v7

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_f

    new-instance v0, Lv6/e;

    const/4 v7, 0x2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lv6/e;-><init>(Ljava/lang/Object;IILl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(IILkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p2

    const-string v1, "$this$FlowRow"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p5, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p5, 0x1

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Li93/j;

    move/from16 v2, p0

    invoke-direct {v1, v4, v2, v4}, Li93/h;-><init>(III)V

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    move-object v5, v1

    check-cast v5, Li93/i;

    iget-boolean v5, v5, Li93/i;->y:Z

    if-eqz v5, :cond_6

    move-object v5, v1

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    move/from16 v13, p1

    if-gt v5, v13, :cond_1

    move v6, v4

    goto :goto_2

    :cond_1
    move v6, v3

    :goto_2
    sget v7, Lgy0/a;->q3:I

    invoke-static {v7, v10, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    sget v8, Lgy0/f;->p:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v9, v11}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9, v10}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x6

    if-eqz v6, :cond_2

    const v11, -0x748b05d5

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->a()J

    move-result-wide v11

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_2
    const v11, -0x748b015a

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11, v10, v9, v3}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_3
    new-instance v9, Li3/i;

    const/4 v14, 0x3

    invoke-direct {v9, v14}, Li3/i;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v10, v5}, Lp1/q;->e(I)Z

    move-result v15

    or-int/2addr v14, v15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_3

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v15, v14, :cond_4

    :cond_3
    new-instance v15, Ldn0/l;

    const/4 v14, 0x1

    invoke-direct {v15, v0, v5, v14}, Ldn0/l;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v15, Lc93/a;

    const/16 v5, 0xa

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v6, v9, v15, v5}, Landroidx/compose/foundation/selection/b;->c(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v6, v9

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x4

    int-to-float v6, v6

    const/high16 v14, 0x41080000    # 8.5f

    mul-float/2addr v14, v6

    mul-float/2addr v9, v6

    invoke-static {v5, v14, v9}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v6, v8

    move-wide v8, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v7

    move-object v7, v5

    move-object/from16 v5, v16

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    :cond_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lg31/c;->e(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

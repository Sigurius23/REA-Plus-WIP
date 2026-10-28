.class public abstract Lwo1/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aK\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lwo1/b0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Lm91/u;",
        "itemContent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lwo1/a0;->e(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lm91/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwo1/a0;->d(Lkotlin/jvm/functions/Function1;Lm91/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lwo1/b0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x7cc7d032    # 8.299918E36f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v7, v7, 0xc00

    :cond_7
    move-object/from16 v9, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_7

    move-object/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_4

    :cond_9
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v7, v10

    :goto_5
    and-int/lit16 v10, v7, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    if-eq v10, v11, :cond_a

    const/4 v10, 0x1

    goto :goto_6

    :cond_a
    move v10, v12

    :goto_6
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_17

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_b

    move-object v1, v10

    goto :goto_7

    :cond_b
    move-object v1, v6

    :goto_7
    if-eqz v8, :cond_c

    new-instance v6, Le81/f;

    const/4 v8, 0x4

    invoke-direct {v6, v3, v8}, Le81/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const v8, 0x7afef509

    invoke-static {v8, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    move-object v9, v6

    :cond_c
    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v8, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    invoke-static {v8, v0, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/4 v8, 0x3

    int-to-float v8, v8

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float v21, v8, v13

    const/16 v22, 0x7

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, Ll0/m;->g:Ll0/h;

    move-object/from16 p0, v1

    sget-object v1, Lb2/e;->K:Lb2/l;

    const/16 v2, 0x36

    invoke-static {v14, v1, v0, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v0, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v0, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    :cond_11
    invoke-static {v2, v0, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v0, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lwo1/b0;->c()Ljava/lang/String;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v0, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fffa

    move v8, v7

    const/4 v7, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/16 v19, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move-object/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v33, v29

    const/16 v29, 0x0

    move/from16 v34, v28

    move-object/from16 v35, v33

    move-object/from16 v28, v0

    const/4 v0, 0x0

    move-wide/from16 v36, v3

    move v3, v8

    move-object v4, v9

    move-wide/from16 v8, v36

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    invoke-virtual/range {p1 .. p1}, Lwo1/b0;->b()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_13

    const v1, 0x5b00b1f0

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object v1, v6

    :goto_a
    const/4 v2, 0x1

    goto :goto_b

    :cond_13
    const v8, 0x5b00b1f1

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v8

    const/16 v29, 0x0

    const v31, 0x2fffa

    move-object/from16 v28, v6

    move-object v6, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const v6, -0x1b006b46

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lwo1/b0;->a()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v12, v0

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v12, 0x1

    if-ltz v12, :cond_15

    check-cast v7, Lm91/u;

    if-lez v12, :cond_14

    const v9, -0x4165d6db

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x2

    int-to-float v10, v9

    move/from16 v15, v34

    move-object/from16 v12, v35

    invoke-static {v10, v15, v12, v1, v0}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_d

    :cond_14
    move/from16 v15, v34

    move-object/from16 v12, v35

    const/4 v9, 0x2

    const v10, 0x14ababec

    invoke-virtual {v1, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    :goto_d
    shr-int/lit8 v10, v3, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v7, v1, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v35, v12

    move/from16 v34, v15

    move v12, v8

    goto :goto_c

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    move-object/from16 v6, p0

    goto :goto_e

    :cond_17
    move-object v1, v0

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v4, v9

    :goto_e
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lw71/k;

    const/4 v7, 0x2

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v1, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lm91/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lbq1/d;->b()Lm91/p;

    move-result-object v2

    and-int/lit8 p3, p3, 0xe

    sget v0, Lm91/p;->b:I

    shl-int/lit8 v0, v0, 0x3

    or-int v6, p3, v0

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lwo1/a0;->c(Landroidx/compose/ui/Modifier;Lwo1/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

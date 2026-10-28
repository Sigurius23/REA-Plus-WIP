.class public abstract Lf01/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf01/u0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf01/t0;->j(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf01/t0;->g(Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/t0;->h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/t0;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lf01/t0;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf01/u0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x71089956

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v4, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_7

    move v7, v10

    goto :goto_4

    :cond_7
    move v7, v9

    :goto_4
    and-int/2addr v4, v10

    invoke-virtual {v14, v4, v7}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v3

    :goto_5
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v3, 0x3

    int-to-float v3, v3

    int-to-float v2, v2

    mul-float/2addr v3, v2

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-virtual {v5}, Lf01/u0;->g()Z

    move-result v2

    const/4 v3, 0x6

    if-eqz v2, :cond_9

    const v2, 0x5147c2c1

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v14, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->V0()J

    move-result-wide v2

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v2, 0x5147c71d

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2, v14, v3, v9}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v2

    :goto_6
    int-to-float v12, v9

    new-instance v4, Lf01/f;

    const/4 v9, 0x3

    invoke-direct {v4, v9, v5, v6}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, -0x51d1676d

    invoke-static {v9, v14, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x1b0000

    const/16 v16, 0x18

    const/4 v11, 0x0

    move-wide v9, v2

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    goto :goto_7

    :cond_a
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v3

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Le11/b;

    const/16 v3, 0x1a

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final g(Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 37

    move-object/from16 v0, p1

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_13

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v12, v13, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v13, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v8, v13, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->b()Lkd1/o;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v11, 0x3

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object v3, v13

    move-object v13, v9

    move-object v9, v3

    move-object/from16 v3, v17

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0xc8

    int-to-float v8, v8

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v7, v14

    const/16 v14, 0x61b0

    move-object v9, v15

    const/16 v15, 0x68

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v36, v13

    move-object/from16 v35, v16

    move-object/from16 v33, v17

    move-object/from16 v34, v18

    move-object/from16 v32, v19

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->f()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->e()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->c()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const v0, 0xc70c065

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    goto/16 :goto_d

    :cond_5
    :goto_2
    const v6, 0xc5653db

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v6, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v9, v6, v8

    const/4 v10, 0x0

    const/4 v12, 0x5

    const/4 v8, 0x0

    move v11, v9

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v9, v8, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->a()Ly3/f;

    move-result-object v7

    const/4 v8, 0x4

    if-eqz v7, :cond_6

    iget v6, v7, Ly3/f;->w:F

    goto :goto_3

    :cond_6
    int-to-float v7, v8

    mul-float/2addr v6, v7

    :goto_3
    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    move-object/from16 v7, v32

    invoke-static {v6, v7, v13, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    move-object/from16 v11, v33

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_4
    move-object/from16 v12, v34

    goto :goto_5

    :cond_7
    move-object/from16 v11, v33

    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_4

    :goto_5
    invoke-static {v13, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v35

    invoke-static {v13, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    move-object/from16 v10, v36

    goto :goto_6

    :cond_9
    move-object/from16 v10, v36

    goto :goto_7

    :goto_6
    invoke-static {v9, v13, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_7
    invoke-static {v13, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v8

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v7, v13, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v13, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    invoke-static {v7, v13, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v13, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->f()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x5

    if-nez v6, :cond_d

    const v3, 0x784b1ff8

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v3, 0x784b1ff9

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->Q()Lb91/a;

    move-result-object v26

    invoke-virtual {v3, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v8

    new-instance v3, Lw3/k;

    invoke-direct {v3, v1}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lf01/u0;->e()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_e

    const v1, 0x7850f5a9

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v1, 0x1

    goto :goto_b

    :cond_e
    const v3, 0x7850f5aa

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v3, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v8

    new-instance v3, Lw3/k;

    invoke-direct {v3, v1}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    const v1, 0x39104f68

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lf01/u0;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v2

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-ltz v3, :cond_11

    move-object v6, v4

    check-cast v6, Lm91/u;

    invoke-static {}, Lm91/m;->m()Lm91/p;

    move-result-object v7

    new-instance v8, Leg2/a;

    const/16 v3, 0xc

    invoke-direct {v8, v3}, Leg2/a;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_f

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_10

    :cond_f
    new-instance v4, Ldk2/i;

    const/16 v3, 0xe

    invoke-direct {v4, v0, v3}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v13

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v3, v5

    goto :goto_c

    :cond_11
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_12
    const/4 v1, 0x1

    invoke-static {v13, v2, v1, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_d
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x17b95e52

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x52ec1d8b

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

    new-instance v1, Lf01/t0$a;

    invoke-direct {v1}, Lf01/t0$a;-><init>()V

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

    new-instance v0, Lf01/c0;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lf01/c0;-><init>(BII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lf01/t0;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Llf0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/m0;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "advanced-labs_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/l0;->i(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llf0/l0;->g(Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/l0;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llf0/m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/l0;->h(Llf0/m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llf0/m0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, -0x1b00e7a9

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v1, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_3
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_3

    :cond_4
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit16 v7, v3, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_9

    move v7, v10

    goto :goto_6

    :cond_9
    move v7, v9

    :goto_6
    and-int/2addr v3, v10

    invoke-virtual {v13, v3, v7}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    if-eqz v0, :cond_a

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_a
    move-object v0, v2

    :goto_7
    if-eqz v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_b

    new-instance v2, Llc0/g;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Llc0/g;-><init>(I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v2, v6

    :goto_8
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    int-to-float v11, v9

    new-instance v8, Lj21/d;

    const/16 v9, 0xc

    invoke-direct {v8, v9, v5, v2}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, 0x3bbf13a

    invoke-static {v9, v13, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x1b0000

    const/16 v15, 0x18

    const/4 v10, 0x0

    move-wide v8, v3

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    move-object v6, v2

    goto :goto_9

    :cond_d
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v4, v2

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Ll72/h;

    const/16 v3, 0xc

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p0

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v5, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v6, v4

    const/16 v7, 0x8

    int-to-float v12, v7

    mul-float v14, v6, v12

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v6, v13, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v7, v13, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v6

    invoke-virtual {v0}, Llf0/m0;->c()Lkd1/o;

    move-result-object v6

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object v4, v13

    move-object v13, v2

    move-object v2, v9

    move-object v9, v4

    move-object/from16 v32, v16

    move-object/from16 v4, v17

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    sget v7, Lma0/d;->h:I

    invoke-static {v9, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x14

    int-to-float v8, v8

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v8, v10

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static {v8, v10, v14, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move v10, v14

    const/16 v14, 0x6180

    move-object v11, v15

    const/16 v15, 0x68

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    sget-object v10, Ly2/j;->b:Ly2/b1;

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object v1, v13

    move-object/from16 v3, v17

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v33, v6, v18

    invoke-static/range {v33 .. v33}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v6, v7, v13, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v1, v32

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {v7, v13, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v13, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v6, v16

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v1, v6

    invoke-virtual {v0}, Llf0/m0;->e()Ljava/lang/String;

    move-result-object v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v13, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v8

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v30, v4, 0x12

    const v31, 0x2fff8

    move v4, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

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

    const/16 v29, 0x30

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v6, v1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Llf0/m0;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v13, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v6, v33

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v0}, Llf0/m0;->a()Lny0/p0;

    move-result-object v1

    invoke-virtual {v1}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v10, Ly71/g;

    invoke-static {v2}, Lih0/d0;->E(Lx81/d;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v10, v1, v2, v3, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_7

    sget-object v1, Llf0/l0$a;->w:Llf0/l0$a;

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v3, p1

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_8

    if-ne v5, v2, :cond_9

    :cond_8
    new-instance v5, Ljp1/c;

    const/16 v1, 0x16

    invoke-direct {v5, v1, v0, v3}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v18, v5

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v0, v4

    or-int/lit16 v0, v0, 0xc36

    sget v1, Ly71/g;->c:I

    shl-int/lit8 v1, v1, 0xc

    or-int v20, v0, v1

    const/16 v21, 0x0

    const/16 v22, 0xfa0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v28

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v19

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Llf0/m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llf0/m0;->a()Lny0/p0;

    move-result-object p0

    invoke-virtual {p0}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/l0;->e(Landroidx/compose/ui/Modifier;Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

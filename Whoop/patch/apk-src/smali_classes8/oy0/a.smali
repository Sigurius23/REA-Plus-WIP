.class public abstract Loy0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "showLabel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Loy0/a;->e(Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Loy0/a;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x3ff9d072

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v8, v9, :cond_9

    move v8, v14

    goto :goto_6

    :cond_9
    move v8, v13

    :goto_6
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object/from16 v16, v15

    goto :goto_7

    :cond_a
    move-object/from16 v16, v1

    :goto_7
    if-eqz v3, :cond_b

    move v0, v13

    goto :goto_8

    :cond_b
    move v0, v5

    :goto_8
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_c

    new-instance v3, Lou1/a;

    const/16 v5, 0x8

    invoke-direct {v3, v5}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lc93/a;

    move-object/from16 v21, v3

    goto :goto_9

    :cond_d
    move-object/from16 v21, v7

    :goto_9
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_e

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v3

    :cond_e
    move-object/from16 v17, v3

    check-cast v17, Lj0/i;

    sget v1, Lgy0/f;->i2:I

    invoke-static {v10, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    new-instance v1, Li3/i;

    invoke-direct {v1, v13}, Li3/i;-><init>(I)V

    const/16 v22, 0xc

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v1

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v3, v16

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v6, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_f

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v22, Lny0/o;

    sget-object v23, Lny0/q$b;->f:Lny0/q$b;

    sget v24, Lgy0/a;->W2:I

    const/16 v33, 0x3fc

    const/16 v34, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v22 .. v34}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0xe000

    const/4 v6, 0x6

    shl-int/2addr v2, v6

    and-int v11, v2, v1

    const/16 v12, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v1, v6

    move-object/from16 v9, v21

    move-object v6, v5

    move-object/from16 v5, v22

    invoke-static/range {v5 .. v12}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    move-object v2, v9

    if-eqz v0, :cond_12

    const v6, 0x42739da2

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/16 v6, 0x8

    int-to-float v6, v6

    const/high16 v7, 0x3f800000    # 1.0f

    mul-float/2addr v7, v6

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v17, v6, v7

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v7, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v1, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x30

    move/from16 p0, v0

    move/from16 v0, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    move/from16 p0, v0

    move v1, v13

    move v0, v14

    const v5, 0x4277fc4c

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object v3, v2

    move/from16 v2, p0

    goto :goto_c

    :cond_13
    invoke-virtual {v10}, Lp1/q;->X()V

    move v2, v5

    move-object v3, v7

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lbg0/h;

    const/16 v6, 0x17

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Loy0/a;->c(Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

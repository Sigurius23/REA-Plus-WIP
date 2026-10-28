.class public abstract Lny0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lny0/h0;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "localLoading",
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
.method public static synthetic a(Lny0/h0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lny0/g0;->h(Lny0/h0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/g0;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lny0/g0;->i(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lny0/h0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x4a7cf823

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v1

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v8

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    move v11, v13

    :goto_5
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_19

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v15, v11

    goto :goto_6

    :cond_9
    move-object v15, v5

    :goto_6
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_a

    new-instance v5, Lny0/m;

    const/4 v7, 0x1

    invoke-direct {v5, v7}, Lny0/m;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v5, v9

    :goto_7
    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_c

    if-ne v9, v0, :cond_d

    :cond_c
    invoke-virtual {v2}, Lny0/h0;->g()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lp1/c1;

    invoke-static {v9}, Lny0/g0;->f(Lp1/c1;)Z

    move-result v7

    if-nez v7, :cond_f

    invoke-virtual {v2}, Lny0/h0;->g()Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_9

    :cond_e
    move/from16 v31, v13

    :goto_8
    move-object/from16 p0, v15

    goto :goto_a

    :cond_f
    :goto_9
    const/16 v31, 0x1

    goto :goto_8

    :goto_a
    const-wide/16 v14, 0x0

    const/4 v7, 0x7

    const/4 v12, 0x0

    invoke-static {v14, v15, v7, v13, v12}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_10

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_10
    move-object/from16 v16, v7

    check-cast v16, Lj0/i;

    invoke-virtual {v2}, Lny0/h0;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v7

    if-eqz v7, :cond_11

    if-nez v31, :cond_11

    const/16 v18, 0x1

    goto :goto_b

    :cond_11
    move/from16 v18, v13

    :goto_b
    new-instance v7, Li3/i;

    invoke-direct {v7, v13}, Li3/i;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v8, :cond_12

    const/4 v6, 0x1

    goto :goto_c

    :cond_12
    move v6, v13

    :goto_c
    or-int/2addr v6, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_13

    if-ne v8, v0, :cond_14

    :cond_13
    new-instance v8, Ln0/j;

    const/16 v0, 0x9

    invoke-direct {v8, v2, v9, v5, v0}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v20, v8

    check-cast v20, Lc93/a;

    const/16 v21, 0x8

    move-object/from16 v15, p0

    move-object/from16 v19, v7

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v32, v15

    sget-object v6, Lb2/e;->K:Lb2/l;

    int-to-float v1, v1

    int-to-float v3, v3

    const/16 v7, 0x36

    invoke-static {v1, v3, v6, v10, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v1

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

    if-eqz v9, :cond_15

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    invoke-static {v6, v10, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v9, v5

    invoke-virtual {v2}, Lny0/h0;->f()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v7

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object v12, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v35, v28

    const/16 v28, 0x0

    move-object/from16 v36, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    if-eqz v31, :cond_18

    const v5, -0x557c292c

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v6

    mul-float/2addr v3, v3

    move-object/from16 v14, v36

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v0

    const/16 v13, 0x186

    const/16 v14, 0x18

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v13, 0x0

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v0, 0x1

    goto :goto_f

    :cond_18
    move-object/from16 v14, v36

    const/4 v13, 0x0

    const v5, -0x5578ef6f

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/h0;->e()Lgz0/m0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v8

    mul-float/2addr v3, v3

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v32

    move-object/from16 v3, v35

    goto :goto_10

    :cond_19
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_10
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lm31/h;

    const/16 v6, 0x19

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lny0/h0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lny0/g0;->g(Lp1/c1;Z)V

    invoke-virtual {p0}, Lny0/h0;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lny0/g0;->d(Landroidx/compose/ui/Modifier;Lny0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Llr1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llr1/d;",
        "state",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Llr1/d;Landroidx/compose/runtime/Composer;II)V",
        "Llr1/a;",
        "item",
        "c",
        "(Llr1/a;Landroidx/compose/runtime/Composer;I)V",
        "integrations_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llr1/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llr1/c;->f(Landroidx/compose/ui/Modifier;Llr1/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llr1/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llr1/c;->d(Llr1/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llr1/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x3f12a2cc

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v10, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v10

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x0

    const/4 v11, 0x1

    if-eq v4, v10, :cond_2

    move v4, v11

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v4, v2, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Llr1/a;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v7, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X()J

    move-result-wide v5

    const/4 v4, 0x5

    int-to-float v4, v4

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v2, v10

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Llr1/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v4

    invoke-virtual {v13, v7, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v2, Lk71/i;

    const/16 v3, 0x8

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Llr1/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Llr1/c;->c(Llr1/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Llr1/d;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x7b5c20cb

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v5, p3, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, p3, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int v6, p3, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move/from16 v6, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_3

    :cond_5
    move v7, v9

    :goto_3
    and-int/2addr v6, v10

    invoke-virtual {v0, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz v1, :cond_6

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v1, v5

    :goto_4
    const/16 v5, 0x8

    int-to-float v5, v5

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float/2addr v6, v5

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x3

    int-to-float v11, v11

    int-to-float v4, v4

    invoke-static {v7, v11, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v7, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->T()J

    move-result-wide v12

    sget-object v14, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v12, v13, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    mul-float/2addr v3, v5

    const/high16 v12, 0x40200000    # 2.5f

    mul-float/2addr v5, v12

    invoke-static {v4, v3, v3, v3, v5}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v6, v4, v0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v5, v0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Llr1/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v7, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->Q()Lb91/a;

    move-result-object v23

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v15, v12

    move v14, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move/from16 v30, v25

    move-object/from16 v25, v0

    move/from16 v0, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const v4, -0x6a98c6be

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Llr1/d;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llr1/a;

    invoke-static {v5, v3, v0}, Llr1/c;->c(Llr1/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_a
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v5

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Llq2/c;

    const/4 v5, 0x1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Llr1/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llr1/c;->e(Landroidx/compose/ui/Modifier;Llr1/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

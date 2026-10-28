.class public abstract Ldj2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ldj2/b;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "strength-workout_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ldj2/c;->e(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldj2/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ldj2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x6c718668

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v4, p4, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int v5, p4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p4, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v29, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    move-object/from16 v1, v29

    goto :goto_5

    :cond_7
    move-object v1, v4

    :goto_5
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_8

    new-instance v4, Ldh0/a;

    const/16 v5, 0xe

    invoke-direct {v4, v5}, Ldh0/a;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v30, v4

    goto :goto_6

    :cond_9
    move-object/from16 v30, p2

    :goto_6
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v4, v6, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v6, v0, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lyi2/a;->a:I

    invoke-static {v0, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->q()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    new-instance v15, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v15, v12}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v27, v13, 0x12

    const v28, 0x2fdfa

    move-object v7, v4

    const/4 v4, 0x0

    move-object v13, v7

    move v14, v8

    const-wide/16 v7, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v6

    move-wide/from16 v36, v10

    move v11, v5

    move-wide/from16 v5, v36

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    move-object/from16 v19, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v24, v16

    move/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move-object/from16 v31, v1

    move/from16 p0, v25

    move/from16 v1, v33

    move/from16 v2, v34

    move-object/from16 v25, v0

    move-object/from16 v0, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p1 .. p1}, Ldj2/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_d

    const v4, 0x95855cb

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v2

    mul-float v12, v4, p0

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, v29

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ldj2/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->G()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    new-instance v15, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v15, v6}, Lw3/k;-><init>(I)V

    const/16 v26, 0x30

    const v28, 0x2fdf8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v3

    move-object v3, v5

    move-wide v5, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const/4 v14, 0x0

    const v0, 0x95cd774

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move-object/from16 v25, v3

    move-object/from16 v3, v30

    move-object/from16 v1, v31

    goto :goto_9

    :cond_e
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v25, v3

    move-object v1, v4

    move-object/from16 v3, p2

    :goto_9
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lc41/d1;

    const/16 v6, 0x18

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ldj2/c;->c(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

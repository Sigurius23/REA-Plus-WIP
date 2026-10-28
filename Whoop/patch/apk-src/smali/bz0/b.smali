.class public abstract Lbz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbz0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj61/f;",
        "lineState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lj61/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbz0/b;->c(Landroidx/compose/ui/Modifier;Lj61/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, -0x115eac5a

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p4, 0x2

    if-nez v6, :cond_4

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v1, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v5, p3, 0x1

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_9

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_8
    move-object/from16 v26, v0

    move-object v0, v4

    goto :goto_6

    :cond_9
    :goto_5
    if-eqz v2, :cond_a

    move-object v4, v6

    :cond_a
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_8

    new-instance v10, Lj61/f;

    const/16 v18, 0x7f

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v4

    move-object/from16 v26, v10

    :goto_6
    invoke-virtual {v1}, Lp1/q;->r()V

    invoke-virtual/range {v26 .. v26}, Lj61/f;->b()Lg61/f;

    move-result-object v2

    sget-object v4, Lbz0/b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    if-eq v2, v9, :cond_c

    if-ne v2, v3, :cond_b

    const v2, -0x582917fd

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {v26 .. v26}, Lj61/f;->g()F

    move-result v3

    invoke-virtual/range {v26 .. v26}, Lj61/f;->a()Lp91/a;

    move-result-object v4

    invoke-static {v2, v3, v5, v4}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v9

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {v26 .. v26}, Lj61/f;->c()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v1, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-static {v3, v4}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    invoke-static {v2, v3}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v1, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    move-object v11, v0

    goto/16 :goto_b

    :cond_b
    const v0, -0x3464eb03    # -2.0326906E7f

    invoke-static {v0, v1, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_c
    const v2, -0x5837d1a3

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v9

    invoke-virtual/range {v26 .. v26}, Lj61/f;->g()F

    move-result v3

    sub-float v3, v2, v3

    invoke-virtual/range {v26 .. v26}, Lj61/f;->a()Lp91/a;

    move-result-object v7

    invoke-static {v6, v5, v3, v7}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v7, v5, v1, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v10, v1, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v7, v1, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v0

    invoke-virtual/range {v26 .. v26}, Lj61/f;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    const v0, 0x4eb0ecce

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    move/from16 v34, v2

    move-object/from16 v33, v3

    move v13, v4

    move-object v12, v6

    move v14, v8

    goto/16 :goto_a

    :cond_10
    const v5, 0x4eb0eccf

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v5, v1, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->d()Lb91/a;

    move-result-object v20

    invoke-virtual/range {v26 .. v26}, Lj61/f;->e()Ly81/e;

    move-result-object v5

    if-nez v5, :cond_11

    const v5, -0x53c2cfba

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto :goto_8

    :cond_11
    const v7, 0x70e9331b

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-interface {v5, v1, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-static {v1, v8, v10, v11}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v5

    :goto_8
    if-nez v5, :cond_12

    const v5, 0x70e9395b

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {v26 .. v26}, Lj61/f;->f()Lj61/i;

    move-result-object v5

    invoke-virtual {v5}, Lj61/i;->getColor()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v1, v8}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_12
    const v7, 0x70e92fab

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-wide v10, v5, Li2/x;->a:J

    :goto_9
    const/16 v24, 0x0

    const v25, 0x2fffa

    move-object/from16 v22, v1

    const/4 v1, 0x0

    move v7, v4

    const-wide/16 v4, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    move v13, v7

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    move v15, v2

    move/from16 v16, v9

    move-wide/from16 v36, v10

    move-object v11, v3

    move-wide/from16 v2, v36

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v27, v16

    const/16 v16, 0x0

    move-object/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v28

    move-object/from16 v35, v29

    move/from16 v34, v32

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v22

    const/4 v0, 0x5

    int-to-float v0, v0

    move-object/from16 v12, v35

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    :goto_a
    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v15, v34

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v11, v33

    invoke-interface {v0, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {v26 .. v26}, Lj61/f;->c()Ly81/e;

    move-result-object v2

    invoke-interface {v2, v1, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object v2

    invoke-static {v0, v2}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v1, v14}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    :goto_b
    move-object v3, v11

    move-object/from16 v5, v26

    goto :goto_c

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v5, v0

    move-object v3, v4

    :goto_c
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v2, Lbz0/a;

    const/4 v7, 0x0

    move/from16 v4, p3

    move/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lbz0/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lj61/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lbz0/b;->b(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

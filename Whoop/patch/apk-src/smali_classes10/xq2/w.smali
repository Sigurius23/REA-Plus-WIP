.class public abstract Lxq2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lxq2/u;",
        "state",
        "Ll83/a0;",
        "b",
        "(Lxq2/u;Landroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lxq2/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxq2/w;->c(Lxq2/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lxq2/u;Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x72218c7

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, p2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int v3, p2, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p2

    :goto_2
    and-int/lit8 v6, v3, 0x3

    const/4 v8, 0x1

    if-eq v6, v5, :cond_3

    move v6, v8

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v3, v8

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v3, Lb2/e;->N:Lb2/k;

    int-to-float v6, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v6, v9

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/16 v10, 0x36

    invoke-static {v6, v3, v2, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v2, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v2, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v10, v2, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v8, 0xa

    int-to-float v8, v8

    int-to-float v4, v4

    mul-float/2addr v8, v4

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x3

    int-to-float v10, v10

    invoke-static {v8, v10, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Li91/c;->o(J)Li91/a;

    move-result-object v13

    invoke-static {v4, v13}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v17, v6

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    mul-float/2addr v5, v9

    const/4 v6, 0x0

    const/4 v13, 0x2

    invoke-static {v4, v5, v6, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object v6, v12

    iget-wide v12, v2, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v2, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v2, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v17

    invoke-static {v2, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v9, v2, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v2, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lxq2/u;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v2, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v2, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->A()Lb91/a;

    move-result-object v22

    invoke-virtual {v8, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v26, v16, 0x12

    const v27, 0x2fffa

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 v18, v6

    move-object/from16 v17, v7

    const-wide/16 v6, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move/from16 v20, v9

    const/4 v9, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move-object/from16 v23, v5

    move-wide v4, v12

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    const/4 v14, 0x0

    move-object/from16 v30, v15

    move-object/from16 v29, v16

    const-wide/16 v15, 0x0

    move-object/from16 v31, v17

    const/16 v17, 0x0

    move-object/from16 v32, v18

    const/16 v18, 0x0

    move-object/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v37, v25

    const/16 v25, 0x0

    move-object/from16 v0, v29

    move-object/from16 v38, v30

    move-object/from16 v41, v31

    move-object/from16 v45, v32

    move-object/from16 v42, v33

    move/from16 v44, v34

    move/from16 v43, v35

    move-object/from16 v39, v36

    move-object/from16 v40, v37

    const/4 v1, 0x1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v3, v0, v2, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, v2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v6, v45

    invoke-static {v2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    move-object/from16 v6, v28

    invoke-virtual {v2, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v6, v38

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v2, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v39

    invoke-static {v2, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v2, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    move-object/from16 v13, v40

    goto :goto_9

    :cond_c
    :goto_8
    move-object/from16 v0, v41

    goto :goto_a

    :goto_9
    invoke-static {v3, v2, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v2, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxq2/u;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v3, v44

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, v42

    move/from16 v5, v43

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v25, 0x0

    const v27, 0x2fffa

    move/from16 v34, v3

    const/4 v3, 0x0

    move-object/from16 v33, v4

    move/from16 v35, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v2

    move/from16 v1, v35

    move-object v2, v0

    move/from16 v0, v34

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lxq2/u;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, v33

    invoke-virtual {v4, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    const/4 v3, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_d
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lxq2/b;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lxq2/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Lxq2/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lxq2/w;->b(Lxq2/u;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Lxq2/u;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/w;->b(Lxq2/u;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

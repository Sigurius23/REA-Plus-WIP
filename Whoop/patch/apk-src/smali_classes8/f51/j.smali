.class public abstract Lf51/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf51/k;",
        "viewState",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lf51/k;Landroidx/compose/runtime/Composer;II)V",
        "Lf51/m;",
        "item",
        "e",
        "(Lf51/m;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lf51/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf51/j;->f(Lf51/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lf51/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf51/j;->d(Landroidx/compose/ui/Modifier;Lf51/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lf51/k;Landroidx/compose/runtime/Composer;II)V
    .locals 47

    move-object/from16 v3, p1

    sget-object v0, Lb2/e;->M:Lb2/k;

    const-string v1, "viewState"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, 0x5ecb7d53

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v6, p3, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, p3, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    or-int v7, p3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move/from16 v7, p3

    :goto_1
    and-int/lit8 v8, p3, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, v7, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_5

    move v8, v11

    goto :goto_3

    :cond_5
    move v8, v10

    :goto_3
    and-int/2addr v7, v11

    invoke-virtual {v1, v7, v8}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_16

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v2, v7

    goto :goto_4

    :cond_6
    move-object v2, v6

    :goto_4
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v4, v4

    int-to-float v5, v5

    invoke-static {v8, v4, v5}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v8, v1, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->q()J

    move-result-wide v12

    invoke-static {v12, v13}, Li91/c;->o(J)Li91/a;

    move-result-object v8

    invoke-static {v5, v8}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v4, v8

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    invoke-static {v12, v0, v1, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v1, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v6, v1, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v1, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v1, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v13, v1, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x4cf63915

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lf51/k;->b()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_6
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v31, v5

    check-cast v31, Lf51/l;

    int-to-float v5, v11

    mul-float v32, v5, v8

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    invoke-static {v5, v0, v1, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v12, v1, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v1, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v1, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    invoke-static {v6, v1, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v31 .. v31}, Lf51/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9, v1, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v11, v1, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    invoke-virtual {v11, v1, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v16

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object v11, v5

    const/4 v5, 0x0

    move/from16 v19, v4

    move/from16 v18, v8

    move-object v4, v9

    const-wide/16 v8, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v25, v13

    move-object/from16 v23, v14

    const-wide/16 v13, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v27, v7

    move-wide/from16 v45, v16

    move-object/from16 v17, v6

    move-wide/from16 v6, v45

    const/16 v16, 0x0

    move-object/from16 v34, v17

    move/from16 v33, v18

    const-wide/16 v17, 0x0

    move/from16 v35, v19

    const/16 v19, 0x0

    move/from16 v36, v20

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v27

    const/16 v27, 0x0

    move-object/from16 v36, v26

    move-object/from16 v43, v34

    move-object/from16 v42, v38

    move-object/from16 v3, v41

    move-object/from16 v26, v1

    move-object/from16 v34, v2

    move-object/from16 v1, v39

    move/from16 v2, v40

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    invoke-static {v5, v0, v4, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    invoke-virtual {v4, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v1, v36

    goto :goto_9

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v11, v37

    invoke-static {v4, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    move-object/from16 v1, v42

    goto :goto_b

    :cond_f
    :goto_a
    move-object/from16 v1, v43

    goto :goto_c

    :goto_b
    invoke-static {v6, v4, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v4, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x3c769e01

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {v31 .. v31}, Lf51/l;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf51/m;

    const/4 v6, 0x0

    invoke-static {v5, v4, v6}, Lf51/j;->e(Lf51/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_10
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    move v9, v2

    move-object v7, v3

    move-object v1, v4

    move v11, v5

    move v10, v6

    move/from16 v8, v33

    move-object/from16 v2, v34

    move/from16 v4, v35

    move-object/from16 v3, p1

    goto/16 :goto_6

    :cond_11
    move-object/from16 v34, v2

    move/from16 v35, v4

    move-object v3, v7

    move v2, v9

    move v6, v10

    move v5, v11

    move-object v4, v1

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lf51/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_12

    const v0, -0x51c7dc0c

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move v1, v5

    goto/16 :goto_f

    :cond_12
    const v7, -0x51c7dc0b

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-static/range {v35 .. v35}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    invoke-static {v7, v0, v4, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_13

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_13
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_e
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_14
    invoke-static {v7, v4, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v5

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v7

    invoke-static {v7, v8}, Li91/c;->o(J)Li91/a;

    move-result-object v7

    invoke-static {v0, v7}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v4, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1, v4, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    const/16 v28, 0x0

    const v29, 0x2fffa

    move/from16 v44, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    move v0, v6

    move-wide v6, v1

    move/from16 v1, v44

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v34

    goto :goto_10

    :cond_16
    move-object v4, v1

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v1, v6

    :goto_10
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Ld62/b;

    const/16 v5, 0x1b

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lf51/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf51/j;->c(Landroidx/compose/ui/Modifier;Lf51/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lf51/m;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x28c8c6e0

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v5, v8

    const/4 v8, 0x0

    invoke-static {v3, v8, v5, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v5, v8, v2, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v8, v2, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf51/m;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v5, v2, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    float-to-double v11, v4

    const-wide/16 v13, 0x0

    cmpl-double v11, v11, v13

    if-lez v11, :cond_6

    :goto_4
    move-object/from16 v24, v2

    move-object v2, v3

    goto :goto_5

    :cond_6
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v26, 0x0

    const v27, 0x2fff8

    move v4, v6

    move v11, v7

    const-wide/16 v6, 0x0

    move v12, v8

    const/4 v8, 0x0

    move v13, v4

    move-wide/from16 v32, v9

    move-object v10, v5

    move-wide/from16 v4, v32

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move v15, v11

    move/from16 v16, v12

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v1, v29

    move-object/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lf51/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/4 v12, 0x6

    invoke-virtual {v0, v2, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lf51/m;->b()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const v27, 0x2fffa

    move-object v2, v3

    const/4 v3, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Ld71/c;

    const/4 v2, 0x7

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Lf51/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lf51/j;->e(Lf51/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

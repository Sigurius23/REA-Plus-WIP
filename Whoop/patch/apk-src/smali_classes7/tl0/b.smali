.class public abstract Ltl0/b;
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
        "Ltl0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltl0/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltl0/b;->e(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ltl0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x460f6384

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, p4, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v12, 0x12

    const/4 v14, 0x1

    if-eq v5, v12, :cond_5

    move v5, v14

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v4, v14

    invoke-virtual {v13, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v15

    goto :goto_4

    :cond_6
    move-object v0, v3

    :goto_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_7

    new-instance v3, Lt71/i;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lt71/i;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v3

    goto :goto_5

    :cond_8
    move-object/from16 v29, p2

    :goto_5
    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v3, v9, v13, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move/from16 p3, v12

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v5, v13, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v13, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v14, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v1, v14, v13, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v13, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v4, v13, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v13, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v11, v5

    mul-float/2addr v1, v11

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v4, v3

    invoke-virtual/range {p1 .. p1}, Ltl0/c;->a()Lkd1/o;

    move-result-object v3

    sget v7, Lkd1/o;->a:I

    move-object v5, v8

    const/4 v8, 0x3

    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object/from16 v31, v6

    move-object v6, v13

    move-object/from16 v30, v19

    move-object/from16 v13, v20

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v6, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    move-object/from16 v17, v9

    const/16 v9, 0x1b0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-wide/from16 v37, v7

    move-object v8, v6

    move-wide/from16 v6, v37

    move-object/from16 p0, v0

    move/from16 v33, v5

    move-object/from16 v0, v19

    move-object v5, v1

    move-object/from16 v1, v17

    move/from16 v17, v11

    move-object/from16 v11, v20

    invoke-static/range {v3 .. v10}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/4 v4, 0x0

    invoke-static {v3, v1, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    invoke-virtual {v6, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v6, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v30

    invoke-static {v6, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    :cond_10
    move-object/from16 v5, v31

    goto :goto_9

    :cond_11
    move-object/from16 v5, v31

    goto :goto_a

    :goto_9
    invoke-static {v3, v6, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_a
    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v7

    const/16 v7, 0x36

    invoke-static {v3, v2, v14, v6, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_12

    invoke-virtual {v6, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v6, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Ltl0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v0, v33

    invoke-virtual {v11, v6, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->r()Lb91/a;

    move-result-object v23

    invoke-virtual {v11, v6, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    sget-object v5, Ly2/d;->a:Ly2/m;

    move/from16 v18, v4

    new-instance v4, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v4, v5}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v27, v9, 0x12

    const v28, 0x2fff8

    move-object v9, v5

    move-object/from16 v25, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object v14, v12

    const-wide/16 v12, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v17

    const/16 v24, 0x1

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move-object/from16 v36, v30

    move/from16 v30, v2

    move-object/from16 v2, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual/range {p1 .. p1}, Ltl0/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v6, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->E()Lb91/a;

    move-result-object v23

    invoke-virtual/range {p1 .. p1}, Ltl0/c;->e()Ly81/e;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v6, v5}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    move-wide v5, v4

    new-instance v4, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    move-object/from16 v10, v36

    invoke-direct {v4, v10}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/4 v10, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ltl0/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v6, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->d()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v6, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const v28, 0x2fffa

    move-wide v5, v4

    const/4 v4, 0x0

    move v0, v3

    move-object v3, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v25

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    int-to-float v1, v0

    mul-float v7, v1, v30

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float v6, v1, v33

    const/4 v9, 0x0

    const/16 v10, 0x8

    move v8, v6

    move-object/from16 v5, v32

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x0

    const/16 v15, 0xfe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v13

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v3, v29

    goto :goto_c

    :cond_15
    move-object v6, v13

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v3

    move-object/from16 v3, p2

    :goto_c
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lt01/e;

    const/4 v6, 0x5

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ltl0/b;->c(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

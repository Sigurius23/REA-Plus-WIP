.class public abstract Lsj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0019\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lnj1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lnj1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lmj1/a;",
        "onNavigationEvent",
        "f",
        "(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "padding",
        "j",
        "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;",
        "health-connect_release"
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
.method public static synthetic a(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsj1/a;->i(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly2/j1;FLy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsj1/a;->l(Ly2/j1;FLy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lnj1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsj1/a;->h(Lkotlin/jvm/functions/Function1;Lnj1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsj1/a;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsj1/a;->k(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x251f4d09

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v7, 0x92

    const/4 v9, 0x0

    if-eq v5, v7, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    move v5, v9

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    instance-of v5, v1, Lnj1/c$b;

    if-nez v5, :cond_7

    sget-object v5, Lnj1/c$a;->a:Lnj1/c$a;

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    move v5, v9

    move-object v12, v11

    goto :goto_5

    :cond_8
    instance-of v0, v1, Lnj1/c$c;

    if-eqz v0, :cond_9

    const v0, 0xa97bdd3

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v0, Lsz0/p0$c;->f:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v0, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v0, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v4, v3

    move-object v3, v2

    goto/16 :goto_11

    :cond_9
    move v0, v9

    move-object v12, v11

    const v1, -0x5a801032

    invoke-static {v1, v12, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :goto_5
    const v7, 0xa7f6122

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lnj1/c$a;->a:Lnj1/c$a;

    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move v14, v7

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v6, v12, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lgj1/a;->a:I

    const/4 v9, 0x0

    invoke-static {v6, v12, v9}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    move-object/from16 v18, v7

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v19, v13

    const/16 v13, 0x61b0

    move/from16 v20, v14

    const/16 v14, 0x68

    move-object/from16 v21, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    sget-object v9, Ly2/j;->d:Ly2/b1;

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v2, v18

    move-object/from16 v4, v19

    move/from16 v26, v20

    move-object/from16 v1, v22

    move-object/from16 v3, v24

    move/from16 v18, v0

    move/from16 v0, v25

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v6, v7, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_9

    :cond_e
    :goto_8
    move-object/from16 v8, v21

    goto :goto_a

    :cond_f
    :goto_9
    invoke-static {v9, v12, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v12, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x1

    const/4 v9, 0x0

    invoke-static {v9, v12, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v10

    const/16 v9, 0xe

    invoke-static {v3, v10, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    float-to-double v10, v0

    const-wide/16 v13, 0x0

    cmpl-double v10, v10, v13

    if-lez v10, :cond_10

    goto :goto_b

    :cond_10
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    invoke-static {v9, v5, v0}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v6, v7, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v6, v12, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v12, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v27, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v29

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v31

    const/16 v41, 0x1fe5

    const/16 v42, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const-string v32, "Back button"

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v27 .. v42}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v0, v18

    and-int/lit16 v1, v0, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_14

    const/4 v8, 0x1

    goto :goto_d

    :cond_14
    const/4 v8, 0x0

    :goto_d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_16

    if-ne v1, v2, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v4, p2

    goto :goto_f

    :cond_16
    :goto_e
    new-instance v1, Lsg2/i;

    const/4 v3, 0x1

    move-object/from16 v4, p2

    invoke-direct {v1, v4, v3}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    move-object v8, v1

    check-cast v8, Lc93/a;

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;->p:I

    shl-int/lit8 v1, v1, 0x3

    const/16 v13, 0x34

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v12

    move-object/from16 v6, v27

    move v12, v1

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v11

    and-int/lit8 v1, v0, 0x70

    and-int/lit16 v0, v0, 0x3f0

    move-object/from16 v3, p1

    move/from16 v14, v26

    invoke-static {v14, v3, v4, v12, v0}, Ltj1/b;->c(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    const/16 v0, 0x20

    if-ne v1, v0, :cond_17

    const/4 v8, 0x1

    goto :goto_10

    :cond_17
    const/4 v8, 0x0

    :goto_10
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_18

    if-ne v0, v2, :cond_19

    :cond_18
    new-instance v0, Lsg2/b;

    const/4 v1, 0x3

    invoke-direct {v0, v3, v1}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-static {v14, v0, v12, v9}, Ltj1/a;->c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-static {v12, v5, v5, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_11

    :cond_1a
    move-object v4, v3

    move-object v12, v11

    move-object v3, v2

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Ls01/e;

    const/4 v5, 0x6

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lmj1/a$a;->a:Lmj1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lnj1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsj1/a;->f(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$removeParentPadding"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lev2/g;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lev2/g;-><init>(FI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p3, Ly3/a;->a:J

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result p3

    invoke-interface {p1, p0}, Ly3/c;->F(F)I

    move-result v0

    add-int v4, v0, p3

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget v0, p2, Ly2/j1;->x:I

    new-instance v1, Lmi2/j;

    const/4 v2, 0x1

    invoke-direct {v1, p2, p0, v2}, Lmi2/j;-><init>(Ly2/j1;FI)V

    sget-object p0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, v0, p0, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ly2/j1;FLy2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ly3/c;->F(F)I

    move-result p1

    neg-int p1, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, p0, p1, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

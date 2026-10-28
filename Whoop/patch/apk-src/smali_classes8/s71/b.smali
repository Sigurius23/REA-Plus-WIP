.class public abstract Ls71/b;
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
        "Ls71/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls71/b;->e(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls71/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls71/c;",
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

    const v0, -0xafa3a94

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, p4, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    move v5, v1

    :goto_0
    or-int v5, p4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v13, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v5

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_7

    new-instance v4, Ls32/d;

    const/16 v6, 0xb

    invoke-direct {v4, v6}, Ls32/d;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v4

    goto :goto_5

    :cond_8
    move-object/from16 v29, p2

    :goto_5
    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v6, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v6, v13, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls71/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_c

    const v4, 0xb12a070

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ls71/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v14, 0x0

    const/16 v15, 0xf7

    move v4, v3

    const/4 v3, 0x0

    move v7, v4

    const/4 v4, 0x0

    move-object v10, v5

    const/4 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move v12, v8

    move/from16 v16, v9

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    move/from16 v18, v11

    const-wide/16 v10, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 p0, v0

    move-object/from16 v0, v17

    move/from16 v2, v18

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v1

    int-to-float v4, v2

    const/4 v9, 0x0

    invoke-static {v3, v4, v0, v13, v9}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_7

    :cond_c
    move-object/from16 p0, v0

    move v2, v3

    move-object v0, v5

    move v9, v8

    const v3, 0xb1484b1

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_7
    const v3, -0x6aff53a9

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ls71/c;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lo21/c;

    const/4 v7, 0x0

    const/4 v8, 0x5

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, v13

    invoke-static/range {v3 .. v8}, Lo21/b;->d(Landroidx/compose/ui/Modifier;Lo21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v1

    int-to-float v4, v2

    invoke-static {v3, v4, v0, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ls71/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    const v3, 0xb17e493

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ls71/c;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    const v3, 0xb1866df

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    int-to-float v1, v1

    int-to-float v2, v2

    invoke-static {v1, v2, v0, v13, v9}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_e
    const v0, 0xb199ab1

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p1 .. p1}, Ls71/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v13, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v0, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    move v12, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v30, v12

    move-object/from16 v25, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v0, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v25

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v0, 0x1

    goto :goto_b

    :cond_f
    move v0, v9

    const v1, 0xb1d0671

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v3, v29

    goto :goto_c

    :cond_10
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v1, v4

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Ls51/b;

    const/4 v6, 0x4

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ls71/b;->c(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

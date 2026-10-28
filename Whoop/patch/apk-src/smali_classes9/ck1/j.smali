.class public abstract Lck1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001aU\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lck1/k;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClick",
        "Lkotlin/Function1;",
        "Ljava/io/File;",
        "onShareClick",
        "",
        "onError",
        "g",
        "(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "health-monitor_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lck1/j;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lck1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lck1/j;->k(Lck1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/io/File;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/j;->i(Ljava/io/File;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lck1/j;->m(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/j;->j(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lck1/j;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lck1/k;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0xa688d14

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit16 v13, v0, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_b

    const/4 v13, 0x1

    goto :goto_8

    :cond_b
    move v13, v15

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v12, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_24

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_c

    new-instance v4, Lcj0/f;

    const/4 v14, 0x7

    invoke-direct {v4, v14}, Lcj0/f;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lc93/a;

    move-object v9, v4

    goto :goto_9

    :cond_d
    move-object/from16 v9, p1

    :goto_9
    if-eqz v7, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_e

    new-instance v4, Lcj2/a;

    const/16 v7, 0xc

    invoke-direct {v4, v7}, Lcj2/a;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object/from16 v4, p2

    :goto_a
    if-eqz v10, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_10

    new-instance v7, Lcj2/a;

    const/16 v10, 0xd

    invoke-direct {v7, v10}, Lcj2/a;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    :cond_11
    and-int/lit8 v7, v0, 0xe

    or-int/lit8 v10, v7, 0x30

    const-string v14, "healthcare_health_monitor_share_report"

    invoke-static {v1, v14, v12, v10}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v8, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_12

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 p3, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_c

    :cond_13
    move-object/from16 p3, v8

    :goto_c
    invoke-static {v2, v12, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v20, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Luj1/a;->c:I

    const/4 v8, 0x0

    move-object/from16 v38, v9

    const/4 v9, 0x2

    invoke-direct {v5, v6, v8, v9, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Ly71/g;

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9}, Lyb0/f;->a(Lx81/d;)I

    move-result v8

    sget v21, Lgy0/f;->K:I

    move-object/from16 v22, v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-direct {v6, v8, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    instance-of v5, v1, Lck1/k$c;

    if-eqz v5, :cond_15

    new-instance v8, Ly71/g;

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/k0;->e0()I

    move-result v9

    sget v21, Lgy0/f;->i2:I

    move/from16 v39, v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-direct {v8, v9, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object/from16 v24, v8

    goto :goto_d

    :cond_15
    move/from16 v39, v5

    const/16 v24, 0x0

    :goto_d
    const/16 v36, 0x7ff2

    const/16 v37, 0x0

    move-object/from16 v21, v22

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v23, v6

    invoke-direct/range {v20 .. v37}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    if-ne v7, v5, :cond_16

    const/4 v5, 0x1

    goto :goto_e

    :cond_16
    const/4 v5, 0x0

    :goto_e
    and-int/lit16 v6, v0, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_17

    const/4 v6, 0x1

    goto :goto_f

    :cond_17
    const/4 v6, 0x0

    :goto_f
    or-int/2addr v5, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_18

    if-ne v6, v13, :cond_19

    :cond_18
    new-instance v6, Lbs1/v;

    const/16 v5, 0x12

    invoke-direct {v6, v1, v4, v5}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lc93/a;

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v5, v5, 0x3

    shl-int/lit8 v7, v0, 0x6

    and-int/lit16 v7, v7, 0x1c00

    or-int/2addr v5, v7

    move-object v7, v14

    const/16 v14, 0x25

    move-object v8, v10

    move-object v10, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v22, v4

    move-object v1, v7

    move-object v4, v9

    move-object/from16 v40, v13

    move-object/from16 v23, v16

    move-object/from16 v7, v20

    move-object/from16 v9, v38

    move/from16 v16, v0

    move v13, v5

    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v5, p3

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1a

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v12, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_1b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    :cond_1b
    invoke-static {v9, v12, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, p0

    instance-of v3, v2, Lck1/k$b;

    if-eqz v3, :cond_1d

    const v0, -0x3dc76047

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$c;->f:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    or-int v19, v0, v1

    const/16 v20, 0x6

    const/16 v21, 0xbfc

    move v0, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    move v3, v0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v18

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object/from16 v4, v23

    :goto_11
    const/4 v0, 0x1

    goto/16 :goto_17

    :cond_1d
    move v3, v8

    if-eqz v39, :cond_21

    const v4, -0x3dc23b81

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v0, v2

    check-cast v0, Lck1/k$c;

    invoke-virtual {v0}, Lck1/k$c;->b()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    move/from16 v0, v16

    and-int/lit16 v0, v0, 0x1c00

    const/16 v1, 0x800

    if-ne v0, v1, :cond_1e

    const/4 v15, 0x1

    goto :goto_12

    :cond_1e
    move v15, v3

    :goto_12
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_20

    move-object/from16 v1, v40

    if-ne v0, v1, :cond_1f

    goto :goto_13

    :cond_1f
    move-object/from16 v4, v23

    goto :goto_14

    :cond_20
    :goto_13
    new-instance v0, La61/a;

    const/16 v1, 0x14

    move-object/from16 v4, v23

    invoke-direct {v0, v4, v1}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v10, v0

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x0

    const/16 v20, 0x6cc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v18

    const v18, 0x6030006

    invoke-static/range {v6 .. v20}, Lv41/d0;->y(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv41/t;Ll0/l;Lkotlin/jvm/functions/Function1;ZZZZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_21
    move/from16 v0, v16

    move-object/from16 v4, v23

    instance-of v1, v2, Lck1/k$a;

    if-eqz v1, :cond_23

    const v1, -0x3dbacdd9

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    new-instance v5, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v1, Luj1/a;->a:I

    const/4 v9, 0x2

    const/4 v11, 0x0

    invoke-direct {v6, v1, v11, v9, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    check-cast v1, Lck1/k$a;

    invoke-virtual {v1}, Lck1/k$a;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_22

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lck1/k$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/4 v9, 0x2

    :goto_15
    move-object v7, v6

    goto :goto_16

    :cond_22
    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v1, Luj1/a;->b:I

    const/4 v9, 0x2

    invoke-direct {v6, v1, v11, v9, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_15

    :goto_16
    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v6, Luj1/a;->d:I

    invoke-direct {v1, v6, v11, v9, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lsz0/p0$b;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v6, v8

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v8, 0x9

    or-int/2addr v6, v8

    const v8, 0xe000

    shl-int/lit8 v0, v0, 0x9

    and-int/2addr v0, v8

    or-int v19, v6, v0

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v9, v1

    move-object v6, v5

    move-object/from16 v10, v38

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v18

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_11

    :goto_17
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v22

    goto :goto_18

    :cond_23
    const v0, -0x6516f794

    invoke-static {v0, v12, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_24
    move-object v2, v1

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v38, p1

    move-object/from16 v3, p2

    move-object v4, v11

    :goto_18
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, La81/f;

    const/16 v7, 0xd

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v1, v2

    move-object/from16 v2, v38

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Ljava/io/File;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lck1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    instance-of v0, p0, Lck1/k$c;

    if-eqz v0, :cond_0

    check-cast p0, Lck1/k$c;

    invoke-virtual {p0}, Lck1/k$c;->b()Ljava/io/File;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Ll83/a0;
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lck1/j;->g(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

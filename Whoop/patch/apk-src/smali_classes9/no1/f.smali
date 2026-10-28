.class public abstract Lno1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llo1/c$e;",
        "viewState",
        "",
        "analyticsSource",
        "Lkotlin/Function1;",
        "Llo1/a;",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "cyclePhaseStyle",
        "Li2/t;",
        "j",
        "(Lcom/whoop/design/models/items/CyclePhaseStyle;Landroidx/compose/runtime/Composer;I)Li2/t;",
        "hormonal-insights_release"
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
.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lno1/f;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno1/f;->i(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno1/f;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llo1/c$e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lno1/f;->h(Llo1/c$e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo1/c$e;",
            "Ljava/lang/String;",
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

    const-string v0, "analyticsSource"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x598ec29f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    if-eq v5, v8, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    move v5, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_20

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v11, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v10, 0xa0

    int-to-float v10, v10

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v1}, Llo1/c$e;->d()Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v10

    const/4 v12, 0x0

    invoke-static {v10, v11, v12}, Lno1/f;->j(Lcom/whoop/design/models/items/CyclePhaseStyle;Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v10

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v4, 0x6

    invoke-static {v9, v10, v5, v12, v4}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v11, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    move/from16 v21, v4

    invoke-static/range {v20 .. v20}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v9, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v9, v13

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v12, v11, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v11, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x1

    int-to-float v5, v4

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v5, v10

    const/4 v12, 0x0

    invoke-static {v8, v12, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const/4 v5, 0x2

    int-to-float v13, v5

    mul-float v27, v13, v10

    const/16 v29, 0x0

    const/16 v30, 0xd

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Llo1/c$e;->b()Llo1/c$c;

    move-result-object v10

    invoke-virtual {v10}, Llo1/c$c;->b()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    invoke-virtual {v1}, Llo1/c$e;->b()Llo1/c$c;

    move-result-object v10

    invoke-virtual {v10}, Llo1/c$c;->a()Llo1/c$d;

    move-result-object v10

    if-eqz v10, :cond_e

    invoke-virtual {v10}, Llo1/c$d;->a()Lgz0/m0;

    move-result-object v10

    if-eqz v10, :cond_e

    new-instance v13, Ly71/g;

    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v10

    const-string v19, "Close"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v13, v10, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object/from16 v32, v13

    goto :goto_8

    :cond_e
    const/16 v32, 0x0

    :goto_8
    new-instance v28, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x7ff6

    const/16 v45, 0x0

    invoke-direct/range {v28 .. v45}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v4, v0, 0x380

    const/16 v10, 0x100

    if-ne v4, v10, :cond_f

    const/4 v13, 0x1

    goto :goto_9

    :cond_f
    const/4 v13, 0x0

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v19, v7

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_10

    if-ne v10, v7, :cond_11

    :cond_10
    new-instance v10, Lmf2/e;

    const/16 v13, 0x17

    invoke-direct {v10, v3, v13}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lc93/a;

    sget v13, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v25, v7

    const/4 v7, 0x3

    shl-int/2addr v13, v7

    or-int/lit8 v13, v13, 0x6

    move/from16 v21, v12

    move v12, v13

    const/16 v13, 0x2c

    move/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v29, v8

    const/4 v8, 0x0

    move-object/from16 v30, v9

    move-object v9, v10

    const/4 v10, 0x0

    move/from16 v33, v0

    move/from16 v34, v4

    move-object/from16 v16, v6

    move-object/from16 v2, v19

    move-object/from16 v46, v25

    move/from16 v3, v27

    move-object/from16 v6, v28

    move-object/from16 v1, v29

    move-object/from16 v0, v30

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v32, 0x0

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v12, 0x0

    invoke-static {v5, v3, v12, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v26

    const/16 v29, 0x0

    const/16 v31, 0x7

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v30, v3

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v31, v30

    sget-object v5, Ll0/m;->a:Ll0/e;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_c

    :cond_13
    :goto_b
    move-object/from16 v0, v16

    goto :goto_d

    :cond_14
    :goto_c
    invoke-static {v6, v11, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v11, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Llo1/c$e;->e()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/4 v0, 0x4

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Llo1/c$e;->a()Le51/n;

    move-result-object v6

    const/4 v3, 0x3

    const/4 v5, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v12, v5, v3, v5}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    const/16 v30, 0x0

    move/from16 v27, v31

    const/16 v31, 0xd

    move/from16 v28, v27

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v13, v28

    float-to-double v7, v4

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_15

    move v9, v2

    goto :goto_e

    :cond_15
    move/from16 v9, v32

    :goto_e
    if-nez v9, :cond_16

    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_16
    invoke-static {v5, v2, v4}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v14, v34

    const/16 v15, 0x100

    if-ne v14, v15, :cond_17

    move v9, v2

    goto :goto_f

    :cond_17
    move/from16 v9, v32

    :goto_f
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v8, v46

    if-nez v9, :cond_19

    if-ne v7, v8, :cond_18

    goto :goto_10

    :cond_18
    move-object/from16 v10, p2

    goto :goto_11

    :cond_19
    :goto_10
    new-instance v7, Lno0/l;

    const/16 v9, 0xb

    move-object/from16 v10, p2

    invoke-direct {v7, v10, v9}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object v9, v7

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v7, Le51/n;->f:I

    shl-int/lit8 v3, v7, 0x3

    const/16 v12, 0xc

    const/4 v7, 0x0

    move-object/from16 v46, v8

    const/4 v8, 0x0

    move-object v2, v11

    move v11, v3

    move-object v3, v10

    move-object v10, v2

    move-object/from16 v2, v46

    invoke-static/range {v5 .. v12}, Le51/l;->i(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v10

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v13, v13}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Llo1/c$e;->c()Lny0/a0;

    move-result-object v5

    and-int/lit8 v1, v33, 0xe

    if-eq v1, v0, :cond_1b

    and-int/lit8 v0, v33, 0x8

    move-object/from16 v1, p0

    if-eqz v0, :cond_1a

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_12

    :cond_1a
    move/from16 v9, v32

    goto :goto_13

    :cond_1b
    move-object/from16 v1, p0

    :goto_12
    const/4 v9, 0x1

    :goto_13
    if-ne v14, v15, :cond_1c

    const/4 v0, 0x1

    goto :goto_14

    :cond_1c
    move/from16 v0, v32

    :goto_14
    or-int/2addr v0, v9

    and-int/lit8 v4, v33, 0x70

    const/16 v7, 0x20

    if-ne v4, v7, :cond_1d

    const/4 v9, 0x1

    goto :goto_15

    :cond_1d
    move/from16 v9, v32

    :goto_15
    or-int/2addr v0, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1f

    if-ne v4, v2, :cond_1e

    goto :goto_16

    :cond_1e
    move-object/from16 v2, p1

    goto :goto_17

    :cond_1f
    :goto_16
    new-instance v4, Ln0/j;

    const/4 v0, 0x5

    move-object/from16 v2, p1

    invoke-direct {v4, v1, v3, v2, v0}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v8, v4

    check-cast v8, Lc93/a;

    sget v0, Lny0/a0;->k:I

    or-int/lit8 v10, v0, 0x30

    move-object/from16 v27, v11

    const/4 v11, 0x4

    const/4 v7, 0x0

    move-object/from16 v9, v27

    invoke-static/range {v5 .. v11}, Lny0/z;->h(Lny0/a0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    const/4 v4, 0x1

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_20
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v0, Ll72/n;

    const/16 v5, 0x17

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ll72/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llo1/a$d;->a:Llo1/a$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llo1/a$b;

    invoke-direct {v0, p1}, Llo1/a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llo1/c$e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    sget-object v0, Lyn1/b;->c:Lyn1/b$a;

    invoke-virtual {p0}, Llo1/c$e;->d()Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lyn1/b$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Llo1/a$i;

    invoke-direct {v0, p0, p2}, Llo1/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Llo1/a$h;->a:Llo1/a$h;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lno1/f;->e(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/CyclePhaseStyle;Landroidx/compose/runtime/Composer;I)Li2/t;
    .locals 2

    invoke-static {p0}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide p0

    sget-object p2, Li2/t;->b:Li2/s;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    new-instance v0, Li2/x;

    invoke-direct {v0, p0, p1}, Li2/x;-><init>(J)V

    sget-wide p0, Li2/x;->m:J

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v0, v1}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    const/16 v0, 0xe

    invoke-static {p2, p0, p1, p1, v0}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.class public abstract Lo72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lm72/c;",
        "viewState",
        "",
        "navigationTitle",
        "Lkotlin/Function1;",
        "Lf72/b;",
        "Ll83/a0;",
        "onNavigationEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "sage_release"
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
.method public static synthetic a(Lf72/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo72/b;->f(Lf72/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lo72/b;->i(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo72/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm72/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lo72/b;->h(Lm72/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lm72/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitle"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x72c6ff45

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v5, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v7, v7, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v7, v12

    :goto_6
    and-int/lit16 v12, v7, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    if-eq v12, v13, :cond_b

    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v12, v14

    :goto_7
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v9, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_23

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v0, v12

    goto :goto_8

    :cond_c
    move-object v0, v6

    :goto_8
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_d

    new-instance v8, Lny0/m;

    const/16 v11, 0x1b

    invoke-direct {v8, v11}, Lny0/m;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_e
    move-object v8, v11

    :goto_9
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v15, v9, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_f

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v9, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v32, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static/range {p2 .. p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v35

    sget v13, Luv0/c;->E:I

    invoke-static {v9, v13}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v36

    const v49, 0xfff2

    const/16 v50, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v32 .. v50}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v13, v7, 0x1c00

    const/16 v14, 0x800

    if-ne v13, v14, :cond_12

    const/16 v19, 0x1

    goto :goto_b

    :cond_12
    const/16 v19, 0x0

    :goto_b
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v19, :cond_13

    if-ne v14, v6, :cond_14

    :cond_13
    new-instance v14, Lnw0/n;

    const/4 v5, 0x7

    invoke-direct {v14, v8, v5}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lc93/a;

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v19, v6

    const/4 v6, 0x3

    shl-int/2addr v5, v6

    move-object/from16 v28, v9

    move-object v9, v14

    const/16 v14, 0x35

    move/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const/4 v11, 0x0

    move-object/from16 v2, v32

    move/from16 v32, v7

    move-object v7, v2

    move-object/from16 v55, v12

    move/from16 v54, v13

    move-object/from16 v56, v19

    move/from16 v2, v21

    move-object/from16 v51, v22

    move-object/from16 v53, v23

    move-object/from16 v52, v24

    move-object/from16 v12, v28

    move v13, v5

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0x14

    int-to-float v14, v7

    invoke-static {v14, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v7, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v9, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v52

    invoke-static {v9, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    invoke-static {v8, v9, v8, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v55

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v7, 0x28

    int-to-float v7, v7

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v23, v7

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->N:Lb2/k;

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v11, 0x36

    invoke-static {v10, v8, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_18

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_18
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v9, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_19

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    :cond_19
    invoke-static {v11, v9, v11, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0x64

    int-to-float v5, v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v55, v6

    invoke-virtual/range {p1 .. p1}, Lm72/c;->f()Lkd1/o;

    move-result-object v6

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v2, v55

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    sget-wide v9, Li2/x;->n:J

    move-object v7, v12

    const/16 v12, 0xdb0

    move-object/from16 v52, v13

    const/4 v13, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v35, v0

    move-object v0, v8

    move-object/from16 v11, v28

    const/16 v36, 0x0

    move-object v8, v5

    move-object/from16 v5, v52

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v37, v9

    move-object v9, v11

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/16 v7, 0x36

    invoke-static {v6, v0, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1b

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    invoke-static {v6, v9, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lm72/c;->e()Ljava/lang/String;

    move-result-object v6

    sget v0, Lx81/d;->b:I

    move-object/from16 v1, v53

    invoke-virtual {v1, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v30, v5, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v5, v14

    const/4 v14, 0x0

    const/16 v8, 0x20

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide/from16 v57, v3

    move v3, v8

    move-wide/from16 v8, v57

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p1 .. p1}, Lm72/c;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    new-instance v4, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v4, v7}, Lw3/k;-><init>(I)V

    const v31, 0x2fdfa

    const/4 v7, 0x0

    move-object/from16 v18, v4

    move-wide v8, v0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v5, v1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual/range {p1 .. p1}, Lm72/c;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lm72/c;->a()Li2/t;

    move-result-object v12

    and-int/lit8 v0, v32, 0x70

    if-eq v0, v3, :cond_1f

    and-int/lit8 v0, v32, 0x40

    move-object/from16 v2, p1

    if-eqz v0, :cond_1e

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_10

    :cond_1e
    move/from16 v14, v36

    :goto_f
    move/from16 v0, v54

    const/16 v1, 0x800

    goto :goto_11

    :cond_1f
    move-object/from16 v2, p1

    :goto_10
    const/4 v14, 0x1

    goto :goto_f

    :goto_11
    if-ne v0, v1, :cond_20

    const/16 v36, 0x1

    :cond_20
    or-int v0, v14, v36

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    move-object/from16 v0, v56

    if-ne v1, v0, :cond_21

    goto :goto_12

    :cond_21
    move-object/from16 v3, v51

    goto :goto_13

    :cond_22
    :goto_12
    new-instance v1, Lmi2/o;

    const/16 v0, 0x18

    move-object/from16 v3, v51

    invoke-direct {v1, v2, v3, v0}, Lmi2/o;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v16, 0x6036

    const/16 v17, 0x48

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object/from16 v15, v28

    move-wide/from16 v10, v37

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    const/4 v0, 0x1

    invoke-static {v9, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v4, v3

    move-object/from16 v1, v35

    goto :goto_14

    :cond_23
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v6

    move-object v4, v11

    :goto_14
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v0, Lo72/a;

    const/4 v7, 0x0

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final f(Lf72/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf72/b$b;->a:Lf72/b$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm72/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lm72/c;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lf72/b$c;

    invoke-direct {v0, p0}, Lf72/b$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lo72/b;->e(Landroidx/compose/ui/Modifier;Lm72/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

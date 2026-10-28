.class public abstract Lox0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\r\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lox0/e;",
        "viewModel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavigateBack",
        "g",
        "(Lox0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lox0/d;",
        "uiState",
        "",
        "batteryLevelText",
        "",
        "isDropdownExpanded",
        "debug-tools_release"
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
.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lox0/c;->m(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lox0/c;->o(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lox0/c;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lox0/e;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lox0/c;->p(Lox0/e;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lox0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lox0/c;->r(Lox0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lox0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lox0/c;->q(Lox0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lox0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lox0/e;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onNavigateBack"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v1, -0x41eca2ae

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v13, 0x12

    const/4 v14, 0x0

    if-eq v2, v13, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move v2, v14

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v7, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {v0}, Lox0/e;->q()Lec3/f2;

    move-result-object v2

    invoke-static {v2, v7, v14}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    const-string v3, ""

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_6

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lp1/c1;

    invoke-static {v2}, Lox0/c;->h(Lp1/t2;)Lox0/d;

    move-result-object v8

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_7

    if-ne v11, v5, :cond_8

    :cond_7
    new-instance v11, Lox0/c$a;

    const/4 v9, 0x0

    invoke-direct {v11, v0, v2, v9}, Lox0/c$a;-><init>(Lox0/e;Lp1/t2;Lq83/d;)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lc93/m;

    invoke-static {v7, v11, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v16, v13

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v12, v7, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v7, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v21, v1

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-eqz v1, :cond_9

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v7, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v7, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    move-object/from16 v22, v1

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_5

    :cond_a
    move-object/from16 v23, v2

    :goto_5
    invoke-static {v14, v7, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v7, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v1, "BATTERY DEBUG"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/w;->a()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v27

    const v41, 0xfffa

    const/16 v42, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v24 .. v42}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v24, v1

    const/4 v1, 0x3

    shl-int/2addr v9, v1

    const/16 v26, 0x6

    shl-int/lit8 v1, v21, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v1, v9

    const/16 v9, 0x35

    move-object/from16 v21, v8

    move v8, v1

    const/4 v1, 0x0

    move-object/from16 v27, v3

    const/4 v3, 0x0

    move-object/from16 v28, v5

    const/4 v5, 0x0

    move-object/from16 v29, v6

    const/4 v6, 0x0

    move-object/from16 v0, v21

    move-object/from16 v21, v12

    move-object v12, v0

    move-object/from16 v0, v22

    move-object/from16 v37, v23

    move-object/from16 v10, v24

    move-object/from16 v38, v27

    move-object/from16 v43, v28

    move-object/from16 v39, v29

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v37 .. v37}, Lox0/c;->h(Lp1/t2;)Lox0/d;

    move-result-object v2

    instance-of v2, v2, Lox0/d$b;

    if-eqz v2, :cond_f

    const v2, -0x12f8a767

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v5, v7, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v7, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lx81/d;->b:I

    invoke-virtual {v10, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v12

    const/4 v0, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1d

    const/4 v11, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move v3, v0

    move v2, v4

    move-object/from16 v18, v7

    invoke-static/range {v11 .. v20}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v0, p0

    move v1, v3

    goto/16 :goto_13

    :cond_f
    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, -0x12f0e8db

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x10

    int-to-float v6, v6

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    move-object/from16 v8, v21

    const/4 v9, 0x6

    invoke-static {v6, v8, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_10

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_10
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v7, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_11
    invoke-static {v2, v7, v2, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v7, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v2

    sget-object v18, Lp3/r;->I:Lp3/r;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v10, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v35, 0x0

    const v36, 0x3ffd2

    move-object/from16 v16, v11

    const-string v11, "Set Fake Strap Battery Level \ud83d\udd0b"

    move-object/from16 v21, v12

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v23, v21

    const/high16 v22, 0x3f800000    # 1.0f

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    move-object/from16 v27, v25

    const-wide/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v31, v29

    const/16 v29, 0x0

    move/from16 v32, v30

    const/16 v30, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move/from16 v34, v32

    const/16 v32, 0x0

    move/from16 v42, v34

    const v34, 0x30c06

    move-object/from16 v9, v33

    move-object/from16 v33, v7

    move/from16 v7, v42

    move-wide/from16 v45, v2

    move-object v3, v13

    move-object/from16 v2, v16

    move-wide/from16 v47, v5

    move-object v6, v14

    move-wide/from16 v13, v47

    move-object v5, v15

    move-wide/from16 v15, v45

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->q0()J

    move-result-wide v13

    const v15, 0x3e4ccccd    # 0.2f

    invoke-static {v15, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v13

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v12, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v13, 0x1

    int-to-float v14, v13

    const v13, 0x3e99999a    # 0.3f

    move-object/from16 v42, v8

    invoke-static {v10, v11, v4, v13}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v7

    const/16 v13, 0x8

    int-to-float v13, v13

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {v12, v14, v7, v8, v15}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v8, v43

    if-ne v7, v8, :cond_13

    new-instance v7, Lo0/i;

    move-object/from16 v12, v39

    const/4 v14, 0x2

    invoke-direct {v7, v14, v12}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_8

    :cond_13
    move-object/from16 v12, v39

    :goto_8
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v14, 0xc

    int-to-float v14, v14

    invoke-static {v7, v14, v14}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, Ll0/m;->g:Ll0/h;

    sget-object v15, Lb2/e;->K:Lb2/l;

    move-object/from16 v29, v12

    const/16 v12, 0x36

    invoke-static {v14, v15, v11, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v17, v13

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_14

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_14
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v11, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    :cond_15
    invoke-static {v14, v11, v14, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v11, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v7, 0x3f4ccccd    # 0.8f

    invoke-static {v10, v11, v4, v7}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v13

    move-object/from16 v43, v8

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v7, v12

    const-wide/16 v15, 0x0

    cmpl-double v7, v7, v15

    if-lez v7, :cond_17

    goto :goto_a

    :cond_17
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v12, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v35, 0x0

    const v36, 0x3fff8

    move-object/from16 v33, v11

    const-string v11, "If using for debugging Low Battery PNs"

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const-wide/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v39, v29

    const/16 v29, 0x0

    move/from16 v31, v30

    const/16 v30, 0x0

    move/from16 v32, v31

    const/16 v31, 0x0

    move/from16 v34, v32

    const/16 v32, 0x0

    move/from16 v41, v34

    const/16 v34, 0x6

    move/from16 v45, v12

    move-object v12, v7

    move/from16 v7, v45

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    new-instance v12, Lny0/o;

    sget-object v13, Lny0/q$c;->f:Lny0/q$c;

    invoke-static/range {v39 .. v39}, Lox0/c;->k(Lp1/c1;)Z

    move-result v14

    if-eqz v14, :cond_18

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/w;->d()I

    move-result v14

    goto :goto_b

    :cond_18
    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/w;->r()I

    move-result v14

    :goto_b
    const/16 v23, 0x3fc

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v12 .. v24}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v39 .. v39}, Lox0/c;->k(Lp1/c1;)Z

    move-result v14

    if-eqz v14, :cond_19

    const-string v14, "Collapse"

    goto :goto_c

    :cond_19
    const-string v14, "Expand"

    :goto_c
    invoke-virtual {v13}, Lny0/q;->c()F

    move-result v13

    invoke-static {v13, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v7, v43

    if-ne v15, v7, :cond_1a

    new-instance v15, Lou1/a;

    const/4 v8, 0x5

    invoke-direct {v15, v8}, Lou1/a;-><init>(I)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v15, Lc93/a;

    sget v8, Lny0/o;->k:I

    or-int/lit16 v8, v8, 0x6000

    move-object/from16 v16, v9

    const/16 v9, 0x8

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object v1, v12

    move-object v12, v2

    move-object v2, v1

    move-object v1, v15

    move-object v15, v6

    move-object v6, v1

    move/from16 v40, v4

    move-object/from16 v44, v7

    move-object v7, v11

    move-object v4, v13

    move-object/from16 v11, v42

    const/4 v1, 0x1

    move-object v13, v3

    move-object/from16 v42, v10

    move-object v3, v14

    move-object/from16 v14, v17

    const/4 v10, 0x6

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-static/range {v39 .. v39}, Lox0/c;->k(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_1e

    const v2, -0x659861c7

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/16 v20, 0x0

    const/16 v21, 0xc

    const/16 v19, 0x0

    move/from16 v18, v41

    move/from16 v17, v41

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v9, v16

    move/from16 v3, v17

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    invoke-static {v4, v11, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_1b

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_1b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    invoke-static {v5, v7, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v7, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v0, v40

    move-object/from16 v10, v42

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v10, v7, v0, v2}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v13

    const/16 v35, 0x0

    const v36, 0x3fffa

    const-string v11, "1. Strap Battery Delta: Gen4 straps require 3% change to trigger notification check. Gen5 straps require 1% change."

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v7

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v10, v7, v0, v2}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v13

    const-string v11, "2. Repeat Notification Delay: Monitor waits 1 hour between PNs even if the strap % drops to a new bucket. It will repeat the same notification after 3 hours. Use the \'Clear PN Cache\' tool to bypass delay restrictions."

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1e
    move-object/from16 v9, v16

    move/from16 v0, v40

    move/from16 v3, v41

    move-object/from16 v10, v42

    const/4 v8, 0x0

    const v2, -0x6587e663

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    :goto_e
    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v37 .. v37}, Lox0/c;->h(Lp1/t2;)Lox0/d;

    move-result-object v2

    instance-of v4, v2, Lox0/d$d;

    if-eqz v4, :cond_1f

    const v4, -0x65843141

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    check-cast v2, Lox0/d$d;

    invoke-virtual {v2}, Lox0/d$d;->a()Ljava/lang/String;

    move-result-object v11

    sget-wide v13, Li2/x;->h:J

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v20, v3

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v35, 0x0

    const v36, 0x3fff8

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x1b0

    move-object/from16 v33, v7

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1f
    move/from16 v20, v3

    instance-of v3, v2, Lox0/d$a;

    if-eqz v3, :cond_20

    const v3, -0x657f271f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    check-cast v2, Lox0/d$a;

    invoke-virtual {v2}, Lox0/d$a;->a()Ljava/lang/String;

    move-result-object v11

    sget-wide v13, Li2/x;->g:J

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v35, 0x0

    const v36, 0x3fff8

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x1b0

    move-object/from16 v33, v7

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_20
    const v2, -0x657b0637

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    :goto_f
    invoke-static/range {v38 .. v38}, Lox0/c;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lu0/r0;

    const/16 v4, 0x7b

    const/4 v5, 0x3

    invoke-direct {v3, v8, v5, v8, v4}, Lu0/r0;-><init>(IIII)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v10, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v10, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v10, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v19

    const v6, 0x3f19999a    # 0.6f

    invoke-static {v10, v7, v0, v6}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v21

    const-wide/16 v25, 0x0

    const v28, 0x1fff96

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 v27, v7

    invoke-static/range {v11 .. v28}, Lg1/i8;->g(JJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v28

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v11, v44

    if-ne v6, v11, :cond_21

    new-instance v6, Ljs2/e;

    const/16 v12, 0x1d

    move-object/from16 v13, v38

    invoke-direct {v6, v12, v13}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_21
    move-object/from16 v13, v38

    :goto_10
    move-object v12, v6

    check-cast v12, Lkotlin/jvm/functions/Function1;

    sget-object v33, Lox0/f;->a:Lox0/f;

    invoke-virtual/range {v33 .. v33}, Lox0/f;->f()Lc93/m;

    move-result-object v17

    invoke-virtual/range {v33 .. v33}, Lox0/f;->e()Lc93/m;

    move-result-object v18

    const/16 v31, 0x180

    const v32, 0x7ef38

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v30, 0xd801b0

    move-object/from16 v22, v3

    move-object/from16 v29, v7

    move-object v7, v11

    move-object v3, v13

    move-object v11, v2

    move-object v13, v5

    invoke-static/range {v11 .. v32}, Lg1/j4;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v10, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->n0()J

    move-result-wide v5

    sget-wide v13, Li2/x;->b:J

    const/16 v20, 0x30

    const/16 v21, 0xc

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v19, v11

    move-wide v11, v5

    invoke-static/range {v11 .. v21}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v17

    move-object/from16 v11, v19

    invoke-static {v3}, Lox0/c;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_22

    move v13, v1

    :goto_11
    move-object/from16 v5, p0

    goto :goto_12

    :cond_22
    move v13, v8

    goto :goto_11

    :goto_12
    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_23

    if-ne v12, v7, :cond_24

    :cond_23
    new-instance v12, Lox0/b;

    invoke-direct {v12, v8, v5, v3}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v12, Lc93/a;

    invoke-virtual/range {v33 .. v33}, Lox0/f;->h()Lkotlin/jvm/functions/Function3;

    move-result-object v19

    const v21, 0x30000030

    const/16 v22, 0x178

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v11

    move-object v11, v12

    move-object v12, v2

    invoke-static/range {v11 .. v22}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v20

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_25

    if-ne v3, v7, :cond_26

    :cond_25
    new-instance v3, Lnr0/e;

    const/16 v2, 0x14

    invoke-direct {v3, v5, v2}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v12, v3

    check-cast v12, Lc93/a;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->v()J

    move-result-wide v2

    invoke-virtual {v10, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->q0()J

    move-result-wide v6

    move-wide v4, v2

    move-wide v2, v6

    const/4 v7, 0x4

    move-object/from16 v0, p0

    move-object v6, v11

    invoke-static/range {v2 .. v7}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v15

    move-object v7, v6

    invoke-virtual/range {v33 .. v33}, Lox0/f;->g()Lkotlin/jvm/functions/Function3;

    move-result-object v16

    const v18, 0x30000030

    const/16 v19, 0x17c

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v7

    move-object v11, v12

    move-object v12, v9

    invoke-static/range {v11 .. v19}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_27
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_28

    new-instance v2, Lof2/d;

    const/16 v3, 0x9

    move-object/from16 v4, p1

    move/from16 v10, p3

    invoke-direct {v2, v0, v4, v10, v3}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final h(Lp1/t2;)Lox0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lox0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lox0/d;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final j(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final l(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lox0/c;->k(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lox0/c;->l(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lox0/c;->j(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lox0/e;Lp1/c1;)Ll83/a0;
    .locals 2

    invoke-static {p1}, Lox0/c;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v1, 0x65

    if-ge v0, v1, :cond_0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Lox0/e;->t(B)V

    const-string p0, ""

    invoke-static {p1, p0}, Lox0/c;->j(Lp1/c1;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lox0/e;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lox0/e;->n()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lox0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lox0/c;->g(Lox0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic s(Lp1/t2;)Lox0/d;
    .locals 0

    invoke-static {p0}, Lox0/c;->h(Lp1/t2;)Lox0/d;

    move-result-object p0

    return-object p0
.end method

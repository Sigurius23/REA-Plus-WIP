.class public abstract Lor1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a7\u0010\u0007\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function2;",
        "",
        "",
        "Ll83/a0;",
        "onClick",
        "Lkotlin/Function0;",
        "onToolbarLeftClick",
        "e",
        "(Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "action",
        "delayEnabled",
        "internal-tooling_release"
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
.method public static synthetic a(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lor1/a;->j(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lor1/a;->k(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/m;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lor1/a;->m(Lc93/m;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lor1/a;->l(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToolbarLeftClick"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v1, -0x67d31ae3

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
    move/from16 v37, v1

    and-int/lit8 v1, v37, 0x13

    const/16 v38, 0x0

    const/16 v13, 0x12

    if-eq v1, v13, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move/from16 v1, v38

    :goto_3
    and-int/lit8 v2, v37, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_12

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v15}, Lgb1/b0;->d0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v3, v2, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v3, v7, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_8

    const-string v1, ""

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_9

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lp1/c1;

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    const-string v17, "Iterable Tool"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lgz0/w;->a()I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v30, 0x1ff5

    const/16 v31, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v16 .. v31}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v17, Lcom/whoop/design/atomic/organism/toolbar/d$c;->p:I

    shl-int/lit8 v17, v17, 0x3

    shl-int/lit8 v13, v37, 0x6

    and-int/lit16 v13, v13, 0x1c00

    or-int v13, v17, v13

    move-object/from16 v17, v9

    const/16 v9, 0x35

    move-object/from16 v19, v1

    const/4 v1, 0x0

    move-object/from16 v20, v3

    const/4 v3, 0x0

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v6

    const/4 v6, 0x0

    move v0, v13

    move-object v13, v8

    move v8, v0

    move-object/from16 v29, v2

    move-object/from16 v2, v16

    move-object/from16 v39, v17

    move-object/from16 v0, v19

    move-object/from16 v10, v20

    move-object/from16 v28, v21

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x2

    int-to-float v2, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v5, v2, v3

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "Action Name"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v8, Lhy0/m1;->a:Lhy0/m1;

    invoke-virtual {v8}, Lhy0/m1;->d()Lcom/whoop/design/util/TextResource$e;

    move-result-object v8

    const-string v9, "Enter Action Name Here"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object/from16 v16, v15

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_a

    new-instance v1, Ljs2/e;

    const/16 v14, 0x1b

    invoke-direct {v1, v14, v0}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v23, v1

    check-cast v23, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v1, 0x3

    move/from16 v19, v1

    const/4 v1, 0x6

    or-int/2addr v14, v1

    sget v20, Lcom/whoop/design/util/TextResource$e;->b:I

    shl-int/lit8 v20, v20, 0x6

    or-int v14, v14, v20

    shl-int/lit8 v20, v19, 0x9

    or-int v14, v14, v20

    shl-int/lit8 v19, v19, 0xc

    or-int v25, v14, v19

    const/16 v26, 0x180

    const/16 v27, 0xfe0

    move-object/from16 v14, v16

    const/16 v16, 0x0

    const/16 v19, 0x1

    const/16 v17, 0x0

    const/16 v20, 0x12

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v22

    const/16 v22, 0x0

    move-object/from16 p2, v12

    move-object v12, v6

    move-object v6, v13

    move-object v13, v8

    move-object/from16 v8, p2

    move-object v1, v14

    move/from16 p2, v24

    move-object/from16 v24, v7

    move-object v14, v9

    move-object v7, v11

    const/4 v9, 0x2

    move-object v11, v5

    move-object/from16 v5, v31

    invoke-static/range {v11 .. v27}, Lhy0/l1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v14, 0x5

    int-to-float v14, v14

    mul-float/2addr v14, v3

    const/4 v15, 0x0

    invoke-static {v13, v14, v15, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v13, Ll0/m;->e:Ll0/h;

    sget-object v14, Lb2/e;->J:Lb2/l;

    const/4 v15, 0x6

    invoke-static {v13, v14, v11, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v13

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v11, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v29

    invoke-static {v11, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    move-object/from16 v5, v28

    invoke-static {v14, v11, v14, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "5 second delay"

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toUpperCase(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v9, 0x4

    int-to-float v12, v9

    mul-float/2addr v2, v12

    const/4 v9, 0x1

    int-to-float v13, v9

    mul-float/2addr v13, v12

    invoke-static {v7, v13, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v7, Lx81/d;->b:I

    invoke-virtual {v8, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->c1()J

    move-result-wide v13

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->m()Lb91/a;

    move-result-object v31

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v35, v15, 0x12

    const v36, 0x2fff8

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

    const/16 v32, 0x0

    const/16 v34, 0x0

    move/from16 v33, v12

    move-object v12, v2

    move/from16 v2, v33

    move-object/from16 v33, v11

    move-object v11, v5

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    mul-float/2addr v3, v2

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v39 .. v39}, Lor1/a;->h(Lp1/c1;)Z

    move-result v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_e

    new-instance v2, Ljs2/e;

    const/16 v5, 0x1c

    move-object/from16 v13, v39

    invoke-direct {v2, v5, v13}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_6

    :cond_e
    move-object/from16 v13, v39

    :goto_6
    move-object/from16 v18, v2

    check-cast v18, Lkotlin/jvm/functions/Function1;

    const/high16 v20, 0x180000

    const/16 v21, 0x3d

    move-object/from16 v33, v11

    const/4 v11, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v39, v17

    const/16 v17, 0x0

    move-object/from16 v19, v33

    move-object/from16 v2, v39

    invoke-static/range {v11 .. v21}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v19

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual {v8, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a()J

    move-result-wide v15

    and-int/lit8 v3, v37, 0xe

    const/4 v5, 0x4

    if-ne v3, v5, :cond_f

    move/from16 v38, v9

    :cond_f
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v38, :cond_11

    if-ne v3, v10, :cond_10

    goto :goto_7

    :cond_10
    move-object/from16 v6, p0

    goto :goto_8

    :cond_11
    :goto_7
    new-instance v3, Ll41/a;

    const/4 v5, 0x1

    move-object/from16 v6, p0

    invoke-direct {v3, v6, v0, v2, v5}, Ll41/a;-><init>(Lc93/m;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object/from16 v19, v3

    check-cast v19, Lc93/a;

    const/16 v21, 0xdb6

    const/16 v22, 0x60

    const-string v13, "Navigate"

    const/4 v14, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v11

    move-object v11, v1

    invoke-static/range {v11 .. v22}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v20

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_12
    move-object v6, v0

    move-object v11, v7

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lof2/d;

    const/4 v2, 0x2

    move/from16 v10, p3

    invoke-direct {v1, v6, v4, v10, v2}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final f(Lp1/c1;)Ljava/lang/String;
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

.method private static final g(Lp1/c1;Ljava/lang/String;)V
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

.method private static final h(Lp1/c1;)Z
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

.method private static final i(Lp1/c1;Z)V
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

.method private static final j(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lor1/a;->g(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lor1/a;->i(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lor1/a;->f(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lor1/a;->h(Lp1/c1;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lc93/m;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lor1/a;->e(Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lfc2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a=\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lec2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lfc2/c;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onBack",
        "g",
        "(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selected",
        "settings_release"
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
.method public static synthetic a(Lfc2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfc2/b;->h(Lfc2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lec2/c;Lp1/c1;JJJJJJLn0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Lfc2/b;->m(Lec2/c;Lp1/c1;JJJJJJLn0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lfc2/b;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ltr2/n;Lec2/c;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfc2/b;->l(Ltr2/n;Lec2/c;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfc2/b;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfc2/b;->o(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v15, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x3ed742fd

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v15, 0x6

    const/4 v11, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v11

    :goto_0
    or-int/2addr v0, v15

    goto :goto_1

    :cond_1
    move v0, v15

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v15, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v15, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v14, 0x0

    if-eq v6, v7, :cond_8

    const/4 v6, 0x1

    goto :goto_6

    :cond_8
    move v6, v14

    :goto_6
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_22

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_9

    new-instance v2, Lf41/f;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lf41/f;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v2, v3

    :goto_7
    if-eqz v4, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_b

    new-instance v3, Lf1/z1;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lc93/a;

    move-object v5, v3

    :cond_c
    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    :cond_e
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v7, v2

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v8, Lea2/s;->J:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v17

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-static {v12}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v19

    sget v8, Luv0/c;->E:I

    invoke-static {v10, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v20

    const v33, 0xfff2

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v8, v8, 0x3

    or-int/lit8 v8, v8, 0x6

    shl-int/lit8 v9, v0, 0x3

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v9, v8

    move-object/from16 v38, v10

    const/16 v10, 0x34

    move-object v8, v4

    const/4 v4, 0x0

    move-object v13, v6

    const/4 v6, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object/from16 v42, v13

    move-object/from16 v3, v16

    move-object v13, v8

    move-object/from16 v8, v38

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v43, v5

    move-object v10, v8

    sget v2, Lea2/s;->I:I

    invoke-static {v10, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    int-to-float v2, v11

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v13, v2, v4, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    sget v5, Lx81/d;->b:I

    invoke-virtual {v12, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v18

    invoke-virtual {v12, v10, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v40, v6, 0x12

    const v41, 0x2fff8

    const-wide/16 v20, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x30

    move-object/from16 v38, v10

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lec2/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_10

    const v6, 0xa8871d2

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lec2/c;->a()Ljava/lang/String;

    move-result-object v16

    invoke-static {v13, v2, v4, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-virtual {v12, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v18

    invoke-virtual {v12, v10, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    const/16 v39, 0x30

    const v41, 0x2fff8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v38, v10

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v38

    const/4 v6, 0x0

    invoke-static {v13, v2, v5, v6}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_9

    :cond_10
    move-object v5, v10

    const/4 v6, 0x0

    const v7, 0xa8d2e55

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_11

    move-object/from16 v7, v42

    if-ne v8, v7, :cond_15

    goto :goto_a

    :cond_11
    move-object/from16 v7, v42

    :goto_a
    invoke-virtual {v1}, Lec2/c;->b()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lec2/a;

    invoke-virtual {v12}, Lec2/a;->b()Z

    move-result v12

    if-eqz v12, :cond_12

    goto :goto_b

    :cond_13
    move-object v9, v10

    :goto_b
    check-cast v9, Lec2/a;

    if-eqz v9, :cond_14

    invoke-virtual {v9}, Lec2/a;->a()Ljava/lang/String;

    move-result-object v8

    goto :goto_c

    :cond_14
    move-object v8, v10

    :goto_c
    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_16

    if-ne v10, v7, :cond_17

    :cond_16
    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v10, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_18

    sget-object v9, Ltr2/n;->a:Ltr2/n$a;

    const-string v12, "LanguagePrefsFragment"

    invoke-virtual {v9, v12}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v9, Ltr2/n;

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v5, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v12, :cond_19

    if-ne v6, v7, :cond_1a

    :cond_19
    new-instance v6, Ld30/r;

    const/16 v12, 0xd

    invoke-direct {v6, v9, v1, v10, v12}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v6, Lc93/a;

    invoke-static {v6, v5}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-object/from16 p1, v14

    invoke-virtual/range {v17 .. v17}, Ly81/i;->W0()J

    move-result-wide v14

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-object/from16 v42, v7

    move-object/from16 p2, v8

    invoke-virtual/range {v17 .. v17}, Ly81/i;->w()J

    move-result-wide v7

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-wide/from16 v18, v7

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-wide/from16 v20, v7

    invoke-virtual/range {v17 .. v17}, Ly81/i;->F()J

    move-result-wide v7

    invoke-virtual {v6, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-object/from16 v22, v6

    move-wide/from16 v23, v7

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v6

    move/from16 v17, v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v25, v3

    const/4 v3, 0x2

    invoke-static {v0, v2, v4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    float-to-double v3, v8

    const-wide/16 v26, 0x0

    cmpl-double v3, v3, v26

    if-lez v3, :cond_1b

    :goto_d
    const/4 v3, 0x1

    goto :goto_e

    :cond_1b
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    invoke-static {v0, v3, v8}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v0, v3

    mul-float v0, v0, v25

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v25

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v5, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v5, v11, v12}, Lp1/q;->f(J)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v5, v14, v15}, Lp1/q;->f(J)Z

    move-result v4

    or-int/2addr v0, v4

    move-wide/from16 v3, v18

    invoke-virtual {v5, v3, v4}, Lp1/q;->f(J)Z

    move-result v18

    or-int v0, v0, v18

    move/from16 v18, v9

    move-wide/from16 v8, v20

    invoke-virtual {v5, v8, v9}, Lp1/q;->f(J)Z

    move-result v19

    or-int v0, v0, v19

    move/from16 v19, v0

    move-wide/from16 v0, v23

    invoke-virtual {v5, v0, v1}, Lp1/q;->f(J)Z

    move-result v20

    or-int v19, v19, v20

    invoke-virtual {v5, v6, v7}, Lp1/q;->f(J)Z

    move-result v20

    or-int v19, v19, v20

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v42

    if-nez v19, :cond_1d

    if-ne v0, v1, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v44, p1

    move-object/from16 v45, p2

    move-object/from16 v49, v1

    move-object v15, v5

    move-object/from16 v48, v13

    move/from16 v47, v18

    move-object/from16 v46, v22

    move/from16 v18, v2

    move-object v13, v10

    goto :goto_10

    :cond_1d
    :goto_f
    new-instance v0, Lfc2/a;

    move-object/from16 v44, p1

    move-object/from16 v45, p2

    move-object/from16 v49, v1

    move-object/from16 v48, v13

    move/from16 v47, v18

    move-object/from16 v46, v22

    move-object/from16 v1, p0

    move/from16 v18, v2

    move-object v2, v10

    move-wide v9, v8

    move-wide/from16 v50, v14

    move-object v15, v5

    move-wide v13, v6

    move-wide/from16 v5, v50

    move-wide v7, v3

    move-wide v3, v11

    move-wide/from16 v11, v23

    invoke-direct/range {v0 .. v14}, Lfc2/a;-><init>(Lec2/c;Lp1/c1;JJJJJJ)V

    move-object v13, v2

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v11, 0x6000

    const/16 v12, 0x1ee

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v15

    move-object/from16 v1, v16

    move-object/from16 v4, v25

    invoke-static/range {v1 .. v12}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v13}, Lfc2/b;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v45

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    move-object/from16 v8, v48

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v9, 0x2

    move/from16 v7, v18

    move/from16 v8, v18

    move/from16 v5, v18

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v4, v1

    move-object v1, v2

    sget-object v2, Lny0/v;->TextLarge:Lny0/v;

    if-nez v0, :cond_1e

    const v0, -0x73446767

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, v46

    move/from16 v3, v47

    invoke-virtual {v0, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v5

    const/4 v7, 0x0

    :goto_11
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1e
    move-object/from16 v0, v46

    move/from16 v3, v47

    const/4 v7, 0x0

    const v5, -0x734462e9

    invoke-static {v10, v5, v0, v10, v3}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v5

    goto :goto_11

    :goto_12
    sget v0, Lgy0/f;->A2:I

    invoke-static {v10, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    and-int/lit8 v0, v17, 0x70

    const/16 v8, 0x20

    if-ne v0, v8, :cond_1f

    const/4 v7, 0x1

    :cond_1f
    invoke-virtual {v10, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_21

    move-object/from16 v0, v49

    if-ne v7, v0, :cond_20

    goto :goto_13

    :cond_20
    move-object/from16 v14, v44

    goto :goto_14

    :cond_21
    :goto_13
    new-instance v7, Lbs1/i;

    const/16 v0, 0xe

    move-object/from16 v14, v44

    invoke-direct {v7, v14, v13, v0}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v9, v7

    check-cast v9, Lc93/a;

    const/16 v11, 0x36

    const/16 v12, 0x60

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object v6, v14

    move-object/from16 v5, v43

    goto :goto_15

    :cond_22
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v6, v3

    :goto_15
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_23

    new-instance v0, Lf02/c;

    const/4 v3, 0x2

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final h(Lfc2/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lp1/c1;)Ljava/lang/String;
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

.method private static final k(Lp1/c1;Ljava/lang/String;)V
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

.method private static final l(Ltr2/n;Lec2/c;Lp1/c1;)Ll83/a0;
    .locals 2

    invoke-static {p2}, Lfc2/b;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "displaying ui selected "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " with viewstate "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p0, p1, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lec2/c;Lp1/c1;JJJJJJLn0/q;)Ll83/a0;
    .locals 17

    move-object/from16 v0, p14

    const-string v1, "$this$LazyColumn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lec2/c;->b()Ljava/util/List;

    move-result-object v3

    sget-object v1, Lfc2/b$b;->w:Lfc2/b$b;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    new-instance v4, Lfc2/b$c;

    invoke-direct {v4, v1, v3}, Lfc2/b$c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    move v1, v2

    new-instance v2, Lfc2/b$d;

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    move-wide/from16 v9, p6

    move-wide/from16 v11, p8

    move-wide/from16 v13, p10

    move-wide/from16 v15, p12

    move-object v0, v4

    move-object/from16 v4, p1

    invoke-direct/range {v2 .. v16}, Lfc2/b$d;-><init>(Ljava/util/List;Lp1/c1;JJJJJJ)V

    new-instance v3, Lx1/b;

    const/4 v4, 0x1

    const v5, 0x2fd4df92

    invoke-direct {v3, v2, v4, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object/from16 v2, p14

    check-cast v2, Ln0/f;

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4, v0, v3}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    new-instance v0, Lfc2/c$a;

    invoke-static {p1}, Lfc2/b;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lfc2/c$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfc2/b;->g(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic p(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lfc2/b;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lfc2/b;->k(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

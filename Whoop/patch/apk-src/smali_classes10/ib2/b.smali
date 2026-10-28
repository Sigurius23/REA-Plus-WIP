.class public abstract Lib2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a=\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lib2/d;",
        "viewModel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBack",
        "o",
        "(Lib2/d;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lib2/e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lib2/c;",
        "onViewEvent",
        "p",
        "(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lib2/e$a;",
        "A",
        "(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
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
.method private static final A(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/e$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x2111cefa

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v1, 0x180

    move-object/from16 v9, p2

    if-nez v6, :cond_6

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    if-eq v6, v7, :cond_7

    const/4 v6, 0x1

    goto :goto_5

    :cond_7
    move v6, v8

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1f

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v6, v7}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-eqz v2, :cond_8

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v12, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v12, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v10, Lea2/s;->r:I

    invoke-static {v12, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v29

    const v43, 0xfffa

    const/16 v44, 0x0

    const/16 v28, 0x0

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

    const/16 v41, 0x0

    const/16 v42, 0x0

    move-object/from16 v26, v7

    invoke-direct/range {v26 .. v44}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v46, v0

    const/4 v11, 0x2

    int-to-float v0, v11

    const/16 v11, 0x8

    move-object/from16 v26, v8

    int-to-float v8, v11

    mul-float v18, v0, v8

    const/4 v0, 0x1

    int-to-float v11, v0

    mul-float v20, v11, v8

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v6

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v11, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v11, v11, 0x3

    const/4 v0, 0x6

    or-int/2addr v11, v0

    shl-int/lit8 v0, v46, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v11

    move-object v11, v14

    const/16 v14, 0x34

    move/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object v1, v13

    move-object/from16 v51, v16

    move/from16 v3, v18

    move/from16 v48, v19

    move/from16 v49, v20

    move-object/from16 v47, v21

    const/4 v5, 0x1

    const/16 v50, 0x8

    move v13, v0

    move-object/from16 v16, v4

    move-object/from16 v0, v27

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v6, v4

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_b

    move v8, v5

    goto :goto_7

    :cond_b
    const/4 v8, 0x0

    :goto_7
    if-nez v8, :cond_c

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_c
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v11, 0x2

    invoke-static {v4, v3, v6, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v0, v12, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    move-object/from16 v0, v26

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 v0, v16

    goto :goto_b

    :goto_a
    invoke-static {v6, v12, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v12, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_10

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "EditingEmail"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v0, Ltr2/n;

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v4, v46, 0xe

    const/4 v6, 0x4

    if-eq v4, v6, :cond_13

    and-int/lit8 v6, v46, 0x8

    if-eqz v6, :cond_11

    move-object/from16 v6, p0

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    goto :goto_c

    :cond_11
    move-object/from16 v6, p0

    :cond_12
    const/4 v8, 0x0

    goto :goto_d

    :cond_13
    move-object/from16 v6, p0

    :goto_c
    move v8, v5

    :goto_d
    or-int/2addr v2, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_14

    if-ne v7, v1, :cond_15

    :cond_14
    new-instance v7, Li01/d;

    const/4 v2, 0x7

    invoke-direct {v7, v2, v0, v6}, Li01/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lc93/a;

    invoke-static {v7, v12}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    sget v0, Lea2/s;->p:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget v2, Lx81/d;->b:I

    move-object/from16 v7, v47

    invoke-virtual {v7, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v7, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v30, v10, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x20

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v6, v47

    move/from16 v47, v5

    move-object v5, v6

    move-object v6, v0

    move/from16 v0, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    move/from16 v11, v49

    move-object/from16 v6, v51

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v7, Lea2/s;->l:I

    invoke-static {v12, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v8

    move-object/from16 v16, v6

    move-object v6, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v51, v16

    const-wide/16 v15, 0x0

    move-object/from16 v2, v51

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v12, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lib2/e$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lib2/e$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lib2/e$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v15, v3, 0x1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_16

    new-instance v3, Li21/r;

    const/16 v5, 0xf

    invoke-direct {v3, v5}, Li21/r;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v37, v3

    check-cast v37, Lc93/a;

    and-int/lit8 v3, v46, 0x70

    if-ne v3, v0, :cond_17

    move/from16 v8, v47

    goto :goto_e

    :cond_17
    const/4 v8, 0x0

    :goto_e
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v8, :cond_19

    if-ne v5, v1, :cond_18

    goto :goto_f

    :cond_18
    move-object/from16 v8, p1

    goto :goto_10

    :cond_19
    :goto_f
    new-instance v5, Lge0/c;

    const/16 v6, 0x16

    move-object/from16 v8, p1

    invoke-direct {v5, v8, v6}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object/from16 v38, v5

    check-cast v38, Lkotlin/jvm/functions/Function1;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    const/high16 v9, 0x30000

    or-int/2addr v6, v9

    shl-int/lit8 v9, v5, 0x18

    or-int v40, v6, v9

    const v44, 0x3fffbcdd

    const/16 v45, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v39, v28

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v41, 0x6000

    const/16 v42, 0x0

    const/16 v43, 0x6

    invoke-static/range {v6 .. v45}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v12, v39

    const/4 v6, 0x6

    int-to-float v6, v6

    mul-float v6, v6, v48

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lib2/e$a;->b()Z

    move-result v7

    sget v2, Lea2/s;->o:I

    invoke-static {v12, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-ne v3, v0, :cond_1a

    move/from16 v8, v47

    :goto_11
    const/4 v6, 0x4

    goto :goto_12

    :cond_1a
    const/4 v8, 0x0

    goto :goto_11

    :goto_12
    if-eq v4, v6, :cond_1c

    and-int/lit8 v0, v46, 0x8

    move-object/from16 v3, p0

    if-eqz v0, :cond_1b

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_13

    :cond_1b
    const/4 v0, 0x0

    goto :goto_14

    :cond_1c
    move-object/from16 v3, p0

    :goto_13
    move/from16 v0, v47

    :goto_14
    or-int/2addr v0, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1e

    if-ne v4, v1, :cond_1d

    goto :goto_15

    :cond_1d
    move-object/from16 v1, p1

    goto :goto_16

    :cond_1e
    :goto_15
    new-instance v4, Li01/d;

    const/4 v0, 0x5

    move-object/from16 v1, p1

    invoke-direct {v4, v1, v3, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    move-object/from16 v19, v4

    check-cast v19, Lc93/a;

    shl-int/lit8 v21, v5, 0x12

    const/16 v22, 0x0

    const/16 v23, 0x1fbd

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v12

    move-object v12, v2

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v20

    move/from16 v0, v47

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_1f
    move-object v1, v5

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_17
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lh02/i;

    const/16 v2, 0xa

    move-object/from16 v4, p2

    move-object v5, v1

    move/from16 v1, p4

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final B(Ltr2/n;Lib2/e$a;)Ll83/a0;
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lib2/c$b;

    invoke-direct {v0, p1}, Lib2/c$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Lib2/e$a;)Ll83/a0;
    .locals 1

    new-instance v0, Lib2/c$d;

    invoke-virtual {p1}, Lib2/e$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lib2/c$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lib2/b;->A(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lib2/b;->w()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lib2/b;->t(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltr2/n;Lib2/e$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lib2/b;->B(Ltr2/n;Lib2/e$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lib2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lib2/b;->x(Lkotlin/jvm/functions/Function1;Lib2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lib2/b;->C()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lib2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lib2/b;->v(Lib2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lib2/b;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lib2/d;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lib2/b;->u(Lib2/d;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lib2/b;->s(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lib2/b;->D(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lib2/b;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lib2/e$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lib2/b;->E(Lkotlin/jvm/functions/Function1;Lib2/e$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lib2/b;->F(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lib2/b;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lib2/d;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/d;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v0, -0x230c4d7f

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x1

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v0, p0

    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    move v5, v7

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v3, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v5, p3, 0x1

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_8

    and-int/lit8 v1, v1, -0xf

    :cond_8
    move-object v7, v0

    move v9, v1

    move-object v8, v4

    goto/16 :goto_7

    :cond_9
    :goto_5
    and-int/lit8 v5, p4, 0x1

    if-eqz v5, :cond_d

    const v0, 0x59f3c69b

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_c

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v8, v0, Lwf3/a;->d:Lxf3/c;

    const v0, 0x59f3c7cc

    const v5, -0x384098

    invoke-static {v3, v0, v3, v7, v5}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    const/4 v13, 0x0

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_a

    if-ne v10, v6, :cond_b

    :cond_a
    new-instance v10, Lib2/b$a;

    invoke-direct {v10, v0}, Lib2/b$a;-><init>(Ljf3/a;)V

    const-class v0, Lib2/d;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static/range {v8 .. v13}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v10

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    check-cast v10, Landroidx/lifecycle/w1;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    move-object v0, v10

    check-cast v0, Lib2/d;

    and-int/lit8 v1, v1, -0xf

    goto :goto_6

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_6
    if-eqz v2, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_e

    new-instance v2, Li21/r;

    const/16 v4, 0xe

    invoke-direct {v2, v4}, Li21/r;-><init>(I)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lc93/a;

    move-object v7, v0

    move v9, v1

    move-object v8, v2

    :goto_7
    invoke-virtual {v3}, Lp1/q;->r()V

    invoke-virtual {v7}, Lib2/d;->getViewState()Lec3/f2;

    move-result-object v0

    new-instance v1, Lib2/e$a;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v16}, Lib2/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v2, 0x3

    const/4 v5, 0x2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-static {v0}, Lib2/b;->r(Lp1/t2;)Lib2/e;

    move-result-object v0

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_f

    if-ne v2, v6, :cond_10

    :cond_f
    new-instance v2, Lib2/b$b;

    invoke-direct {v2, v7}, Lib2/b$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lj93/g;

    move-object v1, v2

    check-cast v1, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v2, v9, 0x3

    and-int/lit16 v4, v2, 0x380

    const/4 v5, 0x0

    move-object v2, v8

    invoke-static/range {v0 .. v5}, Lib2/b;->p(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v2

    move-object v9, v7

    goto :goto_8

    :cond_11
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v9, v0

    move-object v11, v4

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v8, Lfc0/e;

    const/16 v13, 0x1a

    move/from16 v10, p3

    move/from16 v12, p4

    invoke-direct/range {v8 .. v13}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v8, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final p(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x653a548a

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v5, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v6, p5, 0x2

    const/16 v7, 0x20

    if-eqz v6, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    move v9, v7

    goto :goto_3

    :cond_5
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v2, v9

    :goto_4
    and-int/lit8 v9, p5, 0x4

    const/16 v10, 0x100

    if-eqz v9, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v11, v1, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    move v12, v10

    goto :goto_5

    :cond_8
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v2, v12

    :goto_6
    and-int/lit16 v12, v2, 0x93

    const/16 v13, 0x92

    const/4 v15, 0x0

    if-eq v12, v13, :cond_9

    const/4 v12, 0x1

    goto :goto_7

    :cond_9
    move v12, v15

    :goto_7
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_24

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_a

    new-instance v6, Lib0/c;

    const/4 v8, 0x2

    invoke-direct {v6, v8}, Lib0/c;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v6, v8

    :goto_8
    if-eqz v9, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v12, :cond_c

    new-instance v8, Li21/r;

    const/16 v9, 0x10

    invoke-direct {v8, v9}, Li21/r;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lc93/a;

    move-object v11, v8

    :cond_d
    and-int/lit8 v8, v2, 0x70

    if-ne v8, v7, :cond_e

    const/4 v9, 0x1

    goto :goto_9

    :cond_e
    move v9, v15

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x0

    if-nez v9, :cond_f

    if-ne v13, v12, :cond_10

    :cond_f
    new-instance v13, Lib2/b$c;

    invoke-direct {v13, v6, v14}, Lib2/b$c;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lc93/m;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v13, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v9, v4, Lib2/e$c;

    if-eqz v9, :cond_11

    const v2, 0x110746f

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    sget v2, Lea2/s;->M0:I

    invoke-static {v0, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lsz0/p0$c;->f:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v3, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v29, v17

    move-object/from16 v17, v0

    move/from16 v0, v29

    move-object/from16 v29, v6

    move-object v6, v2

    move-object/from16 v2, v29

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object v0, v2

    goto/16 :goto_11

    :cond_11
    move-object v9, v6

    move-object v6, v0

    move v0, v15

    instance-of v13, v4, Lib2/e$b;

    if-eqz v13, :cond_1e

    const v10, 0x1146b71

    invoke-virtual {v6, v10}, Lp1/q;->e0(I)V

    move-object v10, v4

    check-cast v10, Lib2/e$b;

    invoke-virtual {v10}, Lib2/e$b;->c()Z

    move-result v13

    if-eqz v13, :cond_1a

    const v10, 0x1150769

    invoke-virtual {v6, v10}, Lp1/q;->e0(I)V

    new-instance v16, Lsz0/p0$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->m:I

    invoke-direct {v10, v13, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v10

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    const/high16 p1, 0x30000

    sget v15, Luv0/c;->N:I

    invoke-direct {v13, v15, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgy0/f;->K:I

    invoke-direct {v15, v0, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v8, v7, :cond_12

    const/4 v0, 0x1

    goto :goto_a

    :cond_12
    const/4 v0, 0x0

    :goto_a
    and-int/lit8 v5, v2, 0xe

    if-eq v5, v3, :cond_14

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_13

    invoke-virtual {v6, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_b

    :cond_13
    const/4 v2, 0x0

    goto :goto_c

    :cond_14
    :goto_b
    const/4 v2, 0x1

    :goto_c
    or-int/2addr v0, v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_15

    if-ne v2, v12, :cond_16

    :cond_15
    new-instance v2, Li01/d;

    const/4 v0, 0x6

    invoke-direct {v2, v9, v4, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Lc93/a;

    if-ne v8, v7, :cond_17

    const/4 v14, 0x1

    goto :goto_d

    :cond_17
    const/4 v14, 0x0

    :goto_d
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_18

    if-ne v0, v12, :cond_19

    :cond_18
    new-instance v0, Lgz/a;

    const/16 v3, 0x19

    invoke-direct {v0, v9, v3}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v0, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    or-int v3, v3, p1

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v3, v5

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v5, 0x9

    or-int/2addr v3, v7

    shl-int/lit8 v5, v5, 0x15

    or-int v18, v3, v5

    const/16 v19, 0x0

    const/16 v20, 0xe44

    const/4 v7, 0x0

    move-object/from16 v17, v6

    move-object v6, v10

    const/4 v10, 0x1

    move-object v3, v11

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v12, v15

    const/4 v15, 0x0

    move-object/from16 v5, v16

    const/16 v16, 0x0

    move-object v8, v13

    move-object v13, v0

    move-object v0, v9

    move-object v9, v2

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_1a
    move-object v0, v9

    move-object v3, v11

    const/high16 p1, 0x30000

    const v2, 0x11e80eb

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    new-instance v15, Lsz0/p0$b;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->m:I

    invoke-direct {v2, v9, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v15 .. v20}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lib2/e$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lgy0/f;->K:I

    invoke-direct {v9, v10, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v8, v7, :cond_1b

    const/4 v14, 0x1

    goto :goto_e

    :cond_1b
    const/4 v14, 0x0

    :goto_e
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_1c

    if-ne v5, v12, :cond_1d

    :cond_1c
    new-instance v5, Lgz/a;

    const/16 v7, 0x1a

    invoke-direct {v5, v0, v7}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v5, Lc93/a;

    sget v7, Lsz0/p0$b;->h:I

    or-int v7, v7, p1

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v7, v8

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v8, 0x9

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xfc4

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v9

    move-object v9, v5

    move-object v5, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v6

    move-object v6, v2

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_11

    :cond_1e
    move-object v0, v9

    move-object v3, v11

    instance-of v7, v4, Lib2/e$d;

    if-eqz v7, :cond_22

    const v7, 0x12608f9

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->q:I

    invoke-direct {v7, v8, v14, v5, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v2, v2, 0x380

    if-ne v2, v10, :cond_1f

    const/4 v14, 0x1

    goto :goto_10

    :cond_1f
    const/4 v14, 0x0

    :goto_10
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v14, :cond_20

    if-ne v2, v12, :cond_21

    :cond_20
    new-instance v2, Lg40/i3;

    const/16 v5, 0x1a

    invoke-direct {v2, v3, v5}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v26, v2

    check-cast v26, Lc93/a;

    new-instance v5, Lsz0/p0$h;

    const-wide/16 v24, 0x0

    const/16 v27, 0x2

    const/16 v28, 0x0

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    invoke-direct/range {v22 .. v28}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v6

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v2, Lsz0/p0$h;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v2, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_22
    const/4 v5, 0x0

    instance-of v7, v4, Lib2/e$a;

    if-eqz v7, :cond_23

    const v7, 0x12b3848

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    move-object v7, v4

    check-cast v7, Lib2/e$a;

    and-int/lit16 v2, v2, 0x3fe

    invoke-static {v7, v0, v3, v6, v2}, Lib2/b;->A(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_11
    move-object v5, v3

    goto :goto_12

    :cond_23
    const v0, 0x8c928

    invoke-static {v0, v6, v5}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_24
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v0, v8

    move-object v5, v11

    :goto_12
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_25

    move-object v6, v0

    new-instance v0, Lhy0/v;

    const/4 v3, 0x7

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lp1/t2;)Lib2/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lib2/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lib2/e;

    return-object p0
.end method

.method private static final s(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lib2/b;->p(Lib2/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lib2/d;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lib2/b;->o(Lib2/d;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lib2/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lib2/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lib2/c$d;

    check-cast p1, Lib2/e$b;

    invoke-virtual {p1}, Lib2/e$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lib2/c$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lib2/c$a;->a:Lib2/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lib2/c$a;->a:Lib2/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

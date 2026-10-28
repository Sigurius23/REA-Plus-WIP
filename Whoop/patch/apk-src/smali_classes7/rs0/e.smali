.class public abstract Lrs0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a5\u0010\n\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "backButtonAction",
        "Lms0/c;",
        "viewModel",
        "f",
        "(Lc93/a;Lms0/c;Landroidx/compose/runtime/Composer;II)V",
        "onRetry",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "d",
        "(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "connectivity-common-ui_release"
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
.method public static synthetic a(Lms0/c;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs0/e;->g(Lms0/c;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p2

    move-object p2, p0

    move-object p0, p1

    move-object p1, v0

    invoke-static/range {p0 .. p6}, Lrs0/e;->e(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lms0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrs0/e;->h(Lc93/a;Lms0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move/from16 v15, p4

    const-string v0, "backButtonAction"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRetry"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x2debf982

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v15, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v15

    goto :goto_1

    :cond_1
    move v0, v15

    :goto_1
    and-int/lit8 v2, v15, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v3, p2

    :goto_3
    move v13, v0

    goto :goto_5

    :cond_5
    and-int/lit16 v3, v15, 0x180

    if-nez v3, :cond_4

    move-object/from16 v3, p2

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_4

    :cond_6
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    goto :goto_3

    :goto_5
    and-int/lit16 v0, v13, 0x93

    const/16 v4, 0x92

    const/4 v14, 0x0

    const/4 v5, 0x1

    if-eq v0, v4, :cond_7

    move v0, v5

    goto :goto_6

    :cond_7
    move v0, v14

    :goto_6
    and-int/lit8 v4, v13, 0x1

    invoke-virtual {v11, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_8

    move-object/from16 v0, v16

    goto :goto_7

    :cond_8
    move-object v0, v3

    :goto_7
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "wake_up_your_whoop_pairing_help_screen"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v6, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v11, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v17, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v3, Los0/h;->a:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v18

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->q()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    sget v3, Luv0/c;->E:I

    invoke-static {v11, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v21

    const v34, 0xfff2

    const/16 v35, 0x0

    const/16 v19, 0x0

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

    const/16 v33, 0x0

    invoke-direct/range {v17 .. v35}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    int-to-float v7, v5

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float v18, v7, v14

    const/16 v21, 0x7

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v17, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v18, v2

    const/4 v2, 0x3

    shl-int/lit8 v17, v17, 0x3

    const/4 v2, 0x6

    or-int/lit8 v17, v17, 0x6

    shl-int/lit8 v2, v13, 0x9

    and-int/lit16 v2, v2, 0x1c00

    or-int v2, v17, v2

    move-object/from16 v17, v8

    const/16 v8, 0x34

    move-object/from16 v22, v0

    move-object v0, v7

    move v7, v2

    const/4 v2, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    move/from16 v24, v5

    const/4 v5, 0x0

    move-object v10, v3

    move-object v3, v1

    move-object v1, v10

    move-object v10, v11

    move-object v11, v6

    move-object v6, v10

    move/from16 v43, v13

    move/from16 v44, v14

    move-object/from16 v14, v17

    move-object/from16 v10, v18

    move-object/from16 v42, v22

    move-object/from16 v13, v23

    const/4 v15, 0x3

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v6

    invoke-static/range {v20 .. v20}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    move/from16 v18, v20

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v7, v16

    int-to-float v2, v15

    mul-float v8, v2, v44

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v8, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {v0, v11, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v5, v4, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v4, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Los0/h;->d:I

    invoke-static {v4, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v0, v4, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v36

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v40, v5, 0x12

    const v41, 0x2fffa

    const/16 v17, 0x0

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

    const/16 v39, 0x0

    move-object/from16 v38, v4

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget v5, Los0/h;->c:I

    invoke-static {v4, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v18

    invoke-virtual {v0, v4, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    sget v1, Los0/f;->a:I

    const/4 v5, 0x0

    invoke-static {v1, v4, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v16

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v5, v1

    const-wide/16 v9, 0x0

    cmpl-double v5, v5, v9

    if-lez v5, :cond_f

    goto :goto_a

    :cond_f
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v9, v1, v6

    if-lez v9, :cond_10

    goto :goto_b

    :cond_10
    move v6, v1

    :goto_b
    invoke-direct {v5, v6, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v1, Lb2/e;->N:Lb2/k;

    invoke-static {v1, v5}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v24, 0x30

    const/16 v25, 0x78

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, v4

    invoke-static/range {v16 .. v25}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    new-instance v9, Lzt2/e;

    sget v1, Los0/h;->b:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    new-instance v11, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/i0;->w()I

    move-result v1

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v11, v1, v5, v6, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v12, v1, v1

    new-instance v13, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v13

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lzt2/e;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x2

    invoke-static {v7, v8, v2, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v5, Lzt2/e;->e:I

    shl-int/2addr v5, v15

    or-int/2addr v5, v3

    const/4 v6, 0x4

    move/from16 v46, v3

    const/4 v3, 0x0

    move-object/from16 v47, v9

    move v9, v2

    move-object/from16 v2, v47

    invoke-static/range {v1 .. v6}, Lzt2/d;->e(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget v1, Luv0/c;->N:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v20, v1, v44

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v7

    move/from16 v18, v8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v3, v18

    const/4 v6, 0x2

    invoke-static {v1, v3, v9, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v3, "wake_up_your_whoop_pairing_help_retry_button"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x6

    or-int/lit8 v12, v3, 0x6

    shr-int/lit8 v3, v43, 0x3

    and-int/lit8 v13, v3, 0xe

    const/16 v14, 0x3fa

    move/from16 v45, v0

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object/from16 v38, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p1

    move-object/from16 v11, v38

    move/from16 v15, v45

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v4, v11

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    move-object/from16 v3, v42

    goto :goto_c

    :cond_11
    move-object v4, v11

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lfg2/k;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lfg2/k;-><init>(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final e(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lrs0/e;->d(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lc93/a;Lms0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lms0/c;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "backButtonAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v1, -0x7e446383

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, p4, 0x2

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v4, p1

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v3, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v5, p3, 0x1

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_8

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_7

    :goto_5
    and-int/lit8 v1, v1, -0x71

    :cond_7
    move-object v9, v4

    goto :goto_7

    :cond_8
    :goto_6
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_7

    const v4, 0x59f3c69b

    invoke-virtual {v3, v4}, Lp1/q;->f0(I)V

    sget-object v4, Lpf3/a;->b:Lnf3/a;

    if-eqz v4, :cond_b

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v9, v4, Lwf3/a;->d:Lxf3/c;

    const v4, 0x59f3c7cc

    const v5, -0x384098

    invoke-static {v3, v4, v3, v8, v5}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v4

    const/4 v10, 0x0

    invoke-virtual {v3, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v5, v11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_9

    if-ne v11, v6, :cond_a

    :cond_9
    new-instance v11, Lrs0/e$a;

    invoke-direct {v11, v4}, Lrs0/e$a;-><init>(Ljf3/a;)V

    const-class v4, Lms0/c;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static/range {v9 .. v14}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v11

    invoke-virtual {v3, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    check-cast v11, Landroidx/lifecycle/w1;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    move-object v4, v11

    check-cast v4, Lms0/c;

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_7
    invoke-virtual {v3}, Lp1/q;->r()V

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v1, v1, 0xe

    if-ne v1, v2, :cond_c

    goto :goto_8

    :cond_c
    move v7, v8

    :goto_8
    or-int v2, v4, v7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_d

    if-ne v4, v6, :cond_e

    :cond_d
    new-instance v4, Lqt2/e;

    const/16 v2, 0x12

    invoke-direct {v4, v2, v9, v0}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lc93/a;

    const/4 v2, 0x0

    const/4 v5, 0x4

    move-object v15, v4

    move v4, v1

    move-object v1, v15

    invoke-static/range {v0 .. v5}, Lrs0/e;->d(Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v9

    goto :goto_9

    :cond_f
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lqk2/i;

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move/from16 v2, p3

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(Lms0/c;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lns0/c$a;->a:Lns0/c$a;

    invoke-virtual {p0, v0}, Lms0/c;->g(Lns0/c;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc93/a;Lms0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrs0/e;->f(Lc93/a;Lms0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

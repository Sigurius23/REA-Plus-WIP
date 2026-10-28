.class public abstract Lsy2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lty2/a$a$g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "d",
        "(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method public static synthetic a(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/f;->e(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/f;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/f;->g(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x1a1b56d3

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

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
    and-int/lit8 v5, v0, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    if-eq v5, v7, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    move v5, v9

    :goto_3
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1b

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-eqz v4, :cond_5

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v11, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v13, v11, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v7, v11, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 v19, v10

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v20, v0

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-eqz v0, :cond_8

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {v9, v11, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v20, 0x70

    and-int/lit8 v7, v20, 0x7e

    invoke-static {v1, v2, v11, v7}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    const-wide/16 v20, 0x0

    cmpl-double v8, v8, v20

    const-string v9, "invalid weight; must be greater than zero"

    if-lez v8, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v10, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v17, v7, v10

    move/from16 v22, v10

    if-lez v17, :cond_c

    :goto_7
    const/4 v1, 0x1

    goto :goto_8

    :cond_c
    move v10, v7

    goto :goto_7

    :goto_8
    invoke-direct {v8, v10, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v7, v19

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move-object v10, v9

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_d

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v8, v11, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v11, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->H:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v5, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v8, 0x0

    invoke-static {v8, v11, v3}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v3, 0xe

    invoke-static {v1, v7, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x30

    invoke-static {v13, v3, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_10

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_11
    invoke-static {v7, v11, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v11, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v3, v7

    cmpl-double v1, v3, v20

    if-lez v1, :cond_13

    goto :goto_b

    :cond_13
    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v7, v22

    if-lez v3, :cond_14

    move/from16 v7, v22

    :goto_c
    const/4 v3, 0x1

    goto :goto_d

    :cond_14
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_c

    :goto_d
    invoke-direct {v1, v7, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$g;->f()Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x8

    if-nez v1, :cond_15

    const v1, 0x264cf6b5

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object v2, v5

    move v3, v8

    move-object v13, v11

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_15
    const/4 v8, 0x0

    const v6, 0x264cf6b6

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-static {v1, v11, v8}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v8}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v9

    int-to-float v10, v4

    mul-float v18, v9, v10

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v9, v12

    mul-float v17, v9, v10

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v10, Liz0/m;->p:I

    shl-int/lit8 v14, v10, 0x9

    const/16 v15, 0x1f4

    move/from16 v17, v6

    const/4 v6, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    move-object v10, v5

    move-object v5, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object v4, v1

    move-object/from16 v2, v16

    move/from16 v1, v17

    move/from16 v3, v18

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lty2/a$a$g;->h()Ljava/lang/String;

    move-result-object v4

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_16

    const v1, 0x26563a73

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v1, 0x1

    goto :goto_10

    :cond_16
    const v5, 0x26563a74

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "basicStepImage"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_17

    new-instance v2, Lsl0/h3;

    const/16 v5, 0x1b

    invoke-direct {v2, v5}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v2, Lkd1/o;->a:I

    or-int/lit16 v8, v2, 0x180

    const/4 v9, 0x1

    const/4 v5, 0x0

    move-object v7, v13

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$g;->g()Ljava/lang/String;

    move-result-object v5

    const/16 v12, 0x6180

    move-object v11, v13

    const/16 v13, 0x68

    const/4 v7, 0x0

    sget-object v8, Ly2/j;->d:Ly2/b1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v1

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v11

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$g;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$g;->j()Z

    move-result v5

    const/16 v1, 0x20

    if-ne v0, v1, :cond_18

    const/4 v8, 0x1

    goto :goto_11

    :cond_18
    move v8, v3

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_1a

    if-ne v0, v14, :cond_19

    goto :goto_12

    :cond_19
    move-object/from16 v2, p1

    goto :goto_13

    :cond_1a
    :goto_12
    new-instance v0, Lsy2/a;

    const/4 v1, 0x2

    move-object/from16 v2, p1

    invoke-direct {v0, v2, v1}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v7, v0

    check-cast v7, Lc93/a;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v13

    invoke-static/range {v4 .. v10}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1b
    move-object v13, v11

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1c

    new-instance v0, Ls01/e;

    const/16 v5, 0xa

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final e(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmh/h;->b()V

    const/16 v0, 0x12c

    invoke-virtual {p0, v0}, Lmh/h;->c(I)V

    sget-object v0, Lnh/h;->c:Lnh/h;

    invoke-virtual {p0, v0}, Lmh/h;->e(Lnh/h;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$o;->a:Lny2/a$o;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsy2/f;->d(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

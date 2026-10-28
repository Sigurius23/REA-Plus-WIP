.class public abstract Lsy2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lty2/a$a$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "d",
        "(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/b;->g(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/b;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Llz2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy2/b;->e(Lkotlin/jvm/functions/Function1;Llz2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$a;",
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

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, -0x60d24c00

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, p4, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x0

    if-eq v4, v6, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v13, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_20

    and-int/lit8 v4, v0, 0x70

    if-ne v4, v5, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_6

    if-ne v9, v10, :cond_7

    :cond_6
    new-instance v9, Lsy2/b$a;

    const/4 v6, 0x0

    invoke-direct {v9, v2, v6}, Lsy2/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lc93/m;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-static {v13, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v13, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v13, v12, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v18, v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_9
    move/from16 v18, v0

    :goto_6
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v14, v8, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move/from16 v20, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v21, v10

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v13, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v3, v13, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v13, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v18, 0x7e

    invoke-static {v1, v2, v13, v3}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v8, v3

    const-wide/16 v22, 0x0

    cmpl-double v4, v8, v22

    const-string v8, "invalid weight; must be greater than zero"

    if-lez v4, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v3, v9

    if-lez v10, :cond_f

    move v10, v9

    move/from16 v18, v10

    :goto_9
    const/4 v9, 0x1

    goto :goto_a

    :cond_f
    move v10, v3

    move/from16 v18, v9

    goto :goto_9

    :goto_a
    invoke-direct {v4, v10, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v3, 0x0

    invoke-static {v11, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_10

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v3, v13, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v13, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/e;->H:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v6, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v9, 0x1

    invoke-static {v4, v13, v9}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v10

    const/16 v4, 0xe

    invoke-static {v3, v10, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v25, v3, v4

    int-to-float v3, v9

    mul-float v26, v3, v4

    const/16 v28, 0x0

    const/16 v29, 0x8

    move/from16 v27, v25

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x30

    invoke-static {v14, v9, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move v14, v10

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v24, v14

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :cond_14
    invoke-static {v10, v13, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v13, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v9, v3

    cmpl-double v0, v9, v22

    if-lez v0, :cond_16

    goto :goto_d

    :cond_16
    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v3, v18

    if-lez v5, :cond_17

    move/from16 v3, v18

    :goto_e
    const/4 v9, 0x1

    goto :goto_f

    :cond_17
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_e

    :goto_f
    invoke-direct {v0, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lty2/a$a$a;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_18

    const v0, -0xb52ee94

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    move v2, v3

    move-object v1, v6

    move/from16 v3, v20

    move/from16 v0, v26

    goto :goto_10

    :cond_18
    const/4 v3, 0x0

    const v5, -0xb52ee93

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-static {v0, v13, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v3}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v10

    mul-float v16, v5, v4

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v4, Liz0/m;->p:I

    shl-int/lit8 v4, v4, 0x9

    or-int/lit8 v14, v4, 0x30

    const/16 v15, 0x1f4

    move-object v4, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v2, v3

    move-object v1, v4

    move/from16 v3, v20

    move-object v4, v0

    move/from16 v0, v26

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_10
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, -0x73fa2526

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$a;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llz2/b;

    const/16 v4, 0x20

    if-ne v3, v4, :cond_19

    const/4 v7, 0x1

    goto :goto_12

    :cond_19
    move v7, v2

    :goto_12
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1b

    move-object/from16 v4, v21

    if-ne v5, v4, :cond_1a

    goto :goto_13

    :cond_1a
    move-object/from16 v11, p1

    goto :goto_14

    :cond_1b
    move-object/from16 v4, v21

    :goto_13
    new-instance v5, Lsy2/j;

    const/4 v6, 0x1

    move-object/from16 v11, p1

    invoke-direct {v5, v6, v11, v1}, Lsy2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v5, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v5, v13, v6, v2}, Lry2/a;->d(Llz2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v21, v4

    goto :goto_11

    :cond_1c
    move-object/from16 v11, p1

    move-object/from16 v4, v21

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$a;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$a;->i()Z

    move-result v5

    const/16 v1, 0x20

    if-ne v3, v1, :cond_1d

    const/4 v7, 0x1

    goto :goto_15

    :cond_1d
    move v7, v2

    :goto_15
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v7, :cond_1e

    if-ne v1, v4, :cond_1f

    :cond_1e
    new-instance v1, Lsy2/a;

    const/4 v2, 0x0

    invoke-direct {v1, v11, v2}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object v7, v1

    check-cast v7, Lc93/a;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v4, v0

    move-object v8, v13

    invoke-static/range {v4 .. v10}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_20
    move-object v11, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_16
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v0, Ls01/e;

    const/16 v5, 0x9

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v2, v11

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Llz2/b;)Ll83/a0;
    .locals 1

    new-instance v0, Lny2/a$c;

    invoke-virtual {p1}, Llz2/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lny2/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private static final g(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsy2/b;->d(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

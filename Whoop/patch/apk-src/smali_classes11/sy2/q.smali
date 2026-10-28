.class public abstract Lsy2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lty2/a$a$h;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/q;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;II)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsy2/q;->e(Lkotlin/jvm/functions/Function1;II)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsy2/q;->g(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, -0x6f68107a

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    if-eq v4, v6, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v13, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v13, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_5

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v13, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v13, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v12, v13, v12, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v8, v3, 0x70

    and-int/lit8 v3, v3, 0x7e

    invoke-static {v0, v1, v13, v3}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v12, v8

    float-to-double v8, v4

    const-wide/16 v18, 0x0

    cmpl-double v8, v8, v18

    if-lez v8, :cond_8

    :goto_5
    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    invoke-static {v3, v8, v4}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v9, v13, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v9, 0xe

    invoke-static {v3, v4, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->d:Ll0/g;

    const/4 v9, 0x6

    invoke-static {v4, v11, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v13, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v8, v13, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v13, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lty2/a$a$h;->f()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    const v3, -0x763d4882

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    move-object v2, v6

    move v3, v9

    move v0, v12

    goto :goto_8

    :cond_c
    const/4 v9, 0x0

    const v4, -0x763d4881

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v9}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v9}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v10

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v21, v3, v5

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v3, v10

    mul-float v20, v3, v5

    const/16 v23, 0x0

    const/16 v24, 0x8

    move/from16 v22, v20

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v3, Liz0/m;->p:I

    shl-int/lit8 v14, v3, 0x9

    const/16 v15, 0x1f4

    move-object v3, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object v2, v3

    move/from16 v3, v16

    move/from16 v0, v17

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_8
    const-string v4, "TimePicker"

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v2, 0x20

    if-ne v0, v2, :cond_d

    const/4 v7, 0x1

    goto :goto_9

    :cond_d
    move v7, v3

    :goto_9
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_e

    if-ne v2, v4, :cond_f

    :cond_e
    new-instance v2, Lsy2/l;

    const/4 v5, 0x2

    invoke-direct {v2, v1, v5}, Lsy2/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/m;

    const v15, 0x180c00

    const/16 v16, 0xb7

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v12, v9

    const-wide/16 v9, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v25, v13

    move-object v13, v2

    move-object v2, v14

    move-object/from16 v14, v25

    invoke-static/range {v4 .. v16}, Ll41/d;->g(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    const/4 v11, 0x1

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$h;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$h;->h()Z

    move-result v5

    const/16 v6, 0x20

    if-ne v0, v6, :cond_10

    move v7, v11

    goto :goto_a

    :cond_10
    move v7, v3

    :goto_a
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v7, :cond_11

    if-ne v0, v2, :cond_12

    :cond_11
    new-instance v0, Lsy2/a;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v7, v0

    check-cast v7, Lc93/a;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v13

    invoke-static/range {v4 .. v10}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v2, Lso2/f;

    const/16 v3, 0xc

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v1, v5, v3}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;II)Ll83/a0;
    .locals 1

    new-instance v0, Lny2/a$a0;

    invoke-direct {v0, p1, p2}, Lny2/a$a0;-><init>(II)V

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

.method private static final g(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsy2/q;->d(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

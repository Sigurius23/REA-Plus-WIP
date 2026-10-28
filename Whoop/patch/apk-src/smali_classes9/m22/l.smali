.class public abstract Lm22/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a/\u0010\u0004\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClicked",
        "onTroubleConnectingClicked",
        "g",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "e",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "pairing-ui_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/l;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm22/l;->j(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/l;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm22/l;->f(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v0, 0x721009f2

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p2, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x1

    if-eq v3, v2, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    int-to-float v3, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v5, v3, v6, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Ll0/m;->d:Ll0/g;

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v6, v7, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v7, v11, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v6, v3

    const-wide/16 v8, 0x0

    cmpl-double v2, v6, v8

    const-string v6, "invalid weight; must be greater than zero"

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v3, v7

    if-lez v12, :cond_7

    move v12, v7

    goto :goto_5

    :cond_7
    move v12, v3

    :goto_5
    invoke-direct {v2, v12, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v2, Lm22/c;->a:Lm22/c;

    invoke-virtual {v2}, Lm22/c;->b()Lc93/m;

    move-result-object v2

    const/4 v12, 0x6

    invoke-static {v2, v11, v12}, Ln22/b;->e(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    float-to-double v13, v3

    cmpl-double v2, v13, v8

    if-lez v2, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v7

    if-lez v6, :cond_9

    move v3, v7

    :cond_9
    invoke-direct {v2, v3, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v2, La22/b;->r:I

    invoke-static {v11, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v11, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->Q()Lb91/a;

    move-result-object v36

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v18

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v40, v6, 0x12

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

    move-object/from16 v38, v11

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget v6, La22/b;->q:I

    invoke-static {v11, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v2, v11, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v18

    new-instance v2, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const v41, 0x2fdfa

    move-object/from16 v28, v2

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    int-to-float v1, v1

    invoke-static {v1, v1, v5, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v2, La22/b;->s:I

    invoke-static {v11, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v3, v12

    and-int/lit8 v13, v0, 0xe

    const/16 v14, 0x3fb

    const/4 v0, 0x0

    move v6, v1

    const/4 v1, 0x0

    move v7, v12

    move v12, v3

    const/4 v3, 0x0

    move v8, v4

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    move/from16 v16, v6

    const/4 v6, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move/from16 v15, v17

    move-object/from16 v42, v19

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    int-to-float v0, v15

    move/from16 v6, v16

    move-object/from16 v9, v42

    const/4 v8, 0x1

    invoke-static {v0, v6, v9, v11, v8}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lch0/t;

    const/16 v2, 0xa

    move/from16 v15, p2

    invoke-direct {v1, v15, v2, v10}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final f(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lm22/l;->e(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x2720f7c7

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_7

    new-instance v1, Llt2/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lc93/a;

    goto :goto_5

    :cond_8
    move-object v1, v2

    :goto_5
    if-eqz v4, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_9

    new-instance v2, Llt2/a;

    const/16 v4, 0x1d

    invoke-direct {v2, v4}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lc93/a;

    goto :goto_6

    :cond_a
    move-object v2, v5

    :goto_6
    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v0, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6, v0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v3, 0xe

    invoke-static {v1, v0, v4}, Lo22/d;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v0, v3}, Lm22/l;->e(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    move-object v11, v1

    move-object v12, v2

    goto :goto_8

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v11, v2

    move-object v12, v5

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v10, Ldk2/d;

    const/4 v15, 0x4

    move/from16 v13, p3

    move/from16 v14, p4

    invoke-direct/range {v10 .. v15}, Ldk2/d;-><init>(Lc93/a;Lc93/a;III)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm22/l;->g(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

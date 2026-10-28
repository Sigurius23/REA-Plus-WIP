.class public abstract Lzc1/i5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a?\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ll83/a0;",
        "U",
        "(Landroidx/compose/runtime/Composer;I)V",
        "w",
        "I",
        "",
        "text",
        "",
        "enabled",
        "checked",
        "Lkotlin/Function1;",
        "onCheckedChange",
        "F",
        "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design-showcase_release"
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
.method private static final A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i5;->w(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Centered: Left Icon Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Centered: Right Icon Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 19

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->c()Ly71/g;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v17, 0x7ffb

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    invoke-static/range {v1 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->b(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 19

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/16 v17, 0x7ffe

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    invoke-static/range {v1 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->b(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x4d2febb7

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    move-object/from16 v6, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move/from16 v7, p1

    invoke-virtual {v14, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p2

    invoke-virtual {v14, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v5, 0xc00

    const/16 v11, 0x800

    if-nez v10, :cond_9

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v11

    goto :goto_6

    :cond_8
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v0, v10

    :cond_9
    and-int/lit16 v10, v0, 0x493

    const/16 v12, 0x492

    const/16 v32, 0x0

    const/4 v13, 0x1

    if-eq v10, v12, :cond_a

    move v10, v13

    goto :goto_7

    :cond_a
    move/from16 v10, v32

    :goto_7
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v14, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_13

    if-eqz v3, :cond_b

    move v3, v13

    goto :goto_8

    :cond_b
    move v3, v7

    :goto_8
    if-eqz v8, :cond_c

    move/from16 v33, v13

    goto :goto_9

    :cond_c
    move/from16 v33, v9

    :goto_9
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0xa

    int-to-float v8, v8

    int-to-float v2, v2

    mul-float/2addr v8, v2

    int-to-float v1, v1

    mul-float/2addr v1, v2

    invoke-static {v7, v8, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->g:Ll0/h;

    const/16 v8, 0x36

    invoke-static {v7, v2, v14, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_d

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v7, v14, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v8

    and-int/lit8 v29, v0, 0xe

    const/16 v30, 0x0

    const v31, 0x3fffa

    const/4 v7, 0x0

    move v1, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move v2, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v28

    and-int/lit16 v6, v0, 0x1c00

    if-ne v6, v1, :cond_10

    move/from16 v32, v2

    :cond_10
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v32, :cond_11

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v1, v6, :cond_12

    :cond_11
    new-instance v1, Lwo1/h;

    const/16 v6, 0x18

    invoke-direct {v1, v4, v6}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v1, 0x70

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v15, v1, v0

    const/16 v16, 0x39

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v8, v3

    move/from16 v7, v33

    invoke-static/range {v6 .. v16}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    move v3, v7

    move v2, v8

    goto :goto_b

    :cond_13
    invoke-virtual {v14}, Lp1/q;->X()V

    move v2, v7

    move v3, v9

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lb30/k4;

    const/16 v7, 0x9

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/k4;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Landroidx/compose/runtime/Composer;I)V
    .locals 47

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x16505e29

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1d

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-string v2, "Title"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->e()I

    move-result v2

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a;->l()I

    move-result v3

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/c;->b()I

    move-result v4

    invoke-static {v4}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v14

    const-string v4, "17.1"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v4, "Subtitle"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v19, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v20, 0x1f50

    const/16 v21, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v6, v19

    const/16 v19, 0x0

    invoke-direct/range {v6 .. v21}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v18, v2

    check-cast v18, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_2

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v27, v2

    check-cast v27, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_6

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v28, v8

    check-cast v28, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_8

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_9

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_a

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lp1/c1;

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v5, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->o()Lb91/a;

    move-result-object v21

    invoke-virtual {v12, v5, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    move-object/from16 p0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v23, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v16, v13

    new-instance v13, Lw3/k;

    move-object/from16 v17, v5

    const/4 v5, 0x3

    invoke-direct {v13, v5}, Lw3/k;-><init>(I)V

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v25, v19, 0x12

    const v26, 0x2fdf8

    move-object/from16 v19, v2

    move-object v2, v1

    const-string v1, "Left Aligned"

    move/from16 v22, v5

    move-object/from16 v20, v6

    const-wide/16 v5, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move-object/from16 v29, v8

    const/4 v8, 0x0

    move-object/from16 v30, v9

    const/4 v9, 0x0

    move-object/from16 v31, v10

    move-object/from16 v32, v11

    const-wide/16 v10, 0x0

    move-object/from16 v33, v12

    const/4 v12, 0x0

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-wide v3, v14

    const-wide/16 v14, 0x0

    move/from16 v36, v16

    const/16 v16, 0x0

    move-object/from16 v37, v17

    const/16 v17, 0x0

    move-object/from16 v38, v18

    const/16 v18, 0x0

    move-object/from16 v39, v19

    const/16 v19, 0x0

    move-object/from16 v40, v20

    const/16 v20, 0x0

    move/from16 v41, v22

    const/16 v22, 0x0

    move-object/from16 v42, v24

    const/16 v24, 0x36

    move-object/from16 v45, v35

    move/from16 v44, v36

    move-object/from16 v0, v37

    move-object/from16 v43, v40

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v23

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v10, v1, v2

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v1, v33

    move/from16 v2, v44

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->z()J

    move-result-wide v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface/range {v38 .. v38}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/atomic/organism/toolbar/d;

    move-object/from16 v3, p0

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v11, v45

    if-nez v4, :cond_b

    if-ne v6, v11, :cond_c

    :cond_b
    new-instance v6, Lzc1/l1;

    const/16 v4, 0x12

    invoke-direct {v6, v3, v4}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v4, v6

    check-cast v4, Lc93/a;

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_d

    if-ne v7, v11, :cond_e

    :cond_d
    new-instance v7, Lzc1/l1;

    const/16 v6, 0xf

    invoke-direct {v7, v3, v6}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$c;->p:I

    shl-int/lit8 v8, v3, 0x3

    const/16 v9, 0x24

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v46, v7

    move-object v7, v5

    move-object/from16 v5, v46

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-interface/range {v39 .. v39}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v0, v43

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v11, :cond_f

    goto :goto_1

    :cond_f
    move-object/from16 v8, v38

    goto :goto_2

    :cond_10
    :goto_1
    new-instance v2, Lzc1/g5;

    const/4 v1, 0x0

    move-object/from16 v8, v38

    move-object/from16 v4, v39

    invoke-direct {v2, v4, v8, v0, v1}, Lzc1/g5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Left Icon"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v34 .. v34}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_11

    if-ne v2, v11, :cond_12

    :cond_11
    new-instance v2, Lzc1/g5;

    const/4 v1, 0x1

    move-object/from16 v4, v34

    invoke-direct {v2, v4, v8, v0, v1}, Lzc1/g5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Data"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v42 .. v42}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_13

    if-ne v2, v11, :cond_14

    :cond_13
    new-instance v2, Lzc1/g5;

    const/4 v1, 0x2

    move-object/from16 v7, v42

    invoke-direct {v2, v7, v8, v0, v1}, Lzc1/g5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Data Icon"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_16

    if-ne v2, v11, :cond_15

    goto :goto_3

    :cond_15
    move-object/from16 v17, v27

    goto :goto_4

    :cond_16
    :goto_3
    new-instance v15, Lry2/d;

    const/16 v20, 0x19

    move-object/from16 v19, v0

    move-object/from16 v18, v8

    move-object/from16 v17, v27

    move-object/from16 v16, v28

    invoke-direct/range {v15 .. v20}, Lry2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v15

    :goto_4
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Title"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface/range {v29 .. v29}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_17

    if-ne v4, v11, :cond_18

    :cond_17
    new-instance v4, Lzc1/g5;

    const/4 v1, 0x3

    move-object/from16 v6, v29

    invoke-direct {v4, v6, v8, v0, v1}, Lzc1/g5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v1, "Subtitle"

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v30 .. v30}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_19

    if-ne v2, v11, :cond_1a

    :cond_19
    new-instance v2, Lzc1/g5;

    const/4 v1, 0x4

    move-object/from16 v9, v30

    invoke-direct {v2, v9, v8, v0, v1}, Lzc1/g5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Right Icon"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v31 .. v31}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_1b

    new-instance v0, Lam2/j;

    const/16 v1, 0xb

    move-object/from16 v10, v31

    invoke-direct {v0, v1, v10, v8}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v6, 0xc06

    const/4 v7, 0x2

    const-string v1, "SecondaryMedium Left"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v32 .. v32}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_1c

    new-instance v0, Lam2/j;

    const/16 v1, 0xc

    move-object/from16 v11, v32

    invoke-direct {v0, v1, v11, v8}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v6, 0xc06

    const/4 v7, 0x2

    const-string v1, "SecondarySmall Right"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_1d
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1e

    new-instance v1, Lzc1/a5;

    const/16 v2, 0x8

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/a5;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final J(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Left Aligned: Left Icon Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Left Aligned: Right Icon Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->h()Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1ff7

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1ffe

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final N(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->g()Lkd1/o;

    move-result-object v0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1f7f

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p4, :cond_0

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1ffd

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final P(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1ffb

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Q(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->j()Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1fdf

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final R(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p2, :cond_0

    sget-object v0, Lny0/q$e;->f:Lny0/q$e;

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lny0/q$a;->f:Lny0/q$a;

    goto :goto_0

    :goto_1
    const/16 v15, 0x1dff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final S(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 17

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz p2, :cond_0

    sget-object v0, Lny0/q$g;->f:Lny0/q$g;

    :goto_0
    move-object v12, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lny0/q$a;->f:Lny0/q$a;

    goto :goto_0

    :goto_1
    const/16 v15, 0x1bff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->b(Lcom/whoop/design/atomic/organism/toolbar/d$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$c;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final T(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i5;->I(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final U(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p0, Lp1/q;

    const v0, -0x36a5d044

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, p0, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, p0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v8, p0, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p0, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lzc1/i5;->w(Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x5

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {v2, v3, v5, p0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {p0, v1}, Lzc1/i5;->I(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/a5;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lzc1/a5;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final V(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i5;->U(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzc1/i5;->H(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->N(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->x(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->M(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->T(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->Q(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i5;->C(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i5;->J(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->D(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->z(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i5;->K(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->R(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/i5;->O(Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/i5;->G(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i5;->B(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->P(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->E(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->S(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->y(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/i5;->L(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i5;->V(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Landroidx/compose/runtime/Composer;I)V
    .locals 44

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0xc50290a

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_13

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    new-instance v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v2, "Title"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const v23, 0xffea

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v6 .. v24}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_3

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_4

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_5

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v9, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_6

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v10, Lp1/c1;

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v5, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->o()Lb91/a;

    move-result-object v21

    invoke-virtual {v11, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    const/high16 v15, 0x3f800000    # 1.0f

    move-object/from16 v23, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object/from16 v16, v3

    move-wide/from16 v42, v13

    move-object v14, v4

    move-wide/from16 v3, v42

    new-instance v13, Lw3/k;

    move-object/from16 p0, v5

    const/4 v5, 0x3

    invoke-direct {v13, v5}, Lw3/k;-><init>(I)V

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v25, v17, 0x12

    const v26, 0x2fdf8

    move-object/from16 v17, v1

    const-string v1, "Centered"

    move/from16 v19, v5

    move-object/from16 v18, v6

    const-wide/16 v5, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v31, v2

    move-object/from16 v30, v14

    move-object v2, v15

    const-wide/16 v14, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move-object/from16 v33, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    move/from16 v35, v19

    const/16 v19, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x36

    move-object/from16 v0, p0

    move/from16 v40, v29

    move-object/from16 v41, v32

    move-object/from16 v39, v34

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v23

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v10, v1, v2

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v1, v28

    move/from16 v2, v40

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->z()J

    move-result-wide v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface/range {v31 .. v31}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/atomic/organism/toolbar/d;

    move-object/from16 v3, v33

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v11, v41

    if-nez v4, :cond_7

    if-ne v6, v11, :cond_8

    :cond_7
    new-instance v6, Lzc1/l1;

    const/16 v4, 0x10

    invoke-direct {v6, v3, v4}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v6

    check-cast v4, Lc93/a;

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_9

    if-ne v7, v11, :cond_a

    :cond_9
    new-instance v7, Lzc1/l1;

    const/16 v6, 0x11

    invoke-direct {v7, v3, v6}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v8, v3, 0x3

    const/16 v9, 0x24

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v42, v7

    move-object v7, v5

    move-object/from16 v5, v42

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-interface/range {v30 .. v30}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v0, v39

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v11, :cond_b

    goto :goto_1

    :cond_b
    move-object/from16 v8, v31

    goto :goto_2

    :cond_c
    :goto_1
    new-instance v2, Lzc1/h5;

    const/4 v1, 0x0

    move-object/from16 v14, v30

    move-object/from16 v8, v31

    invoke-direct {v2, v14, v8, v0, v1}, Lzc1/h5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Left Icon"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v36 .. v36}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    if-ne v2, v11, :cond_e

    :cond_d
    new-instance v2, Lzc1/h5;

    const/4 v1, 0x1

    move-object/from16 v7, v36

    invoke-direct {v2, v7, v8, v0, v1}, Lzc1/h5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Title"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_f

    if-ne v2, v11, :cond_10

    :cond_f
    new-instance v2, Lzc1/h5;

    const/4 v1, 0x2

    move-object/from16 v4, v37

    invoke-direct {v2, v4, v8, v0, v1}, Lzc1/h5;-><init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x6

    const/4 v7, 0x2

    const-string v1, "Right Icon"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v38 .. v38}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_11

    new-instance v0, Lam2/j;

    const/16 v1, 0xd

    move-object/from16 v9, v38

    invoke-direct {v0, v1, v9, v8}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v6, 0xc06

    const/4 v7, 0x2

    const-string v1, "SecondaryMedium Left"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v27 .. v27}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_12

    new-instance v0, Lam2/j;

    const/16 v1, 0xe

    move-object/from16 v10, v27

    invoke-direct {v0, v1, v10, v8}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v6, 0xc06

    const/4 v7, 0x2

    const-string v1, "SecondarySmall Right"

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lzc1/i5;->F(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_13
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lzc1/a5;

    const/16 v2, 0x9

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/a5;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final x(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;
    .locals 19

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz p3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->g()Ly71/g;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v17, 0x7ff7

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

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

    invoke-static/range {v1 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->b(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 19

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz p2, :cond_0

    sget-object v0, Lny0/q$e;->f:Lny0/q$e;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lny0/q$a;->f:Lny0/q$a;

    goto :goto_0

    :goto_1
    const/16 v17, 0x7fef

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    invoke-static/range {v1 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->b(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 19

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz p2, :cond_0

    sget-object v0, Lny0/q$g;->f:Lny0/q$g;

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lny0/q$a;->f:Lny0/q$a;

    goto :goto_0

    :goto_1
    const/16 v17, 0x7fdf

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v1 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->b(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.class public abstract Ler2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\n\u001a%\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ler2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "f",
        "(Ler2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "Ler2/a;",
        "chatBoxState",
        "k",
        "(Ler2/a;Landroidx/compose/runtime/Composer;I)V",
        "userChatBox",
        "i",
        "Landroidx/compose/ui/Modifier;",
        "Ler2/g;",
        "chatType",
        "isQuiz",
        "m",
        "(Landroidx/compose/ui/Modifier;Ler2/g;Z)Landroidx/compose/ui/Modifier;",
        "user-journey_release"
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
.method public static synthetic a(Ler2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ler2/e;->h(Ler2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ler2/e;->j(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ler2/e;->l(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ler2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ler2/e;->g(Ler2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ler2/g;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ler2/e;->o(Ler2/g;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ler2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x14394647

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lb30/a1;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, 0x490a26d1

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Ldr2/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Ldr2/b;-><init>(Ler2/b;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final g(Ler2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v0, p2

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x5

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v5, v1, v2

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float v1, v3

    mul-float v4, v1, v2

    const/4 v7, 0x0

    const/16 v8, 0x8

    sget-object v3, Lb2/t;->w:Lb2/t;

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x0

    invoke-static {v5, v6, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lp1/q;

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    iget-object v11, v6, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_0

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_0
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-nez v9, :cond_1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    :cond_1
    invoke-static {v8, v6, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v8, v4

    const-wide/16 v10, 0x0

    cmpl-double v1, v8, v10

    if-lez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v0, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ler2/b;->h()Ler2/a;

    move-result-object v1

    invoke-static {v1, v0, v7}, Ler2/e;->k(Ler2/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Ler2/b;->g()Ler2/a;

    move-result-object v1

    invoke-static {v1, v0, v7}, Ler2/e;->i(Ler2/a;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v7

    mul-float v13, v1, v2

    const-wide/high16 v7, 0x4016000000000000L    # 5.5

    double-to-float v1, v7

    mul-float v11, v1, v2

    const/4 v12, 0x0

    const/4 v14, 0x5

    const/4 v10, 0x0

    move-object v9, v3

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ler2/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v24, v10, 0x12

    const v25, 0x2fff8

    move-object v10, v4

    move v11, v5

    const-wide/16 v4, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    move v13, v7

    const/4 v7, 0x0

    move-object v0, v2

    move-wide/from16 v34, v8

    move v9, v3

    move-wide/from16 v2, v34

    const/4 v8, 0x0

    move v14, v9

    move-object v15, v10

    const-wide/16 v9, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v18, v14

    const-wide/16 v13, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v22, p2

    move/from16 v31, v26

    move/from16 v33, v27

    move-object/from16 v32, v28

    move-object/from16 v30, v29

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Ler2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v14, v31

    invoke-static {v1, v0, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v15, v32

    move/from16 v13, v33

    invoke-virtual {v15, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v15, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v2

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v11, 0x1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Ler2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ler2/e;->f(Ler2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Ler2/a;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v0, p0

    sget-object v2, Lb2/e;->K:Lb2/l;

    const-string v3, "userChatBox"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v3, -0xdf616ed

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v5, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v9

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v7, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_12

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v12, 0x401a000000000000L    # 6.5

    double-to-float v3, v12

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v12, v3, v6

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Lb2/e;->O:Lb2/k;

    sget-object v12, Ll0/m;->c:Ll0/g;

    const/16 v13, 0x30

    invoke-static {v12, v11, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v7, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v12, v7, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v8

    mul-float v14, v3, v6

    const/4 v15, 0x7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Ler2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v11, v7, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v7, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v12, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->b1()J

    move-result-wide v12

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v28, v15, 0x12

    const v29, 0x2fff8

    move v15, v8

    move/from16 v16, v9

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object/from16 v26, v7

    move-wide/from16 v37, v12

    move v13, v6

    move-wide/from16 v6, v37

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v20, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    move/from16 v25, v18

    const-wide/16 v17, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move-object/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v35, v27

    const/16 v27, 0x30

    move v1, v5

    move/from16 v36, v30

    move-object/from16 v0, v33

    move-object v5, v3

    move/from16 v3, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    const v4, 0x4967c5f0    # 949343.0f

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ler2/a;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    move v9, v3

    :goto_4
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v32, v9, 0x1

    const/4 v5, 0x0

    if-ltz v9, :cond_10

    check-cast v4, Lcom/whoop/design/util/TextResource;

    invoke-virtual/range {p0 .. p0}, Ler2/a;->b()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ne v6, v9, :cond_6

    invoke-virtual/range {p0 .. p0}, Ler2/a;->a()Lkd1/o;

    move-result-object v6

    if-eqz v6, :cond_6

    const/16 v33, 0x1

    goto :goto_5

    :cond_6
    move/from16 v33, v3

    :goto_5
    invoke-virtual/range {p0 .. p0}, Ler2/a;->c()Ler2/g;

    move-result-object v6

    invoke-static {v0, v6, v3, v1, v5}, Ler2/e;->n(Landroidx/compose/ui/Modifier;Ler2/g;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v1

    mul-float v14, v6, v35

    if-eqz v33, :cond_7

    move/from16 v6, v36

    goto :goto_6

    :cond_7
    move v6, v14

    :goto_6
    const-wide/high16 v8, 0x3ff4000000000000L    # 1.25

    if-eqz v33, :cond_8

    move/from16 v10, v36

    goto :goto_7

    :cond_8
    double-to-float v10, v8

    mul-float v10, v10, v35

    :goto_7
    if-eqz v33, :cond_9

    move/from16 v8, v36

    goto :goto_8

    :cond_9
    double-to-float v8, v8

    mul-float v8, v8, v35

    :goto_8
    invoke-static {v5, v14, v10, v6, v8}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v8, v7, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    invoke-static {v8, v7, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v7, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v33, :cond_d

    const-wide v5, 0x404d400000000000L    # 58.5

    double-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v8, v6

    mul-float/2addr v5, v8

    const/4 v8, 0x0

    const/4 v15, 0x1

    invoke-static {v0, v8, v5, v15}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v8, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v8, v2}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v5, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_a

    :cond_d
    const/4 v6, 0x4

    new-instance v5, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v5, v2}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    :goto_a
    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v7, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v7, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Ler2/a;->c()Ler2/g;

    move-result-object v10

    sget-object v11, Ler2/g;->STRAIN:Ler2/g;

    if-ne v10, v11, :cond_e

    const v10, -0x4f22344d

    invoke-static {v7, v10, v8, v7, v9}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v8

    :goto_b
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_e
    const v10, -0x4f22300d

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->w()J

    move-result-wide v8

    goto :goto_b

    :goto_c
    sget v10, Lb91/a;->d:I

    shl-int/lit8 v28, v10, 0x12

    const v29, 0x2fff8

    move/from16 v18, v6

    move-object/from16 v26, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v34, v18

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v1, v34

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    if-eqz v33, :cond_f

    invoke-virtual/range {p0 .. p0}, Ler2/a;->a()Lkd1/o;

    move-result-object v4

    if-eqz v4, :cond_f

    const v4, 0x6ade29d1

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    mul-float v11, v4, v35

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v14, v10

    const/4 v4, 0x6

    int-to-float v4, v4

    int-to-float v5, v1

    mul-float/2addr v4, v5

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->L:Lb2/l;

    new-instance v5, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v5, v4}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v0, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ler2/a;->a()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    const/4 v9, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object/from16 v26, v7

    const/16 v12, 0x30

    const/16 v13, 0x78

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v0

    move-object/from16 v11, v26

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_d
    move/from16 v0, v36

    const/4 v15, 0x1

    goto :goto_e

    :cond_f
    move-object v14, v0

    const v0, 0x6ae3b6f9

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-static {v7, v15, v14, v0, v7}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    move/from16 v36, v0

    move-object v0, v14

    move/from16 v9, v32

    const/4 v1, 0x2

    goto/16 :goto_4

    :cond_10
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_11
    const/4 v15, 0x1

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Ler2/c;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ler2/c;-><init>(Ler2/a;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final j(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ler2/e;->i(Ler2/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Ler2/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "chatBoxState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x57171ca5

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v5, v2, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v7

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v12, v3, v4

    const/4 v13, 0x7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v29, v8

    invoke-virtual {v0}, Ler2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v2, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v2, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v8, v2, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v27, v10, 0x12

    const v28, 0x2fff8

    move v10, v6

    move v11, v7

    move/from16 v33, v4

    move-object v4, v3

    move-object v3, v5

    move-wide v5, v8

    move/from16 v9, v33

    const-wide/16 v7, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    move/from16 v16, v13

    const-wide/16 v12, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x30

    move/from16 v30, v25

    move-object/from16 v25, v2

    move/from16 v2, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const v4, -0x59808f08

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ler2/a;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v28

    move v6, v2

    :goto_4
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v31, v6, 0x1

    if-ltz v6, :cond_d

    check-cast v4, Lcom/whoop/design/util/TextResource;

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v7, v7

    mul-float v12, v7, v30

    const-wide/high16 v7, 0x4016000000000000L    # 5.5

    double-to-float v7, v7

    mul-float v11, v7, v30

    const/4 v10, 0x0

    const/4 v13, 0x3

    const/4 v9, 0x0

    move-object/from16 v8, v29

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v10, v3, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v3, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v10, v3, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v3, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ler2/a;->b()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-ne v7, v6, :cond_c

    const v6, -0x74ee98c2

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    mul-float v6, v6, v30

    const/4 v12, 0x0

    const/16 v13, 0xb

    move-object v7, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object v5, v11

    move v11, v6

    move-object v6, v5

    move-object/from16 v5, v16

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v29, v8

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v3, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v10, v3, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v3, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v5, v3, v2, v6}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    move-object/from16 v29, v8

    const/4 v6, 0x1

    const v5, -0x74ec43e3

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_7
    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v3, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ler2/h;->a()Ll3/v0;

    move-result-object v23

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v3, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    const/high16 v26, 0x180000

    const v27, 0xfffa

    move-object/from16 v24, v3

    move-object v3, v4

    const/4 v4, 0x0

    move v14, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    move/from16 v32, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move/from16 v2, v32

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v24

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move/from16 v6, v31

    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_d
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v5, 0x0

    throw v5

    :cond_e
    move v13, v2

    const/4 v2, 0x1

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_10

    new-instance v3, Ler2/c;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Ler2/c;-><init>(Ler2/a;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final l(Ler2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ler2/e;->k(Ler2/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;Ler2/g;Z)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ler2/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Ler2/d;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/ui/Modifier;Ler2/g;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Ler2/e;->m(Landroidx/compose/ui/Modifier;Ler2/g;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ler2/g;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string p4, "$this$composed"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p4, 0x29e9d04f

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x0

    sparse-switch p4, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string p4, "SLEEP"

    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_2

    :cond_0
    const p0, -0x7fd469da

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_1

    const p0, 0x56b71e54

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p3, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide p0

    :goto_0
    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p0, 0x56b721fe

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p3, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->i0()J

    move-result-wide p0

    goto :goto_0

    :goto_1
    int-to-float p4, v2

    int-to-float v1, v1

    invoke-static {p4, v1, v0, p0, p1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p2, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :sswitch_1
    const-string p1, "INTRO"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    const p0, -0x7fd6ee31

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    invoke-static {}, Lgb1/b0;->O()Li2/t;

    move-result-object p0

    int-to-float p1, v2

    int-to-float p4, v1

    mul-float/2addr p1, p4

    invoke-static {p1}, Lt0/j;->e(F)Lt0/i;

    move-result-object p1

    const/4 p4, 0x0

    invoke-static {v0, p0, p1, p4, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p2, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_3

    :sswitch_2
    const-string p1, "RECOVERY"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    const p0, -0x7fcee56a

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p3, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide p0

    int-to-float p4, v2

    int-to-float v1, v1

    invoke-static {p4, v1, v0, p0, p1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p2, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :sswitch_3
    const-string p1, "STRAIN"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    :goto_2
    const p0, 0x56b75457

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    const p0, -0x7fd14dc8

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p3, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide p0

    int-to-float p4, v2

    int-to-float v1, v1

    invoke-static {p4, v1, v0, p0, p1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p2, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6d97ca8b -> :sswitch_3
        -0xfb906b -> :sswitch_2
        0x4296e4c -> :sswitch_1
        0x4b536b7 -> :sswitch_0
    .end sparse-switch
.end method

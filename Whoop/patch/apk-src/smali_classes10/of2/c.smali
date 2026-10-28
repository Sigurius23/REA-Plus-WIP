.class public abstract Lof2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llf2/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lpf2/b;",
        "Ll83/a0;",
        "sleepGoalViewEventListener",
        "e",
        "(Llf2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "sleep-coach_release"
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

    invoke-static {p0}, Lof2/c;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lof2/c;->g(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lof2/c;->f(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llf2/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lof2/c;->i(Llf2/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Llf2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf2/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sleepGoalViewEventListener"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x1b9eeaa6

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    if-eq v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v13, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Llf2/g;->d()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_5

    invoke-virtual {v0}, Llf2/g;->c()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lp1/c1;

    sget-object v10, Lb2/e;->M:Lb2/k;

    sget-object v11, Ll0/m;->f:Ll0/h;

    int-to-float v4, v4

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v12, v4

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    invoke-static {v15, v12, v8, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x36

    invoke-static {v11, v10, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_6

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v13, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v11, v13, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v5, v6

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    move v8, v4

    move-object v4, v5

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    const/4 v10, 0x2

    int-to-float v10, v10

    mul-float/2addr v10, v8

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    new-instance v10, Lof2/b;

    invoke-direct {v10, v6, v1, v7}, Lof2/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    const v6, 0x5e5f29e6

    invoke-static {v6, v13, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v11, 0x36000

    const/16 v12, 0xc

    move-object v7, v9

    move-object v9, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move-object v14, v10

    move-object v10, v13

    const/high16 v13, 0x3f800000    # 1.0f

    const/16 v16, 0x1

    invoke-static/range {v4 .. v12}, Lf31/c;->h(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lb2/f;Ll0/l;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lny0/v;->TextLarge:Lny0/v;

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->j()J

    move-result-wide v8

    and-int/lit8 v3, v3, 0x70

    const/16 v6, 0x20

    if-ne v3, v6, :cond_9

    move/from16 v15, v16

    goto :goto_5

    :cond_9
    const/4 v15, 0x0

    :goto_5
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v15, :cond_a

    if-ne v3, v14, :cond_b

    :cond_a
    new-instance v3, Lnw0/n;

    const/16 v6, 0xd

    invoke-direct {v3, v1, v6}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v12, v3

    check-cast v12, Lc93/a;

    const/16 v14, 0x1b6

    const/16 v15, 0x68

    const-string v6, "NEXT"

    const/4 v7, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v3, v16

    invoke-static/range {v4 .. v15}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, Lmx1/i;

    const/16 v5, 0x1d

    invoke-direct {v4, v0, v1, v2, v5}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p7

    const-string v5, "$this$RadioGroupVertical"

    move-object/from16 v6, p3

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "state"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_1

    move-object/from16 v5, p6

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/16 v5, 0x10

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    and-int/lit16 v4, v4, 0x200

    if-nez v4, :cond_2

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x100

    goto :goto_3

    :cond_3
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v5, v4

    :cond_4
    and-int/lit16 v4, v5, 0x491

    const/16 v7, 0x490

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v4, v7, :cond_5

    move v4, v9

    goto :goto_4

    :cond_5
    move v4, v8

    :goto_4
    and-int/lit8 v7, v5, 0x1

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llf2/f;

    invoke-virtual {v4}, Llf2/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v12, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual {v3}, Lf31/a;->c()Z

    move-result v15

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->j()J

    move-result-wide v13

    and-int/lit8 v3, v5, 0x70

    if-ne v3, v6, :cond_6

    move v8, v9

    :cond_6
    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v8

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lb30/o1;

    move-object/from16 v3, p2

    invoke-direct {v4, v3, v2, v1, v0}, Lb30/o1;-><init>(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v19, v4

    check-cast v19, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v22, 0xe1

    move-object/from16 v20, v10

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v21, v0

    invoke-static/range {v10 .. v22}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_9
    move-object/from16 v20, v10

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p0, p4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p0, Lpf2/b$b;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llf2/f;

    invoke-virtual {p1}, Llf2/f;->a()Llf2/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lpf2/b$b;-><init>(Llf2/h;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lpf2/b$a;->a:Lpf2/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Llf2/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lof2/c;->e(Llf2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

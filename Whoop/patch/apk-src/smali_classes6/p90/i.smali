.class public abstract Lp90/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lp90/j;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lp90/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lp90/m;",
        "paymentImages",
        "f",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "",
        "disableTextFields",
        "isKeyboardOpen",
        "activation_release"
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
.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lp90/i;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp90/i;->g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp90/i;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp90/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp90/i;->l(Lp90/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;ZLp90/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp90/i;->j(Lkotlin/jvm/functions/Function1;ZLp90/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp90/m;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x159c8b40

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v12, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v12

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v4, v3, :cond_2

    move v3, v14

    goto :goto_2

    :cond_2
    move v3, v13

    :goto_2
    and-int/2addr v2, v14

    invoke-virtual {v5, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    int-to-float v2, v14

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v4, 0x6

    invoke-static {v2, v3, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x1ee0c899

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lp90/m;

    const-wide/high16 v2, 0x401f000000000000L    # 7.75

    double-to-float v2, v2

    int-to-float v3, v12

    mul-float/2addr v2, v3

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8}, Lp90/m;->b()Lkd1/o;

    move-result-object v2

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    invoke-virtual {v8}, Lp90/m;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v10, 0x180

    const/16 v11, 0x78

    move-object v4, v9

    move-object v9, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    goto :goto_4

    :cond_6
    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v3, Lbm0/o;

    const/16 v4, 0xf

    invoke-direct {v3, v0, v1, v4}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lp90/i;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lp90/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 72
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp90/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v1, -0x756d595f

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :goto_3
    and-int/lit8 v8, v1, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x0

    if-eq v8, v9, :cond_5

    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    move v8, v11

    :goto_4
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v5, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_2c

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Lp6/h1;

    const/16 v7, 0x8

    invoke-direct {v4, v7}, Lp6/h1;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v4, v7

    :goto_5
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_8

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lp1/c1;

    invoke-static {v5, v11}, Lk80/s;->h(Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v12

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v14, v1, 0x70

    if-ne v14, v6, :cond_9

    const/4 v15, 0x1

    goto :goto_6

    :cond_9
    move v15, v11

    :goto_6
    or-int/2addr v13, v15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 p2, v9

    const/4 v9, 0x0

    if-nez v13, :cond_a

    if-ne v15, v8, :cond_b

    :cond_a
    new-instance v15, Lp90/i$a;

    invoke-direct {v15, v0, v4, v9}, Lp90/i$a;-><init>(Lp90/j;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v15, Lc93/m;

    sget-object v13, Ll83/a0;->a:Ll83/a0;

    invoke-static {v5, v15, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp90/j;->q()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-ne v14, v6, :cond_c

    const/16 v17, 0x1

    goto :goto_7

    :cond_c
    move/from16 v17, v11

    :goto_7
    or-int v16, v16, v17

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v16, :cond_d

    if-ne v2, v8, :cond_e

    :cond_d
    new-instance v2, Lp90/i$b;

    invoke-direct {v2, v0, v4, v9}, Lp90/i$b;-><init>(Lp90/j;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lc93/m;

    invoke-static {v5, v2, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp90/j;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-ne v14, v6, :cond_f

    const/16 v16, 0x1

    goto :goto_8

    :cond_f
    move/from16 v16, v11

    :goto_8
    or-int v15, v15, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v15, :cond_10

    if-ne v10, v8, :cond_11

    :cond_10
    new-instance v10, Lp90/i$c;

    invoke-direct {v10, v0, v4, v9}, Lp90/i$c;-><init>(Lp90/j;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lc93/m;

    invoke-static {v5, v10, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp90/j;->v()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_12

    if-ne v15, v8, :cond_13

    :cond_12
    new-instance v15, Lp90/i$d;

    invoke-direct {v15, v0, v7, v9}, Lp90/i$d;-><init>(Lp90/j;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v15, Lc93/m;

    invoke-static {v5, v15, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp90/j;->p()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-ne v14, v6, :cond_14

    const/4 v15, 0x1

    goto :goto_9

    :cond_14
    move v15, v11

    :goto_9
    or-int/2addr v10, v15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_15

    if-ne v15, v8, :cond_16

    :cond_15
    new-instance v15, Lp90/i$e;

    invoke-direct {v15, v0, v4, v9}, Lp90/i$e;-><init>(Lp90/j;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v15, Lc93/m;

    invoke-static {v5, v15, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    int-to-float v3, v3

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v19, v3, v15

    const/16 v22, 0x0

    const/16 v23, 0xa

    const/16 v20, 0x0

    move/from16 v21, v19

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v2, 0x1

    invoke-static {v11, v5, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v6

    move-object/from16 v18, v7

    const/16 v7, 0xe

    invoke-static {v3, v6, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->d:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v6, v2, v5, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v21, v8

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_17

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_17
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_18

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move/from16 v28, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_b

    :cond_18
    move/from16 v28, v1

    :goto_b
    invoke-static {v7, v5, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12}, Lp90/i;->o(Lp1/t2;)Z

    move-result v1

    move-object v7, v4

    if-nez v1, :cond_22

    const v1, 0x33c49d0a

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    const/4 v12, 0x0

    invoke-static {v1, v2, v5, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_1a

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_1a
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v5, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    invoke-static {v2, v5, v2, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lp90/j;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->O()Lb91/a;

    move-result-object v4

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0x12

    const v27, 0x2fffa

    move v11, v3

    const/4 v3, 0x0

    move/from16 v26, v6

    move-object v12, v7

    const/16 v29, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v22, v4

    move-object/from16 v24, v5

    move-wide v4, v8

    const/4 v9, 0x6

    const-wide/high16 v30, 0x4004000000000000L    # 2.5

    const/4 v8, 0x0

    move/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 v32, v10

    const/4 v10, 0x0

    move/from16 v34, v11

    move-object/from16 v33, v12

    const-wide/16 v11, 0x0

    move-object/from16 v35, v13

    const/4 v13, 0x0

    move/from16 v36, v14

    const/4 v14, 0x0

    move/from16 v37, v15

    const/16 v38, 0x20

    const-wide/16 v15, 0x0

    const/16 v39, 0x4

    const/16 v17, 0x0

    move-object/from16 v40, v18

    const/16 v18, 0x0

    const/16 v41, 0x1

    const/16 v19, 0x0

    const/16 v42, 0xe

    const/16 v20, 0x0

    move-object/from16 v43, v21

    const/16 v21, 0x0

    const/16 v44, 0x0

    const/16 v23, 0x0

    move/from16 v45, v25

    const/16 v25, 0x0

    move/from16 v29, p2

    move-object/from16 p1, v0

    move/from16 p2, v1

    move-object/from16 v1, v32

    move-object/from16 v46, v33

    move/from16 v47, v36

    move/from16 v0, v41

    move-object/from16 v48, v43

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v2, v0

    mul-float v2, v2, v37

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lp90/j;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v3, p2

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    move/from16 v11, v34

    invoke-virtual {v3, v5, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v5, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    double-to-float v2, v8

    mul-float v2, v2, v37

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v5, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lp90/j;->i()Lp90/f;

    move-result-object v3

    if-nez v3, :cond_1d

    const v3, 0x44dc7e48

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object/from16 v18, v1

    move/from16 v22, v2

    move-object/from16 v10, v48

    goto/16 :goto_d

    :cond_1d
    const/4 v11, 0x0

    const v4, 0x44dc7e49

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    sget-object v50, Lgz0/m0;->TINY_ATTENTION_ORANGE:Lgz0/m0;

    invoke-virtual {v3}, Lp90/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v54

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v10, v48

    if-ne v3, v10, :cond_1e

    sget-object v3, Lp90/i$f;->w:Lp90/i$f;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v56

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_1f

    sget-object v3, Lp90/i$g;->w:Lp90/i$g;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v58

    new-instance v3, Lc41/p2;

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const v70, 0xffeae

    const/16 v71, 0x0

    move-object/from16 v49, v3

    invoke-direct/range {v49 .. v71}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x0

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v1

    move/from16 v22, v2

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v1, Lc41/p2;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v6, v1, 0x6

    const/4 v7, 0x4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object/from16 v44, v35

    :goto_d
    if-nez v44, :cond_21

    const v1, 0x44e4eaf7

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lp90/j;->l()Lc41/p2;

    move-result-object v3

    if-nez v3, :cond_20

    const v1, -0x6bc30145

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object/from16 v12, v18

    goto :goto_e

    :cond_20
    const v1, -0x6bc30144

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/16 v21, 0x0

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v12, v18

    sget v1, Lc41/p2;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v6, v1, 0x6

    const/4 v7, 0x4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_21
    move-object/from16 v12, v18

    const v1, 0x3c071a7d

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lp90/j;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5, v11}, Lp90/i;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move/from16 v2, v37

    goto :goto_10

    :cond_22
    move/from16 v29, p2

    move-object/from16 v46, v7

    move-object v12, v10

    move/from16 v47, v14

    move/from16 v37, v15

    move-object/from16 v40, v18

    move-object/from16 v10, v21

    const/4 v0, 0x1

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    const/4 v11, 0x0

    const/16 v42, 0xe

    const v1, 0x33dbc8f0

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v1, 0x400c000000000000L    # 3.5

    double-to-float v1, v1

    move/from16 v2, v37

    invoke-static {v1, v2, v12, v5, v11}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_10
    double-to-float v1, v8

    mul-float v13, v1, v2

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lp90/j;->k()Lq22/e;

    move-result-object v1

    if-nez v1, :cond_23

    const v1, 0x33dfd069

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move/from16 v16, v0

    move/from16 v37, v2

    move-object/from16 v14, v46

    goto/16 :goto_15

    :cond_23
    const v3, 0x33dfd06a

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-static/range {v40 .. v40}, Lp90/i;->m(Lp1/c1;)Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lp90/j;->u()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_24

    const-string v4, ""

    :cond_24
    move/from16 v6, v47

    const/16 v7, 0x20

    if-ne v6, v7, :cond_25

    move v8, v0

    goto :goto_11

    :cond_25
    move v8, v11

    :goto_11
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_27

    if-ne v9, v10, :cond_26

    goto :goto_12

    :cond_26
    move-object/from16 v14, v46

    goto :goto_13

    :cond_27
    :goto_12
    new-instance v9, Lcom/whoop/profile/view/h;

    const/4 v8, 0x6

    move-object/from16 v14, v46

    invoke-direct {v9, v14, v8}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v9, Lc93/m;

    if-ne v6, v7, :cond_28

    move v6, v0

    goto :goto_14

    :cond_28
    move v6, v11

    :goto_14
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_29

    if-ne v7, v10, :cond_2a

    :cond_29
    new-instance v7, Lp90/h;

    const/4 v6, 0x0

    invoke-direct {v7, v14, v6}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v6, v28, 0xe

    sget v8, Lq22/e;->d:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v6, v8

    const/16 v10, 0x30

    move/from16 v37, v2

    move v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move-object v8, v9

    move v9, v6

    move-object v6, v8

    move/from16 v16, v0

    move-object/from16 v8, v24

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v10}, Lp90/d;->w(Lp90/j;Lq22/e;ZLjava/lang/String;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lp90/j;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2b

    const v0, 0x33eb458b

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object v0, v12

    move-object/from16 v46, v14

    :goto_16
    const/4 v1, 0x4

    goto :goto_17

    :cond_2b
    const v1, 0x33eb458c

    invoke-static {v5, v1, v12, v13, v5}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v29, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v46, v14

    const/4 v14, 0x0

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v41, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v5

    move-wide v4, v0

    move/from16 v1, v29

    move-object/from16 v0, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_17
    int-to-float v1, v1

    mul-float v1, v1, v37

    const/16 v2, 0x11

    int-to-float v2, v2

    mul-float v2, v2, v37

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v46

    goto :goto_18

    :cond_2c
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v7

    :goto_18
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2d

    new-instance v0, Lno0/y0;

    const/16 v5, 0x10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;ZLp90/e;)Ll83/a0;
    .locals 1

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp90/n;

    invoke-direct {v0, p2}, Lp90/n;-><init>(Lp90/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    sget-object p1, Lc31/e;->ENABLE:Lc31/e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p1, Lc31/e;->DISABLE:Lc31/e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "analyticsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp90/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lp90/i;->h(Lp90/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final n(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final synthetic p(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lp90/i;->n(Lp1/c1;Z)V

    return-void
.end method

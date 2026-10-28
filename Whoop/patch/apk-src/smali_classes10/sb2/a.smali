.class public abstract Lsb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lqb2/e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lqb2/d;",
        "Ll83/a0;",
        "onViewEvent",
        "Lpb2/a;",
        "onNavigationEvent",
        "d",
        "(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsb2/a;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsb2/a;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsb2/a;->g(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqb2/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x3f744424

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v5, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v9

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_6
    and-int/lit16 v7, v5, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    if-eq v7, v10, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move v7, v12

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v0, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    instance-of v7, v1, Lqb2/e$c;

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_8

    const v5, -0x3b027ccc    # -2028.1001f

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget v7, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xdfc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    move-object/from16 v17, v0

    move/from16 v0, v21

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_8
    move-object v7, v0

    move v0, v12

    instance-of v12, v1, Lqb2/e$b;

    if-eqz v12, :cond_9

    const v6, -0x3afec55d

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lqb2/e$b;

    and-int/lit8 v8, v5, 0xe

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v5, v8

    invoke-static {v6, v3, v7, v5}, Lsb2/c;->c(Lqb2/e$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_9
    instance-of v12, v1, Lqb2/e$a;

    if-eqz v12, :cond_10

    const v12, -0x3afc3da2

    invoke-virtual {v7, v12}, Lp1/q;->e0(I)V

    new-instance v13, Lsz0/p0$b;

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->y:I

    const/4 v15, 0x0

    invoke-direct {v14, v12, v15, v6, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object v12, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lea2/s;->F:I

    invoke-direct {v15, v11, v12, v6, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lea2/s;->J0:I

    invoke-direct {v11, v0, v12, v6, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit8 v6, v5, 0x70

    if-ne v6, v8, :cond_a

    const/4 v12, 0x1

    goto :goto_6

    :cond_a
    const/4 v12, 0x0

    :goto_6
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_b

    if-ne v6, v8, :cond_c

    :cond_b
    new-instance v6, Lqn0/j;

    const/16 v10, 0x1a

    invoke-direct {v6, v2, v10}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/a;

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v9, :cond_d

    const/4 v5, 0x1

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    :goto_7
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_e

    if-ne v9, v8, :cond_f

    :cond_e
    new-instance v9, Lqn0/j;

    const/16 v5, 0x1b

    invoke-direct {v9, v3, v5}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lc93/a;

    const/high16 v5, 0x30000

    sget v8, Lsz0/p0$b;->h:I

    or-int/2addr v5, v8

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v5, v8

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v10, v8, 0x9

    or-int/2addr v5, v10

    shl-int/lit8 v8, v8, 0x15

    or-int v18, v5, v8

    const/16 v19, 0x0

    const/16 v20, 0xc44

    move-object/from16 v17, v7

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v12, v11

    const/4 v11, 0x0

    move-object v8, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v5, v13

    move-object v13, v9

    move-object v9, v6

    move-object v6, v14

    move-object v14, v0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    const/4 v13, 0x0

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    move v13, v0

    const v0, -0x3373b542    # -7.355339E7f

    invoke-static {v0, v7, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_11
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Ls01/e;

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lqb2/d$b;->a:Lqb2/d$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lpb2/a$a;->a:Lpb2/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsb2/a;->d(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

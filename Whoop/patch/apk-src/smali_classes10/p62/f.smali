.class public abstract Lp62/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm62/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lm62/j;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll62/a;",
        "onNavigationEvent",
        "Lh62/a;",
        "onAnalyticsEvent",
        "c",
        "(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "refer-a-friend_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lm62/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp62/f;->d(Lkotlin/jvm/functions/Function1;Lm62/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp62/f;->e(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm62/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v5, "viewState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onAnalyticsEvent"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v5, 0xb731d3b

    invoke-virtual {v6, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x2

    if-nez v5, :cond_2

    and-int/lit8 v5, v0, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v8

    :goto_1
    or-int/2addr v5, v0

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    and-int/lit8 v9, v0, 0x30

    const/16 v10, 0x20

    if-nez v9, :cond_4

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move v9, v10

    goto :goto_3

    :cond_3
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v5, v9

    :cond_4
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    :cond_6
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_8

    invoke-virtual {v6, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v5, v9

    :cond_8
    and-int/lit16 v9, v5, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    if-eq v9, v11, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    move v9, v13

    :goto_6
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v6, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_14

    instance-of v9, v1, Lm62/g$d;

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v9, :cond_a

    const v5, 0x68fb0e35

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    move-object/from16 v18, v6

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v11}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v5, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v5, v8

    const/16 v20, 0x0

    const/16 v21, 0xdfc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v5, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v18

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_a
    move v9, v13

    instance-of v13, v1, Lm62/g$a;

    if-eqz v13, :cond_b

    const v7, 0x68fee086

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    move-object v7, v1

    check-cast v7, Lm62/g$a;

    and-int/lit8 v8, v5, 0xe

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v5, v8

    invoke-static {v7, v3, v6, v5}, Lp62/b;->f(Lm62/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_b
    instance-of v13, v1, Lm62/g$c;

    if-eqz v13, :cond_c

    const v7, 0x69010e67

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lm62/g$c;

    and-int/lit16 v7, v5, 0x1ffe

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lp62/c;->f(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v3

    move-object v3, v4

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_c
    instance-of v4, v1, Lm62/g$e;

    if-eqz v4, :cond_d

    const v4, 0x69042c4a

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lm62/g$e;

    and-int/lit16 v5, v5, 0x3fe

    invoke-static {v4, v2, v3, v6, v5}, Lp62/i;->f(Lm62/g$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_d
    instance-of v4, v1, Lm62/g$b;

    if-eqz v4, :cond_13

    const v4, 0x69072617

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    new-instance v13, Lsz0/p0$b;

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lf62/b;->a:I

    const/4 v15, 0x0

    invoke-direct {v14, v4, v15, v8, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object v4, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    move v15, v9

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lf62/b;->g:I

    invoke-direct {v9, v12, v4, v8, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit8 v8, v5, 0x70

    if-ne v8, v10, :cond_e

    const/4 v8, 0x1

    goto :goto_7

    :cond_e
    move v8, v15

    :goto_7
    and-int/lit8 v10, v5, 0xe

    if-eq v10, v7, :cond_10

    and-int/lit8 v5, v5, 0x8

    if-eqz v5, :cond_f

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_8

    :cond_f
    move v12, v15

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v12, 0x1

    :goto_9
    or-int v5, v8, v12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_11

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_12

    :cond_11
    new-instance v7, Lox0/b;

    const/16 v5, 0xd

    invoke-direct {v7, v5, v2, v1}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v10, v7

    check-cast v10, Lc93/a;

    sget v5, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v5, v7

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v7, 0x9

    or-int v19, v5, v7

    const/16 v20, 0x0

    const/16 v21, 0xde4

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v6

    move-object v6, v13

    const/4 v13, 0x0

    move-object v7, v14

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v5, v15

    move-object v15, v4

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v18

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_13
    move v5, v9

    const v0, -0x4df244d

    invoke-static {v0, v6, v5}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_14
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lot1/a;

    const/16 v6, 0xe

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lm62/g;)Ll83/a0;
    .locals 1

    new-instance v0, Lm62/j$c;

    check-cast p1, Lm62/g$b;

    invoke-virtual {p1}, Lm62/g$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lm62/j$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lp62/f;->c(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

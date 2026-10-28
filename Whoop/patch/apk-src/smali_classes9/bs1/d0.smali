.class public abstract Lbs1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001aM\u0010\u000b\u001a\u00020\u00072\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "Lw71/b;",
        "questions",
        "Lg2/i;",
        "focusManager",
        "Lkotlin/Function1;",
        "Lw71/d;",
        "Ll83/a0;",
        "onJournalQuestionClicked",
        "",
        "onViewEvent",
        "e",
        "(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lbs1/h$b;",
        "journalQuestionGroup",
        "",
        "j",
        "(Lbs1/h$b;)Z",
        "journal_release"
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
.method public static synthetic a(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbs1/d0;->i(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbs1/d0;->h(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbs1/h$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbs1/d0;->f(Lbs1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lw71/y;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lbs1/d0;->g(Lw71/y;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw71/b;",
            ">;",
            "Lg2/i;",
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

    move/from16 v5, p5

    const-string v0, "questions"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusManager"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onJournalQuestionClicked"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x43b8c767

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x1

    if-eq v6, v8, :cond_8

    move v6, v9

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1f

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lw71/b;

    invoke-virtual {v12}, Lw71/b;->a()Ljava/util/List;

    move-result-object v16

    check-cast v16, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v15, v17

    check-cast v15, Lm91/u;

    instance-of v13, v15, Lhy0/e;

    if-eqz v13, :cond_a

    new-instance v13, Lbs1/h$a;

    check-cast v15, Lhy0/e;

    invoke-direct {v13, v15}, Lbs1/h$a;-><init>(Lhy0/e;)V

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    const/16 v19, 0x0

    goto :goto_8

    :cond_a
    instance-of v13, v15, Lw71/y;

    if-eqz v13, :cond_9

    invoke-static {v7}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lbs1/h;

    const/16 v19, 0x0

    instance-of v11, v13, Lbs1/h$b;

    if-eqz v11, :cond_b

    check-cast v13, Lbs1/h$b;

    invoke-virtual {v13}, Lbs1/h$b;->a()I

    move-result v11

    move-object/from16 v20, v15

    check-cast v20, Lw71/y;

    invoke-virtual/range {v20 .. v20}, Lw71/y;->f()I

    move-result v14

    if-ne v11, v14, :cond_b

    invoke-virtual {v13}, Lbs1/h$b;->b()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_b
    new-instance v11, Lbs1/h$b;

    move-object v13, v15

    check-cast v13, Lw71/y;

    invoke-virtual {v13}, Lw71/y;->f()I

    move-result v13

    invoke-virtual {v12}, Lw71/b;->c()Ljava/lang/String;

    move-result-object v14

    new-array v1, v9, [Lw71/y;

    aput-object v15, v1, v19

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v11, v13, v14, v1}, Lbs1/h$b;-><init>(ILjava/lang/String;Ljava/util/List;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    move-object/from16 v1, p0

    goto :goto_7

    :cond_c
    const/16 v19, 0x0

    invoke-static {v8, v7}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move-object/from16 v1, p0

    goto/16 :goto_6

    :cond_d
    const/16 v19, 0x0

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v6, v19

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v13, v6, 0x1

    const/4 v14, 0x0

    if-ltz v6, :cond_1e

    check-cast v7, Lbs1/h;

    instance-of v8, v7, Lbs1/h$a;

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/16 v11, 0x8

    const/4 v12, 0x3

    if-eqz v8, :cond_10

    const v8, 0x1a7b8d4e

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    check-cast v7, Lbs1/h$a;

    invoke-virtual {v7}, Lbs1/h$a;->a()Lhy0/e;

    move-result-object v8

    invoke-virtual {v8}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v8

    if-eqz v8, :cond_f

    const v8, 0x1a7c8320

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    if-lez v6, :cond_e

    const v6, 0x1a7cff3f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x4

    int-to-float v8, v6

    int-to-float v6, v11

    move/from16 v11, v19

    invoke-static {v8, v6, v15, v10, v11}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_a

    :cond_e
    move/from16 v11, v19

    const v6, 0x1a7e63de

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v7}, Lbs1/h$a;->a()Lhy0/e;

    move-result-object v6

    invoke-static {v14, v9, v14}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v7

    sget v8, Lhy0/e;->d:I

    sget v14, Lm91/p;->b:I

    shl-int/lit8 v12, v14, 0x3

    or-int/2addr v8, v12

    const/16 v12, 0xc

    move/from16 v19, v11

    move v11, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object/from16 p4, v1

    move/from16 v14, v19

    const/16 v1, 0x8

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v6, 0x1

    goto :goto_c

    :cond_f
    move-object/from16 p4, v1

    move v1, v11

    move/from16 v14, v19

    const v6, 0x1a803c9e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    int-to-float v7, v6

    int-to-float v1, v1

    invoke-static {v7, v1, v15, v10, v14}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    move/from16 v27, v0

    move v0, v6

    move/from16 v22, v13

    move v11, v14

    const/16 v19, 0x800

    const/16 v21, 0x4

    goto/16 :goto_12

    :cond_10
    move-object/from16 p4, v1

    move v8, v9

    move v1, v11

    move-object v6, v14

    move/from16 v14, v19

    instance-of v9, v7, Lbs1/h$b;

    if-eqz v9, :cond_1d

    const v9, 0x1a8303ec

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v11, v12

    const/4 v8, 0x4

    int-to-float v14, v8

    invoke-static {v9, v11, v14}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v11, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    move/from16 v22, v13

    invoke-virtual {v8}, Ly81/i;->W0()J

    move-result-wide v12

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v12, v13, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v12

    int-to-float v1, v1

    mul-float/2addr v9, v1

    const/4 v1, 0x0

    const/4 v13, 0x2

    invoke-static {v8, v9, v1, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v23

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v8, v0, 0x1c00

    const/16 v9, 0x800

    if-ne v8, v9, :cond_11

    const/4 v8, 0x1

    goto :goto_d

    :cond_11
    const/4 v8, 0x0

    :goto_d
    or-int/2addr v1, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_12

    if-ne v8, v12, :cond_13

    :cond_12
    new-instance v8, Lbs1/v;

    move-object v1, v7

    check-cast v1, Lbs1/h$b;

    const/4 v9, 0x1

    invoke-direct {v8, v1, v4, v9}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v27, v8

    check-cast v27, Lc93/a;

    const/16 v28, 0xf

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v11, 0x3

    invoke-static {v1, v6, v11}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move/from16 v23, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    :cond_15
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x70c15e7e

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    move-object v1, v7

    check-cast v1, Lbs1/h$b;

    invoke-virtual {v1}, Lbs1/h$b;->b()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v14, 0x0

    :goto_f
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v25, v14, 0x1

    if-ltz v14, :cond_1b

    check-cast v7, Lw71/y;

    move-object v9, v7

    const/4 v8, 0x1

    invoke-static {v6, v8, v6}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v7

    move/from16 v16, v8

    new-instance v8, Lf;

    const/16 v11, 0x15

    invoke-direct {v8, v11}, Lf;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit16 v6, v0, 0x380

    move/from16 v27, v0

    const/16 v0, 0x100

    if-ne v6, v0, :cond_17

    move/from16 v6, v16

    goto :goto_10

    :cond_17
    const/4 v6, 0x0

    :goto_10
    or-int/2addr v6, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_18

    if-ne v11, v12, :cond_19

    :cond_18
    new-instance v11, Lbs1/t;

    const/4 v6, 0x1

    invoke-direct {v11, v2, v3, v6}, Lbs1/t;-><init>(Lg2/i;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v6, Lw71/y;->k:I

    sget v18, Lm91/p;->b:I

    const/16 v17, 0x3

    shl-int/lit8 v18, v18, 0x3

    or-int v6, v6, v18

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object v0, v11

    move v11, v6

    move-object v6, v9

    move-object v9, v0

    move/from16 v0, v16

    const/16 v19, 0x800

    const/16 v21, 0x4

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1}, Lbs1/d0;->j(Lbs1/h$b;)Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-virtual {v1}, Lbs1/h$b;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v0, :cond_1a

    if-nez v14, :cond_1a

    const v6, -0x229ce4da

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    int-to-float v6, v0

    mul-float v14, v6, v23

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v29, Lhy0/e;

    const/16 v33, 0x7

    const/16 v34, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v29 .. v34}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    invoke-static {v6, v0, v6}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v7

    sget v6, Lhy0/e;->d:I

    or-int v11, v6, v18

    const/16 v12, 0xc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v29

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v11, 0x0

    invoke-static {v15, v14, v10, v11}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_11

    :cond_1a
    const/4 v11, 0x0

    const v6, -0x2298e048

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_11
    move/from16 v14, v25

    move/from16 v0, v27

    move-object/from16 v12, v28

    const/4 v6, 0x0

    goto/16 :goto_f

    :cond_1b
    invoke-static {}, Lwb3/f;->d0()V

    const/16 v26, 0x0

    throw v26

    :cond_1c
    move/from16 v27, v0

    const/4 v0, 0x1

    const/4 v11, 0x0

    const/16 v19, 0x800

    const/16 v21, 0x4

    invoke-static {v10, v11, v0, v11}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_12
    move-object/from16 v1, p4

    move v9, v0

    move/from16 v19, v11

    move/from16 v6, v22

    move/from16 v0, v27

    goto/16 :goto_9

    :cond_1d
    move v11, v14

    const v0, 0x74779636

    invoke-static {v0, v10, v11}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1e
    move-object/from16 v26, v14

    invoke-static {}, Lwb3/f;->d0()V

    throw v26

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->X()V

    :cond_20
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v0, Lbm2/d1;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lbm2/d1;-><init>(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final f(Lbs1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    check-cast p0, Lbs1/h$b;

    invoke-virtual {p0}, Lbs1/h$b;->b()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw71/y;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lw71/y;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lw71/y;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x5a14c6cb

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final h(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    instance-of p0, p2, Lw71/d;

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lbs1/d0;->e(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lbs1/h$b;)Z
    .locals 2

    invoke-virtual {p0}, Lbs1/h$b;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw71/y;

    invoke-virtual {v0}, Lw71/y;->g()Lp01/b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

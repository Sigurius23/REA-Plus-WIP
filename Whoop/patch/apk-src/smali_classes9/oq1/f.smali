.class public abstract Loq1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Llq1/h;",
        "viewState",
        "Lkotlin/Function1;",
        "Llq1/f;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkq1/a;",
        "onNavigationEvent",
        "d",
        "(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "behavior-impact_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Loq1/f;->e(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Loq1/f;->f(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Loq1/f;->g(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llq1/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavigationEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v4, -0x2b9dda82

    invoke-virtual {v6, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v5, 0x4

    const/4 v7, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v8, v0, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_3

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v8, v9

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :cond_3
    and-int/lit16 v8, v0, 0x180

    const/16 v10, 0x100

    if-nez v8, :cond_5

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v10

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :cond_5
    and-int/lit16 v8, v4, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v8, v11, :cond_6

    move v8, v12

    goto :goto_4

    :cond_6
    move v8, v13

    :goto_4
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v6, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    instance-of v8, v1, Llq1/h$c;

    if-eqz v8, :cond_7

    const v5, 0x496d0102

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    move-object v5, v1

    check-cast v5, Llq1/h$c;

    invoke-virtual {v5}, Llq1/h$c;->a()Llq1/c;

    move-result-object v5

    and-int/lit16 v7, v4, 0x380

    const/4 v8, 0x1

    const/4 v3, 0x0

    move-object v4, v5

    move-object/from16 v5, p2

    invoke-static/range {v3 .. v8}, Loq1/d;->o(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_7
    instance-of v8, v1, Llq1/h$a;

    if-eqz v8, :cond_10

    const v8, 0x49709f9e    # 985593.9f

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v8, Ljj0/a;->f:I

    const/4 v11, 0x0

    invoke-direct {v15, v8, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v15, Ljj0/a;->c:I

    invoke-direct {v8, v15, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v15, v12

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Ljj0/a;->e:I

    invoke-direct {v12, v13, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v8

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v15, Ljj0/a;->d:I

    invoke-direct {v8, v15, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v7, v4, 0x70

    if-ne v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v9, v4, 0xe

    if-ne v9, v5, :cond_9

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    :goto_6
    or-int/2addr v7, v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_a

    if-ne v11, v15, :cond_b

    :cond_a
    new-instance v11, Loq1/e;

    const/4 v7, 0x0

    invoke-direct {v11, v2, v1, v7}, Loq1/e;-><init>(Lkotlin/jvm/functions/Function1;Llq1/h;I)V

    invoke-virtual {v6, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v11, Lc93/a;

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v10, :cond_c

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    if-ne v9, v5, :cond_d

    const/16 v16, 0x1

    goto :goto_8

    :cond_d
    const/16 v16, 0x0

    :goto_8
    or-int v4, v4, v16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_e

    if-ne v5, v15, :cond_f

    :cond_e
    new-instance v5, Loq1/e;

    const/4 v4, 0x1

    invoke-direct {v5, v3, v1, v4}, Loq1/e;-><init>(Lkotlin/jvm/functions/Function1;Llq1/h;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lc93/a;

    const/high16 v4, 0x30000

    sget v7, Lsz0/p0$b;->h:I

    or-int/2addr v4, v7

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v9, v7, 0x3

    or-int/2addr v4, v9

    shl-int/lit8 v9, v7, 0x9

    or-int/2addr v4, v9

    shl-int/lit8 v7, v7, 0x15

    or-int v18, v4, v7

    const/16 v19, 0x0

    const/16 v20, 0xe44

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v9, v11

    const/4 v11, 0x0

    move-object/from16 v17, v6

    move-object v6, v13

    move-object v13, v5

    move-object v5, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_10
    move v4, v13

    instance-of v5, v1, Llq1/h$b;

    if-eqz v5, :cond_14

    const v5, 0x497c11f7

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    sget-object v5, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v5, v7, v6, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    :cond_12
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v6, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    move-object/from16 v17, v6

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v16, 0x0

    move/from16 v4, v21

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const v0, 0x446edb91

    invoke-static {v0, v6, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_15
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lnx1/g;

    const/4 v5, 0x5

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;
    .locals 1

    new-instance v0, Llq1/f$a;

    check-cast p1, Llq1/h$a;

    invoke-virtual {p1}, Llq1/h$a;->a()Lhq1/f;

    move-result-object p1

    invoke-direct {v0, p1}, Llq1/f$a;-><init>(Lhq1/f;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Llq1/h;)Ll83/a0;
    .locals 1

    new-instance v0, Lkq1/a$a;

    check-cast p1, Llq1/h$a;

    invoke-virtual {p1}, Llq1/h$a;->a()Lhq1/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lkq1/a$a;-><init>(Lhq1/f;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Loq1/f;->d(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

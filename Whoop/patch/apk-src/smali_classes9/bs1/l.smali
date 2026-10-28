.class public abstract Lbs1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a?\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lds1/k;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "noCompleteJournalCallback",
        "yesDismissJournalCallback",
        "e",
        "(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbs1/l;->i(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbs1/l;->g(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbs1/l;->f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbs1/l;->h(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds1/k;",
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

    const-string v0, "noCompleteJournalCallback"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yesDismissJournalCallback"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x79d0c4df

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v8

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x0

    if-eq v6, v9, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v11

    :goto_4
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v0, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_7

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lp1/c1;

    invoke-virtual {v1}, Lds1/k;->f()Lds1/e;

    move-result-object v12

    invoke-virtual {v12}, Lds1/e;->h()Lds1/d;

    move-result-object v12

    invoke-virtual {v12}, Lds1/d;->d()Z

    move-result v13

    if-eqz v13, :cond_f

    const v13, 0x3257a29b

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lds1/d;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v12}, Lds1/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v12}, Lds1/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v12}, Lds1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v12}, Lds1/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    and-int/lit16 v10, v5, 0x380

    if-ne v10, v8, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v11

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_9

    if-ne v10, v9, :cond_a

    :cond_9
    new-instance v10, Lbs1/i;

    const/4 v8, 0x0

    invoke-direct {v10, v3, v6, v8}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v27, v10

    check-cast v27, Lc93/a;

    and-int/lit8 v5, v5, 0x70

    if-ne v5, v7, :cond_b

    const/4 v10, 0x1

    goto :goto_6

    :cond_b
    move v10, v11

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_c

    if-ne v5, v9, :cond_d

    :cond_c
    new-instance v5, Lbs1/i;

    const/4 v7, 0x1

    invoke-direct {v5, v2, v6, v7}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v29, v5

    check-cast v29, Lc93/a;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_e

    new-instance v5, Lbs1/j;

    const/4 v7, 0x0

    invoke-direct {v5, v7, v6}, Lbs1/j;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v30, v5

    check-cast v30, Lkotlin/jvm/functions/Function1;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    shl-int/lit8 v7, v5, 0x6

    or-int/2addr v6, v7

    shl-int/lit8 v7, v5, 0x9

    or-int/2addr v6, v7

    shl-int/lit8 v7, v5, 0x1b

    or-int v34, v6, v7

    or-int/lit16 v5, v5, 0x180

    const v36, 0x30006

    const v37, 0xcafe1f1

    move/from16 v35, v5

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v6, v11

    const/4 v11, 0x0

    move-object v7, v14

    move-object v14, v12

    const/4 v12, 0x0

    move v8, v6

    move-object v6, v13

    const/4 v13, 0x0

    move/from16 v18, v8

    move-object/from16 v8, v16

    move/from16 v16, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move/from16 v32, v31

    const/16 v31, 0x0

    move/from16 v33, v32

    const/16 v32, 0x0

    move/from16 v38, v33

    move-object/from16 v33, v0

    move/from16 v0, v38

    invoke-static/range {v5 .. v37}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v5, v33

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_f
    move-object v5, v0

    move v0, v11

    const v6, 0x326132e1

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_10
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lbs1/k;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lbs1/k;-><init>(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lbs1/l;->e(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

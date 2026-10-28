.class public abstract Lay1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aU\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyx1/f;",
        "returnsViewState",
        "Lkotlin/Function1;",
        "Lyx1/d;",
        "Ll83/a0;",
        "onViewEvent",
        "Lxx1/b;",
        "onNavigationEvent",
        "Lvx1/a;",
        "onAnalyticsEvent",
        "d",
        "(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "membership_release"
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

    invoke-static {p0}, Lay1/b;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lay1/b;->g(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyx1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lay1/b;->e(Lyx1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyx1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "returnsViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x2f9d5c5c

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    const/4 v6, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v7, p6, 0x2

    const/16 v8, 0x20

    if-eqz v7, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_2

    move-object/from16 v9, p1

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move v10, v8

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v2, v10

    :goto_3
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    :cond_6
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v2, v10

    :cond_8
    and-int/lit16 v10, v2, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    if-eq v10, v11, :cond_9

    const/4 v10, 0x1

    goto :goto_6

    :cond_9
    move v10, v13

    :goto_6
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v10, :cond_a

    new-instance v7, Lat2/b1;

    const/16 v9, 0x12

    invoke-direct {v7, v9}, Lat2/b1;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v9, v7

    :cond_b
    invoke-virtual {v1}, Lyx1/f;->c()Z

    move-result v7

    if-eqz v7, :cond_c

    const v2, -0x6bcd4b9

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v2, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v2, v8

    const/16 v20, 0x30

    const/16 v21, 0x7fc

    const/4 v8, 0x0

    move-object v2, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x1

    move/from16 v22, v18

    move-object/from16 v18, v0

    move-object v0, v2

    move/from16 v2, v22

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_c
    move-object v7, v0

    move-object v0, v9

    move v14, v13

    invoke-virtual {v1}, Lyx1/f;->b()Z

    move-result v9

    if-eqz v9, :cond_10

    const v9, -0x6b894d1

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    new-instance v15, Lsz0/p0$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lpv1/b;->h:I

    const/4 v13, 0x0

    invoke-direct {v9, v11, v13, v6, v13}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v9

    invoke-direct/range {v15 .. v20}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v11, v9

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lpv1/b;->f:I

    invoke-direct {v9, v12, v13, v6, v13}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v2, v2, 0x70

    if-ne v2, v8, :cond_d

    const/4 v12, 0x1

    goto :goto_7

    :cond_d
    move v12, v14

    :goto_7
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_e

    if-ne v2, v10, :cond_f

    :cond_e
    new-instance v2, Lo;

    const/16 v6, 0x9

    invoke-direct {v2, v0, v6}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v10, v2

    check-cast v10, Lc93/a;

    sget v2, Lsz0/p0$b;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v2, v6

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v6, 0x9

    or-int v19, v2, v6

    const/16 v20, 0x30

    const/16 v21, 0x7e4

    const/4 v8, 0x0

    move-object/from16 v18, v7

    move-object v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object v6, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v2, v17

    const/16 v17, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    invoke-virtual {v1}, Lyx1/f;->a()Lyx1/c;

    move-result-object v6

    if-eqz v6, :cond_11

    const v6, -0x6b1328b

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v2, 0xe

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v8, v2, 0x70

    or-int/2addr v6, v8

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v2, v6

    invoke-static {v1, v3, v4, v7, v2}, Lby1/g;->d(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_11
    const v2, -0x6ad929a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v14}, Lp1/q;->q(Z)V

    :goto_8
    move-object v2, v0

    goto :goto_9

    :cond_12
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, v9

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, La81/f;

    const/4 v7, 0x7

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Lyx1/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lyx1/d$a;->a:Lyx1/d$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lay1/b;->d(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

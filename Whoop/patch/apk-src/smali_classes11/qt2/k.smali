.class public abstract Lqt2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a%\u0010\u0004\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lmt2/g;",
        "Ll83/a0;",
        "onNavigationEvent",
        "d",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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

    invoke-static {p0}, Lqt2/k;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lqt2/k;->g(Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqt2/k;->e(Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v2, 0x13044436

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v6, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v7, v3, :cond_3

    move v3, v9

    goto :goto_2

    :cond_3
    move v3, v8

    :goto_2
    and-int/lit8 v7, v6, 0x1

    invoke-virtual {v14, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    new-instance v2, Lqe0/b;

    const/16 v5, 0x19

    invoke-direct {v2, v5}, Lqe0/b;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_3

    :cond_5
    move-object v2, v5

    :goto_3
    new-instance v15, Lsz0/p0$b;

    sget v5, Lks2/a;->g:I

    invoke-static {v14, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v5, Lks2/a;->d:I

    invoke-static {v14, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v7, Lks2/a;->f:I

    invoke-static {v14, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    and-int/lit8 v6, v6, 0xe

    if-ne v6, v4, :cond_6

    move v8, v9

    :cond_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v8, :cond_7

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lqn0/j;

    const/4 v3, 0x2

    invoke-direct {v4, v2, v3}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v6, v4

    check-cast v6, Lc93/a;

    const/high16 v3, 0x30000

    sget v4, Lsz0/p0$b;->h:I

    or-int/2addr v3, v4

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v4, 0x3

    or-int/2addr v3, v8

    shl-int/lit8 v4, v4, 0x9

    or-int/2addr v3, v4

    const/16 v16, 0x0

    const/16 v17, 0xfc4

    const/4 v4, 0x0

    move-object v8, v2

    move-object v2, v15

    move v15, v3

    move-object v3, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    goto :goto_4

    :cond_9
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, Lau1/k;

    const/4 v4, 0x5

    invoke-direct {v3, v0, v1, v4, v5}, Lau1/k;-><init>(IIILkotlin/jvm/functions/Function1;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final e(Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Lmt2/g$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lqt2/k;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

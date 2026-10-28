.class public abstract Lh60/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lf60/c$b;",
        "viewState",
        "Lkotlin/Function1;",
        "Lf60/a;",
        "Ll83/a0;",
        "onEvent",
        "f",
        "(Lf60/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "access_release"
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

    invoke-static {p0}, Lh60/f;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf60/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lh60/f;->k(Lf60/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lh60/f;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh60/f;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh60/f;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lf60/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf60/c$b;",
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

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v3, 0x178a220

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v4, v6, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v10, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v4, Lqs1/b;

    invoke-virtual {v0}, Lf60/c$b;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lf60/c$b;->a()Ljava/util/List;

    move-result-object v13

    sget v6, Lf50/b;->e:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    sget v6, Lf50/b;->f:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    const/16 v18, 0x30

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v11, v4

    invoke-direct/range {v11 .. v19}, Lqs1/b;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_5

    move v6, v7

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_6

    if-ne v9, v11, :cond_7

    :cond_6
    new-instance v9, Lgz/a;

    const/4 v6, 0x6

    invoke-direct {v9, v1, v6}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lc93/a;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_8

    new-instance v6, Lh00/d0;

    const/16 v12, 0xd

    invoke-direct {v6, v12}, Lh00/d0;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lc93/a;

    if-ne v3, v5, :cond_9

    move v12, v7

    goto :goto_5

    :cond_9
    move v12, v8

    :goto_5
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_a

    if-ne v13, v11, :cond_b

    :cond_a
    new-instance v13, Lgz/a;

    const/4 v12, 0x7

    invoke-direct {v13, v1, v12}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v13, Lc93/a;

    if-ne v3, v5, :cond_c

    goto :goto_6

    :cond_c
    move v7, v8

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_d

    if-ne v3, v11, :cond_e

    :cond_d
    new-instance v3, Lgz/a;

    const/16 v5, 0x8

    invoke-direct {v3, v1, v5}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v8, v3

    check-cast v8, Lc93/a;

    sget v3, Lqs1/b;->g:I

    or-int/lit16 v11, v3, 0x180

    const/16 v12, 0x20

    move-object v5, v9

    const/4 v9, 0x0

    move-object v7, v13

    invoke-static/range {v4 .. v12}, Lqs1/a;->y(Lqs1/b;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_f
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, Lf01/b;

    const/16 v5, 0x10

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf60/a$a;->a:Lf60/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf60/a$a;->a:Lf60/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf60/a$j;->a:Lf60/a$j;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lf60/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lh60/f;->f(Lf60/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

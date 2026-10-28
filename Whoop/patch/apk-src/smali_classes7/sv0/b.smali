.class public abstract Lsv0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a;\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lpv0/c;",
        "viewModel",
        "Leb/u0;",
        "composeNavController",
        "Llv0/b;",
        "analyticsHelper",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lpv0/d;",
        "viewState",
        "content-search_release"
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
.method public static synthetic a(Llv0/b;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsv0/b;->i(Llv0/b;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsv0/b;->j(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/t2;Llv0/b;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsv0/b;->g(Lkotlin/jvm/functions/Function1;Lp1/t2;Llv0/b;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsv0/b;->h(Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpv0/c;",
            "Leb/u0;",
            "Llv0/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p5

    const-string v5, "viewModel"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "composeNavController"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "analyticsHelper"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onEvent"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v5, -0x51baa08

    invoke-virtual {v8, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v2, 0xc00

    const/16 v12, 0x800

    if-nez v6, :cond_7

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move v6, v12

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x493

    const/16 v7, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v6, v7, :cond_8

    move v6, v14

    goto :goto_5

    :cond_8
    move v6, v13

    :goto_5
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v3}, Lpv0/c;->getViewState()Lec3/l;

    move-result-object v6

    new-instance v15, Lpv0/d;

    const v33, 0x1ffff

    const/16 v34, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v15 .. v34}, Lpv0/d;-><init>(ZZZLcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lnv0/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x0

    const/4 v11, 0x2

    move-object v9, v8

    const/4 v8, 0x0

    move-object v7, v15

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v8, v5, 0x1c00

    if-ne v8, v12, :cond_9

    move v13, v14

    :cond_9
    or-int/2addr v7, v13

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_a

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_b

    :cond_a
    new-instance v8, Ls90/f;

    const/4 v7, 0x4

    invoke-direct {v8, v1, v6, v0, v7}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v7, v8

    check-cast v7, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    move-object v8, v9

    move v9, v5

    const-string v5, "LANDING"

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v8

    goto :goto_6

    :cond_c
    move-object v9, v8

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lsu1/d;

    const/4 v2, 0x1

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object v6, v1

    move/from16 v1, p5

    invoke-direct/range {v0 .. v6}, Lsu1/d;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Lp1/t2;)Lpv0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lpv0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpv0/d;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lp1/t2;Llv0/b;Leb/s0;)Ll83/a0;
    .locals 5

    const-string v0, "$this$NavHost"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loq1/c;

    invoke-direct {v0, p0, p1}, Loq1/c;-><init>(Lkotlin/jvm/functions/Function1;Lp1/t2;)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x7db74c83    # -1.474519E-37f

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "LANDING"

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {p3, v0, v3, v1, v4}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance v0, Lno0/h;

    const/16 v1, 0xf

    invoke-direct {v0, p2, p0, p1, v1}, Lno0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const p1, -0x49e10acc

    invoke-direct {p0, v0, v2, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p1, "SEARCH"

    invoke-static {p3, p1, v3, p0, v4}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsv0/b;->f(Lp1/t2;)Lpv0/d;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p0, p3, p2}, Lx;->a(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Llv0/b;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p5, p3, :cond_1

    :cond_0
    new-instance p5, Lsv0/b$a;

    const/4 p3, 0x0

    invoke-direct {p5, p0, p3}, Lsv0/b$a;-><init>(Llv0/b;Lq83/d;)V

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p5, Lc93/m;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    invoke-static {p4, p5, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2}, Lsv0/b;->f(Lp1/t2;)Lpv0/d;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p2, p1, p4, p3}, Ltv0/b;->e(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object p0
.end method

.method private static final j(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lsv0/b;->e(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

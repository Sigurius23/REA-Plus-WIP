.class public abstract Lep1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ak\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a/\u0010\u0013\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0010H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcp1/k;",
        "viewState",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lbp1/b;",
        "onNavigationEvent",
        "Lyn1/a;",
        "onAnalyticEvent",
        "",
        "screenTag",
        "u",
        "(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "primaryAction",
        "secondaryAction",
        "q",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
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
.method private static final A(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lcp1/i$c;

    check-cast p1, Lcp1/k$d;

    invoke-virtual {p1}, Lcp1/k$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcp1/i$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$e;->a:Lcp1/i$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lcp1/i$g;

    check-cast p1, Lcp1/k$o;

    invoke-virtual {p1}, Lcp1/k$o;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lcp1/i$g;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lcp1/i$h;

    check-cast p1, Lcp1/k$b;

    invoke-virtual {p1}, Lcp1/k$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcp1/i$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lep1/m;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->A(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/m;->B(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbp1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->w(Lbp1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lep1/m;->t(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->x(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->E(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/m;->H(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lep1/m;->r()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lep1/m;->z(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->v(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/m;->F(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Ll83/a0;
    .locals 1

    invoke-static {}, Lep1/m;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->G(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/m;->C(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x2539f18f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v12, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_7

    new-instance v0, Lej1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lej1/a;-><init>(I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lc93/a;

    move-object v4, v0

    goto :goto_5

    :cond_8
    move-object v4, v1

    :goto_5
    if-eqz v3, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_9

    new-instance v0, Lej1/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lej1/a;-><init>(I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lc93/a;

    move-object v8, v0

    goto :goto_6

    :cond_a
    move-object/from16 v8, p1

    :goto_6
    new-instance v13, Lsz0/p0$b;

    sget v0, Lxn1/c;->k:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lxn1/c;->e:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v0, Lxn1/c;->f:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v0, Lxn1/c;->g:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/high16 v0, 0x30000

    sget v5, Lsz0/p0$b;->h:I

    or-int/2addr v0, v5

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    or-int/2addr v0, v6

    shl-int/lit8 v6, v5, 0x9

    or-int/2addr v0, v6

    shl-int/lit8 v6, v2, 0xc

    const v9, 0xe000

    and-int/2addr v6, v9

    or-int/2addr v0, v6

    shl-int/lit8 v5, v5, 0x15

    or-int/2addr v0, v5

    const/high16 v5, 0xe000000

    shl-int/lit8 v2, v2, 0x15

    and-int/2addr v2, v5

    or-int/2addr v0, v2

    const/4 v14, 0x0

    const/16 v15, 0xe44

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v19, v13

    move v13, v0

    move-object/from16 v0, v19

    invoke-static/range {v0 .. v15}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v14, v4

    move-object v15, v8

    goto :goto_7

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v15, p1

    move-object v14, v1

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v13, Ldk2/d;

    const/16 v18, 0x1

    move/from16 v16, p3

    move/from16 v17, p4

    invoke-direct/range {v13 .. v18}, Ldk2/d;-><init>(Lc93/a;Lc93/a;III)V

    iput-object v13, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final r()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lep1/m;->q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final u(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/k;",
            "Lzr2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p7

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dateAndTimeProvider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p6

    check-cast v7, Lp1/q;

    const v3, 0x76c685d0

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, p8, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move v9, v6

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    :goto_4
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v11, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_7

    move-object/from16 v11, p3

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_5

    :cond_9
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v3, v12

    :goto_6
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_b

    or-int/lit16 v3, v3, 0x6000

    :cond_a
    move-object/from16 v13, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v13, v0, 0x6000

    if-nez v13, :cond_a

    move-object/from16 v13, p4

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/16 v14, 0x4000

    goto :goto_7

    :cond_c
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v3, v14

    :goto_8
    and-int/lit8 v14, p8, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_e

    or-int/2addr v3, v15

    :cond_d
    move-object/from16 v15, p5

    goto :goto_a

    :cond_e
    and-int/2addr v15, v0

    if-nez v15, :cond_d

    move-object/from16 v15, p5

    invoke-virtual {v7, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v16, 0x10000

    :goto_9
    or-int v3, v3, v16

    :goto_a
    const v16, 0x12493

    and-int v10, v3, v16

    const v4, 0x12492

    const/4 v8, 0x0

    if-eq v10, v4, :cond_10

    const/4 v4, 0x1

    goto :goto_b

    :cond_10
    move v4, v8

    :goto_b
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v7, v10, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_56

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_11

    new-instance v5, Lep1/a;

    const/16 v10, 0x9

    invoke-direct {v5, v10}, Lep1/a;-><init>(I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_12
    move-object/from16 v5, p2

    :goto_c
    if-eqz v9, :cond_14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_13

    new-instance v9, Lep1/a;

    const/16 v10, 0xa

    invoke-direct {v9, v10}, Lep1/a;-><init>(I)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_d

    :cond_14
    move-object v9, v11

    :goto_d
    if-eqz v12, :cond_16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_15

    new-instance v10, Lep1/a;

    const/16 v11, 0xb

    invoke-direct {v10, v11}, Lep1/a;-><init>(I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v10

    goto :goto_e

    :cond_16
    move-object/from16 v20, v13

    :goto_e
    if-eqz v14, :cond_17

    const-string v10, "healthcare_womens_health_hormonal_insights_onboarding"

    goto :goto_f

    :cond_17
    move-object v10, v15

    :goto_f
    new-instance v11, Lep1/m$d;

    invoke-direct {v11, v1}, Lep1/m$d;-><init>(Lcp1/k;)V

    shr-int/lit8 v12, v3, 0xc

    and-int/lit8 v12, v12, 0x70

    invoke-static {v11, v10, v7, v12}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v11, v1, Lcp1/k$d;

    if-eqz v11, :cond_1f

    const v11, 0x8575c60

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v6, :cond_18

    const/4 v6, 0x1

    goto :goto_10

    :cond_18
    move v6, v8

    :goto_10
    and-int/lit8 v11, v3, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_19

    const/4 v11, 0x1

    goto :goto_11

    :cond_19
    move v11, v8

    :goto_11
    or-int/2addr v6, v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_1a

    if-ne v11, v4, :cond_1b

    :cond_1a
    new-instance v11, Lep1/l;

    const/4 v6, 0x2

    invoke-direct {v11, v5, v1, v6}, Lep1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcp1/k;I)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v11, Lc93/a;

    and-int/lit16 v3, v3, 0x1c00

    const/16 v6, 0x800

    if-ne v3, v6, :cond_1c

    const/16 v17, 0x1

    goto :goto_12

    :cond_1c
    move/from16 v17, v8

    :goto_12
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_1d

    if-ne v3, v4, :cond_1e

    :cond_1d
    new-instance v3, Leo2/j;

    const/16 v4, 0xc

    invoke-direct {v3, v9, v4}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v3, Lc93/a;

    invoke-static {v11, v3, v7, v8, v8}, Lep1/m;->q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    :goto_13
    move-object/from16 v21, v5

    move-object v0, v9

    move-object/from16 v24, v10

    goto/16 :goto_25

    :cond_1f
    sget-object v11, Lcp1/k$p;->a:Lcp1/k$p;

    invoke-virtual {v1, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_26

    const v11, 0x85bb1b7

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v6, :cond_20

    const/4 v6, 0x1

    goto :goto_14

    :cond_20
    move v6, v8

    :goto_14
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_21

    if-ne v11, v4, :cond_22

    :cond_21
    new-instance v11, Leo2/j;

    const/16 v6, 0xd

    invoke-direct {v11, v5, v6}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v11, Lc93/a;

    and-int/lit16 v3, v3, 0x1c00

    const/16 v6, 0x800

    if-ne v3, v6, :cond_23

    const/16 v17, 0x1

    goto :goto_15

    :cond_23
    move/from16 v17, v8

    :goto_15
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_24

    if-ne v3, v4, :cond_25

    :cond_24
    new-instance v3, Leo2/j;

    const/16 v4, 0xe

    invoke-direct {v3, v9, v4}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v3, Lc93/a;

    invoke-static {v11, v3, v7, v8, v8}, Lep1/m;->q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_26
    instance-of v11, v1, Lcp1/k$o;

    if-eqz v11, :cond_2e

    const v11, 0x85ffc28

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v6, :cond_27

    const/4 v6, 0x1

    goto :goto_16

    :cond_27
    move v6, v8

    :goto_16
    and-int/lit8 v11, v3, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_28

    const/4 v11, 0x1

    goto :goto_17

    :cond_28
    move v11, v8

    :goto_17
    or-int/2addr v6, v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_29

    if-ne v11, v4, :cond_2a

    :cond_29
    new-instance v11, Lep1/l;

    const/4 v6, 0x0

    invoke-direct {v11, v5, v1, v6}, Lep1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcp1/k;I)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v11, Lc93/a;

    and-int/lit16 v3, v3, 0x1c00

    const/16 v6, 0x800

    if-ne v3, v6, :cond_2b

    const/16 v17, 0x1

    goto :goto_18

    :cond_2b
    move/from16 v17, v8

    :goto_18
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_2c

    if-ne v3, v4, :cond_2d

    :cond_2c
    new-instance v3, Leo2/j;

    const/16 v4, 0xa

    invoke-direct {v3, v9, v4}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v3, Lc93/a;

    invoke-static {v11, v3, v7, v8, v8}, Lep1/m;->q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_2e
    instance-of v11, v1, Lcp1/k$b;

    if-eqz v11, :cond_36

    const v11, 0x864c5fd

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v6, :cond_2f

    const/4 v6, 0x1

    goto :goto_19

    :cond_2f
    move v6, v8

    :goto_19
    and-int/lit8 v11, v3, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_30

    const/4 v11, 0x1

    goto :goto_1a

    :cond_30
    move v11, v8

    :goto_1a
    or-int/2addr v6, v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_31

    if-ne v11, v4, :cond_32

    :cond_31
    new-instance v11, Lep1/l;

    const/4 v6, 0x1

    invoke-direct {v11, v5, v1, v6}, Lep1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcp1/k;I)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    check-cast v11, Lc93/a;

    and-int/lit16 v3, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v3, v12, :cond_33

    const/16 v17, 0x1

    goto :goto_1b

    :cond_33
    move/from16 v17, v8

    :goto_1b
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_34

    if-ne v3, v4, :cond_35

    :cond_34
    new-instance v3, Leo2/j;

    const/16 v4, 0xb

    invoke-direct {v3, v9, v4}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    check-cast v3, Lc93/a;

    invoke-static {v11, v3, v7, v8, v8}, Lep1/m;->q(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_36
    const/16 v12, 0x800

    sget-object v11, Lcp1/k$i;->a:Lcp1/k$i;

    invoke-virtual {v1, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3a

    const v3, 0x8692ddb

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x36

    invoke-static {v3, v4, v7, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_37

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_37
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1c
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_38

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_39

    :cond_38
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_39
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lsz0/p0$c;->e:Lsz0/p0$c;

    move-object v3, v5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lsz0/p0$c;->f:I

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v11, 0x3

    or-int/2addr v6, v11

    const/16 v18, 0x0

    const/16 v19, 0xffc

    move/from16 v17, v6

    const/4 v11, 0x1

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move v12, v8

    const/4 v8, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v23, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v2, v21

    move-object/from16 v0, v22

    move-object/from16 v21, v3

    move/from16 v3, v23

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_3a
    move-object/from16 v21, v5

    move v2, v8

    move-object v0, v9

    move-object/from16 v24, v10

    const/16 v23, 0x1

    sget-object v5, Lcp1/k$r;->a:Lcp1/k$r;

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v8, 0x0

    if-eqz v5, :cond_3e

    const v5, 0x86f1024

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    new-instance v13, Lsz0/p0$h;

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lsz0/p0$h;->h:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int v17, v6, v9

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v22, v4

    move-object v4, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v27, v22

    move/from16 v2, v26

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit16 v3, v3, 0x1c00

    if-ne v3, v2, :cond_3b

    move/from16 v8, v23

    goto :goto_1d

    :cond_3b
    const/4 v8, 0x0

    :goto_1d
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_3c

    move-object/from16 v5, v27

    if-ne v2, v5, :cond_3d

    :cond_3c
    new-instance v2, Lep1/m$a;

    const/4 v9, 0x0

    invoke-direct {v2, v0, v9}, Lep1/m$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    check-cast v2, Lc93/m;

    invoke-static {v7, v2, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_3e
    move-object v5, v4

    move v2, v12

    sget-object v4, Lcp1/k$s;->a:Lcp1/k$s;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3f

    const v2, 0x87432db

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v4, Lsz0/p0$f;->e:Lsz0/p0$f;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v2, Lsz0/p0$f;->f:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v17, v2, v3

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_3f
    const/4 v12, 0x0

    sget-object v4, Lcp1/k$n;->a:Lcp1/k$n;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_40

    const v2, 0x877050f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_40
    instance-of v4, v1, Lcp1/k$g;

    if-eqz v4, :cond_41

    const v2, -0x20c25280

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lcp1/k$g;

    invoke-virtual {v2}, Lcp1/k$g;->a()Lcp1/e;

    move-result-object v4

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v5, Lkd1/o;->a:I

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v2, v5

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v5, v3, 0x70

    or-int/2addr v2, v5

    and-int/lit16 v3, v3, 0x380

    or-int v8, v2, v3

    const/4 v9, 0x0

    move-object v6, v0

    move-object/from16 v5, v21

    invoke-static/range {v4 .. v9}, Lep1/d;->n(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    move-object v13, v6

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_1e
    move-object/from16 v21, v4

    :goto_1f
    move-object v0, v13

    goto/16 :goto_25

    :cond_41
    move-object v13, v0

    move-object/from16 v4, v21

    instance-of v0, v1, Lcp1/k$t;

    if-eqz v0, :cond_42

    const v0, -0x20c23ca2

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lcp1/k$t;

    invoke-virtual {v0}, Lcp1/k$t;->a()Lcp1/r;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    const/4 v12, 0x0

    invoke-static {v0, v4, v7, v2, v12}, Lep1/w;->k(Lcp1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_42
    instance-of v0, v1, Lcp1/k$q;

    if-eqz v0, :cond_43

    const v0, -0x20c22b8b

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lcp1/k$q;

    invoke-virtual {v0}, Lcp1/k$q;->a()Lcp1/q;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v5, Lkd1/o;->a:I

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v2, v5

    shr-int/lit8 v5, v3, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v2, v5

    shr-int/lit8 v3, v3, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int v8, v2, v3

    const/4 v9, 0x0

    move-object v5, v4

    move-object/from16 v6, v20

    move-object v4, v0

    invoke-static/range {v4 .. v9}, Lep1/v;->n(Lcp1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v5

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_20
    move-object/from16 v21, v0

    goto :goto_1f

    :cond_43
    move-object v0, v4

    instance-of v4, v1, Lcp1/k$m;

    if-eqz v4, :cond_47

    const v2, 0x87f412e

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lcp1/k$m;

    invoke-virtual {v2}, Lcp1/k$m;->a()Lhp1/d;

    move-result-object v2

    sget-object v4, Lcp1/d;->MCI:Lcp1/d;

    and-int/lit16 v3, v3, 0x380

    if-ne v3, v6, :cond_44

    move/from16 v8, v23

    goto :goto_21

    :cond_44
    const/4 v8, 0x0

    :goto_21
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v8, :cond_45

    if-ne v3, v5, :cond_46

    :cond_45
    new-instance v3, Ldk2/i;

    const/16 v5, 0xb

    invoke-direct {v3, v0, v5}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_46
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    move-object v6, v4

    const/4 v4, 0x0

    move-object v5, v2

    move-object v8, v7

    move-object v7, v3

    invoke-static/range {v4 .. v10}, Ljp1/g;->n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_47
    instance-of v4, v1, Lcp1/k$h;

    if-eqz v4, :cond_48

    const v2, -0x20c1e796

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lcp1/k$h;

    invoke-virtual {v2}, Lcp1/k$h;->a()Lcp1/f;

    move-result-object v4

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v5, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v5, v2

    or-int/2addr v2, v5

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v5, v3, 0x70

    or-int/2addr v2, v5

    and-int/lit16 v3, v3, 0x380

    or-int v8, v2, v3

    const/4 v9, 0x0

    move-object v5, v0

    move-object v6, v13

    invoke-static/range {v4 .. v9}, Lep1/u;->l(Lcp1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_1e

    :cond_48
    move-object v4, v0

    const/4 v12, 0x0

    instance-of v0, v1, Lcp1/k$k;

    if-eqz v0, :cond_49

    const v0, -0x20c1d0d2

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lcp1/k$k;

    invoke-virtual {v0}, Lcp1/k$k;->a()Lcp1/h;

    move-result-object v0

    shr-int/lit8 v2, v3, 0x3

    and-int/lit8 v2, v2, 0x70

    invoke-static {v0, v4, v7, v2, v12}, Lep1/i;->j(Lcp1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_1e

    :cond_49
    instance-of v0, v1, Lcp1/k$j;

    if-eqz v0, :cond_4a

    const v0, -0x20c1c17f

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lcp1/k$j;

    invoke-virtual {v0}, Lcp1/k$j;->a()Lcp1/g;

    move-result-object v2

    and-int/lit16 v6, v3, 0x3f0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v3, p1

    move v0, v12

    move-object/from16 v5, v16

    invoke-static/range {v2 .. v7}, Lep1/h;->m(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v5

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1e

    :cond_4a
    move v0, v12

    instance-of v6, v1, Lcp1/k$f;

    if-eqz v6, :cond_4b

    const v2, -0x20c1afc5

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lcp1/k$f;

    invoke-virtual {v2}, Lcp1/k$f;->a()Lcp1/a;

    move-result-object v2

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v6, Lkd1/o;->a:I

    or-int/2addr v6, v5

    or-int/2addr v6, v5

    or-int/2addr v6, v5

    or-int/2addr v6, v5

    or-int/2addr v5, v6

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v5

    invoke-static {v2, v4, v7, v3, v0}, Lep1/c;->h(Lcp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1e

    :cond_4b
    instance-of v6, v1, Lcp1/k$l;

    if-eqz v6, :cond_4c

    const v2, -0x20c19d0e

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lcp1/k$l;

    move-object v5, v4

    invoke-virtual {v2}, Lcp1/k$l;->a()Lcp1/n;

    move-result-object v4

    invoke-virtual {v2}, Lcp1/k$l;->b()Z

    move-result v8

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v6, Lkd1/o;->a:I

    or-int/2addr v6, v2

    or-int/2addr v2, v6

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v6, v3, 0x70

    or-int/2addr v2, v6

    and-int/lit16 v3, v3, 0x380

    or-int v10, v2, v3

    const/16 v11, 0x8

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object v6, v13

    move-object/from16 v9, v16

    invoke-static/range {v4 .. v11}, Lep1/q;->D(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    move-object v7, v9

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object/from16 v21, v4

    :goto_22
    move-object v0, v6

    goto/16 :goto_25

    :cond_4c
    move-object v6, v13

    instance-of v8, v1, Lcp1/k$c;

    if-eqz v8, :cond_4d

    const v2, 0x8924b91

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v5, v4

    move-object v4, v1

    check-cast v4, Lcp1/k$c;

    and-int/lit8 v2, v3, 0xe

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v8, v3, 0x70

    or-int/2addr v2, v8

    and-int/lit16 v3, v3, 0x380

    or-int v8, v2, v3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lep1/b;->h(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v21, v5

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_4d
    move-object/from16 v21, v4

    sget-object v4, Lcp1/k$a;->a:Lcp1/k$a;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_51

    const v4, 0x89609e7

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    new-instance v8, Lsz0/p0$h;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v4, Lsz0/p0$h;->h:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int v17, v4, v9

    const/16 v18, 0x0

    const/16 v19, 0xffc

    move-object v13, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, v22

    move-object/from16 v28, v27

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit16 v3, v3, 0x1c00

    if-ne v3, v2, :cond_4e

    move/from16 v8, v23

    goto :goto_23

    :cond_4e
    const/4 v8, 0x0

    :goto_23
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_4f

    move-object/from16 v5, v28

    if-ne v2, v5, :cond_50

    :cond_4f
    new-instance v2, Lep1/m$b;

    const/4 v9, 0x0

    invoke-direct {v2, v0, v9}, Lep1/m$b;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_50
    check-cast v2, Lc93/m;

    invoke-static {v7, v2, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_51
    move-object v0, v6

    sget-object v4, Lcp1/k$e;->a:Lcp1/k$e;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_55

    const v4, 0x89b1ad1

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit16 v3, v3, 0x1c00

    if-ne v3, v2, :cond_52

    move/from16 v8, v23

    goto :goto_24

    :cond_52
    const/4 v8, 0x0

    :goto_24
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_53

    if-ne v2, v5, :cond_54

    :cond_53
    new-instance v2, Lep1/m$c;

    const/4 v9, 0x0

    invoke-direct {v2, v0, v9}, Lep1/m$c;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_54
    check-cast v2, Lc93/m;

    invoke-static {v7, v2, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_25
    move-object v4, v0

    move-object/from16 v5, v20

    move-object/from16 v3, v21

    move-object/from16 v6, v24

    goto :goto_26

    :cond_55
    const/4 v12, 0x0

    const v0, -0x20c3568c

    invoke-static {v0, v7, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_56
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v4, v11

    move-object v5, v13

    move-object v6, v15

    :goto_26
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_57

    new-instance v0, Laz1/f;

    move-object/from16 v2, p1

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Laz1/f;-><init>(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_57
    return-void
.end method

.method private static final v(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lbp1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcp1/i;

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lep1/m;->u(Lcp1/k;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

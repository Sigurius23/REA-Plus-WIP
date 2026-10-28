.class public abstract Lkk1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aY\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aY\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u0011\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lik1/g;",
        "viewModel",
        "Lkotlin/Function1;",
        "Lhk1/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Ldk1/a;",
        "onAnalyticsEvent",
        "y",
        "(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lik1/h;",
        "viewState",
        "Lik1/f;",
        "onViewEvent",
        "n",
        "(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "s",
        "healthspan_release"
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
.method private static final A(Ldk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/t2;)Lik1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lik1/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lik1/h;

    return-object p0
.end method

.method private static final C(Lik1/g;Lik1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lik1/g;->n(Lik1/f;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkk1/d;->y(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lkk1/d;->r(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->q(Lhk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lik1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->t(Lik1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkk1/d;->D(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lik1/g;Lik1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkk1/d;->C(Lik1/g;Lik1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ldk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->u(Ldk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lik1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->o(Lik1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lhk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->v(Lhk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ldk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->p(Ldk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lkk1/d;->x(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lhk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->z(Lhk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ldk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkk1/d;->A(Ldk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik1/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x7184120e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v10, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v4, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v7, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v0, v8

    :goto_7
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    const/4 v11, 0x0

    const/4 v13, 0x1

    if-eq v8, v9, :cond_b

    move v8, v13

    goto :goto_8

    :cond_b
    move v8, v11

    :goto_8
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_c

    new-instance v1, Lkf0/d;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lkf0/d;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v7, v1

    goto :goto_9

    :cond_d
    move-object v7, p1

    :goto_9
    if-eqz v3, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_e

    new-instance v1, Lkf0/d;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkf0/d;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v1, v4

    :goto_a
    if-eqz v6, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_10

    new-instance v2, Lkf0/d;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lkf0/d;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v9, v2

    goto :goto_b

    :cond_11
    move-object/from16 v9, p3

    :goto_b
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ly81/f;->BACKGROUND_DARK_STD:Ly81/f;

    const/4 v4, 0x6

    invoke-virtual {v3, v10, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v3, v4, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_12

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v4, v10, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v11, v0, 0x1ffe

    const/4 v12, 0x0

    move-object v6, p0

    move-object v8, v1

    invoke-static/range {v6 .. v12}, Lkk1/d;->s(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v2, v7

    move-object v3, v8

    move-object v4, v9

    goto :goto_d

    :cond_15
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, v4

    move-object/from16 v4, p3

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lkk1/c;

    const/4 v7, 0x1

    move-object v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkk1/c;-><init>(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final o(Lik1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ldk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lhk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lkk1/d;->n(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik1/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x2c0ccf81

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v4

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    const/16 v10, 0x800

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v11, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move v13, v10

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit16 v13, v0, 0x493

    const/16 v14, 0x492

    if-eq v13, v14, :cond_b

    const/4 v13, 0x1

    goto :goto_8

    :cond_b
    const/4 v13, 0x0

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v11, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_22

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_c

    new-instance v3, Lkf0/d;

    const/16 v6, 0xc

    invoke-direct {v3, v6}, Lkf0/d;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v8, v3

    goto :goto_9

    :cond_d
    move-object v8, v6

    :goto_9
    if-eqz v7, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_e

    new-instance v3, Lkf0/d;

    const/16 v6, 0xd

    invoke-direct {v3, v6}, Lkf0/d;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move/from16 v22, v9

    move-object v9, v3

    move/from16 v3, v22

    goto :goto_a

    :cond_f
    move v3, v9

    move-object/from16 v9, p2

    :goto_a
    if-eqz v3, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_10

    new-instance v3, Lkf0/d;

    const/4 v6, 0x7

    invoke-direct {v3, v6}, Lkf0/d;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v12, v3

    :cond_11
    instance-of v3, v1, Lik1/h$c;

    const/4 v6, 0x0

    if-eqz v3, :cond_19

    const v2, -0x26c25de5

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lik1/h$c;

    invoke-virtual {v2}, Lik1/h$c;->e()Z

    move-result v7

    invoke-virtual {v2}, Lik1/h$c;->d()Lik1/d;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lik1/d;->g()Z

    move-result v3

    if-nez v3, :cond_12

    if-nez v7, :cond_12

    const/4 v3, 0x1

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    :goto_b
    invoke-virtual {v2}, Lik1/h$c;->d()Lik1/d;

    move-result-object v14

    if-eqz v14, :cond_13

    invoke-virtual {v14}, Lik1/d;->g()Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    goto :goto_c

    :cond_13
    move-object v14, v6

    :goto_c
    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v16

    and-int/lit8 v15, v0, 0x70

    if-ne v15, v4, :cond_14

    const/4 v4, 0x1

    goto :goto_d

    :cond_14
    const/4 v4, 0x0

    :goto_d
    or-int v4, v16, v4

    and-int/lit16 v15, v0, 0x1c00

    if-ne v15, v10, :cond_15

    const/4 v15, 0x1

    goto :goto_e

    :cond_15
    const/4 v15, 0x0

    :goto_e
    or-int/2addr v4, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_16

    if-ne v10, v13, :cond_17

    :cond_16
    new-instance v10, Lkk1/d$a;

    invoke-direct {v10, v3, v8, v12, v6}, Lkk1/d$a;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v10, Lc93/m;

    invoke-static {v11, v10, v14}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v3, :cond_18

    const v3, -0x26ba2e5e

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v0, 0xe

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v0, 0x1c00

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v0, v4

    or-int/2addr v0, v3

    const/4 v13, 0x0

    move-object v6, v2

    move-object v10, v12

    move v12, v0

    invoke-static/range {v6 .. v13}, Lkk1/g;->d0(Lik1/h$c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v8

    move-object v4, v9

    move-object v7, v10

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_18
    move-object v3, v8

    move-object v4, v9

    move-object v7, v12

    const/4 v8, 0x0

    const v0, -0x26b5431d

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object v0, v7

    goto/16 :goto_12

    :cond_19
    move-object v3, v8

    move-object v4, v9

    move-object v7, v12

    const/4 v8, 0x0

    instance-of v9, v1, Lik1/h$a;

    if-eqz v9, :cond_1d

    const v9, -0x26b44de6

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lgy0/f;->P1:I

    invoke-direct {v15, v9, v6, v2, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v12, v9

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v15, Luv0/c;->E:I

    invoke-direct {v9, v15, v6, v2, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v10, :cond_1a

    const/4 v15, 0x1

    goto :goto_10

    :cond_1a
    move v15, v8

    :goto_10
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_1b

    if-ne v0, v13, :cond_1c

    :cond_1b
    new-instance v0, Ljp1/l;

    const/16 v2, 0x15

    invoke-direct {v0, v7, v2}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v10, v0

    check-cast v10, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x9

    or-int v19, v0, v2

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    move/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object v0, v7

    move-object v7, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v2, v17

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v18

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :cond_1d
    move-object v0, v7

    move v2, v8

    instance-of v6, v1, Lik1/h$b;

    if-eqz v6, :cond_21

    const v6, -0x26adbbaa

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v6, v7, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_1e

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_11
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_1f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_20

    :cond_1f
    invoke-static {v7, v11, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lsz0/p0$c;->f:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int v19, v8, v9

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v2, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v18

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_12
    move-object v2, v3

    move-object v3, v4

    move-object v4, v0

    goto :goto_13

    :cond_21
    const v0, -0x5c16cd6c

    invoke-static {v0, v11, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_22
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v2, v6

    move-object v4, v12

    :goto_13
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_23

    new-instance v0, Lkk1/c;

    const/4 v7, 0x0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkk1/c;-><init>(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final t(Lik1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ldk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lhk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhk1/a$a;->a:Lhk1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lkk1/d;->s(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p3

    check-cast v5, Lp1/q;

    const p3, -0x75826fdb

    invoke-virtual {v5, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p3, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 p3, p3, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr p3, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, p3, 0x93

    const/16 v4, 0x92

    if-eq v3, v4, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    and-int/lit8 v4, p3, 0x1

    invoke-virtual {v5, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_9

    new-instance p1, Lkf0/d;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lkf0/d;-><init>(I)V

    invoke-virtual {v5, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_a
    if-eqz v2, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v8, :cond_b

    new-instance p2, Lkf0/d;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Lkf0/d;-><init>(I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_c
    invoke-virtual {p0}, Lik1/g;->getViewState()Lec3/l;

    move-result-object v2

    sget-object v3, Lik1/h$b;->b:Lik1/h$b;

    const/16 v6, 0x30

    const/4 v7, 0x2

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-static {v0}, Lkk1/d;->B(Lp1/t2;)Lik1/h;

    move-result-object v2

    const-string v3, "healthcare_healthspan"

    const/16 v4, 0x30

    invoke-static {v2, v3, v5, v4}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0}, Lkk1/d;->B(Lp1/t2;)Lik1/h;

    move-result-object v2

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_d

    if-ne v3, v8, :cond_e

    :cond_d
    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v0, 0x10

    invoke-direct {v3, p0, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v0, p3, 0x380

    shl-int/lit8 p3, p3, 0x6

    and-int/lit16 p3, p3, 0x1c00

    or-int v7, v0, p3

    const/4 v8, 0x0

    move-object v4, p2

    move-object v6, v5

    move-object v5, p1

    invoke-static/range {v2 .. v8}, Lkk1/d;->n(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    :goto_7
    move-object v6, p1

    goto :goto_8

    :cond_f
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_10

    new-instance v0, Ljp1/d;

    const/16 v3, 0xb

    move-object v4, p0

    move-object v5, p2

    move v1, p4

    move v2, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final z(Lhk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

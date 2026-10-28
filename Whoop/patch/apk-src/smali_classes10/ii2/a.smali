.class public abstract Lii2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Leb/u0;",
        "navController",
        "Lji2/l;",
        "viewState",
        "Lkotlin/Function1;",
        "Lji2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onBackPressed",
        "e",
        "(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "strava_release"
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
.method public static synthetic a(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lii2/a;->f(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lii2/a;->g(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lii2/a;->i(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lji2/l;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lii2/a;->h(Lji2/l;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/u0;",
            "Lji2/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "navController"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p4

    check-cast v6, Lp1/q;

    const v0, -0x9fd5d6e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    const/16 v4, 0x800

    if-nez v2, :cond_7

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v4

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v0, v2

    :cond_7
    and-int/lit16 v2, v0, 0x493

    const/16 v5, 0x492

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v2, v5, :cond_8

    move v2, v8

    goto :goto_5

    :cond_8
    move v2, v7

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v5, v0, 0x380

    if-ne v5, v3, :cond_9

    move v3, v8

    goto :goto_6

    :cond_9
    move v3, v7

    :goto_6
    or-int/2addr v2, v3

    and-int/lit16 v3, v0, 0x1c00

    if-ne v3, v4, :cond_a

    move v7, v8

    :cond_a
    or-int/2addr v2, v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Lig0/h;

    const/4 v2, 0x2

    invoke-direct {v3, p1, p2, p3, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v7, v0, 0xe

    const-string v3, "SETTINGS"

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lhy0/d1;

    const/16 v2, 0xf

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v5, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Lhy0/d1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/s0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$NavHost"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La80/f;

    const/16 v1, 0x11

    invoke-direct {v0, p0, p1, p2, v1}, La80/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x28488897

    invoke-direct {p2, v0, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "SETTINGS"

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {p3, v0, v2, p2, v3}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance p2, Lih1/f;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p0, p1}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lx1/b;

    const p1, -0x383bd832

    invoke-direct {p0, p2, v1, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p1, "SELECTED_ACTIVITIES"

    invoke-static {p3, p1, v2, p0, v3}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p4, p3}, Lmi2/l;->v(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lji2/l;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-static {p0, p1, p3, p2}, Lmi2/c;->y(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lii2/a;->e(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

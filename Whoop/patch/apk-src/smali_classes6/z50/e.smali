.class public abstract Lz50/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lw50/a;",
        "navRouter",
        "Lx50/b;",
        "viewModel",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onConnect",
        "e",
        "(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lx50/c;",
        "viewState",
        "Lx50/a;",
        "onEvent",
        "f",
        "(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lx50/b;Lw50/a;Lkotlin/jvm/functions/Function1;Lx50/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz50/e;->h(Lx50/b;Lw50/a;Lkotlin/jvm/functions/Function1;Lx50/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx50/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz50/e;->j(Lx50/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz50/e;->i(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx50/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz50/e;->k(Lx50/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw50/a;",
            "Lx50/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "navRouter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConnect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x7c7a57a4

    invoke-virtual {v4, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v0, p4, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p3, v0

    :cond_3
    and-int/lit16 v0, p4, 0x180

    const/16 v7, 0x100

    if-nez v0, :cond_5

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v7

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p3, v0

    :cond_5
    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v0, v1, :cond_6

    move v0, v8

    goto :goto_4

    :cond_6
    move v0, v9

    :goto_4
    and-int/lit8 v1, p3, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lx50/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lx50/c$e;->b:Lx50/c$e;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_7

    if-ne v2, v3, :cond_8

    :cond_7
    new-instance v2, Lz50/e$a;

    const/4 v1, 0x0

    invoke-direct {v2, p1, v1}, Lz50/e$a;-><init>(Lx50/b;Lq83/d;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lc93/m;

    invoke-static {v4, v2, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lz50/e;->g(Lp1/t2;)Lx50/c;

    move-result-object v1

    const-string v2, "access_omron_auth"

    const/16 v5, 0x30

    invoke-static {v1, v2, v4, v5}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0}, Lz50/e;->g(Lp1/t2;)Lx50/c;

    move-result-object v0

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    and-int/lit16 p3, p3, 0x380

    if-ne p3, v7, :cond_9

    goto :goto_5

    :cond_9
    move v8, v9

    :goto_5
    or-int p3, v1, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_a

    if-ne v1, v3, :cond_b

    :cond_a
    new-instance v1, Lwc/e1;

    const/16 p3, 0x16

    invoke-direct {v1, p1, p0, p2, p3}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v4, v9, v9}, Lz50/e;->f(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_c
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_d

    new-instance v0, Lvv2/c;

    const/16 v5, 0x16

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final f(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx50/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x4925f7e8    # 679806.5f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_5

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    :goto_4
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_6

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    move v2, v4

    :goto_5
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    if-eqz v1, :cond_8

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p1, v1, :cond_7

    new-instance p1, Lyz1/g;

    const/16 v1, 0xe

    invoke-direct {p1, v1}, Lyz1/g;-><init>(I)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_8
    instance-of v1, p0, Lx50/c$c;

    if-eqz v1, :cond_9

    const v1, -0x68784d0e

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lx50/c$c;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0, v4}, Lz50/d;->r(Lx50/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v1, -0x687845ac

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p0, p1, p2, v0, v4}, Lz50/c;->e(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_6
    move-object v7, p1

    goto :goto_7

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v5, Lz50/b;

    const/4 v10, 0x1

    move-object v6, p0

    move v8, p3

    move v9, p4

    invoke-direct/range {v5 .. v10}, Lz50/b;-><init>(Lx50/c;Lkotlin/jvm/functions/Function1;III)V

    iput-object v5, p1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final g(Lp1/t2;)Lx50/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lx50/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx50/c;

    return-object p0
.end method

.method private static final h(Lx50/b;Lw50/a;Lkotlin/jvm/functions/Function1;Lx50/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lx50/a$j;

    if-eqz v0, :cond_0

    check-cast p3, Lx50/a$j;

    invoke-virtual {p0, p3}, Lx50/b;->n(Lx50/a$j;)V

    goto :goto_0

    :cond_0
    instance-of p0, p3, Lx50/a$g;

    if-eqz p0, :cond_1

    check-cast p3, Lx50/a$g;

    invoke-virtual {p1, p3}, Lw50/a;->a(Lx50/a$g;)V

    goto :goto_0

    :cond_1
    instance-of p0, p3, Lx50/a$a;

    if-eqz p0, :cond_2

    check-cast p3, Lx50/a$a;

    invoke-virtual {p3}, Lx50/a$a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final i(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lz50/e;->e(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lx50/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lx50/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lz50/e;->f(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Ljt1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aA\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lit1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lit1/a$f;",
        "Ll83/a0;",
        "onViewEvent",
        "Lit1/a$d;",
        "onNavigationEvent",
        "C",
        "(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lit1/a;",
        "onEvent",
        "B",
        "(Lit1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lit1/c$b;",
        "p",
        "(Lit1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lit1/c$a;",
        "x",
        "(Lit1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "labrador_release"
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
.method private static final A(Lit1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljt1/c;->x(Lit1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Lit1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lit1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0xb5d7b20

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
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, p0, Lit1/c$a;

    if-eqz v1, :cond_6

    const v1, -0x5614b0e0

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lit1/c$a;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Ljt1/c;->x(Lit1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    instance-of v1, p0, Lit1/c$b;

    if-eqz v1, :cond_7

    const v1, -0x5614a222

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lit1/c$b;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Ljt1/c;->p(Lit1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p0, -0x5614ba35

    invoke-static {p0, p2, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lig0/d;

    const/16 v1, 0x13

    invoke-direct {v0, p0, p1, p3, v1}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final C(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lit1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x4cf0748d

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p4

    goto :goto_2

    :cond_2
    move v0, p4

    :goto_2
    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, p5, 0x4

    const/16 v3, 0x100

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v4, p4, 0x180

    if-nez v4, :cond_7

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_4

    :cond_6
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    :goto_5
    and-int/lit16 v4, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_8

    move v4, v7

    goto :goto_6

    :cond_8
    move v4, v6

    :goto_6
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {p3, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_a

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_9

    new-instance p2, Ljp2/f;

    const/16 v1, 0x9

    invoke-direct {p2, v1}, Ljp2/f;-><init>(I)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_a
    and-int/lit16 v1, v0, 0x380

    if-ne v1, v3, :cond_b

    move v5, v7

    goto :goto_7

    :cond_b
    move v5, v6

    :goto_7
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_c

    if-ne v8, v4, :cond_d

    :cond_c
    new-instance v8, Ljp1/l;

    const/16 v5, 0xd

    invoke-direct {v8, p2, v5}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lc93/a;

    invoke-static {v8, v6, p3, v6, v7}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    if-ne v1, v3, :cond_e

    move v1, v7

    goto :goto_8

    :cond_e
    move v1, v6

    :goto_8
    and-int/lit8 v3, v0, 0x70

    if-ne v3, v2, :cond_f

    move v6, v7

    :cond_f
    or-int/2addr v1, v6

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v4, :cond_11

    :cond_10
    new-instance v2, Lb70/c;

    const/4 v1, 0x6

    invoke-direct {v2, p2, v1, p1}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v0, v0, 0xe

    invoke-static {p0, v2, p3, v0}, Ljt1/c;->B(Lit1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    move-object v8, p2

    goto :goto_a

    :cond_12
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_13

    new-instance v3, Ljp1/d;

    const/4 v6, 0x5

    move-object v7, p0

    move-object v9, p1

    move v4, p4

    move v5, p5

    invoke-direct/range {v3 .. v9}, Ljp1/d;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v3, p2, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final D(Lit1/a$d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lit1/a$a;->a:Lit1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lit1/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lit1/a$d;

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lit1/a$f;

    if-eqz p0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final G(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljt1/c;->C(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lit1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljt1/c;->B(Lit1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljt1/c;->z(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljt1/c;->s(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljt1/c;->r(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljt1/c;->y(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lit1/c$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljt1/c;->u(Lkotlin/jvm/functions/Function1;Lit1/c$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljt1/c;->t(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lit1/a$d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljt1/c;->D(Lit1/a$d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lit1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljt1/c;->F(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lit1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lit1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljt1/c;->H(Lit1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lit1/c$b;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljt1/c;->v(Lit1/c$b;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lit1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljt1/c;->A(Lit1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lit1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljt1/c;->w(Lit1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljt1/c;->G(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljt1/c;->E(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljt1/c;->q(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lit1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 87
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lit1/c$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v3, 0x49312f56

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    const/16 v12, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v12

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    move/from16 v36, v3

    and-int/lit8 v3, v36, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_5

    move v3, v6

    goto :goto_4

    :cond_5
    move v3, v5

    :goto_4
    and-int/lit8 v7, v36, 0x1

    invoke-virtual {v14, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v3, v7, :cond_6

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lp1/c1;

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v8, v9}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v5, v14, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v11

    const/16 v4, 0xe

    invoke-static {v10, v11, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x36

    invoke-static {v11, v10, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v14, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v10, v14, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v14, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lit1/c$b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-virtual {v0}, Lit1/c$b;->q()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v40

    sget v9, Lrs1/f;->b:I

    invoke-static {v14, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v41

    const v54, 0xfff2

    const/16 v55, 0x0

    const/16 v39, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    move-object/from16 v37, v4

    invoke-direct/range {v37 .. v55}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v9, v36, 0x70

    if-ne v9, v12, :cond_a

    const/4 v10, 0x1

    goto :goto_6

    :cond_a
    const/4 v10, 0x0

    :goto_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_b

    if-ne v12, v7, :cond_c

    :cond_b
    new-instance v12, Ljp1/l;

    const/16 v10, 0xe

    invoke-direct {v12, v1, v10}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lc93/a;

    sget v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v22, v12

    const/4 v12, 0x3

    shl-int/2addr v10, v12

    move-object/from16 v23, v11

    const/16 v11, 0x35

    move-object/from16 v24, v3

    const/4 v3, 0x0

    move-object/from16 v25, v5

    const/4 v5, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move-object/from16 v56, v6

    move/from16 v59, v9

    move-object/from16 p2, v13

    move-object v9, v14

    move-object/from16 v18, v15

    move-object/from16 v6, v22

    move-object/from16 v58, v23

    move-object/from16 v37, v24

    move-object/from16 v57, v25

    move-object/from16 v60, v26

    move-object/from16 v15, v27

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/16 v16, 0x12

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lit1/c$b;->f()I

    move-result v3

    invoke-static {v3, v8, v14}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    sget v4, Lrs1/f;->A:I

    invoke-static {v8, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0x6180

    move v6, v12

    const/16 v12, 0x68

    move v7, v6

    const/4 v6, 0x0

    move v9, v7

    sget-object v7, Ly2/j;->d:Ly2/b1;

    move-object/from16 v25, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v13, v10

    move-object/from16 v10, v25

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    int-to-float v3, v13

    const/16 v4, 0x8

    int-to-float v5, v4

    mul-float v6, v3, v5

    const/4 v7, 0x0

    move v10, v4

    const/4 v9, 0x2

    invoke-static {v15, v6, v7, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lit1/c$b;->p()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v11, v8, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v13, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Lb91/d;->r()Lb91/a;

    move-result-object v23

    invoke-virtual {v13, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->y()J

    move-result-wide v21

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v27, v24, 0x12

    const v28, 0x2fff8

    move/from16 v16, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move/from16 v24, v9

    const/4 v9, 0x0

    move/from16 v26, v10

    const/4 v10, 0x0

    move/from16 v29, v3

    move-object v3, v11

    const/4 v11, 0x0

    move/from16 v30, v12

    move-object/from16 v31, v13

    const-wide/16 v12, 0x0

    move/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v33, v15

    const/4 v15, 0x0

    move/from16 v34, v16

    const/16 v35, 0x4

    const-wide/16 v16, 0x0

    move-object/from16 v38, v18

    const/16 v18, 0x0

    const/high16 v39, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/16 v40, 0x0

    const/16 v20, 0x0

    move/from16 v41, v6

    move-wide/from16 v85, v21

    move/from16 v22, v5

    move-wide/from16 v5, v85

    const/16 v21, 0x0

    move/from16 v42, v22

    const/16 v22, 0x0

    move/from16 v43, v24

    const/16 v24, 0x0

    move/from16 v44, v26

    const/16 v26, 0x30

    move/from16 v62, v30

    move-object/from16 v63, v31

    move-object/from16 v2, v33

    move/from16 v64, v34

    move/from16 v0, v41

    move/from16 v1, v42

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    invoke-static {v3, v1, v2, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v0, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    move-object/from16 v12, p2

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v13, v56

    goto :goto_8

    :cond_d
    move-object/from16 v12, p2

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v8, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v57

    invoke-static {v8, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    :cond_e
    move-object/from16 v11, v58

    goto :goto_a

    :cond_f
    move-object/from16 v11, v58

    :goto_9
    move-object/from16 v10, v38

    goto :goto_b

    :goto_a
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v8, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v14, v3

    const-wide/16 v17, 0x0

    cmpl-double v14, v14, v17

    const-string v19, "invalid weight; must be greater than zero"

    if-lez v14, :cond_10

    goto :goto_c

    :cond_10
    invoke-static/range {v19 .. v19}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v14, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v20, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v15, v3, v20

    if-lez v15, :cond_11

    move/from16 v3, v20

    :goto_d
    const/4 v15, 0x1

    goto :goto_e

    :cond_11
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_d

    :goto_e
    invoke-direct {v14, v3, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v3, 0x4

    int-to-float v4, v3

    mul-float v21, v29, v4

    invoke-static/range {v21 .. v21}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v14, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v14, v6

    move-object v6, v3

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v23, v11

    sget-object v11, Lny0/y0;->TextLarge:Lny0/y0;

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->o()Lht1/e;

    move-result-object v5

    sget-object v9, Lht1/e;->LEFT:Lht1/e;

    if-ne v5, v9, :cond_12

    move v9, v15

    :goto_f
    move/from16 v22, v4

    move/from16 v5, v59

    const/16 v4, 0x20

    goto :goto_10

    :cond_12
    const/4 v9, 0x0

    goto :goto_f

    :goto_10
    if-ne v5, v4, :cond_13

    move/from16 v25, v15

    goto :goto_11

    :cond_13
    const/16 v25, 0x0

    :goto_11
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v59, v5

    move-object/from16 v5, v60

    if-nez v25, :cond_15

    if-ne v4, v5, :cond_14

    goto :goto_12

    :cond_14
    move-object/from16 v26, v5

    move-object/from16 v5, p1

    goto :goto_13

    :cond_15
    :goto_12
    new-instance v4, Ljp1/n;

    const/16 v15, 0x8

    move-object/from16 v26, v5

    move-object/from16 v5, p1

    invoke-direct {v4, v5, v15}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/high16 v15, 0x6c00000

    move-object/from16 p2, v4

    move/from16 v4, v62

    or-int/2addr v15, v4

    const/16 v32, 0x0

    const/16 v16, 0x56

    move/from16 v30, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v57, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-object/from16 v38, v10

    const/4 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x1

    move/from16 v41, v0

    move-object/from16 v66, v13

    move-object/from16 v71, v14

    move/from16 v29, v22

    move-object/from16 v68, v23

    move-object/from16 v14, v25

    move-object/from16 v74, v26

    move-object/from16 v65, v28

    move/from16 v70, v30

    move-object/from16 v69, v38

    move-object/from16 v67, v57

    const/4 v0, 0x1

    move-object/from16 v13, p2

    invoke-static/range {v3 .. v16}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v14

    int-to-float v3, v0

    invoke-static {v3, v1, v2, v8}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v3, v13

    cmpl-double v3, v3, v17

    if-lez v3, :cond_16

    goto :goto_14

    :cond_16
    invoke-static/range {v19 .. v19}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v13, v20

    if-lez v4, :cond_17

    move/from16 v9, v20

    goto :goto_15

    :cond_17
    const/high16 v9, 0x3f800000    # 1.0f

    :goto_15
    invoke-direct {v3, v9, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {v21 .. v21}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v3, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->o()Lht1/e;

    move-result-object v4

    sget-object v5, Lht1/e;->RIGHT:Lht1/e;

    if-ne v4, v5, :cond_18

    move v9, v0

    :goto_16
    move/from16 v4, v59

    const/16 v5, 0x20

    goto :goto_17

    :cond_18
    const/4 v9, 0x0

    goto :goto_16

    :goto_17
    if-ne v4, v5, :cond_19

    move v7, v0

    goto :goto_18

    :cond_19
    const/4 v7, 0x0

    :goto_18
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_1b

    move-object/from16 v7, v74

    if-ne v10, v7, :cond_1a

    goto :goto_19

    :cond_1a
    move-object/from16 v13, p1

    goto :goto_1a

    :cond_1b
    move-object/from16 v7, v74

    :goto_19
    new-instance v10, Ljp1/n;

    const/16 v12, 0x9

    move-object/from16 v13, p1

    invoke-direct {v10, v13, v12}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x56

    move/from16 v59, v4

    const/4 v4, 0x0

    move/from16 v61, v5

    const/4 v5, 0x0

    move-object/from16 v26, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v12, 0x1

    move/from16 v42, v1

    move-object/from16 v14, v25

    move-object/from16 v1, v26

    invoke-static/range {v3 .. v16}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v14

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/4 v11, 0x2

    int-to-float v3, v11

    mul-float v12, v3, v42

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move/from16 v13, v41

    const/4 v14, 0x0

    invoke-static {v2, v13, v14, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x30

    move-object/from16 v6, v71

    invoke-static {v6, v4, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    move-object/from16 v7, v65

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_1b
    move-object/from16 v7, v66

    goto :goto_1c

    :cond_1c
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_1b

    :goto_1c
    invoke-static {v8, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v67

    invoke-static {v8, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    move-object/from16 v4, v68

    goto :goto_1e

    :cond_1e
    :goto_1d
    move-object/from16 v10, v69

    goto :goto_1f

    :goto_1e
    invoke-static {v5, v8, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1d

    :goto_1f
    invoke-static {v8, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->g()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v8, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    mul-float v4, v29, v29

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v15, v63

    move/from16 v4, v64

    invoke-virtual {v15, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v6

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    move/from16 v16, v4

    const/4 v4, 0x0

    move/from16 v0, v16

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v4, v70

    invoke-static {v3, v8, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X()J

    move-result-wide v5

    invoke-virtual {v15, v8, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    const/16 v26, 0x0

    const v28, 0x2fffa

    move/from16 v30, v4

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v24, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    move/from16 v41, v13

    const-wide/16 v12, 0x0

    move/from16 v40, v14

    const/4 v14, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v73, v24

    const/16 v24, 0x0

    move/from16 v64, v0

    move-object/from16 v60, v1

    move/from16 v62, v30

    move-object/from16 v75, v31

    move/from16 v76, v32

    move/from16 v1, v41

    move/from16 v0, v73

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/4 v15, 0x1

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    mul-float v5, v42, v42

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v3, 0x0

    invoke-static {v2, v1, v3, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move/from16 v6, v62

    invoke-static {v5, v8, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v9, v64

    move-object/from16 v7, v75

    invoke-virtual {v7, v8, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v26, 0x30

    const v28, 0x2fff8

    move-object/from16 v31, v7

    const-wide/16 v7, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v40, v3

    move-object v3, v5

    move/from16 v30, v6

    move-wide v5, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    move/from16 v64, v16

    const-wide/16 v16, 0x0

    move/from16 v77, v30

    move-object/from16 v78, v31

    move/from16 v79, v64

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    move/from16 v3, v76

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v14, 0x0

    invoke-static {v2, v1, v14, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v3, v77

    invoke-static {v0, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v78

    move/from16 v6, v79

    invoke-virtual {v5, v8, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v9

    const-wide/16 v7, 0x0

    move-object/from16 v31, v5

    move/from16 v16, v6

    move-wide v5, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move/from16 v64, v16

    const-wide/16 v16, 0x0

    move/from16 v80, v3

    move-object v3, v0

    move/from16 v0, v80

    move-object/from16 v80, v31

    move/from16 v81, v64

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    mul-float v3, v29, v42

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_26

    const v4, -0x474e9209

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget v4, Lrs1/f;->S:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    sget v5, Lrs1/f;->R:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v6, Lrs1/f;->r:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v7, Lrs1/f;->c:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    sget-object v7, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v10, v60

    if-ne v9, v10, :cond_1f

    new-instance v9, Ljt1/b;

    const/4 v11, 0x0

    move-object/from16 v13, v37

    invoke-direct {v9, v11, v13}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_20

    :cond_1f
    move-object/from16 v13, v37

    :goto_20
    move-object/from16 v25, v9

    check-cast v25, Lc93/a;

    move/from16 v9, v59

    const/16 v11, 0x20

    if-ne v9, v11, :cond_20

    const/4 v14, 0x1

    goto :goto_21

    :cond_20
    const/4 v14, 0x0

    :goto_21
    and-int/lit8 v15, v36, 0xe

    move/from16 p2, v3

    const/4 v3, 0x4

    if-eq v15, v3, :cond_23

    and-int/lit8 v15, v36, 0x8

    if-eqz v15, :cond_21

    move-object/from16 v15, p0

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_22

    goto :goto_22

    :cond_21
    move-object/from16 v15, p0

    :cond_22
    const/16 v16, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v15, p0

    :goto_22
    const/16 v16, 0x1

    :goto_23
    or-int v14, v14, v16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v14, :cond_25

    if-ne v3, v10, :cond_24

    goto :goto_24

    :cond_24
    move-object/from16 v16, v7

    move-object/from16 v7, p1

    goto :goto_25

    :cond_25
    :goto_24
    new-instance v3, Lj11/q;

    const/16 v14, 0xf

    move-object/from16 v16, v7

    move-object/from16 v7, p1

    invoke-direct {v3, v14, v7, v15}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_25
    move-object/from16 v27, v3

    check-cast v27, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v14, v3, 0x3

    const/high16 v18, 0x30000

    or-int v14, v14, v18

    shl-int/lit8 v18, v3, 0x6

    or-int v14, v14, v18

    shl-int/lit8 v18, v3, 0x9

    or-int v14, v14, v18

    shl-int/lit8 v3, v3, 0x1b

    or-int v32, v14, v3

    const/16 v34, 0x180

    const v35, 0xebffdd1

    const/4 v3, 0x0

    const/4 v7, 0x0

    move/from16 v59, v9

    const/4 v9, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move/from16 v61, v11

    const/4 v11, 0x0

    move-object/from16 v37, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v31, v8

    move-object/from16 v8, v16

    const/16 v16, 0x0

    const/16 v72, 0x4

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v60, v26

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    move/from16 v62, v0

    move-object/from16 v82, v37

    move/from16 v83, v59

    move-object/from16 v84, v60

    move/from16 v0, p2

    invoke-static/range {v3 .. v35}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v31

    const/4 v14, 0x0

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    :goto_26
    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_27

    :cond_26
    move/from16 v62, v0

    move v0, v3

    move-object/from16 v82, v37

    move/from16 v83, v59

    move-object/from16 v84, v60

    const/4 v14, 0x0

    const v3, -0x4744675e

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_26

    :goto_27
    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v1, v0}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v6, v62

    invoke-static {v0, v8, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v15, v80

    move/from16 v0, v81

    invoke-virtual {v15, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lit1/c$b;->s()Z

    move-result v6

    and-int/lit8 v2, v36, 0xe

    const/4 v7, 0x4

    if-eq v2, v7, :cond_28

    and-int/lit8 v2, v36, 0x8

    move-object/from16 v15, p0

    if-eqz v2, :cond_27

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    goto :goto_29

    :cond_27
    move v2, v14

    :goto_28
    move/from16 v9, v83

    const/16 v11, 0x20

    goto :goto_2a

    :cond_28
    move-object/from16 v15, p0

    :goto_29
    const/4 v2, 0x1

    goto :goto_28

    :goto_2a
    if-ne v9, v11, :cond_29

    const/4 v14, 0x1

    :cond_29
    or-int/2addr v2, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_2b

    move-object/from16 v10, v84

    if-ne v7, v10, :cond_2a

    goto :goto_2b

    :cond_2a
    move-object/from16 v9, p1

    goto :goto_2c

    :cond_2b
    :goto_2b
    new-instance v7, Lim1/a0;

    const/16 v2, 0xe

    move-object/from16 v9, p1

    move-object/from16 v13, v82

    invoke-direct {v7, v15, v13, v9, v2}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2c
    move-object v11, v7

    check-cast v11, Lc93/a;

    const/16 v13, 0x36

    const/16 v14, 0x60

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v12, v8

    move-wide v7, v0

    move-object/from16 v1, p1

    invoke-static/range {v3 .. v14}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_2d

    :cond_2c
    move-object v15, v0

    move-object v8, v14

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2d

    new-instance v2, Lig0/d;

    const/16 v3, 0x11

    move/from16 v4, p3

    invoke-direct {v2, v15, v1, v4, v3}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lit1/a$a;->a:Lit1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance p1, Lit1/a$e;

    sget-object v0, Lht1/e;->LEFT:Lht1/e;

    invoke-direct {p1, v0}, Lit1/a$e;-><init>(Lht1/e;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance p1, Lit1/a$e;

    sget-object v0, Lht1/e;->RIGHT:Lht1/e;

    invoke-direct {p1, v0}, Lit1/a$e;-><init>(Lht1/e;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lit1/c$b;)Ll83/a0;
    .locals 1

    new-instance v0, Lit1/a$c;

    invoke-virtual {p1}, Lit1/c$b;->o()Lht1/e;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lht1/e;->RIGHT:Lht1/e;

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lit1/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lit1/c$b;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lit1/c$b;->o()Lht1/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lit1/c$b;->r()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lit1/a$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lit1/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lit1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljt1/c;->p(Lit1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lit1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lit1/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, 0x27477c31

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/16 v19, 0x0

    const/16 v20, 0x1

    if-eq v4, v6, :cond_5

    move/from16 v4, v20

    goto :goto_4

    :cond_5
    move/from16 v4, v19

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v15, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    move v4, v3

    invoke-virtual {v0}, Lit1/c$a;->h()Lsz0/p0;

    move-result-object v3

    move v6, v4

    invoke-virtual {v0}, Lit1/c$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move v7, v6

    invoke-virtual {v0}, Lit1/c$a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v7, v7, 0x70

    if-ne v7, v5, :cond_6

    move/from16 v9, v20

    goto :goto_5

    :cond_6
    move/from16 v9, v19

    :goto_5
    or-int/2addr v8, v9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_7

    if-ne v9, v10, :cond_8

    :cond_7
    new-instance v9, Ljt1/a;

    const/4 v8, 0x0

    invoke-direct {v9, v0, v1, v8}, Ljt1/a;-><init>(Lit1/c$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lc93/a;

    invoke-virtual {v0}, Lit1/c$a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-ne v7, v5, :cond_9

    move/from16 v12, v20

    goto :goto_6

    :cond_9
    move/from16 v12, v19

    :goto_6
    or-int/2addr v11, v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_a

    if-ne v12, v10, :cond_b

    :cond_a
    new-instance v12, Ljt1/a;

    const/4 v11, 0x1

    invoke-direct {v12, v0, v1, v11}, Ljt1/a;-><init>(Lit1/c$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v12

    check-cast v11, Lc93/a;

    const/high16 v12, 0x30000

    sget v13, Lsz0/p0;->d:I

    or-int/2addr v12, v13

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v13, 0x3

    or-int/2addr v12, v14

    shl-int/lit8 v14, v13, 0x9

    or-int/2addr v12, v14

    shl-int/lit8 v13, v13, 0x15

    or-int v16, v12, v13

    const/16 v17, 0x0

    const/16 v18, 0xe44

    move v12, v5

    const/4 v5, 0x0

    move-object v13, v10

    move-object v10, v8

    const/4 v8, 0x1

    move v14, v7

    move-object v7, v9

    const/4 v9, 0x0

    move/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v1, v21

    move/from16 v2, v23

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0}, Lit1/c$a;->b()Lit1/a;

    move-result-object v3

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v2, v1, :cond_c

    move/from16 v19, v20

    :cond_c
    or-int v1, v4, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_e

    move-object/from16 v13, v22

    if-ne v2, v13, :cond_d

    goto :goto_7

    :cond_d
    move-object/from16 v4, p1

    goto :goto_8

    :cond_e
    :goto_7
    new-instance v2, Ljt1/c$a;

    const/4 v1, 0x0

    move-object/from16 v4, p1

    invoke-direct {v2, v0, v4, v1}, Ljt1/c$a;-><init>(Lit1/c$a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v2, Lc93/m;

    invoke-static {v15, v2, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    move-object v4, v1

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_10

    new-instance v2, Lig0/d;

    const/16 v3, 0x12

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final y(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lit1/c$a;->c()Lit1/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lit1/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lit1/c$a;->e()Lit1/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

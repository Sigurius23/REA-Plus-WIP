.class public abstract Lxi0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lti0/a;",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "action",
        "b",
        "(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "arch-v2_release"
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
.method public static synthetic a(Lti0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxi0/b;->c(Lti0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x64aafb4e

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v7, 0x0

    if-eq v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    move v0, v7

    :goto_4
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lti0/a;->b()Lti0/m;

    move-result-object v0

    instance-of v1, v0, Lti0/e;

    if-eqz v1, :cond_6

    const v1, 0x1a26b292

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object v1, v0

    check-cast v1, Lti0/e;

    and-int/lit8 v5, p2, 0x70

    const/4 v6, 0x4

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lzi0/a;->r(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move-object v2, p1

    instance-of p1, v0, Lti0/f;

    if-eqz p1, :cond_7

    const p1, 0x1a26bf5b

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    check-cast v0, Lti0/f;

    and-int/lit8 p1, p2, 0x70

    invoke-static {v0, v2, v4, p1}, Laj0/a;->b(Lti0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    instance-of p1, v0, Lti0/j;

    if-eqz p1, :cond_8

    const p1, 0x1a26cd38

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    check-cast v0, Lti0/j;

    and-int/lit8 p1, p2, 0x70

    invoke-static {v0, v2, v4, p1}, Lbj0/b;->h(Lti0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    instance-of p1, v0, Lti0/d;

    if-eqz p1, :cond_9

    const p1, 0x1a26d9f2

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    check-cast v0, Lti0/d;

    and-int/lit8 p1, p2, 0x70

    invoke-static {v0, v2, v4, p1}, Lyi0/d;->m(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    const p0, 0x1a26abf4

    invoke-static {p0, v4, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_a
    move-object v2, p1

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance p2, Lv90/e;

    const/16 v0, 0x12

    invoke-direct {p2, p0, v2, p3, v0}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lti0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxi0/b;->b(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

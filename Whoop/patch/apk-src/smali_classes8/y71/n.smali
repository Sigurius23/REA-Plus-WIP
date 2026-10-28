.class public abstract Ly71/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly71/o;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly71/n;->e(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ly71/n;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ly71/o;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p3

    check-cast v6, Lp1/q;

    const p3, 0x77c44545

    invoke-virtual {v6, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p5, 0x1

    if-eqz p3, :cond_0

    or-int/lit8 v0, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_2
    move v0, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_3

    :cond_6
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_7
    :goto_4
    and-int/lit16 v3, v0, 0x93

    const/16 v4, 0x92

    const/4 v8, 0x0

    if-eq v3, v4, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    move v3, v8

    :goto_5
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v6, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    if-eqz p3, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    move-object v4, p0

    if-eqz v2, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p0, p2, :cond_a

    new-instance p0, Lxo1/a;

    const/16 p2, 0x15

    invoke-direct {p0, p2}, Lxo1/a;-><init>(I)V

    invoke-virtual {v6, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object p2, p0

    check-cast p2, Lc93/a;

    :cond_b
    move-object v5, p2

    invoke-virtual {p1}, Ly71/o;->c()Ly71/l;

    move-result-object p0

    instance-of p2, p0, Ly71/l$a;

    if-eqz p2, :cond_c

    const p2, -0x6837dd86

    invoke-virtual {v6, p2}, Lp1/q;->e0(I)V

    move-object v3, p0

    check-cast v3, Ly71/l$a;

    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p0, p0, 0xe

    shl-int/lit8 p2, v0, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/2addr p0, p2

    shl-int/lit8 p2, v0, 0x3

    and-int/lit16 p2, p2, 0x1c00

    or-int v7, p0, p2

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Ly71/f;->d(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    instance-of p2, p0, Ly71/l$c;

    if-eqz p2, :cond_d

    const p2, -0x6837ce9e

    invoke-virtual {v6, p2}, Lp1/q;->e0(I)V

    move-object v3, p0

    check-cast v3, Ly71/l$c;

    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p0, p0, 0xe

    shl-int/lit8 p2, v0, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/2addr p0, p2

    shl-int/lit8 p2, v0, 0x3

    and-int/lit16 p2, p2, 0x1c00

    or-int v7, p0, p2

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Ly71/i;->h(Ly71/o;Ly71/l$c;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_d
    instance-of p2, p0, Ly71/l$b;

    if-eqz p2, :cond_e

    const p2, -0x6837bedf

    invoke-virtual {v6, p2}, Lp1/q;->e0(I)V

    move-object v3, p0

    check-cast v3, Ly71/l$b;

    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p0, p0, 0xe

    shl-int/lit8 p2, v0, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/2addr p0, p2

    shl-int/lit8 p2, v0, 0x3

    and-int/lit16 p2, p2, 0x1c00

    or-int v7, p0, p2

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Ly71/i;->f(Ly71/o;Ly71/l$b;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_6
    move-object p2, v5

    goto :goto_7

    :cond_e
    const p0, -0x6837e862

    invoke-static {p0, v6, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_f
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v4, p0

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_10

    new-instance v0, Lwr0/f;

    const/16 v3, 0x14

    move-object v5, p1

    move-object v6, p2

    move v1, p4

    move v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

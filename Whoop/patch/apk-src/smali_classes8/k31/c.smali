.class public abstract Lk31/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lk31/d;",
        "replayViewState",
        "Ll83/a0;",
        "b",
        "(Lk31/d;Landroidx/compose/runtime/Composer;I)V",
        "",
        "expand",
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
.method public static synthetic a(Lk31/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lk31/c;->e(Lk31/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lk31/d;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "replayViewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x7b2d0afd

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/2addr p1, v3

    invoke-virtual {v5, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lk31/d;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lk31/d;->h()Z

    move-result p1

    if-nez p1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_4

    invoke-static {v2, v5}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object p1

    :cond_4
    check-cast p1, Lp1/c1;

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    if-ne v2, v0, :cond_6

    :cond_5
    new-instance v2, Lk31/c$a;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, v0}, Lk31/c$a;-><init>(Lk31/d;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lc93/m;

    invoke-static {v5, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lk31/d;->f()Lgz0/m0;

    move-result-object v1

    invoke-virtual {p0}, Lk31/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {p1}, Lk31/c;->c(Lp1/c1;)Z

    move-result v3

    invoke-virtual {p0}, Lk31/d;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lk31/b;->e(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Ld71/c;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, p2, v1}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final c(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final d(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(Lk31/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lk31/c;->b(Lk31/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic f(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lk31/c;->d(Lp1/c1;Z)V

    return-void
.end method

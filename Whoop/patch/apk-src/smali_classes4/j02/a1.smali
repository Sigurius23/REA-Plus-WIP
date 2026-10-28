.class public abstract Lj02/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "tagPrefix",
        "Lj02/l0;",
        "navigationReporter",
        "Leb/u0;",
        "a",
        "(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;",
        "feature_release"
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
.method public static final a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;
    .locals 7

    const-string v0, "tagPrefix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p4, p4, 0x2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p4, :cond_3

    move-object p1, p2

    check-cast p1, Lp1/q;

    const p4, -0x3636f461

    invoke-virtual {p1, p4}, Lp1/q;->f0(I)V

    sget-object p4, Lpf3/a;->b:Lnf3/a;

    if-eqz p4, :cond_2

    iget-object p4, p4, Lnf3/a;->a:Lwf3/a;

    iget-object p4, p4, Lwf3/a;->d:Lxf3/c;

    const v3, -0x384098

    invoke-virtual {p1, v3}, Lp1/q;->f0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_0

    if-ne v4, v0, :cond_1

    :cond_0
    const-class v3, Lj02/l0;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p4, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    move-object p1, v4

    check-cast p1, Lj02/l0;

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_0
    new-array p4, v2, [Leb/i1;

    invoke-static {p4, p2}, Lge3/g;->S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;

    move-result-object p4

    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/4 v4, 0x1

    const/16 v5, 0x20

    if-le v3, v5, :cond_4

    move-object v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-ne v3, v5, :cond_6

    :cond_5
    move v3, v4

    goto :goto_1

    :cond_6
    move v3, v2

    :goto_1
    check-cast p2, Lp1/q;

    invoke-virtual {p2, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    and-int/lit8 v5, p3, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x4

    if-le v5, v6, :cond_7

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v6, :cond_9

    :cond_8
    move v2, v4

    :cond_9
    or-int p3, v3, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_a

    if-ne v2, v0, :cond_b

    :cond_a
    new-instance v2, Lj02/a1$a;

    invoke-direct {v2, p1, p4, p0, v1}, Lj02/a1$a;-><init>(Lj02/l0;Leb/u0;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lc93/m;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    invoke-static {p2, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object p4
.end method

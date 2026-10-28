.class public abstract Lim1/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lim1/w0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0008\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lbm/t;",
        "pagerState",
        "Ln0/u;",
        "listState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onBottomOfPageHit",
        "source",
        "b",
        "(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "",
        "f",
        "(Ln0/u;)Z",
        "Lfm1/g;",
        "pillarType",
        "e",
        "(Lfm1/g;)Ljava/lang/String;",
        "home_release"
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
.method public static synthetic a(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lim1/w0;->c(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm/t;",
            "Ln0/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "pagerState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBottomOfPageHit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, 0xb598539

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, p5, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    const/16 v3, 0x100

    if-nez v1, :cond_5

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p5, 0xc00

    const/16 v4, 0x800

    if-nez v1, :cond_7

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v1, v4

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v0, 0x493

    const/16 v5, 0x492

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v1, v5, :cond_8

    move v1, v7

    goto :goto_5

    :cond_8
    move v1, v6

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {p4, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v5, v0, 0x70

    if-ne v5, v2, :cond_9

    move v2, v7

    goto :goto_6

    :cond_9
    move v2, v6

    :goto_6
    and-int/lit16 v5, v0, 0x380

    if-ne v5, v3, :cond_a

    move v3, v7

    goto :goto_7

    :cond_a
    move v3, v6

    :goto_7
    or-int/2addr v2, v3

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v4, :cond_b

    move v6, v7

    :cond_b
    or-int v0, v2, v6

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_c

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_d

    :cond_c
    new-instance v2, Lim1/w0$a;

    const/4 v0, 0x0

    invoke-direct {v2, p1, p2, p3, v0}, Lim1/w0$a;-><init>(Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lc93/m;

    invoke-static {p4, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_f

    new-instance v0, Lhy0/d1;

    const/16 v2, 0x11

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v5, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Lhy0/d1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final c(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lim1/w0;->b(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Ln0/u;)Z
    .locals 0

    invoke-static {p0}, Lim1/w0;->f(Ln0/u;)Z

    move-result p0

    return p0
.end method

.method public static final e(Lfm1/g;)Ljava/lang/String;
    .locals 1

    const-string v0, "pillarType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lim1/w0$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "Strain Pillar"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "Recovery Pillar"

    return-object p0

    :cond_2
    const-string p0, "Sleep Pillar"

    return-object p0

    :cond_3
    const-string p0, "Overview Pillar"

    return-object p0
.end method

.method private static final f(Ln0/u;)Z
    .locals 2

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    if-eqz v0, :cond_0

    check-cast v0, Ln0/o;

    iget v0, v0, Ln0/o;->a:I

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object p0

    iget p0, p0, Ln0/n;->n:I

    const/4 v1, 0x1

    sub-int/2addr p0, v1

    if-ne v0, p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

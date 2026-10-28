.class public abstract Lgp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lep2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lep2/a;",
        "Ll83/a0;",
        "onEvent",
        "c",
        "(Lep2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "universal-checkout_release"
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
.method public static synthetic a(Lep2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgp2/d;->e(Lep2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lep2/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const/4 v0, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lgp2/d;->d(Lep2/c$c;Lep2/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lep2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, 0x516f97c8

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lep2/c;->d()Lep2/c$c;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p2, Ll;

    const/16 v0, 0x18

    invoke-direct {p2, v0, p0, p1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x580b36c7

    invoke-static {v0, v6, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lf01/b;

    const/16 v1, 0xb

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final d(Lep2/c$c;Lep2/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    and-int/lit8 p0, p5, 0x6

    if-nez p0, :cond_1

    move-object p0, p4

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p3}, Lp1/q;->h(Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    :goto_0
    or-int/2addr p5, p0

    :cond_1
    and-int/lit8 p0, p5, 0x13

    const/16 p1, 0x12

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eq p0, p1, :cond_2

    move p0, p3

    goto :goto_1

    :cond_2
    move p0, p2

    :goto_1
    and-int/lit8 p1, p5, 0x1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p1, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_3

    const p0, -0x3ef80ee5

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, p2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lep2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lgp2/d;->c(Lep2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lw60/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lu60/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lu60/a;",
        "Ll83/a0;",
        "onEvent",
        "d",
        "(Lu60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "achievements_release"
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
.method public static synthetic a(Lu60/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw60/c;->e(Lu60/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lu60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw60/c;->g(Lu60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lu60/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const/4 v0, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lw60/c;->f(Lu60/c$a;Lu60/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lu60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu60/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x2c85cef6

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
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/2addr p2, v3

    invoke-virtual {v6, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz v0, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_6

    new-instance p1, Lw01/e;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lw01/e;-><init>(I)V

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_7
    invoke-virtual {p0}, Lu60/c;->f()Lu60/c$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p2, Lvv2/d;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0, p1}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x5d921d15

    invoke-static {v0, v6, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    move-object v3, p1

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lt80/b;

    const/16 v5, 0x17

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Lu60/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lu60/c$a;Lu60/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    const p0, 0x11a6adf7

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, p2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lu60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lw60/c;->d(Lu60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

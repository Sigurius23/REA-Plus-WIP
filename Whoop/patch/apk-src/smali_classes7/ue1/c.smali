.class public abstract Lue1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lf0/r1;",
        "scrollState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "fireEventWithScrollDepth",
        "c",
        "(Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "education_release"
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
.method public static synthetic a(Lf0/r1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lue1/c;->e(Lf0/r1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lue1/c;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/r1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "scrollState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fireEventWithScrollDepth"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x58be4c14

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_5

    invoke-static {v5, p2}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v1

    :cond_5
    check-cast v1, Lp1/c1;

    :try_start_0
    iget-object v6, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v6}, Lp1/h1;->x()I

    move-result v6

    int-to-float v6, v6

    iget-object v7, p0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v7}, Lp1/h1;->x()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    const/16 v7, 0x64

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v6

    invoke-static {v6}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v6

    :goto_4
    instance-of v7, v6, Ll83/m;

    if-eqz v7, :cond_6

    const/4 v6, 0x0

    :cond_6
    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_5

    :cond_7
    move v6, v5

    :goto_5
    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-le v6, v7, :cond_8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v6}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_8
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_9

    goto :goto_6

    :cond_9
    move v4, v5

    :goto_6
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_a

    if-ne v0, v3, :cond_b

    :cond_a
    new-instance v0, Lp40/b;

    const/16 v2, 0x9

    invoke-direct {v0, p1, v1, v2}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v0, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_7

    :cond_c
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lso2/f;

    const/16 v1, 0x15

    invoke-direct {v0, p0, p1, p3, v1}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lue1/c$a;

    invoke-direct {p2, p0, p1}, Lue1/c$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    return-object p2
.end method

.method private static final e(Lf0/r1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lue1/c;->c(Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

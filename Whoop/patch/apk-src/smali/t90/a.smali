.class public abstract Lt90/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a]\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lg80/f;",
        "viewState",
        "Lc03/c;",
        "whoopStatusViewState",
        "Lkotlin/Function1;",
        "Lj80/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll80/o;",
        "onNavigationEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "c",
        "(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lt90/a;->e(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt90/a;->d(Lh80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg80/f;",
            "Lc03/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v0, p6

    const-string v5, "viewState"

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "whoopStatusViewState"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v5, -0x115f3a6a

    invoke-virtual {v6, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_4

    and-int/lit8 v7, v0, 0x40

    if-nez v7, :cond_2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_2
    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v5, v7

    :cond_4
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_6
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_8

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v5, v7

    :cond_8
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v5, v5, 0x6000

    :cond_9
    move-object/from16 v8, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v0, 0x6000

    if-nez v8, :cond_9

    move-object/from16 v8, p4

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_6

    :cond_b
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v5, v9

    :goto_7
    and-int/lit16 v9, v5, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x0

    if-eq v9, v10, :cond_c

    const/4 v9, 0x1

    goto :goto_8

    :cond_c
    move v9, v11

    :goto_8
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v6, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_10

    if-eqz v7, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_d

    new-instance v7, Lqc1/a;

    const/16 v8, 0x11

    invoke-direct {v7, v8}, Lqc1/a;-><init>(I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v4, v7

    goto :goto_9

    :cond_e
    move-object v4, v8

    :goto_9
    invoke-virtual {p0}, Lg80/f;->a()Lg80/d;

    move-result-object v7

    invoke-virtual {v7}, Lg80/d;->e()Z

    move-result v7

    if-eqz v7, :cond_f

    const v5, 0x6736b649

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-static {v6, v11}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v11}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v7, 0x67381727

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    shr-int/lit8 v7, v5, 0x9

    and-int/lit8 v7, v7, 0xe

    sget v8, Lc03/c;->d:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v7, v8

    and-int/lit8 v8, v5, 0x70

    or-int/2addr v7, v8

    shr-int/lit8 v8, v5, 0x6

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v7, v8

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v7, v5

    const/4 v8, 0x0

    move-object v3, p1

    move-object v5, p2

    move-object v2, p3

    invoke-static/range {v2 .. v8}, Lt90/d;->g(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    :goto_a
    move-object v5, v4

    goto :goto_b

    :cond_10
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v5, v8

    :goto_b
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_11

    new-instance v0, Lny0/a1;

    const/4 v8, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lny0/a1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d(Lh80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lt90/a;->c(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

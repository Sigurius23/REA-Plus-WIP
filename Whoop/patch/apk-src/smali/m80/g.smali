.class public abstract Lm80/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc03/c;",
        "whoopStatusViewState",
        "Lkotlin/Function1;",
        "Ll80/o;",
        "Ll83/a0;",
        "onNavigationEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lm80/g;->e(Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lm80/g;->g(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lc03/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm80/g;->f(Lkotlin/jvm/functions/Function1;Lc03/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc03/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "whoopStatusViewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x4e1669ff

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_5

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_7

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move v6, v8

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v10, :cond_8

    move v6, v13

    goto :goto_5

    :cond_8
    move v6, v12

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v9, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    invoke-virtual {v2}, Lc03/c;->b()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v2}, Lc03/c;->a()Lc41/m0;

    move-result-object v1

    if-eqz v1, :cond_12

    const v1, -0x22546a60

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v6, v9, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lc03/c;->a()Lc41/m0;

    move-result-object v1

    const-string v6, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.AlertTileState"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lc41/c5;

    const/4 v10, 0x5

    invoke-direct {v6, v10}, Lc41/c5;-><init>(I)V

    and-int/lit16 v10, v5, 0x380

    if-ne v10, v8, :cond_d

    move v8, v13

    goto :goto_8

    :cond_d
    move v8, v12

    :goto_8
    and-int/lit8 v10, v5, 0x70

    if-eq v10, v7, :cond_f

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_e

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_9

    :cond_e
    move v5, v12

    goto :goto_a

    :cond_f
    :goto_9
    move v5, v13

    :goto_a
    or-int/2addr v5, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_10

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_11

    :cond_10
    new-instance v7, Lbp0/n;

    const/16 v5, 0x1b

    invoke-direct {v7, v3, v2, v5}, Lbp0/n;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v10, Lc41/m0;->h:I

    const/4 v11, 0x2

    move-object v7, v6

    const/4 v6, 0x0

    move-object v5, v1

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    const v1, -0x2249239f

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_b
    move-object v1, v0

    goto :goto_c

    :cond_13
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lim1/l;

    const/4 v6, 0x1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lim1/l;-><init>(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final e(Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x6ce4a6b4

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x2

    int-to-float p0, p0

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float/2addr p0, p2

    const/4 p2, 0x1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0, p2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lc03/c;Ljava/lang/Object;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ll80/o$a;

    new-instance v0, Lcom/whoop/navigation/e;

    sget-object v1, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    new-instance v2, Lcom/whoop/navigation/InAppBrowserScreenModel;

    invoke-virtual {p1}, Lc03/c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/navigation/InAppBrowserScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lm80/g;->d(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

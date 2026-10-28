.class public abstract Ly01/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly01/f;",
        "progressBreakdownState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ly01/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly01/e;->c(Landroidx/compose/ui/Modifier;Ly01/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    const-string v0, "progressBreakdownState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x2eebfd70

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_6

    move v5, v8

    goto :goto_4

    :cond_6
    move v5, v7

    :goto_4
    and-int/2addr v4, v8

    invoke-virtual {v0, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    move-object p0, v4

    :cond_7
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static {v1, v5, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v1, v4, v5, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v2, -0x3bced2e6

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    const v2, 0xca3d8b5

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_8

    new-instance v4, Le4/r;

    invoke-direct {v4, v2}, Le4/r;-><init>(Ly3/c;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v10, v4

    check-cast v10, Le4/r;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_9

    new-instance v2, Le4/k;

    invoke-direct {v2}, Le4/k;-><init>()V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Le4/k;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_a

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v13, v4

    check-cast v13, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_b

    new-instance v4, Le4/m;

    invoke-direct {v4, v2}, Le4/m;-><init>(Le4/k;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v4

    check-cast v11, Le4/m;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_c

    sget-object v4, Lp1/v0;->y:Lp1/v0;

    new-instance v6, Lp1/k1;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v6, v8, v4}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v6

    :cond_c
    move-object v9, v4

    check-cast v9, Lp1/c1;

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v12, 0x101

    invoke-virtual {v0, v12}, Lp1/q;->e(I)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_d

    if-ne v6, v5, :cond_e

    :cond_d
    new-instance v8, Ly01/e$a;

    invoke-direct/range {v8 .. v13}, Ly01/e$a;-><init>(Lp1/c1;Le4/r;Le4/m;ILp1/c1;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v8

    :cond_e
    check-cast v6, Ly2/r0;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_f

    new-instance v4, Ly01/e$b;

    invoke-direct {v4, v13, v11}, Ly01/e$b;-><init>(Lp1/c1;Le4/m;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lc93/a;

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_10

    if-ne v11, v5, :cond_11

    :cond_10
    new-instance v11, Ly01/e$c;

    invoke-direct {v11, v10}, Ly01/e$c;-><init>(Le4/r;)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v7, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v5, Ly01/e$d;

    invoke-direct {v5, v9, v2, v4, p1}, Ly01/e$d;-><init>(Lp1/c1;Le4/k;Lc93/a;Ly01/f;)V

    const v2, 0x478ef317

    invoke-static {v2, v0, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v4, 0x30

    invoke-static {v1, v2, v6, v0, v4}, Ly2/q1;->a(Landroidx/compose/ui/Modifier;Lx1/b;Ly2/r0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    :goto_5
    move-object v1, p0

    goto :goto_6

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance v0, Lwq1/b;

    const/16 v5, 0xe

    move-object v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ly01/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ly01/e;->b(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

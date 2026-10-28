.class public abstract Lw61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ly61/b;",
        "barState",
        "",
        "description",
        "Ll83/a0;",
        "c",
        "(Ly61/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw61/a;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly61/b;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw61/a;->e(Ly61/b;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly61/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "barState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "description"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x3447f9f5

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_5

    move v6, v10

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v3, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v0}, Ly61/b;->a()Ly81/e;

    move-result-object v6

    invoke-interface {v6, v3, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual {v0}, Ly61/b;->c()F

    move-result v14

    invoke-virtual {v0}, Ly61/b;->b()F

    move-result v16

    new-instance v17, Lp91/a;

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-virtual {v0}, Ly61/b;->c()F

    move-result v8

    add-float v18, v8, v6

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    move-object/from16 v18, v17

    const/high16 v17, 0x3f800000    # 1.0f

    invoke-static/range {v13 .. v18}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v8, v4, 0x70

    if-ne v8, v7, :cond_6

    move v7, v10

    goto :goto_5

    :cond_6
    move v7, v9

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_7

    if-ne v8, v14, :cond_8

    :cond_7
    new-instance v8, Le61/g;

    const/16 v7, 0x16

    invoke-direct {v8, v1, v7}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v10, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->G:Lb2/m;

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v3, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v9, v3, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v4, 0xe

    invoke-static {v0, v3, v4}, Lw61/d;->c(Ly61/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Ly61/b;->c()F

    move-result v4

    new-instance v17, Lp91/a;

    const/16 v22, 0xf

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v17

    const/high16 v7, -0x40800000    # -1.0f

    invoke-static {v13, v4, v7, v6}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3, v11, v12}, Lp1/q;->f(J)Z

    move-result v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    if-ne v6, v14, :cond_d

    :cond_c
    new-instance v6, Lw61/a$a;

    invoke-direct {v6, v11, v12}, Lw61/a$a;-><init>(J)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {v4, v5}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v3, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, La11/j;

    const/16 v5, 0x12

    invoke-direct {v4, v0, v1, v2, v5}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ly61/b;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lw61/a;->c(Ly61/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lz61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj71/b$j;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lj71/b$j;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lj71/b$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz61/b;->c(Landroidx/compose/ui/Modifier;Lj71/b$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lj71/b$j;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x60a8621

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, v2, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/2addr v4, v8

    invoke-virtual {v3, v4, v6}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->a()Ly81/e;

    move-result-object v4

    invoke-interface {v4, v3, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->b()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v10

    goto :goto_5

    :cond_6
    move-wide v10, v6

    :goto_5
    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->f()F

    move-result v13

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->d()F

    move-result v4

    const/high16 v8, -0x40800000    # -1.0f

    mul-float v14, v4, v8

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->e()F

    move-result v4

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v12

    invoke-virtual {v12}, Lz61/c;->f()F

    move-result v12

    sub-float v15, v4, v12

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->c()F

    move-result v16

    new-instance v17, Lp91/a;

    const/16 v22, 0xc

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static/range {v12 .. v17}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v13, v13

    int-to-float v5, v5

    mul-float/2addr v13, v5

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v4, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v10, v11, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v3, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->b()Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_7

    const v4, 0x2bb7a36

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    const v4, 0x2bb7a37

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->f()F

    move-result v19

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->d()F

    move-result v4

    mul-float v20, v4, v8

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->b()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v8

    invoke-virtual {v8}, Lz61/c;->f()F

    move-result v8

    sub-float v21, v4, v8

    invoke-virtual {v1}, Lj71/b$j;->e()Lz61/c;

    move-result-object v4

    invoke-virtual {v4}, Lz61/c;->c()F

    move-result v22

    new-instance v23, Lp91/a;

    const/16 v28, 0xc

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v23 .. v29}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v12

    invoke-static/range {v18 .. v23}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v4, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v6, v7, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v3, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lyf1/e;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v1, v2, v5}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lj71/b$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lz61/b;->b(Landroidx/compose/ui/Modifier;Lj71/b$j;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

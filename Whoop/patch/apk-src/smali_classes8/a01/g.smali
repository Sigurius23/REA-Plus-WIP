.class public abstract La01/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aI\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "La01/h;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "sanitizedTitle",
        "Ll0/k1;",
        "contentPadding",
        "m",
        "(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, La01/g;->k(La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, La01/g;->l(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, La01/g;->j(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, La01/g;->n(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, La01/g;->i(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La01/g;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "La01/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v8, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, 0x529c0b1b

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v7

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v4, v10

    :goto_4
    and-int/lit16 v10, v4, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v10, v11, :cond_8

    move v10, v13

    goto :goto_5

    :cond_8
    move v10, v12

    :goto_5
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v5, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_16

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v3

    :goto_6
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    new-instance v6, Lp;

    const/4 v9, 0x1

    invoke-direct {v6, v9}, Lp;-><init>(I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v6, v9

    :goto_7
    invoke-virtual {v1}, La01/h;->l()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_c

    const-string v9, ""

    :cond_c
    const-string v10, "BiomarkerCard_"

    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v10}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v1}, La01/h;->h()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v10

    if-eqz v10, :cond_10

    const v10, 0x1bc5df0b

    invoke-virtual {v5, v10}, Lp1/q;->e0(I)V

    and-int/lit16 v10, v4, 0x380

    if-ne v10, v7, :cond_d

    goto :goto_8

    :cond_d
    move v13, v12

    :goto_8
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_e

    if-ne v10, v3, :cond_f

    :cond_e
    new-instance v10, La01/c;

    const/4 v3, 0x0

    invoke-direct {v10, v6, v1, v3}, La01/c;-><init>(Lkotlin/jvm/functions/Function1;La01/h;I)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v18, v10

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v1}, La01/h;->c()Lcom/whoop/navigation/e;

    move-result-object v10

    if-eqz v10, :cond_14

    const v10, 0x1bc5ec2b

    invoke-virtual {v5, v10}, Lp1/q;->e0(I)V

    and-int/lit16 v10, v4, 0x380

    if-ne v10, v7, :cond_11

    goto :goto_9

    :cond_11
    move v13, v12

    :goto_9
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_12

    if-ne v10, v3, :cond_13

    :cond_12
    new-instance v10, La01/c;

    const/4 v3, 0x1

    invoke-direct {v10, v6, v1, v3}, La01/c;-><init>(Lkotlin/jvm/functions/Function1;La01/h;I)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v18, v10

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const v3, 0x1bc5f429

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v1}, La01/h;->o()Z

    move-result v3

    const/4 v7, 0x3

    if-eqz v3, :cond_15

    const v3, 0x5cf9ab5d

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v4, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v10

    int-to-float v4, v7

    int-to-float v2, v2

    mul-float/2addr v4, v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    new-instance v2, La01/d;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v9, v6, v4}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, 0x51ba1786

    invoke-static {v4, v5, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const/high16 v19, 0xc00000

    const/16 v20, 0x72

    move v2, v12

    move-wide v11, v10

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v3

    move-object/from16 v18, v5

    invoke-static/range {v9 .. v20}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    move-object v9, v0

    move-object v3, v6

    goto :goto_b

    :cond_15
    move v2, v12

    const v3, 0x5d0092d9

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v4, 0x70

    shl-int/2addr v4, v7

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    const/16 v7, 0x10

    const/4 v4, 0x0

    move-object v10, v6

    move v6, v3

    move-object v3, v10

    move v10, v2

    move-object v2, v9

    move-object v9, v0

    move-object v0, v14

    invoke-static/range {v0 .. v7}, La01/g;->m(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    :goto_b
    move-object v1, v9

    goto :goto_c

    :cond_16
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v9

    :goto_c
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, La01/e;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move v4, v8

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, La01/h;->h()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, La01/h;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    const-wide/high16 p3, 0x3ff8000000000000L    # 1.5

    double-to-float p3, p3

    const/16 p4, 0x8

    int-to-float p4, p4

    mul-float/2addr p3, p4

    new-instance v5, Ll0/l1;

    invoke-direct {v5, p3, p3, p3, p3}, Ll0/l1;-><init>(FFFF)V

    const/16 v7, 0x6000

    const/4 v8, 0x1

    const/4 v1, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, La01/g;->m(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, La01/g;->g(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "La01/h;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Ll0/k1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x24ea1a8

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_4
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p7, 0x4

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v7, p2

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_5

    :cond_7
    move-object/from16 v7, p2

    :goto_5
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_6

    :cond_8
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v4, v9

    goto :goto_7

    :cond_9
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_b

    or-int/lit16 v4, v4, 0x6000

    :cond_a
    move-object/from16 v10, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_a

    move-object/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x4000

    goto :goto_8

    :cond_c
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v4, v11

    :goto_9
    and-int/lit16 v11, v4, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    if-eq v11, v13, :cond_d

    const/4 v11, 0x1

    goto :goto_a

    :cond_d
    move v11, v14

    :goto_a
    and-int/lit8 v13, v4, 0x1

    invoke-virtual {v12, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v11, v6, 0x1

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v11, :cond_10

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_f

    and-int/lit16 v4, v4, -0x381

    :cond_f
    move-object v0, v3

    move/from16 v33, v4

    move-object v3, v7

    :goto_b
    move-object v4, v10

    goto :goto_e

    :cond_10
    :goto_c
    if-eqz v0, :cond_11

    move-object v3, v13

    :cond_11
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_13

    invoke-virtual {v5}, La01/h;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_12

    const-string v0, ""

    :cond_12
    and-int/lit16 v4, v4, -0x381

    goto :goto_d

    :cond_13
    move-object v0, v7

    :goto_d
    if-eqz v9, :cond_14

    int-to-float v7, v14

    new-instance v9, Ll0/l1;

    invoke-direct {v9, v7, v7, v7, v7}, Ll0/l1;-><init>(FFFF)V

    move-object/from16 v33, v3

    move-object v3, v0

    move-object/from16 v0, v33

    move/from16 v33, v4

    move-object v4, v9

    goto :goto_e

    :cond_14
    move-object/from16 v33, v3

    move-object v3, v0

    move-object/from16 v0, v33

    move/from16 v33, v4

    goto :goto_b

    :goto_e
    invoke-virtual {v12}, Lp1/q;->r()V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v9, v10, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v12, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v35, v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_10

    :cond_16
    move-object/from16 v35, v0

    :goto_10
    invoke-static {v14, v12, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v7, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    move-object/from16 v36, v4

    const/4 v4, 0x0

    invoke-static {v7, v14, v12, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move-object/from16 v37, v5

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_18

    move-object/from16 v6, v37

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_18
    move-object/from16 v6, v37

    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    :cond_19
    invoke-static {v4, v12, v4, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v12, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v4, v7

    invoke-virtual/range {p1 .. p1}, La01/h;->l()Ljava/lang/String;

    move-result-object v7

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v5, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v5, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v20, v7

    float-to-double v7, v14

    const-wide/16 v21, 0x0

    cmpl-double v7, v7, v21

    if-lez v7, :cond_1b

    :goto_12
    const/4 v7, 0x1

    goto :goto_13

    :cond_1b
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_12

    :goto_13
    invoke-static {v9, v7, v14}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v7, "BiomarkerCard_Title_"

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object v7, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object v9, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const-wide/16 v16, 0x0

    move-object/from16 v25, v9

    move-wide/from16 v48, v18

    move-object/from16 v19, v10

    move-wide/from16 v9, v48

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v28, v7

    move-object/from16 v7, v20

    move/from16 v30, v21

    const-wide/16 v20, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move/from16 v38, v23

    const/16 v23, 0x0

    move/from16 v39, v24

    const/16 v24, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move-object/from16 v42, v28

    const/16 v28, 0x0

    move/from16 v43, v30

    const/16 v30, 0x0

    move-object/from16 p4, v0

    move-object/from16 p0, v1

    move-object/from16 p2, v2

    move-object/from16 v44, v4

    move-object/from16 v1, v37

    move/from16 v0, v38

    move-object/from16 v2, v40

    move-object/from16 v4, v42

    move-object/from16 v37, v3

    move-object/from16 v3, v41

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual/range {p1 .. p1}, La01/h;->g()Lgz0/m0;

    move-result-object v7

    if-nez v7, :cond_1c

    const v7, 0x4008e64a

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_14
    const/4 v7, 0x1

    goto :goto_15

    :cond_1c
    const v8, 0x4008e64b

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v8, 0x4

    int-to-float v9, v8

    mul-float/2addr v9, v9

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    const/4 v8, 0x6

    invoke-static {v7, v12, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v5, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    const/4 v8, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v10, v9, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_1f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1e

    goto :goto_18

    :cond_1e
    :goto_17
    move-object/from16 v10, p4

    goto :goto_19

    :cond_1f
    :goto_18
    invoke-static {v11, v12, v11, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v12, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, p0

    move-object/from16 v11, p2

    invoke-static {v8, v11, v12, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_20

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_20
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v12, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_21

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    :cond_21
    invoke-static {v11, v12, v11, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v12, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x3

    const/4 v11, 0x0

    invoke-static {v2, v11, v0, v8}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v11, v7

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float v15, v11, v14

    const/16 v17, 0x0

    const/16 v18, 0xd

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v39, v19

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move/from16 v40, v15

    sget-object v14, Lb2/e;->L:Lb2/l;

    const/16 v15, 0x30

    move-object/from16 v0, v44

    invoke-static {v0, v14, v12, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_23

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_23
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v12, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_24

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_25

    :cond_24
    invoke-static {v7, v12, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, La01/h;->p()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    invoke-virtual {v5, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v5, v12, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->A()Lb91/a;

    move-result-object v27

    move-object/from16 v44, v0

    move-object/from16 v42, v1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    mul-float v19, v0, v39

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v19

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v15, "BiomarkerCard_Value_"

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v15, v37

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v31, 0x0

    const v32, 0x2fff8

    move/from16 v20, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object v0, v10

    move-wide/from16 v48, v13

    move-object v14, v9

    move-wide/from16 v9, v48

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    move-object/from16 v22, v21

    const-wide/16 v20, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    const/16 v47, 0x1

    const/16 v24, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move/from16 v45, v30

    const/16 v30, 0x0

    move-object/from16 p2, v37

    move-object/from16 v37, v0

    move-object/from16 v0, p2

    move-object/from16 v46, v43

    const/16 p2, 0x3

    move-object/from16 v43, v6

    move/from16 v6, v47

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual/range {p1 .. p1}, La01/h;->n()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_26

    const v7, -0x7095339b

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const/16 v38, 0x6

    goto :goto_1c

    :cond_26
    const v8, -0x7095339a

    const/4 v9, 0x6

    invoke-static {v12, v8, v5, v12, v9}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v10

    invoke-virtual {v5, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v2

    move/from16 v20, v45

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v13, "BiomarkerCard_Unit_"

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v31, 0x0

    const v32, 0x2fff8

    move/from16 v38, v9

    move-wide v9, v10

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, La01/h;->m()Lhy0/c2;

    move-result-object v8

    if-nez v8, :cond_27

    const v1, -0x6f14c341

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_27
    const v9, -0x6f14c340

    invoke-static {v12, v9, v2, v1, v12}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    sget v1, Lcom/whoop/navigation/e;->d:I

    invoke-static {v8, v12, v1}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, La01/h;->j()La01/n;

    move-result-object v1

    if-nez v1, :cond_28

    const v1, -0x264195b8

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_28
    const v8, -0x264195b7

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "BiomarkerCard_RangeMeter_"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v1, v8, v12, v7, v7}, La01/l;->e(La01/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual/range {p1 .. p1}, La01/h;->f()Lj71/c;

    move-result-object v8

    if-nez v8, :cond_29

    const v1, -0x263de340

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const/16 v34, 0x4

    goto :goto_1f

    :cond_29
    const v1, -0x263de33f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/16 v1, 0x16

    int-to-float v1, v1

    const/4 v7, 0x4

    int-to-float v9, v7

    mul-float/2addr v1, v9

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v10, 0xd

    int-to-float v10, v10

    mul-float/2addr v10, v9

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v9

    mul-float v9, v9, v39

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-static {v1, v9, v10, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "BiomarkerCard_Graph_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v9, v33, 0x9

    const/high16 v10, 0x380000

    and-int v15, v9, v10

    const/16 v16, 0x3c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v13, p3

    move/from16 v34, v7

    move-object/from16 v14, v29

    move-object v7, v1

    invoke-static/range {v7 .. v16}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, La01/h;->i()Lv21/c;

    move-result-object v1

    if-nez v1, :cond_2a

    const v1, 0x5ce8a7e9

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object v15, v0

    move-object/from16 v16, v2

    move-object v9, v3

    move-object v8, v4

    move-object v13, v5

    move v6, v7

    move-object v3, v12

    move-object/from16 v11, v37

    move-object/from16 v10, v42

    move-object/from16 v7, v43

    move-object/from16 v12, v44

    const/4 v14, 0x2

    goto :goto_20

    :cond_2a
    const v8, 0x5ce8a7ea

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v11, 0x2

    int-to-float v8, v11

    mul-float v8, v8, v39

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "BiomarkerCard_MiniCallout_"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    shr-int/lit8 v9, v33, 0x3

    and-int/lit16 v9, v9, 0x380

    move-object v10, v5

    const/4 v5, 0x0

    move-object v15, v0

    move-object/from16 v16, v2

    move v6, v7

    move-object v0, v8

    move-object v13, v10

    move v14, v11

    move-object/from16 v11, v37

    move-object/from16 v10, v42

    move-object/from16 v7, v43

    move-object/from16 v2, p3

    move-object v8, v4

    move v4, v9

    move-object v9, v3

    move-object v3, v12

    move-object/from16 v12, v44

    invoke-static/range {v0 .. v5}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual/range {p1 .. p1}, La01/h;->e()La01/a;

    move-result-object v0

    if-nez v0, :cond_2b

    const v0, 0x5cee75bb

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    move-object v12, v3

    move-object/from16 v37, v15

    const/4 v7, 0x1

    goto/16 :goto_23

    :cond_2b
    const v1, 0x5cee75bc

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v14

    mul-float v18, v1, v39

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "BiomarkerCard_Disclaimer_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, v46

    const/16 v2, 0x30

    invoke-static {v12, v14, v3, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_2c

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_2c
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_21
    invoke-static {v3, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_2d

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    :cond_2d
    invoke-static {v4, v3, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    invoke-static {v3, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, La01/a;->a()Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_2f

    const v0, -0x60b07086

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    move-object v12, v3

    move-object v0, v13

    const/4 v1, 0x6

    goto :goto_22

    :cond_2f
    const v1, -0x60b07085

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v19, v40

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v8, p2

    int-to-float v2, v8

    const/4 v8, 0x4

    int-to-float v4, v8

    mul-float/2addr v2, v4

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v3, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v13, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v10

    move-object v0, v13

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    const/4 v8, 0x0

    move-object v12, v3

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual/range {p1 .. p1}, La01/h;->e()La01/a;

    move-result-object v2

    invoke-virtual {v2}, La01/a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v0, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_23
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object/from16 v1, v35

    move-object/from16 v5, v36

    move-object/from16 v3, v37

    goto :goto_24

    :cond_30
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v7

    move-object v5, v10

    :goto_24
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_31

    new-instance v0, La01/f;

    const/4 v8, 0x0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method private static final n(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, La01/g;->m(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract La31/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a[\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "",
        "min",
        "max",
        "number",
        "",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "valueHasChanged",
        "Lkotlin/Function0;",
        "numberButtonPressed",
        "f",
        "(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, La31/f;->k(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La31/f;->g(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La31/f;->j(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La31/f;->i(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(La31/g;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, La31/f;->h(La31/g;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    const-string v0, "valueHasChanged"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "numberButtonPressed"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, 0x14ac9dab

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

    if-nez v3, :cond_2

    move/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v8, p8, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v7, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p1

    invoke-virtual {v13, v9}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v4, v10

    :goto_3
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, p8, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v14, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v14, v7, 0xc00

    if-nez v14, :cond_9

    move/from16 v14, p3

    invoke-virtual {v13, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x800

    goto :goto_6

    :cond_b
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v4, v15

    :goto_7
    and-int/lit16 v15, v7, 0x6000

    if-nez v15, :cond_d

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x4000

    goto :goto_8

    :cond_c
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v4, v15

    :cond_d
    const/high16 v15, 0x30000

    and-int/2addr v15, v7

    if-nez v15, :cond_f

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v4, v15

    :cond_f
    const v15, 0x12493

    and-int/2addr v15, v4

    const v14, 0x12492

    const/4 v2, 0x0

    if-eq v15, v14, :cond_10

    const/4 v14, 0x1

    goto :goto_a

    :cond_10
    move v14, v2

    :goto_a
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v13, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_20

    if-eqz v0, :cond_11

    move v3, v2

    :cond_11
    if-eqz v8, :cond_12

    const/16 v0, 0x9

    goto :goto_b

    :cond_12
    move v0, v9

    :goto_b
    if-eqz v10, :cond_13

    const/4 v8, 0x0

    goto :goto_c

    :cond_13
    move-object v8, v11

    :goto_c
    if-eqz v12, :cond_14

    const/4 v9, 0x1

    goto :goto_d

    :cond_14
    move/from16 v9, p3

    :goto_d
    new-instance v10, La31/a;

    invoke-direct {v10, v3, v0}, La31/a;-><init>(II)V

    invoke-virtual {v10, v8}, La31/a;->c(Ljava/lang/Integer;)La31/g;

    move-result-object v11

    sget-object v12, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    invoke-static {v12, v14, v13, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p0, v0

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v21, v3

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_15

    invoke-virtual {v13, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v13, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v13, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    :cond_16
    invoke-static {v14, v13, v14, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, La31/g;->b()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {v11}, La31/g;->e()Z

    move-result v0

    if-eqz v0, :cond_18

    if-eqz v9, :cond_18

    const/4 v0, 0x1

    goto :goto_f

    :cond_18
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {v11}, La31/g;->a()Z

    move-result v1

    if-nez v1, :cond_19

    if-eqz v9, :cond_19

    const/4 v1, 0x1

    goto :goto_10

    :cond_19
    const/4 v1, 0x0

    :goto_10
    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/a;->m()I

    move-result v12

    const/4 v14, 0x2

    int-to-float v14, v14

    const/4 v15, 0x4

    int-to-float v15, v15

    mul-float/2addr v14, v15

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    const v16, 0xe000

    and-int v4, v4, v16

    move/from16 p1, v0

    const/16 v0, 0x4000

    if-ne v4, v0, :cond_1a

    const/16 v16, 0x1

    goto :goto_11

    :cond_1a
    const/16 v16, 0x0

    :goto_11
    or-int v15, v15, v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move/from16 p2, v14

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v15, :cond_1b

    if-ne v0, v14, :cond_1c

    :cond_1b
    new-instance v0, La31/b;

    const/4 v15, 0x0

    invoke-direct {v0, v10, v11, v5, v15}, La31/b;-><init>(La31/a;La31/g;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v0, Lc93/a;

    move-object v15, v14

    const/16 v14, 0xc30

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v9

    const-string v9, "minus icon"

    move-object/from16 p3, v3

    move-object v3, v11

    move-object/from16 v7, v16

    const/16 v5, 0x4000

    move/from16 v11, p2

    move/from16 p2, v1

    move-object v1, v10

    move/from16 v10, p1

    move-object/from16 p1, v8

    move v8, v12

    move-object v12, v0

    move/from16 v0, v17

    invoke-static/range {v8 .. v15}, Lny0/a;->c(ILjava/lang/String;ZFLc93/a;Landroidx/compose/runtime/Composer;II)V

    move v8, v11

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v13, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v9, Lx81/b;->a:Lx81/b;

    const/4 v10, 0x6

    invoke-virtual {v9, v13, v10}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v9

    invoke-virtual {v9}, Ly81/a;->c()J

    move-result-wide v10

    new-instance v9, La31/c;

    const/4 v12, 0x0

    invoke-direct {v9, v3, v0, v6, v12}, La31/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v12, -0x28bf3fc0

    invoke-static {v12, v13, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/16 v18, 0x6000

    const/16 v19, 0xd

    move v14, v8

    const-wide/16 v8, 0x0

    move-object/from16 v17, v13

    const-wide/16 v12, 0x0

    move/from16 v22, v14

    const-wide/16 v14, 0x0

    move/from16 v5, v22

    invoke-static/range {v8 .. v19}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p3 .. p3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->a()I

    move-result v8

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    const/16 v9, 0x4000

    if-ne v4, v9, :cond_1d

    const/16 v20, 0x1

    goto :goto_12

    :cond_1d
    const/16 v20, 0x0

    :goto_12
    or-int v2, v2, v20

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1f

    if-ne v4, v7, :cond_1e

    goto :goto_13

    :cond_1e
    move-object/from16 v7, p4

    goto :goto_14

    :cond_1f
    :goto_13
    new-instance v4, La31/b;

    const/4 v2, 0x1

    move-object/from16 v7, p4

    invoke-direct {v4, v1, v3, v7, v2}, La31/b;-><init>(La31/a;La31/g;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v12, v4

    check-cast v12, Lc93/a;

    const/16 v14, 0xc30

    const/4 v15, 0x0

    const-string v9, "plus icon"

    move/from16 v10, p2

    move v11, v5

    invoke-static/range {v8 .. v15}, Lny0/a;->c(ILjava/lang/String;ZFLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move/from16 v2, p0

    move-object/from16 v3, p1

    move v4, v0

    move/from16 v1, v21

    goto :goto_15

    :cond_20
    move-object v7, v5

    invoke-virtual {v13}, Lp1/q;->X()V

    move/from16 v4, p3

    move v1, v3

    move v2, v9

    move-object v3, v11

    :goto_15
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v0, La31/d;

    move/from16 v8, p8

    move-object v5, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La31/d;-><init>(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final g(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, La31/g;->c()Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, La31/a;->b(Ljava/lang/Integer;I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(La31/g;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v0, p2

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v3, p4, 0x1

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, La31/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v15, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lny0/v0$c;

    sget-object v1, Lny0/e1;->FIXED:Lny0/e1;

    const/4 v2, 0x0

    invoke-direct {v9, v1, v2, v4, v2}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, La31/g;->e()Z

    move-result v10

    int-to-float v1, v4

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v12, v1, v2

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, La31/e;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v14, v2

    check-cast v14, Lc93/a;

    const/high16 v16, 0xc00000

    const/16 v17, 0x10d

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    move/from16 v11, p1

    invoke-static/range {v5 .. v17}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(La31/a;La31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, La31/g;->c()Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, La31/a;->b(Ljava/lang/Integer;I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

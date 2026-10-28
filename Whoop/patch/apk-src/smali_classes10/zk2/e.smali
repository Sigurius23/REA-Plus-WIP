.class public abstract Lzk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aa\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzk2/f;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onTagSelected",
        "liveBottomContent",
        "content",
        "f",
        "(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "track-activity_release"
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
.method public static synthetic a(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzk2/e;->g(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function3;Ljava/util/List;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/e;->j(Lkotlin/jvm/functions/Function3;Ljava/util/List;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;)I
    .locals 0

    invoke-static {p0}, Lzk2/e;->h(Ljava/util/List;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Ljava/util/List;Lq0/b;Lbc3/c0;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzk2/e;->i(Ljava/util/List;Lq0/y;Lbc3/c0;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lzk2/e;->k(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk2/f;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v0, -0x4daf1fbe

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v15, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_c

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_8

    :cond_b
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v0, v12

    :cond_c
    and-int/lit16 v12, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    if-eq v12, v13, :cond_d

    const/4 v12, 0x1

    goto :goto_9

    :cond_d
    move v12, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v15, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_2a

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_e

    move-object v4, v12

    :cond_e
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_f

    new-instance v7, Lzk2/c;

    const/4 v9, 0x0

    invoke-direct {v7, v9}, Lzk2/c;-><init>(I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_10
    move-object v7, v9

    :goto_a
    if-eqz v10, :cond_11

    sget-object v9, Lzk2/b;->a:Lzk2/b;

    invoke-virtual {v9}, Lzk2/b;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    goto :goto_b

    :cond_11
    move-object/from16 v9, p3

    :goto_b
    invoke-virtual {v1}, Lzk2/f;->c()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v16, v14

    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lzk2/g;

    invoke-virtual/range {v17 .. v17}, Lzk2/g;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lzk2/f;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    goto :goto_d

    :cond_12
    add-int/lit8 v16, v16, 0x1

    goto :goto_c

    :cond_13
    const/16 v16, -0x1

    :goto_d
    if-gez v16, :cond_14

    move v8, v14

    goto :goto_e

    :cond_14
    move/from16 v8, v16

    :goto_e
    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_15

    if-ne v13, v3, :cond_16

    :cond_15
    new-instance v13, Lzk2/d;

    const/4 v11, 0x1

    invoke-direct {v13, v10, v11}, Lzk2/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v13, Lc93/a;

    invoke-static {v13, v8, v14, v15, v2}, Lq0/c0;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;

    move-result-object v8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_17

    invoke-static {v15}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v11

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v11, Lbc3/c0;

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v13, v13, v16

    and-int/lit16 v14, v0, 0x380

    const/16 v2, 0x100

    if-ne v14, v2, :cond_18

    const/4 v2, 0x1

    goto :goto_f

    :cond_18
    const/4 v2, 0x0

    :goto_f
    or-int/2addr v2, v13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x0

    if-nez v2, :cond_19

    if-ne v13, v3, :cond_1a

    :cond_19
    new-instance v13, Lzk2/e$a;

    invoke-direct {v13, v8, v10, v7, v14}, Lzk2/e$a;-><init>(Lq0/y;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v13, Lc93/m;

    invoke-static {v15, v13, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Lb91/a;

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v15, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->r()Lb91/a;

    move-result-object v13

    invoke-virtual {v13}, Lb91/a;->d()Ll3/v0;

    move-result-object v13

    move/from16 v24, v0

    const/4 v0, 0x0

    const/4 v14, 0x2

    invoke-direct {v2, v13, v0, v14, v0}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->N:Lb2/k;

    sget-object v0, Ll0/m;->c:Ll0/g;

    const/16 v1, 0x30

    invoke-static {v0, v14, v15, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object v1, v7

    iget-wide v6, v15, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 p3, v1

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-eqz v1, :cond_1b

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_10
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v15, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v15, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v6, v15, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v10

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk2/g;

    new-instance v6, Lm81/g;

    invoke-virtual {v1}, Lzk2/g;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lzk2/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v14, 0x0

    invoke-direct {v6, v13, v14, v1, v2}, Lm81/g;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1e
    const/4 v14, 0x0

    invoke-virtual {v8}, Lq0/y;->k()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lzk2/f;->b()Ln81/d;

    move-result-object v1

    invoke-virtual {v1}, Ln81/d;->a()Lm81/f;

    move-result-object v1

    invoke-virtual {v1}, Lm81/f;->a()Ly81/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v15, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lzk2/f;->b()Ln81/d;

    move-result-object v1

    invoke-virtual {v1}, Ln81/d;->a()Lm81/f;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lzk2/f;->b()Ln81/d;

    move-result-object v6

    invoke-virtual {v6}, Ln81/d;->c()Lm81/f;

    move-result-object v13

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v6, v6, v19

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v6, v6, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_1f

    if-ne v2, v3, :cond_20

    :cond_1f
    new-instance v2, Lwc/e1;

    const/16 v3, 0x19

    invoke-direct {v2, v10, v8, v11, v3}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v3, Lm81/f;->g:I

    shl-int/lit8 v6, v3, 0xc

    shl-int/lit8 v3, v3, 0xf

    or-int/2addr v3, v6

    move-object v6, v9

    move-object v11, v10

    move-wide/from16 v9, v16

    const/16 v17, 0x8

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object v14, v2

    move-object/from16 v2, v16

    move/from16 v16, v3

    move-object v3, v8

    move v8, v0

    move-object v0, v12

    move-object v12, v1

    const/4 v1, 0x1

    invoke-static/range {v7 .. v17}, Lm81/e;->l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x2

    int-to-float v7, v14

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v7, v8, v0, v15}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_21

    goto :goto_12

    :cond_21
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    invoke-static {v7, v7, v1}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_22

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_22
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_13
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v15, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-nez v13, :cond_23

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_24

    :cond_23
    invoke-static {v9, v15, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v15, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    new-instance v8, Lb01/o;

    invoke-direct {v8, v5, v2}, Lb01/o;-><init>(Lkotlin/jvm/functions/Function3;Ljava/util/List;)V

    const v14, 0x6b27f2ff

    invoke-static {v14, v15, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    const/16 v22, 0x6000

    const/16 v23, 0x3ffc

    move-object v8, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v8

    move-object v8, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v20

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v25, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x30

    move-object/from16 v1, v27

    move-object/from16 v27, v6

    move-object v6, v1

    move-object/from16 v1, v26

    move-object/from16 v5, v28

    move-object/from16 v26, v4

    move-object v4, v7

    move-object v7, v3

    move-object/from16 v3, v25

    invoke-static/range {v7 .. v23}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v20

    invoke-virtual {v7}, Lq0/y;->k()I

    move-result v7

    invoke-static {v7, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzk2/g;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lzk2/g;->a()Ljava/lang/String;

    move-result-object v14

    goto :goto_14

    :cond_25
    const/4 v14, 0x0

    :goto_14
    if-nez v14, :cond_26

    const v0, 0x7f9d6ee5

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object/from16 v6, v27

    const/4 v1, 0x1

    goto :goto_16

    :cond_26
    const/4 v9, 0x0

    const v2, 0x7f9d6ee6

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->H:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v0, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v7, v15, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_27

    invoke-virtual {v15, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_27
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v15, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_28

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    :cond_28
    invoke-static {v7, v15, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_29
    invoke-static {v15, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v24, 0x6

    and-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v6, v27

    invoke-interface {v6, v14, v15, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, p3

    move-object v4, v6

    move-object/from16 v2, v26

    goto :goto_17

    :cond_2a
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v9

    move-object/from16 v4, p3

    :goto_17
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2b

    new-instance v0, Lv71/g;

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lv71/g;-><init>(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final g(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/util/List;)I
    .locals 0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final i(Ljava/util/List;Lq0/y;Lbc3/c0;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "tappedId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk2/g;

    invoke-virtual {v1}, Lzk2/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    invoke-virtual {p1}, Lq0/y;->k()I

    move-result p0

    if-eq v0, p0, :cond_2

    new-instance p0, Lzk2/e$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, v0, p3}, Lzk2/e$b;-><init>(Lq0/y;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, p3, p3, p0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function3;Ljava/util/List;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "$this$HorizontalPager"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk2/g;

    invoke-virtual {p1}, Lzk2/g;->a()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p4, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lzk2/e;->f(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lmy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aM\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "Lkd1/o;",
        "sources",
        "Ly3/f;",
        "diameter",
        "overlap",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "borderWidth",
        "Li2/x;",
        "borderColor",
        "Ll83/a0;",
        "c",
        "(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lmy0/b;->e(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lmy0/b;->d(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkd1/o;",
            ">;FF",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Li2/x;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v7, p7

    const-string v0, "sources"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    const v0, 0x4a89d3fd    # 4516350.5f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v11, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v11

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v5, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v7, 0xc00

    if-nez v5, :cond_6

    move-object/from16 v5, p3

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_4

    :cond_8
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move/from16 v9, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v7, 0x6000

    if-nez v9, :cond_9

    move/from16 v9, p4

    invoke-virtual {v8, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v0, v10

    :goto_7
    and-int/lit8 v10, p8, 0x20

    const/high16 v12, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v0, v12

    :cond_c
    move-object/from16 v12, p5

    goto :goto_9

    :cond_d
    and-int/2addr v12, v7

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-virtual {v8, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v0, v13

    :goto_9
    const v13, 0x12493

    and-int/2addr v13, v0

    const v14, 0x12492

    const/4 v15, 0x0

    const/4 v7, 0x1

    if-eq v13, v14, :cond_f

    move v13, v7

    goto :goto_a

    :cond_f
    move v13, v15

    :goto_a
    and-int/2addr v0, v7

    invoke-virtual {v8, v0, v13}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1d

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_10

    move-object v4, v0

    goto :goto_b

    :cond_10
    move-object v4, v5

    :goto_b
    if-eqz v6, :cond_11

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    goto :goto_c

    :cond_11
    move v5, v9

    :goto_c
    const/4 v13, 0x0

    if-eqz v10, :cond_12

    move-object v6, v13

    goto :goto_d

    :cond_12
    move-object v6, v12

    :goto_d
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1e

    new-instance v0, Lmy0/a;

    const/4 v9, 0x0

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lmy0/a;-><init>(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;III)V

    :goto_e
    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_13
    move v14, v2

    move-object v12, v4

    move v9, v5

    move-object v10, v6

    sget-object v1, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ly3/m;->x:Ly3/m;

    if-ne v1, v2, :cond_14

    move/from16 v16, v7

    goto :goto_f

    :cond_14
    move/from16 v16, v15

    :goto_f
    sub-float v17, v14, p2

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v7

    int-to-float v1, v1

    mul-float v1, v1, v17

    add-float/2addr v1, v14

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz v16, :cond_15

    sget-object v2, Lb2/e;->F:Lb2/m;

    goto :goto_10

    :cond_15
    sget-object v2, Lb2/e;->z:Lb2/m;

    :goto_10
    invoke-static {v2, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_16
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    :cond_17
    invoke-static {v3, v8, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x5c412203

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    move v1, v15

    :goto_12
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v19, v1, 0x1

    if-ltz v1, :cond_1b

    check-cast v2, Lkd1/o;

    if-eqz v16, :cond_19

    int-to-float v3, v1

    goto :goto_13

    :cond_19
    invoke-static/range {p0 .. p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    sub-int/2addr v3, v1

    int-to-float v3, v3

    :goto_13
    const/4 v5, 0x0

    const/4 v6, 0x3

    move v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    move/from16 v20, v3

    const/4 v3, 0x0

    move-object v7, v8

    move v8, v4

    move-object v4, v7

    move/from16 v7, v20

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    int-to-float v2, v8

    mul-float v2, v2, v17

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v11}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lt0/j;->a:Lt0/i;

    invoke-static {v2, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v10, :cond_1a

    iget-wide v5, v10, Li2/x;->a:J

    invoke-static {v0, v9, v5, v6, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_14

    :cond_1a
    invoke-interface {v2, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    :goto_14
    invoke-static {v7, v2}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v5, v9

    const/16 v9, 0x6030

    move-object v6, v10

    const/16 v10, 0x68

    const/4 v2, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    move v7, v5

    sget-object v5, Ly2/j;->a:Ly2/b1;

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    const/4 v11, 0x1

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move v7, v11

    move/from16 v1, v19

    move-object/from16 v10, v20

    move/from16 v9, v21

    const/4 v11, 0x2

    goto :goto_12

    :cond_1b
    invoke-static {}, Lwb3/f;->d0()V

    throw v13

    :cond_1c
    move v11, v7

    move/from16 v21, v9

    move-object/from16 v20, v10

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object v4, v12

    move-object/from16 v6, v20

    move/from16 v5, v21

    goto :goto_15

    :cond_1d
    move v14, v2

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v4, v5

    move v5, v9

    move-object v6, v12

    :goto_15
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1e

    new-instance v0, Lmy0/a;

    const/4 v9, 0x1

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v7, p7

    move/from16 v8, p8

    move v2, v14

    invoke-direct/range {v0 .. v9}, Lmy0/a;-><init>(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;III)V

    goto/16 :goto_e

    :cond_1e
    return-void
.end method

.method private static final d(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lmy0/b;->c(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lmy0/b;->c(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

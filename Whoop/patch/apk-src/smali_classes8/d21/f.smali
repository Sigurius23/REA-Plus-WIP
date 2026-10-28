.class public abstract Ld21/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ld21/g;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onHeightChanged",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly3/f;",
        "itemHeight",
        "Lb91/a;",
        "textStyle",
        "",
        "ignoreFirstValue",
        "e",
        "(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Ld21/f;->i(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ld21/f;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Ld21/f;->g(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Ld21/f;->f(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld21/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Lb91/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move/from16 v7, p7

    sget-object v15, Lb2/e;->M:Lb2/k;

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onHeightChanged"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    const v4, -0xa903793

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_1
    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v4, v4, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v3, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v4, v9

    :goto_4
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move/from16 v10, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_7

    move/from16 v10, p3

    invoke-virtual {v3, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_5

    :cond_9
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v4, v11

    :goto_6
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_c

    and-int/lit8 v11, p8, 0x10

    if-nez v11, :cond_b

    const v11, 0x8000

    and-int/2addr v11, v7

    if-nez v11, :cond_a

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_7

    :cond_a
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_7
    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_8

    :cond_b
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v4, v11

    :cond_c
    and-int/lit8 v11, p8, 0x20

    const/high16 v12, 0x30000

    if-eqz v11, :cond_e

    or-int/2addr v4, v12

    :cond_d
    move/from16 v12, p5

    goto :goto_a

    :cond_e
    and-int/2addr v12, v7

    if-nez v12, :cond_d

    move/from16 v12, p5

    invoke-virtual {v3, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_f

    const/high16 v13, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v13, 0x10000

    :goto_9
    or-int/2addr v4, v13

    :goto_a
    const v13, 0x12493

    and-int/2addr v13, v4

    const v14, 0x12492

    const/16 v32, 0x1

    if-eq v13, v14, :cond_10

    move/from16 v13, v32

    goto :goto_b

    :cond_10
    const/4 v13, 0x0

    :goto_b
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v3, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_35

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v13, v7, 0x1

    sget-object v14, Lb2/t;->w:Lb2/t;

    const v16, -0xe001

    const/4 v6, 0x6

    if-eqz v13, :cond_13

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_12

    and-int v4, v4, v16

    :cond_12
    move-object/from16 v19, v0

    move-object v0, v8

    move/from16 v20, v10

    move/from16 v22, v12

    goto :goto_d

    :cond_13
    :goto_c
    if-eqz v5, :cond_14

    move-object v8, v14

    :cond_14
    if-eqz v9, :cond_15

    const/16 v5, 0x3c

    int-to-float v5, v5

    move v10, v5

    :cond_15
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_16

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v3, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->D()Lb91/a;

    move-result-object v0

    and-int v4, v4, v16

    :cond_16
    if-eqz v11, :cond_12

    move-object/from16 v19, v0

    move-object v0, v8

    move/from16 v20, v10

    move/from16 v22, v32

    :goto_d
    invoke-virtual {v3}, Lp1/q;->r()V

    invoke-virtual {v1}, Ld21/g;->g()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v5

    sget-object v8, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    sget-object v16, Ll0/z;->a:Ll0/z;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v5, v8, :cond_2b

    const v5, -0x44ada39c

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    sget-object v5, Ld21/a;->a:Ld21/a;

    invoke-virtual {v1}, Ld21/g;->e()I

    move-result v8

    invoke-virtual {v5, v8}, Ld21/a;->a(I)I

    move-result v8

    invoke-virtual {v5, v8}, Ld21/a;->k(I)Ll83/k;

    move-result-object v8

    iget-object v12, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v1}, Ld21/g;->d()Li93/j;

    move-result-object v13

    const/high16 p2, 0x380000

    invoke-virtual {v1}, Ld21/g;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v9, v13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_17

    if-ne v13, v11, :cond_18

    :cond_17
    invoke-virtual {v1}, Ld21/g;->d()Li93/j;

    move-result-object v9

    invoke-static {v9}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Ld21/g;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v9, v13}, Ld21/a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v17, v13

    check-cast v17, Ljava/util/List;

    invoke-virtual {v1}, Ld21/g;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_1a

    if-ne v13, v11, :cond_19

    goto :goto_e

    :cond_19
    const p3, 0xe000

    goto :goto_f

    :cond_1a
    :goto_e
    const/16 v9, 0xb

    invoke-virtual {v1}, Ld21/g;->f()Ljava/lang/String;

    move-result-object v13

    const p3, 0xe000

    const/4 v10, 0x0

    invoke-virtual {v5, v10, v9, v13}, Ld21/a;->f(IILjava/lang/String;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    move-object v9, v13

    check-cast v9, Ljava/util/List;

    sget-object v5, Ll0/m;->h:Ll0/h;

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v5, v10, v3, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v3, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-eqz v1, :cond_1b

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1b
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_10
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v3, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 p4, v4

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p5, v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_11

    :cond_1c
    move-object/from16 p5, v9

    :goto_11
    invoke-static {v6, v3, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/4 v10, 0x0

    invoke-static {v6, v15, v3, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v33, v11

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    move-object/from16 v34, v0

    invoke-static {v3, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->i0()V

    move/from16 v35, v12

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_1e

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v3, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_1f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_20

    :cond_1f
    invoke-static {v10, v3, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v3, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ld21/g;->d()Li93/j;

    move-result-object v0

    iget v0, v0, Li93/h;->w:I

    sub-int v12, v35, v0

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_21

    const/4 v0, 0x0

    :cond_21
    const/4 v10, 0x0

    invoke-static {v12, v10, v0}, Le93/b;->n(III)I

    move-result v18

    sget-object v23, Lb2/e;->O:Lb2/k;

    and-int/lit8 v0, p4, 0x70

    const/16 v9, 0x20

    if-ne v0, v9, :cond_22

    move/from16 v9, v32

    goto :goto_13

    :cond_22
    const/4 v9, 0x0

    :goto_13
    invoke-virtual {v3, v8}, Lp1/q;->e(I)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_23

    move-object/from16 v9, v33

    if-ne v10, v9, :cond_24

    goto :goto_14

    :cond_23
    move-object/from16 v9, v33

    :goto_14
    new-instance v10, Ld21/d;

    const/4 v11, 0x0

    invoke-direct {v10, v2, v8, v11}, Ld21/d;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object/from16 v27, v10

    check-cast v27, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v10, p4, 0x3

    and-int/lit16 v10, v10, 0x1c00

    const v11, 0xc00006

    or-int/2addr v10, v11

    shl-int/lit8 v11, p4, 0x3

    and-int v12, v11, p3

    or-int/2addr v10, v12

    and-int v11, v11, p2

    or-int v29, v10, v11

    const/16 v30, 0x0

    const/16 v31, 0x390

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v16 .. v31}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v10, v32

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    invoke-static {v6, v15, v3, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_25

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_25
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v3, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_26

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    :cond_26
    invoke-static {v10, v3, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v3, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x20

    if-ne v0, v1, :cond_28

    const/4 v0, 0x1

    :goto_16
    move/from16 v1, v35

    goto :goto_17

    :cond_28
    const/4 v0, 0x0

    goto :goto_16

    :goto_17
    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_29

    if-ne v4, v9, :cond_2a

    :cond_29
    new-instance v4, Ld21/d;

    const/4 v0, 0x1

    invoke-direct {v4, v2, v1, v0}, Ld21/d;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move/from16 v14, v22

    const/16 v22, 0x0

    const/16 v23, 0x390

    const/4 v13, 0x0

    move v10, v8

    move-object/from16 v8, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v9, p5

    move-object/from16 v11, v19

    move/from16 v12, v20

    move/from16 v21, v29

    move-object/from16 v20, v3

    move-object/from16 v19, v4

    invoke-static/range {v8 .. v23}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v19, v11

    move/from16 v22, v14

    const/4 v0, 0x0

    const/4 v10, 0x1

    move/from16 v20, v12

    invoke-static {v3, v10, v10, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v8, v34

    goto/16 :goto_1a

    :cond_2b
    move-object/from16 v34, v0

    move/from16 p4, v4

    move-object v9, v11

    const/high16 p2, 0x380000

    const p3, 0xe000

    const v0, -0x448e6029

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld21/g;->b()Li93/j;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ld21/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2c

    if-ne v1, v9, :cond_2d

    :cond_2c
    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual/range {p0 .. p0}, Ld21/g;->b()Li93/j;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ld21/g;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ld21/a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object/from16 v17, v1

    check-cast v17, Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Ld21/g;->b()Li93/j;

    move-result-object v0

    iget v0, v0, Li93/h;->x:I

    invoke-virtual/range {p0 .. p0}, Ld21/g;->b()Li93/j;

    move-result-object v1

    iget v1, v1, Li93/h;->w:I

    sub-int/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Ld21/g;->e()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Ld21/g;->b()Li93/j;

    move-result-object v4

    iget v4, v4, Li93/h;->w:I

    sub-int/2addr v1, v4

    if-gez v0, :cond_2e

    const/4 v0, 0x0

    :cond_2e
    const/4 v10, 0x0

    invoke-static {v1, v10, v0}, Le93/b;->n(III)I

    move-result v18

    sget-object v0, Ll0/m;->c:Ll0/g;

    invoke-static {v0, v15, v3, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v8, v34

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_2f

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_2f
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_18
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_30

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_31

    :cond_30
    invoke-static {v1, v3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_31
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, p4, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_32

    const/4 v10, 0x1

    goto :goto_19

    :cond_32
    const/4 v10, 0x0

    :goto_19
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_33

    if-ne v0, v9, :cond_34

    :cond_33
    new-instance v0, La61/a;

    const/16 v1, 0x19

    invoke-direct {v0, v2, v1}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    move-object/from16 v27, v0

    check-cast v27, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, p4, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v6

    shl-int/lit8 v1, p4, 0x3

    and-int v4, v1, p3

    or-int/2addr v0, v4

    and-int v1, v1, p2

    or-int v29, v0, v1

    const/16 v30, 0x0

    const/16 v31, 0x3d0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v16 .. v31}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v10, 0x1

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    :goto_1a
    move-object/from16 v5, v19

    move/from16 v4, v20

    move/from16 v6, v22

    goto :goto_1b

    :cond_35
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v5, v0

    move v4, v10

    move v6, v12

    :goto_1b
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_36

    new-instance v0, Ld21/e;

    const/4 v9, 0x0

    move-object/from16 v1, p0

    move/from16 v7, p7

    move-object v3, v8

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ld21/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p2}, Ld21/a;->r(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2, p1}, Ld21/a;->b(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p2}, Ld21/a;->r(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Ld21/a;->b(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p1}, Ld21/a;->r(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Ld21/f;->e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

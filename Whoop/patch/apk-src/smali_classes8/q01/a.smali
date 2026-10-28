.class public abstract Lq01/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lq01/b;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onCircumferenceChanged",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly3/f;",
        "itemHeight",
        "Lb91/a;",
        "textStyle",
        "",
        "ignoreFirstValue",
        "d",
        "(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lq01/a;->g(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lq01/a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lq01/a;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq01/b;",
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

    sget-object v3, Lb2/e;->M:Lb2/k;

    const-string v4, "state"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onCircumferenceChanged"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v5, -0x7af3f8ab

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v7, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v7

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v5, v5, 0x180

    :cond_4
    move-object/from16 v9, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_4

    move-object/from16 v9, p2

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_3

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v5, v10

    :goto_4
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_8

    or-int/lit16 v5, v5, 0xc00

    :cond_7
    move/from16 v11, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_7

    move/from16 v11, p3

    invoke-virtual {v4, v11}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_5

    :cond_9
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v5, v12

    :goto_6
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_c

    and-int/lit8 v12, p8, 0x10

    if-nez v12, :cond_b

    const v12, 0x8000

    and-int/2addr v12, v7

    if-nez v12, :cond_a

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_7

    :cond_a
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_7
    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_8

    :cond_b
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v5, v12

    :cond_c
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_e

    or-int/2addr v5, v13

    :cond_d
    move/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int/2addr v13, v7

    if-nez v13, :cond_d

    move/from16 v13, p5

    invoke-virtual {v4, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v5, v14

    :goto_a
    const v14, 0x12493

    and-int/2addr v14, v5

    const v15, 0x12492

    const/4 v13, 0x0

    if-eq v14, v15, :cond_10

    const/4 v14, 0x1

    goto :goto_b

    :cond_10
    move v14, v13

    :goto_b
    and-int/lit8 v15, v5, 0x1

    invoke-virtual {v4, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_2a

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v14, v7, 0x1

    const v16, -0xe001

    const/4 v15, 0x6

    if-eqz v14, :cond_13

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_12

    and-int v5, v5, v16

    :cond_12
    move/from16 v14, p5

    move v12, v11

    :goto_c
    move-object v11, v0

    move-object v0, v9

    goto :goto_e

    :cond_13
    :goto_d
    if-eqz v6, :cond_14

    sget-object v6, Lb2/t;->w:Lb2/t;

    move-object v9, v6

    :cond_14
    if-eqz v10, :cond_15

    const/16 v6, 0x3c

    int-to-float v6, v6

    move v11, v6

    :cond_15
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_16

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v4, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->D()Lb91/a;

    move-result-object v0

    and-int v5, v5, v16

    :cond_16
    if-eqz v12, :cond_12

    move v12, v11

    const/4 v14, 0x1

    goto :goto_c

    :goto_e
    invoke-virtual {v4}, Lp1/q;->r()V

    invoke-virtual {v1}, Lq01/b;->f()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v6

    sget-object v9, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    const v16, 0xe000

    sget-object v17, Ll0/z;->a:Ll0/z;

    const/high16 p2, 0x380000

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_20

    const v6, -0x2d315b3a

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lq01/b;->e()Li93/j;

    move-result-object v6

    invoke-virtual {v1}, Lq01/b;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_18

    if-ne v9, v10, :cond_17

    goto :goto_f

    :cond_17
    move/from16 v18, v15

    goto :goto_10

    :cond_18
    :goto_f
    sget-object v6, Ld21/a;->a:Ld21/a;

    invoke-virtual {v1}, Lq01/b;->e()Li93/j;

    move-result-object v9

    invoke-static {v9}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v9

    move/from16 v18, v15

    invoke-virtual {v1}, Lq01/b;->d()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v9, v15}, Ld21/a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v9, Ljava/util/List;

    sget-object v6, Ld21/a;->a:Ld21/a;

    invoke-virtual {v1}, Lq01/b;->c()I

    move-result v15

    invoke-virtual {v6, v15}, Ld21/a;->a(I)I

    move-result v6

    invoke-virtual {v1}, Lq01/b;->e()Li93/j;

    move-result-object v15

    iget v15, v15, Li93/h;->x:I

    invoke-virtual {v1}, Lq01/b;->e()Li93/j;

    move-result-object v8

    iget v8, v8, Li93/h;->w:I

    sub-int/2addr v15, v8

    invoke-virtual {v1}, Lq01/b;->e()Li93/j;

    move-result-object v8

    iget v8, v8, Li93/h;->w:I

    sub-int/2addr v6, v8

    if-gez v15, :cond_19

    move v15, v13

    :cond_19
    invoke-static {v6, v13, v15}, Le93/b;->n(III)I

    move-result v6

    sget-object v8, Ll0/m;->c:Ll0/g;

    invoke-static {v8, v3, v4, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move/from16 p3, v14

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-eqz v1, :cond_1a

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_11
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_1b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    :cond_1b
    invoke-static {v13, v4, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v1, v5, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_1d

    const/4 v1, 0x1

    goto :goto_12

    :cond_1d
    const/4 v1, 0x0

    :goto_12
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1e

    if-ne v3, v10, :cond_1f

    :cond_1e
    new-instance v3, Lp90/h;

    const/16 v1, 0xc

    invoke-direct {v3, v2, v1}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v19, v3

    check-cast v19, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v5, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int v1, v18, v1

    shl-int/lit8 v3, v5, 0x3

    and-int v5, v3, v16

    or-int/2addr v1, v5

    and-int v3, v3, p2

    or-int v21, v1, v3

    const/16 v22, 0x0

    const/16 v23, 0x3d0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v8, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v14, p3

    move-object/from16 v20, v4

    move v10, v6

    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-static/range {v8 .. v23}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v20

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    move-object/from16 p5, v0

    goto/16 :goto_15

    :cond_20
    move-object v6, v4

    move v4, v13

    move/from16 v18, v15

    move-object/from16 v8, v17

    const/4 v1, 0x1

    const v9, -0x2d21b7bf

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lq01/b;->b()Li93/j;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lq01/b;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v6, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_21

    if-ne v13, v10, :cond_22

    :cond_21
    sget-object v9, Ld21/a;->a:Ld21/a;

    invoke-virtual/range {p0 .. p0}, Lq01/b;->b()Li93/j;

    move-result-object v13

    invoke-static {v13}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lq01/b;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9, v13, v15}, Ld21/a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v6, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object v9, v13

    check-cast v9, Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lq01/b;->b()Li93/j;

    move-result-object v13

    iget v13, v13, Li93/h;->x:I

    invoke-virtual/range {p0 .. p0}, Lq01/b;->b()Li93/j;

    move-result-object v15

    iget v15, v15, Li93/h;->w:I

    sub-int/2addr v13, v15

    invoke-virtual/range {p0 .. p0}, Lq01/b;->c()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lq01/b;->b()Li93/j;

    move-result-object v1

    iget v1, v1, Li93/h;->w:I

    sub-int/2addr v15, v1

    if-gez v13, :cond_23

    move v13, v4

    :cond_23
    invoke-static {v15, v4, v13}, Le93/b;->n(III)I

    move-result v1

    sget-object v13, Ll0/m;->c:Ll0/g;

    invoke-static {v13, v3, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move/from16 p3, v5

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    move-object/from16 p5, v0

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-eqz v0, :cond_24

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_24
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_13
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v6, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_25

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    :cond_25
    invoke-static {v4, v6, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, p3, 0x70

    const/16 v3, 0x20

    if-ne v0, v3, :cond_27

    const/4 v13, 0x1

    goto :goto_14

    :cond_27
    const/4 v13, 0x0

    :goto_14
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_28

    if-ne v0, v10, :cond_29

    :cond_28
    new-instance v0, Lp90/h;

    const/16 v3, 0xd

    invoke-direct {v0, v2, v3}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object/from16 v19, v0

    check-cast v19, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, p3, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int v0, v18, v0

    shl-int/lit8 v3, p3, 0x3

    and-int v4, v3, v16

    or-int/2addr v0, v4

    and-int v3, v3, p2

    or-int v21, v0, v3

    const/16 v22, 0x0

    const/16 v23, 0x3d0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move v10, v1

    move-object/from16 v20, v6

    invoke-static/range {v8 .. v23}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_15
    move-object/from16 v3, p5

    move-object/from16 v20, v6

    move-object v5, v11

    move v4, v12

    move v6, v14

    goto :goto_16

    :cond_2a
    move-object v6, v4

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v5, v0

    move-object/from16 v20, v6

    move-object v3, v9

    move v4, v11

    move/from16 v6, p5

    :goto_16
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2b

    new-instance v0, Ld21/e;

    const/4 v9, 0x2

    move-object/from16 v1, p0

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ld21/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p1}, Ld21/a;->r(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Ld21/a;->j(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
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

.method private static final g(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v1 .. v9}, Lq01/a;->d(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

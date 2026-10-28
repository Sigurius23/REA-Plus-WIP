.class public abstract Ls4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v4, p3

    const-string v0, "hiddenIdentifiersFlow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastTextFieldIdentifierFlow"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x57f9ab19

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v10, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v10, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    or-int/lit16 v0, v0, 0x6000

    and-int/lit16 v1, v0, 0x2493

    const/16 v2, 0x2492

    if-ne v1, v2, :cond_5

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v5, p4

    goto :goto_5

    :cond_5
    :goto_4
    and-int/lit8 v1, v0, 0xe

    invoke-static {p0, v10, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {p1, v10, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {p2, v10, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v4, v10, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/util/Set;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v0, v0, 0x9

    or-int/lit16 v11, v0, 0x6000

    const/4 v12, 0x0

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static/range {v5 .. v12}, Ls4/l;->b(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    :goto_5
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_6

    new-instance v0, La81/g;

    const/16 v7, 0x15

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v9, p2

    move-object/from16 v3, p3

    move/from16 v10, p6

    const-string v0, "hiddenIdentifiers"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v0, 0x5b08c833

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    move/from16 v5, p1

    if-nez v2, :cond_3

    invoke-virtual {v7, v5}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v10, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v10, 0xc00

    if-nez v2, :cond_8

    and-int/lit16 v2, v10, 0x1000

    if-nez v2, :cond_6

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_6
    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_7

    const/16 v2, 0x800

    goto :goto_5

    :cond_7
    const/16 v2, 0x400

    :goto_5
    or-int/2addr v0, v2

    :cond_8
    and-int/lit8 v2, p7, 0x10

    if-eqz v2, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v4, p4

    :goto_6
    move v11, v0

    goto :goto_8

    :cond_a
    and-int/lit16 v4, v10, 0x6000

    if-nez v4, :cond_9

    move-object/from16 v4, p4

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x4000

    goto :goto_7

    :cond_b
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v0, v6

    goto :goto_6

    :goto_8
    and-int/lit16 v0, v11, 0x2493

    const/16 v6, 0x2492

    if-ne v0, v6, :cond_d

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_d
    :goto_9
    if-eqz v2, :cond_e

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v12, v0

    goto :goto_a

    :cond_e
    move-object v12, v4

    :goto_a
    sget-object v0, Ld40/r;->f:Lp1/u2;

    invoke-virtual {v7, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Float;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v13, :cond_f

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    goto :goto_b

    :cond_f
    sget-object v2, Ll0/m;->c:Ll0/g;

    :goto_b
    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v2, v4, v7, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    invoke-static {v4, v7, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v15, 0x1

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lg40/i1;

    invoke-interface {v4}, Lg40/i1;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    instance-of v4, v4, Lx30/r0;

    if-nez v4, :cond_14

    goto :goto_e

    :cond_14
    const/4 v15, 0x0

    :goto_e
    if-eqz v15, :cond_13

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_15
    const v0, -0x49570435

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v1, 0x0

    :goto_f
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v17, v1, 0x1

    if-ltz v1, :cond_17

    check-cast v0, Lg40/i1;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v15

    if-eqz v13, :cond_16

    move v4, v15

    goto :goto_10

    :cond_16
    const/4 v4, 0x0

    :goto_10
    shl-int/lit8 v6, v11, 0x6

    and-int/lit16 v6, v6, 0x1c00

    shl-int/lit8 v8, v11, 0xf

    const/high16 v18, 0x70000

    and-int v8, v8, v18

    or-int/2addr v6, v8

    sget v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v8, v8, 0x12

    or-int/2addr v6, v8

    shl-int/lit8 v8, v11, 0x9

    const/high16 v18, 0x380000

    and-int v8, v8, v18

    or-int/2addr v8, v6

    move-object v6, v3

    move v3, v5

    move-object/from16 v5, p0

    invoke-static/range {v0 .. v8}, Ls4/l;->c(Lg40/i1;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    move/from16 v5, p1

    move-object/from16 v3, p3

    move/from16 v1, v17

    goto :goto_f

    :cond_17
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_18
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    move-object v4, v12

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_19

    new-instance v0, Ltg2/i;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p1

    move-object/from16 v3, p3

    move/from16 v7, p7

    move-object v2, v9

    move v6, v10

    invoke-direct/range {v0 .. v8}, Ltg2/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final c(Lg40/i1;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v2, p3

    move-object/from16 v5, p6

    move/from16 v0, p8

    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    const v3, 0x40cfda3e

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    move/from16 v9, p1

    if-nez v6, :cond_3

    invoke-virtual {v7, v9}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    move/from16 v10, p2

    if-nez v6, :cond_5

    invoke-virtual {v7, v10}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v7, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v3, v6

    :cond_7
    and-int/lit16 v6, v0, 0x6000

    move/from16 v8, p4

    if-nez v6, :cond_9

    invoke-virtual {v7, v8}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v3, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v0

    if-nez v6, :cond_b

    move-object/from16 v6, p5

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v11, 0x10000

    :goto_6
    or-int/2addr v3, v11

    goto :goto_7

    :cond_b
    move-object/from16 v6, p5

    :goto_7
    const/high16 v11, 0x180000

    and-int/2addr v11, v0

    if-nez v11, :cond_e

    const/high16 v11, 0x200000

    and-int/2addr v11, v0

    if-nez v11, :cond_c

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_8

    :cond_c
    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_8
    if-eqz v11, :cond_d

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v3, v11

    :cond_e
    const v11, 0x92493

    and-int/2addr v11, v3

    const v12, 0x92492

    if-ne v11, v12, :cond_10

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_10
    :goto_a
    instance-of v11, v1, Lg40/w2;

    const/16 v15, 0x40

    const/16 v12, 0x8

    const/4 v13, 0x0

    if-eqz v11, :cond_11

    const v4, -0x4e3b76d3

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    int-to-float v11, v12

    move v4, v13

    int-to-float v13, v4

    move v12, v11

    move v14, v13

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v16, v3

    move-object v3, v1

    check-cast v3, Lg40/w2;

    shr-int/lit8 v8, v16, 0x9

    and-int/lit8 v9, v8, 0xe

    or-int/2addr v9, v15

    and-int/lit16 v10, v8, 0x380

    or-int/2addr v9, v10

    sget v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v10, v10, 0x9

    or-int/2addr v9, v10

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v8, v9

    const/4 v9, 0x0

    move v10, v4

    move-object v4, v6

    move-object v6, v11

    invoke-static/range {v2 .. v9}, Lkotlin/jvm/internal/j;->p(ZLg40/w2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_11
    move/from16 v16, v3

    move v10, v13

    instance-of v3, v1, Lg40/e0;

    if-eqz v3, :cond_12

    const v3, 0x164060af

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    int-to-float v11, v4

    int-to-float v13, v10

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v8, p4

    move v3, v10

    move/from16 v10, p2

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lg40/e0;

    iget-object v5, v5, Lg40/e0;->b:Lg40/d0;

    shr-int/lit8 v6, v16, 0x3

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v6, v15

    invoke-static {v4, v5, v2, v7, v6}, Lx43/j;->d(Landroidx/compose/ui/Modifier;Lg40/d0;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_12
    move v3, v10

    instance-of v5, v1, Lx30/r1;

    if-eqz v5, :cond_13

    const v4, 0x16408f07

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lx30/r1;

    int-to-float v11, v12

    int-to-float v13, v3

    move v5, v12

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v6, v7, v5}, Ls30/e;->b(Lx30/r1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_13
    move v5, v12

    instance-of v6, v1, Lx30/i1;

    if-eqz v6, :cond_14

    const v5, -0x4e298bea

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    int-to-float v11, v4

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lx30/i1;

    shr-int/lit8 v6, v16, 0x9

    and-int/lit8 v6, v6, 0xe

    or-int/2addr v6, v15

    invoke-static {v2, v5, v4, v7, v6}, Ls2/d;->i(ZLx30/i1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_14
    instance-of v6, v1, Lx30/n1;

    if-eqz v6, :cond_15

    const v5, -0x4e23bad3

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    int-to-float v11, v4

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lx30/n1;

    shr-int/lit8 v6, v16, 0x9

    and-int/lit8 v6, v6, 0xe

    or-int/2addr v6, v15

    invoke-static {v2, v5, v4, v7, v6}, Ls3/d;->c(ZLx30/n1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_15
    instance-of v6, v1, Lg40/v2;

    if-eqz v6, :cond_16

    const v6, 0x16411919

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lg40/v2;

    iget-object v6, v6, Lg40/v2;->b:Lg40/u2;

    int-to-float v11, v4

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6, v4, v7, v5}, Lio/sentry/config/a;->l(Lg40/u2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_16
    instance-of v6, v1, Lx30/c;

    if-eqz v6, :cond_17

    const v6, 0x164146c0

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lx30/c;

    int-to-float v12, v4

    int-to-float v11, v5

    move v13, v12

    move v14, v12

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v5, v16, 0x9

    and-int/lit8 v5, v5, 0xe

    or-int/2addr v5, v15

    invoke-static {v2, v6, v4, v7, v5}, Lrg/a;->a(ZLx30/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_17
    instance-of v4, v1, Lx30/e;

    if-eqz v4, :cond_18

    const v4, 0x1641806f

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lx30/e;

    int-to-float v11, v5

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v6, v7, v5}, Lrg/j;->a(Lx30/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_18
    instance-of v4, v1, Lx30/b;

    if-eqz v4, :cond_19

    const v4, 0x1641ab04

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    int-to-float v11, v5

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v7, v3}, Lsc3/l;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_19
    instance-of v4, v1, Lx30/e1;

    if-eqz v4, :cond_1a

    const v4, 0x1641d089

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lx30/e1;

    iget v11, v4, Lx30/e1;->d:F

    int-to-float v12, v5

    int-to-float v13, v3

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v6, v7, v5}, Ls2/a;->b(Lx30/e1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_1a
    instance-of v4, v1, Lx30/x;

    if-eqz v4, :cond_1b

    const v4, 0x1641ffce

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lx30/x;

    iget-object v4, v4, Lx30/x;->b:Lx30/w;

    int-to-float v11, v5

    int-to-float v13, v3

    move v12, v11

    move v14, v13

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v8, p4

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v5, v16, 0x9

    and-int/lit8 v8, v5, 0xe

    or-int/2addr v8, v15

    and-int/lit16 v9, v5, 0x380

    or-int/2addr v8, v9

    sget v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v9, v9, 0x9

    or-int/2addr v8, v9

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v8, v5

    move-object/from16 v5, p6

    move v9, v3

    move-object v3, v4

    move-object/from16 v4, p5

    invoke-static/range {v2 .. v8}, Lrs/b;->b(ZLx30/w;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_1b
    move v9, v3

    instance-of v2, v1, Lx30/k;

    if-eqz v2, :cond_1c

    const v2, 0x16423cfe

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v3, v1

    check-cast v3, Lx30/k;

    int-to-float v11, v5

    int-to-float v13, v9

    move v12, v11

    move v14, v13

    move/from16 v10, p2

    move/from16 v8, p4

    move v4, v9

    move/from16 v9, p1

    invoke-static/range {v8 .. v14}, Ls4/l;->j(ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shr-int/lit8 v2, v16, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v2, v15

    sget v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v6, v6, 0x6

    or-int/2addr v2, v6

    shr-int/lit8 v6, v16, 0xc

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v2, v6

    move v8, v4

    move-object v6, v7

    move-object/from16 v4, p6

    move v7, v2

    move/from16 v2, p3

    invoke-static/range {v2 .. v7}, Lrj/j;->a(ZLx30/k;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v7, v6

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_1c
    move v8, v9

    instance-of v2, v1, Lg40/o1;

    if-eqz v2, :cond_1d

    const v2, 0x16426f1a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v3, v1

    check-cast v3, Lg40/o1;

    shr-int/lit8 v2, v16, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v14, v2, 0x40

    const/4 v15, 0x0

    const/16 v16, 0x7fc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v0, v2

    move/from16 v2, p3

    invoke-static/range {v2 .. v16}, Ldc/a;->g(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v13

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_1d
    move v0, v8

    instance-of v2, v1, Lx30/g1;

    if-eqz v2, :cond_1e

    const v2, 0x1642789a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lx30/g1;

    shr-int/lit8 v3, v16, 0x9

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v4, v16, 0xc

    and-int/lit8 v5, v4, 0x70

    or-int/2addr v3, v5

    sget v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v3, v5

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    or-int/lit16 v3, v3, 0x1000

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object v6, v7

    move v7, v3

    move/from16 v3, p3

    invoke-virtual/range {v2 .. v7}, Lx30/g1;->g(ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    move-object v7, v6

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_1e
    const v2, -0x4df2655a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1f

    new-instance v0, Lu30/d;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lu30/d;-><init>(Lg40/i1;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final d(Lv00/c0;)Z
    .locals 5

    iget-object v0, p0, Lv00/c0;->l0:La30/l0;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v0, v0, La30/l0;->w:Lwz/g0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lwz/g0;->h0:Ljava/util/List;

    const-string v2, "INSTANT_DEBITS"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_5

    iget-object v0, p0, Lv00/c0;->x:Lh20/l1;

    iget-object v3, v0, Lh20/l1;->y:Lh20/k1;

    sget-object v4, Lh20/k1;->x:Lh20/k1;

    if-eq v3, v4, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-boolean v0, v0, Lh20/l1;->E:Z

    if-eqz v0, :cond_3

    iget-object p0, p0, Lv00/c0;->K:Lh20/i1;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lh20/i1;->x:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    move p0, v2

    goto :goto_3

    :cond_3
    :goto_2
    move p0, v1

    :goto_3
    if-nez v3, :cond_4

    if-eqz p0, :cond_5

    :cond_4
    return v2

    :cond_5
    return v1
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/app/AppOpsManagerCompat;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    if-nez v2, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    array-length v4, v2

    if-gtz v4, :cond_2

    goto :goto_0

    :cond_2
    aget-object v2, v2, v0

    goto :goto_1

    :cond_3
    :goto_0
    return v3

    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    if-ne v3, v1, :cond_5

    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {p0, v1, p1, v2}, Landroidx/core/app/AppOpsManagerCompat;->checkOrNoteProxyOp(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)I

    move-result p0

    goto :goto_2

    :cond_5
    invoke-static {p0, p1, v2}, Landroidx/core/app/AppOpsManagerCompat;->noteProxyOpNoThrow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    :goto_2
    if-nez p0, :cond_6

    :goto_3
    return v0

    :cond_6
    const/4 p0, -0x2

    return p0
.end method

.method public static h(Lx63/f;)V
    .locals 0

    invoke-interface {p0}, Lx63/f;->dispose()V

    return-void
.end method

.method public static final i(Lb9/b;)Lud/f;
    .locals 5

    new-instance v0, Lq/f;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq/f;-><init>(IZ)V

    :goto_0
    invoke-virtual {p0}, Lb9/b;->t()Lb9/b;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object p0, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    const-string v1, ""

    if-nez p0, :cond_0

    iput-object v1, v0, Lq/f;->x:Ljava/lang/Object;

    :cond_0
    iget-object p0, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast p0, Lug/b;

    if-nez p0, :cond_1

    sget-object p0, Lug/b;->x:Lt9/p;

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4}, Lt9/p;->n(IJ)Lug/b;

    move-result-object p0

    iput-object p0, v0, Lq/f;->y:Ljava/lang/Object;

    :cond_1
    iget-object p0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_2

    iput-object v1, v0, Lq/f;->z:Ljava/lang/Object;

    :cond_2
    iget-object p0, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_3

    iput-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    :cond_3
    new-instance p0, Lud/f;

    invoke-direct {p0, v0}, Lud/f;-><init>(Lq/f;)V

    return-object p0

    :cond_4
    invoke-virtual {v1}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_a

    :sswitch_0
    const-string v4, "SecretAccessKey"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_a

    :cond_5
    :try_start_0
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_1
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "expected (string: `com.amazonaws.sts#accessKeySecretType`)"

    invoke-static {v3, v4}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    iput-object v3, v0, Lq/f;->z:Ljava/lang/Object;

    goto/16 :goto_a

    :sswitch_1
    const-string v4, "Expiration"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_a

    :cond_7
    :try_start_1
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v3

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_3
    sget-object v4, Lug/t;->w:Lug/t;

    instance-of v4, v3, Ll83/m;

    if-nez v4, :cond_8

    :try_start_2
    check-cast v3, Ljava/lang/String;

    sget-object v4, Lug/b;->x:Lt9/p;

    invoke-static {v3}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v3

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :cond_8
    :goto_4
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v3, "expected (timestamp: `com.amazonaws.sts#dateType`)"

    invoke-static {v3, v4}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Lug/b;

    iput-object v3, v0, Lq/f;->y:Ljava/lang/Object;

    goto :goto_a

    :sswitch_2
    const-string v4, "AccessKeyId"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_a

    :cond_a
    :try_start_3
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v3

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_6
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_b

    goto :goto_7

    :cond_b
    const-string v3, "expected (string: `com.amazonaws.sts#accessKeyIdType`)"

    invoke-static {v3, v4}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_7
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    iput-object v3, v0, Lq/f;->x:Ljava/lang/Object;

    goto :goto_a

    :sswitch_3
    const-string v4, "SessionToken"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_a

    :cond_c
    :try_start_4
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v3

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_8
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_d

    goto :goto_9

    :cond_d
    const-string v3, "expected (string: `com.amazonaws.sts#tokenType`)"

    invoke-static {v3, v4}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_9
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    iput-object v3, v0, Lq/f;->E:Ljava/lang/Object;

    :goto_a
    invoke-virtual {v1}, Lb9/b;->j()V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x1fb936dd -> :sswitch_3
        0x24c04cb6 -> :sswitch_2
        0x44e726cf -> :sswitch_1
        0x514dd56b -> :sswitch_0
    .end sparse-switch
.end method

.method public static final j(ZIIFFFF)Landroidx/compose/ui/Modifier;
    .locals 2

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    if-nez p0, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    int-to-float p0, v1

    invoke-static {v0, p5, p0, p6, p4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    if-ne p1, p2, :cond_2

    int-to-float p0, v1

    invoke-static {v0, p5, p3, p6, p0}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {v0, p5, p3, p6, p4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    int-to-float p0, v1

    invoke-static {v0, p5, p0, p6, p0}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lwm/j;Z)Lin/c;
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lnn/h;->c:Llive/hms/video/factories/c;

    :goto_0
    new-instance v1, Led3/a;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Led3/a;-><init>(I)V

    const/4 v3, 0x0

    move-object v4, v0

    move v5, v3

    :goto_1
    :try_start_0
    iget-object v6, v1, Led3/a;->a:[B

    invoke-interface {p0, v6, v3, v2}, Lwm/j;->p([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1, v3}, Led3/a;->K(I)V

    invoke-virtual {v1}, Led3/a;->A()I

    move-result v6

    const v7, 0x494433

    if-eq v6, v7, :cond_1

    goto :goto_3

    :cond_1
    const/4 v6, 0x3

    invoke-virtual {v1, v6}, Led3/a;->L(I)V

    invoke-virtual {v1}, Led3/a;->w()I

    move-result v6

    add-int/lit8 v7, v6, 0xa

    if-nez v4, :cond_2

    new-array v4, v7, [B

    iget-object v8, v1, Led3/a;->a:[B

    invoke-static {v8, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {p0, v4, v2, v6}, Lwm/j;->p([BII)V

    new-instance v6, Lnn/h;

    invoke-direct {v6, p1}, Lnn/h;-><init>(Lnn/g;)V

    invoke-virtual {v6, v7, v4}, Lnn/h;->f0(I[B)Lin/c;

    move-result-object v4

    goto :goto_2

    :cond_2
    invoke-interface {p0, v6}, Lwm/j;->i(I)V

    :goto_2
    add-int/2addr v5, v7

    goto :goto_1

    :catch_0
    :goto_3
    invoke-interface {p0}, Lwm/j;->e()V

    invoke-interface {p0, v5}, Lwm/j;->i(I)V

    if-eqz v4, :cond_4

    iget-object p0, v4, Lin/c;->w:[Lin/b;

    array-length p0, p0

    if-nez p0, :cond_3

    goto :goto_4

    :cond_3
    return-object v4

    :cond_4
    :goto_4
    return-object v0
.end method

.method public static s(Led3/a;)Lso/q;
    .locals 10

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Led3/a;->L(I)V

    invoke-virtual {p0}, Led3/a;->A()I

    move-result v0

    iget v1, p0, Led3/a;->b:I

    int-to-long v1, v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    div-int/lit8 v0, v0, 0x12

    new-array v3, v0, [J

    new-array v4, v0, [J

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    invoke-virtual {p0}, Led3/a;->p()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    goto :goto_1

    :cond_0
    aput-wide v6, v3, v5

    invoke-virtual {p0}, Led3/a;->p()J

    move-result-wide v6

    aput-wide v6, v4, v5

    const/4 v6, 0x2

    invoke-virtual {p0, v6}, Led3/a;->L(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, Led3/a;->b:I

    int-to-long v5, v0

    sub-long/2addr v1, v5

    long-to-int v0, v1

    invoke-virtual {p0, v0}, Led3/a;->L(I)V

    new-instance p0, Lso/q;

    invoke-direct {p0, v3, v4}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final u(Lt20/g;Lt20/b;)Lt20/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, p1, v1}, Lt20/g;->b(Lt20/g;ZLt20/b;I)Lt20/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract f(Landroid/view/View;I)I
.end method

.method public abstract g(Landroid/view/View;I)I
.end method

.method public k(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public abstract o(I)V
.end method

.method public abstract p(Landroid/view/View;II)V
.end method

.method public abstract q(Landroid/view/View;FF)V
.end method

.method public abstract t(Landroid/view/View;I)Z
.end method

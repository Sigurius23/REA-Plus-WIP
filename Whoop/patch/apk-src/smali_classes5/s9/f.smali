.class public abstract Ls9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final A(C)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toUpperCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    const/16 v2, 0x149

    if-ne p0, v2, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "substring(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toTitleCase(C)C

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lt20/c;Lx30/i1;Lx30/n1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v0, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move/from16 v12, p10

    move-object/from16 v8, p9

    check-cast v8, Lp1/q;

    const v4, -0x6615eabe

    invoke-virtual {v8, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v12, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_1
    move v4, v12

    :goto_1
    and-int/lit8 v6, v12, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v12, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    goto :goto_5

    :cond_7
    move-object/from16 v6, p3

    :goto_5
    and-int/lit16 v7, v12, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_6

    :cond_8
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v4, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v12

    if-nez v7, :cond_b

    move-object/from16 v7, p5

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v4, v9

    goto :goto_8

    :cond_b
    move-object/from16 v7, p5

    :goto_8
    const/high16 v9, 0x180000

    and-int/2addr v9, v12

    if-nez v9, :cond_e

    const/high16 v9, 0x200000

    and-int/2addr v9, v12

    if-nez v9, :cond_c

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_9

    :cond_c
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_9
    if-eqz v9, :cond_d

    const/high16 v9, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v9, 0x80000

    :goto_a
    or-int/2addr v4, v9

    :cond_e
    const/high16 v9, 0xc00000

    and-int/2addr v9, v12

    if-nez v9, :cond_11

    const/high16 v9, 0x1000000

    and-int/2addr v9, v12

    if-nez v9, :cond_f

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_b

    :cond_f
    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_b
    if-eqz v9, :cond_10

    const/high16 v9, 0x800000

    goto :goto_c

    :cond_10
    const/high16 v9, 0x400000

    :goto_c
    or-int/2addr v4, v9

    :cond_11
    const/high16 v9, 0x6000000

    and-int/2addr v9, v12

    const/high16 v13, 0x4000000

    if-nez v9, :cond_13

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    move v9, v13

    goto :goto_d

    :cond_12
    const/high16 v9, 0x2000000

    :goto_d
    or-int/2addr v4, v9

    :cond_13
    move/from16 v19, v4

    const v4, 0x2492493

    and-int v4, v19, v4

    const v9, 0x2492492

    if-ne v4, v9, :cond_15

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_12

    :cond_15
    :goto_e
    const/4 v4, 0x0

    move v9, v13

    new-array v13, v4, [Ljava/lang/Object;

    const v14, 0x6e0e567c

    invoke-virtual {v8, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v14, v15, :cond_16

    new-instance v14, Lsr2/v;

    const/16 v9, 0x19

    invoke-direct {v14, v9}, Lsr2/v;-><init>(I)V

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v14, Lc93/a;

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const/16 v17, 0xc00

    const/16 v18, 0x6

    move-object v9, v15

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v8

    move-object v8, v9

    const/high16 v9, 0x4000000

    invoke-static/range {v13 .. v18}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v14, v16

    check-cast v13, Lp1/c1;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const-string v9, "TEST_TAG_ACCOUNT_DETAILS"

    invoke-static {v15, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v1, v14, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-eqz v2, :cond_17

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_f
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {v4, v14, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x7f1410f6

    invoke-static {v14, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    int-to-float v2, v2

    const/16 v25, 0x7

    sget-object v20, Lb2/t;->w:Lb2/t;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v24, v2

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v22, v24

    const/16 v17, 0x30

    const/16 v18, 0x4

    const/4 v15, 0x0

    move-object/from16 v16, v13

    move-object v13, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v14

    move-object v14, v2

    invoke-static/range {v13 .. v18}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    const v2, -0x27f0d5ed

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1a

    if-ne v4, v8, :cond_1b

    :cond_1a
    new-instance v4, Lo0/i;

    const/16 v2, 0x16

    invoke-direct {v4, v2, v1}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lc93/a;

    const/4 v2, 0x0

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    shr-int/lit8 v5, v19, 0x9

    and-int/lit8 v5, v5, 0xe

    shr-int/lit8 v9, v19, 0x3

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v5, v9

    shr-int/lit8 v13, v19, 0x6

    and-int/lit16 v15, v13, 0x380

    or-int/2addr v5, v15

    and-int/lit16 v9, v13, 0x1c00

    or-int/2addr v9, v5

    move-object v5, v4

    move v4, v3

    move-object v3, v6

    move-object v6, v7

    move-object v7, v5

    move-object v5, v14

    move-object v14, v8

    move-object v8, v5

    move-object/from16 v5, p4

    invoke-static/range {v3 .. v9}, Ls9/f;->e(Ljava/lang/String;ZLjava/lang/String;Lt20/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move v3, v4

    const v4, -0x27f0cbad

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_1d

    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit8 v6, v13, 0xe

    or-int/lit16 v6, v6, 0x1c0

    shr-int/lit8 v7, v19, 0xf

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v7, v6

    invoke-static {v3, v0, v4, v8, v7}, Ls2/d;->i(ZLx30/i1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    if-nez v10, :cond_1c

    goto :goto_10

    :cond_1c
    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3, v10, v4, v8, v6}, Ls3/d;->c(ZLx30/n1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_1d
    :goto_10
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_23

    if-eqz v5, :cond_23

    const v6, 0x6e0ee915

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1e

    if-ne v7, v14, :cond_1f

    :cond_1e
    new-instance v7, Lo0/i;

    const/16 v6, 0x17

    invoke-direct {v7, v6, v1}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v7, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    const v1, 0x6e0ef354

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0xe000000

    and-int v1, v19, v1

    const/high16 v9, 0x4000000

    if-ne v1, v9, :cond_20

    goto :goto_11

    :cond_20
    move v4, v2

    :goto_11
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_21

    if-ne v1, v14, :cond_22

    :cond_21
    new-instance v1, Lry2/g;

    const/4 v4, 0x6

    invoke-direct {v1, v11, v4}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v1, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-static {v5, v7, v1, v8, v15}, Ls9/f;->b(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :cond_23
    :goto_12
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_24

    new-instance v0, Lb30/n1;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object v8, v10

    move-object v9, v11

    move v10, v12

    invoke-direct/range {v0 .. v10}, Lb30/n1;-><init>(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lt20/c;Lx30/i1;Lx30/n1;Lc93/a;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method public static final b(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p3

    check-cast v7, Lp1/q;

    const p3, 0x1d2433ad

    invoke-virtual {v7, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    const/4 v0, 0x4

    if-nez p3, :cond_1

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr p3, v1

    :cond_5
    and-int/lit16 v1, p3, 0x93

    const/16 v3, 0x92

    if-ne v1, v3, :cond_7

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_7
    :goto_4
    const v1, 0x7f1410bf

    invoke-static {v7, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f140fbd

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f1410db

    invoke-static {v7, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f140fd2

    invoke-static {v7, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x50ad5028

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, p3, 0xe

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v6, v0, :cond_8

    move v10, v8

    goto :goto_5

    :cond_8
    move v10, v9

    :goto_5
    and-int/lit8 p3, p3, 0x70

    if-ne p3, v2, :cond_9

    move p3, v8

    goto :goto_6

    :cond_9
    move p3, v9

    :goto_6
    or-int/2addr p3, v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez p3, :cond_a

    if-ne v2, v10, :cond_b

    :cond_a
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/d;

    const/4 p3, 0x1

    invoke-direct {v2, p3, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/d;-><init>(ILc93/a;Lc93/a;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lc93/a;

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    const p3, 0x50ad5bea

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    if-ne v6, v0, :cond_c

    goto :goto_7

    :cond_c
    move v8, v9

    :goto_7
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez v8, :cond_d

    if-ne p3, v10, :cond_e

    :cond_d
    new-instance p3, Lry2/g;

    const/4 v0, 0x5

    invoke-direct {p3, p1, v0}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v7, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v6, p3

    check-cast v6, Lc93/a;

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    const/16 v8, 0x6000

    move-object v0, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v2

    move-object v2, v4

    const/4 v4, 0x1

    invoke-static/range {v0 .. v8}, Ls30/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_f

    new-instance v0, Lt20/o;

    invoke-direct {v0, p1, p2, p0, p4}, Lt20/o;-><init>(Lc93/a;Lc93/a;Ljava/lang/String;I)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final c(JLc93/a;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 36

    move-wide/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x349574fb

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1, v2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    move-object/from16 v14, p2

    if-nez v7, :cond_3

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v11, v5}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_9

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_9
    :goto_5
    sget-object v7, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->e:Ll0/h;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const v10, 0x7f070572

    invoke-static {v11, v10}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result v10

    const/4 v12, 0x0

    const/4 v15, 0x1

    invoke-static {v9, v12, v10, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v10

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v10, 0x36

    invoke-static {v8, v7, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v20, Lx20/y;->a:F

    const/16 v21, 0x7

    sget-object v22, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v22

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v7

    iget-wide v7, v7, Ld40/n;->h:J

    const/4 v10, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const v7, 0x7f1410fe

    invoke-static {v11, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v8

    iget-object v8, v8, Lg1/h9;->d:Ll3/v0;

    sget v26, Lx20/y;->b:F

    const/16 v27, 0x7

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v33, v22

    move/from16 v32, v26

    new-instance v10, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v10, v12}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0xfdfc

    move-object/from16 v27, v8

    move-object v8, v9

    move-object/from16 v19, v10

    const-wide/16 v9, 0x0

    move-object/from16 v28, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v20

    move/from16 v22, v21

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v29

    const/16 v29, 0x30

    const/4 v3, 0x4

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    and-int/lit8 v7, v0, 0xe

    shr-int/lit8 v8, v0, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    const v8, -0x43e6bbc5

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    const v9, 0xca10674

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v9, v7, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v15, 0x0

    if-le v9, v3, :cond_d

    invoke-virtual {v11, v1, v2}, Lp1/q;->f(J)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    and-int/lit8 v7, v7, 0x6

    if-ne v7, v3, :cond_f

    :cond_e
    const/4 v3, 0x1

    goto :goto_7

    :cond_f
    move v3, v15

    :goto_7
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_10

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_11

    :cond_10
    invoke-static {v1, v2}, Lkotlin/time/Duration;->getInWholeMinutes-impl(J)J

    move-result-wide v9

    invoke-static {v1, v2}, Lkotlin/time/Duration;->getSecondsComponent-impl(J)I

    move-result v3

    invoke-static {v1, v2}, Lkotlin/time/Duration;->getNanosecondsComponent-impl(J)I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x2

    invoke-static {v7, v3}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ":"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v8, v5, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Ljava/lang/String;

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static {v11}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->i:Ll3/v0;

    iget-object v3, v3, Ll3/v0;->a:Ll3/m0;

    iget-wide v8, v3, Ll3/m0;->b:J

    invoke-static {v8, v9}, Lv63/c;->a(J)V

    const-wide v12, 0xff00000000L

    and-long/2addr v12, v8

    const v3, 0x3fa66666    # 1.3f

    invoke-static {v8, v9, v12, v13, v3}, Ld13/a;->d(JJF)J

    move-result-wide v20

    const/16 v25, 0x0

    const/16 v27, 0x7

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v26, v32

    move-object/from16 v22, v33

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v3, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v3, v9}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x1f9fc

    move/from16 v26, v9

    const-wide/16 v9, 0x0

    move-object/from16 v28, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x30

    move-object/from16 v19, v3

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    sget-object v14, Lx20/e;->a:Lx1/b;

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    const/high16 v3, 0x30000000

    or-int v16, v0, v3

    const/16 v17, 0x1fe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v7, p2

    move-object/from16 v15, v28

    invoke-static/range {v7 .. v17}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v15

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lbr2/g;

    const/4 v7, 0x5

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Lbr2/g;-><init>(JLjava/lang/Object;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final d(ZLg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x4bd56829

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    and-int/lit8 v7, v6, 0x40

    if-nez v7, :cond_2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_7

    and-int/lit16 v7, v6, 0x200

    if-nez v7, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_4

    :cond_5
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_4
    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_a

    and-int/lit16 v7, v6, 0x1000

    if-nez v7, :cond_8

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_6

    :cond_8
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_6
    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_7

    :cond_9
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v0, v7

    :cond_a
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_c

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x4000

    goto :goto_8

    :cond_b
    const/16 v7, 0x2000

    :goto_8
    or-int/2addr v0, v7

    :cond_c
    and-int/lit16 v0, v0, 0x2493

    const/16 v7, 0x2492

    if-ne v0, v7, :cond_e

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v15, v2

    move v2, v1

    goto/16 :goto_e

    :cond_e
    :goto_9
    iget-object v0, v2, Lg40/e;->b:Ln53/e;

    const/4 v15, 0x0

    invoke-static {v0, v12, v15}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v9, v15

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->F:Lb2/m;

    invoke-static {v9, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_b

    :cond_10
    move-object/from16 v16, v0

    :goto_b
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v7, v10, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    invoke-static {v1, v12, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v12, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v15, 0x0

    new-array v0, v15, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f140fcc

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/h1;

    new-instance v1, Lb30/j5;

    move/from16 v2, p0

    move-object/from16 v15, p1

    invoke-direct {v1, v2, v15, v3}, Lb30/j5;-><init>(ZLg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    const v9, 0x561dc989

    invoke-static {v9, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v13, 0x6000

    const/16 v14, 0xc

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v16, v8

    move-object v8, v0

    invoke-static/range {v7 .. v14}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    const v0, -0x19d0129e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    if-nez v4, :cond_15

    goto :goto_d

    :cond_15
    iget-object v0, v4, Lg40/v2;->b:Lg40/u2;

    const/16 v1, 0xc

    int-to-float v1, v1

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v7, 0x38

    invoke-static {v0, v1, v12, v7}, Lio/sentry/config/a;->l(Lg40/u2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_d
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v12, v1, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lb30/j2;

    const/16 v7, 0xe

    move v1, v2

    move-object v2, v15

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(ZLg40/z2;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final e(Ljava/lang/String;ZLjava/lang/String;Lt20/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v7, p6

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v0, -0x78f947a1

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    move/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move/from16 v3, p1

    :goto_3
    and-int/lit16 v4, v7, 0x180

    move-object/from16 v5, p2

    if-nez v4, :cond_5

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v7, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_5

    :cond_6
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v6, v7, 0x6000

    if-nez v6, :cond_9

    move-object/from16 v6, p4

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_7

    :cond_8
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v0, v8

    goto :goto_8

    :cond_9
    move-object/from16 v6, p4

    :goto_8
    and-int/lit16 v8, v0, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_b

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_9

    :cond_a
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_b
    :goto_9
    sget-object v8, Ld40/r;->g:Lp1/u2;

    invoke-virtual {v15, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld40/h;

    const v9, -0x7706535a

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    const/4 v9, 0x0

    if-ne v0, v2, :cond_c

    const/4 v0, 0x1

    goto :goto_a

    :cond_c
    move v0, v9

    :goto_a
    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_d

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_f

    :cond_d
    sget-object v0, Ld40/h;->x:Ld40/h;

    if-ne v8, v0, :cond_e

    const v0, 0x7f080819

    goto :goto_b

    :cond_e
    const v0, 0x7f080818

    :goto_b
    invoke-static {v0, v1}, Lt20/j;->a(ILjava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move v3, v0

    new-instance v0, Lt20/q;

    move-object v2, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v2

    move/from16 v2, p1

    invoke-direct/range {v0 .. v6}, Lt20/q;-><init>(Lc93/a;ZILjava/lang/String;Ljava/lang/String;Lt20/c;)V

    const v1, 0x6c4432e4

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const v16, 0x30006

    const/16 v17, 0x1e

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v17}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lb30/j2;

    const/16 v7, 0xd

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final f(Lt20/g;Ls20/a;ZZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Lx30/i1;Lx30/n1;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v0, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v3, p15

    move/from16 v4, p17

    move/from16 v5, p18

    const-string v12, "state"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v1, Lt20/g;->x:Ljava/lang/String;

    iget-object v13, v1, Lt20/g;->z:Lt20/b;

    move-object/from16 v16, v12

    const-string v12, "formArgs"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "nameController"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "emailController"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "phoneController"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "addressController"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "saveForFutureUseElement"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onRemoveAccount"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p16

    check-cast v12, Lp1/q;

    move-object/from16 v17, v13

    const v13, -0xf8f10a9

    invoke-virtual {v12, v13}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v13, v4, 0x6

    const/16 v18, 0x2

    const/16 v19, 0x4

    if-nez v13, :cond_2

    and-int/lit8 v13, v4, 0x8

    if-nez v13, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    :goto_0
    if-eqz v13, :cond_1

    move/from16 v13, v19

    goto :goto_1

    :cond_1
    move/from16 v13, v18

    :goto_1
    or-int/2addr v13, v4

    goto :goto_2

    :cond_2
    move v13, v4

    :goto_2
    and-int/lit8 v20, v4, 0x30

    const/16 v21, 0x20

    if-nez v20, :cond_5

    and-int/lit8 v20, v4, 0x40

    if-nez v20, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    goto :goto_3

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    :goto_3
    if-eqz v20, :cond_4

    move/from16 v20, v21

    goto :goto_4

    :cond_4
    const/16 v20, 0x10

    :goto_4
    or-int v13, v13, v20

    :cond_5
    and-int/lit16 v1, v4, 0x180

    const/16 v20, 0x80

    const/16 v22, 0x100

    if-nez v1, :cond_7

    move/from16 v1, p2

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_6

    move/from16 v23, v22

    goto :goto_5

    :cond_6
    move/from16 v23, v20

    :goto_5
    or-int v13, v13, v23

    goto :goto_6

    :cond_7
    move/from16 v1, p2

    :goto_6
    and-int/lit16 v1, v4, 0xc00

    const/16 v23, 0x400

    const/16 v24, 0x800

    if-nez v1, :cond_9

    move/from16 v1, p3

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_8

    move/from16 v25, v24

    goto :goto_7

    :cond_8
    move/from16 v25, v23

    :goto_7
    or-int v13, v13, v25

    goto :goto_8

    :cond_9
    move/from16 v1, p3

    :goto_8
    and-int/lit16 v1, v4, 0x6000

    const/16 v25, 0x2000

    const/16 v26, 0x4000

    if-nez v1, :cond_b

    move/from16 v1, p4

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v27

    if-eqz v27, :cond_a

    move/from16 v27, v26

    goto :goto_9

    :cond_a
    move/from16 v27, v25

    :goto_9
    or-int v13, v13, v27

    goto :goto_a

    :cond_b
    move/from16 v1, p4

    :goto_a
    const/high16 v27, 0x30000

    and-int v28, v4, v27

    const/high16 v29, 0x10000

    const/high16 v30, 0x20000

    if-nez v28, :cond_d

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    move/from16 v28, v30

    goto :goto_b

    :cond_c
    move/from16 v28, v29

    :goto_b
    or-int v13, v13, v28

    :cond_d
    const/high16 v28, 0x180000

    and-int v28, v4, v28

    if-nez v28, :cond_f

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_e

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_e
    const/high16 v28, 0x80000

    :goto_c
    or-int v13, v13, v28

    :cond_f
    const/high16 v28, 0xc00000

    and-int v28, v4, v28

    const/high16 v31, 0x1000000

    if-nez v28, :cond_12

    and-int v28, v4, v31

    if-nez v28, :cond_10

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    goto :goto_d

    :cond_10
    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    :goto_d
    if-eqz v28, :cond_11

    const/high16 v28, 0x800000

    goto :goto_e

    :cond_11
    const/high16 v28, 0x400000

    :goto_e
    or-int v13, v13, v28

    :cond_12
    const/high16 v28, 0x6000000

    and-int v28, v4, v28

    if-nez v28, :cond_15

    const/high16 v28, 0x8000000

    and-int v28, v4, v28

    if-nez v28, :cond_13

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    goto :goto_f

    :cond_13
    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    :goto_f
    if-eqz v28, :cond_14

    const/high16 v28, 0x4000000

    goto :goto_10

    :cond_14
    const/high16 v28, 0x2000000

    :goto_10
    or-int v13, v13, v28

    :cond_15
    const/high16 v28, 0x30000000

    and-int v28, v4, v28

    const/high16 v32, 0x40000000    # 2.0f

    if-nez v28, :cond_18

    and-int v28, v4, v32

    if-nez v28, :cond_16

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    goto :goto_11

    :cond_16
    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    :goto_11
    if-eqz v28, :cond_17

    const/high16 v28, 0x20000000

    goto :goto_12

    :cond_17
    const/high16 v28, 0x10000000

    :goto_12
    or-int v13, v13, v28

    :cond_18
    and-int/lit8 v28, v5, 0x6

    if-nez v28, :cond_1b

    and-int/lit8 v28, v5, 0x8

    if-nez v28, :cond_19

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    goto :goto_13

    :cond_19
    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    :goto_13
    if-eqz v28, :cond_1a

    move/from16 v18, v19

    :cond_1a
    or-int v18, v5, v18

    goto :goto_14

    :cond_1b
    move/from16 v18, v5

    :goto_14
    and-int/lit8 v19, v5, 0x30

    if-nez v19, :cond_1e

    and-int/lit8 v19, v5, 0x40

    if-nez v19, :cond_1c

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    goto :goto_15

    :cond_1c
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    :goto_15
    if-eqz v19, :cond_1d

    goto :goto_16

    :cond_1d
    const/16 v21, 0x10

    :goto_16
    or-int v18, v18, v21

    :cond_1e
    and-int/lit16 v0, v5, 0x180

    if-nez v0, :cond_21

    and-int/lit16 v0, v5, 0x200

    if-nez v0, :cond_1f

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_17

    :cond_1f
    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_17
    if-eqz v0, :cond_20

    move/from16 v20, v22

    :cond_20
    or-int v18, v18, v20

    :cond_21
    and-int/lit16 v0, v5, 0xc00

    if-nez v0, :cond_23

    invoke-virtual {v12, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    move/from16 v23, v24

    :cond_22
    or-int v18, v18, v23

    :cond_23
    and-int/lit16 v0, v5, 0x6000

    if-nez v0, :cond_25

    move/from16 v0, p14

    invoke-virtual {v12, v0}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_24

    move/from16 v25, v26

    :cond_24
    or-int v18, v18, v25

    goto :goto_18

    :cond_25
    move/from16 v0, p14

    :goto_18
    and-int v19, v5, v27

    if-nez v19, :cond_27

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_26

    move/from16 v29, v30

    :cond_26
    or-int v18, v18, v29

    :cond_27
    const v19, 0x12492493

    and-int v0, v13, v19

    const v1, 0x12492492

    if-ne v0, v1, :cond_29

    const v0, 0x12493

    and-int v0, v18, v0

    const v1, 0x12492

    if-ne v0, v1, :cond_29

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_19

    :cond_28
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v11, v12

    goto/16 :goto_21

    :cond_29
    :goto_19
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v1, v2, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-eqz v3, :cond_2a

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1a
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_2b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    :cond_2b
    invoke-static {v2, v12, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v13, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x40

    and-int/lit8 v1, v13, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v18, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v2, v13, 0x1c00

    or-int/2addr v0, v2

    shr-int/lit8 v2, v13, 0x3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v14, 0x200000

    or-int/2addr v0, v14

    const/high16 v15, 0x380000

    and-int v3, v2, v15

    or-int/2addr v0, v3

    or-int v0, v0, v31

    const/high16 v20, 0x1c00000

    and-int v3, v2, v20

    or-int/2addr v0, v3

    sget v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v0, v3

    const/high16 v21, 0xe000000

    and-int v2, v2, v21

    or-int/2addr v0, v2

    or-int v0, v0, v32

    shl-int/lit8 v2, v18, 0x1b

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    move v2, v13

    move v13, v0

    move-object/from16 v0, v16

    move/from16 v16, v14

    move-object/from16 v14, v17

    move/from16 v17, v2

    move-object/from16 v3, p1

    move/from16 v2, p2

    move/from16 v5, p3

    move/from16 v4, p14

    invoke-static/range {v2 .. v13}, Ls9/f;->g(ZLs20/a;ZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Landroidx/compose/runtime/Composer;I)V

    move-object v11, v12

    const v2, 0x6f9f8615

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    if-nez v14, :cond_2d

    move-object/from16 v22, v3

    :goto_1b
    const/4 v1, 0x0

    goto :goto_1d

    :cond_2d
    const/16 v2, 0x10

    int-to-float v5, v2

    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v22, v3

    iget-object v5, v14, Lt20/b;->x:Ljava/lang/String;

    iget-object v6, v14, Lt20/b;->y:Ljava/lang/String;

    if-eqz v0, :cond_2e

    new-instance v3, Lt20/c;

    iget-boolean v4, v14, Lt20/b;->H:Z

    invoke-direct {v3, v0, v4}, Lt20/c;-><init>(Ljava/lang/String;Z)V

    move-object v7, v3

    goto :goto_1c

    :cond_2e
    move-object v7, v13

    :goto_1c
    shr-int/lit8 v3, v17, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    or-int/2addr v1, v3

    or-int v1, v1, v16

    shl-int/lit8 v3, v18, 0xf

    and-int v4, v3, v15

    or-int/2addr v1, v4

    or-int v1, v1, v31

    and-int v3, v3, v20

    or-int/2addr v1, v3

    shl-int/lit8 v3, v18, 0x9

    and-int v3, v3, v21

    or-int v12, v1, v3

    move/from16 v3, p4

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move/from16 v4, p14

    move-object/from16 v10, p15

    invoke-static/range {v2 .. v12}, Ls9/f;->a(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lt20/c;Lx30/i1;Lx30/n1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1b

    :goto_1d
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    if-eqz v0, :cond_2f

    if-eqz v14, :cond_30

    iget-boolean v1, v14, Lt20/b;->H:Z

    if-nez v1, :cond_30

    :cond_2f
    move-object/from16 v1, p0

    goto :goto_1e

    :cond_30
    move-object/from16 v1, p0

    iget-boolean v2, v1, Lt20/g;->w:Z

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_31

    const v2, 0x7f14106f

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v13

    goto :goto_1e

    :cond_31
    const v2, 0x7f141070

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v13

    :goto_1e
    const v0, 0x6f9fd268

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    if-nez v13, :cond_32

    :goto_1f
    const/4 v0, 0x0

    goto :goto_20

    :cond_32
    invoke-static {v13, v11}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xc

    int-to-float v5, v2

    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, v22

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v0, v2, v11, v3}, Ls9/f;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1f

    :goto_20
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_21
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_33

    move-object v2, v0

    new-instance v0, Lt20/p;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v33, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v18}, Lt20/p;-><init>(Lt20/g;Ls20/a;ZZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Lx30/i1;Lx30/n1;Landroidx/compose/ui/Modifier;ZLc93/a;II)V

    move-object/from16 v2, v33

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method public static final g(ZLs20/a;ZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v0, p3

    move-object/from16 v5, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    move-object/from16 v14, p8

    move-object/from16 v15, p9

    move/from16 v4, p11

    sget-object v6, Lb2/e;->F:Lb2/m;

    move-object/from16 v8, p10

    check-cast v8, Lp1/q;

    const v7, -0x2c2cfbfb

    invoke-virtual {v8, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_1
    move v7, v4

    :goto_1
    and-int/lit8 v9, v4, 0x30

    if-nez v9, :cond_4

    and-int/lit8 v9, v4, 0x40

    if-nez v9, :cond_2

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_3

    :cond_3
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v7, v9

    :cond_4
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v7, v9

    :cond_6
    and-int/lit16 v9, v4, 0xc00

    if-nez v9, :cond_8

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v7, v9

    :cond_8
    and-int/lit16 v9, v4, 0x6000

    if-nez v9, :cond_a

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x4000

    goto :goto_6

    :cond_9
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v7, v9

    :cond_a
    const/high16 v9, 0x30000

    and-int/2addr v9, v4

    if-nez v9, :cond_c

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v7, v9

    :cond_c
    const/high16 v9, 0x180000

    and-int/2addr v9, v4

    if-nez v9, :cond_f

    const/high16 v9, 0x200000

    and-int/2addr v9, v4

    if-nez v9, :cond_d

    invoke-virtual {v8, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_8

    :cond_d
    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_8
    if-eqz v9, :cond_e

    const/high16 v9, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v9, 0x80000

    :goto_9
    or-int/2addr v7, v9

    :cond_f
    const/high16 v9, 0xc00000

    and-int/2addr v9, v4

    if-nez v9, :cond_12

    const/high16 v9, 0x1000000

    and-int/2addr v9, v4

    if-nez v9, :cond_10

    invoke-virtual {v8, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_a

    :cond_10
    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_a
    if-eqz v9, :cond_11

    const/high16 v9, 0x800000

    goto :goto_b

    :cond_11
    const/high16 v9, 0x400000

    :goto_b
    or-int/2addr v7, v9

    :cond_12
    const/high16 v9, 0x6000000

    and-int/2addr v9, v4

    if-nez v9, :cond_15

    const/high16 v9, 0x8000000

    and-int/2addr v9, v4

    if-nez v9, :cond_13

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_c

    :cond_13
    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_c
    if-eqz v9, :cond_14

    const/high16 v9, 0x4000000

    goto :goto_d

    :cond_14
    const/high16 v9, 0x2000000

    :goto_d
    or-int/2addr v7, v9

    :cond_15
    const/high16 v9, 0x30000000

    and-int/2addr v9, v4

    if-nez v9, :cond_18

    const/high16 v9, 0x40000000    # 2.0f

    and-int/2addr v9, v4

    if-nez v9, :cond_16

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_e

    :cond_16
    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_e
    if-eqz v9, :cond_17

    const/high16 v9, 0x20000000

    goto :goto_f

    :cond_17
    const/high16 v9, 0x10000000

    :goto_f
    or-int/2addr v7, v9

    :cond_18
    move/from16 v22, v7

    const v7, 0x12492493

    and-int v7, v22, v7

    const v9, 0x12492492

    if-ne v7, v9, :cond_1a

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v13, v2

    goto/16 :goto_1c

    :cond_1a
    :goto_10
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-string v7, "TEST_TAG_BILLING_DETAILS"

    invoke-static {v10, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v0, Lb2/e;->M:Lb2/k;

    const/4 v1, 0x0

    invoke-static {v10, v0, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v1, v8, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_1b

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_1c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1d

    :cond_1c
    invoke-static {v1, v8, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p3, :cond_1e

    const v7, -0x463ae332

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    const v7, 0x7f141093

    invoke-static {v8, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_12
    move-object/from16 v16, v7

    goto :goto_13

    :cond_1e
    const/4 v12, 0x0

    const v7, -0x4639586e

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    const v7, 0x7f1410c7

    invoke-static {v8, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    const/16 v20, 0x0

    const/16 v21, 0x6

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v8

    invoke-static/range {v16 .. v21}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    if-eqz p0, :cond_20

    move-object/from16 v13, p1

    iget-object v7, v13, Ls20/a;->i:Lh20/l1;

    iget-object v7, v7, Lh20/l1;->w:Lh20/k1;

    sget-object v12, Lh20/k1;->y:Lh20/k1;

    if-ne v7, v12, :cond_1f

    :goto_14
    const/4 v7, 0x1

    goto :goto_15

    :cond_1f
    const/4 v7, 0x0

    goto :goto_15

    :cond_20
    move-object/from16 v13, p1

    iget-object v7, v13, Ls20/a;->i:Lh20/l1;

    iget-object v7, v7, Lh20/l1;->w:Lh20/k1;

    sget-object v12, Lh20/k1;->x:Lh20/k1;

    if-eq v7, v12, :cond_1f

    goto :goto_14

    :goto_15
    const v12, 0x5fe5c11

    invoke-virtual {v8, v12}, Lp1/q;->e0(I)V

    if-eqz v7, :cond_24

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v16, v9

    const/4 v7, 0x0

    int-to-float v9, v7

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object/from16 v23, v6

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_21

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_21
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v8, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_22

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    :cond_22
    invoke-static {v6, v8, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0x10

    int-to-float v7, v6

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v7

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v12, v16

    new-instance v9, Lb30/x2;

    invoke-direct {v9, v5, v3}, Lb30/x2;-><init>(Lg40/m3;Z)V

    const v15, 0x4107b485

    invoke-static {v15, v8, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    shr-int/lit8 v15, v22, 0x9

    and-int/lit8 v15, v15, 0x70

    or-int/lit16 v15, v15, 0x6006

    move-object/from16 v16, v10

    const/16 v10, 0xc

    move/from16 v17, v6

    const/4 v6, 0x0

    move-object v11, v4

    move-object v4, v7

    move-object v7, v9

    move v9, v15

    move-object/from16 v3, v16

    move-object/from16 v15, v23

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static/range {v4 .. v10}, Lg40/j4;->e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_17
    const/4 v7, 0x0

    goto :goto_18

    :cond_24
    move-object v11, v4

    move-object v15, v6

    move-object v12, v9

    move-object v3, v10

    const/high16 v14, 0x3f800000    # 1.0f

    goto :goto_17

    :goto_18
    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const v4, 0x5feadd0

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    iget-object v4, v13, Ls20/a;->i:Lh20/l1;

    iget-object v5, v4, Lh20/l1;->y:Lh20/k1;

    sget-object v6, Lh20/k1;->x:Lh20/k1;

    if-eq v5, v6, :cond_28

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v7

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_25

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_25
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v8, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_26

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    :cond_26
    invoke-static {v7, v8, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x10

    int-to-float v1, v0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v1

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v2, Lb30/j5;

    const/4 v3, 0x4

    move/from16 v11, p2

    move-object/from16 v5, p5

    move-object/from16 v14, p8

    invoke-direct {v2, v5, v11, v14, v3}, Lb30/j5;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v3, 0x185e902e

    invoke-static {v3, v8, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    shr-int/lit8 v2, v22, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/lit16 v9, v2, 0x6006

    const/16 v10, 0xc

    const/4 v6, 0x0

    move-object/from16 v24, v4

    move-object v4, v1

    move-object/from16 v1, v24

    invoke-static/range {v4 .. v10}, Lg40/j4;->e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    goto :goto_1a

    :cond_28
    move/from16 v11, p2

    move-object/from16 v14, p8

    move-object v1, v4

    move-object/from16 v16, v12

    const/16 v0, 0x10

    :goto_1a
    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const v2, 0x5ff1cce

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    iget-object v2, v1, Lh20/l1;->x:Lh20/k1;

    sget-object v3, Lh20/k1;->y:Lh20/k1;

    const/4 v9, 0x6

    if-ne v2, v3, :cond_2a

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    const/4 v2, 0x7

    move v5, v2

    goto :goto_1b

    :cond_29
    move v5, v9

    :goto_1b
    int-to-float v2, v0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v2, v22, 0x6

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0xc40

    shr-int/lit8 v3, v22, 0xf

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    move-object/from16 v4, p6

    move-object v7, v8

    move v3, v11

    move v8, v2

    invoke-static/range {v3 .. v8}, Ls9/f;->i(ZLg40/z1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v7

    :cond_2a
    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const v2, 0x5ff58f8

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    iget-object v1, v1, Lh20/l1;->z:Lh20/j1;

    sget-object v2, Lh20/j1;->y:Lh20/j1;

    if-ne v1, v2, :cond_2b

    int-to-float v0, v0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shr-int/lit8 v0, v22, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x6040

    shr-int/lit8 v1, v22, 0x12

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/2addr v2, v9

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    or-int/lit16 v0, v0, 0x1000

    and-int/lit16 v1, v1, 0x1c00

    or-int v9, v0, v1

    move/from16 v3, p2

    move-object/from16 v4, p7

    move-object/from16 v6, p9

    move-object v5, v14

    invoke-static/range {v3 .. v9}, Ls9/f;->d(ZLg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_2b
    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2c

    new-instance v0, Lj00/a0;

    move/from16 v1, p0

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move-object v2, v13

    invoke-direct/range {v0 .. v11}, Lj00/a0;-><init>(ZLs20/a;ZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, -0x3141fc33

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v21, v2

    goto :goto_4

    :cond_5
    :goto_3
    new-instance v4, Li20/l0;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v5}, Li20/l0;-><init>(Lc93/a;I)V

    const v5, 0x6712692

    invoke-static {v5, v2, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    sget-object v20, Lx20/e;->d:Lx1/b;

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0x180

    const/high16 v23, 0xc00000

    const v24, 0x1fffa

    const/4 v1, 0x0

    move/from16 v22, v3

    const/4 v3, 0x0

    move-object/from16 v21, v2

    move-object v2, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v0 .. v24}, Lg1/g5;->a(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;III)V

    :goto_4
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lv90/e;

    const/16 v3, 0x10

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v4, v0, v5, v3}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final i(ZLg40/z1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p4

    check-cast v5, Lp1/q;

    const p4, 0x2c725057

    invoke-virtual {v5, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x6

    if-nez p4, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->h(Z)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_4

    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_2

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_2
    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p4, v0

    :cond_4
    and-int/lit16 v0, p5, 0x180

    if-nez v0, :cond_6

    invoke-virtual {v5, p2}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x100

    goto :goto_4

    :cond_5
    const/16 v0, 0x80

    :goto_4
    or-int/2addr p4, v0

    :cond_6
    and-int/lit16 v0, p5, 0xc00

    if-nez v0, :cond_8

    invoke-virtual {v5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x800

    goto :goto_5

    :cond_7
    const/16 v0, 0x400

    :goto_5
    or-int/2addr p4, v0

    :cond_8
    and-int/lit16 v0, p4, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_a

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object p4, p3

    goto/16 :goto_8

    :cond_a
    :goto_6
    iget-object v0, p1, Lg40/z1;->n:Ln53/e;

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v1

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->F:Lb2/m;

    invoke-static {v3, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v3, v5, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg40/h1;

    new-instance v0, Lt20/r;

    invoke-direct {v0, p2, p1, p0}, Lt20/r;-><init>(ILg40/z1;Z)V

    const v2, -0x9fbf365

    invoke-static {v2, v5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    shr-int/lit8 p4, p4, 0x3

    and-int/lit16 p4, p4, 0x380

    or-int/lit16 v6, p4, 0x6006

    const/16 v7, 0x8

    const/4 v0, 0x0

    const/4 v3, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v7}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object p4, v2

    const/4 p3, 0x1

    invoke-virtual {v5, p3}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    move p3, p2

    move-object p2, p1

    move p1, p0

    new-instance p0, Lsl0/t1;

    invoke-direct/range {p0 .. p5}, Lsl0/t1;-><init>(ZLg40/z1;ILandroidx/compose/ui/Modifier;I)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final j(Lx20/p;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x5764cf92

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, p4

    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_2

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    :cond_2
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_3

    or-int/lit16 v0, v0, 0x180

    goto :goto_3

    :cond_3
    invoke-virtual {v7, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_2

    :cond_4
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    if-ne v6, v8, :cond_6

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_8

    :cond_6
    :goto_4
    if-eqz v4, :cond_7

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object v5, v4

    goto :goto_5

    :cond_7
    move-object v5, p2

    :goto_5
    iget-object v4, p0, Lx20/p;->c:Lx20/o;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v9, 0x0

    if-eqz v4, :cond_a

    const/4 v6, 0x1

    if-eq v4, v6, :cond_a

    const/4 v6, 0x3

    if-eq v4, v3, :cond_9

    if-ne v4, v6, :cond_8

    goto :goto_6

    :cond_8
    const v0, 0x304f0c8

    invoke-static {v0, v7, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_9
    const v3, 0x5d9ed082

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    shr-int/2addr v0, v6

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v5, p1, v7, v0}, Ls9/f;->h(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    :goto_6
    const v3, 0x5d9ade58

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    iget-wide v2, p0, Lx20/p;->a:J

    iget v6, p0, Lx20/p;->b:I

    and-int/lit16 v8, v0, 0x3f0

    move-object v4, p1

    invoke-static/range {v2 .. v8}, Ls9/f;->c(JLc93/a;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    :goto_7
    move-object v3, v5

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lwr0/f;

    const/16 v6, 0x8

    move-object v1, p0

    move-object v2, p1

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final k(Lx20/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x5ddd1bd3

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    or-int/lit8 v0, v0, 0x30

    and-int/lit8 v0, v0, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_2

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v7, p1

    move-object v3, v8

    goto/16 :goto_2

    :cond_2
    :goto_1
    sget-object v0, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lx20/w;->z:Lec3/h2;

    const/4 v9, 0x0

    invoke-static {v1, v8, v9}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    const v3, 0x304af97

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_3

    if-ne v4, v5, :cond_4

    :cond_3
    new-instance v4, Lum0/b;

    const/16 v3, 0x1c

    invoke-direct {v4, v3, p0, v0}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-static {v0, v4, v8}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lx20/p;

    const v0, 0x304d1d9

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    if-ne v1, v5, :cond_6

    :cond_5
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v1, 0x0

    const-class v3, Lx20/w;

    const-string v4, "handleCancel"

    const-string v5, "handleCancel()V"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_6
    check-cast v1, Lj93/g;

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    check-cast v1, Lc93/a;

    const v0, 0x3f2b851f    # 0.67f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v8

    move-object v0, v10

    invoke-static/range {v0 .. v5}, Ls9/f;->j(Lx20/p;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lpp2/o;

    const/16 v2, 0x1c

    invoke-direct {v1, p0, v7, p3, v2}, Lpp2/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x41d8579d

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v0, p0

    move-object v1, p1

    goto :goto_2

    :cond_2
    :goto_1
    and-int/lit8 v6, p2, 0x7e

    const/16 v7, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, Lj00/m;

    const/4 p2, 0x2

    invoke-direct {p1, v0, v1, p3, p2}, Lj00/m;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final n(Ls20/a;Lt20/n;Lc93/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p6

    const-string v5, "formArgs"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "usBankAccountFormArgs"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onCompleted"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v5, -0x15613d58

    invoke-virtual {v11, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x4

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_3

    :cond_3
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_3
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_4

    :cond_4
    const/16 v7, 0x10

    :goto_4
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v4, 0xc00

    move-object/from16 v13, p3

    if-nez v7, :cond_9

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v5, v7

    :cond_9
    and-int/lit16 v7, v4, 0x6000

    if-nez v7, :cond_b

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x4000

    goto :goto_7

    :cond_a
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v5, v7

    :cond_b
    and-int/lit16 v7, v5, 0x2493

    const/16 v9, 0x2492

    if-ne v7, v9, :cond_d

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_d
    :goto_8
    iget-object v7, v0, Lt20/n;->m:Lg40/z;

    const v9, -0x9bc50a6

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v12, v5, 0x70

    const/4 v14, 0x0

    if-eq v12, v8, :cond_f

    and-int/lit8 v8, v5, 0x40

    if-eqz v8, :cond_e

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    goto :goto_9

    :cond_e
    move v8, v14

    goto :goto_a

    :cond_f
    :goto_9
    const/4 v8, 0x1

    :goto_a
    and-int/lit8 v9, v5, 0xe

    if-eq v9, v6, :cond_11

    and-int/lit8 v6, v5, 0x8

    if-eqz v6, :cond_10

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_b

    :cond_10
    move v6, v14

    goto :goto_c

    :cond_11
    :goto_b
    const/4 v6, 0x1

    :goto_c
    or-int/2addr v6, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_12

    if-ne v8, v9, :cond_13

    :cond_12
    new-instance v8, Ls51/f;

    const/16 v6, 0xd

    invoke-direct {v8, v6, v0, v1}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lc93/a;

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v6, v9

    new-instance v9, Ln20/t;

    invoke-direct {v9, v7, v8}, Ln20/t;-><init>(Lg40/z;Lc93/a;)V

    const v7, 0x671a9c9b

    invoke-virtual {v11, v7}, Lp1/q;->f0(I)V

    invoke-static {v11}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v7

    if-eqz v7, :cond_1a

    instance-of v8, v7, Landroidx/lifecycle/r;

    if-eqz v8, :cond_14

    move-object v8, v7

    check-cast v8, Landroidx/lifecycle/r;

    invoke-interface {v8}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v8

    :goto_d
    move-object v10, v8

    goto :goto_e

    :cond_14
    sget-object v8, Ll8/a;->b:Ll8/a;

    goto :goto_d

    :goto_e
    const-class v8, Lt20/w;

    sget-object v15, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v15, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move-object v15, v6

    move-object v6, v8

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object v6

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    check-cast v6, Lt20/w;

    iget-object v7, v6, Lt20/w;->Z:Ln53/e;

    invoke-static {v7, v11, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v7

    iget-object v8, v6, Lt20/w;->U:Lec3/f2;

    invoke-static {v8, v11, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    iget-object v9, v6, Lt20/w;->S:Lg40/h;

    invoke-interface {v9}, Lg40/h;->g()Lec3/f2;

    move-result-object v9

    invoke-static {v9, v11, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v9

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lt20/g;

    iget-boolean v14, v10, Lt20/g;->y:Z

    if-eqz v14, :cond_15

    iget-object v10, v10, Lt20/g;->z:Lt20/b;

    if-nez v10, :cond_15

    const/4 v10, 0x1

    goto :goto_f

    :cond_15
    const/4 v10, 0x0

    :goto_f
    if-nez v10, :cond_16

    if-eqz v3, :cond_16

    const/4 v14, 0x1

    goto :goto_10

    :cond_16
    const/4 v14, 0x0

    :goto_10
    const/16 v10, 0x40

    or-int/2addr v10, v12

    and-int/lit16 v12, v5, 0x380

    or-int/2addr v10, v12

    invoke-static {v6, v0, v2, v11, v10}, Ls6/a;->a(Lt20/w;Lt20/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt20/g;

    iget-boolean v2, v0, Lt20/n;->a:Z

    iget-boolean v3, v0, Lt20/n;->g:Z

    iget-boolean v4, v0, Lt20/n;->e:Z

    iget-object v10, v6, Lt20/w;->K:Lg40/f3;

    iget-object v12, v6, Lt20/w;->M:Lg40/f3;

    move-object v0, v7

    iget-object v7, v6, Lt20/w;->P:Lg40/z1;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg40/e;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-object/from16 v24, v10

    iget-object v10, v6, Lt20/w;->R:Lg40/v2;

    move-object/from16 p5, v0

    iget-object v0, v6, Lt20/w;->V:Lx30/i1;

    move-object/from16 v25, v12

    iget-object v12, v6, Lt20/w;->X:Lx30/n1;

    move-object/from16 v26, v0

    const v0, -0x9baf443

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v16, v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v16, :cond_17

    if-ne v0, v15, :cond_18

    :cond_17
    new-instance v16, Li20/d;

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v17, 0x0

    const-class v19, Lt20/w;

    const-string v20, "reset"

    const-string v21, "reset(Lcom/stripe/android/core/strings/ResolvableString;)V"

    move-object/from16 v18, v6

    invoke-direct/range {v16 .. v23}, Li20/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v15, v0

    check-cast v15, Lc93/a;

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    shl-int/lit8 v0, v5, 0x3

    and-int/lit8 v0, v0, 0x70

    const v6, 0x9000048

    or-int/2addr v0, v6

    sget v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v6, v6, 0x1b

    or-int v17, v0, v6

    and-int/lit16 v0, v5, 0x1c00

    const/16 v5, 0x248

    or-int v18, v5, v0

    move-object v0, v9

    move-object v9, v8

    move-object v8, v0

    move-object/from16 v0, p5

    move-object/from16 v16, v11

    move-object/from16 v5, v24

    move-object/from16 v6, v25

    move-object/from16 v11, v26

    invoke-static/range {v0 .. v18}, Ls9/f;->f(Lt20/g;Ls20/a;ZZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Lx30/i1;Lx30/n1;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    :goto_11
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lb30/j2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/j2;-><init>(Ls20/a;Lt20/n;Lc93/a;Landroidx/compose/ui/Modifier;ZI)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x21

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p2, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p3, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, v3, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0, p1, p2, p3, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public static r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z
    .locals 2

    instance-of v0, p0, Lv00/p0;

    if-nez v0, :cond_5

    instance-of v0, p0, Lv00/n0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of p0, p0, Lv00/o0;

    if-eqz p0, :cond_4

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v1

    iget-object v1, v1, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;
    .locals 4

    instance-of v0, p0, Lv00/p0;

    if-eqz v0, :cond_0

    check-cast p0, Lv00/p0;

    invoke-virtual {p0, p2, p4}, Lv00/p0;->h(Lv00/c0;Lv00/m0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lv00/n0;

    if-eqz v0, :cond_1

    check-cast p0, Lv00/n0;

    invoke-interface {p0, p2, p4}, Lv00/n0;->h(Lv00/c0;Lv00/m0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lv00/o0;

    if-eqz v0, :cond_5

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v3

    iget-object v3, v3, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    if-eqz v0, :cond_4

    check-cast p0, Lv00/o0;

    new-instance p1, Lty/c;

    const/4 p3, 0x2

    invoke-direct {p1, p4, p3}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0, p2, v0, p1, p4}, Lv00/o0;->j(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;Lv00/m0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;
    .locals 4

    iget-object v0, p2, Lv00/c0;->V:Lq20/c;

    instance-of v1, p0, Lv00/p0;

    if-eqz v1, :cond_0

    check-cast p0, Lv00/p0;

    invoke-virtual {p0, p2}, Lv00/p0;->l(Lv00/c0;)Lu00/f;

    move-result-object p0

    invoke-virtual {p0, v0}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v1, p0, Lv00/n0;

    if-eqz v1, :cond_1

    check-cast p0, Lv00/n0;

    invoke-interface {p0, p4, v0}, Lv00/n0;->d(ZLq20/c;)Lt00/a;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p4, p0, Lv00/o0;

    if-eqz p4, :cond_5

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    const/4 v1, 0x0

    if-eqz p4, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v2, p4

    check-cast v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v3

    iget-object v3, v3, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object p4, v1

    :goto_0
    check-cast p4, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    if-eqz p4, :cond_4

    check-cast p0, Lv00/o0;

    invoke-interface {p0, p2, p4, v0}, Lv00/o0;->c(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lq20/c;)Lt00/a;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static u(Lxa3/k;)Z
    .locals 0

    invoke-interface {p0}, Lxa3/k;->g()Lxa3/a;

    move-result-object p0

    iget-boolean p0, p0, Lxa3/a;->w:Z

    return p0
.end method

.method public static v(Lxa3/k;)Z
    .locals 0

    invoke-interface {p0}, Lxa3/k;->g()Lxa3/a;

    move-result-object p0

    iget-boolean p0, p0, Lxa3/a;->x:Z

    return p0
.end method

.method public static final w(Lve/f;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "AnonymousCredentialsProvider"

    :cond_0
    return-object p0
.end method

.method public static x(Lx8/n;)Ljava/util/ArrayList;
    .locals 29

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v20, v2

    goto/16 :goto_c

    :cond_1
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lx8/n;->G(I)V

    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v3

    const v4, 0x64666c38

    const/4 v5, 0x1

    if-ne v3, v4, :cond_3

    new-instance v3, Lx8/n;

    invoke-direct {v3}, Lx8/n;-><init>()V

    new-instance v4, Ljava/util/zip/Inflater;

    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    :try_start_0
    invoke-static {v0, v3, v4}, Lx8/t;->E(Lx8/n;Lx8/n;Ljava/util/zip/Inflater;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    return-object v2

    :cond_2
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    move-object v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    throw v0

    :cond_3
    const v4, 0x72617720

    if-eq v3, v4, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget v4, v0, Lx8/n;->b:I

    iget v6, v0, Lx8/n;->c:I

    :goto_2
    if-ge v4, v6, :cond_13

    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v7

    add-int/2addr v7, v4

    if-le v7, v4, :cond_0

    if-le v7, v6, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v4

    const v8, 0x6d657368

    if-ne v4, v8, :cond_12

    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v4

    const/16 v8, 0x2710

    if-le v4, v8, :cond_6

    :goto_3
    move/from16 v16, v1

    move-object v1, v2

    move-object/from16 v20, v1

    move/from16 v17, v5

    goto/16 :goto_a

    :cond_6
    new-array v8, v4, [F

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v4, :cond_7

    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    aput v11, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lx8/n;->g()I

    move-result v10

    const/16 v11, 0x7d00

    if-le v10, v11, :cond_8

    goto :goto_3

    :cond_8
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v13

    move/from16 v16, v1

    move-object v15, v2

    int-to-double v1, v4

    mul-double/2addr v1, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    div-double/2addr v1, v13

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    new-instance v2, Llo/s;

    move/from16 v17, v5

    iget-object v5, v0, Lx8/n;->a:[B

    array-length v9, v5

    move-wide/from16 v18, v11

    const/4 v11, 0x5

    const/4 v12, 0x0

    invoke-direct {v2, v5, v9, v11, v12}, Llo/s;-><init>([BIIB)V

    iget v5, v0, Lx8/n;->b:I

    const/16 v9, 0x8

    mul-int/2addr v5, v9

    invoke-virtual {v2, v5}, Llo/s;->q(I)V

    mul-int/lit8 v5, v10, 0x5

    new-array v5, v5, [F

    new-array v12, v11, [I

    move-object/from16 v20, v15

    const/4 v15, 0x0

    const/16 v21, 0x0

    :goto_5
    if-ge v15, v10, :cond_c

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v11, :cond_b

    aget v23, v12, v9

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v24

    shr-int/lit8 v25, v24, 0x1

    and-int/lit8 v11, v24, 0x1

    neg-int v11, v11

    xor-int v11, v25, v11

    add-int v11, v11, v23

    if-ge v11, v4, :cond_a

    if-gez v11, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 v23, v21, 0x1

    aget v24, v8, v11

    aput v24, v5, v21

    aput v11, v12, v9

    add-int/lit8 v9, v9, 0x1

    move/from16 v21, v23

    const/4 v11, 0x5

    goto :goto_6

    :cond_a
    :goto_7
    move-object/from16 v1, v20

    goto/16 :goto_a

    :cond_b
    add-int/lit8 v15, v15, 0x1

    const/16 v9, 0x8

    const/4 v11, 0x5

    goto :goto_5

    :cond_c
    invoke-virtual {v2}, Llo/s;->g()I

    move-result v1

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    invoke-virtual {v2, v1}, Llo/s;->q(I)V

    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v4

    new-array v8, v4, [Lno/f;

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v4, :cond_10

    const/16 v11, 0x8

    invoke-virtual {v2, v11}, Llo/s;->i(I)I

    move-result v22

    invoke-virtual {v2, v11}, Llo/s;->i(I)I

    move-result v25

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v12

    const v15, 0x1f400

    if-le v12, v15, :cond_d

    goto :goto_7

    :cond_d
    move-object v15, v2

    int-to-double v1, v10

    mul-double v1, v1, v18

    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    div-double/2addr v1, v13

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    mul-int/lit8 v2, v12, 0x3

    new-array v2, v2, [F

    mul-int/lit8 v11, v12, 0x2

    new-array v11, v11, [F

    move-object/from16 v23, v2

    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_9
    if-ge v2, v12, :cond_f

    invoke-virtual {v15, v1}, Llo/s;->i(I)I

    move-result v24

    shr-int/lit8 v26, v24, 0x1

    move/from16 v27, v1

    and-int/lit8 v1, v24, 0x1

    neg-int v1, v1

    xor-int v1, v26, v1

    add-int v1, v1, v21

    if-ltz v1, :cond_a

    if-lt v1, v10, :cond_e

    goto :goto_7

    :cond_e
    mul-int/lit8 v21, v2, 0x3

    mul-int/lit8 v24, v1, 0x5

    aget v26, v5, v24

    aput v26, v23, v21

    add-int/lit8 v26, v21, 0x1

    add-int/lit8 v28, v24, 0x1

    aget v28, v5, v28

    aput v28, v23, v26

    add-int/lit8 v21, v21, 0x2

    add-int/lit8 v26, v24, 0x2

    aget v26, v5, v26

    aput v26, v23, v21

    mul-int/lit8 v21, v2, 0x2

    add-int/lit8 v26, v24, 0x3

    aget v26, v5, v26

    aput v26, v11, v21

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v24, v24, 0x4

    aget v24, v5, v24

    aput v24, v11, v21

    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v1

    move/from16 v1, v27

    goto :goto_9

    :cond_f
    new-instance v21, Lno/f;

    const/16 v26, 0x1

    move-object/from16 v24, v11

    invoke-direct/range {v21 .. v26}, Lno/f;-><init>(I[F[FII)V

    aput-object v21, v8, v9

    add-int/lit8 v9, v9, 0x1

    move-object v2, v15

    const/16 v1, 0x20

    goto/16 :goto_8

    :cond_10
    new-instance v1, Ls9/d;

    invoke-direct {v1, v8}, Ls9/d;-><init>([Lno/f;)V

    :goto_a
    if-nez v1, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    move/from16 v16, v1

    move-object/from16 v20, v2

    move/from16 v17, v5

    :goto_b
    invoke-virtual {v0, v7}, Lx8/n;->F(I)V

    move v4, v7

    move/from16 v1, v16

    move/from16 v5, v17

    move-object/from16 v2, v20

    goto/16 :goto_2

    :goto_c
    return-object v20

    :cond_13
    return-object v3
.end method

.method public static z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;
    .locals 4

    instance-of v0, p0, Lv00/p0;

    if-eqz v0, :cond_0

    check-cast p0, Lv00/p0;

    invoke-virtual {p0, p1}, Lv00/p0;->l(Lv00/c0;)Lu00/f;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lv00/n0;

    if-eqz v0, :cond_1

    check-cast p0, Lv00/n0;

    invoke-interface {p0}, Lv00/n0;->e()Lu00/f;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lv00/o0;

    if-eqz v0, :cond_5

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v3

    iget-object v3, v3, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    if-eqz v0, :cond_4

    check-cast p0, Lv00/o0;

    invoke-interface {p0, p1, v0}, Lv00/o0;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public p(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public abstract q(Ljava/lang/Object;)Z
.end method

.method public abstract y()Ljava/lang/Object;
.end method

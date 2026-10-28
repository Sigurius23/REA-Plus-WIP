.class public final Lg1/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Z

.field public final c:F

.field public final d:Ll0/k1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZFLl0/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/l4;->a:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lg1/l4;->b:Z

    iput p3, p0, Lg1/l4;->c:F

    iput-object p4, p0, Lg1/l4;->d:Ll0/k1;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 36

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v0, p2

    iget-object v1, v9, Lg1/l4;->d:Ll0/k1;

    invoke-interface {v1}, Ll0/k1;->a()F

    move-result v2

    invoke-interface {v10, v2}, Ly3/c;->F(F)I

    move-result v2

    const/16 v16, 0x0

    const/16 v17, 0xa

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v11, p3

    invoke-static/range {v11 .. v17}, Ly3/a;->b(JIIIII)J

    move-result-wide v3

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v8, v6, :cond_1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ly2/q0;

    invoke-static {v13}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Leading"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    :goto_1
    check-cast v12, Ly2/q0;

    if-eqz v12, :cond_2

    invoke-interface {v12, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    sget v8, Lg1/p8;->a:F

    if-eqz v6, :cond_3

    iget v8, v6, Ly2/j1;->w:I

    goto :goto_3

    :cond_3
    move v8, v7

    :goto_3
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v12

    move v13, v7

    :goto_4
    if-ge v13, v12, :cond_5

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ly2/q0;

    invoke-static {v15}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v15

    const-string v11, "Trailing"

    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_5
    const/4 v14, 0x0

    :goto_5
    check-cast v14, Ly2/q0;

    const/4 v11, 0x2

    if-eqz v14, :cond_6

    neg-int v12, v8

    invoke-static {v12, v7, v3, v4, v11}, Ly3/b;->j(IIJI)J

    move-result-wide v12

    invoke-interface {v14, v12, v13}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v12

    goto :goto_6

    :cond_6
    const/4 v12, 0x0

    :goto_6
    if-eqz v12, :cond_7

    iget v13, v12, Ly2/j1;->w:I

    goto :goto_7

    :cond_7
    move v13, v7

    :goto_7
    add-int/2addr v8, v13

    invoke-interface {v10}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v13

    invoke-interface {v1, v13}, Ll0/k1;->b(Ly3/m;)F

    move-result v13

    invoke-interface {v10, v13}, Ly3/c;->F(F)I

    move-result v13

    invoke-interface {v10}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v14

    invoke-interface {v1, v14}, Ll0/k1;->c(Ly3/m;)F

    move-result v14

    invoke-interface {v10, v14}, Ly3/c;->F(F)I

    move-result v14

    add-int/2addr v14, v13

    neg-int v8, v8

    sub-int v13, v8, v14

    neg-int v14, v14

    iget v15, v9, Lg1/l4;->c:F

    invoke-static {v15, v13, v14}, Le93/b;->P(FII)I

    move-result v13

    neg-int v2, v2

    invoke-static {v13, v3, v4, v2}, Ly3/b;->i(IJI)J

    move-result-wide v3

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v13

    move v14, v7

    :goto_8
    if-ge v14, v13, :cond_9

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v17, v15

    check-cast v17, Ly2/q0;

    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v7

    move/from16 v17, v11

    const-string v11, "Label"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 v14, v14, 0x1

    move/from16 v11, v17

    const/4 v7, 0x0

    goto :goto_8

    :cond_9
    move/from16 v17, v11

    const/4 v15, 0x0

    :goto_9
    check-cast v15, Ly2/q0;

    if-eqz v15, :cond_a

    invoke-interface {v15, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    goto :goto_a

    :cond_a
    const/4 v3, 0x0

    :goto_a
    if-eqz v3, :cond_b

    iget v4, v3, Ly2/j1;->w:I

    int-to-float v4, v4

    iget v7, v3, Ly2/j1;->x:I

    int-to-float v7, v7

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v13, v4

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    move-object v7, v1

    move v11, v2

    int-to-long v1, v4

    const/16 v4, 0x20

    shl-long/2addr v13, v4

    const-wide v18, 0xffffffffL

    and-long v1, v1, v18

    or-long/2addr v1, v13

    goto :goto_b

    :cond_b
    move-object v7, v1

    move v11, v2

    const-wide/16 v1, 0x0

    :goto_b
    new-instance v4, Lh2/e;

    invoke-direct {v4, v1, v2}, Lh2/e;-><init>(J)V

    iget-object v1, v9, Lg1/l4;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_c

    iget v1, v3, Ly2/j1;->x:I

    goto :goto_c

    :cond_c
    const/4 v1, 0x0

    :goto_c
    div-int/lit8 v1, v1, 0x2

    invoke-interface {v7}, Ll0/k1;->d()F

    move-result v2

    invoke-interface {v10, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int v2, v11, v1

    move-wide/from16 v13, p3

    invoke-static {v8, v13, v14, v2}, Ly3/b;->i(IJI)J

    move-result-wide v21

    const/16 v26, 0x0

    const/16 v27, 0xb

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v21 .. v27}, Ly3/a;->b(JIIIII)J

    move-result-wide v1

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_d
    const-string v7, "Collection contains no element matching the predicate."

    if-ge v5, v4, :cond_1d

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v11

    const-string v15, "TextField"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    invoke-interface {v8, v1, v2}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    const/16 v33, 0x0

    const/16 v34, 0xe

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-wide/from16 v28, v1

    invoke-static/range {v28 .. v34}, Ly3/a;->b(JIIIII)J

    move-result-wide v1

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v11, 0x0

    :goto_e
    if-ge v11, v8, :cond_e

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v17, v15

    check-cast v17, Ly2/q0;

    move-object/from16 v21, v4

    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v7

    const-string v7, "Hint"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_f

    :cond_d
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, v21

    move-object/from16 v7, v22

    goto :goto_e

    :cond_e
    move-object/from16 v21, v4

    move-object/from16 v22, v7

    const/4 v15, 0x0

    :goto_f
    check-cast v15, Ly2/q0;

    if-eqz v15, :cond_f

    invoke-interface {v15, v1, v2}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v11

    move-object v7, v11

    goto :goto_10

    :cond_f
    const/4 v7, 0x0

    :goto_10
    if-eqz v6, :cond_10

    iget v1, v6, Ly2/j1;->w:I

    move v11, v1

    goto :goto_11

    :cond_10
    const/4 v11, 0x0

    :goto_11
    if-eqz v12, :cond_11

    iget v1, v12, Ly2/j1;->w:I

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    iget v13, v5, Ly2/j1;->w:I

    if-eqz v3, :cond_12

    iget v2, v3, Ly2/j1;->w:I

    move v14, v2

    goto :goto_13

    :cond_12
    const/4 v14, 0x0

    :goto_13
    if-eqz v7, :cond_13

    iget v2, v7, Ly2/j1;->w:I

    move v15, v2

    goto :goto_14

    :cond_13
    const/4 v15, 0x0

    :goto_14
    invoke-interface {v10}, Ly3/c;->getDensity()F

    move-result v19

    iget-object v2, v9, Lg1/l4;->d:Ll0/k1;

    iget v4, v9, Lg1/l4;->c:F

    move-wide/from16 v17, p3

    move-object/from16 v20, v2

    move/from16 v16, v4

    move-object v4, v12

    move v12, v1

    invoke-static/range {v11 .. v20}, Lg1/j4;->e(IIIIIFJFLl0/k1;)I

    move-result v2

    if-eqz v6, :cond_14

    iget v1, v6, Ly2/j1;->x:I

    move v11, v1

    goto :goto_15

    :cond_14
    const/4 v11, 0x0

    :goto_15
    if-eqz v4, :cond_15

    iget v1, v4, Ly2/j1;->x:I

    move v12, v1

    goto :goto_16

    :cond_15
    const/4 v12, 0x0

    :goto_16
    iget v13, v5, Ly2/j1;->x:I

    if-eqz v3, :cond_16

    iget v1, v3, Ly2/j1;->x:I

    move v14, v1

    goto :goto_17

    :cond_16
    const/4 v14, 0x0

    :goto_17
    if-eqz v7, :cond_17

    iget v1, v7, Ly2/j1;->x:I

    move v15, v1

    goto :goto_18

    :cond_17
    const/4 v15, 0x0

    :goto_18
    invoke-interface {v10}, Ly3/c;->getDensity()F

    move-result v19

    iget-object v1, v9, Lg1/l4;->d:Ll0/k1;

    iget v8, v9, Lg1/l4;->c:F

    move-wide/from16 v17, p3

    move-object/from16 v20, v1

    move/from16 v16, v8

    invoke-static/range {v11 .. v20}, Lg1/j4;->d(IIIIIFJFLl0/k1;)I

    move-result v1

    invoke-interface/range {v21 .. v21}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v11, 0x0

    :goto_19
    if-ge v11, v8, :cond_1b

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly2/q0;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "border"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1a

    const v0, 0x7fffffff

    if-eq v2, v0, :cond_18

    move v8, v2

    goto :goto_1a

    :cond_18
    const/4 v8, 0x0

    :goto_1a
    if-eq v1, v0, :cond_19

    move v0, v1

    goto :goto_1b

    :cond_19
    const/4 v0, 0x0

    :goto_1b
    invoke-static {v8, v2, v0, v1}, Ly3/b;->a(IIII)J

    move-result-wide v13

    invoke-interface {v12, v13, v14}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    new-instance v0, Lg1/k4;

    move-object/from16 v35, v6

    move-object v6, v3

    move-object/from16 v3, v35

    invoke-direct/range {v0 .. v10}, Lg1/k4;-><init>(IILy2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Lg1/l4;Ly2/t0;)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-interface {v10, v2, v1, v3, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_1a
    move-object v12, v6

    move-object v6, v3

    move-object v3, v12

    move-object v12, v4

    add-int/lit8 v11, v11, 0x1

    move-object v4, v6

    move-object v6, v3

    move-object v3, v4

    move-object/from16 v9, p0

    move-object v4, v12

    goto :goto_19

    :cond_1b
    invoke-static/range {v22 .. v22}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1c
    move-object/from16 v28, v6

    move-object v6, v3

    move-object/from16 v3, v28

    move-wide/from16 v28, v1

    add-int/lit8 v5, v5, 0x1

    move-object v1, v6

    move-object v6, v3

    move-object v3, v1

    move-object/from16 v9, p0

    move-wide/from16 v13, p3

    move-wide/from16 v1, v28

    goto/16 :goto_d

    :cond_1d
    move-object/from16 v22, v7

    invoke-static/range {v22 .. v22}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 2

    new-instance v0, Ldw1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Ldw1/a;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lg1/l4;->f(Ly2/r;Ljava/util/List;ILc93/m;)I

    move-result p1

    return p1
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 2

    new-instance v0, Ldw1/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ldw1/a;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lg1/l4;->g(Ly2/r;Ljava/util/List;ILc93/m;)I

    move-result p1

    return p1
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 2

    new-instance v0, Ldw1/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Ldw1/a;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lg1/l4;->f(Ly2/r;Ljava/util/List;ILc93/m;)I

    move-result p1

    return p1
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 2

    new-instance v0, Ldw1/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ldw1/a;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lg1/l4;->g(Ly2/r;Ljava/util/List;ILc93/m;)I

    move-result p1

    return p1
.end method

.method public final f(Ly2/r;Ljava/util/List;ILc93/m;)I
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ly2/q0;

    invoke-static {v10}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "Leading"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    check-cast v9, Ly2/q0;

    const v5, 0x7fffffff

    if-eqz v9, :cond_4

    invoke-interface {v9, v5}, Ly2/q0;->Q(I)I

    move-result v7

    if-ne v2, v5, :cond_2

    move v7, v2

    goto :goto_2

    :cond_2
    sub-int v7, v2, v7

    if-gez v7, :cond_3

    move v7, v6

    :cond_3
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    goto :goto_3

    :cond_4
    move v7, v2

    move v9, v6

    :goto_3
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v10

    move v11, v6

    :goto_4
    if-ge v11, v10, :cond_6

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ly2/q0;

    invoke-static {v13}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Trailing"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_6
    move-object v12, v8

    :goto_5
    check-cast v12, Ly2/q0;

    if-eqz v12, :cond_9

    invoke-interface {v12, v5}, Ly2/q0;->Q(I)I

    move-result v10

    if-ne v7, v5, :cond_7

    goto :goto_6

    :cond_7
    sub-int/2addr v7, v10

    if-gez v7, :cond_8

    move v7, v6

    :cond_8
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v12, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move v10, v5

    goto :goto_7

    :cond_9
    move v10, v6

    :goto_7
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    move v11, v6

    :goto_8
    if-ge v11, v5, :cond_b

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ly2/q0;

    invoke-static {v13}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Label"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_b
    move-object v12, v8

    :goto_9
    check-cast v12, Ly2/q0;

    if-eqz v12, :cond_c

    iget v5, v0, Lg1/l4;->c:F

    invoke-static {v5, v7, v2}, Le93/b;->P(FII)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v12, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move v12, v2

    goto :goto_a

    :cond_c
    move v12, v6

    :goto_a
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v2

    move v5, v6

    :goto_b
    if-ge v5, v2, :cond_11

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Ly2/q0;

    invoke-static {v13}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "TextField"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v11, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v2

    move v4, v6

    :goto_c
    if-ge v4, v2, :cond_e

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ly2/q0;

    invoke-static {v13}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Hint"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    move-object v8, v5

    goto :goto_d

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_e
    :goto_d
    check-cast v8, Ly2/q0;

    if-eqz v8, :cond_f

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v8, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move v13, v1

    goto :goto_e

    :cond_f
    move v13, v6

    :goto_e
    const/16 v1, 0xf

    invoke-static {v6, v6, v1}, Ly3/b;->b(III)J

    move-result-wide v15

    invoke-interface/range {p1 .. p1}, Ly3/c;->getDensity()F

    move-result v17

    iget-object v1, v0, Lg1/l4;->d:Ll0/k1;

    iget v14, v0, Lg1/l4;->c:F

    move-object/from16 v18, v1

    invoke-static/range {v9 .. v18}, Lg1/j4;->d(IIIIIFJFLl0/k1;)I

    move-result v1

    return v1

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_11
    const-string v1, "Collection contains no element matching the predicate."

    invoke-static {v1}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method

.method public final g(Ly2/r;Ljava/util/List;ILc93/m;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_d

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "TextField"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v7, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    move v6, v5

    :goto_1
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ly2/q0;

    invoke-static {v10}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "Label"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    move-object v9, v7

    :goto_2
    check-cast v9, Ly2/q0;

    if-eqz v9, :cond_2

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v9, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move v9, v4

    goto :goto_3

    :cond_2
    move v9, v5

    :goto_3
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    move v6, v5

    :goto_4
    if-ge v6, v4, :cond_4

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ly2/q0;

    invoke-static {v11}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "Trailing"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_4
    move-object v10, v7

    :goto_5
    check-cast v10, Ly2/q0;

    if-eqz v10, :cond_5

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v10, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    goto :goto_6

    :cond_5
    move v4, v5

    :goto_6
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v6

    move v10, v5

    :goto_7
    if-ge v10, v6, :cond_7

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ly2/q0;

    invoke-static {v12}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Leading"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_8

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_7
    move-object v11, v7

    :goto_8
    check-cast v11, Ly2/q0;

    if-eqz v11, :cond_8

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v11, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    goto :goto_9

    :cond_8
    move v6, v5

    :goto_9
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v10, v5

    :goto_a
    if-ge v10, v3, :cond_a

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ly2/q0;

    invoke-static {v12}, Lg1/p8;->d(Ly2/q0;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Hint"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    move-object v7, v11

    goto :goto_b

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_a
    :goto_b
    check-cast v7, Ly2/q0;

    if-eqz v7, :cond_b

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v7, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move v10, v1

    goto :goto_c

    :cond_b
    move v10, v5

    :goto_c
    const/16 v1, 0xf

    invoke-static {v5, v5, v1}, Ly3/b;->b(III)J

    move-result-wide v12

    invoke-interface/range {p1 .. p1}, Ly3/c;->getDensity()F

    move-result v14

    iget-object v15, v0, Lg1/l4;->d:Ll0/k1;

    iget v11, v0, Lg1/l4;->c:F

    move v7, v4

    invoke-static/range {v6 .. v15}, Lg1/j4;->e(IIIIIFJFLl0/k1;)I

    move-result v1

    return v1

    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_d
    const-string v1, "Collection contains no element matching the predicate."

    invoke-static {v1}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method

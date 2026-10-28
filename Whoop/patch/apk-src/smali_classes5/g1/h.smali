.class public final Lg1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(FFI)V
    .locals 0

    iput p3, p0, Lg1/h;->a:I

    iput p1, p0, Lg1/h;->b:F

    iput p2, p0, Lg1/h;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p2, p3}, Ly3/c;->F(F)I

    move-result p2

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/e0;->w:I

    :cond_0
    invoke-static {p4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, p3, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget p0, p6, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p2, p6, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p0, p2

    iput p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p0, p8, Lkotlin/jvm/internal/e0;->w:I

    iget p1, p9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    iput p3, p9, Lkotlin/jvm/internal/e0;->w:I

    iput p3, p6, Lkotlin/jvm/internal/e0;->w:I

    return-void
.end method

.method public static final g(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p2, p3}, Ly3/c;->F(F)I

    move-result p2

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/e0;->w:I

    :cond_0
    invoke-static {p4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, p3, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget p0, p6, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p2, p6, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p0, p2

    iput p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p0, p8, Lkotlin/jvm/internal/e0;->w:I

    iget p1, p9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    iput p3, p9, Lkotlin/jvm/internal/e0;->w:I

    iput p3, p6, Lkotlin/jvm/internal/e0;->w:I

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v11, p2

    iget v1, v0, Lg1/h;->a:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/e0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/e0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/e0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    move-object v4, v11

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v4, 0x0

    move v13, v4

    :goto_0
    if-ge v13, v12, :cond_3

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    move-wide/from16 v14, p3

    invoke-interface {v4, v14, v15}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    move/from16 v17, v12

    iget v12, v0, Lg1/h;->b:F

    if-nez v16, :cond_0

    move-object/from16 v16, v1

    iget v1, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v12}, Ly3/c;->F(F)I

    move-result v18

    add-int v18, v18, v1

    iget v1, v4, Ly2/j1;->w:I

    add-int v1, v18, v1

    move-object/from16 v18, v2

    invoke-static {v14, v15}, Ly3/a;->i(J)I

    move-result v2

    if-gt v1, v2, :cond_1

    move-object/from16 v1, v16

    move-object/from16 v2, v18

    :cond_0
    move/from16 v19, v13

    move-object v13, v4

    goto :goto_1

    :cond_1
    move-object v1, v4

    iget v4, v0, Lg1/h;->c:F

    move/from16 v19, v13

    move-object/from16 v2, v18

    move-object v13, v1

    move-object/from16 v1, v16

    invoke-static/range {v1 .. v10}, Lg1/h;->g(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v12}, Ly3/c;->F(F)I

    move-result v12

    add-int/2addr v12, v4

    iput v12, v10, Lkotlin/jvm/internal/e0;->w:I

    :cond_2
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    iget v12, v13, Ly2/j1;->w:I

    add-int/2addr v4, v12

    iput v4, v10, Lkotlin/jvm/internal/e0;->w:I

    iget v4, v7, Lkotlin/jvm/internal/e0;->w:I

    iget v12, v13, Ly2/j1;->x:I

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v7, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v13, v19, 0x1

    move/from16 v12, v17

    goto :goto_0

    :cond_3
    move-wide/from16 v14, p3

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    iget v4, v0, Lg1/h;->c:F

    invoke-static/range {v1 .. v10}, Lg1/h;->g(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :cond_4
    iget v3, v9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v14, v15}, Ly3/a;->k(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v14, v15}, Ly3/a;->j(J)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    move-object/from16 v16, v1

    new-instance v1, Lg1/g;

    const/4 v7, 0x1

    iget v4, v0, Lg1/h;->b:F

    move-object/from16 v3, p1

    move-object v6, v8

    move-object/from16 v2, v16

    invoke-direct/range {v1 .. v7}, Lg1/g;-><init>(Ljava/util/ArrayList;Ly2/t0;FILjava/util/ArrayList;I)V

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v3, v5, v9, v2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-wide/from16 v14, p3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/e0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/e0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/e0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-static {v14, v15}, Ly3/a;->i(J)I

    move-result v4

    const/16 v12, 0xd

    const/4 v13, 0x0

    invoke-static {v4, v13, v12}, Ly3/b;->b(III)J

    move-result-wide v14

    move-object v4, v11

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v12

    :goto_2
    if-ge v13, v12, :cond_8

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    invoke-interface {v4, v14, v15}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    iget v11, v0, Lg1/h;->b:F

    if-nez v16, :cond_5

    move-object/from16 v16, v1

    iget v1, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v11}, Ly3/c;->F(F)I

    move-result v17

    add-int v17, v17, v1

    iget v1, v4, Ly2/j1;->w:I

    add-int v1, v17, v1

    move-object/from16 v17, v2

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v2

    if-gt v1, v2, :cond_6

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    :cond_5
    move/from16 v18, v12

    move-object v12, v4

    goto :goto_3

    :cond_6
    move-object v1, v4

    iget v4, v0, Lg1/h;->c:F

    move/from16 v18, v12

    move-object/from16 v2, v17

    move-object v12, v1

    move-object/from16 v1, v16

    invoke-static/range {v1 .. v10}, Lg1/h;->f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v11}, Ly3/c;->F(F)I

    move-result v11

    add-int/2addr v11, v4

    iput v11, v10, Lkotlin/jvm/internal/e0;->w:I

    :cond_7
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    iget v11, v12, Ly2/j1;->w:I

    add-int/2addr v4, v11

    iput v4, v10, Lkotlin/jvm/internal/e0;->w:I

    iget v4, v7, Lkotlin/jvm/internal/e0;->w:I

    iget v11, v12, Ly2/j1;->x:I

    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v7, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v11, p2

    move/from16 v12, v18

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    iget v4, v0, Lg1/h;->c:F

    invoke-static/range {v1 .. v10}, Lg1/h;->f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :cond_9
    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v3

    const v4, 0x7fffffff

    if-eq v3, v4, :cond_a

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v3

    :goto_4
    move v5, v3

    goto :goto_5

    :cond_a
    iget v3, v9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_4

    :goto_5
    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    move-object/from16 v16, v1

    new-instance v1, Lg1/g;

    const/4 v7, 0x0

    iget v4, v0, Lg1/h;->b:F

    move-object/from16 v3, p1

    move-object v6, v8

    move-object/from16 v2, v16

    invoke-direct/range {v1 .. v7}, Lg1/g;-><init>(Ljava/util/ArrayList;Ly2/t0;FILjava/util/ArrayList;I)V

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v3, v5, v9, v2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

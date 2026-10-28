.class public final Landroidx/compose/foundation/lazy/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La0/v0;

.field public b:Lab/h0;

.field public c:I

.field public final d:La0/w0;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:Lp0/v;

.field public final k:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La0/d1;->a:[J

    new-instance v0, La0/v0;

    invoke-direct {v0}, La0/v0;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    sget-object v0, La0/e1;->a:La0/w0;

    new-instance v0, La0/w0;

    invoke-direct {v0}, La0/w0;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->d:La0/w0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->i:Ljava/util/ArrayList;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;-><init>(Landroidx/compose/foundation/lazy/layout/b;)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->k:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static c(Lp0/e0;ILp0/w;)V
    .locals 10

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lp0/e0;->j(I)J

    move-result-wide v1

    invoke-interface {p0}, Lp0/e0;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    invoke-static {v0, p1, v1, v2, v3}, Ly3/j;->a(IIJI)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    invoke-static {p1, v0, v1, v2, v3}, Ly3/j;->a(IIJI)J

    move-result-wide v3

    :goto_0
    invoke-virtual {p2}, Lp0/w;->a()[Lp0/t;

    move-result-object p1

    array-length p2, p1

    move v5, v0

    :goto_1
    if-ge v0, p2, :cond_2

    aget-object v6, p1, v0

    add-int/lit8 v7, v5, 0x1

    if-eqz v6, :cond_1

    invoke-interface {p0, v5}, Lp0/e0;->j(I)J

    move-result-wide v8

    invoke-static {v8, v9, v1, v2}, Ly3/j;->c(JJ)J

    move-result-wide v8

    invoke-static {v3, v4, v8, v9}, Ly3/j;->d(JJ)J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Lp0/t;->n(J)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v5, v7

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static h([ILp0/e0;)I
    .locals 5

    invoke-interface {p1}, Lp0/e0;->k()I

    move-result v0

    invoke-interface {p1}, Lp0/e0;->f()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget v3, p0, v0

    invoke-interface {p1}, Lp0/e0;->g()I

    move-result v4

    add-int/2addr v4, v3

    aput v4, p0, v0

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)Lp0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    invoke-virtual {v0, p2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp0/w;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lp0/w;->a()[Lp0/t;

    move-result-object p2

    if-eqz p2, :cond_0

    aget-object p1, p2, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b()J
    .locals 13

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp0/t;

    invoke-virtual {v5}, Lp0/t;->d()Ll2/c;

    move-result-object v6

    if-eqz v6, :cond_0

    const/16 v7, 0x20

    shr-long v8, v2, v7

    long-to-int v8, v8

    invoke-virtual {v5}, Lp0/t;->e()J

    move-result-wide v9

    shr-long/2addr v9, v7

    long-to-int v9, v9

    iget-wide v10, v6, Ll2/c;->u:J

    shr-long/2addr v10, v7

    long-to-int v10, v10

    add-int/2addr v9, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    const-wide v9, 0xffffffffL

    and-long/2addr v2, v9

    long-to-int v2, v2

    invoke-virtual {v5}, Lp0/t;->e()J

    move-result-wide v11

    and-long/2addr v11, v9

    long-to-int v3, v11

    iget-wide v5, v6, Ll2/c;->u:J

    and-long/2addr v5, v9

    long-to-int v5, v5

    add-int/2addr v3, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v5, v8

    shl-long/2addr v5, v7

    int-to-long v2, v2

    and-long/2addr v2, v9

    or-long/2addr v2, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-wide v2
.end method

.method public final d(IIILjava/util/ArrayList;Lab/h0;La2/a;ZZIZIILbc3/c0;Li2/f0;)V
    .locals 45

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p9

    iget-object v7, v0, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    iput-object v5, v0, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    iget-object v11, v0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    if-ge v10, v8, :cond_2

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lp0/e0;

    invoke-interface {v12}, Lp0/e0;->b()I

    move-result v13

    move v14, v9

    :goto_1
    if-ge v14, v13, :cond_1

    invoke-interface {v12, v14}, Lp0/e0;->h(I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lp0/y;->h(Ljava/lang/Object;)Lp0/j;

    move-result-object v15

    if-eqz v15, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, La0/v0;->i()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    return-void

    :cond_3
    :goto_2
    iget v8, v0, Landroidx/compose/foundation/lazy/layout/b;->c:I

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp0/e0;

    if-eqz v10, :cond_4

    invoke-interface {v10}, Lp0/e0;->getIndex()I

    move-result v10

    goto :goto_3

    :cond_4
    move v10, v9

    :goto_3
    iput v10, v0, Landroidx/compose/foundation/lazy/layout/b;->c:I

    const/16 v10, 0x20

    if-eqz p7, :cond_5

    int-to-long v14, v9

    shl-long/2addr v14, v10

    const-wide v16, 0xffffffffL

    int-to-long v12, v1

    and-long v12, v12, v16

    or-long/2addr v12, v14

    goto :goto_4

    :cond_5
    const-wide v16, 0xffffffffL

    int-to-long v12, v1

    shl-long/2addr v12, v10

    int-to-long v14, v9

    and-long v14, v14, v16

    or-long/2addr v12, v14

    :goto_4
    if-nez p8, :cond_7

    if-nez p10, :cond_6

    goto :goto_5

    :cond_6
    move v14, v9

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v14, 0x1

    :goto_6
    iget-object v15, v11, La0/v0;->b:[Ljava/lang/Object;

    move/from16 v18, v10

    iget-object v10, v11, La0/v0;->a:[J

    array-length v1, v10

    const/4 v9, 0x2

    sub-int/2addr v1, v9

    const-wide/16 v19, 0x80

    const-wide/16 v21, 0xff

    const/16 v23, 0x7

    iget-object v9, v0, Landroidx/compose/foundation/lazy/layout/b;->d:La0/w0;

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 p10, v10

    move/from16 v27, v14

    if-ltz v1, :cond_b

    move-object/from16 v28, v15

    const/4 v10, 0x0

    :goto_7
    const/16 v26, 0x8

    aget-wide v14, p10, v10

    not-long v2, v14

    shl-long v2, v2, v23

    and-long/2addr v2, v14

    and-long v2, v2, v24

    cmp-long v2, v2, v24

    if-eqz v2, :cond_a

    sub-int v2, v10, v1

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    rsub-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_9

    and-long v29, v14, v21

    cmp-long v29, v29, v19

    if-gez v29, :cond_8

    shl-int/lit8 v29, v10, 0x3

    add-int v29, v29, v3

    move/from16 v30, v3

    aget-object v3, v28, v29

    invoke-virtual {v9, v3}, La0/w0;->a(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_8
    move/from16 v30, v3

    :goto_9
    shr-long v14, v14, v26

    add-int/lit8 v3, v30, 0x1

    goto :goto_8

    :cond_9
    move/from16 v3, v26

    if-ne v2, v3, :cond_b

    :cond_a
    if-eq v10, v1, :cond_b

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_b
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_a
    iget-object v3, v0, Landroidx/compose/foundation/lazy/layout/b;->i:Ljava/util/ArrayList;

    iget-object v14, v0, Landroidx/compose/foundation/lazy/layout/b;->f:Ljava/util/ArrayList;

    iget-object v15, v0, Landroidx/compose/foundation/lazy/layout/b;->e:Ljava/util/ArrayList;

    if-ge v2, v1, :cond_1b

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v10, v28

    check-cast v10, Lp0/e0;

    move/from16 v28, v1

    invoke-interface {v10}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v9, v1}, La0/w0;->l(Ljava/lang/Object;)Z

    invoke-interface {v10}, Lp0/e0;->b()I

    move-result v1

    move/from16 v35, v2

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v1, :cond_19

    invoke-interface {v10, v2}, Lp0/e0;->h(I)Ljava/lang/Object;

    move-result-object v29

    invoke-static/range {v29 .. v29}, Lp0/y;->h(Ljava/lang/Object;)Lp0/j;

    move-result-object v29

    if-eqz v29, :cond_18

    invoke-interface {v10}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v11, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v29, v1

    check-cast v29, Lp0/w;

    if-eqz v7, :cond_c

    invoke-interface {v10}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7, v1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result v1

    :goto_c
    const/4 v2, -0x1

    goto :goto_d

    :cond_c
    const/4 v1, -0x1

    goto :goto_c

    :goto_d
    if-ne v1, v2, :cond_d

    if-eqz v7, :cond_d

    const/4 v2, 0x1

    goto :goto_e

    :cond_d
    const/4 v2, 0x0

    :goto_e
    if-nez v29, :cond_12

    new-instance v3, Lp0/w;

    invoke-direct {v3, v0}, Lp0/w;-><init>(Landroidx/compose/foundation/lazy/layout/b;)V

    move/from16 v33, p11

    move/from16 v34, p12

    move-object/from16 v31, p13

    move-object/from16 v32, p14

    move-object/from16 v29, v3

    move-object/from16 v30, v10

    invoke-static/range {v29 .. v34}, Lp0/w;->k(Lp0/w;Lp0/e0;Lbc3/c0;Li2/f0;II)V

    move/from16 v36, v2

    invoke-interface {v10}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v11, v2, v3}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v10}, Lp0/e0;->getIndex()I

    move-result v2

    if-eq v2, v1, :cond_f

    const/4 v2, -0x1

    if-eq v1, v2, :cond_f

    if-ge v1, v8, :cond_e

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    :cond_e
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    :cond_f
    const/4 v1, 0x0

    invoke-interface {v10, v1}, Lp0/e0;->j(I)J

    move-result-wide v14

    invoke-interface {v10}, Lp0/e0;->e()Z

    move-result v1

    if-eqz v1, :cond_10

    and-long v1, v14, v16

    :goto_f
    long-to-int v1, v1

    goto :goto_10

    :cond_10
    shr-long v1, v14, v18

    goto :goto_f

    :goto_10
    invoke-static {v10, v1, v3}, Landroidx/compose/foundation/lazy/layout/b;->c(Lp0/e0;ILp0/w;)V

    if-eqz v36, :cond_1a

    invoke-virtual {v3}, Lp0/w;->a()[Lp0/t;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v2, :cond_1a

    aget-object v10, v1, v3

    if-eqz v10, :cond_11

    invoke-virtual {v10}, Lp0/t;->a()V

    :cond_11
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_12
    move/from16 v36, v2

    if-eqz v27, :cond_1a

    move/from16 v33, p11

    move/from16 v34, p12

    move-object/from16 v31, p13

    move-object/from16 v32, p14

    move-object/from16 v30, v10

    invoke-static/range {v29 .. v34}, Lp0/w;->k(Lp0/w;Lp0/e0;Lbc3/c0;Li2/f0;II)V

    invoke-virtual/range {v29 .. v29}, Lp0/w;->a()[Lp0/t;

    move-result-object v1

    array-length v2, v1

    const/4 v14, 0x0

    :goto_12
    if-ge v14, v2, :cond_14

    aget-object v15, v1, v14

    move-object/from16 p10, v1

    move/from16 v30, v2

    if-eqz v15, :cond_13

    invoke-virtual {v15}, Lp0/t;->e()J

    move-result-wide v1

    sget v31, Lp0/t;->t:I

    invoke-static {}, Lp0/y;->o()V

    sget-wide v4, Lp0/t;->s:J

    invoke-static {v1, v2, v4, v5}, Ly3/j;->b(JJ)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v15}, Lp0/t;->e()J

    move-result-wide v1

    invoke-static {v1, v2, v12, v13}, Ly3/j;->d(JJ)J

    move-result-wide v1

    invoke-virtual {v15, v1, v2}, Lp0/t;->n(J)V

    :cond_13
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v1, p10

    move/from16 v2, v30

    goto :goto_12

    :cond_14
    if-eqz v36, :cond_17

    invoke-virtual/range {v29 .. v29}, Lp0/w;->a()[Lp0/t;

    move-result-object v1

    array-length v2, v1

    const/4 v4, 0x0

    :goto_13
    if-ge v4, v2, :cond_17

    aget-object v5, v1, v4

    if-eqz v5, :cond_16

    invoke-virtual {v5}, Lp0/t;->g()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v14, v0, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    if-eqz v14, :cond_15

    invoke-static {v14}, La3/g;->h(La3/r;)V

    :cond_15
    invoke-virtual {v5}, Lp0/t;->a()V

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    :cond_17
    const/4 v1, 0x0

    invoke-virtual {v0, v10, v1}, Landroidx/compose/foundation/lazy/layout/b;->g(Lp0/e0;Z)V

    goto :goto_14

    :cond_18
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    goto/16 :goto_b

    :cond_19
    invoke-interface {v10}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/lazy/layout/b;->f(Ljava/lang/Object;)V

    :cond_1a
    :goto_14
    add-int/lit8 v2, v35, 0x1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v1, v28

    goto/16 :goto_a

    :cond_1b
    new-array v1, v6, [I

    if-eqz v27, :cond_21

    if-eqz v7, :cond_21

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1e

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x1

    if-le v2, v4, :cond_1c

    new-instance v2, Lp0/x;

    const/4 v4, 0x2

    invoke-direct {v2, v7, v4}, Lp0/x;-><init>(Lab/h0;I)V

    invoke-static {v15, v2}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1c
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_15
    if-ge v4, v2, :cond_1d

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp0/e0;

    invoke-static {v1, v5}, Landroidx/compose/foundation/lazy/layout/b;->h([ILp0/e0;)I

    move-result v8

    sub-int v8, p11, v8

    invoke-interface {v5}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v11, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v10, Lp0/w;

    invoke-static {v5, v8, v10}, Landroidx/compose/foundation/lazy/layout/b;->c(Lp0/e0;ILp0/w;)V

    const/4 v8, 0x0

    invoke-virtual {v0, v5, v8}, Landroidx/compose/foundation/lazy/layout/b;->g(Lp0/e0;Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_1d
    const/4 v8, 0x0

    invoke-static {v1, v8}, Lm83/n;->o0([II)V

    goto :goto_16

    :cond_1e
    const/4 v8, 0x0

    :goto_16
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_21

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x1

    if-le v2, v4, :cond_1f

    new-instance v2, Lp0/x;

    invoke-direct {v2, v7, v8}, Lp0/x;-><init>(Lab/h0;I)V

    invoke-static {v14, v2}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1f
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_17
    if-ge v4, v2, :cond_20

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp0/e0;

    invoke-static {v1, v5}, Landroidx/compose/foundation/lazy/layout/b;->h([ILp0/e0;)I

    move-result v8

    add-int v8, v8, p12

    invoke-interface {v5}, Lp0/e0;->g()I

    move-result v10

    sub-int/2addr v8, v10

    invoke-interface {v5}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v11, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v10, Lp0/w;

    invoke-static {v5, v8, v10}, Landroidx/compose/foundation/lazy/layout/b;->c(Lp0/e0;ILp0/w;)V

    const/4 v8, 0x0

    invoke-virtual {v0, v5, v8}, Landroidx/compose/foundation/lazy/layout/b;->g(Lp0/e0;Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    :cond_20
    const/4 v8, 0x0

    invoke-static {v1, v8}, Lm83/n;->o0([II)V

    :cond_21
    iget-object v2, v9, La0/w0;->b:[Ljava/lang/Object;

    iget-object v4, v9, La0/w0;->a:[J

    array-length v5, v4

    const/4 v8, 0x2

    sub-int/2addr v5, v8

    iget-object v8, v0, Landroidx/compose/foundation/lazy/layout/b;->h:Ljava/util/ArrayList;

    iget-object v10, v0, Landroidx/compose/foundation/lazy/layout/b;->g:Ljava/util/ArrayList;

    if-ltz v5, :cond_34

    move-object/from16 v28, v14

    const/4 v12, 0x0

    :goto_18
    aget-wide v13, v4, v12

    move-object/from16 v29, v1

    move-object/from16 v30, v2

    not-long v1, v13

    shl-long v1, v1, v23

    and-long/2addr v1, v13

    and-long v1, v1, v24

    cmp-long v1, v1, v24

    if-eqz v1, :cond_33

    sub-int v1, v12, v5

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v26, 0x8

    rsub-int/lit8 v1, v1, 0x8

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v1, :cond_32

    and-long v31, v13, v21

    cmp-long v31, v31, v19

    if-gez v31, :cond_31

    shl-int/lit8 v31, v12, 0x3

    add-int v31, v31, v2

    move/from16 v32, v2

    aget-object v2, v30, v31

    invoke-virtual {v11, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v33, v4

    move-object/from16 v4, v31

    check-cast v4, Lp0/w;

    if-nez v4, :cond_22

    move-object/from16 v34, v3

    goto/16 :goto_20

    :cond_22
    move-object/from16 v31, v9

    move-wide/from16 v43, v13

    move-object/from16 v9, p5

    invoke-virtual {v9, v2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result v13

    invoke-virtual {v4}, Lp0/w;->g()I

    move-result v14

    invoke-static {v6, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-virtual {v4, v14}, Lp0/w;->i(I)V

    invoke-virtual {v4}, Lp0/w;->g()I

    move-result v14

    sub-int v14, v6, v14

    invoke-virtual {v4}, Lp0/w;->d()I

    move-result v6

    invoke-static {v14, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-virtual {v4, v6}, Lp0/w;->h(I)V

    const/4 v6, -0x1

    if-ne v13, v6, :cond_2b

    invoke-virtual {v4}, Lp0/w;->a()[Lp0/t;

    move-result-object v13

    array-length v14, v13

    const/4 v6, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    :goto_1a
    if-ge v6, v14, :cond_29

    move-object/from16 p7, v4

    aget-object v4, v13, v6

    add-int/lit8 v36, v35, 0x1

    if-eqz v4, :cond_28

    invoke-virtual {v4}, Lp0/t;->g()Z

    move-result v37

    if-eqz v37, :cond_23

    goto :goto_1b

    :cond_23
    invoke-virtual {v4}, Lp0/t;->f()Z

    move-result v37

    const/16 v38, 0x0

    if-eqz v37, :cond_24

    invoke-virtual {v4}, Lp0/t;->i()V

    invoke-virtual/range {p7 .. p7}, Lp0/w;->a()[Lp0/t;

    move-result-object v37

    aput-object v38, v37, v35

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v4, v0, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    if-eqz v4, :cond_28

    invoke-static {v4}, La3/g;->h(La3/r;)V

    goto :goto_1c

    :cond_24
    invoke-virtual {v4}, Lp0/t;->d()Ll2/c;

    move-result-object v37

    if-eqz v37, :cond_25

    invoke-virtual {v4}, Lp0/t;->b()V

    :cond_25
    invoke-virtual {v4}, Lp0/t;->g()Z

    move-result v37

    if-eqz v37, :cond_27

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    if-eqz v4, :cond_26

    invoke-static {v4}, La3/g;->h(La3/r;)V

    :cond_26
    :goto_1b
    const/16 v34, 0x1

    goto :goto_1c

    :cond_27
    invoke-virtual {v4}, Lp0/t;->i()V

    invoke-virtual/range {p7 .. p7}, Lp0/w;->a()[Lp0/t;

    move-result-object v4

    aput-object v38, v4, v35

    :cond_28
    :goto_1c
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v4, p7

    move/from16 v35, v36

    goto :goto_1a

    :cond_29
    if-nez v34, :cond_2a

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/lazy/layout/b;->f(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v34, v3

    goto/16 :goto_1f

    :cond_2b
    move-object/from16 p7, v4

    invoke-virtual/range {p7 .. p7}, Lp0/w;->b()Ly3/a;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v6, v3

    iget-wide v3, v4, Ly3/a;->a:J

    invoke-virtual/range {p7 .. p7}, Lp0/w;->d()I

    move-result v36

    invoke-virtual/range {p7 .. p7}, Lp0/w;->g()I

    move-result v39

    move-object/from16 v34, p6

    move-wide/from16 v37, v3

    move/from16 v35, v13

    invoke-virtual/range {v34 .. v39}, La2/a;->w(IIJI)Lp0/e0;

    move-result-object v37

    move/from16 v3, v35

    invoke-interface/range {v37 .. v37}, Lp0/e0;->i()V

    invoke-virtual/range {p7 .. p7}, Lp0/w;->a()[Lp0/t;

    move-result-object v4

    array-length v13, v4

    const/4 v14, 0x0

    :goto_1d
    if-ge v14, v13, :cond_2e

    aget-object v34, v4, v14

    move-object/from16 v35, v4

    if-eqz v34, :cond_2c

    invoke-virtual/range {v34 .. v34}, Lp0/t;->h()Z

    move-result v4

    move-object/from16 v34, v6

    const/4 v6, 0x1

    if-ne v4, v6, :cond_2d

    goto :goto_1e

    :cond_2c
    move-object/from16 v34, v6

    :cond_2d
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v34

    move-object/from16 v4, v35

    goto :goto_1d

    :cond_2e
    move-object/from16 v34, v6

    if-eqz v7, :cond_2f

    invoke-virtual {v7, v2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result v4

    if-ne v3, v4, :cond_2f

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/lazy/layout/b;->f(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_2f
    :goto_1e
    invoke-virtual/range {p7 .. p7}, Lp0/w;->c()I

    move-result v42

    move-object/from16 v36, p7

    move/from16 v40, p11

    move/from16 v41, p12

    move-object/from16 v38, p13

    move-object/from16 v39, p14

    invoke-virtual/range {v36 .. v42}, Lp0/w;->j(Lp0/e0;Lbc3/c0;Li2/f0;III)V

    move-object/from16 v2, v37

    iget v4, v0, Landroidx/compose/foundation/lazy/layout/b;->c:I

    if-ge v3, v4, :cond_30

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_30
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1f
    const/16 v3, 0x8

    goto :goto_21

    :cond_31
    move/from16 v32, v2

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    :goto_20
    move-object/from16 v31, v9

    move-wide/from16 v43, v13

    move-object/from16 v9, p5

    goto :goto_1f

    :goto_21
    shr-long v13, v43, v3

    add-int/lit8 v2, v32, 0x1

    move/from16 v6, p9

    move-object/from16 v9, v31

    move-object/from16 v4, v33

    move-object/from16 v3, v34

    goto/16 :goto_19

    :cond_32
    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v31, v9

    const/16 v3, 0x8

    move-object/from16 v9, p5

    if-ne v1, v3, :cond_35

    goto :goto_22

    :cond_33
    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v31, v9

    const/16 v3, 0x8

    move-object/from16 v9, p5

    :goto_22
    if-eq v12, v5, :cond_35

    add-int/lit8 v12, v12, 0x1

    move/from16 v6, p9

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    move-object/from16 v9, v31

    move-object/from16 v4, v33

    move-object/from16 v3, v34

    goto/16 :goto_18

    :cond_34
    move-object/from16 v29, v1

    move-object/from16 v31, v9

    move-object/from16 v28, v14

    move-object/from16 v9, p5

    :cond_35
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3b

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_36

    new-instance v1, Lp0/x;

    const/4 v2, 0x3

    invoke-direct {v1, v9, v2}, Lp0/x;-><init>(Lab/h0;I)V

    invoke-static {v10, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_36
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_23
    if-ge v2, v1, :cond_3a

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp0/e0;

    invoke-interface {v3}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v11, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Lp0/w;

    move-object/from16 v5, v29

    invoke-static {v5, v3}, Landroidx/compose/foundation/lazy/layout/b;->h([ILp0/e0;)I

    move-result v6

    if-eqz p8, :cond_38

    invoke-static/range {p4 .. p4}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp0/e0;

    const/4 v12, 0x0

    invoke-interface {v7, v12}, Lp0/e0;->j(I)J

    move-result-wide v13

    invoke-interface {v7}, Lp0/e0;->e()Z

    move-result v7

    if-eqz v7, :cond_37

    and-long v12, v13, v16

    :goto_24
    long-to-int v7, v12

    goto :goto_25

    :cond_37
    shr-long v12, v13, v18

    goto :goto_24

    :cond_38
    invoke-virtual {v4}, Lp0/w;->f()I

    move-result v7

    :goto_25
    sub-int/2addr v7, v6

    invoke-virtual {v4}, Lp0/w;->c()I

    move-result v4

    move/from16 v6, p2

    move/from16 v12, p3

    invoke-interface {v3, v7, v4, v6, v12}, Lp0/e0;->a(IIII)V

    if-eqz v27, :cond_39

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Landroidx/compose/foundation/lazy/layout/b;->g(Lp0/e0;Z)V

    :cond_39
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v29, v5

    goto :goto_23

    :cond_3a
    move/from16 v6, p2

    move/from16 v12, p3

    move-object/from16 v5, v29

    const/4 v2, 0x0

    invoke-static {v5, v2}, Lm83/n;->o0([II)V

    goto :goto_26

    :cond_3b
    move/from16 v6, p2

    move/from16 v12, p3

    move-object/from16 v5, v29

    :goto_26
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_40

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_3c

    new-instance v1, Lp0/x;

    invoke-direct {v1, v9, v4}, Lp0/x;-><init>(Lab/h0;I)V

    invoke-static {v8, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_27
    if-ge v2, v1, :cond_40

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp0/e0;

    invoke-interface {v3}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v11, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Lp0/w;

    invoke-static {v5, v3}, Landroidx/compose/foundation/lazy/layout/b;->h([ILp0/e0;)I

    move-result v7

    if-eqz p8, :cond_3e

    invoke-static/range {p4 .. p4}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp0/e0;

    const/4 v13, 0x0

    invoke-interface {v9, v13}, Lp0/e0;->j(I)J

    move-result-wide v19

    invoke-interface {v9}, Lp0/e0;->e()Z

    move-result v13

    if-eqz v13, :cond_3d

    and-long v13, v19, v16

    :goto_28
    long-to-int v13, v13

    goto :goto_29

    :cond_3d
    shr-long v13, v19, v18

    goto :goto_28

    :goto_29
    invoke-interface {v9}, Lp0/e0;->g()I

    move-result v9

    add-int/2addr v9, v13

    goto :goto_2a

    :cond_3e
    invoke-virtual {v4}, Lp0/w;->e()I

    move-result v9

    :goto_2a
    invoke-interface {v3}, Lp0/e0;->g()I

    move-result v13

    sub-int/2addr v9, v13

    add-int/2addr v9, v7

    invoke-virtual {v4}, Lp0/w;->c()I

    move-result v4

    invoke-interface {v3, v9, v4, v6, v12}, Lp0/e0;->a(IIII)V

    const/4 v4, 0x1

    if-eqz v27, :cond_3f

    invoke-virtual {v0, v3, v4}, Landroidx/compose/foundation/lazy/layout/b;->g(Lp0/e0;Z)V

    :cond_3f
    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_40
    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move-object/from16 v4, p4

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v31 .. v31}, La0/w0;->b()V

    return-void
.end method

.method public final e()V
    .locals 15

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    invoke-virtual {v0}, La0/v0;->j()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, La0/v0;->c:[Ljava/lang/Object;

    iget-object v2, v0, La0/v0;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_4

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_2

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_1

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v1, v11

    check-cast v11, Lp0/w;

    invoke-virtual {v11}, Lp0/w;->a()[Lp0/t;

    move-result-object v11

    array-length v12, v11

    move v13, v4

    :goto_2
    if-ge v13, v12, :cond_1

    aget-object v14, v11, v13

    if-eqz v14, :cond_0

    invoke-virtual {v14}, Lp0/t;->i()V

    :cond_0
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_1
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-ne v8, v9, :cond_4

    :cond_3
    if-eq v5, v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, La0/v0;->a()V

    :cond_5
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    invoke-virtual {v0, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp0/w;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lp0/w;->a()[Lp0/t;

    move-result-object p1

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lp0/t;->i()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g(Lp0/e0;Z)V
    .locals 12

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->a:La0/v0;

    invoke-interface {p1}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lp0/w;

    invoke-virtual {v0}, Lp0/w;->a()[Lp0/t;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    if-eqz v4, :cond_1

    invoke-interface {p1, v3}, Lp0/e0;->j(I)J

    move-result-wide v6

    invoke-virtual {v4}, Lp0/t;->e()J

    move-result-wide v8

    sget v3, Lp0/t;->t:I

    invoke-static {}, Lp0/y;->o()V

    sget-wide v10, Lp0/t;->s:J

    invoke-static {v8, v9, v10, v11}, Ly3/j;->b(JJ)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v8, v9, v6, v7}, Ly3/j;->b(JJ)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v6, v7, v8, v9}, Ly3/j;->c(JJ)J

    move-result-wide v8

    invoke-virtual {v4, v8, v9, p2}, Lp0/t;->c(JZ)V

    :cond_0
    invoke-virtual {v4, v6, v7}, Lp0/t;->n(J)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_2
    return-void
.end method

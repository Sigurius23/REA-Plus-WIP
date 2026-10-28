.class public final Lc0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Lc0/x;


# direct methods
.method public constructor <init>(Lc0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/n;->a:Lc0/x;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    new-array v5, v4, [Ly2/j1;

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v7

    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    :goto_0
    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x1

    if-ge v11, v7, :cond_2

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    const-wide v18, 0xffffffffL

    move-object/from16 v12, v17

    check-cast v12, Ly2/q0;

    invoke-interface {v12}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v13

    const/16 v17, 0x20

    instance-of v14, v13, Lc0/r;

    if-eqz v14, :cond_0

    move-object v15, v13

    check-cast v15, Lc0/r;

    :cond_0
    if-eqz v15, :cond_1

    iget-object v13, v15, Lc0/r;->w:Lp1/k1;

    invoke-virtual {v13}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-ne v13, v10, :cond_1

    invoke-interface {v12, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    iget v9, v8, Ly2/j1;->w:I

    iget v10, v8, Ly2/j1;->x:I

    int-to-long v12, v9

    shl-long v12, v12, v17

    int-to-long v9, v10

    and-long v9, v9, v18

    or-long/2addr v9, v12

    aput-object v8, v5, v11

    move-wide v8, v9

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    const/16 v17, 0x20

    const-wide v18, 0xffffffffL

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    move/from16 v7, v16

    :goto_1
    if-ge v7, v6, :cond_4

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly2/q0;

    aget-object v12, v5, v7

    if-nez v12, :cond_3

    invoke-interface {v11, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v11

    aput-object v11, v5, v7

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, Ly2/r;->A()Z

    move-result v1

    if-eqz v1, :cond_5

    shr-long v1, v8, v17

    long-to-int v1, v1

    goto :goto_6

    :cond_5
    if-nez v4, :cond_6

    move-object v1, v15

    goto :goto_5

    :cond_6
    aget-object v1, v5, v16

    add-int/lit8 v2, v4, -0x1

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    if-eqz v1, :cond_8

    iget v3, v1, Ly2/j1;->w:I

    goto :goto_2

    :cond_8
    move/from16 v3, v16

    :goto_2
    if-gt v10, v2, :cond_b

    move v6, v10

    :goto_3
    aget-object v7, v5, v6

    if-eqz v7, :cond_9

    iget v11, v7, Ly2/j1;->w:I

    goto :goto_4

    :cond_9
    move/from16 v11, v16

    :goto_4
    if-ge v3, v11, :cond_a

    move-object v1, v7

    move v3, v11

    :cond_a
    if-eq v6, v2, :cond_b

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_b
    :goto_5
    if-eqz v1, :cond_c

    iget v1, v1, Ly2/j1;->w:I

    goto :goto_6

    :cond_c
    move/from16 v1, v16

    :goto_6
    invoke-interface/range {p1 .. p1}, Ly2/r;->A()Z

    move-result v2

    if-eqz v2, :cond_d

    and-long v2, v8, v18

    long-to-int v10, v2

    goto :goto_b

    :cond_d
    if-nez v4, :cond_e

    goto :goto_a

    :cond_e
    aget-object v15, v5, v16

    sub-int/2addr v4, v10

    if-nez v4, :cond_f

    goto :goto_a

    :cond_f
    if-eqz v15, :cond_10

    iget v2, v15, Ly2/j1;->x:I

    goto :goto_7

    :cond_10
    move/from16 v2, v16

    :goto_7
    if-gt v10, v4, :cond_13

    :goto_8
    aget-object v3, v5, v10

    if-eqz v3, :cond_11

    iget v6, v3, Ly2/j1;->x:I

    goto :goto_9

    :cond_11
    move/from16 v6, v16

    :goto_9
    if-ge v2, v6, :cond_12

    move-object v15, v3

    move v2, v6

    :cond_12
    if-eq v10, v4, :cond_13

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_13
    :goto_a
    if-eqz v15, :cond_14

    iget v10, v15, Ly2/j1;->x:I

    goto :goto_b

    :cond_14
    move/from16 v10, v16

    :goto_b
    invoke-interface/range {p1 .. p1}, Ly2/r;->A()Z

    move-result v2

    if-nez v2, :cond_15

    int-to-long v2, v1

    shl-long v2, v2, v17

    int-to-long v6, v10

    and-long v6, v6, v18

    or-long/2addr v2, v6

    iget-object v4, v0, Lc0/n;->a:Lc0/x;

    iget-object v4, v4, Lc0/x;->d:Lp1/k1;

    new-instance v6, Ly3/l;

    invoke-direct {v6, v2, v3}, Ly3/l;-><init>(J)V

    invoke-virtual {v4, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_15
    new-instance v2, Lc0/m;

    invoke-direct {v2, v5, v0, v1, v10}, Lc0/m;-><init>([Ly2/j1;Lc0/n;II)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    move-object/from16 v4, p1

    invoke-interface {v4, v1, v10, v3, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->C(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_2

    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p3}, Ly2/q0;->C(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_1

    move-object p1, v3

    :cond_1
    if-eq v2, v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    return v0
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->Q(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_2

    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p3}, Ly2/q0;->Q(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_1

    move-object p1, v3

    :cond_1
    if-eq v2, v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    return v0
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->b(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_2

    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p3}, Ly2/q0;->b(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_1

    move-object p1, v3

    :cond_1
    if-eq v2, v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    return v0
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->O(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_2

    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p3}, Ly2/q0;->O(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_1

    move-object p1, v3

    :cond_1
    if-eq v2, v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    return v0
.end method

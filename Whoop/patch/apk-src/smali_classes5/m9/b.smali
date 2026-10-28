.class public final Lm9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/k0;


# instance fields
.field public final a:I

.field public final b:Lu8/p;

.field public final c:Lt9/m;

.field public d:Lu8/p;

.field public e:Lt9/k0;

.field public f:J


# direct methods
.method public constructor <init>(IILu8/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lm9/b;->a:I

    iput-object p3, p0, Lm9/b;->b:Lu8/p;

    new-instance p1, Lt9/m;

    invoke-direct {p1}, Lt9/m;-><init>()V

    iput-object p1, p0, Lm9/b;->c:Lt9/m;

    return-void
.end method


# virtual methods
.method public final a(Lu8/p;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lm9/b;->b:Lu8/p;

    if-eqz v2, :cond_1a

    if-ne v1, v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_c

    :cond_0
    iget-object v3, v1, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v3}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v3

    iget-object v4, v2, Lu8/p;->a:Ljava/lang/String;

    iget-object v5, v2, Lu8/p;->l:Lu8/c0;

    iget-object v6, v2, Lu8/p;->c:Lzr/g0;

    iget v7, v2, Lu8/p;->K:I

    iget v8, v2, Lu8/p;->L:I

    iget-object v9, v2, Lu8/p;->b:Ljava/lang/String;

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_1
    iget-object v9, v1, Lu8/p;->b:Ljava/lang/String;

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :cond_2
    iget-object v6, v1, Lu8/p;->c:Lzr/g0;

    :goto_1
    iget-object v10, v1, Lu8/p;->d:Ljava/lang/String;

    const/4 v11, 0x3

    const/4 v12, 0x1

    if-eq v3, v11, :cond_3

    if-ne v3, v12, :cond_4

    :cond_3
    iget-object v11, v2, Lu8/p;->d:Ljava/lang/String;

    if-eqz v11, :cond_4

    move-object v10, v11

    :cond_4
    iget v11, v1, Lu8/p;->h:I

    const/4 v13, -0x1

    if-ne v11, v13, :cond_5

    iget v11, v2, Lu8/p;->h:I

    :cond_5
    iget v14, v1, Lu8/p;->i:I

    if-ne v14, v13, :cond_6

    iget v14, v2, Lu8/p;->i:I

    :cond_6
    iget-object v13, v1, Lu8/p;->k:Ljava/lang/String;

    const/16 v16, 0x0

    if-nez v13, :cond_c

    iget-object v15, v2, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v15}, Lx8/t;->T(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    array-length v12, v15

    if-nez v12, :cond_8

    move-object/from16 v18, v6

    move-object/from16 v19, v13

    :cond_7
    move-object/from16 v6, v16

    goto :goto_3

    :cond_8
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v6

    array-length v6, v15

    move-object/from16 v19, v13

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v6, :cond_b

    move/from16 v20, v6

    aget-object v6, v15, v13

    invoke-static {v6}, Lu8/d0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    move/from16 v22, v13

    invoke-static/range {v21 .. v21}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v13

    if-ne v3, v13, :cond_a

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v13

    if-lez v13, :cond_9

    const-string v13, ","

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    add-int/lit8 v13, v22, 0x1

    move/from16 v6, v20

    goto :goto_2

    :cond_b
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_7

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_3
    invoke-static {v6}, Lx8/t;->T(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v12, v12

    const/4 v13, 0x1

    if-ne v12, v13, :cond_d

    move-object v13, v6

    goto :goto_4

    :cond_c
    move-object/from16 v18, v6

    move-object/from16 v19, v13

    :cond_d
    move-object/from16 v13, v19

    :goto_4
    iget-object v6, v1, Lu8/p;->l:Lu8/c0;

    if-nez v6, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {v6, v5}, Lu8/c0;->b(Lu8/c0;)Lu8/c0;

    move-result-object v5

    :goto_5
    iget v6, v1, Lu8/p;->w:F

    const/high16 v12, -0x40800000    # -1.0f

    cmpl-float v12, v6, v12

    if-nez v12, :cond_f

    const/4 v12, 0x2

    if-ne v3, v12, :cond_f

    iget v6, v2, Lu8/p;->w:F

    :cond_f
    iget v3, v1, Lu8/p;->e:I

    iget v12, v2, Lu8/p;->e:I

    or-int/2addr v3, v12

    iget v12, v1, Lu8/p;->f:I

    iget v15, v2, Lu8/p;->f:I

    or-int/2addr v12, v15

    iget-object v2, v2, Lu8/p;->r:Lu8/l;

    iget-object v15, v1, Lu8/p;->r:Lu8/l;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_12

    iget-object v0, v2, Lu8/l;->y:Ljava/lang/String;

    iget-object v2, v2, Lu8/l;->w:[Lu8/k;

    move-object/from16 v17, v0

    array-length v0, v2

    move-object/from16 v19, v2

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_11

    move/from16 v20, v0

    aget-object v0, v19, v2

    move/from16 v21, v2

    iget-object v2, v0, Lu8/k;->E:[B

    if-eqz v2, :cond_10

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v2, v21, 0x1

    move/from16 v0, v20

    goto :goto_6

    :cond_11
    move-object/from16 v0, v17

    goto :goto_7

    :cond_12
    move-object/from16 v0, v16

    :goto_7
    if-eqz v15, :cond_18

    if-nez v0, :cond_13

    iget-object v0, v15, Lu8/l;->y:Ljava/lang/String;

    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v15, v15, Lu8/l;->w:[Lu8/k;

    move-object/from16 v17, v0

    array-length v0, v15

    move-object/from16 v19, v15

    const/4 v15, 0x0

    :goto_8
    if-ge v15, v0, :cond_17

    move/from16 v20, v0

    aget-object v0, v19, v15

    move/from16 v21, v15

    iget-object v15, v0, Lu8/k;->E:[B

    if-eqz v15, :cond_16

    iget-object v15, v0, Lu8/k;->x:Ljava/util/UUID;

    move/from16 v22, v8

    const/4 v8, 0x0

    :goto_9
    if-ge v8, v2, :cond_15

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    move/from16 v24, v2

    move-object/from16 v2, v23

    check-cast v2, Lu8/k;

    iget-object v2, v2, Lu8/k;->x:Ljava/util/UUID;

    invoke-virtual {v2, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    add-int/lit8 v8, v8, 0x1

    move/from16 v2, v24

    goto :goto_9

    :cond_15
    move/from16 v24, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_16
    move/from16 v24, v2

    move/from16 v22, v8

    :goto_a
    add-int/lit8 v15, v21, 0x1

    move/from16 v0, v20

    move/from16 v8, v22

    move/from16 v2, v24

    goto :goto_8

    :cond_17
    move-object/from16 v0, v17

    :cond_18
    move/from16 v22, v8

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_19

    move-object/from16 v2, v16

    goto :goto_b

    :cond_19
    new-instance v2, Lu8/l;

    invoke-direct {v2, v0, v1}, Lu8/l;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    :goto_b
    invoke-virtual/range {p1 .. p1}, Lu8/p;->a()Lu8/o;

    move-result-object v0

    iput-object v4, v0, Lu8/o;->a:Ljava/lang/String;

    iput-object v9, v0, Lu8/o;->b:Ljava/lang/String;

    invoke-static/range {v18 .. v18}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v1

    iput-object v1, v0, Lu8/o;->c:Lzr/g0;

    iput-object v10, v0, Lu8/o;->d:Ljava/lang/String;

    iput v3, v0, Lu8/o;->e:I

    iput v12, v0, Lu8/o;->f:I

    iput v11, v0, Lu8/o;->h:I

    iput v14, v0, Lu8/o;->i:I

    iput-object v13, v0, Lu8/o;->j:Ljava/lang/String;

    iput-object v5, v0, Lu8/o;->k:Lu8/c0;

    iput-object v2, v0, Lu8/o;->q:Lu8/l;

    iput v6, v0, Lu8/o;->v:F

    iput v7, v0, Lu8/o;->J:I

    move/from16 v1, v22

    iput v1, v0, Lu8/o;->K:I

    new-instance v1, Lu8/p;

    invoke-direct {v1, v0}, Lu8/p;-><init>(Lu8/o;)V

    :goto_c
    move-object/from16 v0, p0

    goto :goto_d

    :cond_1a
    move-object/from16 v1, p1

    goto :goto_c

    :goto_d
    iput-object v1, v0, Lm9/b;->d:Lu8/p;

    iget-object v2, v0, Lm9/b;->e:Lt9/k0;

    sget v3, Lx8/t;->a:I

    invoke-interface {v2, v1}, Lt9/k0;->a(Lu8/p;)V

    return-void
.end method

.method public final b(JIIILt9/j0;)V
    .locals 8

    iget-wide v0, p0, Lm9/b;->f:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lm9/b;->c:Lt9/m;

    iput-object v0, p0, Lm9/b;->e:Lt9/k0;

    :cond_0
    iget-object v1, p0, Lm9/b;->e:Lt9/k0;

    sget v0, Lx8/t;->a:I

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lt9/k0;->b(JIIILt9/j0;)V

    return-void
.end method

.method public final c(Lu8/h;IZ)I
    .locals 2

    iget-object v0, p0, Lm9/b;->e:Lt9/k0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0, p1, p2, p3}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result p1

    return p1
.end method

.method public final d(Lx8/n;II)V
    .locals 1

    iget-object p3, p0, Lm9/b;->e:Lt9/k0;

    sget v0, Lx8/t;->a:I

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lt9/k0;->d(Lx8/n;II)V

    return-void
.end method

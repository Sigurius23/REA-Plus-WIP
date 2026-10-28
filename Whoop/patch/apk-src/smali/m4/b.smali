.class public final Lm4/b;
.super Lm4/j;
.source "SourceFile"


# instance fields
.field public t0:I

.field public u0:Z

.field public v0:I

.field public w0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lm4/j;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lm4/b;->t0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lm4/b;->u0:Z

    iput v0, p0, Lm4/b;->v0:I

    iput-boolean v0, p0, Lm4/b;->w0:Z

    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 1

    iget-boolean v0, p0, Lm4/b;->w0:Z

    return v0
.end method

.method public final C()Z
    .locals 1

    iget-boolean v0, p0, Lm4/b;->w0:Z

    return v0
.end method

.method public final Y()Z
    .locals 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    :goto_0
    iget v4, p0, Lm4/j;->s0:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ge v2, v4, :cond_5

    iget-object v4, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v4, v4, v2

    iget-boolean v7, p0, Lm4/b;->u0:Z

    if-nez v7, :cond_0

    invoke-virtual {v4}, Lm4/e;->d()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    iget v7, p0, Lm4/b;->t0:I

    if-eqz v7, :cond_1

    if-ne v7, v0, :cond_2

    :cond_1
    invoke-virtual {v4}, Lm4/e;->B()Z

    move-result v7

    if-nez v7, :cond_2

    :goto_1
    move v3, v1

    goto :goto_2

    :cond_2
    iget v7, p0, Lm4/b;->t0:I

    if-eq v7, v6, :cond_3

    if-ne v7, v5, :cond_4

    :cond_3
    invoke-virtual {v4}, Lm4/e;->C()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_13

    if-lez v4, :cond_13

    move v2, v1

    move v3, v2

    :goto_3
    iget v4, p0, Lm4/j;->s0:I

    if-ge v1, v4, :cond_10

    iget-object v4, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v4, v4, v1

    iget-boolean v7, p0, Lm4/b;->u0:Z

    if-nez v7, :cond_6

    invoke-virtual {v4}, Lm4/e;->d()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    :cond_6
    const/4 v7, 0x5

    const/4 v8, 0x4

    if-nez v3, :cond_b

    iget v3, p0, Lm4/b;->t0:I

    if-nez v3, :cond_7

    invoke-virtual {v4, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v2}, Lm4/d;->d()I

    move-result v2

    goto :goto_4

    :cond_7
    if-ne v3, v0, :cond_8

    invoke-virtual {v4, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v2}, Lm4/d;->d()I

    move-result v2

    goto :goto_4

    :cond_8
    if-ne v3, v6, :cond_9

    invoke-virtual {v4, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v2}, Lm4/d;->d()I

    move-result v2

    goto :goto_4

    :cond_9
    if-ne v3, v5, :cond_a

    invoke-virtual {v4, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v2}, Lm4/d;->d()I

    move-result v2

    :cond_a
    :goto_4
    move v3, v0

    :cond_b
    iget v9, p0, Lm4/b;->t0:I

    if-nez v9, :cond_c

    invoke-virtual {v4, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v4

    invoke-virtual {v4}, Lm4/d;->d()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_c
    if-ne v9, v0, :cond_d

    invoke-virtual {v4, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v4

    invoke-virtual {v4}, Lm4/d;->d()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_5

    :cond_d
    if-ne v9, v6, :cond_e

    invoke-virtual {v4, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object v4

    invoke-virtual {v4}, Lm4/d;->d()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_e
    if-ne v9, v5, :cond_f

    invoke-virtual {v4, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v4

    invoke-virtual {v4}, Lm4/d;->d()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_f
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    :cond_10
    iget v1, p0, Lm4/b;->v0:I

    add-int/2addr v2, v1

    iget v1, p0, Lm4/b;->t0:I

    if-eqz v1, :cond_12

    if-ne v1, v0, :cond_11

    goto :goto_6

    :cond_11
    invoke-virtual {p0, v2, v2}, Lm4/e;->M(II)V

    goto :goto_7

    :cond_12
    :goto_6
    invoke-virtual {p0, v2, v2}, Lm4/e;->L(II)V

    :goto_7
    iput-boolean v0, p0, Lm4/b;->w0:Z

    return v0

    :cond_13
    return v1
.end method

.method public final Z()I
    .locals 3

    iget v0, p0, Lm4/b;->t0:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Lf4/c;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lm4/e;->R:[Lm4/d;

    const/4 v3, 0x0

    iget-object v4, v0, Lm4/e;->J:Lm4/d;

    aput-object v4, v2, v3

    const/4 v5, 0x2

    iget-object v6, v0, Lm4/e;->K:Lm4/d;

    aput-object v6, v2, v5

    const/4 v7, 0x1

    iget-object v8, v0, Lm4/e;->L:Lm4/d;

    aput-object v8, v2, v7

    const/4 v9, 0x3

    iget-object v10, v0, Lm4/e;->M:Lm4/d;

    aput-object v10, v2, v9

    move v11, v3

    :goto_0
    array-length v12, v2

    if-ge v11, v12, :cond_0

    aget-object v12, v2, v11

    invoke-virtual {v1, v12}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v13

    iput-object v13, v12, Lm4/d;->i:Lf4/f;

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    iget v11, v0, Lm4/b;->t0:I

    if-ltz v11, :cond_1e

    const/4 v12, 0x4

    if-ge v11, v12, :cond_1e

    aget-object v2, v2, v11

    iget-boolean v11, v0, Lm4/b;->w0:Z

    if-nez v11, :cond_1

    invoke-virtual {v0}, Lm4/b;->Y()Z

    :cond_1
    iget-boolean v11, v0, Lm4/b;->w0:Z

    if-eqz v11, :cond_5

    iput-boolean v3, v0, Lm4/b;->w0:Z

    iget v2, v0, Lm4/b;->t0:I

    if-eqz v2, :cond_4

    if-ne v2, v7, :cond_2

    goto :goto_1

    :cond_2
    if-eq v2, v5, :cond_3

    if-ne v2, v9, :cond_1e

    :cond_3
    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget v3, v0, Lm4/e;->a0:I

    invoke-virtual {v1, v2, v3}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v10, Lm4/d;->i:Lf4/f;

    iget v3, v0, Lm4/e;->a0:I

    invoke-virtual {v1, v2, v3}, Lf4/c;->d(Lf4/f;I)V

    return-void

    :cond_4
    :goto_1
    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget v3, v0, Lm4/e;->Z:I

    invoke-virtual {v1, v2, v3}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v8, Lm4/d;->i:Lf4/f;

    iget v3, v0, Lm4/e;->Z:I

    invoke-virtual {v1, v2, v3}, Lf4/c;->d(Lf4/f;I)V

    return-void

    :cond_5
    move v11, v3

    :goto_2
    iget v13, v0, Lm4/j;->s0:I

    if-ge v11, v13, :cond_b

    iget-object v13, v0, Lm4/j;->r0:[Lm4/e;

    aget-object v13, v13, v11

    iget-boolean v14, v0, Lm4/b;->u0:Z

    if-nez v14, :cond_6

    invoke-virtual {v13}, Lm4/e;->d()Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_4

    :cond_6
    iget v14, v0, Lm4/b;->t0:I

    if-eqz v14, :cond_7

    if-ne v14, v7, :cond_8

    :cond_7
    iget-object v15, v13, Lm4/e;->q0:[I

    aget v15, v15, v3

    if-ne v15, v9, :cond_8

    iget-object v15, v13, Lm4/e;->J:Lm4/d;

    iget-object v15, v15, Lm4/d;->f:Lm4/d;

    if-eqz v15, :cond_8

    iget-object v15, v13, Lm4/e;->L:Lm4/d;

    iget-object v15, v15, Lm4/d;->f:Lm4/d;

    if-eqz v15, :cond_8

    :goto_3
    move v11, v7

    goto :goto_5

    :cond_8
    if-eq v14, v5, :cond_9

    if-ne v14, v9, :cond_a

    :cond_9
    iget-object v14, v13, Lm4/e;->q0:[I

    aget v14, v14, v7

    if-ne v14, v9, :cond_a

    iget-object v14, v13, Lm4/e;->K:Lm4/d;

    iget-object v14, v14, Lm4/d;->f:Lm4/d;

    if-eqz v14, :cond_a

    iget-object v13, v13, Lm4/e;->M:Lm4/d;

    iget-object v13, v13, Lm4/d;->f:Lm4/d;

    if-eqz v13, :cond_a

    goto :goto_3

    :cond_a
    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_b
    move v11, v3

    :goto_5
    invoke-virtual {v4}, Lm4/d;->g()Z

    move-result v13

    if-nez v13, :cond_d

    invoke-virtual {v8}, Lm4/d;->g()Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_6

    :cond_c
    move v13, v3

    goto :goto_7

    :cond_d
    :goto_6
    move v13, v7

    :goto_7
    invoke-virtual {v6}, Lm4/d;->g()Z

    move-result v14

    if-nez v14, :cond_f

    invoke-virtual {v10}, Lm4/d;->g()Z

    move-result v14

    if-eqz v14, :cond_e

    goto :goto_8

    :cond_e
    move v14, v3

    goto :goto_9

    :cond_f
    :goto_8
    move v14, v7

    :goto_9
    if-nez v11, :cond_14

    iget v11, v0, Lm4/b;->t0:I

    if-nez v11, :cond_10

    if-nez v13, :cond_13

    :cond_10
    if-ne v11, v5, :cond_11

    if-nez v14, :cond_13

    :cond_11
    if-ne v11, v7, :cond_12

    if-nez v13, :cond_13

    :cond_12
    if-ne v11, v9, :cond_14

    if-eqz v14, :cond_14

    :cond_13
    move v11, v7

    goto :goto_a

    :cond_14
    move v11, v3

    :goto_a
    if-nez v11, :cond_15

    move v11, v12

    goto :goto_b

    :cond_15
    const/4 v11, 0x5

    :goto_b
    move v13, v3

    :goto_c
    iget v14, v0, Lm4/j;->s0:I

    if-ge v13, v14, :cond_1a

    iget-object v14, v0, Lm4/j;->r0:[Lm4/e;

    aget-object v14, v14, v13

    iget-boolean v15, v0, Lm4/b;->u0:Z

    if-nez v15, :cond_16

    invoke-virtual {v14}, Lm4/e;->d()Z

    move-result v15

    if-nez v15, :cond_16

    goto :goto_10

    :cond_16
    iget-object v15, v14, Lm4/e;->R:[Lm4/d;

    iget v9, v0, Lm4/b;->t0:I

    aget-object v9, v15, v9

    invoke-virtual {v1, v9}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v9

    iget-object v14, v14, Lm4/e;->R:[Lm4/d;

    iget v15, v0, Lm4/b;->t0:I

    aget-object v14, v14, v15

    iput-object v9, v14, Lm4/d;->i:Lf4/f;

    iget-object v7, v14, Lm4/d;->f:Lm4/d;

    if-eqz v7, :cond_17

    iget-object v7, v7, Lm4/d;->d:Lm4/e;

    if-ne v7, v0, :cond_17

    iget v7, v14, Lm4/d;->g:I

    goto :goto_d

    :cond_17
    move v7, v3

    :goto_d
    if-eqz v15, :cond_19

    if-ne v15, v5, :cond_18

    goto :goto_e

    :cond_18
    iget-object v14, v2, Lm4/d;->i:Lf4/f;

    iget v15, v0, Lm4/b;->v0:I

    add-int/2addr v15, v7

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v5

    invoke-virtual {v1}, Lf4/c;->m()Lf4/f;

    move-result-object v12

    iput v3, v12, Lf4/f;->z:I

    invoke-virtual {v5, v14, v9, v12, v15}, Lf4/b;->b(Lf4/f;Lf4/f;Lf4/f;I)V

    invoke-virtual {v1, v5}, Lf4/c;->c(Lf4/b;)V

    goto :goto_f

    :cond_19
    :goto_e
    iget-object v5, v2, Lm4/d;->i:Lf4/f;

    iget v12, v0, Lm4/b;->v0:I

    sub-int/2addr v12, v7

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v14

    invoke-virtual {v1}, Lf4/c;->m()Lf4/f;

    move-result-object v15

    iput v3, v15, Lf4/f;->z:I

    invoke-virtual {v14, v5, v9, v15, v12}, Lf4/b;->c(Lf4/f;Lf4/f;Lf4/f;I)V

    invoke-virtual {v1, v14}, Lf4/c;->c(Lf4/b;)V

    :goto_f
    iget-object v5, v2, Lm4/d;->i:Lf4/f;

    iget v12, v0, Lm4/b;->v0:I

    add-int/2addr v12, v7

    invoke-virtual {v1, v5, v9, v12, v11}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    :goto_10
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x1

    const/4 v9, 0x3

    const/4 v12, 0x4

    goto :goto_c

    :cond_1a
    iget v2, v0, Lm4/b;->t0:I

    const/16 v5, 0x8

    if-nez v2, :cond_1b

    iget-object v2, v8, Lm4/d;->i:Lf4/f;

    iget-object v6, v4, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v6, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget-object v5, v0, Lm4/e;->U:Lm4/f;

    iget-object v5, v5, Lm4/e;->L:Lm4/d;

    iget-object v5, v5, Lm4/d;->i:Lf4/f;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v5, v3, v6}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->J:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v3}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    return-void

    :cond_1b
    const/4 v7, 0x1

    if-ne v2, v7, :cond_1c

    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget-object v6, v8, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v6, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget-object v5, v0, Lm4/e;->U:Lm4/f;

    iget-object v5, v5, Lm4/e;->J:Lm4/d;

    iget-object v5, v5, Lm4/d;->i:Lf4/f;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v5, v3, v6}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v4, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->L:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v3}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    return-void

    :cond_1c
    const/4 v4, 0x2

    if-ne v2, v4, :cond_1d

    iget-object v2, v10, Lm4/d;->i:Lf4/f;

    iget-object v4, v6, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->M:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    const/4 v5, 0x4

    invoke-virtual {v1, v2, v4, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->K:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v3}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    return-void

    :cond_1d
    const/4 v4, 0x3

    if-ne v2, v4, :cond_1e

    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget-object v4, v10, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->K:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    const/4 v5, 0x4

    invoke-virtual {v1, v2, v4, v3, v5}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v2, v6, Lm4/d;->i:Lf4/f;

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->M:Lm4/d;

    iget-object v4, v4, Lm4/d;->i:Lf4/f;

    invoke-virtual {v1, v2, v4, v3, v3}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    :cond_1e
    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Barrier] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lm4/e;->i0:Ljava/lang/String;

    const-string v2, " {"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lm4/j;->s0:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v2, v2, v1

    if-lez v1, :cond_0

    const-string v3, ", "

    invoke-static {v0, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v2, Lm4/e;->i0:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "}"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

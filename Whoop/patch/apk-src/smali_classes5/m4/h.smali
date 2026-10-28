.class public final Lm4/h;
.super Lm4/l;
.source "SourceFile"


# instance fields
.field public E0:I

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:I

.field public J0:I

.field public K0:F

.field public L0:F

.field public M0:F

.field public N0:F

.field public O0:F

.field public P0:F

.field public Q0:I

.field public R0:I

.field public S0:I

.field public T0:I

.field public U0:I

.field public V0:I

.field public W0:I

.field public final X0:Ljava/util/ArrayList;

.field public Y0:[Lm4/e;

.field public Z0:[Lm4/e;

.field public a1:[I

.field public b1:[Lm4/e;

.field public c1:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lm4/l;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm4/h;->E0:I

    iput v0, p0, Lm4/h;->F0:I

    iput v0, p0, Lm4/h;->G0:I

    iput v0, p0, Lm4/h;->H0:I

    iput v0, p0, Lm4/h;->I0:I

    iput v0, p0, Lm4/h;->J0:I

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lm4/h;->K0:F

    iput v1, p0, Lm4/h;->L0:F

    iput v1, p0, Lm4/h;->M0:F

    iput v1, p0, Lm4/h;->N0:F

    iput v1, p0, Lm4/h;->O0:F

    iput v1, p0, Lm4/h;->P0:F

    const/4 v1, 0x0

    iput v1, p0, Lm4/h;->Q0:I

    iput v1, p0, Lm4/h;->R0:I

    const/4 v2, 0x2

    iput v2, p0, Lm4/h;->S0:I

    iput v2, p0, Lm4/h;->T0:I

    iput v1, p0, Lm4/h;->U0:I

    iput v0, p0, Lm4/h;->V0:I

    iput v1, p0, Lm4/h;->W0:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm4/h;->X0:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lm4/h;->Y0:[Lm4/e;

    iput-object v0, p0, Lm4/h;->Z0:[Lm4/e;

    iput-object v0, p0, Lm4/h;->a1:[I

    iput v1, p0, Lm4/h;->c1:I

    return-void
.end method


# virtual methods
.method public final Y(IIII)V
    .locals 37

    move-object/from16 v1, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    iget v0, v1, Lm4/j;->s0:I

    const/4 v12, 0x2

    const/4 v13, 0x3

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-lez v0, :cond_7

    iget-object v0, v1, Lm4/e;->U:Lm4/f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm4/f;->v0:Ln4/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iput v15, v1, Lm4/l;->A0:I

    iput v15, v1, Lm4/l;->B0:I

    iput-boolean v15, v1, Lm4/l;->z0:Z

    return-void

    :cond_1
    move v3, v15

    :goto_1
    iget v4, v1, Lm4/j;->s0:I

    if-ge v3, v4, :cond_7

    iget-object v4, v1, Lm4/j;->r0:[Lm4/e;

    aget-object v4, v4, v3

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    instance-of v5, v4, Lm4/i;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v15}, Lm4/e;->k(I)I

    move-result v5

    invoke-virtual {v4, v14}, Lm4/e;->k(I)I

    move-result v6

    if-ne v5, v13, :cond_4

    iget v7, v4, Lm4/e;->s:I

    if-eq v7, v14, :cond_4

    if-ne v6, v13, :cond_4

    iget v7, v4, Lm4/e;->t:I

    if-eq v7, v14, :cond_4

    goto :goto_2

    :cond_4
    if-ne v5, v13, :cond_5

    move v5, v12

    :cond_5
    if-ne v6, v13, :cond_6

    move v6, v12

    :cond_6
    iget-object v7, v1, Lm4/l;->C0:Ln4/b;

    iput v5, v7, Ln4/b;->a:I

    iput v6, v7, Ln4/b;->b:I

    invoke-virtual {v4}, Lm4/e;->r()I

    move-result v5

    iput v5, v7, Ln4/b;->c:I

    invoke-virtual {v4}, Lm4/e;->l()I

    move-result v5

    iput v5, v7, Ln4/b;->d:I

    invoke-interface {v0, v4, v7}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget v5, v7, Ln4/b;->e:I

    invoke-virtual {v4, v5}, Lm4/e;->S(I)V

    iget v5, v7, Ln4/b;->f:I

    invoke-virtual {v4, v5}, Lm4/e;->N(I)V

    iget v5, v7, Ln4/b;->g:I

    invoke-virtual {v4, v5}, Lm4/e;->J(I)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    iget v0, v1, Lm4/l;->x0:I

    iget v3, v1, Lm4/l;->y0:I

    iget v4, v1, Lm4/l;->t0:I

    iget v5, v1, Lm4/l;->u0:I

    new-array v6, v12, [I

    sub-int v7, v9, v0

    sub-int/2addr v7, v3

    iget v2, v1, Lm4/h;->W0:I

    if-ne v2, v14, :cond_8

    sub-int v7, p4, v4

    sub-int/2addr v7, v5

    :cond_8
    const/4 v13, -0x1

    if-nez v2, :cond_a

    iget v2, v1, Lm4/h;->E0:I

    if-ne v2, v13, :cond_9

    iput v15, v1, Lm4/h;->E0:I

    :cond_9
    iget v2, v1, Lm4/h;->F0:I

    if-ne v2, v13, :cond_c

    iput v15, v1, Lm4/h;->F0:I

    goto :goto_3

    :cond_a
    iget v2, v1, Lm4/h;->E0:I

    if-ne v2, v13, :cond_b

    iput v15, v1, Lm4/h;->E0:I

    :cond_b
    iget v2, v1, Lm4/h;->F0:I

    if-ne v2, v13, :cond_c

    iput v15, v1, Lm4/h;->F0:I

    :cond_c
    :goto_3
    iget-object v2, v1, Lm4/j;->r0:[Lm4/e;

    move v13, v15

    move/from16 v18, v13

    move/from16 v28, v18

    :goto_4
    iget v15, v1, Lm4/j;->s0:I

    const/16 v12, 0x8

    if-ge v13, v15, :cond_e

    iget-object v15, v1, Lm4/j;->r0:[Lm4/e;

    aget-object v15, v15, v13

    iget v15, v15, Lm4/e;->h0:I

    if-ne v15, v12, :cond_d

    add-int/lit8 v18, v18, 0x1

    :cond_d
    add-int/lit8 v13, v13, 0x1

    const/4 v12, 0x2

    goto :goto_4

    :cond_e
    if-lez v18, :cond_10

    sub-int v15, v15, v18

    new-array v2, v15, [Lm4/e;

    move/from16 v13, v28

    move v15, v13

    :goto_5
    iget v14, v1, Lm4/j;->s0:I

    if-ge v13, v14, :cond_10

    iget-object v14, v1, Lm4/j;->r0:[Lm4/e;

    aget-object v14, v14, v13

    move/from16 v18, v0

    iget v0, v14, Lm4/e;->h0:I

    if-eq v0, v12, :cond_f

    aput-object v14, v2, v15

    add-int/lit8 v15, v15, 0x1

    :cond_f
    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v18

    goto :goto_5

    :cond_10
    move/from16 v18, v0

    move-object v12, v2

    iput-object v12, v1, Lm4/h;->b1:[Lm4/e;

    iput v15, v1, Lm4/h;->c1:I

    iget v0, v1, Lm4/h;->U0:I

    iget-object v13, v1, Lm4/h;->X0:Ljava/util/ArrayList;

    if-eqz v0, :cond_6d

    iget-object v14, v1, Lm4/e;->q0:[I

    iget-object v2, v1, Lm4/e;->K:Lm4/d;

    move-object/from16 v20, v14

    iget-object v14, v1, Lm4/e;->J:Lm4/d;

    move-object/from16 v21, v14

    iget-object v14, v1, Lm4/e;->L:Lm4/d;

    move-object/from16 v30, v14

    iget-object v14, v1, Lm4/e;->M:Lm4/d;

    move-object/from16 v22, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_53

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2c

    const/4 v2, 0x3

    if-eq v0, v2, :cond_11

    :goto_6
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v35, v6

    move/from16 v31, v18

    :goto_7
    const/16 v29, 0x1

    goto/16 :goto_39

    :cond_11
    iget v2, v1, Lm4/h;->W0:I

    if-nez v15, :cond_12

    goto :goto_6

    :cond_12
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lm4/g;

    move/from16 v16, v5

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    move-object/from16 v23, v6

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    move/from16 v24, v3

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    move/from16 v25, v4

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    move/from16 v34, v16

    move/from16 v31, v18

    move-object/from16 v35, v23

    move/from16 v32, v24

    move/from16 v33, v25

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_1a

    move/from16 v3, v28

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_8
    if-ge v3, v15, :cond_19

    const/16 v29, 0x1

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v36, v14

    aget-object v14, v12, v3

    invoke-virtual {v1, v14, v7}, Lm4/h;->b0(Lm4/e;I)I

    move-result v16

    move/from16 v18, v2

    iget-object v2, v14, Lm4/e;->q0:[I

    aget v2, v2, v28

    move/from16 v23, v3

    const/4 v3, 0x3

    if-ne v2, v3, :cond_13

    add-int/lit8 v5, v5, 0x1

    :cond_13
    move/from16 v24, v5

    if-eq v6, v7, :cond_14

    iget v2, v1, Lm4/h;->Q0:I

    add-int/2addr v2, v6

    add-int v2, v2, v16

    if-le v2, v7, :cond_15

    :cond_14
    iget-object v2, v0, Lm4/g;->b:Lm4/e;

    if-eqz v2, :cond_15

    const/4 v2, 0x1

    goto :goto_9

    :cond_15
    move/from16 v2, v28

    :goto_9
    if-nez v2, :cond_16

    if-lez v23, :cond_16

    iget v3, v1, Lm4/h;->V0:I

    if-lez v3, :cond_16

    if-le v4, v3, :cond_16

    const/4 v2, 0x1

    :cond_16
    if-eqz v2, :cond_17

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    move/from16 v2, v18

    move/from16 v11, v23

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    iput v11, v0, Lm4/g;->n:I

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v6, v16

    const/4 v4, 0x1

    goto :goto_a

    :cond_17
    move/from16 v2, v18

    move/from16 v11, v23

    if-lez v11, :cond_18

    iget v3, v1, Lm4/h;->Q0:I

    add-int v3, v3, v16

    add-int/2addr v3, v6

    move v6, v3

    goto :goto_a

    :cond_18
    move/from16 v6, v16

    :goto_a
    invoke-virtual {v0, v14}, Lm4/g;->a(Lm4/e;)V

    add-int/lit8 v3, v11, 0x1

    move/from16 v5, v24

    move-object/from16 v14, v36

    goto :goto_8

    :cond_19
    move-object/from16 v36, v14

    goto/16 :goto_e

    :cond_1a
    move-object/from16 v36, v14

    move/from16 v3, v28

    move v4, v3

    move v5, v4

    move v11, v5

    :goto_b
    if-ge v11, v15, :cond_21

    const/16 v29, 0x1

    add-int/lit8 v3, v3, 0x1

    aget-object v14, v12, v11

    invoke-virtual {v1, v14, v7}, Lm4/h;->a0(Lm4/e;I)I

    move-result v16

    iget-object v6, v14, Lm4/e;->q0:[I

    aget v6, v6, v29

    move/from16 v18, v2

    const/4 v2, 0x3

    if-ne v6, v2, :cond_1b

    add-int/lit8 v4, v4, 0x1

    :cond_1b
    move/from16 v23, v4

    if-eq v5, v7, :cond_1c

    iget v2, v1, Lm4/h;->R0:I

    add-int/2addr v2, v5

    add-int v2, v2, v16

    if-le v2, v7, :cond_1d

    :cond_1c
    iget-object v2, v0, Lm4/g;->b:Lm4/e;

    if-eqz v2, :cond_1d

    const/4 v2, 0x1

    goto :goto_c

    :cond_1d
    move/from16 v2, v28

    :goto_c
    if-nez v2, :cond_1e

    if-lez v11, :cond_1e

    iget v4, v1, Lm4/h;->V0:I

    if-lez v4, :cond_1e

    if-le v3, v4, :cond_1e

    const/4 v2, 0x1

    :cond_1e
    if-eqz v2, :cond_1f

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    move/from16 v2, v18

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    iput v11, v0, Lm4/g;->n:I

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v5, v16

    const/4 v3, 0x1

    goto :goto_d

    :cond_1f
    move/from16 v2, v18

    if-lez v11, :cond_20

    iget v4, v1, Lm4/h;->R0:I

    add-int v4, v4, v16

    add-int/2addr v4, v5

    move v5, v4

    goto :goto_d

    :cond_20
    move/from16 v5, v16

    :goto_d
    invoke-virtual {v0, v14}, Lm4/g;->a(Lm4/e;)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v4, v23

    goto :goto_b

    :cond_21
    move v5, v4

    :goto_e
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v3, v1, Lm4/l;->x0:I

    iget v4, v1, Lm4/l;->t0:I

    iget v6, v1, Lm4/l;->y0:I

    iget v11, v1, Lm4/l;->u0:I

    aget v12, v20, v28

    const/4 v14, 0x2

    if-eq v12, v14, :cond_23

    const/16 v29, 0x1

    aget v12, v20, v29

    if-ne v12, v14, :cond_22

    goto :goto_f

    :cond_22
    move/from16 v12, v28

    goto :goto_10

    :cond_23
    :goto_f
    const/4 v12, 0x1

    :goto_10
    if-lez v5, :cond_25

    if-eqz v12, :cond_25

    move/from16 v5, v28

    :goto_11
    if-ge v5, v0, :cond_25

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/g;

    if-nez v2, :cond_24

    invoke-virtual {v12}, Lm4/g;->d()I

    move-result v14

    sub-int v14, v7, v14

    invoke-virtual {v12, v14}, Lm4/g;->e(I)V

    goto :goto_12

    :cond_24
    invoke-virtual {v12}, Lm4/g;->c()I

    move-result v14

    sub-int v14, v7, v14

    invoke-virtual {v12, v14}, Lm4/g;->e(I)V

    :goto_12
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_25
    move/from16 v23, v3

    move/from16 v24, v4

    move/from16 v25, v6

    move/from16 v26, v11

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move/from16 v3, v28

    move v4, v3

    move v5, v4

    move-object/from16 v21, v30

    move-object/from16 v22, v36

    :goto_13
    if-ge v3, v0, :cond_2b

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm4/g;

    if-nez v2, :cond_28

    add-int/lit8 v11, v0, -0x1

    if-ge v3, v11, :cond_26

    add-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm4/g;

    iget-object v11, v11, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->K:Lm4/d;

    move-object/from16 v22, v11

    move/from16 v26, v28

    goto :goto_14

    :cond_26
    iget v11, v1, Lm4/l;->u0:I

    move/from16 v26, v11

    move-object/from16 v22, v36

    :goto_14
    iget-object v11, v6, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->M:Lm4/d;

    move/from16 v18, v2

    move-object/from16 v17, v6

    move/from16 v27, v7

    invoke-virtual/range {v17 .. v27}, Lm4/g;->f(ILm4/d;Lm4/d;Lm4/d;Lm4/d;IIIII)V

    invoke-virtual {v6}, Lm4/g;->d()I

    move-result v12

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v6}, Lm4/g;->c()I

    move-result v6

    add-int/2addr v6, v5

    if-lez v3, :cond_27

    iget v5, v1, Lm4/h;->R0:I

    add-int/2addr v6, v5

    :cond_27
    move v5, v6

    move-object/from16 v20, v11

    move/from16 v24, v28

    goto :goto_16

    :cond_28
    add-int/lit8 v11, v0, -0x1

    if-ge v3, v11, :cond_29

    add-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm4/g;

    iget-object v11, v11, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->J:Lm4/d;

    move-object/from16 v21, v11

    move/from16 v25, v28

    goto :goto_15

    :cond_29
    iget v11, v1, Lm4/l;->y0:I

    move/from16 v25, v11

    move-object/from16 v21, v30

    :goto_15
    iget-object v11, v6, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->L:Lm4/d;

    move/from16 v18, v2

    move-object/from16 v17, v6

    move/from16 v27, v7

    invoke-virtual/range {v17 .. v27}, Lm4/g;->f(ILm4/d;Lm4/d;Lm4/d;Lm4/d;IIIII)V

    invoke-virtual/range {v17 .. v17}, Lm4/g;->d()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual/range {v17 .. v17}, Lm4/g;->c()I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-lez v3, :cond_2a

    iget v5, v1, Lm4/h;->Q0:I

    add-int/2addr v6, v5

    :cond_2a
    move v5, v4

    move v4, v6

    move-object/from16 v19, v11

    move/from16 v23, v28

    :goto_16
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_13

    :cond_2b
    aput v4, v35, v28

    const/16 v29, 0x1

    aput v5, v35, v29

    goto/16 :goto_7

    :cond_2c
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v35, v6

    move/from16 v31, v18

    iget v0, v1, Lm4/h;->W0:I

    if-nez v0, :cond_32

    iget v2, v1, Lm4/h;->V0:I

    if-gtz v2, :cond_31

    move/from16 v2, v28

    move v3, v2

    move v4, v3

    :goto_17
    if-ge v2, v15, :cond_30

    if-lez v2, :cond_2d

    iget v5, v1, Lm4/h;->Q0:I

    add-int/2addr v3, v5

    :cond_2d
    aget-object v5, v12, v2

    if-nez v5, :cond_2e

    goto :goto_18

    :cond_2e
    invoke-virtual {v1, v5, v7}, Lm4/h;->b0(Lm4/e;I)I

    move-result v5

    add-int/2addr v5, v3

    if-le v5, v7, :cond_2f

    goto :goto_19

    :cond_2f
    add-int/lit8 v4, v4, 0x1

    move v3, v5

    :goto_18
    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_30
    :goto_19
    move/from16 v2, v28

    goto :goto_1d

    :cond_31
    move v4, v2

    goto :goto_19

    :cond_32
    iget v2, v1, Lm4/h;->V0:I

    if-gtz v2, :cond_37

    move/from16 v2, v28

    move v3, v2

    move v4, v3

    :goto_1a
    if-ge v2, v15, :cond_36

    if-lez v2, :cond_33

    iget v5, v1, Lm4/h;->R0:I

    add-int/2addr v3, v5

    :cond_33
    aget-object v5, v12, v2

    if-nez v5, :cond_34

    goto :goto_1b

    :cond_34
    invoke-virtual {v1, v5, v7}, Lm4/h;->a0(Lm4/e;I)I

    move-result v5

    add-int/2addr v5, v3

    if-le v5, v7, :cond_35

    goto :goto_1c

    :cond_35
    add-int/lit8 v4, v4, 0x1

    move v3, v5

    :goto_1b
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    :cond_36
    :goto_1c
    move v2, v4

    :cond_37
    move/from16 v4, v28

    :goto_1d
    iget-object v3, v1, Lm4/h;->a1:[I

    if-nez v3, :cond_38

    const/4 v14, 0x2

    new-array v3, v14, [I

    iput-object v3, v1, Lm4/h;->a1:[I

    :cond_38
    if-nez v2, :cond_39

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3a

    :cond_39
    if-nez v4, :cond_3b

    if-nez v0, :cond_3b

    :cond_3a
    const/4 v3, 0x1

    goto :goto_1e

    :cond_3b
    move/from16 v3, v28

    :goto_1e
    if-nez v3, :cond_52

    if-nez v0, :cond_3c

    int-to-float v2, v15

    int-to-float v5, v4

    div-float/2addr v2, v5

    float-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v2, v5

    goto :goto_1f

    :cond_3c
    int-to-float v4, v15

    int-to-float v5, v2

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    :goto_1f
    iget-object v5, v1, Lm4/h;->Z0:[Lm4/e;

    if-eqz v5, :cond_3d

    array-length v6, v5

    if-ge v6, v4, :cond_3e

    :cond_3d
    const/4 v6, 0x0

    goto :goto_20

    :cond_3e
    const/4 v6, 0x0

    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_21

    :goto_20
    new-array v5, v4, [Lm4/e;

    iput-object v5, v1, Lm4/h;->Z0:[Lm4/e;

    :goto_21
    iget-object v5, v1, Lm4/h;->Y0:[Lm4/e;

    if-eqz v5, :cond_40

    array-length v11, v5

    if-ge v11, v2, :cond_3f

    goto :goto_22

    :cond_3f
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_23

    :cond_40
    :goto_22
    new-array v5, v2, [Lm4/e;

    iput-object v5, v1, Lm4/h;->Y0:[Lm4/e;

    :goto_23
    move/from16 v5, v28

    :goto_24
    if-ge v5, v4, :cond_49

    move/from16 v6, v28

    :goto_25
    if-ge v6, v2, :cond_48

    mul-int v11, v6, v4

    add-int/2addr v11, v5

    const/4 v13, 0x1

    if-ne v0, v13, :cond_41

    mul-int v11, v5, v2

    add-int/2addr v11, v6

    :cond_41
    array-length v13, v12

    if-lt v11, v13, :cond_42

    goto :goto_26

    :cond_42
    aget-object v11, v12, v11

    if-nez v11, :cond_43

    goto :goto_26

    :cond_43
    invoke-virtual {v1, v11, v7}, Lm4/h;->b0(Lm4/e;I)I

    move-result v13

    iget-object v14, v1, Lm4/h;->Z0:[Lm4/e;

    aget-object v14, v14, v5

    if-eqz v14, :cond_44

    invoke-virtual {v14}, Lm4/e;->r()I

    move-result v14

    if-ge v14, v13, :cond_45

    :cond_44
    iget-object v13, v1, Lm4/h;->Z0:[Lm4/e;

    aput-object v11, v13, v5

    :cond_45
    invoke-virtual {v1, v11, v7}, Lm4/h;->a0(Lm4/e;I)I

    move-result v13

    iget-object v14, v1, Lm4/h;->Y0:[Lm4/e;

    aget-object v14, v14, v6

    if-eqz v14, :cond_46

    invoke-virtual {v14}, Lm4/e;->l()I

    move-result v14

    if-ge v14, v13, :cond_47

    :cond_46
    iget-object v13, v1, Lm4/h;->Y0:[Lm4/e;

    aput-object v11, v13, v6

    :cond_47
    :goto_26
    add-int/lit8 v6, v6, 0x1

    goto :goto_25

    :cond_48
    add-int/lit8 v5, v5, 0x1

    goto :goto_24

    :cond_49
    move/from16 v5, v28

    move v6, v5

    :goto_27
    if-ge v5, v4, :cond_4c

    iget-object v11, v1, Lm4/h;->Z0:[Lm4/e;

    aget-object v11, v11, v5

    if-eqz v11, :cond_4b

    if-lez v5, :cond_4a

    iget v13, v1, Lm4/h;->Q0:I

    add-int/2addr v6, v13

    :cond_4a
    invoke-virtual {v1, v11, v7}, Lm4/h;->b0(Lm4/e;I)I

    move-result v11

    add-int/2addr v11, v6

    move v6, v11

    :cond_4b
    add-int/lit8 v5, v5, 0x1

    goto :goto_27

    :cond_4c
    move/from16 v5, v28

    move v11, v5

    :goto_28
    if-ge v5, v2, :cond_4f

    iget-object v13, v1, Lm4/h;->Y0:[Lm4/e;

    aget-object v13, v13, v5

    if-eqz v13, :cond_4e

    if-lez v5, :cond_4d

    iget v14, v1, Lm4/h;->R0:I

    add-int/2addr v11, v14

    :cond_4d
    invoke-virtual {v1, v13, v7}, Lm4/h;->a0(Lm4/e;I)I

    move-result v13

    add-int/2addr v13, v11

    move v11, v13

    :cond_4e
    add-int/lit8 v5, v5, 0x1

    goto :goto_28

    :cond_4f
    aput v6, v35, v28

    const/4 v13, 0x1

    aput v11, v35, v13

    if-nez v0, :cond_51

    if-le v6, v7, :cond_50

    if-le v4, v13, :cond_50

    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_1e

    :cond_50
    move v3, v13

    goto/16 :goto_1e

    :cond_51
    if-le v11, v7, :cond_50

    if-le v2, v13, :cond_50

    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_1e

    :cond_52
    const/4 v13, 0x1

    iget-object v0, v1, Lm4/h;->a1:[I

    aput v4, v0, v28

    aput v2, v0, v13

    move/from16 v29, v13

    goto/16 :goto_39

    :cond_53
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v35, v6

    move-object/from16 v36, v14

    move/from16 v31, v18

    iget v2, v1, Lm4/h;->W0:I

    if-nez v15, :cond_54

    goto/16 :goto_7

    :cond_54
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_5b

    move/from16 v3, v28

    move v4, v3

    move v11, v4

    :goto_29
    if-ge v11, v15, :cond_62

    aget-object v14, v12, v11

    invoke-virtual {v1, v14, v7}, Lm4/h;->b0(Lm4/e;I)I

    move-result v16

    iget-object v5, v14, Lm4/e;->q0:[I

    aget v5, v5, v28

    const/4 v6, 0x3

    if-ne v5, v6, :cond_55

    add-int/lit8 v3, v3, 0x1

    :cond_55
    move/from16 v18, v3

    if-eq v4, v7, :cond_56

    iget v3, v1, Lm4/h;->Q0:I

    add-int/2addr v3, v4

    add-int v3, v3, v16

    if-le v3, v7, :cond_57

    :cond_56
    iget-object v3, v0, Lm4/g;->b:Lm4/e;

    if-eqz v3, :cond_57

    const/4 v3, 0x1

    goto :goto_2a

    :cond_57
    move/from16 v3, v28

    :goto_2a
    if-nez v3, :cond_58

    if-lez v11, :cond_58

    iget v5, v1, Lm4/h;->V0:I

    if-lez v5, :cond_58

    rem-int v5, v11, v5

    if-nez v5, :cond_58

    const/4 v3, 0x1

    :cond_58
    if-eqz v3, :cond_5a

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    iput v11, v0, Lm4/g;->n:I

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_59
    move/from16 v4, v16

    goto :goto_2b

    :cond_5a
    if-lez v11, :cond_59

    iget v3, v1, Lm4/h;->Q0:I

    add-int v3, v3, v16

    add-int/2addr v3, v4

    move v4, v3

    :goto_2b
    invoke-virtual {v0, v14}, Lm4/g;->a(Lm4/e;)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v3, v18

    goto :goto_29

    :cond_5b
    move/from16 v3, v28

    move v4, v3

    move v11, v4

    :goto_2c
    if-ge v11, v15, :cond_62

    aget-object v14, v12, v11

    invoke-virtual {v1, v14, v7}, Lm4/h;->a0(Lm4/e;I)I

    move-result v16

    iget-object v5, v14, Lm4/e;->q0:[I

    const/16 v29, 0x1

    aget v5, v5, v29

    const/4 v6, 0x3

    if-ne v5, v6, :cond_5c

    add-int/lit8 v3, v3, 0x1

    :cond_5c
    move/from16 v17, v3

    if-eq v4, v7, :cond_5d

    iget v3, v1, Lm4/h;->R0:I

    add-int/2addr v3, v4

    add-int v3, v3, v16

    if-le v3, v7, :cond_5e

    :cond_5d
    iget-object v3, v0, Lm4/g;->b:Lm4/e;

    if-eqz v3, :cond_5e

    const/4 v3, 0x1

    goto :goto_2d

    :cond_5e
    move/from16 v3, v28

    :goto_2d
    if-nez v3, :cond_5f

    if-lez v11, :cond_5f

    iget v5, v1, Lm4/h;->V0:I

    if-lez v5, :cond_5f

    rem-int v5, v11, v5

    if-nez v5, :cond_5f

    const/4 v3, 0x1

    :cond_5f
    if-eqz v3, :cond_61

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    move v3, v6

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    move v4, v3

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    move/from16 v18, v4

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    iput v11, v0, Lm4/g;->n:I

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_60
    move/from16 v4, v16

    goto :goto_2e

    :cond_61
    move/from16 v18, v6

    if-lez v11, :cond_60

    iget v3, v1, Lm4/h;->R0:I

    add-int v3, v3, v16

    add-int/2addr v3, v4

    move v4, v3

    :goto_2e
    invoke-virtual {v0, v14}, Lm4/g;->a(Lm4/e;)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v3, v17

    goto :goto_2c

    :cond_62
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v4, v1, Lm4/l;->x0:I

    iget v5, v1, Lm4/l;->t0:I

    iget v6, v1, Lm4/l;->y0:I

    iget v11, v1, Lm4/l;->u0:I

    aget v12, v20, v28

    const/4 v14, 0x2

    if-eq v12, v14, :cond_64

    const/16 v29, 0x1

    aget v12, v20, v29

    if-ne v12, v14, :cond_63

    goto :goto_2f

    :cond_63
    move/from16 v12, v28

    goto :goto_30

    :cond_64
    :goto_2f
    const/4 v12, 0x1

    :goto_30
    if-lez v3, :cond_66

    if-eqz v12, :cond_66

    move/from16 v3, v28

    :goto_31
    if-ge v3, v0, :cond_66

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/g;

    if-nez v2, :cond_65

    invoke-virtual {v12}, Lm4/g;->d()I

    move-result v14

    sub-int v14, v7, v14

    invoke-virtual {v12, v14}, Lm4/g;->e(I)V

    goto :goto_32

    :cond_65
    invoke-virtual {v12}, Lm4/g;->c()I

    move-result v14

    sub-int v14, v7, v14

    invoke-virtual {v12, v14}, Lm4/g;->e(I)V

    :goto_32
    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    :cond_66
    move/from16 v23, v4

    move/from16 v24, v5

    move/from16 v25, v6

    move/from16 v26, v11

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move/from16 v3, v28

    move v4, v3

    move v5, v4

    move-object/from16 v21, v30

    move-object/from16 v22, v36

    :goto_33
    if-ge v3, v0, :cond_6c

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm4/g;

    if-nez v2, :cond_69

    add-int/lit8 v11, v0, -0x1

    if-ge v3, v11, :cond_67

    add-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm4/g;

    iget-object v11, v11, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->K:Lm4/d;

    move-object/from16 v22, v11

    move/from16 v26, v28

    goto :goto_34

    :cond_67
    iget v11, v1, Lm4/l;->u0:I

    move/from16 v26, v11

    move-object/from16 v22, v36

    :goto_34
    iget-object v11, v6, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->M:Lm4/d;

    move/from16 v18, v2

    move-object/from16 v17, v6

    move/from16 v27, v7

    invoke-virtual/range {v17 .. v27}, Lm4/g;->f(ILm4/d;Lm4/d;Lm4/d;Lm4/d;IIIII)V

    invoke-virtual {v6}, Lm4/g;->d()I

    move-result v12

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v6}, Lm4/g;->c()I

    move-result v6

    add-int/2addr v6, v5

    if-lez v3, :cond_68

    iget v5, v1, Lm4/h;->R0:I

    add-int/2addr v6, v5

    :cond_68
    move v5, v6

    move-object/from16 v20, v11

    move/from16 v24, v28

    goto :goto_36

    :cond_69
    add-int/lit8 v11, v0, -0x1

    if-ge v3, v11, :cond_6a

    add-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm4/g;

    iget-object v11, v11, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->J:Lm4/d;

    move-object/from16 v21, v11

    move/from16 v25, v28

    goto :goto_35

    :cond_6a
    iget v11, v1, Lm4/l;->y0:I

    move/from16 v25, v11

    move-object/from16 v21, v30

    :goto_35
    iget-object v11, v6, Lm4/g;->b:Lm4/e;

    iget-object v11, v11, Lm4/e;->L:Lm4/d;

    move/from16 v18, v2

    move-object/from16 v17, v6

    move/from16 v27, v7

    invoke-virtual/range {v17 .. v27}, Lm4/g;->f(ILm4/d;Lm4/d;Lm4/d;Lm4/d;IIIII)V

    invoke-virtual/range {v17 .. v17}, Lm4/g;->d()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual/range {v17 .. v17}, Lm4/g;->c()I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-lez v3, :cond_6b

    iget v5, v1, Lm4/h;->Q0:I

    add-int/2addr v6, v5

    :cond_6b
    move v5, v4

    move v4, v6

    move-object/from16 v19, v11

    move/from16 v23, v28

    :goto_36
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_33

    :cond_6c
    aput v4, v35, v28

    const/16 v29, 0x1

    aput v5, v35, v29

    goto/16 :goto_7

    :cond_6d
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v35, v6

    move/from16 v31, v18

    iget v2, v1, Lm4/h;->W0:I

    if-nez v15, :cond_6e

    goto/16 :goto_7

    :cond_6e
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_6f

    new-instance v0, Lm4/g;

    iget-object v5, v1, Lm4/e;->L:Lm4/d;

    iget-object v6, v1, Lm4/e;->M:Lm4/d;

    iget-object v3, v1, Lm4/e;->J:Lm4/d;

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    invoke-direct/range {v0 .. v7}, Lm4/g;-><init>(Lm4/h;ILm4/d;Lm4/d;Lm4/d;Lm4/d;I)V

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    :cond_6f
    move/from16 v0, v28

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm4/g;

    iput v0, v3, Lm4/g;->c:I

    const/4 v6, 0x0

    iput-object v6, v3, Lm4/g;->b:Lm4/e;

    iput v0, v3, Lm4/g;->l:I

    iput v0, v3, Lm4/g;->m:I

    iput v0, v3, Lm4/g;->n:I

    iput v0, v3, Lm4/g;->o:I

    iput v0, v3, Lm4/g;->p:I

    iget v0, v1, Lm4/l;->x0:I

    iget v4, v1, Lm4/l;->t0:I

    iget v5, v1, Lm4/l;->y0:I

    iget v6, v1, Lm4/l;->u0:I

    iget-object v11, v1, Lm4/e;->J:Lm4/d;

    iget-object v13, v1, Lm4/e;->K:Lm4/d;

    iget-object v14, v1, Lm4/e;->L:Lm4/d;

    move/from16 v23, v0

    iget-object v0, v1, Lm4/e;->M:Lm4/d;

    move-object/from16 v22, v0

    move/from16 v18, v2

    move-object/from16 v17, v3

    move/from16 v24, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move/from16 v27, v7

    move-object/from16 v19, v11

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    invoke-virtual/range {v17 .. v27}, Lm4/g;->f(ILm4/d;Lm4/d;Lm4/d;Lm4/d;IIIII)V

    move-object/from16 v0, v17

    :goto_37
    const/4 v2, 0x0

    :goto_38
    if-ge v2, v15, :cond_70

    aget-object v3, v12, v2

    invoke-virtual {v0, v3}, Lm4/g;->a(Lm4/e;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_38

    :cond_70
    invoke-virtual {v0}, Lm4/g;->d()I

    move-result v2

    const/16 v28, 0x0

    aput v2, v35, v28

    invoke-virtual {v0}, Lm4/g;->c()I

    move-result v0

    const/16 v29, 0x1

    aput v0, v35, v29

    :goto_39
    aget v0, v35, v28

    add-int v0, v0, v31

    add-int v0, v0, v32

    aget v2, v35, v29

    add-int v2, v2, v33

    add-int v2, v2, v34

    const/high16 v3, -0x80000000

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v8, v4, :cond_71

    move v0, v9

    goto :goto_3a

    :cond_71
    if-ne v8, v3, :cond_72

    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_3a

    :cond_72
    if-nez v8, :cond_73

    goto :goto_3a

    :cond_73
    move/from16 v0, v28

    :goto_3a
    if-ne v10, v4, :cond_74

    move/from16 v2, p4

    goto :goto_3b

    :cond_74
    if-ne v10, v3, :cond_75

    move/from16 v11, p4

    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_3b

    :cond_75
    if-nez v10, :cond_76

    goto :goto_3b

    :cond_76
    move/from16 v2, v28

    :goto_3b
    iput v0, v1, Lm4/l;->A0:I

    iput v2, v1, Lm4/l;->B0:I

    invoke-virtual {v1, v0}, Lm4/e;->S(I)V

    invoke-virtual {v1, v2}, Lm4/e;->N(I)V

    iget v0, v1, Lm4/j;->s0:I

    if-lez v0, :cond_77

    move/from16 v14, v29

    goto :goto_3c

    :cond_77
    move/from16 v14, v28

    :goto_3c
    iput-boolean v14, v1, Lm4/l;->z0:Z

    return-void
.end method

.method public final a0(Lm4/e;I)I
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lm4/e;->q0:[I

    const/4 v2, 0x1

    aget v3, v1, v2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    iget v3, p1, Lm4/e;->t:I

    if-nez v3, :cond_1

    :goto_0
    return v0

    :cond_1
    const/4 v5, 0x2

    if-ne v3, v5, :cond_3

    iget v3, p1, Lm4/e;->A:F

    int-to-float p2, p2

    mul-float/2addr v3, p2

    float-to-int v8, v3

    invoke-virtual {p1}, Lm4/e;->l()I

    move-result p2

    if-eq v8, p2, :cond_2

    iput-boolean v2, p1, Lm4/e;->g:Z

    aget v5, v1, v0

    invoke-virtual {p1}, Lm4/e;->r()I

    move-result v6

    const/4 v7, 0x1

    move-object v4, p0

    move-object v9, p1

    invoke-virtual/range {v4 .. v9}, Lm4/l;->Z(IIIILm4/e;)V

    :cond_2
    return v8

    :cond_3
    move-object v9, p1

    if-ne v3, v2, :cond_4

    invoke-virtual {v9}, Lm4/e;->l()I

    move-result p1

    return p1

    :cond_4
    if-ne v3, v4, :cond_6

    invoke-virtual {v9}, Lm4/e;->r()I

    move-result p1

    int-to-float p1, p1

    iget p2, v9, Lm4/e;->X:F

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1

    :cond_5
    move-object v9, p1

    :cond_6
    invoke-virtual {v9}, Lm4/e;->l()I

    move-result p1

    return p1
.end method

.method public final b0(Lm4/e;I)I
    .locals 11

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lm4/e;->q0:[I

    aget v2, v1, v0

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    iget v2, p1, Lm4/e;->s:I

    if-nez v2, :cond_1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x2

    const/4 v4, 0x1

    if-ne v2, v0, :cond_3

    iget v0, p1, Lm4/e;->x:F

    int-to-float p2, p2

    mul-float/2addr v0, p2

    float-to-int v7, v0

    invoke-virtual {p1}, Lm4/e;->r()I

    move-result p2

    if-eq v7, p2, :cond_2

    iput-boolean v4, p1, Lm4/e;->g:Z

    aget v8, v1, v4

    invoke-virtual {p1}, Lm4/e;->l()I

    move-result v9

    const/4 v6, 0x1

    move-object v5, p0

    move-object v10, p1

    invoke-virtual/range {v5 .. v10}, Lm4/l;->Z(IIIILm4/e;)V

    :cond_2
    return v7

    :cond_3
    move-object v10, p1

    if-ne v2, v4, :cond_4

    invoke-virtual {v10}, Lm4/e;->r()I

    move-result p1

    return p1

    :cond_4
    if-ne v2, v3, :cond_6

    invoke-virtual {v10}, Lm4/e;->l()I

    move-result p1

    int-to-float p1, p1

    iget p2, v10, Lm4/e;->X:F

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1

    :cond_5
    move-object v10, p1

    :cond_6
    invoke-virtual {v10}, Lm4/e;->r()I

    move-result p1

    return p1
.end method

.method public final c(Lf4/c;Z)V
    .locals 11

    invoke-super {p0, p1, p2}, Lm4/e;->c(Lf4/c;Z)V

    iget-object p1, p0, Lm4/e;->U:Lm4/f;

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lm4/f;->w0:Z

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iget v1, p0, Lm4/h;->U0:I

    iget-object v2, p0, Lm4/h;->X0:Ljava/util/ArrayList;

    if-eqz v1, :cond_1b

    if-eq v1, v0, :cond_19

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    goto/16 :goto_e

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, p2

    :goto_1
    if-ge v3, v1, :cond_1c

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm4/g;

    add-int/lit8 v5, v1, -0x1

    if-ne v3, v5, :cond_2

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, p2

    :goto_2
    invoke-virtual {v4, v3, p1, v5}, Lm4/g;->b(IZZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lm4/h;->a1:[I

    if-eqz v1, :cond_1c

    iget-object v1, p0, Lm4/h;->Z0:[Lm4/e;

    if-eqz v1, :cond_1c

    iget-object v1, p0, Lm4/h;->Y0:[Lm4/e;

    if-nez v1, :cond_4

    goto/16 :goto_e

    :cond_4
    move v1, p2

    :goto_3
    iget v2, p0, Lm4/h;->c1:I

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lm4/h;->b1:[Lm4/e;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lm4/e;->E()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lm4/h;->a1:[I

    aget v2, v1, p2

    aget v1, v1, v0

    iget v3, p0, Lm4/h;->K0:F

    const/4 v4, 0x0

    move v5, p2

    :goto_4
    const/16 v6, 0x8

    if-ge v5, v2, :cond_c

    if-eqz p1, :cond_6

    sub-int v3, v2, v5

    sub-int/2addr v3, v0

    const/high16 v7, 0x3f800000    # 1.0f

    iget v8, p0, Lm4/h;->K0:F

    sub-float/2addr v7, v8

    goto :goto_5

    :cond_6
    move v7, v3

    move v3, v5

    :goto_5
    iget-object v8, p0, Lm4/h;->Z0:[Lm4/e;

    aget-object v3, v8, v3

    if-eqz v3, :cond_b

    iget-object v8, v3, Lm4/e;->J:Lm4/d;

    iget v9, v3, Lm4/e;->h0:I

    if-ne v9, v6, :cond_7

    goto :goto_6

    :cond_7
    if-nez v5, :cond_8

    iget-object v6, p0, Lm4/e;->J:Lm4/d;

    iget v9, p0, Lm4/l;->x0:I

    invoke-virtual {v3, v8, v6, v9}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    iget v6, p0, Lm4/h;->E0:I

    iput v6, v3, Lm4/e;->j0:I

    iput v7, v3, Lm4/e;->e0:F

    :cond_8
    add-int/lit8 v6, v2, -0x1

    if-ne v5, v6, :cond_9

    iget-object v6, v3, Lm4/e;->L:Lm4/d;

    iget-object v9, p0, Lm4/e;->L:Lm4/d;

    iget v10, p0, Lm4/l;->y0:I

    invoke-virtual {v3, v6, v9, v10}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_9
    if-lez v5, :cond_a

    if-eqz v4, :cond_a

    iget-object v6, v4, Lm4/e;->L:Lm4/d;

    iget v9, p0, Lm4/h;->Q0:I

    invoke-virtual {v3, v8, v6, v9}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    invoke-virtual {v4, v6, v8, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_a
    move-object v4, v3

    :cond_b
    :goto_6
    add-int/lit8 v5, v5, 0x1

    move v3, v7

    goto :goto_4

    :cond_c
    move p1, p2

    :goto_7
    if-ge p1, v1, :cond_12

    iget-object v3, p0, Lm4/h;->Y0:[Lm4/e;

    aget-object v3, v3, p1

    if-eqz v3, :cond_11

    iget-object v5, v3, Lm4/e;->K:Lm4/d;

    iget v7, v3, Lm4/e;->h0:I

    if-ne v7, v6, :cond_d

    goto :goto_8

    :cond_d
    if-nez p1, :cond_e

    iget-object v7, p0, Lm4/e;->K:Lm4/d;

    iget v8, p0, Lm4/l;->t0:I

    invoke-virtual {v3, v5, v7, v8}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    iget v7, p0, Lm4/h;->F0:I

    iput v7, v3, Lm4/e;->k0:I

    iget v7, p0, Lm4/h;->L0:F

    iput v7, v3, Lm4/e;->f0:F

    :cond_e
    add-int/lit8 v7, v1, -0x1

    if-ne p1, v7, :cond_f

    iget-object v7, v3, Lm4/e;->M:Lm4/d;

    iget-object v8, p0, Lm4/e;->M:Lm4/d;

    iget v9, p0, Lm4/l;->u0:I

    invoke-virtual {v3, v7, v8, v9}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_f
    if-lez p1, :cond_10

    if-eqz v4, :cond_10

    iget-object v7, v4, Lm4/e;->M:Lm4/d;

    iget v8, p0, Lm4/h;->R0:I

    invoke-virtual {v3, v5, v7, v8}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    invoke-virtual {v4, v7, v5, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_10
    move-object v4, v3

    :cond_11
    :goto_8
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_12
    move p1, p2

    :goto_9
    if-ge p1, v2, :cond_1c

    move v3, p2

    :goto_a
    if-ge v3, v1, :cond_18

    mul-int v4, v3, v2

    add-int/2addr v4, p1

    iget v5, p0, Lm4/h;->W0:I

    if-ne v5, v0, :cond_13

    mul-int v4, p1, v1

    add-int/2addr v4, v3

    :cond_13
    iget-object v5, p0, Lm4/h;->b1:[Lm4/e;

    array-length v7, v5

    if-lt v4, v7, :cond_14

    goto :goto_b

    :cond_14
    aget-object v4, v5, v4

    if-eqz v4, :cond_17

    iget v5, v4, Lm4/e;->h0:I

    if-ne v5, v6, :cond_15

    goto :goto_b

    :cond_15
    iget-object v5, p0, Lm4/h;->Z0:[Lm4/e;

    aget-object v5, v5, p1

    iget-object v7, p0, Lm4/h;->Y0:[Lm4/e;

    aget-object v7, v7, v3

    if-eq v4, v5, :cond_16

    iget-object v8, v4, Lm4/e;->J:Lm4/d;

    iget-object v9, v5, Lm4/e;->J:Lm4/d;

    invoke-virtual {v4, v8, v9, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    iget-object v8, v4, Lm4/e;->L:Lm4/d;

    iget-object v5, v5, Lm4/e;->L:Lm4/d;

    invoke-virtual {v4, v8, v5, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_16
    if-eq v4, v7, :cond_17

    iget-object v5, v4, Lm4/e;->K:Lm4/d;

    iget-object v8, v7, Lm4/e;->K:Lm4/d;

    invoke-virtual {v4, v5, v8, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    iget-object v5, v4, Lm4/e;->M:Lm4/d;

    iget-object v7, v7, Lm4/e;->M:Lm4/d;

    invoke-virtual {v4, v5, v7, p2}, Lm4/e;->g(Lm4/d;Lm4/d;I)V

    :cond_17
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_18
    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, p2

    :goto_c
    if-ge v3, v1, :cond_1c

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm4/g;

    add-int/lit8 v5, v1, -0x1

    if-ne v3, v5, :cond_1a

    move v5, v0

    goto :goto_d

    :cond_1a
    move v5, p2

    :goto_d
    invoke-virtual {v4, v3, p1, v5}, Lm4/g;->b(IZZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1c

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm4/g;

    invoke-virtual {v1, p2, p1, v0}, Lm4/g;->b(IZZ)V

    :cond_1c
    :goto_e
    iput-boolean p2, p0, Lm4/l;->z0:Z

    return-void
.end method

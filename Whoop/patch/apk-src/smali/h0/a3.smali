.class public final Lh0/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lh0/c3;


# direct methods
.method public constructor <init>(Lh0/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/a3;->a:Lh0/c3;

    return-void
.end method


# virtual methods
.method public final a(IJ)J
    .locals 23

    move/from16 v0, p1

    move-object/from16 v1, p0

    move-wide/from16 v2, p2

    iget-object v4, v1, Lh0/a3;->a:Lh0/c3;

    iput v0, v4, Lh0/c3;->j:I

    iget-object v5, v4, Lh0/c3;->b:Lf0/k;

    if-eqz v5, :cond_2f

    iget-object v6, v4, Lh0/c3;->a:Lh0/x2;

    invoke-interface {v6}, Lh0/x2;->d()Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, v4, Lh0/c3;->a:Lh0/x2;

    invoke-interface {v6}, Lh0/x2;->c()Z

    move-result v6

    if-eqz v6, :cond_2f

    :cond_0
    iget v0, v4, Lh0/c3;->j:I

    iget-object v4, v4, Lh0/c3;->m:La6/i;

    iget-object v6, v5, Lf0/k;->c:Lf0/g0;

    iget-wide v7, v5, Lf0/k;->g:J

    invoke-static {v7, v8}, Lh2/e;->f(J)Z

    move-result v7

    if-eqz v7, :cond_1

    new-instance v0, Lh2/b;

    invoke-direct {v0, v2, v3}, Lh2/b;-><init>(J)V

    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v2, v0, Lh2/b;->a:J

    goto/16 :goto_15

    :cond_1
    iget-boolean v7, v5, Lf0/k;->f:Z

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    if-nez v7, :cond_6

    iget-object v7, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v5, v8, v9}, Lf0/k;->f(J)F

    :cond_2
    iget-object v7, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5, v8, v9}, Lf0/k;->g(J)F

    :cond_3
    iget-object v7, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v5, v8, v9}, Lf0/k;->h(J)F

    :cond_4
    iget-object v7, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v5, v8, v9}, Lf0/k;->e(J)F

    :cond_5
    iput-boolean v10, v5, Lf0/k;->f:Z

    :cond_6
    sget v7, Lf0/m;->a:I

    const/4 v7, 0x2

    if-ne v0, v7, :cond_7

    const/high16 v7, 0x40800000    # 4.0f

    goto :goto_0

    :cond_7
    const/high16 v7, 0x3f800000    # 1.0f

    :goto_0
    invoke-static {v7, v2, v3}, Lh2/b;->i(FJ)J

    move-result-wide v11

    const-wide v15, 0xffffffffL

    and-long v13, v2, v15

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    const/16 v17, 0x0

    cmpg-float v14, v14, v17

    if-nez v14, :cond_8

    move-wide/from16 v20, v11

    move-wide/from16 v18, v15

    :goto_1
    move/from16 v8, v17

    goto/16 :goto_3

    :cond_8
    iget-object v14, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v14}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    cmpg-float v14, v14, v17

    if-gez v14, :cond_b

    invoke-virtual {v5, v11, v12}, Lf0/k;->h(J)F

    move-result v14

    move-wide/from16 v18, v15

    iget-object v15, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v15}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v15

    if-nez v15, :cond_9

    invoke-virtual {v6}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v15

    invoke-virtual {v15}, Landroid/widget/EdgeEffect;->finish()V

    :cond_9
    and-long v8, v11, v18

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    cmpg-float v8, v14, v8

    if-nez v8, :cond_a

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    :goto_2
    move-wide/from16 v20, v11

    goto :goto_3

    :cond_a
    div-float v8, v14, v7

    goto :goto_2

    :cond_b
    move-wide/from16 v18, v15

    iget-object v8, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v8}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    cmpl-float v8, v8, v17

    if-lez v8, :cond_e

    invoke-virtual {v5, v11, v12}, Lf0/k;->e(J)F

    move-result v8

    iget-object v9, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    if-nez v9, :cond_c

    invoke-virtual {v6}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v9

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    :cond_c
    move-wide/from16 v20, v11

    and-long v10, v20, v18

    long-to-int v9, v10

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    cmpg-float v9, v8, v9

    if-nez v9, :cond_d

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    goto :goto_3

    :cond_d
    div-float/2addr v8, v7

    goto :goto_3

    :cond_e
    move-wide/from16 v20, v11

    goto :goto_1

    :goto_3
    const/16 v9, 0x20

    shr-long v10, v2, v9

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    cmpg-float v11, v11, v17

    if-nez v11, :cond_10

    move/from16 v20, v9

    :cond_f
    move/from16 v7, v17

    goto/16 :goto_4

    :cond_10
    iget-object v11, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v11}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    cmpg-float v11, v11, v17

    if-gez v11, :cond_13

    move-wide/from16 v11, v20

    invoke-virtual {v5, v11, v12}, Lf0/k;->f(J)F

    move-result v14

    move/from16 v20, v9

    iget-object v9, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-virtual {v6}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v9

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    :cond_11
    shr-long v11, v11, v20

    long-to-int v9, v11

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    cmpg-float v9, v14, v9

    if-nez v9, :cond_12

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    goto :goto_4

    :cond_12
    div-float v7, v14, v7

    goto :goto_4

    :cond_13
    move-wide/from16 v11, v20

    move/from16 v20, v9

    iget-object v9, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    cmpl-float v9, v9, v17

    if-lez v9, :cond_f

    invoke-virtual {v5, v11, v12}, Lf0/k;->g(J)F

    move-result v9

    iget-object v14, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v14}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v14

    if-nez v14, :cond_14

    invoke-virtual {v6}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v14

    invoke-virtual {v14}, Landroid/widget/EdgeEffect;->finish()V

    :cond_14
    shr-long v11, v11, v20

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    cmpg-float v11, v9, v11

    if-nez v11, :cond_15

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    goto :goto_4

    :cond_15
    div-float v7, v9, v7

    :goto_4
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v11, v7

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long v11, v11, v20

    and-long v7, v7, v18

    or-long/2addr v7, v11

    const-wide/16 v11, 0x0

    invoke-static {v7, v8, v11, v12}, Lh2/b;->c(JJ)Z

    move-result v9

    if-nez v9, :cond_16

    invoke-virtual {v5}, Lf0/k;->d()V

    :cond_16
    invoke-static {v2, v3, v7, v8}, Lh2/b;->g(JJ)J

    move-result-wide v2

    new-instance v9, Lh2/b;

    invoke-direct {v9, v2, v3}, Lh2/b;-><init>(J)V

    invoke-interface {v4, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh2/b;

    iget-wide v11, v4, Lh2/b;->a:J

    move v4, v10

    invoke-static {v2, v3, v11, v12}, Lh2/b;->g(JJ)J

    move-result-wide v9

    move/from16 v21, v13

    shr-long v13, v2, v20

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    cmpg-float v13, v13, v17

    if-nez v13, :cond_17

    and-long v13, v2, v18

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    cmpg-float v13, v13, v17

    if-nez v13, :cond_17

    goto :goto_5

    :cond_17
    shr-long v13, v11, v20

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    cmpg-float v13, v13, v17

    if-nez v13, :cond_18

    and-long v13, v11, v18

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    cmpg-float v13, v13, v17

    if-nez v13, :cond_18

    goto :goto_5

    :cond_18
    iget-object v13, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v13}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v13

    if-nez v13, :cond_19

    iget-object v13, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v13}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v13

    if-nez v13, :cond_19

    iget-object v13, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v13}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v13

    if-nez v13, :cond_19

    iget-object v13, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v13}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v13

    if-eqz v13, :cond_1a

    :cond_19
    invoke-virtual {v5}, Lf0/k;->a()V

    :cond_1a
    :goto_5
    const/4 v14, 0x1

    if-ne v0, v14, :cond_20

    shr-long v13, v9, v20

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    const/high16 v20, 0x3f000000    # 0.5f

    cmpl-float v14, v14, v20

    const/high16 v22, -0x41000000    # -0.5f

    if-lez v14, :cond_1b

    invoke-virtual {v5, v9, v10}, Lf0/k;->f(J)F

    :goto_6
    const/4 v13, 0x1

    goto :goto_7

    :cond_1b
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    cmpg-float v13, v13, v22

    if-gez v13, :cond_1c

    invoke-virtual {v5, v9, v10}, Lf0/k;->g(J)F

    goto :goto_6

    :cond_1c
    const/4 v13, 0x0

    :goto_7
    and-long v0, v9, v18

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    cmpl-float v1, v1, v20

    if-lez v1, :cond_1d

    invoke-virtual {v5, v9, v10}, Lf0/k;->h(J)F

    :goto_8
    const/4 v0, 0x1

    goto :goto_9

    :cond_1d
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    cmpg-float v0, v0, v22

    if-gez v0, :cond_1e

    invoke-virtual {v5, v9, v10}, Lf0/k;->e(J)F

    goto :goto_8

    :cond_1e
    const/4 v0, 0x0

    :goto_9
    if-nez v13, :cond_1f

    if-eqz v0, :cond_20

    :cond_1f
    const/4 v0, 0x1

    :goto_a
    const-wide/16 v9, 0x0

    goto :goto_b

    :cond_20
    const/4 v0, 0x0

    goto :goto_a

    :goto_b
    invoke-static {v2, v3, v9, v10}, Lh2/b;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_2d

    iget-object v1, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    cmpg-float v1, v1, v17

    if-gez v1, :cond_21

    invoke-virtual {v6}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1, v2}, Ldp/d;->S(Landroid/widget/EdgeEffect;F)V

    iget-object v1, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v1

    goto :goto_c

    :cond_21
    const/4 v1, 0x0

    :goto_c
    iget-object v2, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpl-float v2, v2, v17

    if-lez v2, :cond_24

    invoke-virtual {v6}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v2, v3}, Ldp/d;->S(Landroid/widget/EdgeEffect;F)V

    if-nez v1, :cond_23

    iget-object v1, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_d

    :cond_22
    const/4 v1, 0x0

    goto :goto_e

    :cond_23
    :goto_d
    const/4 v1, 0x1

    :cond_24
    :goto_e
    iget-object v2, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v2, v2, v17

    if-gez v2, :cond_27

    invoke-virtual {v6}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v2, v3}, Ldp/d;->S(Landroid/widget/EdgeEffect;F)V

    if-nez v1, :cond_26

    iget-object v1, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v1

    if-eqz v1, :cond_25

    goto :goto_f

    :cond_25
    const/4 v1, 0x0

    goto :goto_10

    :cond_26
    :goto_f
    const/4 v1, 0x1

    :cond_27
    :goto_10
    iget-object v2, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpl-float v2, v2, v17

    if-lez v2, :cond_2a

    invoke-virtual {v6}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v2, v3}, Ldp/d;->S(Landroid/widget/EdgeEffect;F)V

    if-nez v1, :cond_29

    iget-object v1, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v1

    if-eqz v1, :cond_28

    goto :goto_11

    :cond_28
    const/4 v1, 0x0

    goto :goto_12

    :cond_29
    :goto_11
    const/4 v1, 0x1

    :cond_2a
    :goto_12
    if-nez v1, :cond_2c

    if-eqz v0, :cond_2b

    goto :goto_13

    :cond_2b
    const/4 v10, 0x0

    goto :goto_14

    :cond_2c
    :goto_13
    const/4 v10, 0x1

    :goto_14
    move v0, v10

    :cond_2d
    if-eqz v0, :cond_2e

    invoke-virtual {v5}, Lf0/k;->d()V

    :cond_2e
    invoke-static {v7, v8, v11, v12}, Lh2/b;->h(JJ)J

    move-result-wide v2

    :goto_15
    return-wide v2

    :cond_2f
    iget-object v1, v4, Lh0/c3;->k:Lh0/k2;

    invoke-virtual {v4, v1, v2, v3, v0}, Lh0/c3;->c(Lh0/k2;JI)J

    move-result-wide v0

    return-wide v0
.end method

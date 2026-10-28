.class public final Lbc/t;
.super Lbc/x;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Z

.field public c:Z

.field public d:Lg6/f;

.field public final e:Lab/h0;

.field public f:La8/c;

.field public final synthetic g:Lbc/c0;


# direct methods
.method public constructor <init>(Lbc/c0;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/t;->g:Lbc/c0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lbc/t;->a:J

    new-instance p1, Lab/h0;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lab/h0;-><init>(IB)V

    const/16 v0, 0x14

    new-array v1, v0, [J

    iput-object v1, p1, Lab/h0;->y:Ljava/lang/Object;

    new-array v0, v0, [F

    iput-object v0, p1, Lab/h0;->z:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p1, Lab/h0;->x:I

    const-wide/high16 v2, -0x8000000000000000L

    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    iput-object p1, p0, Lbc/t;->e:Lab/h0;

    return-void
.end method


# virtual methods
.method public final d(Lbc/w;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbc/t;->c:Z

    return-void
.end method

.method public final g()V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lbc/t;->d:Lg6/f;

    if-eqz v1, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v3, v0, Lbc/t;->a:J

    long-to-float v3, v3

    iget-object v4, v0, Lbc/t;->e:Lab/h0;

    iget v5, v4, Lab/h0;->x:I

    iget-object v6, v4, Lab/h0;->z:Ljava/lang/Object;

    check-cast v6, [F

    iget-object v7, v4, Lab/h0;->y:Ljava/lang/Object;

    check-cast v7, [J

    const/4 v8, 0x1

    add-int/2addr v5, v8

    const/16 v9, 0x14

    rem-int/2addr v5, v9

    iput v5, v4, Lab/h0;->x:I

    aput-wide v1, v7, v5

    aput v3, v6, v5

    new-instance v1, Lg6/f;

    new-instance v2, Lg6/e;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput v3, v2, Lg6/e;->a:F

    invoke-direct {v1, v2}, Lg6/f;-><init>(Lg6/e;)V

    iput-object v1, v0, Lbc/t;->d:Lg6/f;

    new-instance v1, Lg6/g;

    invoke-direct {v1}, Lg6/g;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v10, v2

    iput-wide v10, v1, Lg6/g;->b:D

    const/4 v2, 0x0

    iput-boolean v2, v1, Lg6/g;->c:Z

    const/high16 v5, 0x43480000    # 200.0f

    invoke-virtual {v1, v5}, Lg6/g;->a(F)V

    iget-object v5, v0, Lbc/t;->d:Lg6/f;

    iput-object v1, v5, Lg6/f;->m:Lg6/g;

    iget-wide v10, v0, Lbc/t;->a:J

    long-to-float v1, v10

    iput v1, v5, Lg6/f;->b:F

    iput-boolean v8, v5, Lg6/f;->c:Z

    iget-object v1, v5, Lg6/f;->l:Ljava/util/ArrayList;

    iget-boolean v5, v5, Lg6/f;->f:Z

    if-nez v5, :cond_10

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, v0, Lbc/t;->d:Lg6/f;

    iget v5, v4, Lab/h0;->x:I

    const-wide/high16 v10, -0x8000000000000000L

    if-nez v5, :cond_2

    aget-wide v12, v7, v5

    cmp-long v12, v12, v10

    if-nez v12, :cond_2

    goto/16 :goto_5

    :cond_2
    aget-wide v12, v7, v5

    move-wide v14, v12

    :goto_0
    aget-wide v16, v7, v5

    cmp-long v18, v16, v10

    if-nez v18, :cond_3

    goto :goto_1

    :cond_3
    sub-long v10, v12, v16

    long-to-float v10, v10

    sub-long v14, v16, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v14

    long-to-float v11, v14

    const/high16 v14, 0x42c80000    # 100.0f

    cmpl-float v10, v10, v14

    if-gtz v10, :cond_7

    const/high16 v10, 0x42200000    # 40.0f

    cmpl-float v10, v11, v10

    if-lez v10, :cond_4

    goto :goto_1

    :cond_4
    if-nez v5, :cond_5

    move v5, v9

    :cond_5
    sub-int/2addr v5, v8

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v9, :cond_6

    goto :goto_1

    :cond_6
    move-wide/from16 v14, v16

    const-wide/high16 v10, -0x8000000000000000L

    goto :goto_0

    :cond_7
    :goto_1
    const/4 v5, 0x2

    if-ge v2, v5, :cond_8

    goto/16 :goto_5

    :cond_8
    const/high16 v10, 0x447a0000    # 1000.0f

    if-ne v2, v5, :cond_b

    iget v2, v4, Lab/h0;->x:I

    if-nez v2, :cond_9

    const/16 v4, 0x13

    goto :goto_2

    :cond_9
    add-int/lit8 v4, v2, -0x1

    :goto_2
    aget-wide v8, v7, v2

    aget-wide v11, v7, v4

    sub-long/2addr v8, v11

    long-to-float v5, v8

    cmpl-float v7, v5, v3

    if-nez v7, :cond_a

    goto/16 :goto_5

    :cond_a
    aget v2, v6, v2

    aget v3, v6, v4

    sub-float/2addr v2, v3

    div-float/2addr v2, v5

    mul-float v3, v2, v10

    goto/16 :goto_5

    :cond_b
    iget v4, v4, Lab/h0;->x:I

    sub-int v2, v4, v2

    add-int/lit8 v2, v2, 0x15

    rem-int/2addr v2, v9

    add-int/lit8 v4, v4, 0x15

    rem-int/2addr v4, v9

    aget-wide v11, v7, v2

    aget v5, v6, v2

    add-int/2addr v2, v8

    rem-int/lit8 v8, v2, 0x14

    move v13, v3

    :goto_3
    const/high16 v14, 0x40000000    # 2.0f

    if-eq v8, v4, :cond_e

    aget-wide v15, v7, v8

    move/from16 v17, v3

    move/from16 v18, v4

    sub-long v3, v15, v11

    long-to-float v3, v3

    cmpl-float v4, v3, v17

    if-nez v4, :cond_c

    move/from16 v19, v9

    move/from16 v20, v10

    goto :goto_4

    :cond_c
    aget v4, v6, v8

    invoke-static {v13}, Ljava/lang/Math;->signum(F)F

    move-result v11

    float-to-double v11, v11

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v19

    mul-float v14, v14, v19

    move/from16 v19, v9

    move/from16 v20, v10

    float-to-double v9, v14

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    mul-double/2addr v9, v11

    double-to-float v9, v9

    sub-float v5, v4, v5

    div-float/2addr v5, v3

    sub-float v3, v5, v9

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    mul-float/2addr v5, v3

    add-float/2addr v5, v13

    if-ne v8, v2, :cond_d

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v5, v3

    :cond_d
    move v13, v5

    move v5, v4

    move-wide v11, v15

    :goto_4
    add-int/lit8 v8, v8, 0x1

    rem-int/lit8 v8, v8, 0x14

    move/from16 v3, v17

    move/from16 v4, v18

    move/from16 v9, v19

    move/from16 v10, v20

    goto :goto_3

    :cond_e
    move/from16 v20, v10

    invoke-static {v13}, Ljava/lang/Math;->signum(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float/2addr v4, v14

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    double-to-float v2, v4

    mul-float v3, v2, v20

    :goto_5
    iput v3, v1, Lg6/f;->a:F

    iget-object v1, v0, Lbc/t;->d:Lg6/f;

    iget-object v2, v0, Lbc/t;->g:Lbc/c0;

    iget-wide v2, v2, Lbc/w;->X:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    long-to-float v2, v2

    iput v2, v1, Lg6/f;->g:F

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, v1, Lg6/f;->h:F

    const/high16 v2, 0x40800000    # 4.0f

    iput v2, v1, Lg6/f;->j:F

    new-instance v2, Lbc/s;

    invoke-direct {v2, v0}, Lbc/s;-><init>(Lbc/t;)V

    iget-object v1, v1, Lg6/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_6
    return-void

    :cond_10
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Error: Update listeners must be added beforethe animation."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

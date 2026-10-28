.class public final Lg6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic w:La33/d;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/a;->w:La33/d;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lg6/a;->w:La33/d;

    iget-object v1, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Le10/k0;

    iget-object v1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lg6/b;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v4, v1, Lg6/b;->b:Ljava/util/ArrayList;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_12

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg6/f;

    if-nez v9, :cond_1

    :cond_0
    :goto_1
    move-wide/from16 v16, v2

    move-wide/from16 v18, v5

    move/from16 v29, v8

    goto/16 :goto_9

    :cond_1
    iget-object v11, v1, Lg6/b;->a:La0/f1;

    invoke-virtual {v11, v9}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    cmp-long v12, v12, v5

    if-gez v12, :cond_0

    invoke-virtual {v11, v9}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    iget-wide v11, v9, Lg6/f;->i:J

    const-wide/16 v13, 0x0

    cmp-long v15, v11, v13

    if-nez v15, :cond_3

    iput-wide v2, v9, Lg6/f;->i:J

    iget v10, v9, Lg6/f;->b:F

    invoke-virtual {v9, v10}, Lg6/f;->b(F)V

    goto :goto_1

    :cond_3
    sub-long v20, v2, v11

    iput-wide v2, v9, Lg6/f;->i:J

    iget-boolean v11, v9, Lg6/f;->o:Z

    const/4 v12, 0x0

    const v15, 0x7f7fffff    # Float.MAX_VALUE

    if-eqz v11, :cond_5

    iget v11, v9, Lg6/f;->n:F

    cmpl-float v16, v11, v15

    if-eqz v16, :cond_4

    iget-object v13, v9, Lg6/f;->m:Lg6/g;

    float-to-double v10, v11

    iput-wide v10, v13, Lg6/g;->i:D

    iput v15, v9, Lg6/f;->n:F

    :cond_4
    iget-object v10, v9, Lg6/f;->m:Lg6/g;

    iget-wide v10, v10, Lg6/g;->i:D

    double-to-float v10, v10

    iput v10, v9, Lg6/f;->b:F

    iput v12, v9, Lg6/f;->a:F

    iput-boolean v7, v9, Lg6/f;->o:Z

    move/from16 v29, v8

    :goto_3
    const/4 v14, 0x1

    goto/16 :goto_5

    :cond_5
    iget v10, v9, Lg6/f;->n:F

    cmpl-float v10, v10, v15

    if-eqz v10, :cond_6

    iget-object v10, v9, Lg6/f;->m:Lg6/g;

    move v13, v8

    iget-wide v7, v10, Lg6/g;->i:D

    iget v7, v9, Lg6/f;->b:F

    float-to-double v7, v7

    iget v11, v9, Lg6/f;->a:F

    move/from16 v29, v13

    float-to-double v12, v11

    const-wide/16 v16, 0x2

    div-long v27, v20, v16

    move-wide/from16 v23, v7

    move-object/from16 v22, v10

    move-wide/from16 v25, v12

    invoke-virtual/range {v22 .. v28}, Lg6/g;->b(DDJ)Ld0/f0;

    move-result-object v7

    iget-object v8, v9, Lg6/f;->m:Lg6/g;

    iget v10, v9, Lg6/f;->n:F

    float-to-double v10, v10

    iput-wide v10, v8, Lg6/g;->i:D

    iput v15, v9, Lg6/f;->n:F

    iget v10, v7, Ld0/f0;->w:F

    float-to-double v10, v10

    iget v7, v7, Ld0/f0;->x:F

    float-to-double v12, v7

    move-object/from16 v22, v8

    move-wide/from16 v23, v10

    move-wide/from16 v25, v12

    invoke-virtual/range {v22 .. v28}, Lg6/g;->b(DDJ)Ld0/f0;

    move-result-object v7

    iget v8, v7, Ld0/f0;->w:F

    iput v8, v9, Lg6/f;->b:F

    iget v7, v7, Ld0/f0;->x:F

    iput v7, v9, Lg6/f;->a:F

    goto :goto_4

    :cond_6
    move/from16 v29, v8

    iget-object v15, v9, Lg6/f;->m:Lg6/g;

    iget v7, v9, Lg6/f;->b:F

    float-to-double v7, v7

    iget v10, v9, Lg6/f;->a:F

    float-to-double v10, v10

    move-wide/from16 v16, v7

    move-wide/from16 v18, v10

    invoke-virtual/range {v15 .. v21}, Lg6/g;->b(DDJ)Ld0/f0;

    move-result-object v7

    iget v8, v7, Ld0/f0;->w:F

    iput v8, v9, Lg6/f;->b:F

    iget v7, v7, Ld0/f0;->x:F

    iput v7, v9, Lg6/f;->a:F

    :goto_4
    iget v7, v9, Lg6/f;->b:F

    iget v8, v9, Lg6/f;->h:F

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v9, Lg6/f;->b:F

    iget v8, v9, Lg6/f;->g:F

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    iput v7, v9, Lg6/f;->b:F

    iget v8, v9, Lg6/f;->a:F

    iget-object v10, v9, Lg6/f;->m:Lg6/g;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    float-to-double v11, v8

    iget-wide v14, v10, Lg6/g;->e:D

    cmpg-double v11, v11, v14

    if-gez v11, :cond_7

    iget-wide v11, v10, Lg6/g;->i:D

    double-to-float v11, v11

    sub-float/2addr v7, v11

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    float-to-double v11, v7

    iget-wide v13, v10, Lg6/g;->d:D

    cmpg-double v7, v11, v13

    if-gez v7, :cond_7

    iget-object v7, v9, Lg6/f;->m:Lg6/g;

    iget-wide v10, v7, Lg6/g;->i:D

    double-to-float v7, v10

    iput v7, v9, Lg6/f;->b:F

    const/4 v7, 0x0

    iput v7, v9, Lg6/f;->a:F

    goto/16 :goto_3

    :cond_7
    const/4 v14, 0x0

    :goto_5
    iget v7, v9, Lg6/f;->b:F

    iget v10, v9, Lg6/f;->g:F

    invoke-static {v7, v10}, Ljava/lang/Math;->min(FF)F

    move-result v7

    iput v7, v9, Lg6/f;->b:F

    iget v10, v9, Lg6/f;->h:F

    invoke-static {v7, v10}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v9, Lg6/f;->b:F

    invoke-virtual {v9, v7}, Lg6/f;->b(F)V

    if-eqz v14, :cond_10

    iget-object v7, v9, Lg6/f;->k:Ljava/util/ArrayList;

    const/4 v11, 0x0

    iput-boolean v11, v9, Lg6/f;->f:Z

    sget-object v10, Lg6/b;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_8

    new-instance v12, Lg6/b;

    invoke-direct {v12}, Lg6/b;-><init>()V

    invoke-virtual {v10, v12}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg6/b;

    iget-object v12, v10, Lg6/b;->a:La0/f1;

    invoke-virtual {v12, v9}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v12, v10, Lg6/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    const/4 v15, 0x0

    if-ltz v13, :cond_9

    invoke-virtual {v12, v13, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v14, 0x1

    iput-boolean v14, v10, Lg6/b;->e:Z

    :cond_9
    const-wide/16 v12, 0x0

    iput-wide v12, v9, Lg6/f;->i:J

    const/4 v11, 0x0

    iput-boolean v11, v9, Lg6/f;->c:Z

    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v8, v10, :cond_e

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbc/s;

    iget v12, v9, Lg6/f;->b:F

    iget-object v10, v10, Lbc/s;->a:Lbc/t;

    iget-object v13, v10, Lbc/t;->g:Lbc/c0;

    const/high16 v16, 0x3f800000    # 1.0f

    cmpg-float v12, v12, v16

    sget-object v11, Lbc/v;->c:Lab/a;

    if-gez v12, :cond_b

    iget-wide v14, v13, Lbc/w;->X:J

    const/4 v12, 0x0

    invoke-virtual {v13, v12}, Lbc/c0;->Q(I)Lbc/w;

    move-result-object v0

    iget-object v12, v0, Lbc/w;->S:Lbc/w;

    move-wide/from16 v16, v2

    const/4 v2, 0x0

    iput-object v2, v0, Lbc/w;->S:Lbc/w;

    iget-wide v2, v10, Lbc/t;->a:J

    move-wide/from16 v18, v5

    const-wide/16 v5, -0x1

    invoke-virtual {v13, v5, v6, v2, v3}, Lbc/c0;->G(JJ)V

    invoke-virtual {v13, v14, v15, v5, v6}, Lbc/c0;->G(JJ)V

    iput-wide v14, v10, Lbc/t;->a:J

    iget-object v0, v10, Lbc/t;->f:La8/c;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, La8/c;->run()V

    :cond_a
    iget-object v0, v13, Lbc/w;->U:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-eqz v12, :cond_d

    const/4 v14, 0x1

    invoke-virtual {v12, v12, v11, v14}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    goto :goto_7

    :cond_b
    move-wide/from16 v16, v2

    move-wide/from16 v18, v5

    const/4 v12, 0x0

    const/4 v14, 0x1

    invoke-virtual {v13, v13, v11, v12}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    goto :goto_7

    :cond_c
    move-wide/from16 v16, v2

    move-wide/from16 v18, v5

    :cond_d
    const/4 v14, 0x1

    :goto_7
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-wide/from16 v2, v16

    move-wide/from16 v5, v18

    const/4 v15, 0x0

    goto :goto_6

    :cond_e
    move-wide/from16 v16, v2

    move-wide/from16 v18, v5

    const/4 v14, 0x1

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v14

    :goto_8
    if-ltz v0, :cond_11

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_f

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_f
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_10
    move-wide/from16 v16, v2

    move-wide/from16 v18, v5

    :cond_11
    :goto_9
    add-int/lit8 v8, v29, 0x1

    move-object/from16 v0, p0

    move-wide/from16 v2, v16

    move-wide/from16 v5, v18

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_12
    iget-boolean v0, v1, Lg6/b;->e:Z

    if-eqz v0, :cond_15

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v14, 0x1

    sub-int/2addr v0, v14

    :goto_a
    if-ltz v0, :cond_14

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_13

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_13
    add-int/lit8 v0, v0, -0x1

    goto :goto_a

    :cond_14
    const/4 v11, 0x0

    iput-boolean v11, v1, Lg6/b;->e:Z

    :cond_15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_17

    iget-object v0, v1, Lg6/b;->d:La33/d;

    if-nez v0, :cond_16

    new-instance v0, La33/d;

    iget-object v2, v1, Lg6/b;->c:Le10/k0;

    invoke-direct {v0, v2}, La33/d;-><init>(Le10/k0;)V

    iput-object v0, v1, Lg6/b;->d:La33/d;

    :cond_16
    iget-object v0, v1, Lg6/b;->d:La33/d;

    iget-object v1, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/Choreographer;

    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lg6/a;

    invoke-virtual {v1, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_17
    return-void
.end method

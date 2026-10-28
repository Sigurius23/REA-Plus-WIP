.class public final synthetic Ly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Le0;FLp1/z0;FFF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ly;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly;->F:Ljava/lang/Object;

    iput p2, p0, Ly;->x:F

    iput-object p3, p0, Ly;->G:Ljava/lang/Object;

    iput p4, p0, Ly;->y:F

    iput p5, p0, Ly;->z:F

    iput p6, p0, Ly;->E:F

    return-void
.end method

.method public synthetic constructor <init>(Li2/t;Li2/x;FFFF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ly;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly;->F:Ljava/lang/Object;

    iput-object p2, p0, Ly;->G:Ljava/lang/Object;

    iput p3, p0, Ly;->x:F

    iput p4, p0, Ly;->y:F

    iput p5, p0, Ly;->z:F

    iput p6, p0, Ly;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v1, p0

    iget v0, v1, Ly;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ly;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/t;

    iget-object v0, v1, Ly;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/x;

    iget v7, v1, Ly;->E:F

    move-object/from16 v8, p1

    check-cast v8, Lk2/e;

    iget v4, v1, Ly;->x:F

    iget v5, v1, Ly;->y:F

    iget v6, v1, Ly;->z:F

    invoke-static/range {v2 .. v8}, Lc31/p;->f(Li2/t;Li2/x;FFFFLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Ly;->F:Ljava/lang/Object;

    check-cast v0, Le0;

    iget-object v2, v1, Ly;->G:Ljava/lang/Object;

    check-cast v2, Lp1/z0;

    iget v3, v1, Ly;->y:F

    iget v4, v1, Ly;->z:F

    iget v5, v1, Ly;->E:F

    move-object/from16 v6, p1

    check-cast v6, Lk2/e;

    const-string v7, "$this$Canvas"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Lk2/e;->d()J

    move-result-wide v7

    const/16 v17, 0x20

    shr-long v7, v7, v17

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    const/high16 v18, 0x40000000    # 2.0f

    div-float v7, v7, v18

    invoke-interface {v6}, Lk2/e;->d()J

    move-result-wide v8

    const-wide v19, 0xffffffffL

    and-long v8, v8, v19

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    div-float v8, v8, v18

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v9, v7

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long v9, v9, v17

    and-long v7, v7, v19

    or-long/2addr v7, v9

    invoke-interface {v6}, Lk2/e;->d()J

    move-result-wide v9

    invoke-static {v9, v10}, Lh2/e;->d(J)F

    move-result v9

    const v10, 0x400ccccd    # 2.2f

    div-float v12, v9, v10

    float-to-double v9, v12

    const/4 v11, 0x1

    int-to-double v13, v11

    iget v11, v0, Le0;->e:F

    move-wide v15, v13

    iget-wide v13, v0, Le0;->h:J

    move-object/from16 v21, v2

    move/from16 v22, v3

    float-to-double v2, v11

    const-wide/high16 v23, 0x4000000000000000L    # 2.0

    div-double v2, v2, v23

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    sub-double v2, v15, v2

    mul-double/2addr v2, v9

    shr-long v9, v7, v17

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    and-long v7, v7, v19

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    double-to-float v2, v2

    div-float v2, v2, v18

    add-float/2addr v2, v7

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v7, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v7, v7, v17

    and-long v2, v2, v19

    or-long/2addr v2, v7

    iget v7, v0, Le0;->e:F

    iget v15, v0, Le0;->d:I

    int-to-float v8, v15

    div-float v23, v7, v8

    iget v7, v0, Le0;->f:F

    iget v9, v0, Le0;->s:F

    const/high16 v10, 0x40400000    # 3.0f

    mul-float/2addr v9, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    mul-float v24, v9, v8

    iget v9, v1, Ly;->x:F

    div-float/2addr v9, v10

    mul-float/2addr v9, v8

    float-to-int v8, v9

    iget-wide v9, v0, Le0;->i:J

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v15, :cond_5

    int-to-float v1, v11

    move-object/from16 v16, v21

    check-cast v16, Lp1/g1;

    invoke-virtual/range {v16 .. v16}, Lp1/g1;->x()F

    move-result v25

    sub-float v26, v25, v24

    cmpg-float v27, v26, v1

    move/from16 p1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    move-wide/from16 v28, v13

    const/4 v13, 0x0

    if-gtz v27, :cond_0

    cmpg-float v14, p1, v25

    if-gtz v14, :cond_0

    sub-float v14, p1, v26

    div-float v14, v14, v24

    invoke-static {v14, v13, v1}, Le93/b;->m(FFF)F

    move-result v14

    move/from16 v25, v1

    invoke-static/range {v28 .. v29}, Li2/x;->i(J)F

    move-result v1

    invoke-static {v9, v10}, Li2/x;->i(J)F

    move-result v13

    invoke-static {v1, v13, v14}, Lo73/a;->T(FFF)F

    move-result v1

    invoke-static/range {v28 .. v29}, Li2/x;->h(J)F

    move-result v13

    move/from16 v27, v4

    invoke-static {v9, v10}, Li2/x;->h(J)F

    move-result v4

    invoke-static {v13, v4, v14}, Lo73/a;->T(FFF)F

    move-result v4

    invoke-static/range {v28 .. v29}, Li2/x;->f(J)F

    move-result v13

    move/from16 v30, v5

    invoke-static {v9, v10}, Li2/x;->f(J)F

    move-result v5

    invoke-static {v13, v5, v14}, Lo73/a;->T(FFF)F

    move-result v5

    invoke-static/range {v28 .. v29}, Li2/x;->e(J)F

    move-result v13

    move-object/from16 v31, v6

    invoke-static {v9, v10}, Li2/x;->e(J)F

    move-result v6

    invoke-static {v13, v6, v14}, Lo73/a;->T(FFF)F

    move-result v6

    const/16 v13, 0x10

    invoke-static {v1, v4, v5, v6, v13}, Li2/w0;->f(FFFFI)J

    move-result-wide v4

    goto :goto_1

    :cond_0
    move/from16 v25, v1

    move/from16 v27, v4

    move/from16 v30, v5

    move-object/from16 v31, v6

    invoke-virtual/range {v16 .. v16}, Lp1/g1;->x()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_2

    if-ge v11, v8, :cond_1

    iget-wide v4, v0, Le0;->g:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, v28

    goto :goto_1

    :cond_2
    sget-wide v4, Li2/x;->m:J

    :goto_1
    invoke-interface/range {v31 .. v31}, Lk2/e;->t0()La3/p;

    move-result-object v1

    invoke-virtual {v1}, La3/p;->A()J

    move-result-wide v13

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    invoke-virtual {v6, v7, v2, v3}, Laj/d;->v(FJ)V

    iget v6, v0, Le0;->m:F

    sub-float v6, v25, v6

    mul-float v6, v6, v22

    move/from16 v16, v7

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v7

    move-wide/from16 v32, v2

    shr-long v2, v32, v17

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float v25, v22, v18

    sub-float v3, v3, v25

    move/from16 p1, v8

    move-wide/from16 v34, v9

    and-long v8, v32, v19

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    sub-float/2addr v9, v12

    invoke-virtual {v7, v3, v9}, Li2/j;->i(FF)V

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    add-float v3, v3, v25

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    sub-float/2addr v9, v12

    invoke-virtual {v7, v3, v9}, Li2/j;->h(FF)V

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float v6, v6, v18

    add-float/2addr v3, v6

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    sub-float/2addr v9, v12

    add-float v9, v9, v27

    invoke-virtual {v7, v3, v9}, Li2/j;->h(FF)V

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v3, v6

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    sub-float/2addr v6, v12

    add-float v6, v6, v27

    invoke-virtual {v7, v3, v6}, Li2/j;->h(FF)V

    invoke-virtual {v7}, Li2/j;->f()V

    sget-wide v9, Li2/x;->m:J

    invoke-static {v4, v5, v9, v10}, Li2/x;->d(JJ)Z

    move-result v3

    if-nez v3, :cond_3

    sget-object v36, Li2/t;->b:Li2/s;

    const v3, 0x3ecccccd    # 0.4f

    move/from16 v43, v2

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v6, Li2/x;

    invoke-direct {v6, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Li2/x;

    invoke-direct {v2, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v6, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v37

    invoke-static/range {v43 .. v43}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v3, v12

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v9, v9, v17

    and-long v2, v2, v19

    or-long v38, v9, v2

    invoke-static/range {v43 .. v43}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v3, v12

    add-float v3, v3, v27

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v9, v9, v17

    and-long v2, v2, v19

    or-long v40, v9, v2

    const/16 v42, 0x8

    invoke-static/range {v36 .. v42}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v2

    const/4 v10, 0x0

    move v3, v11

    const/16 v11, 0x3c

    const/4 v9, 0x0

    move-object/from16 v6, v31

    move/from16 v31, v16

    move/from16 v16, v8

    move-object v8, v2

    move/from16 v2, p1

    invoke-static/range {v6 .. v11}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-wide v4, v13

    goto/16 :goto_4

    :cond_3
    move/from16 v43, v2

    move v3, v11

    move-object/from16 v6, v31

    move/from16 v2, p1

    move/from16 v31, v16

    move/from16 v16, v8

    :goto_2
    invoke-static/range {v43 .. v43}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float v7, v7, v25

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    sub-float/2addr v8, v12

    sub-float v8, v8, v30

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v9, v7

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long v9, v9, v17

    and-long v7, v7, v19

    or-long/2addr v9, v7

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 p1, v2

    move/from16 v25, v3

    int-to-long v2, v11

    shl-long v7, v7, v17

    and-long v2, v2, v19

    or-long/2addr v2, v7

    move v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x78

    move-wide/from16 v36, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v44, v2

    move v2, v12

    move-wide/from16 v11, v44

    move v3, v7

    const/16 v26, 0x0

    move-wide v7, v4

    move-wide/from16 v4, v36

    :try_start_1
    invoke-static/range {v6 .. v16}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v7

    invoke-interface {v7}, Li2/v;->g()V

    invoke-virtual {v1, v4, v5}, La3/p;->U(J)V

    add-int/lit8 v11, v25, 0x1

    iget v1, v0, Le0;->n:I

    rem-int v1, v11, v1

    if-nez v1, :cond_4

    iget v13, v0, Le0;->o:F

    goto :goto_3

    :cond_4
    move/from16 v13, v26

    :goto_3
    add-float v13, v23, v13

    add-float v7, v13, v31

    move-object/from16 v1, p0

    move/from16 v8, p1

    move v12, v2

    move v15, v3

    move/from16 v4, v27

    move-wide/from16 v13, v28

    move/from16 v5, v30

    move-wide/from16 v2, v32

    move-wide/from16 v9, v34

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    :goto_4
    invoke-static {v1, v4, v5}, Ld;->z(La3/p;J)V

    throw v0

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

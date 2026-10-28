.class public final Lf0/t1;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/r;


# instance fields
.field public final Q:Lf0/k;

.field public final R:Lf0/g0;

.field public S:Landroid/graphics/RenderNode;


# direct methods
.method public constructor <init>(Lu2/h0;Lf0/k;Lf0/g0;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p2, p0, Lf0/t1;->Q:Lf0/k;

    iput-object p3, p0, Lf0/t1;->R:Lf0/g0;

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    return-void
.end method

.method public static a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p2, p0}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method


# virtual methods
.method public final O(La3/p0;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v0, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    iget-object v5, v1, Lf0/t1;->Q:Lf0/k;

    invoke-virtual {v5, v3, v4}, Lf0/k;->i(J)V

    iget-object v3, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v3

    invoke-static {v3}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v3

    iget-object v4, v5, Lf0/k;->d:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/e;->f(J)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, La3/p0;->a()V

    return-void

    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v4

    iget-object v6, v1, Lf0/t1;->R:Lf0/g0;

    if-nez v4, :cond_9

    iget-object v2, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_1
    iget-object v2, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_2
    iget-object v2, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_3
    iget-object v2, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_4
    iget-object v2, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_5
    iget-object v2, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_6
    iget-object v2, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_7
    iget-object v2, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_8
    invoke-virtual {v0}, La3/p0;->a()V

    return-void

    :cond_9
    sget v4, Lf0/y;->a:F

    invoke-virtual {v0, v4}, La3/p0;->q0(F)F

    move-result v4

    iget-object v7, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v7, :cond_b

    iget-object v7, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-nez v7, :cond_b

    iget-object v7, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-nez v7, :cond_b

    iget-object v7, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_0

    :cond_a
    move v7, v9

    goto :goto_1

    :cond_b
    :goto_0
    move v7, v8

    :goto_1
    iget-object v10, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v10

    if-nez v10, :cond_d

    iget-object v10, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v10

    if-nez v10, :cond_d

    iget-object v10, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v10

    if-nez v10, :cond_d

    iget-object v10, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_2

    :cond_c
    move v10, v9

    goto :goto_3

    :cond_d
    :goto_2
    move v10, v8

    :goto_3
    if-eqz v7, :cond_e

    if-eqz v10, :cond_e

    invoke-virtual {v1}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v11

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v12

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v13

    invoke-virtual {v11, v9, v9, v12, v13}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    goto :goto_4

    :cond_e
    if-eqz v7, :cond_f

    invoke-virtual {v1}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v11

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v12

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v13

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v12

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    invoke-virtual {v11, v9, v9, v13, v12}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    goto :goto_4

    :cond_f
    if-eqz v10, :cond_2c

    invoke-virtual {v1}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v11

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v12

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v13

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v14

    mul-int/lit8 v14, v14, 0x2

    add-int/2addr v14, v13

    invoke-virtual {v11, v9, v9, v12, v14}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    :goto_4
    invoke-virtual {v1}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v11

    invoke-virtual {v11}, Landroid/graphics/RenderNode;->beginRecording()Landroid/graphics/RecordingCanvas;

    move-result-object v11

    iget-object v12, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    invoke-static {v12}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v12

    const/high16 v13, 0x42b40000    # 90.0f

    if-eqz v12, :cond_11

    iget-object v12, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    if-nez v12, :cond_10

    sget-object v12, Lh0/d2;->x:Lh0/d2;

    invoke-virtual {v6, v12}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v12

    iput-object v12, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    :cond_10
    invoke-static {v13, v12, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v12}, Landroid/widget/EdgeEffect;->finish()V

    :cond_11
    iget-object v12, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v12}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v12

    const/high16 v14, 0x43870000    # 270.0f

    const-wide v15, 0xffffffffL

    if-eqz v12, :cond_13

    invoke-virtual {v6}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v12

    invoke-static {v14, v12, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v17

    iget-object v9, v6, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-virtual {v5}, Lf0/k;->c()J

    move-result-wide v18

    and-long v13, v18, v15

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    iget-object v14, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    if-nez v14, :cond_12

    sget-object v14, Lh0/d2;->x:Lh0/d2;

    invoke-virtual {v6, v14}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v14

    iput-object v14, v6, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    :cond_12
    invoke-static {v12}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result v12

    int-to-float v9, v8

    sub-float/2addr v9, v13

    invoke-static {v14, v12, v9}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    goto :goto_5

    :cond_13
    const/16 v17, 0x0

    :cond_14
    :goto_5
    iget-object v9, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    const/high16 v12, 0x43340000    # 180.0f

    if-eqz v9, :cond_16

    iget-object v9, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    if-nez v9, :cond_15

    sget-object v9, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v6, v9}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v9

    iput-object v9, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    :cond_15
    invoke-static {v12, v9, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    :cond_16
    iget-object v9, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v9

    const/4 v14, 0x0

    if-eqz v9, :cond_1a

    invoke-virtual {v6}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v9

    invoke-static {v14, v9, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v19

    if-nez v19, :cond_18

    if-eqz v17, :cond_17

    goto :goto_7

    :cond_17
    const/16 v17, 0x0

    :goto_6
    const/16 v19, 0x20

    goto :goto_8

    :cond_18
    :goto_7
    move/from16 v17, v8

    goto :goto_6

    :goto_8
    iget-object v13, v6, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v13}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v13

    if-eqz v13, :cond_1b

    invoke-virtual {v5}, Lf0/k;->c()J

    move-result-wide v20

    move-object/from16 v22, v9

    shr-long v8, v20, v19

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    iget-object v9, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    if-nez v9, :cond_19

    sget-object v9, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v6, v9}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v9

    iput-object v9, v6, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    :cond_19
    invoke-static/range {v22 .. v22}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result v13

    invoke-static {v9, v13, v8}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    goto :goto_9

    :cond_1a
    const/16 v19, 0x20

    :cond_1b
    :goto_9
    iget-object v8, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    invoke-static {v8}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v8

    if-eqz v8, :cond_1d

    iget-object v8, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    if-nez v8, :cond_1c

    sget-object v8, Lh0/d2;->x:Lh0/d2;

    invoke-virtual {v6, v8}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v8

    iput-object v8, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    :cond_1c
    const/high16 v9, 0x43870000    # 270.0f

    invoke-static {v9, v8, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->finish()V

    :cond_1d
    iget-object v8, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v8}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-virtual {v6}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v8

    const/high16 v9, 0x42b40000    # 90.0f

    invoke-static {v9, v8, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v9

    if-nez v9, :cond_1f

    if-eqz v17, :cond_1e

    goto :goto_a

    :cond_1e
    const/16 v17, 0x0

    goto :goto_b

    :cond_1f
    :goto_a
    const/16 v17, 0x1

    :goto_b
    iget-object v9, v6, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v9}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-virtual {v5}, Lf0/k;->c()J

    move-result-wide v21

    and-long v12, v21, v15

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    iget-object v13, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    if-nez v13, :cond_20

    sget-object v13, Lh0/d2;->x:Lh0/d2;

    invoke-virtual {v6, v13}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v13

    iput-object v13, v6, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    :cond_20
    invoke-static {v8}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result v8

    invoke-static {v13, v8, v12}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    :cond_21
    iget-object v8, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    invoke-static {v8}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v8

    if-eqz v8, :cond_23

    iget-object v8, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    if-nez v8, :cond_22

    sget-object v8, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v6, v8}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v8

    iput-object v8, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    :cond_22
    invoke-static {v14, v8, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->finish()V

    :cond_23
    iget-object v8, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v8}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v8

    if-eqz v8, :cond_28

    invoke-virtual {v6}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v8

    const/high16 v9, 0x43340000    # 180.0f

    invoke-static {v9, v8, v11}, Lf0/t1;->a1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v9

    if-nez v9, :cond_25

    if-eqz v17, :cond_24

    goto :goto_c

    :cond_24
    const/4 v9, 0x0

    goto :goto_d

    :cond_25
    :goto_c
    const/4 v9, 0x1

    :goto_d
    iget-object v12, v6, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v12}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v12

    if-eqz v12, :cond_27

    invoke-virtual {v5}, Lf0/k;->c()J

    move-result-wide v12

    shr-long v12, v12, v19

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    iget-object v13, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    if-nez v13, :cond_26

    sget-object v13, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v6, v13}, Lf0/g0;->a(Lh0/d2;)Landroid/widget/EdgeEffect;

    move-result-object v13

    iput-object v13, v6, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    :cond_26
    invoke-static {v8}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result v6

    const/4 v8, 0x1

    int-to-float v8, v8

    sub-float/2addr v8, v12

    invoke-static {v13, v6, v8}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    :cond_27
    move/from16 v17, v9

    :cond_28
    if-eqz v17, :cond_29

    invoke-virtual {v5}, Lf0/k;->d()V

    :cond_29
    if-eqz v10, :cond_2a

    move v5, v14

    goto :goto_e

    :cond_2a
    move v5, v4

    :goto_e
    if-eqz v7, :cond_2b

    move v4, v14

    :cond_2b
    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v6

    new-instance v7, Li2/c;

    invoke-direct {v7}, Li2/c;-><init>()V

    iput-object v11, v7, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v8

    iget-object v10, v2, Lk2/b;->x:La3/p;

    iget-object v11, v10, La3/p;->z:Ljava/lang/Object;

    check-cast v11, Lk2/b;

    iget-object v11, v11, Lk2/b;->w:Lk2/a;

    iget-object v12, v11, Lk2/a;->a:Ly3/c;

    iget-object v11, v11, Lk2/a;->b:Ly3/m;

    invoke-virtual {v10}, La3/p;->w()Li2/v;

    move-result-object v10

    iget-object v13, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v13}, La3/p;->A()J

    move-result-wide v13

    iget-object v15, v2, Lk2/b;->x:La3/p;

    iget-object v1, v15, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ll2/c;

    invoke-virtual {v15, v0}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v15, v6}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v15, v7}, La3/p;->P(Li2/v;)V

    invoke-virtual {v15, v8, v9}, La3/p;->U(J)V

    const/4 v6, 0x0

    iput-object v6, v15, La3/p;->y:Ljava/lang/Object;

    invoke-virtual {v7}, Li2/c;->q()V

    :try_start_0
    iget-object v6, v2, Lk2/b;->x:La3/p;

    iget-object v6, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    invoke-virtual {v6, v5, v4}, Laj/d;->B(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0}, La3/p0;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v2, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    neg-float v5, v5

    neg-float v4, v4

    invoke-virtual {v0, v5, v4}, Laj/d;->B(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v7}, Li2/c;->g()V

    iget-object v0, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v0, v12}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v0, v11}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v0, v10}, La3/p;->P(Li2/v;)V

    invoke-virtual {v0, v13, v14}, La3/p;->U(J)V

    iput-object v1, v0, La3/p;->y:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RenderNode;->endRecording()V

    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {v3, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual/range {p0 .. p0}, Lf0/t1;->b1()Landroid/graphics/RenderNode;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->drawRenderNode(Landroid/graphics/RenderNode;)V

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_f

    :catchall_1
    move-exception v0

    :try_start_3
    iget-object v3, v2, Lk2/b;->x:La3/p;

    iget-object v3, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Laj/d;

    neg-float v5, v5

    neg-float v4, v4

    invoke-virtual {v3, v5, v4}, Laj/d;->B(FF)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_f
    invoke-virtual {v7}, Li2/c;->g()V

    iget-object v2, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v2, v12}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v2, v11}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v2, v10}, La3/p;->P(Li2/v;)V

    invoke-virtual {v2, v13, v14}, La3/p;->U(J)V

    iput-object v1, v2, La3/p;->y:Ljava/lang/Object;

    throw v0

    :cond_2c
    invoke-virtual {v0}, La3/p0;->a()V

    return-void
.end method

.method public final b1()Landroid/graphics/RenderNode;
    .locals 1

    iget-object v0, p0, Lf0/t1;->S:Landroid/graphics/RenderNode;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/support/v4/media/session/m;->e()Landroid/graphics/RenderNode;

    move-result-object v0

    iput-object v0, p0, Lf0/t1;->S:Landroid/graphics/RenderNode;

    :cond_0
    return-object v0
.end method

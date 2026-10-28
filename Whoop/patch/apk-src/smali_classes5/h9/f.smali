.class public final Lh9/f;
.super Lb9/f;
.source "SourceFile"


# instance fields
.field public final R:Lh9/c;

.field public final S:La9/e;

.field public final T:Ljava/util/ArrayDeque;

.field public U:Z

.field public V:Z

.field public W:Lh9/e;

.field public X:J

.field public Y:J

.field public Z:I

.field public a0:I

.field public b0:Lu8/p;

.field public c0:Lh9/b;

.field public d0:La9/e;

.field public e0:Landroidx/media3/exoplayer/image/ImageOutput;

.field public f0:Landroid/graphics/Bitmap;

.field public g0:Z

.field public h0:Lem/b;

.field public i0:Lem/b;

.field public j0:I

.field public k0:Z


# direct methods
.method public constructor <init>(Lh9/c;)V
    .locals 3

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lb9/f;-><init>(I)V

    iput-object p1, p0, Lh9/f;->R:Lh9/c;

    sget-object p1, Landroidx/media3/exoplayer/image/ImageOutput;->a:Lh9/d;

    iput-object p1, p0, Lh9/f;->e0:Landroidx/media3/exoplayer/image/ImageOutput;

    new-instance p1, La9/e;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La9/e;-><init>(I)V

    iput-object p1, p0, Lh9/f;->S:La9/e;

    sget-object p1, Lh9/e;->c:Lh9/e;

    iput-object p1, p0, Lh9/f;->W:Lh9/e;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lh9/f;->T:Ljava/util/ArrayDeque;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lh9/f;->Y:J

    iput-wide v1, p0, Lh9/f;->X:J

    iput v0, p0, Lh9/f;->Z:I

    const/4 p1, 0x1

    iput p1, p0, Lh9/f;->a0:I

    return-void
.end method


# virtual methods
.method public final A(Lu8/p;)I
    .locals 1

    iget-object v0, p0, Lh9/f;->R:Lh9/c;

    check-cast v0, Le10/k0;

    invoke-virtual {v0, p1}, Le10/k0;->M(Lu8/p;)I

    move-result p1

    return p1
.end method

.method public final C(J)Z
    .locals 12

    iget-object v0, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lh9/f;->h0:Lem/b;

    if-nez v2, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v2, p0, Lh9/f;->a0:I

    const/4 v3, 0x2

    if-nez v2, :cond_1

    iget v2, p0, Lb9/f;->H:I

    if-eq v2, v3, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v2, p0, Lh9/f;->T:Ljava/util/ArrayDeque;

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-nez v0, :cond_5

    iget-object v0, p0, Lh9/f;->c0:Lh9/b;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lh9/f;->c0:Lh9/b;

    invoke-virtual {v0}, Lh9/b;->i()La9/f;

    move-result-object v0

    check-cast v0, Lh9/a;

    if-nez v0, :cond_2

    goto/16 :goto_8

    :cond_2
    const/4 v6, 0x4

    invoke-virtual {v0, v6}, La9/a;->f(I)Z

    move-result v6

    if-eqz v6, :cond_4

    iget p1, p0, Lh9/f;->Z:I

    if-ne p1, v4, :cond_3

    invoke-virtual {p0}, Lh9/f;->F()V

    iget-object p1, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lh9/f;->E()V

    return v1

    :cond_3
    invoke-virtual {v0}, Lh9/a;->p()V

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_14

    iput-boolean v5, p0, Lh9/f;->V:Z

    return v1

    :cond_4
    iget-object v6, v0, Lh9/a;->E:Landroid/graphics/Bitmap;

    const-string v7, "Non-EOS buffer came back from the decoder without bitmap."

    invoke-static {v6, v7}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lh9/a;->E:Landroid/graphics/Bitmap;

    iput-object v6, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Lh9/a;->p()V

    :cond_5
    iget-boolean v0, p0, Lh9/f;->g0:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lh9/f;->h0:Lem/b;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lh9/f;->b0:Lu8/p;

    iget v6, v0, Lu8/p;->K:I

    iget v0, v0, Lu8/p;->L:I

    if-ne v6, v5, :cond_6

    if-eq v0, v5, :cond_7

    :cond_6
    const/4 v7, -0x1

    if-eq v6, v7, :cond_7

    if-eq v0, v7, :cond_7

    move v0, v5

    goto :goto_0

    :cond_7
    move v0, v1

    :goto_0
    iget-object v6, p0, Lh9/f;->h0:Lem/b;

    iget-object v7, v6, Lem/b;->c:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Bitmap;

    if-eqz v7, :cond_8

    goto :goto_2

    :cond_8
    if-eqz v0, :cond_9

    iget v7, v6, Lem/b;->a:I

    iget-object v8, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-static {v8}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v8, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    iget-object v9, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {v9}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v9, v9, Lu8/p;->K:I

    div-int/2addr v8, v9

    iget-object v9, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    iget-object v10, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v10, v10, Lu8/p;->L:I

    div-int/2addr v9, v10

    iget-object v10, p0, Lh9/f;->b0:Lu8/p;

    iget v10, v10, Lu8/p;->K:I

    rem-int v11, v7, v10

    mul-int/2addr v11, v8

    div-int/2addr v7, v10

    mul-int/2addr v7, v9

    iget-object v10, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-static {v10, v11, v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v7

    goto :goto_1

    :cond_9
    iget-object v7, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    invoke-static {v7}, Lva3/g;->j(Ljava/lang/Object;)V

    :goto_1
    iput-object v7, v6, Lem/b;->c:Ljava/lang/Object;

    :goto_2
    iget-object v6, p0, Lh9/f;->h0:Lem/b;

    iget-object v6, v6, Lem/b;->c:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-static {v6}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v7, p0, Lh9/f;->h0:Lem/b;

    iget-wide v7, v7, Lem/b;->b:J

    sub-long p1, v7, p1

    iget v9, p0, Lb9/f;->H:I

    if-ne v9, v3, :cond_a

    move v3, v5

    goto :goto_3

    :cond_a
    move v3, v1

    :goto_3
    iget v9, p0, Lh9/f;->a0:I

    if-eqz v9, :cond_d

    if-eq v9, v5, :cond_c

    if-ne v9, v4, :cond_b

    move v3, v1

    goto :goto_4

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_c
    move v3, v5

    :cond_d
    :goto_4
    if-nez v3, :cond_f

    const-wide/16 v9, 0x7530

    cmp-long p1, p1, v9

    if-gez p1, :cond_e

    goto :goto_5

    :cond_e
    move p1, v1

    goto :goto_6

    :cond_f
    :goto_5
    iget-object p1, p0, Lh9/f;->e0:Landroidx/media3/exoplayer/image/ImageOutput;

    iget-object p2, p0, Lh9/f;->W:Lh9/e;

    iget-wide v9, p2, Lh9/e;->b:J

    sub-long/2addr v7, v9

    invoke-interface {p1, v7, v8, v6}, Landroidx/media3/exoplayer/image/ImageOutput;->onImageAvailable(JLandroid/graphics/Bitmap;)V

    move p1, v5

    :goto_6
    if-nez p1, :cond_10

    goto :goto_8

    :cond_10
    iget-object p1, p0, Lh9/f;->h0:Lem/b;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide p1, p1, Lem/b;->b:J

    iput-wide p1, p0, Lh9/f;->X:J

    :goto_7
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh9/e;

    iget-wide v6, v1, Lh9/e;->a:J

    cmp-long v1, p1, v6

    if-ltz v1, :cond_11

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh9/e;

    iput-object v1, p0, Lh9/f;->W:Lh9/e;

    goto :goto_7

    :cond_11
    iput v4, p0, Lh9/f;->a0:I

    const/4 p1, 0x0

    if-eqz v0, :cond_12

    iget-object p2, p0, Lh9/f;->h0:Lem/b;

    invoke-static {p2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget p2, p2, Lem/b;->a:I

    iget-object v0, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v0, v0, Lu8/p;->L:I

    iget-object v1, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v1, v1, Lu8/p;->K:I

    mul-int/2addr v0, v1

    sub-int/2addr v0, v5

    if-ne p2, v0, :cond_13

    :cond_12
    iput-object p1, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    :cond_13
    iget-object p2, p0, Lh9/f;->i0:Lem/b;

    iput-object p2, p0, Lh9/f;->h0:Lem/b;

    iput-object p1, p0, Lh9/f;->i0:Lem/b;

    return v5

    :cond_14
    :goto_8
    return v1
.end method

.method public final D(J)Z
    .locals 12

    iget-boolean v0, p0, Lh9/f;->g0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/f;->h0:Lem/b;

    if-eqz v0, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v0, p0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {v0}, Lqg3/d;->k()V

    iget-object v2, p0, Lh9/f;->c0:Lh9/b;

    if-eqz v2, :cond_15

    iget v3, p0, Lh9/f;->Z:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_15

    iget-boolean v3, p0, Lh9/f;->U:Z

    if-eqz v3, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v3, p0, Lh9/f;->d0:La9/e;

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lh9/b;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La9/e;

    iput-object v2, p0, Lh9/f;->d0:La9/e;

    if-nez v2, :cond_2

    goto/16 :goto_9

    :cond_2
    iget v2, p0, Lh9/f;->Z:I

    const/4 v3, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-ne v2, v3, :cond_3

    iget-object p1, p0, Lh9/f;->d0:La9/e;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lh9/f;->d0:La9/e;

    iput v6, p1, La9/a;->x:I

    iget-object p1, p0, Lh9/f;->c0:Lh9/b;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object p2, p0, Lh9/f;->d0:La9/e;

    invoke-virtual {p1, p2}, Lh9/b;->j(La9/e;)V

    iput-object v5, p0, Lh9/f;->d0:La9/e;

    iput v4, p0, Lh9/f;->Z:I

    return v1

    :cond_3
    iget-object v2, p0, Lh9/f;->d0:La9/e;

    invoke-virtual {p0, v0, v2, v1}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v2

    const/4 v4, -0x5

    const/4 v7, 0x1

    if-eq v2, v4, :cond_14

    const/4 v0, -0x4

    if-eq v2, v0, :cond_5

    const/4 p1, -0x3

    if-ne v2, p1, :cond_4

    goto/16 :goto_9

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    iget-object v0, p0, Lh9/f;->d0:La9/e;

    invoke-virtual {v0}, La9/e;->r()V

    iget-object v0, p0, Lh9/f;->d0:La9/e;

    iget-object v0, v0, La9/e;->E:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-gtz v0, :cond_7

    :cond_6
    iget-object v0, p0, Lh9/f;->d0:La9/e;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, La9/a;->f(I)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    move v0, v7

    goto :goto_0

    :cond_8
    move v0, v1

    :goto_0
    if-eqz v0, :cond_9

    iget-object v2, p0, Lh9/f;->c0:Lh9/b;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v3, p0, Lh9/f;->d0:La9/e;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lh9/b;->j(La9/e;)V

    iput v1, p0, Lh9/f;->j0:I

    :cond_9
    iget-object v2, p0, Lh9/f;->d0:La9/e;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, La9/a;->f(I)Z

    move-result v3

    if-eqz v3, :cond_a

    iput-boolean v7, p0, Lh9/f;->g0:Z

    goto/16 :goto_7

    :cond_a
    new-instance v3, Lem/b;

    iget v4, p0, Lh9/f;->j0:I

    iget-wide v8, v2, La9/e;->G:J

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput v4, v3, Lem/b;->a:I

    iput-wide v8, v3, Lem/b;->b:J

    iput-object v3, p0, Lh9/f;->i0:Lem/b;

    add-int/lit8 v2, v4, 0x1

    iput v2, p0, Lh9/f;->j0:I

    iget-boolean v2, p0, Lh9/f;->g0:Z

    if-nez v2, :cond_11

    const-wide/16 v2, 0x7530

    sub-long v10, v8, v2

    cmp-long v10, v10, p1

    if-gtz v10, :cond_b

    add-long/2addr v2, v8

    cmp-long v2, p1, v2

    if-gtz v2, :cond_b

    move v2, v7

    goto :goto_1

    :cond_b
    move v2, v1

    :goto_1
    iget-object v3, p0, Lh9/f;->h0:Lem/b;

    if-eqz v3, :cond_c

    iget-wide v10, v3, Lem/b;->b:J

    cmp-long v3, v10, p1

    if-gtz v3, :cond_c

    cmp-long p1, p1, v8

    if-gez p1, :cond_c

    move p1, v7

    goto :goto_2

    :cond_c
    move p1, v1

    :goto_2
    iget-object p2, p0, Lh9/f;->b0:Lu8/p;

    invoke-static {p2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget p2, p2, Lu8/p;->K:I

    const/4 v3, -0x1

    if-eq p2, v3, :cond_e

    iget-object p2, p0, Lh9/f;->b0:Lu8/p;

    iget v8, p2, Lu8/p;->L:I

    if-eq v8, v3, :cond_e

    iget p2, p2, Lu8/p;->K:I

    mul-int/2addr v8, p2

    sub-int/2addr v8, v7

    if-ne v4, v8, :cond_d

    goto :goto_3

    :cond_d
    move p2, v1

    goto :goto_4

    :cond_e
    :goto_3
    move p2, v7

    :goto_4
    if-nez v2, :cond_10

    if-nez p1, :cond_10

    if-eqz p2, :cond_f

    goto :goto_5

    :cond_f
    move p2, v1

    goto :goto_6

    :cond_10
    :goto_5
    move p2, v7

    :goto_6
    iput-boolean p2, p0, Lh9/f;->g0:Z

    if-eqz p1, :cond_11

    if-nez v2, :cond_11

    goto :goto_7

    :cond_11
    iget-object p1, p0, Lh9/f;->i0:Lem/b;

    iput-object p1, p0, Lh9/f;->h0:Lem/b;

    iput-object v5, p0, Lh9/f;->i0:Lem/b;

    :goto_7
    iget-object p1, p0, Lh9/f;->d0:La9/e;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p1, v6}, La9/a;->f(I)Z

    move-result p1

    if-eqz p1, :cond_12

    iput-boolean v7, p0, Lh9/f;->U:Z

    iput-object v5, p0, Lh9/f;->d0:La9/e;

    return v1

    :cond_12
    iget-wide p1, p0, Lh9/f;->Y:J

    iget-object v1, p0, Lh9/f;->d0:La9/e;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v1, v1, La9/e;->G:J

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lh9/f;->Y:J

    if-eqz v0, :cond_13

    iput-object v5, p0, Lh9/f;->d0:La9/e;

    goto :goto_8

    :cond_13
    iget-object p1, p0, Lh9/f;->d0:La9/e;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, La9/e;->o()V

    :goto_8
    iget-boolean p1, p0, Lh9/f;->g0:Z

    xor-int/2addr p1, v7

    return p1

    :cond_14
    iget-object p1, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Lu8/p;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iput-object p1, p0, Lh9/f;->b0:Lu8/p;

    iput-boolean v7, p0, Lh9/f;->k0:Z

    iput v3, p0, Lh9/f;->Z:I

    return v7

    :cond_15
    :goto_9
    return v1
.end method

.method public final E()V
    .locals 4

    iget-boolean v0, p0, Lh9/f;->k0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh9/f;->b0:Lu8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lh9/f;->R:Lh9/c;

    check-cast v1, Le10/k0;

    invoke-virtual {v1, v0}, Le10/k0;->M(Lu8/p;)I

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v2, v3, v3, v3}, Lb9/f;->f(IIII)I

    move-result v2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    invoke-static {v2, v3, v3, v3}, Lb9/f;->f(IIII)I

    move-result v2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/media3/exoplayer/image/ImageDecoderException;

    const-string v1, "Provided decoder factory can\'t create decoder for format."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh9/f;->b0:Lu8/p;

    const/16 v2, 0xfa5

    invoke-virtual {p0, v0, v1, v3, v2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lh9/f;->c0:Lh9/b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lh9/b;->release()V

    :cond_3
    new-instance v0, Lh9/b;

    iget-object v1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/l;

    invoke-direct {v0, v1}, Lh9/b;-><init>(Lcom/mapbox/maps/l;)V

    iput-object v0, p0, Lh9/f;->c0:Lh9/b;

    iput-boolean v3, p0, Lh9/f;->k0:Z

    return-void
.end method

.method public final F()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lh9/f;->d0:La9/e;

    const/4 v1, 0x0

    iput v1, p0, Lh9/f;->Z:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lh9/f;->Y:J

    iget-object v1, p0, Lh9/f;->c0:Lh9/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lh9/b;->release()V

    iput-object v0, p0, Lh9/f;->c0:Lh9/b;

    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    instance-of p1, p2, Landroidx/media3/exoplayer/image/ImageOutput;

    if-eqz p1, :cond_1

    check-cast p2, Landroidx/media3/exoplayer/image/ImageOutput;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    sget-object p2, Landroidx/media3/exoplayer/image/ImageOutput;->a:Lh9/d;

    :cond_2
    iput-object p2, p0, Lh9/f;->e0:Landroidx/media3/exoplayer/image/ImageOutput;

    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    const-string v0, "ImageRenderer"

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lh9/f;->V:Z

    return v0
.end method

.method public final n()Z
    .locals 2

    iget v0, p0, Lh9/f;->a0:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lh9/f;->g0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final o()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lh9/f;->b0:Lu8/p;

    sget-object v0, Lh9/e;->c:Lh9/e;

    iput-object v0, p0, Lh9/f;->W:Lh9/e;

    iget-object v0, p0, Lh9/f;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lh9/f;->F()V

    iget-object v0, p0, Lh9/f;->e0:Landroidx/media3/exoplayer/image/ImageOutput;

    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageOutput;->a()V

    return-void
.end method

.method public final p(ZZ)V
    .locals 0

    iput p2, p0, Lh9/f;->a0:I

    return-void
.end method

.method public final q(JZ)V
    .locals 0

    const/4 p1, 0x1

    iget p2, p0, Lh9/f;->a0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lh9/f;->a0:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh9/f;->V:Z

    iput-boolean p1, p0, Lh9/f;->U:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lh9/f;->f0:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lh9/f;->h0:Lem/b;

    iput-object p2, p0, Lh9/f;->i0:Lem/b;

    iput-boolean p1, p0, Lh9/f;->g0:Z

    iput-object p2, p0, Lh9/f;->d0:La9/e;

    iget-object p1, p0, Lh9/f;->c0:Lh9/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh9/b;->flush()V

    :cond_0
    iget-object p1, p0, Lh9/f;->T:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public final r()V
    .locals 0

    invoke-virtual {p0}, Lh9/f;->F()V

    return-void
.end method

.method public final s()V
    .locals 2

    invoke-virtual {p0}, Lh9/f;->F()V

    const/4 v0, 0x1

    iget v1, p0, Lh9/f;->a0:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lh9/f;->a0:I

    return-void
.end method

.method public final v([Lu8/p;JJLl9/c0;)V
    .locals 4

    iget-object p1, p0, Lh9/f;->W:Lh9/e;

    iget-wide p1, p1, Lh9/e;->b:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh9/f;->T:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-wide p2, p0, Lh9/f;->Y:J

    cmp-long p6, p2, v0

    if-eqz p6, :cond_1

    iget-wide v2, p0, Lh9/f;->X:J

    cmp-long p6, v2, v0

    if-eqz p6, :cond_0

    cmp-long p2, v2, p2

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lh9/e;

    iget-wide v0, p0, Lh9/f;->Y:J

    invoke-direct {p2, v0, v1, p4, p5}, Lh9/e;-><init>(JJ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    new-instance p1, Lh9/e;

    invoke-direct {p1, v0, v1, p4, p5}, Lh9/e;-><init>(JJ)V

    iput-object p1, p0, Lh9/f;->W:Lh9/e;

    return-void
.end method

.method public final x(JJ)V
    .locals 3

    iget-boolean p3, p0, Lh9/f;->V:Z

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lh9/f;->b0:Lu8/p;

    if-nez p3, :cond_3

    iget-object p3, p0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {p3}, Lqg3/d;->k()V

    iget-object p4, p0, Lh9/f;->S:La9/e;

    invoke-virtual {p4}, La9/e;->o()V

    const/4 v0, 0x2

    invoke-virtual {p0, p3, p4, v0}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v0

    const/4 v1, -0x5

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object p3, p3, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p3, Lu8/p;

    invoke-static {p3}, Lva3/g;->j(Ljava/lang/Object;)V

    iput-object p3, p0, Lh9/f;->b0:Lu8/p;

    iput-boolean v2, p0, Lh9/f;->k0:Z

    goto :goto_1

    :cond_1
    const/4 p1, -0x4

    if-ne v0, p1, :cond_2

    const/4 p1, 0x4

    invoke-virtual {p4, p1}, La9/a;->f(I)Z

    move-result p1

    invoke-static {p1}, Lva3/g;->i(Z)V

    iput-boolean v2, p0, Lh9/f;->U:Z

    iput-boolean v2, p0, Lh9/f;->V:Z

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    iget-object p3, p0, Lh9/f;->c0:Lh9/b;

    if-nez p3, :cond_4

    invoke-virtual {p0}, Lh9/f;->E()V

    :cond_4
    :try_start_0
    const-string p3, "drainAndFeedDecoder"

    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p0, p1, p2}, Lh9/f;->C(J)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    invoke-virtual {p0, p1, p2}, Lh9/f;->D(J)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Landroidx/media3/exoplayer/image/ImageDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/16 p2, 0xfa3

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p4, p3, p2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

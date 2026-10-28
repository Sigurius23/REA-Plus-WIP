.class public final Lv8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/e;


# instance fields
.field public b:I

.field public c:F

.field public d:F

.field public e:Lv8/d;

.field public f:Lv8/d;

.field public g:Lv8/d;

.field public h:Lv8/d;

.field public i:Z

.field public j:Lv8/g;

.field public k:Ljava/nio/ByteBuffer;

.field public l:Ljava/nio/ShortBuffer;

.field public m:Ljava/nio/ByteBuffer;

.field public n:J

.field public o:J

.field public p:Z


# virtual methods
.method public final a()Ljava/nio/ByteBuffer;
    .locals 8

    iget-object v0, p0, Lv8/h;->j:Lv8/g;

    if-eqz v0, :cond_3

    iget v1, v0, Lv8/g;->b:I

    iget v2, v0, Lv8/g;->m:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget v2, v0, Lv8/g;->m:I

    mul-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x2

    if-lez v2, :cond_3

    iget-object v5, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    if-ge v5, v2, :cond_1

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v5

    iput-object v5, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v5

    iput-object v5, p0, Lv8/h;->l:Ljava/nio/ShortBuffer;

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v5, p0, Lv8/h;->l:Ljava/nio/ShortBuffer;

    invoke-virtual {v5}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    :goto_1
    iget-object v5, p0, Lv8/h;->l:Ljava/nio/ShortBuffer;

    iget v6, v0, Lv8/g;->m:I

    if-ltz v6, :cond_2

    goto :goto_2

    :cond_2
    move v4, v3

    :goto_2
    invoke-static {v4}, Lva3/g;->i(Z)V

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    div-int/2addr v4, v1

    iget v6, v0, Lv8/g;->m:I

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget-object v6, v0, Lv8/g;->l:[S

    mul-int v7, v4, v1

    invoke-virtual {v5, v6, v3, v7}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    iget v5, v0, Lv8/g;->m:I

    sub-int/2addr v5, v4

    iput v5, v0, Lv8/g;->m:I

    iget-object v0, v0, Lv8/g;->l:[S

    mul-int/2addr v5, v1

    invoke-static {v0, v7, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-wide v0, p0, Lv8/h;->o:J

    int-to-long v3, v2

    add-long/2addr v0, v3

    iput-wide v0, p0, Lv8/h;->o:J

    iget-object v0, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/h;->m:Ljava/nio/ByteBuffer;

    :cond_3
    iget-object v0, p0, Lv8/h;->m:Ljava/nio/ByteBuffer;

    sget-object v1, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lv8/h;->m:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final b(Ljava/nio/ByteBuffer;)V
    .locals 8

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv8/h;->j:Lv8/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    iget-wide v3, p0, Lv8/h;->n:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lv8/h;->n:J

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    iget v4, v0, Lv8/g;->b:I

    div-int/2addr v3, v4

    mul-int v5, v3, v4

    mul-int/lit8 v5, v5, 0x2

    iget-object v6, v0, Lv8/g;->j:[S

    iget v7, v0, Lv8/g;->k:I

    invoke-virtual {v0, v6, v7, v3}, Lv8/g;->c([SII)[S

    move-result-object v6

    iput-object v6, v0, Lv8/g;->j:[S

    iget v7, v0, Lv8/g;->k:I

    mul-int/2addr v7, v4

    div-int/lit8 v5, v5, 0x2

    invoke-virtual {v1, v6, v7, v5}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    iget v1, v0, Lv8/g;->k:I

    add-int/2addr v1, v3

    iput v1, v0, Lv8/g;->k:I

    invoke-virtual {v0}, Lv8/g;->f()V

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public final c()V
    .locals 11

    iget-object v0, p0, Lv8/h;->j:Lv8/g;

    if-eqz v0, :cond_2

    iget v1, v0, Lv8/g;->k:I

    iget v2, v0, Lv8/g;->c:F

    iget v3, v0, Lv8/g;->d:F

    div-float/2addr v2, v3

    float-to-double v4, v2

    iget v2, v0, Lv8/g;->e:F

    mul-float/2addr v2, v3

    float-to-double v2, v2

    iget v6, v0, Lv8/g;->r:I

    sub-int v7, v1, v6

    iget v8, v0, Lv8/g;->m:I

    int-to-double v9, v7

    div-double/2addr v9, v4

    int-to-double v4, v6

    add-double/2addr v9, v4

    iget-wide v4, v0, Lv8/g;->w:D

    add-double/2addr v9, v4

    iget v4, v0, Lv8/g;->o:I

    int-to-double v4, v4

    add-double/2addr v9, v4

    div-double/2addr v9, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v9, v2

    double-to-int v2, v9

    add-int/2addr v8, v2

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lv8/g;->w:D

    iget-object v2, v0, Lv8/g;->j:[S

    iget v3, v0, Lv8/g;->h:I

    mul-int/lit8 v3, v3, 0x2

    add-int v4, v3, v1

    invoke-virtual {v0, v2, v1, v4}, Lv8/g;->c([SII)[S

    move-result-object v2

    iput-object v2, v0, Lv8/g;->j:[S

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    iget v5, v0, Lv8/g;->b:I

    mul-int v6, v3, v5

    if-ge v4, v6, :cond_0

    iget-object v6, v0, Lv8/g;->j:[S

    mul-int/2addr v5, v1

    add-int/2addr v5, v4

    aput-short v2, v6, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lv8/g;->k:I

    add-int/2addr v3, v1

    iput v3, v0, Lv8/g;->k:I

    invoke-virtual {v0}, Lv8/g;->f()V

    iget v1, v0, Lv8/g;->m:I

    if-le v1, v8, :cond_1

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lv8/g;->m:I

    :cond_1
    iput v2, v0, Lv8/g;->k:I

    iput v2, v0, Lv8/g;->r:I

    iput v2, v0, Lv8/g;->o:I

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lv8/h;->p:Z

    return-void
.end method

.method public final d()Z
    .locals 4

    iget-boolean v0, p0, Lv8/h;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv8/h;->j:Lv8/g;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget v3, v0, Lv8/g;->m:I

    if-ltz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, Lva3/g;->i(Z)V

    iget v3, v0, Lv8/g;->m:I

    iget v0, v0, Lv8/g;->b:I

    mul-int/2addr v3, v0

    mul-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_2

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public final e(Lv8/d;)Lv8/d;
    .locals 3

    iget v0, p1, Lv8/d;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lv8/h;->b:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p1, Lv8/d;->a:I

    :cond_0
    iput-object p1, p0, Lv8/h;->e:Lv8/d;

    new-instance v2, Lv8/d;

    iget p1, p1, Lv8/d;->b:I

    invoke-direct {v2, v0, p1, v1}, Lv8/d;-><init>(III)V

    iput-object v2, p0, Lv8/h;->f:Lv8/d;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv8/h;->i:Z

    return-object v2

    :cond_1
    new-instance v0, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;

    invoke-direct {v0, p1}, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;-><init>(Lv8/d;)V

    throw v0
.end method

.method public final flush()V
    .locals 10

    invoke-virtual {p0}, Lv8/h;->isActive()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv8/h;->e:Lv8/d;

    iput-object v0, p0, Lv8/h;->g:Lv8/d;

    iget-object v2, p0, Lv8/h;->f:Lv8/d;

    iput-object v2, p0, Lv8/h;->h:Lv8/d;

    iget-boolean v3, p0, Lv8/h;->i:Z

    if-eqz v3, :cond_0

    new-instance v4, Lv8/g;

    iget v5, v0, Lv8/d;->a:I

    iget v6, v0, Lv8/d;->b:I

    iget v7, p0, Lv8/h;->c:F

    iget v8, p0, Lv8/h;->d:F

    iget v9, v2, Lv8/d;->a:I

    invoke-direct/range {v4 .. v9}, Lv8/g;-><init>(IIFFI)V

    iput-object v4, p0, Lv8/h;->j:Lv8/g;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv8/h;->j:Lv8/g;

    if-eqz v0, :cond_1

    iput v1, v0, Lv8/g;->k:I

    iput v1, v0, Lv8/g;->m:I

    iput v1, v0, Lv8/g;->o:I

    iput v1, v0, Lv8/g;->p:I

    iput v1, v0, Lv8/g;->q:I

    iput v1, v0, Lv8/g;->r:I

    iput v1, v0, Lv8/g;->s:I

    iput v1, v0, Lv8/g;->t:I

    iput v1, v0, Lv8/g;->u:I

    iput v1, v0, Lv8/g;->v:I

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lv8/g;->w:D

    :cond_1
    :goto_0
    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/h;->m:Ljava/nio/ByteBuffer;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lv8/h;->n:J

    iput-wide v2, p0, Lv8/h;->o:J

    iput-boolean v1, p0, Lv8/h;->p:Z

    return-void
.end method

.method public final isActive()Z
    .locals 3

    iget-object v0, p0, Lv8/h;->f:Lv8/d;

    iget v0, v0, Lv8/d;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lv8/h;->c:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lv8/h;->d:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lv8/h;->f:Lv8/d;

    iget v0, v0, Lv8/d;->a:I

    iget-object v1, p0, Lv8/h;->e:Lv8/d;

    iget v1, v1, Lv8/d;->a:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final reset()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lv8/h;->c:F

    iput v0, p0, Lv8/h;->d:F

    sget-object v0, Lv8/d;->e:Lv8/d;

    iput-object v0, p0, Lv8/h;->e:Lv8/d;

    iput-object v0, p0, Lv8/h;->f:Lv8/d;

    iput-object v0, p0, Lv8/h;->g:Lv8/d;

    iput-object v0, p0, Lv8/h;->h:Lv8/d;

    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/h;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lv8/h;->l:Ljava/nio/ShortBuffer;

    iput-object v0, p0, Lv8/h;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lv8/h;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv8/h;->i:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lv8/h;->j:Lv8/g;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lv8/h;->n:J

    iput-wide v1, p0, Lv8/h;->o:J

    iput-boolean v0, p0, Lv8/h;->p:Z

    return-void
.end method

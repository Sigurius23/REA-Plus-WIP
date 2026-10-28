.class public final Luk/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luk/a;


# instance fields
.field public a:[I

.field public final b:[I

.field public final c:Lcom/google/crypto/tink/internal/l0;

.field public d:Ljava/nio/ByteBuffer;

.field public e:[B

.field public f:[S

.field public g:[B

.field public h:[B

.field public i:[B

.field public final j:[I

.field public k:I

.field public l:Luk/c;

.field public m:Landroid/graphics/Bitmap;

.field public final n:Z

.field public o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:Ljava/lang/Boolean;

.field public t:Landroid/graphics/Bitmap$Config;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/l0;Luk/c;Ljava/nio/ByteBuffer;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [I

    iput-object v0, p0, Luk/e;->b:[I

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, p0, Luk/e;->t:Landroid/graphics/Bitmap$Config;

    iput-object p1, p0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    new-instance p1, Luk/c;

    invoke-direct {p1}, Luk/c;-><init>()V

    iput-object p1, p0, Luk/e;->l:Luk/c;

    const-string p1, "Sample size must be >=0, not: "

    monitor-enter p0

    if-lez p4, :cond_2

    :try_start_0
    invoke-static {p4}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    const/4 p4, 0x0

    iput p4, p0, Luk/e;->o:I

    iput-object p2, p0, Luk/e;->l:Luk/c;

    const/4 v0, -0x1

    iput v0, p0, Luk/e;->k:I

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p3

    iput-object p3, p0, Luk/e;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object p3, p0, Luk/e;->d:Ljava/nio/ByteBuffer;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iput-boolean p4, p0, Luk/e;->n:Z

    iget-object p3, p2, Luk/c;->e:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Luk/b;

    iget p4, p4, Luk/b;->g:I

    const/4 v0, 0x3

    if-ne p4, v0, :cond_0

    const/4 p3, 0x1

    iput-boolean p3, p0, Luk/e;->n:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iput p1, p0, Luk/e;->p:I

    iget p3, p2, Luk/c;->f:I

    div-int p4, p3, p1

    iput p4, p0, Luk/e;->r:I

    iget p2, p2, Luk/c;->g:I

    div-int p1, p2, p1

    iput p1, p0, Luk/e;->q:I

    iget-object p1, p0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    mul-int/2addr p3, p2

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lal/g;

    const-class p2, [B

    invoke-virtual {p1, p3, p2}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Luk/e;->i:[B

    iget-object p1, p0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    iget p2, p0, Luk/e;->r:I

    iget p3, p0, Luk/e;->q:I

    mul-int/2addr p2, p3

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lal/g;

    const-class p3, [I

    invoke-virtual {p1, p2, p3}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Luk/e;->j:[I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Luk/e;->k:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Luk/e;->l:Luk/c;

    iget v1, v1, Luk/c;->c:I

    rem-int/2addr v0, v1

    iput v0, p0, Luk/e;->k:I

    return-void
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 4

    iget-object v0, p0, Luk/e;->s:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Luk/e;->t:Landroid/graphics/Bitmap$Config;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_1
    iget-object v1, p0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lal/b;

    iget v2, p0, Luk/e;->r:I

    iget v3, p0, Luk/e;->q:I

    invoke-interface {v1, v2, v3, v0}, Lal/b;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    return-object v0
.end method

.method public final declared-synchronized c()Landroid/graphics/Bitmap;
    .locals 9

    const-string v0, "Unable to decode frame, status="

    const-string v1, "No valid color table found for frame #"

    const-string v2, "Unable to decode frame, frameCount="

    monitor-enter p0

    :try_start_0
    iget-object v3, p0, Luk/e;->l:Luk/c;

    iget v3, v3, Luk/c;->c:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-lez v3, :cond_0

    iget v3, p0, Luk/e;->k:I

    if-gez v3, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    :goto_0
    const-string v3, "e"

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "e"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Luk/e;->l:Luk/c;

    iget v2, v2, Luk/c;->c:I

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", framePointer="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Luk/e;->k:I

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput v5, p0, Luk/e;->o:I

    :cond_2
    iget v2, p0, Luk/e;->o:I

    const/4 v3, 0x0

    if-eq v2, v5, :cond_a

    const/4 v6, 0x2

    if-ne v2, v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Luk/e;->o:I

    iget-object v2, p0, Luk/e;->e:[B

    if-nez v2, :cond_4

    iget-object v2, p0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    iget-object v2, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lal/g;

    const-class v7, [B

    const/16 v8, 0xff

    invoke-virtual {v2, v8, v7}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iput-object v2, p0, Luk/e;->e:[B

    :cond_4
    iget-object v2, p0, Luk/e;->l:Luk/c;

    iget-object v2, v2, Luk/c;->e:Ljava/util/ArrayList;

    iget v7, p0, Luk/e;->k:I

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luk/b;

    iget v7, p0, Luk/e;->k:I

    sub-int/2addr v7, v5

    if-ltz v7, :cond_5

    iget-object v8, p0, Luk/e;->l:Luk/c;

    iget-object v8, v8, Luk/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Luk/b;

    goto :goto_1

    :cond_5
    move-object v7, v3

    :goto_1
    iget-object v8, v2, Luk/b;->k:[I

    if-eqz v8, :cond_6

    goto :goto_2

    :cond_6
    iget-object v8, p0, Luk/e;->l:Luk/c;

    iget-object v8, v8, Luk/c;->a:[I

    :goto_2
    iput-object v8, p0, Luk/e;->a:[I

    if-nez v8, :cond_8

    const-string v0, "e"

    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "e"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Luk/e;->k:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iput v5, p0, Luk/e;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v3

    :cond_8
    :try_start_1
    iget-boolean v1, v2, Luk/b;->f:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Luk/e;->b:[I

    array-length v3, v8

    invoke-static {v8, v0, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Luk/e;->b:[I

    iput-object v1, p0, Luk/e;->a:[I

    iget v3, v2, Luk/b;->h:I

    aput v0, v1, v3

    iget v0, v2, Luk/b;->g:I

    if-ne v0, v6, :cond_9

    iget v0, p0, Luk/e;->k:I

    if-nez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Luk/e;->s:Ljava/lang/Boolean;

    :cond_9
    invoke-virtual {p0, v2, v7}, Luk/e;->e(Luk/b;Luk/b;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_a
    :goto_3
    :try_start_2
    const-string v1, "e"

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "e"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Luk/e;->o:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_b
    monitor-exit p0

    return-object v3

    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final d(Landroid/graphics/Bitmap$Config;)V
    .locals 5

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq p1, v0, :cond_1

    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported format: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", must be one of "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " or "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    iput-object p1, p0, Luk/e;->t:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public final e(Luk/b;Luk/b;)Landroid/graphics/Bitmap;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    const/4 v4, 0x0

    iget-object v6, v0, Luk/e;->j:[I

    if-nez v2, :cond_1

    iget-object v5, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_0

    iget-object v7, v3, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v7, Lal/b;

    invoke-interface {v7, v5}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    :cond_0
    const/4 v5, 0x0

    iput-object v5, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    invoke-static {v6, v4}, Ljava/util/Arrays;->fill([II)V

    :cond_1
    const/4 v13, 0x3

    if-eqz v2, :cond_2

    iget v5, v2, Luk/b;->g:I

    if-ne v5, v13, :cond_2

    iget-object v5, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    if-nez v5, :cond_2

    invoke-static {v6, v4}, Ljava/util/Arrays;->fill([II)V

    :cond_2
    const/4 v14, 0x2

    if-eqz v2, :cond_7

    iget v5, v2, Luk/b;->g:I

    if-lez v5, :cond_7

    if-ne v5, v14, :cond_6

    iget-boolean v5, v1, Luk/b;->f:Z

    if-nez v5, :cond_3

    iget-object v5, v0, Luk/e;->l:Luk/c;

    iget v7, v5, Luk/c;->k:I

    iget-object v8, v1, Luk/b;->k:[I

    if-eqz v8, :cond_4

    iget v5, v5, Luk/c;->j:I

    iget v8, v1, Luk/b;->h:I

    if-ne v5, v8, :cond_4

    :cond_3
    move v7, v4

    :cond_4
    iget v5, v2, Luk/b;->d:I

    iget v8, v0, Luk/e;->p:I

    div-int/2addr v5, v8

    iget v9, v2, Luk/b;->b:I

    div-int/2addr v9, v8

    iget v10, v2, Luk/b;->c:I

    div-int/2addr v10, v8

    iget v2, v2, Luk/b;->a:I

    div-int/2addr v2, v8

    iget v8, v0, Luk/e;->r:I

    mul-int/2addr v9, v8

    add-int/2addr v9, v2

    mul-int/2addr v5, v8

    add-int/2addr v5, v9

    :goto_0
    if-ge v9, v5, :cond_7

    add-int v2, v9, v10

    move v8, v9

    :goto_1
    if-ge v8, v2, :cond_5

    aput v7, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    iget v2, v0, Luk/e;->r:I

    add-int/2addr v9, v2

    goto :goto_0

    :cond_6
    if-ne v5, v13, :cond_7

    iget-object v5, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_7

    const/4 v10, 0x0

    iget v12, v0, Luk/e;->q:I

    const/4 v7, 0x0

    iget v8, v0, Luk/e;->r:I

    const/4 v9, 0x0

    move v11, v8

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    :cond_7
    iget-object v2, v0, Luk/e;->d:Ljava/nio/ByteBuffer;

    iget v5, v1, Luk/b;->j:I

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v2, v1, Luk/b;->c:I

    iget v5, v1, Luk/b;->d:I

    mul-int/2addr v2, v5

    iget-object v5, v0, Luk/e;->i:[B

    if-eqz v5, :cond_8

    array-length v5, v5

    if-ge v5, v2, :cond_9

    :cond_8
    iget-object v3, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Lal/g;

    const-class v5, [B

    invoke-virtual {v3, v2, v5}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    iput-object v3, v0, Luk/e;->i:[B

    :cond_9
    iget-object v3, v0, Luk/e;->i:[B

    iget-object v5, v0, Luk/e;->f:[S

    const/16 v7, 0x1000

    if-nez v5, :cond_a

    new-array v5, v7, [S

    iput-object v5, v0, Luk/e;->f:[S

    :cond_a
    iget-object v5, v0, Luk/e;->f:[S

    iget-object v8, v0, Luk/e;->g:[B

    if-nez v8, :cond_b

    new-array v8, v7, [B

    iput-object v8, v0, Luk/e;->g:[B

    :cond_b
    iget-object v8, v0, Luk/e;->g:[B

    iget-object v9, v0, Luk/e;->h:[B

    if-nez v9, :cond_c

    const/16 v9, 0x1001

    new-array v9, v9, [B

    iput-object v9, v0, Luk/e;->h:[B

    :cond_c
    iget-object v9, v0, Luk/e;->h:[B

    iget-object v10, v0, Luk/e;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    const/4 v11, 0x1

    shl-int v12, v11, v10

    add-int/lit8 v15, v12, 0x1

    add-int/lit8 v16, v12, 0x2

    add-int/2addr v10, v11

    shl-int v17, v11, v10

    add-int/lit8 v17, v17, -0x1

    move v14, v4

    :goto_2
    if-ge v14, v12, :cond_d

    aput-short v4, v5, v14

    move/from16 p2, v11

    int-to-byte v11, v14

    aput-byte v11, v8, v14

    add-int/lit8 v14, v14, 0x1

    move/from16 v11, p2

    goto :goto_2

    :cond_d
    move/from16 p2, v11

    iget-object v11, v0, Luk/e;->e:[B

    move v7, v4

    move/from16 v19, v7

    move/from16 v20, v19

    move/from16 v21, v20

    move/from16 v22, v21

    move/from16 v23, v22

    move/from16 v28, v23

    move/from16 v29, v28

    move/from16 v26, v10

    move/from16 v24, v16

    move/from16 v25, v17

    const/16 v27, -0x1

    :goto_3
    const/16 v30, 0x8

    if-ge v7, v2, :cond_19

    if-nez v19, :cond_10

    const/16 v31, -0x1

    iget-object v14, v0, Luk/e;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->get()B

    move-result v14

    and-int/lit16 v14, v14, 0xff

    if-gtz v14, :cond_e

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    goto :goto_4

    :cond_e
    iget-object v13, v0, Luk/e;->d:Ljava/nio/ByteBuffer;

    iget-object v4, v0, Luk/e;->e:[B

    move-object/from16 v32, v5

    invoke-virtual {v13}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-static {v14, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    move-object/from16 v33, v6

    const/4 v6, 0x0

    invoke-virtual {v13, v4, v6, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    :goto_4
    if-gtz v14, :cond_f

    const/4 v4, 0x3

    iput v4, v0, Luk/e;->o:I

    const/4 v6, 0x0

    :goto_5
    move/from16 v4, v23

    goto/16 :goto_c

    :cond_f
    move/from16 v19, v14

    const/16 v20, 0x0

    goto :goto_6

    :cond_10
    move-object/from16 v32, v5

    move-object/from16 v33, v6

    const/16 v31, -0x1

    :goto_6
    aget-byte v4, v11, v20

    and-int/lit16 v4, v4, 0xff

    shl-int v4, v4, v21

    add-int v22, v22, v4

    add-int/lit8 v21, v21, 0x8

    add-int/lit8 v20, v20, 0x1

    add-int/lit8 v19, v19, -0x1

    move/from16 v4, v21

    move/from16 v5, v24

    move/from16 v6, v26

    move/from16 v13, v27

    move/from16 v14, v28

    :goto_7
    move/from16 v21, v4

    if-lt v4, v6, :cond_18

    and-int v4, v22, v25

    shr-int v22, v22, v6

    sub-int v21, v21, v6

    if-ne v4, v12, :cond_11

    move v6, v10

    move/from16 v5, v16

    move/from16 v25, v17

    move/from16 v4, v21

    move/from16 v13, v31

    goto :goto_7

    :cond_11
    if-ne v4, v15, :cond_12

    move/from16 v24, v5

    move/from16 v26, v6

    move/from16 v27, v13

    move/from16 v28, v14

    move-object/from16 v5, v32

    move-object/from16 v6, v33

    const/4 v4, 0x0

    const/4 v13, 0x3

    goto :goto_3

    :cond_12
    move/from16 v24, v6

    move/from16 v6, v31

    if-ne v13, v6, :cond_13

    aget-byte v6, v8, v4

    aput-byte v6, v3, v23

    add-int/lit8 v23, v23, 0x1

    add-int/lit8 v7, v7, 0x1

    move v13, v4

    move v14, v13

    move/from16 v4, v21

    move/from16 v6, v24

    :goto_8
    const/16 v31, -0x1

    goto :goto_7

    :cond_13
    if-lt v4, v5, :cond_14

    int-to-byte v6, v14

    aput-byte v6, v9, v29

    add-int/lit8 v29, v29, 0x1

    move v6, v13

    goto :goto_9

    :cond_14
    move v6, v4

    :goto_9
    if-lt v6, v12, :cond_15

    aget-byte v14, v8, v6

    aput-byte v14, v9, v29

    add-int/lit8 v29, v29, 0x1

    aget-short v6, v32, v6

    goto :goto_9

    :cond_15
    aget-byte v6, v8, v6

    and-int/lit16 v14, v6, 0xff

    int-to-byte v6, v14

    aput-byte v6, v3, v23

    :goto_a
    add-int/lit8 v23, v23, 0x1

    add-int/lit8 v7, v7, 0x1

    if-lez v29, :cond_16

    add-int/lit8 v29, v29, -0x1

    aget-byte v26, v9, v29

    aput-byte v26, v3, v23

    goto :goto_a

    :cond_16
    move/from16 v26, v4

    const/16 v4, 0x1000

    if-ge v5, v4, :cond_17

    int-to-short v13, v13

    aput-short v13, v32, v5

    aput-byte v6, v8, v5

    add-int/lit8 v5, v5, 0x1

    and-int v6, v5, v25

    if-nez v6, :cond_17

    if-ge v5, v4, :cond_17

    add-int/lit8 v6, v24, 0x1

    add-int v25, v25, v5

    goto :goto_b

    :cond_17
    move/from16 v6, v24

    :goto_b
    move/from16 v4, v21

    move/from16 v13, v26

    goto :goto_8

    :cond_18
    move/from16 v24, v6

    move/from16 v27, v13

    move/from16 v28, v14

    move/from16 v26, v24

    move-object/from16 v6, v33

    const/4 v4, 0x0

    const/4 v13, 0x3

    move/from16 v24, v5

    move-object/from16 v5, v32

    goto/16 :goto_3

    :cond_19
    move-object/from16 v33, v6

    move v6, v4

    goto/16 :goto_5

    :goto_c
    invoke-static {v3, v4, v2, v6}, Ljava/util/Arrays;->fill([BIIB)V

    iget-boolean v2, v1, Luk/b;->e:Z

    if-nez v2, :cond_24

    iget v2, v0, Luk/e;->p:I

    move/from16 v3, p2

    if-eq v2, v3, :cond_1a

    goto/16 :goto_12

    :cond_1a
    iget v2, v1, Luk/b;->d:I

    iget v3, v1, Luk/b;->b:I

    iget v4, v1, Luk/b;->c:I

    iget v5, v1, Luk/b;->a:I

    iget v7, v0, Luk/e;->k:I

    if-nez v7, :cond_1b

    const/4 v7, 0x1

    goto :goto_d

    :cond_1b
    move v7, v6

    :goto_d
    iget-object v8, v0, Luk/e;->i:[B

    iget-object v9, v0, Luk/e;->a:[I

    move v10, v6

    const/4 v11, -0x1

    :goto_e
    if-ge v10, v2, :cond_20

    add-int v12, v10, v3

    iget v13, v0, Luk/e;->r:I

    mul-int/2addr v12, v13

    add-int v14, v12, v5

    add-int v15, v14, v4

    add-int/2addr v12, v13

    if-ge v12, v15, :cond_1c

    move v15, v12

    :cond_1c
    iget v12, v1, Luk/b;->c:I

    mul-int/2addr v12, v10

    :goto_f
    if-ge v14, v15, :cond_1f

    aget-byte v13, v8, v12

    and-int/lit16 v6, v13, 0xff

    if-eq v6, v11, :cond_1e

    aget v6, v9, v6

    if-eqz v6, :cond_1d

    iget-object v13, v0, Luk/e;->j:[I

    aput v6, v13, v14

    goto :goto_10

    :cond_1d
    move v11, v13

    :cond_1e
    :goto_10
    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v14, v14, 0x1

    const/4 v6, 0x0

    goto :goto_f

    :cond_1f
    add-int/lit8 v10, v10, 0x1

    const/4 v6, 0x0

    goto :goto_e

    :cond_20
    iget-object v2, v0, Luk/e;->s:Ljava/lang/Boolean;

    if-eqz v2, :cond_21

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_22

    :cond_21
    iget-object v2, v0, Luk/e;->s:Ljava/lang/Boolean;

    if-nez v2, :cond_23

    if-eqz v7, :cond_23

    const/4 v6, -0x1

    if-eq v11, v6, :cond_23

    :cond_22
    const/4 v4, 0x1

    goto :goto_11

    :cond_23
    const/4 v4, 0x0

    :goto_11
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Luk/e;->s:Ljava/lang/Boolean;

    goto/16 :goto_22

    :cond_24
    :goto_12
    iget v2, v1, Luk/b;->d:I

    iget v3, v0, Luk/e;->p:I

    div-int/2addr v2, v3

    iget v4, v1, Luk/b;->b:I

    div-int/2addr v4, v3

    iget v5, v1, Luk/b;->c:I

    div-int/2addr v5, v3

    iget v6, v1, Luk/b;->a:I

    div-int/2addr v6, v3

    iget v7, v0, Luk/e;->k:I

    if-nez v7, :cond_25

    const/4 v7, 0x1

    goto :goto_13

    :cond_25
    const/4 v7, 0x0

    :goto_13
    iget-object v8, v0, Luk/e;->i:[B

    iget-object v9, v0, Luk/e;->a:[I

    iget-object v10, v0, Luk/e;->s:Ljava/lang/Boolean;

    move-object v13, v10

    move/from16 v14, v30

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    :goto_14
    if-ge v12, v2, :cond_3b

    iget-boolean v15, v1, Luk/b;->e:Z

    if-eqz v15, :cond_2a

    if-lt v10, v2, :cond_29

    add-int/lit8 v11, v11, 0x1

    const/4 v15, 0x2

    if-eq v11, v15, :cond_28

    const/4 v15, 0x3

    if-eq v11, v15, :cond_27

    const/4 v15, 0x4

    if-eq v11, v15, :cond_26

    goto :goto_15

    :cond_26
    const/4 v10, 0x1

    const/4 v14, 0x2

    goto :goto_15

    :cond_27
    const/4 v15, 0x4

    move v14, v15

    const/4 v10, 0x2

    goto :goto_15

    :cond_28
    const/4 v15, 0x4

    move v10, v15

    :cond_29
    :goto_15
    add-int v15, v10, v14

    goto :goto_16

    :cond_2a
    move v15, v10

    move v10, v12

    :goto_16
    add-int/2addr v10, v4

    move/from16 v16, v2

    const/4 v2, 0x1

    if-ne v3, v2, :cond_2b

    const/16 v17, 0x1

    goto :goto_17

    :cond_2b
    const/16 v17, 0x0

    :goto_17
    iget v2, v0, Luk/e;->q:I

    if-ge v10, v2, :cond_3a

    iget v2, v0, Luk/e;->r:I

    mul-int/2addr v10, v2

    add-int v18, v10, v6

    move/from16 v19, v2

    add-int v2, v18, v5

    add-int v10, v10, v19

    if-ge v10, v2, :cond_2c

    move v2, v10

    :cond_2c
    mul-int v10, v12, v3

    move/from16 v19, v3

    iget v3, v1, Luk/b;->c:I

    mul-int/2addr v10, v3

    iget-object v3, v0, Luk/e;->j:[I

    if-eqz v17, :cond_31

    move-object/from16 v17, v3

    move/from16 v3, v18

    :goto_18
    if-ge v3, v2, :cond_2f

    move/from16 v18, v3

    aget-byte v3, v8, v10

    and-int/lit16 v3, v3, 0xff

    aget v3, v9, v3

    if-eqz v3, :cond_2d

    aput v3, v17, v18

    goto :goto_19

    :cond_2d
    if-eqz v7, :cond_2e

    if-nez v13, :cond_2e

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v13, v3

    :cond_2e
    :goto_19
    add-int v10, v10, v19

    add-int/lit8 v3, v18, 0x1

    goto :goto_18

    :cond_2f
    :goto_1a
    move/from16 v18, v4

    :cond_30
    move/from16 v28, v5

    goto/16 :goto_20

    :cond_31
    move-object/from16 v17, v3

    sub-int v3, v2, v18

    mul-int v3, v3, v19

    add-int/2addr v3, v10

    move/from16 v34, v18

    move/from16 v18, v4

    move/from16 v4, v34

    :goto_1b
    if-ge v4, v2, :cond_30

    move/from16 v20, v2

    iget v2, v1, Luk/b;->c:I

    move/from16 v26, v2

    move/from16 v27, v4

    move v2, v10

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :goto_1c
    iget v4, v0, Luk/e;->p:I

    add-int/2addr v4, v10

    if-ge v2, v4, :cond_33

    iget-object v4, v0, Luk/e;->i:[B

    move/from16 v28, v5

    array-length v5, v4

    if-ge v2, v5, :cond_34

    if-ge v2, v3, :cond_34

    aget-byte v4, v4, v2

    and-int/lit16 v4, v4, 0xff

    iget-object v5, v0, Luk/e;->a:[I

    aget v4, v5, v4

    if-eqz v4, :cond_32

    shr-int/lit8 v5, v4, 0x18

    and-int/lit16 v5, v5, 0xff

    add-int v21, v21, v5

    shr-int/lit8 v5, v4, 0x10

    and-int/lit16 v5, v5, 0xff

    add-int v22, v22, v5

    shr-int/lit8 v5, v4, 0x8

    and-int/lit16 v5, v5, 0xff

    add-int v23, v23, v5

    and-int/lit16 v4, v4, 0xff

    add-int v24, v24, v4

    add-int/lit8 v25, v25, 0x1

    :cond_32
    add-int/lit8 v2, v2, 0x1

    move/from16 v5, v28

    goto :goto_1c

    :cond_33
    move/from16 v28, v5

    :cond_34
    add-int v2, v10, v26

    move v4, v2

    :goto_1d
    iget v5, v0, Luk/e;->p:I

    add-int/2addr v5, v2

    if-ge v4, v5, :cond_36

    iget-object v5, v0, Luk/e;->i:[B

    move/from16 v26, v2

    array-length v2, v5

    if-ge v4, v2, :cond_36

    if-ge v4, v3, :cond_36

    aget-byte v2, v5, v4

    and-int/lit16 v2, v2, 0xff

    iget-object v5, v0, Luk/e;->a:[I

    aget v2, v5, v2

    if-eqz v2, :cond_35

    shr-int/lit8 v5, v2, 0x18

    and-int/lit16 v5, v5, 0xff

    add-int v21, v21, v5

    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    add-int v22, v22, v5

    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    add-int v23, v23, v5

    and-int/lit16 v2, v2, 0xff

    add-int v24, v24, v2

    add-int/lit8 v25, v25, 0x1

    :cond_35
    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v26

    goto :goto_1d

    :cond_36
    if-nez v25, :cond_37

    const/4 v2, 0x0

    goto :goto_1e

    :cond_37
    div-int v21, v21, v25

    shl-int/lit8 v2, v21, 0x18

    div-int v22, v22, v25

    shl-int/lit8 v4, v22, 0x10

    or-int/2addr v2, v4

    div-int v23, v23, v25

    shl-int/lit8 v4, v23, 0x8

    or-int/2addr v2, v4

    div-int v24, v24, v25

    or-int v2, v2, v24

    :goto_1e
    if-eqz v2, :cond_38

    aput v2, v17, v27

    goto :goto_1f

    :cond_38
    if-eqz v7, :cond_39

    if-nez v13, :cond_39

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v13, v2

    :cond_39
    :goto_1f
    add-int v10, v10, v19

    add-int/lit8 v4, v27, 0x1

    move/from16 v2, v20

    move/from16 v5, v28

    goto/16 :goto_1b

    :cond_3a
    move/from16 v19, v3

    goto/16 :goto_1a

    :goto_20
    add-int/lit8 v12, v12, 0x1

    move v10, v15

    move/from16 v2, v16

    move/from16 v4, v18

    move/from16 v3, v19

    move/from16 v5, v28

    goto/16 :goto_14

    :cond_3b
    iget-object v2, v0, Luk/e;->s:Ljava/lang/Boolean;

    if-nez v2, :cond_3d

    if-nez v13, :cond_3c

    const/4 v4, 0x0

    goto :goto_21

    :cond_3c
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_21
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Luk/e;->s:Ljava/lang/Boolean;

    :cond_3d
    :goto_22
    iget-boolean v2, v0, Luk/e;->n:Z

    if-eqz v2, :cond_3e

    iget v1, v1, Luk/b;->g:I

    if-eqz v1, :cond_3f

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3e

    goto :goto_23

    :cond_3e
    move-object/from16 v6, v33

    goto :goto_24

    :cond_3f
    :goto_23
    iget-object v1, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    if-nez v1, :cond_40

    invoke-virtual {v0}, Luk/e;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    :cond_40
    iget-object v5, v0, Luk/e;->m:Landroid/graphics/Bitmap;

    const/4 v10, 0x0

    iget v12, v0, Luk/e;->q:I

    const/4 v7, 0x0

    iget v8, v0, Luk/e;->r:I

    const/4 v9, 0x0

    move v11, v8

    move-object/from16 v6, v33

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    :goto_24
    invoke-virtual {v0}, Luk/e;->b()Landroid/graphics/Bitmap;

    move-result-object v5

    const/4 v10, 0x0

    iget v12, v0, Luk/e;->q:I

    const/4 v7, 0x0

    iget v8, v0, Luk/e;->r:I

    const/4 v9, 0x0

    move v11, v8

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v5
.end method

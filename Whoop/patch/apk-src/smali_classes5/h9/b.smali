.class public final Lh9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqa/f;
.implements La9/d;


# instance fields
.field public final a:La9/g;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayDeque;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:[La9/e;

.field public final f:[La9/f;

.field public g:I

.field public h:I

.field public i:La9/e;

.field public j:Landroidx/media3/decoder/DecoderException;

.field public k:Z

.field public l:Z

.field public m:J

.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/l;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lh9/b;->n:I

    const/4 v0, 0x1

    .line 28
    new-array v1, v0, [La9/e;

    new-array v0, v0, [Lh9/a;

    invoke-direct {p0, v1, v0}, Lh9/b;-><init>([La9/e;[La9/f;)V

    .line 29
    iput-object p1, p0, Lh9/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqa/l;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, Lh9/b;->n:I

    const/4 v0, 0x2

    .line 1
    new-array v1, v0, [Lqa/i;

    new-array v0, v0, [Lqa/d;

    invoke-direct {p0, v1, v0}, Lh9/b;-><init>([La9/e;[La9/f;)V

    .line 2
    iget v0, p0, Lh9/b;->g:I

    iget-object v1, p0, Lh9/b;->e:[La9/e;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    .line 3
    array-length v0, v1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v2, v1, v3

    const/16 v4, 0x400

    .line 4
    invoke-virtual {v2, v4}, La9/e;->q(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 5
    :cond_1
    iput-object p1, p0, Lh9/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([La9/e;[La9/f;)V
    .locals 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide v0, p0, Lh9/b;->m:J

    .line 9
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    .line 11
    iput-object p1, p0, Lh9/b;->e:[La9/e;

    .line 12
    array-length p1, p1

    iput p1, p0, Lh9/b;->g:I

    const/4 p1, 0x0

    move v0, p1

    .line 13
    :goto_0
    iget v1, p0, Lh9/b;->g:I

    if-ge v0, v1, :cond_0

    .line 14
    iget-object v1, p0, Lh9/b;->e:[La9/e;

    iget v2, p0, Lh9/b;->n:I

    packed-switch v2, :pswitch_data_0

    .line 15
    new-instance v2, Lqa/i;

    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, La9/e;-><init>(I)V

    goto :goto_1

    .line 17
    :pswitch_0
    new-instance v2, La9/e;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, La9/e;-><init>(I)V

    .line 18
    :goto_1
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 19
    :cond_0
    iput-object p2, p0, Lh9/b;->f:[La9/f;

    .line 20
    array-length p2, p2

    iput p2, p0, Lh9/b;->h:I

    .line 21
    :goto_2
    iget p2, p0, Lh9/b;->h:I

    if-ge p1, p2, :cond_1

    .line 22
    iget-object p2, p0, Lh9/b;->f:[La9/f;

    iget v0, p0, Lh9/b;->n:I

    packed-switch v0, :pswitch_data_1

    .line 23
    new-instance v0, Lqa/d;

    invoke-direct {v0, p0}, Lqa/d;-><init>(Lh9/b;)V

    goto :goto_3

    .line 24
    :pswitch_1
    new-instance v0, Lh9/a;

    invoke-direct {v0, p0}, Lh9/a;-><init>(Lh9/b;)V

    .line 25
    :goto_3
    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 26
    :cond_1
    new-instance p1, La9/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La9/g;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lh9/b;->a:La9/g;

    .line 27
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh9/b;->i()La9/f;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh9/b;->j:Landroidx/media3/decoder/DecoderException;

    if-nez v1, :cond_2

    iget-object v1, p0, Lh9/b;->i:La9/e;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->i(Z)V

    iget v1, p0, Lh9/b;->g:I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lh9/b;->e:[La9/e;

    sub-int/2addr v1, v2

    iput v1, p0, Lh9/b;->g:I

    aget-object v1, v3, v1

    :goto_1
    iput-object v1, p0, Lh9/b;->i:La9/e;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    throw v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d(J)V
    .locals 3

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh9/b;->g:I

    iget-object v2, p0, Lh9/b;->e:[La9/e;

    array-length v2, v2

    if-eq v1, v2, :cond_1

    iget-boolean v1, p0, Lh9/b;->k:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lva3/g;->i(Z)V

    iput-wide p1, p0, Lh9/b;->m:J

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic e(Lqa/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lh9/b;->j(La9/e;)V

    return-void
.end method

.method public final f(Ljava/lang/Throwable;)Landroidx/media3/decoder/DecoderException;
    .locals 2

    iget v0, p0, Lh9/b;->n:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/media3/extractor/text/SubtitleDecoderException;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroidx/media3/exoplayer/image/ImageDecoderException;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 5

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lh9/b;->k:Z

    iget-object v1, p0, Lh9/b;->i:La9/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La9/e;->o()V

    iget-object v2, p0, Lh9/b;->e:[La9/e;

    iget v3, p0, Lh9/b;->g:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lh9/b;->g:I

    aput-object v1, v2, v3

    const/4 v1, 0x0

    iput-object v1, p0, Lh9/b;->i:La9/e;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La9/e;

    invoke-virtual {v1}, La9/e;->o()V

    iget-object v2, p0, Lh9/b;->e:[La9/e;

    iget v3, p0, Lh9/b;->g:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lh9/b;->g:I

    aput-object v1, v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La9/f;

    invoke-virtual {v1}, La9/f;->p()V

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g(La9/e;La9/f;Z)Landroidx/media3/decoder/DecoderException;
    .locals 7

    iget v0, p0, Lh9/b;->n:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lqa/i;

    check-cast p2, Lqa/d;

    :try_start_0
    iget-object v0, p1, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    iget-object v2, p0, Lh9/b;->o:Ljava/lang/Object;

    check-cast v2, Lqa/l;

    if-eqz p3, :cond_0

    invoke-interface {v2}, Lqa/l;->reset()V

    :cond_0
    const/4 p3, 0x0

    invoke-interface {v2, v1, p3, v0}, Lqa/l;->L([BII)Lqa/e;

    move-result-object v0

    iget-wide v1, p1, La9/e;->G:J

    iget-wide v3, p1, Lqa/i;->J:J

    iput-wide v1, p2, La9/f;->y:J

    iput-object v0, p2, Lqa/d;->E:Lqa/e;

    const-wide v5, 0x7fffffffffffffffL

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-wide v1, v3

    :goto_0
    iput-wide v1, p2, Lqa/d;->F:J

    iput-boolean p3, p2, La9/f;->z:Z
    :try_end_0
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    :goto_1
    return-object p1

    :pswitch_0
    check-cast p2, Lh9/a;

    :try_start_1
    iget-object p3, p1, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    invoke-static {v0}, Lva3/g;->i(Z)V

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Lva3/g;->d(Z)V

    iget-object v0, p0, Lh9/b;->o:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/l;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result p3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Landroidx/media3/exoplayer/image/ImageDecoderException; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    invoke-static {p3, v1}, Lrs/b;->f(I[B)Landroid/graphics/Bitmap;

    move-result-object p3
    :try_end_2
    .catch Landroidx/media3/common/ParserException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroidx/media3/exoplayer/image/ImageDecoderException; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    iput-object p3, p2, Lh9/a;->E:Landroid/graphics/Bitmap;

    iget-wide v0, p1, La9/e;->G:J

    iput-wide v0, p2, La9/f;->y:J

    const/4 p1, 0x0

    goto :goto_3

    :catch_1
    move-exception p1

    new-instance p2, Landroidx/media3/exoplayer/image/ImageDecoderException;

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance p2, Landroidx/media3/exoplayer/image/ImageDecoderException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Could not decode image data with BitmapFactory. (data.length = "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v1, v1

    const-string v2, ", input length = "

    const-string v3, ")"

    invoke-static {v0, v1, v2, p3, v3}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_3
    .catch Landroidx/media3/exoplayer/image/ImageDecoderException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    move-exception p1

    :goto_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Z
    .locals 13

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lh9/b;->l:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lh9/b;->h:I

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_1

    :cond_0
    move v1, v3

    :goto_1
    if-nez v1, :cond_1

    iget-object v1, p0, Lh9/b;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_8

    :cond_1
    iget-boolean v1, p0, Lh9/b;->l:Z

    if-eqz v1, :cond_2

    monitor-exit v0

    return v3

    :cond_2
    iget-object v1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La9/e;

    iget-object v4, p0, Lh9/b;->f:[La9/f;

    iget v5, p0, Lh9/b;->h:I

    sub-int/2addr v5, v2

    iput v5, p0, Lh9/b;->h:I

    aget-object v4, v4, v5

    iget-boolean v5, p0, Lh9/b;->k:Z

    iput-boolean v3, p0, Lh9/b;->k:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, La9/a;->f(I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v4, v0}, La9/a;->a(I)V

    goto :goto_5

    :cond_3
    iget-wide v6, v1, La9/e;->G:J

    iput-wide v6, v4, La9/f;->y:J

    const/high16 v0, 0x8000000

    invoke-virtual {v1, v0}, La9/a;->f(I)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v4, v0}, La9/a;->a(I)V

    :cond_4
    iget-wide v6, v1, La9/e;->G:J

    iget-object v8, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v8

    :try_start_1
    iget-wide v9, p0, Lh9/b;->m:J

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v9, v11

    if-eqz v0, :cond_6

    cmp-long v0, v6, v9

    if-ltz v0, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    goto :goto_3

    :cond_6
    :goto_2
    move v0, v2

    :goto_3
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-nez v0, :cond_7

    iput-boolean v2, v4, La9/f;->z:Z

    :cond_7
    :try_start_2
    invoke-virtual {p0, v1, v4, v5}, Lh9/b;->g(La9/e;La9/f;Z)Landroidx/media3/decoder/DecoderException;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lh9/b;->f(Ljava/lang/Throwable;)Landroidx/media3/decoder/DecoderException;

    move-result-object v0

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {p0, v0}, Lh9/b;->f(Ljava/lang/Throwable;)Landroidx/media3/decoder/DecoderException;

    move-result-object v0

    :goto_4
    if-eqz v0, :cond_8

    iget-object v5, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_3
    iput-object v0, p0, Lh9/b;->j:Landroidx/media3/decoder/DecoderException;

    monitor-exit v5

    return v3

    :catchall_1
    move-exception v0

    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_8
    :goto_5
    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    iget-boolean v3, p0, Lh9/b;->k:Z

    if-eqz v3, :cond_9

    invoke-virtual {v4}, La9/f;->p()V

    goto :goto_6

    :catchall_2
    move-exception v1

    goto :goto_7

    :cond_9
    iget-boolean v3, v4, La9/f;->z:Z

    if-eqz v3, :cond_a

    invoke-virtual {v4}, La9/f;->p()V

    goto :goto_6

    :cond_a
    iget-object v3, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :goto_6
    invoke-virtual {v1}, La9/e;->o()V

    iget-object v3, p0, Lh9/b;->e:[La9/e;

    iget v4, p0, Lh9/b;->g:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lh9/b;->g:I

    aput-object v1, v3, v4

    monitor-exit v0

    return v2

    :goto_7
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catchall_3
    move-exception v0

    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :goto_8
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method

.method public final i()La9/f;
    .locals 2

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh9/b;->j:Landroidx/media3/decoder/DecoderException;

    if-nez v1, :cond_1

    iget-object v1, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La9/f;

    monitor-exit v0

    return-object v1

    :cond_1
    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j(La9/e;)V
    .locals 2

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh9/b;->j:Landroidx/media3/decoder/DecoderException;

    if-nez v1, :cond_2

    iget-object v1, p0, Lh9/b;->i:La9/e;

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->d(Z)V

    iget-object v1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget-object p1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget p1, p0, Lh9/b;->h:I

    if-lez p1, :cond_1

    iget-object p1, p0, Lh9/b;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lh9/b;->i:La9/e;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    throw v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final k(La9/f;)V
    .locals 4

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, La9/f;->o()V

    iget-object v1, p0, Lh9/b;->f:[La9/f;

    iget v2, p0, Lh9/b;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lh9/b;->h:I

    aput-object p1, v1, v2

    iget-object p1, p0, Lh9/b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, Lh9/b;->h:I

    if-lez p1, :cond_0

    iget-object p1, p0, Lh9/b;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final release()V
    .locals 2

    iget-object v0, p0, Lh9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lh9/b;->l:Z

    iget-object v1, p0, Lh9/b;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lh9/b;->a:La9/g;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

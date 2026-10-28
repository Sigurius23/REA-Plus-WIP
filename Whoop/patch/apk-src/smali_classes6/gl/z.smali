.class public final Lgl/z;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgl/z;->w:I

    .line 3
    iput-object p1, p0, Lgl/z;->x:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method

.method public constructor <init>(Lne3/z;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgl/z;->w:I

    .line 1
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 2
    iput-object p1, p0, Lgl/z;->x:Ljava/lang/Object;

    return-void
.end method

.method private final b()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, Lgl/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgl/z;->x:Ljava/lang/Object;

    check-cast v0, Lne3/z;

    invoke-virtual {v0}, Lne3/z;->close()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getSize()J
    .locals 2

    iget v0, p0, Lgl/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgl/z;->x:Ljava/lang/Object;

    check-cast v0, Lne3/z;

    invoke-virtual {v0}, Lne3/z;->size()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lgl/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final readAt(J[BII)I
    .locals 7

    iget v0, p0, Lgl/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgl/z;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lne3/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "array"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lne3/z;->z:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-boolean v0, v1, Lne3/z;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lne3/z;->b(J[BII)I

    move-result p1

    return p1

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :pswitch_0
    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    iget-object p1, p0, Lgl/z;->x:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p2

    int-to-long p2, p2

    cmp-long p2, v2, p2

    if-ltz p2, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    long-to-int p2, v2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {p1, v4, v5, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move p1, p2

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

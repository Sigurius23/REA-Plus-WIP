.class public final Llu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:I

.field public F:I

.field public final synthetic w:I

.field public final x:Ljava/io/FileInputStream;

.field public final y:Ljava/nio/charset/Charset;

.field public z:[B


# direct methods
.method public constructor <init>(Ljava/io/FileInputStream;Ljava/nio/charset/Charset;I)V
    .locals 0

    iput p3, p0, Llu/e;->w:I

    packed-switch p3, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    sget-object p3, Llu/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2, p3}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iput-object p1, p0, Llu/e;->x:Ljava/io/FileInputStream;

    iput-object p2, p0, Llu/e;->y:Ljava/nio/charset/Charset;

    const/16 p1, 0x2000

    new-array p1, p1, [B

    iput-object p1, p0, Llu/e;->z:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported encoding"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_3

    sget-object p3, Ltk/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2, p3}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    iput-object p1, p0, Llu/e;->x:Ljava/io/FileInputStream;

    iput-object p2, p0, Llu/e;->y:Ljava/nio/charset/Charset;

    const/16 p1, 0x2000

    new-array p1, p1, [B

    iput-object p1, p0, Llu/e;->z:[B

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported encoding"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public b()Z
    .locals 2

    iget v0, p0, Llu/e;->F:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final close()V
    .locals 2

    iget v0, p0, Llu/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llu/e;->x:Ljava/io/FileInputStream;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llu/e;->z:[B

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Llu/e;->z:[B

    iget-object v1, p0, Llu/e;->x:Ljava/io/FileInputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Llu/e;->x:Ljava/io/FileInputStream;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Llu/e;->z:[B

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Llu/e;->z:[B

    iget-object v1, p0, Llu/e;->x:Ljava/io/FileInputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ljava/lang/String;
    .locals 8

    iget v0, p0, Llu/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llu/e;->x:Ljava/io/FileInputStream;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llu/e;->z:[B

    if-eqz v1, :cond_9

    iget v2, p0, Llu/e;->E:I

    iget v3, p0, Llu/e;->F:I

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-lt v2, v3, :cond_1

    iget-object v2, p0, Llu/e;->x:Ljava/io/FileInputStream;

    array-length v3, v1

    invoke-virtual {v2, v1, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-eq v1, v5, :cond_0

    iput v4, p0, Llu/e;->E:I

    iput v1, p0, Llu/e;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_1
    :goto_0
    iget v1, p0, Llu/e;->E:I

    :goto_1
    iget v2, p0, Llu/e;->F:I

    const/16 v3, 0xa

    if-eq v1, v2, :cond_4

    iget-object v2, p0, Llu/e;->z:[B

    aget-byte v6, v2, v1

    if-ne v6, v3, :cond_3

    iget v3, p0, Llu/e;->E:I

    if-eq v1, v3, :cond_2

    add-int/lit8 v4, v1, -0x1

    aget-byte v5, v2, v4

    const/16 v6, 0xd

    if-ne v5, v6, :cond_2

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_2
    move v4, v1

    :goto_2
    new-instance v5, Ljava/lang/String;

    sub-int/2addr v4, v3

    iget-object v6, p0, Llu/e;->y:Ljava/nio/charset/Charset;

    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Llu/e;->E:I

    monitor-exit v0

    goto :goto_4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    new-instance v1, Llu/d;

    iget v2, p0, Llu/e;->F:I

    iget v6, p0, Llu/e;->E:I

    sub-int/2addr v2, v6

    add-int/lit8 v2, v2, 0x50

    const/4 v6, 0x1

    invoke-direct {v1, p0, v2, v6}, Llu/d;-><init>(Ljava/io/Closeable;II)V

    :cond_5
    iget-object v2, p0, Llu/e;->z:[B

    iget v6, p0, Llu/e;->E:I

    iget v7, p0, Llu/e;->F:I

    sub-int/2addr v7, v6

    invoke-virtual {v1, v2, v6, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    iput v5, p0, Llu/e;->F:I

    iget-object v2, p0, Llu/e;->x:Ljava/io/FileInputStream;

    iget-object v6, p0, Llu/e;->z:[B

    array-length v7, v6

    invoke-virtual {v2, v6, v4, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-eq v2, v5, :cond_8

    iput v4, p0, Llu/e;->E:I

    iput v2, p0, Llu/e;->F:I

    move v2, v4

    :goto_3
    iget v6, p0, Llu/e;->F:I

    if-eq v2, v6, :cond_5

    iget-object v6, p0, Llu/e;->z:[B

    aget-byte v7, v6, v2

    if-ne v7, v3, :cond_7

    iget v3, p0, Llu/e;->E:I

    if-eq v2, v3, :cond_6

    sub-int v4, v2, v3

    invoke-virtual {v1, v6, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Llu/e;->E:I

    invoke-virtual {v1}, Llu/d;->toString()Ljava/lang/String;

    move-result-object v5

    monitor-exit v0

    :goto_4
    return-object v5

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "LineReader is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Llu/e;->x:Ljava/io/FileInputStream;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Llu/e;->z:[B

    if-eqz v1, :cond_13

    iget v2, p0, Llu/e;->E:I

    iget v3, p0, Llu/e;->F:I

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-lt v2, v3, :cond_b

    iget-object v2, p0, Llu/e;->x:Ljava/io/FileInputStream;

    array-length v3, v1

    invoke-virtual {v2, v1, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-eq v1, v5, :cond_a

    iput v4, p0, Llu/e;->E:I

    iput v1, p0, Llu/e;->F:I

    goto :goto_6

    :cond_a
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_b
    :goto_6
    iget v1, p0, Llu/e;->E:I

    :goto_7
    iget v2, p0, Llu/e;->F:I

    const/16 v3, 0xa

    if-eq v1, v2, :cond_e

    iget-object v2, p0, Llu/e;->z:[B

    aget-byte v6, v2, v1

    if-ne v6, v3, :cond_d

    iget v3, p0, Llu/e;->E:I

    if-eq v1, v3, :cond_c

    add-int/lit8 v4, v1, -0x1

    aget-byte v5, v2, v4

    const/16 v6, 0xd

    if-ne v5, v6, :cond_c

    goto :goto_8

    :catchall_1
    move-exception v1

    goto :goto_b

    :cond_c
    move v4, v1

    :goto_8
    new-instance v5, Ljava/lang/String;

    sub-int/2addr v4, v3

    iget-object v6, p0, Llu/e;->y:Ljava/nio/charset/Charset;

    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Llu/e;->E:I

    monitor-exit v0

    goto :goto_a

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_e
    new-instance v1, Llu/d;

    iget v2, p0, Llu/e;->F:I

    iget v6, p0, Llu/e;->E:I

    sub-int/2addr v2, v6

    add-int/lit8 v2, v2, 0x50

    const/4 v6, 0x0

    invoke-direct {v1, p0, v2, v6}, Llu/d;-><init>(Ljava/io/Closeable;II)V

    :cond_f
    iget-object v2, p0, Llu/e;->z:[B

    iget v6, p0, Llu/e;->E:I

    iget v7, p0, Llu/e;->F:I

    sub-int/2addr v7, v6

    invoke-virtual {v1, v2, v6, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    iput v5, p0, Llu/e;->F:I

    iget-object v2, p0, Llu/e;->x:Ljava/io/FileInputStream;

    iget-object v6, p0, Llu/e;->z:[B

    array-length v7, v6

    invoke-virtual {v2, v6, v4, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-eq v2, v5, :cond_12

    iput v4, p0, Llu/e;->E:I

    iput v2, p0, Llu/e;->F:I

    move v2, v4

    :goto_9
    iget v6, p0, Llu/e;->F:I

    if-eq v2, v6, :cond_f

    iget-object v6, p0, Llu/e;->z:[B

    aget-byte v7, v6, v2

    if-ne v7, v3, :cond_11

    iget v3, p0, Llu/e;->E:I

    if-eq v2, v3, :cond_10

    sub-int v4, v2, v3

    invoke-virtual {v1, v6, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :cond_10
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Llu/e;->E:I

    invoke-virtual {v1}, Llu/d;->toString()Ljava/lang/String;

    move-result-object v5

    monitor-exit v0

    :goto_a
    return-object v5

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_12
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_13
    new-instance v1, Ljava/io/IOException;

    const-string v2, "LineReader is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_b
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

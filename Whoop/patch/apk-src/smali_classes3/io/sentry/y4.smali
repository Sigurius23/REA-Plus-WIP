.class public final synthetic Lio/sentry/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lio/sentry/j1;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/a;JLio/sentry/j1;Lio/sentry/v0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/y4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/y4;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lio/sentry/y4;->x:J

    iput-object p4, p0, Lio/sentry/y4;->y:Lio/sentry/j1;

    iput-object p5, p0, Lio/sentry/y4;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;JLio/sentry/s3;Lio/sentry/j1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/y4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/y4;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lio/sentry/y4;->x:J

    iput-object p4, p0, Lio/sentry/y4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lio/sentry/y4;->y:Lio/sentry/j1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lio/sentry/y4;->w:I

    iget-object v1, p0, Lio/sentry/y4;->y:Lio/sentry/j1;

    iget-object v2, p0, Lio/sentry/y4;->E:Ljava/lang/Object;

    iget-wide v3, p0, Lio/sentry/y4;->x:J

    iget-object v5, p0, Lio/sentry/y4;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Ljava/io/File;

    check-cast v2, Lio/sentry/s3;

    const-string v0, "Failed to serialize profiling trace data\n"

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v6}, Lge3/g;->O(JLjava/lang/String;)[B

    move-result-object v3

    invoke-static {v3}, Lio/sentry/vendor/a;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    iput-object v3, v2, Lio/sentry/s3;->b0:Ljava/lang/String;

    :try_start_0
    iget-object v3, v2, Lio/sentry/s3;->x:Ljava/util/concurrent/Callable;

    invoke-interface {v3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    iput-object v3, v2, Lio/sentry/s3;->L:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v4, Ljava/io/BufferedWriter;

    new-instance v6, Ljava/io/OutputStreamWriter;

    sget-object v7, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v6, v3, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v4, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-interface {v1, v4, v2}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v4}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    return-object v1

    :catchall_1
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_1

    :catchall_3
    move-exception v1

    :try_start_6
    invoke-virtual {v4}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_0

    :catchall_4
    move-exception v2

    :try_start_7
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_1
    :try_start_8
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v2

    :try_start_9
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_3
    :try_start_a
    new-instance v2, Lio/sentry/exception/SentryEnvelopeException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_4
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    throw v0

    :cond_0
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    const-string v1, "Profiling trace file is empty"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dropping profiling trace data, because the file \'"

    const-string v3, "\' doesn\'t exists"

    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast v5, Lio/sentry/a;

    check-cast v2, Lio/sentry/v0;

    iget-object v0, v5, Lio/sentry/a;->a:[B

    iget-object v6, v5, Lio/sentry/a;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    array-length v1, v0

    int-to-long v1, v1

    invoke-static {v1, v2, v3, v4, v6}, Lio/sentry/c5;->a(JJLjava/lang/String;)V

    goto :goto_a

    :cond_2
    iget-object v0, v5, Lio/sentry/a;->b:Lio/sentry/protocol/j0;

    if-eqz v0, :cond_3

    sget-object v5, Lio/sentry/util/d;->a:Ljava/nio/charset/Charset;

    :try_start_b
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :try_start_c
    new-instance v7, Ljava/io/BufferedWriter;

    new-instance v8, Ljava/io/OutputStreamWriter;

    sget-object v9, Lio/sentry/util/d;->a:Ljava/nio/charset/Charset;

    invoke-direct {v8, v5, v9}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v7, v8}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :try_start_d
    invoke-interface {v1, v7, v0}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :try_start_e
    invoke-virtual {v7}, Ljava/io/Writer;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    :try_start_f
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_9

    :catchall_6
    move-exception v0

    goto :goto_8

    :catchall_7
    move-exception v0

    goto :goto_6

    :catchall_8
    move-exception v0

    :try_start_10
    invoke-virtual {v7}, Ljava/io/Writer;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    goto :goto_5

    :catchall_9
    move-exception v1

    :try_start_11
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_6
    :try_start_12
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    goto :goto_7

    :catchall_a
    move-exception v1

    :try_start_13
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    :goto_8
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Could not serialize serializable"

    invoke-interface {v2, v1, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_4

    array-length v1, v0

    int-to-long v1, v1

    invoke-static {v1, v2, v3, v4, v6}, Lio/sentry/c5;->a(JJLjava/lang/String;)V

    goto :goto_a

    :cond_3
    iget-object v0, v5, Lio/sentry/a;->c:Lcom/iterable/iterableapi/n1;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/iterable/iterableapi/n1;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_4

    array-length v1, v0

    int-to-long v1, v1

    invoke-static {v1, v2, v3, v4, v6}, Lio/sentry/c5;->a(JJLjava/lang/String;)V

    :goto_a
    return-object v0

    :cond_4
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    const-string v1, "Couldn\'t attach the attachment "

    const-string v2, ".\nPlease check that either bytes, serializable, path or provider is set."

    invoke-static {v1, v6, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

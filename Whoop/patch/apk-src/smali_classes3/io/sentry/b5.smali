.class public final synthetic Lio/sentry/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:Ljava/io/File;

.field public final synthetic x:Lio/sentry/p3;

.field public final synthetic y:Lio/sentry/a1;

.field public final synthetic z:Lio/sentry/j1;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lio/sentry/p3;Lio/sentry/a1;Lio/sentry/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/b5;->w:Ljava/io/File;

    iput-object p2, p0, Lio/sentry/b5;->x:Lio/sentry/p3;

    iput-object p3, p0, Lio/sentry/b5;->y:Lio/sentry/a1;

    iput-object p4, p0, Lio/sentry/b5;->z:Lio/sentry/j1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/sentry/b5;->z:Lio/sentry/j1;

    const-string v1, "Failed to serialize profile chunk\n"

    iget-object v2, p0, Lio/sentry/b5;->w:Ljava/io/File;

    iget-object v3, p0, Lio/sentry/b5;->x:Lio/sentry/p3;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "java"

    iget-object v5, v3, Lio/sentry/p3;->F:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lio/sentry/u2;->a:Lio/sentry/u2;

    iget-object v5, p0, Lio/sentry/b5;->y:Lio/sentry/a1;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    check-cast v5, Lio/sentry/u2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lio/sentry/protocol/profiling/a;

    invoke-direct {v4}, Lio/sentry/protocol/profiling/a;-><init>()V

    iput-object v4, v3, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lio/sentry/exception/SentryEnvelopeException;

    const-string v2, "Profile conversion failed"

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    const-string v1, "No ProfileConverter available, dropping chunk."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    const-wide/32 v5, 0x3200000

    invoke-static {v5, v6, v4}, Lge3/g;->O(JLjava/lang/String;)[B

    move-result-object v4

    invoke-static {v4}, Lio/sentry/vendor/a;->b([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    iput-object v4, v3, Lio/sentry/p3;->L:Ljava/lang/String;

    goto :goto_0

    :cond_2
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    const-string v1, "Profiling trace file is empty"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lio/sentry/exception/SentryEnvelopeException;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dropping profile chunk, because the file \'"

    const-string v3, "\' doesn\'t exists"

    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    :try_start_1
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v5, Ljava/io/BufferedWriter;

    new-instance v6, Ljava/io/OutputStreamWriter;

    sget-object v7, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v6, v4, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-interface {v0, v5, v3}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v5}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_5
    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v5}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v3

    :try_start_7
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_2
    :try_start_8
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v3

    :try_start_9
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_4
    :try_start_a
    new-instance v3, Lio/sentry/exception/SentryEnvelopeException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_5
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_6
    throw v0
.end method

.class public final synthetic Lio/sentry/a5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic E:Lio/sentry/v0;

.field public final synthetic F:Z

.field public final synthetic w:Lio/sentry/j1;

.field public final synthetic x:Lio/sentry/s6;

.field public final synthetic y:Lio/sentry/x3;

.field public final synthetic z:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/j1;Lio/sentry/s6;Lio/sentry/x3;Ljava/io/File;Lio/sentry/v0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/a5;->w:Lio/sentry/j1;

    iput-object p2, p0, Lio/sentry/a5;->x:Lio/sentry/s6;

    iput-object p3, p0, Lio/sentry/a5;->y:Lio/sentry/x3;

    iput-object p4, p0, Lio/sentry/a5;->z:Ljava/io/File;

    iput-object p5, p0, Lio/sentry/a5;->E:Lio/sentry/v0;

    iput-boolean p6, p0, Lio/sentry/a5;->F:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lio/sentry/a5;->w:Lio/sentry/j1;

    iget-object v1, p0, Lio/sentry/a5;->x:Lio/sentry/s6;

    iget-object v2, p0, Lio/sentry/a5;->z:Ljava/io/File;

    iget-object v3, p0, Lio/sentry/a5;->E:Lio/sentry/v0;

    iget-boolean v4, p0, Lio/sentry/a5;->F:Z

    :try_start_0
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v6, Ljava/io/BufferedWriter;

    new-instance v7, Ljava/io/OutputStreamWriter;

    sget-object v8, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v7, v5, v8}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v6, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0, v6, v1}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    sget-object v1, Lio/sentry/m5;->ReplayEvent:Lio/sentry/m5;

    invoke-virtual {v1}, Lio/sentry/m5;->getItemType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v8

    invoke-interface {v7, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lio/sentry/a5;->y:Lio/sentry/x3;

    if-eqz v1, :cond_0

    :try_start_3
    invoke-interface {v0, v6, v1}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    sget-object v0, Lio/sentry/m5;->ReplayRecording:Lio/sentry/m5;

    invoke-virtual {v0}, Lio/sentry/m5;->getItemType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide/32 v8, 0xa00000

    invoke-static {v8, v9, v0}, Lge3/g;->O(JLjava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_1

    sget-object v1, Lio/sentry/m5;->ReplayVideo:Lio/sentry/m5;

    invoke-virtual {v1}, Lio/sentry/m5;->getItemType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {v7}, Lio/sentry/c5;->j(Ljava/util/LinkedHashMap;)[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v6}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v2, :cond_3

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->r(Ljava/io/File;)Z

    return-object v0

    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_3
    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_3

    :goto_1
    :try_start_6
    invoke-virtual {v6}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    :try_start_7
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_3
    :try_start_8
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v1

    :try_start_9
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_5
    :try_start_a
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Could not serialize replay recording"

    invoke-interface {v3, v1, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    if-eqz v2, :cond_5

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->r(Ljava/io/File;)Z

    goto :goto_6

    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_5
    :goto_6
    const/4 v0, 0x0

    return-object v0

    :catchall_5
    move-exception v0

    if-eqz v2, :cond_7

    if-eqz v4, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->r(Ljava/io/File;)Z

    goto :goto_7

    :cond_6
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_7
    :goto_7
    throw v0
.end method

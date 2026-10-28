.class public final Lio/sentry/android/core/anr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final w:Lio/sentry/cache/tape/f;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Ljava/io/File;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const/16 v0, 0x78

    :try_start_0
    invoke-static {p2}, Lio/sentry/cache/tape/i;->m(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Lio/sentry/cache/tape/i;

    invoke-direct {v2, p2, v1, v0}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :try_start_3
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2}, Lio/sentry/cache/tape/i;->m(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    new-instance v2, Lio/sentry/cache/tape/i;

    invoke-direct {v2, p2, v1, v0}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    throw p2

    :cond_0
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Could not delete file"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to create stacktrace queue"

    invoke-interface {p1, v0, v1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    new-instance p1, Lio/sentry/cache/tape/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    goto :goto_1

    :cond_1
    new-instance p1, Lg73/a;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lg73/a;-><init>(I)V

    new-instance p2, Lio/sentry/cache/tape/d;

    invoke-direct {p2, v2, p1}, Lio/sentry/cache/tape/d;-><init>(Lio/sentry/cache/tape/i;Lio/sentry/cache/tape/e;)V

    iput-object p2, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    :goto_1
    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/android/core/anr/f;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    invoke-virtual {v0, p1}, Lio/sentry/cache/tape/f;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    invoke-virtual {v0}, Lio/sentry/cache/tape/f;->clear()V

    return-void
.end method

.method public final i()Ld9/t;
    .locals 5

    new-instance v0, Ld9/t;

    iget-object v1, p0, Lio/sentry/android/core/anr/d;->w:Lio/sentry/cache/tape/f;

    invoke-virtual {v1}, Lio/sentry/cache/tape/f;->F0()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v0, Ld9/t;->c:Ljava/io/Serializable;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/anr/f;

    if-eqz v2, :cond_0

    iget-object v3, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    iget-object v1, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/core/anr/f;

    iget-wide v1, v1, Lio/sentry/android/core/anr/f;->x:J

    iput-wide v1, v0, Ld9/t;->a:J

    iget-object v1, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/core/anr/f;

    iget-wide v1, v1, Lio/sentry/android/core/anr/f;->x:J

    const-wide/16 v3, 0x2710

    add-long/2addr v1, v3

    iput-wide v1, v0, Ld9/t;->b:J

    goto :goto_1

    :cond_2
    const-wide/16 v1, 0x0

    iput-wide v1, v0, Ld9/t;->a:J

    iput-wide v1, v0, Ld9/t;->b:J

    :goto_1
    return-object v0
.end method

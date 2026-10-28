.class public final Lio/sentry/android/replay/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final E:Lio/sentry/util/a;

.field public final F:Lio/sentry/util/a;

.field public G:Lio/sentry/android/replay/video/d;

.field public final H:Ll83/p;

.field public final I:Ljava/util/ArrayList;

.field public final J:Ljava/util/LinkedHashMap;

.field public final K:Ll83/p;

.field public final w:Lio/sentry/q6;

.field public final x:Lio/sentry/protocol/v;

.field public final y:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final z:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lio/sentry/protocol/v;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->w:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/k;->x:Lio/sentry/protocol/v;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/k;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->z:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->E:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->F:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/android/replay/i;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/sentry/android/replay/i;-><init>(Lio/sentry/android/replay/k;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/k;->H:Ll83/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/k;->J:Ljava/util/LinkedHashMap;

    new-instance p1, Lio/sentry/android/replay/i;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/sentry/android/replay/i;-><init>(Lio/sentry/android/replay/k;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/k;->K:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Lio/sentry/android/replay/l;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/sentry/android/replay/l;-><init>(Ljava/io/File;JLjava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/k;->F:Lio/sentry/util/a;

    invoke-virtual {p1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p3

    invoke-static {p1, p2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/k;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/sentry/android/replay/video/d;->i()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/sentry/android/replay/k;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final h(Ljava/io/File;)V
    .locals 5

    const-string v0, "Failed to delete replay frame: %s"

    iget-object v1, p0, Lio/sentry/android/replay/k;->w:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v0, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v3, v2, v0, p1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final i()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/k;->H:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lio/sentry/android/replay/k;->K:Ll83/p;

    iget-object v1, p0, Lio/sentry/android/replay/k;->J:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Lio/sentry/android/replay/k;->E:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_0
    iget-object v3, p0, Lio/sentry/android/replay/k;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v2, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-ne v3, v5, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    if-eqz v3, :cond_4

    sget-object v6, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v7, Ljava/io/InputStreamReader;

    new-instance v8, Ljava/io/FileInputStream;

    invoke-direct {v8, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v7, v8, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v3, Ljava/io/BufferedReader;

    const/16 v6, 0x2000

    invoke-direct {v3, v7, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v6, Lb3/d3;

    const/4 v7, 0x2

    invoke-direct {v6, v3, v7}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    new-instance v7, Lxb3/a;

    invoke-direct {v7, v6}, Lxb3/a;-><init>(Lxb3/i;)V

    invoke-virtual {v7}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "="

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    invoke-static {v7, v8, v9}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_3
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object p2, v0

    :try_start_5
    invoke-static {v3, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_3
    if-nez p2, :cond_5

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    const-string v0, "<get-entries>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p2

    check-cast v5, Ljava/lang/Iterable;

    const-string v6, "\n"

    sget-object v9, Lio/sentry/android/replay/c;->y:Lio/sentry/android/replay/c;

    const/16 v10, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v1, "text"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "charset"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-static {v1, p2, v0}, Lx83/j;->q(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move-object p2, v0

    :try_start_9
    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_6
    :goto_5
    invoke-static {v2, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_6
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v0

    move-object p2, v0

    invoke-static {v2, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final m(J)Ljava/lang/String;
    .locals 8

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lio/sentry/android/replay/k;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v6

    :try_start_0
    iget-object v7, p0, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    new-instance v0, Lio/sentry/android/replay/j;

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/j;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    invoke-static {v7, v0}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v6, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object p1, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    invoke-static {v6, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

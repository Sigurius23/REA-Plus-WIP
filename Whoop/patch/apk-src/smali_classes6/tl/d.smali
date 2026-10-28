.class public final Ltl/d;
.super Ljava/io/InputStream;
.source "SourceFile"


# static fields
.field public static final y:Ljava/util/ArrayDeque;


# instance fields
.field public w:Lgl/u;

.field public x:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltl/l;->a:[C

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    sput-object v0, Ltl/d;->y:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static b(Lgl/u;)Ltl/d;
    .locals 2

    sget-object v0, Ltl/d;->y:Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltl/d;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Ltl/d;

    invoke-direct {v1}, Ljava/io/InputStream;-><init>()V

    :cond_0
    iput-object p0, v1, Ltl/d;->w:Lgl/u;

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0}, Lgl/u;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0}, Lgl/u;->close()V

    return-void
.end method

.method public final h()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ltl/d;->x:Ljava/io/IOException;

    iput-object v0, p0, Ltl/d;->w:Lgl/u;

    sget-object v0, Ltl/d;->y:Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final mark(I)V
    .locals 1

    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0, p1}, Lgl/u;->mark(I)V

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 1

    .line 5
    :try_start_0
    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0}, Lgl/u;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 6
    iput-object v0, p0, Ltl/d;->x:Ljava/io/IOException;

    const/4 v0, -0x1

    return v0
.end method

.method public final read([B)I
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 2
    iput-object p1, p0, Ltl/d;->x:Ljava/io/IOException;

    const/4 p1, -0x1

    return p1
.end method

.method public final read([BII)I
    .locals 1

    .line 3
    :try_start_0
    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0, p1, p2, p3}, Lgl/u;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    iput-object p1, p0, Ltl/d;->x:Ljava/io/IOException;

    const/4 p1, -0x1

    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0}, Lgl/u;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final skip(J)J
    .locals 1

    :try_start_0
    iget-object v0, p0, Ltl/d;->w:Lgl/u;

    invoke-virtual {v0, p1, p2}, Lgl/u;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iput-object p1, p0, Ltl/d;->x:Ljava/io/IOException;

    const-wide/16 p1, 0x0

    return-wide p1
.end method

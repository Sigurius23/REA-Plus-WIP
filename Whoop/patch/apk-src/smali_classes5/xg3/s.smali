.class public abstract Lxg3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/h;
.implements Lxg3/t;


# instance fields
.field private final w:Lgh3/m;

.field private final x:Lxg3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/s;"
        }
    .end annotation
.end field

.field private y:Lxg3/i;

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lxg3/s;-><init>(Lxg3/s;Z)V

    return-void
.end method

.method public constructor <init>(Lxg3/s;Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    iput-wide v0, p0, Lxg3/s;->z:J

    .line 4
    iput-object p1, p0, Lxg3/s;->x:Lxg3/s;

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p1, Lxg3/s;->w:Lgh3/m;

    goto :goto_0

    :cond_0
    new-instance p1, Lgh3/m;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    :goto_0
    iput-object p1, p0, Lxg3/s;->w:Lgh3/m;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lxg3/s;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lxg3/s;->w:Lgh3/m;

    invoke-virtual {v0}, Lgh3/m;->b()V

    return-void
.end method

.method public final c(Lxg3/t;)V
    .locals 1

    iget-object v0, p0, Lxg3/s;->w:Lgh3/m;

    invoke-virtual {v0, p1}, Lgh3/m;->c(Lxg3/t;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public final e(J)V
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lxg3/s;->y:Lxg3/i;

    if-eqz v2, :cond_0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, p1, p2}, Lxg3/i;->request(J)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Lxg3/s;->z:J

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    iput-wide p1, p0, Lxg3/s;->z:J

    goto :goto_0

    :cond_1
    add-long/2addr v2, p1

    cmp-long p1, v2, v0

    if-gez p1, :cond_2

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lxg3/s;->z:J

    goto :goto_0

    :cond_2
    iput-wide v2, p0, Lxg3/s;->z:J

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "number requested cannot be negative: "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Lxg3/i;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lxg3/s;->z:J

    iput-object p1, p0, Lxg3/s;->y:Lxg3/i;

    iget-object v2, p0, Lxg3/s;->x:Lxg3/s;

    const-wide/high16 v3, -0x8000000000000000L

    if-eqz v2, :cond_0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    invoke-virtual {v2, p1}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :cond_1
    cmp-long v2, v0, v3

    if-nez v2, :cond_2

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lxg3/i;->request(J)V

    return-void

    :cond_2
    invoke-interface {p1, v0, v1}, Lxg3/i;->request(J)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lxg3/s;->onCompleted()V

    return-void
.end method

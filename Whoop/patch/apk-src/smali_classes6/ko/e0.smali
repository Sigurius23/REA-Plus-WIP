.class public final Lko/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/a0;


# instance fields
.field public final a:J

.field public final b:Lko/n;

.field public final c:I

.field public final d:Lko/i0;

.field public final e:Lko/d0;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lko/l;Landroid/net/Uri;Lko/d0;)V
    .locals 10

    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v0, "The uri must be set."

    invoke-static {p2, v0}, Llo/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lko/n;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, -0x1

    const/4 v9, 0x1

    move-object v1, p2

    invoke-direct/range {v0 .. v9}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lko/i0;

    invoke-direct {p2, p1}, Lko/i0;-><init>(Lko/l;)V

    iput-object p2, p0, Lko/e0;->d:Lko/i0;

    iput-object v0, p0, Lko/e0;->b:Lko/n;

    const/4 p1, 0x4

    iput p1, p0, Lko/e0;->c:I

    iput-object p3, p0, Lko/e0;->e:Lko/d0;

    sget-object p1, Lsn/m;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p1

    iput-wide p1, p0, Lko/e0;->a:J

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lko/e0;->d:Lko/i0;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lko/i0;->x:J

    new-instance v0, Lko/m;

    iget-object v1, p0, Lko/e0;->d:Lko/i0;

    iget-object v2, p0, Lko/e0;->b:Lko/n;

    invoke-direct {v0, v1, v2}, Lko/m;-><init>(Lko/l;Lko/n;)V

    :try_start_0
    invoke-virtual {v0}, Lko/m;->b()V

    iget-object v1, p0, Lko/e0;->d:Lko/i0;

    iget-object v1, v1, Lko/i0;->w:Lko/l;

    invoke-interface {v1}, Lko/l;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lko/e0;->e:Lko/d0;

    invoke-interface {v2, v1, v0}, Lko/d0;->c(Landroid/net/Uri;Lko/m;)Lwn/n;

    move-result-object v1

    iput-object v1, p0, Lko/e0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v1, Llo/y;->a:I

    :try_start_1
    invoke-virtual {v0}, Lko/m;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    sget v2, Llo/y;->a:I

    :try_start_2
    invoke-virtual {v0}, Lko/m;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    throw v1
.end method

.method public final c()V
    .locals 0

    return-void
.end method

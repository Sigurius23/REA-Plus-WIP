.class public final Lp9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/i;


# instance fields
.field public final E:Lp9/m;

.field public volatile F:Ljava/lang/Object;

.field public final w:J

.field public final x:Lz8/g;

.field public final y:I

.field public final z:Lz8/m;


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;ILp9/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz8/m;

    invoke-direct {v0, p1}, Lz8/m;-><init>(Lz8/f;)V

    iput-object v0, p0, Lp9/n;->z:Lz8/m;

    iput-object p2, p0, Lp9/n;->x:Lz8/g;

    iput p3, p0, Lp9/n;->y:I

    iput-object p4, p0, Lp9/n;->E:Lp9/m;

    sget-object p1, Ll9/t;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p1

    iput-wide p1, p0, Lp9/n;->w:J

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lp9/n;->z:Lz8/m;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lz8/m;->x:J

    new-instance v0, Lko/m;

    iget-object v1, p0, Lp9/n;->z:Lz8/m;

    iget-object v2, p0, Lp9/n;->x:Lz8/g;

    invoke-direct {v0, v1, v2}, Lko/m;-><init>(Lz8/f;Lz8/g;)V

    :try_start_0
    iget-object v1, v0, Lko/m;->E:Ljava/lang/Object;

    check-cast v1, Lz8/f;

    iget-object v2, v0, Lko/m;->F:Ljava/lang/Object;

    check-cast v2, Lz8/g;

    invoke-interface {v1, v2}, Lz8/f;->open(Lz8/g;)J

    const/4 v1, 0x1

    iput-boolean v1, v0, Lko/m;->y:Z

    iget-object v1, p0, Lp9/n;->z:Lz8/m;

    iget-object v1, v1, Lz8/m;->w:Lz8/f;

    invoke-interface {v1}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp9/n;->E:Lp9/m;

    invoke-interface {v2, v1, v0}, Lp9/m;->c(Landroid/net/Uri;Lko/m;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lp9/n;->F:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v1, Lx8/t;->a:I

    :try_start_1
    invoke-virtual {v0}, Lko/m;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    sget v2, Lx8/t;->a:I

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

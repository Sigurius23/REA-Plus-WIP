.class public final Lce3/x;
.super Lne3/d;
.source "SourceFile"


# instance fields
.field public final synthetic n:Lce3/y;


# direct methods
.method public constructor <init>(Lce3/y;)V
    .locals 0

    iput-object p1, p0, Lce3/x;->n:Lce3/y;

    invoke-direct {p0}, Lne3/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final k()V
    .locals 10

    iget-object v0, p0, Lce3/x;->n:Lce3/y;

    sget-object v1, Lce3/a;->H:Lce3/a;

    invoke-virtual {v0, v1}, Lce3/y;->f(Lce3/a;)V

    iget-object v0, p0, Lce3/x;->n:Lce3/y;

    iget-object v1, v0, Lce3/y;->x:Lce3/q;

    monitor-enter v1

    :try_start_0
    iget-wide v2, v1, Lce3/q;->O:J

    iget-wide v4, v1, Lce3/q;->N:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v4, v2

    :try_start_1
    iput-wide v4, v1, Lce3/q;->N:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    const v0, 0x3b9aca00

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, v1, Lce3/q;->P:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    iget-object v4, v1, Lce3/q;->H:Lyd3/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v1, Lce3/q;->y:Ljava/lang/String;

    const-string v3, " ping"

    invoke-static {v2, v3, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    new-instance v8, La1/j;

    const/16 v0, 0x10

    invoke-direct {v8, v1, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    const/4 v9, 0x6

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final l()V
    .locals 2

    invoke-virtual {p0}, Lne3/d;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

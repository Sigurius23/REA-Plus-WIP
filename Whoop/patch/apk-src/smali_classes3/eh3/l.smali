.class public final Leh3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic E:Lfh3/a;

.field public final synthetic F:Lxg3/j;

.field public final synthetic G:J

.field public w:J

.field public x:J

.field public y:J

.field public final synthetic z:Lbh3/a;


# direct methods
.method public constructor <init>(JJLbh3/a;Lfh3/a;Lxg3/j;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Leh3/l;->z:Lbh3/a;

    iput-object p6, p0, Leh3/l;->E:Lfh3/a;

    iput-object p7, p0, Leh3/l;->F:Lxg3/j;

    iput-wide p8, p0, Leh3/l;->G:J

    iput-wide p1, p0, Leh3/l;->x:J

    iput-wide p3, p0, Leh3/l;->y:J

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 13

    iget-object v0, p0, Leh3/l;->z:Lbh3/a;

    invoke-interface {v0}, Lbh3/a;->call()V

    iget-object v0, p0, Leh3/l;->E:Lfh3/a;

    invoke-virtual {v0}, Lfh3/a;->a()Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Leh3/l;->F:Lxg3/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sget-wide v5, Leh3/m;->a:J

    add-long v7, v3, v5

    iget-wide v9, p0, Leh3/l;->x:J

    cmp-long v1, v7, v9

    const-wide/16 v7, 0x1

    iget-wide v11, p0, Leh3/l;->G:J

    if-ltz v1, :cond_1

    add-long/2addr v9, v11

    add-long/2addr v9, v5

    cmp-long v1, v3, v9

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Leh3/l;->y:J

    iget-wide v9, p0, Leh3/l;->w:J

    add-long/2addr v9, v7

    iput-wide v9, p0, Leh3/l;->w:J

    mul-long/2addr v9, v11

    add-long/2addr v9, v5

    goto :goto_1

    :cond_1
    :goto_0
    add-long v9, v3, v11

    iget-wide v5, p0, Leh3/l;->w:J

    add-long/2addr v5, v7

    iput-wide v5, p0, Leh3/l;->w:J

    mul-long/2addr v11, v5

    sub-long v5, v9, v11

    iput-wide v5, p0, Leh3/l;->y:J

    :goto_1
    iput-wide v3, p0, Leh3/l;->x:J

    sub-long/2addr v9, v3

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, p0, v9, v10, v1}, Lxg3/j;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    move-result-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxg3/t;

    sget-object v3, Lfh3/b;->w:Lfh3/b;

    if-ne v2, v3, :cond_3

    invoke-interface {v1}, Lxg3/t;->b()V

    return-void

    :cond_3
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_4
    return-void
.end method

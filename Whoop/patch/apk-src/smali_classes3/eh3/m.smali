.class public abstract Leh3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v1, "rx.scheduler.drift-tolerance"

    const-wide/16 v2, 0xf

    invoke-static {v1, v2, v3}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Leh3/m;->a:J

    return-void
.end method

.method public static a(Lxg3/j;Lbh3/a;JJLjava/util/concurrent/TimeUnit;)Lfh3/a;
    .locals 15

    move-wide/from16 v0, p2

    move-wide/from16 v2, p4

    move-object/from16 v4, p6

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v13

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v6

    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    add-long v8, v2, v6

    new-instance v2, Lfh3/a;

    invoke-direct {v2}, Lfh3/a;-><init>()V

    new-instance v11, Lfh3/a;

    invoke-direct {v11}, Lfh3/a;-><init>()V

    invoke-virtual {v11, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    new-instance v5, Leh3/l;

    move-object v12, p0

    move-object/from16 v10, p1

    invoke-direct/range {v5 .. v14}, Leh3/l;-><init>(JJLbh3/a;Lfh3/a;Lxg3/j;J)V

    invoke-virtual {p0, v5, v0, v1, v4}, Lxg3/j;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    move-result-object p0

    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg3/t;

    sget-object v1, Lfh3/b;->w:Lfh3/b;

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, Lxg3/t;->b()V

    return-object v11

    :cond_1
    invoke-virtual {v2, v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v11
.end method

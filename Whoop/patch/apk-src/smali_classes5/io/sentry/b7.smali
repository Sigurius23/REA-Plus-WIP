.class public final Lio/sentry/b7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Ljava/lang/String;

.field public F:Ljava/lang/Boolean;

.field public G:Lio/sentry/a7;

.field public H:Ljava/lang/Long;

.field public I:Ljava/lang/Double;

.field public final J:Ljava/lang/String;

.field public K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public final O:Lio/sentry/util/a;

.field public P:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:Ljava/util/Date;

.field public x:Ljava/util/Date;

.field public final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/a7;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/b7;->O:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    iput-object p2, p0, Lio/sentry/b7;->w:Ljava/util/Date;

    iput-object p3, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p5, p0, Lio/sentry/b7;->z:Ljava/lang/String;

    iput-object p6, p0, Lio/sentry/b7;->E:Ljava/lang/String;

    iput-object p7, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    iput-object p8, p0, Lio/sentry/b7;->H:Ljava/lang/Long;

    iput-object p9, p0, Lio/sentry/b7;->I:Ljava/lang/Double;

    iput-object p10, p0, Lio/sentry/b7;->J:Ljava/lang/String;

    iput-object p11, p0, Lio/sentry/b7;->K:Ljava/lang/String;

    iput-object p12, p0, Lio/sentry/b7;->L:Ljava/lang/String;

    iput-object p13, p0, Lio/sentry/b7;->M:Ljava/lang/String;

    iput-object p14, p0, Lio/sentry/b7;->N:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/b7;
    .locals 15

    new-instance v0, Lio/sentry/b7;

    iget-object v1, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    iget-object v3, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    iget-object v2, p0, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    iget-object v7, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    iget-object v8, p0, Lio/sentry/b7;->H:Ljava/lang/Long;

    iget-object v9, p0, Lio/sentry/b7;->I:Ljava/lang/Double;

    iget-object v11, p0, Lio/sentry/b7;->K:Ljava/lang/String;

    iget-object v13, p0, Lio/sentry/b7;->M:Ljava/lang/String;

    iget-object v14, p0, Lio/sentry/b7;->N:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/b7;->w:Ljava/util/Date;

    iget-object v5, p0, Lio/sentry/b7;->z:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/b7;->E:Ljava/lang/String;

    iget-object v10, p0, Lio/sentry/b7;->J:Ljava/lang/String;

    iget-object v12, p0, Lio/sentry/b7;->L:Ljava/lang/String;

    invoke-direct/range {v0 .. v14}, Lio/sentry/b7;-><init>(Lio/sentry/a7;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Ljava/util/Date;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/b7;->O:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    iget-object v1, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    sget-object v2, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    if-ne v1, v2, :cond_0

    sget-object v1, Lio/sentry/a7;->Exited:Lio/sentry/a7;

    iput-object v1, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    goto :goto_1

    :cond_1
    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    :goto_1
    iget-object p1, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    iget-object p1, p0, Lio/sentry/b7;->w:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    long-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b7;->I:Ljava/lang/Double;

    iget-object p1, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-gez p1, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b7;->H:Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final c()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/sentry/b7;->w:Ljava/util/Date;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/b7;->a()Lio/sentry/b7;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lio/sentry/a7;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lio/sentry/b7;->O:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    :try_start_0
    iput-object p1, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    move p1, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iput-object p2, p0, Lio/sentry/b7;->K:Ljava/lang/String;

    move p1, v1

    :cond_1
    if-eqz p3, :cond_2

    iget-object p1, p0, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move p1, v1

    :cond_2
    if-eqz p4, :cond_3

    iput-object p4, p0, Lio/sentry/b7;->N:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move v1, p1

    :goto_1
    if-eqz v1, :cond_5

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-gez p3, :cond_4

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    :cond_4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b7;->H:Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    :cond_5
    :goto_4
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return v1
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "sid"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/b7;->z:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "did"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    const-string v0, "init"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_2
    const-string v0, "started"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->w:Ljava/util/Date;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "status"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->G:Lio/sentry/a7;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->H:Ljava/lang/Long;

    if-eqz v0, :cond_3

    const-string v0, "seq"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->H:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_3
    const-string v0, "errors"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->I:Ljava/lang/Double;

    if-eqz v0, :cond_4

    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->I:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    if-eqz v0, :cond_5

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->x:Ljava/util/Date;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/b7;->N:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "abnormal_mechanism"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->N:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_6
    const-string v0, "attrs"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "release"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->M:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->L:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v1, "environment"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/b7;->J:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v1, "ip_address"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/b7;->K:Ljava/lang/String;

    if-eqz v0, :cond_9

    const-string v0, "user_agent"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->K:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_9
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/b7;->P:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/b7;->P:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_a
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

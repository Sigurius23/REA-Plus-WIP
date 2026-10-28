.class public final synthetic Lio/sentry/android/replay/capture/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lio/sentry/android/replay/capture/o;

.field public final synthetic x:Lc4/q;

.field public final synthetic y:J

.field public final synthetic z:Lio/sentry/android/replay/w;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/o;Lc4/q;JLio/sentry/android/replay/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/android/replay/capture/o;

    iput-object p2, p0, Lio/sentry/android/replay/capture/m;->x:Lc4/q;

    iput-wide p3, p0, Lio/sentry/android/replay/capture/m;->y:J

    iput-object p5, p0, Lio/sentry/android/replay/capture/m;->z:Lio/sentry/android/replay/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/android/replay/capture/o;

    iget-object v2, v1, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    iget-object v11, v1, Lio/sentry/android/replay/capture/o;->r:Lio/sentry/q6;

    if-eqz v2, :cond_0

    iget-wide v3, v0, Lio/sentry/android/replay/capture/m;->y:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, v0, Lio/sentry/android/replay/capture/m;->x:Lc4/q;

    invoke-virtual {v4, v2, v3}, Lc4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, v1, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/b;

    sget-object v3, Lio/sentry/android/replay/capture/c;->q:[Lj93/z;

    const/4 v12, 0x1

    aget-object v3, v3, v12

    invoke-virtual {v2, v1, v3}, Lio/sentry/android/replay/capture/b;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Date;

    const/4 v13, 0x0

    if-nez v4, :cond_1

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Segment timestamp is not set, not recording frame"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, v1, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Not capturing segment, because the app is terminating, will be captured on next launch"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object v2, v0, Lio/sentry/android/replay/capture/m;->z:Lio/sentry/android/replay/w;

    if-nez v2, :cond_3

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Recorder config is not set, not capturing a segment"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v3, v1, Lio/sentry/android/replay/capture/o;->t:Lio/sentry/transport/f;

    invoke-interface {v3}, Lio/sentry/transport/f;->c()J

    move-result-wide v14

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long v5, v14, v5

    invoke-virtual {v11}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    iget-wide v7, v3, Lio/sentry/u6;->j:J

    cmp-long v3, v5, v7

    if-ltz v3, :cond_4

    invoke-virtual {v11}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    iget-wide v5, v3, Lio/sentry/u6;->j:J

    move-wide v6, v5

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v5

    move-wide v7, v6

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v6

    move-wide v8, v7

    iget v7, v2, Lio/sentry/android/replay/w;->b:I

    move-wide v9, v8

    iget v8, v2, Lio/sentry/android/replay/w;->a:I

    move-wide/from16 v16, v9

    iget v9, v2, Lio/sentry/android/replay/w;->e:I

    iget v10, v2, Lio/sentry/android/replay/w;->f:I

    move-wide/from16 v2, v16

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/c;->f(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/v;IIIII)Lio/sentry/android/replay/capture/k;

    move-result-object v2

    instance-of v3, v2, Lio/sentry/android/replay/capture/i;

    if-eqz v3, :cond_4

    check-cast v2, Lio/sentry/android/replay/capture/i;

    iget-object v3, v1, Lio/sentry/android/replay/capture/o;->s:Lio/sentry/d1;

    invoke-static {v2, v3}, Lio/sentry/android/replay/capture/i;->b(Lio/sentry/android/replay/capture/i;Lio/sentry/d1;)V

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v3

    add-int/2addr v3, v12

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/capture/c;->k(I)V

    iget-object v2, v2, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/s6;

    iget-object v2, v2, Lio/sentry/s6;->U:Ljava/util/Date;

    invoke-virtual {v1, v2}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    :cond_4
    iget-object v1, v1, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    sub-long/2addr v14, v1

    invoke-virtual {v11}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v1

    iget-wide v1, v1, Lio/sentry/u6;->k:J

    cmp-long v1, v14, v1

    if-ltz v1, :cond_5

    invoke-virtual {v11}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/v3;->stop()V

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "Session replay deadline exceeded (1h), stopping recording"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

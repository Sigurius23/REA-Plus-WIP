.class public final Lio/sentry/l7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/sentry/q6;


# direct methods
.method public constructor <init>(Lio/sentry/q6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/l7;->a:Lio/sentry/q6;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/y3;)Laa3/i1;
    .locals 11

    iget-object v3, p1, Lio/sentry/y3;->b:Ljava/lang/Double;

    iget-object v1, p1, Lio/sentry/y3;->a:Lio/sentry/m7;

    iget-object v0, v1, Lio/sentry/e7;->z:Laa3/i1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lts/o;->d(Laa3/i1;)Laa3/i1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v2, p0, Lio/sentry/l7;->a:Lio/sentry/q6;

    invoke-virtual {v2}, Lio/sentry/q6;->getProfilesSampler()Lio/sentry/m6;

    invoke-virtual {v2}, Lio/sentry/q6;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v5

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    cmpg-double v0, v7, v9

    if-ltz v0, :cond_1

    move v0, v6

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v2}, Lio/sentry/q6;->getTracesSampler()Lio/sentry/p6;

    move-result-object v0

    const/4 v8, 0x0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v2}, Lio/sentry/q6;->getTracesSampler()Lio/sentry/p6;

    move-result-object v0

    check-cast v0, Lxs/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lyq1/a;->a(Lio/sentry/y3;)Ljava/lang/Double;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v9, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v10, "Error in the \'TracesSamplerCallback\' callback."

    invoke-interface {v0, v9, v10, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v8

    :goto_1
    if-eqz p1, :cond_3

    new-instance v0, Laa3/i1;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    cmpg-double v1, v1, v8

    if-ltz v1, :cond_2

    move v4, v6

    :cond_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object v2, p1

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v0

    :cond_3
    move p1, v4

    move-object v4, v7

    iget-object v0, v1, Lio/sentry/m7;->R:Laa3/i1;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lts/o;->d(Laa3/i1;)Laa3/i1;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {v2}, Lio/sentry/q6;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2}, Lio/sentry/q6;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/backpressure/b;->a()I

    move-result v1

    int-to-double v1, v1

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    if-nez v0, :cond_5

    :goto_2
    move-object v2, v8

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    div-double/2addr v7, v1

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    goto :goto_2

    :goto_3
    if-eqz v2, :cond_7

    new-instance v0, Laa3/i1;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    cmpg-double v1, v7, v9

    if-ltz v1, :cond_6

    move p1, v6

    :cond_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct/range {v0 .. v5}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v0

    :cond_7
    new-instance v0, Laa3/i1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v4, v1

    invoke-direct/range {v0 .. v5}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v0
.end method

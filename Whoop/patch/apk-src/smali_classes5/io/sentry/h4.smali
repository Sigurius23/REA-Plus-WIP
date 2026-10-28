.class public final Lio/sentry/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/d1;


# instance fields
.field public final a:Lio/sentry/b1;

.field public final b:Lio/sentry/b1;

.field public final c:Lio/sentry/b1;

.field public final d:Lio/sentry/l;

.field public final e:Lio/sentry/k;

.field public final f:Lad3/z;


# direct methods
.method public constructor <init>(Lio/sentry/b1;Lio/sentry/b1;Lio/sentry/b1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/k;

    invoke-direct {v0, p3, p2, p1}, Lio/sentry/k;-><init>(Lio/sentry/b1;Lio/sentry/b1;Lio/sentry/b1;)V

    iput-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    iput-object p1, p0, Lio/sentry/h4;->a:Lio/sentry/b1;

    iput-object p2, p0, Lio/sentry/h4;->b:Lio/sentry/b1;

    iput-object p3, p0, Lio/sentry/h4;->c:Lio/sentry/b1;

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    const-string p2, "SentryOptions is required."

    invoke-static {p1, p2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getDsn()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/sentry/q6;->getDsn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lio/sentry/q6;->getCompositePerformanceCollector()Lio/sentry/l;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/h4;->d:Lio/sentry/l;

    new-instance p1, Lad3/z;

    const/16 p2, 0xf

    invoke-direct {p1, p0, p2}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/sentry/h4;->f:Lad3/z;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A()Lio/sentry/t0;
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->f:Lad3/z;

    return-object v0
.end method

.method public final B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/h4;->F(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;
    .locals 7

    iget-object v3, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    iget-object v0, p1, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    sget-object v6, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string p3, "Instance is disabled and this \'captureTransaction\' call is a no-op."

    new-array p4, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, p4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v6

    :cond_0
    iget-object v1, p1, Lio/sentry/protocol/d0;->R:Ljava/lang/Double;

    if-eqz v1, :cond_5

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v4, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {v4}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    iget-object v4, v4, Lio/sentry/e7;->z:Laa3/i1;

    :goto_0
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, v4, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Transaction %s was dropped due to sampling decision."

    invoke-interface {p2, p3, p4, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/backpressure/b;->a()I

    move-result p1

    if-lez p1, :cond_3

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->BACKPRESSURE:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/m;->Transaction:Lio/sentry/m;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p3, Lio/sentry/m;->Span:Lio/sentry/m;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, 0x1

    int-to-long v0, p4

    invoke-interface {p1, p2, p3, v0, v1}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    return-object v6

    :cond_3
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->SAMPLE_RATE:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/m;->Transaction:Lio/sentry/m;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p3, Lio/sentry/m;->Span:Lio/sentry/m;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, 0x1

    int-to-long v0, p4

    invoke-interface {p1, p2, p3, v0, v1}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    return-object v6

    :cond_4
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    :try_start_1
    invoke-interface/range {v0 .. v5}, Lio/sentry/g1;->f(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, p1

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Error while capturing transaction with id: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_5
    move-object v1, p1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    iget-object p3, v1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Transaction: %s is not finished and this \'captureTransaction\' call is a no-op."

    invoke-interface {p1, p2, p4, p3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v6
.end method

.method public final D(Ljava/lang/String;)Lio/sentry/d1;
    .locals 3

    new-instance p1, Lio/sentry/h4;

    iget-object v0, p0, Lio/sentry/h4;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->clone()Lio/sentry/b1;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/h4;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->clone()Lio/sentry/b1;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/h4;->c:Lio/sentry/b1;

    invoke-direct {p1, v0, v1, v2}, Lio/sentry/h4;-><init>(Lio/sentry/b1;Lio/sentry/b1;Lio/sentry/b1;)V

    return-object p1
.end method

.method public final E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 6

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Instance is disabled and this \'captureFeedback\' call is a no-op."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    iget-object v2, p1, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "captureFeedback called with empty message."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v2

    invoke-interface {v2, p1, v0}, Lio/sentry/g1;->h(Lio/sentry/protocol/j;Lio/sentry/b1;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error while capturing feedback: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, p1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final F(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;
    .locals 6

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v1

    iget-object v2, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string p3, "Instance is disabled and this \'captureException\' call is a no-op."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :try_start_0
    new-instance v1, Lio/sentry/e5;

    invoke-direct {v1, p1}, Lio/sentry/e5;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v1}, Lio/sentry/k;->L(Lio/sentry/e5;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p3, :cond_1

    :try_start_1
    invoke-interface {v2}, Lio/sentry/b1;->clone()Lio/sentry/b1;

    move-result-object v3

    invoke-interface {p3, v3}, Lio/sentry/e4;->h(Lio/sentry/b1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p3

    :try_start_2
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Error in the \'ScopeCallback\' callback."

    invoke-interface {v3, v4, v5, p3}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object v3, v2

    :goto_0
    invoke-virtual {v2}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object p3

    invoke-interface {p3, v1, v3, p2}, Lio/sentry/g1;->l(Lio/sentry/e5;Lio/sentry/b1;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p3

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error while capturing exception: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v1, p1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {v2, v0}, Lio/sentry/k;->O(Lio/sentry/protocol/v;)V

    return-object v0
.end method

.method public final a(Z)V
    .locals 9

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Instance is disabled and this \'close\' call is a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getIntegrations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/t1;

    instance-of v3, v2, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_1

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/Closeable;

    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v6, "Failed to close the integration {}."

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v5, v6, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_1
    move-exception p1

    goto/16 :goto_7

    :cond_2
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/b0;

    instance-of v3, v2, Ljava/io/Closeable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_3

    :try_start_3
    move-object v3, v2

    check-cast v3, Ljava/io/Closeable;

    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v3

    :try_start_4
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v6, "Failed to close the event processor {}."

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v5, v6, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string v2, "Error in the \'configureScope\' callback."

    iget-object v3, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    const-string v4, "Instance is disabled and this \'configureScope\' call is a no-op."

    if-nez v0, :cond_5

    :try_start_5
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :try_start_6
    invoke-virtual {v3, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    sget-object v0, Lio/sentry/g4;->ISOLATION:Lio/sentry/g4;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_3

    :cond_6
    :try_start_8
    invoke-virtual {v3, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->clear()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    :try_start_9
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/backpressure/b;->close()V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getTransactionProfiler()Lio/sentry/o1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/o1;->close()V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getContinuousProfiler()Lio/sentry/q0;

    move-result-object v0

    const/4 v5, 0x1

    invoke-interface {v0, v5}, Lio/sentry/q0;->a(Z)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getCompositePerformanceCollector()Lio/sentry/l;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/l;->close()V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object v0

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz p1, :cond_7

    :try_start_a
    new-instance v5, La8/c;

    const/16 v6, 0x1b

    invoke-direct {v5, v6, p0, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v5}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_4

    :catch_0
    move-exception v5

    :try_start_b
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v8, "Failed to submit executor service shutdown task during restart. Shutting down synchronously."

    invoke-interface {v6, v7, v8, v5}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v5

    invoke-interface {v0, v5, v6}, Lio/sentry/h1;->a(J)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v5

    invoke-interface {v0, v5, v6}, Lio/sentry/h1;->a(J)V

    :goto_4
    sget-object v0, Lio/sentry/g4;->CURRENT:Lio/sentry/g4;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_5

    :cond_8
    :try_start_c
    invoke-virtual {v3, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/g1;->a(Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    :try_start_d
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    sget-object v0, Lio/sentry/g4;->ISOLATION:Lio/sentry/g4;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_6

    :cond_9
    :try_start_e
    invoke-virtual {v3, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/g1;->a(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception v0

    :try_start_f
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    sget-object v0, Lio/sentry/g4;->GLOBAL:Lio/sentry/g4;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v4, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_8

    :cond_a
    :try_start_10
    invoke-virtual {v3, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/g1;->a(Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception p1

    :try_start_11
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    goto :goto_8

    :goto_7
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error while closing the Scopes."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_8
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Instance is disabled and this \'removeTag\' call is a no-op."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0, p1}, Lio/sentry/k;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "Instance is disabled and this \'setTag\' call is a no-op."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0, p1, p2}, Lio/sentry/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final clone()Lio/sentry/u0;
    .locals 4

    .line 2
    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Disabled Scopes cloned."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    new-instance v0, Lio/sentry/m0;

    const-string v1, "scopes clone"

    invoke-virtual {p0, v1}, Lio/sentry/h4;->D(Ljava/lang/String;)Lio/sentry/d1;

    move-result-object v1

    check-cast v1, Lio/sentry/h4;

    invoke-direct {v0, v1}, Lio/sentry/m0;-><init>(Lio/sentry/h4;)V

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/h4;->clone()Lio/sentry/u0;

    move-result-object v0

    return-object v0
.end method

.method public final d(J)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Instance is disabled and this \'flush\' call is a no-op."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/g1;->d(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Error in the \'client.flush\'."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'setUser\' call is a no-op."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0, p1}, Lio/sentry/k;->e(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'getSpan\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->f()Lio/sentry/l1;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/g1;->g()Z

    move-result v0

    return v0
.end method

.method public final h(Lio/sentry/e;)V
    .locals 1

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    invoke-virtual {p0, p1, v0}, Lio/sentry/h4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "Instance is disabled and this \'addBreadcrumb\' call is a no-op."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0, p1, p2}, Lio/sentry/k;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/g1;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final j()Lio/sentry/transport/q;
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/g1;->j()Lio/sentry/transport/q;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    iget-object v0, v0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'getTransaction\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->m()Lio/sentry/n1;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lio/sentry/p3;)Lio/sentry/protocol/v;
    .locals 6

    const-string v0, "profilingContinuousData is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'captureTransaction\' call is a no-op."

    invoke-interface {p1, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v1}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/sentry/g1;->n(Lio/sentry/p3;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error while capturing profile chunk with id: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, p1, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final o()V
    .locals 4

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'endSession\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->o()Lio/sentry/b7;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lg73/d;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lg73/d;-><init>(I)V

    invoke-static {v2}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v2

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lio/sentry/g1;->i(Lio/sentry/b7;Lio/sentry/g0;)V

    :cond_1
    return-void
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/k;->p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V

    return-void
.end method

.method public final q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 3

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'captureEnvelope\' call is a no-op."

    invoke-interface {p1, p2, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v1}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lio/sentry/g1;->q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error while capturing envelope."

    invoke-interface {p2, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/h4;->F(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lio/sentry/e4;)V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'configureScope\' call is a no-op."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/sentry/e4;->h(Lio/sentry/b1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error in the \'configureScope\' callback."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 3

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'captureReplay\' call is a no-op."

    invoke-interface {p1, p2, v2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v2

    invoke-interface {v2, p1, v0, p2}, Lio/sentry/g1;->c(Lio/sentry/s6;Lio/sentry/b1;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error while capturing replay"

    invoke-interface {p2, v0, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final u()V
    .locals 5

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Instance is disabled and this \'startSession\' call is a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->u()Lwe/o;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b7;

    if-eqz v1, :cond_1

    new-instance v3, Lg73/d;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lg73/d;-><init>(I)V

    invoke-static {v3}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v3

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v4

    invoke-interface {v4, v1, v3}, Lio/sentry/g1;->i(Lio/sentry/b7;Lio/sentry/g0;)V

    :cond_1
    new-instance v1, Lio/sentry/hints/j;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lio/sentry/hints/j;-><init>(I)V

    invoke-static {v1}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v0

    iget-object v2, v2, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/b7;

    invoke-interface {v0, v2, v1}, Lio/sentry/g1;->i(Lio/sentry/b7;Lio/sentry/g0;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Session could not be started."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 5

    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "Instance is disabled and this \'captureEvent\' call is a no-op."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "captureEvent called with null parameter."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :try_start_0
    invoke-virtual {v0, p1}, Lio/sentry/k;->L(Lio/sentry/e5;)V

    invoke-virtual {v0}, Lio/sentry/k;->I()Lio/sentry/g1;

    move-result-object v2

    invoke-interface {v2, p1, v0, p2}, Lio/sentry/g1;->l(Lio/sentry/e5;Lio/sentry/b1;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/k;->O(Lio/sentry/protocol/v;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error while capturing event with id: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;
    .locals 6

    iget-object v0, p2, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    invoke-virtual {p0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    sget-object v2, Lio/sentry/g3;->a:Lio/sentry/g3;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Instance is disabled and this \'startTransaction\' returns a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getIgnoredSpanOrigins()Ljava/util/List;

    move-result-object v0

    iget-object v3, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    invoke-static {v3, v0}, Lio/sentry/util/l;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Returning no-op for span origin %s as the SDK has been configured to ignore it"

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getInstrumenter()Lio/sentry/s1;

    move-result-object v0

    iget-object v3, p1, Lio/sentry/e7;->L:Lio/sentry/s1;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/e7;->L:Lio/sentry/s1;

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->getInstrumenter()Lio/sentry/s1;

    move-result-object v3

    filled-new-array {p1, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s"

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "Tracing is disabled and this \'startTransaction\' returns a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v0, p1, Lio/sentry/e7;->M:Lio/sentry/c;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lio/sentry/h4;->e:Lio/sentry/k;

    invoke-virtual {v0}, Lio/sentry/k;->G()La3/p;

    move-result-object v0

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lio/sentry/c;

    iget-object v0, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-nez v0, :cond_5

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_1
    new-instance v1, Lio/sentry/y3;

    invoke-direct {v1, p1, v0}, Lio/sentry/y3;-><init>(Lio/sentry/m7;Ljava/lang/Double;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getInternalTracesSampler()Lio/sentry/l7;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/l7;->a(Lio/sentry/y3;)Laa3/i1;

    move-result-object v0

    iget-object v1, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/sentry/e7;->a(Laa3/i1;)V

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->getSpanFactory()Lio/sentry/m1;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->isContinuousProfilingEnabled()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->getProfileLifecycle()Lio/sentry/r3;

    move-result-object v3

    sget-object v4, Lio/sentry/r3;->TRACE:Lio/sentry/r3;

    if-ne v3, v4, :cond_6

    iget-object v3, p1, Lio/sentry/e7;->O:Lio/sentry/protocol/v;

    sget-object v5, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v3, v5}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->getContinuousProfiler()Lio/sentry/q0;

    move-result-object v3

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/q6;->getInternalTracesSampler()Lio/sentry/l7;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lio/sentry/q0;->b(Lio/sentry/r3;Lio/sentry/l7;)V

    :cond_6
    iget-object v3, p0, Lio/sentry/h4;->d:Lio/sentry/l;

    invoke-interface {v2, p1, p0, p2, v3}, Lio/sentry/m1;->a(Lio/sentry/m7;Lio/sentry/h4;Lio/sentry/n7;Lio/sentry/l;)Lio/sentry/n1;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, v0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getTransactionProfiler()Lio/sentry/o1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/o1;->isRunning()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {p1}, Lio/sentry/o1;->start()V

    invoke-interface {p1, v2}, Lio/sentry/o1;->a(Lio/sentry/n1;)V

    goto :goto_2

    :cond_7
    iget-boolean v0, p2, Lio/sentry/n7;->e:Z

    if-eqz v0, :cond_8

    invoke-interface {p1, v2}, Lio/sentry/o1;->a(Lio/sentry/n1;)V

    :cond_8
    :goto_2
    sget-object p1, Lio/sentry/d4;->ON:Lio/sentry/d4;

    iget-object p2, p2, Leh/a;->c:Ljava/io/Serializable;

    check-cast p2, Lio/sentry/d4;

    if-ne p1, p2, :cond_9

    invoke-interface {v2}, Lio/sentry/l1;->makeCurrent()V

    :cond_9
    return-object v2
.end method

.method public final y()Ljava/lang/Boolean;
    .locals 8

    sget-object v0, Lio/sentry/t4;->d:Lio/sentry/t4;

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->isEnableAutoSessionTracking()Z

    move-result v2

    iget-object v3, v0, Lio/sentry/t4;->c:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_0
    iget-boolean v4, v0, Lio/sentry/t4;->a:Z

    if-eqz v4, :cond_0

    iget-object v0, v0, Lio/sentry/t4;->b:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Lio/sentry/s;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    invoke-virtual {v3}, Lio/sentry/s;->close()V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v4, 0x1

    :try_start_1
    iput-boolean v4, v0, Lio/sentry/t4;->a:Z

    new-instance v5, Ljava/io/File;

    const-string v6, "last_crash"

    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    const-string v7, ".sentry-native/last_crash"

    invoke-direct {v6, v1, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v7, :cond_2

    :try_start_3
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :cond_2
    :try_start_4
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v5, :cond_3

    if-nez v2, :cond_4

    :try_start_5
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    :catchall_1
    :cond_3
    move v4, v1

    :catchall_2
    :cond_4
    :goto_0
    :try_start_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/t4;->b:Ljava/lang/Boolean;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v3}, Lio/sentry/s;->close()V

    iget-object v0, v0, Lio/sentry/t4;->b:Ljava/lang/Boolean;

    return-object v0

    :goto_1
    :try_start_7
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method

.method public final z()Lio/sentry/b1;
    .locals 1

    iget-object v0, p0, Lio/sentry/h4;->a:Lio/sentry/b1;

    return-object v0
.end method

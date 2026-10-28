.class public final Lcd3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd3/h;
.implements Lio/sentry/g1;
.implements Luo/b;


# instance fields
.field public E:Ljava/lang/Object;

.field public final F:Ljava/lang/Object;

.field public w:Z

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Laj/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcd3/g;->w:Z

    new-instance v0, Ljava/util/HashMap;

    .line 1
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    iput-object p1, p0, Lcd3/g;->F:Ljava/lang/Object;

    iput-object p2, p0, Lcd3/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 7

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lio/sentry/s4;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lcd3/g;->x:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcd3/g;->w:Z

    .line 25
    invoke-virtual {p1}, Lio/sentry/q6;->getTransportFactory()Lio/sentry/p1;

    move-result-object v0

    .line 26
    instance-of v1, v0, Lio/sentry/h3;

    if-eqz v1, :cond_0

    .line 27
    new-instance v0, Lio/sentry/p2;

    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/q6;->setTransportFactory(Lio/sentry/p1;)V

    .line 30
    :cond_0
    invoke-virtual {p1}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    move-result-object v1

    .line 31
    invoke-virtual {p1}, Lio/sentry/q6;->getSentryClientName()Ljava/lang/String;

    move-result-object v2

    .line 32
    iget-object v3, v1, Lio/sentry/y;->c:Ljava/net/URI;

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/envelope/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/net/URI;->resolve(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v3

    .line 34
    iget-object v4, v1, Lio/sentry/y;->b:Ljava/lang/String;

    .line 35
    iget-object v1, v1, Lio/sentry/y;->a:Ljava/lang/String;

    .line 36
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Sentry sentry_version=7,sentry_client="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ",sentry_key="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    const-string v4, ",sentry_secret="

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 38
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 39
    const-string v5, "User-Agent"

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    const-string v2, "X-Sentry-Auth"

    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, v3, v4}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 42
    invoke-interface {v0, p1, v1}, Lio/sentry/p1;->b(Lio/sentry/q6;Lcom/google/crypto/tink/internal/l0;)Lio/sentry/transport/g;

    move-result-object v0

    iput-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    .line 43
    invoke-virtual {p1}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v0

    .line 44
    iget-boolean v0, v0, Lio/sentry/i6;->a:Z

    if-eqz v0, :cond_2

    .line 45
    invoke-virtual {p1}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v0

    .line 46
    iget-object v0, v0, Lio/sentry/i6;->b:Lio/sentry/logger/b;

    .line 47
    invoke-interface {v0, p1, p0}, Lio/sentry/logger/b;->b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/logger/a;

    move-result-object v0

    iput-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    goto :goto_1

    .line 48
    :cond_2
    sget-object v0, Lio/sentry/logger/c;->w:Lio/sentry/logger/c;

    iput-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    .line 49
    :goto_1
    invoke-virtual {p1}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v0

    .line 50
    iget-boolean v0, v0, Lio/sentry/j6;->a:Z

    if-eqz v0, :cond_3

    .line 51
    invoke-virtual {p1}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v0

    .line 52
    iget-object v0, v0, Lio/sentry/j6;->b:Lio/sentry/metrics/b;

    .line 53
    invoke-interface {v0, p1, p0}, Lio/sentry/metrics/b;->b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/metrics/a;

    move-result-object p1

    iput-object p1, p0, Lcd3/g;->F:Ljava/lang/Object;

    return-void

    .line 54
    :cond_3
    sget-object p1, Lio/sentry/metrics/c;->w:Lio/sentry/metrics/c;

    iput-object p1, p0, Lcd3/g;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp0/n0;)V
    .locals 3

    const-string v0, "identityStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd3/g;->x:Ljava/lang/Object;

    .line 12
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    iput-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    .line 13
    new-instance v0, Lqk/a;

    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v2}, Lqk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iput-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    .line 17
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcd3/g;->F:Ljava/lang/Object;

    .line 18
    invoke-virtual {p1}, Lp0/n0;->g()Lqk/a;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lcd3/g;->I(Lqk/a;I)V

    return-void
.end method

.method public constructor <init>(Lto/f;Lcom/google/android/gms/common/api/d;Lto/a;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcd3/g;->F:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lcd3/g;->z:Ljava/lang/Object;

    iput-object p1, p0, Lcd3/g;->E:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcd3/g;->w:Z

    iput-object p2, p0, Lcd3/g;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcd3/g;->y:Ljava/lang/Object;

    return-void
.end method

.method public static x(Lio/sentry/g0;)Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/g0;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lio/sentry/g0;->d:Lio/sentry/a;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lio/sentry/g0;->e:Lio/sentry/a;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p0, p0, Lio/sentry/g0;->f:Lio/sentry/a;

    if-eqz p0, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method


# virtual methods
.method public A(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;
    .locals 7

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/b0;

    :try_start_0
    instance-of v2, v1, Lio/sentry/android/core/g0;

    const-class v3, Lio/sentry/hints/b;

    const-string v4, "sentry:typeCheckHint"

    invoke-virtual {p2, v4}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lio/sentry/android/core/g0;

    invoke-virtual {v2, p1, p2}, Lio/sentry/android/core/g0;->h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    if-nez v2, :cond_2

    invoke-interface {v1, p1, p2}, Lio/sentry/b0;->h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "An exception occurred while processing event by processor: %s"

    invoke-interface {v3, v4, v2, v6, v5}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Event was dropped by a processor: %s"

    invoke-interface {p2, p3, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v0, Lio/sentry/m;->Error:Lio/sentry/m;

    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    :cond_3
    return-object p1
.end method

.method public B(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;
    .locals 7

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/b0;

    :try_start_0
    invoke-interface {v1, p1, p2}, Lio/sentry/b0;->h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "An exception occurred while processing feedback event by processor: %s"

    invoke-interface {v3, v4, v2, v6, v5}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Feedback event was dropped by a processor: %s"

    invoke-interface {p2, p3, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v0, Lio/sentry/m;->Feedback:Lio/sentry/m;

    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    :cond_1
    return-object p1
.end method

.method public C(Lio/sentry/protocol/d0;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/protocol/d0;
    .locals 8

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/b0;

    iget-object v2, p1, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :try_start_0
    invoke-interface {v1, p1, p2}, Lio/sentry/b0;->i(Lio/sentry/protocol/d0;Lio/sentry/g0;)Lio/sentry/protocol/d0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "An exception occurred while processing transaction by processor: %s"

    invoke-interface {v4, v5, v3, v7, v6}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    if-nez p1, :cond_1

    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    iget-object v3, p1, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_2
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Transaction was dropped by a processor: %s"

    invoke-interface {p2, p3, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v1, Lio/sentry/m;->Transaction:Lio/sentry/m;

    invoke-interface {p2, p3, v1}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object v0, Lio/sentry/m;->Span:Lio/sentry/m;

    add-int/lit8 v2, v2, 0x1

    int-to-long v1, v2

    invoke-interface {p2, p3, v0, v1, v2}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    goto :goto_3

    :cond_2
    if-ge v3, v2, :cond_0

    sub-int/2addr v2, v3

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v5, "%d spans were dropped by a processor: %s"

    invoke-interface {v3, v4, v5, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object v1

    sget-object v3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v4, Lio/sentry/m;->Span:Lio/sentry/m;

    int-to-long v5, v2

    invoke-interface {v1, v3, v4, v5, v6}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    goto/16 :goto_0

    :cond_3
    :goto_3
    return-object p1
.end method

.method public D(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V
    .locals 3

    iget-object v0, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Default deserializers provider for "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is already registered: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public E(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V
    .locals 3

    iget-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Default serializers provider for "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is already registered: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public F(Lj93/d;Lj93/d;Lwc3/c;Z)V
    .locals 7

    invoke-interface {p3}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, Ljava/util/Map;

    iget-object v1, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v3, Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz p4, :cond_2

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    goto :goto_0

    :cond_2
    new-instance p3, Lcd3/e;

    invoke-direct {p3, p1, p2}, Lcd3/e;-><init>(Lj93/d;Lj93/d;)V

    throw p3

    :cond_3
    :goto_0
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    if-eqz v1, :cond_8

    invoke-virtual {v1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v4

    iget-object v4, v4, Lm83/r;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Ljava/util/Map$Entry;

    if-eqz v5, :cond_7

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj93/d;

    if-eqz v4, :cond_7

    if-eqz p4, :cond_6

    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc3/c;

    goto :goto_2

    :cond_6
    new-instance p4, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Multiple polymorphic serializers in a scope of \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' have the same serial name \'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\': "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for \'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' and "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Name "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is registered in the module but no Kotlin class is associated with it."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-interface {v2, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public G(Lj93/d;Lcd3/c;Z)V
    .locals 2

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-string v1, "forClass"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcd3/c;

    if-eqz p3, :cond_1

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lcd3/e;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Contextual serializer or serializer provider for "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already registered in this module"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcd3/e;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcd3/g;->w:Z

    :cond_2
    return-void
.end method

.method public H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 3

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/g;

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getBeforeEnvelopeCallback()Lio/sentry/c6;

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v2

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/sentry/l5;->c(Lio/sentry/v0;)Z

    if-nez p2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lio/sentry/g0;

    invoke-direct {p2}, Lio/sentry/g0;-><init>()V

    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->A(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->A(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)V

    :goto_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/w4;

    iget-object p1, p1, Lio/sentry/w4;->w:Lio/sentry/protocol/v;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public I(Lqk/a;I)V
    .locals 6

    const-string v0, "identity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateType"

    invoke-static {p2, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-virtual {p0}, Lcd3/g;->y()Lqk/a;

    move-result-object v0

    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_1

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    :try_start_0
    iput-object p1, p0, Lcd3/g;->z:Ljava/lang/Object;

    const/4 v5, 0x1

    if-ne p2, v5, :cond_2

    iput-boolean v5, p0, Lcd3/g;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    :goto_2
    if-ge v4, v3, :cond_3

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    invoke-virtual {p1, v0}, Lqk/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcd3/g;->E:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v2, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashSet;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    if-eq p2, v5, :cond_5

    iget-object v1, p1, Lqk/a;->a:Ljava/lang/String;

    iget-object v3, v0, Lqk/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Lp0/n0;

    iget-object v3, p1, Lqk/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lp0/n0;->k(Ljava/lang/String;)V

    :cond_4
    iget-object v1, p1, Lqk/a;->b:Ljava/lang/String;

    iget-object v3, v0, Lqk/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Lp0/n0;

    iget-object v3, p1, Lqk/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lp0/n0;->j(Ljava/lang/String;)V

    :cond_5
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnk/a;

    iget-object v3, p1, Lqk/a;->a:Ljava/lang/String;

    iget-object v4, v0, Lqk/a;->a:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v3, p1, Lqk/a;->a:Ljava/lang/String;

    iget-object v4, v2, Lnk/a;->a:La3/p;

    invoke-virtual {v4, v3}, La3/p;->W(Ljava/lang/String;)V

    :cond_7
    iget-object v3, p1, Lqk/a;->b:Ljava/lang/String;

    iget-object v4, v0, Lqk/a;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p1, Lqk/a;->b:Ljava/lang/String;

    iget-object v4, v2, Lnk/a;->a:La3/p;

    invoke-virtual {v4, v3}, La3/p;->R(Ljava/lang/String;)V

    :cond_8
    iget-object v2, v2, Lnk/a;->a:La3/p;

    const-string v3, "updateType"

    invoke-static {p2, v3}, Lih0/d0;->w(ILjava/lang/String;)V

    if-ne p2, v5, :cond_6

    iget-object v3, p1, Lqk/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, La3/p;->W(Ljava/lang/String;)V

    iget-object v3, p1, Lqk/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, La3/p;->R(Ljava/lang/String;)V

    goto :goto_3

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_9
    return-void

    :goto_4
    if-ge v4, v3, :cond_a

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public J(Lio/sentry/r4;Lio/sentry/g0;)Z
    .locals 2

    invoke-static {p2}, Lhg3/i;->k0(Lio/sentry/g0;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Event was cached so not applying scope: %s"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public K(Lcom/google/android/gms/common/a;)V
    .locals 2

    iget-object v0, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v0, Lto/f;

    iget-object v0, v0, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Lto/a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lto/v;->k(Lcom/google/android/gms/common/a;)V

    :cond_0
    return-void
.end method

.method public L(Lnp/j;Lto/k;Ltp/t;)V
    .locals 10

    iget-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lnp/i;

    invoke-virtual {v0}, Luo/c;->c()V

    invoke-virtual {p2}, Lto/k;->a()Lto/j;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p2, 0x0

    :goto_0
    move-object v8, p2

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnp/f;

    if-nez v2, :cond_1

    new-instance v2, Lnp/f;

    invoke-direct {v2, p2}, Lnp/f;-><init>(Lto/k;)V

    :cond_1
    move-object p2, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :goto_1
    iget-object v2, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    if-nez v8, :cond_2

    return-void

    :cond_2
    iget-object p2, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p2, Laj/c;

    invoke-virtual {p2}, Laj/c;->a0()Lnp/e;

    move-result-object p2

    new-instance v3, Lnp/k;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    move-object v5, p1

    move-object v9, p3

    invoke-direct/range {v3 .. v9}, Lnp/k;-><init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-virtual {p2, v3}, Lnp/e;->j0(Lnp/k;)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public M()V
    .locals 5

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/HashMap;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnp/f;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v3, Laj/c;

    invoke-virtual {v3}, Laj/c;->a0()Lnp/e;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lnp/k;->f(Lnp/f;Ltp/s;)Lnp/k;

    move-result-object v2

    invoke-virtual {v3, v2}, Lnp/e;->j0(Lnp/k;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    iget-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :catchall_2
    move-exception v1

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v1

    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :goto_5
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public a(Z)V
    .locals 7

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "Closing SentryClient."

    invoke-interface {v1, v2, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p0, v1, v2}, Lcd3/g;->d(J)V

    iget-object v1, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v1, Lio/sentry/logger/a;

    invoke-interface {v1, p1}, Lio/sentry/logger/a;->a(Z)V

    iget-object v1, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v1, Lio/sentry/metrics/a;

    invoke-interface {v1, p1}, Lio/sentry/metrics/a;->a(Z)V

    iget-object v1, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/g;

    invoke-interface {v1, p1}, Lio/sentry/transport/g;->a(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "Failed to close the connection to the Sentry Server."

    invoke-interface {v1, v2, v4, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {v0}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/b0;

    instance-of v2, v1, Ljava/io/Closeable;

    if-eqz v2, :cond_1

    :try_start_1
    move-object v2, v1

    check-cast v2, Ljava/io/Closeable;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v6, "Failed to close the event processor {}."

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v5, v6, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iput-boolean v3, p0, Lcd3/g;->w:Z

    return-void
.end method

.method public b(Lcom/google/android/gms/common/a;)V
    .locals 2

    new-instance v0, Lcq/m;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0, p1}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast p1, Lto/f;

    iget-object p1, p1, Lto/f;->N:Ljp/d;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(Lio/sentry/s6;Lio/sentry/b1;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 9

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {p0, p1, p3}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    iget-object v2, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    if-nez v1, :cond_0

    invoke-interface {p2}, Lio/sentry/b1;->d()Lio/sentry/protocol/q;

    move-result-object v1

    iput-object v1, p1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    :cond_0
    iget-object v1, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-nez v1, :cond_1

    invoke-interface {p2}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v1

    iput-object v1, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    :cond_1
    iget-object v1, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Lio/sentry/r4;->c(Ljava/util/HashMap;)V

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    iget-object v4, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v1, Lio/sentry/protocol/c;

    invoke-interface {p2}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object v3

    invoke-direct {v1, v3}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object v1, v1, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-interface {p2}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v1

    invoke-virtual {v2}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v3

    if-nez v3, :cond_8

    if-nez v1, :cond_7

    invoke-interface {p2}, Lio/sentry/b1;->G()La3/p;

    move-result-object v1

    invoke-static {v1}, Lio/sentry/m7;->b(La3/p;)Lio/sentry/m7;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    goto :goto_3

    :cond_7
    invoke-interface {v1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    :cond_8
    :goto_3
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v3, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing session replay: %s"

    invoke-interface {v1, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iget-object v2, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    if-eqz v2, :cond_9

    move-object v1, v2

    :cond_9
    invoke-virtual {v0}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/b0;

    :try_start_0
    invoke-interface {v3, p1, p3}, Lio/sentry/b0;->b(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/s6;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v4

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "An exception occurred while processing replay event by processor: %s"

    invoke-interface {v5, v6, v4, v8, v7}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_4
    if-nez p1, :cond_a

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v5, "Replay event was dropped by a processor: %s"

    invoke-interface {v2, v4, v5, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object v2

    sget-object v3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v4, Lio/sentry/m;->Replay:Lio/sentry/m;

    invoke-interface {v2, v3, v4}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    :cond_b
    if-eqz p1, :cond_c

    invoke-virtual {v0}, Lio/sentry/q6;->getBeforeSendReplay()Lio/sentry/e6;

    :cond_c
    if-nez p1, :cond_d

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_d
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {p0, p2, p3, p1, v2}, Lcd3/g;->z(Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/r4;Ljava/lang/String;)Lio/sentry/k7;

    move-result-object p2

    const-class v2, Lio/sentry/hints/b;

    const-string v3, "sentry:typeCheckHint"

    invoke-virtual {p3, v3}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p3, Lio/sentry/g0;->g:Lio/sentry/x3;

    invoke-virtual {p0, p1, v3, p2, v2}, Lcd3/g;->w(Lio/sentry/s6;Lio/sentry/x3;Lio/sentry/k7;Z)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    invoke-virtual {p3}, Lio/sentry/g0;->a()V

    iget-object p2, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast p2, Lio/sentry/transport/g;

    invoke-interface {p2, p1, p3}, Lio/sentry/transport/g;->A(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "Capturing event %s failed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p3, p1, v0, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    :goto_5
    return-object v1
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v0, Lio/sentry/logger/a;

    invoke-interface {v0, p1, p2}, Lio/sentry/logger/a;->d(J)V

    iget-object v0, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v0, Lio/sentry/metrics/a;

    invoke-interface {v0, p1, p2}, Lio/sentry/metrics/a;->d(J)V

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/g;

    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->d(J)V

    return-void
.end method

.method public e(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcd3/g;->E(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method

.method public f(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;
    .locals 12

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/q6;

    if-nez p4, :cond_0

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p4

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Lio/sentry/b1;->K()Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, Lio/sentry/g0;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v4, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Capturing transaction: %s"

    invoke-interface {v2, v3, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getIgnoredTransactions()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_7

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/e0;

    invoke-virtual {v5}, Lio/sentry/e0;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catchall_0
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/e0;

    :try_start_0
    invoke-virtual {v4, v3}, Lio/sentry/e0;->b(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_6

    :goto_1
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v0, p1, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Transaction was dropped as transaction name %s is ignored"

    invoke-interface {p2, p3, v2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v0, Lio/sentry/m;->Transaction:Lio/sentry/m;

    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p2

    sget-object v0, Lio/sentry/m;->Span:Lio/sentry/m;

    iget-object p1, p1, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    int-to-long v1, p1

    invoke-interface {p2, p3, v0, v1, v2}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_7
    :goto_2
    sget-object v2, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iget-object v3, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    move-object v3, v2

    :goto_3
    invoke-virtual {p0, p1, v0}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    invoke-virtual {p0, p1, p3}, Lcd3/g;->m(Lio/sentry/r4;Lio/sentry/b1;)V

    invoke-interface {p3}, Lio/sentry/b1;->P()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, v0, p3}, Lcd3/g;->C(Lio/sentry/protocol/d0;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/protocol/d0;

    move-result-object p1

    if-nez p1, :cond_9

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v6, "Transaction was dropped by applyScope"

    new-array v7, v5, [Ljava/lang/Object;

    invoke-interface {p3, v4, v6, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    if-eqz p1, :cond_a

    invoke-virtual {v1}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, v0, p3}, Lcd3/g;->C(Lio/sentry/protocol/d0;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/protocol/d0;

    move-result-object p1

    :cond_a
    move-object v7, p1

    if-nez v7, :cond_b

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string p3, "Transaction was dropped by Event processors."

    new-array v0, v5, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_b
    iget-object p1, v7, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-virtual {v1}, Lio/sentry/q6;->getBeforeSendTransaction()Lio/sentry/f6;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p1, p3, :cond_c

    sub-int/2addr p3, p1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%d spans were dropped by beforeSendTransaction."

    invoke-interface {p1, v2, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object v2, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    sget-object v4, Lio/sentry/m;->Span:Lio/sentry/m;

    int-to-long v5, p3

    invoke-interface {p1, v2, v4, v5, v6}, Lio/sentry/clientreport/g;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    :cond_c
    :try_start_1
    invoke-static {v0}, Lcd3/g;->x(Lio/sentry/g0;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/sentry/a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_d
    const/4 v9, 0x0

    move-object v6, p0

    move-object v10, p2

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Lcd3/g;->t(Lio/sentry/r4;Ljava/util/ArrayList;Lio/sentry/b7;Lio/sentry/k7;Lio/sentry/s3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    invoke-virtual {v0}, Lio/sentry/g0;->a()V

    if-eqz p1, :cond_e

    invoke-virtual {p0, p1, v0}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    :goto_5
    move-object p1, v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :goto_6
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v0, "Capturing transaction %s failed."

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p3, p1, v0, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v3, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    :cond_e
    :goto_7
    return-object v3
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/g;

    invoke-interface {v0}, Lio/sentry/transport/g;->g()Z

    move-result v0

    return v0
.end method

.method public h(Lio/sentry/protocol/j;Lio/sentry/b1;)Lio/sentry/protocol/v;
    .locals 12

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/q6;

    new-instance v0, Lio/sentry/e5;

    invoke-direct {v0}, Lio/sentry/e5;-><init>()V

    const-string v2, "feedback"

    iget-object v3, v0, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {v3, p1, v2}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v2, Lio/sentry/g0;

    invoke-direct {v2}, Lio/sentry/g0;-><init>()V

    iget-object v4, p1, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    if-nez v4, :cond_0

    invoke-interface {p2}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p1, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    :cond_0
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v6, v0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Capturing feedback: %s"

    invoke-interface {v4, v5, v7, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v2}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    iget-object v4, v0, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-nez v4, :cond_1

    invoke-interface {p2}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v4

    iput-object v4, v0, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    :cond_1
    iget-object v4, v0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v4}, Lio/sentry/r4;->c(Ljava/util/HashMap;)V

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    iget-object v7, v0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    iget-object v7, v0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v4, Lio/sentry/protocol/c;

    invoke-interface {p2}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object v6

    invoke-direct {v4, v6}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object v4, v4, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v7}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v6, v7}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-interface {p2}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v4

    invoke-virtual {v3}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v6

    if-nez v6, :cond_8

    if-nez v4, :cond_7

    invoke-interface {p2}, Lio/sentry/b1;->G()La3/p;

    move-result-object v4

    invoke-static {v4}, Lio/sentry/m7;->b(La3/p;)Lio/sentry/m7;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    goto :goto_3

    :cond_7
    invoke-interface {v4}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    :cond_8
    :goto_3
    invoke-interface {p2}, Lio/sentry/b1;->P()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v0, v2, v3}, Lcd3/g;->B(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "Feedback was dropped by applyScope"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_9
    invoke-virtual {v1}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v0, v2, v3}, Lcd3/g;->B(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v1}, Lio/sentry/q6;->getBeforeSendFeedback()Lio/sentry/d6;

    move-result-object v3

    if-eqz v3, :cond_a

    :try_start_0
    check-cast v3, Lvd1/c;

    iget-object v3, v3, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v3, Lyq1/a;

    invoke-static {v3, v0, v2}, Lyq1/a;->c(Lyq1/a;Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "The BeforeSendFeedback callback threw an exception."

    invoke-interface {v3, v4, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :cond_a
    :goto_4
    if-nez v0, :cond_b

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v6, "Event was dropped by beforeSend"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v3, v4, v6, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object v3

    sget-object v4, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    sget-object v5, Lio/sentry/m;->Feedback:Lio/sentry/m;

    invoke-interface {v3, v4, v5}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    :cond_b
    move-object v7, v0

    if-nez v7, :cond_c

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_c
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iget-object v3, v7, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    if-eqz v3, :cond_d

    goto :goto_5

    :cond_d
    move-object v3, v0

    :goto_5
    iget-object v4, p1, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    if-nez v4, :cond_e

    invoke-virtual {v1}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v5}, Lio/sentry/v3;->i(Ljava/lang/Boolean;)V

    invoke-interface {p2}, Lio/sentry/b1;->s()Lio/sentry/protocol/v;

    move-result-object v4

    invoke-virtual {v4, v0}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    iput-object v4, p1, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    :cond_e
    :try_start_1
    iget-object p1, v7, Lio/sentry/e5;->V:Ljava/lang/String;

    invoke-virtual {p0, p2, v2, v7, p1}, Lcd3/g;->z(Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/r4;Ljava/lang/String;)Lio/sentry/k7;

    move-result-object v10

    invoke-static {v2}, Lcd3/g;->x(Lio/sentry/g0;)Ljava/util/ArrayList;

    move-result-object v8
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v6, p0

    :try_start_2
    invoke-virtual/range {v6 .. v11}, Lcd3/g;->t(Lio/sentry/r4;Ljava/util/ArrayList;Lio/sentry/b7;Lio/sentry/k7;Lio/sentry/s3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    invoke-virtual {v2}, Lio/sentry/g0;->a()V

    if-eqz p1, :cond_f

    invoke-virtual {p0, p1, v2}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    :goto_6
    move-object p1, v0

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    :goto_7
    move-object v6, p0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Capturing feedback %s failed."

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v0, p1, v1, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v3, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    :cond_f
    :goto_9
    return-object v3
.end method

.method public i(Lio/sentry/b7;Lio/sentry/g0;)V
    .locals 4

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    const-string v1, "Session is required."

    invoke-static {p1, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lio/sentry/b7;->M:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v2

    const-string v3, "Serializer is required."

    invoke-static {v1, v3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/google/crypto/tink/internal/l0;

    invoke-static {v1, p1}, Lio/sentry/c5;->d(Lio/sentry/j1;Lio/sentry/b7;)Lio/sentry/c5;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v3, v1, v2, p1}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/c5;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v3, p2}, Lcd3/g;->q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to capture session."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Sessions can\'t be captured without setting a release."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcd3/g;->w:Z

    return v0
.end method

.method public j()Lio/sentry/transport/q;
    .locals 1

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/g;

    invoke-interface {v0}, Lio/sentry/transport/g;->j()Lio/sentry/transport/q;

    move-result-object v0

    return-object v0
.end method

.method public k(Lj93/d;Lwc3/c;)V
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/a;

    invoke-direct {v0, p2}, Lcd3/a;-><init>(Lwc3/c;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcd3/g;->G(Lj93/d;Lcd3/c;Z)V

    return-void
.end method

.method public l(Lio/sentry/e5;Lio/sentry/b1;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 12

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/q6;

    const-string v0, "SentryEvent is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    new-instance p3, Lio/sentry/g0;

    invoke-direct {p3}, Lio/sentry/g0;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p3}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lio/sentry/b1;->K()Ljava/util/List;

    move-result-object v0

    iget-object v2, p3, Lio/sentry/g0;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v3, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing event: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/r4;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lio/sentry/q6;->getIgnoredExceptionsForType()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Event was dropped as the exception %s is ignored"

    invoke-interface {p1, v2, p3, p2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/m;->Error:Lio/sentry/m;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_2
    invoke-virtual {v1}, Lio/sentry/q6;->getIgnoredErrors()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Le4/a;->D(Ljava/util/List;Lio/sentry/e5;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    iget-object p1, p1, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p3, "Event was dropped as it matched a string/pattern in ignoredErrors"

    invoke-interface {p2, v2, p3, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/m;->Error:Lio/sentry/m;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_3
    invoke-virtual {p0, p1, p3}, Lcd3/g;->J(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_c

    if-eqz p2, :cond_b

    invoke-virtual {p0, p1, p2}, Lcd3/g;->m(Lio/sentry/r4;Lio/sentry/b1;)V

    iget-object v0, p1, Lio/sentry/e5;->V:Ljava/lang/String;

    iget-object v5, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    if-nez v0, :cond_4

    invoke-interface {p2}, Lio/sentry/b1;->D()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/e5;->V:Ljava/lang/String;

    :cond_4
    iget-object v0, p1, Lio/sentry/e5;->W:Ljava/util/List;

    if-nez v0, :cond_6

    invoke-interface {p2}, Lio/sentry/b1;->C()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_5
    move-object v6, v4

    :goto_0
    iput-object v6, p1, Lio/sentry/e5;->W:Ljava/util/List;

    :cond_6
    invoke-interface {p2}, Lio/sentry/b1;->getLevel()Lio/sentry/n5;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Lio/sentry/b1;->getLevel()Lio/sentry/n5;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/e5;->U:Lio/sentry/n5;

    :cond_7
    invoke-interface {p2}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v0

    invoke-virtual {v5}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v6

    if-nez v6, :cond_9

    if-nez v0, :cond_8

    invoke-interface {p2}, Lio/sentry/b1;->G()La3/p;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/m7;->b(La3/p;)Lio/sentry/m7;

    move-result-object v0

    invoke-virtual {v5, v0}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    goto :goto_1

    :cond_8
    invoke-interface {v0}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v0

    invoke-virtual {v5, v0}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    :cond_9
    :goto_1
    invoke-virtual {v5}, Lio/sentry/protocol/c;->f()Lio/sentry/protocol/i;

    move-result-object v0

    if-nez v0, :cond_a

    invoke-interface {p2}, Lio/sentry/b1;->r()Lio/sentry/protocol/i;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v5, v0}, Lio/sentry/protocol/c;->p(Lio/sentry/protocol/i;)V

    :cond_a
    invoke-interface {p2}, Lio/sentry/b1;->P()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lcd3/g;->A(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;

    move-result-object p1

    :cond_b
    if-nez p1, :cond_c

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const-string p2, "Event was dropped by applyScope"

    new-array p3, v3, [Ljava/lang/Object;

    invoke-interface {p1, v2, p2, p3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_c
    invoke-virtual {v1}, Lio/sentry/q6;->getEventProcessors()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lcd3/g;->A(Lio/sentry/e5;Lio/sentry/g0;Ljava/util/List;)Lio/sentry/e5;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {v1}, Lio/sentry/q6;->getBeforeSend()Lio/sentry/d6;

    move-result-object v0

    if-eqz v0, :cond_d

    :try_start_0
    check-cast v0, Lvd1/c;

    iget-object v0, v0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v0, Lyq1/a;

    invoke-static {v0, p1, p3}, Lyq1/a;->c(Lyq1/a;Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue."

    invoke-interface {v0, v2, v5, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v4

    :cond_d
    :goto_2
    if-nez p1, :cond_e

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Event was dropped by beforeSend"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-interface {v0, v2, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object v0

    sget-object v2, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    sget-object v5, Lio/sentry/m;->Error:Lio/sentry/m;

    invoke-interface {v0, v2, v5}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    :cond_e
    if-eqz p1, :cond_f

    invoke-static {p1, v1}, Lio/sentry/config/a;->O(Lio/sentry/e5;Lio/sentry/q6;)Lio/sentry/e5;

    :cond_f
    if-nez p1, :cond_10

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_10
    if-eqz p2, :cond_11

    new-instance v0, Li7/g;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Li7/g;-><init>(I)V

    invoke-interface {p2, v0}, Lio/sentry/b1;->w(Lio/sentry/a4;)Lio/sentry/b7;

    move-result-object v0

    goto :goto_3

    :cond_11
    move-object v0, v4

    :goto_3
    if-eqz v0, :cond_12

    iget-object v2, v0, Lio/sentry/b7;->G:Lio/sentry/a7;

    sget-object v5, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    if-eq v2, v5, :cond_12

    move-object v8, v4

    goto :goto_5

    :cond_12
    invoke-static {p3}, Lhg3/i;->k0(Lio/sentry/g0;)Z

    move-result v2

    if-eqz v2, :cond_14

    if-eqz p2, :cond_13

    new-instance v2, Lbc/i;

    const/4 v5, 0x6

    invoke-direct {v2, p0, p1, p3, v5}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p2, v2}, Lio/sentry/b1;->w(Lio/sentry/a4;)Lio/sentry/b7;

    move-result-object v2

    goto :goto_4

    :cond_13
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v5, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v6, "Scope is null on client.captureEvent"

    new-array v7, v3, [Ljava/lang/Object;

    invoke-interface {v2, v5, v6, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_14
    move-object v2, v4

    :goto_4
    move-object v8, v2

    :goto_5
    invoke-virtual {v1}, Lio/sentry/q6;->getSampleRate()Ljava/lang/Double;

    move-result-object v2

    if-nez v2, :cond_15

    move-object v2, v4

    goto :goto_6

    :cond_15
    invoke-static {}, Lio/sentry/util/k;->a()Lio/sentry/util/j;

    move-result-object v2

    :goto_6
    invoke-virtual {v1}, Lio/sentry/q6;->getSampleRate()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_17

    if-eqz v2, :cond_17

    invoke-virtual {v1}, Lio/sentry/q6;->getSampleRate()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v2}, Lio/sentry/util/j;->c()D

    move-result-wide v9

    cmpg-double v2, v5, v9

    if-ltz v2, :cond_16

    goto :goto_7

    :cond_16
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v6, "Event %s was dropped due to sampling decision."

    invoke-interface {v2, v5, v6, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object p1

    sget-object v2, Lio/sentry/clientreport/d;->SAMPLE_RATE:Lio/sentry/clientreport/d;

    sget-object v5, Lio/sentry/m;->Error:Lio/sentry/m;

    invoke-interface {p1, v2, v5}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/d;Lio/sentry/m;)V

    move-object v6, v4

    goto :goto_8

    :cond_17
    :goto_7
    move-object v6, p1

    :goto_8
    const/4 p1, 0x1

    if-nez v8, :cond_19

    :cond_18
    move v0, v3

    goto :goto_a

    :cond_19
    if-nez v0, :cond_1a

    :goto_9
    move v0, p1

    goto :goto_a

    :cond_1a
    iget-object v2, v8, Lio/sentry/b7;->G:Lio/sentry/a7;

    sget-object v5, Lio/sentry/a7;->Crashed:Lio/sentry/a7;

    if-ne v2, v5, :cond_1b

    iget-object v2, v0, Lio/sentry/b7;->G:Lio/sentry/a7;

    if-eq v2, v5, :cond_1b

    goto :goto_9

    :cond_1b
    iget-object v2, v8, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-lez v2, :cond_18

    iget-object v0, v0, Lio/sentry/b7;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_18

    goto :goto_9

    :goto_a
    if-nez v6, :cond_1c

    if-nez v0, :cond_1c

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string p3, "Not sending session update for dropped event as it did not cause the session health to change."

    new-array v0, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1

    :cond_1c
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    if-eqz v6, :cond_1d

    iget-object v2, v6, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    if-eqz v2, :cond_1d

    goto :goto_b

    :cond_1d
    move-object v2, v0

    :goto_b
    const-class v0, Lio/sentry/hints/b;

    const-string v11, "sentry:typeCheckHint"

    invoke-virtual {p3, v11}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    const-class v5, Lio/sentry/hints/d;

    invoke-virtual {p3, v11}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    const-class v5, Lio/sentry/android/core/p0;

    invoke-virtual {p3, v11}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    move v5, p1

    goto :goto_c

    :cond_1e
    move v5, v3

    :goto_c
    if-eqz v6, :cond_21

    if-nez v0, :cond_21

    if-nez v5, :cond_21

    invoke-virtual {v6}, Lio/sentry/e5;->g()Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v6}, Lio/sentry/e5;->f()Lio/sentry/protocol/u;

    move-result-object v0

    if-eqz v0, :cond_21

    :cond_1f
    invoke-virtual {v1}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v0

    invoke-virtual {v6}, Lio/sentry/e5;->f()Lio/sentry/protocol/u;

    move-result-object v5

    if-eqz v5, :cond_20

    goto :goto_d

    :cond_20
    move p1, v3

    :goto_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/sentry/v3;->i(Ljava/lang/Boolean;)V

    :cond_21
    if-eqz v6, :cond_22

    :try_start_1
    iget-object p1, v6, Lio/sentry/e5;->V:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_e

    :cond_22
    move-object p1, v4

    :goto_e
    :try_start_2
    invoke-virtual {p0, p2, p3, v6, p1}, Lcd3/g;->z(Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/r4;Ljava/lang/String;)Lio/sentry/k7;

    move-result-object v9
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_2 .. :try_end_2} :catch_4

    if-eqz v6, :cond_23

    :try_start_3
    invoke-static {p3}, Lcd3/g;->x(Lio/sentry/g0;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v7, p1

    goto :goto_10

    :catch_0
    move-exception v0

    :goto_f
    move-object p1, v0

    move-object v5, p0

    goto :goto_13

    :catch_1
    move-exception v0

    goto :goto_f

    :cond_23
    move-object v7, v4

    :goto_10
    const/4 v10, 0x0

    move-object v5, p0

    :try_start_4
    invoke-virtual/range {v5 .. v10}, Lcd3/g;->t(Lio/sentry/r4;Ljava/util/ArrayList;Lio/sentry/b7;Lio/sentry/k7;Lio/sentry/s3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    invoke-virtual {p3}, Lio/sentry/g0;->a()V

    if-eqz p1, :cond_24

    invoke-virtual {p0, p1, p3}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_14

    :catch_2
    move-exception v0

    :goto_11
    move-object p1, v0

    goto :goto_13

    :catch_3
    move-exception v0

    goto :goto_11

    :catch_4
    move-exception v0

    :goto_12
    move-object v5, p0

    goto :goto_11

    :catch_5
    move-exception v0

    goto :goto_12

    :goto_13
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v6, "Capturing event %s failed."

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, p1, v6, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v2, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    :cond_24
    :goto_14
    if-eqz p2, :cond_26

    invoke-interface {p2}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object p1

    if-eqz p1, :cond_26

    const-class p2, Lio/sentry/hints/l;

    invoke-virtual {p3, v11}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_26

    invoke-virtual {p3, v11}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lio/sentry/hints/c;

    if-eqz v0, :cond_25

    check-cast p2, Lio/sentry/hints/c;

    invoke-interface {p1}, Lio/sentry/n1;->h()Lio/sentry/protocol/v;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/sentry/hints/c;->g(Lio/sentry/protocol/v;)V

    sget-object p2, Lio/sentry/i7;->ABORTED:Lio/sentry/i7;

    invoke-interface {p1, p2, v3, p3}, Lio/sentry/n1;->f(Lio/sentry/i7;ZLio/sentry/g0;)V

    goto :goto_15

    :cond_25
    sget-object p2, Lio/sentry/i7;->ABORTED:Lio/sentry/i7;

    invoke-interface {p1, p2, v3, v4}, Lio/sentry/n1;->f(Lio/sentry/i7;ZLio/sentry/g0;)V

    :cond_26
    :goto_15
    return-object v2
.end method

.method public m(Lio/sentry/r4;Lio/sentry/b1;)V
    .locals 4

    if-eqz p2, :cond_b

    iget-object v0, p1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    if-nez v0, :cond_0

    invoke-interface {p2}, Lio/sentry/b1;->d()Lio/sentry/protocol/q;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    :cond_0
    iget-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-nez v0, :cond_1

    invoke-interface {p2}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    :cond_1
    iget-object v0, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v0}, Lio/sentry/r4;->c(Ljava/util/HashMap;)V

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    iget-object v0, p1, Lio/sentry/r4;->M:Ljava/util/List;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p1, Lio/sentry/r4;->M:Ljava/util/List;

    goto :goto_2

    :cond_5
    invoke-interface {p2}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/r4;->M:Ljava/util/List;

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v0, Lio/sentry/s4;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_6
    :goto_2
    iget-object v0, p1, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/b1;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v1, p1, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    goto :goto_4

    :cond_7
    invoke-interface {p2}, Lio/sentry/b1;->getExtras()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p1, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    :goto_4
    iget-object p1, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    new-instance v0, Lio/sentry/protocol/c;

    invoke-interface {p2}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object p2

    invoke-direct {v0, p2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object p2, v0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_5

    :cond_b
    return-void
.end method

.method public n(Lio/sentry/p3;)Lio/sentry/protocol/v;
    .locals 7

    const-string v0, "profileChunk is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v3, p1, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing profile chunk: %s"

    invoke-interface {v1, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p1, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    iget-object v2, p1, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    invoke-static {v2, v0}, Lio/sentry/protocol/d;->a(Lio/sentry/protocol/d;Lio/sentry/q6;)Lio/sentry/protocol/d;

    move-result-object v2

    if-eqz v2, :cond_0

    iput-object v2, p1, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    :cond_0
    :try_start_0
    new-instance v2, Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Lio/sentry/w4;

    invoke-virtual {v0}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v4

    invoke-virtual {v0}, Lio/sentry/q6;->getProfilerConverter()Lio/sentry/a1;

    move-result-object v6

    invoke-static {p1, v4, v6}, Lio/sentry/c5;->c(Lio/sentry/p3;Lio/sentry/j1;Lio/sentry/a1;)Lio/sentry/c5;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v2, v3, p1}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    invoke-virtual {p0, v2, v5}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/SentryEnvelopeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Capturing profile chunk %s failed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, p1, v3, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public o(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/b;

    invoke-direct {v0, p2}, Lcd3/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcd3/g;->G(Lj93/d;Lcd3/c;Z)V

    return-void
.end method

.method public p(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcd3/g;->D(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method

.method public q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Lio/sentry/g0;->a()V

    invoke-virtual {p0, p1, p2}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to capture envelope."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public r()Lcd3/d;
    .locals 7

    new-instance v0, Lcd3/d;

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    iget-object v2, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    iget-object v3, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    iget-object v4, p0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    iget-object v5, p0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    iget-boolean v6, p0, Lcd3/g;->w:Z

    invoke-direct/range {v0 .. v6}, Lcd3/d;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V

    return-object v0
.end method

.method public s(Lj93/d;Lj93/d;Lwc3/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcd3/g;->F(Lj93/d;Lj93/d;Lwc3/c;Z)V

    return-void
.end method

.method public t(Lio/sentry/r4;Ljava/util/ArrayList;Lio/sentry/b7;Lio/sentry/k7;Lio/sentry/s3;)Lcom/google/crypto/tink/internal/l0;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p0

    move-object/from16 v7, p5

    iget-object v3, v2, Lcd3/g;->x:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Lio/sentry/q6;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v3

    sget-object v4, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    const-string v4, "ISerializer is required."

    invoke-static {v3, v4}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lwe/o;

    new-instance v5, Lcom/iterable/iterableapi/m1;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v3, v0}, Lcom/iterable/iterableapi/m1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v4, v5}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v12, Lio/sentry/d5;

    invoke-static {v0}, Lio/sentry/m5;->resolve(Ljava/lang/Object;)Lio/sentry/m5;

    move-result-object v13

    new-instance v14, Lio/sentry/z4;

    const/4 v3, 0x0

    invoke-direct {v14, v4, v3}, Lio/sentry/z4;-><init>(Lwe/o;I)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v15, "application/json"

    invoke-direct/range {v12 .. v17}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lio/sentry/c5;

    new-instance v5, Lio/sentry/z4;

    invoke-direct {v5, v4, v6}, Lio/sentry/z4;-><init>(Lwe/o;I)V

    invoke-direct {v3, v12, v5}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    goto :goto_0

    :cond_0
    move-object v0, v11

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v9}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v3

    invoke-static {v3, v1}, Lio/sentry/c5;->d(Lio/sentry/j1;Lio/sentry/b7;)Lio/sentry/c5;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v9}, Lio/sentry/q6;->getMaxTraceFileSize()J

    move-result-wide v5

    invoke-virtual {v9}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v8

    sget-object v1, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    iget-object v4, v7, Lio/sentry/s3;->w:Ljava/io/File;

    new-instance v1, Lwe/o;

    new-instance v3, Lio/sentry/y4;

    invoke-direct/range {v3 .. v8}, Lio/sentry/y4;-><init>(Ljava/io/File;JLio/sentry/s3;Lio/sentry/j1;)V

    invoke-direct {v1, v3}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v12, Lio/sentry/d5;

    sget-object v13, Lio/sentry/m5;->Profile:Lio/sentry/m5;

    new-instance v14, Lio/sentry/x4;

    const/4 v3, 0x4

    invoke-direct {v14, v1, v3}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const-string v15, "application-json"

    invoke-direct/range {v12 .. v17}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lio/sentry/c5;

    new-instance v4, Lio/sentry/x4;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v5}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-direct {v3, v12, v4}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_2

    new-instance v0, Lio/sentry/protocol/v;

    iget-object v1, v7, Lio/sentry/s3;->W:Ljava/lang/String;

    invoke-direct {v0, v1}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lio/sentry/a;

    invoke-virtual {v9}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v16

    invoke-virtual {v9}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v17

    invoke-virtual {v9}, Lio/sentry/q6;->getMaxAttachmentSize()J

    move-result-wide v14

    sget-object v3, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    new-instance v3, Lwe/o;

    new-instance v12, Lio/sentry/y4;

    invoke-direct/range {v12 .. v17}, Lio/sentry/y4;-><init>(Lio/sentry/a;JLio/sentry/j1;Lio/sentry/v0;)V

    invoke-direct {v3, v12}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v14, Lio/sentry/d5;

    sget-object v15, Lio/sentry/m5;->Attachment:Lio/sentry/m5;

    new-instance v4, Lio/sentry/x4;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v5}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-virtual {v13}, Lio/sentry/a;->e()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v13}, Lio/sentry/a;->f()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v13}, Lio/sentry/a;->d()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v16, v4

    invoke-direct/range {v14 .. v19}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lio/sentry/c5;

    new-instance v5, Lio/sentry/x4;

    const/4 v6, 0x3

    invoke-direct {v5, v3, v6}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-direct {v4, v14, v5}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Lio/sentry/w4;

    invoke-virtual {v9}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v3

    move-object/from16 v4, p4

    invoke-direct {v1, v0, v3, v4}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v0, v1, v10}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    return-object v0

    :cond_4
    return-object v11
.end method

.method public u(Lio/sentry/s5;)Lcom/google/crypto/tink/internal/l0;
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v2

    sget-object v3, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    const-string v3, "ISerializer is required."

    invoke-static {v2, v3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lwe/o;

    new-instance v4, Lcom/iterable/iterableapi/n1;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v2, p1}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v4}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v6, Lio/sentry/d5;

    sget-object v7, Lio/sentry/m5;->Log:Lio/sentry/m5;

    new-instance v8, Lio/sentry/x4;

    const/4 v2, 0x0

    invoke-direct {v8, v3, v2}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    iget-object p1, p1, Lio/sentry/s5;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-string v9, "application/vnd.sentry.items.log+json"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v13}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance p1, Lio/sentry/c5;

    new-instance v2, Lio/sentry/x4;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-direct {p1, v6, v2}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lio/sentry/w4;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v1

    invoke-direct {p1, v2, v1, v2}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, p1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    return-object v1
.end method

.method public v(Lio/sentry/w5;)Lcom/google/crypto/tink/internal/l0;
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v2

    sget-object v3, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    const-string v3, "ISerializer is required."

    invoke-static {v2, v3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lwe/o;

    new-instance v4, Lcom/iterable/iterableapi/n1;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v2, p1}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v4}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v6, Lio/sentry/d5;

    sget-object v7, Lio/sentry/m5;->TraceMetric:Lio/sentry/m5;

    new-instance v8, Lio/sentry/x4;

    const/4 v2, 0x6

    invoke-direct {v8, v3, v2}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    iget-object p1, p1, Lio/sentry/w5;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-string v9, "application/vnd.sentry.items.trace-metric+json"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v13}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance p1, Lio/sentry/c5;

    new-instance v2, Lio/sentry/x4;

    const/16 v4, 0xb

    invoke-direct {v2, v3, v4}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-direct {p1, v6, v2}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lio/sentry/w4;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v1

    invoke-direct {p1, v2, v1, v2}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, p1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    return-object v1
.end method

.method public w(Lio/sentry/s6;Lio/sentry/x3;Lio/sentry/k7;Z)Lcom/google/crypto/tink/internal/l0;
    .locals 17

    move-object/from16 v2, p1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v8, p0

    iget-object v0, v8, Lcd3/g;->x:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lio/sentry/q6;

    invoke-virtual {v9}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v1

    invoke-virtual {v9}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v0, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    iget-object v4, v2, Lio/sentry/s6;->P:Ljava/io/File;

    new-instance v10, Lwe/o;

    new-instance v0, Lio/sentry/a5;

    move-object/from16 v3, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lio/sentry/a5;-><init>(Lio/sentry/j1;Lio/sentry/s6;Lio/sentry/x3;Ljava/io/File;Lio/sentry/v0;Z)V

    invoke-direct {v10, v0}, Lwe/o;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v11, Lio/sentry/d5;

    sget-object v12, Lio/sentry/m5;->ReplayVideo:Lio/sentry/m5;

    new-instance v13, Lio/sentry/x4;

    const/16 v0, 0x9

    invoke-direct {v13, v10, v0}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/c5;

    new-instance v1, Lio/sentry/x4;

    const/16 v3, 0xa

    invoke-direct {v1, v10, v3}, Lio/sentry/x4;-><init>(Lwe/o;I)V

    invoke-direct {v0, v11, v1}, Lio/sentry/c5;-><init>(Lio/sentry/d5;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    new-instance v1, Lio/sentry/w4;

    invoke-virtual {v9}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/u6;->m:Lio/sentry/protocol/t;

    move-object/from16 v3, p3

    invoke-direct {v1, v0, v2, v3}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v0, v1, v7}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    return-object v0
.end method

.method public y()Lqk/a;
    .locals 2

    iget-object v0, p0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-object v1, p0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v1, Lqk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v1
.end method

.method public z(Lio/sentry/b1;Lio/sentry/g0;Lio/sentry/r4;Ljava/lang/String;)Lio/sentry/k7;
    .locals 4

    iget-object v0, p0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    const-string v1, "sentry:typeCheckHint"

    invoke-virtual {p2, v1}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-class v1, Lio/sentry/hints/b;

    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_4

    if-eqz p3, :cond_6

    new-instance p1, Lio/sentry/c;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/sentry/c;-><init>(Lio/sentry/v0;)V

    iget-object p2, p3, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {p2}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, v2, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v2}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v3, "sentry-trace_id"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/y;->b:Ljava/lang/String;

    const-string v3, "sentry-public_key"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p3, Lio/sentry/r4;->F:Ljava/lang/String;

    const-string v3, "sentry-release"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p3, Lio/sentry/r4;->G:Ljava/lang/String;

    const-string v2, "sentry-environment"

    invoke-virtual {p1, v2, p3}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getEffectiveOrgId()Ljava/lang/String;

    move-result-object p3

    const-string v0, "sentry-org_id"

    invoke-virtual {p1, v0, p3}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "sentry-transaction"

    invoke-virtual {p1, p3, p4}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p3, p1, Lio/sentry/c;->f:Z

    if-eqz p3, :cond_1

    iput-object v1, p1, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_1
    const-string p3, "sentry-sampled"

    invoke-virtual {p1, p3, v1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p3, p1, Lio/sentry/c;->f:Z

    if-eqz p3, :cond_2

    iput-object v1, p1, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    const-string p3, "replay_id"

    invoke-virtual {p2, p3}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v1}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "sentry-replay_id"

    invoke-virtual {p1, v0, p4}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p2, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p2, 0x0

    iput-boolean p2, p1, Lio/sentry/c;->f:Z

    invoke-virtual {p1}, Lio/sentry/c;->e()Lio/sentry/k7;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz p1, :cond_6

    invoke-interface {p1}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lio/sentry/l1;->j()Lio/sentry/k7;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p2, Lbu/d;

    const/4 p3, 0x6

    invoke-direct {p2, p3, p1, v0}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lio/sentry/b1;->M(Lio/sentry/z3;)La3/p;

    move-result-object p1

    iget-object p1, p1, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    invoke-virtual {p1}, Lio/sentry/c;->e()Lio/sentry/k7;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v1
.end method

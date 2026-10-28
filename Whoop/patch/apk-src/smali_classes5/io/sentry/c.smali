.class public final Lio/sentry/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Lae3/d;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lio/sentry/util/a;

.field public c:Ljava/lang/Double;

.field public d:Ljava/lang/Double;

.field public final e:Ljava/lang/String;

.field public f:Z

.field public final g:Z

.field public final h:Lio/sentry/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lae3/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lae3/d;-><init>(I)V

    sput-object v0, Lio/sentry/c;->i:Lae3/d;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v0;)V
    .locals 7

    .line 1
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lio/sentry/c;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLio/sentry/v0;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLio/sentry/v0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lio/sentry/util/a;

    .line 4
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 5
    iput-object v0, p0, Lio/sentry/c;->b:Lio/sentry/util/a;

    .line 6
    iput-object p1, p0, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    iput-object p2, p0, Lio/sentry/c;->c:Ljava/lang/Double;

    .line 8
    iput-object p3, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    .line 9
    iput-object p6, p0, Lio/sentry/c;->h:Lio/sentry/v0;

    .line 10
    iput-object p4, p0, Lio/sentry/c;->e:Ljava/lang/String;

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lio/sentry/c;->f:Z

    .line 12
    iput-boolean p5, p0, Lio/sentry/c;->g:Z

    return-void
.end method

.method public static b(Ljava/lang/Double;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lio/sentry/c;->i:Lae3/d;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DecimalFormat;

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lio/sentry/c;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final d(Lio/sentry/protocol/v;Lio/sentry/protocol/v;Lio/sentry/q6;Laa3/i1;Ljava/lang/String;Lio/sentry/protocol/g0;)V
    .locals 1

    invoke-virtual {p1}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "sentry-trace_id"

    invoke-virtual {p0, v0, p1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/y;->b:Ljava/lang/String;

    const-string v0, "sentry-public_key"

    invoke-virtual {p0, v0, p1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object p1

    const-string v0, "sentry-release"

    invoke-virtual {p0, v0, p1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object p1

    const-string v0, "sentry-environment"

    invoke-virtual {p0, v0, p1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p6, :cond_0

    sget-object v0, Lio/sentry/protocol/g0;->URL:Lio/sentry/protocol/g0;

    invoke-virtual {v0, p6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-nez p6, :cond_0

    goto :goto_0

    :cond_0
    move-object p5, p1

    :goto_0
    const-string p6, "sentry-transaction"

    invoke-virtual {p0, p6, p5}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    sget-object p5, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p5, p2}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_1

    invoke-virtual {p2}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p5, "sentry-replay_id"

    invoke-virtual {p0, p5, p2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p3}, Lio/sentry/q6;->getEffectiveOrgId()Ljava/lang/String;

    move-result-object p2

    const-string p3, "sentry-org_id"

    invoke-virtual {p0, p3, p2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p4, :cond_2

    move-object p2, p1

    goto :goto_1

    :cond_2
    iget-object p2, p4, Laa3/i1;->c:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Double;

    :goto_1
    iget-boolean p3, p0, Lio/sentry/c;->f:Z

    if-eqz p3, :cond_3

    iput-object p2, p0, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_3
    if-nez p4, :cond_4

    move-object p2, p1

    goto :goto_2

    :cond_4
    iget-object p2, p4, Laa3/i1;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Boolean;

    :goto_2
    if-nez p2, :cond_5

    move-object p2, p1

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_3
    const-string p3, "sentry-sampled"

    invoke-virtual {p0, p3, p2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p4, :cond_6

    goto :goto_4

    :cond_6
    iget-object p1, p4, Laa3/i1;->d:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Double;

    :goto_4
    iget-boolean p2, p0, Lio/sentry/c;->f:Z

    if-eqz p2, :cond_7

    iput-object p1, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_7
    return-void
.end method

.method public final e()Lio/sentry/k7;
    .locals 14

    const-string v0, "sentry-trace_id"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sentry-replay_id"

    invoke-virtual {p0, v1}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sentry-public_key"

    invoke-virtual {p0, v2}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-eqz v5, :cond_3

    new-instance v3, Lio/sentry/k7;

    new-instance v4, Lio/sentry/protocol/v;

    invoke-direct {v4, v0}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    const-string v0, "sentry-release"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "sentry-environment"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "sentry-user_id"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "sentry-transaction"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iget-object v0, p0, Lio/sentry/c;->c:Ljava/lang/Double;

    invoke-static {v0}, Lio/sentry/c;->b(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v10

    const-string v0, "sentry-sampled"

    invoke-virtual {p0, v0}, Lio/sentry/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v1, :cond_0

    :goto_0
    move-object v12, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lio/sentry/protocol/v;

    invoke-direct {v2, v1}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    invoke-static {v0}, Lio/sentry/c;->b(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {v3 .. v13}, Lio/sentry/k7;-><init>(Lio/sentry/protocol/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/v;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/c;->b:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v6, Lio/sentry/b;->a:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    if-eqz v4, :cond_1

    const-string v6, "sentry-"

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_3

    :cond_2
    invoke-virtual {v1}, Lio/sentry/s;->close()V

    iput-object v0, v3, Lio/sentry/k7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v3

    :goto_3
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2

    :cond_3
    return-object v2
.end method

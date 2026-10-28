.class public final Lio/sentry/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b0;
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Lio/sentry/q6;

.field public final x:Lbu/c;

.field public final y:Laj/c;

.field public volatile z:Lio/sentry/k0;


# direct methods
.method public constructor <init>(Lio/sentry/q6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    iput-object p1, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    new-instance v0, Laj/d;

    invoke-direct {v0, p1}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance p1, Laj/c;

    const/16 v1, 0xf

    invoke-direct {p1, v0, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/sentry/j2;->y:Laj/c;

    new-instance p1, Lbu/c;

    invoke-direct {p1, v0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/j2;->x:Lbu/c;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/s6;
    .locals 1

    iget-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "java"

    iput-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/sentry/j2;->m(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lio/sentry/j2;->k(Lio/sentry/r4;)V

    iget-object p2, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object p2

    iget-object p2, p2, Lio/sentry/u6;->m:Lio/sentry/protocol/t;

    if-eqz p2, :cond_1

    iput-object p2, p1, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    :cond_1
    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    invoke-virtual {v0}, Lio/sentry/k0;->a()V

    :cond_0
    return-void
.end method

.method public final h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 9

    iget-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "java"

    iput-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    :cond_0
    iget-object v2, p1, Lio/sentry/r4;->J:Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, -0x1

    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/ArrayDeque;

    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v6, 0x0

    iget-object v1, p0, Lio/sentry/j2;->y:Laj/c;

    invoke-virtual/range {v1 .. v6}, Laj/c;->D(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v0}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v1, p1, Lio/sentry/e5;->T:Laa3/u0;

    :cond_1
    iget-object v0, p1, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    iget-object v1, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-static {v0, v1}, Lio/sentry/protocol/d;->a(Lio/sentry/protocol/d;Lio/sentry/q6;)Lio/sentry/protocol/d;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p1, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    :cond_2
    invoke-virtual {v1}, Lio/sentry/q6;->getModulesLoader()Lio/sentry/internal/modules/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/internal/modules/a;->a()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lio/sentry/e5;->Y:Ljava/util/AbstractMap;

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v2, p1, Lio/sentry/e5;->Y:Ljava/util/AbstractMap;

    goto :goto_0

    :cond_4
    invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/sentry/j2;->m(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0, p1}, Lio/sentry/j2;->k(Lio/sentry/r4;)V

    invoke-virtual {p1}, Lio/sentry/e5;->e()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-virtual {p1}, Lio/sentry/e5;->d()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v4, v2

    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/u;

    iget-object v6, v5, Lio/sentry/protocol/u;->F:Lio/sentry/protocol/n;

    if-eqz v6, :cond_5

    iget-object v6, v5, Lio/sentry/protocol/u;->z:Ljava/lang/Long;

    if-eqz v6, :cond_5

    if-nez v4, :cond_6

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    iget-object v5, v5, Lio/sentry/protocol/u;->z:Ljava/lang/Long;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    move-object v4, v2

    :cond_8
    invoke-virtual {v1}, Lio/sentry/q6;->isAttachThreads()Z

    move-result v3

    const-string v5, "sentry:typeCheckHint"

    const/4 v6, 0x0

    iget-object v7, p0, Lio/sentry/j2;->x:Lbu/c;

    if-nez v3, :cond_b

    const-class v3, Lio/sentry/hints/a;

    invoke-virtual {p2, v5}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v1}, Lio/sentry/q6;->isAttachStacktrace()Z

    move-result v3

    if-eqz v3, :cond_d

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_a
    const-class v0, Lio/sentry/hints/d;

    invoke-virtual {p2, v5}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    invoke-virtual {v1}, Lio/sentry/q6;->isAttachStacktrace()Z

    move-result p2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v0, v2, v6, p2}, Lbu/c;->D(Ljava/util/Map;Ljava/util/ArrayList;ZZ)Ljava/util/ArrayList;

    move-result-object p2

    new-instance v0, Laa3/u0;

    invoke-direct {v0, p2}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v0, p1, Lio/sentry/e5;->S:Laa3/u0;

    return-object p1

    :cond_b
    :goto_2
    invoke-virtual {p2, v5}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1}, Lio/sentry/q6;->isAttachStacktrace()Z

    move-result v0

    instance-of v1, p2, Lio/sentry/hints/a;

    if-eqz v1, :cond_c

    check-cast p2, Lio/sentry/hints/a;

    invoke-interface {p2}, Lio/sentry/hints/a;->c()Z

    move-result v6

    const/4 v0, 0x1

    :cond_c
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v7, p2, v4, v6, v0}, Lbu/c;->D(Ljava/util/Map;Ljava/util/ArrayList;ZZ)Ljava/util/ArrayList;

    move-result-object p2

    new-instance v0, Laa3/u0;

    invoke-direct {v0, p2}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v0, p1, Lio/sentry/e5;->S:Laa3/u0;

    :cond_d
    return-object p1
.end method

.method public final i(Lio/sentry/protocol/d0;Lio/sentry/g0;)Lio/sentry/protocol/d0;
    .locals 2

    iget-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "java"

    iput-object v0, p1, Lio/sentry/r4;->H:Ljava/lang/String;

    :cond_0
    iget-object v0, p1, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    iget-object v1, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-static {v0, v1}, Lio/sentry/protocol/d;->a(Lio/sentry/protocol/d;Lio/sentry/q6;)Lio/sentry/protocol/d;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v0, p1, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/sentry/j2;->m(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lio/sentry/j2;->k(Lio/sentry/r4;)V

    :cond_2
    return-object p1
.end method

.method public final k(Lio/sentry/r4;)V
    .locals 4

    iget-object v0, p1, Lio/sentry/r4;->F:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->F:Ljava/lang/String;

    :cond_0
    iget-object v0, p1, Lio/sentry/r4;->G:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->G:Ljava/lang/String;

    :cond_1
    iget-object v0, p1, Lio/sentry/r4;->K:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getServerName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->K:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->isAttachServerName()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lio/sentry/r4;->K:Ljava/lang/String;

    if-nez v0, :cond_4

    iget-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    if-nez v0, :cond_3

    invoke-static {}, Lio/sentry/k0;->c()Lio/sentry/k0;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    :cond_3
    iget-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/sentry/j2;->z:Lio/sentry/k0;

    invoke-virtual {v0}, Lio/sentry/k0;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->K:Ljava/lang/String;

    :cond_4
    iget-object v0, p1, Lio/sentry/r4;->L:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getDist()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->L:Ljava/lang/String;

    :cond_5
    iget-object v0, p1, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    if-nez v0, :cond_6

    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    :cond_6
    iget-object v0, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    iget-object v1, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-nez v1, :cond_7

    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {v0}, Lio/sentry/q6;->getTags()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Lio/sentry/r4;->c(Ljava/util/HashMap;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Lio/sentry/q6;->getTags()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p1, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lio/sentry/r4;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    :goto_1
    iget-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-nez v0, :cond_a

    new-instance v0, Lio/sentry/protocol/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    :cond_a
    iget-object p1, v0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    if-nez p1, :cond_b

    iget-object p1, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->isSendDefaultPii()Z

    move-result p1

    if-eqz p1, :cond_b

    const-string p1, "{{auto}}"

    iput-object p1, v0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    :cond_b
    return-void
.end method

.method public final m(Lio/sentry/r4;Lio/sentry/g0;)Z
    .locals 2

    invoke-static {p2}, Lhg3/i;->k0(Lio/sentry/g0;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Lio/sentry/j2;->w:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Event was cached so not applying data relevant to the current app execution/version: %s"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

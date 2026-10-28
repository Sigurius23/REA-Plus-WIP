.class public final Lio/sentry/rrweb/a;
.super Lio/sentry/rrweb/b;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/String;

.field public H:Lio/sentry/n5;

.field public I:Ljava/util/concurrent/ConcurrentHashMap;

.field public J:Ljava/util/HashMap;

.field public K:Ljava/util/concurrent/ConcurrentHashMap;

.field public L:Ljava/util/concurrent/ConcurrentHashMap;

.field public y:Ljava/lang/String;

.field public z:D


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {p0, v0}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    const-string v0, "breadcrumb"

    iput-object v0, p0, Lio/sentry/rrweb/a;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-static {p0, p1, p2}, Ldc/a;->N(Lio/sentry/rrweb/b;Lwe/o;Lio/sentry/v0;)V

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v1, "tag"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->y:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v1, "payload"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->E:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "type"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->E:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    const-string v1, "timestamp"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v1, p0, Lio/sentry/rrweb/a;->z:D

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->F:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, "category"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->F:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v1, p0, Lio/sentry/rrweb/a;->G:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, "message"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->G:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v1, p0, Lio/sentry/rrweb/a;->H:Lio/sentry/n5;

    if-eqz v1, :cond_3

    const-string v1, "level"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/rrweb/a;->H:Lio/sentry/n5;

    invoke-virtual {p1, p2, v1}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v1, p0, Lio/sentry/rrweb/a;->I:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/a;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/rrweb/a;->K:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/a;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/a;->L:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/a;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/a;->J:Ljava/util/HashMap;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/a;->J:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.class public final Lio/sentry/protocol/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/util/concurrent/ConcurrentHashMap;

.field public G:Ljava/util/concurrent/ConcurrentHashMap;

.field public H:Ljava/lang/Long;

.field public I:Ljava/util/concurrent/ConcurrentHashMap;

.field public J:Ljava/lang/String;

.field public K:Ljava/lang/String;

.field public L:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/Object;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lio/sentry/protocol/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lio/sentry/protocol/q;

    iget-object v0, p0, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    iget-object v1, p1, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    invoke-static {v0, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 9

    iget-object v0, p0, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    iget-object v4, p0, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v5, p0, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v6, p0, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    iget-object v7, p0, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    iget-object v8, p0, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "method"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "query_string"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/q;->z:Ljava/lang/Object;

    if-eqz v0, :cond_3

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->z:Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "cookies"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_5

    const-string v0, "headers"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_6

    const-string v0, "env"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/q;->I:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_7

    const-string v0, "other"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "fragment"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    if-eqz v0, :cond_9

    const-string v0, "body_size"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v0, "api_target"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_a
    iget-object v0, p0, Lio/sentry/protocol/q;->L:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_b

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/q;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_b
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

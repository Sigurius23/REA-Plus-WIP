.class public final Lio/sentry/protocol/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Lio/sentry/protocol/k;

.field public G:Ljava/util/concurrent/ConcurrentHashMap;

.field public H:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lio/sentry/protocol/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/protocol/h0;

    iget-object v2, p0, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "email"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "username"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "ip_address"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/h0;->E:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/h0;->F:Lio/sentry/protocol/k;

    if-eqz v0, :cond_5

    const-string v0, "geo"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->F:Lio/sentry/protocol/k;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/k;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/h0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_6

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/h0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/h0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/h0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

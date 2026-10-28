.class public final Lio/sentry/protocol/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/Boolean;

.field public F:Ljava/lang/Boolean;

.field public G:Ljava/lang/Boolean;

.field public H:Ljava/lang/Boolean;

.field public I:Lio/sentry/protocol/b0;

.field public J:Ljava/util/Map;

.field public K:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/Long;

.field public x:Ljava/lang/Integer;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c0;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v0, "priority"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->x:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/c0;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "state"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/c0;->E:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    const-string v0, "crashed"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->E:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/c0;->F:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    const-string v0, "current"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->F:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/c0;->G:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    const-string v0, "daemon"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->G:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/c0;->H:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    const-string v0, "main"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->H:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    if-eqz v0, :cond_8

    const-string v0, "stacktrace"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/c0;->J:Ljava/util/Map;

    if-eqz v0, :cond_9

    const-string v0, "held_locks"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/c0;->J:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/c0;->K:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/c0;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_a
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

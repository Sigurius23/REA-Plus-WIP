.class public final Lio/sentry/protocol/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/AbstractMap;

.field public F:Ljava/util/concurrent/ConcurrentHashMap;

.field public G:Ljava/lang/Boolean;

.field public H:Ljava/lang/Integer;

.field public I:Ljava/lang/Integer;

.field public J:Ljava/lang/Boolean;

.field public K:Ljava/util/HashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/Boolean;


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/n;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "description"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/n;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "help_link"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/n;->z:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    const-string v0, "handled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->z:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/n;->E:Ljava/util/AbstractMap;

    if-eqz v0, :cond_4

    const-string v0, "meta"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->E:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/n;->F:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_5

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/n;->G:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    const-string v0, "synthetic"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->G:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/n;->H:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    const-string v0, "exception_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->H:Ljava/lang/Integer;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/n;->I:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->I:Ljava/lang/Integer;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/n;->J:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    const-string v0, "is_exception_group"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/n;->J:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/n;->K:Ljava/util/HashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/n;->K:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_a
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

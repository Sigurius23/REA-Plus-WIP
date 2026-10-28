.class public final Lio/sentry/protocol/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/Integer;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/Boolean;

.field public H:Ljava/lang/String;

.field public I:Ljava/lang/String;

.field public J:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/Integer;

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

    const-class v2, Lio/sentry/protocol/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/protocol/l;

    iget-object v2, p0, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    iget-object v3, p1, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    iget-object v3, p1, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 9

    iget-object v0, p0, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    iget-object v2, p0, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    iget-object v4, p0, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    iget-object v5, p0, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    iget-object v7, p0, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    iget-object v8, p0, Lio/sentry/protocol/l;->I:Ljava/lang/String;

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

    iget-object v0, p0, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "vendor_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "vendor_name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v0, "memory_size"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "api_type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    const-string v0, "multi_threaded_rendering"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v0, "version"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "npot_support"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/l;->J:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/l;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

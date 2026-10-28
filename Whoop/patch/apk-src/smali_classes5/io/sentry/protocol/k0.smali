.class public final Lio/sentry/protocol/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/Double;

.field public F:Ljava/lang/Double;

.field public G:Ljava/lang/Double;

.field public H:Ljava/lang/Double;

.field public I:Ljava/lang/String;

.field public J:Ljava/lang/Double;

.field public K:Ljava/util/List;

.field public L:Ljava/util/HashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "rendering_system"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/k0;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/k0;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "identifier"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/k0;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "tag"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/k0;->E:Ljava/lang/Double;

    if-eqz v0, :cond_4

    const-string v0, "width"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->E:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/k0;->F:Ljava/lang/Double;

    if-eqz v0, :cond_5

    const-string v0, "height"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->F:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/k0;->G:Ljava/lang/Double;

    if-eqz v0, :cond_6

    const-string v0, "x"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->G:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/k0;->H:Ljava/lang/Double;

    if-eqz v0, :cond_7

    const-string v0, "y"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->H:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/k0;->I:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "visibility"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/k0;->J:Ljava/lang/Double;

    if-eqz v0, :cond_9

    const-string v0, "alpha"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->J:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/k0;->K:Ljava/util/List;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "children"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/k0;->K:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_a
    iget-object v0, p0, Lio/sentry/protocol/k0;->L:Ljava/util/HashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/k0;->L:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_b
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

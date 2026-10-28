.class public final Lio/sentry/protocol/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/HashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/Integer;

.field public y:Ljava/lang/Integer;

.field public z:Ljava/lang/Integer;


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/s;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "sdk_name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/s;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/s;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v0, "version_major"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/s;->x:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/s;->y:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    const-string v0, "version_minor"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/s;->y:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/s;->z:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v0, "version_patchlevel"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/s;->z:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/s;->E:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/s;->E:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

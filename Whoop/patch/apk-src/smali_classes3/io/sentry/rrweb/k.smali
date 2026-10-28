.class public final Lio/sentry/rrweb/k;
.super Lio/sentry/rrweb/b;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public y:Ljava/lang/String;

.field public z:Ljava/util/HashMap;


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 4

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/b;->w:Lio/sentry/rrweb/c;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v0, p0, Lio/sentry/rrweb/b;->x:J

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "tag"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/k;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "payload"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/k;->z:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v3}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.class public final Lio/sentry/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public w:Ljava/lang/Integer;

.field public x:Ljava/util/List;

.field public y:Ljava/util/HashMap;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lio/sentry/x3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/x3;

    iget-object v2, p0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    iget-object v3, p1, Lio/sentry/x3;->w:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/x3;->x:Ljava/util/List;

    iget-object p1, p1, Lio/sentry/x3;->x:Ljava/util/List;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    iget-object v1, p0, Lio/sentry/x3;->x:Ljava/util/List;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 4

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    iget-object v1, p0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v1, "segment_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v1, p0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    invoke-virtual {p1, v1}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_0
    iget-object v1, p0, Lio/sentry/x3;->y:Ljava/util/HashMap;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/x3;->y:Ljava/util/HashMap;

    invoke-static {v3, v2, p1, v2, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lio/sentry/vendor/gson/stream/c;->F:Z

    iget-object v1, p0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    :cond_2
    iget-object v1, p0, Lio/sentry/x3;->x:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-virtual {p1, p2, v1}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, v0, Lio/sentry/vendor/gson/stream/c;->F:Z

    return-void
.end method

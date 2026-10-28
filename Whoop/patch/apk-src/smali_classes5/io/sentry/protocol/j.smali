.class public final Lio/sentry/protocol/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Lio/sentry/protocol/v;

.field public F:Ljava/lang/String;

.field public G:Ljava/util/AbstractMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Lio/sentry/protocol/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1000

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    return-void

    :cond_0
    iput-object p1, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/sentry/protocol/j;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lio/sentry/protocol/j;

    iget-object v0, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    iget-object v1, p1, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    iget-object v1, p1, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    iget-object p1, p1, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

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
    .locals 7

    iget-object v0, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    iget-object v4, p0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    iget-object v5, p0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "contact_email"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    if-eqz v0, :cond_2

    const-string v0, "associated_event_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/v;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    if-eqz v0, :cond_3

    const-string v0, "replay_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/v;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

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

    iget-object v2, p0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v2}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Feedback{message=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', contactEmail=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', associatedEventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", replayId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', unknown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

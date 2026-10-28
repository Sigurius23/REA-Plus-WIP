.class public final Lio/sentry/p7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/HashMap;

.field public final w:Lio/sentry/protocol/v;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/p7;->w:Lio/sentry/protocol/v;

    iput-object p2, p0, Lio/sentry/p7;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/sentry/p7;->y:Ljava/lang/String;

    iput-object p4, p0, Lio/sentry/p7;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "event_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/v;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    iget-object v0, p0, Lio/sentry/p7;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/p7;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "email"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/p7;->z:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "comments"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/p7;->E:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/p7;->E:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UserFeedback{eventId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/p7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/p7;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', email=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/p7;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', comments=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/p7;->z:Ljava/lang/String;

    const-string v2, "\'}"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

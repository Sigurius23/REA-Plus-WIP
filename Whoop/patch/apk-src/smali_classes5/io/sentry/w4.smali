.class public final Lio/sentry/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/HashMap;

.field public final w:Lio/sentry/protocol/v;

.field public final x:Lio/sentry/protocol/t;

.field public final y:Lio/sentry/k7;

.field public z:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/w4;->w:Lio/sentry/protocol/v;

    iput-object p2, p0, Lio/sentry/w4;->x:Lio/sentry/protocol/t;

    iput-object p3, p0, Lio/sentry/w4;->y:Lio/sentry/k7;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/w4;->w:Lio/sentry/protocol/v;

    if-eqz v0, :cond_0

    const-string v1, "event_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/w4;->x:Lio/sentry/protocol/t;

    if-eqz v0, :cond_1

    const-string v1, "sdk"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/w4;->y:Lio/sentry/k7;

    if-eqz v0, :cond_2

    const-string v1, "trace"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/w4;->z:Ljava/util/Date;

    if-eqz v0, :cond_3

    const-string v0, "sent_at"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/w4;->z:Ljava/util/Date;

    invoke-static {v0}, Ljc/x;->W(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/w4;->E:Ljava/util/HashMap;

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

    iget-object v2, p0, Lio/sentry/w4;->E:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

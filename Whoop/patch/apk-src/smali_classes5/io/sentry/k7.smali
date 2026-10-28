.class public final Lio/sentry/k7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Lio/sentry/protocol/v;

.field public K:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:Lio/sentry/protocol/v;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/v;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/k7;->w:Lio/sentry/protocol/v;

    iput-object p2, p0, Lio/sentry/k7;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/sentry/k7;->y:Ljava/lang/String;

    iput-object p4, p0, Lio/sentry/k7;->z:Ljava/lang/String;

    iput-object p5, p0, Lio/sentry/k7;->E:Ljava/lang/String;

    iput-object p6, p0, Lio/sentry/k7;->F:Ljava/lang/String;

    iput-object p7, p0, Lio/sentry/k7;->G:Ljava/lang/String;

    iput-object p8, p0, Lio/sentry/k7;->I:Ljava/lang/String;

    iput-object p9, p0, Lio/sentry/k7;->J:Lio/sentry/protocol/v;

    iput-object p10, p0, Lio/sentry/k7;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/k7;->w:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "public_key"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/k7;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/k7;->y:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "release"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/k7;->z:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "environment"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/k7;->E:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "user_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/k7;->F:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "transaction"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/k7;->G:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v1, "sample_rate"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/k7;->H:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v1, "sample_rand"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/k7;->I:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v1, "sampled"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/k7;->J:Lio/sentry/protocol/v;

    if-eqz v0, :cond_7

    const-string v1, "replay_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/k7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/k7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

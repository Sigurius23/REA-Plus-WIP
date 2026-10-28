.class public final Lio/sentry/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/Long;

.field public F:Ljava/lang/Long;

.field public G:Ljava/lang/Long;

.field public H:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lio/sentry/n1;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lio/sentry/n1;->h()Lio/sentry/protocol/v;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/t3;->w:Ljava/lang/String;

    invoke-interface {p1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v0}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/t3;->x:Ljava/lang/String;

    invoke-interface {p1}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "unknown"

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lio/sentry/t3;->y:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/t3;->z:Ljava/lang/Long;

    iput-object p3, p0, Lio/sentry/t3;->F:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lio/sentry/t3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lio/sentry/t3;

    iget-object v0, p0, Lio/sentry/t3;->w:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/t3;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->x:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/t3;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->y:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/t3;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->z:Ljava/lang/Long;

    iget-object v1, p1, Lio/sentry/t3;->z:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->F:Ljava/lang/Long;

    iget-object v1, p1, Lio/sentry/t3;->F:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->G:Ljava/lang/Long;

    iget-object v1, p1, Lio/sentry/t3;->G:Ljava/lang/Long;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->E:Ljava/lang/Long;

    iget-object v1, p1, Lio/sentry/t3;->E:Ljava/lang/Long;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

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
    .locals 8

    iget-object v0, p0, Lio/sentry/t3;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/t3;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/t3;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/t3;->z:Ljava/lang/Long;

    iget-object v4, p0, Lio/sentry/t3;->E:Ljava/lang/Long;

    iget-object v5, p0, Lio/sentry/t3;->F:Ljava/lang/Long;

    iget-object v6, p0, Lio/sentry/t3;->G:Ljava/lang/Long;

    iget-object v7, p0, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->w:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->x:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->y:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "relative_start_ns"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->z:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "relative_end_ns"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->E:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "relative_cpu_start_ms"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->F:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "relative_cpu_end_ms"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->G:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.class public final Lio/sentry/protocol/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/util/concurrent/ConcurrentHashMap;

.field public y:Ljava/lang/Integer;

.field public z:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lio/sentry/protocol/r;->w:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/protocol/r;->w:Ljava/lang/String;

    iget-object v0, p1, Lio/sentry/protocol/r;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/r;->x:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p1, Lio/sentry/protocol/r;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/r;->F:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p1, Lio/sentry/protocol/r;->y:Ljava/lang/Integer;

    iput-object v0, p0, Lio/sentry/protocol/r;->y:Ljava/lang/Integer;

    iget-object v0, p1, Lio/sentry/protocol/r;->z:Ljava/lang/Long;

    iput-object v0, p0, Lio/sentry/protocol/r;->z:Ljava/lang/Long;

    iget-object p1, p1, Lio/sentry/protocol/r;->E:Ljava/lang/Object;

    iput-object p1, p0, Lio/sentry/protocol/r;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "cookies"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/r;->x:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_1

    const-string v0, "headers"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/r;->y:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    const-string v0, "status_code"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->y:Ljava/lang/Integer;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/r;->z:Ljava/lang/Long;

    if-eqz v0, :cond_3

    const-string v0, "body_size"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->z:Ljava/lang/Long;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/r;->E:Ljava/lang/Object;

    if-eqz v0, :cond_4

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/r;->E:Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/r;->F:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/r;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

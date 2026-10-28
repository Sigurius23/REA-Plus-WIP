.class public final Lio/sentry/protocol/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Ljava/util/List;

.field public x:Ljava/util/AbstractMap;

.field public y:Ljava/lang/Boolean;

.field public z:Lio/sentry/protocol/a0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v0, "frames"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/b0;->x:Ljava/util/AbstractMap;

    if-eqz v0, :cond_1

    const-string v0, "registers"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/b0;->x:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/b0;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    const-string v0, "snapshot"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/b0;->y:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/b0;->z:Lio/sentry/protocol/a0;

    if-eqz v0, :cond_3

    const-string v0, "instruction_addr_adjustment"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/b0;->z:Lio/sentry/protocol/a0;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/b0;->E:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/b0;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

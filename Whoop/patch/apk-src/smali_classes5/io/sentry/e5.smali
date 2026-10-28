.class public final Lio/sentry/e5;
.super Lio/sentry/r4;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public P:Ljava/util/Date;

.field public Q:Lio/sentry/protocol/o;

.field public R:Ljava/lang/String;

.field public S:Laa3/u0;

.field public T:Laa3/u0;

.field public U:Lio/sentry/n5;

.field public V:Ljava/lang/String;

.field public W:Ljava/util/List;

.field public X:Ljava/util/concurrent/ConcurrentHashMap;

.field public Y:Ljava/util/AbstractMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Lio/sentry/protocol/v;-><init>()V

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v1

    .line 4
    invoke-direct {p0, v0}, Lio/sentry/r4;-><init>(Lio/sentry/protocol/v;)V

    .line 5
    iput-object v1, p0, Lio/sentry/e5;->P:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/e5;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/r4;->J:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final d()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lio/sentry/e5;->T:Laa3/u0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lio/sentry/e5;->S:Laa3/u0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Lio/sentry/protocol/u;
    .locals 3

    iget-object v0, p0, Lio/sentry/e5;->T:Laa3/u0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/u;

    iget-object v2, v1, Lio/sentry/protocol/u;->F:Lio/sentry/protocol/n;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lio/sentry/protocol/n;->z:Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/e5;->T:Laa3/u0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->P:Ljava/util/Date;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    if-eqz v0, :cond_0

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/e5;->R:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "logger"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->R:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/e5;->S:Laa3/u0;

    const-string v1, "values"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "threads"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->S:Laa3/u0;

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/e5;->T:Laa3/u0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "exception"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->T:Laa3/u0;

    invoke-virtual {v0}, Laa3/u0;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/e5;->U:Lio/sentry/n5;

    if-eqz v0, :cond_4

    const-string v0, "level"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->U:Lio/sentry/n5;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/e5;->V:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "transaction"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->V:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/e5;->W:Ljava/util/List;

    if-eqz v0, :cond_6

    const-string v0, "fingerprint"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->W:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/e5;->Y:Ljava/util/AbstractMap;

    if-eqz v0, :cond_7

    const-string v0, "modules"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e5;->Y:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    invoke-static {p0, p1, p2}, Lpf/c;->U(Lio/sentry/r4;Lwe/o;Lio/sentry/v0;)V

    iget-object v0, p0, Lio/sentry/e5;->X:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/e5;->X:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

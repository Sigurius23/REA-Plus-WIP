.class public final Lio/sentry/protocol/d0;
.super Lio/sentry/r4;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public P:Ljava/lang/String;

.field public Q:Ljava/lang/Double;

.field public R:Ljava/lang/Double;

.field public final S:Ljava/util/ArrayList;

.field public final T:Ljava/util/HashMap;

.field public U:Lio/sentry/protocol/f0;

.field public V:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/z6;)V
    .locals 12

    .line 14
    iget-object v0, p1, Lio/sentry/z6;->a:Lio/sentry/protocol/v;

    .line 15
    invoke-direct {p0, v0}, Lio/sentry/r4;-><init>(Lio/sentry/protocol/v;)V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/d0;->T:Ljava/util/HashMap;

    .line 18
    iget-object v0, p1, Lio/sentry/z6;->b:Lio/sentry/d7;

    .line 19
    iget-object v1, v0, Lio/sentry/d7;->a:Lio/sentry/u4;

    .line 20
    invoke-virtual {v1}, Lio/sentry/u4;->d()J

    move-result-wide v1

    long-to-double v1, v1

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/protocol/d0;->Q:Ljava/lang/Double;

    .line 21
    iget-object v1, v0, Lio/sentry/d7;->a:Lio/sentry/u4;

    .line 22
    iget-object v2, v0, Lio/sentry/d7;->b:Lio/sentry/u4;

    .line 23
    invoke-virtual {v1, v2}, Lio/sentry/u4;->c(Lio/sentry/u4;)J

    move-result-wide v1

    long-to-double v1, v1

    div-double/2addr v1, v3

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/protocol/d0;->R:Ljava/lang/Double;

    .line 25
    iget-object v1, p1, Lio/sentry/z6;->e:Ljava/lang/String;

    .line 26
    iput-object v1, p0, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    .line 27
    iget-object v1, p1, Lio/sentry/z6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/d7;

    .line 29
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    iget-object v4, v2, Lio/sentry/d7;->c:Lio/sentry/e7;

    .line 31
    iget-object v4, v4, Lio/sentry/e7;->z:Laa3/i1;

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    .line 32
    :cond_1
    iget-object v4, v4, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Boolean;

    .line 33
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 34
    iget-object v3, p0, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    new-instance v4, Lio/sentry/protocol/y;

    invoke-direct {v4, v2}, Lio/sentry/protocol/y;-><init>(Lio/sentry/d7;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_2
    iget-object v1, p0, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    .line 36
    iget-object v2, p1, Lio/sentry/z6;->p:Lio/sentry/protocol/c;

    .line 37
    invoke-virtual {v1, v2}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/c;)V

    .line 38
    iget-object v2, v0, Lio/sentry/d7;->c:Lio/sentry/e7;

    .line 39
    iget-object v0, v0, Lio/sentry/d7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    new-instance v3, Lio/sentry/e7;

    .line 41
    iget-object v4, v2, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    .line 42
    iget-object v5, v2, Lio/sentry/e7;->x:Lio/sentry/h7;

    .line 43
    iget-object v6, v2, Lio/sentry/e7;->y:Lio/sentry/h7;

    .line 44
    iget-object v7, v2, Lio/sentry/e7;->E:Ljava/lang/String;

    .line 45
    iget-object v8, v2, Lio/sentry/e7;->F:Ljava/lang/String;

    .line 46
    iget-object v9, v2, Lio/sentry/e7;->z:Laa3/i1;

    .line 47
    iget-object v10, v2, Lio/sentry/e7;->G:Lio/sentry/i7;

    .line 48
    iget-object v11, v2, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 49
    invoke-direct/range {v3 .. v11}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Laa3/i1;Lio/sentry/i7;Ljava/lang/String;)V

    .line 50
    iget-object v4, v2, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 52
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0, v6, v5}, Lio/sentry/r4;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_6

    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 54
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    if-nez v4, :cond_5

    .line 55
    iget-object v4, v3, Lio/sentry/e7;->J:Ljava/util/Map;

    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 56
    :cond_5
    iget-object v6, v3, Lio/sentry/e7;->J:Ljava/util/Map;

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 57
    :cond_6
    iget-object v0, v2, Lio/sentry/e7;->N:Lad3/z;

    .line 58
    invoke-virtual {v0}, Lad3/z;->r()Lio/sentry/protocol/i;

    .line 59
    invoke-virtual {v1, v3}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    .line 60
    new-instance v0, Lio/sentry/protocol/f0;

    .line 61
    iget-object p1, p1, Lio/sentry/z6;->n:Lio/sentry/protocol/g0;

    .line 62
    invoke-virtual {p1}, Lio/sentry/protocol/g0;->apiName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/sentry/protocol/f0;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/protocol/d0;->U:Lio/sentry/protocol/f0;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/HashMap;Lio/sentry/protocol/f0;)V
    .locals 4

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 1
    invoke-direct {p0}, Lio/sentry/r4;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    .line 3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/sentry/protocol/d0;->T:Ljava/util/HashMap;

    .line 4
    const-string v3, ""

    iput-object v3, p0, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lio/sentry/protocol/d0;->Q:Ljava/lang/Double;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lio/sentry/protocol/d0;->R:Ljava/lang/Double;

    .line 7
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 8
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/protocol/y;

    .line 10
    iget-object v0, p0, Lio/sentry/protocol/d0;->T:Ljava/util/HashMap;

    .line 11
    iget-object p2, p2, Lio/sentry/protocol/y;->L:Ljava/util/Map;

    .line 12
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_0

    .line 13
    :cond_0
    iput-object p3, p0, Lio/sentry/protocol/d0;->U:Lio/sentry/protocol/f0;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    const-string v1, "transaction"

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->P:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    const-string v0, "start_timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->Q:Ljava/lang/Double;

    invoke-static {v0}, Ljc/x;->E(Ljava/lang/Double;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->R:Ljava/lang/Double;

    if-eqz v0, :cond_1

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->R:Ljava/lang/Double;

    invoke-static {v0}, Ljc/x;->E(Ljava/lang/Double;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "spans"

    invoke-virtual {p1, v2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v1}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->T:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "measurements"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    const-string v0, "transaction_info"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/d0;->U:Lio/sentry/protocol/f0;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    invoke-static {p0, p1, p2}, Lpf/c;->U(Lio/sentry/r4;Lwe/o;Lio/sentry/v0;)V

    iget-object v0, p0, Lio/sentry/protocol/d0;->V:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/d0;->V:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

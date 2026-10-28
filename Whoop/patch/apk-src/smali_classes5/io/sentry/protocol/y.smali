.class public final Lio/sentry/protocol/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Lio/sentry/h7;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Lio/sentry/i7;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/util/Map;

.field public K:Ljava/util/Map;

.field public final L:Ljava/util/Map;

.field public M:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:Ljava/lang/Double;

.field public final x:Ljava/lang/Double;

.field public final y:Lio/sentry/protocol/v;

.field public final z:Lio/sentry/h7;


# direct methods
.method public constructor <init>(Lio/sentry/d7;)V
    .locals 7

    .line 14
    iget-object v0, p1, Lio/sentry/d7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-object v1, p1, Lio/sentry/d7;->c:Lio/sentry/e7;

    .line 17
    iget-object v2, v1, Lio/sentry/e7;->F:Ljava/lang/String;

    .line 18
    iput-object v2, p0, Lio/sentry/protocol/y;->G:Ljava/lang/String;

    .line 19
    iget-object v2, v1, Lio/sentry/e7;->E:Ljava/lang/String;

    .line 20
    iput-object v2, p0, Lio/sentry/protocol/y;->F:Ljava/lang/String;

    .line 21
    iget-object v2, v1, Lio/sentry/e7;->x:Lio/sentry/h7;

    .line 22
    iput-object v2, p0, Lio/sentry/protocol/y;->z:Lio/sentry/h7;

    .line 23
    iget-object v2, v1, Lio/sentry/e7;->y:Lio/sentry/h7;

    .line 24
    iput-object v2, p0, Lio/sentry/protocol/y;->E:Lio/sentry/h7;

    .line 25
    iget-object v2, v1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    .line 26
    iput-object v2, p0, Lio/sentry/protocol/y;->y:Lio/sentry/protocol/v;

    .line 27
    iget-object v2, v1, Lio/sentry/e7;->G:Lio/sentry/i7;

    .line 28
    iput-object v2, p0, Lio/sentry/protocol/y;->H:Lio/sentry/i7;

    .line 29
    iget-object v2, v1, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 30
    iput-object v2, p0, Lio/sentry/protocol/y;->I:Ljava/lang/String;

    .line 31
    iget-object v2, v1, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    invoke-static {v2}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_0
    iput-object v2, p0, Lio/sentry/protocol/y;->J:Ljava/util/Map;

    .line 34
    iget-object v2, p1, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    invoke-static {v2}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 36
    :cond_1
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_1
    iput-object v2, p0, Lio/sentry/protocol/y;->L:Ljava/util/Map;

    .line 37
    iget-object v2, p1, Lio/sentry/d7;->b:Lio/sentry/u4;

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    .line 38
    :cond_2
    iget-object v5, p1, Lio/sentry/d7;->a:Lio/sentry/u4;

    .line 39
    invoke-virtual {v5, v2}, Lio/sentry/u4;->c(Lio/sentry/u4;)J

    move-result-wide v5

    long-to-double v5, v5

    div-double/2addr v5, v3

    .line 40
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lio/sentry/protocol/y;->x:Ljava/lang/Double;

    .line 41
    iget-object p1, p1, Lio/sentry/d7;->a:Lio/sentry/u4;

    .line 42
    invoke-virtual {p1}, Lio/sentry/u4;->d()J

    move-result-wide v5

    long-to-double v5, v5

    div-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/protocol/y;->w:Ljava/lang/Double;

    .line 43
    iput-object v0, p0, Lio/sentry/protocol/y;->K:Ljava/util/Map;

    .line 44
    iget-object p1, v1, Lio/sentry/e7;->N:Lad3/z;

    .line 45
    invoke-virtual {p1}, Lad3/z;->r()Lio/sentry/protocol/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Lio/sentry/i7;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/protocol/y;->w:Ljava/lang/Double;

    .line 3
    iput-object p2, p0, Lio/sentry/protocol/y;->x:Ljava/lang/Double;

    .line 4
    iput-object p3, p0, Lio/sentry/protocol/y;->y:Lio/sentry/protocol/v;

    .line 5
    iput-object p4, p0, Lio/sentry/protocol/y;->z:Lio/sentry/h7;

    .line 6
    iput-object p5, p0, Lio/sentry/protocol/y;->E:Lio/sentry/h7;

    .line 7
    iput-object p6, p0, Lio/sentry/protocol/y;->F:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/sentry/protocol/y;->G:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/sentry/protocol/y;->H:Lio/sentry/i7;

    .line 10
    iput-object p9, p0, Lio/sentry/protocol/y;->I:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lio/sentry/protocol/y;->J:Ljava/util/Map;

    .line 12
    iput-object p11, p0, Lio/sentry/protocol/y;->L:Ljava/util/Map;

    .line 13
    iput-object p12, p0, Lio/sentry/protocol/y;->K:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 5

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "start_timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->w:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->x:Ljava/lang/Double;

    if-eqz v0, :cond_0

    const-string v3, "timestamp"

    invoke-virtual {p1, v3}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->y:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "span_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->z:Lio/sentry/h7;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->E:Lio/sentry/h7;

    if-eqz v0, :cond_1

    const-string v1, "parent_span_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    const-string v0, "op"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->G:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "description"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/y;->H:Lio/sentry/i7;

    if-eqz v0, :cond_3

    const-string v1, "status"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/y;->I:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v1, "origin"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/y;->J:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "tags"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/y;->K:Ljava/util/Map;

    if-eqz v0, :cond_6

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/y;->K:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/y;->L:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "measurements"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/y;->M:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/protocol/y;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

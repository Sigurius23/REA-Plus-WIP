.class public Lio/sentry/e7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Lio/sentry/i7;

.field public H:Ljava/util/concurrent/ConcurrentHashMap;

.field public I:Ljava/lang/String;

.field public J:Ljava/util/Map;

.field public K:Ljava/util/concurrent/ConcurrentHashMap;

.field public L:Lio/sentry/s1;

.field public M:Lio/sentry/c;

.field public final N:Lad3/z;

.field public final O:Lio/sentry/protocol/v;

.field public final w:Lio/sentry/protocol/v;

.field public final x:Lio/sentry/h7;

.field public final y:Lio/sentry/h7;

.field public transient z:Laa3/i1;


# direct methods
.method public constructor <init>(Lio/sentry/e7;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    const-string v0, "manual"

    iput-object v0, p0, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 27
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    .line 28
    sget-object v0, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    iput-object v0, p0, Lio/sentry/e7;->L:Lio/sentry/s1;

    .line 29
    new-instance v0, Lad3/z;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    .line 30
    iput-object v0, p0, Lio/sentry/e7;->N:Lad3/z;

    .line 31
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/e7;->O:Lio/sentry/protocol/v;

    .line 32
    iget-object v0, p1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    .line 33
    iget-object v0, p1, Lio/sentry/e7;->x:Lio/sentry/h7;

    iput-object v0, p0, Lio/sentry/e7;->x:Lio/sentry/h7;

    .line 34
    iget-object v0, p1, Lio/sentry/e7;->y:Lio/sentry/h7;

    iput-object v0, p0, Lio/sentry/e7;->y:Lio/sentry/h7;

    .line 35
    iget-object v0, p1, Lio/sentry/e7;->z:Laa3/i1;

    invoke-virtual {p0, v0}, Lio/sentry/e7;->a(Laa3/i1;)V

    .line 36
    iget-object v0, p1, Lio/sentry/e7;->E:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e7;->E:Ljava/lang/String;

    .line 37
    iget-object v0, p1, Lio/sentry/e7;->F:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    .line 38
    iget-object v0, p1, Lio/sentry/e7;->G:Lio/sentry/i7;

    iput-object v0, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    .line 39
    iget-object v0, p1, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    iput-object v0, p0, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    :cond_0
    iget-object v0, p1, Lio/sentry/e7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 43
    iput-object v0, p0, Lio/sentry/e7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    :cond_1
    iget-object v0, p1, Lio/sentry/e7;->M:Lio/sentry/c;

    iput-object v0, p0, Lio/sentry/e7;->M:Lio/sentry/c;

    .line 45
    iget-object p1, p1, Lio/sentry/e7;->J:Ljava/util/Map;

    invoke-static {p1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 46
    iput-object p1, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    :cond_2
    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Laa3/i1;Lio/sentry/i7;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    const-string v0, "manual"

    iput-object v0, p0, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    .line 6
    sget-object v0, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    iput-object v0, p0, Lio/sentry/e7;->L:Lio/sentry/s1;

    .line 7
    new-instance v0, Lad3/z;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    .line 8
    iput-object v0, p0, Lio/sentry/e7;->N:Lad3/z;

    .line 9
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/e7;->O:Lio/sentry/protocol/v;

    .line 10
    const-string v0, "traceId is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    .line 11
    const-string p1, "spanId is required"

    invoke-static {p2, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/sentry/e7;->x:Lio/sentry/h7;

    .line 12
    const-string p1, "operation is required"

    invoke-static {p4, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lio/sentry/e7;->E:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lio/sentry/e7;->y:Lio/sentry/h7;

    .line 14
    iput-object p5, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    .line 15
    iput-object p7, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    .line 16
    iput-object p8, p0, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 17
    invoke-virtual {p0, p6}, Lio/sentry/e7;->a(Laa3/i1;)V

    .line 18
    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object p1

    .line 20
    iget-object p2, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    .line 21
    invoke-interface {p1}, Lio/sentry/util/thread/a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    .line 22
    const-string p4, "thread.id"

    invoke-interface {p2, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    iget-object p2, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    const-string p3, "thread.name"

    invoke-interface {p1}, Lio/sentry/util/thread/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V
    .locals 9

    const/4 v7, 0x0

    .line 1
    const-string v8, "manual"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v8}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Laa3/i1;Lio/sentry/i7;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Laa3/i1;)V
    .locals 3

    iput-object p1, p0, Lio/sentry/e7;->z:Laa3/i1;

    iget-object v0, p0, Lio/sentry/e7;->M:Lio/sentry/c;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p1, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    sget-object v2, Lio/sentry/util/m;->a:Ljava/nio/charset/Charset;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "sentry-sampled"

    invoke-virtual {v0, v2, v1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Double;

    if-eqz v1, :cond_2

    iget-boolean v2, v0, Lio/sentry/c;->f:Z

    if-eqz v2, :cond_2

    iput-object v1, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    iget-object p1, p1, Laa3/i1;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Double;

    if-eqz p1, :cond_3

    iput-object p1, v0, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_3
    :goto_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/sentry/e7;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/sentry/e7;

    iget-object v1, p0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    iget-object v3, p1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v1, v3}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v3, p1, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {v1, v3}, Lio/sentry/h7;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/e7;->y:Lio/sentry/h7;

    iget-object v3, p1, Lio/sentry/e7;->y:Lio/sentry/h7;

    invoke-static {v1, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/e7;->E:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/e7;->E:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/e7;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    iget-object p1, p1, Lio/sentry/e7;->G:Lio/sentry/i7;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    iget-object v4, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    iget-object v5, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    iget-object v0, p0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    iget-object v1, p0, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v2, p0, Lio/sentry/e7;->y:Lio/sentry/h7;

    iget-object v3, p0, Lio/sentry/e7;->E:Ljava/lang/String;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/v;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    const-string v0, "span_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h7;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    iget-object v0, p0, Lio/sentry/e7;->y:Lio/sentry/h7;

    if-eqz v0, :cond_0

    const-string v1, "parent_span_id"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h7;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    :cond_0
    const-string v0, "op"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "description"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    if-eqz v0, :cond_2

    const-string v0, "status"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->G:Lio/sentry/i7;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/e7;->I:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "origin"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->I:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "tags"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e7;->J:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/e7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/e7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

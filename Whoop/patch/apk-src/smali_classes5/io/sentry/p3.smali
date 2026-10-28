.class public final Lio/sentry/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Ljava/util/Map;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Ljava/lang/String;

.field public J:D

.field public final K:Ljava/io/File;

.field public L:Ljava/lang/String;

.field public M:Lio/sentry/protocol/profiling/a;

.field public N:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Lio/sentry/protocol/d;

.field public x:Lio/sentry/protocol/v;

.field public y:Lio/sentry/protocol/v;

.field public z:Lio/sentry/protocol/t;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/protocol/v;Ljava/io/File;Ljava/util/AbstractMap;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/q6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/p3;->L:Ljava/lang/String;

    iput-object p1, p0, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    iput-object p2, p0, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    iput-object p3, p0, Lio/sentry/p3;->K:Ljava/io/File;

    iput-object p4, p0, Lio/sentry/p3;->E:Ljava/util/Map;

    iput-object v0, p0, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    invoke-virtual {p7}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    invoke-virtual {p7}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p7}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lio/sentry/p3;->G:Ljava/lang/String;

    invoke-virtual {p7}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/p3;->H:Ljava/lang/String;

    iput-object p6, p0, Lio/sentry/p3;->F:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Lio/sentry/p3;->I:Ljava/lang/String;

    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    iput-wide p1, p0, Lio/sentry/p3;->J:D

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lio/sentry/p3;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lio/sentry/p3;

    iget-object v0, p0, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    iget-object v1, p1, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    iget-object v1, p1, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    iget-object v1, p1, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    iget-object v1, p1, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->E:Ljava/util/Map;

    iget-object v1, p1, Lio/sentry/p3;->E:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->F:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/p3;->F:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->G:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/p3;->G:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->H:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/p3;->H:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->I:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/p3;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->L:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/p3;->L:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    iget-object p1, p1, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 12

    iget-object v0, p0, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    iget-object v1, p0, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    iget-object v2, p0, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    iget-object v3, p0, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    iget-object v5, p0, Lio/sentry/p3;->F:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/p3;->G:Ljava/lang/String;

    iget-object v7, p0, Lio/sentry/p3;->H:Ljava/lang/String;

    iget-object v8, p0, Lio/sentry/p3;->I:Ljava/lang/String;

    iget-object v9, p0, Lio/sentry/p3;->L:Ljava/lang/String;

    iget-object v10, p0, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    iget-object v11, p0, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v4, p0, Lio/sentry/p3;->E:Ljava/util/Map;

    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    if-eqz v0, :cond_0

    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    const-string v0, "profiler_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "chunk_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    if-eqz v0, :cond_1

    const-string v0, "client_sdk"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/p3;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lio/sentry/vendor/gson/stream/c;

    iget-object v1, v1, Lio/sentry/vendor/gson/stream/c;->z:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {p1, v2}, Lwe/o;->S(Ljava/lang/String;)V

    const-string v2, "measurements"

    invoke-virtual {p1, v2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    invoke-virtual {p1, v1}, Lwe/o;->S(Ljava/lang/String;)V

    :cond_2
    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->F:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "release"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->G:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->H:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->H:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    const-string v0, "version"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->I:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->L:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "sampled_profile"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->L:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v0, p0, Lio/sentry/p3;->J:D

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const/4 v1, 0x6

    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    if-eqz v0, :cond_5

    const-string v0, "profile"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

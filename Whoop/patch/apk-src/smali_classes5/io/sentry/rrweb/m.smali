.class public final Lio/sentry/rrweb/m;
.super Lio/sentry/rrweb/b;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:J

.field public F:J

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:I

.field public J:I

.field public K:I

.field public L:Ljava/lang/String;

.field public M:I

.field public N:I

.field public O:I

.field public P:Ljava/util/HashMap;

.field public Q:Ljava/util/concurrent/ConcurrentHashMap;

.field public R:Ljava/util/concurrent/ConcurrentHashMap;

.field public y:Ljava/lang/String;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {p0, v0}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    const-string v0, "h264"

    iput-object v0, p0, Lio/sentry/rrweb/m;->G:Ljava/lang/String;

    const-string v0, "mp4"

    iput-object v0, p0, Lio/sentry/rrweb/m;->H:Ljava/lang/String;

    const-string v0, "constant"

    iput-object v0, p0, Lio/sentry/rrweb/m;->L:Ljava/lang/String;

    const-string v0, "video"

    iput-object v0, p0, Lio/sentry/rrweb/m;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lio/sentry/rrweb/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lio/sentry/rrweb/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lio/sentry/rrweb/m;

    iget v2, p0, Lio/sentry/rrweb/m;->z:I

    iget v3, p1, Lio/sentry/rrweb/m;->z:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lio/sentry/rrweb/m;->E:J

    iget-wide v4, p1, Lio/sentry/rrweb/m;->E:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-wide v2, p0, Lio/sentry/rrweb/m;->F:J

    iget-wide v4, p1, Lio/sentry/rrweb/m;->F:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->I:I

    iget v3, p1, Lio/sentry/rrweb/m;->I:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->J:I

    iget v3, p1, Lio/sentry/rrweb/m;->J:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->K:I

    iget v3, p1, Lio/sentry/rrweb/m;->K:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->M:I

    iget v3, p1, Lio/sentry/rrweb/m;->M:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->N:I

    iget v3, p1, Lio/sentry/rrweb/m;->N:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/m;->O:I

    iget v3, p1, Lio/sentry/rrweb/m;->O:I

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lio/sentry/rrweb/m;->y:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/rrweb/m;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lio/sentry/rrweb/m;->G:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/rrweb/m;->G:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lio/sentry/rrweb/m;->H:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/rrweb/m;->H:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lio/sentry/rrweb/m;->L:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/rrweb/m;->L:Ljava/lang/String;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 15

    invoke-super {p0}, Lio/sentry/rrweb/b;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/rrweb/m;->y:Ljava/lang/String;

    iget v0, p0, Lio/sentry/rrweb/m;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-wide v4, p0, Lio/sentry/rrweb/m;->E:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-wide v5, p0, Lio/sentry/rrweb/m;->F:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-object v6, p0, Lio/sentry/rrweb/m;->G:Ljava/lang/String;

    iget-object v7, p0, Lio/sentry/rrweb/m;->H:Ljava/lang/String;

    iget v0, p0, Lio/sentry/rrweb/m;->I:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v0, p0, Lio/sentry/rrweb/m;->J:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iget v0, p0, Lio/sentry/rrweb/m;->K:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, p0, Lio/sentry/rrweb/m;->L:Ljava/lang/String;

    iget v0, p0, Lio/sentry/rrweb/m;->M:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget v0, p0, Lio/sentry/rrweb/m;->N:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iget v0, p0, Lio/sentry/rrweb/m;->O:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array/range {v1 .. v14}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-static {p0, p1, p2}, Ldc/a;->N(Lio/sentry/rrweb/b;Lwe/o;Lio/sentry/v0;)V

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "tag"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "payload"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "segmentId"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->z:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "size"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v0, p0, Lio/sentry/rrweb/m;->E:J

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v0, p0, Lio/sentry/rrweb/m;->F:J

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "encoding"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "container"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "height"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->I:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "width"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->J:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "frameCount"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->K:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "frameRate"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->M:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "frameRateType"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "left"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->N:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "top"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/m;->O:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->Q:Ljava/util/concurrent/ConcurrentHashMap;

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

    iget-object v2, p0, Lio/sentry/rrweb/m;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->R:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/m;->R:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/m;->P:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/m;->P:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.class public final Lio/sentry/s6;
.super Lio/sentry/r4;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public P:Ljava/io/File;

.field public Q:Ljava/lang/String;

.field public R:Lio/sentry/r6;

.field public S:Lio/sentry/protocol/v;

.field public T:I

.field public U:Ljava/util/Date;

.field public V:Ljava/util/Date;

.field public W:Ljava/util/List;

.field public X:Ljava/util/List;

.field public Y:Ljava/util/List;

.field public Z:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/sentry/r4;-><init>()V

    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Lio/sentry/protocol/v;-><init>()V

    iput-object v0, p0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    const-string v0, "replay_event"

    iput-object v0, p0, Lio/sentry/s6;->Q:Ljava/lang/String;

    sget-object v0, Lio/sentry/r6;->SESSION:Lio/sentry/r6;

    iput-object v0, p0, Lio/sentry/s6;->R:Lio/sentry/r6;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/s6;->X:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/s6;->Y:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/s6;->W:Ljava/util/List;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/s6;->U:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lio/sentry/s6;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/s6;

    iget v2, p0, Lio/sentry/s6;->T:I

    iget v3, p1, Lio/sentry/s6;->T:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->Q:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/s6;->Q:Ljava/lang/String;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->R:Lio/sentry/r6;

    iget-object v3, p1, Lio/sentry/s6;->R:Lio/sentry/r6;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    iget-object v3, p1, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->W:Ljava/util/List;

    iget-object v3, p1, Lio/sentry/s6;->W:Ljava/util/List;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->X:Ljava/util/List;

    iget-object v3, p1, Lio/sentry/s6;->X:Ljava/util/List;

    invoke-static {v2, v3}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/s6;->Y:Ljava/util/List;

    iget-object p1, p1, Lio/sentry/s6;->Y:Ljava/util/List;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lio/sentry/s6;->Q:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/s6;->R:Lio/sentry/r6;

    iget-object v2, p0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    iget v3, p0, Lio/sentry/s6;->T:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lio/sentry/s6;->W:Ljava/util/List;

    iget-object v5, p0, Lio/sentry/s6;->X:Ljava/util/List;

    iget-object v6, p0, Lio/sentry/s6;->Y:Ljava/util/List;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->Q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "replay_type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->R:Lio/sentry/r6;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "segment_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/s6;->T:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->U:Ljava/util/Date;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    if-eqz v0, :cond_0

    const-string v0, "replay_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/s6;->V:Ljava/util/Date;

    if-eqz v0, :cond_1

    const-string v0, "replay_start_timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->V:Ljava/util/Date;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/s6;->W:Ljava/util/List;

    if-eqz v0, :cond_2

    const-string v0, "urls"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->W:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/s6;->X:Ljava/util/List;

    if-eqz v0, :cond_3

    const-string v0, "error_ids"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->X:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/s6;->Y:Ljava/util/List;

    if-eqz v0, :cond_4

    const-string v0, "trace_ids"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/s6;->Y:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    invoke-static {p0, p1, p2}, Lpf/c;->U(Lio/sentry/r4;Lwe/o;Lio/sentry/v0;)V

    iget-object v0, p0, Lio/sentry/s6;->Z:Ljava/util/HashMap;

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

    iget-object v2, p0, Lio/sentry/s6;->Z:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

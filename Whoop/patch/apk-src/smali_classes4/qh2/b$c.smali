.class final Lqh2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqh2/b;->f()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqh2/a;",
        "accumulator",
        "Llt0/k;",
        "packet",
        "<anonymous>",
        "(Lqh2/a;Llt0/k;)Lqh2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.strapPipelineAnalytics.MetricsHistorySync$fetchMetricsMetadata$3"
    f = "MetricsHistorySync.kt"
    l = {
        0x51,
        0x63
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqh2/b;


# direct methods
.method public constructor <init>(Lqh2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqh2/b;",
            "Lq83/d<",
            "-",
            "Lqh2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqh2/b$c;->z:Lqh2/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lqh2/a;Llt0/k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqh2/a;",
            "Llt0/k;",
            "Lq83/d<",
            "-",
            "Lqh2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqh2/b$c;

    iget-object v1, p0, Lqh2/b$c;->z:Lqh2/b;

    invoke-direct {v0, v1, p3}, Lqh2/b$c;-><init>(Lqh2/b;Lq83/d;)V

    iput-object p1, v0, Lqh2/b$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqh2/b$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqh2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqh2/a;

    check-cast p2, Llt0/k;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqh2/b$c;->f(Lqh2/a;Llt0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lqh2/b$c;->x:Ljava/lang/Object;

    check-cast v1, Lqh2/a;

    iget-object v2, v0, Lqh2/b$c;->y:Ljava/lang/Object;

    check-cast v2, Llt0/k;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lqh2/b$c;->w:I

    const-wide/16 v5, -0x1

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v8, :cond_1

    if-ne v4, v7, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Llt0/k;->b()Llt0/c;

    move-result-object v4

    instance-of v9, v4, Ldk0/g;

    if-eqz v9, :cond_4

    invoke-interface {v1}, Lqh2/a;->a()J

    move-result-wide v3

    cmp-long v3, v3, v5

    if-lez v3, :cond_3

    invoke-interface {v1}, Lqh2/a;->a()J

    move-result-wide v3

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lqh2/b$c;->z:Lqh2/b;

    invoke-static {v1}, Lqh2/b;->b(Lqh2/b;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    :goto_0
    new-instance v1, Lqh2/a$c;

    invoke-virtual {v2}, Llt0/k;->b()Llt0/c;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.HistoryStartMetadataPacket"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ldk0/g;

    invoke-direct {v1, v3, v4, v2}, Lqh2/a$c;-><init>(JLdk0/i;)V

    return-object v1

    :cond_4
    instance-of v9, v4, Ldk0/d;

    if-eqz v9, :cond_6

    instance-of v4, v1, Lqh2/a$c;

    if-nez v4, :cond_5

    iget-object v4, v0, Lqh2/b$c;->z:Lqh2/b;

    invoke-static {v4}, Lqh2/b;->d(Lqh2/b;)Liy1/c;

    move-result-object v4

    new-instance v9, Ljy1/a;

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const-string v11, "connectivity.strap.app.history_sync_end_no_start"

    const/4 v12, 0x0

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lqh2/b$c;->x:Ljava/lang/Object;

    iput-object v2, v0, Lqh2/b$c;->y:Ljava/lang/Object;

    iput v8, v0, Lqh2/b$c;->w:I

    invoke-interface {v4, v9, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    new-instance v3, Lqh2/a$b;

    invoke-interface {v1}, Lqh2/a;->a()J

    move-result-wide v4

    invoke-virtual {v2}, Llt0/k;->b()Llt0/c;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.HistoryEndMetadataPacket"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ldk0/d;

    invoke-direct {v3, v4, v5, v1}, Lqh2/a$b;-><init>(JLdk0/i;)V

    return-object v3

    :cond_6
    instance-of v4, v4, Ldk0/b;

    const/4 v8, 0x0

    if-eqz v4, :cond_a

    instance-of v4, v1, Lqh2/a$c;

    if-nez v4, :cond_7

    instance-of v4, v1, Lqh2/a$b;

    if-eqz v4, :cond_9

    :cond_7
    invoke-interface {v1}, Lqh2/a;->a()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v4, v9, v11

    if-lez v4, :cond_8

    iget-object v4, v0, Lqh2/b$c;->z:Lqh2/b;

    invoke-static {v4}, Lqh2/b;->b(Lqh2/b;)Ljava/time/Clock;

    move-result-object v8

    invoke-virtual {v8}, Ljava/time/Clock;->millis()J

    move-result-wide v8

    invoke-interface {v1}, Lqh2/a;->a()J

    move-result-wide v10

    sub-long/2addr v8, v10

    const/4 v1, 0x0

    iput-object v1, v0, Lqh2/b$c;->x:Ljava/lang/Object;

    iput-object v2, v0, Lqh2/b$c;->y:Ljava/lang/Object;

    iput v7, v0, Lqh2/b$c;->w:I

    invoke-static {v4, v8, v9, v0}, Lqh2/b;->a(Lqh2/b;JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    :goto_2
    return-object v3

    :cond_8
    iget-object v3, v0, Lqh2/b$c;->z:Lqh2/b;

    invoke-static {v3}, Lqh2/b;->c(Lqh2/b;)Ltr2/n;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Accumulator has "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Cannot calculate sync duration"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v3, v1, v4}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_9
    :goto_3
    new-instance v1, Lqh2/a$a;

    invoke-virtual {v2}, Llt0/k;->b()Llt0/c;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.HistoryCompleteMetadataPacket"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ldk0/b;

    invoke-direct {v1, v5, v6, v2}, Lqh2/a$a;-><init>(JLdk0/i;)V

    return-object v1

    :cond_a
    iget-object v3, v0, Lqh2/b$c;->z:Lqh2/b;

    invoke-static {v3}, Lqh2/b;->c(Lqh2/b;)Ltr2/n;

    move-result-object v3

    invoke-virtual {v2}, Llt0/k;->b()Llt0/c;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Received some other packet type: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v3, v2, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1
.end method

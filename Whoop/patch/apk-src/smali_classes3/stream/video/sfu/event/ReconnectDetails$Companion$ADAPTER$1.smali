.class public final Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/ReconnectDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/q;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "stream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/ReconnectDetails;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/ReconnectDetails;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/ReconnectDetails;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/ReconnectDetails;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/ReconnectDetails;",
        "redact",
        "(Lstream/video/sfu/event/ReconnectDetails;)Lstream/video/sfu/event/ReconnectDetails;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/d;",
            "Lj93/d;",
            "Lcom/squareup/wire/x;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    const-string v6, "video/sfu/event/events.proto"

    const-string v3, "type.googleapis.com/stream.video.sfu.event.ReconnectDetails"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/ReconnectDetails;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/ReconnectDetails;
    .locals 13

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    .line 3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    const/4 v5, 0x0

    const-string v6, ""

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move v6, v5

    :goto_0
    move-object v5, v0

    .line 6
    :goto_1
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v10

    const/4 v0, -0x1

    if-eq v10, v0, :cond_0

    packed-switch v10, :pswitch_data_0

    .line 7
    :pswitch_0
    invoke-virtual {p1, v10}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_1

    .line 8
    :pswitch_1
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    .line 9
    :pswitch_2
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    .line 10
    :pswitch_3
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    .line 11
    :pswitch_4
    sget-object v0, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v6, v0

    goto :goto_1

    .line 12
    :pswitch_5
    sget-object v0, Lstream/video/sfu/signal/TrackSubscriptionDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 13
    :pswitch_6
    sget-object v0, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :pswitch_7
    :try_start_0
    sget-object v0, Lstream/video/sfu/models/WebsocketReconnectStrategy;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v11, v0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v11, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    invoke-virtual {p1, v10, v11, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object p1

    .line 17
    new-instance v1, Lstream/video/sfu/event/ReconnectDetails;

    .line 18
    move-object v2, v5

    check-cast v2, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    .line 19
    check-cast v7, Ljava/lang/String;

    .line 20
    check-cast v8, Ljava/lang/String;

    .line 21
    check-cast v9, Ljava/lang/String;

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, p1

    .line 22
    invoke-direct/range {v1 .. v9}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/ReconnectDetails;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/ReconnectDetails;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/ReconnectDetails;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-eq v0, v1, :cond_0

    .line 4
    sget-object v0, Lstream/video/sfu/models/WebsocketReconnectStrategy;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    :cond_0
    sget-object v0, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getAnnounced_tracks()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    sget-object v0, Lstream/video/sfu/signal/TrackSubscriptionDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getSubscriptions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 8
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    .line 9
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 11
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x7

    .line 12
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 14
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v1, 0x8

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    :cond_4
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/ReconnectDetails;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/ReconnectDetails;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/ReconnectDetails;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 17
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0x8

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 18
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x7

    .line 19
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 21
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 22
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 23
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    .line 24
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 25
    :cond_3
    sget-object v0, Lstream/video/sfu/signal/TrackSubscriptionDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getSubscriptions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 26
    sget-object v0, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getAnnounced_tracks()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 27
    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-eq v0, v1, :cond_4

    .line 28
    sget-object v0, Lstream/video/sfu/models/WebsocketReconnectStrategy;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/ReconnectDetails;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/ReconnectDetails;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/ReconnectDetails;)I
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    .line 4
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v1

    sget-object v2, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-eq v1, v2, :cond_0

    .line 5
    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6
    :cond_0
    sget-object v1, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getAnnounced_tracks()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 7
    sget-object v0, Lstream/video/sfu/signal/TrackSubscriptionDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v2, 0x4

    .line 8
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getSubscriptions()Ljava/util/List;

    move-result-object v3

    .line 9
    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 10
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 11
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getReconnect_attempt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    .line 12
    invoke-virtual {v1, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 13
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x6

    .line 14
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getFrom_sfu_id()Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 16
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x7

    .line 17
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getPrevious_session_id()Ljava/lang/String;

    move-result-object v4

    .line 18
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 19
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0x8

    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_4
    return v0
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/ReconnectDetails;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/ReconnectDetails;)Lstream/video/sfu/event/ReconnectDetails;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/ReconnectDetails;)Lstream/video/sfu/event/ReconnectDetails;
    .locals 13

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getAnnounced_tracks()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-static {v0, v1}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v4

    .line 3
    invoke-virtual {p1}, Lstream/video/sfu/event/ReconnectDetails;->getSubscriptions()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/signal/TrackSubscriptionDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-static {v0, v1}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v5

    .line 4
    sget-object v10, Lne3/l;->E:Lne3/l;

    const/16 v11, 0x79

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    .line 5
    invoke-static/range {v2 .. v12}, Lstream/video/sfu/event/ReconnectDetails;->copy$default(Lstream/video/sfu/event/ReconnectDetails;Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/ReconnectDetails;

    move-result-object p1

    return-object p1
.end method

.class public final Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/signal/SendStatsRequest;
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
        "stream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/signal/SendStatsRequest;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/signal/SendStatsRequest;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/signal/SendStatsRequest;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/signal/SendStatsRequest;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/signal/SendStatsRequest;",
        "redact",
        "(Lstream/video/sfu/signal/SendStatsRequest;)Lstream/video/sfu/signal/SendStatsRequest;",
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

    const-string v6, "video/sfu/signal_rpc/signal.proto"

    const-string v3, "type.googleapis.com/stream.video.sfu.signal.SendStatsRequest"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/signal/SendStatsRequest;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/signal/SendStatsRequest;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "reader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {v0}, Lcom/squareup/wire/r;->d()J

    move-result-wide v3

    const-string v5, ""

    const/4 v6, 0x0

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v21, v14

    move-object v15, v6

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v6, v21

    .line 5
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/wire/r;->g()I

    move-result v5

    move-object/from16 v22, v6

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    packed-switch v5, :pswitch_data_0

    .line 6
    invoke-virtual {v0, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_1

    .line 7
    :pswitch_0
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    :goto_1
    move-object/from16 v6, v22

    goto :goto_0

    .line 8
    :pswitch_1
    sget-object v5, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :pswitch_2
    sget-object v5, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :pswitch_3
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    goto :goto_1

    .line 11
    :pswitch_4
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    goto :goto_1

    .line 12
    :pswitch_5
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    goto :goto_1

    .line 13
    :pswitch_6
    sget-object v5, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v20, v5

    goto :goto_1

    .line 14
    :pswitch_7
    sget-object v5, Lstream/video/sfu/signal/Telemetry;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v19, v5

    goto :goto_1

    .line 15
    :pswitch_8
    sget-object v5, Lstream/video/sfu/models/AppleState;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    goto :goto_1

    .line 16
    :pswitch_9
    sget-object v5, Lstream/video/sfu/models/AndroidState;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_1

    .line 17
    :pswitch_a
    sget-object v5, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v5

    goto :goto_1

    .line 18
    :pswitch_b
    sget-object v5, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    goto :goto_1

    .line 19
    :pswitch_c
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    goto :goto_1

    .line 20
    :pswitch_d
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    goto :goto_1

    .line 21
    :pswitch_e
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    goto :goto_1

    .line 22
    :pswitch_f
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    goto/16 :goto_1

    .line 23
    :pswitch_10
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    goto/16 :goto_0

    .line 24
    :pswitch_11
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v21, v5

    goto/16 :goto_1

    .line 25
    :cond_0
    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v0

    move-object/from16 v6, v19

    move-object/from16 v19, v2

    .line 26
    new-instance v2, Lstream/video/sfu/signal/SendStatsRequest;

    .line 27
    move-object/from16 v3, v21

    check-cast v3, Ljava/lang/String;

    .line 28
    move-object/from16 v4, v22

    check-cast v4, Ljava/lang/String;

    .line 29
    move-object v5, v7

    check-cast v5, Ljava/lang/String;

    .line 30
    check-cast v8, Ljava/lang/String;

    .line 31
    move-object v7, v9

    check-cast v7, Ljava/lang/String;

    .line 32
    check-cast v10, Ljava/lang/String;

    .line 33
    move-object v9, v15

    check-cast v9, Lstream/video/sfu/models/InputDevices;

    .line 34
    check-cast v16, Lstream/video/sfu/models/InputDevices;

    .line 35
    check-cast v17, Lstream/video/sfu/models/AndroidState;

    .line 36
    check-cast v18, Lstream/video/sfu/models/AppleState;

    .line 37
    check-cast v6, Lstream/video/sfu/signal/Telemetry;

    .line 38
    check-cast v20, Lstream/video/sfu/models/RTMPIngress;

    .line 39
    move-object v15, v11

    check-cast v15, Ljava/lang/String;

    .line 40
    check-cast v12, Ljava/lang/String;

    .line 41
    check-cast v13, Ljava/lang/String;

    .line 42
    check-cast v14, Ljava/lang/String;

    move-object/from16 v11, v20

    move-object/from16 v20, v14

    move-object v14, v11

    move-object/from16 v21, v0

    move-object/from16 v11, v17

    move-object/from16 v17, v13

    move-object v13, v6

    move-object v6, v8

    move-object v8, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v12

    move-object/from16 v12, v18

    move-object/from16 v18, v1

    .line 43
    invoke-direct/range {v2 .. v21}, Lstream/video/sfu/signal/SendStatsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/signal/SendStatsRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/signal/SendStatsRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/signal/SendStatsRequest;)V
    .locals 5

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    .line 5
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    .line 8
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    .line 11
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 13
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 14
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v0, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x7

    .line 16
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v3

    .line 17
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 18
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v0, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x8

    .line 19
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v3

    .line 20
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 21
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v0, Lstream/video/sfu/signal/Telemetry;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 22
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v0

    if-eqz v0, :cond_9

    sget-object v0, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 23
    :cond_9
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xd

    .line 24
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 26
    :cond_a
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xe

    .line 27
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v3

    .line 28
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 29
    :cond_b
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xf

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 30
    :cond_c
    sget-object v0, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v2

    const/16 v3, 0x10

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getEncode_stats()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, p1, v3, v4}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 31
    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/16 v2, 0x11

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getDecode_stats()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 32
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v1, 0x12

    .line 33
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 35
    :cond_d
    sget-object v0, Lstream/video/sfu/models/AndroidState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x9

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAndroid()Lstream/video/sfu/models/AndroidState;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 36
    sget-object v0, Lstream/video/sfu/models/AppleState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getApple()Lstream/video/sfu/models/AppleState;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 37
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/signal/SendStatsRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/signal/SendStatsRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/signal/SendStatsRequest;)V
    .locals 5

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 39
    sget-object v0, Lstream/video/sfu/models/AppleState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getApple()Lstream/video/sfu/models/AppleState;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 40
    sget-object v0, Lstream/video/sfu/models/AndroidState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x9

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAndroid()Lstream/video/sfu/models/AndroidState;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 41
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0x12

    .line 42
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object v3

    .line 43
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 44
    :cond_0
    sget-object v0, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v2

    const/16 v3, 0x11

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getDecode_stats()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, p1, v3, v4}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 45
    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/16 v2, 0x10

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getEncode_stats()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 46
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xf

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 47
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xe

    .line 48
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 50
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xd

    .line 51
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v3

    .line 52
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 53
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v0, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 54
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v0, Lstream/video/sfu/signal/Telemetry;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 55
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v0, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x8

    .line 56
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v3

    .line 57
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 58
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v0, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x7

    .line 59
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v3

    .line 60
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 61
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 62
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 63
    :cond_9
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    .line 64
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v3

    .line 65
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 66
    :cond_a
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    .line 67
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v3

    .line 68
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 69
    :cond_b
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    .line 70
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 72
    :cond_c
    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_d
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/signal/SendStatsRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/signal/SendStatsRequest;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/signal/SendStatsRequest;)I
    .locals 6

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    .line 4
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    .line 5
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSession_id()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x2

    .line 8
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_stats()Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x3

    .line 11
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_stats()Ljava/lang/String;

    move-result-object v4

    .line 12
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 13
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x4

    .line 14
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getWebrtc_version()Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 16
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x5

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 17
    :cond_4
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x6

    .line 18
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSdk_version()Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 20
    :cond_5
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v1, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v3, 0x7

    .line 21
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v4

    .line 22
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 23
    :cond_6
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v1

    if-eqz v1, :cond_7

    sget-object v1, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v3, 0x8

    .line 24
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v4

    .line 25
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 26
    :cond_7
    sget-object v1, Lstream/video/sfu/models/AndroidState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v3, 0x9

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getAndroid()Lstream/video/sfu/models/AndroidState;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 27
    sget-object v0, Lstream/video/sfu/models/AppleState;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v3, 0xa

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getApple()Lstream/video/sfu/models/AppleState;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 28
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v1, Lstream/video/sfu/signal/Telemetry;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v3, 0xb

    .line 29
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v4

    .line 30
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 31
    :cond_8
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v1

    if-eqz v1, :cond_9

    sget-object v1, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v3, 0xc

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 32
    :cond_9
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v3, 0xd

    .line 33
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getSubscriber_rtc_stats()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 35
    :cond_a
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v3, 0xe

    .line 36
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getPublisher_rtc_stats()Ljava/lang/String;

    move-result-object v4

    .line 37
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 38
    :cond_b
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v3, 0xf

    .line 39
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getRtc_stats()Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 41
    :cond_c
    sget-object v1, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v3

    const/16 v4, 0x10

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getEncode_stats()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v0

    .line 42
    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getDecode_stats()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v3

    .line 43
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0x12

    .line 44
    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsRequest;->getUnified_session_id()Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_d
    return v0
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/signal/SendStatsRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;->redact(Lstream/video/sfu/signal/SendStatsRequest;)Lstream/video/sfu/signal/SendStatsRequest;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/signal/SendStatsRequest;)Lstream/video/sfu/signal/SendStatsRequest;
    .locals 23

    const-string v0, "value"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getAudio_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v3, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/InputDevices;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v8, v2

    .line 3
    :goto_0
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getVideo_devices()Lstream/video/sfu/models/InputDevices;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v3, Lstream/video/sfu/models/InputDevices;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/InputDevices;

    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object v9, v2

    .line 4
    :goto_1
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getAndroid()Lstream/video/sfu/models/AndroidState;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v3, Lstream/video/sfu/models/AndroidState;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/AndroidState;

    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object v10, v2

    .line 5
    :goto_2
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getApple()Lstream/video/sfu/models/AppleState;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v3, Lstream/video/sfu/models/AppleState;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/AppleState;

    move-object v11, v0

    goto :goto_3

    :cond_3
    move-object v11, v2

    .line 6
    :goto_3
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getTelemetry()Lstream/video/sfu/signal/Telemetry;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v3, Lstream/video/sfu/signal/Telemetry;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/signal/Telemetry;

    move-object v12, v0

    goto :goto_4

    :cond_4
    move-object v12, v2

    .line 7
    :goto_4
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getRtmp()Lstream/video/sfu/models/RTMPIngress;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v2, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lstream/video/sfu/models/RTMPIngress;

    :cond_5
    move-object v13, v2

    .line 8
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getEncode_stats()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-static {v0, v2}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v17

    .line 9
    invoke-virtual {v1}, Lstream/video/sfu/signal/SendStatsRequest;->getDecode_stats()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v18

    .line 10
    sget-object v20, Lne3/l;->E:Lne3/l;

    const v21, 0x2703f

    const/16 v22, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    .line 11
    invoke-static/range {v1 .. v22}, Lstream/video/sfu/signal/SendStatsRequest;->copy$default(Lstream/video/sfu/signal/SendStatsRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/signal/SendStatsRequest;

    move-result-object v0

    return-object v0
.end method

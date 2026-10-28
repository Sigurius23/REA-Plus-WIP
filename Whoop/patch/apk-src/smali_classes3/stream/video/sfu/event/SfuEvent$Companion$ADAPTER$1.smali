.class public final Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/SfuEvent;
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
        "stream/video/sfu/event/SfuEvent$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/SfuEvent;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/SfuEvent;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuEvent;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuEvent;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuEvent;",
        "redact",
        "(Lstream/video/sfu/event/SfuEvent;)Lstream/video/sfu/event/SfuEvent;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.event.SfuEvent"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuEvent;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuEvent;
    .locals 52

    move-object/from16 v0, p1

    const-string v1, "reader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    .line 3
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/wire/r;->g()I

    move-result v3

    move-object/from16 v27, v4

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    packed-switch v3, :pswitch_data_0

    .line 4
    :pswitch_0
    invoke-virtual {v0, v3}, Lcom/squareup/wire/r;->j(I)V

    :goto_1
    move-object/from16 v4, v27

    goto :goto_0

    .line 5
    :pswitch_1
    sget-object v3, Lstream/video/sfu/event/InboundStateNotification;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    goto :goto_1

    .line 6
    :pswitch_2
    sget-object v3, Lstream/video/sfu/event/ChangePublishOptions;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_1

    .line 7
    :pswitch_3
    sget-object v3, Lstream/video/sfu/event/ParticipantMigrationComplete;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v23, v3

    goto :goto_1

    .line 8
    :pswitch_4
    sget-object v3, Lstream/video/sfu/event/ParticipantUpdated;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    goto :goto_1

    .line 9
    :pswitch_5
    sget-object v3, Lstream/video/sfu/event/CallEnded;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_1

    .line 10
    :pswitch_6
    sget-object v3, Lstream/video/sfu/event/PinsChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    goto :goto_1

    .line 11
    :pswitch_7
    sget-object v3, Lstream/video/sfu/event/ICERestart;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    goto :goto_1

    .line 12
    :pswitch_8
    sget-object v3, Lstream/video/sfu/event/GoAway;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    goto :goto_1

    .line 13
    :pswitch_9
    sget-object v3, Lstream/video/sfu/event/CallGrantsUpdated;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_1

    .line 14
    :pswitch_a
    sget-object v3, Lstream/video/sfu/event/Error;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_1

    .line 15
    :pswitch_b
    sget-object v3, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    goto :goto_1

    .line 16
    :pswitch_c
    sget-object v3, Lstream/video/sfu/event/TrackPublished;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    goto :goto_1

    .line 17
    :pswitch_d
    sget-object v3, Lstream/video/sfu/event/HealthCheckResponse;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    goto :goto_1

    .line 18
    :pswitch_e
    sget-object v3, Lstream/video/sfu/event/JoinResponse;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    goto :goto_1

    .line 19
    :pswitch_f
    sget-object v3, Lstream/video/sfu/event/DominantSpeakerChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    goto/16 :goto_1

    .line 20
    :pswitch_10
    sget-object v3, Lstream/video/sfu/event/ParticipantLeft;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    goto/16 :goto_1

    .line 21
    :pswitch_11
    sget-object v3, Lstream/video/sfu/event/ParticipantJoined;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    goto/16 :goto_1

    .line 22
    :pswitch_12
    sget-object v3, Lstream/video/sfu/event/ChangePublishQuality;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    goto/16 :goto_1

    .line 23
    :pswitch_13
    sget-object v3, Lstream/video/sfu/models/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    goto/16 :goto_1

    .line 24
    :pswitch_14
    sget-object v3, Lstream/video/sfu/event/AudioLevelChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    goto/16 :goto_1

    .line 25
    :pswitch_15
    sget-object v3, Lstream/video/sfu/event/ConnectionQualityChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    goto/16 :goto_1

    .line 26
    :pswitch_16
    sget-object v3, Lstream/video/sfu/event/PublisherAnswer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    goto/16 :goto_0

    .line 27
    :pswitch_17
    sget-object v3, Lstream/video/sfu/event/SubscriberOffer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v26, v3

    goto/16 :goto_1

    .line 28
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v51

    move-object/from16 v3, v27

    .line 29
    new-instance v27, Lstream/video/sfu/event/SfuEvent;

    .line 30
    move-object/from16 v28, v26

    check-cast v28, Lstream/video/sfu/event/SubscriberOffer;

    .line 31
    move-object/from16 v29, v3

    check-cast v29, Lstream/video/sfu/event/PublisherAnswer;

    .line 32
    move-object/from16 v30, v5

    check-cast v30, Lstream/video/sfu/event/ConnectionQualityChanged;

    .line 33
    move-object/from16 v31, v6

    check-cast v31, Lstream/video/sfu/event/AudioLevelChanged;

    .line 34
    move-object/from16 v32, v7

    check-cast v32, Lstream/video/sfu/models/ICETrickle;

    .line 35
    move-object/from16 v33, v8

    check-cast v33, Lstream/video/sfu/event/ChangePublishQuality;

    .line 36
    move-object/from16 v34, v9

    check-cast v34, Lstream/video/sfu/event/ParticipantJoined;

    .line 37
    move-object/from16 v35, v10

    check-cast v35, Lstream/video/sfu/event/ParticipantLeft;

    .line 38
    move-object/from16 v36, v11

    check-cast v36, Lstream/video/sfu/event/DominantSpeakerChanged;

    .line 39
    move-object/from16 v37, v12

    check-cast v37, Lstream/video/sfu/event/JoinResponse;

    .line 40
    move-object/from16 v38, v13

    check-cast v38, Lstream/video/sfu/event/HealthCheckResponse;

    .line 41
    move-object/from16 v39, v14

    check-cast v39, Lstream/video/sfu/event/TrackPublished;

    .line 42
    move-object/from16 v40, v15

    check-cast v40, Lstream/video/sfu/event/TrackUnpublished;

    .line 43
    move-object/from16 v41, v16

    check-cast v41, Lstream/video/sfu/event/Error;

    .line 44
    move-object/from16 v42, v17

    check-cast v42, Lstream/video/sfu/event/CallGrantsUpdated;

    .line 45
    move-object/from16 v43, v18

    check-cast v43, Lstream/video/sfu/event/GoAway;

    .line 46
    move-object/from16 v44, v19

    check-cast v44, Lstream/video/sfu/event/ICERestart;

    .line 47
    move-object/from16 v45, v20

    check-cast v45, Lstream/video/sfu/event/PinsChanged;

    .line 48
    move-object/from16 v46, v21

    check-cast v46, Lstream/video/sfu/event/CallEnded;

    .line 49
    move-object/from16 v47, v22

    check-cast v47, Lstream/video/sfu/event/ParticipantUpdated;

    .line 50
    move-object/from16 v48, v23

    check-cast v48, Lstream/video/sfu/event/ParticipantMigrationComplete;

    .line 51
    move-object/from16 v49, v24

    check-cast v49, Lstream/video/sfu/event/ChangePublishOptions;

    .line 52
    move-object/from16 v50, v25

    check-cast v50, Lstream/video/sfu/event/InboundStateNotification;

    .line 53
    invoke-direct/range {v27 .. v51}, Lstream/video/sfu/event/SfuEvent;-><init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V

    return-object v27

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
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
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuEvent;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuEvent;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lstream/video/sfu/event/SubscriberOffer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    sget-object v0, Lstream/video/sfu/event/PublisherAnswer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    sget-object v0, Lstream/video/sfu/event/ConnectionQualityChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    sget-object v0, Lstream/video/sfu/event/AudioLevelChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    sget-object v0, Lstream/video/sfu/models/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 8
    sget-object v0, Lstream/video/sfu/event/ChangePublishQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 9
    sget-object v0, Lstream/video/sfu/event/ParticipantJoined;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    sget-object v0, Lstream/video/sfu/event/ParticipantLeft;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 11
    sget-object v0, Lstream/video/sfu/event/DominantSpeakerChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 12
    sget-object v0, Lstream/video/sfu/event/JoinResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xd

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 13
    sget-object v0, Lstream/video/sfu/event/HealthCheckResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xe

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 14
    sget-object v0, Lstream/video/sfu/event/TrackPublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x10

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    sget-object v0, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x11

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 16
    sget-object v0, Lstream/video/sfu/event/Error;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x12

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 17
    sget-object v0, Lstream/video/sfu/event/CallGrantsUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x13

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 18
    sget-object v0, Lstream/video/sfu/event/GoAway;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x14

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 19
    sget-object v0, Lstream/video/sfu/event/ICERestart;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x15

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 20
    sget-object v0, Lstream/video/sfu/event/PinsChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x16

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 21
    sget-object v0, Lstream/video/sfu/event/CallEnded;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x17

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 22
    sget-object v0, Lstream/video/sfu/event/ParticipantUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x18

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_updated()Lstream/video/sfu/event/ParticipantUpdated;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 23
    sget-object v0, Lstream/video/sfu/event/ParticipantMigrationComplete;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x19

    .line 24
    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-result-object v2

    .line 25
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 26
    sget-object v0, Lstream/video/sfu/event/ChangePublishOptions;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x1b

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 27
    sget-object v0, Lstream/video/sfu/event/InboundStateNotification;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x1c

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 28
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuEvent;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuEvent;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 30
    sget-object v0, Lstream/video/sfu/event/InboundStateNotification;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x1c

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 31
    sget-object v0, Lstream/video/sfu/event/ChangePublishOptions;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x1b

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 32
    sget-object v0, Lstream/video/sfu/event/ParticipantMigrationComplete;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x19

    .line 33
    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-result-object v2

    .line 34
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 35
    sget-object v0, Lstream/video/sfu/event/ParticipantUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x18

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_updated()Lstream/video/sfu/event/ParticipantUpdated;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 36
    sget-object v0, Lstream/video/sfu/event/CallEnded;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x17

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 37
    sget-object v0, Lstream/video/sfu/event/PinsChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x16

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 38
    sget-object v0, Lstream/video/sfu/event/ICERestart;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x15

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 39
    sget-object v0, Lstream/video/sfu/event/GoAway;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x14

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 40
    sget-object v0, Lstream/video/sfu/event/CallGrantsUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x13

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 41
    sget-object v0, Lstream/video/sfu/event/Error;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x12

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 42
    sget-object v0, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x11

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 43
    sget-object v0, Lstream/video/sfu/event/TrackPublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0x10

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 44
    sget-object v0, Lstream/video/sfu/event/HealthCheckResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xe

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 45
    sget-object v0, Lstream/video/sfu/event/JoinResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xd

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 46
    sget-object v0, Lstream/video/sfu/event/DominantSpeakerChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 47
    sget-object v0, Lstream/video/sfu/event/ParticipantLeft;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 48
    sget-object v0, Lstream/video/sfu/event/ParticipantJoined;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 49
    sget-object v0, Lstream/video/sfu/event/ChangePublishQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 50
    sget-object v0, Lstream/video/sfu/models/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 51
    sget-object v0, Lstream/video/sfu/event/AudioLevelChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 52
    sget-object v0, Lstream/video/sfu/event/ConnectionQualityChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 53
    sget-object v0, Lstream/video/sfu/event/PublisherAnswer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 54
    sget-object v0, Lstream/video/sfu/event/SubscriberOffer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/SfuEvent;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/SfuEvent;)I
    .locals 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    .line 4
    sget-object v1, Lstream/video/sfu/event/SubscriberOffer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 5
    sget-object v0, Lstream/video/sfu/event/PublisherAnswer;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 6
    sget-object v1, Lstream/video/sfu/event/ConnectionQualityChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    .line 7
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object v3

    .line 8
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 9
    sget-object v0, Lstream/video/sfu/event/AudioLevelChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 10
    sget-object v1, Lstream/video/sfu/models/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 11
    sget-object v0, Lstream/video/sfu/event/ChangePublishQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 12
    sget-object v1, Lstream/video/sfu/event/ParticipantJoined;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xa

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 13
    sget-object v0, Lstream/video/sfu/event/ParticipantLeft;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xb

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 14
    sget-object v1, Lstream/video/sfu/event/DominantSpeakerChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xc

    .line 15
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v3

    .line 16
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 17
    sget-object v0, Lstream/video/sfu/event/JoinResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xd

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 18
    sget-object v1, Lstream/video/sfu/event/HealthCheckResponse;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xe

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 19
    sget-object v0, Lstream/video/sfu/event/TrackPublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x10

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 20
    sget-object v1, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x11

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 21
    sget-object v0, Lstream/video/sfu/event/Error;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x12

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 22
    sget-object v1, Lstream/video/sfu/event/CallGrantsUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x13

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 23
    sget-object v0, Lstream/video/sfu/event/GoAway;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x14

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 24
    sget-object v1, Lstream/video/sfu/event/ICERestart;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x15

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 25
    sget-object v0, Lstream/video/sfu/event/PinsChanged;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x16

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 26
    sget-object v1, Lstream/video/sfu/event/CallEnded;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x17

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 27
    sget-object v0, Lstream/video/sfu/event/ParticipantUpdated;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x18

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_updated()Lstream/video/sfu/event/ParticipantUpdated;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 28
    sget-object v1, Lstream/video/sfu/event/ParticipantMigrationComplete;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x19

    .line 29
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-result-object v3

    .line 30
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 31
    sget-object v0, Lstream/video/sfu/event/ChangePublishOptions;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x1b

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 32
    sget-object v1, Lstream/video/sfu/event/InboundStateNotification;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0x1c

    .line 33
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object p1

    .line 34
    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/SfuEvent;)Lstream/video/sfu/event/SfuEvent;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/SfuEvent;)Lstream/video/sfu/event/SfuEvent;
    .locals 26

    const-string v0, "value"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v3, Lstream/video/sfu/event/SubscriberOffer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/SubscriberOffer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object v3

    if-eqz v3, :cond_1

    sget-object v4, Lstream/video/sfu/event/PublisherAnswer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v4, v3}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lstream/video/sfu/event/PublisherAnswer;

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 4
    :goto_1
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v5, Lstream/video/sfu/event/ConnectionQualityChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v5, v4}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lstream/video/sfu/event/ConnectionQualityChanged;

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 5
    :goto_2
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object v5

    if-eqz v5, :cond_3

    sget-object v6, Lstream/video/sfu/event/AudioLevelChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v6, v5}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lstream/video/sfu/event/AudioLevelChanged;

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    .line 6
    :goto_3
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object v6

    if-eqz v6, :cond_4

    sget-object v7, Lstream/video/sfu/models/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v7, v6}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lstream/video/sfu/models/ICETrickle;

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    .line 7
    :goto_4
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object v7

    if-eqz v7, :cond_5

    sget-object v8, Lstream/video/sfu/event/ChangePublishQuality;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v8, v7}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lstream/video/sfu/event/ChangePublishQuality;

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    .line 8
    :goto_5
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object v8

    if-eqz v8, :cond_6

    sget-object v9, Lstream/video/sfu/event/ParticipantJoined;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v9, v8}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lstream/video/sfu/event/ParticipantJoined;

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    .line 9
    :goto_6
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object v9

    if-eqz v9, :cond_7

    sget-object v10, Lstream/video/sfu/event/ParticipantLeft;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v10, v9}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lstream/video/sfu/event/ParticipantLeft;

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    .line 10
    :goto_7
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v10

    if-eqz v10, :cond_8

    sget-object v11, Lstream/video/sfu/event/DominantSpeakerChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v11, v10}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lstream/video/sfu/event/DominantSpeakerChanged;

    goto :goto_8

    :cond_8
    const/4 v10, 0x0

    .line 11
    :goto_8
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v11

    if-eqz v11, :cond_9

    sget-object v12, Lstream/video/sfu/event/JoinResponse;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v12, v11}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lstream/video/sfu/event/JoinResponse;

    goto :goto_9

    :cond_9
    const/4 v11, 0x0

    .line 12
    :goto_9
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v12

    if-eqz v12, :cond_a

    sget-object v13, Lstream/video/sfu/event/HealthCheckResponse;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v13, v12}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lstream/video/sfu/event/HealthCheckResponse;

    goto :goto_a

    :cond_a
    const/4 v12, 0x0

    .line 13
    :goto_a
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object v13

    if-eqz v13, :cond_b

    sget-object v14, Lstream/video/sfu/event/TrackPublished;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v14, v13}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lstream/video/sfu/event/TrackPublished;

    goto :goto_b

    :cond_b
    const/4 v13, 0x0

    .line 14
    :goto_b
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object v14

    if-eqz v14, :cond_c

    sget-object v15, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v15, v14}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lstream/video/sfu/event/TrackUnpublished;

    goto :goto_c

    :cond_c
    const/4 v14, 0x0

    .line 15
    :goto_c
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v15

    if-eqz v15, :cond_d

    sget-object v2, Lstream/video/sfu/event/Error;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, v15}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/event/Error;

    move-object v15, v2

    goto :goto_d

    :cond_d
    const/4 v15, 0x0

    .line 16
    :goto_d
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v2

    move-object/from16 v17, v0

    if-eqz v2, :cond_e

    sget-object v0, Lstream/video/sfu/event/CallGrantsUpdated;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/CallGrantsUpdated;

    goto :goto_e

    :cond_e
    const/4 v0, 0x0

    .line 17
    :goto_e
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object v2

    move-object/from16 v18, v0

    if-eqz v2, :cond_f

    sget-object v0, Lstream/video/sfu/event/GoAway;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/GoAway;

    goto :goto_f

    :cond_f
    const/4 v0, 0x0

    .line 18
    :goto_f
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object v2

    move-object/from16 v19, v0

    if-eqz v2, :cond_10

    sget-object v0, Lstream/video/sfu/event/ICERestart;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/ICERestart;

    goto :goto_10

    :cond_10
    const/4 v0, 0x0

    .line 19
    :goto_10
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object v2

    move-object/from16 v20, v0

    if-eqz v2, :cond_11

    sget-object v0, Lstream/video/sfu/event/PinsChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/PinsChanged;

    goto :goto_11

    :cond_11
    const/4 v0, 0x0

    .line 20
    :goto_11
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object v2

    move-object/from16 v21, v0

    if-eqz v2, :cond_12

    sget-object v0, Lstream/video/sfu/event/CallEnded;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/CallEnded;

    goto :goto_12

    :cond_12
    const/4 v0, 0x0

    .line 21
    :goto_12
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_updated()Lstream/video/sfu/event/ParticipantUpdated;

    move-result-object v2

    move-object/from16 v22, v0

    if-eqz v2, :cond_13

    sget-object v0, Lstream/video/sfu/event/ParticipantUpdated;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/ParticipantUpdated;

    goto :goto_13

    :cond_13
    const/4 v0, 0x0

    .line 22
    :goto_13
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-result-object v2

    move-object/from16 v23, v0

    if-eqz v2, :cond_14

    sget-object v0, Lstream/video/sfu/event/ParticipantMigrationComplete;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/ParticipantMigrationComplete;

    goto :goto_14

    :cond_14
    const/4 v0, 0x0

    .line 23
    :goto_14
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object v2

    move-object/from16 v24, v0

    if-eqz v2, :cond_15

    sget-object v0, Lstream/video/sfu/event/ChangePublishOptions;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/ChangePublishOptions;

    goto :goto_15

    :cond_15
    const/4 v0, 0x0

    .line 24
    :goto_15
    invoke-virtual {v1}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object v2

    if-eqz v2, :cond_16

    move-object/from16 v25, v0

    sget-object v0, Lstream/video/sfu/event/InboundStateNotification;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lstream/video/sfu/event/InboundStateNotification;

    move-object/from16 v0, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    goto :goto_16

    :cond_16
    move-object/from16 v2, v23

    move-object/from16 v23, v0

    move-object/from16 v0, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v2

    const/4 v2, 0x0

    .line 25
    :goto_16
    sget-object v25, Lne3/l;->E:Lne3/l;

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v2

    move-object v2, v0

    .line 26
    invoke-virtual/range {v1 .. v25}, Lstream/video/sfu/event/SfuEvent;->copy(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)Lstream/video/sfu/event/SfuEvent;

    move-result-object v0

    return-object v0
.end method

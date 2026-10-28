.class public final Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/Participant;
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
        "stream/video/sfu/models/Participant$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/models/Participant;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/models/Participant;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/models/Participant;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/models/Participant;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Participant;",
        "redact",
        "(Lstream/video/sfu/models/Participant;)Lstream/video/sfu/models/Participant;",
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

    const-string v6, "video/sfu/models/models.proto"

    const-string v3, "type.googleapis.com/stream.video.sfu.models.Participant"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Participant;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Participant;
    .locals 22

    move-object/from16 v1, p1

    const-string v0, "reader"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v0, Lstream/video/sfu/models/ConnectionQuality;->CONNECTION_QUALITY_UNSPECIFIED:Lstream/video/sfu/models/ConnectionQuality;

    .line 4
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 5
    sget-object v2, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    .line 6
    invoke-virtual {v1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v5

    const-string v3, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v0

    move-object v10, v3

    move-object v11, v10

    move-object v12, v7

    move-object v13, v12

    move v15, v8

    move/from16 v16, v15

    move/from16 v17, v9

    move-object v3, v2

    move-object v7, v11

    move-object v8, v7

    move-object v9, v8

    .line 7
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/wire/r;->g()I

    move-result v2

    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    move-object/from16 v19, v3

    .line 8
    sget-object v3, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    packed-switch v2, :pswitch_data_0

    .line 9
    invoke-virtual {v1, v2}, Lcom/squareup/wire/r;->j(I)V

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    goto/16 :goto_2

    .line 10
    :pswitch_0
    :try_start_0
    sget-object v0, Lstream/video/sfu/models/ParticipantSource;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    int-to-long v7, v0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 12
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :pswitch_2
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 13
    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    :goto_1
    move-object/from16 v3, v19

    goto :goto_0

    :pswitch_3
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 14
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    goto :goto_1

    :pswitch_4
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 15
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    goto :goto_1

    :pswitch_5
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 16
    sget-object v0, Lcom/squareup/wire/q;->FLOAT:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    move/from16 v17, v0

    goto :goto_1

    :pswitch_6
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 17
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move/from16 v16, v0

    goto :goto_1

    :pswitch_7
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 18
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v15, v0

    goto :goto_1

    :pswitch_8
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 19
    :try_start_1
    sget-object v0, Lstream/video/sfu/models/ConnectionQuality;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v18, v0

    :goto_2
    move-object/from16 v3, v19

    move-object/from16 v7, v20

    move-object/from16 v8, v21

    goto/16 :goto_0

    :catch_1
    move-exception v0

    .line 20
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v7, v0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_9
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 21
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    :pswitch_a
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 22
    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 23
    :try_start_2
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1, v4}, Lcom/squareup/wire/q;->tryDecode(Lcom/squareup/wire/r;Ljava/util/List;)V
    :try_end_2
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 24
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v7, v0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_c
    move-object/from16 v20, v7

    .line 25
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v21, v8

    .line 26
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_1

    :cond_0
    move-object/from16 v19, v3

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    .line 27
    invoke-virtual {v1, v5, v6}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v0

    .line 28
    new-instance v1, Lstream/video/sfu/models/Participant;

    .line 29
    move-object/from16 v2, v20

    check-cast v2, Ljava/lang/String;

    .line 30
    move-object/from16 v3, v21

    check-cast v3, Ljava/lang/String;

    .line 31
    move-object v5, v12

    check-cast v5, Ljava/time/Instant;

    .line 32
    move-object v6, v9

    check-cast v6, Ljava/lang/String;

    .line 33
    move-object/from16 v7, v18

    check-cast v7, Lstream/video/sfu/models/ConnectionQuality;

    .line 34
    check-cast v10, Ljava/lang/String;

    .line 35
    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    .line 36
    check-cast v13, Ljava/util/Map;

    .line 37
    move-object/from16 v8, v19

    check-cast v8, Lstream/video/sfu/models/ParticipantSource;

    move v9, v15

    move-object v15, v8

    move v8, v9

    move-object v11, v10

    move/from16 v9, v16

    move/from16 v10, v17

    move-object/from16 v16, v0

    .line 38
    invoke-direct/range {v1 .. v16}, Lstream/video/sfu/models/Participant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
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
    check-cast p2, Lstream/video/sfu/models/Participant;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Participant;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Participant;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    :cond_1
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v2, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    .line 8
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/ConnectionQuality;->CONNECTION_QUALITY_UNSPECIFIED:Lstream/video/sfu/models/ConnectionQuality;

    if-eq v0, v2, :cond_4

    .line 11
    sget-object v0, Lstream/video/sfu/models/ConnectionQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 12
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 13
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    .line 14
    invoke-virtual {v0, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 16
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x8

    .line 17
    invoke-virtual {v0, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 18
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/squareup/wire/q;->FLOAT:Lcom/squareup/wire/q;

    .line 19
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x9

    .line 20
    invoke-virtual {v0, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 21
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 22
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 23
    :cond_9
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/16 v1, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 24
    :cond_a
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getRoles()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 25
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    if-eq v0, v1, :cond_b

    .line 26
    sget-object v0, Lstream/video/sfu/models/ParticipantSource;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xe

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 27
    :cond_b
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/models/Participant;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Participant;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Participant;)V
    .locals 5

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 29
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    if-eq v0, v1, :cond_0

    .line 30
    sget-object v0, Lstream/video/sfu/models/ParticipantSource;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xe

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 31
    :cond_0
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getRoles()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 32
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/16 v2, 0xc

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 33
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 34
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 35
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->FLOAT:Lcom/squareup/wire/q;

    .line 36
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v4, 0x9

    .line 37
    invoke-virtual {v1, p1, v4, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 38
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 39
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, 0x8

    .line 40
    invoke-virtual {v1, p1, v4, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 41
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 42
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x7

    .line 43
    invoke-virtual {v1, p1, v4, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 44
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v1

    sget-object v3, Lstream/video/sfu/models/ConnectionQuality;->CONNECTION_QUALITY_UNSPECIFIED:Lstream/video/sfu/models/ConnectionQuality;

    if-eq v1, v3, :cond_7

    .line 45
    sget-object v1, Lstream/video/sfu/models/ConnectionQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v3, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v4

    invoke-virtual {v1, p1, v3, v4}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 46
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    const/4 v1, 0x5

    .line 47
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v3

    .line 48
    invoke-virtual {v0, p1, v1, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 49
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v1

    if-eqz v1, :cond_9

    sget-object v1, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v3, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v4

    invoke-virtual {v1, p1, v3, v4}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 50
    :cond_9
    sget-object v1, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/4 v3, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, p1, v3, v4}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 51
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 52
    :cond_a
    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_b
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Participant;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/models/Participant;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/models/Participant;)I
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
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x2

    .line 6
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8
    :cond_1
    sget-object v1, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/4 v3, 0x3

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 9
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v3, 0x4

    .line 10
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v4

    .line 11
    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 12
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x5

    .line 13
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 15
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v0

    sget-object v3, Lstream/video/sfu/models/ConnectionQuality;->CONNECTION_QUALITY_UNSPECIFIED:Lstream/video/sfu/models/ConnectionQuality;

    if-eq v0, v3, :cond_4

    .line 16
    sget-object v0, Lstream/video/sfu/models/ConnectionQuality;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v3, 0x6

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 17
    :cond_4
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 18
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x7

    .line 19
    invoke-virtual {v0, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 20
    :cond_5
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 21
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->is_dominant_speaker()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, 0x8

    .line 22
    invoke-virtual {v0, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 23
    :cond_6
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/squareup/wire/q;->FLOAT:Lcom/squareup/wire/q;

    .line 24
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v4, 0x9

    .line 25
    invoke-virtual {v0, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 26
    :cond_7
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v3, 0xa

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 27
    :cond_8
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/16 v2, 0xb

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 28
    :cond_9
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/16 v2, 0xc

    .line 29
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v3

    .line 30
    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 31
    :cond_a
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/16 v2, 0xd

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getRoles()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 32
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v1

    sget-object v2, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    if-eq v1, v2, :cond_b

    .line 33
    sget-object v1, Lstream/video/sfu/models/ParticipantSource;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xe

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_b
    return v0
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Participant;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;->redact(Lstream/video/sfu/models/Participant;)Lstream/video/sfu/models/Participant;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/models/Participant;)Lstream/video/sfu/models/Participant;
    .locals 19

    const-string v0, "value"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v3, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/time/Instant;

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v2

    .line 3
    :goto_0
    invoke-virtual {v1}, Lstream/video/sfu/models/Participant;->getCustom()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v2, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    :cond_1
    move-object v13, v2

    .line 4
    sget-object v16, Lne3/l;->E:Lne3/l;

    const/16 v17, 0x37f7

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 5
    invoke-static/range {v1 .. v18}, Lstream/video/sfu/models/Participant;->copy$default(Lstream/video/sfu/models/Participant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/Participant;

    move-result-object v0

    return-object v0
.end method

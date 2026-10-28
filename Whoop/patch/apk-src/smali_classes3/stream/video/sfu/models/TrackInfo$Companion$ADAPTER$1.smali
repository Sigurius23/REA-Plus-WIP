.class public final Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/TrackInfo;
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
        "stream/video/sfu/models/TrackInfo$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/models/TrackInfo;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/models/TrackInfo;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/models/TrackInfo;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/models/TrackInfo;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/models/TrackInfo;",
        "redact",
        "(Lstream/video/sfu/models/TrackInfo;)Lstream/video/sfu/models/TrackInfo;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.models.TrackInfo"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/TrackInfo;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/TrackInfo;
    .locals 18

    move-object/from16 v1, p1

    const-string v0, "reader"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {v1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v2

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v8, v6

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v11

    move v13, v12

    move-object v14, v7

    move-object v6, v5

    move-object v7, v6

    move-object v5, v0

    .line 5
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/wire/r;->g()I

    move-result v15

    const/4 v0, -0x1

    if-eq v15, v0, :cond_2

    const/4 v0, 0x1

    if-eq v15, v0, :cond_1

    const/4 v0, 0x2

    if-eq v15, v0, :cond_0

    packed-switch v15, :pswitch_data_0

    .line 6
    invoke-virtual {v1, v15}, Lcom/squareup/wire/r;->j(I)V

    :goto_1
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    goto/16 :goto_3

    .line 7
    :pswitch_0
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v13, v0

    :goto_2
    move-object/from16 v16, v4

    goto/16 :goto_4

    .line 8
    :pswitch_1
    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v12, v0

    goto :goto_2

    .line 9
    :pswitch_2
    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    goto :goto_2

    .line 10
    :pswitch_3
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v11, v0

    goto :goto_2

    .line 11
    :pswitch_4
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v10, v0

    goto :goto_2

    .line 12
    :pswitch_5
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v9, v0

    goto :goto_2

    .line 13
    :pswitch_6
    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v8, v0

    goto :goto_2

    .line 14
    :pswitch_7
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    goto :goto_2

    .line 15
    :pswitch_8
    sget-object v0, Lstream/video/sfu/models/VideoLayer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_0
    :try_start_0
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 17
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    int-to-long v4, v0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v4, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    invoke-virtual {v1, v15, v4, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    :goto_3
    move-object/from16 v5, v17

    goto :goto_4

    :cond_1
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    .line 18
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    :goto_4
    move-object/from16 v4, v16

    goto/16 :goto_0

    :cond_2
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    .line 19
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v0

    .line 20
    new-instance v1, Lstream/video/sfu/models/TrackInfo;

    .line 21
    move-object v2, v6

    check-cast v2, Ljava/lang/String;

    .line 22
    move-object/from16 v3, v17

    check-cast v3, Lstream/video/sfu/models/TrackType;

    .line 23
    move-object v5, v7

    check-cast v5, Ljava/lang/String;

    .line 24
    check-cast v14, Lstream/video/sfu/models/Codec;

    move v6, v8

    move v7, v9

    move v8, v10

    move v9, v11

    move v11, v12

    move v12, v13

    move-object v10, v14

    move-object v13, v0

    .line 25
    invoke-direct/range {v1 .. v13}, Lstream/video/sfu/models/TrackInfo;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x5
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
    check-cast p2, Lstream/video/sfu/models/TrackInfo;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/TrackInfo;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/TrackInfo;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v2, :cond_1

    .line 5
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    :cond_1
    sget-object v0, Lstream/video/sfu/models/VideoLayer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getLayers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 8
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 9
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 11
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 12
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 13
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 14
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    .line 15
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 16
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 17
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xd

    .line 18
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 19
    :cond_9
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/models/TrackInfo;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/TrackInfo;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/TrackInfo;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 21
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 22
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xd

    .line 23
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 24
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 25
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    .line 26
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 27
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v1, 0xb

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 28
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 29
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 30
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 31
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 32
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 33
    :cond_7
    sget-object v0, Lstream/video/sfu/models/VideoLayer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getLayers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 34
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v2, :cond_8

    .line 35
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 36
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/TrackInfo;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/models/TrackInfo;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/models/TrackInfo;)I
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
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getTrack_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v1

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_1

    .line 6
    sget-object v1, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v3, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 7
    :cond_1
    sget-object v1, Lstream/video/sfu/models/VideoLayer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/4 v3, 0x5

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getLayers()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getMid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 9
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getDtx()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 10
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getStereo()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 11
    :cond_4
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getRed()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 12
    :cond_5
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getMuted()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 13
    :cond_6
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/16 v2, 0xb

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 14
    :cond_7
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 15
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getPublish_option_id()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xc

    .line 16
    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 17
    :cond_8
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 18
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackInfo;->getSelf_sub_audio_video()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/16 v2, 0xd

    .line 19
    invoke-virtual {v0, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    return p1

    :cond_9
    return v1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/TrackInfo;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;->redact(Lstream/video/sfu/models/TrackInfo;)Lstream/video/sfu/models/TrackInfo;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/models/TrackInfo;)Lstream/video/sfu/models/TrackInfo;
    .locals 16

    const-string v0, "value"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lstream/video/sfu/models/TrackInfo;->getLayers()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/VideoLayer;->ADAPTER:Lcom/squareup/wire/q;

    invoke-static {v0, v2}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v4

    .line 3
    invoke-virtual {v1}, Lstream/video/sfu/models/TrackInfo;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/Codec;

    :goto_0
    move-object v10, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :goto_1
    sget-object v13, Lne3/l;->E:Lne3/l;

    const/16 v14, 0x6fb

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 5
    invoke-static/range {v1 .. v15}, Lstream/video/sfu/models/TrackInfo;->copy$default(Lstream/video/sfu/models/TrackInfo;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/TrackInfo;

    move-result-object v0

    return-object v0
.end method

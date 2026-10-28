.class public final Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/VideoSender;
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
        "stream/video/sfu/event/VideoSender$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/VideoSender;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/VideoSender;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/VideoSender;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/VideoSender;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/VideoSender;",
        "redact",
        "(Lstream/video/sfu/event/VideoSender;)Lstream/video/sfu/event/VideoSender;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.event.VideoSender"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/VideoSender;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/VideoSender;
    .locals 13

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    .line 4
    sget-object v1, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    .line 5
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v4

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-wide v7, v4

    move v5, v6

    move-object v6, v2

    move-object v2, v1

    :goto_0
    move-object v1, v0

    .line 6
    :goto_1
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v4

    const/4 v0, -0x1

    if-eq v4, v0, :cond_5

    const/4 v0, 0x2

    if-eq v4, v0, :cond_4

    const/4 v0, 0x3

    if-eq v4, v0, :cond_3

    const/4 v0, 0x4

    .line 7
    sget-object v9, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    if-eq v4, v0, :cond_2

    const/4 v0, 0x5

    if-eq v4, v0, :cond_1

    const/4 v0, 0x6

    if-eq v4, v0, :cond_0

    .line 8
    invoke-virtual {p1, v4}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_1

    .line 9
    :cond_0
    :try_start_0
    sget-object v0, Lstream/video/sfu/models/DegradationPreference;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 10
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v10, v0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v4, v9, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_1

    .line 11
    :cond_1
    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v5, v0

    goto :goto_1

    .line 12
    :cond_2
    :try_start_1
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 13
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v10, v0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v4, v9, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_1

    .line 14
    :cond_3
    sget-object v0, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_4
    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {p1, v7, v8}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v7

    move-object p1, v1

    .line 17
    new-instance v1, Lstream/video/sfu/event/VideoSender;

    .line 18
    check-cast v6, Lstream/video/sfu/models/Codec;

    .line 19
    move-object v4, p1

    check-cast v4, Lstream/video/sfu/models/TrackType;

    .line 20
    check-cast v2, Lstream/video/sfu/models/DegradationPreference;

    move-object v12, v6

    move-object v6, v2

    move-object v2, v12

    .line 21
    invoke-direct/range {v1 .. v7}, Lstream/video/sfu/event/VideoSender;-><init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V

    return-object v1
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/VideoSender;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/VideoSender;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/VideoSender;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    sget-object v0, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getLayers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v1, :cond_1

    .line 6
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 8
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    .line 9
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v0

    .line 11
    sget-object v1, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    if-eq v0, v1, :cond_3

    .line 12
    sget-object v0, Lstream/video/sfu/models/DegradationPreference;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 13
    :cond_3
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/VideoSender;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/VideoSender;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/VideoSender;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 15
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v0

    .line 16
    sget-object v1, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    if-eq v0, v1, :cond_0

    .line 17
    sget-object v0, Lstream/video/sfu/models/DegradationPreference;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 18
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 19
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    .line 20
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 21
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v1, :cond_2

    .line 22
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 23
    :cond_2
    sget-object v0, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getLayers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 24
    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/VideoSender;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/VideoSender;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/VideoSender;)I
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
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_0
    sget-object v1, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->asRepeated()Lcom/squareup/wire/q;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getLayers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v2, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v2, :cond_1

    .line 7
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 8
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    .line 9
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    .line 10
    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 11
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v0

    .line 12
    sget-object v2, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    if-eq v0, v2, :cond_3

    .line 13
    sget-object v0, Lstream/video/sfu/models/DegradationPreference;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    return p1

    :cond_3
    return v1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/VideoSender;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/VideoSender;)Lstream/video/sfu/event/VideoSender;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/VideoSender;)Lstream/video/sfu/event/VideoSender;
    .locals 10

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lstream/video/sfu/models/Codec;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/Codec;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :goto_1
    invoke-virtual {p1}, Lstream/video/sfu/event/VideoSender;->getLayers()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-static {v0, v1}, Ls30/e;->a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;

    move-result-object v3

    .line 4
    sget-object v7, Lne3/l;->E:Lne3/l;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    .line 5
    invoke-static/range {v1 .. v9}, Lstream/video/sfu/event/VideoSender;->copy$default(Lstream/video/sfu/event/VideoSender;Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/VideoSender;

    move-result-object p1

    return-object p1
.end method

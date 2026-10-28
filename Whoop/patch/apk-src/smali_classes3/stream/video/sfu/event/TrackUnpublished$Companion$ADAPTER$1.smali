.class public final Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/TrackUnpublished;
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
        "stream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/TrackUnpublished;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/TrackUnpublished;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/TrackUnpublished;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/TrackUnpublished;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/TrackUnpublished;",
        "redact",
        "(Lstream/video/sfu/event/TrackUnpublished;)Lstream/video/sfu/event/TrackUnpublished;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.event.TrackUnpublished"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/TrackUnpublished;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/TrackUnpublished;
    .locals 16

    move-object/from16 v1, p1

    const-string v0, "reader"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    .line 3
    sget-object v2, Lstream/video/sfu/models/TrackUnpublishReason;->TRACK_UNPUBLISH_REASON_UNSPECIFIED:Lstream/video/sfu/models/TrackUnpublishReason;

    .line 4
    invoke-virtual {v1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v3

    const-string v5, ""

    const/4 v6, 0x0

    move-object v7, v5

    move-object v8, v6

    move-object v5, v2

    move-object v6, v7

    :goto_0
    move-object v2, v0

    .line 5
    :goto_1
    invoke-virtual {v1}, Lcom/squareup/wire/r;->g()I

    move-result v9

    const/4 v0, -0x1

    if-eq v9, v0, :cond_5

    const/4 v0, 0x1

    if-eq v9, v0, :cond_4

    const/4 v0, 0x2

    if-eq v9, v0, :cond_3

    const/4 v0, 0x3

    .line 6
    sget-object v10, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    if-eq v9, v0, :cond_2

    const/4 v0, 0x4

    if-eq v9, v0, :cond_1

    const/4 v0, 0x5

    if-eq v9, v0, :cond_0

    .line 7
    invoke-virtual {v1, v9}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_1

    .line 8
    :cond_0
    sget-object v0, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    .line 9
    :cond_1
    :try_start_0
    sget-object v0, Lstream/video/sfu/models/TrackUnpublishReason;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 10
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v11, v0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v9, v10, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_1

    .line 11
    :cond_2
    :try_start_1
    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 12
    iget v0, v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v11, v0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v9, v10, v0}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_1

    .line 13
    :cond_3
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    .line 14
    :cond_4
    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v0, v1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    goto :goto_1

    .line 15
    :cond_5
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v15

    .line 16
    new-instance v9, Lstream/video/sfu/event/TrackUnpublished;

    .line 17
    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    .line 18
    move-object v11, v7

    check-cast v11, Ljava/lang/String;

    .line 19
    move-object v12, v2

    check-cast v12, Lstream/video/sfu/models/TrackType;

    .line 20
    move-object v13, v5

    check-cast v13, Lstream/video/sfu/models/TrackUnpublishReason;

    .line 21
    move-object v14, v8

    check-cast v14, Lstream/video/sfu/models/Participant;

    .line 22
    invoke-direct/range {v9 .. v15}, Lstream/video/sfu/event/TrackUnpublished;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V

    return-object v9
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/TrackUnpublished;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/TrackUnpublished;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/TrackUnpublished;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v1, :cond_2

    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    .line 6
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v2

    .line 7
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 8
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackUnpublishReason;->TRACK_UNPUBLISH_REASON_UNSPECIFIED:Lstream/video/sfu/models/TrackUnpublishReason;

    if-eq v0, v1, :cond_3

    .line 9
    sget-object v0, Lstream/video/sfu/models/TrackUnpublishReason;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v0, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    .line 11
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v2

    .line 12
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 13
    :cond_4
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/TrackUnpublished;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/TrackUnpublished;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/TrackUnpublished;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 15
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    .line 16
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v2

    .line 17
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 18
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackUnpublishReason;->TRACK_UNPUBLISH_REASON_UNSPECIFIED:Lstream/video/sfu/models/TrackUnpublishReason;

    if-eq v0, v1, :cond_1

    .line 19
    sget-object v0, Lstream/video/sfu/models/TrackUnpublishReason;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 20
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v0, v1, :cond_2

    sget-object v0, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    .line 21
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v2

    .line 22
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 23
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 24
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/TrackUnpublished;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/TrackUnpublished;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/TrackUnpublished;)I
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
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    .line 6
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v1

    sget-object v2, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    if-eq v1, v2, :cond_2

    .line 9
    sget-object v1, Lstream/video/sfu/models/TrackType;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v1

    sget-object v2, Lstream/video/sfu/models/TrackUnpublishReason;->TRACK_UNPUBLISH_REASON_UNSPECIFIED:Lstream/video/sfu/models/TrackUnpublishReason;

    if-eq v1, v2, :cond_3

    .line 11
    sget-object v1, Lstream/video/sfu/models/TrackUnpublishReason;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getCause()Lstream/video/sfu/models/TrackUnpublishReason;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 12
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v1, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    .line 13
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object p1

    .line 14
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
    check-cast p1, Lstream/video/sfu/event/TrackUnpublished;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/TrackUnpublished;)Lstream/video/sfu/event/TrackUnpublished;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/TrackUnpublished;)Lstream/video/sfu/event/TrackUnpublished;
    .locals 10

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/Participant;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :goto_1
    sget-object v7, Lne3/l;->E:Lne3/l;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    .line 4
    invoke-static/range {v1 .. v9}, Lstream/video/sfu/event/TrackUnpublished;->copy$default(Lstream/video/sfu/event/TrackUnpublished;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/TrackUnpublished;

    move-result-object p1

    return-object p1
.end method

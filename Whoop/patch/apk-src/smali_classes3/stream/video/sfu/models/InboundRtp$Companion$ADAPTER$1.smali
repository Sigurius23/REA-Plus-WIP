.class public final Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/InboundRtp;
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
        "stream/video/sfu/models/InboundRtp$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/models/InboundRtp;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/models/InboundRtp;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/models/InboundRtp;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/models/InboundRtp;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/models/InboundRtp;",
        "redact",
        "(Lstream/video/sfu/models/InboundRtp;)Lstream/video/sfu/models/InboundRtp;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.models.InboundRtp"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/InboundRtp;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/InboundRtp;
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "reader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-wide v12, v4

    move-wide v15, v12

    move-wide/from16 v17, v15

    move-wide/from16 v19, v17

    move-wide/from16 v21, v19

    move-wide v10, v6

    move v14, v8

    move/from16 v23, v14

    move-wide/from16 v6, v21

    move-wide v8, v10

    .line 3
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/wire/r;->g()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_7

    const/4 v5, 0x1

    if-eq v4, v5, :cond_6

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    const/4 v5, 0x3

    if-eq v4, v5, :cond_4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_3

    const/4 v5, 0x5

    if-eq v4, v5, :cond_2

    const/16 v5, 0xa

    if-eq v4, v5, :cond_1

    const/16 v5, 0xb

    if-eq v4, v5, :cond_0

    packed-switch v4, :pswitch_data_0

    .line 4
    invoke-virtual {v0, v4}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    .line 5
    :pswitch_0
    sget-object v4, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    .line 6
    :pswitch_1
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide/from16 v21, v4

    goto :goto_0

    .line 7
    :pswitch_2
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide/from16 v19, v4

    goto :goto_0

    .line 8
    :pswitch_3
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide/from16 v17, v4

    goto :goto_0

    .line 9
    :cond_0
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide v15, v4

    goto :goto_0

    .line 10
    :cond_1
    sget-object v4, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move v14, v4

    goto :goto_0

    .line 11
    :cond_2
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide v12, v4

    goto/16 :goto_0

    .line 12
    :cond_3
    sget-object v4, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    move-wide v10, v4

    goto/16 :goto_0

    .line 13
    :cond_4
    sget-object v4, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    move-wide v8, v4

    goto/16 :goto_0

    .line 14
    :cond_5
    sget-object v4, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-wide v6, v4

    goto/16 :goto_0

    .line 15
    :cond_6
    sget-object v3, Lstream/video/sfu/models/RtpBase;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto/16 :goto_0

    .line 16
    :cond_7
    invoke-virtual {v0, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v24

    .line 17
    new-instance v4, Lstream/video/sfu/models/InboundRtp;

    .line 18
    move-object v5, v3

    check-cast v5, Lstream/video/sfu/models/RtpBase;

    .line 19
    invoke-direct/range {v4 .. v24}, Lstream/video/sfu/models/InboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/models/InboundRtp;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/InboundRtp;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/InboundRtp;)V
    .locals 7

    const-wide/16 v0, 0x0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 4
    const-string v1, "writer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "value"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Lstream/video/sfu/models/RtpBase;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 7
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    .line 8
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 9
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 10
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v5, 0x3

    .line 11
    invoke-virtual {v1, p1, v5, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 12
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    sget-object v1, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 13
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    .line 14
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 16
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    .line 17
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 18
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 19
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    .line 20
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 21
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 22
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0xb

    .line 23
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 24
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x14

    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 25
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 26
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x15

    .line 27
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 28
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 29
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/16 v2, 0x16

    .line 30
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 31
    :cond_9
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 32
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x17

    .line 33
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 34
    :cond_a
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/models/InboundRtp;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/InboundRtp;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/InboundRtp;)V
    .locals 7

    const-wide/16 v0, 0x0

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 36
    const-string v1, "writer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "value"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 38
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 39
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x17

    .line 40
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 41
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 42
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x16

    .line 43
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 44
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 45
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x15

    .line 46
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 47
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x14

    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 48
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 49
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0xb

    .line 50
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 51
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 52
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    .line 53
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 54
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object v1, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 55
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    .line 56
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 57
    :cond_6
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    sget-object v1, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 58
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v5, 0x4

    .line 59
    invoke-virtual {v1, p1, v5, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 60
    :cond_7
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_8

    sget-object v1, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 61
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    .line 62
    invoke-virtual {v1, p1, v3, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 63
    :cond_8
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 64
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x2

    .line 65
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 66
    :cond_9
    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v0, Lstream/video/sfu/models/RtpBase;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_a
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/InboundRtp;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/models/InboundRtp;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/models/InboundRtp;)I
    .locals 8

    const-wide/16 v0, 0x0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 3
    const-string v1, "value"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lne3/l;->d()I

    move-result v1

    .line 6
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v2, Lstream/video/sfu/models/RtpBase;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 7
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    .line 8
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getJitter_seconds()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/4 v4, 0x2

    .line 9
    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 10
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    sget-object v2, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 11
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPackets_received()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v6, 0x3

    .line 12
    invoke-virtual {v2, v6, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 13
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    sget-object v2, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    .line 14
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPackets_lost()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x4

    .line 15
    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 16
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 17
    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getPacket_loss_percent()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/4 v4, 0x5

    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 18
    :cond_4
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 19
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getConcealment_events()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0xa

    .line 20
    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 21
    :cond_5
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 22
    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getConcealment_percent()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 23
    :cond_6
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getFps()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/16 v4, 0x14

    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 24
    :cond_7
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 25
    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getFreeze_duration_seconds()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/16 v4, 0x15

    invoke-virtual {v2, v4, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    .line 26
    :cond_8
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 27
    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getAvg_decode_time_seconds()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x16

    invoke-virtual {v0, v3, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 28
    :cond_9
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/squareup/wire/q;->UINT32:Lcom/squareup/wire/q;

    .line 29
    invoke-virtual {p1}, Lstream/video/sfu/models/InboundRtp;->getMin_dimension_px()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/16 v2, 0x17

    .line 30
    invoke-virtual {v0, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    return p1

    :cond_a
    return v1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/InboundRtp;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;->redact(Lstream/video/sfu/models/InboundRtp;)Lstream/video/sfu/models/InboundRtp;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/models/InboundRtp;)Lstream/video/sfu/models/InboundRtp;
    .locals 24

    const-string v0, "value"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lstream/video/sfu/models/InboundRtp;->getBase()Lstream/video/sfu/models/RtpBase;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, Lstream/video/sfu/models/RtpBase;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/RtpBase;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :goto_1
    sget-object v21, Lne3/l;->E:Lne3/l;

    const/16 v22, 0x7fe

    const/16 v23, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    .line 4
    invoke-static/range {v1 .. v23}, Lstream/video/sfu/models/InboundRtp;->copy$default(Lstream/video/sfu/models/InboundRtp;Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/InboundRtp;

    move-result-object v0

    return-object v0
.end method

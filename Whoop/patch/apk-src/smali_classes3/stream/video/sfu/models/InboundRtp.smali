.class public final Lstream/video/sfu/models/InboundRtp;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/InboundRtp$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0018\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0081\u0001\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0087\u0001\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010$\u001a\u0004\u0008%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008(\u0010)R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010*\u001a\u0004\u0008+\u0010,R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010*\u001a\u0004\u0008-\u0010,R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\'\u001a\u0004\u0008.\u0010)R\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010/\u001a\u0004\u00080\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\'\u001a\u0004\u00081\u0010)R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\'\u001a\u0004\u00082\u0010)R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\'\u001a\u0004\u00083\u0010)R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\'\u001a\u0004\u00084\u0010)R\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010/\u001a\u0004\u00085\u0010\u001e\u00a8\u00067"
    }
    d2 = {
        "Lstream/video/sfu/models/InboundRtp;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/RtpBase;",
        "base",
        "",
        "jitter_seconds",
        "",
        "packets_received",
        "packets_lost",
        "packet_loss_percent",
        "",
        "concealment_events",
        "concealment_percent",
        "fps",
        "freeze_duration_seconds",
        "avg_decode_time_seconds",
        "min_dimension_px",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)Lstream/video/sfu/models/InboundRtp;",
        "Lstream/video/sfu/models/RtpBase;",
        "getBase",
        "()Lstream/video/sfu/models/RtpBase;",
        "D",
        "getJitter_seconds",
        "()D",
        "J",
        "getPackets_received",
        "()J",
        "getPackets_lost",
        "getPacket_loss_percent",
        "I",
        "getConcealment_events",
        "getConcealment_percent",
        "getFps",
        "getFreeze_duration_seconds",
        "getAvg_decode_time_seconds",
        "getMin_dimension_px",
        "Companion",
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


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/models/InboundRtp$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final avg_decode_time_seconds:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "avgDecodeTimeSeconds"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x16
    .end annotation
.end field

.field private final base:Lstream/video/sfu/models/RtpBase;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.RtpBase#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final concealment_events:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        jsonName = "concealmentEvents"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xa
    .end annotation
.end field

.field private final concealment_percent:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "concealmentPercent"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xb
    .end annotation
.end field

.field private final fps:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x14
    .end annotation
.end field

.field private final freeze_duration_seconds:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "freezeDurationSeconds"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x15
    .end annotation
.end field

.field private final jitter_seconds:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "jitterSeconds"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final min_dimension_px:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        jsonName = "minDimensionPx"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x17
    .end annotation
.end field

.field private final packet_loss_percent:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "packetLossPercent"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final packets_lost:J
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT64"
        jsonName = "packetsLost"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final packets_received:J
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT64"
        jsonName = "packetsReceived"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/InboundRtp$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/InboundRtp$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/InboundRtp;->Companion:Lstream/video/sfu/models/InboundRtp$Companion;

    const-class v0, Lstream/video/sfu/models/InboundRtp;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/InboundRtp$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/InboundRtp;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 23

    .line 1
    const/16 v21, 0xfff

    const/16 v22, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v22}, Lstream/video/sfu/models/InboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V
    .locals 2

    move-object/from16 v0, p20

    const-string v1, "unknownFields"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v1, Lstream/video/sfu/models/InboundRtp;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v1, v0}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 5
    iput-object p1, p0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    .line 6
    iput-wide p2, p0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    .line 7
    iput-wide p4, p0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    .line 8
    iput-wide p6, p0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    .line 9
    iput-wide p8, p0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    .line 10
    iput p10, p0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    .line 11
    iput-wide p11, p0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    move-wide p1, p13

    .line 12
    iput-wide p1, p0, Lstream/video/sfu/models/InboundRtp;->fps:D

    move-wide/from16 p1, p15

    .line 13
    iput-wide p1, p0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    move-wide/from16 p1, p17

    .line 14
    iput-wide p1, p0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    move/from16 p1, p19

    .line 15
    iput p1, p0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const-wide/16 v5, 0x0

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v0, 0x4

    const-wide/16 v7, 0x0

    if-eqz v2, :cond_2

    move-wide v9, v7

    goto :goto_2

    :cond_2
    move-wide/from16 v9, p4

    :goto_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_4

    const-wide/16 v11, 0x0

    goto :goto_4

    :cond_4
    move-wide/from16 v11, p8

    :goto_4
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    move/from16 v2, p10

    :goto_5
    and-int/lit8 v14, v0, 0x40

    if-eqz v14, :cond_6

    const-wide/16 v14, 0x0

    goto :goto_6

    :cond_6
    move-wide/from16 v14, p11

    :goto_6
    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_7

    const-wide/16 v3, 0x0

    goto :goto_7

    :cond_7
    move-wide/from16 v3, p13

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const-wide/16 v18, 0x0

    goto :goto_8

    :cond_8
    move-wide/from16 v18, p15

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    const-wide/16 v16, 0x0

    goto :goto_9

    :cond_9
    move-wide/from16 v16, p17

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p19

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    .line 2
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p21, v0

    :goto_b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p11, v2

    move-wide/from16 p14, v3

    move-wide/from16 p3, v5

    move-wide/from16 p7, v7

    move-wide/from16 p5, v9

    move-wide/from16 p9, v11

    move/from16 p20, v13

    move-wide/from16 p12, v14

    move-wide/from16 p18, v16

    move-wide/from16 p16, v18

    goto :goto_c

    :cond_b
    move-object/from16 p21, p20

    goto :goto_b

    .line 3
    :goto_c
    invoke-direct/range {p1 .. p21}, Lstream/video/sfu/models/InboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/InboundRtp;Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/InboundRtp;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget-wide v9, v0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p8

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    iget v11, v0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    goto :goto_5

    :cond_5
    move/from16 v11, p10

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget-wide v12, v0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    goto :goto_6

    :cond_6
    move-wide/from16 v12, p11

    :goto_6
    and-int/lit16 v14, v1, 0x80

    if-eqz v14, :cond_7

    iget-wide v14, v0, Lstream/video/sfu/models/InboundRtp;->fps:D

    goto :goto_7

    :cond_7
    move-wide/from16 v14, p13

    :goto_7
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x100

    move-wide/from16 v16, v3

    if-eqz v2, :cond_8

    iget-wide v2, v0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    goto :goto_8

    :cond_8
    move-wide/from16 v2, p15

    :goto_8
    and-int/lit16 v4, v1, 0x200

    move-wide/from16 p2, v2

    if-eqz v4, :cond_9

    iget-wide v2, v0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    goto :goto_9

    :cond_9
    move-wide/from16 v2, p17

    :goto_9
    and-int/lit16 v4, v1, 0x400

    if-eqz v4, :cond_a

    iget v4, v0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    goto :goto_a

    :cond_a
    move/from16 v4, p19

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    move-object/from16 p21, v1

    :goto_b
    move-wide/from16 p16, p2

    move-wide/from16 p18, v2

    move/from16 p20, v4

    move-wide/from16 p5, v5

    move-wide/from16 p7, v7

    move-wide/from16 p9, v9

    move/from16 p11, v11

    move-wide/from16 p12, v12

    move-wide/from16 p14, v14

    move-wide/from16 p3, v16

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_c

    :cond_b
    move-object/from16 p21, p20

    goto :goto_b

    :goto_c
    invoke-virtual/range {p1 .. p21}, Lstream/video/sfu/models/InboundRtp;->copy(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)Lstream/video/sfu/models/InboundRtp;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)Lstream/video/sfu/models/InboundRtp;
    .locals 22

    const-string v0, "unknownFields"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/InboundRtp;

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-wide/from16 v16, p15

    move-wide/from16 v18, p17

    move/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lstream/video/sfu/models/InboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/InboundRtp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/InboundRtp;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    iget-object v3, p1, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget v1, p0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    iget v3, p1, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->fps:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->fps:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget-wide v3, p0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    iget-wide v5, p1, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_8

    iget v1, p0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    iget p1, p1, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0

    :cond_8
    return v2
.end method

.method public final getAvg_decode_time_seconds()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    return-wide v0
.end method

.method public final getBase()Lstream/video/sfu/models/RtpBase;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    return-object v0
.end method

.method public final getConcealment_events()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    return v0
.end method

.method public final getConcealment_percent()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    return-wide v0
.end method

.method public final getFps()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->fps:D

    return-wide v0
.end method

.method public final getFreeze_duration_seconds()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    return-wide v0
.end method

.method public final getJitter_seconds()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    return-wide v0
.end method

.method public final getMin_dimension_px()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    return v0
.end method

.method public final getPacket_loss_percent()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    return-wide v0
.end method

.method public final getPackets_lost()J
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    return-wide v0
.end method

.method public final getPackets_received()J
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/RtpBase;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->fps:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v1, p0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_1
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/models/InboundRtp;->newBuilder()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    return-object v0
.end method

.method public synthetic newBuilder()Ljava/lang/Void;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lstream/video/sfu/models/InboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "base="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->jitter_seconds:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "jitter_seconds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->packets_received:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "packets_received="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->packets_lost:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "packets_lost="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->packet_loss_percent:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "packet_loss_percent="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lstream/video/sfu/models/InboundRtp;->concealment_events:I

    const-string v2, "concealment_events="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->concealment_percent:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "concealment_percent="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->fps:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fps="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->freeze_duration_seconds:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "freeze_duration_seconds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/InboundRtp;->avg_decode_time_seconds:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "avg_decode_time_seconds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lstream/video/sfu/models/InboundRtp;->min_dimension_px:I

    const-string v2, "min_dimension_px="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "InboundRtp{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

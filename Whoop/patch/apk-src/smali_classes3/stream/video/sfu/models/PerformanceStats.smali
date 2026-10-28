.class public final Lstream/video/sfu/models/PerformanceStats;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/PerformanceStats$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/BQ\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJW\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010 \u001a\u0004\u0008!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010&\u001a\u0004\u0008\'\u0010(R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010&\u001a\u0004\u0008)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010*\u001a\u0004\u0008+\u0010,R\u001a\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010-\u001a\u0004\u0008.\u0010\u001a\u00a8\u00060"
    }
    d2 = {
        "Lstream/video/sfu/models/PerformanceStats;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/TrackType;",
        "track_type",
        "Lstream/video/sfu/models/Codec;",
        "codec",
        "",
        "avg_frame_time_ms",
        "avg_fps",
        "Lstream/video/sfu/models/VideoDimension;",
        "video_dimension",
        "",
        "target_bitrate",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)V",
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
        "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)Lstream/video/sfu/models/PerformanceStats;",
        "Lstream/video/sfu/models/TrackType;",
        "getTrack_type",
        "()Lstream/video/sfu/models/TrackType;",
        "Lstream/video/sfu/models/Codec;",
        "getCodec",
        "()Lstream/video/sfu/models/Codec;",
        "F",
        "getAvg_frame_time_ms",
        "()F",
        "getAvg_fps",
        "Lstream/video/sfu/models/VideoDimension;",
        "getVideo_dimension",
        "()Lstream/video/sfu/models/VideoDimension;",
        "I",
        "getTarget_bitrate",
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

.field public static final Companion:Lstream/video/sfu/models/PerformanceStats$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final avg_fps:F
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        jsonName = "avgFps"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final avg_frame_time_ms:F
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        jsonName = "avgFrameTimeMs"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation
.end field

.field private final codec:Lstream/video/sfu/models/Codec;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Codec#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final target_bitrate:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "targetBitrate"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final track_type:Lstream/video/sfu/models/TrackType;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackType#ADAPTER"
        jsonName = "trackType"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final video_dimension:Lstream/video/sfu/models/VideoDimension;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.VideoDimension#ADAPTER"
        jsonName = "videoDimension"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/PerformanceStats$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/PerformanceStats$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/PerformanceStats;->Companion:Lstream/video/sfu/models/PerformanceStats$Companion;

    const-class v0, Lstream/video/sfu/models/PerformanceStats;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/PerformanceStats$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/PerformanceStats$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lstream/video/sfu/models/PerformanceStats;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)V
    .locals 1

    const-string v0, "track_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lstream/video/sfu/models/PerformanceStats;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p7}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput-object p1, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    .line 7
    iput-object p2, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    .line 8
    iput p3, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    .line 9
    iput p4, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    .line 10
    iput-object p5, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    .line 11
    iput p6, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 2
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v1, 0x0

    if-eqz p9, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v1

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    const/4 p6, 0x0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    .line 3
    sget-object p7, Lne3/l;->E:Lne3/l;

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 4
    invoke-direct/range {p2 .. p9}, Lstream/video/sfu/models/PerformanceStats;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/PerformanceStats;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/PerformanceStats;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p7

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lstream/video/sfu/models/PerformanceStats;->copy(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)Lstream/video/sfu/models/PerformanceStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)Lstream/video/sfu/models/PerformanceStats;
    .locals 9

    const-string v0, "track_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/PerformanceStats;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lstream/video/sfu/models/PerformanceStats;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/PerformanceStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/PerformanceStats;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    iget-object v3, p1, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    iget-object v3, p1, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    iget v3, p1, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_7

    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    iget v3, p1, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_7

    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    iget-object v3, p1, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    iget p1, p1, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0

    :cond_7
    return v2
.end method

.method public final getAvg_fps()F
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    return v0
.end method

.method public final getAvg_frame_time_ms()F
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    return v0
.end method

.method public final getCodec()Lstream/video/sfu/models/Codec;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    return-object v0
.end method

.method public final getTarget_bitrate()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    return v0
.end method

.method public final getTrack_type()Lstream/video/sfu/models/TrackType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    return-object v0
.end method

.method public final getVideo_dimension()Lstream/video/sfu/models/VideoDimension;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lstream/video/sfu/models/Codec;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lstream/video/sfu/models/VideoDimension;->hashCode()I

    move-result v3

    :cond_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_2
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/models/PerformanceStats;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->track_type:Lstream/video/sfu/models/TrackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "codec="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->avg_frame_time_ms:F

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "avg_frame_time_ms="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->avg_fps:F

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "avg_fps="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/PerformanceStats;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "video_dimension="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, Lstream/video/sfu/models/PerformanceStats;->target_bitrate:I

    const-string v2, "target_bitrate="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "PerformanceStats{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

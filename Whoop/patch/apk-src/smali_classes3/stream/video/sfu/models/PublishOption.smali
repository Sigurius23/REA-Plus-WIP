.class public final Lstream/video/sfu/models/PublishOption;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/PublishOption$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u001e\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0089\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u008f\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008(\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008+\u0010,R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008.\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u0008/\u0010!R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010-\u001a\u0004\u00080\u0010!R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u00081\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00102\u001a\u0004\u00083\u00104R\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010-\u001a\u0004\u00085\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00106\u001a\u0004\u00087\u00108R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00109\u001a\u0004\u0008:\u0010;R \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010<\u001a\u0004\u0008=\u0010>\u00a8\u0006@"
    }
    d2 = {
        "Lstream/video/sfu/models/PublishOption;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/TrackType;",
        "track_type",
        "Lstream/video/sfu/models/Codec;",
        "codec",
        "",
        "bitrate",
        "fps",
        "max_spatial_layers",
        "max_temporal_layers",
        "Lstream/video/sfu/models/VideoDimension;",
        "video_dimension",
        "id",
        "",
        "use_single_layer",
        "",
        "Lstream/video/sfu/models/AudioBitrate;",
        "audio_bitrate_profiles",
        "Lstream/video/sfu/models/DegradationPreference;",
        "degradation_preference",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/models/PublishOption;",
        "Lstream/video/sfu/models/TrackType;",
        "getTrack_type",
        "()Lstream/video/sfu/models/TrackType;",
        "Lstream/video/sfu/models/Codec;",
        "getCodec",
        "()Lstream/video/sfu/models/Codec;",
        "I",
        "getBitrate",
        "getFps",
        "getMax_spatial_layers",
        "getMax_temporal_layers",
        "Lstream/video/sfu/models/VideoDimension;",
        "getVideo_dimension",
        "()Lstream/video/sfu/models/VideoDimension;",
        "getId",
        "Z",
        "getUse_single_layer",
        "()Z",
        "Lstream/video/sfu/models/DegradationPreference;",
        "getDegradation_preference",
        "()Lstream/video/sfu/models/DegradationPreference;",
        "Ljava/util/List;",
        "getAudio_bitrate_profiles",
        "()Ljava/util/List;",
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

.field public static final Companion:Lstream/video/sfu/models/PublishOption$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final audio_bitrate_profiles:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.AudioBitrate#ADAPTER"
        jsonName = "audioBitrateProfiles"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0xa
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/AudioBitrate;",
            ">;"
        }
    .end annotation
.end field

.field private final bitrate:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
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

.field private final degradation_preference:Lstream/video/sfu/models/DegradationPreference;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.DegradationPreference#ADAPTER"
        jsonName = "degradationPreference"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xb
    .end annotation
.end field

.field private final fps:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x8
    .end annotation
.end field

.field private final max_spatial_layers:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "maxSpatialLayers"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final max_temporal_layers:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "maxTemporalLayers"
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

.field private final use_single_layer:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        jsonName = "useSingleLayer"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x9
    .end annotation
.end field

.field private final video_dimension:Lstream/video/sfu/models/VideoDimension;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.VideoDimension#ADAPTER"
        jsonName = "videoDimension"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/PublishOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/PublishOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/PublishOption;->Companion:Lstream/video/sfu/models/PublishOption$Companion;

    const-class v0, Lstream/video/sfu/models/PublishOption;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/PublishOption$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/PublishOption$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/PublishOption;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lstream/video/sfu/models/PublishOption;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/TrackType;",
            "Lstream/video/sfu/models/Codec;",
            "IIII",
            "Lstream/video/sfu/models/VideoDimension;",
            "IZ",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/AudioBitrate;",
            ">;",
            "Lstream/video/sfu/models/DegradationPreference;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "track_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audio_bitrate_profiles"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "degradation_preference"

    invoke-static {p11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "unknownFields"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v1, Lstream/video/sfu/models/PublishOption;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v1, p12}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 8
    iput-object p1, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    .line 9
    iput-object p2, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    .line 10
    iput p3, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    .line 11
    iput p4, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    .line 12
    iput p5, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    .line 13
    iput p6, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    .line 14
    iput-object p7, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    .line 15
    iput p8, p0, Lstream/video/sfu/models/PublishOption;->id:I

    .line 16
    iput-boolean p9, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    .line 17
    iput-object p11, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    .line 18
    invoke-static {v0, p10}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 2
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object p2, v2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move p3, v3

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_0

    :cond_3
    move v1, p4

    :goto_0
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    move v4, v3

    goto :goto_1

    :cond_4
    move v4, p5

    :goto_1
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_2

    :cond_5
    move v5, p6

    :goto_2
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    move-object/from16 v2, p7

    :goto_3
    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_7

    move v6, v3

    goto :goto_4

    :cond_7
    move/from16 v6, p8

    :goto_4
    and-int/lit16 v7, v0, 0x100

    if-eqz v7, :cond_8

    goto :goto_5

    :cond_8
    move/from16 v3, p9

    :goto_5
    and-int/lit16 v7, v0, 0x200

    if-eqz v7, :cond_9

    .line 3
    sget-object v7, Lm83/y;->w:Lm83/y;

    goto :goto_6

    :cond_9
    move-object/from16 v7, p10

    :goto_6
    and-int/lit16 v8, v0, 0x400

    if-eqz v8, :cond_a

    .line 4
    sget-object v8, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    goto :goto_7

    :cond_a
    move-object/from16 v8, p11

    :goto_7
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    .line 5
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p14, v0

    :goto_8
    move-object p4, p2

    move p5, p3

    move p6, v1

    move-object/from16 p9, v2

    move/from16 p11, v3

    move/from16 p7, v4

    move/from16 p8, v5

    move/from16 p10, v6

    move-object/from16 p12, v7

    move-object/from16 p13, v8

    move-object p2, p0

    move-object p3, p1

    goto :goto_9

    :cond_b
    move-object/from16 p14, p12

    goto :goto_8

    .line 6
    :goto_9
    invoke-direct/range {p2 .. p14}, Lstream/video/sfu/models/PublishOption;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/PublishOption;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/PublishOption;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lstream/video/sfu/models/PublishOption;->id:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p12

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lstream/video/sfu/models/PublishOption;->copy(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/models/PublishOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/models/PublishOption;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/TrackType;",
            "Lstream/video/sfu/models/Codec;",
            "IIII",
            "Lstream/video/sfu/models/VideoDimension;",
            "IZ",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/AudioBitrate;",
            ">;",
            "Lstream/video/sfu/models/DegradationPreference;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/models/PublishOption;"
        }
    .end annotation

    const-string v0, "track_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audio_bitrate_profiles"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "degradation_preference"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/PublishOption;

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v13}, Lstream/video/sfu/models/PublishOption;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/PublishOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/PublishOption;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    iget-object v3, p1, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    iget-object v3, p1, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    iget v3, p1, Lstream/video/sfu/models/PublishOption;->bitrate:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    iget v3, p1, Lstream/video/sfu/models/PublishOption;->fps:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    iget v3, p1, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    iget v3, p1, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    iget-object v3, p1, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->id:I

    iget v3, p1, Lstream/video/sfu/models/PublishOption;->id:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    iget-object p1, p1, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAudio_bitrate_profiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/AudioBitrate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    return-object v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    return v0
.end method

.method public final getCodec()Lstream/video/sfu/models/Codec;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    return-object v0
.end method

.method public final getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    return-object v0
.end method

.method public final getFps()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->id:I

    return v0
.end method

.method public final getMax_spatial_layers()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    return v0
.end method

.method public final getMax_temporal_layers()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    return v0
.end method

.method public final getTrack_type()Lstream/video/sfu/models/TrackType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    return-object v0
.end method

.method public final getUse_single_layer()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    return v0
.end method

.method public final getVideo_dimension()Lstream/video/sfu/models/VideoDimension;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

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

    iget-object v2, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

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

    iget v0, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lstream/video/sfu/models/VideoDimension;->hashCode()I

    move-result v3

    :cond_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lstream/video/sfu/models/PublishOption;->id:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    invoke-virtual {p0}, Lstream/video/sfu/models/PublishOption;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->track_type:Lstream/video/sfu/models/TrackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "codec="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->bitrate:I

    const-string v2, "bitrate="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/models/PublishOption;->fps:I

    const-string v2, "fps="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/models/PublishOption;->max_spatial_layers:I

    const-string v2, "max_spatial_layers="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/models/PublishOption;->max_temporal_layers:I

    const-string v2, "max_temporal_layers="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->video_dimension:Lstream/video/sfu/models/VideoDimension;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "video_dimension="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, Lstream/video/sfu/models/PublishOption;->id:I

    const-string v2, "id="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/PublishOption;->use_single_layer:Z

    const-string v2, "use_single_layer="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->audio_bitrate_profiles:Ljava/util/List;

    const-string v2, "audio_bitrate_profiles="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/PublishOption;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "degradation_preference="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "PublishOption{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lstream/video/sfu/models/TrackInfo;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/TrackInfo$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008 \u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0087\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u008d\u0001\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008(\u0010)R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010%\u001a\u0004\u0008*\u0010\"R\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010+\u001a\u0004\u0008,\u0010-R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010+\u001a\u0004\u0008.\u0010-R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010+\u001a\u0004\u0008/\u0010-R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010+\u001a\u0004\u00080\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00101\u001a\u0004\u00082\u00103R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00104\u001a\u0004\u00085\u0010 R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010+\u001a\u0004\u00086\u0010-R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00088\u00109\u00a8\u0006;"
    }
    d2 = {
        "Lstream/video/sfu/models/TrackInfo;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "track_id",
        "Lstream/video/sfu/models/TrackType;",
        "track_type",
        "",
        "Lstream/video/sfu/models/VideoLayer;",
        "layers",
        "mid",
        "",
        "dtx",
        "stereo",
        "red",
        "muted",
        "Lstream/video/sfu/models/Codec;",
        "codec",
        "",
        "publish_option_id",
        "self_sub_audio_video",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)Lstream/video/sfu/models/TrackInfo;",
        "Ljava/lang/String;",
        "getTrack_id",
        "Lstream/video/sfu/models/TrackType;",
        "getTrack_type",
        "()Lstream/video/sfu/models/TrackType;",
        "getMid",
        "Z",
        "getDtx",
        "()Z",
        "getStereo",
        "getRed",
        "getMuted",
        "Lstream/video/sfu/models/Codec;",
        "getCodec",
        "()Lstream/video/sfu/models/Codec;",
        "I",
        "getPublish_option_id",
        "getSelf_sub_audio_video",
        "Ljava/util/List;",
        "getLayers",
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

.field public static final Companion:Lstream/video/sfu/models/TrackInfo$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final codec:Lstream/video/sfu/models/Codec;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Codec#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xb
    .end annotation
.end field

.field private final dtx:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field

.field private final layers:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.VideoLayer#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/VideoLayer;",
            ">;"
        }
    .end annotation
.end field

.field private final mid:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final muted:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xa
    .end annotation
.end field

.field private final publish_option_id:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "publishOptionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xc
    .end annotation
.end field

.field private final red:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x9
    .end annotation
.end field

.field private final self_sub_audio_video:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        jsonName = "selfSubAudioVideo"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xd
    .end annotation
.end field

.field private final stereo:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x8
    .end annotation
.end field

.field private final track_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "trackId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final track_type:Lstream/video/sfu/models/TrackType;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackType#ADAPTER"
        jsonName = "trackType"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/TrackInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/TrackInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/TrackInfo;->Companion:Lstream/video/sfu/models/TrackInfo$Companion;

    const-class v0, Lstream/video/sfu/models/TrackInfo;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/TrackInfo$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

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

    invoke-direct/range {v0 .. v14}, Lstream/video/sfu/models/TrackInfo;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/TrackType;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/VideoLayer;",
            ">;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Lstream/video/sfu/models/Codec;",
            "IZ",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "track_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track_type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mid"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "unknownFields"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v1, Lstream/video/sfu/models/TrackInfo;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v1, p12}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 8
    iput-object p1, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    .line 10
    iput-object p4, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    .line 11
    iput-boolean p5, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    .line 12
    iput-boolean p6, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    .line 13
    iput-boolean p7, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    .line 14
    iput-boolean p8, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    .line 15
    iput-object p9, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    .line 16
    iput p10, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    .line 17
    iput-boolean p11, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    .line 18
    invoke-static {v0, p3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    .line 2
    const-string v0, ""

    if-eqz p14, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    .line 3
    sget-object p2, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    .line 4
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p14, p13, 0x10

    const/4 v0, 0x0

    if-eqz p14, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    const/4 p9, 0x0

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    move p11, v0

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    .line 5
    sget-object p12, Lne3/l;->E:Lne3/l;

    :cond_b
    move-object p13, p12

    move p12, p11

    move p11, p10

    move-object p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 6
    invoke-direct/range {p1 .. p13}, Lstream/video/sfu/models/TrackInfo;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/TrackInfo;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/TrackInfo;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-boolean p5, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-boolean p7, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-boolean p11, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p12

    :cond_b
    move p13, p11

    move-object p14, p12

    move-object p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lstream/video/sfu/models/TrackInfo;->copy(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)Lstream/video/sfu/models/TrackInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)Lstream/video/sfu/models/TrackInfo;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/TrackType;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/VideoLayer;",
            ">;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Lstream/video/sfu/models/Codec;",
            "IZ",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/models/TrackInfo;"
        }
    .end annotation

    const-string v0, "track_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track_type"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layers"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mid"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/TrackInfo;

    move-object v2, p1

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lstream/video/sfu/models/TrackInfo;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/TrackInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/TrackInfo;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    iget-object v3, p1, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/TrackInfo;->red:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/TrackInfo;->muted:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    iget-object v3, p1, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    iget v3, p1, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    iget-boolean p1, p1, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCodec()Lstream/video/sfu/models/Codec;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    return-object v0
.end method

.method public final getDtx()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    return v0
.end method

.method public final getLayers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/VideoLayer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    return-object v0
.end method

.method public final getMid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    return-object v0
.end method

.method public final getMuted()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    return v0
.end method

.method public final getPublish_option_id()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    return v0
.end method

.method public final getRed()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    return v0
.end method

.method public final getSelf_sub_audio_video()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    return v0
.end method

.method public final getStereo()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    return v0
.end method

.method public final getTrack_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrack_type()Lstream/video/sfu/models/TrackType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/Codec;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    invoke-virtual {p0}, Lstream/video/sfu/models/TrackInfo;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->track_id:Ljava/lang/String;

    const-string v2, "track_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->track_type:Lstream/video/sfu/models/TrackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->layers:Ljava/util/List;

    const-string v2, "layers="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->mid:Ljava/lang/String;

    const-string v2, "mid="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->dtx:Z

    const-string v2, "dtx="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->stereo:Z

    const-string v2, "stereo="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->red:Z

    const-string v2, "red="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->muted:Z

    const-string v2, "muted="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/models/TrackInfo;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "codec="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, Lstream/video/sfu/models/TrackInfo;->publish_option_id:I

    const-string v2, "publish_option_id="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/TrackInfo;->self_sub_audio_video:Z

    const-string v2, "self_sub_audio_video="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "TrackInfo{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

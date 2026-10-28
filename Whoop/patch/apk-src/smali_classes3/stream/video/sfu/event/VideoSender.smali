.class public final Lstream/video/sfu/event/VideoSender;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/VideoSender$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BK\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJQ\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010&\u001a\u0004\u0008\'\u0010\u001aR\u001a\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010(\u001a\u0004\u0008)\u0010*R \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lstream/video/sfu/event/VideoSender;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/Codec;",
        "codec",
        "",
        "Lstream/video/sfu/event/VideoLayerSetting;",
        "layers",
        "Lstream/video/sfu/models/TrackType;",
        "track_type",
        "",
        "publish_option_id",
        "Lstream/video/sfu/models/DegradationPreference;",
        "degradation_preference",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V",
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
        "(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/event/VideoSender;",
        "Lstream/video/sfu/models/Codec;",
        "getCodec",
        "()Lstream/video/sfu/models/Codec;",
        "Lstream/video/sfu/models/TrackType;",
        "getTrack_type",
        "()Lstream/video/sfu/models/TrackType;",
        "I",
        "getPublish_option_id",
        "Lstream/video/sfu/models/DegradationPreference;",
        "getDegradation_preference",
        "()Lstream/video/sfu/models/DegradationPreference;",
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

.field public static final Companion:Lstream/video/sfu/event/VideoSender$Companion;

.field private static final serialVersionUID:J


# instance fields
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
        tag = 0x6
    .end annotation
.end field

.field private final layers:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.VideoLayerSetting#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/event/VideoLayerSetting;",
            ">;"
        }
    .end annotation
.end field

.field private final publish_option_id:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "publishOptionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final track_type:Lstream/video/sfu/models/TrackType;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackType#ADAPTER"
        jsonName = "trackType"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/VideoSender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/VideoSender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/VideoSender;->Companion:Lstream/video/sfu/event/VideoSender$Companion;

    const-class v0, Lstream/video/sfu/event/VideoSender;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/VideoSender$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/VideoSender;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lstream/video/sfu/event/VideoSender;-><init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/Codec;",
            "Ljava/util/List<",
            "Lstream/video/sfu/event/VideoLayerSetting;",
            ">;",
            "Lstream/video/sfu/models/TrackType;",
            "I",
            "Lstream/video/sfu/models/DegradationPreference;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "layers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "track_type"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "degradation_preference"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "unknownFields"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v1, Lstream/video/sfu/event/VideoSender;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v1, p6}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 8
    iput-object p1, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    .line 9
    iput-object p3, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    .line 10
    iput p4, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    .line 11
    iput-object p5, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    .line 12
    invoke-static {v0, p2}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 3
    sget-object p3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    const/4 p4, 0x0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 4
    sget-object p5, Lstream/video/sfu/models/DegradationPreference;->DEGRADATION_PREFERENCE_UNSPECIFIED:Lstream/video/sfu/models/DegradationPreference;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 5
    sget-object p6, Lne3/l;->E:Lne3/l;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 6
    invoke-direct/range {p2 .. p8}, Lstream/video/sfu/event/VideoSender;-><init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/VideoSender;Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/VideoSender;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p6

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lstream/video/sfu/event/VideoSender;->copy(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/event/VideoSender;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/event/VideoSender;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/Codec;",
            "Ljava/util/List<",
            "Lstream/video/sfu/event/VideoLayerSetting;",
            ">;",
            "Lstream/video/sfu/models/TrackType;",
            "I",
            "Lstream/video/sfu/models/DegradationPreference;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/event/VideoSender;"
        }
    .end annotation

    const-string v0, "layers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track_type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "degradation_preference"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/VideoSender;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lstream/video/sfu/event/VideoSender;-><init>(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/VideoSender;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/VideoSender;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    iget-object v3, p1, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    iget-object v3, p1, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    iget v3, p1, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    iget-object p1, p1, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCodec()Lstream/video/sfu/models/Codec;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    return-object v0
.end method

.method public final getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    return-object v0
.end method

.method public final getLayers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/event/VideoLayerSetting;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    return-object v0
.end method

.method public final getPublish_option_id()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    return v0
.end method

.method public final getTrack_type()Lstream/video/sfu/models/TrackType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

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

    iget-object v2, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/Codec;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    invoke-virtual {p0}, Lstream/video/sfu/event/VideoSender;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "codec="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->layers:Ljava/util/List;

    const-string v2, "layers="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->track_type:Lstream/video/sfu/models/TrackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lstream/video/sfu/event/VideoSender;->publish_option_id:I

    const-string v2, "publish_option_id="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/event/VideoSender;->degradation_preference:Lstream/video/sfu/models/DegradationPreference;

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

    const-string v2, "VideoSender{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

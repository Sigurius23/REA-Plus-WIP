.class public final Lstream/video/sfu/event/VideoLayerSetting;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/VideoLayerSetting$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u001a\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BY\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ_\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001f\u001a\u0004\u0008 \u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010$\u001a\u0004\u0008%\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010&\u001a\u0004\u0008\'\u0010(R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010)\u001a\u0004\u0008*\u0010+R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010$\u001a\u0004\u0008,\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u001f\u001a\u0004\u0008-\u0010\u001c\u00a8\u0006/"
    }
    d2 = {
        "Lstream/video/sfu/event/VideoLayerSetting;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "name",
        "",
        "active",
        "",
        "max_bitrate",
        "",
        "scale_resolution_down_by",
        "Lstream/video/sfu/models/Codec;",
        "codec",
        "max_framerate",
        "scalability_mode",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)V",
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
        "(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)Lstream/video/sfu/event/VideoLayerSetting;",
        "Ljava/lang/String;",
        "getName",
        "Z",
        "getActive",
        "()Z",
        "I",
        "getMax_bitrate",
        "F",
        "getScale_resolution_down_by",
        "()F",
        "Lstream/video/sfu/models/Codec;",
        "getCodec",
        "()Lstream/video/sfu/models/Codec;",
        "getMax_framerate",
        "getScalability_mode",
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

.field public static final Companion:Lstream/video/sfu/event/VideoLayerSetting$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final active:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final codec:Lstream/video/sfu/models/Codec;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Codec#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final max_bitrate:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
        jsonName = "maxBitrate"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation
.end field

.field private final max_framerate:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        jsonName = "maxFramerate"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final scalability_mode:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "scalabilityMode"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x8
    .end annotation
.end field

.field private final scale_resolution_down_by:F
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        jsonName = "scaleResolutionDownBy"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/VideoLayerSetting$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/VideoLayerSetting$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/VideoLayerSetting;->Companion:Lstream/video/sfu/event/VideoLayerSetting$Companion;

    const-class v0, Lstream/video/sfu/event/VideoLayerSetting;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/VideoLayerSetting$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/VideoLayerSetting$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lstream/video/sfu/event/VideoLayerSetting;-><init>(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scalability_mode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lstream/video/sfu/event/VideoLayerSetting;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p8}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput-object p1, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    .line 7
    iput-boolean p2, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    .line 8
    iput p3, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    .line 9
    iput p4, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    .line 10
    iput-object p5, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    .line 11
    iput p6, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    .line 12
    iput-object p7, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p10, p9, 0x1

    .line 2
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const/4 v1, 0x0

    if-eqz p10, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    const/4 p4, 0x0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    const/4 p5, 0x0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v1

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 3
    sget-object p8, Lne3/l;->E:Lne3/l;

    :cond_7
    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p9}, Lstream/video/sfu/event/VideoLayerSetting;-><init>(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/VideoLayerSetting;Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/VideoLayerSetting;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-boolean p2, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p8

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lstream/video/sfu/event/VideoLayerSetting;->copy(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)Lstream/video/sfu/event/VideoLayerSetting;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)Lstream/video/sfu/event/VideoLayerSetting;
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scalability_mode"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/VideoLayerSetting;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lstream/video/sfu/event/VideoLayerSetting;-><init>(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/VideoLayerSetting;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/VideoLayerSetting;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    iget-boolean v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    iget v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    iget v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_9

    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    iget-object v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    iget v3, p1, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    iget-object p1, p1, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0

    :cond_9
    return v2
.end method

.method public final getActive()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    return v0
.end method

.method public final getCodec()Lstream/video/sfu/models/Codec;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    return-object v0
.end method

.method public final getMax_bitrate()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    return v0
.end method

.method public final getMax_framerate()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getScalability_mode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    return-object v0
.end method

.method public final getScale_resolution_down_by()F
    .locals 1

    iget v0, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    return v0
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

    iget-object v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/Codec;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    invoke-virtual {p0}, Lstream/video/sfu/event/VideoLayerSetting;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->name:Ljava/lang/String;

    const-string v2, "name="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->active:Z

    const-string v2, "active="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_bitrate:I

    const-string v2, "max_bitrate="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->scale_resolution_down_by:F

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "scale_resolution_down_by="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->codec:Lstream/video/sfu/models/Codec;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "codec="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->max_framerate:I

    const-string v2, "max_framerate="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/event/VideoLayerSetting;->scalability_mode:Ljava/lang/String;

    const-string v2, "scalability_mode="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "VideoLayerSetting{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

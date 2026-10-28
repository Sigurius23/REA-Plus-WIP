.class public final Lstream/video/sfu/models/OutboundRtp;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/OutboundRtp$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0018\u0000 \'2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'BE\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010 \u001a\u0004\u0008#\u0010\"R\u001a\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010 \u001a\u0004\u0008$\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010%\u001a\u0004\u0008&\u0010\u0017\u00a8\u0006("
    }
    d2 = {
        "Lstream/video/sfu/models/OutboundRtp;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/RtpBase;",
        "base",
        "",
        "fps",
        "avg_encode_time_seconds",
        "bitrate_bps",
        "",
        "min_dimension_px",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)V",
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
        "(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)Lstream/video/sfu/models/OutboundRtp;",
        "Lstream/video/sfu/models/RtpBase;",
        "getBase",
        "()Lstream/video/sfu/models/RtpBase;",
        "D",
        "getFps",
        "()D",
        "getAvg_encode_time_seconds",
        "getBitrate_bps",
        "I",
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

.field public static final Companion:Lstream/video/sfu/models/OutboundRtp$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final avg_encode_time_seconds:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "avgEncodeTimeSeconds"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xb
    .end annotation
.end field

.field private final base:Lstream/video/sfu/models/RtpBase;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.RtpBase#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final bitrate_bps:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "bitrateBps"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xc
    .end annotation
.end field

.field private final fps:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xa
    .end annotation
.end field

.field private final min_dimension_px:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        jsonName = "minDimensionPx"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xd
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/OutboundRtp$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/OutboundRtp$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/OutboundRtp;->Companion:Lstream/video/sfu/models/OutboundRtp$Companion;

    const-class v0, Lstream/video/sfu/models/OutboundRtp;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/OutboundRtp$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/OutboundRtp$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/OutboundRtp;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lstream/video/sfu/models/OutboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DDDILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)V
    .locals 1

    const-string v0, "unknownFields"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lstream/video/sfu/models/OutboundRtp;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p9}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 5
    iput-object p1, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    .line 6
    iput-wide p2, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    .line 7
    iput-wide p4, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    .line 8
    iput-wide p6, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    .line 9
    iput p8, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/RtpBase;DDDILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    const-wide/16 v0, 0x0

    if-eqz p11, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move-wide p6, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    const/4 p8, 0x0

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    .line 2
    sget-object p9, Lne3/l;->E:Lne3/l;

    :cond_5
    move p10, p8

    move-object p11, p9

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    .line 3
    invoke-direct/range {p2 .. p11}, Lstream/video/sfu/models/OutboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/OutboundRtp;Lstream/video/sfu/models/RtpBase;DDDILne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/OutboundRtp;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-wide p2, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-wide p4, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-wide p6, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p8, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p9

    :cond_5
    move p10, p8

    move-object p11, p9

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lstream/video/sfu/models/OutboundRtp;->copy(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)Lstream/video/sfu/models/OutboundRtp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)Lstream/video/sfu/models/OutboundRtp;
    .locals 11

    const-string v0, "unknownFields"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/OutboundRtp;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lstream/video/sfu/models/OutboundRtp;-><init>(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/OutboundRtp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/OutboundRtp;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    iget-object v3, p1, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    iget-wide v5, p1, Lstream/video/sfu/models/OutboundRtp;->fps:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_5

    iget-wide v3, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    iget-wide v5, p1, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_5

    iget-wide v3, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    iget-wide v5, p1, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_5

    iget v1, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    iget p1, p1, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0

    :cond_5
    return v2
.end method

.method public final getAvg_encode_time_seconds()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    return-wide v0
.end method

.method public final getBase()Lstream/video/sfu/models/RtpBase;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    return-object v0
.end method

.method public final getBitrate_bps()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    return-wide v0
.end method

.method public final getFps()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    return-wide v0
.end method

.method public final getMin_dimension_px()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    return v0
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

    iget-object v2, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/RtpBase;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v1, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

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
    invoke-virtual {p0}, Lstream/video/sfu/models/OutboundRtp;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/models/OutboundRtp;->base:Lstream/video/sfu/models/RtpBase;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "base="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-wide v1, p0, Lstream/video/sfu/models/OutboundRtp;->fps:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fps="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/OutboundRtp;->avg_encode_time_seconds:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "avg_encode_time_seconds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lstream/video/sfu/models/OutboundRtp;->bitrate_bps:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bitrate_bps="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lstream/video/sfu/models/OutboundRtp;->min_dimension_px:I

    const-string v2, "min_dimension_px="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "OutboundRtp{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

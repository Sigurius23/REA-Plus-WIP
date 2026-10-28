.class public final Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bc\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0010\u0010%\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jd\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010(J\u0010\u0010/\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u00022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00088\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00089\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010?\u001a\u0004\u0008@\u0010+\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;",
        "",
        "",
        "visible",
        "",
        "positionX",
        "positionBottomY",
        "positionTopY",
        "Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;",
        "style",
        "",
        "accessibilityLabel",
        "graphLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "dataScrubberDetails",
        "<init>",
        "(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "copy",
        "(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getVisible",
        "D",
        "getPositionX",
        "getPositionBottomY",
        "getPositionTopY",
        "Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;",
        "getStyle",
        "Ljava/lang/String;",
        "getAccessibilityLabel",
        "getGraphLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "getDataScrubberDetails",
        "Companion",
        "$serializer",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;


# instance fields
.field private final accessibilityLabel:Ljava/lang/String;

.field private final dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

.field private final graphLabel:Ljava/lang/String;

.field private final positionBottomY:D

.field private final positionTopY:D

.field private final positionX:D

.field private final style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

.field private final visible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->Companion:Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lnx1/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lnx1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0xff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;-><init>(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    if-nez p13, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-boolean p2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    and-int/lit8 p2, p1, 0x2

    const-wide/16 v0, 0x0

    if-nez p2, :cond_1

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    goto :goto_0

    :cond_1
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    goto :goto_1

    :cond_2
    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    goto :goto_2

    :cond_3
    iput-wide p7, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 3
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 5
    const-string p2, ""

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    :goto_5
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-void

    :cond_7
    iput-object p12, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-void
.end method

.method public constructor <init>(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibilityLabel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-boolean p1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    .line 9
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    .line 10
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    .line 11
    iput-wide p6, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-void
.end method

.method public synthetic constructor <init>(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    const-wide/16 v0, 0x0

    if-eqz p13, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-wide p6, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    .line 16
    sget-object p8, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    .line 17
    const-string p9, ""

    :cond_5
    and-int/lit8 p13, p12, 0x40

    const/4 v0, 0x0

    if-eqz p13, :cond_6

    move-object p10, v0

    :cond_6
    and-int/lit16 p12, p12, 0x80

    if-eqz p12, :cond_7

    move-object p13, v0

    move-object p11, p9

    move-object p12, p10

    move-object p10, p8

    :goto_0
    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    goto :goto_1

    :cond_7
    move-object p13, p11

    move-object p12, p10

    move-object p10, p8

    move-object p11, p9

    goto :goto_0

    .line 18
    :goto_1
    invoke-direct/range {p2 .. p13}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;-><init>(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.band.BandPointStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->values()[Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-boolean p1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-wide p6, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p9, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p10, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p12, 0x80

    if-eqz p12, :cond_7

    iget-object p11, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :cond_7
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->copy(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    if-eqz v2, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_5

    :goto_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_7

    :goto_3
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :goto_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    return-wide v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final copy(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;
    .locals 13

    const-string v0, "style"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibilityLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;

    move v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;-><init>(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;

    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final getGraphLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getPositionBottomY()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    return-wide v0
.end method

.method public final getPositionTopY()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    return-wide v0
.end method

.method public final getPositionX()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    return-wide v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    return-object v0
.end method

.method public final getVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->visible:Z

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionX:D

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionBottomY:D

    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->positionTopY:D

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    iget-object v8, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->graphLabel:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "BandDataPointModel(visible="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", positionX="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", positionBottomY="

    const-string v1, ", positionTopY="

    invoke-static {v11, v0, v3, v4, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accessibilityLabel="

    const-string v1, ", graphLabel="

    invoke-static {v11, v0, v8, v1, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", dataScrubberDetails="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

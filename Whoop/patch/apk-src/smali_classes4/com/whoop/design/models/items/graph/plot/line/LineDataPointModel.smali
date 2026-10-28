.class public final Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGB_\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Be\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jh\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010)J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00106\u001a\u00020\u00022\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010:\u001a\u0004\u0008;\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008<\u0010$R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008>\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010?\u001a\u0004\u0008@\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008B\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008D\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010E\u001a\u0004\u0008F\u0010/\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;",
        "",
        "",
        "visible",
        "",
        "positionX",
        "positionY",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;",
        "style",
        "",
        "accessibilityLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "dataScrubberDetails",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "graphLabel",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
        "theme",
        "<init>",
        "(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()D",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "component7",
        "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "component8",
        "()Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
        "copy",
        "(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;",
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
        "getPositionY",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;",
        "getStyle",
        "Ljava/lang/String;",
        "getAccessibilityLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "getDataScrubberDetails",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "getGraphLabel",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
        "getTheme",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;


# instance fields
.field private final accessibilityLabel:Ljava/lang/String;

.field private final dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

.field private final graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

.field private final positionX:D

.field private final positionY:D

.field private final style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

.field private final theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

.field private final visible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->Companion:Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lma1/a;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lma1/a;-><init>(I)V

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

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;-><init>(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    if-nez p12, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-boolean p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    and-int/lit8 p2, p1, 0x2

    const-wide/16 v0, 0x0

    if-nez p2, :cond_1

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    goto :goto_0

    :cond_1
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    goto :goto_1

    :cond_2
    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 3
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    goto :goto_4

    :cond_5
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    :goto_5
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    return-void

    :cond_7
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    return-void
.end method

.method public constructor <init>(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-boolean p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    .line 7
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    .line 8
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    .line 9
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    .line 10
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    .line 11
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    .line 12
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    .line 13
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    return-void
.end method

.method public synthetic constructor <init>(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const-wide/16 v0, 0x0

    if-eqz p12, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    .line 14
    sget-object p6, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    const/4 v0, 0x0

    if-eqz p12, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p8, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_7

    move-object p12, v0

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    :goto_0
    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    goto :goto_1

    :cond_7
    move-object p12, p10

    move-object p11, p9

    move-object p9, p7

    move-object p10, p8

    move-object p8, p6

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p2 .. p12}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;-><init>(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.LinePointStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->values()[Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-boolean p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p9, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    :cond_6
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_7

    iget-object p10, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    :cond_7
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->copy(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    if-eqz v2, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_5

    :goto_2
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    return-wide v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    return-object v0
.end method

.method public final copy(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;
    .locals 12

    const-string v0, "style"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;

    move v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;-><init>(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;

    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final getGraphLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final getPositionX()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    return-wide v0
.end method

.method public final getPositionY()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    return-wide v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    return-object v0
.end method

.method public final getVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->visible:Z

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionX:D

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->positionY:D

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->graphLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object v9, p0, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "LineDataPointModel(visible="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", positionX="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", positionY="

    const-string v1, ", style="

    invoke-static {v10, v0, v3, v4, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accessibilityLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dataScrubberDetails="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", theme="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

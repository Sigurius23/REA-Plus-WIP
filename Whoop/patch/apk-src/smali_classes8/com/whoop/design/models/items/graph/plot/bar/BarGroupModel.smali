.class public final Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bc\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)Jd\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\'J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010 R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008?\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;",
        "",
        "",
        "positionX",
        "width",
        "",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
        "bars",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "dataScrubberDetails",
        "",
        "accessibilityLabel",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "topLabel",
        "bottomLabel",
        "<init>",
        "(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "component7",
        "copy",
        "(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getPositionX",
        "getWidth",
        "Ljava/util/List;",
        "getBars",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "getDataScrubberDetails",
        "Ljava/lang/String;",
        "getAccessibilityLabel",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "getTopLabel",
        "getBottomLabel",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;


# instance fields
.field private final accessibilityLabel:Ljava/lang/String;

.field private final bars:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;"
        }
    .end annotation
.end field

.field private final bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

.field private final dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

.field private final positionX:D

.field private final topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

.field private final width:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->Companion:Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lou1/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x7f

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;-><init>(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
            ")V"
        }
    .end annotation

    const-string v0, "bars"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    .line 4
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    .line 5
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    .line 6
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    .line 7
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    .line 9
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-void
.end method

.method public synthetic constructor <init>(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const-wide/16 v0, 0x0

    if-eqz p11, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    .line 13
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    const/4 v0, 0x0

    if-eqz p11, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p8, v0

    :cond_5
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_6

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p10, p9

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;-><init>(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)V

    return-void
.end method

.method public synthetic constructor <init>(IDDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p11, p1, 0x1

    const-wide/16 v0, 0x0

    if-nez p11, :cond_0

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    goto :goto_0

    :cond_0
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    goto :goto_1

    :cond_1
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 11
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 12
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    goto :goto_2

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    goto :goto_3

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    goto :goto_5

    :cond_5
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-void

    :cond_6
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    :cond_2
    move-object v5, p5

    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-object v6, p1

    goto :goto_0

    :cond_3
    move-object/from16 v6, p6

    :goto_0
    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    move-object v7, p1

    goto :goto_1

    :cond_4
    move-object/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-object v8, p1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p10, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-object v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_6
    move-object/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->copy(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    return-wide v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final copy(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
            ")",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;"
        }
    .end annotation

    const-string v0, "bars"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;

    move-wide v2, p1

    move-wide v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;-><init>(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getBars()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    return-object v0
.end method

.method public final getBottomLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final getPositionX()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    return-wide v0
.end method

.method public final getTopLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    return-object v0
.end method

.method public final getWidth()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->positionX:D

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->width:D

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bars:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->accessibilityLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->topLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->bottomLabel:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    const-string v9, "BarGroupModel(positionX="

    const-string v10, ", width="

    invoke-static {v9, v0, v1, v10}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", bars="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataScrubberDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accessibilityLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", topLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

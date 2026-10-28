.class public final Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;,
        Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`_Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u008e\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010&J\u0010\u00104\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00107\u001a\u00020\u00132\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010B\u0012\u0004\u0008D\u0010E\u001a\u0004\u0008C\u0010\u001fR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010F\u0012\u0004\u0008H\u0010E\u001a\u0004\u0008G\u0010!R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010I\u0012\u0004\u0008K\u0010E\u001a\u0004\u0008J\u0010#R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010F\u0012\u0004\u0008M\u0010E\u001a\u0004\u0008L\u0010!R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010N\u0012\u0004\u0008P\u0010E\u001a\u0004\u0008O\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010Q\u0012\u0004\u0008S\u0010E\u001a\u0004\u0008R\u0010(R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010T\u0012\u0004\u0008V\u0010E\u001a\u0004\u0008U\u0010*R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010W\u0012\u0004\u0008Y\u0010E\u001a\u0004\u0008X\u0010,R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010Z\u0012\u0004\u0008[\u0010E\u001a\u0004\u0008\u0014\u0010.R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\\\u0012\u0004\u0008^\u0010E\u001a\u0004\u0008]\u00100\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
        "",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "",
        "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
        "metrics",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
        "legend",
        "",
        "vow",
        "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
        "breakdownBar",
        "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "lastUpdated",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "segmentalBodyComposition",
        "",
        "isHidden",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "<init>",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
        "component7",
        "()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "component8",
        "()Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "component9",
        "()Z",
        "component10",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "copy",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getDatePicker",
        "getDatePicker$annotations",
        "()V",
        "Ljava/util/List;",
        "getMetrics",
        "getMetrics$annotations",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "getGraph$annotations",
        "getLegend",
        "getLegend$annotations",
        "Ljava/lang/String;",
        "getVow",
        "getVow$annotations",
        "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
        "getBreakdownBar",
        "getBreakdownBar$annotations",
        "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "getLastUpdated",
        "getLastUpdated$annotations",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "getSegmentalBodyComposition",
        "getSegmentalBodyComposition$annotations",
        "Z",
        "isHidden$annotations",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "getWhoopCoachVow$annotations",
        "Companion",
        "$serializer",
        "trends_release"
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

.field public static final Companion:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;


# instance fields
.field private final breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "breakdown_bar"
    .end annotation
.end field

.field private final datePicker:Lcom/whoop/design/models/items/DateSelectorModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "date_picker"
    .end annotation
.end field

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "graph"
    .end annotation
.end field

.field private final isHidden:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_hidden"
    .end annotation
.end field

.field private final lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_updated"
    .end annotation
.end field

.field private final legend:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "legend"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
            ">;"
        }
    .end annotation
.end field

.field private final metrics:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metrics"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
            ">;"
        }
    .end annotation
.end field

.field private final segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "segmental_body_comp_trends"
    .end annotation
.end field

.field private final vow:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vow"
    .end annotation
.end field

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whoop_coach_vow"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->Companion:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lwl2/a;

    invoke-direct {v3, v0}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lwl2/a;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xa

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v3, v4, v6

    const/4 v3, 0x2

    aput-object v1, v4, v3

    const/4 v3, 0x3

    aput-object v2, v4, v3

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v2, 0x5

    aput-object v1, v4, v2

    const/4 v2, 0x6

    aput-object v1, v4, v2

    const/4 v2, 0x7

    aput-object v1, v4, v2

    aput-object v1, v4, v0

    aput-object v1, v4, v5

    sput-object v4, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    invoke-virtual {p12}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p3, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p5, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    iput-object p8, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iput-object p9, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    iput-boolean p10, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    iput-object p11, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
            "Z",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ")V"
        }
    .end annotation

    const-string v0, "datePicker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metrics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    .line 9
    iput-object p7, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    .line 10
    iput-object p8, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/TrendMetricDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMetricDtoV3$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/LegendItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/LegendItemDtoV3$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;ILjava/lang/Object;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    :cond_9
    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->copy(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBreakdownBar$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "breakdown_bar"
    .end annotation

    return-void
.end method

.method public static synthetic getDatePicker$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "date_picker"
    .end annotation

    return-void
.end method

.method public static synthetic getGraph$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "graph"
    .end annotation

    return-void
.end method

.method public static synthetic getLastUpdated$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_updated"
    .end annotation

    return-void
.end method

.method public static synthetic getLegend$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "legend"
    .end annotation

    return-void
.end method

.method public static synthetic getMetrics$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metrics"
    .end annotation

    return-void
.end method

.method public static synthetic getSegmentalBodyComposition$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "segmental_body_comp_trends"
    .end annotation

    return-void
.end method

.method public static synthetic getVow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "vow"
    .end annotation

    return-void
.end method

.method public static synthetic getWhoopCoachVow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "whoop_coach_vow"
    .end annotation

    return-void
.end method

.method public static synthetic isHidden$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_hidden"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/BreakDownBarDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/BreakDownBarDtoV3$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-boolean v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/trends/data/model/BreakDownBarDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    return-object v0
.end method

.method public final component7()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final component8()Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    return v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
            "Z",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ")",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;"
        }
    .end annotation

    const-string v0, "datePicker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metrics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;-><init>(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    iget-boolean v3, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object p1, p1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBreakdownBar()Lcom/whoop/trends/data/model/BreakDownBarDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getLastUpdated()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final getLegend()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/LegendItemDtoV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final getMetrics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMetricDtoV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    return-object v0
.end method

.method public final getSegmentalBodyComposition()Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    return-object v0
.end method

.method public final getVow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public final isHidden()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->metrics:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->legend:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->vow:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->breakdownBar:Lcom/whoop/trends/data/model/BreakDownBarDtoV3;

    iget-object v6, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iget-object v7, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->segmentalBodyComposition:Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    iget-boolean v8, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->isHidden:Z

    iget-object v9, p0, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "TimeSegmentDtoV3(datePicker="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metrics="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graph="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", legend="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vow="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", breakdownBar="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastUpdated="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", segmentalBodyComposition="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isHidden="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", whoopCoachVow="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

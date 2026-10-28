.class public final Lcom/whoop/design/models/TimeSegmentModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/TimeSegmentModel$$serializer;,
        Lcom/whoop/design/models/TimeSegmentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002TSB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014Bu\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(Jv\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010,\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\u000f2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010<\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010\u001bR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010@\u0012\u0004\u0008B\u0010?\u001a\u0004\u0008A\u0010\u001dR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010C\u0012\u0004\u0008E\u0010?\u001a\u0004\u0008D\u0010\u001fR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010@\u0012\u0004\u0008G\u0010?\u001a\u0004\u0008F\u0010\u001dR\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010H\u0012\u0004\u0008J\u0010?\u001a\u0004\u0008I\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010K\u0012\u0004\u0008M\u0010?\u001a\u0004\u0008L\u0010$R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010N\u0012\u0004\u0008O\u0010?\u001a\u0004\u0008\u0010\u0010&R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010P\u0012\u0004\u0008R\u0010?\u001a\u0004\u0008Q\u0010(\u00a8\u0006U"
    }
    d2 = {
        "Lcom/whoop/design/models/TimeSegmentModel;",
        "",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "",
        "Lcom/whoop/design/models/TrendMetricModel;",
        "metrics",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "Lcom/whoop/design/models/LegendItemModel;",
        "legend",
        "Lcom/whoop/design/models/BreakDownBarModel;",
        "breakdownBar",
        "Lcom/whoop/design/models/TimeSegmentLastUpdated;",
        "lastUpdated",
        "",
        "isHidden",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "<init>",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/BreakDownBarModel;",
        "component6",
        "()Lcom/whoop/design/models/TimeSegmentLastUpdated;",
        "component7",
        "()Z",
        "component8",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "copy",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/design/models/TimeSegmentModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/TimeSegmentModel;Lzc3/c;Lyc3/g;)V",
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
        "Lcom/whoop/design/models/BreakDownBarModel;",
        "getBreakdownBar",
        "getBreakdownBar$annotations",
        "Lcom/whoop/design/models/TimeSegmentLastUpdated;",
        "getLastUpdated",
        "getLastUpdated$annotations",
        "Z",
        "isHidden$annotations",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "getWhoopCoachVow$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/TimeSegmentModel$Companion;


# instance fields
.field private final breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;
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

.field private final lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;
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
            "Lcom/whoop/design/models/LegendItemModel;",
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
            "Lcom/whoop/design/models/TrendMetricModel;",
            ">;"
        }
    .end annotation
.end field

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whoop_coach_vow"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/TimeSegmentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/TimeSegmentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/TimeSegmentModel;->Companion:Lcom/whoop/design/models/TimeSegmentModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/TimeSegmentModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/design/models/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v4, 0x1

    aput-object v3, v0, v4

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

    sput-object v0, Lcom/whoop/design/models/TimeSegmentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/TimeSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TimeSegmentModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/TimeSegmentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p3, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p5, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    iput-object p7, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    iput-boolean p8, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    iput-object p9, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TrendMetricModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendItemModel;",
            ">;",
            "Lcom/whoop/design/models/BreakDownBarModel;",
            "Lcom/whoop/design/models/TimeSegmentLastUpdated;",
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
    iput-object p1, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/TrendMetricModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TrendMetricModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/LegendItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/LegendItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/TimeSegmentModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/TimeSegmentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/TimeSegmentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/TimeSegmentModel;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;ILjava/lang/Object;)Lcom/whoop/design/models/TimeSegmentModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    :cond_7
    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/TimeSegmentModel;->copy(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/design/models/TimeSegmentModel;

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

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/TimeSegmentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/TimeSegmentModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/BreakDownBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/BreakDownBarModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/TimeSegmentLastUpdated$$serializer;->INSTANCE:Lcom/whoop/design/models/TimeSegmentLastUpdated$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TrendMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/BreakDownBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    return v0
.end method

.method public final component8()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/design/models/TimeSegmentModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TrendMetricModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendItemModel;",
            ">;",
            "Lcom/whoop/design/models/BreakDownBarModel;",
            "Lcom/whoop/design/models/TimeSegmentLastUpdated;",
            "Z",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ")",
            "Lcom/whoop/design/models/TimeSegmentModel;"
        }
    .end annotation

    const-string v0, "datePicker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metrics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/TimeSegmentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/TimeSegmentModel;-><init>(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/TimeSegmentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/TimeSegmentModel;

    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    iget-object v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object p1, p1, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBreakdownBar()Lcom/whoop/design/models/BreakDownBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getLastUpdated()Lcom/whoop/design/models/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final getLegend()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final getMetrics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TrendMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

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

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/BreakDownBarModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/TimeSegmentLastUpdated;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final isHidden()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/TimeSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v1, p0, Lcom/whoop/design/models/TimeSegmentModel;->metrics:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/TimeSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p0, Lcom/whoop/design/models/TimeSegmentModel;->legend:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/TimeSegmentModel;->breakdownBar:Lcom/whoop/design/models/BreakDownBarModel;

    iget-object v5, p0, Lcom/whoop/design/models/TimeSegmentModel;->lastUpdated:Lcom/whoop/design/models/TimeSegmentLastUpdated;

    iget-boolean v6, p0, Lcom/whoop/design/models/TimeSegmentModel;->isHidden:Z

    iget-object v7, p0, Lcom/whoop/design/models/TimeSegmentModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "TimeSegmentModel(datePicker="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metrics="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graph="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", legend="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", breakdownBar="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastUpdated="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isHidden="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", whoopCoachVow="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

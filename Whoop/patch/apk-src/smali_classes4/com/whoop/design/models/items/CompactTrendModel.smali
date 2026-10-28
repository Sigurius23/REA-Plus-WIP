.class public final Lcom/whoop/design/models/items/CompactTrendModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CompactTrendModel$$serializer;,
        Lcom/whoop/design/models/items/CompactTrendModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B{\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0010\u0010\'\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.Jt\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00102\u001a\u000201H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008?\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008@\u0010$R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010A\u001a\u0004\u0008B\u0010(R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008C\u0010(R\u0017\u0010\u000b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010A\u001a\u0004\u0008D\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010,R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010.\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CompactTrendModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/SegmentControllerModel;",
        "segmentController",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "weekDatePicker",
        "monthDatePicker",
        "sixMonthDatePicker",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "weekGraph",
        "monthGraph",
        "sixMonthGraph",
        "Lcom/whoop/design/models/items/NoDataGraphModel;",
        "noDataGraph",
        "",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegends",
        "<init>",
        "(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/CompactTrendModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/SegmentControllerModel;",
        "component2",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/NoDataGraphModel;",
        "component9",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)Lcom/whoop/design/models/items/CompactTrendModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/SegmentControllerModel;",
        "getSegmentController",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getWeekDatePicker",
        "getMonthDatePicker",
        "getSixMonthDatePicker",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getWeekGraph",
        "getMonthGraph",
        "getSixMonthGraph",
        "Lcom/whoop/design/models/items/NoDataGraphModel;",
        "getNoDataGraph",
        "Ljava/util/List;",
        "getGraphLegends",
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

.field public static final Companion:Lcom/whoop/design/models/items/CompactTrendModel$Companion;


# instance fields
.field private final graphLegends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation
.end field

.field private final monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

.field private final segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

.field private final sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/CompactTrendModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CompactTrendModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CompactTrendModel;->Companion:Lcom/whoop/design/models/items/CompactTrendModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/CompactTrendModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/b;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lw91/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v1, v3, v5

    const/4 v5, 0x6

    aput-object v1, v3, v5

    aput-object v1, v3, v4

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/CompactTrendModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/CompactTrendModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CompactTrendModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/CompactTrendModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iput-object p3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p4, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p5, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p7, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p8, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p9, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    iput-object p10, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/SegmentControllerModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/NoDataGraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "segmentController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekDatePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthDatePicker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sixMonthDatePicker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekGraph"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthGraph"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sixMonthGraph"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CompactTrendModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CompactTrendModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CompactTrendModel;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/CompactTrendModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/CompactTrendModel;->copy(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)Lcom/whoop/design/models/items/CompactTrendModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CompactTrendModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/CompactTrendModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/SegmentControllerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SegmentControllerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/NoDataGraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NoDataGraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/SegmentControllerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/NoDataGraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)Lcom/whoop/design/models/items/CompactTrendModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/SegmentControllerModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/design/models/items/NoDataGraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)",
            "Lcom/whoop/design/models/items/CompactTrendModel;"
        }
    .end annotation

    const-string v0, "segmentController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekDatePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthDatePicker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sixMonthDatePicker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekGraph"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthGraph"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sixMonthGraph"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CompactTrendModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/CompactTrendModel;-><init>(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CompactTrendModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CompactTrendModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getGraphLegends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final getMonthDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getMonthGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getNoDataGraph()Lcom/whoop/design/models/items/NoDataGraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-object v0
.end method

.method public final getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    return-object v0
.end method

.method public final getSixMonthDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getSixMonthGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getWeekDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getWeekGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SegmentControllerModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/NoDataGraphModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/CompactTrendModel;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthDatePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/CompactTrendModel;->weekGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/CompactTrendModel;->monthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/CompactTrendModel;->sixMonthGraph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v7, p0, Lcom/whoop/design/models/items/CompactTrendModel;->noDataGraph:Lcom/whoop/design/models/items/NoDataGraphModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/CompactTrendModel;->graphLegends:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "CompactTrendModel(segmentController="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weekDatePicker="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", monthDatePicker="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sixMonthDatePicker="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weekGraph="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", monthGraph="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sixMonthGraph="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", noDataGraph="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphLegends="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

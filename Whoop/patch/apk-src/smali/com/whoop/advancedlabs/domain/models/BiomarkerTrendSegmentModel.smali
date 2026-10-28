.class public final Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bg\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.Jh\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00102\u001a\u000201H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010?\u001a\u0004\u0008@\u0010&R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010.\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;",
        "metrics",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegends",
        "Lcom/whoop/design/models/items/TagModel;",
        "basePhaseTag",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "baseInfoCallout",
        "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;",
        "categoricalBiomarkerDetails",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;",
        "component2",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component6",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component7",
        "()Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;",
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
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;",
        "getMetrics",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getDatePicker",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Ljava/util/List;",
        "getGraphLegends",
        "Lcom/whoop/design/models/items/TagModel;",
        "getBasePhaseTag",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getBaseInfoCallout",
        "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;",
        "getCategoricalBiomarkerDetails",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;


# instance fields
.field private final baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final basePhaseTag:Lcom/whoop/design/models/items/TagModel;

.field private final categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

.field private final datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final graphLegends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation
.end field

.field private final metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->Companion:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt91/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lt91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;",
            ")V"
        }
    .end annotation

    const-string v0, "metrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

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

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->copy(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;"
        }
    .end annotation

    const-string v0, "metrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;-><init>(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBaseInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getBasePhaseTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getCategoricalBiomarkerDetails()Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
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

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final getMetrics()Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->metrics:Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->graphLegends:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->basePhaseTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->baseInfoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;->categoricalBiomarkerDetails:Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "BiomarkerTrendSegmentModel(metrics="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", datePicker="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graph="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphLegends="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", basePhaseTag="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", baseInfoCallout="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", categoricalBiomarkerDetails="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u00a5\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0019J\u009c\u0001\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00052\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00052\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0010\u0010\'\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008;\u0010\u001cR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008=\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008>\u0010\u001cR#\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008?\u0010\u001cR\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010<\u001a\u0004\u0008@\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00107\u001a\u0004\u0008A\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00107\u001a\u0004\u0008B\u0010\u0019\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "titleDisplay",
        "descriptionDisplay",
        "",
        "bottomLabels",
        "",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
        "buttons",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
        "currentCycleGraphs",
        "lastSixCycleGraphs",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
        "segmentedControlDisplays",
        "selectedButtonId",
        "segmentedControlDisplayId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/Map;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "getDescriptionDisplay",
        "Ljava/util/Map;",
        "getBottomLabels",
        "Ljava/util/List;",
        "getButtons",
        "getCurrentCycleGraphs",
        "getLastSixCycleGraphs",
        "getSegmentedControlDisplays",
        "getSelectedButtonId",
        "getSegmentedControlDisplayId",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;


# instance fields
.field private final bottomLabels:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final buttons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
            ">;"
        }
    .end annotation
.end field

.field private final currentCycleGraphs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation
.end field

.field private final descriptionDisplay:Ljava/lang/String;

.field private final lastSixCycleGraphs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation
.end field

.field private final segmentedControlDisplayId:Ljava/lang/String;

.field private final segmentedControlDisplays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedButtonId:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lqo1/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lqo1/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lqo1/a;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lqo1/a;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lqo1/a;

    const/4 v12, 0x5

    invoke-direct {v11, v12}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v11, 0x9

    new-array v11, v11, [Ll83/h;

    const/4 v13, 0x0

    aput-object v1, v11, v13

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    const/4 v3, 0x6

    aput-object v2, v11, v3

    const/4 v2, 0x7

    aput-object v1, v11, v2

    aput-object v1, v11, v0

    sput-object v11, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCycleGraphs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastSixCycleGraphs"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplays"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedButtonId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplayId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCycleGraphs"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastSixCycleGraphs"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplays"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedButtonId"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplayId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBottomLabels()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    return-object v0
.end method

.method public final getButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final getCurrentCycleGraphs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastSixCycleGraphs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final getSegmentedControlDisplayId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegmentedControlDisplays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedButtonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->descriptionDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->bottomLabels:Ljava/util/Map;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->buttons:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->currentCycleGraphs:Ljava/util/Map;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->lastSixCycleGraphs:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplays:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->selectedButtonId:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;->segmentedControlDisplayId:Ljava/lang/String;

    const-string v9, ", descriptionDisplay="

    const-string v10, ", bottomLabels="

    const-string v11, "CurrentCycleTileModel(titleDisplay="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentCycleGraphs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSixCycleGraphs="

    const-string v2, ", segmentedControlDisplays="

    invoke-static {v0, v4, v1, v5, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ", selectedButtonId="

    const-string v2, ", segmentedControlDisplayId="

    invoke-static {v1, v7, v2, v0, v6}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

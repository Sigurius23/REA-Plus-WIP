.class public final Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;
.super Lcom/whoop/design/models/items/graph/plot/GraphPlot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#JL\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020\t2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00086\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "",
        "id",
        "",
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
        "segments",
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
        "style",
        "",
        "hideWhileScrubbing",
        "skipScrubbing",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Ljava/util/List;",
        "getSegments",
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
        "getStyle",
        "Ljava/lang/Boolean;",
        "getHideWhileScrubbing",
        "getSkipScrubbing",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;


# instance fields
.field private final hideWhileScrubbing:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final segments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
            ">;"
        }
    .end annotation
.end field

.field private final skipScrubbing:Ljava/lang/Boolean;

.field private final style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lna1/a;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lna1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lna1/a;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lna1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v0, v3, v2

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    const/4 p7, 0x0

    .line 2
    invoke-direct {p0, p7}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    .line 12
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    .line 13
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    .line 14
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 15
    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 16
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 17
    sget-object p3, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p7, v0

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 18
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.trend.TrendPlotStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getHideWhileScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public getSkipScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->segments:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    const-string v5, ", segments="

    const-string v6, ", style="

    const-string v7, "TrendPlotModel(id="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hideWhileScrubbing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipScrubbing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

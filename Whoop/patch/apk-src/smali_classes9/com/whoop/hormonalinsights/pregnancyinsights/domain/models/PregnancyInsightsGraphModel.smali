.class public final Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;,
        Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 JD\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008.\u0010\u001dR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00080\u0010 \u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
        "",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "",
        "title",
        "icon",
        "",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegends",
        "<init>",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Ljava/lang/String;",
        "getTitle",
        "getIcon",
        "Ljava/util/List;",
        "getGraphLegends",
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

.field public static final Companion:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;


# instance fields
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

.field private final icon:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->Companion:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Llj1/b;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Llj1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    return-void

    :cond_1
    iput-object p5, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "graphLegends"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 6
    iput-object p2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 9
    sget-object p4, Lm83/y;->w:Lm83/y;

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;-><init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

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

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;"
        }
    .end annotation

    const-string v0, "graphLegends"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;-><init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

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

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->icon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->graphLegends:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PregnancyInsightsGraphModel(graph="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", graphLegends="

    const-string v1, ")"

    invoke-static {v2, v0, v1, v4, v3}, Lq63/c;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

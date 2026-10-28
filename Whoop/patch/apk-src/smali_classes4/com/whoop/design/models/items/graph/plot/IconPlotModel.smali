.class public final Lcom/whoop/design/models/items/graph/plot/IconPlotModel;
.super Lcom/whoop/design/models/items/graph/plot/GraphPlot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/IconPlotModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJB\u0010!\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\u00072\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/IconPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "",
        "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
        "points",
        "",
        "id",
        "",
        "hideWhileScrubbing",
        "skipScrubbing",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/lang/Boolean;",
        "component4",
        "copy",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/IconPlotModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getPoints",
        "Ljava/lang/String;",
        "getId",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;


# instance fields
.field private final hideWhileScrubbing:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final points:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
            ">;"
        }
    .end annotation
.end field

.field private final skipScrubbing:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lna1/a;

    invoke-direct {v3, v0}, Lna1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/design/models/items/graph/plot/IconPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/IconPlotModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    const/4 p6, 0x0

    invoke-direct {p0, p6}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    const-string p2, "icon"

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    .line 10
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 11
    const-string p2, "icon"

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 12
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/IconGroupModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/IconGroupModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/IconPlotModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    const-string v2, "icon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/IconPlotModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/design/models/items/graph/plot/IconPlotModel;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getHideWhileScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    return-object v0
.end method

.method public getSkipScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->points:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->id:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    const-string v4, ", id="

    const-string v5, ", hideWhileScrubbing="

    const-string v6, "IconPlotModel(points="

    invoke-static {v6, v4, v1, v5, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipScrubbing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

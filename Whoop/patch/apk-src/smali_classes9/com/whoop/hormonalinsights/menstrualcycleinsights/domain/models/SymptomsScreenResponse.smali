.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ>\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;",
        "",
        "",
        "navigationTitle",
        "",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
        "segmentedControlDisplays",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
        "currentCycleSegment",
        "lastThreeCyclesSegment",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
        "component4",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "Ljava/util/List;",
        "getSegmentedControlDisplays",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
        "getCurrentCycleSegment",
        "getLastThreeCyclesSegment",
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;


# instance fields
.field private final currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

.field private final lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

.field private final navigationTitle:Ljava/lang/String;

.field private final segmentedControlDisplays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqo1/b;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lqo1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplays"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCycleSegment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastThreeCyclesSegment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;",
            ")",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplays"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCycleSegment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastThreeCyclesSegment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentCycleSegment()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-object v0
.end method

.method public final getLastThreeCyclesSegment()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->segmentedControlDisplays:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->currentCycleSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->lastThreeCyclesSegment:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    const-string v4, ", segmentedControlDisplays="

    const-string v5, ", currentCycleSegment="

    const-string v6, "SymptomsScreenResponse(navigationTitle="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastThreeCyclesSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

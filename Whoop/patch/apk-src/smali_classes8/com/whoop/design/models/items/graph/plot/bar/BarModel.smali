.class public final Lcom/whoop/design/models/items/graph/plot/bar/BarModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B;\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JF\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
        "",
        "",
        "positionY",
        "height",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;",
        "style",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "dataScrubberDetails",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;",
        "theme",
        "<init>",
        "(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/bar/BarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "component5",
        "()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;",
        "copy",
        "(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getPositionY",
        "getHeight",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;",
        "getStyle",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "getDataScrubberDetails",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;",
        "getTheme",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;


# instance fields
.field private final dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

.field private final height:D

.field private final positionY:D

.field private final style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

.field private final theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->Companion:Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lou1/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

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

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    .line 3
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    .line 4
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    .line 5
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    .line 6
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    return-void
.end method

.method public synthetic constructor <init>(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    const-wide/16 v0, 0x0

    if-eqz p9, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_3

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p8, p7

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;-><init>(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)V

    return-void
.end method

.method public synthetic constructor <init>(IDDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p1, 0x4

    const/4 v0, 0x4

    if-eq v0, p9, :cond_0

    .line 7
    sget-object p9, Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const-wide/16 v0, 0x0

    if-nez p9, :cond_1

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    goto :goto_0

    :cond_1
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    goto :goto_1

    :cond_2
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    :goto_1
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    return-void

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.bar.BarStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;->values()[Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/bar/BarModel;DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    :cond_2
    move-object v5, p5

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    :cond_3
    move-object v6, p6

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    :cond_4
    move-object v0, p0

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->copy(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/bar/BarModel;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    return-wide v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    return-object v0
.end method

.method public final copy(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;
    .locals 9

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;-><init>(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    return-object v0
.end method

.method public final getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    return-wide v0
.end method

.method public final getPositionY()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    return-wide v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->positionY:D

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->height:D

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->style:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->dataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->theme:Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    const-string v7, "BarModel(positionY="

    const-string v8, ", height="

    invoke-static {v7, v0, v1, v8}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataScrubberDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

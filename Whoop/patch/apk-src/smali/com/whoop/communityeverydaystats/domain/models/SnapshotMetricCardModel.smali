.class public final Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$$serializer;,
        Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BCBY\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bq\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jr\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00089\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u0008:\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010&R\u001f\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010?\u001a\u0004\u0008@\u0010*\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "value",
        "valueSuffix",
        "previousValue",
        "Lcom/whoop/design/models/TrendStateEnum;",
        "trendState",
        "",
        "Lcom/whoop/design/models/LegendStyle;",
        "barStyles",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_everyday_stats_release",
        "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/TrendStateEnum;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getValue",
        "getValueSuffix",
        "getPreviousValue",
        "Lcom/whoop/design/models/TrendStateEnum;",
        "getTrendState",
        "Ljava/util/List;",
        "getBarStyles",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Companion",
        "$serializer",
        "a",
        "community-everyday-stats_release"
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

.field public static final Companion:Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;


# instance fields
.field private final barStyles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation
.end field

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final id:Ljava/lang/String;

.field private final previousValue:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trendState:Lcom/whoop/design/models/TrendStateEnum;

.field private final value:Ljava/lang/String;

.field private final valueSuffix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->Companion:Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lxo1/a;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lxo1/a;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v4, 0x1

    aput-object v1, v0, v4

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const/4 v4, 0x5

    aput-object v3, v0, v4

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    iput-object p8, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/TrendStateEnum;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    .line 9
    iput-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.TrendStateEnum"

    invoke-static {}, Lcom/whoop/design/models/TrendStateEnum;->values()[Lcom/whoop/design/models/TrendStateEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/LegendStyle;->Companion:Lcom/whoop/design/models/LegendStyle$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/LegendStyle$Companion;->serializer()Lwc3/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;ILjava/lang/Object;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_everyday_stats_release(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object p0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/TrendStateEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/TrendStateEnum;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            ")",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object p1, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBarStyles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreviousValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendState()Lcom/whoop/design/models/TrendStateEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->value:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->valueSuffix:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->previousValue:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->trendState:Lcom/whoop/design/models/TrendStateEnum;

    iget-object v6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->barStyles:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const-string v8, ", title="

    const-string v9, ", value="

    const-string v10, "SnapshotMetricCardModel(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", valueSuffix="

    const-string v8, ", previousValue="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trendState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", barStyles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

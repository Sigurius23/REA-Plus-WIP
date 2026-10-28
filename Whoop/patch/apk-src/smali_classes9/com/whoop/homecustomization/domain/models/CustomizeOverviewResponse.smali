.class public final Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$$serializer;,
        Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBw\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'Jl\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010,\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001fR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010\"R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00089\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u0008:\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u0008;\u0010\u001fR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008=\u0010\'R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010<\u001a\u0004\u0008>\u0010\'\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "gaugeHeader",
        "description",
        "",
        "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
        "gaugeMetrics",
        "bottomSheetMetrics",
        "pinnedMetricsHeader",
        "unpinnedMetricsHeader",
        "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
        "pinnedMetricsSection",
        "unpinnedMetricsSection",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_customization_release",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/homecustomization/domain/models/MetricsSection;",
        "component8",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getGaugeHeader",
        "getDescription",
        "Ljava/util/List;",
        "getGaugeMetrics",
        "getBottomSheetMetrics",
        "getPinnedMetricsHeader",
        "getUnpinnedMetricsHeader",
        "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
        "getPinnedMetricsSection",
        "getUnpinnedMetricsSection",
        "Companion",
        "$serializer",
        "home-customization_release"
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

.field public static final Companion:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;


# instance fields
.field private final bottomSheetMetrics:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Lcom/whoop/design/util/TextResource;

.field private final gaugeHeader:Lcom/whoop/design/util/TextResource;

.field private final gaugeMetrics:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation
.end field

.field private final pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

.field private final pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

.field private final unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

.field private final unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->Companion:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lgm2/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lgm2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lgm2/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lgm2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v5, 0x2

    aput-object v3, v0, v5

    aput-object v2, v0, v4

    aput-object v1, v0, v6

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$$serializer;

    invoke-virtual {p10}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    iput-object p9, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
            "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
            ")V"
        }
    .end annotation

    const-string v0, "gaugeHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeMetrics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetMetrics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMetricsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedMetricsHeader"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMetricsSection"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedMetricsSection"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p7, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    .line 10
    iput-object p8, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;ILjava/lang/Object;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_customization_release(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/homecustomization/domain/models/MetricsSection$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/models/MetricsSection$$serializer;

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object p0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component7()Lcom/whoop/homecustomization/domain/models/MetricsSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-object v0
.end method

.method public final component8()Lcom/whoop/homecustomization/domain/models/MetricsSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
            "Lcom/whoop/homecustomization/domain/models/MetricsSection;",
            ")",
            "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;"
        }
    .end annotation

    const-string v0, "gaugeHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeMetrics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetMetrics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMetricsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedMetricsHeader"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMetricsSection"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedMetricsSection"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    iget-object p1, p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBottomSheetMetrics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getGaugeHeader()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getGaugeMetrics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    return-object v0
.end method

.method public final getPinnedMetricsHeader()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPinnedMetricsSection()Lcom/whoop/homecustomization/domain/models/MetricsSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-object v0
.end method

.method public final getUnpinnedMetricsHeader()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getUnpinnedMetricsSection()Lcom/whoop/homecustomization/domain/models/MetricsSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    invoke-virtual {v2}, Lcom/whoop/homecustomization/domain/models/MetricsSection;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    invoke-virtual {v0}, Lcom/whoop/homecustomization/domain/models/MetricsSection;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeHeader:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->description:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->gaugeMetrics:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->bottomSheetMetrics:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsHeader:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->pinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    iget-object v7, p0, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->unpinnedMetricsSection:Lcom/whoop/homecustomization/domain/models/MetricsSection;

    const-string v8, ", description="

    const-string v9, ", gaugeMetrics="

    const-string v10, "CustomizeOverviewResponse(gaugeHeader="

    invoke-static {v10, v0, v8, v1, v9}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottomSheetMetrics="

    const-string v8, ", pinnedMetricsHeader="

    invoke-static {v0, v2, v1, v3, v8}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", unpinnedMetricsHeader="

    const-string v2, ", pinnedMetricsSection="

    invoke-static {v0, v4, v1, v5, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unpinnedMetricsSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

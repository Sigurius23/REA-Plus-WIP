.class public final Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;,
        Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBK\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008+\u0010\u001bR#\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
        "",
        "",
        "highestSeverityStatus",
        "",
        "metricsWithValues",
        "metricsInRange",
        "",
        "ranges",
        "<init>",
        "(Ljava/lang/String;IILjava/util/Map;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_monitor_release",
        "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/util/Map;",
        "copy",
        "(Ljava/lang/String;IILjava/util/Map;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHighestSeverityStatus",
        "I",
        "getMetricsWithValues",
        "getMetricsInRange",
        "Ljava/util/Map;",
        "getRanges",
        "Companion",
        "$serializer",
        "health-monitor_release"
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

.field public static final Companion:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;


# instance fields
.field private final highestSeverityStatus:Ljava/lang/String;

.field private final metricsInRange:I

.field private final metricsWithValues:I

.field private final ranges:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->Companion:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

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

    sput-object v2, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;->INSTANCE:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    iput p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    iput-object p5, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "highestSeverityStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ranges"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    .line 5
    iput p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    .line 6
    iput-object p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Ljava/lang/String;IILjava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->copy(Ljava/lang/String;IILjava/util/Map;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_monitor_release(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    return v0
.end method

.method public final component4()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILjava/util/Map;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;"
        }
    .end annotation

    const-string v0, "highestSeverityStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ranges"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;-><init>(Ljava/lang/String;IILjava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    iget v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    iget v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHighestSeverityStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricsInRange()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    return v0
.end method

.method public final getMetricsWithValues()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    return v0
.end method

.method public final getRanges()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->highestSeverityStatus:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsWithValues:I

    iget v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->metricsInRange:I

    iget-object v3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->ranges:Ljava/util/Map;

    const-string v4, ", metricsWithValues="

    const-string v5, ", metricsInRange="

    const-string v6, "ComposableHealthMonitorAnalyticsModel(highestSeverityStatus="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ranges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

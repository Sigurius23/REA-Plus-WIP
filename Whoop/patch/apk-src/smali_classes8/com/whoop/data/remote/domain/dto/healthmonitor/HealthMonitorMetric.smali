.class public final Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$$serializer;,
        Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BS\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBg\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(Jj\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\"J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00072\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00085\u0010\"R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00088\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00089\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010:\u001a\u0004\u0008;\u0010(\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;",
        "",
        "",
        "current_value",
        "current_deviation",
        "",
        "metric",
        "",
        "range_calibrating",
        "alert_type",
        "alert_status",
        "",
        "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
        "ranges",
        "<init>",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Double;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Double;",
        "getCurrent_value",
        "getCurrent_deviation",
        "Ljava/lang/String;",
        "getMetric",
        "Ljava/lang/Boolean;",
        "getRange_calibrating",
        "getAlert_type",
        "getAlert_status",
        "Ljava/util/List;",
        "getRanges",
        "Companion",
        "$serializer",
        "core_release"
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;


# instance fields
.field private final alert_status:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alert_status"
    .end annotation
.end field

.field private final alert_type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alert_type"
    .end annotation
.end field

.field private final current_deviation:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_deviation"
    .end annotation
.end field

.field private final current_value:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_value"
    .end annotation
.end field

.field private final metric:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric"
    .end annotation
.end field

.field private final range_calibrating:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "range_calibrating"
    .end annotation
.end field

.field private final ranges:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ranges"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->Companion:Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyo0/c;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lyo0/c;-><init>(I)V

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

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v1, 0x6

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$$serializer;

    invoke-virtual {p9}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAlert_status()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlert_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrent_deviation()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCurrent_value()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMetric()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    return-object v0
.end method

.method public final getRange_calibrating()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getRanges()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_value:Ljava/lang/Double;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->current_deviation:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->metric:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->range_calibrating:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_type:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->alert_status:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->ranges:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HealthMonitorMetric(current_value="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", current_deviation="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metric="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", range_calibrating="

    const-string v1, ", alert_type="

    invoke-static {v3, v2, v0, v1, v7}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", alert_status="

    const-string v1, ", ranges="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

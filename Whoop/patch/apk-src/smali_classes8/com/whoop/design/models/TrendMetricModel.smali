.class public final Lcom/whoop/design/models/TrendMetricModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/TrendMetricModel$$serializer;,
        Lcom/whoop/design/models/TrendMetricModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\\\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001\u00a2\u0006\u0004\u0008.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00104\u001a\u0004\u00086\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00105\u0012\u0004\u00089\u00104\u001a\u0004\u00088\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00105\u0012\u0004\u0008;\u00104\u001a\u0004\u0008:\u0010\u0017R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010<\u0012\u0004\u0008>\u00104\u001a\u0004\u0008=\u0010\u001bR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010?\u0012\u0004\u0008A\u00104\u001a\u0004\u0008@\u0010\u001dR\"\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00105\u0012\u0004\u0008C\u00104\u001a\u0004\u0008B\u0010\u0017\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/design/models/TrendMetricModel;",
        "",
        "Lcom/whoop/util/TrendKey;",
        "trendKey",
        "",
        "metricName",
        "metricValue",
        "metricUnits",
        "Lv41/j0;",
        "trendDirection",
        "Lv41/l0;",
        "trendStyle",
        "trendText",
        "<init>",
        "(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/util/TrendKey;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lv41/j0;",
        "component6",
        "()Lv41/l0;",
        "component7",
        "copy",
        "(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)Lcom/whoop/design/models/TrendMetricModel;",
        "toString",
        "hashCode",
        "()I",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/TrendMetricModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/util/TrendKey;",
        "getTrendKey",
        "getTrendKey$annotations",
        "()V",
        "Ljava/lang/String;",
        "getMetricName",
        "getMetricName$annotations",
        "getMetricValue",
        "getMetricValue$annotations",
        "getMetricUnits",
        "getMetricUnits$annotations",
        "Lv41/j0;",
        "getTrendDirection",
        "getTrendDirection$annotations",
        "Lv41/l0;",
        "getTrendStyle",
        "getTrendStyle$annotations",
        "getTrendText",
        "getTrendText$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/TrendMetricModel$Companion;


# instance fields
.field private final metricName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_name_display"
    .end annotation
.end field

.field private final metricUnits:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_units_display"
    .end annotation
.end field

.field private final metricValue:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_value_display"
    .end annotation
.end field

.field private final trendDirection:Lv41/j0;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_direction"
    .end annotation
.end field

.field private final trendKey:Lcom/whoop/util/TrendKey;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_key"
    .end annotation
.end field

.field private final trendStyle:Lv41/l0;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_style"
    .end annotation
.end field

.field private final trendText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_text_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/TrendMetricModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/TrendMetricModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/TrendMetricModel;->Companion:Lcom/whoop/design/models/TrendMetricModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/design/models/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/design/models/a;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/design/models/a;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x7

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    const/4 v2, 0x2

    aput-object v1, v4, v2

    const/4 v2, 0x3

    aput-object v1, v4, v2

    const/4 v2, 0x4

    aput-object v3, v4, v2

    const/4 v2, 0x5

    aput-object v0, v4, v2

    const/4 v0, 0x6

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/TrendMetricModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/TrendMetricModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TrendMetricModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/TrendMetricModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    iput-object p3, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    iput-object p7, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    iput-object p8, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "trendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendDirection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/util/TrendKey;->Companion:Lcom/whoop/util/TrendKey$a;

    invoke-virtual {v0}, Lcom/whoop/util/TrendKey$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.TrendDirection"

    invoke-static {}, Lv41/j0;->values()[Lv41/j0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.TrendStyle"

    invoke-static {}, Lv41/l0;->values()[Lv41/l0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/TrendMetricModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/TrendMetricModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/TrendMetricModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/TrendMetricModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/TrendMetricModel;Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/TrendMetricModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/TrendMetricModel;->copy(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)Lcom/whoop/design/models/TrendMetricModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMetricName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_name_display"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricUnits$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_units_display"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_value_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendDirection$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_direction"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendKey$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_key"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_style"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_text_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/TrendMetricModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/TrendMetricModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/util/TrendKey;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lv41/j0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    return-object v0
.end method

.method public final component6()Lv41/l0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)Lcom/whoop/design/models/TrendMetricModel;
    .locals 9

    const-string v0, "trendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendDirection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/TrendMetricModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/TrendMetricModel;-><init>(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/TrendMetricModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/TrendMetricModel;

    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    iget-object v3, p1, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMetricName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendDirection()Lv41/j0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    return-object v0
.end method

.method public final getTrendKey()Lcom/whoop/util/TrendKey;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    return-object v0
.end method

.method public final getTrendStyle()Lv41/l0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    return-object v0
.end method

.method public final getTrendText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/TrendMetricModel;->trendKey:Lcom/whoop/util/TrendKey;

    iget-object v1, p0, Lcom/whoop/design/models/TrendMetricModel;->metricName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/TrendMetricModel;->metricValue:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/TrendMetricModel;->metricUnits:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/TrendMetricModel;->trendDirection:Lv41/j0;

    iget-object v5, p0, Lcom/whoop/design/models/TrendMetricModel;->trendStyle:Lv41/l0;

    iget-object v6, p0, Lcom/whoop/design/models/TrendMetricModel;->trendText:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "TrendMetricModel(trendKey="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", metricValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", metricUnits="

    const-string v1, ", trendDirection="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trendStyle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trendText="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;,
        Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eBk\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\"Jh\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\"J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00103\u0012\u0004\u00085\u00106\u001a\u0004\u00084\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00089\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008:\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008;\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008<\u0010\"R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008=\u0010\"\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
        "",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "sleepMetricType",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "sleepMetricTrendType",
        "",
        "trendTitleDisplay",
        "trendSubTitleDisplay",
        "calibrationBodyDisplay",
        "metricDescriptionDisplay",
        "individualMetricDisplay",
        "individualMetricRangeDisplay",
        "<init>",
        "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "component2",
        "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "getSleepMetricType",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "getSleepMetricTrendType",
        "getSleepMetricTrendType$annotations",
        "()V",
        "Ljava/lang/String;",
        "getTrendTitleDisplay",
        "getTrendSubTitleDisplay",
        "getCalibrationBodyDisplay",
        "getMetricDescriptionDisplay",
        "getIndividualMetricDisplay",
        "getIndividualMetricRangeDisplay",
        "Companion",
        "$serializer",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;


# instance fields
.field private final calibrationBodyDisplay:Ljava/lang/String;

.field private final individualMetricDisplay:Ljava/lang/String;

.field private final individualMetricRangeDisplay:Ljava/lang/String;

.field private final metricDescriptionDisplay:Ljava/lang/String;

.field private final sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field private final sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

.field private final trendSubTitleDisplay:Ljava/lang/String;

.field private final trendTitleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgp1/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lgp1/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0x8

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    const/4 v0, 0x7

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sleepMetricType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepMetricTrendType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendSubTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->copy(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSleepMetricTrendType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object p0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;
    .locals 10

    const-string v0, "sleepMetricType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepMetricTrendType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendSubTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;-><init>(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCalibrationBodyDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndividualMetricDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndividualMetricRangeDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepMetricTrendType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object v0
.end method

.method public final getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    return-object v0
.end method

.method public final getTrendSubTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendTitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->trendSubTitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->calibrationBodyDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->metricDescriptionDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;->individualMetricRangeDisplay:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SleepDetailsMetricModalsModel(sleepMetricType="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepMetricTrendType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trendTitleDisplay="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trendSubTitleDisplay="

    const-string v1, ", calibrationBodyDisplay="

    invoke-static {v8, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", metricDescriptionDisplay="

    const-string v1, ", individualMetricDisplay="

    invoke-static {v8, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", individualMetricRangeDisplay="

    const-string v1, ")"

    invoke-static {v8, v6, v0, v7, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

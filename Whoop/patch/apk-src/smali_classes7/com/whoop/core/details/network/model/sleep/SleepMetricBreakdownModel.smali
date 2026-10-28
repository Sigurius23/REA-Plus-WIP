.class public final Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;,
        Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J`\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010 J\u0010\u0010,\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u001c2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00086\u0010$R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00087\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00101\u001a\u0004\u0008:\u0010 \u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
        "",
        "",
        "sleepMetricTitleDisplay",
        "sleepMetricValueDisplay",
        "sleepMetricComparisonDisplay",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "sleepMetricTrendType",
        "metricUnitDisplay",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "sleepMetricType",
        "tooltipDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "isEmpty",
        "()Z",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "component5",
        "component6",
        "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSleepMetricTitleDisplay",
        "getSleepMetricValueDisplay",
        "getSleepMetricComparisonDisplay",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "getSleepMetricTrendType",
        "getMetricUnitDisplay",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "getSleepMetricType",
        "getTooltipDisplay",
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

.field public static final Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;


# instance fields
.field private final metricUnitDisplay:Ljava/lang/String;

.field private final sleepMetricComparisonDisplay:Ljava/lang/String;

.field private final sleepMetricTitleDisplay:Ljava/lang/String;

.field private final sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field private final sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

.field private final sleepMetricValueDisplay:Ljava/lang/String;

.field private final tooltipDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgp1/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lgp1/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sleepMetricTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepMetricType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;
    .locals 9

    const-string v0, "sleepMetricTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepMetricType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMetricUnitDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepMetricComparisonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepMetricTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepMetricTrendType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object v0
.end method

.method public final getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    return-object v0
.end method

.method public final getSleepMetricValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTooltipDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    return v1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTitleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricValueDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricComparisonDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricTrendType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->metricUnitDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->sleepMetricType:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->tooltipDisplay:Ljava/lang/String;

    const-string v7, ", sleepMetricValueDisplay="

    const-string v8, ", sleepMetricComparisonDisplay="

    const-string v9, "SleepMetricBreakdownModel(sleepMetricTitleDisplay="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepMetricTrendType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricUnitDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepMetricType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tooltipDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

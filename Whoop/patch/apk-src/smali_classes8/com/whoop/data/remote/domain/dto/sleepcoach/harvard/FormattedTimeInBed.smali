.class public final Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$$serializer;,
        Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008)\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bo\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0010\u0010(\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010&Jp\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010&J\u0010\u0010/\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010!J\u001a\u00101\u001a\u00020\u00022\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u001a\u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00089\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008;\u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008<\u0010&R\u001a\u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008=\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008@\u0010&\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;",
        "",
        "",
        "flexSleepTime",
        "",
        "maxPossibleSri",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;",
        "optimalEndpointsFormatted",
        "recommendedTimeInBed",
        "",
        "estimatedAwakeTimeString",
        "recommendedTimeInBedTimeString",
        "sleepNeedTimeString",
        "projectedSleepConsistency",
        "sleepAdjustmentTimeString",
        "<init>",
        "(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()I",
        "component3",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "component7",
        "component8",
        "()Ljava/lang/Integer;",
        "component9",
        "copy",
        "(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getFlexSleepTime",
        "I",
        "getMaxPossibleSri",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;",
        "getOptimalEndpointsFormatted",
        "getRecommendedTimeInBed",
        "Ljava/lang/String;",
        "getEstimatedAwakeTimeString",
        "getRecommendedTimeInBedTimeString",
        "getSleepNeedTimeString",
        "Ljava/lang/Integer;",
        "getProjectedSleepConsistency",
        "getSleepAdjustmentTimeString",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$Companion;


# instance fields
.field private final estimatedAwakeTimeString:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "estimated_awake_time_string"
    .end annotation
.end field

.field private final flexSleepTime:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "flex_sleep_time"
    .end annotation
.end field

.field private final maxPossibleSri:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_possible_sri"
    .end annotation
.end field

.field private final optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "optimal_endpoints_formatted"
    .end annotation
.end field

.field private final projectedSleepConsistency:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "projected_sleep_consistency"
    .end annotation
.end field

.field private final recommendedTimeInBed:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recommended_time_in_bed"
    .end annotation
.end field

.field private final recommendedTimeInBedTimeString:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recommended_time_in_bed_time_string"
    .end annotation
.end field

.field private final sleepAdjustmentTimeString:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_adjustment_time_string"
    .end annotation
.end field

.field private final sleepNeedTimeString:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_need_time_string"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->Companion:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$$serializer;

    invoke-virtual {p11}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    iput p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "estimatedAwakeTimeString"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedTimeString"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepNeedTimeString"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    .line 4
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    .line 6
    iput p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    .line 11
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->copy(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    return v0
.end method

.method public final component3()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;
    .locals 11

    const-string v0, "estimatedAwakeTimeString"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedTimeString"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepNeedTimeString"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;-><init>(ZILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getEstimatedAwakeTimeString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final getFlexSleepTime()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    return v0
.end method

.method public final getMaxPossibleSri()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    return v0
.end method

.method public final getOptimalEndpointsFormatted()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    return-object v0
.end method

.method public final getProjectedSleepConsistency()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRecommendedTimeInBed()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    return v0
.end method

.method public final getRecommendedTimeInBedTimeString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepAdjustmentTimeString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepNeedTimeString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

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
    .locals 11

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->flexSleepTime:Z

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->maxPossibleSri:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->optimalEndpointsFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/OptimalEndpointsFormatted;

    iget v3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBed:I

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->estimatedAwakeTimeString:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->recommendedTimeInBedTimeString:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepNeedTimeString:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->projectedSleepConsistency:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;->sleepAdjustmentTimeString:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "FormattedTimeInBed(flexSleepTime="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", maxPossibleSri="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", optimalEndpointsFormatted="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedTimeInBed="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", estimatedAwakeTimeString="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedTimeInBedTimeString="

    const-string v1, ", sleepNeedTimeString="

    invoke-static {v9, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", projectedSleepConsistency="

    const-string v1, ", sleepAdjustmentTimeString="

    invoke-static {v7, v6, v0, v1, v9}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

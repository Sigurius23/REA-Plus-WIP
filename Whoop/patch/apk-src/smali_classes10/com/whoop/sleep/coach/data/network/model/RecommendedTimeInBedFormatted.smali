.class public final Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBW\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJR\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010+\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010+\u0012\u0004\u00081\u0010/\u001a\u0004\u00080\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010+\u0012\u0004\u00083\u0010/\u001a\u0004\u00082\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u00084\u0010\u001aR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u00085\u0010\u001a\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;",
        "weeklyPlan",
        "peak",
        "perform",
        "getBy",
        "hoursOfSleep",
        "optimizeSleep",
        "<init>",
        "(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;",
        "getWeeklyPlan",
        "getPeak",
        "getPeak$annotations",
        "()V",
        "getPerform",
        "getPerform$annotations",
        "getGetBy",
        "getGetBy$annotations",
        "getHoursOfSleep",
        "getOptimizeSleep",
        "Companion",
        "$serializer",
        "sleep-coach_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;


# instance fields
.field private final getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "70"
    .end annotation
.end field

.field private final hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hours_of_sleep"
    .end annotation
.end field

.field private final optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "optimize_sleep"
    .end annotation
.end field

.field private final peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "100"
    .end annotation
.end field

.field private final perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "85"
    .end annotation
.end field

.field private final weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weekly_plan"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->Companion:Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$$serializer;

    invoke-virtual {p8}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)V
    .locals 1

    const-string v0, "peak"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "perform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getBy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    .line 8
    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->copy(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getGetBy$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "70"
    .end annotation

    return-void
.end method

.method public static synthetic getPeak$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "100"
    .end annotation

    return-void
.end method

.method public static synthetic getPerform$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "85"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final component2()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final component5()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final component6()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final copy(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;
    .locals 8

    const-string v0, "peak"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "perform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getBy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;-><init>(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getGetBy()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final getHoursOfSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final getOptimizeSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final getPeak()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final getPerform()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public final getWeeklyPlan()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->weeklyPlan:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->peak:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->perform:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getBy:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->hoursOfSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    iget-object v5, p0, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->optimizeSleep:Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "RecommendedTimeInBedFormatted(weeklyPlan="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", peak="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", perform="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", getBy="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hoursOfSleep="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", optimizeSleep="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB[\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJR\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u001fR \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010,\u001a\u0004\u00085\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010,\u001a\u0004\u00086\u0010\u001c\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;",
        "",
        "",
        "latestWakeTime",
        "alarmMode",
        "",
        "alarmEnabled",
        "",
        "dayOfWeekList",
        "sleepGoal",
        "timeZoneOffset",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLatestWakeTime",
        "getAlarmMode",
        "Z",
        "getAlarmEnabled",
        "getAlarmEnabled$annotations",
        "()V",
        "Ljava/util/List;",
        "getDayOfWeekList",
        "getSleepGoal",
        "getTimeZoneOffset",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;


# instance fields
.field private final alarmEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled"
    .end annotation
.end field

.field private final alarmMode:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_mode"
    .end annotation
.end field

.field private final dayOfWeekList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_of_week_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final latestWakeTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "latest_wake_time"
    .end annotation
.end field

.field private final sleepGoal:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal"
    .end annotation
.end field

.field private final timeZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_zone_offset"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldb2/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ldb2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$$serializer;

    invoke-virtual {p8}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "latestWakeTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOfWeekList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoal"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->copy(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAlarmEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "enabled"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;"
        }
    .end annotation

    const-string v0, "latestWakeTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOfWeekList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoal"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAlarmEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    return v0
.end method

.method public final getAlarmMode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayOfWeekList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    return-object v0
.end method

.method public final getLatestWakeTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepGoal()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->latestWakeTime:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmMode:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->alarmEnabled:Z

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->dayOfWeekList:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->sleepGoal:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->timeZoneOffset:Ljava/lang/String;

    const-string v6, ", alarmMode="

    const-string v7, ", alarmEnabled="

    const-string v8, "CreateAlarmScheduleDto(latestWakeTime="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dayOfWeekList="

    const-string v6, ", sleepGoal="

    invoke-static {v1, v6, v0, v3, v2}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", timeZoneOffset="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

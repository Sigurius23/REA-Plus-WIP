.class public final Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00052\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010-\u0012\u0004\u0008/\u00100\u001a\u0004\u0008.\u0010\u001eR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00101\u0012\u0004\u00083\u00100\u001a\u0004\u00082\u0010 R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u00084\u0010\u001e\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
        "",
        "",
        "upperTimeBound",
        "timeZoneOffset",
        "",
        "smartAlarmEnabled",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "smartAlarmGoal",
        "scheduleEnabled",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getUpperTimeBound",
        "getTimeZoneOffset",
        "Z",
        "getSmartAlarmEnabled",
        "getSmartAlarmEnabled$annotations",
        "()V",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "getSmartAlarmGoal",
        "getSmartAlarmGoal$annotations",
        "getScheduleEnabled",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;


# instance fields
.field private final scheduleEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_enabled"
    .end annotation
.end field

.field private final smartAlarmEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled"
    .end annotation
.end field

.field private final smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "goal"
    .end annotation
.end field

.field private final timeZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_zone_offset"
    .end annotation
.end field

.field private final upperTimeBound:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upper_time_bound"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->Companion:Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

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

    sput-object v2, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iput-boolean p6, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)V
    .locals 1

    const-string v0, "upperTimeBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmGoal"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSmartAlarmEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getSmartAlarmGoal$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "goal"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean p0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    return v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;
    .locals 7

    const-string v0, "upperTimeBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmGoal"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    iget-boolean p1, p1, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getScheduleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    return v0
.end method

.method public final getSmartAlarmEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    return v0
.end method

.method public final getSmartAlarmGoal()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final getTimeZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperTimeBound()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->upperTimeBound:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->timeZoneOffset:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmEnabled:Z

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-boolean v4, p0, Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;->scheduleEnabled:Z

    const-string v5, ", timeZoneOffset="

    const-string v6, ", smartAlarmEnabled="

    const-string v7, "SetSmartAlarmDto(upperTimeBound="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", smartAlarmGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

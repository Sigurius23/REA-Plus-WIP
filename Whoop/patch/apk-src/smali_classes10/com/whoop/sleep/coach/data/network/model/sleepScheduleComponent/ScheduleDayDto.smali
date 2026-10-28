.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008+\u0010\u001bR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;",
        "selectionState",
        "",
        "dayLabelDisplay",
        "dayOfWeekValue",
        "",
        "displayIndex",
        "<init>",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()I",
        "copy",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;",
        "getSelectionState",
        "Ljava/lang/String;",
        "getDayLabelDisplay",
        "getDayOfWeekValue",
        "I",
        "getDisplayIndex",
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;


# instance fields
.field private final dayLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_label_display"
    .end annotation
.end field

.field private final dayOfWeekValue:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_of_week_value"
    .end annotation
.end field

.field private final displayIndex:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "display_index"
    .end annotation
.end field

.field private final selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selection_state"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldf2/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "selectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOfWeekValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO$Companion;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    return v0
.end method

.method public final copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;
    .locals 1

    const-string v0, "selectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOfWeekValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;-><init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    iget p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDayLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayOfWeekValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    return v0
.end method

.method public final getSelectionState()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->selectionState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayLabelDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->dayOfWeekValue:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;->displayIndex:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ScheduleDayDto(selectionState="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dayLabelDisplay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dayOfWeekValue="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayIndex="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

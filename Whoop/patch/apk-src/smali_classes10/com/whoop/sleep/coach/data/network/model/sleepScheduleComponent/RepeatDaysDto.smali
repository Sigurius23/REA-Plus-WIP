.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JR\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010.\u0012\u0004\u00083\u00101\u001a\u0004\u00082\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00085\u00101\u001a\u0004\u00084\u0010\u001dR \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00088\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00109\u001a\u0004\u0008:\u0010$\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;",
        "",
        "",
        "daysToScheduleDescriptionText",
        "daysToScheduleTitleDisplay",
        "daysToScheduleButtonLabelDisplay",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
        "scheduleDayList",
        "helpIconLink",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
        "nextState",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDaysToScheduleDescriptionText",
        "getDaysToScheduleDescriptionText$annotations",
        "()V",
        "getDaysToScheduleTitleDisplay",
        "getDaysToScheduleTitleDisplay$annotations",
        "getDaysToScheduleButtonLabelDisplay",
        "getDaysToScheduleButtonLabelDisplay$annotations",
        "Ljava/util/List;",
        "getScheduleDayList",
        "getHelpIconLink",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
        "getNextState",
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;


# instance fields
.field private final daysToScheduleButtonLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days_to_schedule_button_text_display"
    .end annotation
.end field

.field private final daysToScheduleDescriptionText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days_to_schedule_body_text_display"
    .end annotation
.end field

.field private final daysToScheduleTitleDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days_to_schedule_header_text_display"
    .end annotation
.end field

.field private final helpIconLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "help_icon_link"
    .end annotation
.end field

.field private final nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "next_state"
    .end annotation
.end field

.field private final scheduleDayList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_day_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldf2/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Ldf2/a;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x6

    new-array v4, v4, [Ll83/h;

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    const/4 v3, 0x2

    aput-object v1, v4, v3

    const/4 v3, 0x3

    aput-object v2, v4, v3

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v1, 0x5

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;

    invoke-virtual {p8}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
            ")V"
        }
    .end annotation

    const-string v0, "daysToScheduleDescriptionText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysToScheduleTitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysToScheduleButtonLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDayList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpIconLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDaysToScheduleButtonLabelDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "days_to_schedule_button_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDaysToScheduleDescriptionText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "days_to_schedule_body_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDaysToScheduleTitleDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "days_to_schedule_header_text_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
            ")",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;"
        }
    .end annotation

    const-string v0, "daysToScheduleDescriptionText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysToScheduleTitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysToScheduleButtonLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDayList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpIconLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDaysToScheduleButtonLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDaysToScheduleDescriptionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDaysToScheduleTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getHelpIconLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextState()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-object v0
.end method

.method public final getScheduleDayList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleDescriptionText:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleTitleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->daysToScheduleButtonLabelDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->scheduleDayList:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->helpIconLink:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->nextState:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    const-string v6, ", daysToScheduleTitleDisplay="

    const-string v7, ", daysToScheduleButtonLabelDisplay="

    const-string v8, "RepeatDaysDto(daysToScheduleDescriptionText="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleDayList="

    const-string v6, ", helpIconLink="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nextState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

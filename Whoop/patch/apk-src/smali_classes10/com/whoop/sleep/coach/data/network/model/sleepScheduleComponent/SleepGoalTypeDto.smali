.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010&\u001a\u00020\u00072\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010(\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;",
        "",
        "",
        "sleepGoalLabelToggledDisplay",
        "sleepGoalLabelNotToggledDisplay",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;",
        "sleepGoalValue",
        "",
        "toggleSelected",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;",
        "component4",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSleepGoalLabelToggledDisplay",
        "getSleepGoalLabelNotToggledDisplay",
        "getSleepGoalLabelNotToggledDisplay$annotations",
        "()V",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;",
        "getSleepGoalValue",
        "Z",
        "getToggleSelected",
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;


# instance fields
.field private final sleepGoalLabelNotToggledDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal_label_non_toggled_display"
    .end annotation
.end field

.field private final sleepGoalLabelToggledDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal_label_toggled_display"
    .end annotation
.end field

.field private final sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal_value"
    .end annotation
.end field

.field private final toggleSelected:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "toggle_selected"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldf2/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    iput-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)V
    .locals 1

    const-string v0, "sleepGoalLabelToggledDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoalLabelNotToggledDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoalValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto$Companion;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;ZILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSleepGoalLabelNotToggledDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sleep_goal_label_non_toggled_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-boolean p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;
    .locals 1

    const-string v0, "sleepGoalLabelToggledDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoalLabelNotToggledDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoalValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    iget-boolean p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getSleepGoalLabelNotToggledDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepGoalLabelToggledDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepGoalValue()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    return-object v0
.end method

.method public final getToggleSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelToggledDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalLabelNotToggledDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->sleepGoalValue:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    iget-boolean v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;->toggleSelected:Z

    const-string v4, ", sleepGoalLabelNotToggledDisplay="

    const-string v5, ", sleepGoalValue="

    const-string v6, "SleepGoalTypeDto(sleepGoalLabelToggledDisplay="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggleSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

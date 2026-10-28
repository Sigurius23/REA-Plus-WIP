.class public final Lcom/whoop/home/domain/models/JournalMetaData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/JournalMetaData$$serializer;,
        Lcom/whoop/home/domain/models/JournalMetaData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eB_\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001eJ`\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010#J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010.\u001a\u00020\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00083\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00084\u0010\u001eR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010%R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00100\u001a\u0004\u00089\u0010\u001eR\u001a\u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00100\u001a\u0004\u0008:\u0010\u001e\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/home/domain/models/JournalMetaData;",
        "",
        "",
        "journalCompleted",
        "hasRecovery",
        "hasCycle",
        "journalEnabled",
        "",
        "displayCycleState",
        "Lcom/whoop/home/domain/models/CycleDays;",
        "previousCycleDuring",
        "shouldAutoPop",
        "hasEnoughRecoveries",
        "<init>",
        "(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/JournalMetaData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Lcom/whoop/home/domain/models/CycleDays;",
        "component7",
        "component8",
        "copy",
        "(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)Lcom/whoop/home/domain/models/JournalMetaData;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getJournalCompleted",
        "getHasRecovery",
        "getHasCycle",
        "getJournalEnabled",
        "Ljava/lang/String;",
        "getDisplayCycleState",
        "Lcom/whoop/home/domain/models/CycleDays;",
        "getPreviousCycleDuring",
        "getShouldAutoPop",
        "getHasEnoughRecoveries",
        "Companion",
        "$serializer",
        "home_release"
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

.field public static final Companion:Lcom/whoop/home/domain/models/JournalMetaData$Companion;


# instance fields
.field private final displayCycleState:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "display_cycle_state"
    .end annotation
.end field

.field private final hasCycle:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_cycle"
    .end annotation
.end field

.field private final hasEnoughRecoveries:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_enough_recoveries"
    .end annotation
.end field

.field private final hasRecovery:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_recovery"
    .end annotation
.end field

.field private final journalCompleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_completed"
    .end annotation
.end field

.field private final journalEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_enabled"
    .end annotation
.end field

.field private final previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "previous_cycle_during"
    .end annotation
.end field

.field private final shouldAutoPop:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "should_auto_pop"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/home/domain/models/JournalMetaData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/JournalMetaData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/JournalMetaData;->Companion:Lcom/whoop/home/domain/models/JournalMetaData$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/home/domain/models/JournalMetaData$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/JournalMetaData$$serializer;

    invoke-virtual {p10}, Lcom/whoop/home/domain/models/JournalMetaData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    iput-boolean p3, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    iput-boolean p4, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    iput-boolean p5, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    iput-object p6, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    iput-boolean p8, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    iput-boolean p9, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    return-void
.end method

.method public constructor <init>(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)V
    .locals 1

    const-string v0, "displayCycleState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousCycleDuring"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    .line 4
    iput-boolean p2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    .line 5
    iput-boolean p3, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    .line 10
    iput-boolean p8, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/JournalMetaData;ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZILjava/lang/Object;)Lcom/whoop/home/domain/models/JournalMetaData;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-boolean p1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-boolean p2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-boolean p4, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-boolean p8, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    :cond_7
    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/home/domain/models/JournalMetaData;->copy(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/JournalMetaData;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/home/domain/models/CycleDays$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleDays$$serializer;

    iget-object v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x7

    iget-boolean p0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/home/domain/models/CycleDays;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    return v0
.end method

.method public final copy(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)Lcom/whoop/home/domain/models/JournalMetaData;
    .locals 10

    const-string v0, "displayCycleState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousCycleDuring"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/JournalMetaData;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/home/domain/models/JournalMetaData;-><init>(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/JournalMetaData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/JournalMetaData;

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    iget-object v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    iget-boolean p1, p1, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDisplayCycleState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasCycle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    return v0
.end method

.method public final getHasEnoughRecoveries()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    return v0
.end method

.method public final getHasRecovery()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    return v0
.end method

.method public final getJournalCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    return v0
.end method

.method public final getJournalEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    return v0
.end method

.method public final getPreviousCycleDuring()Lcom/whoop/home/domain/models/CycleDays;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    return-object v0
.end method

.method public final getShouldAutoPop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    invoke-virtual {v2}, Lcom/whoop/home/domain/models/CycleDays;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalCompleted:Z

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasRecovery:Z

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasCycle:Z

    iget-boolean v3, p0, Lcom/whoop/home/domain/models/JournalMetaData;->journalEnabled:Z

    iget-object v4, p0, Lcom/whoop/home/domain/models/JournalMetaData;->displayCycleState:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/home/domain/models/JournalMetaData;->previousCycleDuring:Lcom/whoop/home/domain/models/CycleDays;

    iget-boolean v6, p0, Lcom/whoop/home/domain/models/JournalMetaData;->shouldAutoPop:Z

    iget-boolean v7, p0, Lcom/whoop/home/domain/models/JournalMetaData;->hasEnoughRecoveries:Z

    const-string v8, ", hasRecovery="

    const-string v9, ", hasCycle="

    const-string v10, "JournalMetaData(journalCompleted="

    invoke-static {v10, v8, v9, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", journalEnabled="

    const-string v8, ", displayCycleState="

    invoke-static {v0, v2, v1, v3, v8}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", previousCycleDuring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldAutoPop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasEnoughRecoveries="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

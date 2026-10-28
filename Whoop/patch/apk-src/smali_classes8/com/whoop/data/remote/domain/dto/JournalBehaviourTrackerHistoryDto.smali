.class public final Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JL\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u00080\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u00081\u0010\u001cR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010!\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;",
        "",
        "",
        "behaviorTrackerId",
        "userId",
        "yesCount",
        "noCount",
        "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;",
        "trackerValue",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;",
        "toJournalBehaviourTrackerHistory",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/data/remote/domain/dto/TrackerValueDto;",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getBehaviorTrackerId",
        "getUserId",
        "getYesCount",
        "getNoCount",
        "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;",
        "getTrackerValue",
        "getTrackerValue$annotations",
        "()V",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;


# instance fields
.field private final behaviorTrackerId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "behavior_tracker_id"
    .end annotation
.end field

.field private final noCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "no_count"
    .end annotation
.end field

.field private final trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_value"
    .end annotation
.end field

.field private final userId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final yesCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "yes_count"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->Companion:Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getTrackerValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_value"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;
    .locals 6

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/TrackerValueDto;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBehaviorTrackerId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTrackerValue()Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getYesCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final toJournalBehaviourTrackerHistory()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;
    .locals 7

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->toTrackerValue()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;-><init>(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->behaviorTrackerId:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->userId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->yesCount:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->noCount:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviourTrackerHistoryDto;->trackerValue:Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    const-string v5, ", userId="

    const-string v6, ", yesCount="

    const-string v7, "JournalBehaviourTrackerHistoryDto(behaviorTrackerId="

    invoke-static {v7, v0, v5, v1, v6}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noCount="

    const-string v5, ", trackerValue="

    invoke-static {v0, v2, v1, v3, v5}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

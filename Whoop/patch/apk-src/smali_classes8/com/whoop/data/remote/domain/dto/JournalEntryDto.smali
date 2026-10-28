.class public final Lcom/whoop/data/remote/domain/dto/JournalEntryDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/JournalEntryDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JF\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\"J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010$\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/JournalEntryDto;",
        "",
        "",
        "cycleId",
        "",
        "journalEntryId",
        "",
        "notes",
        "",
        "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
        "trackedBehaviors",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "toJournalEntry",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "component1",
        "()Ljava/lang/Long;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/JournalEntryDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Long;",
        "getCycleId",
        "Ljava/lang/Integer;",
        "getJournalEntryId",
        "Ljava/lang/String;",
        "getNotes",
        "Ljava/util/List;",
        "getTrackedBehaviors",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;


# instance fields
.field private final cycleId:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_id"
    .end annotation
.end field

.field private final journalEntryId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_entry_id"
    .end annotation
.end field

.field private final notes:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "notes"
    .end annotation
.end field

.field private final trackedBehaviors:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tracked_behaviors"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->Companion:Lcom/whoop/data/remote/domain/dto/JournalEntryDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    sput-object v2, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/data/remote/domain/dto/JournalEntryDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalEntryDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a(Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->toJournalEntry$lambda$0(Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/JournalEntryDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->copy(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/JournalEntryDto;

    move-result-object p0

    return-object p0
.end method

.method private static final toJournalEntry$lambda$0(Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;
    .locals 1

    const-string v0, "trackedBehaviorDto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;->toTrackedBehavior()Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/JournalEntryDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/JournalEntryDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/JournalEntryDto;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;-><init>(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCycleId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getJournalEntryId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedBehaviors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TrackedBehaviorDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final toJournalEntry()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
    .locals 6

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v3

    new-instance v4, Lvs2/d;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lvs2/d;-><init>(I)V

    invoke-static {v3, v4}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->cycleId:Ljava/lang/Long;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->notes:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryDto;->trackedBehaviors:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "JournalEntryDto(cycleId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", journalEntryId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", notes="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trackedBehaviors="

    const-string v1, ")"

    invoke-static {v2, v0, v1, v4, v3}, Lq63/c;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

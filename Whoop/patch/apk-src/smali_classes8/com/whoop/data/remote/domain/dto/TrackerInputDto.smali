.class public final Lcom/whoop/data/remote/domain/dto/TrackerInputDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/TrackerInputDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KJBq\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B}\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u0086\u0001\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010$J\u0010\u0010-\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u001a\u0010/\u001a\u00020\u00022\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008=\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008?\u0010\u001fR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008B\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010$R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008E\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010C\u001a\u0004\u0008F\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008H\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010>\u001a\u0004\u0008I\u0010\u001f\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/TrackerInputDto;",
        "",
        "",
        "answeredYes",
        "",
        "behaviorTrackerId",
        "",
        "createdAt",
        "id",
        "journalEntryId",
        "",
        "magnitudeInputLabel",
        "magnitudeInputValue",
        "timeInputLabel",
        "",
        "timeInputValue",
        "updatedAt",
        "<init>",
        "(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;",
        "toTrackerInput",
        "()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;",
        "component1",
        "()Ljava/lang/Boolean;",
        "component2",
        "()I",
        "component3",
        "()Ljava/lang/Double;",
        "component4",
        "()Ljava/lang/Integer;",
        "component5",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Long;",
        "component10",
        "copy",
        "(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/TrackerInputDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/Boolean;",
        "getAnsweredYes",
        "I",
        "getBehaviorTrackerId",
        "Ljava/lang/Double;",
        "getCreatedAt",
        "Ljava/lang/Integer;",
        "getId",
        "getJournalEntryId",
        "Ljava/lang/String;",
        "getMagnitudeInputLabel",
        "getMagnitudeInputValue",
        "getTimeInputLabel",
        "Ljava/lang/Long;",
        "getTimeInputValue",
        "getUpdatedAt",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;


# instance fields
.field private final answeredYes:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answered_yes"
    .end annotation
.end field

.field private final behaviorTrackerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "behavior_tracker_id"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final id:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final journalEntryId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_entry_id"
    .end annotation
.end field

.field private final magnitudeInputLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnitude_input_label"
    .end annotation
.end field

.field private final magnitudeInputValue:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnitude_input_value"
    .end annotation
.end field

.field private final timeInputLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_input_label"
    .end annotation
.end field

.field private final timeInputValue:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_input_value"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->Companion:Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x1e3

    const/16 v0, 0x1e3

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/data/remote/domain/dto/TrackerInputDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/TrackerInputDto$$serializer;

    invoke-virtual {p12}, Lcom/whoop/data/remote/domain/dto/TrackerInputDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    :goto_2
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    return-void

    :cond_4
    iput-object p11, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    .line 4
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    .line 12
    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x4

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_3

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;-><init>(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/TrackerInputDto;Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->copy(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/TrackerInputDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    if-eqz v2, :cond_7

    :goto_3
    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component10()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    return v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;
    .locals 11

    new-instance v0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;-><init>(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAnsweredYes()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBehaviorTrackerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    return v0
.end method

.method public final getCreatedAt()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    return-object v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getJournalEntryId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMagnitudeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getMagnitudeInputValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTimeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeInputValue()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    iget-object v9, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "TrackerInputDto(answeredYes="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", behaviorTrackerId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", journalEntryId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputLabel="

    const-string v1, ", magnitudeInputValue="

    invoke-static {v4, v0, v5, v1, v10}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputValue="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTrackerInput()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;
    .locals 11

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->answeredYes:Ljava/lang/Boolean;

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->behaviorTrackerId:I

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->createdAt:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->id:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->journalEntryId:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->magnitudeInputValue:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->timeInputValue:Ljava/lang/Long;

    iget-object v10, p0, Lcom/whoop/data/remote/domain/dto/TrackerInputDto;->updatedAt:Ljava/lang/Double;

    invoke-direct/range {v0 .. v10}, Lcom/whoop/data/remote/domain/response/journal/TrackerInput;-><init>(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V

    return-object v0
.end method

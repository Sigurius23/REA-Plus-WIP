.class public final Lcom/whoop/data/remote/domain/request/JournalTrackerInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/request/JournalTrackerInput$$serializer;,
        Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBW\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B_\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jb\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010#J\u0010\u0010.\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010!J\u001a\u00100\u001a\u00020\u00022\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00106\u0012\u0004\u00088\u00105\u001a\u0004\u00087\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008=\u0010#R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010@\u001a\u0004\u0008A\u0010*\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/request/JournalTrackerInput;",
        "",
        "",
        "answered",
        "",
        "trackerId",
        "",
        "magnitudeInputLabel",
        "",
        "magnitudeInputValue",
        "timeInputLabel",
        "",
        "timeInputValue",
        "Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "questionType",
        "<init>",
        "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/request/JournalTrackerInput;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Boolean;",
        "component2",
        "()I",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/lang/Float;",
        "component5",
        "component6",
        "()Ljava/lang/Long;",
        "component7",
        "()Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "copy",
        "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/request/JournalTrackerInput;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Boolean;",
        "getAnswered",
        "getAnswered$annotations",
        "()V",
        "I",
        "getTrackerId",
        "getTrackerId$annotations",
        "Ljava/lang/String;",
        "getMagnitudeInputLabel",
        "Ljava/lang/Float;",
        "getMagnitudeInputValue",
        "getTimeInputLabel",
        "Ljava/lang/Long;",
        "getTimeInputValue",
        "Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "getQuestionType",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;


# instance fields
.field private final answered:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answered_yes"
    .end annotation
.end field

.field private final magnitudeInputLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnitude_input_label"
    .end annotation
.end field

.field private final magnitudeInputValue:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnitude_input_value"
    .end annotation
.end field

.field private final questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

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

.field private final trackerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "behavior_tracker_id"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->Companion:Lcom/whoop/data/remote/domain/request/JournalTrackerInput$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lat2/k;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lat2/k;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v1, 0x6

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x2

    const/4 v0, 0x2

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/data/remote/domain/request/JournalTrackerInput$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/request/JournalTrackerInput$$serializer;

    invoke-virtual {p9}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    if-nez p9, :cond_1

    .line 2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    :cond_1
    iput-object p2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    iput p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p4, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    goto :goto_1

    :cond_3
    iput-object p5, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    goto :goto_2

    :cond_4
    iput-object p6, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    goto :goto_3

    :cond_5
    iput-object p7, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    :goto_3
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    .line 6
    iput p2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    .line 7
    iput-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    .line 9
    iput-object p5, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    .line 11
    iput-object p7, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 12
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p9, v0

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_5
    move-object p9, p7

    move-object p8, p6

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 13
    :goto_0
    invoke-direct/range {p2 .. p9}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;-><init>(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.data.remote.domain.dto.QuestionType"

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/QuestionType;->values()[Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/request/JournalTrackerInput;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/request/JournalTrackerInput;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->copy(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/request/JournalTrackerInput;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAnswered$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "answered_yes"
    .end annotation

    return-void
.end method

.method public static synthetic getTrackerId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "behavior_tracker_id"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/request/JournalTrackerInput;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final component7()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/request/JournalTrackerInput;
    .locals 8

    new-instance v0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;-><init>(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/data/remote/domain/dto/QuestionType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    iget v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnswered()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMagnitudeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getMagnitudeInputValue()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final getQuestionType()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final getTimeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeInputValue()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final getTrackerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

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

    iget v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->answered:Ljava/lang/Boolean;

    iget v1, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->trackerId:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->magnitudeInputValue:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->timeInputValue:Ljava/lang/Long;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "JournalTrackerInput(answered="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackerId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputLabel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputLabel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", questionType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

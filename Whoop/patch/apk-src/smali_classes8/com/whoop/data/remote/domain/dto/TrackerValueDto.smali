.class public final Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)JV\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010&J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u001a\u0010/\u001a\u00020\u00042\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00103\u0012\u0004\u00085\u00106\u001a\u0004\u00084\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008;\u0010&R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008=\u0010)\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;",
        "",
        "",
        "behaviorTrackerId",
        "",
        "answered",
        "",
        "timeInputValue",
        "",
        "timeInputLabel",
        "magnitudeInputLabel",
        "",
        "magnitudeInputValue",
        "<init>",
        "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/journal/TrackerValue;",
        "toTrackerValue",
        "()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/Boolean;",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "()Ljava/lang/Double;",
        "copy",
        "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerValueDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getBehaviorTrackerId",
        "Ljava/lang/Boolean;",
        "getAnswered",
        "getAnswered$annotations",
        "()V",
        "Ljava/lang/Long;",
        "getTimeInputValue",
        "Ljava/lang/String;",
        "getTimeInputLabel",
        "getMagnitudeInputLabel",
        "Ljava/lang/Double;",
        "getMagnitudeInputValue",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;


# instance fields
.field private final answered:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answered_yes"
    .end annotation
.end field

.field private final behaviorTrackerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "behavior_tracker_id"
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->Companion:Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;

    invoke-virtual {p8}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/TrackerValueDto;ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->copy(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

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

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    return v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerValueDto;
    .locals 7

    new-instance v0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;-><init>(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAnswered()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBehaviorTrackerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    return v0
.end method

.method public final getMagnitudeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getMagnitudeInputValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTimeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeInputValue()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "TrackerValueDto(behaviorTrackerId="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", answered="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputValue="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputValue="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTrackerValue()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;
    .locals 8

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->answered:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget v2, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->behaviorTrackerId:I

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputValue:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->timeInputLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/TrackerValueDto;->magnitudeInputValue:Ljava/lang/Double;

    new-instance v1, Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/remote/domain/response/journal/TrackerValue;-><init>(IZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v1
.end method

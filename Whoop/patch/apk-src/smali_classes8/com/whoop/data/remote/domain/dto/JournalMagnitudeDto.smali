.class public final Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEB]\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBq\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJv\u0010#\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001\u00a2\u0006\u0004\u00082\u00103R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00105\u0012\u0004\u00087\u00108\u001a\u0004\u00086\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00105\u0012\u0004\u0008<\u00108\u001a\u0004\u0008;\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00105\u0012\u0004\u0008>\u00108\u001a\u0004\u0008=\u0010\u0019R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008?\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008@\u0010\u001bR\"\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008B\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00109\u0012\u0004\u0008D\u00108\u001a\u0004\u0008C\u0010\u001b\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "",
        "",
        "intervalSize",
        "",
        "label",
        "maxInclusive",
        "minInclusive",
        "type",
        "units",
        "",
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
        "choices",
        "questionType",
        "<init>",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "toJournalMagnitude",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "component1",
        "()Ljava/lang/Float;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "copy",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/Float;",
        "getIntervalSize",
        "getIntervalSize$annotations",
        "()V",
        "Ljava/lang/String;",
        "getLabel",
        "getMaxInclusive",
        "getMaxInclusive$annotations",
        "getMinInclusive",
        "getMinInclusive$annotations",
        "getType",
        "getUnits",
        "Ljava/util/List;",
        "getChoices",
        "getQuestionType",
        "getQuestionType$annotations",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;


# instance fields
.field private final choices:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "choices"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
            ">;"
        }
    .end annotation
.end field

.field private final intervalSize:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "interval"
    .end annotation
.end field

.field private final label:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "label"
    .end annotation
.end field

.field private final maxInclusive:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "maximum_inclusive"
    .end annotation
.end field

.field private final minInclusive:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "minimum_inclusive"
    .end annotation
.end field

.field private final questionType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question_type"
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field

.field private final units:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "units"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->Companion:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x8

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v0, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->toJournalMagnitude$lambda$0(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getIntervalSize$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "interval"
    .end annotation

    return-void
.end method

.method public static synthetic getMaxInclusive$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "maximum_inclusive"
    .end annotation

    return-void
.end method

.method public static synthetic getMinInclusive$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "minimum_inclusive"
    .end annotation

    return-void
.end method

.method public static synthetic getQuestionType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "question_type"
    .end annotation

    return-void
.end method

.method private static final toJournalMagnitude$lambda$0(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;
    .locals 1

    const-string v0, "magnitudeValueDto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;->toJournalMagnitudeValue()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;-><init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getChoices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    return-object v0
.end method

.method public final getIntervalSize()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxInclusive()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final getMinInclusive()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final getQuestionType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public final toJournalMagnitude()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
    .locals 10

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    if-eqz v7, :cond_0

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v7

    new-instance v8, Lvs2/d;

    const/4 v9, 0x7

    invoke-direct {v8, v9}, Lvs2/d;-><init>(I)V

    invoke-static {v7, v8}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v7

    invoke-static {v7}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    invoke-static {v8}, Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;->access$convertToQuestionTypeEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;-><init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->intervalSize:Ljava/lang/Float;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->maxInclusive:Ljava/lang/Float;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->minInclusive:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->type:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->units:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->choices:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->questionType:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "JournalMagnitudeDto(intervalSize="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", maxInclusive="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minInclusive="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", units="

    const-string v1, ", choices="

    invoke-static {v8, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", questionType="

    const-string v1, ")"

    invoke-static {v0, v7, v1, v8, v6}, Ly00/t7;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

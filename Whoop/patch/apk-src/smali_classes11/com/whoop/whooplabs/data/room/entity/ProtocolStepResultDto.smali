.class public final Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;,
        Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002IJB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bs\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0018Jz\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0016J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00106\u0012\u0004\u0008;\u00109\u001a\u0004\u0008:\u0010\u0018R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010<\u0012\u0004\u0008>\u00109\u001a\u0004\u0008=\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010?\u001a\u0004\u0008@\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010A\u0012\u0004\u0008C\u00109\u001a\u0004\u0008B\u0010\u001fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008D\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00106\u0012\u0004\u0008F\u00109\u001a\u0004\u0008E\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00106\u0012\u0004\u0008H\u00109\u001a\u0004\u0008G\u0010\u0018\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
        "",
        "",
        "id",
        "Ljava/util/Date;",
        "startTimestamp",
        "endTimestamp",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;",
        "mysticReading",
        "numberInput",
        "",
        "textOption",
        "textInput",
        "timestampInput",
        "dateTimeStampInput",
        "<init>",
        "(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/util/Date;",
        "component3",
        "component4",
        "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
        "toString",
        "hashCode",
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
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "Ljava/util/Date;",
        "getStartTimestamp",
        "getStartTimestamp$annotations",
        "()V",
        "getEndTimestamp",
        "getEndTimestamp$annotations",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;",
        "getMysticReading",
        "getMysticReading$annotations",
        "Ljava/lang/Integer;",
        "getNumberInput",
        "Ljava/lang/String;",
        "getTextOption",
        "getTextOption$annotations",
        "getTextInput",
        "getTimestampInput",
        "getTimestampInput$annotations",
        "getDateTimeStampInput",
        "getDateTimeStampInput$annotations",
        "Companion",
        "$serializer",
        "whooplabs_release"
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

.field public static final Companion:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;


# instance fields
.field private final dateTimeStampInput:Ljava/util/Date;

.field private final endTimestamp:Ljava/util/Date;

.field private final id:I

.field private final mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

.field private final numberInput:Ljava/lang/Integer;

.field private final startTimestamp:Ljava/util/Date;

.field private final textInput:Ljava/lang/String;

.field private final textOption:Ljava/lang/String;

.field private final timestampInput:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->Companion:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;

    invoke-virtual {p11}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->copy(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDateTimeStampInput$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "datetime_picker"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getEndTimestamp$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "end_timestamp"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getMysticReading$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "mystic_readings"
    .end annotation

    return-void
.end method

.method public static synthetic getStartTimestamp$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "start_timestamp"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getTextOption$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "text_selection"
    .end annotation

    return-void
.end method

.method public static synthetic getTimestampInput$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "time_picker"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lu82/b;->a:Lu82/b;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$$serializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object p0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    return v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;
    .locals 10

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;-><init>(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    iget v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDateTimeStampInput()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    return-object v0
.end method

.method public final getEndTimestamp()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    return v0
.end method

.method public final getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    return-object v0
.end method

.method public final getNumberInput()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStartTimestamp()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    return-object v0
.end method

.method public final getTextInput()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextOption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestampInput()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->id:I

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->startTimestamp:Ljava/util/Date;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->endTimestamp:Ljava/util/Date;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->numberInput:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textOption:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->textInput:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->timestampInput:Ljava/util/Date;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->dateTimeStampInput:Ljava/util/Date;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ProtocolStepResultDto(id="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", startTimestamp="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endTimestamp="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mysticReading="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numberInput="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textOption="

    const-string v1, ", textInput="

    invoke-static {v4, v0, v5, v1, v9}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", timestampInput="

    const-string v1, ", dateTimeStampInput="

    invoke-static {v9, v6, v0, v7, v1}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->k(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

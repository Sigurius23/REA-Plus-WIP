.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBs\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0010\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010#Jv\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010#J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010!J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00089\u0010#R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u0008:\u0010#R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008;\u0010#R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008<\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008=\u0010#R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008?\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008@\u0010#\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;",
        "",
        "exerciseType",
        "",
        "notes",
        "title",
        "startTime",
        "startZoneOffset",
        "endTime",
        "endZoneOffset",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "metadata",
        "deviceZoneId",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lm7/w;",
        "toRecord",
        "()Lm7/w;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "component9",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getExerciseType",
        "Ljava/lang/String;",
        "getNotes",
        "getTitle",
        "getStartTime",
        "getStartZoneOffset",
        "getEndTime",
        "getEndZoneOffset",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "getMetadata",
        "getDeviceZoneId",
        "Companion",
        "$serializer",
        "health-connect_release"
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

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;


# instance fields
.field private final deviceZoneId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_zone_id"
    .end annotation
.end field

.field private final endTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_time"
    .end annotation
.end field

.field private final endZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_zone_offset"
    .end annotation
.end field

.field private final exerciseType:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_type"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final notes:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "notes"
    .end annotation
.end field

.field private final startTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_time"
    .end annotation
.end field

.field private final startZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_zone_offset"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iput-object p10, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V
    .locals 1

    const-string v0, "startTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    .line 4
    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;
    .locals 11

    const-string v0, "startTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    iget v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    iget v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDeviceZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseType()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    return v0
.end method

.method public final getMetadata()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public bridge synthetic toRecord()Lm7/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->toRecord()Lm7/w;

    move-result-object v0

    return-object v0
.end method

.method public toRecord()Lm7/w;
    .locals 14

    .line 2
    new-instance v0, Lm7/w;

    .line 3
    sget-object v1, Ljava/time/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    new-instance v3, Llj1/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Llj1/a;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "parse(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/time/Instant;

    .line 4
    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    invoke-static {v4}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    move-result-object v4

    .line 5
    iget-object v5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    new-instance v6, Llj1/a;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Llj1/a;-><init>(I)V

    invoke-virtual {v1, v5, v6}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/time/Instant;

    .line 6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    invoke-static {v1}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    move-result-object v1

    .line 7
    iget v5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    .line 8
    iget-object v6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    .line 9
    iget-object v7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    .line 10
    iget-object v8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->toHealthConnectMetadata()Ln7/c;

    move-result-object v8

    if-nez v8, :cond_1

    :cond_0
    new-instance v8, Ln7/c;

    const-wide/16 v9, 0x0

    const/16 v11, 0x7f

    const/4 v12, 0x0

    invoke-direct {v8, v11, v12, v9, v10}, Ln7/c;-><init>(ILjava/lang/String;J)V

    .line 11
    :cond_1
    new-instance v11, Lm7/u;

    .line 12
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v9, Lm83/y;->w:Lm83/y;

    move-object v10, v9

    move-object v13, v4

    move-object v4, v1

    move-object v1, v2

    move-object v2, v13

    invoke-direct/range {v0 .. v11}, Lm7/w;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILjava/lang/String;Ljava/lang/String;Ln7/c;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->exerciseType:I

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->notes:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startTime:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->startZoneOffset:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endTime:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->endZoneOffset:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->deviceZoneId:Ljava/lang/String;

    const-string v9, ", notes="

    const-string v10, ", title="

    const-string v11, "HealthConnectExerciseSessionModel(exerciseType="

    invoke-static {v0, v11, v9, v1, v10}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    const-string v9, ", startZoneOffset="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", endTime="

    const-string v2, ", endZoneOffset="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceZoneId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

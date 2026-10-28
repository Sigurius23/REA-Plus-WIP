.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 JV\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010 J\u0010\u0010,\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010#R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010\'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00102\u001a\u0004\u0008;\u0010 \u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "",
        "",
        "id",
        "clientRecordId",
        "",
        "clientRecordVersion",
        "Lcom/whoop/healthconnect/domain/models/DeviceModel;",
        "device",
        "Lcom/whoop/healthconnect/domain/models/DataOriginModel;",
        "dataOrigin",
        "lastModifiedTime",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ln7/c;",
        "toHealthConnectMetadata",
        "()Ln7/c;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()J",
        "component4",
        "()Lcom/whoop/healthconnect/domain/models/DeviceModel;",
        "component5",
        "()Lcom/whoop/healthconnect/domain/models/DataOriginModel;",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getClientRecordId",
        "J",
        "getClientRecordVersion",
        "Lcom/whoop/healthconnect/domain/models/DeviceModel;",
        "getDevice",
        "Lcom/whoop/healthconnect/domain/models/DataOriginModel;",
        "getDataOrigin",
        "getLastModifiedTime",
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

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;


# instance fields
.field private final clientRecordId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "client_record_id"
    .end annotation
.end field

.field private final clientRecordVersion:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "client_record_version"
    .end annotation
.end field

.field private final dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "data_origin"
    .end annotation
.end field

.field private final device:Lcom/whoop/healthconnect/domain/models/DeviceModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final lastModifiedTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_modified_time"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    iput-wide p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    .line 6
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    .line 7
    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    .line 8
    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-wide p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->copy(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    sget-object v1, Lcom/whoop/healthconnect/domain/models/DeviceModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/DeviceModel$$serializer;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/healthconnect/domain/models/DataOriginModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/DataOriginModel$$serializer;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    return-wide v0
.end method

.method public final component4()Lcom/whoop/healthconnect/domain/models/DeviceModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/healthconnect/domain/models/DataOriginModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 8

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    iget-wide v5, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getClientRecordId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    return-object v0
.end method

.method public final getClientRecordVersion()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    return-wide v0
.end method

.method public final getDataOrigin()Lcom/whoop/healthconnect/domain/models/DataOriginModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    return-object v0
.end method

.method public final getDevice()Lcom/whoop/healthconnect/domain/models/DeviceModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastModifiedTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    invoke-static {v0, v3, v4, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/healthconnect/domain/models/DeviceModel;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/healthconnect/domain/models/DataOriginModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final toHealthConnectMetadata()Ln7/c;
    .locals 5

    new-instance v0, Ln7/c;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    const/16 v4, 0x67

    invoke-direct {v0, v4, v1, v2, v3}, Ln7/c;-><init>(ILjava/lang/String;J)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->clientRecordVersion:J

    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->device:Lcom/whoop/healthconnect/domain/models/DeviceModel;

    iget-object v5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->dataOrigin:Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    iget-object v6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->lastModifiedTime:Ljava/lang/String;

    const-string v7, ", clientRecordId="

    const-string v8, ", clientRecordVersion="

    const-string v9, "HealthConnectMetadataModel(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastModifiedTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBU\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJN\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u00081\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u00082\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010\"R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010-\u001a\u0004\u00085\u0010\u001c\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "",
        "",
        "type",
        "",
        "value",
        "timestamp",
        "zoneOffset",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "metadata",
        "deviceZoneId",
        "<init>",
        "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "component6",
        "copy",
        "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getType",
        "D",
        "getValue",
        "getTimestamp",
        "getZoneOffset",
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

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;


# instance fields
.field private final deviceZoneId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_zone_id"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final timestamp:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field

.field private final value:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "value"
    .end annotation
.end field

.field private final zoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "zone_offset"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceZoneId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    .line 5
    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    .line 8
    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->copy(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceZoneId"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    iget-wide v5, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDeviceZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    return-wide v0
.end method

.method public final getZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-virtual {v2}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->type:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->value:D

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->timestamp:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->zoneOffset:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;->deviceZoneId:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HealthConnectBodyMeasurementModel(type="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    const-string v1, ", zoneOffset="

    invoke-static {v7, v0, v3, v1, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", metadata="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceZoneId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

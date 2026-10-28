.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J<\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001fR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010\"\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;",
        "",
        "percentage",
        "",
        "time",
        "zoneOffset",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "metadata",
        "<init>",
        "(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lm7/o0;",
        "toRecord",
        "()Lm7/o0;",
        "component1",
        "()D",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "copy",
        "(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getPercentage",
        "Ljava/lang/String;",
        "getTime",
        "getZoneOffset",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "getMetadata",
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

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$Companion;


# instance fields
.field private final metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final percentage:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "percentage"
    .end annotation
.end field

.field private final time:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time"
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

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$Companion;

    return-void
.end method

.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V
    .locals 1

    const-string v0, "time"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    .line 3
    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-void
.end method

.method public synthetic constructor <init>(IDLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 6
    sget-object p7, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    :cond_3
    move-object v0, p0

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->copy(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final copy(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;
    .locals 7

    const-string v0, "time"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;-><init>(DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;

    iget-wide v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    iget-wide v5, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMetadata()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final getPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    return-wide v0
.end method

.method public final getTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final getZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toRecord()Lm7/o0;
    .locals 9

    .line 2
    new-instance v0, Lm7/o0;

    .line 3
    sget-object v1, Ljava/time/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    new-instance v3, Llj1/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Llj1/a;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "parse(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/time/Instant;

    .line 4
    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    invoke-static {v2}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    move-result-object v2

    .line 5
    new-instance v3, Lr7/c0;

    iget-wide v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    invoke-direct {v3, v4, v5}, Lr7/c0;-><init>(D)V

    .line 6
    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->toHealthConnectMetadata()Ln7/c;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    new-instance v4, Ln7/c;

    const-wide/16 v5, 0x0

    const/16 v7, 0x7f

    const/4 v8, 0x0

    invoke-direct {v4, v7, v8, v5, v6}, Ln7/c;-><init>(ILjava/lang/String;J)V

    .line 7
    :cond_1
    invoke-direct {v0, v1, v2, v3, v4}, Lm7/o0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V

    return-object v0
.end method

.method public bridge synthetic toRecord()Lm7/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->toRecord()Lm7/o0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->percentage:D

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->time:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->zoneOffset:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HealthConnectOxygenSaturationModel(percentage="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneOffset="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

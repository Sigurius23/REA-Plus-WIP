.class public final Lcom/whoop/healthconnect/domain/models/StepsRecordModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J<\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001fR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010\"\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;",
        "",
        "stepCount",
        "",
        "startTime",
        "endTime",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "metadata",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/StepsRecordModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lm7/d1;",
        "toRecord",
        "()Lm7/d1;",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "copy",
        "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getStepCount",
        "Ljava/lang/String;",
        "getStartTime",
        "getEndTime",
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

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;


# instance fields
.field private final endTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_time"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final startTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_time"
    .end annotation
.end field

.field private final stepCount:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "step_count"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->Companion:Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V
    .locals 1

    const-string v0, "startTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    .line 4
    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/StepsRecordModel;JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/StepsRecordModel;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    :cond_3
    move-object v0, p0

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->copy(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/StepsRecordModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/StepsRecordModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/StepsRecordModel;
    .locals 7

    const-string v0, "startTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;-><init>(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;

    iget-wide v3, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    iget-wide v5, p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getStepCount()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toRecord()Lm7/d1;
    .locals 10

    .line 2
    new-instance v0, Lm7/d1;

    .line 3
    sget-object v1, Ljava/time/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    new-instance v3, Llj1/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Llj1/a;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "parse(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/time/Instant;

    .line 4
    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    new-instance v5, Llj1/a;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Llj1/a;-><init>(I)V

    invoke-virtual {v1, v4, v5}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/time/Instant;

    .line 5
    iget-wide v5, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    .line 6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->toHealthConnectMetadata()Ln7/c;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v7, v1

    move-object v1, v2

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v1, Ln7/c;

    const-wide/16 v7, 0x0

    const/16 v4, 0x7f

    const/4 v9, 0x0

    invoke-direct {v1, v4, v9, v7, v8}, Ln7/c;-><init>(ILjava/lang/String;J)V

    goto :goto_0

    :goto_2
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 7
    invoke-direct/range {v0 .. v7}, Lm7/d1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v0
.end method

.method public bridge synthetic toRecord()Lm7/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->toRecord()Lm7/d1;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->stepCount:J

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->startTime:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->endTime:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const-string v5, "StepsRecordModel(stepCount="

    const-string v6, ", startTime="

    invoke-static {v5, v6, v0, v1, v2}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

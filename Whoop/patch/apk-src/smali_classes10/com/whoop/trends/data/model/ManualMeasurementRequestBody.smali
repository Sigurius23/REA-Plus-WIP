.class public final Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$$serializer;,
        Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ<\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008.\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;",
        "",
        "",
        "timestamp",
        "",
        "weightKg",
        "bodyFatPercent",
        "leanBodyMassKg",
        "<init>",
        "(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "()Ljava/lang/Double;",
        "component4",
        "copy",
        "(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTimestamp",
        "D",
        "getWeightKg",
        "Ljava/lang/Double;",
        "getBodyFatPercent",
        "getLeanBodyMassKg",
        "Companion",
        "$serializer",
        "trends_release"
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

.field public static final Companion:Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;


# instance fields
.field private final bodyFatPercent:Ljava/lang/Double;

.field private final leanBodyMassKg:Ljava/lang/Double;

.field private final timestamp:Ljava/lang/String;

.field private final weightKg:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->Companion:Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$$serializer;

    invoke-virtual {p7}, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    iput-object p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    iput-object p6, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)V
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    .line 5
    iput-object p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    .line 6
    iput-object p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;ILjava/lang/Object;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    :cond_3
    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->copy(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object p0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;
    .locals 7

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;-><init>(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBodyFatPercent()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final getLeanBodyMassKg()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightKg()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->timestamp:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->weightKg:D

    iget-object v3, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->bodyFatPercent:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;->leanBodyMassKg:Ljava/lang/Double;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ManualMeasurementRequestBody(timestamp="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", weightKg="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", bodyFatPercent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leanBodyMassKg="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

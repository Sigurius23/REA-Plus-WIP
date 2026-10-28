.class public final Lcom/whoop/core/details/network/model/HeartRateTimelineModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;,
        Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tB;\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008.\u0010\u001c\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
        "",
        "",
        "endPercentage",
        "startPercentage",
        "",
        "startTimeInMillis",
        "endTimeInMillis",
        "<init>",
        "(DDJJ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDDJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/HeartRateTimelineModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "component2",
        "component3",
        "()J",
        "component4",
        "copy",
        "(DDJJ)Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getEndPercentage",
        "getStartPercentage",
        "J",
        "getStartTimeInMillis",
        "getEndTimeInMillis",
        "Companion",
        "$serializer",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;


# instance fields
.field private final endPercentage:D

.field private final endTimeInMillis:J

.field private final startPercentage:D

.field private final startTimeInMillis:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->Companion:Lcom/whoop/core/details/network/model/HeartRateTimelineModel$Companion;

    return-void
.end method

.method public constructor <init>(DDJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    .line 3
    iput-wide p3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    .line 4
    iput-wide p5, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    .line 5
    iput-wide p7, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    return-void
.end method

.method public synthetic constructor <init>(IDDJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p10, :cond_0

    .line 6
    sget-object p10, Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    iput-wide p4, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    iput-wide p6, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    iput-wide p8, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/HeartRateTimelineModel;DDJJILjava/lang/Object;)Lcom/whoop/core/details/network/model/HeartRateTimelineModel;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    move-wide v7, p1

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_3
    move-wide/from16 v7, p7

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v8}, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->copy(DDJJ)Lcom/whoop/core/details/network/model/HeartRateTimelineModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/HeartRateTimelineModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    return-wide v0
.end method

.method public final copy(DDJJ)Lcom/whoop/core/details/network/model/HeartRateTimelineModel;
    .locals 9

    new-instance v0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;-><init>(DDJJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;

    iget-wide v3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    iget-wide v5, p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    iget-wide v5, p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    iget-wide v5, p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    iget-wide v5, p1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEndPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    return-wide v0
.end method

.method public final getEndTimeInMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    return-wide v0
.end method

.method public final getStartPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    return-wide v0
.end method

.method public final getStartTimeInMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endPercentage:D

    iget-wide v2, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startPercentage:D

    iget-wide v4, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->startTimeInMillis:J

    iget-wide v6, p0, Lcom/whoop/core/details/network/model/HeartRateTimelineModel;->endTimeInMillis:J

    const-string v8, "HeartRateTimelineModel(endPercentage="

    const-string v9, ", startPercentage="

    invoke-static {v8, v0, v1, v9}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", startTimeInMillis="

    const-string v2, ", endTimeInMillis="

    invoke-static {v0, v1, v4, v5, v2}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v7, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

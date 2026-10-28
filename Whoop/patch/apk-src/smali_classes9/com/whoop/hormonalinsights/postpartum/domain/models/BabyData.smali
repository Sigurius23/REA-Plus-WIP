.class public final Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;,
        Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010!\u001a\u0004\u0008\"\u0010\u0015\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
        "",
        "",
        "weightInG",
        "<init>",
        "(D)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "copy",
        "(D)Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
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
        "getWeightInG",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$Companion;


# instance fields
.field private final weightInG:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$Companion;

    return-void
.end method

.method public constructor <init>(D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    return-void
.end method

.method public synthetic constructor <init>(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 3
    sget-object p4, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;

    invoke-virtual {p4}, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;DILjava/lang/Object;)Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->copy(D)Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    return-wide v0
.end method

.method public final copy(D)Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;
    .locals 1

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;

    invoke-direct {v0, p1, p2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;-><init>(D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;

    iget-wide v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    iget-wide v5, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getWeightInG()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;->weightInG:D

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BabyData(weightInG="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

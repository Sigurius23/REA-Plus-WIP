.class public final Lcom/whoop/data/remote/domain/dto/DoubleRange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u001b\u001a\u00020\u00112\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/DoubleRange;",
        "",
        "lowerEndpoint",
        "",
        "lowerBoundType",
        "Lcom/whoop/data/remote/domain/dto/BoundType;",
        "upperEndpoint",
        "upperBoundType",
        "<init>",
        "(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V",
        "getLowerEndpoint",
        "()D",
        "getLowerBoundType",
        "()Lcom/whoop/data/remote/domain/dto/BoundType;",
        "getUpperEndpoint",
        "getUpperBoundType",
        "isInBounds",
        "",
        "value",
        "isAboveBound",
        "endPoint",
        "isBelowBound",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

.field private final lowerEndpoint:D

.field private final upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

.field private final upperEndpoint:D


# direct methods
.method public constructor <init>(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V
    .locals 1

    const-string v0, "lowerBoundType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBoundType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iput-wide p4, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/DoubleRange;DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/DoubleRange;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    :cond_3
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->copy(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-result-object p0

    return-object p0
.end method

.method private final isAboveBound(DDLcom/whoop/data/remote/domain/dto/BoundType;)Z
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/BoundType;->OPEN:Lcom/whoop/data/remote/domain/dto/BoundType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p5, v0, :cond_1

    cmpl-double p1, p1, p3

    if-lez p1, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    cmpl-double p1, p1, p3

    if-ltz p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private final isBelowBound(DDLcom/whoop/data/remote/domain/dto/BoundType;)Z
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/BoundType;->OPEN:Lcom/whoop/data/remote/domain/dto/BoundType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p5, v0, :cond_1

    cmpg-double p1, p1, p3

    if-gez p1, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    cmpg-double p1, p1, p3

    if-gtz p1, :cond_2

    return v2

    :cond_2
    return v1
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    return-wide v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    return-wide v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-object v0
.end method

.method public final copy(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;
    .locals 8

    const-string v0, "lowerBoundType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBoundType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/remote/domain/dto/DoubleRange;-><init>(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLowerBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-object v0
.end method

.method public final getLowerEndpoint()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    return-wide v0
.end method

.method public final getUpperBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-object v0
.end method

.method public final getUpperEndpoint()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    invoke-static {v2, v1, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInBounds(D)Z
    .locals 6

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->isAboveBound(DDLcom/whoop/data/remote/domain/dto/BoundType;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v3, v0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->isBelowBound(DDLcom/whoop/data/remote/domain/dto/BoundType;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerEndpoint:D

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperEndpoint:D

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/DoubleRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DoubleRange(lowerEndpoint="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", lowerBoundType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upperEndpoint="

    const-string v1, ", upperBoundType="

    invoke-static {v6, v0, v3, v4, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

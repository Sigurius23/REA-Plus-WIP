.class public final Lcom/whoop/service/network/model/cycles/MetricData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J2\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\n\u0010\u001c\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/service/network/model/cycles/MetricData;",
        "",
        "name",
        "",
        "start",
        "",
        "values",
        "",
        "Lcom/whoop/service/network/model/cycles/MetricValue;",
        "<init>",
        "(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)V",
        "getName",
        "()Ljava/lang/String;",
        "getStart",
        "()J",
        "getValues",
        "()[Lcom/whoop/service/network/model/cycles/MetricValue;",
        "[Lcom/whoop/service/network/model/cycles/MetricValue;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)Lcom/whoop/service/network/model/cycles/MetricData;",
        "toString",
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
.field private final name:Ljava/lang/String;

.field private final start:J

.field private final values:[Lcom/whoop/service/network/model/cycles/MetricValue;


# direct methods
.method public constructor <init>(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    iput-wide p2, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    iput-object p4, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/cycles/MetricData;Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;ILjava/lang/Object;)Lcom/whoop/service/network/model/cycles/MetricData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-wide p2, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/service/network/model/cycles/MetricData;->copy(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)Lcom/whoop/service/network/model/cycles/MetricData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    return-wide v0
.end method

.method public final component3()[Lcom/whoop/service/network/model/cycles/MetricValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)Lcom/whoop/service/network/model/cycles/MetricData;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/service/network/model/cycles/MetricData;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/service/network/model/cycles/MetricData;-><init>(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/whoop/service/network/model/cycles/MetricData;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.whoop.service.network.model.cycles.MetricData"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/service/network/model/cycles/MetricData;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    iget-wide v5, p1, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    iget-object p1, p1, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getStart()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    return-wide v0
.end method

.method public final getValues()[Lcom/whoop/service/network/model/cycles/MetricValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/MetricData;->name:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/MetricData;->start:J

    iget-object v3, p0, Lcom/whoop/service/network/model/cycles/MetricData;->values:[Lcom/whoop/service/network/model/cycles/MetricValue;

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "MetricData(name="

    const-string v5, ", start="

    invoke-static {v4, v0, v1, v2, v5}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", values="

    const-string v2, ")"

    invoke-static {v0, v1, v3, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

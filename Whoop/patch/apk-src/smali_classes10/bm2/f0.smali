.class public final Lbm2/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010!\u001a\u0004\u0008 \u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lbm2/f0;",
        "",
        "Lorg/joda/time/DateTime;",
        "dateTime",
        "",
        "weight",
        "bodyFat",
        "leanBodyMass",
        "Lcm2/j;",
        "metricType",
        "<init>",
        "(Lorg/joda/time/DateTime;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lorg/joda/time/DateTime;",
        "b",
        "()Lorg/joda/time/DateTime;",
        "D",
        "e",
        "()D",
        "c",
        "Ljava/lang/Double;",
        "()Ljava/lang/Double;",
        "d",
        "Lcm2/j;",
        "()Lcm2/j;",
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


# instance fields
.field private final a:Lorg/joda/time/DateTime;

.field private final b:D

.field private final c:Ljava/lang/Double;

.field private final d:Ljava/lang/Double;

.field private final e:Lcm2/j;


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;)V
    .locals 1

    const-string v0, "dateTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    iput-wide p2, p0, Lbm2/f0;->b:D

    iput-object p4, p0, Lbm2/f0;->c:Ljava/lang/Double;

    iput-object p5, p0, Lbm2/f0;->d:Ljava/lang/Double;

    iput-object p6, p0, Lbm2/f0;->e:Lcm2/j;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lbm2/f0;->c:Ljava/lang/Double;

    return-object v0
.end method

.method public final b()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final c()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lbm2/f0;->d:Ljava/lang/Double;

    return-object v0
.end method

.method public final d()Lcm2/j;
    .locals 1

    iget-object v0, p0, Lbm2/f0;->e:Lcm2/j;

    return-object v0
.end method

.method public final e()D
    .locals 2

    iget-wide v0, p0, Lbm2/f0;->b:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbm2/f0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbm2/f0;

    iget-object v1, p0, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lbm2/f0;->b:D

    iget-wide v5, p1, Lbm2/f0;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lbm2/f0;->c:Ljava/lang/Double;

    iget-object v3, p1, Lbm2/f0;->c:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lbm2/f0;->d:Ljava/lang/Double;

    iget-object v3, p1, Lbm2/f0;->d:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lbm2/f0;->e:Lcm2/j;

    iget-object p1, p1, Lbm2/f0;->e:Lcm2/j;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lbm2/f0;->b:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lbm2/f0;->c:Ljava/lang/Double;

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

    iget-object v2, p0, Lbm2/f0;->d:Ljava/lang/Double;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lbm2/f0;->e:Lcm2/j;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lbm2/f0;->a:Lorg/joda/time/DateTime;

    iget-wide v1, p0, Lbm2/f0;->b:D

    iget-object v3, p0, Lbm2/f0;->c:Ljava/lang/Double;

    iget-object v4, p0, Lbm2/f0;->d:Ljava/lang/Double;

    iget-object v5, p0, Lbm2/f0;->e:Lcm2/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ManualMeasurementResult(dateTime="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", bodyFat="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leanBodyMass="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

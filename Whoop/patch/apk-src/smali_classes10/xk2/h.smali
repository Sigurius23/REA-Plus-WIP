.class public final Lxk2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001a\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001f\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0016\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lxk2/h;",
        "",
        "",
        "restingHeartRate",
        "maximumHeartRate",
        "Lcom/whoop/domain/model/GenderBaseline;",
        "baseline",
        "weightKg",
        "heightM",
        "",
        "age",
        "<init>",
        "(DDLcom/whoop/domain/model/GenderBaseline;DDI)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "D",
        "e",
        "()D",
        "b",
        "d",
        "c",
        "Lcom/whoop/domain/model/GenderBaseline;",
        "()Lcom/whoop/domain/model/GenderBaseline;",
        "f",
        "I",
        "track-activity_release"
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
.field private final a:D

.field private final b:D

.field private final c:Lcom/whoop/domain/model/GenderBaseline;

.field private final d:D

.field private final e:D

.field private final f:I


# direct methods
.method public constructor <init>(DDLcom/whoop/domain/model/GenderBaseline;DDI)V
    .locals 1

    const-string v0, "baseline"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lxk2/h;->a:D

    iput-wide p3, p0, Lxk2/h;->b:D

    iput-object p5, p0, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    iput-wide p6, p0, Lxk2/h;->d:D

    iput-wide p8, p0, Lxk2/h;->e:D

    iput p10, p0, Lxk2/h;->f:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lxk2/h;->f:I

    return v0
.end method

.method public final b()Lcom/whoop/domain/model/GenderBaseline;
    .locals 1

    iget-object v0, p0, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    return-object v0
.end method

.method public final c()D
    .locals 2

    iget-wide v0, p0, Lxk2/h;->e:D

    return-wide v0
.end method

.method public final d()D
    .locals 2

    iget-wide v0, p0, Lxk2/h;->b:D

    return-wide v0
.end method

.method public final e()D
    .locals 2

    iget-wide v0, p0, Lxk2/h;->a:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxk2/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxk2/h;

    iget-wide v3, p0, Lxk2/h;->a:D

    iget-wide v5, p1, Lxk2/h;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lxk2/h;->b:D

    iget-wide v5, p1, Lxk2/h;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    iget-object v3, p1, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lxk2/h;->d:D

    iget-wide v5, p1, Lxk2/h;->d:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lxk2/h;->e:D

    iget-wide v5, p1, Lxk2/h;->e:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lxk2/h;->f:I

    iget p1, p1, Lxk2/h;->f:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()D
    .locals 2

    iget-wide v0, p0, Lxk2/h;->d:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lxk2/h;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lxk2/h;->b:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lxk2/h;->d:D

    invoke-static {v2, v1, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lxk2/h;->e:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v1, p0, Lxk2/h;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lxk2/h;->a:D

    iget-wide v2, p0, Lxk2/h;->b:D

    iget-object v4, p0, Lxk2/h;->c:Lcom/whoop/domain/model/GenderBaseline;

    iget-wide v5, p0, Lxk2/h;->d:D

    iget-wide v7, p0, Lxk2/h;->e:D

    iget v9, p0, Lxk2/h;->f:I

    const-string v10, "StrainProfile(restingHeartRate="

    const-string v11, ", maximumHeartRate="

    invoke-static {v10, v0, v1, v11}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", baseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weightKg="

    const-string v2, ", heightM="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

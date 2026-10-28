.class public final Lfm1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lfm1/l;",
        "",
        "",
        "dayStrainValue",
        "",
        "recoveryScoreValue",
        "",
        "millisOfSleep",
        "calories",
        "<init>",
        "(DIJI)V",
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
        "b",
        "()D",
        "I",
        "d",
        "c",
        "J",
        "()J",
        "home_release"
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

.field private final b:I

.field private final c:J

.field private final d:I


# direct methods
.method public constructor <init>(DIJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lfm1/l;->a:D

    iput p3, p0, Lfm1/l;->b:I

    iput-wide p4, p0, Lfm1/l;->c:J

    iput p6, p0, Lfm1/l;->d:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lfm1/l;->d:I

    return v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Lfm1/l;->a:D

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lfm1/l;->c:J

    return-wide v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lfm1/l;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfm1/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfm1/l;

    iget-wide v3, p0, Lfm1/l;->a:D

    iget-wide v5, p1, Lfm1/l;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lfm1/l;->b:I

    iget v3, p1, Lfm1/l;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lfm1/l;->c:J

    iget-wide v5, p1, Lfm1/l;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lfm1/l;->d:I

    iget p1, p1, Lfm1/l;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lfm1/l;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lfm1/l;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lfm1/l;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Lfm1/l;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lfm1/l;->a:D

    iget v2, p0, Lfm1/l;->b:I

    iget-wide v3, p0, Lfm1/l;->c:J

    iget v5, p0, Lfm1/l;->d:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "WhoopLiveMeta(dayStrainValue="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", recoveryScoreValue="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", millisOfSleep="

    const-string v1, ", calories="

    invoke-static {v6, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v6, v5, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

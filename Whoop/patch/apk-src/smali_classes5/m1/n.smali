.class public final Lm1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:J


# direct methods
.method public constructor <init>(IIJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm1/n;->w:I

    iput p2, p0, Lm1/n;->x:I

    iput p5, p0, Lm1/n;->y:I

    iput-wide p3, p0, Lm1/n;->z:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lm1/n;

    iget-wide v0, p0, Lm1/n;->z:J

    iget-wide v2, p1, Lm1/n;->z:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm1/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm1/n;

    iget v1, p0, Lm1/n;->w:I

    iget v3, p1, Lm1/n;->w:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lm1/n;->x:I

    iget v3, p1, Lm1/n;->x:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lm1/n;->y:I

    iget v3, p1, Lm1/n;->y:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lm1/n;->z:J

    iget-wide v5, p1, Lm1/n;->z:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lm1/n;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/n;->x:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lm1/n;->y:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v1, p0, Lm1/n;->z:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CalendarDate(year="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lm1/n;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", month="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/n;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/n;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", utcTimeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lm1/n;->z:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

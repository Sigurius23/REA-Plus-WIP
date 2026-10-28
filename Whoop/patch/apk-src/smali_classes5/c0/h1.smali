.class public final Lc0/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:J


# direct methods
.method public constructor <init>(FJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc0/h1;->a:F

    iput p4, p0, Lc0/h1;->b:F

    iput-wide p2, p0, Lc0/h1;->c:J

    return-void
.end method


# virtual methods
.method public final a(J)F
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lc0/h1;->c:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    long-to-float p1, p1

    long-to-float p2, v2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget p2, p0, Lc0/h1;->a:F

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    iget v0, p0, Lc0/h1;->b:F

    mul-float/2addr p2, v0

    invoke-static {p1}, Lc0/b;->b(F)Lc0/a;

    move-result-object p1

    iget p1, p1, Lc0/a;->a:F

    mul-float/2addr p2, p1

    return p2
.end method

.method public final b(J)F
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lc0/h1;->c:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    long-to-float p1, p1

    long-to-float p2, v2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    invoke-static {p1}, Lc0/b;->b(F)Lc0/a;

    move-result-object p1

    iget p1, p1, Lc0/a;->b:F

    iget p2, p0, Lc0/h1;->a:F

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float/2addr p2, p1

    iget p1, p0, Lc0/h1;->b:F

    mul-float/2addr p2, p1

    long-to-float p1, v2

    div-float/2addr p2, p1

    const/high16 p1, 0x447a0000    # 1000.0f

    mul-float/2addr p2, p1

    return p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc0/h1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc0/h1;

    iget v1, p0, Lc0/h1;->a:F

    iget v3, p1, Lc0/h1;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lc0/h1;->b:F

    iget v3, p1, Lc0/h1;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lc0/h1;->c:J

    iget-wide v5, p1, Lc0/h1;->c:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lc0/h1;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lc0/h1;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v1, p0, Lc0/h1;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FlingInfo(initialVelocity="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lc0/h1;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/h1;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lc0/h1;->c:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

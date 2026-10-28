.class public final Li93/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li93/f;


# instance fields
.field public final w:F

.field public final x:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li93/e;->w:F

    iput p2, p0, Li93/e;->x:F

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ljava/lang/Comparable;)Z
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget v0, p0, Li93/e;->w:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p0, Li93/e;->x:F

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Ljava/lang/Comparable;
    .locals 1

    iget v0, p0, Li93/e;->x:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Li93/e;

    if-eqz v0, :cond_1

    iget v0, p0, Li93/e;->w:F

    iget v1, p0, Li93/e;->x:F

    cmpg-float v2, v0, v1

    if-lez v2, :cond_0

    move-object v2, p1

    check-cast v2, Li93/e;

    iget v3, v2, Li93/e;->w:F

    iget v2, v2, Li93/e;->x:F

    cmpg-float v2, v3, v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Li93/e;

    iget v2, p1, Li93/e;->w:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_1

    iget p1, p1, Li93/e;->x:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getStart()Ljava/lang/Comparable;
    .locals 1

    iget v0, p0, Li93/e;->w:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Li93/e;->w:F

    iget v1, p0, Li93/e;->x:F

    cmpg-float v2, v0, v1

    if-lez v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isEmpty()Z
    .locals 2

    iget v0, p0, Li93/e;->w:F

    iget v1, p0, Li93/e;->x:F

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Li93/e;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li93/e;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

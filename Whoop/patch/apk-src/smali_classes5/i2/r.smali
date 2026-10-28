.class public final Li2/r;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final y:F

.field public final z:F


# direct methods
.method public constructor <init>(FFI)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lal/a;-><init>(I)V

    iput p1, p0, Li2/r;->y:F

    iput p2, p0, Li2/r;->z:F

    iput p3, p0, Li2/r;->E:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Li2/r;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Li2/r;

    iget v0, p1, Li2/r;->y:F

    iget v1, p0, Li2/r;->y:F

    cmpg-float v0, v1, v0

    if-nez v0, :cond_2

    iget v0, p0, Li2/r;->z:F

    iget v1, p1, Li2/r;->z:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    iget v0, p0, Li2/r;->E:I

    iget p1, p1, Li2/r;->E:I

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Li2/r;->y:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Li2/r;->z:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Li2/r;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BlurEffect(renderEffect=null, radiusX="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Li2/r;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", radiusY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li2/r;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", edgeTreatment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li2/r;->E:I

    invoke-static {v1}, Li2/w0;->L(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()Landroid/graphics/RenderEffect;
    .locals 3

    iget v0, p0, Li2/r;->z:F

    iget v1, p0, Li2/r;->E:I

    iget v2, p0, Li2/r;->y:F

    invoke-static {v2, v0, v1}, Ld2/b;->c(FFI)Landroid/graphics/RenderEffect;

    move-result-object v0

    return-object v0
.end method

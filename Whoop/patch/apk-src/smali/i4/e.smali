.class public final Li4/e;
.super Li4/c;
.source "SourceFile"


# instance fields
.field public E:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li4/c;-><init>([C)V

    iput p1, p0, Li4/e;->E:F

    return-void
.end method


# virtual methods
.method public final d()F
    .locals 2

    iget v0, p0, Li4/e;->E:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li4/c;->w:[C

    if-eqz v0, :cond_0

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Li4/e;->E:F

    :cond_0
    iget v0, p0, Li4/e;->E:F

    return v0
.end method

.method public final e()I
    .locals 2

    iget v0, p0, Li4/e;->E:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li4/c;->w:[C

    if-eqz v0, :cond_0

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Li4/e;->E:F

    :cond_0
    iget v0, p0, Li4/e;->E:F

    float-to-int v0, v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li4/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Li4/e;->d()F

    move-result v1

    check-cast p1, Li4/e;

    invoke-virtual {p1}, Li4/e;->d()F

    move-result p1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    return v0

    :cond_1
    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    invoke-super {p0}, Li4/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Li4/e;->E:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

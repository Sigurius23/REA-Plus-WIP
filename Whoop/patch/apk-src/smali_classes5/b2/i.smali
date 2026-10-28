.class public final Lb2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/f;


# virtual methods
.method public final a(IILy3/m;)I
    .locals 0

    sub-int/2addr p2, p1

    int-to-float p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    const/4 p2, 0x1

    int-to-float p2, p2

    const/high16 p3, -0x40800000    # -1.0f

    invoke-static {p2, p3, p1}, Ldc/b;->a(FFF)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of p1, p1, Lb2/i;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    invoke-static {p1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Horizontal(bias=-1.0)"

    return-object v0
.end method

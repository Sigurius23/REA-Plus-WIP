.class public final Lf0/i1;
.super Le10/k0;
.source "SourceFile"


# virtual methods
.method public final O(JJ)V
    .locals 7

    iget-object v0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Magnifier;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Magnifier;->setZoom(F)V

    :cond_0
    const-wide v1, 0x7fffffff7fffffffL

    and-long/2addr v1, p3

    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, v1, v3

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eqz v1, :cond_1

    shr-long v5, p1, v4

    long-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    shr-long v4, p3, v4

    long-to-int p2, v4

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    and-long/2addr p3, v2

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/widget/Magnifier;->show(FFFF)V

    return-void

    :cond_1
    shr-long p3, p1, v4

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, p3, p1}, Landroid/widget/Magnifier;->show(FF)V

    return-void
.end method

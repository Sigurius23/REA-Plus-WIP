.class public final Lfr/j;
.super Luf/c0;
.source "SourceFile"


# virtual methods
.method public final X(Lfr/k;)F
    .locals 1

    iget-object p1, p1, Lfr/k;->O:Lfr/n;

    iget p1, p1, Lfr/n;->b:F

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public final k0(Lfr/k;F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    div-float/2addr p2, v0

    iget-object v0, p1, Lfr/k;->O:Lfr/n;

    iput p2, v0, Lfr/n;->b:F

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

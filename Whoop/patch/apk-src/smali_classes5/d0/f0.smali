.class public final Ld0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/e0;


# instance fields
.field public w:F

.field public x:F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x33d6bf95    # 1.0E-7f

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ld0/f0;->w:F

    const p1, 0x38d1b717    # 1.0E-4f

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const v0, -0x3f79999a    # -4.2f

    mul-float/2addr p1, v0

    iput p1, p0, Ld0/f0;->x:F

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public d(FJ)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p2, v0

    long-to-float p2, p2

    const/high16 p3, 0x447a0000    # 1000.0f

    div-float/2addr p2, p3

    iget p3, p0, Ld0/f0;->x:F

    mul-float/2addr p2, p3

    float-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Math;->exp(D)D

    move-result-wide p2

    double-to-float p2, p2

    mul-float/2addr p1, p2

    return p1
.end method

.method public k()F
    .locals 1

    iget v0, p0, Ld0/f0;->w:F

    return v0
.end method

.method public u(FJF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p2, v0

    iget v0, p0, Ld0/f0;->x:F

    div-float v1, p4, v0

    sub-float/2addr p1, v1

    div-float/2addr p4, v0

    long-to-float p2, p2

    mul-float/2addr v0, p2

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr v0, p2

    float-to-double p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->exp(D)D

    move-result-wide p2

    double-to-float p2, p2

    mul-float/2addr p4, p2

    add-float/2addr p4, p1

    return p4
.end method

.method public w(F)J
    .locals 4

    iget v0, p0, Ld0/f0;->w:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr v0, p1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float p1, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr p1, v0

    iget v0, p0, Ld0/f0;->x:F

    div-float/2addr p1, v0

    float-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public x(FF)F
    .locals 5

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Ld0/f0;->w:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    return p1

    :cond_0
    div-float/2addr v1, p2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    iget v2, p0, Ld0/f0;->x:F

    float-to-double v3, v2

    div-double/2addr v0, v3

    const/16 v3, 0x3e8

    int-to-double v3, v3

    mul-double/2addr v0, v3

    div-float v3, p2, v2

    sub-float/2addr p1, v3

    div-float/2addr p2, v2

    float-to-double v2, v2

    mul-double/2addr v2, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    float-to-double v0, v0

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr p2, v0

    add-float/2addr p2, p1

    return p2
.end method

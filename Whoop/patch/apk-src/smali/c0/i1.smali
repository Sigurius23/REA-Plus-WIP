.class public final Lc0/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p3, p0, Lc0/i1;->a:F

    .line 6
    iput p4, p0, Lc0/i1;->b:F

    return-void
.end method

.method public constructor <init>(FLy3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc0/i1;->a:F

    .line 2
    invoke-interface {p2}, Ly3/c;->getDensity()F

    move-result p1

    sget p2, Lc0/j1;->a:F

    const p2, 0x43c10b3d

    mul-float/2addr p1, p2

    const/high16 p2, 0x43200000    # 160.0f

    mul-float/2addr p1, p2

    const p2, 0x3f570a3d    # 0.84f

    mul-float/2addr p1, p2

    .line 3
    iput p1, p0, Lc0/i1;->b:F

    return-void
.end method


# virtual methods
.method public a(F)Lc0/h1;
    .locals 9

    sget-object v0, Lc0/b;->a:[F

    iget v0, p0, Lc0/i1;->a:F

    iget v1, p0, Lc0/i1;->b:F

    mul-float v2, v0, v1

    invoke-static {p1, v2}, Lc0/b;->a(FF)D

    move-result-wide v2

    sget v4, Lc0/j1;->a:F

    float-to-double v4, v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double v6, v4, v6

    new-instance v8, Lc0/h1;

    mul-float/2addr v0, v1

    float-to-double v0, v0

    div-double/2addr v4, v6

    mul-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v4

    mul-double/2addr v4, v0

    double-to-float v0, v4

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    mul-double/2addr v1, v3

    double-to-long v1, v1

    invoke-direct {v8, p1, v1, v2, v0}, Lc0/h1;-><init>(FJF)V

    return-object v8
.end method

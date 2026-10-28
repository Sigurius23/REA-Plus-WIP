.class public final Lou/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lou/d;->a:F

    iput p2, p0, Lou/d;->b:F

    iput p3, p0, Lou/d;->c:F

    iput p4, p0, Lou/d;->d:F

    mul-float/2addr p1, p1

    mul-float/2addr p2, p2

    add-float/2addr p2, p1

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    mul-float/2addr p3, p3

    mul-float/2addr p4, p4

    add-float/2addr p4, p3

    float-to-double p1, p4

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iput p1, p0, Lou/d;->e:F

    return-void
.end method

.class public final Lc23/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final E:J

.field public final synthetic F:Lc23/o;

.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:F


# direct methods
.method public constructor <init>(Lc23/o;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc23/k;->F:Lc23/o;

    iput p2, p0, Lc23/k;->w:F

    iput p3, p0, Lc23/k;->x:F

    iput p4, p0, Lc23/k;->y:F

    iput p5, p0, Lc23/k;->z:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lc23/k;->E:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lc23/k;->E:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v2, p0, Lc23/k;->F:Lc23/o;

    iget v3, v2, Lc23/o;->y:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v3, v2, Lc23/o;->x:Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-virtual {v3, v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    move-result v0

    iget v3, p0, Lc23/k;->w:F

    iget v4, p0, Lc23/k;->x:F

    invoke-static {v4, v3, v0, v3}, Lb9/y;->a(FFFF)F

    move-result v3

    invoke-virtual {v2}, Lc23/o;->d()F

    move-result v4

    div-float v6, v3, v4

    iget-object v5, v2, Lc23/o;->X:Lro/i;

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget v7, p0, Lc23/k;->y:F

    iget v8, p0, Lc23/k;->z:F

    invoke-virtual/range {v5 .. v10}, Lro/i;->z(FFFFF)V

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, v2, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    const-wide/16 v1, 0x10

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

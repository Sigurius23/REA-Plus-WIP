.class Lcom/whoop/ui/views/LiveHeartRateView$f;
.super Lcom/whoop/ui/views/LiveHeartRateView$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field private g:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/views/LiveHeartRateView$e;-><init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 8

    iget v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$f;->g:I

    if-eqz v0, :cond_0

    const/high16 v1, 0x42700000    # 60.0f

    int-to-float v0, v0

    div-float/2addr v1, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v0

    float-to-long v0, v1

    const-wide/16 v2, 0x12c

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x2

    div-long v6, v2, v4

    mul-long/2addr v4, v0

    invoke-virtual {p0, v6, v7, v4, v5}, Lcom/whoop/ui/views/LiveHeartRateView$e;->e(JJ)V

    invoke-virtual {p0, v2, v3}, Lcom/whoop/ui/views/LiveHeartRateView$e;->d(J)V

    invoke-virtual {p0, v0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$e;->h(J)V

    :cond_0
    return-void
.end method

.method public i(I)V
    .locals 1

    invoke-super {p0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->f()Lcom/whoop/ui/views/LiveHeartRateView$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$h;->c(I)V

    return-void
.end method

.method public l(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$f;->g:I

    return-void
.end method

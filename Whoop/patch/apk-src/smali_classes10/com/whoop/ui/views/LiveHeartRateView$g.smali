.class Lcom/whoop/ui/views/LiveHeartRateView$g;
.super Lcom/whoop/ui/views/LiveHeartRateView$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/views/LiveHeartRateView$e;-><init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1388

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/whoop/ui/views/LiveHeartRateView$e;->e(JJ)V

    const-wide/16 v0, 0x9c4

    invoke-virtual {p0, v0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$e;->h(J)V

    return-void
.end method

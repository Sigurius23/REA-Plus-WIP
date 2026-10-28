.class Lcom/whoop/ui/views/LiveHeartRateView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ui/views/LiveHeartRateView;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$c;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$c;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v0}, Lcom/whoop/ui/views/LiveHeartRateView;->g(Lcom/whoop/ui/views/LiveHeartRateView;)Landroid/os/Handler;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$c;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    iget-object v1, v1, Lcom/whoop/ui/views/LiveHeartRateView;->M:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$c;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->g(Lcom/whoop/ui/views/LiveHeartRateView;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView$c;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v2}, Lcom/whoop/ui/views/LiveHeartRateView;->f(Lcom/whoop/ui/views/LiveHeartRateView;)Ljava/lang/Runnable;

    move-result-object v2

    const-wide/16 v3, 0x320

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

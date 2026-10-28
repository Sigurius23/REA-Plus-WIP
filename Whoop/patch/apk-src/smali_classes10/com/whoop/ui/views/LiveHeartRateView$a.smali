.class Lcom/whoop/ui/views/LiveHeartRateView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/views/LiveHeartRateView;->I()V
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

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$a;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$a;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v0}, Lcom/whoop/ui/views/LiveHeartRateView;->g(Lcom/whoop/ui/views/LiveHeartRateView;)Landroid/os/Handler;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$a;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->d(Lcom/whoop/ui/views/LiveHeartRateView;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$a;->w:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->f(Lcom/whoop/ui/views/LiveHeartRateView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.class Lcom/whoop/ui/views/LiveHeartRateView$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/views/LiveHeartRateView$e;-><init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ui/views/LiveHeartRateView$e;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView$e;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$a;->w:Lcom/whoop/ui/views/LiveHeartRateView$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$a;->w:Lcom/whoop/ui/views/LiveHeartRateView$e;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->c()V

    return-void
.end method

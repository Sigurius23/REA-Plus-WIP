.class Lcom/whoop/ui/views/LiveHeartRateView$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field final synthetic c:Lcom/whoop/ui/views/LiveHeartRateView;


# direct methods
.method private constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->c:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->a:Ljava/util/Queue;

    .line 4
    sget p1, Lvu1/c;->p:I

    iput p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$h;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->c:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->c:Lcom/whoop/ui/views/LiveHeartRateView;

    iget-object v2, v2, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->c:Lcom/whoop/ui/views/LiveHeartRateView;

    iget-object v3, v3, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->c:Lcom/whoop/ui/views/LiveHeartRateView;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    return-object v0
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$h;->b:I

    return-void
.end method

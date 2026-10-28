.class Lcom/whoop/ui/views/LiveHeartRateView$e$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/views/LiveHeartRateView$e;->e(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/whoop/ui/views/LiveHeartRateView$e$c;

.field final synthetic c:Lcom/whoop/ui/views/LiveHeartRateView$e;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView$e;Landroid/view/View;Lcom/whoop/ui/views/LiveHeartRateView$e$c;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->c:Lcom/whoop/ui/views/LiveHeartRateView$e;

    iput-object p2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->b:Lcom/whoop/ui/views/LiveHeartRateView$e$c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->c:Lcom/whoop/ui/views/LiveHeartRateView$e;

    invoke-static {p1}, Lcom/whoop/ui/views/LiveHeartRateView$e;->b(Lcom/whoop/ui/views/LiveHeartRateView$e;)Lcom/whoop/ui/views/LiveHeartRateView$h;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->a:Landroid/view/View;

    invoke-virtual {p1, v0}, Lcom/whoop/ui/views/LiveHeartRateView$h;->b(Landroid/view/View;)V

    iget-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->c:Lcom/whoop/ui/views/LiveHeartRateView$e;

    invoke-static {p1}, Lcom/whoop/ui/views/LiveHeartRateView$e;->a(Lcom/whoop/ui/views/LiveHeartRateView$e;)Ljava/util/LinkedList;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$b;->b:Lcom/whoop/ui/views/LiveHeartRateView$e$c;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

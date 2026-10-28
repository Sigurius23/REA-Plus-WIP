.class public final Lg/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/h;
.implements Landroid/view/ViewTreeObserver$OnDrawListener;
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:J

.field public x:Ljava/lang/Runnable;

.field public y:Z

.field public final synthetic z:Lg/l;


# direct methods
.method public constructor <init>(Lg/l;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/i;->z:Lg/l;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/16 p1, 0x2710

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lg/i;->w:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-boolean v0, p0, Lg/i;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg/i;->y:Z

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_0
    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    const-string v0, "runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/i;->x:Ljava/lang/Runnable;

    iget-object p1, p0, Lg/i;->z:Lg/l;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const-string v0, "window.decorView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lg/i;->y:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/m;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onDraw()V
    .locals 7

    iget-object v0, p0, Lg/i;->x:Ljava/lang/Runnable;

    const/4 v1, 0x0

    iget-object v2, p0, Lg/i;->z:Lg/l;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg/i;->x:Ljava/lang/Runnable;

    invoke-virtual {v2}, Lg/l;->getFullyDrawnReporter()Lg/s;

    move-result-object v0

    invoke-virtual {v0}, Lg/s;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lg/i;->y:Z

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lg/i;->w:J

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    iput-boolean v1, p0, Lg/i;->y:Z

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final run()V
    .locals 1

    iget-object v0, p0, Lg/i;->z:Lg/l;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    return-void
.end method

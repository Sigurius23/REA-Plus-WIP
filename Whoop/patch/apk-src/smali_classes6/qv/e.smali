.class public final Lqv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;


# instance fields
.field public final E:Lcu2/r;

.field public final F:Lqv/d;

.field public final w:Ljava/lang/ref/WeakReference;

.field public final x:Landroidx/lifecycle/i0;

.field public y:Z

.field public z:Landroidx/lifecycle/g0;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapView;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lqv/e;->w:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, Lqv/e;->x:Landroidx/lifecycle/i0;

    new-instance v0, Lcu2/r;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcu2/r;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lqv/e;->E:Lcu2/r;

    new-instance v0, Lqv/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqv/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lqv/e;->F:Lqv/d;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lqv/e;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 3

    iget-boolean v0, p0, Lqv/e;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqv/e;->z:Landroidx/lifecycle/g0;

    iget-object v1, p0, Lqv/e;->E:Lcu2/r;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_1
    invoke-static {p1}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    iget-object v2, p0, Lqv/e;->x:Landroidx/lifecycle/i0;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iput-object p1, p0, Lqv/e;->z:Landroidx/lifecycle/g0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqv/e;->y:Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Please ensure that the hosting activity/fragment is a valid LifecycleOwner"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Lqv/e;->x:Landroidx/lifecycle/i0;

    return-object v0
.end method

.class public final Lqv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f0;


# instance fields
.field public final synthetic w:Lcom/mapbox/maps/MapboxLifecycleObserver;

.field public final synthetic x:Lqv/e;

.field public final synthetic y:Landroid/view/View;

.field public final synthetic z:Lqv/b;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapView;Lqv/e;Lcom/mapbox/maps/MapView;Lqv/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqv/a;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    iput-object p2, p0, Lqv/a;->x:Lqv/e;

    iput-object p3, p0, Lqv/a;->y:Landroid/view/View;

    iput-object p4, p0, Lqv/a;->z:Lqv/b;

    return-void
.end method


# virtual methods
.method public final onDestroy()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/w0;
        value = .enum Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;
    .end annotation

    iget-object v0, p0, Lqv/a;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    invoke-interface {v0}, Lcom/mapbox/maps/MapboxLifecycleObserver;->onDestroy()V

    iget-object v0, p0, Lqv/a;->x:Lqv/e;

    iget-object v1, v0, Lqv/e;->x:Landroidx/lifecycle/i0;

    invoke-virtual {v1, p0}, Landroidx/lifecycle/i0;->d(Landroidx/lifecycle/f0;)V

    iget-object v1, v0, Lqv/e;->z:Landroidx/lifecycle/g0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, v0, Lqv/e;->E:Lcu2/r;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    iget-object v1, v0, Lqv/e;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lqv/e;->F:Lqv/d;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_1
    iget-object v0, p0, Lqv/a;->y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lqv/a;->z:Lqv/b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public final onStart()V
    .locals 1
    .annotation runtime Landroidx/lifecycle/w0;
        value = .enum Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;
    .end annotation

    iget-object v0, p0, Lqv/a;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    invoke-interface {v0}, Lcom/mapbox/maps/MapboxLifecycleObserver;->onStart()V

    return-void
.end method

.method public final onStop()V
    .locals 1
    .annotation runtime Landroidx/lifecycle/w0;
        value = .enum Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;
    .end annotation

    iget-object v0, p0, Lqv/a;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    invoke-interface {v0}, Lcom/mapbox/maps/MapboxLifecycleObserver;->onStop()V

    return-void
.end method

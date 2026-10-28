.class public final Landroidx/databinding/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;
.implements Landroidx/databinding/m;


# instance fields
.field public final w:Landroidx/databinding/d0;

.field public x:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/databinding/v;->x:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroidx/databinding/d0;

    invoke-direct {v0, p1, p2, p0, p3}, Landroidx/databinding/d0;-><init>(Landroidx/databinding/a0;ILandroidx/databinding/m;Ljava/lang/ref/ReferenceQueue;)V

    iput-object v0, p0, Landroidx/databinding/v;->w:Landroidx/databinding/d0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/g0;)V
    .locals 2

    iget-object v0, p0, Landroidx/databinding/v;->x:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    :goto_0
    iget-object v1, p0, Landroidx/databinding/v;->w:Landroidx/databinding/d0;

    iget-object v1, v1, Landroidx/databinding/d0;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/p0;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v1, p0}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {v1, p1, p0}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_2
    if-eqz p1, :cond_3

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/databinding/v;->x:Ljava/lang/ref/WeakReference;

    :cond_3
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/lifecycle/p0;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Landroidx/lifecycle/p0;

    iget-object v0, p0, Landroidx/databinding/v;->x:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1, v0, p0}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_1
    return-void
.end method

.method public final d()Landroidx/databinding/d0;
    .locals 1

    iget-object v0, p0, Landroidx/databinding/v;->w:Landroidx/databinding/d0;

    return-object v0
.end method

.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    iget-object p1, p0, Landroidx/databinding/v;->w:Landroidx/databinding/d0;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/databinding/a0;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/databinding/d0;->a()Z

    :cond_0
    if-eqz v0, :cond_1

    iget v1, p1, Landroidx/databinding/d0;->b:I

    iget-object p1, p1, Landroidx/databinding/d0;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroidx/databinding/a0;->handleFieldChange(ILjava/lang/Object;I)V

    :cond_1
    return-void
.end method

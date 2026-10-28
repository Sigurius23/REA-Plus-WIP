.class public final Lfi/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfi/p;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final E:Lbc3/k1;

.field public final w:Lrh/t;

.field public final x:Lfi/i;

.field public final y:Lhi/a;

.field public final z:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Lrh/t;Lfi/i;Lhi/a;Landroidx/lifecycle/x;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/s;->w:Lrh/t;

    iput-object p2, p0, Lfi/s;->x:Lfi/i;

    iput-object p3, p0, Lfi/s;->y:Lhi/a;

    iput-object p4, p0, Lfi/s;->z:Landroidx/lifecycle/x;

    iput-object p5, p0, Lfi/s;->E:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lfi/s;->y:Lhi/a;

    iget-object v1, v0, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-static {v0}, Lv8/b;->B(Landroid/widget/ImageView;)Lfi/t;

    move-result-object v0

    iget-object v1, v0, Lfi/t;->z:Lfi/s;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lfi/s;->c()V

    :cond_1
    iput-object p0, v0, Lfi/t;->z:Lfi/s;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "\'ViewTarget.view\' must be attached to a window."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lrh/s;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfi/s;->z:Landroidx/lifecycle/x;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lce/w;->r(Landroidx/lifecycle/x;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lfi/s;->E:Lbc3/k1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, Lfi/s;->y:Lhi/a;

    instance-of v1, v0, Landroidx/lifecycle/f0;

    iget-object v2, p0, Lfi/s;->z:Landroidx/lifecycle/x;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    check-cast v0, Landroidx/lifecycle/f0;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_1
    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    iget-object p1, p0, Lfi/s;->y:Lhi/a;

    iget-object p1, p1, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-static {p1}, Lv8/b;->B(Landroid/widget/ImageView;)Lfi/t;

    move-result-object p1

    invoke-virtual {p1}, Lfi/t;->a()V

    return-void
.end method

.method public final start()V
    .locals 3

    iget-object v0, p0, Lfi/s;->z:Landroidx/lifecycle/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_0
    iget-object v1, p0, Lfi/s;->y:Lhi/a;

    instance-of v2, v1, Landroidx/lifecycle/f0;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    move-object v2, v1

    check-cast v2, Landroidx/lifecycle/f0;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_1
    iget-object v0, v1, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-static {v0}, Lv8/b;->B(Landroid/widget/ImageView;)Lfi/t;

    move-result-object v0

    iget-object v1, v0, Lfi/t;->z:Lfi/s;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lfi/s;->c()V

    :cond_2
    iput-object p0, v0, Lfi/t;->z:Lfi/s;

    return-void
.end method

.class public final Lx20/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final w:Lx20/w;


# direct methods
.method public constructor <init>(Lx20/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx20/l;->w:Lx20/w;

    return-void
.end method


# virtual methods
.method public final onStart(Landroidx/lifecycle/g0;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    iget-object p1, p0, Lx20/l;->w:Lx20/w;

    invoke-static {p1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lx20/r;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2}, Lx20/r;-><init>(Lx20/w;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final onStop(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx20/l;->w:Lx20/w;

    iget-object v0, v0, Lx20/w;->x:Lf30/e;

    iget-object v1, v0, Lf30/e;->e:Lbc3/c2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v2, v0, Lf30/e;->e:Lbc3/c2;

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.class public final Landroidx/lifecycle/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Landroidx/lifecycle/k1;

.field public y:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/lifecycle/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/m1;->w:Ljava/lang/String;

    iput-object p2, p0, Landroidx/lifecycle/m1;->x:Landroidx/lifecycle/k1;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/x;Lpb/d;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/lifecycle/m1;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/m1;->y:Z

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iget-object p1, p0, Landroidx/lifecycle/m1;->x:Landroidx/lifecycle/k1;

    iget-object p1, p1, Landroidx/lifecycle/k1;->b:Laa3/i1;

    iget-object p1, p1, Laa3/i1;->f:Ljava/lang/Object;

    check-cast p1, Lb3/z1;

    iget-object v0, p0, Landroidx/lifecycle/m1;->w:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/lifecycle/m1;->y:Z

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    return-void
.end method
